package traincraft.events;

import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import train.common.Traincraft;
import traincraft.api.AbstractRollingStock;

@Mod.EventBusSubscriber(modid = Traincraft.MOD_ID)
public class Events {
    
    @SubscribeEvent
    public static void specificEntityInteractionEvent(PlayerInteractEvent.EntityInteractSpecific event){
        if(event.getTarget() instanceof AbstractRollingStock<?>){
            ((AbstractRollingStock<?>) event.getTarget()).onPlayerClick(event.getEntityPlayer(), event.getHand(), event.getLocalPos());
        }
    }
    
}
