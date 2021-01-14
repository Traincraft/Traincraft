/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import ebf.tim.TrainsInMotion;
import ebf.tim.blocks.BlockDynamic;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.oredict.OreDictionary;
import train.Traincraft;
import train.blocks.bench.BlockTrainWorkbench;
import train.blocks.bridge.BlockBridgePillar;
import train.blocks.distil.BlockDistil;
import train.blocks.generator.BlockGeneratorDiesel;
import train.blocks.hearth.BlockOpenHearthFurnace;
import train.blocks.lantern.BlockLantern;
import train.blocks.switchstand.BlockSwitchStand;
import train.blocks.waterwheel.BlockWaterWheel;
import train.blocks.windmill.BlockWindMill;
import train.library.BlockIDs;
import train.library.Info;
import train.library.ItemIDs;

import static cpw.mods.fml.common.registry.GameRegistry.addRecipe;
import static ebf.tim.registry.TiMGenericRegistry.registerBlock;

public class TCBlocks {
	public static BlockDynamic trainTableTier1 = new BlockDynamic(new Material(MapColor.mapColorArray[13]), true, true, 1);
	public static BlockDynamic trainTableTier2 = new BlockDynamic(new Material(MapColor.mapColorArray[13]), true, true, 2);
	public static BlockDynamic trainTableTier3 = new BlockDynamic(new Material(MapColor.mapColorArray[13]), true, true, 3);

	public static BlockDynamic oilSand = new BlockDynamic(new Material(MapColor.mapColorArray[2]), false, false);
	public static BlockDynamic orePetroleum = new BlockDynamic(new Material(MapColor.mapColorArray[11]), false, false);

	public static BlockDistil blockDistil = new BlockDistil();
	public static BlockOpenHearthFurnace blockHearthFurnace = new BlockOpenHearthFurnace();

	public static BlockGeneratorDiesel dieselGenerator = new BlockGeneratorDiesel();


	@Deprecated //need to use TiMGenericRegistry.registerBlock(), this will also cover tile entities and TESR.
	public static void init() {
		trainTableTier1.texture=new ResourceLocation("traincraft", "textures/blocks/assembly_1.png");
		trainTableTier2.texture=new ResourceLocation("traincraft", "textures/blocks/assembly_2.png");
		trainTableTier3.texture=new ResourceLocation("traincraft", "textures/blocks/assembly_3.png");

		blockDistil.texture=new ResourceLocation("traincraft", "textures/blocks/distil_off.png");

		blockHearthFurnace.texture=new ResourceLocation("traincraft", "textures/blocks/furnace_off.png");

		oilSand.texture=new ResourceLocation("traincraft", "textures/blocks/ores/ore_oilsands.png");
		orePetroleum.texture=new ResourceLocation("traincraft", "textures/blocks/ores/ore_petroleum.png");

		registerBlock(oilSand, Traincraft.tcTab, Info.modID,"block.oilsand", null, null);
		registerBlock(orePetroleum, Traincraft.tcTab, Info.modID,"block.petroleum", null, null);

		addRecipe(new ItemStack(registerBlock(trainTableTier1, Traincraft.tcTab, Info.modID,"block.traintabletier1", null, null),1),
				"IPI", "S S", "SPS", 'S', Blocks.stone, 'I', Items.iron_ingot, 'P', Blocks.piston); //tier 1
		addRecipe(new ItemStack(registerBlock(trainTableTier2, Traincraft.tcTab, Info.modID,"block.traintabletier2", null, null),1),
				"GPG", "O O", "OPO", 'O', Blocks.obsidian, 'G', Items.gold_ingot, 'P', Blocks.piston); //tier 2
		addRecipe(new ItemStack(registerBlock(trainTableTier3, Traincraft.tcTab, Info.modID,"block.traintabletier3", null, null),1),
				"GPG", "DLD", "OPO", 'O', Blocks.obsidian, 'G', Items.gold_ingot, 'P', Blocks.piston, 'D', Items.diamond, 'L', Blocks.glowstone); //tier 3

		registerBlock(blockDistil, Traincraft.tcTab, Info.modID,"block.distil", null, null);

		registerBlock(blockHearthFurnace, Traincraft.tcTab, Info.modID,"block.hearthfurnace", null, null);

		if(TrainsInMotion.proxy.isClient()){
			registerBlock(dieselGenerator, Traincraft.tcTab, Info.modID, "block.dieselGenerator", null, new train.render.RenderGeneratorDiesel());
		} else {
			registerBlock(dieselGenerator, Traincraft.tcTab, Info.modID, "block.dieselGenerator", null, null);
		}

		OreDictionary.registerOre("oreOilsands", new ItemStack(oilSand, 1, 1));
		OreDictionary.registerOre("orePetroleum", new ItemStack(orePetroleum, 1, 2));


		OreDictionary.registerOre("dustCoal", new ItemStack(ItemIDs.coaldust.item));
		loadBlocks();
		registerBlocks();
		setHarvestLevels();

	}

