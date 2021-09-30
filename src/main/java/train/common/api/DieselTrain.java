package train.common.api;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidTankInfo;
import net.minecraftforge.fluids.IFluidHandler;
import train.common.api.LiquidManager.StandardTank;
import train.common.entity.rollingStock.EntityBUnitDD35;
import train.common.entity.rollingStock.EntityBUnitEMDF3;
import train.common.entity.rollingStock.EntityBUnitEMDF7;

public abstract class DieselTrain extends Locomotive implements IFluidHandler {

	public int fuelSlot = 1;
	private int maxTank = 7 * 1000;
	private int update = 8;
	private StandardTank theTank;

	public DieselTrain(World world, int capacity) {
		this(capacity, world, null, null);
	}

	public DieselTrain(World world, int capacity, FluidStack filter) {
		this(capacity, world, filter, null);
	}

	public DieselTrain(World world, int capacity, FluidStack[] multiFilter) {
		this(capacity, world, null, multiFilter);
	}

	private DieselTrain(int capacity, World world, FluidStack filter, FluidStack[] multiFilter) {
		super(world);
		this.maxTank = capacity;
		if (filter == null && multiFilter == null) {
			this.theTank = LiquidManager.getInstance().new StandardTank(capacity);
		}if (filter != null) {
			this.theTank = LiquidManager.getInstance().new FilteredTank(capacity, filter);
		}if (multiFilter != null) {
			this.theTank = LiquidManager.getInstance().new FilteredTank(capacity, multiFilter);
		}
		dataWatcher.addObject(4, 0);
		numCargoSlots = 3;
		numCargoSlots1 = 3;
		numCargoSlots2 = 3;
		inventorySize = numCargoSlots + numCargoSlots2 + numCargoSlots1 + fuelSlot;
		this.dataWatcher.addObject(23, 0);
		this.dataWatcher.addObject(5, "");
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		if (!worldObj.isRemote) {
			if (theTank.getFluidAmount() != this.dataWatcher.getWatchableObjectInt(23)){
				this.dataWatcher.updateObject(23, theTank.getFluidAmount());
				fuelTrain = theTank.getFluidAmount();
				this.dataWatcher.updateObject(4, theTank.getFluid()!=null?theTank.getFluid().getFluidID():0);
				this.dataWatcher.updateObject(5, theTank.getFluid()!=null?theTank.getFluid().getUnlocalizedName():"");
			}
			if (isLocoTurnedOn() && theTank.getFluidAmount() >0) {
				if (theTank.getFluid().amount <= 1) {
					motionX *= 0.94;
					motionZ *= 0.94;
				}
			}
		}
	}

