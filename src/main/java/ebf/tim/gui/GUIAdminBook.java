package ebf.tim.gui;

import ebf.tim.TrainsInMotion;
import ebf.tim.items.ItemAdminBook;
import ebf.tim.utility.ServerLogger;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.List;

import static ebf.tim.utility.ClientUtil.drawTextOutlined;

/**
 * <h1>Transport GUI</h1>
 * used to draw the GUI for trains and rollingstock (the menu with the inventory).
 * @author Eternal Blue Flame
 */
public class GUIAdminBook extends GuiScreen {
    private String[] list;
    static boolean isTrainPage = false;
    private int guiLeft;
    private int guiTop;
    private int page=0;
    private IInventory inventory = new IInventory() {
        private ItemStack[] inventory = new ItemStack[108];//9x12
        @Override
        public int getSizeInventory() {
            int count=0;
            for(ItemStack i : inventory){
                if (i!=null) {
                    count++;
                }
            }
            return count;
        }

        @Override
        public ItemStack getStackInSlot(int p_70301_1_) { return inventory[p_70301_1_]; }

        @Override
        public ItemStack decrStackSize(int p_70298_1_, int p_70298_2_) { return null; }

        @Override
        public ItemStack getStackInSlotOnClosing(int p_70304_1_) { return null; }

        @Override
        public void setInventorySlotContents(int p_70299_1_, ItemStack p_70299_2_) { inventory[p_70299_1_] = p_70299_2_; }

        @Override
        public String getInventoryName() { return null; }

        @Override
        public boolean hasCustomInventoryName() { return false; }

        @Override
        public int getInventoryStackLimit() { return 64; }

        @Override
        public void markDirty() { }

        @Override
        public boolean isUseableByPlayer(EntityPlayer p_70300_1_) { return false; }

        @Override
        public void openInventory() { }

        @Override
        public void closeInventory() { }

        @Override
        public boolean isItemValidForSlot(int p_94041_1_, ItemStack p_94041_2_) { return false; }
    };

    public GUIAdminBook(String csv){
        //if its the xml enable train page mode.
        if(csv.charAt(0) == '<') {
            isTrainPage=true;
        } else {
            isTrainPage = false;
        }
        list = csv.split(",");
    }
    @Override
    public boolean doesGuiPauseGame()
    {
        return false;
    }


    @Override
    public void actionPerformed(GuiButton button) {

        switch (button.id){
            case -1:{
                TrainsInMotion.keyChannel.sendToServer(new ItemAdminBook.PacketAdminBookClient( "0:"+list[0].substring(1)));//tell server to drop items
                break;
            }
            case 0:{
                TrainsInMotion.keyChannel.sendToServer(new ItemAdminBook.PacketAdminBookClient( "1:"+list[0].substring(1)));//tell server to drop items
                break;
            }
            case 1:{
                if (!isTrainPage){
                    page--;
                    buttonList = new ArrayList();
                    initGui();
                } else {
                    TrainsInMotion.keyChannel.sendToServer(new ItemAdminBook.PacketAdminBookClient(list[1]));//tell server to send a new gui
                }

                break;
            }
            case 2:{
                page++;
                buttonList = new ArrayList();
                initGui();
                break;
            }
            case 3:{
                if(list[0]!=null && list[0].length()>1) {
                    TrainsInMotion.keyChannel.sendToServer(new ItemAdminBook.PacketAdminBookClient("0:" + list[0].substring(1)));//tell server to drop items
                    TrainsInMotion.keyChannel.sendToServer(new ItemAdminBook.PacketAdminBookClient("1:" + list[0].substring(1)));//tell server to drop items
                }
                break;
            }
            default:{
                TrainsInMotion.keyChannel.sendToServer(new ItemAdminBook.PacketAdminBookClient( list[button.id-3]));//tell server to send a new gui
                break;
            }
        }

    }

    @Override
    public void initGui() {
        super.initGui();
        this.guiLeft = (this.width - 176) / 2;
        this.guiTop = (this.height - 166) / 2;

        if(!isTrainPage) {
            int index=0;
            for (int i = 6 * page; i < 6+(6*page) && i<list.length-1; i++) {//only show 6 entries per page
                this.buttonList.add(new GuiButton(i+3, guiLeft-70, guiTop+20 +(index*18), 150, 20, list[i].equals("")?"Back":list[i]));
                index++;
            }
            if(list.length-6-(page*6)>6){
                //draw next
                this.buttonList.add(new GuiButton(2, guiLeft-70, guiTop+140 , 70, 20, "next page"));
            }
            if (page>0){
                this.buttonList.add(new GuiButton(1, guiLeft+10, guiTop+140 , 70, 20, "back"));
            }
        } else {
            try {
                //draw back
                this.buttonList.add(new GuiButton(-1,guiLeft+85,guiTop+140,90,20,"clone inventory"));
                this.buttonList.add(new GuiButton(0,guiLeft+5,guiTop+140,70,20,"delete entry"));
                this.buttonList.add(new GuiButton(3,guiLeft+180,guiTop+140,80,20,"clone & delete"));
                this.buttonList.add(new GuiButton(1, guiLeft-70, guiTop+140 , 70, 20, "back"));
                List<ItemStack> items = ServerLogger.getItems(list[10]);
                for(int i=0; i<items.size(); i++) {
                    inventory.setInventorySlotContents(i, items.get(i));
                }
            } catch (Exception e){}
        }

    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float par3){
        super.drawScreen(mouseX, mouseY, par3);

        if(isTrainPage){
            for (int i = 2+(6 * page); i < Math.min(list.length, 10); i++) {//only show 6 entries per page
                drawTextOutlined(fontRendererObj,  list[(page*i)+i],  guiLeft-70, guiTop-16 +(i*16), 16777215);
            }
            drawTextOutlined(fontRendererObj,I18n.format("container.inventory", new Object()),  guiLeft+80, guiTop+10, 16777215);
            int index=0;
            for (int y =0; y<6; y++){
                for(int x=0; x<9; x++){
                    if(inventory.getStackInSlot(index) !=null) {
                        func_146977_a(new Slot(inventory, index, guiLeft + 80 + (x * 16), guiTop + 26 + (y * 16)));
                    }
                    index++;
                }
            }
        }

    }


    private void func_146977_a(Slot p_146977_1_) {
        GL11.glPushMatrix();
        GL11.glDisable(GL11.GL_LIGHTING);
        itemRender.renderItemAndEffectIntoGUI(this.fontRendererObj, this.mc.getTextureManager(), p_146977_1_.getStack(), p_146977_1_.xDisplayPosition, p_146977_1_.yDisplayPosition);
        itemRender.renderItemOverlayIntoGUI(this.fontRendererObj, this.mc.getTextureManager(), p_146977_1_.getStack(), p_146977_1_.xDisplayPosition, p_146977_1_.yDisplayPosition, null);
        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glPopMatrix();
    }


}