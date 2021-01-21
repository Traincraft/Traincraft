package train.blocks.distil;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.utility.TransportSlotManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.ICrafting;

public class ContainerDistil extends TransportSlotManager {

	private TileEntityDistil distil;
	private int cookTime;
	private int burnTime;
	private int itemBurnTime;

	public ContainerDistil(InventoryPlayer inventoryplayer, TileEntityDistil tileentitydistil) {
		super(inventoryplayer,tileentitydistil);
		cookTime = 0;
		burnTime = 0;
		itemBurnTime = 0;
		distil = tileentitydistil;
	}

	@Override
	public void addCraftingToCrafters(ICrafting par1ICrafting) {
		super.addCraftingToCrafters(par1ICrafting);
		par1ICrafting.sendProgressBarUpdate(this, 0, distil.distilCookTime);
		par1ICrafting.sendProgressBarUpdate(this, 1, distil.distilBurnTime);
		par1ICrafting.sendProgressBarUpdate(this, 2, distil.currentItemBurnTime);
	}

	/*
	 * @Override public void updateCraftingResults() { super.updateCraftingResults(); for (int i = 0; i < crafters.size(); i++) { ICrafting icrafting = (ICrafting) crafters.get(i); if (cookTime != distil.distilCookTime) { icrafting.sendProgressBarUpdate(this, 0, distil.distilCookTime); } if (burnTime != distil.distilBurnTime) { icrafting.sendProgressBarUpdate(this, 1, distil.distilBurnTime); } if (itemBurnTime != distil.currentItemBurnTime) { icrafting.sendProgressBarUpdate(this, 2, distil.currentItemBurnTime); } } cookTime = distil.distilCookTime; burnTime = distil.distilBurnTime; itemBurnTime = distil.currentItemBurnTime; } */

	@Override
	public void detectAndSendChanges() {
		super.detectAndSendChanges();

		if(distil==null){return;}
		for (Object crafter : crafters) {
			ICrafting icrafting = (ICrafting) crafter;
			if (cookTime != distil.distilCookTime) {
				icrafting.sendProgressBarUpdate(this, 0, distil.distilCookTime);
			}
			if (burnTime != distil.distilBurnTime) {
				icrafting.sendProgressBarUpdate(this, 1, distil.distilBurnTime);
			}
			if (itemBurnTime != distil.currentItemBurnTime) {
				icrafting.sendProgressBarUpdate(this, 2, distil.currentItemBurnTime);
			}
		}
		cookTime = distil.distilCookTime;
		burnTime = distil.distilBurnTime;
		itemBurnTime = distil.currentItemBurnTime;
	}

	@Override
	@SideOnly(Side.CLIENT)
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

	/*@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int i) {
		ItemStack itemstack = null;
		Slot slot = (Slot) inventorySlots.get(i);
		if (slot != null && slot.getHasStack()) {
			ItemStack itemstack1 = slot.getStack();
			itemstack = itemstack1.copy();
			if (i < 4) {
				if (!mergeItemStack(itemstack1, 4, inventorySlots.size(), true)) {
					return null;
				}
			}
			else if (!mergeItemStack(itemstack1, 0, 3, false)) {
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
	}*/
}
