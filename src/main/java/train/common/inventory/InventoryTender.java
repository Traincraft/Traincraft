package train.common.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import train.common.api.EntityRollingStock;
import train.common.api.Tender;
import train.common.slots.SlotTender;

public class InventoryTender extends Container {

	private Tender loco;
	private InventoryPlayer player;
	private int inventorySize;

	public InventoryTender(InventoryPlayer iinventory, EntityRollingStock entityminecart) {
		player = iinventory;
		loco = (Tender) entityminecart;
		inventorySize = loco.tenderItems.length;
		int i = 1;
		int numCargoSlots = 5;
		addSlotToContainer(new Slot((IInventory) entityminecart, 0, 8, 53));

		for (int j = 0; j < numCargoSlots; j++) {
			addSlotToContainer(new SlotTender((IInventory) entityminecart, i, 44 + j * 18, 18));
			i++;
		}
		for (int k = 0; k < numCargoSlots; k++) {
			addSlotToContainer(new SlotTender((IInventory) entityminecart, i, 44 + k * 18, 36));
			i++;
		}
		for (int l = 0; l < numCargoSlots; l++) {
			addSlotToContainer(new SlotTender((IInventory) entityminecart, i, 44 + l * 18, 54));
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

	@Override
	public boolean canInteractWith(EntityPlayer var1) {
		return !loco.isDead;
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
			else {
				if (!mergeItemStack(itemstack1, 0, inventorySize, false)) {
					return null;
				}
			}
			if (itemstack1.stackSize == 0) {

				slot.putStack(null);
				if (i < inventorySize) {
					loco.tenderItems[i] = null;
				}
			}
			else {

				slot.onSlotChanged();
			}
		}
		return itemstack;
	}
}