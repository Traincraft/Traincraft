/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.core.handlers;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import train.common.inventory.TrainCraftingManager;
import train.common.library.BlockIDs;
import train.common.library.ItemIDs;
import train.common.recipes.RecipesArmorDyes;

import java.util.ArrayList;
import java.util.List;

import static train.common.recipes.AssemblyTableRecipes.waterContainers;

public class RecipeHandler {

	private static ArrayList<ItemStack> multiNameOreDict(String ... names){
		ArrayList<ItemStack> entries = new ArrayList<ItemStack>();
		for (String name : names){
			entries.addAll(OreDictionary.getOres(name));
		}
		return entries;
	}

	public static void initBlockRecipes() {
		ArrayList<ItemStack> iron = OreDictionary.getOres("ingotIron");

		TrainCraftingManager.instance.getRecipeList().add(new RecipesArmorDyes());
		/* Assembly tables */
		for (ItemStack ironingot : iron) {
			GameRegistry.addRecipe(new ItemStack(BlockIDs.assemblyTableI.block, 1), "IPI", "S S", "SPS", Character.valueOf('I'), ironingot, Character.valueOf('P'), Blocks.piston, Character.valueOf('S'), Blocks.stone);
		}
		GameRegistry.addRecipe(new ItemStack(BlockIDs.assemblyTableII.block, 1),  "GPG", "O O", "OPO", Character.valueOf('G'), Items.gold_ingot, Character.valueOf('P'), Blocks.piston, Character.valueOf('O'), Blocks.obsidian );
		GameRegistry.addRecipe(new ItemStack(BlockIDs.assemblyTableIII.block, 1),  "GPG", "DLD", "OPO", Character.valueOf('G'), Items.gold_ingot, Character.valueOf('P'), Blocks.piston, Character.valueOf('D'), Items.diamond, Character.valueOf('L'), Blocks.glowstone, Character.valueOf('O'), Blocks.obsidian );

		if (!ConfigHandler.DISABLE_TRAIN_WORKBENCH) {
			for (ItemStack ironingot : iron) {
				addDictRecipe(new ItemStack(BlockIDs.trainWorkbench.block, 1), "###", "IFI", "###", Character.valueOf('#'), "plankWood", Character.valueOf('F'), Blocks.furnace, Character.valueOf('I'), ironingot);
			}
		}
		addDictRecipe(new ItemStack(BlockIDs.distilIdle.block, 1),  "###", "#F#", "###", Character.valueOf('#'), "ingotSteel", Character.valueOf('F'), ItemIDs.firebox.item );

		/* Open Hearth Furnace */
		if (!ConfigHandler.MAKE_MODPACKS_GREAT_AGAIN) {
			GameRegistry.addRecipe(new ItemStack(BlockIDs.openFurnaceIdle.block, 1), "#L#", "#B#", "#I#",
					Character.valueOf('#'), Blocks.nether_brick, Character.valueOf('L'), Items.lava_bucket,
					Character.valueOf('B'), Items.bucket, Character.valueOf('I'), Blocks.iron_block);
		}

		/* Lantern */
		for (ItemStack ironingot : iron) {
			GameRegistry.addRecipe(new ItemStack(BlockIDs.lantern.block, 4), "III", "PTP", "III", Character.valueOf('I'), ironingot, Character.valueOf('P'), Blocks.glass_pane, Character.valueOf('T'), Blocks.torch);
		}
		
		/* Clothes */
		GameRegistry.addRecipe(new ItemStack(ItemIDs.overalls.item, 1),  " # ", "X$X", "X$X", Character.valueOf('X'), new ItemStack(Items.dye, 1, 4), Character.valueOf('$'), Items.leather_leggings, Character.valueOf('#'), new ItemStack(Items.dye, 1, 1) );
		GameRegistry.addRecipe(new ItemStack(ItemIDs.jacket.item, 1),  "X X", "X$X", "X#X", Character.valueOf('X'), new ItemStack(Items.dye, 1, 14), Character.valueOf('$'), Items.leather_chestplate, Character.valueOf('#'), Items.string );
		GameRegistry.addRecipe(new ItemStack(ItemIDs.hat.item, 1),  " X ", "X$X", "#X#", Character.valueOf('X'), new ItemStack(Items.dye, 1, 4), Character.valueOf('$'), Items.leather_helmet, Character.valueOf('#'), Items.string );

		/* Driver Clothes*/
		GameRegistry.addRecipe(new ItemStack(ItemIDs.pants_driver_paintable.item, 1),  "XXX", "XLX", "X$X", Character.valueOf('L'), Items.leather_leggings,Character.valueOf('$'), new ItemStack(Items.dye, 1, 4), Character.valueOf('X'), Items.string);
		GameRegistry.addRecipe(new ItemStack(ItemIDs.jacket_driver_paintable.item, 1),  "X X", "XRX", "XPX", Character.valueOf('X'), new ItemStack(Items.dye, 1, 4), Character.valueOf('P'), Items.leather_chestplate,Character.valueOf('R'),  new ItemStack(Items.dye, 1, 1) );
		GameRegistry.addRecipe(new ItemStack(ItemIDs.hat_driver_paintable.item, 1), "#$#", "# #", Character.valueOf('$'), new ItemStack(Items.dye, 1, 4), Character.valueOf('#'), Items.string );
		
		/* Ticket Man Clothes */
		GameRegistry.addRecipe(new ItemStack(ItemIDs.pants_ticketMan_paintable.item, 1),  "XXX", "XLX", "X$X", Character.valueOf('L'), Items.leather_leggings,Character.valueOf('$'), new ItemStack(Items.dye, 1, 8), Character.valueOf('X'), Items.string);
		GameRegistry.addRecipe(new ItemStack(ItemIDs.jacket_ticketMan_paintable.item, 1),  "X X", "XPX", "X#X", Character.valueOf('P'), Items.leather_chestplate, Character.valueOf('#'), new ItemStack(Items.dye, 1, 4), Character.valueOf('X'), Items.string);
		GameRegistry.addRecipe(new ItemStack(ItemIDs.hat_ticketMan_paintable.item, 1), "#$#", "# #", Character.valueOf('$'), new ItemStack(Items.dye, 1, 0), Character.valueOf('#'), Items.string );
		
		/* Recipe book */
		GameRegistry.addRecipe(new ItemStack(ItemIDs.recipeBook.item, 1),  "TTT", "TBT", "TTT", Character.valueOf('T'), Blocks.rail, Character.valueOf('B'), Items.book );

		// Track recipes -hariesh
		GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailSmallStraight.item, 16),  "G G", "GPG", "G G", Character.valueOf('G'), Items.iron_ingot, Character.valueOf('P'), Blocks.planks );
		GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailMediumStraight.item, 1),  "G  ", "G  ", "G  ", Character.valueOf('G'), ItemIDs.tcRailSmallStraight.item );
		GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailLongStraight.item, 1),  "G  ", "G  ", "   ", Character.valueOf('G'), ItemIDs.tcRailMediumStraight.item );
		GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailMediumTurn.item, 1),  "GG ", "G  ", "   ", Character.valueOf('G'), ItemIDs.tcRailSmallStraight.item );
		GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailMediumSwitch.item, 1),  "G  ", "GHG", "G  ", Character.valueOf('G'), ItemIDs.tcRailSmallStraight.item, Character.valueOf('H'), ItemIDs.tcRailMediumTurn.item );
		GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailMediumParallelSwitch.item, 1),  "I G", "IHH", "IH ", Character.valueOf('G'), ItemIDs.tcRailSmallStraight.item, Character.valueOf('H'), ItemIDs.tcRailMediumTurn.item, Character.valueOf('I'), ItemIDs.tcRailMediumStraight.item );
		GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailLargeTurn.item, 1),  " GG", "GG ", "G  ", Character.valueOf('G'), ItemIDs.tcRailSmallStraight.item );
		GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailLargeSwitch.item, 1),  "G  ", "HIG", "G  ", Character.valueOf('G'), ItemIDs.tcRailSmallStraight.item, Character.valueOf('H'), ItemIDs.tcRailMediumStraight.item, Character.valueOf('I'), ItemIDs.tcRailLargeTurn.item );
		GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailVeryLargeTurn.item, 1), "SS ","S  ","   ", Character.valueOf('S'), ItemIDs.tcRailMediumTurn.item );
		GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailSlopeGravel.item, 1), " TG","TGG","GGG", Character.valueOf('T'), ItemIDs.tcRailMediumStraight.item, Character.valueOf('G'), Blocks.gravel);
		GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailLargeSlopeGravel.item,1), "   ","  S"," S ", Character.valueOf('S'), ItemIDs.tcRailSlopeGravel.item);
		GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailSlopeSnowGravel.item, 1), " TS","TSS","SSS", Character.valueOf('T'), ItemIDs.tcRailMediumStraight.item, Character.valueOf('S'), new ItemStack(BlockIDs.oreTC.block, 1,4));
		GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailLargeSlopeSnowGravel.item, 1), "   ","  T"," T ", Character.valueOf('T'), ItemIDs.tcRailSlopeSnowGravel.item);
		GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailVeryLargeSlopeSnowGravel.item, 1), "   ","  T"," T ", Character.valueOf('T'), ItemIDs.tcRailLargeSlopeSnowGravel.item);
		GameRegistry.addShapelessRecipe(new ItemStack(ItemIDs.tcRailSuperLargeTurn.item, 1), ItemIDs.tcRailVeryLargeTurn.item, ItemIDs.tcRailVeryLargeTurn.item);
		GameRegistry.addRecipe(new ItemStack(ItemIDs.bolt.item, 16), " II", " I ", " I ", Character.valueOf('I'), Items.iron_ingot);
		GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailConcreteSmallStraight.item, 16), "I I", "IBI", "I I", Character.valueOf('I'), Items.iron_ingot, Character.valueOf('B'), ItemIDs.bolt.item);
		GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailSmallStraight.item, 32), "I I", "BLB", "I I", Character.valueOf('I'), Items.iron_ingot, Character.valueOf('B'), ItemIDs.bolt.item, Character.valueOf('L'), Blocks.log);

		//here we go paintbrush -hariesh
		GameRegistry.addRecipe(new ItemStack(ItemIDs.paintbrushThing.item,1),"GB ","RIS"," ST", Character.valueOf('G'), new ItemStack(Items.dye,1,2), Character.valueOf('B'), new ItemStack(Items.dye,1,4), Character.valueOf('R'), new ItemStack(Items.dye,1,1), Character.valueOf('I'), new ItemStack(Items.iron_ingot), Character.valueOf('S'), new ItemStack(Items.string), Character.valueOf('T'), new ItemStack(Items.stick));
		GameRegistry.addShapelessRecipe(new ItemStack(BlockIDs.poweredGravel.block,1), new ItemStack(Items.redstone), new ItemStack(Blocks.gravel));
		GameRegistry.addShapelessRecipe(new ItemStack(BlockIDs.snowGravel.block,1 ), new ItemStack(Items.snowball), new ItemStack(Blocks.gravel));
		GameRegistry.addShapelessRecipe(new ItemStack(BlockIDs.snowGravel.block,4 ), new ItemStack(Blocks.snow), new ItemStack(Blocks.gravel), new ItemStack(Blocks.gravel), new ItemStack(Blocks.gravel), new ItemStack(Blocks.gravel));
		GameRegistry.addRecipe(new ItemStack(BlockIDs.signalSpanish.block,1), " L ", " I ", "RIR", Character.valueOf('L'), new ItemStack(Blocks.redstone_lamp), Character.valueOf('I'), new ItemStack(Items.iron_ingot), Character.valueOf('R'), new ItemStack(Items.redstone));
		GameRegistry.addRecipe(new ItemStack(BlockIDs.kSignal.block,1), "RIR", " I ", " L ", Character.valueOf('L'), new ItemStack(Blocks.redstone_lamp), Character.valueOf('I'), new ItemStack(Items.iron_ingot), Character.valueOf('R'), new ItemStack(Items.redstone));
		GameRegistry.addRecipe(new ItemStack(BlockIDs.bridgePillar.block, 8), "SSS", "SLS", "SSS", Character.valueOf('S'), new ItemStack(Items.stick), Character.valueOf('L'), new ItemStack(Blocks.log));
		GameRegistry.addRecipe(new ItemStack(BlockIDs.speedSign.block, 8), " R ", " I ", " I ", Character.valueOf('R'), new ItemStack(Items.dye,1,1), Character.valueOf('I'), new ItemStack(Items.iron_ingot));

		//Gravel
		GameRegistry.addShapelessRecipe(new ItemStack(BlockIDs.oreTC.block, 4,3), Blocks.gravel, Blocks.gravel,  Items.clay_ball);
		GameRegistry.addShapelessRecipe(new ItemStack(BlockIDs.oreTC.block, 16, 3), Blocks.gravel,Blocks.gravel,Blocks.gravel,Blocks.gravel,Blocks.gravel,Blocks.gravel,Blocks.gravel,Blocks.gravel,Blocks.clay);
		GameRegistry.addShapelessRecipe(new ItemStack(BlockIDs.dirtyBallast.block, 16),Blocks.gravel,Blocks.gravel,Blocks.gravel,Blocks.gravel,Blocks.gravel,Blocks.gravel,Blocks.gravel,Blocks.gravel, Blocks.dirt);
		GameRegistry.addShapelessRecipe(new ItemStack(BlockIDs.dirtierBallast.block, 16), new ItemStack(BlockIDs.dirtyBallast.block,1 ), new ItemStack(BlockIDs.dirtyBallast.block,1 ),new ItemStack(BlockIDs.dirtyBallast.block,1 ),new ItemStack(BlockIDs.dirtyBallast.block,1 ),new ItemStack(BlockIDs.dirtyBallast.block,1 ),new ItemStack(BlockIDs.dirtyBallast.block,1 ),new ItemStack(BlockIDs.dirtyBallast.block,1 ),new ItemStack(BlockIDs.dirtyBallast.block,1 ), Blocks.dirt);

		for (ItemStack ironingot : iron) {
			addDictRecipe(new ItemStack(BlockIDs.switchStand.block, 1), " W ", " I ", " R ", Character.valueOf('W'), Blocks.lever, Character.valueOf('R'), Items.stick, Character.valueOf('I'), ironingot);
			addDictRecipe(new ItemStack(BlockIDs.MILWSwitchStand.block, 1)," RW","BWR","AAA", Character.valueOf('A'), new ItemStack(Items.stick), Character.valueOf('B'), Blocks.iron_bars, Character.valueOf('R'), new ItemStack(Items.dye, 1, 1), Character.valueOf('W'), new ItemStack(Items.dye, 1, 15));
			addDictRecipe(new ItemStack(BlockIDs.MFPBWigWag.block, 1), "IWI", " I ", " I ", Character.valueOf('W'), Blocks.lever, Character.valueOf('I'), ironingot);
			/*Buffer*/
			addDictRecipe(new ItemStack(BlockIDs.stopper.block, 1), "WWW", "I I", "RRR", Character.valueOf('W'), "plankWood", Character.valueOf('R'), Blocks.rail, Character.valueOf('I'), ironingot);
		}
		

	}

	public static void initItemRecipes() {

		ArrayList<ItemStack> steel = OreDictionary.getOres("ingotSteel");
		ArrayList<ItemStack> iron = OreDictionary.getOres("ingotIron");
		ArrayList<ItemStack> planks = OreDictionary.getOres("plankWood");
		ArrayList<ItemStack> logs = OreDictionary.getOres("logWood");
		ArrayList<ItemStack> plastics	= multiNameOreDict("itemPlastic", "dustPlastic");//dustPlastic for MFR support
		ArrayList<ItemStack> copper = OreDictionary.getOres("ingotCopper");
		ArrayList<ItemStack> dustCoal = OreDictionary.getOres("dustCoal");
		List<ItemStack> coal = new ArrayList<ItemStack>();
		coal.add(new ItemStack(Items.coal));
		coal.addAll(OreDictionary.getOres("coal"));
		ArrayList<ItemStack> redstone = OreDictionary.getOres("dustRedstone");
		ArrayList<ItemStack> waterbucket = waterContainers();
		// Always do this " X " instead of this "X", and do not put "" empty brackets

		/* I placed it here because workbench should be one of the first recipe shown in the recipe book */
		for (ItemStack plank : planks) {
			for (ItemStack ironingot : iron) {
				TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.trainWorkbench.block, 1), "###", "IFI", "###", Character.valueOf('#'), plank, Character.valueOf('F'), Blocks.furnace, Character.valueOf('I'), ironingot);
			}
		}
		
		/* Recipe book */
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.recipeBook.item, 1),  "TTT", "TBT", "TTT", Character.valueOf('T'), Blocks.rail, Character.valueOf('B'), Items.book );

		/* Chunk Loader Activator */
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.chunkLoaderActivator.item, 1),  "  P", " S ", "S  ", Character.valueOf('S'), Items.blaze_rod, Character.valueOf('P'), Items.ender_pearl );

		// Switches -hariesh
		GameRegistry.addRecipe(new ItemStack(BlockIDs.owoYardSwitchStand.block,1), "   ","OS ","IW ", Character.valueOf('O'), new ItemStack(Items.dye, 1, 14), Character.valueOf('S'), Items.stick, Character.valueOf('I'), Items.iron_ingot, Character.valueOf('W'), Blocks.planks);
		GameRegistry.addRecipe(new ItemStack(BlockIDs.owoSwitchStand.block, 1), " O "," S ", " IW", Character.valueOf('O'), new ItemStack(Items.dye, 1, 14), Character.valueOf('S'), Items.stick, Character.valueOf('I'), Items.iron_ingot, Character.valueOf('W'), Blocks.planks);
		GameRegistry.addRecipe(new ItemStack(BlockIDs.circleSwitchStand.block, 1), " R ", " S ", " IW", Character.valueOf('R'), new ItemStack(Items.dye, 1, 1), Character.valueOf('S'), Items.stick, Character.valueOf('I'), Items.iron_ingot, Character.valueOf('W'), Blocks.planks);
		GameRegistry.addRecipe(new ItemStack(BlockIDs.autoSwtichStand.block, 1), "   ","C  ","BIW", Character.valueOf('C'), new ItemStack(ItemIDs.electronicCircuit.item,1), Character.valueOf('B'), Blocks.iron_block, Character.valueOf('S'), Items.stick, Character.valueOf('I'), Items.iron_ingot, Character.valueOf('W'), Blocks.planks);
		GameRegistry.addRecipe(new ItemStack(ItemIDs.paintbrushThing.item,1),"GB ","RIS"," ST", Character.valueOf('G'), new ItemStack(Items.dye,1,2), Character.valueOf('B'), new ItemStack(Items.dye,1,4), Character.valueOf('R'), new ItemStack(Items.dye,1,1), Character.valueOf('I'), new ItemStack(Items.iron_ingot), Character.valueOf('S'), new ItemStack(Items.string), Character.valueOf('T'), new ItemStack(Items.stick));



		/* Assembly tables */

		for (ItemStack ironingot : iron) {
			TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.assemblyTableI.block, 1), "IPI", "S S", "SPS", Character.valueOf('I'), ironingot, Character.valueOf('P'), Blocks.piston, Character.valueOf('S'), Blocks.stone);
		}
		TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.assemblyTableII.block, 1),  "GPG", "O O", "OPO", Character.valueOf('G'), Items.gold_ingot, Character.valueOf('P'), Blocks.piston, Character.valueOf('O'), Blocks.obsidian );
		TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.assemblyTableIII.block, 1),  "GPG", "DLD", "OPO", Character.valueOf('G'), Items.gold_ingot, Character.valueOf('P'), Blocks.piston, Character.valueOf('D'), Items.diamond, Character.valueOf('L'), Blocks.glowstone, Character.valueOf('O'), Blocks.obsidian );

		/* Open Hearth Furnace */
		TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.openFurnaceIdle.block, 1),  "#L#", "#B#", "#I#", Character.valueOf('#'), Blocks.nether_brick, Character.valueOf('L'), Items.lava_bucket, Character.valueOf('B'), Items.bucket, Character.valueOf('I'), Blocks.iron_block );

		/* Lantern */
		for (ItemStack ironingot : iron) {
			TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.lantern.block, 4), "III", "PTP", "III", Character.valueOf('I'), ironingot, Character.valueOf('P'), Blocks.glass_pane, Character.valueOf('T'), Blocks.torch);
		}
		/* Clothes */
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.overalls.item, 1),  " # ", "X$X", "X X", Character.valueOf('X'), new ItemStack(Items.dye, 1, 4), Character.valueOf('$'), Items.leather_leggings, Character.valueOf('#'), new ItemStack(Items.dye, 1, 1) );
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.jacket.item, 1),  "X X", "X$X", "X#X", Character.valueOf('X'), new ItemStack(Items.dye, 1, 14), Character.valueOf('$'), Items.leather_chestplate, Character.valueOf('#'), Items.string );
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.hat.item, 1),  " X ", "X$X", "#X#", Character.valueOf('X'), new ItemStack(Items.dye, 1, 4), Character.valueOf('$'), Items.leather_helmet, Character.valueOf('#'), Items.string );
		
		/* Driver Clothes*/
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.pants_driver_paintable.item, 1),  "XXX", "XLX", "X$X", Character.valueOf('L'), Items.leather_leggings,Character.valueOf('$'), new ItemStack(Items.dye, 1, 4), Character.valueOf('X'), Items.string);
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.jacket_driver_paintable.item, 1),  "X X", "XRX", "XPX", Character.valueOf('X'), new ItemStack(Items.dye, 1, 4), Character.valueOf('P'), Items.leather_chestplate,Character.valueOf('R'),  new ItemStack(Items.dye, 1, 1) );
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.hat_driver_paintable.item, 1), "#$#", "# #", Character.valueOf('$'), new ItemStack(Items.dye, 1, 4), Character.valueOf('#'), Items.string );
		
		/* Ticket Man Clothes */
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.pants_ticketMan_paintable.item, 1),  "XXX", "XLX", "X$X", Character.valueOf('L'), Items.leather_leggings,Character.valueOf('$'), new ItemStack(Items.dye, 1, 8), Character.valueOf('X'), Items.string);
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.jacket_ticketMan_paintable.item, 1),  "X X", "XPX", "X#X", Character.valueOf('P'), Items.leather_chestplate, Character.valueOf('#'), new ItemStack(Items.dye, 1, 4), Character.valueOf('X'), Items.string);
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.hat_ticketMan_paintable.item, 1), "#$#", "# #", Character.valueOf('$'), new ItemStack(Items.dye, 1, 0), Character.valueOf('#'), Items.string );
		
		

		if (plastics != null && plastics.size() >= 0) {
			for (ItemStack plastic : plastics) {
				/* Empty canister */
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.emptyCanister.item, 4),  "PPP", "P P", "PPP", Character.valueOf('P'), plastic);
				for (ItemStack rs :redstone) {
					/* Electronic circuit */
					TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.electronicCircuit.item, 1), "XXX", "RPR", "XXX", Character.valueOf('X'), ItemIDs.copperWireFine.item, Character.valueOf('P'), plastic, Character.valueOf('R'), rs.getItem());
				}
				/* Composite Material*/
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.reinforcedPlastic.item, 16),  "LPL", "PLP", "GPG", Character.valueOf('G'), Blocks.glass_pane, Character.valueOf('P'), ItemIDs.graphite.item, Character.valueOf('L'), plastic);
				
				if (copper != null && copper.size() >= 0) {
					for (ItemStack copp : copper) {
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.copperWireFine.item, 6),  "XXX", "XPX", "XXX", Character.valueOf('X'), copp, Character.valueOf('P'), plastic );
						GameRegistry.addRecipe(new ItemStack(BlockIDs.overheadWire.block, 16), "IC ","I  ","I  ", Character.valueOf('I'), new ItemStack(Items.iron_ingot,1), Character.valueOf('C'), copp);
						GameRegistry.addRecipe(new ItemStack(BlockIDs.overheadWireDouble.block, 16), "ICI","ICI","I I", Character.valueOf('I'), new ItemStack(Items.iron_ingot,1), Character.valueOf('C'), copp);

					}
				}	
			}
		}
		
		/* Composite Suit */
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.boots_suit_paintable.item, 1), " D ","X X", "XFX", Character.valueOf('F'), Items.feather, Character.valueOf('D'), Items.diamond, Character.valueOf('X'), ItemIDs.reinforcedPlates.item);
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.pants_suit_paintable.item, 1),  "XDX", "X$X", "X X", Character.valueOf('$'), Items.fire_charge, Character.valueOf('X'), ItemIDs.reinforcedPlates.item,Character.valueOf('D'), Items.diamond);
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.jacket_suit_paintable.item, 1),  "X X", "XDX", "XAX", Character.valueOf('A'), Items.golden_apple, Character.valueOf('X'), ItemIDs.reinforcedPlates.item,Character.valueOf('D'), Blocks.diamond_block);
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.helmet_suit_paintable.item, 1), "#D#", "# #", Character.valueOf('D'), Blocks.diamond_block, Character.valueOf('#'), ItemIDs.reinforcedPlates.item );

		/* Trains parts */

		for (ItemStack ironingot : iron) {
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.generator.item, 1), " ##", "E$$", " ##", Character.valueOf('#'), ItemIDs.copperWireFine.item, Character.valueOf('E'), ItemIDs.electronicCircuit.item, Character.valueOf('$'), ironingot);// generator
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.controls.item, 1), "#X#", "#E#", "$$$", Character.valueOf('#'), Blocks.lever, Character.valueOf('X'), Blocks.stone_button, Character.valueOf('$'), ironingot, Character.valueOf('E'), ItemIDs.electronicCircuit.item);// train controls
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.electmotor.item, 1), "I#I", "#E#", "I#I", Character.valueOf('#'), ItemIDs.copperWireFine.item, Character.valueOf('I'), ironingot, Character.valueOf('E'), ItemIDs.electronicCircuit.item);// Electric motor
			for (ItemStack bucketWater : waterbucket) {
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.ironBoiler.item, 2), "###", "XXX", "###", Character.valueOf('#'), ironingot, Character.valueOf('X'), bucketWater.getItem());// iron Boiler
			}
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.ironFirebox.item, 2),  "###", "#X#", "###", Character.valueOf('#'), ironingot, Character.valueOf('X'), Items.flint_and_steel );// iron Firebox
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.ironChimney.item, 2),  "# #", "# #", "# #", Character.valueOf('#'), ironingot );
		}
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.dieselengine.item, 2), "###", "XXX", "CCC", Character.valueOf('#'), ItemIDs.piston.item, Character.valueOf('X'), ItemIDs.cylinder.item, Character.valueOf('C'), ItemIDs.camshaft.item);// diesel engine
		for (ItemStack dustStack : dustCoal) {
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.graphite.item, 2),  "###", "#X#", "###", Character.valueOf('#'), dustStack, Character.valueOf('X'), Items.clay_ball );// Graphite
		}
		
		if (!ConfigHandler.MAKE_MODPACKS_GREAT_AGAIN) {
			for (ItemStack c : coal) {
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.coaldust.item, 4),
						"###", "   ", "   ", Character.valueOf('#'), c.getItem());
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.coaldust.item, 4),
						"   ", "###", "   ", Character.valueOf('#'), c.getItem());
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.coaldust.item, 4),
						"   ", "   ", "###", Character.valueOf('#'), c.getItem());
			}
		}
		
		//TrainCraftingManager.instance.addShapelessRecipe(new ItemStack(ItemIDs.coaldust.item, 4),  c.getItem(), c.getItem(), c.getItem(), c.getItem() );// coal dust
		
		//TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.signal.item, 2),  "#", "X", "X", Character.valueOf('X'), ItemIDs.steel.item, Character.valueOf('#'), rs );
		/* diesel generator */
		TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.generatorDiesel.block, 1),  "C  ", "DE ", Character.valueOf('C'), ItemIDs.steelchimney.item, Character.valueOf('D'), ItemIDs.dieselengine.item, Character.valueOf('E'), ItemIDs.electronicCircuit.item );
		
		/* Zepplin parts and zeppelin item */
		if (ConfigHandler.ENABLE_ZEPPELIN) {
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.balloon.item, 1),  "###", "# #", "###", Character.valueOf('#'), Blocks.wool );// Balloon
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.steamengine.item, 1),  "C  ", "BF ", Character.valueOf('C'), ItemIDs.steelchimney.item, Character.valueOf('B'), ItemIDs.boiler.item, Character.valueOf('F'), ItemIDs.firebox.item );// Small steam engine
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.airship.item, 1),  "B B", "SES", "POP", Character.valueOf('B'), ItemIDs.balloon.item, Character.valueOf('S'), Items.stick, Character.valueOf('E'), ItemIDs.steamengine.item, Character.valueOf('P'), ItemIDs.propeller.item, Character.valueOf('O'), Items.boat );
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.zeppelin.item, 1),  "BBB", "SES", "POP", Character.valueOf('B'), ItemIDs.balloon.item, Character.valueOf('S'), ItemIDs.propeller.item, Character.valueOf('E'), ItemIDs.controls.item, Character.valueOf('P'), ItemIDs.electmotor.item, Character.valueOf('O'), ItemIDs.seats.item );
		}

		for (ItemStack plankItem : planks) {
			for (ItemStack steelItem: steel) {

				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.reinforcedPlates.item, 1),  "RRR", "SSS", "CCC", Character.valueOf('R'), ItemIDs.reinforcedPlastic.item, Character.valueOf('S'), steelItem, Character.valueOf('C'), Items.clay_ball);

				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.composite_wrench.item, 1), "S S", " R "," R ", Character.valueOf('R'), ItemIDs.reinforcedPlastic.item, Character.valueOf('S'),steelItem );
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.steelcab.item, 2),  "###", "X X", "XXX", Character.valueOf('X'), steelItem, Character.valueOf('#'), plankItem );// Steel cab
				TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.distilIdle.block, 1),  "###", "#F#", "###", Character.valueOf('#'), steelItem, Character.valueOf('F'), ItemIDs.firebox.item );
				for (ItemStack rs :redstone) {
					TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.transformer.item, 1), "# #", "XEX", "###", Character.valueOf('#'), steelItem, Character.valueOf('E'), ItemIDs.electronicCircuit.item, Character.valueOf('X'), rs.getItem());// transformer
				}

				for (ItemStack bucketWater :waterbucket) {
					TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.boiler.item, 2), "###", "XXX", "###", Character.valueOf('#'), steelItem, Character.valueOf('X'), bucketWater.getItem());// Boiler
				}
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.firebox.item, 2),  "###", "#X#", "###", Character.valueOf('#'), steelItem, Character.valueOf('X'), Items.flint_and_steel );// Firebox
				for (ItemStack ironingot : iron) {
					TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.bogie.item, 4), " # ", "#X#", " # ", Character.valueOf('#'), steelItem, Character.valueOf('X'), ironingot);// Bogie
					TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.steelframe.item, 2), "# #", "AAA", Character.valueOf('A'), steelItem, Character.valueOf('#'), ironingot);// Steel Frame
					TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.steelframe.item, 2), "   ", "# #", "AAA", Character.valueOf('A'), steelItem, Character.valueOf('#'), ironingot);// Steel Frame

					TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.stake.item, 1),  "   ", "IFI", "   ", Character.valueOf('I'), steelItem, Character.valueOf('F'), ironingot );
					TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.stake.item, 1),  "IFI", "   ", "   ", Character.valueOf('I'), steelItem, Character.valueOf('F'), ironingot );
					TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.stake.item, 1),  "   ", "   ", "IFI", Character.valueOf('I'), steelItem, Character.valueOf('F'), ironingot );

					TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.propeller.item, 2),  " # ", "#X#", " # ", Character.valueOf('#'), plankItem, Character.valueOf('X'), ironingot );// Propeller
				}
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.steelchimney.item, 2),  "# #", "# #", "# #", Character.valueOf('#'), steelItem );// Bogie
				TrainCraftingManager.instance.addRecipe(new ItemStack(Items.flint_and_steel, 2),  "* ", " #", Character.valueOf('*'), steelItem, Character.valueOf('#'), Items.flint );


				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.transmition.item, 1),  " # ", "#X#", " # ", Character.valueOf('#'), steelItem, Character.valueOf('X'), ItemIDs.diesel.item );// transmition
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.piston.item, 3),  " # ", " X ", Character.valueOf('#'), steelItem, Character.valueOf('X'), Items.stick );// piston
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.camshaft.item, 3),  "###", "   ", "   ", Character.valueOf('#'), steelItem );// camshaft
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.camshaft.item, 3),  "   ", "###", "   ", Character.valueOf('#'), steelItem );// camshaft
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.camshaft.item, 3),  "   ", "   ", "###", Character.valueOf('#'), steelItem );// camshaft
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.cylinder.item, 3),  "# #", "# #", "###", Character.valueOf('#'), steelItem );// cylinder

			}
			for (ItemStack ironItem : iron) {
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailSmallStraight.item, 16), "I I", "IPI", "I I", Character.valueOf('P'), plankItem, Character.valueOf('I'), ironItem);// small straight track

				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailSmallRoadCrossing.item, 16), "I I", "IPI", "I I", Character.valueOf('P'), new ItemStack(Blocks.stained_hardened_clay, 1, 15), Character.valueOf('I'), ironItem);
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailSmallRoadCrossing1.item, 16), "I I", "IPI", "I I", Character.valueOf('P'), new ItemStack(Blocks.stained_hardened_clay, 1, 7), Character.valueOf('I'), ironItem);
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailSmallRoadCrossing2.item, 16), "I I", "IPI", "I I", Character.valueOf('P'), new ItemStack(Blocks.stained_hardened_clay, 1, 8), Character.valueOf('I'), ironItem);
			}
			for (ItemStack logStack :logs) {
				/* Water Wheel */
				TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.waterWheel.block, 1),  " P ", "PGP", " P ", Character.valueOf('P'), logStack,Character.valueOf('G'), ItemIDs.generator.item);

				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.woodenBogie.item, 4),  " # ", "#X#", " # ", Character.valueOf('#'), plankItem, Character.valueOf('X'), logStack );// wooden Bogie
			}
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.woodenFrame.item, 2),  "# #", "AAA", Character.valueOf('A'), plankItem, Character.valueOf('#'), plankItem );// wooden Frame
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.woodenFrame.item, 2),  "   ", "# #", "AAA", Character.valueOf('A'), plankItem, Character.valueOf('#'), plankItem );// wooden Frame
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.woodenCab.item, 2),  "###", "X X", "XXX", Character.valueOf('X'), plankItem, Character.valueOf('#'), plankItem );// wooden cab

			for (ItemStack ironingot : iron) {
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.seats.item, 1), "#  ", "## ", "XXX", Character.valueOf('#'), plankItem, Character.valueOf('X'), ironingot);// transformer
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.ironBogie.item, 4), " # ", "#X#", " # ", Character.valueOf('#'), ironingot, Character.valueOf('X'), plankItem);// iron Bogie
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.ironFrame.item, 2), "# #", "AAA", Character.valueOf('A'), ironingot, Character.valueOf('#'), plankItem);// iron Frame
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.ironFrame.item, 2), "   ", "# #", "AAA", Character.valueOf('A'), ironingot, Character.valueOf('#'), plankItem);// iron Frame
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.ironCab.item, 2), "###", "X X", "XXX", Character.valueOf('X'), ironingot, Character.valueOf('#'), plankItem);// iron cab
				TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.stopper.block, 1), "WWW", "I I", "RRR", Character.valueOf('W'), plankItem, Character.valueOf('R'), Blocks.rail, Character.valueOf('I'), ironingot);// stopper
				TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.switchStand.block, 1), " W ", " I ", " R ", Character.valueOf('W'), Blocks.lever, Character.valueOf('R'), Items.stick, Character.valueOf('I'), ironingot);//switchstand
				TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.MFPBWigWag.block, 1), "IWI", " I ", " I ", Character.valueOf('W'), Blocks.lever, Character.valueOf('I'), ironingot);//wigwag
			}
			// Short Wood Slope
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailSlopeWood.item, 1),
					 " MW", "MWW", "WWW", Character.valueOf('M'), ItemIDs.tcRailMediumStraight.item,
							Character.valueOf('W'), plankItem );
		}
				/* Wind mill */
		for (ItemStack ironingot : iron) {
			TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.windMill.block, 1), " R ", " G ", "B B", Character.valueOf('G'), ItemIDs.generator.item, Character.valueOf('B'), ironingot, Character.valueOf('R'), ItemIDs.propeller.item);

			if (Loader.isModLoaded("ComputerCraft")) {
				TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.mtcTransmitterSpeed.block, 1), "SRS", "RTR", "SRS", 'S', ironingot, 'R', Items.redstone, 'T', Blocks.stone_pressure_plate);
				TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.mtcReceiverMTC.block, 1), "STS", " R ", "SPS", 'S', ironingot, 'R', Items.redstone, 'P', Items.repeater, 'T', new ItemStack(Blocks.torch, 1));
				TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.mtcTransmitterMTC.block, 1), "SPS", " R ", "STS", 'S', ironingot, 'R', Items.redstone, 'P', Items.repeater, 'T', new ItemStack(Blocks.torch, 1));
				TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.mtcReceiverDestination.block, 1), "SRS", "RTR", "SRS", 'S', ironingot, 'R', Items.redstone, 'T', Items.sign);
				TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.mtcATOStopTransmitter.block, 1), " S ", "RTS", " R ", 'S', ironingot, 'R', Items.redstone, 'T', ItemIDs.electronicCircuit.item);
			}
		}


