package train.common.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import train.common.entity.digger.EntityRotativeDigger;

public class InventoryRotativeDigger extends Container {

	private EntityRotativeDigger digger;
	private InventoryPlayer player;
	private int inventorySize;

	public InventoryRotativeDigger(InventoryPlayer iinventory, EntityRotativeDigger entityzepp) {
		inventorySize = 10;
		player = iinventory;
		digger = entityzepp;
		addSlotToContainer(new Slot(entityzepp, 0, 8, 53));
		int i = 1;
		for (int j = 0; j < digger.numCargoSlots; j++) {
			addSlotToContainer(new Slot(entityzepp, i, 80 + j * 18, 18));
			i++;
		}

		for (int k = 0; k < digger.numCargoSlots1; k++) {
			addSlotToContainer(new Slot(entityzepp, i, 80 + k * 18, 36));
			i++;
		}

		for (int l = 0; l < digger.numCargoSlots2; l++) {
			addSlotToContainer(new Slot(entityzepp, i, 80 + l * 18, 54));
			i++;
		}

		for (int i1 = 0; i1 < 3; i1++) {
			for (int k1 = 0; k1 < 9; k1++) {
				addSlotToContainer(new Slot(iinventory, k1 + i1 * 9 + 9, 8 + k1 * 18, 84 + i1 * 18));
			}
		}

		for (int j1 = 0; j1 < 9; j1++) {
			addSlotToContainer(new Slot(iinventory, j1, 8 + j1 * 18, 142));
		}

	}

	public boolean isUsableByPlayer(EntityPlayer entityplayer) {
		// return zepp.canInteractWith(entityplayer);
		return true;
	}
	@Override
	public boolean canInteractWith(EntityPlayer entityplayer) {
		return true;
	}

	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int i) {
		ItemStack itemstack = null;
		Slot slot = (Slot) inventorySlots.get(i);
		if (slot != null && slot.getHasStack()) {
			ItemStack itemstack1 = slot.getStack();
			itemstack = itemstack1.copy();
			if (i < inventorySize) {
				if (!mergeItemStack(itemstack1, inventorySize, inventorySlots.size(), true)) {
					return null;
				}
			}
			else if (!mergeItemStack(itemstack1, 0, inventorySize, false)) {
				return null;
			}
			if (itemstack1.stackSize == 0) {
				slot.putStack(null);
			}
			else {
				slot.onSlotChanged();
			}
		}
		return itemstack;
	}
}