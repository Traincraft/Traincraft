package train.common.containers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import train.common.slots.SlotOpenHearthFurnace;
import train.common.tile.TileEntityOpenHearthFurnace;

public class ContainerOpenHearthFurnace extends Container {

	private TileEntityOpenHearthFurnace furnace;

	public ContainerOpenHearthFurnace(InventoryPlayer inventoryplayer, TileEntityOpenHearthFurnace tileentityFurnace) {
		furnace = tileentityFurnace;
		addSlotToContainer(new Slot(tileentityFurnace, 0, 56, 17));
		addSlotToContainer(new Slot(tileentityFurnace, 1, 35, 17));
		addSlotToContainer(new Slot(tileentityFurnace, 2, 47, 53));//53
		addSlotToContainer(new SlotOpenHearthFurnace(inventoryplayer.player, tileentityFurnace, 3, 116, 35));
		for (int i = 0; i < 3; i++) {
			for (int k = 0; k < 9; k++) {
				addSlotToContainer(new Slot(inventoryplayer, k + i * 9 + 9, 8 + k * 18, 84 + i * 18));
			}
		}
		for (int j = 0; j < 9; j++) {
			addSlotToContainer(new Slot(inventoryplayer, j, 8 + j * 18, 142));
		}
	}

	@Override
	public boolean canInteractWith(EntityPlayer entityplayer) {
		return furnace.isUseableByPlayer(entityplayer);
	}

	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int i) {
		ItemStack itemstack = null;
		Slot slot = (Slot) inventorySlots.get(i);
		if (slot != null && slot.getHasStack()) {
			ItemStack itemstack1 = slot.getStack();
			itemstack = itemstack1.copy();
			if (i < 4) {//TODO probably have to set this to 3
				if (!mergeItemStack(itemstack1, 4, inventorySlots.size(), true)) {
					return null;
				}
			}
			else if (!mergeItemStack(itemstack1, 0, 4, false)) {
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
