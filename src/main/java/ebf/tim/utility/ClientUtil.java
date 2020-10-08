package ebf.tim.utility;

import ebf.tim.TrainsInMotion;
import fexcraft.tmt.slim.Tessellator;
import fexcraft.tmt.slim.TextureManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import java.util.List;

public class ClientUtil {
    public static final ResourceLocation vanillaInventory =
            ClientProxy.useVanillaInventoryTextures?new ResourceLocation("textures/gui/container/furnace.png"):
                    new ResourceLocation(TrainsInMotion.MODID, "textures/gui/furnace.png");

    public static final ResourceLocation craftingTableGuiTextures = ClientProxy.useVanillaInventoryTextures?new ResourceLocation("textures/gui/container/crafting_table.png"):
            new ResourceLocation(TrainsInMotion.MODID, "textures/gui/crafting.png");

    public static final ResourceLocation vanillaChest =
            ClientProxy.useVanillaInventoryTextures?new ResourceLocation("textures/gui/container/generic_54.png"):
                    new ResourceLocation(TrainsInMotion.MODID, "textures/gui/chest.png");

    private static Minecraft getMC(){return Minecraft.getMinecraft();}

    public static int percentTop(int value, float guiTop){return (int)(guiTop*(value*0.01f));}
    public static int percentLeft(int value, float guiLeft){return (int)(guiLeft*(value*0.01f));}


    public static void drawSlots(List<ItemStack> slots, List<ItemStack> overlays, List<Integer> slotX, List<Integer> slotY, int mouseX, int mouseY, float guiLeft, float guiTop, RenderItem itemRender){

        GL11.glPushMatrix();
        TextureManager.bindTexture(vanillaInventory);
        GL11.glDisable(GL11.GL_LIGHTING);
        int i=0;
        for (;i<slots.size(); i++){
            drawTexturedRect(slotX.get(i)+ guiLeft-2, slotY.get(i)+guiTop-2,
                    54, 51, 20, 20);
        }
        GL11.glPopMatrix();



        if(overlays!=null) {
            GL11.glPushMatrix();
            RenderHelper.enableStandardItemLighting();
            for (i=0;i<slots.size(); i++){
                if (overlays.get(i) != null && slots.get(i) == null) {
                    DrawItemSlotPreview(slotX.get(i)+guiLeft, slotY.get(i)+guiTop,mouseX,mouseY, overlays.get(i), itemRender);
                }
            }
            RenderHelper.disableStandardItemLighting();
            GL11.glPopMatrix();

            GL11.glPushMatrix();
            GL11.glEnable(GL11.GL_TEXTURE_2D);
            TextureManager.bindTexture(vanillaInventory);
            GL11.glEnable(GL11.GL_BLEND);
            GL11.glDisable(GL11.GL_LIGHTING);
            GL11.glTranslatef(0,0,100);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
            for (i = 0; i < overlays.size(); i++) {
                if (overlays.get(i) != null && slots.get(i) == null) {
                    drawTexturedRect(slotX.get(i)+ guiLeft-2, slotY.get(i)+guiTop-2,
                            54, 51, 20, 20);
                }
            }
            GL11.glDisable(GL11.GL_BLEND);
            GL11.glPopMatrix();
        }

        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1F);
    }


    private static void DrawItemSlotPreview(float x, float y, int mouseX, int mouseY, ItemStack overlay, RenderItem itemRender){

        if(overlay!=null && overlay.getItem()!=null) {
            //render the item and the overlay
            itemRender.renderItemAndEffectIntoGUI(Minecraft.getMinecraft().fontRenderer, Minecraft.getMinecraft().getTextureManager(),
                    overlay, (int)x, (int)y);
            itemRender.renderItemOverlayIntoGUI(Minecraft.getMinecraft().fontRenderer, Minecraft.getMinecraft().getTextureManager(),
                    overlay, (int)x, (int)y, null);
        }

    }


    /**
     * A more heavily optimized method to render text with outlines
     * done by rendering once to a displaylist, then just re-rendering the displaylist with offsets to make an outline.
     *
     * @param font the fontRender, usually from the MC instance, but custom can be supplied.
     * @param string the string of text to display
     * @param x the x coord to draw at, this is not relative to the screen center.
     * @param y the x coord to draw at, this is not relative to the screen center.
     * @param color the hex value color to draw the center string
     */
    public static void drawTextOutlined(FontRenderer font, String string, float x, float y, int color){
        GL11.glPushMatrix();
        int i= GLAllocation.generateDisplayLists(1);
        GL11.glNewList(i, GL11.GL_COMPILE);
        //render once, then translate around a 3x3 square.
        font.drawString(string, (int)x-1, (int)y+1, 0);
        GL11.glEndList();
        GL11.glTranslatef(1,0,0);
        GL11.glCallList(i);
        GL11.glTranslatef(1,0,0);
        GL11.glCallList(i);
        GL11.glTranslatef(0,-1,0);
        GL11.glCallList(i);
        GL11.glTranslatef(0,-1,0);
        GL11.glCallList(i);
        GL11.glTranslatef(-1,0,0);
        GL11.glCallList(i);
        GL11.glTranslatef(-1,0,0);
        GL11.glCallList(i);
        GL11.glTranslatef(0,1,0);
        GL11.glCallList(i);
        GL11.glTranslatef(0,1,0);
        GL11.glCallList(i);

        font.drawString(string,(int)x,(int)y,color);
        GL11.glColor4f(1,1,1,1);//fixes color bleed
        GL11.glPopMatrix();
        GL11.glDeleteLists(i,1);//we don't need it later, clear it from GPU
    }




    /**the amount to scale the GUI by, same as vanilla*/
    private static final float guiScaler = 0.00390625F;
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
    public static void drawTexturedRect(float posX, float posY, int posU, int posV, int width, int height, int widthUV, int heightUV) {
        Tessellator tessellator = Tessellator.getInstance();
        tessellator.startDrawing(GL11.GL_QUADS);
        tessellator.addVertexWithUV(posX, posY + height, 0, posU * guiScaler, (posV + heightUV) * guiScaler);
        tessellator.addVertexWithUV(posX + width, posY + height, 0, (posU + widthUV) * guiScaler, (posV + heightUV) * guiScaler);
        tessellator.addVertexWithUV(posX + width, posY, 0, (posU + widthUV) * guiScaler, posV * guiScaler);
        tessellator.addVertexWithUV(posX, posY, 0, posU * guiScaler, posV * guiScaler);
        tessellator.draw();
    }
    public static void drawTexturedRect(float posX, float posY, int posU, int posV, int width, int height) {
        Tessellator tessellator = Tessellator.getInstance();
        tessellator.startDrawing(GL11.GL_QUADS);
        tessellator.addVertexWithUV(posX, posY + height, 0, posU * guiScaler, (posV + height) * guiScaler);
        tessellator.addVertexWithUV(posX + width, posY + height, 0, (posU + width) * guiScaler, (posV + height) * guiScaler);
        tessellator.addVertexWithUV(posX + width, posY, 0, (posU + width) * guiScaler, posV * guiScaler);
        tessellator.addVertexWithUV(posX, posY, 0, posU * guiScaler, posV * guiScaler);
        tessellator.draw();
    }

}
