/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.containers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;

public abstract class ContainerTraincraft extends Container {
	private int invSize;

	public ContainerTraincraft(int inventorySize) {
		this.invSize = inventorySize;
	}

	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int i) {
		return null;
	}

	public int getInventorySize() {
		return invSize;
	}
}
