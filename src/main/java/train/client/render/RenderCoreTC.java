/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.client.render;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.world.World;

public class RenderCoreTC {
	public static void renderBlockFalling(Block block, int meta, World world, int i, int j, int k) {
		Tessellator tessellator = Tessellator.instance;
		tessellator.startDrawingQuads();
		tessellator.setBrightness(block.getMixedBrightnessForBlock(world, i, j, k));
		tessellator.setColorOpaque_F(0.6F, 0.6F, 0.6F);
		tessellator.draw();
	}

	public static void renderBottomFace(Block block, double d, double d1, double d2, int i) {
		double blockMinX = block.getBlockBoundsMinX();
		double blockMaxX = block.getBlockBoundsMaxX();
		double blockMinY = block.getBlockBoundsMinY();
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

		tessellator.addVertexWithUV(d + blockMinX, d1 + blockMinY, d2 + blockMaxZ, d3, d6);
		tessellator.addVertexWithUV(d + blockMinX, d1 + blockMinY, d2 + blockMinZ, d3, d5);
		tessellator.addVertexWithUV(d + blockMaxX, d1 + blockMinY, d2 + blockMinZ, d4, d5);
		tessellator.addVertexWithUV(d + blockMaxX, d1 + blockMinY, d2 + blockMaxZ, d4, d6);
	}

	public static void renderTopFace(Block block, double d, double d1, double d2, int i) {
		double blockMinX = block.getBlockBoundsMinX();
		double blockMaxX = block.getBlockBoundsMaxX();
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

		tessellator.addVertexWithUV(d + blockMaxX, d1 + blockMaxY, d2 + blockMaxZ, d4, d6);
		tessellator.addVertexWithUV(d + blockMaxX, d1 + blockMaxY, d2 + blockMinZ, d4, d5);
		tessellator.addVertexWithUV(d + blockMinX, d1 + blockMaxY, d2 + blockMinZ, d3, d5);
		tessellator.addVertexWithUV(d + blockMinX, d1 + blockMaxY, d2 + blockMaxZ, d3, d6);
	}

	public static void renderEastFace(Block block, double d, double d1, double d2, int i) {
		double blockMinX = block.getBlockBoundsMinX();
		double blockMaxX = block.getBlockBoundsMaxX();
		double blockMinY = block.getBlockBoundsMinY();
		double blockMaxY = block.getBlockBoundsMaxY();
		double blockMinZ = block.getBlockBoundsMinZ();
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

		tessellator.addVertexWithUV(d + blockMinX, d1 + blockMaxY, d2 + blockMinZ, d4, d5);
		tessellator.addVertexWithUV(d + blockMaxX, d1 + blockMaxY, d2 + blockMinZ, d3, d5);
		tessellator.addVertexWithUV(d + blockMaxX, d1 + blockMinY, d2 + blockMinZ, d3, d6);
		tessellator.addVertexWithUV(d + blockMinX, d1 + blockMinY, d2 + blockMinZ, d4, d6);
	}

	public static void renderWestFace(Block block, double d, double d1, double d2, int i) {
		double blockMinX = block.getBlockBoundsMinX();
		double blockMaxX = block.getBlockBoundsMaxX();
		double blockMinY = block.getBlockBoundsMinY();
		double blockMaxY = block.getBlockBoundsMaxY();
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

		tessellator.addVertexWithUV(d + blockMinX, d1 + blockMaxY, d2 + blockMaxZ, d3, d5);
		tessellator.addVertexWithUV(d + blockMinX, d1 + blockMinY, d2 + blockMaxZ, d3, d6);
		tessellator.addVertexWithUV(d + blockMaxX, d1 + blockMinY, d2 + blockMaxZ, d4, d6);
		tessellator.addVertexWithUV(d + blockMaxX, d1 + blockMaxY, d2 + blockMaxZ, d4, d5);
	}

	public static void renderNorthFace(Block block, double d, double d1, double d2, int i) {
		double blockMinX = block.getBlockBoundsMinX();
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

		tessellator.addVertexWithUV(d + blockMinX, d1 + blockMaxY, d2 + blockMaxZ, d4, d5);
		tessellator.addVertexWithUV(d + blockMinX, d1 + blockMaxY, d2 + blockMinZ, d3, d5);
		tessellator.addVertexWithUV(d + blockMinX, d1 + blockMinY, d2 + blockMinZ, d3, d6);
		tessellator.addVertexWithUV(d + blockMinX, d1 + blockMinY, d2 + blockMaxZ, d4, d6);
	}

	public static void renderSouthFace(Block block, double d, double d1, double d2, int i) {
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

		tessellator.addVertexWithUV(d + blockMaxX, d1 + blockMinY, d2 + blockMaxZ, d3, d6);
		tessellator.addVertexWithUV(d + blockMaxX, d1 + blockMinY, d2 + blockMinZ, d4, d6);
		tessellator.addVertexWithUV(d + blockMaxX, d1 + blockMaxY, d2 + blockMinZ, d4, d5);
		tessellator.addVertexWithUV(d + blockMaxX, d1 + blockMaxY, d2 + blockMaxZ, d3, d5);
	}
}
