package train.common.api;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.*;
import train.common.adminbook.ServerLogger;
import train.common.entity.rollingStock.EntityTankLava;

import javax.annotation.Nullable;

public class LiquidTank extends EntityRollingStock implements IFluidHandler, ISidedInventory {
	private int capacity;
	protected ItemStack cargoItems[];
	private int update = 8;
	private FluidTank theTank;
	public TileEntity[] blocksToCheck;

	/**
	 * 
	 * @param world
	 * @param fluid
	 * @param quantity
	 * @param capacity
	 */
	public LiquidTank(World world, Fluid fluid, int quantity, int capacity) {
			this(new FluidStack(fluid, quantity), capacity, world);
	}
	public LiquidTank(World world, int capacity) {
		this(null, capacity,world);
	}

	private LiquidTank(@Nullable FluidStack liquid, int capacity, World world) {
		super(world);
		this.capacity = capacity;
		this.theTank = new FluidTank(liquid, capacity);
		dataWatcher.addObject(4, 0);
		dataWatcher.addObject(22, "");

	}

	public int getAmount() {
		return (this.dataWatcher.getWatchableObjectInt(18));
	}

	public int getLiquidItemID() {
		return (this.dataWatcher.getWatchableObjectInt(4));
	}

	public String getLiquidName() {
		return (this.dataWatcher.getWatchableObjectString(22));
	}

