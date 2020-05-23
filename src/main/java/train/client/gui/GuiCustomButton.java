package train.client.gui;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.util.ResourceLocation;
import train.common.library.Info;

public class GuiCustomButton extends GuiButton {

	private String texture = Info.guiPrefix + "customButton.png";
	private int textureX = 0;
	private int textureY = 46;

	public GuiCustomButton(int par1, int par2, int par3, String par4Str, String texture, int textureX, int textureY) {
		this(par1, par2, par3, 200, 20, par4Str, texture, textureX, textureY);
	}

	public GuiCustomButton(int par1, int par2, int par3, int par4, int par5, String par6Str, String texture, int textureX, int textureY) {
		super(par1, par2, par3, par4, par5, par6Str);
		this.width = 200;
		this.height = 20;
		this.enabled = true;
		this.visible = true;
		this.id = par1;
		this.x = par2;
		this.y = par3;
		this.width = par4;
		this.height = par5;
		this.displayString = par6Str;
		this.texture = texture;
		this.textureX = textureX;
		this.textureY = textureY;
	}

	public void setTexture(String texture, int textureX, int textureY) {
		this.texture = texture;
		this.textureX = textureX;
		this.textureY = textureY;
	}
	
	@Override
	public void drawButton(Minecraft mc, int mouseX, int mouseY, float partialTicks) {
		if (this.visible) {
			FontRenderer var4 = mc.fontRenderer;
			mc.getTextureManager().bindTexture(new ResourceLocation(Info.resourceLocation,this.texture));
			//GL11.glBindTexture(GL11.GL_TEXTURE_2D, textureInt);
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			boolean var5 = mouseX >= this.x && mouseY >= this.y && mouseX < this.x + this.width && mouseY < this.y + this.height;
			this.drawTexturedModalRect(this.x, this.y, textureX, textureY, this.width, this.height);
			this.mouseDragged(mc, mouseX, mouseY);
			int var7 = 14737632;
			
			if (!this.enabled) {
				var7 = -6250336;
			}
			else if (var5) {
				var7 = 16777120;
			}
			this.drawCenteredString(var4, this.displayString, this.x + this.width / 2, this.y + (this.height - 8) / 2, var7);
		}
	}
}