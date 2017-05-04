/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.core.interfaces;

import net.minecraft.item.ItemStack;

import java.util.List;

public abstract interface ITier {

	public abstract int Tier();

	public abstract List<ItemStack> knownRecipes();

	public abstract int[] getSlotSelected();

	public abstract void setSlotSelected(int[] selected);

	public abstract List<ItemStack> getResultList();

	public abstract String getGUIName();

	public abstract String getGUITexture();
}
