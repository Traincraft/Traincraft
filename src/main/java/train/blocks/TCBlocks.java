/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.blocks;

import ebf.tim.TrainsInMotion;
import ebf.tim.blocks.BlockDynamic;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.oredict.OreDictionary;
import train.Traincraft;
import train.blocks.bench.BlockTrainWorkbench;
import train.blocks.distil.BlockDistil;
import train.blocks.generator.BlockGeneratorDiesel;
import train.blocks.hearth.BlockOpenHearthFurnace;
import train.blocks.lantern.BlockLantern;
import train.blocks.switchstand.BlockSwitchStand;
import train.blocks.waterwheel.BlockWaterWheel;
import train.blocks.windmill.BlockWindMill;
import train.library.Info;
import train.library.ItemIDs;

import static cpw.mods.fml.common.registry.GameRegistry.addRecipe;
import static ebf.tim.registry.TiMGenericRegistry.registerBlock;

public class TCBlocks {
	public static BlockDynamic trainTableTier1 = new BlockDynamic(new Material(MapColor.mapColorArray[13]),true, 1);
	public static BlockDynamic trainTableTier2 = new BlockDynamic(new Material(MapColor.mapColorArray[13]),true, 2);
	public static BlockDynamic trainTableTier3 = new BlockDynamic(new Material(MapColor.mapColorArray[13]),true, 3);

	public static BlockDynamic oilSand = new BlockDynamic(new Material(MapColor.mapColorArray[2]), false);
	public static BlockDynamic orePetroleum = new BlockDynamic(new Material(MapColor.mapColorArray[11]), false);

	public static BlockDistil blockDistil = new BlockDistil();
	public static BlockOpenHearthFurnace blockHearthFurnace = new BlockOpenHearthFurnace();

	public static BlockGeneratorDiesel dieselGenerator = new BlockGeneratorDiesel();
	public static BlockBridgePillar bridgePillar = new BlockBridgePillar();

	public static BlockLantern lantern = new BlockLantern();
	// NOTE: i dont think this one was supposed to exist, the render is extra broken,
	//     like it wouldn't have worked in the old 1.7 builds levels of broken.
	//public static BlockSignal signal = new BlockSignal();
	public static BlockTrainWorkbench partTable = new BlockTrainWorkbench();


	public static BlockWindMill windmill = new BlockWindMill();
	public static BlockWaterWheel waterWheel = new BlockWaterWheel();
	public static BlockSwitchStand highStarSwitch = new BlockSwitchStand();


	@Deprecated //need to use TiMGenericRegistry.registerBlock(), this will also cover tile entities and TESR.
	public static void init() {
		trainTableTier1.texture=new ResourceLocation(Info.modID, "textures/blocks/assembly_1.png");
		trainTableTier2.texture=new ResourceLocation(Info.modID, "textures/blocks/assembly_2.png");
		trainTableTier3.texture=new ResourceLocation(Info.modID, "textures/blocks/assembly_3.png");

		blockDistil.texture=new ResourceLocation(Info.modID, "textures/blocks/distil_off.png");

		blockHearthFurnace.texture=new ResourceLocation(Info.modID, "textures/blocks/furnace_off.png");


		partTable.texture=new ResourceLocation(TrainsInMotion.MODID, "textures/blocks/train_table.png");

		oilSand.texture=new ResourceLocation(Info.modID, "textures/blocks/ores/ore_oilsands.png");
		orePetroleum.texture=new ResourceLocation(Info.modID, "textures/blocks/ores/ore_petroleum.png");

		registerBlock(oilSand, Traincraft.tcTab, Info.modID,"block.oilsand", null, null);
		registerBlock(orePetroleum, Traincraft.tcTab, Info.modID,"block.petroleum", "petroleum", null);

		addRecipe(new ItemStack(registerBlock(trainTableTier1, Traincraft.tcTab, Info.modID,"block.traintabletier1", null, null),1),
				"IPI", "S S", "SPS", 'S', Blocks.stone, 'I', Items.iron_ingot, 'P', Blocks.piston); //tier 1
		addRecipe(new ItemStack(registerBlock(trainTableTier2, Traincraft.tcTab, Info.modID,"block.traintabletier2", null, null),1),
				"GPG", "O O", "OPO", 'O', Blocks.obsidian, 'G', Items.gold_ingot, 'P', Blocks.piston); //tier 2
		addRecipe(new ItemStack(registerBlock(trainTableTier3, Traincraft.tcTab, Info.modID,"block.traintabletier3", null, null),1),
				"GPG", "DLD", "OPO", 'O', Blocks.obsidian, 'G', Items.gold_ingot, 'P', Blocks.piston, 'D', Items.diamond, 'L', Blocks.glowstone); //tier 3

		registerBlock(blockDistil, Traincraft.tcTab, Info.modID,"block.distil", null, null);

		registerBlock(blockHearthFurnace, Traincraft.tcTab, Info.modID,"block.hearthfurnace", null, null);

		registerBlock(partTable, Traincraft.tcTab, Info.modID,"block.parttable", null, null);

		if(TrainsInMotion.proxy.isClient()){
			registerBlock(dieselGenerator, Traincraft.tcTab, Info.modID, "block.dieselGenerator", null, new train.render.RenderGeneratorDiesel());
			registerBlock(bridgePillar, Traincraft.tcTab, Info.modID, "block.bridgePillar", null, new train.render.RenderBridgePillar());

			registerBlock(windmill, Traincraft.tcTab, Info.modID, "block.windmill", null, new train.render.RenderWindMill());
			registerBlock(waterWheel, Traincraft.tcTab, Info.modID, "block.waterwheel", null, new train.render.RenderWaterWheel());
			registerBlock(highStarSwitch, Traincraft.tcTab, Info.modID, "block.highstar", null, new train.render.RenderSwitchStand());

			//registerBlock(signal, Traincraft.tcTab, Info.modID, "block.signal", null, new train.render.RenderSignal());
			registerBlock(lantern, Traincraft.tcTab, Info.modID, "block.lantern", null, new train.render.RenderLantern());
		} else {
			registerBlock(dieselGenerator, Traincraft.tcTab, Info.modID, "block.dieselGenerator", null, null);
			registerBlock(bridgePillar, Traincraft.tcTab, Info.modID, "block.bridgePillar", null, null);

			registerBlock(windmill, Traincraft.tcTab, Info.modID, "block.windmill", null, null);
			registerBlock(waterWheel, Traincraft.tcTab, Info.modID, "block.waterwheel", null, null);
			registerBlock(highStarSwitch, Traincraft.tcTab, Info.modID, "block.highstar", null, null);

			//registerBlock(signal, Traincraft.tcTab, Info.modID, "block.signal", null, null);
			registerBlock(lantern, Traincraft.tcTab, Info.modID, "block.lantern", null, null);
		}

		OreDictionary.registerOre("oreOilsands", new ItemStack(oilSand, 1, 1));
		OreDictionary.registerOre("orePetroleum", new ItemStack(orePetroleum, 1, 2));


		OreDictionary.registerOre("dustCoal", new ItemStack(ItemIDs.coaldust.item));
		setHarvestLevels();

	}

	public static void setHarvestLevels() {
		orePetroleum.setHarvestLevel("pickaxe", 1);

		Blocks.rail.setHarvestLevel("ItemStacked", 0);
		Blocks.detector_rail.setHarvestLevel("ItemStacked", 0);
		Blocks.golden_rail.setHarvestLevel("ItemStacked", 0);
	}
}