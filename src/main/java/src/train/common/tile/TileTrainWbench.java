/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package src.train.common.tile;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.packet.Packet;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;
import src.train.common.core.handlers.PacketHandler;

public class TileTrainWbench extends TileEntity implements IInventory {

	private ItemStack[] workbenchItemStacks;
	private ForgeDirection facing;
	private int noPlayers;

	public TileTrainWbench() {
		workbenchItemStacks = new ItemStack[9];
	}

	@Override
	public int getSizeInventory() {
		return this.workbenchItemStacks.length;
	}

	@Override
	public ItemStack getStackInSlot(int i) {
		return this.workbenchItemStacks[i];
	}

	@Override
	public ItemStack decrStackSize(int i, int j) {
		if (workbenchItemStacks[i] != null) {
			if (workbenchItemStacks[i].stackSize <= j) {
				ItemStack itemstack = workbenchItemStacks[i];
				workbenchItemStacks[i] = null;
				return itemstack;
			}
			ItemStack itemstack1 = workbenchItemStacks[i].splitStack(j);
			if (workbenchItemStacks[i].stackSize == 0) {
				workbenchItemStacks[i] = null;
			}
			return itemstack1;
		}
		else {
			return null;
		}
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int i) {
		if (this.workbenchItemStacks[i] != null) {
			ItemStack stack = this.workbenchItemStacks[i];
			this.workbenchItemStacks[i] = null;
			return stack;
		}
		else {
			return null;
		}
	}

	@Override
	public void setInventorySlotContents(int i, ItemStack stack) {
		workbenchItemStacks[i] = stack;
		if (stack != null && stack.stackSize > getInventoryStackLimit()) {
			stack.stackSize = getInventoryStackLimit();
		}
	}

	@Override
	public void readFromNBT(NBTTagCompound nbtTag) {
		super.readFromNBT(nbtTag);
		facing = ForgeDirection.getOrientation(nbtTag.getByte("Orientation"));
		NBTTagList tagList = nbtTag.getTagList("Items");
		workbenchItemStacks = new ItemStack[getSizeInventory()];
		for (int i = 0; i < tagList.tagCount(); ++i) {
			NBTTagCompound tagCompound = (NBTTagCompound) tagList.tagAt(i);
			byte slot = tagCompound.getByte("Slot");
			if (slot >= 0 && slot < workbenchItemStacks.length) {
				workbenchItemStacks[slot] = ItemStack.loadItemStackFromNBT(tagCompound);
			}
		}
	}

	@Override
	public void writeToNBT(NBTTagCompound nbtTag) {
		super.writeToNBT(nbtTag);
		if(facing!=null){
			nbtTag.setByte("Orientation", (byte) facing.ordinal());
		}else{
			nbtTag.setByte("Orientation", (byte) ForgeDirection.NORTH.ordinal());
		}
		NBTTagList tagList = new NBTTagList();
		for (int i = 0; i < workbenchItemStacks.length; ++i) {
			if (workbenchItemStacks[i] != null) {
				NBTTagCompound tagCompound = new NBTTagCompound();
				tagCompound.setByte("Slot", (byte) i);
				workbenchItemStacks[i].writeToNBT(tagCompound);
				tagList.appendTag(tagCompound);
			}
		}
		nbtTag.setTag("Items", tagList);
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@Override
	public void onInventoryChanged() {
		super.onInventoryChanged();
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer player) {
		if (worldObj == null) {
			return true;
		}
		if (worldObj.getBlockTileEntity(xCoord, yCoord, zCoord) != this) {
			return false;
		}
		return player.getDistanceSq(xCoord + 0.5D, yCoord + 0.5D, zCoord + 0.5D) <= 64D;
	}

	public ForgeDirection getFacing() {
		if(facing!=null)return this.facing;
		return ForgeDirection.NORTH;
	}

	public void setFacing(ForgeDirection face) {
		this.facing = face;
	}

	@Override
	public String getInvName() {
		return "TrainWorkbench";
	}

	@Override
	public void openChest() {}

	@Override
	public void closeChest() {}

	@Override
	public Packet getDescriptionPacket() {
		return PacketHandler.getTEPClient(this);
	}

	public void handlePacketDataFromServer(byte orientation) {
		facing = ForgeDirection.getOrientation(orientation);
	}

	@Override
	public boolean isInvNameLocalized() {
		return false;
	}

	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack) {
		return true;
	}
	
	@Override
	public void updateEntity() {
		super.updateEntity();
	}
}