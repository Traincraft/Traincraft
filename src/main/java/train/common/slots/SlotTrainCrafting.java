/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.slots;

import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerDestroyItemEvent;

public class SlotTrainCrafting extends Slot {
	/** The craft matrix inventory linked to this result slot. */
	private final IInventory craftMatrix;

	/** The player that is using the GUI where this slot resides. */
	private EntityPlayer thePlayer;

	/**
	 * The number of items that have been crafted so far. Gets passed to ItemStack.onCrafting before being reset.
	 */
	private int amountCrafted;

	public SlotTrainCrafting(EntityPlayer par1EntityPlayer, IInventory par2IInventory, IInventory par3IInventory, int par4, int par5, int par6) {
		super(par3IInventory, par4, par5, par6);
		this.thePlayer = par1EntityPlayer;
		this.craftMatrix = par2IInventory;
	}

	/**
	 * Check if the stack is a valid item for this slot. Always true beside for the armor slots.
	 */
	@Override
	public boolean isItemValid(ItemStack par1ItemStack) {
		return false;
	}

	/**
	 * Decrease the size of the stack in slot (first int arg) by the amount of the second int arg. Returns the new stack.
	 */
	@Override
	public ItemStack decrStackSize(int par1) {
		if (this.getHasStack()) {
			this.amountCrafted += Math.min(par1, this.getStack().stackSize);
		}
		return super.decrStackSize(par1);
	}
	@Override
	public void onPickupFromSlot(EntityPlayer par1EntityPlayer, ItemStack par2ItemStack)
	{
		FMLCommonHandler.instance().firePlayerCraftingEvent(par1EntityPlayer, par2ItemStack, craftMatrix);
		this.onCrafting(par2ItemStack);
		for (int var3 = 0; var3 < this.craftMatrix.getSizeInventory(); ++var3) {
			ItemStack var4 = this.craftMatrix.getStackInSlot(var3);
			if (var4 != null) {
				this.craftMatrix.decrStackSize(var3, 1);
				if (var4.getItem().hasContainerItem()) {
					ItemStack var5 = var4.getItem().getContainerItem(var4);
					if (var5.isItemStackDamageable() && var5.getItemDamage() > var5.getMaxDamage()) {
						MinecraftForge.EVENT_BUS.post(new PlayerDestroyItemEvent(thePlayer, var5));
						var5 = null;
					}
					if (var5 != null && (!var4.getItem().doesContainerItemLeaveCraftingGrid(var4) || !this.thePlayer.inventory.addItemStackToInventory(var5))) {
						if (this.craftMatrix.getStackInSlot(var3) == null) {
							this.craftMatrix.setInventorySlotContents(var3, var5);
						}
						else {
							this.thePlayer.dropItem(var5.getItem(), 1);
						}
					}
				}
			}
		}
	}

	@Override
	public void onSlotChanged() {
		inventory.markDirty();
	}
}