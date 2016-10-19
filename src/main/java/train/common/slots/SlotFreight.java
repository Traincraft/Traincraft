/*******************************************************************************
 * Copyright (c) 2013 Mrbrutal. All rights reserved.
 * 
 * @name Traincraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.slots;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import train.common.api.Freight;
import train.common.core.handlers.ItemHandler;

public class SlotFreight extends Slot {
	
	public static Freight freight;
	public static IInventory inventory;

	public SlotFreight(IInventory inventory, int par2, int par3, int par4) {
		super(inventory, par2, par3, par4);
		this.freight = (Freight) inventory;
		this.inventory = inventory;
	}
	
	@Override
	public boolean isItemValid(ItemStack stack) {
		return stack != null && ItemHandler.handleFreight(freight, stack);
	}
}
