/*package train.common.containers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IContainerListener;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import train.common.slots.SlotDistil;
import train.common.tile.TileEntityDistil;

public class ContainerDistil extends Container {

	private TileEntityDistil distil;
	private int cookTime;
	private int burnTime;
	private int itemBurnTime;

	public ContainerDistil(InventoryPlayer inventoryplayer, TileEntityDistil tileentitydistil) {
		cookTime = 0;
		burnTime = 0;
		itemBurnTime = 0;
		distil = tileentitydistil;
		addSlotToContainer(new Slot(tileentitydistil, 0, 56, 17));
		addSlotToContainer(new Slot(tileentitydistil, 1, 56, 53));
		addSlotToContainer(new Slot(tileentitydistil, 2, 123, 8));
		addSlotToContainer(new SlotDistil(inventoryplayer.player, tileentitydistil, 4, 123, 33));
		addSlotToContainer(new SlotDistil(inventoryplayer.player, tileentitydistil, 3, 116, 60));
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
	public void addListener(IContainerListener listener) {
		super.addListener(listener);
		listener.sendWindowProperty(this, 0, distil.distilCookTime);
		listener.sendWindowProperty(this, 1, distil.distilBurnTime);
		listener.sendWindowProperty(this, 2, distil.currentItemBurnTime);
	}
	
	@Override
	public void detectAndSendChanges() {
		super.detectAndSendChanges();
		for(IContainerListener listener : listeners){
			if(cookTime != distil.distilCookTime){
				listener.sendWindowProperty(this, 0, distil.distilCookTime);
			}
			if(burnTime != distil.distilBurnTime){
				listener.sendWindowProperty(this, 1, distil.distilBurnTime);
			}
			if(itemBurnTime != distil.currentItemBurnTime){
				listener.sendWindowProperty(this, 2, distil.currentItemBurnTime);
			}
		}
		cookTime = distil.distilCookTime;
		burnTime = distil.distilBurnTime;
		itemBurnTime = distil.currentItemBurnTime;
	}

	@Override
	public void updateProgressBar(int i, int j) {
		if (i == 0) {
			distil.distilCookTime = j;
		}
		if (i == 1) {
			distil.distilBurnTime = j;
		}
		if (i == 2) {
			distil.currentItemBurnTime = j;
		}
	}

	@Override
	public boolean canInteractWith(EntityPlayer entityplayer) {
		return distil.isUseableByPlayer(entityplayer);
	}

	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int i) {
		ItemStack itemstack = null;
		Slot slot = inventorySlots.get(i);
		if (slot != null && slot.getHasStack()) {
			ItemStack itemstack1 = slot.getStack();
			itemstack = itemstack1.copy();
			if (i < 4) {
				if (!mergeItemStack(itemstack1, 4, inventorySlots.size(), true)) {
					return ItemStack.EMPTY;
				}
			}
			else if (!mergeItemStack(itemstack1, 0, 3, false)) {
				return ItemStack.EMPTY;
			}
			if (itemstack1.getCount() == 0) {
				slot.putStack(ItemStack.EMPTY);
			}
			else {
				slot.onSlotChanged();
			}
		}
		return itemstack;
	}
}
*/