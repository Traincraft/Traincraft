/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("FluidTankChangeListener.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.api;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidTank;

import javax.annotation.Nullable;

public class FluidTankChangeListener extends FluidTankSerializable {
    
    private final Runnable changeListener;
    
    public FluidTankChangeListener(int capacity, Runnable changeListener){
        super(capacity);
        this.changeListener = changeListener;
    }
    
    public FluidTankChangeListener(@Nullable FluidStack fluidStack, int capacity, Runnable changeListener){
        super(fluidStack, capacity);
        this.changeListener = changeListener;
    }
    
    public FluidTankChangeListener(Fluid fluid, int amount, int capacity, Runnable changeListener){
        super(fluid, amount, capacity);
        this.changeListener = changeListener;
    }
    
    @Override
    protected void onContentsChanged(){
        super.onContentsChanged();
        this.changeListener.run();
    }
    
    public FluidTank copyWithoutListener(){
        return new FluidTank(this.getFluid(), this.getCapacity());
    }
}
