/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package src.train.client.gui.sideTabs;

import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import src.train.client.gui.GuiCrafterTier;
import src.train.common.library.Info;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class SideTabRecipes extends SideTab {

	protected int headerColour = 0xbd9700;
	protected int subheaderColour = 0xaaafb8;
	protected int textColour = 0xffffff;
	protected GuiCrafterTier gui;
	int check = 0;
	boolean drawing;
	
	public SideTabRecipes(GuiCrafterTier gui, boolean side, boolean x, boolean y) {
		super(gui, side, x, y);
		this.gui = (GuiCrafterTier) gui;
		maxHeight = 94;
		overlayColor = 0x757f90;
	}

	@Override
	public void draw(int x, int y) {
		// Draw background
		drawBackground(x, y);

		// Draw icon
		drawIcon(Info.guiPrefix + "Icons.png", 1, x + 4, y + 4);

		if (!isFullyOpened()){
			gui.isTabRecipeOpen=false;
			return;
		}
		gui.isTabRecipeOpen=true;

		fontRenderer.drawString("Known recipes:", x - 69, y + 8, 0x000000);
		fontRenderer.drawString("Known recipes:", x - 70, y + 8, headerColour);

		//293240
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.guiPrefix + "Icons.png"));

		gui.drawRect(x - 59, y + 30, -40, 85, 0xff293240);
		gui.drawRect(x - 58, y + 29, -41, 86, 0xff293240);

		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		gui.drawTexturedModalRect(x - 76, y + 34, 0, 64, 16, 16);
		gui.drawTexturedModalRect(x - 16, y + 34, 16, 64, 16, 16);

		gui.drawTexturedModalRect(x - 76, y + 58, 32, 64, 32, 16);
		gui.drawTexturedModalRect(x - 32, y + 58, 64, 64, 32, 16);

		if (gui.recipes.size() == 0) {
			fontRenderer.drawString("No recipes found", x - 93, y + 78, headerColour);
			FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.guiPrefix + "Icons.png"));
			gui.drawTexturedModalRect(x - 46, y + 33, 0, 16, 16, 16);
			gui.currentKnownItem=null;
		}
		else {
			ItemStack item = null;
			if (gui.recipeSize == -1) {
				item = gui.recipes.get(0);
			}
			else if (gui.recipeSize == gui.recipes.size() && gui.recipeSize != 0) {
				item = gui.recipes.get(gui.recipes.size() - 1);
			}
			else if (gui.recipeSize > gui.recipes.size()) {
				item = gui.recipes.get(gui.recipeSize - 1);
			}
			else {
				item = gui.recipes.get(gui.recipeSize);
			}

			if (item != null) {
				fontRenderer.drawString(item.getDisplayName(), x - 93, y + 78, headerColour);
				gui.currentKnownItem = item;
			}
			else {
				fontRenderer.drawString("Item name not found", x - 93, y + 78, headerColour);
			}

			if (this.isFullyOpened()) {
				gui.drawRecipes(gui.recipeSize, gui.recipes, x - 46, y + 33);
			}
		}
	}

	@Override
	public boolean handleMouseClicked(int x, int y, int mouseButton) {
		x -= this.currentShiftX;
		y -= this.currentShiftY;

		if (!isFullyOpened()) {
			return false;
		}
		else {
			if ((x > -98 && x < -88) && (y < 49 && y > 33)) {
				soundManager.playSound(PositionedSoundRecord.func_147673_a(new ResourceLocation("random.click")));
				gui.recipeSize--;
				return true;
			}
			else if ((x > -36 && x < -10) && (y < 49 && y > 33)) {
				soundManager.playSound(PositionedSoundRecord.func_147673_a(new ResourceLocation("random.click")));
				gui.recipeSize++;
				return true;
			}
			else if ((x > -98 && x < -71) && (y < 71 && y > 61)) {
				soundManager.playSound(PositionedSoundRecord.func_147673_a(new ResourceLocation("random.click")));
				gui.isShow = true;
				gui.isClear = false;
				return true;
			}
			else if ((x > -54 && x < -26) && (y < 71 && y > 61)) {
				soundManager.playSound(PositionedSoundRecord.func_147673_a(new ResourceLocation("random.click")));
				gui.isClear = true;
				gui.isShow = false;
				return true;
			}
			else {
				return false;
			}
		}
	}

	@Override
	public String getTooltip() {
		return "Recipes (" + gui.tier1.knownRecipes().size() + ")";
	}
}
