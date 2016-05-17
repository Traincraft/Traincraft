/*******************************************************************************
 * Copyright (c) 2014 Mrbrutal. All rights reserved.
 *
 * @name Traincraft
 * @author Mrbrutal
 ******************************************************************************/

package src.train.common.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import src.train.common.Traincraft;
import src.train.common.library.ItemIDs;

public class ItemContainer extends ItemPart {

	public ItemContainer(String itemName){
		super(itemName);
		this.setMaxStackSize(64);
		this.setCreativeTab(Traincraft.tcTab);
	}

	@Override
	public Item getContainerItem() {
		return ItemIDs.emptyCanister.item;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemStack) {
		return new ItemStack(ItemIDs.emptyCanister.item);
	}

}
