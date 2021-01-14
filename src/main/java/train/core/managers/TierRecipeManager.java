/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.core.managers;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class TierRecipeManager {

	private final List<TierRecipe> recipeList;
	private static TierRecipeManager instance = new TierRecipeManager();

	public TierRecipeManager() {
		recipeList = new ArrayList<TierRecipe>();
	}

	public static TierRecipeManager getInstance() {
		return instance;
	}

	public void addRecipe(int tier, ItemStack planks, ItemStack wheels,
			ItemStack frame, ItemStack coupler, ItemStack chimney,
			ItemStack cab, ItemStack boiler, ItemStack firebox,
			ItemStack additional, ItemStack dye, ItemStack output,
			int outputSize) {
		if ((tier > 0 && tier < 4) && outputSize > 0 && outputSize < 65) {
			addRecipeFinal(tier, planks, wheels, frame, coupler, chimney, cab,
					boiler, firebox, additional, dye, output, outputSize);
		} else {
			addRecipeFinal(1, planks, wheels, frame, coupler, chimney, cab,
					boiler, firebox, additional, dye, output, 1);
		}
	}

	public void addRecipeFinal(int tier, ItemStack planks, ItemStack wheels,
			ItemStack frame, ItemStack coupler, ItemStack chimney,
			ItemStack cab, ItemStack boiler, ItemStack firebox,
			ItemStack additional, ItemStack dye, ItemStack output,
			int outputSize) {
		recipeList.add(new TierRecipe(tier, planks, wheels, frame, coupler,
				chimney, cab, boiler, firebox, additional, dye, output,
				outputSize));
	}

	public TierRecipe getTierRecipe(int tier, ItemStack output) {
		if(output == null) {
			return null;
		}
		for(TierRecipe recipe: recipeList) {
			if(Item.getIdFromItem(recipe.getOutput().getItem()) == Item.getIdFromItem(output.getItem()) &&
				recipe.getTier() == tier) {
				return recipe;
			}
		}
		return null;
	}

	public List<TierRecipe> getRecipeList() {
		return new ArrayList<TierRecipe>(this.recipeList);
	}

	public List<TierRecipe> getTierRecipeList(int tier) {
		List<TierRecipe> list = new ArrayList<TierRecipe>();
		for (TierRecipe recipe: recipeList) {
			if (recipe.getTier() == tier) {
				list.add(recipe);
			}
		}
		return list;
	}

}
