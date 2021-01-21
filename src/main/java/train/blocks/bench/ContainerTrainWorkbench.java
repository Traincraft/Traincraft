package train.blocks.bench;

import ebf.tim.blocks.TileEntityStorage;
import ebf.tim.utility.TransportSlotManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerTrainWorkbench extends TransportSlotManager {

	public ContainerTrainWorkbench(InventoryPlayer invPlayer, TileEntityStorage te) {
		super(invPlayer,te);
	}

	@Override
	public void onCraftMatrixChanged(IInventory inv) {
		super.onCraftMatrixChanged(inv);
		((TileEntityStorage)hostInventory).getSlotIndexByID(400).setStack(TrainCraftingManager.getInstance().func_82787_a(hostInventory));
	}

	/*
	 * @Override public void updateCraftingResults() { super.updateCraftingResults(); craftResult.setInventorySlotContents(0, TrainCraftingManager.getInstance().func_82787_a(hostInventory, worldObj)); } */

	@Override
	public void detectAndSendChanges() {
		super.detectAndSendChanges();
		((TileEntityStorage)hostInventory).getSlotIndexByID(400).setStack(TrainCraftingManager.getInstance().func_82787_a(hostInventory));
	}

	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return hostInventory.isUseableByPlayer(player);
	}

	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int par1) {
		ItemStack var2 = null;
		Slot var3 = (Slot) this.inventorySlots.get(par1);

		if (var3 != null && var3.getHasStack()) {
			ItemStack var4 = var3.getStack();
			var2 = var4.copy();

			if (par1 == 0) {
				if (!this.mergeItemStack(var4, 10, 46, true)) {
					return null;
				}
				var3.onSlotChange(var4, var2);
			}
			else if (par1 >= 10 && par1 < 37) {
				if (!this.mergeItemStack(var4, 37, 46, false)) {
					return null;
				}
			}
			else if (par1 >= 37 && par1 < 46) {
				if (!this.mergeItemStack(var4, 10, 37, false)) {
					return null;
				}
			}
			else if (!this.mergeItemStack(var4, 10, 46, false)) {
				return null;
			}

			if (var4.stackSize == 0) {
				var3.putStack(null);
			}
			else {
				var3.onSlotChanged();
			}

			if (var4.stackSize == var2.stackSize) {
				return null;
			}
			var3.onPickupFromSlot(player, var4);
		}
		return var2;
	}
}
