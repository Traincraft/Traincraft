/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("FluidTankSerializable.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.api;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.util.INBTSerializable;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidTank;

import javax.annotation.Nullable;

public class FluidTankSerializable extends FluidTank implements INBTSerializable<NBTTagCompound> {
    
    public FluidTankSerializable(int capacity){
        super(capacity);
    }
    
    public FluidTankSerializable(@Nullable FluidStack fluidStack, int capacity){
        super(fluidStack, capacity);
    }
    
    public FluidTankSerializable(Fluid fluid, int amount, int capacity){
        super(fluid, amount, capacity);
    }
    
    @Override
    public NBTTagCompound serializeNBT(){
        NBTTagCompound nbt = new NBTTagCompound();
        this.writeToNBT(nbt);
        return nbt;
    }
    
    @Override
    public void deserializeNBT(NBTTagCompound nbt){
        this.readFromNBT(nbt);
    }
}
