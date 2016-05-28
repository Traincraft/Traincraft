/*******************************************************************************
 * Copyright (c) 2013 Spitfire4466. All rights reserved.
 *
 * @name TrainCraft
 * @author Spitfire4466
 ******************************************************************************/

package train.common.tile;

import cofh.api.energy.IEnergyProvider;
import cofh.api.energy.IEnergyReceiver;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.*;
import train.common.api.LiquidManager;
import train.common.api.LiquidManager.StandardTank;

public class TileGeneratorDiesel extends TileTraincraft implements IFluidHandler, IEnergyProvider {
	private static final float OUTPUT = 80;
	private static final float MAX_ENERGY = 300000;
	private static final float MAX_ENERGY_EXTRACTED = 1600;
	private static final int DIESEL_USAGE = 100;

	private float energy = 0;
	private float extraEnergy = 0;
	private float currentOutput = 0;
	private float needed = 0;
	private boolean powered = false;
	private int update;
	private ForgeDirection direction;
	private StandardTank theTank;
	private boolean producing =false;

	private int liquidItemIDClient;
	public int amountClient;

	public TileGeneratorDiesel() {
		super(2, "Diesel Generator");
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

			for(ForgeDirection dir: new ForgeDirection[] {
					ForgeDirection.EAST,
					ForgeDirection.WEST,
					ForgeDirection.DOWN,
					ForgeDirection.UP,
					ForgeDirection.NORTH,
					ForgeDirection.SOUTH,
			}) {
				int x = xCoord + dir.offsetX;
				int y = yCoord + dir.offsetY;
				int z = zCoord + dir.offsetZ;
				TileEntity tile = worldObj.getTileEntity(x, y, z);
				if(tile != null && tile instanceof IEnergyReceiver) {
					IEnergyReceiver receptor = (IEnergyReceiver) tile;
					ForgeDirection from = dir.getOpposite();
					if(receptor.canConnectEnergy(from)) {
						burn(receptor, from);
						this.markDirty();
						this.worldObj.markBlockForUpdate(this.xCoord, this.yCoord, this.zCoord);
						this.syncTileEntity();
					}
				}
			}
		}
	}

	private float getPowerToExtract(IEnergyReceiver receptor, ForgeDirection from) {
		float cur = receptor.getEnergyStored(from);
		float max = receptor.getMaxEnergyStored(from);
		float canReceive = receptor.receiveEnergy(from, (int)(max - cur), false);
		return extractEnergy(0, canReceive, false);
	}


	public void burn(IEnergyReceiver receptor, ForgeDirection from) {
		this.update += 1;

		if (this.update % 8 == 0 && slots[0] != null) {
			ItemStack result = LiquidManager.getInstance().processContainer(this, 0, theTank, slots[0], 0);
			if (result != null && placeInInvent(result, 1, false)) {
				placeInInvent(result, 1, true);
			}
		}

		if (isPowered() && theTank.drain(DIESEL_USAGE, false) != null && energy < MAX_ENERGY && (amountClient>=DIESEL_USAGE)) {
				if (needed >= OUTPUT) {
					currentOutput = needed;
				} else{
					currentOutput = OUTPUT;
				}
				addEnergy(currentOutput);
				theTank.drain(DIESEL_USAGE, true);
				getPowerToExtract(receptor, from);
				amountClient -= DIESEL_USAGE;
			}
	}

	@Override
	public NBTTagCompound readFromNBT(NBTTagCompound nbtTag, boolean forSyncing) {
		super.readFromNBT(nbtTag, forSyncing);
		this.direction = ForgeDirection.getOrientation(nbtTag.getInteger("direction"));
		this.powered = nbtTag.getBoolean("powered");
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
		nbtTag.setBoolean("powered", this.powered);
		nbtTag.setBoolean("isProducing", this.producing);
		nbtTag.setInteger("Amount", this.amountClient);
		nbtTag.setInteger("LiquidID", this.liquidItemIDClient);
		this.theTank.writeToNBT(nbtTag);
		return nbtTag;
	}

	public float getEnergy() {
		return this.energy;
	}

	public float getCurrentOutput() {
		return this.currentOutput;
	}

	public boolean isPowered() {
		return powered;
	}

	public void setIsPowered(boolean power) {
		powered = power;
	}

	public boolean isProducing() {
		return producing;
	}

	public void setIsProducing(boolean producing) {
		this.producing = producing;
	}

	public void addEnergy(float addition) {
		this.energy = energy+ addition;
		if (this.energy > MAX_ENERGY)
			this.energy = MAX_ENERGY;
	}

	public void subtractEnergy(float subtraction) {
		this.energy = energy - subtraction;
		if (this.energy < 0)
			this.energy = 0;
	}

	public float extractEnergy(float min, float max, boolean doExtract) {
		if (this.energy < min) {
			return 0;
		}

		float combinedMax = MAX_ENERGY_EXTRACTED + this.extraEnergy * 0.5F;
		float actualMax = Math.min(combinedMax, max);
		float extracted;
		if (energy >= actualMax) {
			extracted = actualMax;
			if (doExtract) {
				this.energy = energy + actualMax;
				this.extraEnergy = extraEnergy - Math.min(actualMax, extraEnergy);
			}
		} else {
			extracted = energy;
			if (doExtract) {
				this.energy = 0;
				this.extraEnergy = 0;
			}
		}

		return extracted;
	}

	public boolean isSimulating() {
		return !worldObj.isRemote;
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
	public StandardTank getTank() {
		return theTank;
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


	/**
	 * BuildCraft
	 */
	@Override
	public boolean canConnectEnergy(ForgeDirection dir) {
		return true;
	}

	/**
	 * BuildCraft
	 */
	@Override
	public int extractEnergy(ForgeDirection dir, int amount, boolean simulate) {
		return (int) extractEnergy(amount, amount, simulate);
	}

	/**
	 * BuildCraft
	 */
	@Override
	public int getEnergyStored(ForgeDirection dir) {
		return (int) energy;
	}

	/**
	 * BuildCraft
	 */
	@Override
	public int getMaxEnergyStored(ForgeDirection dir) {
		return (int) MAX_ENERGY;
	}

}
