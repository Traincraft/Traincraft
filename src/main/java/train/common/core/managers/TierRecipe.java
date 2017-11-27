/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.core.managers;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import train.common.api.crafting.ITierRecipe;

import java.util.Arrays;
import java.util.List;

public class TierRecipe implements ITierRecipe {

	private final int tier;
	private final ItemStack output;
	private final int outputSize;

	private final ItemStack[] stacks;

	public TierRecipe(int tier, ItemStack planks, ItemStack wheels,
			ItemStack frame, ItemStack coupler, ItemStack chimney,
			ItemStack cab, ItemStack boiler, ItemStack firebox,
			ItemStack additional, ItemStack dye, ItemStack output,
			int outputSize) {
		this.tier = tier;
		this.output = output;
		this.outputSize = outputSize;

		stacks = new ItemStack[] {
			planks,
			wheels,
			frame,
			coupler,
			chimney,
			cab,
			boiler,
			firebox,
			additional,
			dye,
		};
	}

	@Override
	public int getTier() {
		return tier;
	}

	@Override
	public ItemStack getOutput() {
		return output;
	}

	@Override
	public List<ItemStack> getInput() {
		return Arrays.asList(stacks);
	}

	public ItemStack hasComponents(ItemStack... items) {
		for (int i = 0; i < stacks.length; i++) {
			if(!areItemsIdentical(items[i], stacks[i])) {
				return null;
			}
			if(!areSizesIdentical(items[i], stacks[i])) {
				return null;
			}
		}
		return output;
	}

	public static boolean areItemsIdentical(ItemStack inSlot, ItemStack inRecipe) {
		if (inRecipe == null || inSlot == null) {
			return inRecipe == inSlot;
		} else {
			if (Item.getIdFromItem(inSlot.getItem()) != Item.getIdFromItem(inRecipe.getItem())) {
				return false;
			}
			if (inRecipe.getItemDamage() == OreDictionary.WILDCARD_VALUE) {
				return true;
			}
			return inSlot.getItemDamage() == inRecipe.getItemDamage();
		}
	}

	public static boolean areSizesIdentical(ItemStack inSlot, ItemStack inRecipe) {
		if (inRecipe == null || inSlot == null) {
			return inRecipe == inSlot;
		}
		return inSlot.stackSize >= inRecipe.stackSize;
	}

	@Override
	public int toDecrease(int slot) {
		if (slot < stacks.length) {
			return stacks[slot].stackSize;
		}
		return 0;
	}
}
