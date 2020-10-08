package ebf.tim.blocks;

import cpw.mods.fml.common.IWorldGenerator;
import ebf.tim.registry.TiMFluids;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

/**
 * <h1>Ore generation</h1>
 * spawns liquids and ores in the world.
 * @author Justice
 * @author Eternal Blue Flame
 */
public class OreGen implements IWorldGenerator{
	/**
	 *<h2>Ore-gen management</h2>
	 * handles generation of ores and fluids in the world.
	 * courtesy of Justice.
     */
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		if (world.provider.dimensionId ==0) {
			for (int i = 0; i < 3; i++) {
				new WorldGenMinable(TiMFluids.fluidOil.getBlock(), 4 + random.nextInt(30 - 4), Blocks.stone).generate(world, random, chunkX * 16 + random.nextInt(16), random.nextInt(27) + 3, chunkZ * 16 + random.nextInt(16));
			}
		}
	}

}