	public int getDiesel() {
		return getFuel()==0?(this.dataWatcher.getWatchableObjectInt(23)):getFuel();
	}
	public String getLiquidName(){ return  this.dataWatcher.getWatchableObjectString(5);}

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
				entityDropItem(itemstack1,1);
				return;
			}
		}
	}

	public void liquidInSlot(ItemStack itemstack) {
		if (worldObj.isRemote)
			return;
		this.update += 1;
		if (this.update % 8 == 0 && itemstack != null) {
			ItemStack result = LiquidManager.getInstance().processContainer(this, 0, this, itemstack);
			if (result != null) {
				placeInInvent(result);
			}
		}
	}

	protected ItemStack checkInvent(ItemStack locoInvent0) {
		if (!this.canCheckInvent)
			return locoInvent0;

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
	protected void updateFuelTrain(int amount) {
		if (!this.isLocoTurnedOn()) {
			motionX *= 0.8;
			motionZ *= 0.8;
		} else if (ticksExisted%5==0 &&getTank().getFluidAmount()+100 < maxTank) {
			FluidStack drain = null;
			blocksToCheck = new TileEntity[]{worldObj.getTileEntity(MathHelper.floor_double(posX), MathHelper.floor_double(posY - 1), MathHelper.floor_double(posZ)),
					worldObj.getTileEntity(MathHelper.floor_double(posX), MathHelper.floor_double(posY + 2), MathHelper.floor_double(posZ)),
					worldObj.getTileEntity(MathHelper.floor_double(posX), MathHelper.floor_double(posY + 3), MathHelper.floor_double(posZ)),
					worldObj.getTileEntity(MathHelper.floor_double(posX), MathHelper.floor_double(posY + 4), MathHelper.floor_double(posZ))
			};

			for (TileEntity block : blocksToCheck) {
				if (drain == null && block instanceof IFluidHandler) {
					for (ForgeDirection direction : ForgeDirection.VALID_DIRECTIONS) {
						if (((IFluidHandler) block).drain(direction, 100, false) != null &&
								(getFluid()==null || ((IFluidHandler) block).drain(direction, 100, false).fluid==getTank().getFluid().fluid) &&
								((IFluidHandler) block).drain(direction, 100, false).amount == 100
						) {
							drain = ((IFluidHandler) block).drain(
									direction, 100, true);
						}
					}
				}
			}
			if(drain==null && cartLinked1 instanceof LiquidTank && !(cartLinked1 instanceof EntityBUnitEMDF7) && !(cartLinked1 instanceof EntityBUnitEMDF3) && !(cartLinked1 instanceof EntityBUnitDD35)){
				if (getFluid() == null) {
					drain = ((LiquidTank) cartLinked1).drain(ForgeDirection.UNKNOWN, new FluidStack(LiquidManager.DIESEL, 100), true);
					if (drain == null){
						drain = ((LiquidTank) cartLinked1).drain(ForgeDirection.UNKNOWN, new FluidStack(LiquidManager.REFINED_FUEL, 50), true);
					}
				} else if (getFluid().getFluid() == LiquidManager.DIESEL) {
					drain = ((LiquidTank) cartLinked1).drain(ForgeDirection.UNKNOWN, new FluidStack(LiquidManager.DIESEL, 100), true);
				} else {
					drain = ((LiquidTank) cartLinked1).drain(ForgeDirection.UNKNOWN, new FluidStack(LiquidManager.REFINED_FUEL, 50), true);
				}
			} else if (drain==null && cartLinked2 instanceof LiquidTank && !(cartLinked2 instanceof EntityBUnitEMDF7) && !(cartLinked2 instanceof EntityBUnitEMDF3) && !(cartLinked1 instanceof EntityBUnitDD35)){
				if (getFluid() == null) {
					drain = ((LiquidTank) cartLinked2).drain(ForgeDirection.UNKNOWN, new FluidStack(LiquidManager.DIESEL, 100), true);
					if (drain == null){
						drain = ((LiquidTank) cartLinked2).drain(ForgeDirection.UNKNOWN, new FluidStack(LiquidManager.REFINED_FUEL, 50), true);
					}
				} else if (getFluid().getFluid() == LiquidManager.DIESEL) {
					drain = ((LiquidTank) cartLinked2).drain(ForgeDirection.UNKNOWN, new FluidStack(LiquidManager.DIESEL, 100), true);
				} else {
					drain = ((LiquidTank) cartLinked2).drain(ForgeDirection.UNKNOWN, new FluidStack(LiquidManager.REFINED_FUEL, 100), true);
				}
			}
			if (drain != null){
				fill(ForgeDirection.UNKNOWN, drain, true);
			}
		}

		if (fuelTrain >1 && this.isLocoTurnedOn()) {
			fuelTrain -= amount;
			if (fuelTrain < 0) {
				fuelTrain = 0;
				drain(ForgeDirection.UNKNOWN, amount, true);
				setLocoTurnedOnFromPacket(false);
			} else {
				drain(ForgeDirection.UNKNOWN, amount, true);
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
		return theTank ==null? null:theTank.drain(maxDrain, doDrain);
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