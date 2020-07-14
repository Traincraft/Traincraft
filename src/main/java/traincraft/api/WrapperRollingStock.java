package traincraft.api;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import traincraft.renderer.TraincraftModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WrapperRollingStock {
    
    private String name;
    private List<String> description = new ArrayList<>();
    
    private TraincraftModel model;
    private Vec3d modelScale = new Vec3d(1.0D, 1.0D, 1.0D), modelOffset = new Vec3d(0.0D, 0.0D, 0.0D), modelRotation = new Vec3d(0.0D, 0.0D, 0.0D);
    
    private Vec3d size = new Vec3d(0.98F, 0.98F, 0.98F);
    private double acceleration, breakPower, maxSpeed, maxReverseSpeed, mass;
    private Map<String, ResourceLocation> skins = new HashMap<>();
    private List<PassengerSeat> seats = new ArrayList<>();
    private List<Vec3d> axes = new ArrayList<>();
    
    public AbstractRollingStock<?> createEntity(World world){
        return new WrapperRollingStockEntityImpl(world);
    }
    
    public AbstractRollingStock<?> createEntity(World world, double x, double y, double z){
        return new WrapperRollingStockEntityImpl(world, x, y, z);
    }
    
    // todo to be implemented
    public Item createItem(){
        return null;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public List<String> getDescription() {
        return description;
    }
    
    public void addDescriptionLine(String line){
        this.description.add(line);
    }
    
    public TraincraftModel getModel() {
        return model;
    }
    
    public void setModel(TraincraftModel model) {
        this.model = model;
    }
    
    public Vec3d getModelScale() {
        return modelScale;
    }
    
    public void setModelScale(Vec3d modelScale) {
        this.modelScale = modelScale;
    }
    
    public Vec3d getModelOffset() {
        return modelOffset;
    }
    
    public void setModelOffset(Vec3d modelOffset) {
        this.modelOffset = modelOffset;
    }
    
    public Vec3d getModelRotation() {
        return modelRotation;
    }
    
    public void setModelRotation(Vec3d modelRotation) {
        this.modelRotation = modelRotation;
    }
    
    public Vec3d getSize() {
        return size;
    }
    
    public void setSize(Vec3d size) {
        this.size = size;
    }
    
    public double getAcceleration() {
        return acceleration;
    }
    
    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }
    
    public double getBreakPower() {
        return breakPower;
    }
    
    public void setBreakPower(double breakPower) {
        this.breakPower = breakPower;
    }
    
    public double getMaxSpeed() {
        return maxSpeed;
    }
    
    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    
    public double getMaxReverseSpeed() {
        return maxReverseSpeed;
    }
    
    public void setMaxReverseSpeed(double maxReverseSpeed) {
        this.maxReverseSpeed = maxReverseSpeed;
    }
    
    public double getMass() {
        return mass;
    }
    
    public void setMass(double mass) {
        this.mass = mass;
    }
    
    public Map<String, ResourceLocation> getSkins() {
        return skins;
    }
    
    public void addSkin(String name, ResourceLocation location) {
        this.skins.put(name, location);
    }
    
    public List<PassengerSeat> getSeats() {
        return seats;
    }
    
    public void addSeat(PassengerSeat seat) {
        this.seats.add(seat);
    }
    
    public List<Vec3d> getAxes() {
        return axes;
    }
    
    public void addAxis(Vec3d axis){
        this.axes.add(axis);
    }
    
    private class WrapperRollingStockEntityImpl extends AbstractRollingStock<WrapperRollingStockEntityImpl> {
        
        public WrapperRollingStockEntityImpl(World world) {
            super(world);
        }
    
        public WrapperRollingStockEntityImpl(World world, double x, double y, double z) {
            super(world, x, y, z);
        }
    
        @Override
        public Vec3d getSize(AbstractRollingStock<?> rollingStock) {
            return WrapperRollingStock.this.getSize();
        }
    
        @Override
        public double getAcceleration(AbstractRollingStock<?> rollingStock) {
            return WrapperRollingStock.this.getAcceleration();
        }
    
        @Override
        public double getBreakPower(AbstractRollingStock<?> rollingStock) {
            return WrapperRollingStock.this.getBreakPower();
        }
    
        @Override
        public double getMaxSpeed(AbstractRollingStock<?> rollingStock) {
            return WrapperRollingStock.this.getMaxSpeed();
        }
    
        @Override
        public double getMaxReverseSpeed(AbstractRollingStock<?> rollingStock) {
            return WrapperRollingStock.this.getMaxReverseSpeed();
        }
    
        @Override
        public double getMass(AbstractRollingStock<?> rollingStock) {
            return WrapperRollingStock.this.getMass();
        }
    
        @Override
        public void registerSkins(AbstractRollingStock<?> rollingStock, Map<String, ResourceLocation> skins) {
            super.registerSkins(rollingStock, skins);
            skins.putAll(WrapperRollingStock.this.getSkins());
        }
    
        @Override
        public void registerSeats(AbstractRollingStock<?> rollingStock, List<PassengerSeat> seats) {
            super.registerSeats(rollingStock, seats);
            seats.addAll(WrapperRollingStock.this.getSeats());
        }
    
        @Override
        public TraincraftModel getModel(AbstractRollingStock<?> rollingStock) {
            return WrapperRollingStock.this.getModel();
        }
    
        @Override
        public void addAxes(AbstractRollingStock<?> rollingStock, List<Vec3d> axes) {
            super.addAxes(rollingStock, axes);
            axes.addAll(WrapperRollingStock.this.getAxes());
        }
    }
}
