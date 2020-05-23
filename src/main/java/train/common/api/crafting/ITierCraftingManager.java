/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.api.crafting;

import java.util.List;

import net.minecraft.item.ItemStack;

public abstract interface ITierCraftingManager {

	public abstract void addRecipe(int tier, ItemStack planks, ItemStack wheels, ItemStack frame, ItemStack coupler, ItemStack chimney, ItemStack cab, ItemStack boiler, ItemStack firebox, ItemStack additional, ItemStack dye, ItemStack output, int outputSize);

	public abstract ITierRecipe getTierRecipe(int tier, ItemStack output);

	@SuppressWarnings("rawtypes")
	public abstract List getRecipeList();

	@SuppressWarnings("rawtypes")
	public abstract List getTierRecipeList(int tier);
}
