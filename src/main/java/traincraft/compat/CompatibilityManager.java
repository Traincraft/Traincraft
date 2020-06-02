package traincraft.compat;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.fml.common.Loader;
import traincraft.api.AbstractRollingStock;
import traincraft.compat.commoncapabilities.CommonCapabilitiesCompatibility;
import traincraft.tile.BaseTile;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CompatibilityManager {
    
    private static final List<ITraincraftCompatibility> COMPATS = new ArrayList<>();
    
    static {
        if(Loader.isModLoaded("commoncapabilities")){
            registerCompatibility(new CommonCapabilitiesCompatibility());
        }
    }
    
    public static void registerCompatibility(ITraincraftCompatibility traincraftCompatibility){
        COMPATS.add(traincraftCompatibility);
    }
    
    public static boolean hasRollingStockCapability(AbstractRollingStock<?> rollingStock, Capability<?> capability, @Nullable EnumFacing facing){
        return COMPATS.stream().anyMatch(traincraftCompatibility -> traincraftCompatibility.hasRollingStockCapability(rollingStock, capability, facing));
    }
    
    public static <T> T getRollingStockCapability(AbstractRollingStock<?> rollingStock, Capability<T> capability, @Nullable EnumFacing facing){
        return COMPATS.stream().map(compat -> compat.getRollingStockCapability(rollingStock, capability, facing))
                      .filter(Objects::nonNull)
                      .findFirst()
                      .orElse(null);
    }
    
    public static void writeRollingStockNBT(AbstractRollingStock<?> rollingStock, NBTTagCompound nbt, BaseTile.NBTState state){
        COMPATS.forEach(traincraftCompatibility -> traincraftCompatibility.writeRollingStockNBT(rollingStock, nbt, state));
    }
    
    public static void readRollingStockNBT(AbstractRollingStock<?> rollingStock, NBTTagCompound nbt, BaseTile.NBTState state){
        COMPATS.forEach(traincraftCompatibility -> traincraftCompatibility.readRollingStockNBT(rollingStock, nbt, state));
    }
    
}
