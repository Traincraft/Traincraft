package src.train.common.generation;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.structure.StructureBoundingBox;
import net.minecraft.world.gen.structure.StructureComponent;
import net.minecraft.world.gen.structure.StructureVillagePieces;
import src.train.common.api.EntityRollingStock;
import src.train.common.entity.rollingStock.EntityBoxCartUS;
import src.train.common.entity.rollingStock.EntityCaboose;
import src.train.common.entity.rollingStock.EntityCaboose3;
import src.train.common.entity.rollingStock.EntityCabooseLogging;
import src.train.common.entity.rollingStock.EntityFreightCart;
import src.train.common.entity.rollingStock.EntityFreightCartSmall;
import src.train.common.entity.rollingStock.EntityFreightWood2;
import src.train.common.entity.rollingStock.EntityPassenger2;
import src.train.common.entity.rollingStock.EntityStockCar;
import src.train.common.library.BlockIDs;

public class ComponentVillageTrainstation extends StructureVillagePieces.Village {

	private int averageGroundLevel = -1;

	public ComponentVillageTrainstation() {}
	
	public ComponentVillageTrainstation(StructureVillagePieces.Start par1ComponentVillageStartPiece, int par2, Random par3Random, StructureBoundingBox par4StructureBoundingBox, int par5) {
		super(par1ComponentVillageStartPiece, par2);
		this.coordBaseMode = par5;
		this.boundingBox = par4StructureBoundingBox;
	}

	public static ComponentVillageTrainstation buildComponent(StructureVillagePieces.Start par0ComponentVillageStartPiece, List par1List, Random par2Random, int par3, int par4, int par5, int par6, int par7) {
		StructureBoundingBox structureboundingbox = StructureBoundingBox.getComponentToAddBoundingBox(par3, par4, par5, 0, 0, 0, 9, 9, 10, par6);
		return canVillageGoDeeper(structureboundingbox) && StructureComponent.findIntersecting(par1List, structureboundingbox) == null ? new ComponentVillageTrainstation(par0ComponentVillageStartPiece, par7, par2Random, structureboundingbox, par6) : null;
	}

