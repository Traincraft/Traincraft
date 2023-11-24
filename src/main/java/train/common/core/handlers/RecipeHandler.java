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

    private static ArrayList<ItemStack> multiNameOreDict(String... names) {
        ArrayList<ItemStack> entries = new ArrayList<>();
        for (String name : names) {
            entries.addAll(OreDictionary.getOres(name));

        }
        return entries;
    }

    public static void initBlockRecipes() {
        ArrayList<ItemStack> iron = OreDictionary.getOres("ingotIron");

        TrainCraftingManager.instance.getRecipeList().add(new RecipesArmorDyes());
        /* Assembly tables */
        for (ItemStack ironingot : iron) {
            GameRegistry.addRecipe(new ItemStack(BlockIDs.assemblyTableI.block, 1), "IPI", "S S", "SPS", 'I', ironingot, 'P', Blocks.piston, 'S', Blocks.stone);
        }
        GameRegistry.addRecipe(new ItemStack(BlockIDs.assemblyTableII.block, 1), "GPG", "O O", "OPO", 'G', Items.gold_ingot, 'P', Blocks.piston, 'O', Blocks.obsidian);
        GameRegistry.addRecipe(new ItemStack(BlockIDs.assemblyTableIII.block, 1), "GPG", "DLD", "OPO", 'G', Items.gold_ingot, 'P', Blocks.piston, 'D', Items.diamond, 'L', Blocks.glowstone, 'O', Blocks.obsidian);

        if (!ConfigHandler.DISABLE_TRAIN_WORKBENCH) {
            for (ItemStack ironingot : iron) {
                addDictRecipe(new ItemStack(BlockIDs.trainWorkbench.block, 1), "###", "IFI", "###", '#', "plankWood", 'F', Blocks.furnace, 'I', ironingot);
            }
        }
        addDictRecipe(new ItemStack(BlockIDs.distilIdle.block, 1), "###", "#F#", "###", '#', "ingotSteel", 'F', ItemIDs.firebox.item);

        /* Open Hearth Furnace */
        if (!ConfigHandler.MAKE_MODPACKS_GREAT_AGAIN) {
            GameRegistry.addRecipe(new ItemStack(BlockIDs.openFurnaceIdle.block, 1), "#L#", "#B#", "#I#",
                    '#', Blocks.nether_brick, 'L', Items.lava_bucket,
                    'B', Items.bucket, 'I', Blocks.iron_block);
        }

        /* Lantern */
        for (ItemStack ironingot : iron) {
            GameRegistry.addRecipe(new ItemStack(BlockIDs.lantern.block, 4), "III", "PTP", "III", 'I', ironingot, 'P', Blocks.glass_pane, 'T', Blocks.torch);
        }

        /* Clothes */
        GameRegistry.addRecipe(new ItemStack(ItemIDs.overalls.item, 1), " # ", "X$X", "X$X", 'X', new ItemStack(Items.dye, 1, 4), '$', Items.leather_leggings, '#', new ItemStack(Items.dye, 1, 1));
        GameRegistry.addRecipe(new ItemStack(ItemIDs.jacket.item, 1), "X X", "X$X", "X#X", 'X', new ItemStack(Items.dye, 1, 14), '$', Items.leather_chestplate, '#', Items.string);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.hat.item, 1), " X ", "X$X", "#X#", 'X', new ItemStack(Items.dye, 1, 4), '$', Items.leather_helmet, '#', Items.string);

        /* Driver Clothes*/
        GameRegistry.addRecipe(new ItemStack(ItemIDs.pants_driver_paintable.item, 1), "XXX", "XLX", "X$X", 'L', Items.leather_leggings, '$', new ItemStack(Items.dye, 1, 4), 'X', Items.string);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.jacket_driver_paintable.item, 1), "X X", "XRX", "XPX", 'X', new ItemStack(Items.dye, 1, 4), 'P', Items.leather_chestplate, 'R', new ItemStack(Items.dye, 1, 1));
        GameRegistry.addRecipe(new ItemStack(ItemIDs.hat_driver_paintable.item, 1), "#$#", "# #", '$', new ItemStack(Items.dye, 1, 4), '#', Items.string);

        /* Ticket Man Clothes */
        GameRegistry.addRecipe(new ItemStack(ItemIDs.pants_ticketMan_paintable.item, 1), "XXX", "XLX", "X$X", 'L', Items.leather_leggings, '$', new ItemStack(Items.dye, 1, 8), 'X', Items.string);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.jacket_ticketMan_paintable.item, 1), "X X", "XPX", "X#X", 'P', Items.leather_chestplate, '#', new ItemStack(Items.dye, 1, 4), 'X', Items.string);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.hat_ticketMan_paintable.item, 1), "#$#", "# #", '$', new ItemStack(Items.dye, 1, 0), '#', Items.string);

        /* Recipe book */
        GameRegistry.addRecipe(new ItemStack(ItemIDs.recipeBook.item, 1), "TTT", "TBT", "TTT", 'T', Blocks.rail, 'B', Items.book);


        // Track recipes for crafting table - TheDoctor1138
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailSmallStraight.item, 16), "G G", "BPB", "G G", 'G', Items.iron_ingot, 'P', Blocks.planks, 'B', ItemIDs.bolt.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailMediumStraight.item, 1), "G  ", "G  ", "G  ", 'G', ItemIDs.tcRailSmallStraight.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailLongStraight.item, 1), "G  ", "G  ", "   ", 'G', ItemIDs.tcRailMediumStraight.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailVeryLongStraight.item, 1), "G  ", "G  ", "   ", 'G', ItemIDs.tcRailLongStraight.item);

        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailSmallDiagonalStraight.item, 1), " G ", "G  ", "   ", 'G', ItemIDs.tcRailSmallStraight.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailMediumDiagonalStraight.item, 1), "  G", " G ", "G  ", 'G', ItemIDs.tcRailSmallDiagonalStraight.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailLongDiagonalStraight.item, 1), " G ", "G  ", "   ", 'G', ItemIDs.tcRailMediumDiagonalStraight.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailVeryLongDiagonalStraight.item, 1), " G ", "G  ", "   ", 'G', ItemIDs.tcRailLongDiagonalStraight.item);

        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailMediumTurn.item, 1), "GG ", "G  ", "   ", 'G', ItemIDs.tcRailSmallStraight.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailLargeTurn.item, 1), " SS", "SS ", "S  ", 'S', ItemIDs.tcRailSmallStraight.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailVeryLargeTurn.item, 1), "GG ", "G  ", "   ", 'G', ItemIDs.tcRailLargeTurn.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailSuperLargeTurn.item, 1), "GG ", "G  ", "   ", 'G', ItemIDs.tcRailVeryLargeTurn.item);

        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailMedium45DegreeTurn.item, 1), "TG ", "G  ", "   ", 'G', ItemIDs.tcRailSmallStraight.item, 'T', ItemIDs.tcRailMediumTurn.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailLarge45DegreeTurn.item, 1), "TG ", "G  ", "   ", 'G', ItemIDs.tcRailSmallStraight.item, 'T', ItemIDs.tcRailLargeTurn.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailVeryLarge45DegreeTurn.item, 1), "TG ", "G  ", "   ", 'G', ItemIDs.tcRailSmallStraight.item, 'T', ItemIDs.tcRailVeryLargeTurn.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailSuperLarge45DegreeTurn.item, 1), "TG ", "G  ", "   ", 'G', ItemIDs.tcRailSmallStraight.item, 'T', ItemIDs.tcRailSuperLargeTurn.item);

        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailSmallParallelCurve.item, 1), " S ", "SS ", "S  ", 'S', ItemIDs.tcRailSmallStraight.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailMediumParallelCurve.item, 1), " S ", "S  ", "   ", 'S', ItemIDs.tcRailSmallParallelCurve.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailLargeParallelCurve.item, 1), " S ", "S  ", "   ", 'S', ItemIDs.tcRailMediumParallelCurve.item);

        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailMediumSwitch.item, 1), "G  ", "GHG", "G  ", 'G', ItemIDs.tcRailSmallStraight.item, 'H', ItemIDs.tcRailMediumTurn.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailMediumParallelSwitch.item, 1), "I G", "IHH", "IH ", 'G', ItemIDs.tcRailSmallStraight.item, 'H', ItemIDs.tcRailMediumTurn.item, 'I', ItemIDs.tcRailMediumStraight.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailLargeSwitch.item, 1), "G  ", "HIG", "G  ", 'G', ItemIDs.tcRailSmallStraight.item, 'H', ItemIDs.tcRailMediumStraight.item, 'I', ItemIDs.tcRailLargeTurn.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailMedium45DegreeSwitch.item, 1), "G D", "GH ", "G  ", 'G', ItemIDs.tcRailSmallStraight.item, 'H', ItemIDs.tcRailMedium45DegreeTurn.item, 'D', ItemIDs.tcRailSmallDiagonalStraight.item);

        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailSlopeWood.item, 1), " TP", "TPP", "PPP", 'T', ItemIDs.tcRailMediumStraight.item, 'P', Blocks.planks);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailLargeSlopeWood.item, 1), "   ", "  T", " T ", 'T', ItemIDs.tcRailSlopeWood.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailVeryLargeSlopeWood.item, 1), "  T", " T ", "T  ", 'T', ItemIDs.tcRailSlopeWood.item);

        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailSlopeSnowGravel.item, 1), " TS", "TSS", "SSS", 'T', ItemIDs.tcRailMediumStraight.item, 'S', new ItemStack(BlockIDs.snowGravel.block, 1, 4));
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailLargeSlopeSnowGravel.item, 1), "   ", "  T", " T ", 'T', ItemIDs.tcRailSlopeSnowGravel.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailVeryLargeSlopeSnowGravel.item, 1), "  T", " T ", "T  ", 'T', ItemIDs.tcRailSlopeSnowGravel.item);

        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailSlopeGravel.item, 1), " TG", "TGG", "GGG", 'T', ItemIDs.tcRailMediumStraight.item, 'G', Blocks.gravel);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailLargeSlopeGravel.item, 1), "   ", "  S", " S ", 'S', ItemIDs.tcRailSlopeGravel.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailVeryLargeSlopeGravel.item, 1), "  T", " T ", "T  ", 'T', ItemIDs.tcRailSlopeGravel.item);

        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailSlopeDynamic.item, 1), " TG", "TGG", "GGG", 'T', ItemIDs.tcRailMediumStraight.item, 'G', new ItemStack(Items.dye, 1, 1));
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailLargeSlopeDynamic.item, 1), "   ", "  S", " S ", 'S', ItemIDs.tcRailSlopeDynamic.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailVeryLargeSlopeDynamic.item, 1), "  T", " T ", "T  ", 'T', ItemIDs.tcRailSlopeDynamic.item);

        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedSlopeDynamic.item, 1), " TG", "TGG", "GGG", 'T', ItemIDs.tcRailEmbeddedMediumStraight.item, 'G', new ItemStack(Items.dye, 1, 1));
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedLargeSlopeDynamic.item, 1), "   ", "  S", " S ", 'S', ItemIDs.tcRailEmbeddedSlopeDynamic.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedVeryLargeSlopeDynamic.item, 1), "  T", " T ", "T  ", 'T', ItemIDs.tcRailEmbeddedSlopeDynamic.item);

        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailLargeCurvedSlopeDynamic.item, 1), "   ", " T ", " S ", 'T', ItemIDs.tcRailLargeTurn.item, 'S', ItemIDs.tcRailSlopeDynamic.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailVeryLargeCurvedSlopeDynamic.item, 1), "   ", " T ", " S ", 'T', ItemIDs.tcRailVeryLargeTurn.item, 'S', ItemIDs.tcRailLargeSlopeDynamic.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailSuperLargeCurvedSlopeDynamic.item, 1), "   ", " T ", " S ", 'T', ItemIDs.tcRailSuperLargeTurn.item, 'S', ItemIDs.tcRailVeryLargeSlopeDynamic.item);

        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailSlopeBallast.item, 1), " TG", "TGG", "GGG", 'T', ItemIDs.tcRailMediumStraight.item, 'G', new ItemStack(BlockIDs.oreTC.block, 1, 3));
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailLargeSlopeBallast.item, 1), "   ", "  S", " S ", 'S', ItemIDs.tcRailSlopeBallast.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailVeryLargeSlopeBallast.item, 1), "  T", " T ", "T  ", 'T', ItemIDs.tcRailSlopeBallast.item);

        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailTwoWaysCrossing.item, 1), " S ", "SSS", " S ", 'S', ItemIDs.tcRailSmallStraight.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailDiagonalTwoWaysCrossing.item, 1), "D D", " D ", "D D", 'D', ItemIDs.tcRailSmallDiagonalStraight.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailDiamondCrossing.item, 1), " SD", " S ", "DS ", 'S', ItemIDs.tcRailSmallStraight.item, 'D', ItemIDs.tcRailSmallDiagonalStraight.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailDiamondCrossing.item, 1), "DS ", " S ", " SD", 'S', ItemIDs.tcRailSmallStraight.item, 'D', ItemIDs.tcRailSmallDiagonalStraight.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailDoubleDiamondCrossing.item, 1), "DSD", " S ", "DSD", 'S', ItemIDs.tcRailSmallStraight.item, 'D', ItemIDs.tcRailSmallDiagonalStraight.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailFourWaysCrossing.item, 1), "DSD", "SDS", "DSD", 'S', ItemIDs.tcRailSmallStraight.item, 'D', ItemIDs.tcRailSmallDiagonalStraight.item);

        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedSmallStraight.item, 16), "I I", "B B", "I I", 'I', Items.iron_ingot, 'B', ItemIDs.bolt.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedMediumStraight.item, 1), "G  ", "G  ", "G  ", 'G', ItemIDs.tcRailEmbeddedSmallStraight.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedLongStraight.item, 1), "G  ", "G  ", "   ", 'G', ItemIDs.tcRailEmbeddedMediumStraight.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedVeryLongStraight.item, 1), "G  ", "G  ", "   ", 'G', ItemIDs.tcRailEmbeddedLongStraight.item);

        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedSmallDiagonalStraight.item, 1), " G ", "G  ", "   ", 'G', ItemIDs.tcRailEmbeddedSmallStraight.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedMediumDiagonalStraight.item, 1), "  G", " G ", "G  ", 'G', ItemIDs.tcRailEmbeddedSmallDiagonalStraight.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedLongDiagonalStraight.item, 1), " G ", "G  ", "   ", 'G', ItemIDs.tcRailEmbeddedMediumDiagonalStraight.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedVeryLongDiagonalStraight.item, 1), " G ", "G  ", "   ", 'G', ItemIDs.tcRailEmbeddedLongDiagonalStraight.item);

        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedMediumTurn.item, 1), "GG ", "G  ", "   ", 'G', ItemIDs.tcRailEmbeddedSmallStraight.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedLargeTurn.item, 1), " SS", "SS ", "S  ", 'S', ItemIDs.tcRailEmbeddedSmallStraight.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedVeryLargeTurn.item, 1), "GG ", "G  ", "   ", 'G', ItemIDs.tcRailEmbeddedLargeTurn.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedSuperLargeTurn.item, 1), "GG ", "G  ", "   ", 'G', ItemIDs.tcRailEmbeddedVeryLargeTurn.item);

        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedMedium45DegreeTurn.item, 1), "TG ", "G  ", "   ", 'G', ItemIDs.tcRailEmbeddedSmallStraight.item, 'T', ItemIDs.tcRailEmbeddedMediumTurn.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedLarge45DegreeTurn.item, 1), "TG ", "G  ", "   ", 'G', ItemIDs.tcRailEmbeddedSmallStraight.item, 'T', ItemIDs.tcRailEmbeddedLargeTurn.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedVeryLarge45DegreeTurn.item, 1), "TG ", "G  ", "   ", 'G', ItemIDs.tcRailEmbeddedSmallStraight.item, 'T', ItemIDs.tcRailEmbeddedVeryLargeTurn.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedSuperLarge45DegreeTurn.item, 1), "TG ", "G  ", "   ", 'G', ItemIDs.tcRailEmbeddedSmallStraight.item, 'T', ItemIDs.tcRailEmbeddedSuperLargeTurn.item);

        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedSmallParallelCurve.item, 1), " S ", "SS ", "S  ", 'S', ItemIDs.tcRailEmbeddedSmallStraight.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedMediumParallelCurve.item, 1), " S ", "SS ", "S  ", 'S', ItemIDs.tcRailEmbeddedSmallParallelCurve.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedLargeParallelCurve.item, 1), " S ", "SS ", "S  ", 'S', ItemIDs.tcRailEmbeddedMediumParallelCurve.item);

        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedMediumSwitch.item, 1), "G  ", "GHG", "G  ", 'G', ItemIDs.tcRailEmbeddedSmallStraight.item, 'H', ItemIDs.tcRailEmbeddedMediumTurn.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedMediumParallelSwitch.item, 1), "I G", "IHH", "IH ", 'G', ItemIDs.tcRailEmbeddedSmallStraight.item, 'H', ItemIDs.tcRailEmbeddedMediumTurn.item, 'I', ItemIDs.tcRailEmbeddedMediumStraight.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedLargeSwitch.item, 1), "G  ", "HIG", "G  ", 'G', ItemIDs.tcRailEmbeddedSmallStraight.item, 'H', ItemIDs.tcRailEmbeddedMediumStraight.item, 'I', ItemIDs.tcRailEmbeddedLargeTurn.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedMedium45DegreeSwitch.item, 1), "G D", "GH ", "G  ", 'G', ItemIDs.tcRailEmbeddedSmallStraight.item, 'H', ItemIDs.tcRailEmbeddedMedium45DegreeTurn.item, 'D', ItemIDs.tcRailEmbeddedSmallDiagonalStraight.item);

        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedLargeCurvedSlopeDynamic.item, 1), "   ", " T ", " S ", 'T', ItemIDs.tcRailEmbeddedLargeTurn.item, 'S', ItemIDs.tcRailEmbeddedSlopeDynamic.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedVeryLargeCurvedSlopeDynamic.item, 1), "   ", " T ", " S ", 'T', ItemIDs.tcRailEmbeddedVeryLargeTurn.item, 'S', ItemIDs.tcRailEmbeddedLargeSlopeDynamic.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedSuperLargeCurvedSlopeDynamic.item, 1), "   ", " T ", " S ", 'T', ItemIDs.tcRailEmbeddedSuperLargeTurn.item, 'S', ItemIDs.tcRailEmbeddedVeryLargeSlopeDynamic.item);

        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedTwoWaysCrossing.item, 1), " S ", "SSS", " S ", 'S', ItemIDs.tcRailEmbeddedSmallStraight.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedDiagonalTwoWaysCrossing.item, 1), "D D", " D ", "D D", 'D', ItemIDs.tcRailEmbeddedSmallDiagonalStraight.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedDiamondCrossing.item, 1), " SD", " S ", "DS ", 'S', ItemIDs.tcRailEmbeddedSmallStraight.item, 'D', ItemIDs.tcRailEmbeddedSmallDiagonalStraight.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedDiamondCrossing.item, 1), "DS ", " S ", " SD", 'S', ItemIDs.tcRailEmbeddedSmallStraight.item, 'D', ItemIDs.tcRailEmbeddedSmallDiagonalStraight.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedDoubleDiamondCrossing.item, 1), "DSD", " S ", "DSD", 'S', ItemIDs.tcRailEmbeddedSmallStraight.item, 'D', ItemIDs.tcRailEmbeddedSmallDiagonalStraight.item);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedFourWaysCrossing.item, 1), "DSD", "SDS", "DSD", 'S', ItemIDs.tcRailEmbeddedSmallStraight.item, 'D', ItemIDs.tcRailEmbeddedSmallDiagonalStraight.item);


        //Track Conversion Recipes to Normal Rails

        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailSmallStraight.item, 1), "   ", " R ", "   ", 'R', Item.getItemFromBlock(Blocks.rail));// small straight track
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailSmallRoadCrossing.item, 1), "   ", "SRS", "   ", 'S', new ItemStack(Blocks.stained_hardened_clay, 1, 15), 'R', Item.getItemFromBlock(Blocks.rail));
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailSmallRoadCrossing1.item, 1), "   ", "SRS", "   ", 'S', new ItemStack(Blocks.stained_hardened_clay, 1, 7), 'R', Item.getItemFromBlock(Blocks.rail));
        GameRegistry.addRecipe(new ItemStack(ItemIDs.tcRailSmallRoadCrossing2.item, 1), "   ", "SRS", "   ", 'S', new ItemStack(Blocks.stained_hardened_clay, 1, 3), 'R', Item.getItemFromBlock(Blocks.rail));
        GameRegistry.addRecipe(new ItemStack(Item.getItemFromBlock(Blocks.rail), 1), "   ", " R ", "   ", 'R', ItemIDs.tcRailSmallStraight.item);
        GameRegistry.addRecipe(new ItemStack(Item.getItemFromBlock(Blocks.rail), 1), "   ", " R ", "   ", 'R', ItemIDs.tcRailSmallRoadCrossing.item);
        GameRegistry.addRecipe(new ItemStack(Item.getItemFromBlock(Blocks.rail), 1), "   ", " R ", "   ", 'R', ItemIDs.tcRailSmallRoadCrossing1.item);
        GameRegistry.addRecipe(new ItemStack(Item.getItemFromBlock(Blocks.rail), 1), "   ", " R ", "   ", 'R', ItemIDs.tcRailSmallRoadCrossing2.item);

        GameRegistry.addRecipe(new ItemStack(ItemIDs.paintbrushThing.item, 1), "GB ", "RIS", " ST", 'G', new ItemStack(Items.dye, 1, 2), 'B', new ItemStack(Items.dye, 1, 4), 'R', new ItemStack(Items.dye, 1, 1), 'I', new ItemStack(Items.iron_ingot), 'S', new ItemStack(Items.string), 'T', new ItemStack(Items.stick));
        GameRegistry.addShapelessRecipe(new ItemStack(BlockIDs.poweredGravel.block, 1), new ItemStack(Items.redstone), new ItemStack(Blocks.gravel));
        GameRegistry.addShapelessRecipe(new ItemStack(BlockIDs.snowGravel.block, 1), new ItemStack(Items.snowball), new ItemStack(Blocks.gravel));
        GameRegistry.addShapelessRecipe(new ItemStack(BlockIDs.snowGravel.block, 4), new ItemStack(Blocks.snow), new ItemStack(Blocks.gravel), new ItemStack(Blocks.gravel), new ItemStack(Blocks.gravel), new ItemStack(Blocks.gravel));
        GameRegistry.addShapelessRecipe(new ItemStack(BlockIDs.asphalt.block, 8), new ItemStack(ItemIDs.coaldust.item), new ItemStack(ItemIDs.coaldust.item), new ItemStack(ItemIDs.coaldust.item), new ItemStack(ItemIDs.coaldust.item), new ItemStack(Blocks.cobblestone), new ItemStack(Blocks.cobblestone), new ItemStack(Blocks.cobblestone), new ItemStack(Blocks.cobblestone), new ItemStack(Blocks.cobblestone));
        GameRegistry.addRecipe(new ItemStack(BlockIDs.asphaltSlab.block, 6), "BBB", "   ", "   ", 'B', new ItemStack(BlockIDs.asphalt.block));
        GameRegistry.addRecipe(new ItemStack(BlockIDs.asphaltSlab.block, 6), "   ", "BBB", "   ", 'B', new ItemStack(BlockIDs.asphalt.block));
        GameRegistry.addRecipe(new ItemStack(BlockIDs.asphaltSlab.block, 6), "   ", "   ", "BBB", 'B', new ItemStack(BlockIDs.asphalt.block));
        GameRegistry.addRecipe(new ItemStack(BlockIDs.asphaltStairs.block, 4), "B  ", "BB ", "BBB", 'B', new ItemStack(BlockIDs.asphalt.block));
        GameRegistry.addRecipe(new ItemStack(BlockIDs.asphaltStairs.block, 4), "  B", " BB", "BBB", 'B', new ItemStack(BlockIDs.asphalt.block));
        GameRegistry.addRecipe(new ItemStack(BlockIDs.signalSpanish.block, 1), " L ", " I ", "RIR", 'L', new ItemStack(Blocks.redstone_lamp), 'I', new ItemStack(Items.iron_ingot), 'R', new ItemStack(Items.redstone));
        GameRegistry.addRecipe(new ItemStack(BlockIDs.kSignal.block, 1), "RIR", " I ", " L ", 'L', new ItemStack(Blocks.redstone_lamp), 'I', new ItemStack(Items.iron_ingot), 'R', new ItemStack(Items.redstone));
        GameRegistry.addRecipe(new ItemStack(BlockIDs.bridgePillar.block, 8), "SSS", "SLS", "SSS", 'S', new ItemStack(Items.stick), 'L', new ItemStack(Blocks.log));
        GameRegistry.addRecipe(new ItemStack(BlockIDs.speedSign.block, 8), " R ", " I ", " I ", 'R', new ItemStack(Items.dye, 1, 1), 'I', new ItemStack(Items.iron_ingot));

        //Gravel
        GameRegistry.addShapelessRecipe(new ItemStack(BlockIDs.oreTC.block, 4, 3), Blocks.gravel, Blocks.gravel, Items.clay_ball);
        GameRegistry.addShapelessRecipe(new ItemStack(BlockIDs.oreTC.block, 16, 3), Blocks.gravel, Blocks.gravel, Blocks.gravel, Blocks.gravel, Blocks.gravel, Blocks.gravel, Blocks.gravel, Blocks.gravel, Blocks.clay);
        GameRegistry.addShapelessRecipe(new ItemStack(BlockIDs.highSpeedBallast.block, 16), Items.quartz, Blocks.gravel, Blocks.gravel, Blocks.gravel, Blocks.gravel, Blocks.gravel, Blocks.gravel, Blocks.gravel, Blocks.clay);
        GameRegistry.addShapelessRecipe(new ItemStack(BlockIDs.dirtyBallast.block, 16), Blocks.gravel, Blocks.gravel, Blocks.gravel, Blocks.gravel, Blocks.gravel, Blocks.gravel, Blocks.gravel, Blocks.gravel, Blocks.dirt);
        GameRegistry.addShapelessRecipe(new ItemStack(BlockIDs.dirtierBallast.block, 16), new ItemStack(BlockIDs.dirtyBallast.block, 1), new ItemStack(BlockIDs.dirtyBallast.block, 1), new ItemStack(BlockIDs.dirtyBallast.block, 1), new ItemStack(BlockIDs.dirtyBallast.block, 1), new ItemStack(BlockIDs.dirtyBallast.block, 1), new ItemStack(BlockIDs.dirtyBallast.block, 1), new ItemStack(BlockIDs.dirtyBallast.block, 1), new ItemStack(BlockIDs.dirtyBallast.block, 1), Blocks.dirt);

        for (ItemStack ironingot : iron) {
            addDictRecipe(new ItemStack(BlockIDs.switchStand.block, 1), " W ", " I ", " R ", 'W', Blocks.lever, 'R', Items.stick, 'I', ironingot);
            addDictRecipe(new ItemStack(BlockIDs.MILWSwitchStand.block, 1), " RW", "BWR", "AAA", 'A', new ItemStack(Items.stick), 'B', Blocks.iron_bars, 'R', new ItemStack(Items.dye, 1, 1), 'W', new ItemStack(Items.dye, 1, 15));
            addDictRecipe(new ItemStack(BlockIDs.MFPBWigWag.block, 1), "IWI", " I ", " I ", 'W', Blocks.lever, 'I', ironingot);
            /*Buffer*/
            addDictRecipe(new ItemStack(BlockIDs.stopper.block, 1), "WWW", "I I", "RRR", 'W', "plankWood", 'R', Blocks.rail, 'I', ironingot);
            addDictRecipe(new ItemStack(BlockIDs.embeddedStopper.block, 1), "   ", "I I", "RRR", 'R', Blocks.rail, 'I', ironingot);
            addDictRecipe(new ItemStack(BlockIDs.americanstopper.block, 1), "III", "I I", "RRR", 'R', Blocks.rail, 'I', ironingot);
            addDictRecipe(new ItemStack(BlockIDs.metroMadridPole.block, 1), "III", " I ", "C C", 'I', ironingot, 'C', ItemIDs.ingotCopper.item);
        }

        GameRegistry.addRecipe(new ItemStack(ItemIDs.bolt.item, 16), " II", " I ", " I ", 'I', Items.iron_ingot);

    }

    public static void initItemRecipes() {

        ArrayList<ItemStack> steel = OreDictionary.getOres("ingotSteel");
        ArrayList<ItemStack> iron = OreDictionary.getOres("ingotIron");
        ArrayList<ItemStack> planks = OreDictionary.getOres("plankWood");
        ArrayList<ItemStack> logs = OreDictionary.getOres("logWood");
        ArrayList<ItemStack> plastics = multiNameOreDict("itemPlastic", "dustPlastic");//dustPlastic for MFR support
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
                TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.trainWorkbench.block, 1), "###", "IFI", "###", '#', plank, 'F', Blocks.furnace, 'I', ironingot);
            }
        }

        /* Recipe book */
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.recipeBook.item, 1), "TTT", "TBT", "TTT", 'T', Blocks.rail, 'B', Items.book);

        /* Chunk Loader Activator */
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.chunkLoaderActivator.item, 1), "  P", " S ", "S  ", 'S', Items.blaze_rod, 'P', Items.ender_pearl);

        // Switches -hariesh
        GameRegistry.addRecipe(new ItemStack(BlockIDs.owoYardSwitchStand.block, 1), "   ", "OS ", "IW ", 'O', new ItemStack(Items.dye, 1, 14), 'S', Items.stick, 'I', Items.iron_ingot, 'W', Blocks.planks);
        GameRegistry.addRecipe(new ItemStack(BlockIDs.owoSwitchStand.block, 1), " O ", " S ", " IW", 'O', new ItemStack(Items.dye, 1, 14), 'S', Items.stick, 'I', Items.iron_ingot, 'W', Blocks.planks);
        GameRegistry.addRecipe(new ItemStack(BlockIDs.circleSwitchStand.block, 1), " R ", " S ", " IW", 'R', new ItemStack(Items.dye, 1, 1), 'S', Items.stick, 'I', Items.iron_ingot, 'W', Blocks.planks);
        GameRegistry.addRecipe(new ItemStack(BlockIDs.autoSwtichStand.block, 1), "   ", "C  ", "BIW", 'C', new ItemStack(ItemIDs.electronicCircuit.item, 1), 'B', Blocks.iron_block, 'S', Items.stick, 'I', Items.iron_ingot, 'W', Blocks.planks);
        GameRegistry.addRecipe(new ItemStack(ItemIDs.paintbrushThing.item, 1), "GB ", "RIS", " ST", 'G', new ItemStack(Items.dye, 1, 2), 'B', new ItemStack(Items.dye, 1, 4), 'R', new ItemStack(Items.dye, 1, 1), 'I', new ItemStack(Items.iron_ingot), 'S', new ItemStack(Items.string), 'T', new ItemStack(Items.stick));



        /* Assembly tables */

        for (ItemStack ironingot : iron) {
            TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.assemblyTableI.block, 1), "IPI", "S S", "SPS", 'I', ironingot, 'P', Blocks.piston, 'S', Blocks.stone);
        }
        TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.assemblyTableII.block, 1), "GPG", "O O", "OPO", 'G', Items.gold_ingot, 'P', Blocks.piston, 'O', Blocks.obsidian);
        TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.assemblyTableIII.block, 1), "GPG", "DLD", "OPO", 'G', Items.gold_ingot, 'P', Blocks.piston, 'D', Items.diamond, 'L', Blocks.glowstone, 'O', Blocks.obsidian);

        /* Open Hearth Furnace */
        TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.openFurnaceIdle.block, 1), "#L#", "#B#", "#I#", '#', Blocks.nether_brick, 'L', Items.lava_bucket, 'B', Items.bucket, 'I', Blocks.iron_block);

        /* Lantern */
        for (ItemStack ironingot : iron) {
            TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.lantern.block, 4), "III", "PTP", "III", 'I', ironingot, 'P', Blocks.glass_pane, 'T', Blocks.torch);
        }
        /* Clothes */
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.overalls.item, 1), " # ", "X$X", "X X", 'X', new ItemStack(Items.dye, 1, 4), '$', Items.leather_leggings, '#', new ItemStack(Items.dye, 1, 1));
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.jacket.item, 1), "X X", "X$X", "X#X", 'X', new ItemStack(Items.dye, 1, 14), '$', Items.leather_chestplate, '#', Items.string);
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.hat.item, 1), " X ", "X$X", "#X#", 'X', new ItemStack(Items.dye, 1, 4), '$', Items.leather_helmet, '#', Items.string);

        /* Driver Clothes*/
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.pants_driver_paintable.item, 1), "XXX", "XLX", "X$X", 'L', Items.leather_leggings, '$', new ItemStack(Items.dye, 1, 4), 'X', Items.string);
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.jacket_driver_paintable.item, 1), "X X", "XRX", "XPX", 'X', new ItemStack(Items.dye, 1, 4), 'P', Items.leather_chestplate, 'R', new ItemStack(Items.dye, 1, 1));
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.hat_driver_paintable.item, 1), "#$#", "# #", '$', new ItemStack(Items.dye, 1, 4), '#', Items.string);

        /* Ticket Man Clothes */
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.pants_ticketMan_paintable.item, 1), "XXX", "XLX", "X$X", 'L', Items.leather_leggings, '$', new ItemStack(Items.dye, 1, 8), 'X', Items.string);
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.jacket_ticketMan_paintable.item, 1), "X X", "XPX", "X#X", 'P', Items.leather_chestplate, '#', new ItemStack(Items.dye, 1, 4), 'X', Items.string);
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.hat_ticketMan_paintable.item, 1), "#$#", "# #", '$', new ItemStack(Items.dye, 1, 0), '#', Items.string);


        for (ItemStack plastic : plastics) {
            /* Empty canister */
            TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.emptyCanister.item, 4), "PPP", "P P", "PPP", 'P', plastic);
            for (ItemStack rs : redstone) {
                /* Electronic circuit */
                TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.electronicCircuit.item, 1), "XXX", "RPR", "XXX", 'X', ItemIDs.copperWireFine.item, 'P', plastic, 'R', rs.getItem());
            }
            /* Composite Material*/
            TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.reinforcedPlastic.item, 16), "LPL", "PLP", "GPG", 'G', Blocks.glass_pane, 'P', ItemIDs.graphite.item, 'L', plastic);

            if (copper != null) {
                for (ItemStack copp : copper) {
                    TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.copperWireFine.item, 6), "XXX", "XPX", "XXX", 'X', copp, 'P', plastic);
                    GameRegistry.addRecipe(new ItemStack(BlockIDs.overheadWire.block, 16), "IC ", "I  ", "I  ", 'I', new ItemStack(Items.iron_ingot, 1), 'C', copp);
                    GameRegistry.addRecipe(new ItemStack(BlockIDs.overheadWireDouble.block, 16), "ICI", "ICI", "I I", 'I', new ItemStack(Items.iron_ingot, 1), 'C', copp);

                }
            }
        }

        /* Composite Suit */
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.boots_suit_paintable.item, 1), " D ", "X X", "XFX", 'F', Items.feather, 'D', Items.diamond, 'X', ItemIDs.reinforcedPlates.item);
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.pants_suit_paintable.item, 1), "XDX", "X$X", "X X", '$', Items.fire_charge, 'X', ItemIDs.reinforcedPlates.item, 'D', Items.diamond);
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.jacket_suit_paintable.item, 1), "X X", "XDX", "XAX", 'A', Items.golden_apple, 'X', ItemIDs.reinforcedPlates.item, 'D', Blocks.diamond_block);
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.helmet_suit_paintable.item, 1), "#D#", "# #", 'D', Blocks.diamond_block, '#', ItemIDs.reinforcedPlates.item);

        /* Trains parts */

        for (ItemStack ironingot : iron) {
            TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.generator.item, 1), " ##", "E$$", " ##", '#', ItemIDs.copperWireFine.item, 'E', ItemIDs.electronicCircuit.item, '$', ironingot);// generator
            TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.controls.item, 1), "#X#", "#E#", "$$$", '#', Blocks.lever, 'X', Blocks.stone_button, '$', ironingot, 'E', ItemIDs.electronicCircuit.item);// train controls
            TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.electmotor.item, 1), "I#I", "#E#", "I#I", '#', ItemIDs.copperWireFine.item, 'I', ironingot, 'E', ItemIDs.electronicCircuit.item);// Electric motor
            for (ItemStack bucketWater : waterbucket) {
                TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.ironBoiler.item, 2), "###", "XXX", "###", '#', ironingot, 'X', bucketWater.getItem());// iron Boiler
            }
            TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.ironFirebox.item, 2), "###", "#X#", "###", '#', ironingot, 'X', Items.flint_and_steel);// iron Firebox
            TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.ironChimney.item, 2), "# #", "# #", "# #", '#', ironingot);
        }
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.dieselengine.item, 2), "###", "XXX", "CCC", '#', ItemIDs.piston.item, 'X', ItemIDs.cylinder.item, 'C', ItemIDs.camshaft.item);// diesel engine
        for (ItemStack dustStack : dustCoal) {
            TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.graphite.item, 2), "###", "#X#", "###", '#', dustStack, 'X', Items.clay_ball);// Graphite
        }

        if (!ConfigHandler.MAKE_MODPACKS_GREAT_AGAIN) {
            for (ItemStack c : coal) {
                TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.coaldust.item, 4),
                        "###", "   ", "   ", '#', c.getItem());
                TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.coaldust.item, 4),
                        "   ", "###", "   ", '#', c.getItem());
                TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.coaldust.item, 4),
                        "   ", "   ", "###", '#', c.getItem());
            }
        }
        //TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.signal.item, 2),  "#", "X", "X", Character.valueOf('X'), ItemIDs.steel.item, Character.valueOf('#'), rs );
        /* diesel generator */
        TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.generatorDiesel.block, 1), "C  ", "DE ", 'C', ItemIDs.steelchimney.item, 'D', ItemIDs.dieselengine.item, 'E', ItemIDs.electronicCircuit.item);

        /* Zepplin parts and zeppelin item */
        if (ConfigHandler.ENABLE_ZEPPELIN) {
            TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.balloon.item, 1), "###", "# #", "###", '#', Blocks.wool);// Balloon
            TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.steamengine.item, 1), "C  ", "BF ", 'C', ItemIDs.steelchimney.item, 'B', ItemIDs.boiler.item, 'F', ItemIDs.firebox.item);// Small steam engine
            TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.airship.item, 1), "B B", "SES", "POP", 'B', ItemIDs.balloon.item, 'S', Items.stick, 'E', ItemIDs.steamengine.item, 'P', ItemIDs.propeller.item, 'O', Items.boat);
            TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.zeppelin.item, 1), "BBB", "SES", "POP", 'B', ItemIDs.balloon.item, 'S', ItemIDs.propeller.item, 'E', ItemIDs.controls.item, 'P', ItemIDs.electmotor.item, 'O', ItemIDs.seats.item);
        }

        for (ItemStack plankItem : planks) {
            for (ItemStack steelItem : steel) {

                TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.reinforcedPlates.item, 1), "RRR", "SSS", "CCC", 'R', ItemIDs.reinforcedPlastic.item, 'S', steelItem, 'C', Items.clay_ball);

                TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.composite_wrench.item, 1), "S S", " R ", " R ", 'R', ItemIDs.reinforcedPlastic.item, 'S', steelItem);
                TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.steelcab.item, 2), "###", "X X", "XXX", 'X', steelItem, '#', plankItem);// Steel cab
                TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.distilIdle.block, 1), "###", "#F#", "###", '#', steelItem, 'F', ItemIDs.firebox.item);
                for (ItemStack rs : redstone) {
                    TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.transformer.item, 1), "# #", "XEX", "###", '#', steelItem, 'E', ItemIDs.electronicCircuit.item, 'X', rs.getItem());// transformer
                }

                for (ItemStack bucketWater : waterbucket) {
                    TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.boiler.item, 2), "###", "XXX", "###", '#', steelItem, 'X', bucketWater.getItem());// Boiler
                }
                TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.firebox.item, 2), "###", "#X#", "###", '#', steelItem, 'X', Items.flint_and_steel);// Firebox
                for (ItemStack ironingot : iron) {
                    TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.bogie.item, 4), " # ", "#X#", " # ", '#', steelItem, 'X', ironingot);// Bogie
                    TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.steelframe.item, 2), "# #", "AAA", 'A', steelItem, '#', ironingot);// Steel Frame
                    TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.steelframe.item, 2), "   ", "# #", "AAA", 'A', steelItem, '#', ironingot);// Steel Frame

                    TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.stake.item, 1), "   ", "IFI", "   ", 'I', steelItem, 'F', ironingot);
                    TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.stake.item, 1), "IFI", "   ", "   ", 'I', steelItem, 'F', ironingot);
                    TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.stake.item, 1), "   ", "   ", "IFI", 'I', steelItem, 'F', ironingot);

                    TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.propeller.item, 2), " # ", "#X#", " # ", '#', plankItem, 'X', ironingot);// Propeller
                }
                TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.steelchimney.item, 2), "# #", "# #", "# #", '#', steelItem);// Bogie
                TrainCraftingManager.instance.addRecipe(new ItemStack(Items.flint_and_steel, 2), "* ", " #", '*', steelItem, '#', Items.flint);


                TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.transmition.item, 1), " # ", "#X#", " # ", '#', steelItem, 'X', ItemIDs.diesel.item);// transmition
                TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.piston.item, 3), " # ", " X ", '#', steelItem, 'X', Items.stick);// piston
                TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.camshaft.item, 3), "###", "   ", "   ", '#', steelItem);// camshaft
                TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.camshaft.item, 3), "   ", "###", "   ", '#', steelItem);// camshaft
                TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.camshaft.item, 3), "   ", "   ", "###", '#', steelItem);// camshaft
                TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.cylinder.item, 3), "# #", "# #", "###", '#', steelItem);// cylinder

            }

            for (ItemStack logStack : logs) {
                /* Water Wheel */
                TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.waterWheel.block, 1), " P ", "PGP", " P ", 'P', logStack, 'G', ItemIDs.generator.item);

                TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.woodenBogie.item, 4), " # ", "#X#", " # ", '#', plankItem, 'X', logStack);// wooden Bogie
            }
            TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.woodenFrame.item, 2), "# #", "AAA", 'A', plankItem, '#', plankItem);// wooden Frame
            TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.woodenFrame.item, 2), "   ", "# #", "AAA", 'A', plankItem, '#', plankItem);// wooden Frame
            TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.woodenCab.item, 2), "###", "X X", "XXX", 'X', plankItem, '#', plankItem);// wooden cab

            for (ItemStack ironingot : iron) {
                TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.seats.item, 1), "#  ", "## ", "XXX", '#', plankItem, 'X', ironingot);// transformer
                TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.ironBogie.item, 4), " # ", "#X#", " # ", '#', ironingot, 'X', plankItem);// iron Bogie
                TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.ironFrame.item, 2), "# #", "AAA", 'A', ironingot, '#', plankItem);// iron Frame
                TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.ironFrame.item, 2), "   ", "# #", "AAA", 'A', ironingot, '#', plankItem);// iron Frame
                TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.ironCab.item, 2), "###", "X X", "XXX", 'X', ironingot, '#', plankItem);// iron cab
                TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.stopper.block, 1), "WWW", "I I", "RRR", 'W', plankItem, 'R', Blocks.rail, 'I', ironingot);// stopper
                TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.switchStand.block, 1), " W ", " I ", " R ", 'W', Blocks.lever, 'R', Items.stick, 'I', ironingot);//switchstand
                TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.MFPBWigWag.block, 1), "IWI", " I ", " I ", 'W', Blocks.lever, 'I', ironingot);//wigwag
            }
            // Short Wood Slope
            TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailSlopeWood.item, 1),
                    " MW", "MWW", "WWW", 'M', ItemIDs.tcRailMediumStraight.item, 'W', plankItem);
        }
        /* Wind mill */
        for (ItemStack ironingot : iron) {
            TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.windMill.block, 1), " R ", " G ", "B B", 'G', ItemIDs.generator.item, 'B', ironingot, 'R', ItemIDs.propeller.item);

            if (Loader.isModLoaded("ComputerCraft")) {
                TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.mtcTransmitterSpeed.block, 1), "SRS", "RTR", "SRS", 'S', ironingot, 'R', Items.redstone, 'T', Blocks.stone_pressure_plate);
                TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.mtcReceiverMTC.block, 1), "STS", " R ", "SPS", 'S', ironingot, 'R', Items.redstone, 'P', Items.repeater, 'T', new ItemStack(Blocks.torch, 1));
                TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.mtcTransmitterMTC.block, 1), "SPS", " R ", "STS", 'S', ironingot, 'R', Items.redstone, 'P', Items.repeater, 'T', new ItemStack(Blocks.torch, 1));
                TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.mtcReceiverDestination.block, 1), "SRS", "RTR", "SRS", 'S', ironingot, 'R', Items.redstone, 'T', Items.sign);
                TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.mtcATOStopTransmitter.block, 1), " S ", "RTS", " R ", 'S', ironingot, 'R', Items.redstone, 'T', ItemIDs.electronicCircuit.item);
            }
        }

        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailSmallRoadCrossing.item, 1), "   ", "SRS", "   ", 'S', new ItemStack(Blocks.stained_hardened_clay, 1, 15), 'R', Item.getItemFromBlock(Blocks.rail));
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailSmallRoadCrossing1.item, 1), "   ", "SRS", "   ", 'S', new ItemStack(Blocks.stained_hardened_clay, 1, 7), 'R', Item.getItemFromBlock(Blocks.rail));
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailSmallRoadCrossing2.item, 1), "   ", "SRS", "   ", 'S', new ItemStack(Blocks.stained_hardened_clay, 1, 3), 'R', Item.getItemFromBlock(Blocks.rail));
        TrainCraftingManager.instance.addRecipe(new ItemStack(Item.getItemFromBlock(Blocks.rail), 1), "   ", " R ", "   ", 'R', ItemIDs.tcRailSmallStraight.item);
        TrainCraftingManager.instance.addRecipe(new ItemStack(Item.getItemFromBlock(Blocks.rail), 1), "   ", " R ", "   ", 'R', ItemIDs.tcRailSmallRoadCrossing.item);
        TrainCraftingManager.instance.addRecipe(new ItemStack(Item.getItemFromBlock(Blocks.rail), 1), "   ", " R ", "   ", 'R', ItemIDs.tcRailSmallRoadCrossing1.item);
        TrainCraftingManager.instance.addRecipe(new ItemStack(Item.getItemFromBlock(Blocks.rail), 1), "   ", " R ", "   ", 'R', ItemIDs.tcRailSmallRoadCrossing2.item);

        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailSlopeWood.item, 1), " TP", "TPP", "PPP", 'T', ItemIDs.tcRailMediumStraight.item, 'P', Blocks.planks);
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailLargeSlopeWood.item, 1), "   ", "  T", " T ", 'T', ItemIDs.tcRailSlopeWood.item);
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailVeryLargeSlopeWood.item, 1), "  T", " T ", "T  ", 'T', ItemIDs.tcRailSlopeWood.item);

        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailSlopeSnowGravel.item, 1), " TS", "TSS", "SSS", 'T', ItemIDs.tcRailMediumStraight.item, 'S', new ItemStack(BlockIDs.snowGravel.block, 1, 4));
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailLargeSlopeSnowGravel.item, 1), "   ", "  T", " T ", 'T', ItemIDs.tcRailSlopeSnowGravel.item);
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailVeryLargeSlopeSnowGravel.item, 1), "  T", " T ", "T  ", 'T', ItemIDs.tcRailSlopeSnowGravel.item);

        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailSlopeGravel.item, 1), " TG", "TGG", "GGG", 'T', ItemIDs.tcRailMediumStraight.item, 'G', Blocks.gravel);
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailLargeSlopeGravel.item, 1), "   ", "  S", " S ", 'S', ItemIDs.tcRailSlopeGravel.item);
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailVeryLargeSlopeGravel.item, 1), "  T", " T ", "T  ", 'T', ItemIDs.tcRailSlopeGravel.item);

        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailSlopeBallast.item, 1), " TG", "TGG", "GGG", 'T', ItemIDs.tcRailMediumStraight.item, 'G', new ItemStack(BlockIDs.oreTC.block, 1, 3));
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailLargeSlopeBallast.item, 1), "   ", "  S", " S ", 'S', ItemIDs.tcRailSlopeBallast.item);
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailVeryLargeSlopeBallast.item, 1), "  T", " T ", "T  ", 'T', ItemIDs.tcRailSlopeBallast.item);

        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailSmallStraight.item, 16), "G G", "BPB", "G G", 'G', Items.iron_ingot, 'P', Blocks.planks, 'B', ItemIDs.bolt.item);
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailMediumStraight.item, 1), "S  ", "S  ", "S  ", 'S', ItemIDs.tcRailSmallStraight.item);
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailLongStraight.item, 1), "M  ", "M  ", "   ", 'M', ItemIDs.tcRailMediumStraight.item);
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailVeryLongStraight.item, 1), "L  ", "L  ", "   ", 'L', ItemIDs.tcRailLongStraight.item);

        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailSmallDiagonalStraight.item, 1), " G ", "G  ", "   ", 'G', ItemIDs.tcRailSmallStraight.item);
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailMediumDiagonalStraight.item, 1), "  G", " G ", "G  ", 'G', ItemIDs.tcRailSmallDiagonalStraight.item);
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailLongDiagonalStraight.item, 1), " G ", "G  ", "   ", 'G', ItemIDs.tcRailMediumDiagonalStraight.item);
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailVeryLongDiagonalStraight.item, 1), " G ", "G  ", "   ", 'G', ItemIDs.tcRailLongDiagonalStraight.item);

        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailMediumTurn.item, 1), "SS ", "S  ", 'S', ItemIDs.tcRailSmallStraight.item);
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailLargeTurn.item, 1), " SS", "SS ", "S  ", 'S', ItemIDs.tcRailSmallStraight.item);
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailVeryLargeTurn.item, 1), "MM ", "M  ", "   ", 'M', ItemIDs.tcRailMediumTurn.item);
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailSuperLargeTurn.item, 1), "VV ", "V  ", "   ", 'V', ItemIDs.tcRailVeryLargeTurn.item);

        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailSmallParallelCurve.item, 1), " S ", "SS ", "S  ", 'S', ItemIDs.tcRailSmallStraight.item);
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailMediumParallelCurve.item, 1), " S ", "S  ", "   ", 'S', ItemIDs.tcRailSmallParallelCurve.item);
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailLargeParallelCurve.item, 1), " S ", "S  ", "   ", 'S', ItemIDs.tcRailMediumParallelCurve.item);

        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailMediumSwitch.item, 1), "S  ", "SRS", "S  ", 'S', ItemIDs.tcRailSmallStraight.item, 'R', ItemIDs.tcRailMediumTurn.item);
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailLargeSwitch.item, 1), "S  ", "MRS", "S  ", 'S', ItemIDs.tcRailSmallStraight.item, 'M', ItemIDs.tcRailMediumStraight.item, 'R', ItemIDs.tcRailLargeTurn.item);
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailMediumParallelSwitch.item, 1), "M S", "MRR", "MR ", 'S', ItemIDs.tcRailSmallStraight.item, 'M', ItemIDs.tcRailMediumStraight.item, 'R', ItemIDs.tcRailMediumTurn.item);
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailTwoWaysCrossing.item, 1), " S ", "SSS", " S ", 'S', ItemIDs.tcRailSmallStraight.item);

        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailMedium45DegreeSwitch.item, 1), "S D", "ST ", "S  ", 'S', ItemIDs.tcRailSmallStraight.item, 'D', ItemIDs.tcRailSmallDiagonalStraight.item, 'T', ItemIDs.tcRailMedium45DegreeTurn.item);

        // Embedded Versions
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedSmallStraight.item, 16), "I I", "B B", "I I", 'I', Items.iron_ingot, 'B', ItemIDs.bolt.item);
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedMediumStraight.item, 1), "S  ", "S  ", "S  ", 'S', ItemIDs.tcRailEmbeddedSmallStraight.item);
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedLongStraight.item, 1), "M  ", "M ", "  ", 'M', ItemIDs.tcRailEmbeddedMediumStraight.item);
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedVeryLongStraight.item, 1), "L  ", "L  ", "   ", 'L', ItemIDs.tcRailEmbeddedLongStraight.item);

        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedSmallDiagonalStraight.item, 1), " G ", "G  ", "   ", 'G', ItemIDs.tcRailEmbeddedSmallStraight.item);
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedMediumDiagonalStraight.item, 1), "  G", " G ", "G  ", 'G', ItemIDs.tcRailEmbeddedSmallDiagonalStraight.item);
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedLongDiagonalStraight.item, 1), " G ", "G  ", "   ", 'G', ItemIDs.tcRailEmbeddedMediumDiagonalStraight.item);
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedVeryLongDiagonalStraight.item, 1), " G ", "G  ", "   ", 'G', ItemIDs.tcRailEmbeddedLongDiagonalStraight.item);

        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedMediumTurn.item, 1), "SS ", "S  ", 'S', ItemIDs.tcRailEmbeddedSmallStraight.item);
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedLargeTurn.item, 1), " SS", "SS ", "S  ", 'S', ItemIDs.tcRailEmbeddedSmallStraight.item);
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedVeryLargeTurn.item, 1), "MM ", "M  ", "   ", 'M', ItemIDs.tcRailEmbeddedMediumTurn.item);
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedSuperLargeTurn.item, 1), "VV ", "V  ", "   ", 'V', ItemIDs.tcRailEmbeddedVeryLargeTurn.item);

        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedSmallParallelCurve.item, 1), " S ", "SS ", "S  ", 'S', ItemIDs.tcRailEmbeddedSmallStraight.item);
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedMediumParallelCurve.item, 1), " S ", "SS ", "S  ", 'S', ItemIDs.tcRailEmbeddedSmallParallelCurve.item);
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedLargeParallelCurve.item, 1), " S ", "SS ", "S  ", 'S', ItemIDs.tcRailEmbeddedMediumParallelCurve.item);

        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedTwoWaysCrossing.item, 1), " S ", "SSS", " S ", 'S', ItemIDs.tcRailEmbeddedSmallStraight.item);
        TrainCraftingManager.instance.addRecipe(new ItemStack(ItemIDs.tcRailEmbeddedMedium45DegreeSwitch.item, 1), "S D", "ST ", "S  ", 'S', ItemIDs.tcRailEmbeddedSmallStraight.item, 'D', ItemIDs.tcRailEmbeddedSmallDiagonalStraight.item, 'T', ItemIDs.tcRailEmbeddedMedium45DegreeTurn.item);
        // Bridge Pillar
        TrainCraftingManager.instance.addRecipe(new ItemStack(BlockIDs.bridgePillar.block, 8),
                "SSS", "SLS", "SSS", 'S', Items.stick, 'L', Blocks.log);
    }

    public static void initSmeltingRecipes() {

        /* OpenHearthFurnace recipes */
        if (!ConfigHandler.MAKE_MODPACKS_GREAT_AGAIN) {
            ArrayList<ItemStack> steel = OreDictionary.getOres("ingotSteel");
            ArrayList<ItemStack> iron = OreDictionary.getOres("ingotIron");
            for (ItemStack s : steel) {
                for (ItemStack ironitm : iron) {
                    TrainCraftingManager.instance.addHearthFurnaceRecipe(ironitm,
                            new ItemStack(ItemIDs.graphite.item), s, 2F, 1000);
                }
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
