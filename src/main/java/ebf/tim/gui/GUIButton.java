package ebf.tim.gui;

import ebf.tim.utility.ClientUtil;
import ebf.tim.utility.CommonUtil;
import fexcraft.tmt.slim.TextureManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

/**
 * <h2>Gui Button</h2>
 * slight rework of the vanilla GuiButton class.
 * this makes it so the text assigned to the button isn't rendered, that way we can use it as hover text from the GUI render.
 * also makes some small performance enhancements.
 * @author Eternal Blue Flame
 */
public abstract class GUIButton extends GuiButton {

    private int GLID=-1;

    /** setter for buttons without text, this sets the button's draw information and icon */
    public GUIButton(int p_i1021_2_, int p_i1021_3_, int p_i1021_4_, int p_i1021_5_) {
        super(-1,p_i1021_2_,p_i1021_3_,p_i1021_4_,p_i1021_5_,"");
    }

    /** setter for the button's draw information, icon, and name */
    public GUIButton(int p_i1021_2_, int p_i1021_3_, int p_i1021_4_, int p_i1021_5_, String text) {
        super(-1,p_i1021_2_,p_i1021_3_,p_i1021_4_,p_i1021_5_,text);
    }

    /**
     * @return the RGB tint for the button background, values should be from 0 to 255, null for no recolor
     */
    public int[] getColor(){
        return null;
    }

    /**
     * @return the icon to show for a button
     */
    public ResourceLocation getIcon(){
        return null;
    }

    /**
     * @return the UV mapping for the icon, x,y,width,height
     */
    public int[] getIconUV(){
        return null;
    }

    @Deprecated
    /** returns the hover state fo the cursor*/
    public int getHoverState(boolean p_146114_1_) {
        return !this.enabled?0:p_146114_1_?2:1;
    }

    @Override
    public void drawButton(Minecraft mc, int mouseX, int mouseY){
        drawButton(mouseX, mouseY);
    }


    /** draws the button*/
    public void drawButton(int mouseX, int mouseY) {
        GL11.glPushMatrix();
        TextureManager.bindTexture(buttonTextures);
        if(getColor()!=null){
            GL11.glColor4f(getColor()[0]*0.00392156862f, getColor()[1]*0.00392156862f, getColor()[2]*0.00392156862f, 1.0F);
        } else{
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        }
        this.field_146123_n = mouseX >= this.xPosition && mouseY >= this.yPosition && mouseX < this.xPosition + this.width && mouseY < this.yPosition + this.height;
        int k = field_146123_n?2:1;
        //GL11.glEnable(GL11.GL_BLEND);
        //OpenGlHelper.glBlendFunc(770, 771, 1, 0);
        //GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        ClientUtil.drawTexturedRect(this.xPosition, this.yPosition, 0, 46 + k * 20, this.width / 2, this.height);
        ClientUtil.drawTexturedRect(this.xPosition + this.width *0.5f, this.yPosition, 200 - this.width / 2, 46 + k * 20, this.width / 2, this.height);

        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        if(getIcon()!=null) {
            TextureManager.bindTexture(getIcon());
            if(getIconUV()==null){
                ClientUtil.drawTexturedRect(this.xPosition+1, this.yPosition+1, 0, 0, this.width-1, this.height-1, 256,256);
            } else {
                ClientUtil.drawTexturedRect(this.xPosition+1, this.yPosition+1, getIconUV()[0], getIconUV()[1], this.width-1, this.height-1, getIconUV()[2], getIconUV()[3]);
            }
        }
        int l = 14737632;

        if (packedFGColour != 0) {
            l = packedFGColour;
        }
        else if (!this.enabled) {
            l = 10526880;
        }
        else if (this.field_146123_n) {
            l = 16777120;
        }

        this.drawCenteredString(Minecraft.getMinecraft().fontRenderer, this.displayString, this.xPosition + this.width / 2, this.yPosition + (this.height - 8) / 2, l);
        GL11.glPopMatrix();
    }

    public void drawText(int mouseX, int mouseY){
        if(getHoverText()!=null) {
            GL11.glPushMatrix();
            if (field_146123_n) {
                drawHoveringText(CommonUtil.translate(getHoverText()), mouseX, mouseY, Minecraft.getMinecraft().fontRenderer);
            }
            GL11.glPopMatrix();
        }
    }

    /** checks if the button has hover text, if true the button's hover text is drawn*/
    protected void drawHoveringText(String p_146283_1_, int p_146283_2_, int p_146283_3_, FontRenderer font) {
        if (!p_146283_1_.isEmpty()) {
            GL11.glDisable(GL12.GL_RESCALE_NORMAL);
            RenderHelper.disableStandardItemLighting();
            GL11.glDisable(GL11.GL_LIGHTING);
            GL11.glDisable(GL11.GL_DEPTH_TEST);
            int k = font.getStringWidth(p_146283_1_);

            int j2 = p_146283_2_ + 12;
            int k2 = p_146283_3_ - 12;
            int i1 = 8;

            if (j2 + k > this.width) {
                j2 -= 28 + k;
            }

            this.zLevel = 300.0F;
            int j1 = -267386864;
            this.drawGradientRect(j2 - 3, k2 - 4, j2 + k + 3, k2 - 3, j1, j1);
            this.drawGradientRect(j2 - 3, k2 + i1 + 3, j2 + k + 3, k2 + i1 + 4, j1, j1);
            this.drawGradientRect(j2 - 3, k2 - 3, j2 + k + 3, k2 + i1 + 3, j1, j1);
            this.drawGradientRect(j2 - 4, k2 - 3, j2 - 3, k2 + i1 + 3, j1, j1);
            this.drawGradientRect(j2 + k + 3, k2 - 3, j2 + k + 4, k2 + i1 + 3, j1, j1);
            int k1 = 1347420415;
            int l1 = (k1 & 16711422) >> 1 | k1 & -16777216;
            this.drawGradientRect(j2 - 3, k2 - 3 + 1, j2 - 3 + 1, k2 + i1 + 3 - 1, k1, l1);
            this.drawGradientRect(j2 + k + 2, k2 - 3 + 1, j2 + k + 3, k2 + i1 + 3 - 1, k1, l1);
            this.drawGradientRect(j2 - 3, k2 - 3, j2 + k + 3, k2 - 3 + 1, k1, k1);
            this.drawGradientRect(j2 - 3, k2 + i1 + 2, j2 + k + 3, k2 + i1 + 3, l1, l1);

            font.drawStringWithShadow(p_146283_1_, j2, k2, -1);


            this.zLevel = 0.0F;
            GL11.glEnable(GL11.GL_LIGHTING);
            GL11.glEnable(GL11.GL_DEPTH_TEST);
            RenderHelper.enableStandardItemLighting();
            GL11.glEnable(GL12.GL_RESCALE_NORMAL);
        }
    }

    /** returns the bool of if the mouse is hovering over the button */
    public boolean getMouseHover(){
        return field_146123_n;
    }

    /** the tooltip text for the button shows when you move the cursor over the button*/
    public abstract String getHoverText();

    /** this is called when the button is left-clicked */
    public abstract void onClick();

}
