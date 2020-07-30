/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("LocomotiveSteam.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.api;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.capability.CapabilityFluidHandler;
import net.minecraftforge.fluids.capability.IFluidHandler;
import net.minecraftforge.fluids.capability.IFluidHandlerItem;
import net.minecraftforge.fluids.capability.IFluidTankProperties;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.wrapper.InvWrapper;
import traincraft.tile.BaseTile;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public abstract class LocomotiveSteam<A extends LocomotiveSteam<A>> extends AbstractRollingStock<A> implements ITemperatureSupplier {
    
    public static final int BURN_SLOT = 0;
    public static final int WATER_SLOT = 1;
    
    private final InvWrapper inventory = new InvWrapper(new InventorySpecific("LocomotiveSteam Inventory", false, this.getInventorySize(), this::isItemValidForInventory));
    private final FluidTankTyped fluidTank = new FluidTankTyped(FluidRegistry.WATER, this.getWaterTankCapacity());
    
    public int maxBurnTime = 0;
    public int burnTime = 0;
    public double temperature = this.getDefaultTemperature();
    
    public LocomotiveSteam(World worldIn){
        super(worldIn);
    }
    
    public LocomotiveSteam(World worldIn, double x, double y, double z){
        super(worldIn, x, y, z);
    }
    
    @Override
    public double getTemperature(){
        return this.temperature;
    }
    
    @Override
    public void setTemperature(double temperature){
        this.temperature = temperature;
    }
    
    @Override
    public double getMaximumTemperature(){
        return 473.15D; // 200°C
    }
    
    @Override
    public double getMinimumTemperature(){
        return 253.15D; // -20°C
    }
    
    @Override
    public double getDefaultTemperature(){
        return 293.15D; // 20°C
    }
    
    @Override
    public void onUpdate(){
        super.onUpdate();
        if(!this.world.isRemote){
            boolean shouldSendUpdatePacket = false;
            // refill burnstack from inventory
            ItemStack burnStack = this.inventory.getStackInSlot(BURN_SLOT);
            if(burnStack.isEmpty() || burnStack.getCount() < burnStack.getMaxStackSize()){
                for(int i = 2; i < 11; i++){
                    ItemStack stack = this.inventory.getStackInSlot(i);
                    if(burnStack.isEmpty() && this.inventory.isItemValid(BURN_SLOT, stack)){
                        this.inventory.setStackInSlot(BURN_SLOT, stack);
                        this.inventory.setStackInSlot(i, ItemStack.EMPTY);
                        shouldSendUpdatePacket = true;
                    } else if(ItemStack.areItemsEqual(burnStack, stack)){
                        int countToTransfer = Math.min(burnStack.getCount(), burnStack.getMaxStackSize() - stack.getCount());
                        if(countToTransfer > 0){
                            burnStack.grow(countToTransfer);
                            stack.shrink(countToTransfer);
                            if(stack.isEmpty()){
                                this.inventory.setStackInSlot(i, ItemStack.EMPTY);
                                break;
                            }
                            shouldSendUpdatePacket = true;
                        }
                    }
                }
            }
            
            // refill water from inventory
            ItemStack waterStack = this.inventory.getStackInSlot(WATER_SLOT);
            boolean searchForWaterContainerInInventory = waterStack.isEmpty();
            if(waterStack.hasCapability(CapabilityFluidHandler.FLUID_HANDLER_ITEM_CAPABILITY, null)){
                IFluidHandlerItem capability = waterStack.getCapability(CapabilityFluidHandler.FLUID_HANDLER_ITEM_CAPABILITY, null);
                if(capability != null && capability.getTankProperties().length > 0){
                    IFluidTankProperties tankProperty = capability.getTankProperties()[0];
                    FluidStack fluidStack = tankProperty.getContents();
                    if(fluidStack == null || fluidStack.amount <= 0){
                        searchForWaterContainerInInventory = true;
                    }
                }
            }
            if(searchForWaterContainerInInventory){
                for(int i = 2; i < 11; i++){
                    ItemStack stack = this.inventory.getStackInSlot(i);
                    if(stack.hasCapability(CapabilityFluidHandler.FLUID_HANDLER_ITEM_CAPABILITY, null)){
                        IFluidHandlerItem capability = stack.getCapability(CapabilityFluidHandler.FLUID_HANDLER_ITEM_CAPABILITY, null);
                        if(capability != null && capability.getTankProperties().length > 0){
                            IFluidTankProperties tankProperty = capability.getTankProperties()[0];
                            FluidStack fluidStack = tankProperty.getContents();
                            if(fluidStack != null && fluidStack.getFluid() == FluidRegistry.WATER){
                                ItemStack stackInSlot = this.inventory.getStackInSlot(WATER_SLOT);
                                this.inventory.setStackInSlot(WATER_SLOT, stack);
                                this.inventory.setStackInSlot(i, ItemStack.EMPTY);
                                if(!stackInSlot.isEmpty()){
                                    if(this.inventory.getInv() instanceof InventoryBasic){
                                        ItemStack stack1 = ((InventoryBasic) this.inventory.getInv()).addItem(stackInSlot);
                                        if(!stack1.isEmpty()){
                                            this.world.spawnEntity(new EntityItem(this.world, this.posX, this.posY, this.posZ, stack1));
                                        }
                                    } else{
                                        ItemStack stack1 = this.inventory.insertItem(i, stackInSlot, false);
                                        if(!stack1.isEmpty()){
                                            this.world.spawnEntity(new EntityItem(this.world, this.posX, this.posY, this.posZ, stack1));
                                        }
                                    }
                                }
                                shouldSendUpdatePacket = true;
                                break;
                            }
                        }
                    }
                }
            }
            
            // refill water tank
            waterStack = this.inventory.getStackInSlot(WATER_SLOT);
            if(!waterStack.isEmpty()){
                IFluidHandlerItem capability = waterStack.getCapability(CapabilityFluidHandler.FLUID_HANDLER_ITEM_CAPABILITY, null);
                if(capability != null){
                    int fluidAmountToTransfer = this.fluidTank.getCapacity() - this.fluidTank.getFluidAmount();
                    FluidStack drain = capability.drain(fluidAmountToTransfer, false);
                    if(drain != null){
                        int fill = this.fluidTank.fill(drain, false);
                        FluidStack realDrain = capability.drain(fill, true);
                        if(realDrain != null){
                            int filled = this.fluidTank.fill(realDrain, true);
                            if(filled >= realDrain.amount){
                                this.inventory.setStackInSlot(WATER_SLOT, capability.getContainer());
                            }
                            shouldSendUpdatePacket = true;
                        }
                    }
                }
            }
            
            // heat train
            burnStack = this.inventory.getStackInSlot(BURN_SLOT);
            if(!burnStack.isEmpty()){
                if(this.burnTime <= 0){
                    int itemBurnTime = TileEntityFurnace.getItemBurnTime(burnStack);
                    this.maxBurnTime = this.burnTime = itemBurnTime;
                    burnStack.shrink(1);
                    if(burnStack.isEmpty()){
                        this.inventory.setStackInSlot(BURN_SLOT, ItemStack.EMPTY);
                    }
                    shouldSendUpdatePacket = true;
                }
            }
            if(this.burnTime > 0){
                this.burnTime--;
                shouldSendUpdatePacket = this.burnTime % 5 == 0;
            }
            
            
            if(shouldSendUpdatePacket){
                this.sendSyncPacketToClients();
            }
        }
    }
    
    @Override
    public void readFromNBT(AbstractRollingStock<?> rollingStock, NBTTagCompound nbt, BaseTile.NBTState state){
        super.readFromNBT(rollingStock, nbt, state);
        if(state != BaseTile.NBTState.DROP){
            if(nbt.hasKey("burn_time", Constants.NBT.TAG_INT)){
                this.burnTime = nbt.getInteger("burn_time");
            }
            if(nbt.hasKey("max_burn_time", Constants.NBT.TAG_INT)){
                this.maxBurnTime = nbt.getInteger("max_burn_time");
            }
        }
    }
    
    @Override
    public void writeToNBT(AbstractRollingStock<?> rollingStock, NBTTagCompound nbt, BaseTile.NBTState state){
        super.writeToNBT(rollingStock, nbt, state);
        if(state != BaseTile.NBTState.DROP){
            nbt.setInteger("burn_time", this.burnTime);
            nbt.setInteger("max_burn_time", this.maxBurnTime);
        }
    }
    
    @Override
    public IItemHandler getInventory(AbstractRollingStock<?> rollingStock, @Nullable EnumFacing side){
        return this.inventory;
    }
    
    @Override
    public IFluidHandler getFluidTank(AbstractRollingStock<?> rollingStock, @Nullable EnumFacing side){
        return this.fluidTank;
    }
    
    /**
     * @return The amount of water this steam locomotive can store in milli buckets.
     */
    protected int getWaterTankCapacity(){
        return 5000;
    }
    
    /**
     * @return The size of the inventory. The default gui/container has 10 slots for coal
     */
    protected int getInventorySize(){
        return 11;
    }
    
    /**
     * @param slot  The slot number.
     * @param stack The ItemStack
     * @return If the specific ItemStack can be put in the inventory. This defaults to all stacks that can be burned or that can hold fluids.
     */
    protected boolean isItemValidForInventory(int slot, @Nonnull ItemStack stack){
        switch(slot){
            case BURN_SLOT:
                return TileEntityFurnace.isItemFuel(stack);
            case WATER_SLOT:
                return stack.hasCapability(CapabilityFluidHandler.FLUID_HANDLER_ITEM_CAPABILITY, null);
            default:{
                return TileEntityFurnace.isItemFuel(stack) || stack.hasCapability(CapabilityFluidHandler.FLUID_HANDLER_ITEM_CAPABILITY, null);
            }
        }
    }
}
