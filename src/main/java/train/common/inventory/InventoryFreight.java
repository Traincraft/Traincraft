package train.common.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import train.common.api.Freight;
import train.common.slots.SlotFreight;

public class InventoryFreight extends Container {

	private Freight freight;
	private int height;
	private IInventory inv;

	public InventoryFreight(IInventory iinventory, Freight entityminecart) {
		freight = entityminecart;
		inv = iinventory;

		height = (freight.getSizeInventory() / 9);
		int i = (height - 4) * 18;
		for (int j = 0; j < height; j++) {
			for (int i1 = 0; i1 < 9; i1++) {
				addSlotToContainer(new SlotFreight(entityminecart, i1 + j * 9, 8 + i1 * 18, 18 + j * 18));
			}
		}
		for (int i1 = 0; i1 < 3; i1++) {
			for (int k1 = 0; k1 < 9; k1++) {
				addSlotToContainer(new Slot(iinventory, k1 + i1 * 9 + 9, 8 + k1 * 18, 103 + i1 * 18 + i));
			}
		}
		for (int j1 = 0; j1 < 9; j1++) {
			addSlotToContainer(new Slot(iinventory, j1, 8 + j1 * 18, 161 + i));
		}
	}

	@Override
	public boolean canInteractWith(EntityPlayer entityplayer) {
		return !freight.isDead;
	}

	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int i) {
		ItemStack itemstack = null;
		Slot slot = (Slot) inventorySlots.get(i);
		SlotFreight slot2 = (SlotFreight) this.getSlot(0);
		if (slot != null && slot.getHasStack()) {
			ItemStack itemstack1 = slot.getStack();
			itemstack = itemstack1.copy();
			if(slot2 != null && slot2.isItemValid(itemstack)) {
    			if (i < height * 9) {
    				if (!mergeItemStack(itemstack1, height * 9, inventorySlots.size(), true)) {
    					return null;
    				}
    			}
    			else if (!mergeItemStack(itemstack1, 0, height * 9, false)) {
    				return null;
    			}
    			if (itemstack1.stackSize == 0) {
    				slot.putStack(null);
    			}
    			else {
    				slot.onSlotChanged();
    			}
			}
			else {
				return null;
			}
		}
		return itemstack;
	}

	@Override
	protected boolean mergeItemStack(ItemStack par1ItemStack, int i, int j, boolean bool) {
		boolean var5 = false;
		int var6 = i;
		if (bool) {
			var6 = j - 1;
		}
		Slot var7;
		ItemStack var8;
		if (par1ItemStack.isStackable()) {
			while (par1ItemStack.stackSize > 0 && (!bool && var6 < j || bool && var6 >= i)) {
				var7 = (Slot) this.inventorySlots.get(var6);
				var8 = var7.getStack();
				if (var8 != null && var8.getItem() == par1ItemStack.getItem() && (!par1ItemStack.getHasSubtypes() || par1ItemStack.getItemDamage() == var8.getItemDamage()) && ItemStack.areItemStackTagsEqual(par1ItemStack, var8)) {
					int var9 = var8.stackSize + par1ItemStack.stackSize;
					int maxSize = par1ItemStack.getMaxStackSize();//default is item max stack size
					if (!bool) {//if items are transfered to the freight inventory, otherwise use normal max size
						if (par1ItemStack.getMaxStackSize() < inv.getInventoryStackLimit())
							maxSize = par1ItemStack.getMaxStackSize();//if maxStack size is lower than inventory's max then use maxStackSize of the item
						if (par1ItemStack.getMaxStackSize() >= inv.getInventoryStackLimit())
							maxSize = inv.getInventoryStackLimit();//otherwise use maxStackSize of the inventory
					}
					if (var9 <= par1ItemStack.getMaxStackSize() && var9 <= maxSize) {
						par1ItemStack.stackSize = 0;
						var8.stackSize = var9;
						var7.onSlotChanged();
						var5 = true;
					}

					else if (var8.stackSize < par1ItemStack.getMaxStackSize() && var8.stackSize < maxSize) {
						par1ItemStack.stackSize -= maxSize - var8.stackSize;//stackSize will be reduced by the maxSize - what's already in the slot
						var8.stackSize = maxSize;
						var7.onSlotChanged();
						var5 = true;
					}
				}
				if (bool) {
					--var6;
				}
				else {
					++var6;
				}
			}
		}
		if (par1ItemStack.stackSize > 0) {
			if (bool) {
				var6 = j - 1;
			}
			else {
				var6 = i;
			}
			while (!bool && var6 < j || bool && var6 >= i) {
				var7 = (Slot) this.inventorySlots.get(var6);
				var8 = var7.getStack();
				if (var8 == null) {
					int maxSize = par1ItemStack.getMaxStackSize();
					if (!bool) {//if items are transfered to freight inventory
						if (par1ItemStack.getMaxStackSize() < inv.getInventoryStackLimit())
							maxSize = par1ItemStack.getMaxStackSize();//if maxStack size is lower than inventory's max then use maxStackSize of the item
						if (par1ItemStack.getMaxStackSize() >= inv.getInventoryStackLimit())
							maxSize = inv.getInventoryStackLimit();//otherwise use maxStackSize of the inventory
					}
					ItemStack var9 = par1ItemStack.copy();//making a copy of the itemstack
					if (var9.stackSize <= maxSize) {
						var7.putStack(var9);
						var7.onSlotChanged();
						par1ItemStack.stackSize = 0;
						var5 = true;
						break;
					}
					else {
						par1ItemStack.stackSize = maxSize;//stackSize will be reduced to the maxSize to fit in
						var7.putStack(par1ItemStack.copy());//putting the stack
						par1ItemStack.stackSize = var9.stackSize -= maxSize;//Residue stays in invent(?)
						var7.onSlotChanged();
						var5 = true;
						break;
					}
				}
				if (bool) {
					--var6;
				}
				else {
					++var6;
				}
			}
		}
		return var5;
	}
}