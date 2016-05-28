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

	public abstract int getOutputSize();

	public abstract ItemStack getOutput();

	public abstract String getRecipeName();

	public abstract ItemStack getRecipeIn(int slot);

	public abstract List getInput();

	public abstract int toDecrease(int slot);
}
