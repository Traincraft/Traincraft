package src.train.common.core.handlers;

import java.util.EnumSet;
import java.util.Random;

import net.minecraft.world.World;

import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class ServerTickHandler implements ITickHandler {
	private int windTicker = 0;

	private static Random rand = new Random();
	public static int windStrength = 10 + rand.nextInt(10);

	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData) {
		if (type.contains(TickType.WORLD)) {
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

	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData) {

	}

	@Override
	public EnumSet<TickType> ticks() {
		return EnumSet.of(TickType.WORLD);
	}

	@Override
	public String getLabel() {
		return null;
	}
}