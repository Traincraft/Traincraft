package train.common.api;

import net.minecraft.item.Item;
import net.minecraft.world.World;
import scala.actors.threadpool.Arrays;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public abstract class TrainRecord {

    public List<String> skins = new ArrayList<>();

    public abstract String getName();

    public abstract String getInternalName();

    public abstract Item getItem();

    public abstract String getTrainType();

    public abstract int getMHP();

    public abstract int getMaxSpeed();

    public abstract double getMass();

    public abstract int getFuelConsumption();

    public abstract int getWaterConsumption();

    public abstract int getHeatingTime();

    public abstract double getAccelerationRate();

    public abstract double getBrakeRate();

    public abstract int getTankCapacity();

    public abstract List getColors();

    public List<String> getLiveries(){
        if(skins.size()==0 && getColors()!=null){
            skins=getColors();
        }
        return skins;
    }

    public abstract double getBogieLocoPosition();

    public abstract Class getEntityClass();

    public abstract int getGuiRenderScale();

    public abstract String getAdditionnalTooltip();

    public abstract int getCargoCapacity();

    public abstract AbstractTrains getEntity(World world);

    public abstract AbstractTrains getEntity(World world, double x, double y, double z);




    public static TrainRecord makeEntry(String entryName, String internalName, Class entityClass, Item item, String trainType, int MHP, int maxSpeed, double mass, int fuelConsumption, int waterConsumption, int heatingTime, double accelerationRate, double brakeRate, int tankCapacity, String[] colors, int guiRenderScale, double bogieLocoPosition){
        return makeEntry(entryName, internalName, entityClass, item, trainType, MHP, maxSpeed, mass, fuelConsumption, waterConsumption, heatingTime, accelerationRate, brakeRate, tankCapacity,0, colors, guiRenderScale, bogieLocoPosition, "");
    }

    public static TrainRecord makeEntry(String entryName, String internalName, Class entityClass, Item item, String trainType, int MHP, int maxSpeed, double mass, int fuelConsumption, int waterConsumption, int heatingTime, double accelerationRate, double brakeRate, int tankCapacity, String[] colors, int guiRenderScale, double bogieLocoPositions, String additionnalTooltip){
        return makeEntry(entryName, internalName, entityClass, item, trainType, MHP, maxSpeed, mass, fuelConsumption, waterConsumption, heatingTime, accelerationRate, brakeRate, tankCapacity,0, colors, guiRenderScale, bogieLocoPositions, additionnalTooltip);
    }

    public static TrainRecord makeEntry(String entryName, String internalName,Class entityClass, Item item, String trainType, double mass, String[] colors, int guiRenderScale, int cargoCapacity, String additionnalTooltip){
        return makeEntry(entryName, internalName, entityClass, item, trainType, 0, 0, mass, 0, 0, 0, 0, 0, 0,cargoCapacity, colors, guiRenderScale, 0, additionnalTooltip);
    }

    public static TrainRecord makeEntry(final String entryName, final String internalName, final Class entityClass, final Item item, final String trainType, final int MHP, final int maxSpeed, final double mass, final int fuelConsumption, final int waterConsumption, final int heatingTime, final double accelerationRate, final double brakeRate, final int tankCapacity, final int cargoCapacity, final String[] colors, final int guiRenderScale, final double bogieLocoPositions, final String additionnalTooltip){
        return new TrainRecord() {
            @Override
            public String getName() {
                return entryName;
            }

            @Override
            public String getInternalName() {
                return internalName;
            }

            @Override
            public Item getItem() {
                return item;
            }

            @Override
            public String getTrainType() {
                return trainType;
            }

            @Override
            public int getMHP() {
                return MHP;
            }

            @Override
            public int getMaxSpeed() {
                return maxSpeed;
            }

            @Override
            public double getMass() {
                return mass;
            }

            @Override
            public int getFuelConsumption() {
                return fuelConsumption;
            }

            @Override
            public int getWaterConsumption() {
                return waterConsumption;
            }

            @Override
            public int getHeatingTime() {
                return heatingTime;
            }

            @Override
            public double getAccelerationRate() {
                return accelerationRate;
            }

            @Override
            public double getBrakeRate() {
                return brakeRate;
            }

            @Override
            public int getTankCapacity() {
                return tankCapacity;
            }

            @Override
            public List<String> getColors() {
                if(colors==null){
                    return new ArrayList<>();
                } else {
                    return Arrays.asList(colors);
                }
            }

            @Override
            public double getBogieLocoPosition() {
                return bogieLocoPositions;
            }

            @Override
            public Class getEntityClass() {
                return entityClass;
            }

            @Override
            public int getGuiRenderScale() {
                return guiRenderScale;
            }

            @Override
            public String getAdditionnalTooltip() {
                return additionnalTooltip;
            }

            @Override
            public int getCargoCapacity() {
                return cargoCapacity;
            }

            @Override
            public AbstractTrains getEntity(World world) {
                try {
                    return (AbstractTrains) entityClass.getConstructor(World.class).newInstance(world);
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (SecurityException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                }
                return null;
            }

            @Override
            public AbstractTrains getEntity(World world, double x, double y, double z) {
                try {
                    if(world.isRemote){
                        entityClass.getConstructor(World.class).newInstance(world);
                    } else {
                        return (AbstractTrains) entityClass.getConstructor(World.class, double.class, double.class, double.class).newInstance(world, x, y, z);
                    }
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (SecurityException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                }
                return null;
            }
        };
    }

}
