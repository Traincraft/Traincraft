/*******************************************************************************
 * Copyright (c) 2012 SirSengir. All rights reserved.
 * 
 * @name TrainCraft
 * @author SirSengir
 ******************************************************************************/

package train.client.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import train.client.gui.sideTabs.SideTabManager;
import train.common.containers.ContainerTraincraft;
import train.common.core.interfaces.ITier;
import train.common.core.managers.TierRecipe;
import train.common.core.managers.TierRecipeManager;
import train.common.library.Info;

import java.util.List;

public abstract class GuiTraincraft extends GuiContainer {

	protected SideTabManager sideTabManager = new SideTabManager(this);

	protected TileEntity tile;
	protected ITier tier;

	//public int xSize = 176;
	//public int ySize = 256;

	public GuiTraincraft(ContainerTraincraft container, IInventory inventory) {
		super(container);

		tier = (ITier) inventory;
		if (inventory instanceof TileEntity)
			tile = (TileEntity) inventory;

		initSideTabs(inventory);
	}

	protected void initSideTabs(IInventory inventory) {}

	@Override
	protected void drawGuiContainerForegroundLayer(int par1, int par2) {
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glDisable(GL11.GL_DEPTH_TEST);
		sideTabManager.drawSideTabs(par1, par2);
		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glEnable(GL11.GL_DEPTH_TEST);
	}

	protected int getCenteredOffset(String string) {
		return getCenteredOffset(string, xSize);
	}

	protected int getCenteredOffset(String string, int xWidth) {
		return (xWidth - fontRendererObj.getStringWidth(string)) / 2;
	}

	@Override
	protected void mouseClicked(int par1, int par2, int mouseButton) {
		super.mouseClicked(par1, par2, mouseButton);
		// / Handle ledger clicks
		sideTabManager.handleMouseClicked(par1, par2, mouseButton);
	}

	@Override
	public void drawGradientRect(int par1, int par2, int par3, int par4, int par5, int par6) {
		super.drawGradientRect(par1, par2, par3, par4, par5, par6);
	}

	protected boolean isMouseOverSlot(Slot par1Slot, int par2, int par3) {
		return this.func_74188_c(par1Slot.xDisplayPosition, par1Slot.yDisplayPosition, 16, 16, par2, par3);
	}

	private int isMouseOverSlot2(Slot slot, int par2, int par3) {
		boolean over = func_74188_c(slot.xDisplayPosition, slot.yDisplayPosition, 16, 16, par2, par3);
		if (over) {
			return slot.slotNumber;
		}
		else {
			return 0;
		}
	}

	protected boolean func_74188_c(int par1, int par2, int par3, int par4, int par5, int par6) {
		int var7 = this.guiLeft;
		int var8 = this.guiTop;
		par5 -= var7;
		par6 -= var8;
		return par5 >= par1 - 1 && par5 < par1 + par3 + 1 && par6 >= par2 - 1 && par6 < par2 + par4 + 1;
	}

