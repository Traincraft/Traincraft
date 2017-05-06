package train.client.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import train.common.containers.ContainerOpenHearthFurnace;
import train.common.library.Info;
import train.common.tile.TileEntityOpenHearthFurnace;

public class GuiOpenHearthFurnace extends GuiContainer {

	private TileEntityOpenHearthFurnace furnaceInventory;
	private final ResourceLocation gui = new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "gui_open_hearth_furnace.png");

	public GuiOpenHearthFurnace(InventoryPlayer invPlayer, TileEntityOpenHearthFurnace tileentityfurnace) {
		super(new ContainerOpenHearthFurnace(invPlayer, tileentityfurnace));
		furnaceInventory = tileentityfurnace;
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int par1, int par2) {
		fontRendererObj.drawString("Open Hearth Furnace", 8, 6, 0x404040);
		fontRendererObj.drawString("Inventory", 8, (ySize - 96) + 2, 0x404040);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int t, int g) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		mc.renderEngine.bindTexture(gui);
		int j = (width - xSize) / 2;
		int k = (height - ySize) / 2;
		drawTexturedModalRect(j, k, 0, 0, xSize, ySize);
		if (furnaceInventory.isBurning()) {
			int l = furnaceInventory.getBurnTimeRemainingScaled(12);
			drawTexturedModalRect(j + 56, (k + 36 + 12) - l, 176, 12 - l, 14, l + 2);
			drawTexturedModalRect(j + 36, (k + 36 + 12) - l, 176, 12 - l, 14, l + 2);
		}
		int i1 = furnaceInventory.getCookProgressScaled(24);
		drawTexturedModalRect(j + 79, k + 34, 176, 14, i1 + 1, 16);
	}
}
