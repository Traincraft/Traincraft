package traincraft.event;

import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import train.common.Traincraft;
import traincraft.capabilities.CapabilityWorldWind;
import traincraft.capabilities.WorldWind;
import traincraft.save.TCDimensionSaveData;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

@Mod.EventBusSubscriber(modid = Traincraft.MOD_ID)
public class TCEvents {
    
    public static TCDimensionSaveData getSaveData(World world){
        return (TCDimensionSaveData) world.getPerWorldStorage().getOrLoadData(TCDimensionSaveData.class, Traincraft.MOD_ID);
    }
    
    @SubscribeEvent
    public static void worldAttachCapabilities(AttachCapabilitiesEvent<World> event){
        event.addCapability(new ResourceLocation(Traincraft.MOD_ID, "capability_world_wind"), new ICapabilityProvider() {
            @Override
            public boolean hasCapability(@Nonnull Capability<?> capability, @Nullable EnumFacing facing) {
                return capability == CapabilityWorldWind.WORLD_WIND;
            }
    
            @Nullable
            @Override
            public <T> T getCapability(@Nonnull Capability<T> capability, @Nullable EnumFacing facing) {
                TCDimensionSaveData saveData = getSaveData(event.getObject());
                return saveData != null ? CapabilityWorldWind.WORLD_WIND.cast(saveData.getWorldWind()) : capability.getDefaultInstance();
            }
        });
    }
    
    @SubscribeEvent
    public static void worldSave(WorldEvent.Load event){
        getSaveData(event.getWorld()); // create the save data on world load
    }
    
    @SubscribeEvent
    public static void worldTick(TickEvent.WorldTickEvent event){
        if(!event.world.isRemote){
            if(event.world.getTotalWorldTime() % 128 == 0){
                WorldWind worldWind = event.world.getCapability(CapabilityWorldWind.WORLD_WIND, null);
                if(worldWind != null){
                    int windStrength = worldWind.getWindStrength();
                    // original traincraft 1.7 algorithm
                    int upChance = 10;
                    int downChance = 10;
                    if (windStrength > 20) {
                        upChance -= windStrength - 20;
                    }
                    else if (windStrength < 10) {
                        downChance -= 10 - windStrength;
                    }
                    if (event.world.rand.nextInt(100) <= upChance) {
                        windStrength += 1;
                    }
                    if (event.world.rand.nextInt(100) <= downChance) {
                        windStrength -= 1;
                    }
                    
                    worldWind.setWindStrength(windStrength);
                }
            }
        }
    }
    
}
