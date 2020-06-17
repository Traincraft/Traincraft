package traincraft.api;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidTank;

import javax.annotation.Nullable;

public class FluidTankChangeListener extends FluidTankSerializable {
    
    private final Runnable changeListener;
    
    public FluidTankChangeListener(int capacity, Runnable changeListener) {
        super(capacity);
        this.changeListener = changeListener;
    }
    
    public FluidTankChangeListener(@Nullable FluidStack fluidStack, int capacity, Runnable changeListener) {
        super(fluidStack, capacity);
        this.changeListener = changeListener;
    }
    
    public FluidTankChangeListener(Fluid fluid, int amount, int capacity, Runnable changeListener) {
        super(fluid, amount, capacity);
        this.changeListener = changeListener;
    }
    
    @Override
    public int fillInternal(FluidStack resource, boolean doFill) {
        int i = super.fillInternal(resource, doFill);
        if(doFill) {
            this.onContentsChanged();
        }
        return i;
    }
    
    @Nullable
    @Override
    public FluidStack drainInternal(int maxDrain, boolean doDrain) {
        FluidStack fluidStack = super.drainInternal(maxDrain, doDrain);
        if(doDrain){
            this.onContentsChanged();
        }
        return fluidStack;
    }
    
    @Override
    protected void onContentsChanged() {
        super.onContentsChanged();
        this.changeListener.run();
    }
}
