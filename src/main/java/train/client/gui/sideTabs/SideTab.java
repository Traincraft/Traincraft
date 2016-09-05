/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.client.gui.sideTabs;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import train.client.core.helpers.SessionHelper;
import train.client.gui.GuiCrafterTier;
import train.common.library.Info;

@SideOnly(Side.CLIENT)
public abstract class SideTab {

	private boolean open;
	private boolean openX;
	private boolean openY;

	//true==left, false==right
	protected boolean side;

	protected int overlayColor = 0xffffff;

	public int currentShiftX = 0;
	public int currentShiftY = 0;

	protected int maxWidth = 124;
	protected int minWidth = 24;
	protected int currentWidth = minWidth;

	protected int maxHeight = 24;
	protected int minHeight = 24;
	protected int currentHeight = minHeight;

	public GuiCrafterTier gui;
	protected static FontRenderer fontRenderer = FMLClientHandler.instance().getClient().fontRenderer;
	protected static SoundHandler soundManager = FMLClientHandler.instance().getClient().getSoundHandler();

	public SideTab(GuiCrafterTier gui, boolean side, boolean x, boolean y) {
		this.gui = gui;
		this.openX = x;
		this.openY = y;
		this.side = side;
	}

	public void update() {
		int offset = 2;

		if ((openX && openY) || (!openX && !openY)) {
			// Width
			if (open && currentWidth < maxWidth)
				currentWidth += offset;
			else if (!open && currentWidth > minWidth)
				currentWidth -= offset;

			// Height
			if (open && currentHeight < maxHeight)
				currentHeight += offset;
			else if (!open && currentHeight > minHeight)
				currentHeight -= offset;
		}
		else if (openX && !openY) {
			// Width
			if (open && currentWidth < maxWidth)
				currentWidth += offset;
			else if (!open && currentWidth > minWidth)
				currentWidth -= offset;
		}
		else {
			// Height
			if (open && currentHeight < maxHeight)
				currentHeight += offset;
			else if (!open && currentHeight > minHeight)
				currentHeight -= offset;
		}
	}

	public int getHeight() {
		return currentHeight;
	}

	public abstract void draw(int x, int y);

	public abstract String getTooltip();

	public boolean handleMouseClicked(int x, int y, int mouseButton) {
		return false;
	}

	public boolean intersectsWith(int mouseX, int mouseY, int shiftX, int shiftY) {
		if (side) {
			if (mouseX <= shiftX && mouseX >= shiftX - currentWidth && mouseY >= shiftY && mouseY <= shiftY + getHeight()) {
				return true;
			}
		}
		else {
			if (mouseX >= shiftX && mouseX <= shiftX + currentWidth && mouseY >= shiftY && mouseY <= shiftY + getHeight()) {
				return true;
			}
		}
		return false;
	}

	public void setFullyOpen() {
		open = true;
		currentWidth = maxWidth;
		currentHeight = maxHeight;
	}

	public void toggleOpen() {
		if (open) {
			open = false;
			SessionHelper.setOpenedLedger(null);
		}
		else {
			open = true;
			SessionHelper.setOpenedLedger(this.getClass());
		}
	}

	public boolean isVisible() {
		return true;
	}

	public boolean isOpen() {
		return this.open;
	}

	public boolean isFullyOpened() {
		return currentWidth >= maxWidth;
	}

	public void drawBackground(int x, int y) {
		String texture;
		float colorR = (overlayColor >> 16 & 255) / 255.0F;
		float colorG = (overlayColor >> 8 & 255) / 255.0F;
		float colorB = (overlayColor & 255) / 255.0F;

		if (side) {
			texture = Info.guiPrefix + "sideTab_left.png";

			GL11.glColor4f(colorR, colorG, colorB, 1.0F);

			FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,texture));
			gui.drawTexturedModalRect(x + 24 - currentWidth, y + 2, 0, 256 - currentHeight + 2, 4, currentHeight - 2);
			gui.drawTexturedModalRect(x + 28 - currentWidth, y, 256 - currentWidth + 4, 0, currentWidth - 4, 4);
			// Add in top left corner again
			gui.drawTexturedModalRect(x + 24 - currentWidth, y, 0, 0, 4, 4);
			gui.drawTexturedModalRect(x + 28 - currentWidth, y + 4, 256 - currentWidth + 4, 256 - currentHeight + 4, currentWidth - 4, currentHeight - 4);
			GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0F);
		}
		else {
			texture = Info.guiPrefix + "sideTab_right.png";

			GL11.glColor4f(colorR, colorG, colorB, 1.0F);
			FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,texture));
			gui.drawTexturedModalRect(x, y, 0, 256 - currentHeight, 4, currentHeight);
			gui.drawTexturedModalRect(x + 4, y, 256 - currentWidth + 4, 0, currentWidth - 4, 4);
			// Add in top left corner again
			gui.drawTexturedModalRect(x, y, 0, 0, 4, 4);
			gui.drawTexturedModalRect(x + 4, y + 4, 256 - currentWidth + 4, 256 - currentHeight + 4, currentWidth - 4, currentHeight - 4);
			GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0F);
		}
	}

	public void drawIcon(String texture, int iconIndex, int x, int y) {
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,texture));
		if (side) {
			GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0F);
			int textureRow = iconIndex >> 4;
			int textureColumn = iconIndex - 16 * textureRow;
			gui.drawTexturedModalRect(x + 24 - currentWidth, y, 16 * textureColumn, 16 * textureRow, 16, 16);
		}
		else {
			GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0F);
			int textureRow = iconIndex >> 4;
			int textureColumn = iconIndex - 16 * textureRow;
			gui.drawTexturedModalRect(x, y, 16 * textureColumn, 16 * textureRow, 16, 16);
		}
	}
}
