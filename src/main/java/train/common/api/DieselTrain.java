package train.common.api;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.*;
import train.common.api.LiquidManager.StandardTank;

public abstract class DieselTrain extends Locomotive implements IFluidHandler {

	public int fuelSlot = 1;
	private int maxTank = 7 * 1000;
	private int update = 8;
	private StandardTank theTank;
	private IFluidTank[] tankArray = new IFluidTank[1];

	public DieselTrain(World world, int liquidId, int quantity, int capacity) {
		this(capacity, world, null, null);
	}

	public DieselTrain(World world, int liquidId, int quantity, int capacity, FluidStack filter) {
		this(capacity, world, filter, null);
	}

	public DieselTrain(World world, int liquidId, int quantity, int capacity, FluidStack[] multiFilter) {
		this(capacity, world, null, multiFilter);
	}

	private DieselTrain(int capacity, World world, FluidStack filter, FluidStack[] multiFilter) {
		super(world);
		this.maxTank = capacity;
		if (filter == null && multiFilter == null)
			this.theTank = LiquidManager.getInstance().new StandardTank(capacity);
		if (filter != null)
			this.theTank = LiquidManager.getInstance().new FilteredTank(capacity, filter);
		if (multiFilter != null)
			this.theTank = LiquidManager.getInstance().new FilteredTank(capacity, multiFilter);
		tankArray[0] = theTank;
		dataWatcher.addObject(4, new Integer(0));
		numCargoSlots = 3;
		numCargoSlots1 = 3;
		numCargoSlots2 = 3;
		inventorySize = numCargoSlots + numCargoSlots2 + numCargoSlots1 + fuelSlot;
		this.dataWatcher.addObject(23, new Integer(0));
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		if (worldObj.isRemote)
			return;
		if (theTank != null && theTank.getFluid() != null) {
			this.dataWatcher.updateObject(23, theTank.getFluid().amount);
			this.dataWatcher.updateObject(4, theTank.getFluid().getFluidID());
			if (theTank.getFluid().amount <= 1) {
				motionX *= 0.94;
				motionZ *= 0.94;
			}
		}
		else if (theTank != null && theTank.getFluid() == null) {
			this.dataWatcher.updateObject(23, 0);
			this.dataWatcher.updateObject(4, 0);
		}
	}

	public int getDiesel() {
		return (this.dataWatcher.getWatchableObjectInt(23));
	}

	public int getLiquidItemID() {
		return (this.dataWatcher.getWatchableObjectInt(4));
	}

	public StandardTank getTank() {
		return theTank;
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound nbttagcompound) {
		super.writeEntityToNBT(nbttagcompound);
		this.theTank.writeToNBT(nbttagcompound);
		nbttagcompound.setBoolean("canBeAdjusted", canBeAdjusted);
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound nbttagcompound) {
		super.readEntityFromNBT(nbttagcompound);
		this.theTank.readFromNBT(nbttagcompound);
		canBeAdjusted = nbttagcompound.getBoolean("canBeAdjusted");
	}

	public int getCartTankCapacity() {
		return maxTank;
	}

	private void placeInInvent(ItemStack itemstack1) {
		for (int i = 1; i < locoInvent.length; i++) {
			if (locoInvent[i] == null) {
				locoInvent[i] = itemstack1;
				return;
			}
			else if (locoInvent[i] != null && locoInvent[i].getItem() == itemstack1.getItem() && itemstack1.isStackable() && (!itemstack1.getHasSubtypes() || locoInvent[i].getItemDamage() == itemstack1.getItemDamage()) && ItemStack.areItemStackTagsEqual(locoInvent[i], itemstack1)) {
				int var9 = locoInvent[i].stackSize + itemstack1.stackSize;
				if (var9 <= itemstack1.getMaxStackSize()) {
					locoInvent[i].stackSize = var9;

				}
				else if (locoInvent[i].stackSize < itemstack1.getMaxStackSize()) {
					locoInvent[i].stackSize += 1;
				}
				return;
			}
			else if (i == locoInvent.length - 1) {
				dropItem(itemstack1.getItem(), 1);
				return;
			}
		}
	}

	public void liquidInSlot(ItemStack itemstack) {
		if (worldObj.isRemote)
			return;
		this.update += 1;
		if (this.update % 8 == 0 && itemstack != null) {
			ItemStack result = LiquidManager.getInstance().processContainer(this, 0, theTank, itemstack);
			if (result != null) {
				placeInInvent(result);
				decrStackSize(0, 1);
			}
		}
	}

	protected ItemStack checkInvent(ItemStack locoInvent0) {
		if (!this.canCheckInvent)
			return locoInvent0;

		ItemStack ret = locoInvent0;
		if (getDiesel() > 0) {
			fuelTrain = (getDiesel());
		}
		if (fuelTrain <= 0) {
			motionX *= 0.88;
			motionZ *= 0.88;
		}
		if (locoInvent0 != null) {
			liquidInSlot(locoInvent0);
		}
		return locoInvent0;
	}

	@Override
	protected void updateFuelTrain() {
		if (fuelTrain < 0) {
			motionX *= 0.8;
			motionZ *= 0.8;
		}
		else {
			if (this.isLocoTurnedOn())
				fuelTrain--;
			if (this.isLocoTurnedOn() && getDiesel() > 0) {
				drain(ForgeDirection.UNKNOWN, 1, true);
			}
		}
	}


	public void setCapacity(int capacity) {
		this.maxTank = capacity;
	}

	public int getCapacity() {
		return this.maxTank;
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

	public FluidStack getFluid() {
		return theTank.getFluid();
	}

	public int getFluidAmount() {
		return theTank.getFluidAmount();
	}
}