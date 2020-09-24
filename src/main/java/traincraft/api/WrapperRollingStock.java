/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("WrapperRollingStock.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.api;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import org.apache.commons.io.FilenameUtils;
import traincraft.Traincraft;
import traincraft.renderer.TraincraftModel;

import java.io.File;
import java.util.*;

public class WrapperRollingStock implements IWrapperAddon<AbstractRollingStock<?>> {
    
    private final List<String> description = new ArrayList<>();
    private final Map<String, ResourceLocation> skins = new HashMap<>();
    private final List<PassengerSeat> seats = new ArrayList<>();
    private final List<Vec3d> axes = new ArrayList<>();
    private ResourceLocation id;
    private String name;
    private TraincraftModel model;
    private Vec3d modelScale = new Vec3d(1.0D, 1.0D, 1.0D), modelOffset = new Vec3d(0.0D, 0.0D, 0.0D), modelRotation = new Vec3d(0.0D, 0.0D, 0.0D);
    private Vec3d size = new Vec3d(0.98F, 0.98F, 0.98F);
    private double acceleration, breakPower, maxSpeed, maxReverseSpeed, mass;
    
    @Override
    public String toString(){
        return new StringJoiner(", ", WrapperRollingStock.class.getSimpleName() + "[", "]")
            .add("name='" + name + "'")
            .add("description=" + description)
            .add("model=" + model)
            .add("modelScale=" + modelScale)
            .add("modelOffset=" + modelOffset)
            .add("modelRotation=" + modelRotation)
            .add("size=" + size)
            .add("acceleration=" + acceleration)
            .add("breakPower=" + breakPower)
            .add("maxSpeed=" + maxSpeed)
            .add("maxReverseSpeed=" + maxReverseSpeed)
            .add("mass=" + mass)
            .add("skins=" + skins)
            .add("seats=" + seats)
            .add("axes=" + axes)
            .toString();
    }
    
    public AbstractRollingStock<?> createEntity(World world){
        return new WrapperRollingStockEntityImpl(world);
    }
    
    public AbstractRollingStock<?> createEntity(World world, double x, double y, double z){
        return new WrapperRollingStockEntityImpl(world, x, y, z);
    }
    
    // todo to be implemented
    @Override
    public Item createItem(){
        return null;
    }
    
    @Override
    public void loadFromFile(Side side, File file, JsonObject root){
        // general information
        if(root.has("id")){
            this.setId(new ResourceLocation(root.get("id").getAsString()));
        } else{
            Traincraft.LOGGER.error(String.format("Can't load rolling stock from '%s': Missing id", file));
            return;
        }
        if(root.has("name")){
            this.setName(root.get("name").getAsString());
        }
        if(root.has("desc")){
            if(root.get("desc").isJsonArray()){
                for(JsonElement line : root.get("desc").getAsJsonArray()){
                    this.addDescriptionLine(line.getAsString());
                }
            } else{
                this.addDescriptionLine(root.get("desc").getAsString());
            }
        }
    
        // model information
        if(root.has("model") && root.get("model").isJsonObject()){
            JsonObject model = root.get("model").getAsJsonObject();
            if(model.has("location")){
                String location = model.get("location").getAsString();
                if(FilenameUtils.isExtension(location, new String[]{"json", "jtmt"})){
                    this.setModel(TCUtil.loadModelFromJTMT(TraincraftAddonLoader.JSON_PARSER, location));
                } else{
                    this.setModel(TCUtil.loadModelFromJTMT(new ResourceLocation(location)));
                }
            }
            if(model.has("scale")){
                if(model.get("scale").isJsonArray()){ // array with 3 double as x, y, z
                    JsonArray scaleArray = model.get("scale").getAsJsonArray();
                    if(scaleArray.size() == 3){
                        this.setModelScale(new Vec3d(scaleArray.get(0).getAsDouble(), scaleArray.get(1).getAsDouble(), scaleArray.get(2).getAsDouble()));
                    }
                } else{ // single value for all three values
                    double scale = model.get("scale").getAsDouble();
                    this.setModelScale(new Vec3d(scale, scale, scale));
                }
            }
            if(model.has("translate")){
                if(model.get("translate").isJsonArray()){ // array with 3 double as x, y, z
                    JsonArray translateArray = model.get("translate").getAsJsonArray();
                    if(translateArray.size() == 3){
                        this.setModelOffset(new Vec3d(translateArray.get(0).getAsDouble(), translateArray.get(1).getAsDouble(), translateArray.get(2).getAsDouble()));
                    }
                } else{ // single value for all three values
                    double translate = model.get("translate").getAsDouble();
                    this.setModelOffset(new Vec3d(translate, translate, translate));
                }
            }
            if(model.has("rotation")){
                if(model.get("rotation").isJsonArray()){ // array with 3 double as x, y, z
                    JsonArray rotationArray = model.get("rotation").getAsJsonArray();
                    if(rotationArray.size() == 3){
                        this.setModelRotation(new Vec3d(rotationArray.get(0).getAsDouble(), rotationArray.get(1).getAsDouble(), rotationArray.get(2).getAsDouble()));
                    }
                } else{ // single value for all three values
                    double rotation = model.get("rotation").getAsDouble();
                    this.setModelRotation(new Vec3d(rotation, rotation, rotation));
                }
            }
        }
    
        // actual rolling stock values
        if(root.has("size")){
            if(root.get("size").isJsonArray()){ // array with 3 double as x, y, z
                JsonArray sizeArray = root.get("size").getAsJsonArray();
                if(sizeArray.size() == 3){
                    this.setSize(new Vec3d(sizeArray.get(0).getAsDouble(), sizeArray.get(1).getAsDouble(), sizeArray.get(2).getAsDouble()));
                }
            } else{ // single value for all three values
                double size = root.get("size").getAsDouble();
                this.setSize(new Vec3d(size, size, size));
            }
        }
        if(root.has("acceleration")){
            this.setAcceleration(root.get("acceleration").getAsDouble());
        }
        if(root.has("breakPower")){
            this.setBreakPower(root.get("breakPower").getAsDouble());
        }
        if(root.has("maxSpeed")){
            this.setMaxSpeed(root.get("maxSpeed").getAsDouble());
        }
        if(root.has("maxReverseSpeed")){
            this.setMaxReverseSpeed(root.get("maxReverseSpeed").getAsDouble());
        }
        if(root.has("mass")){
            this.setMass(root.get("mass").getAsDouble());
        }
        if(root.has("skins")){
            if(root.get("skins").isJsonObject()){
                for(Map.Entry<String, JsonElement> entry : root.get("skins").getAsJsonObject().entrySet()){
                    if(entry.getValue().isJsonPrimitive()){
                        String name = entry.getKey();
                        String path = entry.getValue().getAsString();
                        ResourceLocation resourceLocation;
                        if(FilenameUtils.isExtension(path, "png")){
                            // load as external file
                            resourceLocation = TraincraftAddonLoader.loadFileTexture(new File(file.getParentFile(), path));
                        } else{
                            // load as internal resource location
                            resourceLocation = new ResourceLocation(path);
                        }
                        this.addSkin(name, resourceLocation);
                    }
                }
            }
        }
        if(root.has("seats")){
            if(root.get("seats").isJsonArray()){
                for(JsonElement seatElement : root.get("seats").getAsJsonArray()){
                    if(seatElement.isJsonArray()){
                        JsonArray seatArray = seatElement.getAsJsonArray();
                        if(seatArray.size() == 6){
                            this.addSeat(new PassengerSeat(new AxisAlignedBB(
                                seatArray.get(0).getAsDouble(),
                                seatArray.get(1).getAsDouble(),
                                seatArray.get(2).getAsDouble(),
                                seatArray.get(3).getAsDouble(),
                                seatArray.get(4).getAsDouble(),
                                seatArray.get(5).getAsDouble()
                            )));
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public ResourceLocation getId(){
        return id;
    }
    
    public void setId(ResourceLocation id){
        this.id = id;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public List<String> getDescription(){
        return description;
    }
    
    public void addDescriptionLine(String line){
        this.description.add(line);
    }
    
    public TraincraftModel getModel(){
        return model;
    }
    
    public void setModel(TraincraftModel model){
        this.model = model;
    }
    
    public Vec3d getModelScale(){
        return modelScale;
    }
    
    public void setModelScale(Vec3d modelScale){
        this.modelScale = modelScale;
    }
    
    public Vec3d getModelOffset(){
        return modelOffset;
    }
    
    public void setModelOffset(Vec3d modelOffset){
        this.modelOffset = modelOffset;
    }
    
    public Vec3d getModelRotation(){
        return modelRotation;
    }
    
    public void setModelRotation(Vec3d modelRotation){
        this.modelRotation = modelRotation;
    }
    
    public Vec3d getSize(){
        return size;
    }
    
    public void setSize(Vec3d size){
        this.size = size;
    }
    
    public double getAcceleration(){
        return acceleration;
    }
    
    public void setAcceleration(double acceleration){
        this.acceleration = acceleration;
    }
    
    public double getBreakPower(){
        return breakPower;
    }
    
    public void setBreakPower(double breakPower){
        this.breakPower = breakPower;
    }
    
    public double getMaxSpeed(){
        return maxSpeed;
    }
    
    public void setMaxSpeed(double maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    
    public double getMaxReverseSpeed(){
        return maxReverseSpeed;
    }
    
    public void setMaxReverseSpeed(double maxReverseSpeed){
        this.maxReverseSpeed = maxReverseSpeed;
    }
    
    public double getMass(){
        return mass;
    }
    
    public void setMass(double mass){
        this.mass = mass;
    }
    
    public Map<String, ResourceLocation> getSkins(){
        return skins;
    }
    
    public void addSkin(String name, ResourceLocation location){
        this.skins.put(name, location);
    }
    
    public List<PassengerSeat> getSeats(){
        return seats;
    }
    
    public void addSeat(PassengerSeat seat){
        this.seats.add(seat);
    }
    
    public List<Vec3d> getAxes(){
        return axes;
    }
    
    public void addAxis(Vec3d axis){
        this.axes.add(axis);
    }
    
    public class WrapperRollingStockEntityImpl<E extends WrapperRollingStockEntityImpl<E>> extends AbstractRollingStock<E> {
        
        public WrapperRollingStockEntityImpl(World world){
            super(world);
        }
        
        public WrapperRollingStockEntityImpl(World world, double x, double y, double z){
            super(world, x, y, z);
        }
        
        @Override
        public Vec3d getSize(AbstractRollingStock<?> rollingStock){
            return WrapperRollingStock.this.getSize();
        }
        
        @Override
        public double getAcceleration(AbstractRollingStock<?> rollingStock){
            return WrapperRollingStock.this.getAcceleration();
        }
        
        @Override
        public double getBreakPower(AbstractRollingStock<?> rollingStock){
            return WrapperRollingStock.this.getBreakPower();
        }
        
        @Override
        public double getMaxSpeed(AbstractRollingStock<?> rollingStock){
            return WrapperRollingStock.this.getMaxSpeed();
        }
        
        @Override
        public double getMaxReverseSpeed(AbstractRollingStock<?> rollingStock){
            return WrapperRollingStock.this.getMaxReverseSpeed();
        }
        
        @Override
        public double getMass(AbstractRollingStock<?> rollingStock){
            return WrapperRollingStock.this.getMass();
        }
        
        @Override
        public void registerSkins(AbstractRollingStock<?> rollingStock, Map<String, ResourceLocation> skins){
            super.registerSkins(rollingStock, skins);
            skins.putAll(WrapperRollingStock.this.getSkins());
        }
        
        @Override
        public void registerSeats(AbstractRollingStock<?> rollingStock, List<PassengerSeat> seats){
            super.registerSeats(rollingStock, seats);
            seats.addAll(WrapperRollingStock.this.getSeats());
        }
        
        @Override
        public TraincraftModel getModel(AbstractRollingStock<?> rollingStock){
            return WrapperRollingStock.this.getModel();
        }
        
        @Override
        public void addAxes(AbstractRollingStock<?> rollingStock, List<Vec3d> axes){
            super.addAxes(rollingStock, axes);
            axes.addAll(WrapperRollingStock.this.getAxes());
        }
    }
}
