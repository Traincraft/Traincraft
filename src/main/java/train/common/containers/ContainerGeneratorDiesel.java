package train.common.containers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import train.common.tile.TileGeneratorDiesel;

public class ContainerGeneratorDiesel extends Container {

	private TileGeneratorDiesel generator;

	public ContainerGeneratorDiesel(InventoryPlayer inventoryplayer, TileGeneratorDiesel tile) {
		generator = tile;
		addSlotToContainer(new Slot(tile, 0, 56, 17));
		addSlotToContainer(new Slot(tile, 1, 56, 53));
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
		return generator.isUseableByPlayer(entityplayer);
	}

	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int i) {
		ItemStack itemstack = null;
		Slot slot = (Slot) inventorySlots.get(i);
		if (slot != null && slot.getHasStack()) {
			ItemStack itemstack1 = slot.getStack();
			itemstack = itemstack1.copy();
			if (i < 1) {
				if (!mergeItemStack(itemstack1, 1, inventorySlots.size(), true)) {
					return null;
				}
			}
			else if (!mergeItemStack(itemstack1, 1, 1, false)) {
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
