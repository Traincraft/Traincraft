package train.client.gui;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import train.common.library.Info;

@SideOnly(Side.CLIENT)
class GuiButtonNextPage extends GuiButton {
	/**
	 * True for pointing right (next page), false for pointing left (previous page).
	 */
	private final boolean nextPage;
	/**
	 * if the button has to be drawn drawButton is more than just draw, it makes the button exists or not too
	 */
	public boolean showButton;

	public GuiButtonNextPage(int par1, int par2, int par3, int xSize, int ySize, boolean par4) {
		super(par1, par2, par3, 23, 13, "");
		this.nextPage = par4;
	}

	/**
	 * Draws this button to the screen.
	 */
	@Override
	public void drawButton(Minecraft mc, int par2, int par3) {
		if (this.visible && showButton) {
			boolean var4 = par2 >= this.xPosition && par3 >= this.yPosition && par2 < this.xPosition + this.width && par3 < this.yPosition + this.height;
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.bookPrefix + "bookleft.png"));
			int var5 = 0;
			int var6 = 206;

			if (var4) {
				var5 += 23;
			}

			if (!this.nextPage) {
				var6 += 13;
			}
			this.drawTexturedModalRect(this.xPosition, this.yPosition, var5, var6, 23, 13);
		}
	}
}