	public FluidTank getTank() {
		return theTank;
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound nbttagcompound) {
		super.writeEntityToNBT(nbttagcompound);
		this.theTank.writeToNBT(nbttagcompound);
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound nbttagcompound) {
		super.readEntityFromNBT(nbttagcompound);
		this.theTank.readFromNBT(nbttagcompound);
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		if (worldObj.isRemote){ return;}

		if(ticksExisted%5==0 && fill(ForgeDirection.UNKNOWN, new FluidStack(FluidRegistry.WATER,100), false)==100) {
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
								((IFluidHandler) block).drain(direction, 100, false).fluid == FluidRegistry.WATER &&
								((IFluidHandler) block).drain(direction, 100, false).amount == 100
						) {
							drain = ((IFluidHandler) block).drain(
									direction, 100, true);
						}
					}
				}
			}

			if (drain != null) {
				fill(ForgeDirection.UNKNOWN, drain, true);
			}
		}


		if (theTank != null && theTank.getFluid() != null) {
			this.dataWatcher.updateObject(18, theTank.getFluid().amount);
			this.dataWatcher.updateObject(4, theTank.getFluid().getFluidID());
			if (theTank.getFluid().getFluid() != null)
				this.dataWatcher.updateObject(22, theTank.getFluid().getFluid().getUnlocalizedName());
			handleMass();
		}
		else if (theTank != null && theTank.getFluid() == null) {
			this.dataWatcher.updateObject(18, 0);
			this.dataWatcher.updateObject(4, 0);
			this.dataWatcher.updateObject(22, "");
		}
	}

	/**
	 * Handle mass depending on liquid amount
	 */
	protected void handleMass() {
		if (this.updateTicks % 10 != 0 && theTank.getFluid().amount > 0) {
			this.mass = this.getDefaultMass();
			double preciseAmount = theTank.getFluid().amount;
			mass += (preciseAmount / 10000);//1 bucket = 1 kilo
		}
	}

	public ItemStack checkInvent(ItemStack itemstack) {
		ItemStack result = null;
		if (worldObj.isRemote) {
			return itemstack;
		}
		this.update += 1;
		if (this.update % 8 == 0 && itemstack != null) {
			ItemStack emptyItem = itemstack.getItem().getContainerItem(itemstack);
			if(cargoItems[1] == null) {
				if (theTank.getFluidAmount() == 0) {
					for (Fluid fluid : FluidRegistry.getRegisteredFluids().values()) {
						if (LiquidManager.getInstance().containsFluid(itemstack,
								FluidRegistry.getFluidStack(FluidRegistry.getFluidName(fluid), 0))) {
							if (fluid.getTemperature() < 1000) {
								if (!(this instanceof EntityTankLava)) {
									result = LiquidManager.getInstance().processContainer(this, 0, this, itemstack);
									break;
								}
							} else {
								if (this instanceof EntityTankLava) {
									result = LiquidManager.getInstance().processContainer(this, 0, this, itemstack);
									break;
								}
							}
						}
					}
				} else {
					result = LiquidManager.getInstance().processContainer(this, 0, this, itemstack);
				}
			} else if (emptyItem != null) {
				if(emptyItem.getItem() == cargoItems[1].getItem()) {
    				if(cargoItems[1].stackSize+1 <= cargoItems[1].getMaxStackSize()) {
    					result = LiquidManager.getInstance().processContainer(this, 0, this, itemstack);
    				}
				}
			} else {
				if(itemstack.getItem() == cargoItems[1].getItem()) {
    				if(cargoItems[1].stackSize+1 <= cargoItems[1].getMaxStackSize()) {
    					result = LiquidManager.getInstance().processContainer(this, 0, this, itemstack);
    				}
				}
			}

			if (result != null) {
				if(cargoItems[1] == null) {
					cargoItems[1] = result;
				}
				else if(cargoItems[1].getItem() == result.getItem()) {
					cargoItems[1].stackSize += 1;
				}
			}
		}
		return itemstack;
	}

	public void setLiquid(FluidTank liquid) {
		this.theTank = liquid;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getCapacity() {
		return this.capacity;
	}

	// private int placeInSpecialInvent(ItemStack itemstack1, int i, boolean doAdd) {
	// if (cargoItems[i] == null) {
	// if (doAdd)
	// cargoItems[i] = itemstack1;
	// return itemstack1.stackSize;
	// }
	// else if (cargoItems[i] != null && cargoItems[i].getItem() == itemstack1.getItem() &&
	// itemstack1.isStackable() && (!itemstack1.getHasSubtypes() || cargoItems[i].getItemDamage() ==
	// itemstack1.getItemDamage()) && ItemStack.areItemStackTagsEqual(cargoItems[i], itemstack1)) {
	//
	// int var9 = cargoItems[i].stackSize + itemstack1.stackSize;
	// if (var9 <= itemstack1.getMaxStackSize()) {
	// if (doAdd)
	// cargoItems[i].stackSize = var9;
	// return var9;
	// }
	// else if (cargoItems[i].stackSize < itemstack1.getMaxStackSize()) {
	// if (doAdd)
	// cargoItems[i].stackSize = cargoItems[i].getMaxStackSize();
	// return Math.abs(cargoItems[i].getMaxStackSize() - cargoItems[i].stackSize -
	// itemstack1.stackSize);
	// }
	// }
	// return itemstack1.stackSize;
	// }

	//TODO Fix ISided Inventory buildcraft support
	/*
	/**
	 * Offers an ItemStack for addition to the inventory.
	 * 
	 * @param stack ItemStack offered for addition. Do not manipulate this!
	 * @param doAdd If false no actual addition should take place.
	 * @param from Orientation the ItemStack is offered from.
	 * @return Amount of items used from the passed stack.
	 */
	/*
	@Override
	public int addItem(ItemStack stack, boolean doAdd, ForgeDirection from) {
		if (stack == null) {
			return 0;
		}
		if (LiquidManager.getInstance().isContainer(stack))
			return placeInSpecialInvent(stack, 0, doAdd);
		return 0;
	}
	*/

	/*
	/**
	 * Requests items to be extracted from the inventory
	 * 
	 * @param doRemove If false no actual extraction may occur.
	 * @param from Orientation the ItemStack is requested from.
	 * @param maxItemCount Maximum amount of items to extract (spread over all returned item stacks)
	 * @return Array of item stacks extracted from the inventory
	 */
	/*
	@Override
	public ItemStack[] canExtractItem(boolean doRemove, ForgeDirection from, int maxItemCount) {
		return null;
	}
	*/

	@Override
	public boolean canExtractItem(int p_102008_1_, ItemStack p_102008_2_, int p_102008_3_) {
		return false;
	}

	@Override
	public int[] getAccessibleSlotsFromSide(int p_94128_1_) {
		return new int[0];
	}

	@Override
	public boolean canInsertItem(int p_102007_1_, ItemStack p_102007_2_, int p_102007_3_) {
		return false;
	}

	@Override
	public ItemStack getStackInSlot(int i) {
		return cargoItems[i];
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int par1) {
		if (this.cargoItems[par1] != null) {
			ItemStack var2 = this.cargoItems[par1];
			this.cargoItems[par1] = null;
			return var2;
		}
		else {
			return null;
		}
	}

	@Override
	public ItemStack decrStackSize(int i, int j) {
		if (cargoItems[i] != null) {
			if (cargoItems[i].stackSize <= j) {
				ItemStack itemstack = cargoItems[i];
				cargoItems[i] = null;
				return itemstack;
			}
			ItemStack itemstack1 = cargoItems[i].splitStack(j);
			if (cargoItems[i].stackSize == 0) {
				cargoItems[i] = null;
			}
			return itemstack1;
		}
		else {
			return null;
		}
	}

	@Override
	public void setInventorySlotContents(int i, ItemStack itemstack) {
		cargoItems[i] = itemstack;
		if (itemstack != null && itemstack.stackSize > getInventoryStackLimit()) {
			itemstack.stackSize = getInventoryStackLimit();
		}
	}

	@Override
	public void markDirty() {

	}

	@Override
	public String getInventoryName() {
		return null;
	}

	@Override
	public void openInventory() {}

	@Override
	public void closeInventory() {}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@Override
	public int getSizeInventory() {
		return cargoItems.length;
	}

	@Override
	public boolean attackEntityFrom(DamageSource damagesource, float i) {
		if (worldObj.isRemote) {
			return true;
		}
		if (canBeDestroyedByPlayer(damagesource))
			return true;
		super.attackEntityFrom(damagesource, i);
		setRollingDirection(-getRollingDirection());
		setRollingAmplitude(10);
		setBeenAttacked();
		setDamage(getDamage() + i * 10);
		if (getDamage() > 40) {
			if (riddenByEntity != null) {
				riddenByEntity.mountEntity(this);
			}
			this.setDead();
			ServerLogger.deleteWagon(this);
			if (damagesource.getEntity() instanceof EntityPlayer) {
				dropCartAsItem(((EntityPlayer)damagesource.getEntity()).capabilities.isCreativeMode);
			}
		}
		return true;
	}

	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack) {
		return true;
	}

	public FluidStack getFluid() {
		return theTank.getFluid();
	}

	public int getFluidAmount() {
		return theTank.getFluidAmount();
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
