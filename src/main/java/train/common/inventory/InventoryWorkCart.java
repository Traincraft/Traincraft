package train.common.inventory;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.*;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.tileentity.TileEntityFurnace;
import train.common.api.AbstractWorkCart;

public class InventoryWorkCart extends Container {
	private AbstractWorkCart furnace;
	private int lastCookTime = 0;
	private int lastBurnTime = 0;
	private int lastItemBurnTime = 0;

	public InventoryWorkCart(InventoryPlayer par1InventoryPlayer, Entity entity) {
		this.furnace = (AbstractWorkCart) entity;
		this.addSlotToContainer(new Slot((IInventory) entity, 0, 56, 17));
		this.addSlotToContainer(new Slot((IInventory) entity, 1, 56, 53));
		this.addSlotToContainer(new SlotFurnace(par1InventoryPlayer.player, (IInventory) entity, 2, 116, 35));
		int var3;

		for (var3 = 0; var3 < 3; ++var3) {
			for (int var4 = 0; var4 < 9; ++var4) {
				this.addSlotToContainer(new Slot(par1InventoryPlayer, var4 + var3 * 9 + 9, 8 + var4 * 18, 84 + var3 * 18));
			}
		}
		for (var3 = 0; var3 < 9; ++var3) {
			this.addSlotToContainer(new Slot(par1InventoryPlayer, var3, 8 + var3 * 18, 142));
		}
	}

	@Override
	public void addCraftingToCrafters(ICrafting par1ICrafting) {
		super.addCraftingToCrafters(par1ICrafting);
		par1ICrafting.sendProgressBarUpdate(this, 0, this.furnace.furnaceCookTime);
		par1ICrafting.sendProgressBarUpdate(this, 1, this.furnace.furnaceBurnTime);
		par1ICrafting.sendProgressBarUpdate(this, 2, this.furnace.currentItemBurnTime);
	}

	@Override
	public void detectAndSendChanges() {
		super.detectAndSendChanges();
		for (int var1 = 0; var1 < this.crafters.size(); ++var1) {
			ICrafting var2 = (ICrafting) this.crafters.get(var1);

			if (this.lastCookTime != this.furnace.furnaceCookTime) {
				var2.sendProgressBarUpdate(this, 0, this.furnace.furnaceCookTime);
			}

			if (this.lastBurnTime != this.furnace.furnaceBurnTime) {
				var2.sendProgressBarUpdate(this, 1, this.furnace.furnaceBurnTime);
			}

			if (this.lastItemBurnTime != this.furnace.currentItemBurnTime) {
				var2.sendProgressBarUpdate(this, 2, this.furnace.currentItemBurnTime);
			}
		}
		this.lastCookTime = this.furnace.furnaceCookTime;
		this.lastBurnTime = this.furnace.furnaceBurnTime;
		this.lastItemBurnTime = this.furnace.currentItemBurnTime;
	}

	@SideOnly(Side.CLIENT)
	public void updateProgressBar(int par1, int par2) {
		if (par1 == 0) {
			this.furnace.furnaceCookTime = par2;
		}
		if (par1 == 1) {
			this.furnace.furnaceBurnTime = par2;
		}
		if (par1 == 2) {
			this.furnace.currentItemBurnTime = par2;
		}
	}

	@Override
	public boolean canInteractWith(EntityPlayer par1EntityPlayer) {
		return !furnace.isDead;
	}

	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int par1) {
		ItemStack var3 = null;
		Slot var4 = (Slot) this.inventorySlots.get(par1);

		if (var4 != null && var4.getHasStack()) {
			ItemStack var5 = var4.getStack();
			var3 = var5.copy();

			if (par1 == 2) {
				if (!this.mergeItemStack(var5, 3, 39, true)) {
					return null;
				}

				var4.onSlotChange(var5, var3);
			}
			else if (par1 != 1 && par1 != 0) {
				if (FurnaceRecipes.smelting().getSmeltingResult(var5) != null) {
					if (!this.mergeItemStack(var5, 0, 1, false)) {
						return null;
					}
				}
				else if (TileEntityFurnace.isItemFuel(var5)) {
					if (!this.mergeItemStack(var5, 1, 2, false)) {
						return null;
					}
				}
				else if (par1 >= 3 && par1 < 30) {
					if (!this.mergeItemStack(var5, 30, 39, false)) {
						return null;
					}
				}
				else if (par1 >= 30 && par1 < 39 && !this.mergeItemStack(var5, 3, 30, false)) {
					return null;
				}
			}
			else if (!this.mergeItemStack(var5, 3, 39, false)) {
				return null;
			}
			if (var5.stackSize == 0) {
				var4.putStack(null);
			}
			else {
				var4.onSlotChanged();
			}
			if (var5.stackSize == var3.stackSize) {
				return null;
			}
			var4.onPickupFromSlot(player, var5);
		}

		return var3;
	}
}