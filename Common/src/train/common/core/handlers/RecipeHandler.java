/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package src.train.common.core.handlers;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import src.train.common.inventory.TrainCraftingManager;
import src.train.common.library.BlockIDs;
import src.train.common.library.ItemIDs;
import src.train.common.recipes.RecipesArmorDyes;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeHandler {
	public static void initBlockRecipes() {
		TrainCraftingManager.instance.getRecipeList().add(new RecipesArmorDyes());
		/* Assembly tables */
		GameRegistry.addRecipe(new ItemStack(BlockIDs.assemblyTableI.block, 1), new Object[] { "IPI", "S S", "SPS", Character.valueOf('I'), Item.ingotIron, Character.valueOf('P'), Block.pistonBase, Character.valueOf('S'), Block.stone });
		GameRegistry.addRecipe(new ItemStack(BlockIDs.assemblyTableII.block, 1), new Object[] { "GPG", "O O", "OPO", Character.valueOf('G'), Item.ingotGold, Character.valueOf('P'), Block.pistonBase, Character.valueOf('O'), Block.obsidian });
		GameRegistry.addRecipe(new ItemStack(BlockIDs.assemblyTableIII.block, 1), new Object[] { "GPG", "DLD", "OPO", Character.valueOf('G'), Item.ingotGold, Character.valueOf('P'), Block.pistonBase, Character.valueOf('D'), Item.diamond, Character.valueOf('L'), Block.glowStone, Character.valueOf('O'), Block.obsidian });
		addDictRecipe(new ItemStack(BlockIDs.trainWorkbench.block, 1), new Object[] { "###", "IFI", "###", Character.valueOf('#'), "plankWood", Character.valueOf('F'), Block.furnaceIdle, Character.valueOf('I'), Item.ingotIron });
		addDictRecipe(new ItemStack(BlockIDs.distilIdle.block, 1), new Object[] { "###", "#F#", "###", Character.valueOf('#'), "ingotSteel", Character.valueOf('F'), ItemIDs.firebox.item });

		/* Open Hearth Furnace */
		GameRegistry.addRecipe(new ItemStack(BlockIDs.openFurnaceIdle.block, 1), new Object[] { "#L#", "#B#", "#I#", Character.valueOf('#'), Block.netherBrick, Character.valueOf('L'), Item.bucketLava, Character.valueOf('B'), Item.bucketEmpty, Character.valueOf('I'), Block.blockIron });

		/* Lantern */
		GameRegistry.addRecipe(new ItemStack(BlockIDs.lantern.block, 4), new Object[] { "III", "PTP", "III", Character.valueOf('I'), Item.ingotIron, Character.valueOf('P'), Block.thinGlass, Character.valueOf('T'),Block.torchWood });
		
		/* Clothes */
		GameRegistry.addRecipe(new ItemStack(ItemIDs.overalls.item, 1), new Object[] { " # ", "X$X", "X$X", Character.valueOf('X'), new ItemStack(Item.dyePowder, 1, 4), Character.valueOf('$'), Item.legsLeather, Character.valueOf('#'), new ItemStack(Item.dyePowder, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(ItemIDs.jacket.item, 1), new Object[] { "X X", "X$X", "X#X", Character.valueOf('X'), new ItemStack(Item.dyePowder, 1, 14), Character.valueOf('$'), Item.plateLeather, Character.valueOf('#'), Item.silk });
		GameRegistry.addRecipe(new ItemStack(ItemIDs.hat.item, 1), new Object[] { " X ", "X$X", "#X#", Character.valueOf('X'), new ItemStack(Item.dyePowder, 1, 4), Character.valueOf('$'), Item.helmetLeather, Character.valueOf('#'), Item.silk });

		/* Driver Clothes*/
		GameRegistry.addRecipe(new ItemStack(ItemIDs.pants_driver_paintable.item, 1), new Object[] { "XXX", "XLX", "X$X", Character.valueOf('L'), Item.legsLeather,Character.valueOf('$'), new ItemStack(Item.dyePowder, 1, 4), Character.valueOf('X'), Item.silk});
		GameRegistry.addRecipe(new ItemStack(ItemIDs.jacket_driver_paintable.item, 1), new Object[] { "X X", "XRX", "XPX", Character.valueOf('X'), new ItemStack(Item.dyePowder, 1, 4), Character.valueOf('P'), Item.plateLeather,Character.valueOf('R'),  new ItemStack(Item.dyePowder, 1, 1) });
		GameRegistry.addRecipe(new ItemStack(ItemIDs.hat_driver_paintable.item, 1), new Object[] {"#$#", "# #", Character.valueOf('$'), new ItemStack(Item.dyePowder, 1, 4), Character.valueOf('#'), Item.silk });
		
		/* Ticket Man Clothes */
		GameRegistry.addRecipe(new ItemStack(ItemIDs.pants_ticketMan_paintable.item, 1), new Object[] { "XXX", "XLX", "X$X", Character.valueOf('L'), Item.legsLeather,Character.valueOf('$'), new ItemStack(Item.dyePowder, 1, 8), Character.valueOf('X'), Item.silk});
		GameRegistry.addRecipe(new ItemStack(ItemIDs.jacket_ticketMan_paintable.item, 1), new Object[] { "X X", "XPX", "X#X", Character.valueOf('P'), Item.plateLeather, Character.valueOf('#'), new ItemStack(Item.dyePowder, 1, 4), Character.valueOf('X'), Item.silk});
		GameRegistry.addRecipe(new ItemStack(ItemIDs.hat_ticketMan_paintable.item, 1), new Object[] {"#$#", "# #", Character.valueOf('$'), new ItemStack(Item.dyePowder, 1, 0), Character.valueOf('#'), Item.silk });
		
		/* Recipe book */
		GameRegistry.addRecipe(new ItemStack(ItemIDs.recipeBook.item, 1), new Object[] { "TTT", "TBT", "TTT", Character.valueOf('T'), Block.rail, Character.valueOf('B'), Item.book });

		/*Buffer*/
		addDictRecipe(new ItemStack(BlockIDs.stopper.block, 1), new Object[] { "WWW", "I I", "RRR", Character.valueOf('W'), "plankWood", Character.valueOf('R'), Block.rail, Character.valueOf('I'), Item.ingotIron});
		
		GameRegistry.addRecipe(new ItemStack(BlockIDs.oreTC.block, 1,3), new Object[] { "GXG", Character.valueOf('G'), Block.gravel, Character.valueOf('X'), Item.clay});
		
	}

	public static void initItemRecipes() {

		// Always do this " X " instead of this "X", and do not put "" empty brackets

		/* I placed it here because workbench should be one of the first recipe shown in the recipe book */
		ArrayList<ItemStack> planks = OreDictionary.getOres("plankWood");
		if (planks != null && planks.size() >= 0) {
			for (ItemStack plank : planks) {
				TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.trainWorkbench.block, 1), new Object[] { "###", "IFI", "###", Character.valueOf('#'), plank, Character.valueOf('F'), Block.furnaceIdle, Character.valueOf('I'), Item.ingotIron });
			}
		}
		
		/* Recipe book */
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.recipeBook.item, 1), new Object[] { "TTT", "TBT", "TTT", Character.valueOf('T'), Block.rail, Character.valueOf('B'), Item.book });

		/* Chunk Loader Activator */
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.chunkLoaderActivator.item, 1), new Object[] { "  P", " S ", "S  ", Character.valueOf('S'), Item.blazeRod, Character.valueOf('P'), Item.enderPearl });

		/* Assembly tables */
		TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.assemblyTableI.block, 1), new Object[] { "IPI", "S S", "SPS", Character.valueOf('I'), Item.ingotIron, Character.valueOf('P'), Block.pistonBase, Character.valueOf('S'), Block.stone });
		TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.assemblyTableII.block, 1), new Object[] { "GPG", "O O", "OPO", Character.valueOf('G'), Item.ingotGold, Character.valueOf('P'), Block.pistonBase, Character.valueOf('O'), Block.obsidian });
		TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.assemblyTableIII.block, 1), new Object[] { "GPG", "DLD", "OPO", Character.valueOf('G'), Item.ingotGold, Character.valueOf('P'), Block.pistonBase, Character.valueOf('D'), Item.diamond, Character.valueOf('L'), Block.glowStone, Character.valueOf('O'), Block.obsidian });

		/* Open Hearth Furnace */
		TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.openFurnaceIdle.block, 1), new Object[] { "#L#", "#B#", "#I#", Character.valueOf('#'), Block.netherBrick, Character.valueOf('L'), Item.bucketLava, Character.valueOf('B'), Item.bucketEmpty, Character.valueOf('I'), Block.blockIron });

		/* Lantern */
		TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.lantern.block, 4), new Object[] { "III", "PTP", "III", Character.valueOf('I'), Item.ingotIron, Character.valueOf('P'), Block.thinGlass, Character.valueOf('T'),Block.torchWood });
	
		/* Clothes */
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.overalls.item, 1), new Object[] { " # ", "X$X", "X X", Character.valueOf('X'), new ItemStack(Item.dyePowder, 1, 4), Character.valueOf('$'), Item.legsLeather, Character.valueOf('#'), new ItemStack(Item.dyePowder, 1, 1) });
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.jacket.item, 1), new Object[] { "X X", "X$X", "X#X", Character.valueOf('X'), new ItemStack(Item.dyePowder, 1, 14), Character.valueOf('$'), Item.plateLeather, Character.valueOf('#'), Item.silk });
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.hat.item, 1), new Object[] { " X ", "X$X", "#X#", Character.valueOf('X'), new ItemStack(Item.dyePowder, 1, 4), Character.valueOf('$'), Item.helmetLeather, Character.valueOf('#'), Item.silk });
		
		/* Driver Clothes*/
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.pants_driver_paintable.item, 1), new Object[] { "XXX", "XLX", "X$X", Character.valueOf('L'), Item.legsLeather,Character.valueOf('$'), new ItemStack(Item.dyePowder, 1, 4), Character.valueOf('X'), Item.silk});
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.jacket_driver_paintable.item, 1), new Object[] { "X X", "XRX", "XPX", Character.valueOf('X'), new ItemStack(Item.dyePowder, 1, 4), Character.valueOf('P'), Item.plateLeather,Character.valueOf('R'),  new ItemStack(Item.dyePowder, 1, 1) });
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.hat_driver_paintable.item, 1), new Object[] {"#$#", "# #", Character.valueOf('$'), new ItemStack(Item.dyePowder, 1, 4), Character.valueOf('#'), Item.silk });
		
		/* Ticket Man Clothes */
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.pants_ticketMan_paintable.item, 1), new Object[] { "XXX", "XLX", "X$X", Character.valueOf('L'), Item.legsLeather,Character.valueOf('$'), new ItemStack(Item.dyePowder, 1, 8), Character.valueOf('X'), Item.silk});
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.jacket_ticketMan_paintable.item, 1), new Object[] { "X X", "XPX", "X#X", Character.valueOf('P'), Item.plateLeather, Character.valueOf('#'), new ItemStack(Item.dyePowder, 1, 4), Character.valueOf('X'), Item.silk});
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.hat_ticketMan_paintable.item, 1), new Object[] {"#$#", "# #", Character.valueOf('$'), new ItemStack(Item.dyePowder, 1, 0), Character.valueOf('#'), Item.silk });
		
		
		ArrayList<ItemStack> plastics = OreDictionary.getOres("dustPlastic");
		ArrayList<ItemStack> copper = OreDictionary.getOres("ingotCopper");
		if (plastics != null && plastics.size() >= 0) {
			for (ItemStack plastic : plastics) {
				/* Empty canister */
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.emptyCanister.item, 4), new Object[] { "PPP", "P P", "PPP", Character.valueOf('P'), plastic});
				/* Electronic circuit */
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.electronicCircuit.item, 1), new Object[] { "XXX", "RPR", "XXX", Character.valueOf('X'), ItemIDs.copperWireFine.item, Character.valueOf('P'), plastic, Character.valueOf('R'), Item.redstone });
				/* Composite Material*/
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.reinforcedPlastic.item, 16), new Object[] { "LPL", "PLP", "GPG", Character.valueOf('G'), Block.thinGlass, Character.valueOf('P'), ItemIDs.graphite.item, Character.valueOf('L'), plastic});
				
				if (copper != null && copper.size() >= 0) {
					for (ItemStack copp : copper) {
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.copperWireFine.item, 6), new Object[] { "XXX", "XPX", "XXX", Character.valueOf('X'), copp, Character.valueOf('P'), plastic });
					}
				}	
			}
		}
		
		/* Composite Suit */
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.boots_suit_paintable.item, 1), new Object[] {" D ","X X", "XFX", Character.valueOf('F'), Item.feather, Character.valueOf('D'), Item.diamond, Character.valueOf('X'), ItemIDs.reinforcedPlates.item});
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.pants_suit_paintable.item, 1), new Object[] { "XDX", "X$X", "X X", Character.valueOf('$'), Item.fireballCharge, Character.valueOf('X'), ItemIDs.reinforcedPlates.item,Character.valueOf('D'), Item.diamond});
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.jacket_suit_paintable.item, 1), new Object[] { "X X", "XDX", "XAX", Character.valueOf('A'), Item.appleGold, Character.valueOf('X'), ItemIDs.reinforcedPlates.item,Character.valueOf('D'), Block.blockDiamond});
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.helmet_suit_paintable.item, 1), new Object[] {"#D#", "# #", Character.valueOf('D'), Block.blockDiamond, Character.valueOf('#'), ItemIDs.reinforcedPlates.item });

		/* Trains parts */

		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.generator.item, 1), new Object[] { " ##", "E$$", " ##", Character.valueOf('#'), ItemIDs.copperWireFine.item, Character.valueOf('E'), ItemIDs.electronicCircuit.item, Character.valueOf('$'), Item.ingotIron });// generator
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.controls.item, 1), new Object[] { "#X#", "#E#", "$$$", Character.valueOf('#'), Block.lever, Character.valueOf('X'), Block.stoneButton, Character.valueOf('$'), Item.ingotIron, Character.valueOf('E'), ItemIDs.electronicCircuit.item });// train controls
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.dieselengine.item, 2), new Object[] { "###", "XXX", "CCC", Character.valueOf('#'), ItemIDs.piston.item, Character.valueOf('X'), ItemIDs.cylinder.item, Character.valueOf('C'), ItemIDs.camshaft.item });// diesel engine 
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.electmotor.item, 1), new Object[] { "I#I", "#E#", "I#I", Character.valueOf('#'), ItemIDs.copperWireFine.item, Character.valueOf('I'), Item.ingotIron, Character.valueOf('E'), ItemIDs.electronicCircuit.item });// Electric motor 
		ArrayList<ItemStack> dustCoal = OreDictionary.getOres("dustCoal");
		if (dustCoal != null && dustCoal.size() >= 0) {
			for (int t = 0; t < dustCoal.size(); t++) {
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.graphite.item, 2), new Object[] { "###", "#X#", "###", Character.valueOf('#'), dustCoal.get(t), Character.valueOf('X'), Item.clay });// Graphite
			}
		}
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.ironBoiler.item, 2), new Object[] { "###", "XXX", "###", Character.valueOf('#'), Item.ingotIron, Character.valueOf('X'), Item.bucketWater });// iron Boiler 
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.ironFirebox.item, 2), new Object[] { "###", "#X#", "###", Character.valueOf('#'), Item.ingotIron, Character.valueOf('X'), Item.flintAndSteel });// iron Firebox  
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.ironChimney.item, 2), new Object[] { "# #", "# #", "# #", Character.valueOf('#'), Item.ingotIron });
		
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.coaldust.item, 4), new Object[] { "###","   ","   ", Character.valueOf('#'), Item.coal });
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.coaldust.item, 4), new Object[] { "   ","###","   ", Character.valueOf('#'), Item.coal });
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.coaldust.item, 4), new Object[] { "   ","   ","###", Character.valueOf('#'), Item.coal });
		
		//TrainCraftingManager.instance.addShapelessRecipe(new ItemStack(ItemIDs.coaldust.item, 4), new Object[] { Item.coal, Item.coal, Item.coal, Item.coal });// coal dust
		
		//TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.signal.item, 2), new Object[] { "#", "X", "X", Character.valueOf('X'), ItemIDs.steel.item, Character.valueOf('#'), Item.redstone });
		/* diesel generator */
		TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.generatorDiesel.block, 1), new Object[] { "C  ", "DE ", Character.valueOf('C'), ItemIDs.steelchimney.item, Character.valueOf('D'), ItemIDs.dieselengine.item, Character.valueOf('E'), ItemIDs.electronicCircuit.item });
		
		/* Zepplin parts and zeppelin item */
		if (ConfigHandler.ENABLE_ZEPPELIN) {
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.balloon.item, 1), new Object[] { "###", "# #", "###", Character.valueOf('#'), Block.cloth });// Balloon  
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.steamengine.item, 1), new Object[] { "C  ", "BF ", Character.valueOf('C'), ItemIDs.steelchimney.item, Character.valueOf('B'), ItemIDs.boiler.item, Character.valueOf('F'), ItemIDs.firebox.item });// Small steam engine 
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.airship.item, 1), new Object[] { "B B", "SES", "POP", Character.valueOf('B'), ItemIDs.balloon.item, Character.valueOf('S'), Item.stick, Character.valueOf('E'), ItemIDs.steamengine.item, Character.valueOf('P'), ItemIDs.propeller.item, Character.valueOf('O'), Item.boat });
			TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.zeppelin.item, 1), new Object[] { "BBB", "SES", "POP", Character.valueOf('B'), ItemIDs.balloon.item, Character.valueOf('S'), ItemIDs.propeller.item, Character.valueOf('E'), ItemIDs.controls.item, Character.valueOf('P'), ItemIDs.electmotor.item, Character.valueOf('O'), ItemIDs.seats.item });
		}
		
		ArrayList<ItemStack> steel = OreDictionary.getOres("ingotSteel");
		ArrayList<ItemStack> s1 = OreDictionary.getOres("plankWood");
		ArrayList<ItemStack> s2 = OreDictionary.getOres("logWood");
		if (s1 != null && s1.size() >= 0) {
			for (int i = 0; i < s1.size(); i++) {
				if (steel != null && steel.size() >= 0) {
					for (int t = 0; t < steel.size(); t++) {
						
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.reinforcedPlates.item, 1), new Object[] { "RRR", "SSS", "CCC", Character.valueOf('R'), ItemIDs.reinforcedPlastic.item, Character.valueOf('S'), steel.get(t), Character.valueOf('C'), Item.clay});
						
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.composite_wrench.item, 1), new Object[] {"S S", " R "," R ", Character.valueOf('R'), ItemIDs.reinforcedPlastic.item, Character.valueOf('S'),steel.get(t) });
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.steelcab.item, 2), new Object[] { "###", "X X", "XXX", Character.valueOf('X'), steel.get(t), Character.valueOf('#'), s1.get(i) });// Steel cab
						TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.distilIdle.block, 1), new Object[] { "###", "#F#", "###", Character.valueOf('#'), steel.get(t), Character.valueOf('F'), ItemIDs.firebox.item });
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.transformer.item, 1), new Object[] { "# #", "XEX", "###", Character.valueOf('#'), steel.get(t), Character.valueOf('E'), ItemIDs.electronicCircuit.item, Character.valueOf('X'), Item.redstone });// transformer
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.minecartLocoMineTrain.item, 1), new Object[] { "X#X", "XXX", Character.valueOf('X'), steel.get(t), Character.valueOf('#'), ItemIDs.electmotor.item });
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.minecartLocoMineTrain.item, 1), new Object[] { "   ", "X#X", "XXX", Character.valueOf('X'), steel.get(t), Character.valueOf('#'), ItemIDs.electmotor.item });
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.minecartMineTrain.item, 1), new Object[] { "X#X", "XXX", Character.valueOf('X'), steel.get(t), Character.valueOf('#'), Block.chest });
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.minecartMineTrain.item, 1), new Object[] { "   ", "X#X", "XXX", Character.valueOf('X'), steel.get(t), Character.valueOf('#'), Block.chest });

						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.boiler.item, 2), new Object[] { "###", "XXX", "###", Character.valueOf('#'), steel.get(t), Character.valueOf('X'), Item.bucketWater });// Boiler 
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.firebox.item, 2), new Object[] { "###", "#X#", "###", Character.valueOf('#'), steel.get(t), Character.valueOf('X'), Item.flintAndSteel });// Firebox 
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.bogie.item, 4), new Object[] { " # ", "#X#", " # ", Character.valueOf('#'), steel.get(t), Character.valueOf('X'), Item.ingotIron });// Bogie 
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.steelframe.item, 2), new Object[] { "# #", "AAA", Character.valueOf('A'), steel.get(t), Character.valueOf('#'), Item.ingotIron });// Steel Frame 
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.steelframe.item, 2), new Object[] { "   ", "# #", "AAA", Character.valueOf('A'), steel.get(t), Character.valueOf('#'), Item.ingotIron });// Steel Frame  
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.steelchimney.item, 2), new Object[] { "# #", "# #", "# #", Character.valueOf('#'), steel.get(t) });// Bogie 
						TrainCraftingManager.instance.addRecipe(new ItemStack(Item.flintAndSteel, 2), new Object[] { "* ", " #", Character.valueOf('*'), steel.get(t), Character.valueOf('#'), Item.flint });

						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.stake.item, 1), new Object[] { "   ", "IFI", "   ", Character.valueOf('I'), steel.get(t), Character.valueOf('F'), Item.ingotIron });
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.stake.item, 1), new Object[] { "IFI", "   ", "   ", Character.valueOf('I'), steel.get(t), Character.valueOf('F'), Item.ingotIron });
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.stake.item, 1), new Object[] { "   ", "   ", "IFI", Character.valueOf('I'), steel.get(t), Character.valueOf('F'), Item.ingotIron });

						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.transmition.item, 1), new Object[] { " # ", "#X#", " # ", Character.valueOf('#'), steel.get(t), Character.valueOf('X'), ItemIDs.diesel.item });// transmition
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.piston.item, 3), new Object[] { " # ", " X ", Character.valueOf('#'), steel.get(t), Character.valueOf('X'), Item.stick });// piston
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.camshaft.item, 3), new Object[] { "###", "   ", "   ", Character.valueOf('#'), steel.get(t) });// camshaft 
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.camshaft.item, 3), new Object[] { "   ", "###", "   ", Character.valueOf('#'), steel.get(t) });// camshaft
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.camshaft.item, 3), new Object[] { "   ", "   ", "###", Character.valueOf('#'), steel.get(t) });// camshaft
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.cylinder.item, 3), new Object[] { "# #", "# #", "###", Character.valueOf('#'), steel.get(t) });// cylinder 
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.propeller.item, 2), new Object[] { " # ", "#X#", " # ", Character.valueOf('#'), s1.get(i), Character.valueOf('X'), Item.ingotIron });// Propeller
						
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailSmallStraight.item, 32), new Object[] { "I I", "SPS", "I I", Character.valueOf('P'), s1.get(i), Character.valueOf('I'), Item.ingotIron, Character.valueOf('S'), steel.get(t) });// small straight track
					}
				}
				if (s2 != null && s2.size() >= 0) {
					for (int j = 0; j < s2.size(); j++) {
						/* Water Wheel */
						TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.waterWheel.block, 1), new Object[] { " P ", "PGP", " P ", Character.valueOf('P'), s2.get(j),Character.valueOf('G'), ItemIDs.generator.item});
						/* Wind mill */
						TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.windMill.block, 1), new Object[] { " R ", " G ", "B B",Character.valueOf('G'), ItemIDs.generator.item, Character.valueOf('B'), Item.ingotIron, Character.valueOf('R'), ItemIDs.propeller.item});
						
						TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.woodenBogie.item, 4), new Object[] { " # ", "#X#", " # ", Character.valueOf('#'), s1.get(i), Character.valueOf('X'), s2.get(j) });// wooden Bogie
					}
				}
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.seats.item, 1), new Object[] { "#  ", "## ", "XXX", Character.valueOf('#'), s1.get(i), Character.valueOf('X'), Item.ingotIron });// transformer
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.woodenFrame.item, 2), new Object[] { "# #", "AAA", Character.valueOf('A'), s1.get(i), Character.valueOf('#'), s1.get(i) });// wooden Frame
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.woodenFrame.item, 2), new Object[] { "   ", "# #", "AAA", Character.valueOf('A'), s1.get(i), Character.valueOf('#'), s1.get(i) });// wooden Frame
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.woodenCab.item, 2), new Object[] { "###", "X X", "XXX", Character.valueOf('X'), s1.get(i), Character.valueOf('#'), s1.get(i) });// wooden cab
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.ironBogie.item, 4), new Object[] { " # ", "#X#", " # ", Character.valueOf('#'), Item.ingotIron, Character.valueOf('X'), s1.get(i) });// iron Bogie
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.ironFrame.item, 2), new Object[] { "# #", "AAA", Character.valueOf('A'), Item.ingotIron, Character.valueOf('#'), s1.get(i) });// iron Frame
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.ironFrame.item, 2), new Object[] { "   ", "# #", "AAA", Character.valueOf('A'), Item.ingotIron, Character.valueOf('#'), s1.get(i) });// iron Frame
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.ironCab.item, 2), new Object[] { "###", "X X", "XXX", Character.valueOf('X'), Item.ingotIron, Character.valueOf('#'), s1.get(i) });// iron cab
				TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.stopper.block, 1), new Object[] { "WWW", "I I", "RRR", Character.valueOf('W'), s1.get(i), Character.valueOf('R'), Block.rail, Character.valueOf('I'), Item.ingotIron});// stopper
				
				TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailLargeSlopeWood.item, 2), new Object[] {"  S", " SW","SWW", Character.valueOf('S'), ItemIDs.tcRailSmallStraight.item,Character.valueOf('W'), s1.get(i) });// straight slopes
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
		
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailLargeSlopeGravel.item, 2), new Object[] {"  S", " SG","SGG", Character.valueOf('S'), ItemIDs.tcRailSmallStraight.item,Character.valueOf('G'), Block.gravel });// straight slopes
		TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailLargeSlopeBallast.item, 2), new Object[] {"  S", " SB","SBB", Character.valueOf('S'), ItemIDs.tcRailSmallStraight.item,Character.valueOf('B'), new ItemStack(BlockIDs.oreTC.block, 1,3) });// straight slopes
		
		TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.bridgePillar.block, 4), new Object[] {"SSS", "S S","SSS", Character.valueOf('S'), Item.stick});// bridge pillar
		
		/* Smelting recipes */
		FurnaceRecipes.smelting().addSmelting(BlockIDs.oreTC.block.blockID, 0, OreDictionary.getOres("ingotCopper").get(0), 0.7f);
	}

	public static void addDictRecipe(ItemStack stack, Object... obj) {
		ShapedOreRecipe recipe = new ShapedOreRecipe(stack, obj);
		GameRegistry.addRecipe(recipe);
	}
}