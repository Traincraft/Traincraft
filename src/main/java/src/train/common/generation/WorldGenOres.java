/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package src.train.common.generation;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import src.train.common.library.BlockIDs;

public class WorldGenOres extends WorldGenerator {

	private int bID;
	private int meta;
	private int size;

	public WorldGenOres(int blockID, int metadata, int sizeOfVein) {
		this.bID = blockID;
		this.meta = metadata;
		this.size = sizeOfVein;
	}
	@Override
	public boolean generate(World world, Random random, int i, int j, int k) {
		float f = random.nextFloat() * 3.141593F;
		double d = (float) (i + 8) + (MathHelper.sin(f) * (float) size) / 8F;
		double d1 = (float) (i + 8) - (MathHelper.sin(f) * (float) size) / 8F;
		double d2 = (float) (k + 8) + (MathHelper.cos(f) * (float) size) / 8F;
		double d3 = (float) (k + 8) - (MathHelper.cos(f) * (float) size) / 8F;
		double d4 = (j + random.nextInt(3)) - 2;
		double d5 = (j + random.nextInt(3)) - 2;
		for (int l = 0; l <= size; l++) {
			double d6 = d + ((d1 - d) * (double) l) / (double) size;
			double d7 = d4 + ((d5 - d4) * (double) l) / (double) size;
			double d8 = d2 + ((d3 - d2) * (double) l) / (double) size;
			double d9 = (random.nextDouble() * (double) size) / 16D;
			double d10 = (double) (MathHelper.sin(((float) l * 3.141593F) / (float) size) + 1.0F) * d9 + 1.0D;
			double d11 = (double) (MathHelper.sin(((float) l * 3.141593F) / (float) size) + 1.0F) * d9 + 1.0D;
			int i1 = MathHelper.floor_double(d6 - d10 / 2D);
			int j1 = MathHelper.floor_double(d7 - d11 / 2D);
			int k1 = MathHelper.floor_double(d8 - d10 / 2D);
			int l1 = MathHelper.floor_double(d6 + d10 / 2D);
			int i2 = MathHelper.floor_double(d7 + d11 / 2D);
			int j2 = MathHelper.floor_double(d8 + d10 / 2D);
			for (int xGen = i1; xGen <= l1; xGen++) {
				double d12 = (((double) xGen + 0.5D) - d6) / (d10 / 2D);
				if (d12 * d12 >= 1.0D) {
					continue;
				}
				for (int yGen = j1; yGen <= i2; yGen++) {
					double d13 = (((double) yGen + 0.5D) - d7) / (d11 / 2D);
					if (d12 * d12 + d13 * d13 >= 1.0D) {
						continue;
					}
					for (int zGen = k1; zGen <= j2; zGen++) {
						double d14 = (((double) zGen + 0.5D) - d8) / (d10 / 2D);
						if ((d12 * d12 + d13 * d13 + d14 * d14 < 1.0D && world.getBlockId(xGen, yGen, zGen) == Block.sandStone.blockID && (bID == BlockIDs.oreTC.blockID && meta == 1)) || (d12 * d12 + d13 * d13 + d14 * d14 < 1.0D && world.getBlockId(xGen, yGen, zGen) == Block.sand.blockID && (bID == BlockIDs.oreTC.blockID && meta == 1) && world.getBlockId(xGen, yGen + 1, zGen) == Block.sand.blockID)) {
							//System.out.println("Generating sand ores at " + xGen + " | " + yGen + " | " + zGen + "  : " + meta);
							world.setBlock(xGen, yGen, zGen, bID, meta, 2);
						}
						if ((d12 * d12 + d13 * d13 + d14 * d14 < 1.0D && world.getBlockId(xGen, yGen, zGen) == Block.stone.blockID && (bID == BlockIDs.oreTC.blockID && meta != 1))) {
							//System.out.println("Generating other ores at " + xGen + " | " + yGen + " | " + zGen + "  : " + meta);
							world.setBlock(xGen, yGen, zGen, bID, meta, 2);
						}
					}
				}
			}
		}
		return true;
	}

	public boolean generateVeins(World world, Random random, int chunkX, int chunkZ, int rarity, int height, int offset) {
		for (int i = 0; i < rarity; i++) {
			int hi = height + random.nextInt(offset);
			int randX = chunkX + random.nextInt(16);
			int randZ = chunkZ + random.nextInt(16);
			generate(world, random, randX, hi, randZ);
		}
		return true;
	}
}
