/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package src.train.client.render;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.world.World;

public class RenderCoreTC {
	public static void renderBlockFalling(Block block, int meta, World world, int i, int j, int k) {
		float f = 0.5F;
		float f1 = 1.0F;
		float f2 = 0.8F;
		float f3 = 0.6F;
		Tessellator tessellator = Tessellator.instance;
		tessellator.startDrawingQuads();
		tessellator.setBrightness(block.getMixedBrightnessForBlock(world, i, j, k));
		float f4 = 1.0F;
		float f5 = 1.0F;
		if (f5 < f4) {
			f5 = f4;
		}
		tessellator.setColorOpaque_F(f * f5, f * f5, f * f5);
		//renderBottomFace(block, -0.5D, -0.5D, -0.5D, block.getBlockTextureFromSideAndMetadata(0, meta));
		f5 = 1.0F;
		if (f5 < f4) {
			f5 = f4;
		}
		tessellator.setColorOpaque_F(f1 * f5, f1 * f5, f1 * f5);
		//renderTopFace(block, -0.5D, -0.5D, -0.5D, block.getBlockTextureFromSideAndMetadata(1, meta));
		f5 = 1.0F;
		if (f5 < f4) {
			f5 = f4;
		}
		tessellator.setColorOpaque_F(f2 * f5, f2 * f5, f2 * f5);
		//renderEastFace(block, -0.5D, -0.5D, -0.5D, block.getBlockTextureFromSideAndMetadata(2, meta));
		f5 = 1.0F;
		if (f5 < f4) {
			f5 = f4;
		}
		tessellator.setColorOpaque_F(f2 * f5, f2 * f5, f2 * f5);
		//renderWestFace(block, -0.5D, -0.5D, -0.5D, block.getBlockTextureFromSideAndMetadata(3, meta));
		f5 = 1.0F;
		if (f5 < f4) {
			f5 = f4;
		}
		tessellator.setColorOpaque_F(f3 * f5, f3 * f5, f3 * f5);
		//renderNorthFace(block, -0.5D, -0.5D, -0.5D, block.getBlockTextureFromSideAndMetadata(4, meta));
		f5 = 1.0F;
		if (f5 < f4) {
			f5 = f4;
		}
		tessellator.setColorOpaque_F(f3 * f5, f3 * f5, f3 * f5);
		//renderSouthFace(block, -0.5D, -0.5D, -0.5D, block.getBlockTextureFromSideAndMetadata(5, meta));
		tessellator.draw();
	}

	public static void renderBottomFace(Block block, double d, double d1, double d2, int i) {
		double blockMinX = block.getBlockBoundsMinX();
		double blockMaxX = block.getBlockBoundsMaxX();
		double blockMinY = block.getBlockBoundsMinY();
		double blockMaxY = block.getBlockBoundsMaxY();
		double blockMinZ = block.getBlockBoundsMinZ();
		double blockMaxZ = block.getBlockBoundsMaxZ();
		Tessellator tessellator = Tessellator.instance;

		int j = (i & 0xf) << 4;
		int k = i & 0xf0;
		double d3 = ((double) j + blockMinX * 16D) / 256D;
		double d4 = (((double) j + blockMaxX * 16D) - 0.01D) / 256D;
		double d5 = ((double) k + blockMinZ * 16D) / 256D;
		double d6 = (((double) k + blockMaxZ * 16D) - 0.01D) / 256D;
		if (blockMinX < 0.0D || blockMaxX > 1.0D) {
			d3 = ((float) j + 0.0F) / 256F;
			d4 = ((float) j + 15.99F) / 256F;
		}
		if (blockMinZ < 0.0D || blockMaxZ > 1.0D) {
			d5 = ((float) k + 0.0F) / 256F;
			d6 = ((float) k + 15.99F) / 256F;
		}
		double d7 = d4;
		double d8 = d3;
		double d9 = d5;
		double d10 = d6;

		double d11 = d + blockMinX;
		double d12 = d + blockMaxX;
		double d13 = d1 + blockMinY;
		double d14 = d2 + blockMinZ;
		double d15 = d2 + blockMaxZ;

		tessellator.addVertexWithUV(d11, d13, d15, d8, d10);
		tessellator.addVertexWithUV(d11, d13, d14, d3, d5);
		tessellator.addVertexWithUV(d12, d13, d14, d7, d9);
		tessellator.addVertexWithUV(d12, d13, d15, d4, d6);
	}

