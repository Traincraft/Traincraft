package traincraft.api;

import com.google.gson.JsonObject;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import traincraft.renderer.TraincraftModel;

import java.io.File;
import java.util.List;
import java.util.Map;

public class WrapperSteamTrain extends WrapperRollingStock {
    
    private int waterCapacity = 5000;
    private double maximumTemperature;
    
    @Override
    public AbstractRollingStock<?> createEntity(World world){
        return new WrapperSteamTrainImpl(world);
    }
    
    @Override
    public AbstractRollingStock<?> createEntity(World world, double x, double y, double z){
        return new WrapperSteamTrainImpl(world, x, y, z);
    }
    
    @Override
    public void loadFromFile(Side side, File file, JsonObject root){
        super.loadFromFile(side, file, root);
        
        if(root.has("waterCapacity")){
            this.waterCapacity = root.get("waterCapacity").getAsInt();
        }
        
        if(root.has("maxTemperature")){
            this.maximumTemperature = root.get("maxTemperature").getAsDouble();
        }
    }
    
    public int getWaterCapacity(){
        return this.waterCapacity;
    }
    
    public double getMaximumTemperature(){
        return this.maximumTemperature;
    }
    
    public class WrapperSteamTrainImpl extends LocomotiveSteam<WrapperSteamTrainImpl> {
    
        public WrapperSteamTrainImpl(World worldIn){
            super(worldIn);
        }
    
        public WrapperSteamTrainImpl(World worldIn, double x, double y, double z){
            super(worldIn, x, y, z);
        }
    
        @Override
        public Vec3d getSize(AbstractRollingStock<?> rollingStock){
            return WrapperSteamTrain.this.getSize();
        }
    
        @Override
        public double getAcceleration(AbstractRollingStock<?> rollingStock){
            return WrapperSteamTrain.this.getAcceleration();
        }
    
        @Override
        public double getBreakPower(AbstractRollingStock<?> rollingStock){
            return WrapperSteamTrain.this.getBreakPower();
        }
    
        @Override
        public double getMaxSpeed(AbstractRollingStock<?> rollingStock){
            return WrapperSteamTrain.this.getMaxSpeed();
        }
    
        @Override
        public double getMaxReverseSpeed(AbstractRollingStock<?> rollingStock){
            return WrapperSteamTrain.this.getMaxReverseSpeed();
        }
    
        @Override
        public double getMass(AbstractRollingStock<?> rollingStock){
            return WrapperSteamTrain.this.getMass();
        }
    
        @Override
        public void registerSkins(AbstractRollingStock<?> rollingStock, Map<String, ResourceLocation> skins){
            super.registerSkins(rollingStock, skins);
            skins.putAll(WrapperSteamTrain.this.getSkins());
        }
    
        @Override
        public void registerSeats(AbstractRollingStock<?> rollingStock, List<PassengerSeat> seats){
            super.registerSeats(rollingStock, seats);
            seats.addAll(WrapperSteamTrain.this.getSeats());
        }
    
        @Override
        public TraincraftModel getModel(AbstractRollingStock<?> rollingStock){
            return WrapperSteamTrain.this.getModel();
        }
    
        @Override
        public void addAxes(AbstractRollingStock<?> rollingStock, List<Vec3d> axes){
            super.addAxes(rollingStock, axes);
            axes.addAll(WrapperSteamTrain.this.getAxes());
        }
    
        @Override
        public double getMaximumTemperature(){
            return WrapperSteamTrain.this.getMaximumTemperature();
        }
    
        @Override
        protected int getWaterTankCapacity(){
            return WrapperSteamTrain.this.getWaterCapacity();
        }
    }
    
}
