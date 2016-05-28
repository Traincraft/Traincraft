/*******************************************************************************
 * Copyright (c) 2013 Spitfire4466. All rights reserved.
 *
 * @name TrainCraft
 * @author Spitfire4466
 ******************************************************************************/

package train.common.tile;

import cofh.api.energy.IEnergyProvider;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.*;
import train.common.api.LiquidManager;
import train.common.api.LiquidManager.StandardTank;
import train.common.core.util.Energy;

public class TileGeneratorDiesel extends Energy implements IFluidHandler, IEnergyProvider {
	private boolean powered = false;
	private int update;
	private ForgeDirection direction;
	private FluidTank theTank;
	private boolean producing =false;


	private int liquidItemIDClient;
	public int amountClient;

	public TileGeneratorDiesel() {
		super(2, "Diesel Generator", 60, 320, 80);
		super.setSides(new ForgeDirection[]{ForgeDirection.EAST, ForgeDirection.WEST, ForgeDirection.NORTH, ForgeDirection.SOUTH, ForgeDirection.UP, ForgeDirection.DOWN});
		direction = ForgeDirection.getOrientation(this.blockMetadata);
		this.theTank = LiquidManager.getInstance().new FilteredTank(30000, LiquidManager.getInstance().dieselFilter(), 1);
	}

	public int getFacing() {
		return direction.ordinal();
	}

	public void setFacing(int facing) {
		direction = ForgeDirection.getOrientation(facing);
	}


	public int getMaxEnergyOutput() {
		return 10;
	}

	@Override
	public void updateEntity() {
		if (!worldObj.isRemote) {
			this.update += 1;
				if (slots[0] != null && update % 8 ==0) {
					ItemStack result = LiquidManager.getInstance().processContainer(this, 0, theTank, slots[0], 0);
					if (result != null && placeInInvent(result, 1, false)) {
						placeInInvent(result, 1, true);
						amountClient = theTank.getFluidAmount();
					}
				}

				if (isPowered() && theTank.drain(100, false) != null && (amountClient >= 100) && update % 8 ==0) {
					theTank.drain(100, true);
					amountClient -= 100;
					//super.setIsRunning(true);
					//super.updateEntity();
					this.energy.receiveEnergy(20, false);
					//pushEnergy(worldObj, this.xCoord, this.yCoord, this.zCoord, ForgeDirection.);
					this.markDirty();
					this.syncTileEntity();
				} else if( theTank.drain(100, false) != null && 80 <= this.energy.getMaxEnergyStored() - this.energy.getEnergyStored()){
					//super.setIsRunning(false);
					//super.updateEntity();
					for(ForgeDirection side : ForgeDirection.VALID_DIRECTIONS){
						if (this.canConnectEnergy(side)){
							pushEnergy(worldObj, this.xCoord + side.offsetX, this.yCoord + side.offsetY, this.zCoord + side.offsetZ, side, this.energy);
						}
					}
				}

				if (isPowered()){
					this.setIsProducing(true);
				} else {
					this.setIsProducing(false);
				}

				//mark the entity dirty and sync it.
				this.markDirty();
				this.syncTileEntity();
			}

	}

	@Override
	public NBTTagCompound readFromNBT(NBTTagCompound nbtTag, boolean forSyncing) {
		super.readFromNBT(nbtTag, forSyncing);
		this.direction = ForgeDirection.getOrientation(nbtTag.getInteger("direction"));
		this.producing = nbtTag.getBoolean("isProducing");
		this.amountClient = nbtTag.getInteger("Amount");
		this.liquidItemIDClient = nbtTag.getInteger("LiquidID");
		this.theTank.readFromNBT(nbtTag);
		return nbtTag;
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound nbtTag, boolean forSyncing) {
		super.writeToNBT(nbtTag, forSyncing);
		nbtTag.setInteger("direction", direction.ordinal());
		nbtTag.setBoolean("isProducing", this.producing);
		nbtTag.setInteger("Amount", this.amountClient);
		nbtTag.setInteger("LiquidID", this.liquidItemIDClient);
		this.theTank.writeToNBT(nbtTag);
		return nbtTag;
	}

	public void setIsPowered(boolean power) {
		powered = power;
	}
	public boolean isPowered() {
		return powered;
	}
	/**
	 * used by the GUI
	 *
	 * @return
	 */
	@SideOnly(Side.CLIENT)
	public int getLiquid() {
		return (amountClient);
	}

	@SideOnly(Side.CLIENT)
	public FluidTank getTank() {
		return this.theTank;
	}



	public boolean isProducing() {
		return this.producing;
	}

	public void setIsProducing(boolean producing) {
		this.producing = producing;
	}


	public int getTankCapacity() {
		return theTank.getCapacity();
	}

	private boolean placeInInvent(ItemStack itemstack1, int i, boolean doAdd) {
		if (slots[i] == null) {
			if (doAdd) {
				slots[i] = itemstack1;
			}
			return true;
		} else if (slots[i] != null
				&& slots[i].getItem() == itemstack1.getItem()
				&& itemstack1.isStackable()
				&& (!itemstack1.getHasSubtypes() || slots[i]
				.getItemDamage() == itemstack1.getItemDamage())
				&& ItemStack.areItemStackTagsEqual(slots[i],
				itemstack1)) {
			int var9 = slots[i].stackSize + itemstack1.stackSize;
			if(doAdd) {
				if (var9 <= itemstack1.getMaxStackSize()) {
					slots[i].stackSize = var9;
				} else if (slots[i].stackSize < itemstack1.getMaxStackSize()) {
					slots[i].stackSize += 1;
				}
			}
			return true;
		}
		return false;

	}

	@Override
	public World getWorldObj() {
		return this.worldObj;
	}


	@Override
	public int fill(ForgeDirection from, FluidStack resource, boolean doFill) {
		return theTank.fill(resource, doFill);
	}

	@Override
	public FluidStack drain(ForgeDirection from, FluidStack resource, boolean doDrain) {
		if (resource == null || !resource.isFluidEqual(theTank.getFluid())) {
			return null;
		}
		return theTank.drain(resource.amount, doDrain);
	}

	@Override
	public FluidStack drain(ForgeDirection from, int maxDrain, boolean doDrain) {
		return theTank.drain(maxDrain, doDrain);
	}

	@Override
	public boolean canFill(ForgeDirection from, Fluid fluid) {
		return true;
	}

	@Override
	public boolean canDrain(ForgeDirection from, Fluid fluid) {
		return true;
	}

	@Override
	public FluidTankInfo[] getTankInfo(ForgeDirection from) {
		return new FluidTankInfo[] { theTank.getInfo() };
	}

}
