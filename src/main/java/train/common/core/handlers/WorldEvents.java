package train.common.core.handlers;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.world.World;

import java.util.EnumSet;
import java.util.Random;

public class WorldEvents{
	private int windTicker = 0;
	private static Random rand = new Random();
	public static int windStrength = 10 + rand.nextInt(10);

	@SubscribeEvent
	public void onWorldTick(TickEvent.WorldTickEvent handler){
		World world = handler.world;
		if(world.isRemote){
			if(windTicker % 128 == 0){
				updateWind();
			}
			windTicker += 1;
		}
	}

	private static void updateWind() {
		int upChance = 10;
		int downChance = 10;
		if (windStrength > 20) {
			upChance -= windStrength - 20;
		}
		if (windStrength < 10) {
			downChance -= 10 - windStrength;
		}
		if (rand.nextInt(100) <= upChance) {
			windStrength += 1;
		}
		if (rand.nextInt(100) <= downChance) {
			windStrength -= 1;
		}
	}
}