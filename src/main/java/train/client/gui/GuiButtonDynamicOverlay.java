package train.client.gui;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import train.common.library.Info;

/**
 * @author 02skaplan
 * <p>Class for buttons used for buttons in overlay menu.</p>
 */
@SideOnly(Side.CLIENT)
class GuiButtonDynamicOverlay extends GuiButton {

    enum Type {
        COLOR,
        FOREGROUND,
        BACKGROUND,
        SUBMIT,
        CANCEL,
        COLORTYPEBOX,
        SELECTIONARROWLEFT,
        SELECTIONARROWRIGHT
    }
    enum Texture {
        ACTIVE,
        INACTIVE,
        UNAVAILABLE
    }
    /**
     * if the button has to be drawn drawButton is more than just draw, it makes the button exists or not too
     */
    public boolean showButton;
    /**
     * Starting x-value on texture.
     */
    private int u;
    /**
     * Starting y-value on texture.
     */
    private int v = 0;
    private int TEXTURE_WIDTH;
    private int TEXTURE_HEIGHT;

    public GuiButtonDynamicOverlay(int buttonID, int x, int y, int xSize, int ySize, Type type) {
        super(buttonID, x, y, xSize, ySize, "");
        this.setType(type, Texture.INACTIVE);
    }

    /**
     * Draws this button to the screen.
     */
    @Override
    public void drawButton(Minecraft mc, int par2, int par3) {
        if (this.visible && showButton) {
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            RenderHelper.enableGUIStandardItemLighting();
            GL11.glPushMatrix();
            GL11.glTranslatef(0, 0, 10);
            mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "gui_dynamic_overlay.png"));
            this.drawTexturedModalRect(this.xPosition, this.yPosition, u, v, TEXTURE_WIDTH, TEXTURE_HEIGHT);
            RenderHelper.disableStandardItemLighting();
            GL11.glPopMatrix();
        }
    }
    public void setType(Type type, Texture texture) {
        if (type == Type.COLOR) {
            TEXTURE_WIDTH = 140;
            TEXTURE_HEIGHT = 112;
            u = 0;
            v= 0;
        } else if (type == Type.COLORTYPEBOX || type == Type.SELECTIONARROWLEFT || type == Type.SELECTIONARROWRIGHT) {
            if (type == Type.COLORTYPEBOX) {
                TEXTURE_WIDTH = 58;
                TEXTURE_HEIGHT = 17;
                u = 140;
            } else {
                TEXTURE_WIDTH = 29;
                TEXTURE_HEIGHT = 29;
            }
            if (type == Type.SELECTIONARROWLEFT)
                u = 227;
            else if (type == Type.SELECTIONARROWRIGHT)
                u = 198;
            if (texture == Texture.INACTIVE) {
                v = 58;
            } else if (texture == Texture.ACTIVE) {
                v = 87;
            } else {
                v = 116;
            }
        } else {
            TEXTURE_WIDTH = 29;
            TEXTURE_HEIGHT = 29;
            if (texture == Texture.INACTIVE || type == Type.CANCEL || type == Type.SUBMIT)
                v = 0;
            else
                v = 29;
            if (type == Type.FOREGROUND)
                u = 140;
            else if (type == Type.BACKGROUND)
                u = 169;
            else if (type == Type.CANCEL)
                u = 198;
            else
                u = 227;
        }
    }
}