package si.meansoft.traincraft.events;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

/**
 * @author canitzp
 */
public class Events{

    public static void init(FMLInitializationEvent event){
        registerEvent(MinecartMovement.class);
    }

    private static void registerEvent(Class c){
        MinecraftForge.EVENT_BUS.register(c);
    }

}
