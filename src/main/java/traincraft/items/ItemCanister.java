/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("ItemCanister.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.items;

import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.capability.CapabilityFluidHandler;
import net.minecraftforge.fluids.capability.FluidTankProperties;
import net.minecraftforge.fluids.capability.IFluidHandlerItem;
import net.minecraftforge.fluids.capability.IFluidTankProperties;
import traincraft.Traincraft;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class ItemCanister extends BaseItem implements IItemColor {
    
    public ItemCanister(){
        super("canister");
        this.setMaxStackSize(64);
        this.setCreativeTab(Traincraft.TAB);
    }
    
    @Override
    public String getItemStackDisplayName(ItemStack stack){
        IFluidHandlerItem capability = stack.getCapability(CapabilityFluidHandler.FLUID_HANDLER_ITEM_CAPABILITY, null);
        if(capability instanceof CanisterFluidWrapper){
            FluidStack fluidStack = ((CanisterFluidWrapper) capability).getFluid();
            if(fluidStack != null){
                return (fluidStack.getLocalizedName() + " " + super.getItemStackDisplayName(stack));
            }
        }
        return super.getItemStackDisplayName(stack);
    }
    
    @Override
    public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items){
        if(this.isInCreativeTab(tab)){
            items.add(new ItemStack(this));
            for(Fluid fluid : FluidRegistry.getRegisteredFluids().values()){
                ItemStack stack = new ItemStack(this);
                IFluidHandlerItem capability = stack.getCapability(CapabilityFluidHandler.FLUID_HANDLER_ITEM_CAPABILITY, null);
                if(capability instanceof CanisterFluidWrapper){
                    ((CanisterFluidWrapper) capability).setFluid(new FluidStack(fluid, Fluid.BUCKET_VOLUME));
                    items.add(stack);
                }
            }
        }
    }
    
    @Nullable
    @Override
    public ICapabilityProvider initCapabilities(ItemStack stack, @Nullable NBTTagCompound nbt){
        return new CanisterFluidWrapper(stack);
    }
    
    @Override
    public int colorMultiplier(ItemStack stack, int tintIndex){
        IFluidHandlerItem capability = stack.getCapability(CapabilityFluidHandler.FLUID_HANDLER_ITEM_CAPABILITY, null);
        if(capability instanceof CanisterFluidWrapper){
            FluidStack fluid = ((CanisterFluidWrapper) capability).getFluid();
            if(fluid != null){
                return fluid.getFluid().getColor(fluid);
            }
        }
        return -1;
    }
    
    public static class CanisterFluidWrapper implements IFluidHandlerItem, ICapabilityProvider {
        
        private final ItemStack stack;
        
        public CanisterFluidWrapper(ItemStack stack){
            this.stack = stack;
        }
        
        @Override
        public boolean hasCapability(@Nonnull Capability<?> capability, @Nullable EnumFacing facing){
            return capability == CapabilityFluidHandler.FLUID_HANDLER_ITEM_CAPABILITY;
        }
        
        @Nullable
        @Override
        public <T> T getCapability(@Nonnull Capability<T> capability, @Nullable EnumFacing facing){
            if(capability == CapabilityFluidHandler.FLUID_HANDLER_ITEM_CAPABILITY){
                return CapabilityFluidHandler.FLUID_HANDLER_ITEM_CAPABILITY.cast(this);
            }
            return null;
        }
        
        @Override
        public IFluidTankProperties[] getTankProperties(){
            return new IFluidTankProperties[]{new FluidTankProperties(this.getFluid(), Fluid.BUCKET_VOLUME)};
        }
        
        @Override
        public int fill(FluidStack resource, boolean doFill){
            if(this.getContainer().getCount() != 1 || resource == null || resource.amount < Fluid.BUCKET_VOLUME || getFluid() != null){
                return 0;
            }
            if(getFluid().isFluidEqual(resource) && resource.amount + getFluid().amount <= Fluid.BUCKET_VOLUME){
                if(doFill){
                    setFluid(resource);
                }
                return resource.amount;
            } else{
                return 0;
            }
        }
        
        @Nullable
        @Override
        public FluidStack drain(FluidStack resource, boolean doDrain){
            if(this.getContainer().getCount() != 1 || resource == null || resource.amount < Fluid.BUCKET_VOLUME){
                return null;
            }
            FluidStack fluidStack = this.getFluid();
            if(fluidStack != null && fluidStack.isFluidEqual(resource)){
                if(doDrain){
                    setFluid(null);
                }
                return fluidStack;
            }
            return null;
        }
        
        @Nullable
        @Override
        public FluidStack drain(int maxDrain, boolean doDrain){
            if(this.getContainer().getCount() != 1 || maxDrain < Fluid.BUCKET_VOLUME){
                return null;
            }
            FluidStack fluidStack = getFluid();
            if(fluidStack != null){
                if(doDrain){
                    setFluid(null);
                }
                return fluidStack;
            }
            return null;
        }
        
        @Nonnull
        @Override
        public ItemStack getContainer(){
            return this.stack;
        }
        
        public FluidStack getFluid(){
            return FluidStack.loadFluidStackFromNBT(this.getContainer().getTagCompound());
        }
        
        public void setFluid(@Nullable FluidStack fluidStack){
            if(fluidStack == null){
                this.getContainer().setTagCompound(null);
            } else{
                NBTTagCompound nbt = new NBTTagCompound();
                fluidStack.writeToNBT(nbt);
                this.getContainer().setTagCompound(nbt);
            }
        }
    }
}