	public static void renderTopFace(Block block, double d, double d1, double d2, int i) {
		double blockMinX = block.getBlockBoundsMinX();
		double blockMaxX = block.getBlockBoundsMaxX();
		double blockMinY = block.getBlockBoundsMinY();
		double blockMaxY = block.getBlockBoundsMaxY();
		double blockMinZ = block.getBlockBoundsMinZ();
		double blockMaxZ = block.getBlockBoundsMaxZ();
		Tessellator tessellator = Tessellator.instance;

		int j = (i & 0xf) << 4;
		int k = i & 0xf0;
		double d3 = ((double) j + blockMinX * 16D) / 256D;
		double d4 = (((double) j + blockMaxX * 16D) - 0.01D) / 256D;
		double d5 = ((double) k + blockMinZ * 16D) / 256D;
		double d6 = (((double) k + blockMaxZ * 16D) - 0.01D) / 256D;
		if (blockMinX < 0.0D || blockMaxX > 1.0D) {
			d3 = ((float) j + 0.0F) / 256F;
			d4 = ((float) j + 15.99F) / 256F;
		}
		if (blockMinZ < 0.0D || blockMaxZ > 1.0D) {
			d5 = ((float) k + 0.0F) / 256F;
			d6 = ((float) k + 15.99F) / 256F;
		}
		double d7 = d4;
		double d8 = d3;
		double d9 = d5;
		double d10 = d6;

		double d11 = d + blockMinX;
		double d12 = d + blockMaxX;
		double d13 = d1 + blockMaxY;
		double d14 = d2 + blockMinZ;
		double d15 = d2 + blockMaxZ;

		tessellator.addVertexWithUV(d12, d13, d15, d4, d6);
		tessellator.addVertexWithUV(d12, d13, d14, d7, d9);
		tessellator.addVertexWithUV(d11, d13, d14, d3, d5);
		tessellator.addVertexWithUV(d11, d13, d15, d8, d10);
	}

	public static void renderEastFace(Block block, double d, double d1, double d2, int i) {
		double blockMinX = block.getBlockBoundsMinX();
		double blockMaxX = block.getBlockBoundsMaxX();
		double blockMinY = block.getBlockBoundsMinY();
		double blockMaxY = block.getBlockBoundsMaxY();
		double blockMinZ = block.getBlockBoundsMinZ();
		double blockMaxZ = block.getBlockBoundsMaxZ();
		Tessellator tessellator = Tessellator.instance;

		int j = (i & 0xf) << 4;
		int k = i & 0xf0;
		double d3 = ((double) j + blockMinX * 16D) / 256D;
		double d4 = (((double) j + blockMaxX * 16D) - 0.01D) / 256D;
		double d5 = ((double) (k + 16) - blockMaxY * 16D) / 256D;
		double d6 = ((double) (k + 16) - blockMinY * 16D - 0.01D) / 256D;

		if (blockMinX < 0.0D || blockMaxX > 1.0D) {
			d3 = ((float) j + 0.0F) / 256F;
			d4 = ((float) j + 15.99F) / 256F;
		}
		if (blockMinY < 0.0D || blockMaxY > 1.0D) {
			d5 = ((float) k + 0.0F) / 256F;
			d6 = ((float) k + 15.99F) / 256F;
		}
		double d8 = d4;
		double d9 = d3;
		double d10 = d5;
		double d11 = d6;

		double d12 = d + blockMinX;
		double d13 = d + blockMaxX;
		double d14 = d1 + blockMinY;
		double d15 = d1 + blockMaxY;
		double d16 = d2 + blockMinZ;

		tessellator.addVertexWithUV(d12, d15, d16, d8, d10);
		tessellator.addVertexWithUV(d13, d15, d16, d3, d5);
		tessellator.addVertexWithUV(d13, d14, d16, d9, d11);
		tessellator.addVertexWithUV(d12, d14, d16, d4, d6);
	}

	public static void renderWestFace(Block block, double d, double d1, double d2, int i) {
		double blockMinX = block.getBlockBoundsMinX();
		double blockMaxX = block.getBlockBoundsMaxX();
		double blockMinY = block.getBlockBoundsMinY();
		double blockMaxY = block.getBlockBoundsMaxY();
		double blockMinZ = block.getBlockBoundsMinZ();
		double blockMaxZ = block.getBlockBoundsMaxZ();
		Tessellator tessellator = Tessellator.instance;

		int j = (i & 0xf) << 4;
		int k = i & 0xf0;
		double d3 = ((double) j + blockMinX * 16D) / 256D;
		double d4 = (((double) j + blockMaxX * 16D) - 0.01D) / 256D;
		double d5 = ((double) (k + 16) - blockMaxY * 16D) / 256D;
		double d6 = ((double) (k + 16) - blockMinY * 16D - 0.01D) / 256D;

		if (blockMinX < 0.0D || blockMaxX > 1.0D) {
			d3 = ((float) j + 0.0F) / 256F;
			d4 = ((float) j + 15.99F) / 256F;
		}
		if (blockMinY < 0.0D || blockMaxY > 1.0D) {
			d5 = ((float) k + 0.0F) / 256F;
			d6 = ((float) k + 15.99F) / 256F;
		}
		double d8 = d4;
		double d9 = d3;
		double d10 = d5;
		double d11 = d6;

		double d12 = d + blockMinX;
		double d13 = d + blockMaxX;
		double d14 = d1 + blockMinY;
		double d15 = d1 + blockMaxY;
		double d16 = d2 + blockMaxZ;

		tessellator.addVertexWithUV(d12, d15, d16, d3, d5);
		tessellator.addVertexWithUV(d12, d14, d16, d9, d11);
		tessellator.addVertexWithUV(d13, d14, d16, d4, d6);
		tessellator.addVertexWithUV(d13, d15, d16, d8, d10);
	}

