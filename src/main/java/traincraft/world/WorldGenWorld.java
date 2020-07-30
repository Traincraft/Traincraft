/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("WorldGenWorld.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.world;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class WorldGenWorld implements IWorldGenerator {
    
    public static final WorldGenWorld INSTANCE = new WorldGenWorld();
    
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider){
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
}