	protected void colorSlot(int x, int y) {
		int j = (width - xSize) / 2;
		int k = (height - ySize) / 2;

		String var4 = tier.getGUITexture();
		mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,var4));

		GL11.glEnable(GL11.GL_BLEND);
		GL11.glColor4f(1.0F, 1.F, 1.0F, 0.3F);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		drawTexturedModalRect(j + x, k + y, 240, 0, 16, 16);
		GL11.glDisable(GL11.GL_BLEND);
	}

	protected void borderSlots(List<TierRecipe> recipeList, int[] states) {
		List cs = inventorySlots.inventorySlots;
		for (int l = 0; l < cs.size(); l++) {
			Slot slot = (Slot) cs.get(l);
			if (slot.slotNumber < 10) {
				if (slot.getHasStack()) {
					ItemStack stack = slot.getStack();
					for (TierRecipe recipe : recipeList) {
						if (recipe!= null) {
							List<ItemStack> items = recipe.getInput();
							ItemStack stack2 = items.get(l);
							if (stack2 != null) {
								if (TierRecipe.areItemsIdentical(stack, stack2)) {
									states[l] = 1;
									break;
								}
								else {
									states[l] = 2;
								}
							}
						}
					}
				}
				else {
					states[l] = 0;
				}
			}
		}

		int j = (width - xSize) / 2;
		int k = (height - ySize) / 2;

		for (int l = 0; l < cs.size(); l++) {
			Slot slot = (Slot) cs.get(l);
			if (/* slot instanceof Slot && */slot.slotNumber < 10) {
				String var4 = tier.getGUITexture();
				GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.9F);
				mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,var4));
				int x = slot.xDisplayPosition;
				int y = slot.yDisplayPosition;
				GL11.glEnable(GL11.GL_BLEND);
				GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
				if (states[l] == 1) {
					GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.4F);
					drawTexturedModalRect(j + x - 7, k + y - 7, 209, 1, 30, 30);
					GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
					drawTexturedModalRect(j + x - 7, k + y - 7, 209, 60, 30, 30);
				}
				else if (states[l] == 2) {
					GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.4F);
					drawTexturedModalRect(j + x - 7, k + y - 7, 178, 1, 30, 30);
					GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
					drawTexturedModalRect(j + x - 7, k + y - 7, 178, 60, 30, 30);
				}
				GL11.glDisable(GL11.GL_BLEND);
			}
		}
	}

	public void drawRecipes(int recipeSize, List<Item> recipes, int x, int y) {
		Item item = null;

		if (recipeSize == -1) {
			item = recipes.get(0);
		}
		else if (recipeSize == recipes.size()) {
			item = recipes.get(recipes.size() - 1);
		}
		else {
			item = recipes.get(recipeSize);
		}

		if (item != null) {
			itemRender.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, new ItemStack(item), x, y);
		}
		else {
			String var4 = Info.guiPrefix + "Icons.png";
			mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,var4));
			drawTexturedModalRect(x, y, 0, 16, 16, 16);
		}
	}

	public void drawOverlays(int recipeSize, List<Item> recipes) {


		List<ItemStack> itemStacks = null;
		if (recipeSize == -1) {
			itemStacks = TierRecipeManager.getInstance().getTierRecipe(tier.Tier(), new ItemStack(recipes.get(recipes.size() - 1))).getInput();
		}
		else if (recipeSize == recipes.size()) {
			itemStacks = TierRecipeManager.getInstance().getTierRecipe(tier.Tier(), new ItemStack(recipes.get(0))).getInput();
		}
		else {
			itemStacks = TierRecipeManager.getInstance().getTierRecipe(tier.Tier(), new ItemStack(recipes.get(recipeSize))).getInput();
		}
		drawOverlays2(itemStacks.get(0), 25, 27);
		drawOverlays2(itemStacks.get(1), 43, 93);
		drawOverlays2(itemStacks.get(2), 79, 93);
		drawOverlays2(itemStacks.get(3), 145, 93);
		drawOverlays2(itemStacks.get(4), 79, 27);
		drawOverlays2(itemStacks.get(5), 115, 27);
		drawOverlays2(itemStacks.get(6), 79, 61);
		drawOverlays2(itemStacks.get(7), 115, 61);
		drawOverlays2(itemStacks.get(8), 25, 61);
		drawOverlays2(itemStacks.get(9), 145, 27);
	}

	public void drawOverlays2(ItemStack item, int x, int y) {
		int j = (width - xSize) / 2;
		int k = (height - ySize) / 2;

		if (item != null) {
			String var4 = tier.getGUITexture();
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.3F);
			mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,var4));
			GL11.glDisable(GL11.GL_LIGHTING);
			GL11.glDisable(GL11.GL_DEPTH_TEST);
			GL11.glEnable(GL11.GL_BLEND);
			GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_SRC_ALPHA);
			this.itemRender.renderItemIntoGUI(this.mc.fontRenderer, this.mc.renderEngine, item, j + x, k + y);
			GL11.glDisable(GL11.GL_BLEND);
			GL11.glEnable(GL11.GL_LIGHTING);
			GL11.glEnable(GL11.GL_DEPTH_TEST);
		}
	}
}