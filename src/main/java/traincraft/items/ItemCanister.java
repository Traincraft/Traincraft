/*******************************************************************************
 * Copyright (c) 2014 Mrbrutal. All rights reserved.
 *
 * @name Traincraft
 * @author Mrbrutal
 ******************************************************************************/

package traincraft.items;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.fluids.*;
import net.minecraftforge.fluids.capability.CapabilityFluidHandler;
import net.minecraftforge.fluids.capability.FluidTankProperties;
import net.minecraftforge.fluids.capability.IFluidHandlerItem;
import net.minecraftforge.fluids.capability.IFluidTankProperties;
import traincraft.Traincraft;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class ItemCanister extends BaseItem {

	public ItemCanister(){
		super("canister");
		this.setMaxStackSize(64);
		this.setCreativeTab(Traincraft.TAB);
	}
	
	@Nullable
	@Override
	public ICapabilityProvider initCapabilities(ItemStack stack, @Nullable NBTTagCompound nbt) {
		return new CanisterFluidWrapper(stack);
	}
	
	public static class CanisterFluidWrapper implements IFluidHandlerItem, ICapabilityProvider {
		
		private final ItemStack stack;
		
		public CanisterFluidWrapper(ItemStack stack) {
			this.stack = stack;
		}
		
		public FluidStack getFluid(){
			return FluidStack.loadFluidStackFromNBT(this.getContainer().getTagCompound());
		}
		
		public void setFluid(@Nullable FluidStack fluidStack) {
			if (fluidStack == null){
				this.getContainer().setTagCompound(null);
			} else {
				NBTTagCompound nbt = new NBTTagCompound();
				fluidStack.writeToNBT(nbt);
				this.getContainer().setTagCompound(nbt);
			}
		}
		
		@Override
		public boolean hasCapability(@Nonnull Capability<?> capability, @Nullable EnumFacing facing) {
			return capability == CapabilityFluidHandler.FLUID_HANDLER_ITEM_CAPABILITY;
		}
		
		@Nullable
		@Override
		public <T> T getCapability(@Nonnull Capability<T> capability, @Nullable EnumFacing facing) {
			if (capability == CapabilityFluidHandler.FLUID_HANDLER_ITEM_CAPABILITY) {
				return CapabilityFluidHandler.FLUID_HANDLER_ITEM_CAPABILITY.cast(this);
			}
			return null;
		}
		
		@Nonnull
		@Override
		public ItemStack getContainer() {
			return this.stack;
		}
		
		@Override
		public IFluidTankProperties[] getTankProperties() {
			return new IFluidTankProperties[]{new FluidTankProperties(this.getFluid(), Fluid.BUCKET_VOLUME)};
		}
		
		@Override
		public int fill(FluidStack resource, boolean doFill) {
			if (this.getContainer().getCount() != 1 || resource == null || resource.amount < Fluid.BUCKET_VOLUME || getFluid() != null) {
				return 0;
			}
			if(getFluid().isFluidEqual(resource) && resource.amount + getFluid().amount <= Fluid.BUCKET_VOLUME){
				if (doFill){
					setFluid(resource);
				}
				return resource.amount;
			} else {
				return 0;
			}
		}
		
		@Nullable
		@Override
		public FluidStack drain(FluidStack resource, boolean doDrain) {
			if (this.getContainer().getCount() != 1 || resource == null || resource.amount < Fluid.BUCKET_VOLUME){
				return null;
			}
			FluidStack fluidStack = this.getFluid();
			if (fluidStack != null && fluidStack.isFluidEqual(resource)){
				if (doDrain){
					setFluid(null);
				}
				return fluidStack;
			}
			return null;
		}
		
		@Nullable
		@Override
		public FluidStack drain(int maxDrain, boolean doDrain) {
			if (this.getContainer().getCount() != 1 || maxDrain < Fluid.BUCKET_VOLUME){
				return null;
			}
			FluidStack fluidStack = getFluid();
			if (fluidStack != null){
				if (doDrain){
					setFluid(null);
				}
				return fluidStack;
			}
			return null;
		}
	}
}
