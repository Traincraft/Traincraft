package traincraft.compat;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import traincraft.api.AbstractRollingStock;
import traincraft.tile.BaseTile;

import javax.annotation.Nullable;

public interface ITraincraftCompatibility {
    
    default boolean hasRollingStockCapability(AbstractRollingStock<?> rollingStock, Capability<?> capability, @Nullable EnumFacing facing){
        return false;
    }
    
    default  <T> T getRollingStockCapability(AbstractRollingStock<?> rollingStock, Capability<T> capability, @Nullable EnumFacing facing){
        return null;
    }
    
    default void writeRollingStockNBT(AbstractRollingStock<?> rollingStock, NBTTagCompound nbt, BaseTile.NBTState state){}
    
    default void readRollingStockNBT(AbstractRollingStock<?> rollingStock, NBTTagCompound nbt, BaseTile.NBTState state){}
    
}
