package train.common.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import train.common.api.EntityRollingStock;
import train.common.api.LiquidManager;
import train.common.api.LiquidTank;
import train.common.slots.SlotPickup;
import train.common.slots.SpecialSlots;

public class InventoryLiquid extends Container {

	private LiquidTank loco;
	private InventoryPlayer player;
	private int inventorySize;

	public InventoryLiquid(InventoryPlayer iinventory, EntityRollingStock entityminecart) {
		inventorySize = 2;
		player = iinventory;
		loco = (LiquidTank) entityminecart;

		addSlotToContainer(SpecialSlots.getInstance().new SlotLiquid((IInventory) entityminecart, 0, 8, 53));
		addSlotToContainer(new SlotPickup((IInventory) entityminecart, 1, 153, 53));

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
	public ItemStack transferStackInSlot(EntityPlayer player, int i) {
		ItemStack itemstack = null;
		Slot slot = (Slot) inventorySlots.get(i);
		if (slot != null && slot.getHasStack()) {
			ItemStack itemstack1 = slot.getStack();
			itemstack = itemstack1.copy();
			if (!LiquidManager.getInstance().isContainer(itemstack1))
				return null;

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

	@Override
	public boolean canInteractWith(EntityPlayer var1) {
		return !loco.isDead;
	}
}