	public static void loadBlocks() {
		//BlockIDs.signal.block = new BlockSignal(BlockIDs.signal.blockID, 16).setHardness(1.7F).setStepSound(Block.soundTypeMetal);

		BlockIDs.trainWorkbench.block = new BlockTrainWorkbench(16).setHardness(1.7F).setStepSound(Block.soundTypeWood);

		//BlockIDs.openFurnaceIdle.block = new BlockOpenHearthFurnace(false).setHardness(3.5F).setStepSound(Block.soundTypeStone);
		//BlockIDs.openFurnaceActive.block = new BlockOpenHearthFurnace(true).setHardness(3.5F).setStepSound(Block.soundTypeStone);
		//BlockIDs.oreTC.block = new BlockOreTC().setHardness(3.0F).setResistance(5F).setStepSound(Block.soundTypeStone);

		BlockIDs.lantern.block = new BlockLantern().setHardness(1.7F).setStepSound(Block.soundTypeMetal).setLightLevel(0.98F);
		BlockIDs.switchStand.block = new BlockSwitchStand().setHardness(1.7F).setStepSound(Block.soundTypeMetal);
		BlockIDs.waterWheel.block = new BlockWaterWheel().setHardness(1.7F).setStepSound(Block.soundTypeWood);
		BlockIDs.windMill.block = new BlockWindMill().setHardness(1.7F).setStepSound(Block.soundTypeWood);
		//BlockIDs.generatorDiesel.block = new BlockGeneratorDiesel().setHardness(1.7F).setStepSound(Block.soundTypeMetal);

		BlockIDs.bridgePillar.block = new BlockBridgePillar().setHardness(3.5F).setStepSound(Block.soundTypeWood);


		//BlockIDs.book.block = new BlockBook(BlockIDs.book.blockID);
	}

	public static void registerBlocks() {
		for (BlockIDs blocks : BlockIDs.values()) {
			if(blocks.block != null) {
				blocks.block.setBlockName(Info.modID + ":" + blocks.name());
				if (blocks.hasItemBlock) {
					GameRegistry.registerBlock(blocks.block, blocks.itemBlockClass, blocks.name());
				} else {
					GameRegistry.registerBlock(blocks.block, blocks.name());
				}
			}
		}
	}

	public static void setHarvestLevels() {
		BlockIDs.trainWorkbench.block.setHarvestLevel("axe", 0);
		BlockIDs.waterWheel.block.setHarvestLevel("axe", 0);
		BlockIDs.windMill.block.setHarvestLevel("axe", 0);
		BlockIDs.bridgePillar.block.setHarvestLevel("axe", 0);
		orePetroleum.setHarvestLevel("pickaxe", 1);

		Blocks.rail.setHarvestLevel("ItemStacked", 0);
		Blocks.detector_rail.setHarvestLevel("ItemStacked", 0);
		Blocks.golden_rail.setHarvestLevel("ItemStacked", 0);
	}
}