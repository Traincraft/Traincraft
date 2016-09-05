/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.core.handlers;

import java.util.ArrayList;

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

public class RecipeHandler {
	public static void initBlockRecipes() {
		TrainCraftingManager.instance.getRecipeList().add(new RecipesArmorDyes());
		/* Assembly tables */
		GameRegistry.addRecipe(new ItemStack(BlockIDs.assemblyTableI.block, 1), new Object[] { "IPI", "S S", "SPS", Character.valueOf('I'), Items.iron_ingot, Character.valueOf('P'), Blocks.piston, Character.valueOf('S'), Blocks.stone });
		GameRegistry.addRecipe(new ItemStack(BlockIDs.assemblyTableII.block, 1), new Object[] { "GPG", "O O", "OPO", Character.valueOf('G'), Items.gold_ingot, Character.valueOf('P'), Blocks.piston, Character.valueOf('O'), Blocks.obsidian });
		GameRegistry.addRecipe(new ItemStack(BlockIDs.assemblyTableIII.block, 1), new Object[] { "GPG", "DLD", "OPO", Character.valueOf('G'), Items.gold_ingot, Character.valueOf('P'), Blocks.piston, Character.valueOf('D'), Items.diamond, Character.valueOf('L'), Blocks.glowstone, Character.valueOf('O'), Blocks.obsidian });
		addDictRecipe(new ItemStack(BlockIDs.trainWorkbench.block, 1), new Object[] { "###", "IFI", "###", Character.valueOf('#'), "plankWood", Character.valueOf('F'), Blocks.furnace, Character.valueOf('I'), Items.iron_ingot });
		addDictRecipe(new ItemStack(BlockIDs.distilIdle.block, 1), new Object[] { "###", "#F#", "###", Character.valueOf('#'), "ingotSteel", Character.valueOf('F'), ItemIDs.firebox.item });

		/* Open Hearth Furnace */
		GameRegistry.addRecipe(new ItemStack(BlockIDs.openFurnaceIdle.block, 1), new Object[] { "#L#", "#B#", "#I#", Character.valueOf('#'), Blocks.nether_brick, Character.valueOf('L'), Items.lava_bucket, Character.valueOf('B'), Items.bucket, Character.valueOf('I'), Blocks.iron_block });

		/* Lantern */
		GameRegistry.addRecipe(new ItemStack(BlockIDs.lantern.block, 4), new Object[] { "III", "PTP", "III", Character.valueOf('I'), Items.iron_ingot, Character.valueOf('P'), Blocks.glass_pane, Character.valueOf('T'),Blocks.torch });
		
		/* Clothes */
		GameRegistry.addRecipe(new ItemStack(ItemIDs.overalls.item, 1), new Object[] { " # ", "X$X", "X$X", Character.valueOf('X'), new ItemStack(Items.dye, 1, 4), Character.valueOf('$'), Items.leather_leggings, Character.valueOf('#'), new ItemStack(Items.dye, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(ItemIDs.jacket.item, 1), new Object[] { "X X", "X$X", "X#X", Character.valueOf('X'), new ItemStack(Items.dye, 1, 14), Character.valueOf('$'), Items.leather_chestplate, Character.valueOf('#'), Items.string });
		GameRegistry.addRecipe(new ItemStack(ItemIDs.hat.item, 1), new Object[] { " X ", "X$X", "#X#", Character.valueOf('X'), new ItemStack(Items.dye, 1, 4), Character.valueOf('$'), Items.leather_helmet, Character.valueOf('#'), Items.string });

		/* Driver Clothes*/
		GameRegistry.addRecipe(new ItemStack(ItemIDs.pants_driver_paintable.item, 1), new Object[] { "XXX", "XLX", "X$X", Character.valueOf('L'), Items.leather_leggings,Character.valueOf('$'), new ItemStack(Items.dye, 1, 4), Character.valueOf('X'), Items.string});
		GameRegistry.addRecipe(new ItemStack(ItemIDs.jacket_driver_paintable.item, 1), new Object[] { "X X", "XRX", "XPX", Character.valueOf('X'), new ItemStack(Items.dye, 1, 4), Character.valueOf('P'), Items.leather_chestplate,Character.valueOf('R'),  new ItemStack(Items.dye, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(ItemIDs.hat_driver_paintable.item, 1), new Object[] {"#$#", "# #", Character.valueOf('$'), new ItemStack(Items.dye, 1, 4), Character.valueOf('#'), Items.string });
		
		/* Ticket Man Clothes */
		GameRegistry.addRecipe(new ItemStack(ItemIDs.pants_ticketMan_paintable.item, 1), new Object[] { "XXX", "XLX", "X$X", Character.valueOf('L'), Items.leather_leggings,Character.valueOf('$'), new ItemStack(Items.dye, 1, 8), Character.valueOf('X'), Items.string});
		GameRegistry.addRecipe(new ItemStack(ItemIDs.jacket_ticketMan_paintable.item, 1), new Object[] { "X X", "XPX", "X#X", Character.valueOf('P'), Items.leather_chestplate, Character.valueOf('#'), new ItemStack(Items.dye, 1, 4), Character.valueOf('X'), Items.string});
		GameRegistry.addRecipe(new ItemStack(ItemIDs.hat_ticketMan_paintable.item, 1), new Object[] {"#$#", "# #", Character.valueOf('$'), new ItemStack(Items.dye, 1, 0), Character.valueOf('#'), Items.string });
		
		/* Recipe book */
		GameRegistry.addRecipe(new ItemStack(ItemIDs.recipeBook.item, 1), new Object[] { "TTT", "TBT", "TTT", Character.valueOf('T'), Blocks.rail, Character.valueOf('B'), Items.book });

		/*Buffer*/
		addDictRecipe(new ItemStack(BlockIDs.stopper.block, 1), new Object[] { "WWW", "I I", "RRR", Character.valueOf('W'), "plankWood", Character.valueOf('R'), Blocks.rail, Character.valueOf('I'), Items.iron_ingot});
		
		GameRegistry.addRecipe(new ItemStack(BlockIDs.oreTC.block, 1,3), new Object[] { "GXG", Character.valueOf('G'), Blocks.gravel, Character.valueOf('X'), Items.clay_ball});
		
	}

	public static void initItemRecipes() {

		// Always do this " X " instead of this "X", and do not put "" empty brackets

		/* I placed it here because workbench should be one of the first recipe shown in the recipe book */
		ArrayList<ItemStack> planks = OreDictionary.getOres("plankWood");
		if (planks != null && planks.size() >= 0) {
			for (ItemStack plank : planks) {
				TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.trainWorkbench.block, 1), new Object[] { "###", "IFI", "###", Character.valueOf('#'), plank, Character.valueOf('F'), Blocks.furnace, Character.valueOf('I'), Items.iron_ingot });
			}
		}
		
		/* Recipe book */
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.recipeBook.item, 1), new Object[] { "TTT", "TBT", "TTT", Character.valueOf('T'), Blocks.rail, Character.valueOf('B'), Items.book });

		/* Chunk Loader Activator */
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.chunkLoaderActivator.item, 1), new Object[] { "  P", " S ", "S  ", Character.valueOf('S'), Items.blaze_rod, Character.valueOf('P'), Items.ender_pearl });

		/* Assembly tables */
		TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.assemblyTableI.block, 1), new Object[] { "IPI", "S S", "SPS", Character.valueOf('I'), Items.iron_ingot, Character.valueOf('P'), Blocks.piston, Character.valueOf('S'), Blocks.stone });
		TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.assemblyTableII.block, 1), new Object[] { "GPG", "O O", "OPO", Character.valueOf('G'), Items.gold_ingot, Character.valueOf('P'), Blocks.piston, Character.valueOf('O'), Blocks.obsidian });
		TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.assemblyTableIII.block, 1), new Object[] { "GPG", "DLD", "OPO", Character.valueOf('G'), Items.gold_ingot, Character.valueOf('P'), Blocks.piston, Character.valueOf('D'), Items.diamond, Character.valueOf('L'), Blocks.glowstone, Character.valueOf('O'), Blocks.obsidian });

		/* Open Hearth Furnace */
		TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.openFurnaceIdle.block, 1), new Object[] { "#L#", "#B#", "#I#", Character.valueOf('#'), Blocks.nether_brick, Character.valueOf('L'), Items.lava_bucket, Character.valueOf('B'), Items.bucket, Character.valueOf('I'), Blocks.iron_block });

		/* Lantern */
		TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.lantern.block, 4), new Object[] { "III", "PTP", "III", Character.valueOf('I'), Items.iron_ingot, Character.valueOf('P'), Blocks.glass_pane, Character.valueOf('T'),Blocks.torch });
	
		/* Clothes */
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.overalls.item, 1), new Object[] { " # ", "X$X", "X X", Character.valueOf('X'), new ItemStack(Items.dye, 1, 4), Character.valueOf('$'), Items.leather_leggings, Character.valueOf('#'), new ItemStack(Items.dye, 1, 1) });
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.jacket.item, 1), new Object[] { "X X", "X$X", "X#X", Character.valueOf('X'), new ItemStack(Items.dye, 1, 14), Character.valueOf('$'), Items.leather_chestplate, Character.valueOf('#'), Items.string });
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.hat.item, 1), new Object[] { " X ", "X$X", "#X#", Character.valueOf('X'), new ItemStack(Items.dye, 1, 4), Character.valueOf('$'), Items.leather_helmet, Character.valueOf('#'), Items.string });
		
		/* Driver Clothes*/
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.pants_driver_paintable.item, 1), new Object[] { "XXX", "XLX", "X$X", Character.valueOf('L'), Items.leather_leggings,Character.valueOf('$'), new ItemStack(Items.dye, 1, 4), Character.valueOf('X'), Items.string});
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.jacket_driver_paintable.item, 1), new Object[] { "X X", "XRX", "XPX", Character.valueOf('X'), new ItemStack(Items.dye, 1, 4), Character.valueOf('P'), Items.leather_chestplate,Character.valueOf('R'),  new ItemStack(Items.dye, 1, 1) });
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.hat_driver_paintable.item, 1), new Object[] {"#$#", "# #", Character.valueOf('$'), new ItemStack(Items.dye, 1, 4), Character.valueOf('#'), Items.string });
		
		/* Ticket Man Clothes */
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.pants_ticketMan_paintable.item, 1), new Object[] { "XXX", "XLX", "X$X", Character.valueOf('L'), Items.leather_leggings,Character.valueOf('$'), new ItemStack(Items.dye, 1, 8), Character.valueOf('X'), Items.string});
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.jacket_ticketMan_paintable.item, 1), new Object[] { "X X", "XPX", "X#X", Character.valueOf('P'), Items.leather_chestplate, Character.valueOf('#'), new ItemStack(Items.dye, 1, 4), Character.valueOf('X'), Items.string});
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.hat_ticketMan_paintable.item, 1), new Object[] {"#$#", "# #", Character.valueOf('$'), new ItemStack(Items.dye, 1, 0), Character.valueOf('#'), Items.string });
		
		
		ArrayList<ItemStack> plastics = OreDictionary.getOres("dustPlastic");
		ArrayList<ItemStack> copper = OreDictionary.getOres("ingotCopper");
		if (plastics != null && plastics.size() >= 0) {
			for (ItemStack plastic : plastics) {
				/* Empty canister */
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.emptyCanister.item, 4), new Object[] { "PPP", "P P", "PPP", Character.valueOf('P'), plastic});
				/* Electronic circuit */
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.electronicCircuit.item, 1), new Object[] { "XXX", "RPR", "XXX", Character.valueOf('X'), ItemIDs.copperWireFine.item, Character.valueOf('P'), plastic, Character.valueOf('R'), Items.redstone });
				/* Composite Material*/
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.reinforcedPlastic.item, 16), new Object[] { "LPL", "PLP", "GPG", Character.valueOf('G'), Blocks.glass_pane, Character.valueOf('P'), ItemIDs.graphite.item, Character.valueOf('L'), plastic});
				
				if (copper != null && copper.size() >= 0) {
					for (ItemStack copp : copper) {
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.copperWireFine.item, 6), new Object[] { "XXX", "XPX", "XXX", Character.valueOf('X'), copp, Character.valueOf('P'), plastic });
					}
				}	
			}
		}
		
		/* Composite Suit */
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.boots_suit_paintable.item, 1), new Object[] {" D ","X X", "XFX", Character.valueOf('F'), Items.feather, Character.valueOf('D'), Items.diamond, Character.valueOf('X'), ItemIDs.reinforcedPlates.item});
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.pants_suit_paintable.item, 1), new Object[] { "XDX", "X$X", "X X", Character.valueOf('$'), Items.fire_charge, Character.valueOf('X'), ItemIDs.reinforcedPlates.item,Character.valueOf('D'), Items.diamond});
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.jacket_suit_paintable.item, 1), new Object[] { "X X", "XDX", "XAX", Character.valueOf('A'), Items.golden_apple, Character.valueOf('X'), ItemIDs.reinforcedPlates.item,Character.valueOf('D'), Blocks.diamond_block});
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.helmet_suit_paintable.item, 1), new Object[] {"#D#", "# #", Character.valueOf('D'), Blocks.diamond_block, Character.valueOf('#'), ItemIDs.reinforcedPlates.item });

		/* Trains parts */

		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.generator.item, 1), new Object[] { " ##", "E$$", " ##", Character.valueOf('#'), ItemIDs.copperWireFine.item, Character.valueOf('E'), ItemIDs.electronicCircuit.item, Character.valueOf('$'), Items.iron_ingot });// generator
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.controls.item, 1), new Object[] { "#X#", "#E#", "$$$", Character.valueOf('#'), Blocks.lever, Character.valueOf('X'), Blocks.stone_button, Character.valueOf('$'), Items.iron_ingot, Character.valueOf('E'), ItemIDs.electronicCircuit.item });// train controls
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.dieselengine.item, 2), new Object[] { "###", "XXX", "CCC", Character.valueOf('#'), ItemIDs.piston.item, Character.valueOf('X'), ItemIDs.cylinder.item, Character.valueOf('C'), ItemIDs.camshaft.item });// diesel engine 
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.electmotor.item, 1), new Object[] { "I#I", "#E#", "I#I", Character.valueOf('#'), ItemIDs.copperWireFine.item, Character.valueOf('I'), Items.iron_ingot, Character.valueOf('E'), ItemIDs.electronicCircuit.item });// Electric motor 
		ArrayList<ItemStack> dustCoal = OreDictionary.getOres("dustCoal");
		if (dustCoal != null && dustCoal.size() >= 0) {
			for (int t = 0; t < dustCoal.size(); t++) {
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.graphite.item, 2), new Object[] { "###", "#X#", "###", Character.valueOf('#'), dustCoal.get(t), Character.valueOf('X'), Items.clay_ball });// Graphite
			}
		}
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.ironBoiler.item, 2), new Object[] { "###", "XXX", "###", Character.valueOf('#'), Items.iron_ingot, Character.valueOf('X'), Items.water_bucket });// iron Boiler 
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.ironFirebox.item, 2), new Object[] { "###", "#X#", "###", Character.valueOf('#'), Items.iron_ingot, Character.valueOf('X'), Items.flint_and_steel });// iron Firebox  
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.ironChimney.item, 2), new Object[] { "# #", "# #", "# #", Character.valueOf('#'), Items.iron_ingot });
		
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.coaldust.item, 4), new Object[] { "###","   ","   ", Character.valueOf('#'), Items.coal });
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.coaldust.item, 4), new Object[] { "   ","###","   ", Character.valueOf('#'), Items.coal });
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.coaldust.item, 4), new Object[] { "   ","   ","###", Character.valueOf('#'), Items.coal });
		
		//TrainCraftingManager.instance.addShapelessRecipe(new ItemStack(ItemIDs.coaldust.item, 4), new Object[] { Items.coal, Items.coal, Items.coal, Items.coal });// coal dust
		
		//TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.signal.item, 2), new Object[] { "#", "X", "X", Character.valueOf('X'), ItemIDs.steel.item, Character.valueOf('#'), Items.redstone });
		/* diesel generator */
		TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.generatorDiesel.block, 1), new Object[] { "C  ", "DE ", Character.valueOf('C'), ItemIDs.steelchimney.item, Character.valueOf('D'), ItemIDs.dieselengine.item, Character.valueOf('E'), ItemIDs.electronicCircuit.item });
		
		/* Zepplin parts and zeppelin item */
		if (ConfigHandler.ENABLE_ZEPPELIN) {
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.balloon.item, 1), new Object[] { "###", "# #", "###", Character.valueOf('#'), Blocks.wool });// Balloon  
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.steamengine.item, 1), new Object[] { "C  ", "BF ", Character.valueOf('C'), ItemIDs.steelchimney.item, Character.valueOf('B'), ItemIDs.boiler.item, Character.valueOf('F'), ItemIDs.firebox.item });// Small steam engine 
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.airship.item, 1), new Object[] { "B B", "SES", "POP", Character.valueOf('B'), ItemIDs.balloon.item, Character.valueOf('S'), Items.stick, Character.valueOf('E'), ItemIDs.steamengine.item, Character.valueOf('P'), ItemIDs.propeller.item, Character.valueOf('O'), Items.boat });
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.zeppelin.item, 1), new Object[] { "BBB", "SES", "POP", Character.valueOf('B'), ItemIDs.balloon.item, Character.valueOf('S'), ItemIDs.propeller.item, Character.valueOf('E'), ItemIDs.controls.item, Character.valueOf('P'), ItemIDs.electmotor.item, Character.valueOf('O'), ItemIDs.seats.item });
		}
		
		ArrayList<ItemStack> steel = OreDictionary.getOres("ingotSteel");
		ArrayList<ItemStack> s1 = OreDictionary.getOres("plankWood");
		ArrayList<ItemStack> s2 = OreDictionary.getOres("logWood");
		if (s1 != null && s1.size() >= 0) {
			for (int i = 0; i < s1.size(); i++) {
				if (steel != null && steel.size() >= 0) {
					for (int t = 0; t < steel.size(); t++) {
						
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.reinforcedPlates.item, 1), new Object[] { "RRR", "SSS", "CCC", Character.valueOf('R'), ItemIDs.reinforcedPlastic.item, Character.valueOf('S'), steel.get(t), Character.valueOf('C'), Items.clay_ball});
						
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.composite_wrench.item, 1), new Object[] {"S S", " R "," R ", Character.valueOf('R'), ItemIDs.reinforcedPlastic.item, Character.valueOf('S'),steel.get(t) });
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.steelcab.item, 2), new Object[] { "###", "X X", "XXX", Character.valueOf('X'), steel.get(t), Character.valueOf('#'), s1.get(i) });// Steel cab
						TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.distilIdle.block, 1), new Object[] { "###", "#F#", "###", Character.valueOf('#'), steel.get(t), Character.valueOf('F'), ItemIDs.firebox.item });
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.transformer.item, 1), new Object[] { "# #", "XEX", "###", Character.valueOf('#'), steel.get(t), Character.valueOf('E'), ItemIDs.electronicCircuit.item, Character.valueOf('X'), Items.redstone });// transformer
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.minecartLocoMineTrain.item, 1), new Object[] { "X#X", "XXX", Character.valueOf('X'), steel.get(t), Character.valueOf('#'), ItemIDs.electmotor.item });
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.minecartLocoMineTrain.item, 1), new Object[] { "   ", "X#X", "XXX", Character.valueOf('X'), steel.get(t), Character.valueOf('#'), ItemIDs.electmotor.item });
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.minecartMineTrain.item, 1), new Object[] { "X#X", "XXX", Character.valueOf('X'), steel.get(t), Character.valueOf('#'), Blocks.chest });
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.minecartMineTrain.item, 1), new Object[] { "   ", "X#X", "XXX", Character.valueOf('X'), steel.get(t), Character.valueOf('#'), Blocks.chest });

						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.boiler.item, 2), new Object[] { "###", "XXX", "###", Character.valueOf('#'), steel.get(t), Character.valueOf('X'), Items.water_bucket });// Boiler 
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.firebox.item, 2), new Object[] { "###", "#X#", "###", Character.valueOf('#'), steel.get(t), Character.valueOf('X'), Items.flint_and_steel });// Firebox 
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.bogie.item, 4), new Object[] { " # ", "#X#", " # ", Character.valueOf('#'), steel.get(t), Character.valueOf('X'), Items.iron_ingot });// Bogie 
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.steelframe.item, 2), new Object[] { "# #", "AAA", Character.valueOf('A'), steel.get(t), Character.valueOf('#'), Items.iron_ingot });// Steel Frame 
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.steelframe.item, 2), new Object[] { "   ", "# #", "AAA", Character.valueOf('A'), steel.get(t), Character.valueOf('#'), Items.iron_ingot });// Steel Frame  
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.steelchimney.item, 2), new Object[] { "# #", "# #", "# #", Character.valueOf('#'), steel.get(t) });// Bogie 
						TrainCraftingManager.instance.addRecipe(new ItemStack(Items.flint_and_steel, 2), new Object[] { "* ", " #", Character.valueOf('*'), steel.get(t), Character.valueOf('#'), Items.flint });

						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.stake.item, 1), new Object[] { "   ", "IFI", "   ", Character.valueOf('I'), steel.get(t), Character.valueOf('F'), Items.iron_ingot });
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.stake.item, 1), new Object[] { "IFI", "   ", "   ", Character.valueOf('I'), steel.get(t), Character.valueOf('F'), Items.iron_ingot });
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.stake.item, 1), new Object[] { "   ", "   ", "IFI", Character.valueOf('I'), steel.get(t), Character.valueOf('F'), Items.iron_ingot });

						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.transmition.item, 1), new Object[] { " # ", "#X#", " # ", Character.valueOf('#'), steel.get(t), Character.valueOf('X'), ItemIDs.diesel.item });// transmition
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.piston.item, 3), new Object[] { " # ", " X ", Character.valueOf('#'), steel.get(t), Character.valueOf('X'), Items.stick });// piston
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.camshaft.item, 3), new Object[] { "###", "   ", "   ", Character.valueOf('#'), steel.get(t) });// camshaft 
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.camshaft.item, 3), new Object[] { "   ", "###", "   ", Character.valueOf('#'), steel.get(t) });// camshaft
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.camshaft.item, 3), new Object[] { "   ", "   ", "###", Character.valueOf('#'), steel.get(t) });// camshaft
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.cylinder.item, 3), new Object[] { "# #", "# #", "###", Character.valueOf('#'), steel.get(t) });// cylinder 
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.propeller.item, 2), new Object[] { " # ", "#X#", " # ", Character.valueOf('#'), s1.get(i), Character.valueOf('X'), Items.iron_ingot });// Propeller
						
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailSmallStraight.item, 32), new Object[] { "I I", "SPS", "I I", Character.valueOf('P'), s1.get(i), Character.valueOf('I'), Items.iron_ingot, Character.valueOf('S'), steel.get(t) });// small straight track
					}
				}
				if (s2 != null && s2.size() >= 0) {
					for (int j = 0; j < s2.size(); j++) {
						/* Water Wheel */
						TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.waterWheel.block, 1), new Object[] { " P ", "PGP", " P ", Character.valueOf('P'), s2.get(j),Character.valueOf('G'), ItemIDs.generator.item});
						/* Wind mill */
						TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.windMill.block, 1), new Object[] { " R ", " G ", "B B",Character.valueOf('G'), ItemIDs.generator.item, Character.valueOf('B'), Items.iron_ingot, Character.valueOf('R'), ItemIDs.propeller.item});
						
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.woodenBogie.item, 4), new Object[] { " # ", "#X#", " # ", Character.valueOf('#'), s1.get(i), Character.valueOf('X'), s2.get(j) });// wooden Bogie
					}
				}
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.seats.item, 1), new Object[] { "#  ", "## ", "XXX", Character.valueOf('#'), s1.get(i), Character.valueOf('X'), Items.iron_ingot });// transformer
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.woodenFrame.item, 2), new Object[] { "# #", "AAA", Character.valueOf('A'), s1.get(i), Character.valueOf('#'), s1.get(i) });// wooden Frame
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.woodenFrame.item, 2), new Object[] { "   ", "# #", "AAA", Character.valueOf('A'), s1.get(i), Character.valueOf('#'), s1.get(i) });// wooden Frame
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.woodenCab.item, 2), new Object[] { "###", "X X", "XXX", Character.valueOf('X'), s1.get(i), Character.valueOf('#'), s1.get(i) });// wooden cab
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.ironBogie.item, 4), new Object[] { " # ", "#X#", " # ", Character.valueOf('#'), Items.iron_ingot, Character.valueOf('X'), s1.get(i) });// iron Bogie
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.ironFrame.item, 2), new Object[] { "# #", "AAA", Character.valueOf('A'), Items.iron_ingot, Character.valueOf('#'), s1.get(i) });// iron Frame
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.ironFrame.item, 2), new Object[] { "   ", "# #", "AAA", Character.valueOf('A'), Items.iron_ingot, Character.valueOf('#'), s1.get(i) });// iron Frame
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.ironCab.item, 2), new Object[] { "###", "X X", "XXX", Character.valueOf('X'), Items.iron_ingot, Character.valueOf('#'), s1.get(i) });// iron cab
				TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.stopper.block, 1), new Object[] { "WWW", "I I", "RRR", Character.valueOf('W'), s1.get(i), Character.valueOf('R'), Blocks.rail, Character.valueOf('I'), Items.iron_ingot});// stopper
				
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailSlopeWood.item, 2),
						new Object[] { "  S", " SW", "SWW", Character.valueOf('S'), ItemIDs.tcRailSmallStraight.item,
								Character.valueOf('W'), s1.get(i) });// straight slopes
			}
		}
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailMediumTurn.item, 2), new Object[] {"SS ", "S  ", Character.valueOf('S'), ItemIDs.tcRailSmallStraight.item });// medium turn
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailMediumTurn.item, 2), new Object[] {"   ","SS ", "S  ", Character.valueOf('S'), ItemIDs.tcRailSmallStraight.item });// medium turn
		
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailLargeTurn.item, 2), new Object[] {"SSS","SS ", "S  ", Character.valueOf('S'), ItemIDs.tcRailSmallStraight.item });// large turn
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailVeryLargeTurn.item, 2), new Object[] {" L ","L  ","   ", Character.valueOf('L'), ItemIDs.tcRailLargeTurn.item });// very large turn
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailVeryLargeTurn.item, 2), new Object[] {"   "," L ","L  ", Character.valueOf('L'), ItemIDs.tcRailLargeTurn.item });// very large turn
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailMediumStraight.item, 2), new Object[] {"S  ", "S  ", Character.valueOf('S'), ItemIDs.tcRailSmallStraight.item });// medium straight
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailMediumStraight.item, 2), new Object[] {" S ", " S ", Character.valueOf('S'), ItemIDs.tcRailSmallStraight.item });// medium straight
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailMediumStraight.item, 2), new Object[] {"  S", "  S", Character.valueOf('S'), ItemIDs.tcRailSmallStraight.item });// medium straight
		
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailMediumStraight.item, 2), new Object[] {"   ","S  ", "S  ", Character.valueOf('S'), ItemIDs.tcRailSmallStraight.item });// medium straight
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailMediumStraight.item, 2), new Object[] {"   "," S ", " S ", Character.valueOf('S'), ItemIDs.tcRailSmallStraight.item });// medium straight
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailMediumStraight.item, 2), new Object[] {"   ","  S", "  S", Character.valueOf('S'), ItemIDs.tcRailSmallStraight.item });// medium straight
		
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailLongStraight.item, 3), new Object[] {" S ", " S "," S ", Character.valueOf('S'), ItemIDs.tcRailSmallStraight.item });// long straight
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailLongStraight.item, 3), new Object[] {"S  ", "S  ","S  ", Character.valueOf('S'), ItemIDs.tcRailSmallStraight.item });// long straight
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailLongStraight.item, 3), new Object[] {"  S", "  S","  S", Character.valueOf('S'), ItemIDs.tcRailSmallStraight.item });// long straight
		
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailMediumSwitch.item, 2), new Object[] {"S  ", "SRS", "S  ", Character.valueOf('S'), ItemIDs.tcRailSmallStraight.item, Character.valueOf('R'), ItemIDs.tcRailMediumTurn.item });// switch
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailLargeSwitch.item, 2), new Object[] {"S  ", "SRS", "S  ", Character.valueOf('S'), ItemIDs.tcRailSmallStraight.item, Character.valueOf('R'), ItemIDs.tcRailLargeTurn.item });// switch
		
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailMediumParallelSwitch.item, 2), new Object[] {"S S", "SRR", "SR ", Character.valueOf('S'), ItemIDs.tcRailSmallStraight.item, Character.valueOf('R'), ItemIDs.tcRailMediumTurn.item });// switch
		
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailTwoWaysCrossing.item, 4), new Object[] {" S ", "SSS"," S ", Character.valueOf('S'), ItemIDs.tcRailSmallStraight.item });// two ways crossing
		
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailSlopeGravel.item, 2),
				new Object[] { "  S", " SG", "SGG", Character.valueOf('S'), ItemIDs.tcRailSmallStraight.item,
						Character.valueOf('G'), Blocks.gravel });// straight slopes
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailSlopeBallast.item, 2),
				new Object[] { "  S", " SB", "SBB", Character.valueOf('S'), ItemIDs.tcRailSmallStraight.item,
						Character.valueOf('B'), new ItemStack(BlockIDs.oreTC.block, 1, 3) });// straight
																								// slopes
		
		TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.bridgePillar.block, 4), new Object[] {"SSS", "S S","SSS", Character.valueOf('S'), Items.stick});// bridge pillar
		
		/* Smelting recipes */
		// NOTE: func_151393_a = addSmelting
		//FurnaceRecipes.smelting().func_151393_a(BlockIDs.oreTC.block, OreDictionary.getOres("ingotCopper").get(0), 0.7f);
	}
	
	public static void initSmeltingRecipes(){
		/* OpenHearthFurnace recipes */
		TrainCraftingManager.instance.addHearthFurnaceRecipe(new ItemStack(Items.iron_ingot), new ItemStack(ItemIDs.graphite.item), new ItemStack(ItemIDs.steel.item), 2F, 1000);
		
		/* Vanilla Furnace recipes */
		GameRegistry.addSmelting(new ItemStack(Item.getItemFromBlock(BlockIDs.oreTC.block), 0), OreDictionary.getOres("ingotCopper").get(0), 0.7f);
	}

	public static void addDictRecipe(ItemStack stack, Object... obj) {
		ShapedOreRecipe recipe = new ShapedOreRecipe(stack, obj);
		GameRegistry.addRecipe(recipe);
	}
}