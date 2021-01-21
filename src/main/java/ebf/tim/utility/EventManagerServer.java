package ebf.tim.utility;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import ebf.tim.entities.EntitySeat;
import ebf.tim.entities.GenericRailTransport;
import net.minecraftforge.event.entity.EntityStruckByLightningEvent;

public class EventManagerServer {

    @SubscribeEvent
    @SuppressWarnings("unused")
    public void playerQuitEvent(PlayerEvent.PlayerLoggedOutEvent event){
        if (event.player.ridingEntity instanceof GenericRailTransport || event.player.ridingEntity instanceof EntitySeat){
            event.player.dismountEntity(event.player.ridingEntity);
        }
    }


    @SubscribeEvent
    @SuppressWarnings("unused")
    public void entityStruckByLightningEvent(EntityStruckByLightningEvent event) {
        if (event.entity instanceof GenericRailTransport){
            event.setCanceled(true);
        }
    }


}
