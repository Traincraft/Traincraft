package train.client.core.handlers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.minecraft.item.Item;
import train.common.core.interfaces.ITCRecipe;
import train.common.core.managers.TierRecipe;
import train.common.library.BlockIDs;
import train.common.library.ItemIDs;
import train.common.recipes.ShapedTrainRecipes;
import train.common.recipes.ShapelessTrainRecipe;

public class RecipeBookHandler {
	/**
	 * This is used to show if the recipe can also be crafted in vanilla workbench
	 */
	public static String[] vanillaWorkTableRecipes = new String[21];

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
		vanillaWorkTableRecipes[20] = BlockIDs.switchStand.block.getUnlocalizedName();
	}

	public static Map<Integer, List<ITCRecipe>> workbenchListCleaner(List<ITCRecipe> recipeList) {
		Map<Integer, List<ITCRecipe>> sortedRecipes = new LinkedHashMap<>();

		for (int i = 0; i < recipeList.size(); i++) {
			if (recipeList.get(i) != null) {
				ITCRecipe recipe = (ITCRecipe) recipeList.get(i);

				if (recipe instanceof ShapedTrainRecipes || recipe instanceof ShapelessTrainRecipe) {

					Item output = recipe.getRecipeOutput().getItem();
					int id = getOutputID(output);

					List<ITCRecipe> recipes = sortedRecipes.get(id);
					if (recipes == null) {
						recipes = new ArrayList<ITCRecipe>();
						sortedRecipes.put(id, recipes);
					}
					recipes.add(recipe);
				}
			}
		}
		return sortedRecipes;
	}

	private static int getOutputID(Item pOutputItem) {
		return Item.getIdFromItem(pOutputItem);
	}

	// TODO: Make it more generic: TierRecipe -> ITierRecipe
	public static Map<Integer, List<TierRecipe>> assemblyListCleaner(List recipeList) {
		Map<Integer, List<TierRecipe>> sortedRecipes = new LinkedHashMap<>();

		for (int i = 0; i < recipeList.size(); i++) {
			if (recipeList.get(i) instanceof TierRecipe) {
				TierRecipe tierRecipe = (TierRecipe) recipeList.get(i);

				Item output = tierRecipe.getOutput().getItem();
				int id = getOutputID(output);

				List<TierRecipe> recipes = sortedRecipes.get(id);
				if (recipes == null) {
					recipes = new ArrayList<TierRecipe>();
					sortedRecipes.put(id, recipes);
				}
				recipes.add(tierRecipe);
			}
		}
		return sortedRecipes;
	}
}