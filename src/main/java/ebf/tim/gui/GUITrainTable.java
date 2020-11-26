package ebf.tim.gui;

import ebf.tim.blocks.TileEntityStorage;
import ebf.tim.utility.ClientUtil;
import ebf.tim.utility.ItemStackSlot;
import ebf.tim.utility.TransportSlotManager;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Train crafting table GUI</h1>
 * @author Eternal Blue Flame
 */
public class GUITrainTable extends GuiContainer {
    private static List<ItemStack> slots = new ArrayList<>();
    private static List<ItemStack> overlays = new ArrayList<>();
    private static List<Integer> slotx = new ArrayList<>();
    private static List<Integer> sloty = new ArrayList<>();
    private String hostname;

    public GUITrainTable(InventoryPlayer inventoryPlayer, World world, int x, int y, int z) {
        super(new TransportSlotManager(inventoryPlayer, (TileEntityStorage) world.getTileEntity(x,y,z)));
        hostname=world.getBlock(x,y,z).getUnlocalizedName();
    }


    protected void drawGuiContainerForegroundLayer(int p_146979_1_, int p_146979_2_) {
        this.fontRendererObj.drawString(I18n.format("container.inventory"), 8, this.ySize - 96 + 2, 4210752);
    }
    /**
     * Draw the background layer for the GuiContainer (everything behind the items)
     */
    protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int mouseX, int mouseY) {
        GL11.glPushMatrix();

        if(hostname.equals("tile.block.railtable")){

            ClientUtil.drawTextOutlined(fontRendererObj,"Rail", guiLeft+8, guiTop+2,0xffffff);
            ClientUtil.drawTextOutlined(fontRendererObj,"Ties", guiLeft+6, guiTop+24,0xffffff);
            ClientUtil.drawTextOutlined(fontRendererObj,"Ballast", guiLeft-8, guiTop+41,0xffffff);

            ClientUtil.drawTextOutlined(fontRendererObj,"Old Shape", guiLeft+108, guiTop+18,0xffffff);

            ClientUtil.drawTextOutlined(fontRendererObj,"Output", guiLeft+116, guiTop+53,0xffffff);

            ClientUtil.drawTextOutlined(fontRendererObj,"Unused", guiLeft+50, guiTop-4,0xffffff);
            ClientUtil.drawTextOutlined(fontRendererObj,"Unused", guiLeft+50, guiTop+46,0xffffff);


            slots = new ArrayList<>();
            overlays = new ArrayList<>();
            slotx = new ArrayList<>();
            sloty = new ArrayList<>();
            for (ItemStackSlot s : ((TileEntityStorage)((TransportSlotManager)this.inventorySlots).hostInventory).inventory) {
                slots.add(s.getStack());
                overlays.add(s.getOverlay());
                slotx.add(s.xDisplayPosition);
                sloty.add(s.yDisplayPosition);

            }

            GL11.glPushMatrix();
            GL11.glEnable(GL11.GL_TEXTURE_2D);
            GL11.glColor4f(1,1,1,1);
            GL11.glEnable(GL11.GL_BLEND);
            ClientUtil.drawSlots(slots,overlays, slotx,sloty,mouseX,mouseY,guiLeft,guiTop,itemRender);



            GL11.glDisable(GL11.GL_LIGHTING);
            GL11.glDisable(GL11.GL_BLEND);
            mc.getTextureManager().bindTexture(ClientUtil.vanillaChest);
            //draw the player inventory and toolbar background.
            ClientUtil.drawTexturedRect(guiLeft, guiTop+64, 0, 0, 176,  16);//top
            ClientUtil.drawTexturedRect(guiLeft,   guiTop+78, 0, 134, 176, 88);//actual inventory
            GL11.glEnable(GL11.GL_LIGHTING);
            GL11.glPopMatrix();

        } else if (hostname.equals("tile.block.traintable")){
            this.mc.getTextureManager().bindTexture(ClientUtil.craftingTableGuiTextures);
            this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, this.xSize, this.ySize);

            slots = new ArrayList<>();
            overlays = new ArrayList<>();
            slotx = new ArrayList<>();
            sloty = new ArrayList<>();
            for (ItemStackSlot s : ((TileEntityStorage)((TransportSlotManager)this.inventorySlots).hostInventory).inventory) {
                slots.add(s.getStack());
                overlays.add(s.getOverlay());
                slotx.add(s.xDisplayPosition);
                sloty.add(s.yDisplayPosition);

            }

            GL11.glPushMatrix();
            GL11.glEnable(GL11.GL_TEXTURE_2D);
            GL11.glColor4f(1,1,1,1);
            GL11.glEnable(GL11.GL_BLEND);
            ClientUtil.drawSlots(slots,overlays, slotx,sloty,mouseX,mouseY,guiLeft,guiTop,itemRender);



            GL11.glDisable(GL11.GL_LIGHTING);
            GL11.glDisable(GL11.GL_BLEND);
            GL11.glEnable(GL11.GL_LIGHTING);
            GL11.glPopMatrix();


        } else {
            this.mc.getTextureManager().bindTexture(ClientUtil.craftingTableGuiTextures);
            this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, this.xSize, this.ySize);
        }
        GL11.glPopMatrix();
    }

}
