package src.train.client.core.handlers;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.ItemStack;
import src.train.common.core.managers.TierRecipe;
import src.train.common.library.BlockIDs;
import src.train.common.library.ItemIDs;
import src.train.common.recipes.ShapedTrainRecipes;
import src.train.common.recipes.ShapelessTrainRecipe;

public class RecipeBookHandler {
	/**
	 * This is used to show if the recipe can also be crafted in vanilla workbench
	 */
	public static String[] vanillaWorkTableRecipes = new String[20];

	public RecipeBookHandler() {
		vanillaWorkTableRecipes[0] = BlockIDs.assemblyTableI.block.getUnlocalizedName();
		vanillaWorkTableRecipes[1] = BlockIDs.assemblyTableII.block.getUnlocalizedName();
		vanillaWorkTableRecipes[2] = BlockIDs.assemblyTableIII.block.getUnlocalizedName();
		vanillaWorkTableRecipes[3] = BlockIDs.distilIdle.block.getUnlocalizedName();
		vanillaWorkTableRecipes[4] = BlockIDs.openFurnaceIdle.block.getUnlocalizedName();
		vanillaWorkTableRecipes[5] = BlockIDs.trainWorkbench.block.getUnlocalizedName();
		vanillaWorkTableRecipes[6] = ItemIDs.overalls.item.getUnlocalizedName();
		vanillaWorkTableRecipes[7] = ItemIDs.jacket.item.getUnlocalizedName();
		vanillaWorkTableRecipes[8] = ItemIDs.hat.item.getUnlocalizedName();
		vanillaWorkTableRecipes[11] = ItemIDs.recipeBook.item.getUnlocalizedName();
		vanillaWorkTableRecipes[12] = BlockIDs.lantern.block.getUnlocalizedName();
		vanillaWorkTableRecipes[14] = ItemIDs.pants_driver_paintable.item.getUnlocalizedName();
		vanillaWorkTableRecipes[15] = ItemIDs.pants_ticketMan_paintable.item.getUnlocalizedName();
		vanillaWorkTableRecipes[16] = ItemIDs.hat_driver_paintable.item.getUnlocalizedName();
		vanillaWorkTableRecipes[17] = ItemIDs.hat_ticketMan_paintable.item.getUnlocalizedName();
		vanillaWorkTableRecipes[18] = ItemIDs.jacket_driver_paintable.item.getUnlocalizedName();
		vanillaWorkTableRecipes[19] = ItemIDs.jacket_ticketMan_paintable.item.getUnlocalizedName();
	}

	public static List workbenchListCleaner(List recipeList) {
		ArrayList outputList = new ArrayList();
		ArrayList cleanedList = new ArrayList();
		for (int i = 0; i < recipeList.size(); i++) {
			if (recipeList.get(i) instanceof ShapedTrainRecipes) {
				if (outputList != null) {
					if (!outputList.contains(((ShapedTrainRecipes) recipeList.get(i)).getRecipeOutput().getItem().itemID)) {
						cleanedList.add(recipeList.get(i));
					}
				}
				else {
					cleanedList.add(recipeList.get(i));
				}
				outputList.add(((ShapedTrainRecipes) recipeList.get(i)).getRecipeOutput().getItem().itemID);
			}
			if (recipeList.get(i) instanceof ShapelessTrainRecipe) {

				if (outputList != null) {
					if (!outputList.contains(((ShapelessTrainRecipe) recipeList.get(i)).getRecipeOutput().getItem().itemID)) {
						cleanedList.add(recipeList.get(i));
					}
				}
				else {
					cleanedList.add(recipeList.get(i));
				}
				outputList.add(((ShapelessTrainRecipe) recipeList.get(i)).getRecipeOutput().getItem().itemID);
			}
		}
		return cleanedList;
	}

	public static List assemblyListCleaner(List recipeList) {
		ArrayList outputList = new ArrayList();
		ArrayList cleanedList = new ArrayList();
		for (int i = 0; i < recipeList.size(); i++) {
			ItemStack output = ((TierRecipe) recipeList.get(i)).getOutput();
			if (outputList != null) {
				if (!outputList.contains(((TierRecipe) recipeList.get(i)).getOutput().getItem().itemID)) {
					cleanedList.add(recipeList.get(i));
				}
			}
			else {
				cleanedList.add(recipeList.get(i));
			}
			outputList.add(((TierRecipe) recipeList.get(i)).getOutput().getItem().itemID);
		}
		return cleanedList;
	}
}