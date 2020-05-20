package traincraft.api;

import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.energy.IEnergyStorage;
import net.minecraftforge.fluids.capability.IFluidHandler;
import net.minecraftforge.items.IItemHandler;

import javax.annotation.Nullable;
import java.util.Map;

public interface IRollingStock {
    
    /**
     * The uniq id as resource location for the rolling stock.
     * The 'path' should be your modid and the 'namespace' is the uniq name of the train.
     * eg: new ResourceLocation("traincraft", "test_train_1");
     * @return The ResourceLocation
     */
    ResourceLocation getId();
    
    default float getWidth(){
        return 0.98F;
    }
    
    default float getHeight(){
        return 1.98F;
    }
    
    double getAcceleration(AbstractRollingStock rollingStock);
    
    double getBreakPower(AbstractRollingStock rollingStock);
    
    double getMaxSpeed(AbstractRollingStock rollingStock);
    
    double getMaxReverseSpeed(AbstractRollingStock rollingStock);
    
    default void registerSkins(AbstractRollingStock rollingStock, Map<String, ResourceLocation> skins){}
    
    default IItemHandler getInventory(AbstractRollingStock rollingStock, @Nullable EnumFacing side){
        return null;
    }
    
    default IFluidHandler getFluidTank(AbstractRollingStock rollingStock, @Nullable EnumFacing side){
        return null;
    }
    
    default IEnergyStorage getEnergyStorage(AbstractRollingStock rollingStock, @Nullable EnumFacing side){
        return null;
    }
    
    
    
}
