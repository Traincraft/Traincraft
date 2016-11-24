/*
 * This file ("WorldGen.java") is part of the Traincraft mod for Minecraft.
 * It is created by all persons that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/blob/master/LICENSE.md)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2016
 */

package si.meansoft.traincraft.gen;

import net.minecraft.block.Block;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author canitzp
 */
public class WorldGen implements IWorldGenerator {

    private static HashMap<Block, SpawnProps> blocksToSpawnInOverworld = new HashMap<Block, SpawnProps>();

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        if(world.getWorldType() != WorldType.FLAT){
            switch(world.provider.getDimension()){
                case 0: spawnOverworld(random, world, chunkX*16, chunkZ*16);
            }
        }
    }

    public void spawnOverworld(Random rnd, World world, int x, int z){
        for(Map.Entry entry : blocksToSpawnInOverworld.entrySet()){
            SpawnProps props = (SpawnProps) entry.getValue();
            addOreSpawn(new ItemStack((Block) entry.getKey()), props.blockToSpawnInside, world, rnd, x, z, props.veinSize, props.chance, props.minY, props.maxY);
        }
    }

    public void addOreSpawn(ItemStack stack, Block blockIn, World world, Random random, int blockXPos, int blockZPos, int maxVeinSize, int chancesToSpawn, int minY, int maxY){
        if(maxY > minY){
            int yDiff = maxY-minY;
            for(int i = 0; i < chancesToSpawn; i++){
                int posX = blockXPos+random.nextInt(16);
                int posY = minY+random.nextInt(yDiff);
                int posZ = blockZPos+random.nextInt(16);
                Block block = Block.getBlockFromItem(stack.getItem());
                new WorldGenMinable(block.getDefaultState(), maxVeinSize, BlockMatcher.forBlock(blockIn)).generate(world, random, new BlockPos(posX, posY, posZ));
            }
        }
    }

    /**
     * @param block The Block to spawn
     * @param minY The minimal height for the Block to spawn. e.g.: Coal=0
     * @param maxY The maximal height for the Block to spawn. e.g.: Coal=128
     * @param maxVeinSize The maximal amount of Blocks at one place. e.g.: Coal=17
     * @param chanceToSpawn The Chance to spawn the Block. e.g.: Coal=20
     * The example values you'll find in the class: 'net.minecraft.world.gen.ChunkProviderSettings'
     */
    public static void addBlockToSpawn(Block block, Block toSpawnInside, int minY, int maxY, int maxVeinSize, int chanceToSpawn){
        if(!blocksToSpawnInOverworld.containsKey(block))
            blocksToSpawnInOverworld.put(block, new SpawnProps(toSpawnInside, chanceToSpawn, maxY, minY, maxVeinSize));
    }

    public static class SpawnProps{
        public int minY, maxY, veinSize, chance;
        public Block blockToSpawnInside;
        public SpawnProps(Block blockToSpawnInside, int chance, int maxY, int minY, int veinSize) {
            this.chance = chance;
            this.maxY = maxY;
            this.minY = minY;
            this.veinSize = veinSize;
            this.blockToSpawnInside = blockToSpawnInside;
        }
    }

}
