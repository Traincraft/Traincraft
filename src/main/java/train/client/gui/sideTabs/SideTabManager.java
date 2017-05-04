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
import net.minecraft.client.gui.FontRenderer;
import org.lwjgl.opengl.GL11;
import train.client.core.helpers.SessionHelper;
import train.client.gui.GuiTraincraft;

import java.util.ArrayList;

@SideOnly(Side.CLIENT)
public class SideTabManager {

	private GuiTraincraft gui;
	protected ArrayList<SideTab> sideTabLeft = new ArrayList<SideTab>();
	protected ArrayList<SideTab> sideTabRight = new ArrayList<SideTab>();

	protected static FontRenderer fontRenderer = FMLClientHandler.instance().getClient().fontRenderer;

	public SideTabManager(GuiTraincraft gui) {
		this.gui = gui;
	}

	public void add(SideTab tab) {
		if (tab.side) {
			this.sideTabLeft.add(tab);
			if (SessionHelper.getOpenedLedger() != null && tab.getClass().equals(SessionHelper.getOpenedLedger())) {
				tab.setFullyOpen();
			}
		}
		else {
			this.sideTabRight.add(tab);
			if (SessionHelper.getOpenedLedger() != null && tab.getClass().equals(SessionHelper.getOpenedLedger())) {
				tab.setFullyOpen();
			}
		}
	}

	/**
	 * Inserts a tab into the next-to-last position.
	 * 
	 * @param tab
	 */
	public void insert(SideTab tab) {
		if (tab.side) {
			this.sideTabLeft.add(sideTabLeft.size() - 1, tab);
		}
		else {
			this.sideTabRight.add(sideTabRight.size() - 1, tab);
		}
	}

	public SideTab getAtPosition(int mX, int mY) {
		int xShift = ((gui.width - 176) / 2);
		int yShift = ((gui.height - 256) / 2) + 8;

		for (SideTab tab : sideTabLeft) {
			if (!tab.isVisible())
				continue;

			tab.currentShiftX = xShift;
			tab.currentShiftY = yShift;
			if (tab.intersectsWith(mX, mY, xShift, yShift))
				return tab;

			yShift += tab.getHeight();
		}

		xShift = ((gui.width - 176) / 2) + 176;
		yShift = ((gui.height - 256) / 2) + 8;

		for (SideTab tab : sideTabRight) {
			if (!tab.isVisible())
				continue;

			tab.currentShiftX = xShift;
			tab.currentShiftY = yShift;
			if (tab.intersectsWith(mX, mY, xShift, yShift))
				return tab;

			yShift += tab.getHeight();
		}
		return null;
	}

	public void drawSideTabs(int mouseX, int mouseY) {
		int xPos = 8;
		for (SideTab tab : sideTabLeft) {
			tab.update();
			if (!tab.isVisible())
				continue;

			tab.draw(-24, xPos);
			xPos += tab.getHeight();
		}

		xPos = 8;
		for (SideTab tab : sideTabRight) {
			tab.update();
			if (!tab.isVisible())
				continue;

			tab.draw(176, xPos);
			xPos += tab.getHeight();
		}
		SideTab tab = getAtPosition(mouseX, mouseY);
		if (tab != null) {
			if (tab.side) {
				String tooltip = tab.getTooltip();
				int textWidth = fontRenderer.getStringWidth(tooltip);
				int startX = mouseX - ((gui.width - 176) / 2) - textWidth - 14;
				int startY = mouseY - ((gui.height - 256) / 2) - 12;

				int i4 = 0xf0100010;
				int h = 8;
				gui.drawGradientRect(startX - 3, startY - 4, startX + textWidth + 3, startY + 8 + 4, i4, i4);
				gui.drawGradientRect(startX - 4, startY - 3, startX + textWidth + 4, startY + 8 + 3, i4, i4);
				int colour1 = 0x505000ff;
				int colour2 = (colour1 & 0xfefefe) >> 1 | colour1 & 0xff000000;
				gui.drawGradientRect(startX - 3, startY - 3, startX + textWidth + 3, startY + 8 + 3, colour1, colour2);
				gui.drawGradientRect(startX - 2, startY - 2, startX + textWidth + 2, startY + 8 + 2, i4, i4);
				GL11.glDisable(GL11.GL_LIGHTING);
				GL11.glDisable(GL11.GL_DEPTH_TEST);
				fontRenderer.drawStringWithShadow(tooltip, startX, startY, -1);
				GL11.glEnable(GL11.GL_LIGHTING);
				GL11.glEnable(GL11.GL_DEPTH_TEST);
			}
			else {
				int startX = mouseX - ((gui.width - 176) / 2) + 12;
				int startY = mouseY - ((gui.height - 256) / 2) - 12;

				String tooltip = tab.getTooltip();
				int textWidth = fontRenderer.getStringWidth(tooltip);
				gui.drawGradientRect(startX - 3, startY - 3, startX + textWidth + 3, startY + 8 + 3, 0xc0000000, 0xc0000000);
				GL11.glDisable(GL11.GL_LIGHTING);
				GL11.glDisable(GL11.GL_DEPTH_TEST);
				fontRenderer.drawStringWithShadow(tooltip, startX, startY, -1);
				GL11.glEnable(GL11.GL_LIGHTING);
				GL11.glEnable(GL11.GL_DEPTH_TEST);
			}
		}
	}

	public void handleMouseClicked(int x, int y, int mouseButton) {
		if (mouseButton == 0) {
			SideTab tab = this.getAtPosition(x, y);
			if (tab != null) {
				if (tab.side) {
					if (!tab.handleMouseClicked(x, y, mouseButton)) {
						for (SideTab other : sideTabLeft)
							if (other != tab && other.isOpen())
								other.toggleOpen();
						tab.toggleOpen();
					}
				}
				else {
					if (!tab.handleMouseClicked(x, y, mouseButton)) {
						for (SideTab other : sideTabRight)
							if (other != tab && other.isOpen())
								other.toggleOpen();
						tab.toggleOpen();
					}
				}
			}
		}
	}

	public void handleMouseOver(SideTab tab) {
		if (tab.side) {
			for (SideTab other : sideTabLeft) {
				if (other != tab && other.isOpen()) {
					other.toggleOpen();
				}
				tab.toggleOpen();
			}
		}
		else {
			for (SideTab other : sideTabRight) {
				if (other != tab && other.isOpen()) {
					other.toggleOpen();
				}
				tab.toggleOpen();
			}
		}
	}
}
