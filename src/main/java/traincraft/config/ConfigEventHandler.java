package traincraft.config;

import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import traincraft.Traincraft;

public class ConfigEventHandler {

    @SubscribeEvent
    public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event){
        if(event.getModID().equals(Traincraft.MOD_ID)){
            Config.reload();
            if(Config.getConfig().hasChanged()){
            	Config.getConfig().save();
            }
        }
    }
    
}