/*
		for (ItemStack s: iron) {

		}*/




		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailSmallStraight.item, 1),  "   ", " R ", "   ", Character.valueOf('R'), Item.getItemFromBlock(Blocks.rail));// small straight track
		/*TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailSmallRoadCrossing.item, 1),  "   ", "SRS", "   ", Character.valueOf('S'), new ItemStack(Blocks.stained_hardened_clay, 1, 15), Character.valueOf('R'), Item.getItemFromBlock(Blocks.rail) );
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailSmallRoadCrossing1.item, 1),  "   ", "SRS", "   ", Character.valueOf('S'), new ItemStack(Blocks.stained_hardened_clay, 1, 7), Character.valueOf('R'), Item.getItemFromBlock(Blocks.rail) );
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailSmallRoadCrossing2.item, 1),  "   ", "SRS", "   ", Character.valueOf('S'), new ItemStack(Blocks.stained_hardened_clay, 1, 3), Character.valueOf('R'), Item.getItemFromBlock(Blocks.rail) );*/
		TrainCraftingManager.instance.addRecipe(new ItemStack(Item.getItemFromBlock(Blocks.rail), 1),  "   ", " R ", "   ", Character.valueOf('R'), ItemIDs.tcRailSmallStraight.item);
		TrainCraftingManager.instance.addRecipe(new ItemStack(Item.getItemFromBlock(Blocks.rail), 1),  "   ", " R ", "   ", Character.valueOf('R'), ItemIDs.tcRailSmallRoadCrossing.item);
		TrainCraftingManager.instance.addRecipe(new ItemStack(Item.getItemFromBlock(Blocks.rail), 1),  "   ", " R ", "   ", Character.valueOf('R'), ItemIDs.tcRailSmallRoadCrossing1.item);
		TrainCraftingManager.instance.addRecipe(new ItemStack(Item.getItemFromBlock(Blocks.rail), 1),  "   ", " R ", "   ", Character.valueOf('R'), ItemIDs.tcRailSmallRoadCrossing2.item);
		// Short Slope Gravel
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailSlopeGravel.item, 1),
				 " MG", "MGG", "GGG", Character.valueOf('M'), ItemIDs.tcRailMediumStraight.item,
						Character.valueOf('G'), Blocks.gravel );
		// Short Slope Ballast
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailSlopeBallast.item, 1),
				 " MB", "MBB", "BBB", Character.valueOf('M'), ItemIDs.tcRailMediumStraight.item,
						Character.valueOf('B'), new ItemStack(BlockIDs.oreTC.block, 1, 3) );

		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailSlopeGravel.item, 1),
				"   ", " S ", " B ", 'S', ItemIDs.tcRailSlopeWood.item, 'B', Blocks.gravel );
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailLargeSlopeGravel.item, 1),
				"   ", " S ", " B ", 'S', ItemIDs.tcRailLargeSlopeWood.item, 'B', Blocks.gravel );
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailVeryLargeSlopeGravel.item, 1),
				"   ", " S ", " B ", 'S', ItemIDs.tcRailVeryLargeSlopeWood.item, 'B', Blocks.gravel );

		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailSlopeBallast.item, 1),
				"   ", " S ", " B ", 'S', ItemIDs.tcRailSlopeWood.item, 'B', Blocks.gravel );
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailLargeSlopeBallast.item, 1),
				"   ", " S ", " B ", 'S', ItemIDs.tcRailLargeSlopeWood.item, 'B', Blocks.gravel );
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailVeryLargeSlopeBallast.item, 1),
				"   ", " S ", " B ", 'S', ItemIDs.tcRailVeryLargeSlopeWood.item, 'B', Blocks.gravel );


		// Large Slope Wood
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailLargeSlopeWood.item, 1),
				 "   ", "  S", " S ", 'S', ItemIDs.tcRailSlopeWood.item );
		// Large Slope Gravel
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailLargeSlopeGravel.item, 1),
				 "   ", "  S", " S ", 'S', ItemIDs.tcRailSlopeGravel.item );
		// Large Slope Ballast
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailLargeSlopeBallast.item, 1),
				 "   ", "  S", " S ", 'S', ItemIDs.tcRailSlopeBallast.item );
		// VeryLarge Slope Wood
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailVeryLargeSlopeWood.item, 1),
				 "  S", " S ", "S  ", 'S', ItemIDs.tcRailSlopeWood.item );
		// VeryLarge Slope Gravel
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailVeryLargeSlopeGravel.item, 1),
				 "  S", " S ", "S  ", 'S', ItemIDs.tcRailSlopeGravel.item );
		// VeryLarge Slope Ballast
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailVeryLargeSlopeBallast.item, 1),
				 "  S", " S ", "S  ", 'S', ItemIDs.tcRailSlopeBallast.item );
		
		// Medium Straight (3 Recipes? Really?)
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailMediumStraight.item, 1),
				 "S  ", "S  ", "S  ", Character.valueOf('S'), ItemIDs.tcRailSmallStraight.item );
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailMediumStraight.item, 1),
				 " S ", " S ", " S ", Character.valueOf('S'), ItemIDs.tcRailSmallStraight.item );
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailMediumStraight.item, 1),
				 "  S", "  S", "  S", Character.valueOf('S'), ItemIDs.tcRailSmallStraight.item );
		// Long Straight (3 Recipes? Really?)
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailLongStraight.item, 1),
				 "   ", " M ", " M ", Character.valueOf('M'), ItemIDs.tcRailMediumStraight.item );
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailLongStraight.item, 1),
				 "   ", "M  ", "M  ", Character.valueOf('M'), ItemIDs.tcRailMediumStraight.item );
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailLongStraight.item, 1),
				 "   ", "  M", "  M", Character.valueOf('M'), ItemIDs.tcRailMediumStraight.item );
		
		// Medium Turn
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailMediumTurn.item, 1),
				 "SS ", "S  ", Character.valueOf('S'), ItemIDs.tcRailSmallStraight.item );
		// Large turn
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailLargeTurn.item, 1),
				 " SS", "SS ", "S  ", Character.valueOf('S'), ItemIDs.tcRailSmallStraight.item );
		// Very Large Turn
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailVeryLargeTurn.item, 1),
				 "MM ", "M  ", "   ", Character.valueOf('M'), ItemIDs.tcRailMediumTurn.item );
		
		// Medium Switch
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailMediumSwitch.item, 1),
				 "S  ", "SRS", "S  ", Character.valueOf('S'), ItemIDs.tcRailSmallStraight.item,
						Character.valueOf('R'), ItemIDs.tcRailMediumTurn.item );
		// Large Switch
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailLargeSwitch.item, 1),
				 "S  ", "MRS", "S  ", Character.valueOf('S'), ItemIDs.tcRailSmallStraight.item,
						Character.valueOf('M'), ItemIDs.tcRailMediumStraight.item, Character.valueOf('R'),
						ItemIDs.tcRailLargeTurn.item );
		// Parallel Switch
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailMediumParallelSwitch.item, 1),
				 "M S", "MRR", "MR ", Character.valueOf('S'), ItemIDs.tcRailSmallStraight.item,
						Character.valueOf('M'), ItemIDs.tcRailMediumStraight.item, Character.valueOf('R'),
						ItemIDs.tcRailMediumTurn.item );
		// Two Way Crossing
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailTwoWaysCrossing.item, 1),
				 " S ", "SSS", " S ", Character.valueOf('S'), ItemIDs.tcRailSmallStraight.item );
		// Bridge Pillar
		TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.bridgePillar.block, 8),
				 "SSS", "SLS", "SSS", Character.valueOf('S'), Items.stick, Character.valueOf('L'), Blocks.log );
	}
	
	public static void initSmeltingRecipes(){

		/* OpenHearthFurnace recipes */
		if (!ConfigHandler.MAKE_MODPACKS_GREAT_AGAIN) {
			ArrayList<ItemStack> steel = OreDictionary.getOres("ingotSteel");
			ArrayList<ItemStack> iron = OreDictionary.getOres("ingotIron");
			for (ItemStack s : steel) {
				for (ItemStack ironitm : iron)
				TrainCraftingManager.instance.addHearthFurnaceRecipe(ironitm,
						new ItemStack(ItemIDs.graphite.item), s, 2F, 1000);
			}
		}
		
		/* Vanilla Furnace recipes */
		GameRegistry.addSmelting(new ItemStack(Item.getItemFromBlock(BlockIDs.oreTC.block), 0), OreDictionary.getOres("ingotCopper").get(0), 0.7f);
	}

	public static void addDictRecipe(ItemStack stack, Object... obj) {
		ShapedOreRecipe recipe = new ShapedOreRecipe(stack, obj);
		GameRegistry.addRecipe(recipe);
	}
}
