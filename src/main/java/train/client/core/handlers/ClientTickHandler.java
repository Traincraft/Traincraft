package train.client.core.handlers;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import train.common.Traincraft;
import train.common.core.CommonProxy;
import train.common.core.util.MP3Player;

@Mod.EventBusSubscriber(modid = Traincraft.MOD_ID)
public class ClientTickHandler {

	@SubscribeEvent
	public static void tick(TickEvent event) {
		if(event.type == TickEvent.Type.CLIENT && event.phase == TickEvent.Phase.START){
			if (Minecraft.getMinecraft().world == null) { // fixes streaming after exiting a world
				for (MP3Player player : CommonProxy.playerList){
					if (player != null){
						player.stop();
					}
				}
				CommonProxy.playerList.clear();
			}
			/*if(!isHidden && Loader.isModLoaded("NotEnoughItems")) {
				if(mc.theWorld != null && mc.theWorld.playerEntities != null) {
					Traincraft.proxy.doNEICheck(new ItemStack(Block.getBlockFromName(Traincraft.MOD_ID + ":tcRail")));
					Traincraft.proxy.doNEICheck(new ItemStack(Block.getBlockFromName(Traincraft.MOD_ID + ":tcRailGag")));
					isHidden = true;
				}
			}*/
		}
	}

}