	@Override
	public boolean addComponentParts(World world, Random random, StructureBoundingBox structureboundingbox) {
		if (this.averageGroundLevel < 0) {
			this.averageGroundLevel = this.getAverageGroundLevel(world, structureboundingbox);

			if (this.averageGroundLevel < 0) {
				return true;
			}

			this.boundingBox.offset(0, this.averageGroundLevel - this.boundingBox.maxY + 9 - 1, 0);
		}
		this.fillWithBlocks(world, structureboundingbox, 1, 1, 1, 7, 5, 4, Block.getBlockById(0), Block.getBlockById(0), false);
		this.fillWithBlocks(world, structureboundingbox, 0, 0, 0, 8, 0, 5, Block.getBlockFromName("brick"), Block.getBlockFromName("brick"), false);
		this.fillWithBlocks(world, structureboundingbox, 0, 5, 0, 8, 5, 5, Block.getBlockFromName("brick"), Block.getBlockFromName("brick"), false);
		this.fillWithBlocks(world, structureboundingbox, 0, 6, 1, 8, 6, 4, Block.getBlockFromName("brick"), Block.getBlockFromName("brick"), false);
		this.fillWithBlocks(world, structureboundingbox, 0, 7, 2, 8, 7, 3, Block.getBlockFromName("brick"), Block.getBlockFromName("brick"), false);
		//oak stairs are id 53
		int i = this.getMetadataWithOffset(Block.getBlockById(53), 3);
		int j = this.getMetadataWithOffset(Block.getBlockById(53), 2);
		int k;
		int l;

		for (k = -1; k <= 2; ++k) {
			for (l = 0; l <= 8; ++l) {
				this.placeBlockAtCurrentPosition(world, Block.getBlockById(53), i, l, 6 + k, k, structureboundingbox);
				this.placeBlockAtCurrentPosition(world, Block.getBlockById(53), j, l, 6 + k, 5 - k, structureboundingbox);
			}
		}

		this.fillWithBlocks(world, structureboundingbox, 0, 1, 0, 0, 1, 5, Block.getBlockFromName("brick"), Block.getBlockFromName("brick"), false);
		this.fillWithBlocks(world, structureboundingbox, 1, 1, 5, 8, 1, 5, Block.getBlockFromName("brick"), Block.getBlockFromName("brick"), false);
		this.fillWithBlocks(world, structureboundingbox, 8, 1, 0, 8, 1, 4, Block.getBlockFromName("brick"), Block.getBlockFromName("brick"), false);
		this.fillWithBlocks(world, structureboundingbox, 2, 1, 0, 7, 1, 0, Block.getBlockFromName("brick"), Block.getBlockFromName("brick"), false);
		this.fillWithBlocks(world, structureboundingbox, 0, 2, 0, 0, 4, 0, Block.getBlockFromName("brick"), Block.getBlockFromName("brick"), false);
		this.fillWithBlocks(world, structureboundingbox, 0, 2, 5, 0, 4, 5, Block.getBlockFromName("brick"), Block.getBlockFromName("brick"), false);
		this.fillWithBlocks(world, structureboundingbox, 8, 2, 5, 8, 4, 5, Block.getBlockFromName("brick"), Block.getBlockFromName("brick"), false);
		this.fillWithBlocks(world, structureboundingbox, 8, 2, 0, 8, 4, 0, Block.getBlockFromName("brick"), Block.getBlockFromName("brick"), false);
		//id 5 is oak wood planks
		this.fillWithBlocks(world, structureboundingbox, 0, 2, 1, 0, 4, 4, Block.getBlockById(5), Block.getBlockById(5), false);
		this.fillWithBlocks(world, structureboundingbox, 1, 2, 5, 7, 4, 5, Block.getBlockById(5), Block.getBlockById(5), false);
		this.fillWithBlocks(world, structureboundingbox, 8, 2, 1, 8, 4, 4, Block.getBlockById(5), Block.getBlockById(5), false);
		this.fillWithBlocks(world, structureboundingbox, 1, 2, 0, 7, 4, 0, Block.getBlockById(5), Block.getBlockById(5), false);
		//thin glass was actually moved to glass_pane which now has the Id of 102
		this.placeBlockAtCurrentPosition(world, Block.getBlockById(102), 0, 4, 2, 0, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Block.getBlockById(102), 0, 5, 2, 0, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Block.getBlockById(102), 0, 6, 2, 0, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Block.getBlockById(102), 0, 4, 3, 0, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Block.getBlockById(102), 0, 5, 3, 0, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Block.getBlockById(102), 0, 6, 3, 0, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Block.getBlockById(102), 0, 0, 2, 2, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Block.getBlockById(102), 0, 0, 2, 3, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Block.getBlockById(102), 0, 0, 3, 2, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Block.getBlockById(102), 0, 0, 3, 3, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Block.getBlockById(102), 0, 8, 2, 2, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Block.getBlockById(102), 0, 8, 2, 3, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Block.getBlockById(102), 0, 8, 3, 2, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Block.getBlockById(102), 0, 8, 3, 3, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Block.getBlockById(102), 0, 2, 3, 5, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Block.getBlockById(102), 0, 2, 2, 5, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Block.getBlockById(102), 0, 3, 2, 5, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Block.getBlockById(102), 0, 3, 3, 5, structureboundingbox);

		for (int z = 0; z < 9; z++) {
			this.placeBlockAtCurrentPosition(world, Block.getBlockFromName("brick"), 0, z, 0, 6, structureboundingbox);
			//stoneSingleSlab is now stone_slab with an id of 44
			this.placeBlockAtCurrentPosition(world, Block.getBlockById(44), 4, z, 0, 7, structureboundingbox);
			this.placeBlockAtCurrentPosition(world, Block.getBlockFromName("rail"), 0, z, 0, 8, structureboundingbox);
			//the id for stonebrick is 98
			this.placeBlockAtCurrentPosition(world, Block.getBlockById(98), 0, z, -1, 8, structureboundingbox);
		}
		this.placeBlockAtCurrentPosition(world, Block.getBlockFromName("brick"), 0, 2, 0, 7, structureboundingbox);
		//the id for fence is 85
		this.placeBlockAtCurrentPosition(world, Block.getBlockById(85), 0, 2, 1, 7, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Block.getBlockById(85), 0, 2, 2, 7, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Block.getBlockById(85), 0, 2, 3, 7, structureboundingbox);

		this.placeBlockAtCurrentPosition(world, Block.getBlockFromName("brick"), 0, 6, 0, 7, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Block.getBlockById(85), 0, 6, 1, 7, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Block.getBlockById(85), 0, 6, 2, 7, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Block.getBlockById(85), 0, 6, 3, 7, structureboundingbox);
		//woodSingleSlab is now wood_slab with an id of 126
		this.fillWithBlocks(world, structureboundingbox, 1, 4, 7, 7, 4, 7, Block.getBlockById(126), Block.getBlockById(126), false);
		this.fillWithBlocks(world, structureboundingbox, 1, 4, 6, 7, 4, 6, Block.getBlockById(126), Block.getBlockById(126), false);
		this.fillWithBlocks(world, structureboundingbox, 1, 4, 8, 7, 4, 8, Block.getBlockById(126), Block.getBlockById(126), false);
		this.placeBlockAtCurrentPosition(world, Block.getBlockById(85), 0, 0, 1, 6, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, BlockIDs.lantern.block, 0, 0, 2, 6, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Block.getBlockById(85), 0, 8, 1, 6, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, BlockIDs.lantern.block, 0, 8, 2, 6, structureboundingbox);

		this.placeBlockAtCurrentPosition(world, Block.getBlockById(102), 0, 5, 2, 5, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Block.getBlockById(102), 0, 6, 2, 5, structureboundingbox);
		this.fillWithBlocks(world, structureboundingbox, 1, 4, 1, 7, 4, 1, Block.getBlockById(5), Block.getBlockById(5), false);
		this.fillWithBlocks(world, structureboundingbox, 1, 4, 4, 7, 4, 4, Block.getBlockById(5), Block.getBlockById(5), false);
		//the id of bookshelf is now 47
		this.fillWithBlocks(world, structureboundingbox, 4, 3, 4, 7, 3, 4, Block.getBlockById(47), Block.getBlockById(47), false);
		this.fillWithBlocks(world, structureboundingbox, 5, 3, 5, 6, 3, 5, Block.getBlockById(102), Block.getBlockById(102), false);
		//fenceIron is now iron_bars and has an id of 101
		this.fillWithBlocks(world, structureboundingbox, 4, 3, 3, 7, 3, 3, Block.getBlockById(101), Block.getBlockById(101), false);
		this.placeBlockAtCurrentPosition(world, BlockIDs.lantern.block, 0, 7, 4, 3, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, BlockIDs.lantern.block, 0, 4, 4, 3, structureboundingbox);

		this.placeBlockAtCurrentPosition(world, Block.getBlockById(101), 0, 4, 2, 3, structureboundingbox);
		this.fillWithBlocks(world, structureboundingbox, 4, 1, 3, 7, 1, 3, Block.getBlockById(101), Block.getBlockById(101), false);
		this.placeBlockAtCurrentPosition(world, Block.getBlockById(5), 0, 7, 1, 3, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Block.getBlockById(5), 0, 7, 1, 4, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Block.getBlockById(5), 0, 4, 1, 3, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Block.getBlockById(5), 0, 4, 1, 4, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Block.getBlockById(101), 0, 4, 2, 3, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Block.getBlockById(101), 0, 4, 2, 4, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Block.getBlockById(101), 0, 7, 2, 3, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Block.getBlockById(101), 0, 7, 2, 4, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Block.getBlockById(5), 0, 1, 1, 4, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Block.getBlockById(53), this.getMetadataWithOffset(Block.getBlockById(53), 1), 1, 1, 3, structureboundingbox);
		k = this.getMetadataWithOffset(Block.getBlockById(53), 3);
		this.placeBlockAtCurrentPosition(world, Block.getBlockById(53), k, 3, 1, 4, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Block.getBlockById(53), k, 2, 1, 4, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Block.getBlockById(85), 0, 2, 1, 3, structureboundingbox);
		//pressurePlatePlanks is now wooden_pressure_plate with an id of 72
		this.placeBlockAtCurrentPosition(world, Block.getBlockById(72), 0, 2, 2, 3, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, BlockIDs.trainWorkbench.block, 0, 7, 1, 1, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Block.getBlockById(0), 0, 1, 1, 0, structureboundingbox);
		this.placeBlockAtCurrentPosition(world, Block.getBlockById(0), 0, 1, 2, 0, structureboundingbox);
		//doorWood is now wooden_door with an id of 64
		this.placeDoorAtCurrentPosition(world, structureboundingbox, random, 1, 1, 0, this.getMetadataWithOffset(Block.getBlockById(64), 1));

		if (this.getBlockAtCurrentPosition(world, 1, 0, -1, structureboundingbox) == Block.getBlockById(0) && this.getBlockAtCurrentPosition(world, 1, -1, -1, structureboundingbox) != Block.getBlockById(0)) {
			this.placeBlockAtCurrentPosition(world, Block.getBlockById(44), 4, 1, 0, -1, structureboundingbox);
		}

		for (l = 0; l < 6; ++l) {
			for (int i1 = 0; i1 < 9; ++i1) {
				this.clearCurrentPositionBlocksUpwards(world, i1, 9, l, structureboundingbox);
				this.func_151554_b(world, Block.getBlockFromName("brick"), 0, i1, -1, l, structureboundingbox);
			}
		}

		this.spawnVillagers(world, structureboundingbox, 6, 1, 4, 1);

		int j1 = this.getXWithOffset(6, 8);
		int k1 = this.getYWithOffset(1);
		int l1 = this.getZWithOffset(6, 8);

		if (structureboundingbox.isVecInside(j1, k1, l1)) {
			int rD = random.nextInt(8);
			EntityRollingStock cart = new EntityCabooseLogging(world);
			if (rD == 0)
				cart = new EntityCaboose(world);
			if (rD == 1)
				cart = new EntityCaboose3(world);
			if (rD == 2)
				cart = new EntityFreightCart(world);
			if (rD == 3)
				cart = new EntityPassenger2(world);
			if (rD == 4)
				cart = new EntityStockCar(world);
			if (rD == 5)
				cart = new EntityBoxCartUS(world);
			if (rD == 6)
				cart = new EntityFreightCartSmall(world);

			cart.setLocationAndAngles((double) j1 + 0.5D, (double) k1, (double) l1 + 0.5D, 90.0F, 0.0F);
			cart.setTrainOwner("VillagerJoe");
			world.spawnEntityInWorld(cart);
		}
		int j2 = this.getXWithOffset(3, 8);
		int k2 = this.getYWithOffset(1);
		int l2 = this.getZWithOffset(3, 8);

		if (structureboundingbox.isVecInside(j2, k2, l2)) {
			int rD = random.nextInt(8);
			EntityRollingStock cart = new EntityFreightWood2(world);
			if (rD == 0)
				cart = new EntityCaboose(world);
			if (rD == 1)
				cart = new EntityCaboose3(world);
			if (rD == 2)
				cart = new EntityFreightCart(world);
			if (rD == 3)
				cart = new EntityPassenger2(world);
			if (rD == 4)
				cart = new EntityStockCar(world);
			if (rD == 5)
				cart = new EntityBoxCartUS(world);
			if (rD == 6)
				cart = new EntityFreightCartSmall(world);
			cart.setLocationAndAngles((double) j2 + 0.5D, (double) k2, (double) l2 + 0.5D, 90.0F, 0.0F);
			cart.setTrainOwner("VillagerJoe");
			world.spawnEntityInWorld(cart);
		}

		return true;
	}

	/**
	 * Returns the villager type to spawn in this component, based on the number of villagers already spawned.
	 */
	@Override
	protected int getVillagerType(int par1) {
		return 86;
	}
}