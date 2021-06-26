package train.common.adminbook;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;
import tmt.Tessellator;
import train.common.Traincraft;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Transport GUI</h1>
 * used to draw the GUI for trains and rollingstock (the menu with the inventory).
 * @author Eternal Blue Flame
 */
public class GUIAdminBook extends GuiScreen {
    /**the amount to scale the GUI by, same as vanilla*/
    private static final float guiScaler = 0.00390625F;
    private String[] list;
    static boolean isTrainPage = false;
    private int guiLeft;
    private int guiTop;
    private int page=0;
    private List<ItemStack> items = new ArrayList<ItemStack>();

    public GUIAdminBook(String csv){
        //if its the xml enable train page mode.
        if (csv.length()<3){
            list=null;
            return;
        }
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
                Traincraft.keyChannel.sendToServer(new ItemAdminBook.PacketAdminBookClient( "0:"+list[0].substring(1,list[0].length()), Minecraft.getMinecraft().thePlayer.getEntityId()));//tell server to drop items
                break;
            }
            case 0:{
                Traincraft.keyChannel.sendToServer(new ItemAdminBook.PacketAdminBookClient( "1:"+list[0].substring(1), Minecraft.getMinecraft().thePlayer.getEntityId()));//tell server to drop items
                break;
            }
            case 1:{
                if (!isTrainPage){
                    page--;
                    buttonList = new ArrayList();
                    initGui();
                } else {
                    Traincraft.keyChannel.sendToServer(new ItemAdminBook.PacketAdminBookClient( list[1], Minecraft.getMinecraft().thePlayer.getEntityId()));//tell server to send a new gui
                }

                break;
            }
            case 2:{
                page++;
                buttonList = new ArrayList();
                initGui();
                break;
            }
            default:{
                Traincraft.keyChannel.sendToServer(new ItemAdminBook.PacketAdminBookClient( list[button.id-3], Minecraft.getMinecraft().thePlayer.getEntityId()));//tell server to send a new gui
                break;
            }
        }

    }

    @Override
    public void initGui() {
        super.initGui();
        if(list==null){
            return;
        }
        this.guiLeft = (this.width - 176) / 2;
        this.guiTop = (this.height - 166) / 2;

        if(!isTrainPage) {
            int index=0;
            for (int i = 6 * page; i < 6+(6*page) && i<list.length; i++) {//only show 6 entries per page
                this.buttonList.add(new GuiButton(i+3, guiLeft-80, guiTop+20 +(index*18), 140, 20,
                        list[i].equals("")?"Back":
                                list[i].contains("_")?
                                list[i].substring(list[i].indexOf("~")+1,list[i].lastIndexOf("_")).replace("minecart",""):
                list[i]));
                if (list[i].lastIndexOf("_")>0 && list[i].indexOf(".txt")>0) {
                    this.buttonList.add(new GuiButton(i + 3, guiLeft + 70, guiTop + 20 + (index * 18), 220, 20,
                            list[i].substring(list[i].lastIndexOf("_")+1, list[i].indexOf(".txt"))));
                }
                index++;
            }
            if(list.length-6-(page*6)>0){
                //draw next
                this.buttonList.add(new GuiButton(2, guiLeft-70, guiTop+140 , 70, 20, "next page"));
            }
            if (page>0){
                this.buttonList.add(new GuiButton(1, guiLeft+10, guiTop+140 , 70, 20, "back"));
            }
        } else {
            try {
                //draw back
                this.buttonList.add(new GuiButton(-1,guiLeft+80,guiTop+140,120,20,"clone inventory"));
                this.buttonList.add(new GuiButton(0,guiLeft+10,guiTop+140,70,20,"delete entry"));
                this.buttonList.add(new GuiButton(1, guiLeft-70, guiTop+140 , 70, 20, "back"));
                items = ServerLogger.getItems(list[9]);
            } catch (Exception e){}
        }

    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float par3){
        super.drawScreen(mouseX, mouseY, par3);
        if(list==null){
            return;
        }
        if(isTrainPage){
            for (int i = 2+(6 * page); i < Math.min(list.length, 9); i++) {//only show 6 entries per page
                drawTextOutlined(fontRendererObj,  list[(page*i)+i],  guiLeft-70, guiTop-16 +(i*16), 16777215);
            }
            drawTextOutlined(fontRendererObj, I18n.format("container.inventory", new Object()),  guiLeft+80, guiTop+10, 16777215);
            int index=0;
            for (int y =0; y<6; y++){
                for(int x=0; x<9; x++){
                    if(items.size()>index && items.get(index) !=null) {
                        func_146977_a(items.get(index), guiLeft + 80 + (x * 16), guiTop + 26 + (y * 16));
                    }
                    index++;
                }
            }
        }

    }

    public static void drawTextOutlined(FontRenderer font, String string, int x, int y, int color){
        //bottom left
        font.drawString(string, x-1, y+1, 0);
        //bottom
        font.drawString(string, x, y+1, 0);
        //bottom right
        font.drawString(string, x+1, y+1, 0);
        //left
        font.drawString(string, x-1, y, 0);
        //right
        font.drawString(string, x+1, y, 0);
        //top left
        font.drawString(string, x-1, y-1, 0);
        //top
        font.drawString(string, x, y-1, 0);
        //top right
        font.drawString(string, x+1, y-1, 0);


        font.drawString(string,x,y,color);
    }

    /**
     * <h2>Draw Texture</h2>
     * This replaces the base class and allows us to draw textures that are stretched to the shape defined in a more efficient manner.
     * NOTE: all textures must be divisible by 256x256
     * @param posX the X position on screen to draw at.
     * @param posY the Y position on screen to draw at.
     * @param posU the X position of the texture to start from.
     * @param posV the Y position of the texture to start from.
     * @param width the width of the box.
     * @param height the height of the box.
     * @param widthUV defines the X size of the texture part used
     * @param heightUV defines the X Y size of the texture part used
     */
    public static void drawTexturedRect(int posX, int posY, int posU, int posV, int width, int height, int widthUV, int heightUV) {
        Tessellator tessellator = Tessellator.getInstance();
        tessellator.startDrawing(GL11.GL_QUADS);
        tessellator.addVertexWithUV(posX, posY + height, 0, posU * guiScaler, (posV + heightUV) * guiScaler);
        tessellator.addVertexWithUV(posX + width, posY + height, 0, (posU + widthUV) * guiScaler, (posV + heightUV) * guiScaler);
        tessellator.addVertexWithUV(posX + width, posY, 0, (posU + widthUV) * guiScaler, posV * guiScaler);
        tessellator.addVertexWithUV(posX, posY, 0, posU * guiScaler, posV * guiScaler);
        tessellator.draw();
    }
    public static void drawTexturedRect(int posX, int posY, int posU, int posV, int width, int height) {
        Tessellator tessellator = Tessellator.getInstance();
        tessellator.startDrawing(GL11.GL_QUADS);
        tessellator.addVertexWithUV(posX, posY + height, 0, posU * guiScaler, (posV + height) * guiScaler);
        tessellator.addVertexWithUV(posX + width, posY + height, 0, (posU + width) * guiScaler, (posV + height) * guiScaler);
        tessellator.addVertexWithUV(posX + width, posY, 0, (posU + width) * guiScaler, posV * guiScaler);
        tessellator.addVertexWithUV(posX, posY, 0, posU * guiScaler, posV * guiScaler);
        tessellator.draw();
    }



    private void func_146977_a(ItemStack p_146977_1_, int xDisplayPosition, int yDisplayPosition) {
        GL11.glPushMatrix();
        GL11.glDisable(GL11.GL_LIGHTING);
        itemRender.renderItemAndEffectIntoGUI(this.fontRendererObj, this.mc.getTextureManager(), p_146977_1_, xDisplayPosition, yDisplayPosition);
        itemRender.renderItemOverlayIntoGUI(this.fontRendererObj, this.mc.getTextureManager(), p_146977_1_, xDisplayPosition, yDisplayPosition, null);
        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glPopMatrix();
    }


}