package traincraft.entity.steamtrain;

import javax.annotation.Nullable;

import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.Vec2f;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.capability.IFluidHandler;
import traincraft.api.AbstractRollingStock;
import traincraft.api.FluidTankTyped;
import traincraft.api.Units;

public class LocomotiveSteamSmall extends AbstractRollingStock<LocomotiveSteamSmall> {
    
    public static final int TANK_CAPACITY = 5000;
    
    private final FluidTankTyped fluidTank = new FluidTankTyped(FluidRegistry.WATER, TANK_CAPACITY);
    
    public LocomotiveSteamSmall(World worldIn) {
        super(worldIn);
    }
    
    public LocomotiveSteamSmall(World worldIn, double x, double y, double z) {
        super(worldIn, x, y, z);
    }
    
    @Override
    public double getAcceleration(AbstractRollingStock<?> rollingStock) {
        return 0.5D; // original value
    }
    
    @Override
    public double getBreakPower(AbstractRollingStock<?> rollingStock) {
        return 0.968D; // original value
    }
    
    @Override
    public double getMaxSpeed(AbstractRollingStock<?> rollingStock) {
        return Units.kmhToMs(45D);
    }
    
    @Override
    public double getMaxReverseSpeed(AbstractRollingStock<?> rollingStock) {
        return 0;
    }
    
    @Override
    public double getMass(AbstractRollingStock<?> rollingStock) {
        return 5000D;
    }
    
    @Override
    public Vec2f getFrontAxis(AbstractRollingStock<?> rollingStock) {
        return null;
    }
    
    @Override
    public Vec2f getBackAxis(AbstractRollingStock<?> rollingStock) {
        return null;
    }
    
    @Override
    public IFluidHandler getFluidTank(AbstractRollingStock<?> rollingStock, @Nullable EnumFacing side) {
        return this.fluidTank;
    }
}
