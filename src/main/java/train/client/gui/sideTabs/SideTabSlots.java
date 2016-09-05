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
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import train.client.gui.GuiCrafterTier;
import train.common.core.interfaces.ITier;
import train.common.library.Info;

import static net.minecraft.client.gui.Gui.drawRect;

@SideOnly(Side.CLIENT)
public class SideTabSlots extends SideTab {

	protected ITier tile;
	protected int headerColour = 0xbd9700;
	protected int[] array;

	public SideTabSlots(ITier tile, GuiCrafterTier gui, boolean side, boolean x, boolean y, int[] array) {
		super(gui, side, x, y);
		maxHeight = 94;
		overlayColor = 0x192c4f;
		this.array = array;
		this.tile = tile;
	}

	@Override
	public void draw(int x, int y) {
		// Draw background
		drawBackground(x, y);

		// Draw icon
		drawIcon(Info.guiPrefix + "Icons.png", 2, x + 4, y + 4);

		if (!isFullyOpened())
			return;

		fontRenderer.drawString("Output slot", x - 69, y + 8, 0x000000);
		fontRenderer.drawString("Output slot", x - 70, y + 8, headerColour);

		FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.guiPrefix + "Icons.png"));

		drawRect(x - 91, y + 30, -4, 135, 0xff02142d);
		drawRect(x - 90, y + 29, -5, 136, 0xff02142d);

		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

		for (int i = 0; i < 4; i++) {
			if (array[i] == 0) {
				gui.drawTexturedModalRect(x - 86 + i * 28, y + 34, i * 16, 32, 16, 16);
			}
			else {
				gui.drawTexturedModalRect(x - 86 + i * 28, y + 34, i * 16, 48, 16, 16);
			}
		}
		for (int i = 0; i < 4; i++) {
			if (array[i + 4] == 0) {
				gui.drawTexturedModalRect(x - 86 + i * 28, y + 58, 64 + i * 16, 32, 16, 16);
			}
			else {
				gui.drawTexturedModalRect(x - 86 + i * 28, y + 58, 64 + i * 16, 48, 16, 16);
			}
		}
	}

	@Override
	public boolean handleMouseClicked(int x, int y, int mouseButton) {
		x -= this.currentShiftX;
		y -= this.currentShiftY;

		int current;

		if (!isFullyOpened()) {
			return false;
		}
		else {
			if ((x > -110 && x < -94) && (y < 49 && y > 33)) {
				soundManager.playSound(PositionedSoundRecord.func_147673_a(new ResourceLocation("random.click")));
				current = array[0];
				array[0] = current == 0 ? 1 : 0;
				return true;
			}
			else if ((x > -82 && x < -66) && (y < 49 && y > 33)) {
				soundManager.playSound(PositionedSoundRecord.func_147673_a(new ResourceLocation("random.click")));
				current = array[1];
				array[1] = current == 0 ? 1 : 0;
				return true;
			}
			else if ((x > -54 && x < -38) && (y < 49 && y > 33)) {
				soundManager.playSound(PositionedSoundRecord.func_147673_a(new ResourceLocation("random.click")));
				current = array[2];
				array[2] = current == 0 ? 1 : 0;
				return true;
			}
			else if ((x > -26 && x < -10) && (y < 49 && y > 33)) {
				soundManager.playSound(PositionedSoundRecord.func_147673_a(new ResourceLocation("random.click")));
				current = array[3];
				array[3] = current == 0 ? 1 : 0;
				return true;
			}
			else if ((x > -110 && x < -94) && (y < 72 && y > 58)) {
				soundManager.playSound(PositionedSoundRecord.func_147673_a(new ResourceLocation("random.click")));
				current = array[4];
				array[4] = current == 0 ? 1 : 0;
				return true;
			}
			else if ((x > -82 && x < -66) && (y < 72 && y > 58)) {
				soundManager.playSound(PositionedSoundRecord.func_147673_a(new ResourceLocation("random.click")));
				current = array[5];
				array[5] = current == 0 ? 1 : 0;
				return true;
			}
			else if ((x > -54 && x < -38) && (y < 72 && y > 58)) {
				soundManager.playSound(PositionedSoundRecord.func_147673_a(new ResourceLocation("random.click")));
				current = array[6];
				array[6] = current == 0 ? 1 : 0;
				return true;
			}
			else if ((x > -26 && x < -10) && (y < 72 && y > 58)) {
				soundManager.playSound(PositionedSoundRecord.func_147673_a(new ResourceLocation("random.click")));
				current = array[7];
				array[7] = current == 0 ? 1 : 0;
				return true;
			}
			else {
				return false;
			}
		}
	}

	@Override
	public String getTooltip() {
		return "Slots";
	}
}
