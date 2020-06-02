package traincraft.compat.commoncapabilities;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.Constants;
import org.cyclops.commoncapabilities.api.capability.temperature.ITemperature;
import org.cyclops.commoncapabilities.capability.temperature.TemperatureConfig;
import traincraft.api.AbstractRollingStock;
import traincraft.api.ITemperatureSupplier;
import traincraft.compat.ITraincraftCompatibility;
import traincraft.tile.BaseTile;

import javax.annotation.Nullable;

public class CommonCapabilitiesCompatibility implements ITraincraftCompatibility {
    
    @Override
    public boolean hasRollingStockCapability(AbstractRollingStock<?> rollingStock, Capability<?> capability, @Nullable EnumFacing facing) {
        return rollingStock instanceof ITemperatureSupplier;
    }
    
    @Override
    public <T> T getRollingStockCapability(AbstractRollingStock<?> rollingStock, Capability<T> capability, @Nullable EnumFacing facing) {
        if(capability == TemperatureConfig.CAPABILITY){
            if(rollingStock instanceof ITemperatureSupplier){
                return TemperatureConfig.CAPABILITY.cast(new GenericTemperature((ITemperatureSupplier) rollingStock));
            }
        }
        return null;
    }
    
    @Override
    public void writeRollingStockNBT(AbstractRollingStock<?> rollingStock, NBTTagCompound nbt, BaseTile.NBTState state) {
        if(rollingStock.hasCapability(TemperatureConfig.CAPABILITY, null)){
            ITemperature capability = rollingStock.getCapability(TemperatureConfig.CAPABILITY, null);
            if(capability != null){
                NBTTagCompound temperatureNBT = new NBTTagCompound();
                temperatureNBT.setDouble("temperature", capability.getTemperature());
                nbt.setTag("temperature", temperatureNBT);
            }
        }
    }
    
    @Override
    public void readRollingStockNBT(AbstractRollingStock<?> rollingStock, NBTTagCompound nbt, BaseTile.NBTState state) {
        if(rollingStock.hasCapability(TemperatureConfig.CAPABILITY, null) && rollingStock instanceof ITemperatureSupplier){
            ITemperature capability = rollingStock.getCapability(TemperatureConfig.CAPABILITY, null);
            if(capability != null && nbt.hasKey("temperature", Constants.NBT.TAG_COMPOUND)){
                NBTTagCompound temperatureNBT = nbt.getCompoundTag("temperature");
                ((ITemperatureSupplier) rollingStock).setTemperature(temperatureNBT.getDouble("temperature"));
            }
        }
    }
}
