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
 * <p>Class for buttons used for overlay control buttons in paintbrush menu.</p>
 */
@SideOnly(Side.CLIENT)
class GuiButtonPaintbrushOverlayController extends GuiButton {
    enum Type {
        NONE,
        DYNAMIC,
        FIXED
    }
    enum Texture {
        SELECTED,
        SELECTED_HOVER,
        UNSELECTED,
        UNSELECTED_HOVER,
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
    private Texture texture;
    private Type type;
    private boolean hoveringStatus;

    public GuiButtonPaintbrushOverlayController(int buttonID, int x, int y, int xSize, int ySize, Type type) {
        super(buttonID, x, y, xSize, ySize, "");
        this.setType(type, Texture.UNAVAILABLE);
    }

    /**
     * Draws this button to the screen.
     */
    @Override
    public void drawButton(Minecraft mc, int par2, int par3) {
        if (this.visible && showButton) {
            setHoveringStatus(par2 >= this.xPosition && par3 >= this.yPosition && par2 < this.xPosition + this.width && par3 < this.yPosition + this.height); // If mouse is hovering over, set hover status.
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            RenderHelper.enableGUIStandardItemLighting();
            GL11.glPushMatrix();
            mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "gui_paintbrush_overlay_controller.png"));
            this.drawTexturedModalRect(this.xPosition, this.yPosition, u, v, TEXTURE_WIDTH, TEXTURE_HEIGHT);
            RenderHelper.disableStandardItemLighting();
            GL11.glPopMatrix();
        }
    }
    public void setType(Type type, Texture texture) {
        this.type = type;
        this.texture = texture;
        if (type == Type.NONE || type == Type.FIXED) {
            TEXTURE_WIDTH = 29;
        } else {
            TEXTURE_WIDTH = 56;
        }
        TEXTURE_HEIGHT = 29;
        if (type == Type.NONE)
            u = 0;
        else if (type == Type.FIXED)
            u = 85;
        else
            u = 29;
        switch(texture) {
            case SELECTED:
                v = 134;
                break;
            case SELECTED_HOVER:
                v = 163;
                break;
            case UNSELECTED:
                v = 76;
                break;
            case UNSELECTED_HOVER:
                v = 105;
                break;
            case UNAVAILABLE:
                v = 192;
                break;
        }
    }

    private void setHoveringStatus(boolean newHoverStatus) {
        if (newHoverStatus) {
            if (!hoveringStatus) {
                hoveringStatus = true;
                if (texture == Texture.UNSELECTED)
                    setType(type, Texture.UNSELECTED_HOVER);
                else if (texture == Texture.SELECTED)
                    setType(type, Texture.SELECTED_HOVER);
            }
        } else {
            if (hoveringStatus) {
                hoveringStatus = false;
                if (texture == Texture.UNSELECTED_HOVER)
                    setType(type, Texture.UNSELECTED);
                else if (texture == Texture.SELECTED_HOVER)
                    setType(type, Texture.SELECTED);
            }
        }
    }

    public boolean getHoveringStatus() { return hoveringStatus; }
}