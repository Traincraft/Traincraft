package traincraft.entity.train.steam.small;

import java.util.List;
import java.util.Map;

import javax.annotation.Nullable;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.capability.IFluidHandler;
import traincraft.Traincraft;
import traincraft.api.AbstractRollingStock;
import traincraft.api.FluidTankTyped;
import traincraft.api.PassengerSeat;
import traincraft.api.Units;
import traincraft.renderer.TraincraftModel;

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
        return new Vec3d(1.04D, 1.856D, 2.2D);
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
        skins.put("red", new ResourceLocation(Traincraft.MOD_ID, "textures/rolling_stock/trains/steam/small_red.png"));
        skins.put("green", new ResourceLocation(Traincraft.MOD_ID, "textures/rolling_stock/trains/steam/small_green.png"));
        skins.put("blue", new ResourceLocation(Traincraft.MOD_ID, "textures/rolling_stock/trains/steam/small_blue.png"));
        skins.put("yellow", new ResourceLocation(Traincraft.MOD_ID, "textures/rolling_stock/trains/steam/small_yellow.png"));
        skins.put("black", new ResourceLocation(Traincraft.MOD_ID, "textures/rolling_stock/trains/steam/small_black.png"));
    }
    
    @Override
    public void registerSeats(AbstractRollingStock<?> rollingStock, List<PassengerSeat> seats) {
        seats.add(new PassengerSeat(new AxisAlignedBB(-0.5D, 0, -0.5D, 0.5D, 0.5D, 0.5D)));
    }
    
    @Override
    public TraincraftModel getModel(AbstractRollingStock<?> rollingStock) {
        return MODEL;
    }
    
    @Override
    public float getModelScale(AbstractRollingStock<?> rollingStock) {
        return 0.8F;
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
