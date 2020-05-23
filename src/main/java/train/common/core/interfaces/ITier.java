/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.core.interfaces;

import java.util.List;

import net.minecraft.item.Item;

public abstract interface ITier {

	public abstract int Tier();

	public abstract List<Item> knownRecipes();

	public abstract int[] getSlotSelected();

	public abstract void setSlotSelected(int[] selected);

	public abstract List<Item> getResultList();

	public abstract String getGUIName();

	public abstract String getGUITexture();
}
