/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("FluidTankTyped.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.api;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class FluidTankTyped extends FluidTankSerializable {
    
    @Nonnull
    private final Fluid validFluid;
    
    public FluidTankTyped(@Nonnull Fluid validFluid, int capacity){
        super(capacity);
        this.validFluid = validFluid;
    }
    
    public FluidTankTyped(@Nonnull Fluid validFluid, @Nullable FluidStack fluidStack, int capacity){
        super(fluidStack, capacity);
        this.validFluid = validFluid;
    }
    
    public FluidTankTyped(@Nonnull Fluid validFluid, Fluid fluid, int amount, int capacity){
        super(fluid, amount, capacity);
        this.validFluid = validFluid;
    }
    
    @Override
    public boolean canFillFluidType(FluidStack fluid){
        return this.validFluid.equals(fluid.getFluid()) && super.canFillFluidType(fluid);
    }
    
    @Override
    public boolean canDrainFluidType(@Nullable FluidStack fluid){
        return (fluid == null || this.validFluid.equals(fluid.getFluid())) && super.canDrainFluidType(fluid);
    }
}
