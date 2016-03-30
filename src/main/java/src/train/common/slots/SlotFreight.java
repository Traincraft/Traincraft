/*******************************************************************************
 * Copyright (c) 2013 Mrbrutal. All rights reserved.
 * 
 * @name Traincraft
 * @author Mrbrutal
 ******************************************************************************/

package src.train.common.slots;

import src.train.common.api.Freight;
import src.train.common.core.handlers.ItemHandler;
import src.train.common.entity.rollingStock.EntityBoxCartUS;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SlotFreight extends Slot {
	
	public static Freight freight;
	public static IInventory inventory;

	public SlotFreight(IInventory inventory, int par2, int par3, int par4) {
		super(inventory, par2, par3, par4);
		this.freight = (Freight) inventory;
		this.inventory = (IInventory) inventory;
	}
	
	@Override
	public boolean isItemValid(ItemStack stack) {
		if(stack != null) {
    		return ItemHandler.handleFreight((Entity)freight, stack);
		}
		return false;
	}
}
