/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.core.interfaces;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public interface ITCRecipe {
	/**
	 * Used to check if a recipe matches current crafting inventory
	 */
	boolean matches(IInventory var1, World var2);

	/**
	 * Returns an Item that is the result of this recipe
	 */
	ItemStack getCraftingResult(IInventory var1);

	/**
	 * Returns the size of the recipe area
	 */
	int getRecipeSize();

	ItemStack getRecipeOutput();
}
