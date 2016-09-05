/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.client.gui.sideTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import train.client.gui.GuiCrafterTier;
import train.common.library.Info;

import static net.minecraft.client.gui.Gui.drawRect;

@SideOnly(Side.CLIENT)
public class SideTabInfo extends SideTab {

	private int headerColour = 0x192c4f;
	private int underColor = 0xa0a0a0;
	private String[] names;

	public SideTabInfo(GuiCrafterTier gui, boolean side, boolean x, boolean y, String[] names) {
		super(gui, side, x, y);
		maxHeight = 106;
		overlayColor = 0xd3a900;
		this.names = names;
	}

	@Override
	public void draw(int x, int y) {
		// Draw background
		drawBackground(x, y);

		// Draw icon
		drawIcon((Info.guiPrefix + "Icons.png"), 0, x + 4, y + 4);

		if (!isFullyOpened())
			return;

		fontRenderer.drawString("Slot information", x - 69, y + 8, underColor);
		fontRenderer.drawString("Slot information", x - 70, y + 8, headerColour);

		drawRect(x - 83, y + 20, -90, 107, 0xff524100);
		drawRect(x - 82, y + 19, -91, 108, 0xff524100);

		drawRect(x - 63, y + 20, -10, 107, 0xff524100);
		drawRect(x - 62, y + 19, -11, 108, 0xff524100);

		for (int i = 0; i < 10; i++) {
			fontRenderer.drawString(names[i], x - 59, y + 20 + i * 8, underColor);
			fontRenderer.drawString("" + (i + 1), x - 80, y + 20 + i * 8, underColor);
		}

		fontRenderer.drawString("1", x + 49, y + 19, 0xffffff);
		fontRenderer.drawString("2", x + 103, y + 19, 0xffffff);
		fontRenderer.drawString("3", x + 139, y + 19, 0xffffff);
		fontRenderer.drawString("4", x + 169, y + 19, 0xffffff);
		fontRenderer.drawString("5", x + 49, y + 53, 0xffffff);
		fontRenderer.drawString("6", x + 103, y + 53, 0xffffff);
		fontRenderer.drawString("7", x + 139, y + 53, 0xffffff);
		fontRenderer.drawString("8", x + 67, y + 85, 0xffffff);
		fontRenderer.drawString("9", x + 103, y + 85, 0xffffff);
		fontRenderer.drawString("10", x + 169, y + 85, 0xffffff);
	}

	@Override
	public String getTooltip() {
		return "Info";
	}
}
