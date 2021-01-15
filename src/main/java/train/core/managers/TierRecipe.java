/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.core.managers;

import net.minecraft.item.ItemStack;

import java.util.Arrays;
import java.util.List;

public class TierRecipe {

	private final int tier;
	private final ItemStack output;

	private final ItemStack[] stacks;

	public TierRecipe(int tier, ItemStack planks, ItemStack wheels,
			ItemStack frame, ItemStack coupler, ItemStack chimney,
			ItemStack cab, ItemStack boiler, ItemStack firebox,
			ItemStack additional, ItemStack dye, ItemStack output,
			int outputSize) {
		this.tier = tier;
		this.output = output;

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

	public int getTier() {
		return tier;
	}

	public ItemStack getOutput() {
		return output;
	}

	public List<ItemStack> getInput() {
		return Arrays.asList(stacks);
	}



}
