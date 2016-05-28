/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.recipes;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;
import train.common.core.interfaces.ITCRecipe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShapelessTrainRecipe implements ITCRecipe {
	/** Is the ItemStack that you get when craft the recipe. */
	private final ItemStack recipeOutput;

	/** Is a List of ItemStack that composes the recipe. */
	public final List recipeItems;

	public ShapelessTrainRecipe(ItemStack par1ItemStack, List par2List) {
		this.recipeOutput = par1ItemStack;
		this.recipeItems = par2List;
	}
	@Override
	public ItemStack getRecipeOutput() {
		return this.recipeOutput;
	}

	/**
	 * Used to check if a recipe matches current crafting inventory
	 */
	@Override
	public boolean matches(IInventory inventory, World world) {
		ArrayList var3 = new ArrayList(this.recipeItems);
		for (int i = 0; i < 9; i++) {
			ItemStack var6 = inventory.getStackInSlot(i);
			if (var6 != null) {
				boolean var7 = false;
				Iterator var8 = var3.iterator();
				while (var8.hasNext()) {
					ItemStack var9 = (ItemStack) var8.next();
					if (var6 == var9 && (var9.getItemDamage() == OreDictionary.WILDCARD_VALUE || var6.getItemDamage() == var9.getItemDamage()) /* && var6.stackSize == var9.stackSize */) {
						var7 = true;
						var3.remove(var9);
						break;
					}
				}
				if (!var7) {
					return false;
				}
			}
		}
		return var3.isEmpty();
	}

	/**
	 * Returns an Item that is the result of this recipe
	 */
	@Override
	public ItemStack getCraftingResult(IInventory inventory) {
		return this.recipeOutput.copy();
	}

	/**
	 * Returns the size of the recipe area
	 */
	@Override
	public int getRecipeSize() {
		return this.recipeItems.size();
	}
}
