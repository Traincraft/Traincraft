package traincraft.api;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidTank;

public class FluidTankTyped extends FluidTank {
    
    @Nonnull
    private Fluid validFluid;
    
    public FluidTankTyped(@Nonnull Fluid validFluid, int capacity) {
        super(capacity);
        this.validFluid = validFluid;
    }
    
    public FluidTankTyped(@Nonnull Fluid validFluid, @Nullable FluidStack fluidStack, int capacity) {
        super(fluidStack, capacity);
        this.validFluid = validFluid;
    }
    
    public FluidTankTyped(@Nonnull Fluid validFluid, Fluid fluid, int amount, int capacity) {
        super(fluid, amount, capacity);
        this.validFluid = validFluid;
    }
    
    @Override
    public boolean canFillFluidType(FluidStack fluid) {
        return this.validFluid.equals(fluid.getFluid()) && super.canFillFluidType(fluid);
    }
    
    @Override
    public boolean canDrainFluidType(@Nullable FluidStack fluid) {
        return (fluid == null || this.validFluid.equals(fluid.getFluid())) && super.canDrainFluidType(fluid);
    }
}
