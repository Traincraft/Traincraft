/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.api.crafting;

import net.minecraft.item.ItemStack;

import java.util.List;

public interface ITierRecipe {

	public abstract int getTier();

	public abstract ItemStack getOutput();

	@SuppressWarnings("rawtypes")
	public abstract List<ItemStack> getInput();

	public abstract int toDecrease(int slot);
}
