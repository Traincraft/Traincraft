package train.common.api;

import net.minecraft.item.Item;
import net.minecraft.world.World;

public interface TrainRecord {

    String getName();

    String getInternalName();

    Item getItem();

    String getTrainType();

    int getMHP();

    int getMaxSpeed();

    double getMass();

    int getFuelConsumption();

    int getWaterConsumption();

    int getHeatingTime();

    double getAccelerationRate();

    double getBrakeRate();

    int getTankCapacity();

    int[] getColors();

    double getBogieLocoPosition();

    Class getEntityClass();

    int getGuiRenderScale();

    String getAdditionnalTooltip();

    int getCargoCapacity();

    AbstractTrains getEntity(World world);

    AbstractTrains getEntity(World world, double x, double y, double z);
}
