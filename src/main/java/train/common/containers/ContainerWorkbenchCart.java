package train.common.containers;

import javax.annotation.Nonnull;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryCraftResult;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ContainerWorkbenchCart extends Container {
	/** The crafting matrix inventory (3x3). */
	public InventoryCrafting craftMatrix = new InventoryCrafting(this, 3, 3);
	public IInventory craftResult = new InventoryCraftResult();
	private World worldObj;

	public ContainerWorkbenchCart(InventoryPlayer par1InventoryPlayer, World par2World) {
		this.worldObj = par2World;

		this.addSlotToContainer(new SlotCrafting(par1InventoryPlayer.player, craftMatrix, craftResult, 0, 124, 35));
		int var6;
		int var7;

		for (var6 = 0; var6 < 3; ++var6) {
			for (var7 = 0; var7 < 3; ++var7) {
				this.addSlotToContainer(new Slot(craftMatrix, var7 + var6 * 3, 30 + var7 * 18, 17 + var6 * 18));
			}
		}

		for (var6 = 0; var6 < 3; ++var6) {
			for (var7 = 0; var7 < 9; ++var7) {
				this.addSlotToContainer(new Slot(par1InventoryPlayer, var7 + var6 * 9 + 9, 8 + var7 * 18, 84 + var6 * 18));
			}
		}

		for (var6 = 0; var6 < 9; ++var6) {
			this.addSlotToContainer(new Slot(par1InventoryPlayer, var6, 8 + var6 * 18, 142));
		}

		this.onCraftMatrixChanged(craftMatrix);
	}

	/**
	 * Callback for when the crafting matrix is changed.
	 */
	@Override
	public void onCraftMatrixChanged(IInventory par1IInventory) {
		// todo fix this this.craftResult.setInventorySlotContents(0, CraftingManager.getInstance().findMatchingRecipe(craftMatrix, worldObj));
	}

	/**
	 * Callback for when the crafting gui is closed.
	 */
	@Override
	public void onContainerClosed(@Nonnull EntityPlayer player) {
		super.onContainerClosed(player);

		if (!worldObj.isRemote) {
			for (int var2 = 0; var2 < 9; ++var2) {
				ItemStack var3 = craftMatrix.getStackInSlot(var2);

				if (!var3.isEmpty()) {
					player.dropItem(var3.getItem(), var3.getCount());
				}
			}
		}
	}
	@Override
	public boolean canInteractWith(@Nonnull EntityPlayer player) {
		return true;
	}

	/**
	 * Called to transfer a stack from one inventory to the other eg. when shift clicking.
	 */
	@Nonnull
	@Override
	public ItemStack transferStackInSlot(@Nonnull EntityPlayer player, int par1) {
		ItemStack var2 = ItemStack.EMPTY;
		Slot var3 = inventorySlots.get(par1);

		if (var3 != null && var3.getHasStack()) {
			ItemStack var4 = var3.getStack();
			var2 = var4.copy();

			if (par1 == 0) {
				if (!this.mergeItemStack(var4, 10, 46, true)) {
					return ItemStack.EMPTY;
				}

				var3.onSlotChange(var4, var2);
			}
			else if (par1 >= 10 && par1 < 37) {
				if (!this.mergeItemStack(var4, 37, 46, false)) {
					return ItemStack.EMPTY;
				}
			}
			else if (par1 >= 37 && par1 < 46) {
				if (!this.mergeItemStack(var4, 10, 37, false)) {
					return ItemStack.EMPTY;
				}
			}
			else if (!this.mergeItemStack(var4, 10, 46, false)) {
				return ItemStack.EMPTY;
			}

			if (var4.getCount() == 0) {
				var3.putStack(ItemStack.EMPTY);
			}
			else {
				var3.onSlotChanged();
			}

			if (var4.getCount() == var2.getCount()) {
				return ItemStack.EMPTY;
			}

			var3.onTake(player, var4);
		}

		return var2;
	}
}
