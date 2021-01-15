/*******************************************************************************
 * Copyright (c) 2013 Spitfire4466. All rights reserved.
 *
 * @name TrainCraft
 * @author Spitfire4466
 ******************************************************************************/

package train.blocks.generator;


import cofh.api.energy.EnergyStorage;
import cofh.api.energy.IEnergyProvider;
import cofh.api.energy.IEnergyReceiver;
import ebf.tim.blocks.TileEntityStorage;
import ebf.tim.utility.ItemStackSlot;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidStack;
import train.blocks.TCBlocks;

import java.util.ArrayList;
import java.util.Arrays;

public class TileGeneratorDiesel extends TileEntityStorage implements IEnergyProvider {

    public boolean powered;
    public EnergyStorage energy = new EnergyStorage(3000,80); //core energy value the first value is max storage and the second is transfer max.
    private ForgeDirection[] sides = new ForgeDirection[]{}; //defines supported sides

    public int currentBurnTime;

    private int lastTankAmount;
    private int lastBurnTime;

    public TileGeneratorDiesel(){
        super(TCBlocks.dieselGenerator);
        this.energy.setCapacity(320);
        this.energy.setMaxTransfer(80);
        sides=new ForgeDirection[]{ForgeDirection.EAST, ForgeDirection.WEST, ForgeDirection.NORTH, ForgeDirection.SOUTH, ForgeDirection.UP, ForgeDirection.DOWN};
        //this.theTank = LiquidManager.getInstance().new FilteredTank(30000, LiquidManager.dieselFilter(), 1);

        inventory=new ArrayList<>();
        inventory.add(new ItemStackSlot(this, 400, 56, 17));
        inventory.add(new ItemStackSlot(this, 401, 56, 53));

    }


    @Override
    public boolean canUpdate(){return true;}
    @Override
    public void updateEntity(){
        if(!worldObj.isRemote){
            if(getSlotIndexByID(400).getStack() != null){
                FluidStack stak = FluidContainerRegistry.getFluidForFilledItem(getSlotIndexByID(400).getStack());
                if(stak!=null && stak.amount>0){
                    if(getTankInfo(0).fluid==null || getTankInfo(0).fluid.fluid ==null || getTankInfo(0).fluid.amount==0 ||
                            (getTankInfo(0).fluid.amount+stak.amount<getTankCapacity()[0]&&
                            getTankInfo(0).fluid.fluid == stak.fluid)){

                        if(getSlotIndexByID(401).getStack()==null ||
                                (getSlotIndexByID(401).getItem()== Items.bucket &&getSlotIndexByID(401).getStackSize()< getSlotIndexByID(401).getStack().getMaxStackSize())) {

                            if(getSlotIndexByID(401).getStack()==null){
                                getSlotIndexByID(401).setStack(new ItemStack(Items.bucket));
                            } else {
                                getSlotIndexByID(401).decrStackSize(-1);
                            }
                            fill(ForgeDirection.UNKNOWN, stak, true);
                            getSlotIndexByID(400).decrStackSize(1);
                        }
                    }
                }
                this.markDirty();
            }
            int energyProduced = 70;
            if(this.currentBurnTime > 0){
                this.currentBurnTime--;
                this.energy.receiveEnergy(energyProduced, false);
            }

            if(this.powered && energyProduced <= this.energy.getMaxEnergyStored()-this.energy.getEnergyStored()){
                int fuelUsed = 50;
                if(this.currentBurnTime <= 0 && getTankInfo(0).fluid.amount >= fuelUsed){
                    this.currentBurnTime = 8;
                    drain(ForgeDirection.UNKNOWN,fuelUsed, true);
                    this.markDirty();
                }
            }

            if(this.energy.getEnergyStored() > 0){
                pushEnergy(worldObj, this.xCoord, this.yCoord, this.zCoord, this.energy);
            }
        }

        if(getTankInfo(0).fluid.amount != this.lastTankAmount || this.currentBurnTime != this.lastBurnTime){
            this.lastTankAmount = getTankInfo(0).fluid.amount;
            this.lastBurnTime = this.currentBurnTime;
            this.syncTileEntity();
        }

    }

    @Override
    public void readFromNBT(NBTTagCompound nbtTag){
        super.readFromNBT(nbtTag);
        this.powered = nbtTag.getBoolean("Powered");
        this.currentBurnTime = nbtTag.getInteger("BurnTime");
        this.energy.readFromNBT(nbtTag);
    }

    @Override
    public void writeToNBT(NBTTagCompound nbtTag){
        super.writeToNBT(nbtTag);
        nbtTag.setBoolean("Powered", this.powered);
        nbtTag.setInteger("BurnTime", this.currentBurnTime);
        this.energy.writeToNBT(nbtTag);
    }

    public int[] getTankCapacity(){
        return new int[]{30000};
    }

    private boolean placeInInvent(ItemStack itemstack1, int i, boolean doAdd){
        if(getSlotIndexByID(i).getStack() == null){
            if(doAdd){
                getSlotIndexByID(i).setStack(itemstack1);
            }
            return true;
        }
        else if(getSlotIndexByID(i).getStack() != null && getSlotIndexByID(i).getStack().getItem() == itemstack1.getItem()
                && itemstack1.isStackable() && (!itemstack1.getHasSubtypes() ||
                getSlotIndexByID(i).getStack().getItemDamage() == itemstack1.getItemDamage())
                && ItemStack.areItemStackTagsEqual(getSlotIndexByID(i).getStack(), itemstack1)){
            if(doAdd){
                int var9 = getSlotIndexByID(i).getStack().stackSize+itemstack1.stackSize;
                if(var9 <= itemstack1.getMaxStackSize()){
                    getSlotIndexByID(i).getStack().stackSize = var9;
                }
                else if(getSlotIndexByID(i).getStack().stackSize < itemstack1.getMaxStackSize()){
                    getSlotIndexByID(i).decrStackSize(-1);
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
    public boolean canDrain(ForgeDirection from, Fluid fluid){
        return false;
    }

    public void setSides(ForgeDirection[] listOfSides){
        this.sides = listOfSides;
    }
    public ForgeDirection[] getSides(){
        return this.sides;
    }


    public void pushEnergy(World world, int x, int y, int z, EnergyStorage storage){
        for (ForgeDirection side : getSides()) {
            TileEntity tile = world.getTileEntity(x + side.offsetX, y + side.offsetY, z + side.offsetZ);
            if (tile instanceof IEnergyReceiver && storage.getEnergyStored() > 0) {
                if (((IEnergyReceiver) tile).canConnectEnergy(side.getOpposite())) {
                    int receive = ((IEnergyReceiver) tile).receiveEnergy(side.getOpposite(), Math.min(storage.getMaxExtract(), storage.getEnergyStored()), false);
                    storage.extractEnergy(receive, false);
                }
            }
        }
    }


    //RF Overrides
    @Override
    public boolean canConnectEnergy(ForgeDirection dir) {
        return Arrays.asList(sides).contains(dir);
    }
    @Override
    public int extractEnergy(ForgeDirection dir, int amount, boolean simulate) {
        return energy.extractEnergy(amount, simulate);
    }
    @Override
    public int getEnergyStored(ForgeDirection dir) {
        return energy.getEnergyStored();
    }
    @Override
    public int getMaxEnergyStored(ForgeDirection dir) {
        return this.energy.getMaxEnergyStored();
    }



}
