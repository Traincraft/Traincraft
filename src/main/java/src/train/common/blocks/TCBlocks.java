/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package src.train.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.MinecraftForge;
import src.train.common.library.BlockIDs;
import cpw.mods.fml.common.registry.GameRegistry;

public class TCBlocks {

	public static void init() {
		loadBlocks();
		registerBlocks();
		nameBlocks();
		setHarvestLevels();
	}

	public static void loadBlocks() {
		BlockIDs.distilIdle.block = new BlockDistil(BlockIDs.distilIdle.blockID, 2, false).setHardness(3.5F).setStepSound(Block.soundStoneFootstep);
		BlockIDs.distilActive.block = new BlockDistil(BlockIDs.distilActive.blockID, 2, true).setHardness(3.5F).setStepSound(Block.soundStoneFootstep).setLightValue(0.8F);
		//BlockIDs.signal.block = new BlockSignal(BlockIDs.signal.blockID, 16).setHardness(1.7F).setStepSound(Block.soundMetalFootstep);

		BlockIDs.assemblyTableI.block = new BlockAssemblyTableI(BlockIDs.assemblyTableI.blockID, 32, Material.wood).setHardness(3.5F).setStepSound(Block.soundWoodFootstep);
		BlockIDs.assemblyTableII.block = new BlockAssemblyTableII(BlockIDs.assemblyTableII.blockID, 48, Material.rock).setHardness(3.5F).setStepSound(Block.soundWoodFootstep);
		BlockIDs.assemblyTableIII.block = new BlockAssemblyTableIII(BlockIDs.assemblyTableIII.blockID, 64, Material.rock).setHardness(3.5F).setStepSound(Block.soundWoodFootstep);

		BlockIDs.trainWorkbench.block = new BlockTrainWorkbench(BlockIDs.trainWorkbench.blockID, 16).setHardness(1.7F).setStepSound(Block.soundWoodFootstep);
		BlockIDs.stopper.block = new BlockStopper(BlockIDs.stopper.blockID, 16).setHardness(1.7F).setStepSound(Block.soundWoodFootstep);

		BlockIDs.openFurnaceIdle.block = new BlockOpenHearthFurnace(BlockIDs.openFurnaceIdle.blockID, 20, false).setHardness(3.5F).setStepSound(Block.soundStoneFootstep);
		BlockIDs.openFurnaceActive.block = new BlockOpenHearthFurnace(BlockIDs.openFurnaceActive.blockID, 20, true).setHardness(3.5F).setStepSound(Block.soundStoneFootstep);
		BlockIDs.oreTC.block = new BlockOreTC(BlockIDs.oreTC.blockID, 0).setHardness(3.0F).setResistance(5F).setStepSound(Block.soundStoneFootstep);

		BlockIDs.lantern.block = new BlockLantern(BlockIDs.lantern.blockID).setHardness(1.7F).setStepSound(Block.soundMetalFootstep).setLightValue(0.98F);
		BlockIDs.waterWheel.block = new BlockWaterWheel(BlockIDs.waterWheel.blockID).setHardness(1.7F).setStepSound(Block.soundWoodFootstep);
		BlockIDs.windMill.block = new BlockWindMill(BlockIDs.windMill.blockID).setHardness(1.7F).setStepSound(Block.soundWoodFootstep);
		BlockIDs.generatorDiesel.block = new BlockGeneratorDiesel(BlockIDs.generatorDiesel.blockID).setHardness(1.7F).setStepSound(Block.soundMetalFootstep);
		
		BlockIDs.tcRail.block = new BlockTCRail(BlockIDs.tcRail.blockID).setHardness(1.0F).setStepSound(Block.soundMetalFootstep).setCreativeTab(null);
		BlockIDs.tcRailGag.block = new BlockTCRailGag(BlockIDs.tcRailGag.blockID).setHardness(1.0F).setStepSound(Block.soundMetalFootstep).setCreativeTab(null);
		
		BlockIDs.bridgePillar.block = new BlockBridgePillar(BlockIDs.bridgePillar.blockID).setHardness(3.5F).setStepSound(Block.soundWoodFootstep);

		//BlockIDs.book.block = new BlockBook(BlockIDs.book.blockID);
	}

	public static void registerBlocks() {
		for (BlockIDs blocks : BlockIDs.values()) {
			if(blocks.block != null && blocks.hasItemBlock){
				GameRegistry.registerBlock(blocks.block, blocks.itemBlockClass, blocks.name());
			}
			else if (blocks.block != null) {
				GameRegistry.registerBlock(blocks.block, blocks.name());
			}
		}
	}

	public static void nameBlocks() {
		for (BlockIDs blocks : BlockIDs.values()) {
			if (blocks.block != null) {
				blocks.block.setUnlocalizedName(blocks.name());
			}
		}
	}

	public static void setHarvestLevels() {
		MinecraftForge.setBlockHarvestLevel(BlockIDs.trainWorkbench.block, "axe", 0);
		MinecraftForge.setBlockHarvestLevel(BlockIDs.assemblyTableI.block, "axe", 0);
		MinecraftForge.setBlockHarvestLevel(BlockIDs.assemblyTableII.block, "axe", 0);
		MinecraftForge.setBlockHarvestLevel(BlockIDs.assemblyTableIII.block, "axe", 0);
		MinecraftForge.setBlockHarvestLevel(BlockIDs.waterWheel.block, "axe", 0);
		MinecraftForge.setBlockHarvestLevel(BlockIDs.windMill.block, "axe", 0);
		MinecraftForge.setBlockHarvestLevel(BlockIDs.bridgePillar.block, "axe", 0);

		MinecraftForge.setBlockHarvestLevel(Block.rail, "ItemStacked", 0);
		MinecraftForge.setBlockHarvestLevel(Block.railDetector, "ItemStacked", 0);
		MinecraftForge.setBlockHarvestLevel(Block.railPowered, "ItemStacked", 0);
	}
}