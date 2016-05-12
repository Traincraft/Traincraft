/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package src.train.common.generation;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import src.train.common.core.handlers.ConfigHandler;
import src.train.common.library.BlockIDs;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenWorld implements IWorldGenerator {

	WorldGenOres oilSands;
	WorldGenOres petroleum;
	WorldGenOres copper;

	public WorldGenWorld() {}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		copper = new WorldGenOres(BlockIDs.oreTC.block, 0, 6);
		oilSands = new WorldGenOres(BlockIDs.oreTC.block, 1, 20);
		petroleum = new WorldGenOres(BlockIDs.oreTC.block, 2, 14);

		if (ConfigHandler.ORE_GEN) {
			oilSands.generateVeins(world, random, chunkX * 16, chunkZ * 16, 2, 60, 6);
			petroleum.generateVeins(world, random, chunkX * 16, chunkZ * 16, 3, 44, 8);
		}
		if (ConfigHandler.COPPER_ORE_GEN) {
			copper.generateVeins(world, random, chunkX * 16, chunkZ * 16, 4, 44, 8);
		}
	}
}
