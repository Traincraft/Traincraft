/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.generation;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import train.common.core.handlers.ConfigHandler;
import train.common.core.handlers.RetrogenHandler;
import train.common.library.BlockIDs;

import java.util.Random;

public class WorldGenWorld implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		RetrogenHandler.gennedChunks.add(new RetrogenHandler.ChunkData(chunkX, chunkZ, world.provider.dimensionId));
		if(world.provider.terrainType != WorldType.FLAT){

			if (ConfigHandler.ORE_GEN) {
				addOreSpawn(BlockIDs.oreTC.block, 1, Blocks.sand, world, random, chunkX * 16, chunkZ * 16, 10, 2, 25, 75);
				addOreSpawn(BlockIDs.oreTC.block, 2, Blocks.stone, world, random, chunkX * 16, chunkZ * 16, 14, 3, 10, 50);
			}
			if (ConfigHandler.COPPER_ORE_GEN) {
				addOreSpawn(BlockIDs.oreTC.block, 0, Blocks.stone, world, random, chunkX * 16, chunkZ * 16, 6, 4, 5, 50);
			}
		}
	}

	private void addOreSpawn(Block block, int meta, Block blockIn, World world, Random random, int blockXPos, int blockZPos, int maxVeinSize, int chancesToSpawn, int minY, int maxY){
		if(maxY > minY){
			int yDiff = maxY - minY;
			for(int i = 0; i < chancesToSpawn; i++){
				int posX = blockXPos + random.nextInt(16);
				int posY = minY + random.nextInt(yDiff);
				int posZ = blockZPos + random.nextInt(16);
				new WorldGenMinable(block, meta, maxVeinSize, blockIn).generate(world, random, posX, posY, posZ);
			}
		}
	}
}
