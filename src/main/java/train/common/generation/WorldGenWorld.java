/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.generation;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;
import train.common.core.handlers.RetrogenHandler;

public class WorldGenWorld implements IWorldGenerator {

	private void addOreSpawn(IBlockState generateBlockState, IBlockState replaceBlockState, World world, Random random, int blockXPos, int blockZPos, int maxVeinSize, int chancesToSpawn, int minY, int maxY){
		if(maxY > minY){
			int yDiff = maxY - minY;
			for(int i = 0; i < chancesToSpawn; i++){
				int posX = blockXPos + random.nextInt(16);
				int posY = minY + random.nextInt(yDiff);
				int posZ = blockZPos + random.nextInt(16);
				new WorldGenMinable(generateBlockState, maxVeinSize, replaceBlockState::equals).generate(world, random, new BlockPos(posX, posY, posZ));
			}
		}
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		RetrogenHandler.gennedChunks.add(new RetrogenHandler.ChunkData(chunkX, chunkZ, world.provider.getDimension()));
		if(world.getWorldType() != WorldType.FLAT){
			/*if (ConfigHandler.ORE_GEN) {
				addOreSpawn(TCBlocks.OIL_SAND.getDefaultState(), Blocks.SAND.getDefaultState().withProperty(BlockSand.VARIANT, BlockSand.EnumType.SAND), world, random, chunkX * 16, chunkZ * 16, 10, 2, 25, 75);
				addOreSpawn(TCBlocks.PETROL_ORE.getDefaultState(), Blocks.STONE.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.STONE), world, random, chunkX * 16, chunkZ * 16, 14, 3, 10, 50);
			}
			if (ConfigHandler.COPPER_ORE_GEN) {
				addOreSpawn(TCBlocks.COPPER_ORE.getDefaultState(), Blocks.STONE.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.STONE), world, random, chunkX * 16, chunkZ * 16, 6, 4, 5, 50);
			}*/
		}
	}
}
