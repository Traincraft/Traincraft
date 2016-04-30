package src.train.common.core.handlers;

import java.util.EnumSet;
import java.util.Random;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.world.World;

public class ServerTickHandler extends TickEvent {
	private int windTicker = 0;

	private static Random rand = new Random();
	public static int windStrength = 10 + rand.nextInt(10);


	public ServerTickHandler() {
		super(Type.WORLD, Side.SERVER, Phase.START);
	}

	@SubscribeEvent
	public void onServerTickHandler(EnumSet<Type> type, Object... tickData) {
		if (type.contains(Type.WORLD)) {
			World world = (World) tickData[0];
			if (windTicker % 128 == 0) {
				updateWind(world);
			}
			windTicker += 1;
		}

	}

	private static void updateWind(World world) {
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