	public static void renderNorthFace(Block block, double d, double d1, double d2, int i) {
		double blockMinX = block.getBlockBoundsMinX();
		double blockMaxX = block.getBlockBoundsMaxX();
		double blockMinY = block.getBlockBoundsMinY();
		double blockMaxY = block.getBlockBoundsMaxY();
		double blockMinZ = block.getBlockBoundsMinZ();
		double blockMaxZ = block.getBlockBoundsMaxZ();
		Tessellator tessellator = Tessellator.instance;

		int j = (i & 0xf) << 4;
		int k = i & 0xf0;
		double d3 = ((double) j + blockMinZ * 16D) / 256D;
		double d4 = (((double) j + blockMaxZ * 16D) - 0.01D) / 256D;
		double d5 = ((double) (k + 16) - blockMaxY * 16D) / 256D;
		double d6 = ((double) (k + 16) - blockMinY * 16D - 0.01D) / 256D;

		if (blockMinZ < 0.0D || blockMaxZ > 1.0D) {
			d3 = ((float) j + 0.0F) / 256F;
			d4 = ((float) j + 15.99F) / 256F;
		}
		if (blockMinY < 0.0D || blockMaxY > 1.0D) {
			d5 = ((float) k + 0.0F) / 256F;
			d6 = ((float) k + 15.99F) / 256F;
		}
		double d8 = d4;
		double d9 = d3;
		double d10 = d5;
		double d11 = d6;

		double d12 = d + blockMinX;
		double d13 = d1 + blockMinY;
		double d14 = d1 + blockMaxY;
		double d15 = d2 + blockMinZ;
		double d16 = d2 + blockMaxZ;

		tessellator.addVertexWithUV(d12, d14, d16, d8, d10);
		tessellator.addVertexWithUV(d12, d14, d15, d3, d5);
		tessellator.addVertexWithUV(d12, d13, d15, d9, d11);
		tessellator.addVertexWithUV(d12, d13, d16, d4, d6);
	}

	public static void renderSouthFace(Block block, double d, double d1, double d2, int i) {
		double blockMinX = block.getBlockBoundsMinX();
		double blockMaxX = block.getBlockBoundsMaxX();
		double blockMinY = block.getBlockBoundsMinY();
		double blockMaxY = block.getBlockBoundsMaxY();
		double blockMinZ = block.getBlockBoundsMinZ();
		double blockMaxZ = block.getBlockBoundsMaxZ();
		Tessellator tessellator = Tessellator.instance;

		int j = (i & 0xf) << 4;
		int k = i & 0xf0;
		double d3 = ((double) j + blockMinZ * 16D) / 256D;
		double d4 = (((double) j + blockMaxZ * 16D) - 0.01D) / 256D;
		double d5 = ((double) (k + 16) - blockMaxY * 16D) / 256D;
		double d6 = ((double) (k + 16) - blockMinY * 16D - 0.01D) / 256D;

		if (blockMinZ < 0.0D || blockMaxZ > 1.0D) {
			d3 = ((float) j + 0.0F) / 256F;
			d4 = ((float) j + 15.99F) / 256F;
		}
		if (blockMinY < 0.0D || blockMaxY > 1.0D) {
			d5 = ((float) k + 0.0F) / 256F;
			d6 = ((float) k + 15.99F) / 256F;
		}
		double d8 = d4;
		double d9 = d3;
		double d10 = d5;
		double d11 = d6;

		double d12 = d + blockMaxX;
		double d13 = d1 + blockMinY;
		double d14 = d1 + blockMaxY;
		double d15 = d2 + blockMinZ;
		double d16 = d2 + blockMaxZ;

		tessellator.addVertexWithUV(d12, d13, d16, d9, d11);
		tessellator.addVertexWithUV(d12, d13, d15, d4, d6);
		tessellator.addVertexWithUV(d12, d14, d15, d8, d10);
		tessellator.addVertexWithUV(d12, d14, d16, d3, d5);
	}
}
