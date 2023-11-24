package train.client.gui;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import train.common.library.Info;

/**
 * @author 02skaplan
 * Class for buttons used for search functionality in recipe book.
 */
@SideOnly(Side.CLIENT)
class GuiButtonRecipeSearch extends GuiButton {
    enum Type {
        PREVIOUSRESULT,
        NEXTRESULT,
        SEARCH
    }
    enum Texture {
        ACTIVE,
        INACTIVE
    }
    /**
     * if the button has to be drawn drawButton is more than just draw, it makes the button exists or not too
     */
    public boolean showButton;
    private Type type;
    /**
     * Starting x-value on texture.
     */
    private int u;
    /**
     * Starting y-value on texture.
     */
    private final int v = 14;

    public GuiButtonRecipeSearch(int buttonID, int x, int y, int xSize, int ySize, Type type) {
        super(buttonID, x, y, xSize, ySize, "");
        this.setType(type, Texture.INACTIVE);
    }

    /**
     * Draws this button to the screen.
     */
    @Override
    public void drawButton(Minecraft mc, int par2, int par3) {
        if (this.visible && showButton) {
            if (type == Type.SEARCH) {
                if (par2 >= this.xPosition && par3 >= this.yPosition && par2 < this.xPosition + this.width && par3 < this.yPosition + this.height)
                    this.setType(Type.SEARCH, Texture.ACTIVE);
                else
                    this.setType(Type.SEARCH, Texture.INACTIVE);
            }
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.bookPrefix + "searchbar.png"));
            this.drawTexturedModalRect(this.xPosition, this.yPosition, u, v, 10, 10);
        }
    }
    public void setType(Type type, Texture texture) {
        this.type = type;
        if (type == Type.PREVIOUSRESULT) {
            if (texture == Texture.ACTIVE) {
                this.u = 0;
            } else {
                this.u = 20;
            }
        } else if (type == Type.NEXTRESULT) {
            if (texture == Texture.ACTIVE) {
                this.u = 10;
            } else {
                this.u = 30;
            }
        } else {
            if (texture == Texture.ACTIVE) {
                this.u = 50;
            } else {
                this.u = 40;
            }
        }
    }
}