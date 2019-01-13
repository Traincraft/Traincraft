/*******************************************************************************
 * Copyright (c) 2013 Spitfire4466. All rights reserved.
 *
 * @name TrainCraft
 * @author Spitfire4466
 ******************************************************************************/

package train.common.tile;


import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.*;
import train.common.api.LiquidManager;
import train.common.core.util.Energy;

public class TileGeneratorDiesel extends Energy implements IFluidHandler{

    public boolean powered;
    private ForgeDirection direction;
    public FluidTank theTank;

    public int currentBurnTime;

    private int lastTankAmount;
    private int lastBurnTime;

    public TileGeneratorDiesel(){
        super(2, "Diesel Generator", 320, 80);
        super.setSides(new ForgeDirection[]{ForgeDirection.EAST, ForgeDirection.WEST, ForgeDirection.NORTH, ForgeDirection.SOUTH, ForgeDirection.UP, ForgeDirection.DOWN});
        direction = ForgeDirection.getOrientation(this.blockMetadata);
        this.theTank = LiquidManager.getInstance().new FilteredTank(30000, LiquidManager.dieselFilter(), 1);
    }

    public int getFacing(){
        return direction.ordinal();
    }

    public void setFacing(int facing){
        direction = ForgeDirection.getOrientation(facing);
    }

    @Override
    public void updateEntity(){
        if(!worldObj.isRemote){
            if(slots[0] != null){
                ItemStack result = LiquidManager.getInstance().processContainer(this, 0, this, slots[0]);
                if(result != null && placeInInvent(result, 1, false)){
                    placeInInvent(result, 1, true);
                    this.markDirty();
                }
            }
            int energyProduced = 70;
            if(this.currentBurnTime > 0){
                this.currentBurnTime--;
                this.energy.receiveEnergy(energyProduced, false);
            }

            if(this.powered && energyProduced <= this.energy.getMaxEnergyStored()-this.energy.getEnergyStored()){
                int fuelUsed = 50;
                if(this.currentBurnTime <= 0 && this.theTank.getFluidAmount() >= fuelUsed){
                    this.currentBurnTime = 8;
                    this.theTank.drain(fuelUsed, true);
                    this.markDirty();
                }
            }

            if(this.energy.getEnergyStored() > 0){
                pushEnergy(worldObj, this.xCoord, this.yCoord, this.zCoord, this.energy);
            }
        }

        if(this.theTank.getFluidAmount() != this.lastTankAmount || this.currentBurnTime != this.lastBurnTime){
            this.lastTankAmount = this.theTank.getFluidAmount();
            this.lastBurnTime = this.currentBurnTime;
            this.syncTileEntity();
        }

    }

    @Override
    public void readFromNBT(NBTTagCompound nbtTag, boolean forSyncing){
        super.readFromNBT(nbtTag, forSyncing);
        if(!forSyncing){
            this.powered = nbtTag.getBoolean("Powered");
        }
        this.direction = ForgeDirection.values()[nbtTag.getInteger("direction")];
        this.currentBurnTime = nbtTag.getInteger("BurnTime");
        this.theTank.readFromNBT(nbtTag);
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound nbtTag, boolean forSyncing){
        super.writeToNBT(nbtTag, forSyncing);
        if(!forSyncing){
            nbtTag.setBoolean("Powered", this.powered);
        }
        nbtTag.setInteger("direction", direction.ordinal());
        nbtTag.setInteger("BurnTime", this.currentBurnTime);
        this.theTank.writeToNBT(nbtTag);
        return nbtTag;
    }

    public int getTankCapacity(){
        return theTank.getCapacity();
    }

    private boolean placeInInvent(ItemStack itemstack1, int i, boolean doAdd){
        if(slots[i] == null){
            if(doAdd){
                slots[i] = itemstack1;
            }
            return true;
        }
        else if(slots[i] != null
                && slots[i].getItem() == itemstack1.getItem()
                && itemstack1.isStackable()
                && (!itemstack1.getHasSubtypes() || slots[i]
                .getItemDamage() == itemstack1.getItemDamage())
                && ItemStack.areItemStackTagsEqual(slots[i],
                itemstack1)){
            int var9 = slots[i].stackSize+itemstack1.stackSize;
            if(doAdd){
                if(var9 <= itemstack1.getMaxStackSize()){
                    slots[i].stackSize = var9;
                }
                else if(slots[i].stackSize < itemstack1.getMaxStackSize()){
                    slots[i].stackSize += 1;
                }
            }
            return true;
        }
        return false;

    }

    @Override
    public World getWorldObj(){
        return this.worldObj;
    }

    @Override
    public int fill(ForgeDirection from, FluidStack resource, boolean doFill){
        return theTank.fill(resource, doFill);
    }

    @Override
    public FluidStack drain(ForgeDirection from, FluidStack resource, boolean doDrain){
        if(resource == null || !resource.isFluidEqual(theTank.getFluid())){
            return null;
        }
        return theTank.drain(resource.amount, doDrain);
    }

    @Override
    public FluidStack drain(ForgeDirection from, int maxDrain, boolean doDrain){
        return theTank.drain(maxDrain, doDrain);
    }

    @Override
    public boolean canFill(ForgeDirection from, Fluid fluid){
        return true;
    }

    @Override
    public boolean canDrain(ForgeDirection from, Fluid fluid){
        return false;
    }

    @Override
    public FluidTankInfo[] getTankInfo(ForgeDirection from){
        return new FluidTankInfo[]{theTank.getInfo()};
    }

}
