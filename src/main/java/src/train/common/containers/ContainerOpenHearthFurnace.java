package src.train.common.containers;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import src.train.common.slots.SlotOpenHearthFurnace;
import src.train.common.tile.TileEntityOpenHearthFurnace;

public class ContainerOpenHearthFurnace extends Container {

	private TileEntityOpenHearthFurnace furnace;
	private int cookTime;
	private int burnTime;
	private int itemBurnTime;

	public ContainerOpenHearthFurnace(InventoryPlayer inventoryplayer, TileEntityOpenHearthFurnace tileentityFurnace) {
		cookTime = 0;
		burnTime = 0;
		itemBurnTime = 0;
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
	public void addCraftingToCrafters(ICrafting par1ICrafting) {
		super.addCraftingToCrafters(par1ICrafting);
		par1ICrafting.sendProgressBarUpdate(this, 0, furnace.furnaceCookTime);
		par1ICrafting.sendProgressBarUpdate(this, 1, furnace.furnaceBurnTime);
		par1ICrafting.sendProgressBarUpdate(this, 2, furnace.currentItemBurnTime);
	}

	/*
	 * @Override public void updateCraftingResults() { super.updateCraftingResults(); for (int i = 0; i < crafters.size(); i++) { ICrafting icrafting = (ICrafting) crafters.get(i); if (cookTime != furnace.furnaceCookTime) { icrafting.sendProgressBarUpdate(this, 0, furnace.furnaceCookTime); } if (burnTime != furnace.furnaceBurnTime) { icrafting.sendProgressBarUpdate(this, 1, furnace.furnaceBurnTime); } if (itemBurnTime != furnace.currentItemBurnTime) { icrafting.sendProgressBarUpdate(this, 2, furnace.currentItemBurnTime); } } cookTime = furnace.furnaceCookTime; burnTime = furnace.furnaceBurnTime; itemBurnTime = furnace.currentItemBurnTime; } */

	@Override
	public void detectAndSendChanges() {
		super.detectAndSendChanges();
		for (int i = 0; i < crafters.size(); i++) {
			ICrafting icrafting = (ICrafting) crafters.get(i);
			if (cookTime != furnace.furnaceCookTime) {
				icrafting.sendProgressBarUpdate(this, 0, furnace.furnaceCookTime);
			}
			if (burnTime != furnace.furnaceBurnTime) {
				icrafting.sendProgressBarUpdate(this, 1, furnace.furnaceBurnTime);
			}
			if (itemBurnTime != furnace.currentItemBurnTime) {
				icrafting.sendProgressBarUpdate(this, 2, furnace.currentItemBurnTime);
			}
		}
		cookTime = furnace.furnaceCookTime;
		burnTime = furnace.furnaceBurnTime;
		itemBurnTime = furnace.currentItemBurnTime;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void updateProgressBar(int i, int j) {
		if (i == 0) {
			furnace.furnaceCookTime = j;
		}
		if (i == 1) {
			furnace.furnaceBurnTime = j;
		}
		if (i == 2) {
			furnace.currentItemBurnTime = j;
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
