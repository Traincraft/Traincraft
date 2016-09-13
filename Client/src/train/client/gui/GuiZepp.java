package src.train.client.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import src.train.common.entity.zeppelin.AbstractZeppelin;
import src.train.common.inventory.InventoryZepp;
import src.train.common.library.Info;

public class GuiZepp extends GuiContainer {

	private AbstractZeppelin zepp;

	public GuiZepp(InventoryPlayer inventoryplayer, Entity entityzepp) {
		super(new InventoryZepp(inventoryplayer, (AbstractZeppelin) entityzepp));
		zepp = (AbstractZeppelin) entityzepp;
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int i, int j) {
		fontRenderer.drawString(zepp.getInvName(), 60, 6, 0x404040);
		fontRenderer.drawString("Inventory", 8, (ySize - 96) + 2, 0x404040);
		if (zepp.numCargoSlots > 0) {
			fontRenderer.drawString("Cargo:", 36, 22, 0x404040);
		}
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int t, int g) {
		String i = Info.guiPrefix + "gui_zeppelin.png";
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,i));
		int j = (width - xSize) / 2;
		int k = (height - ySize) / 2;
		drawTexturedModalRect(j, k, 0, 0, xSize, ySize);
		if (zepp.isFuelled()) {
			int l = zepp.c(12);
			drawTexturedModalRect(j + 8, (k + 36 + 12) - l, 176, 12 - l, 14, l + 2);
		}
		for (int i1 = zepp.numCargoSlots; i1 < 5; i1++) {
			drawTexturedModalRect(j + 79 + 18 * i1, k + 17, 190, 0, 18, 18);
		}

		for (int j1 = zepp.numCargoSlots1; j1 < 5; j1++) {
			drawTexturedModalRect(j + 79 + 18 * j1, k + 35, 190, 0, 18, 18);
		}

		for (int k1 = zepp.numCargoSlots2; k1 < 5; k1++) {
			drawTexturedModalRect(j + 79 + 18 * k1, k + 53, 190, 0, 18, 18);
		}
	}
}
