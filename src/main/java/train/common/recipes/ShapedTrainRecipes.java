/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.recipes;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;
import train.common.core.interfaces.ITCRecipe;
import train.common.core.util.TraincraftUtil;

public class ShapedTrainRecipes implements ITCRecipe {
	/** How many horizontal slots this recipe is wide. */
	public final int recipeWidth;

	/** How many vertical slots this recipe uses. */
	public final int recipeHeight;

	/** Is a array of ItemStack that composes the recipe. */
	public final ItemStack[] recipeItems;

	/** Is a array of ItemStack that composes the recipe. */
	public boolean[] slots;

	/** Is the ItemStack that you get when craft the recipe. */
	private ItemStack recipeOutput;

	/** Is the itemID of the output item that you get when craft the recipe. */
	public final int recipeOutputItemID;
	private boolean field_92049_f = false;

	public ShapedTrainRecipes(int par1, int par2, ItemStack[] stacks, ItemStack stack) {
		recipeOutputItemID = Item.getIdFromItem(stack.getItem());
		recipeWidth = par1;
		recipeHeight = par2;
		recipeItems = stacks;
		recipeOutput = stack;
		slots = new boolean[9];
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
		for (int i = 0; i < slots.length; i++) {
			//System.out.print(slots[i] + " ");
			slots[i] = false;
		}
		//System.out.println();

		checkMatch(inventory, true);

		for (int i = 0; i < slots.length; i++) {
			if (!slots[i]) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Checks if the region of a crafting inventory is match for the recipe.
	 */
	private boolean checkMatch(IInventory inventory, boolean par4) {
		for (int i = 0; i < 9/* recipeItems.length */; i++) {
			ItemStack var9 = recipeItems[i];
			ItemStack var10 = inventory.getStackInSlot(i);

			if (var10 != null || var9 != null) {
				if (var10 == null || var9 == null) {
					//System.out.println(var9.getDisplayName() + " : " + var10.getDisplayName());
					slots[i] = false;
					continue;
				}
				if(!TraincraftUtil.itemStackMatches(var9, var10) || var9.stackSize > var10.stackSize ){
					slots[i] = false;
					continue;
				}
				if (var9.getItemDamage() != OreDictionary.WILDCARD_VALUE && var9.getItemDamage() != var10.getItemDamage()) {
					//System.out.println(var9.getDisplayName() + " : " + var10.getDisplayName());
					slots[i] = false;
					continue;
				}
				//System.out.println(recipeItems.length + ":" + var9.getDisplayName() + " : " + var10.getDisplayName());
				slots[i] = true;
			}
			else {
				slots[i] = true;
			}
		}
		return true;
	}

	/**
	 * Returns an Item that is the result of this recipe
	 */
	@Override
	public ItemStack getCraftingResult(IInventory inventory) {
		ItemStack var2 = getRecipeOutput().copy();

		if (field_92049_f) {
			for (int var3 = 0; var3 < inventory.getSizeInventory(); ++var3) {
				ItemStack var4 = inventory.getStackInSlot(var3);

				if (var4 != null && var4.hasTagCompound()) {
					var2.setTagCompound((NBTTagCompound) var4.stackTagCompound.copy());
				}
			}
		}
		return var2;
	}

	/**
	 * Returns the size of the recipe area
	 */
	@Override
	public int getRecipeSize() {
		return recipeWidth * recipeHeight;
	}

	public ShapedTrainRecipes func_92048_c() {
		field_92049_f = true;
		return this;
	}
}
