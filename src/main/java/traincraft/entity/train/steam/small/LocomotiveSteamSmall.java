package traincraft.entity.train.steam.small;

import net.fexcraft.lib.tmt.ModelBase;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.capability.IFluidHandler;
import traincraft.Traincraft;
import traincraft.api.AbstractRollingStock;
import traincraft.api.FluidTankTyped;
import traincraft.api.Units;

import javax.annotation.Nullable;
import java.util.Map;

public class LocomotiveSteamSmall extends AbstractRollingStock<LocomotiveSteamSmall> {
    
    public static final int TANK_CAPACITY = 5000;
    private static final ModelSteamSmall MODEL = new ModelSteamSmall();
    
    private final FluidTankTyped fluidTank = new FluidTankTyped(FluidRegistry.WATER, TANK_CAPACITY);
    
    public LocomotiveSteamSmall(World worldIn) {
        super(worldIn);
    }
    
    public LocomotiveSteamSmall(World worldIn, double x, double y, double z) {
        super(worldIn, x, y, z);
    }
    
    @Override
    public Vec3d getSize(AbstractRollingStock<?> rollingStock) {
        return new Vec3d(1.3D, 2.32D, 2.75D);
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
    public void registerSkins(AbstractRollingStock<?> rollingStock, Map<String, ResourceLocation> skins) {
        skins.put("yellow", new ResourceLocation(Traincraft.MOD_ID, "textures/rolling_stock/trains/steam/small.png"));
    }
    
    @Override
    public ModelBase getModel(AbstractRollingStock<?> rollingStock) {
        return MODEL;
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
