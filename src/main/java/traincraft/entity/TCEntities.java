package traincraft.entity;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import traincraft.Traincraft;
import traincraft.api.AbstractRollingStock;
import traincraft.entity.train.steam.small.LocomotiveSteamSmall;
import traincraft.renderer.RendererRollingStock;

public class TCEntities {
    
    private static int entityIds = 0;
    
    public static void registerEntities(FMLPreInitializationEvent event){
        Traincraft.LOGGER.info("Registering Entities (Trains)");
        
        register(event, new ResourceLocation(Traincraft.MOD_ID, "locomotive_steam_small"), LocomotiveSteamSmall.class);
        
        Traincraft.LOGGER.info(String.format("Registered %d Entities", entityIds));
    }
    
    private static <T extends AbstractRollingStock<T>> void register(FMLPreInitializationEvent event, ResourceLocation resourceLocation, Class<T> clazz){
        EntityRegistry.registerModEntity(resourceLocation, clazz, resourceLocation.getPath(), entityIds++, Traincraft.INSTANCE, 64, 1, true);
        if(event.getSide() == Side.CLIENT){
            registerClient(clazz);
        }
    }
    
    private static <T extends AbstractRollingStock<T>> void registerClient(Class<T> clazz){
        RenderingRegistry.registerEntityRenderingHandler(clazz, RendererRollingStock::new);
    }
    
}
