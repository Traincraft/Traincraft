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
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import org.lwjgl.opengl.GL11;
import train.client.gui.GuiCrafterTier;
import train.common.library.Info;

import static net.minecraft.client.gui.Gui.drawRect;
import static train.client.gui.GuiCrafterTier.*;

@SideOnly(Side.CLIENT)
public class SideTabRecipes extends SideTab {

	protected int headerColour = 0xbd9700;
	protected GuiCrafterTier gui;
	
	public SideTabRecipes(GuiCrafterTier gui, boolean side, boolean x, boolean y) {
		super(gui, side, x, y);
		this.gui = gui;
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
			isTabRecipeOpen=false;
			return;
		}
		isTabRecipeOpen=true;

		fontRenderer.drawString("Known recipes:", x - 69, y + 8, 0x000000);
		fontRenderer.drawString("Known recipes:", x - 70, y + 8, headerColour);

		//293240
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.guiPrefix + "Icons.png"));

		drawRect(x - 59, y + 30, -40, 85, 0xff293240);
		drawRect(x - 58, y + 29, -41, 86, 0xff293240);

		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		gui.drawTexturedModalRect(x - 76, y + 34, 0, 64, 16, 16);
		gui.drawTexturedModalRect(x - 16, y + 34, 16, 64, 16, 16);

		gui.drawTexturedModalRect(x - 76, y + 58, 32, 64, 32, 16);
		gui.drawTexturedModalRect(x - 32, y + 58, 64, 64, 32, 16);

		if (recipes.size() == 0) {
			fontRenderer.drawString("No recipes found", x - 93, y + 78, headerColour);
			FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.guiPrefix + "Icons.png"));
			gui.drawTexturedModalRect(x - 46, y + 33, 0, 16, 16, 16);
			gui.currentKnownItem=null;
		}
		else {
			Item item = null;
			if (recipeSize == -1) {
				item = recipes.get(0);
			}
			else if (recipeSize == recipes.size() && recipeSize != 0) {
				item = recipes.get(recipes.size() - 1);
			}
			else if (recipeSize > recipes.size()) {
				item = recipes.get(recipeSize - 1);
			}
			else {
				item = recipes.get(recipeSize);
			}

			if (item != null) {
				fontRenderer.drawString(StatCollector.translateToLocal(item.getUnlocalizedName()), x - 93, y + 78, headerColour);
				gui.currentKnownItem = item;
			}
			else {
				fontRenderer.drawString("Item name not found", x - 93, y + 78, headerColour);
			}

			if (this.isFullyOpened()) {
				gui.drawRecipes(recipeSize, recipes, x - 46, y + 33);
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
				recipeSize--;
				return true;
			}
			else if ((x > -36 && x < -10) && (y < 49 && y > 33)) {
				soundManager.playSound(PositionedSoundRecord.func_147673_a(new ResourceLocation("random.click")));
				recipeSize++;
				return true;
			}
			else if ((x > -98 && x < -71) && (y < 71 && y > 61)) {
				soundManager.playSound(PositionedSoundRecord.func_147673_a(new ResourceLocation("random.click")));
				isShow = true;
				isClear = false;
				return true;
			}
			else if ((x > -54 && x < -26) && (y < 71 && y > 61)) {
				soundManager.playSound(PositionedSoundRecord.func_147673_a(new ResourceLocation("random.click")));
				isClear = true;
				isShow = false;
				return true;
			}
			else {
				return false;
			}
		}
	}

	@Override
	public String getTooltip() {
		return "Recipes (" + tier1.knownRecipes().size() + ")";
	}
}
