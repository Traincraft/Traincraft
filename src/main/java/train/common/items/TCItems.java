/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.items;

import cpw.mods.fml.common.registry.GameRegistry;
import train.common.Traincraft;
import train.common.adminbook.ItemAdminBook;
import train.common.library.Info;
import train.common.library.ItemIDs;

public class TCItems {

	public static void init() {
		loadItems();
		registerItems();
	}

	private static void loadItems() {
		for (ItemIDs items : ItemIDs.values()) {
			if (items.className != null) {
				if (items.className.equals("ItemTrain")) {
					items.item = new ItemPart(items.iconName);
				}
				else if (items.className.equals("ItemRollingStock")) {
					items.item = new ItemRollingStock(items.iconName);
				}
				else if (items.className.equals("ItemRotativeDigger")) {
					items.item = new ItemRotativeDigger();
				}
				else if (items.className.equals("ItemContainer")) {
					items.item = new ItemContainer(items.iconName);
				}
			}
		}
		//ItemIDs.signal.item = new ItemSignal(ItemIDs.signal.itemID, BlockIDs.activeSignal.block).setIconIndex(ItemIDs.signal.iconIndex);
		ItemIDs.chunkLoaderActivator.item = new ItemChunkLoaderActivator();
		ItemIDs.recipeBook.item = new ItemRecipeBook();
		ItemIDs.adminBook.item = new ItemAdminBook();
		
		ItemIDs.stake.item = new ItemStacked(200);
		ItemIDs.airship.item = new ItemZeppelins(0);
		ItemIDs.zeppelin.item = new ItemZeppelins(1);
		ItemIDs.overalls.item = new ItemTCArmor(ItemIDs.overalls.iconName, Traincraft.instance.armor, Traincraft.trainArmor, 2,0);
		ItemIDs.jacket.item = new ItemTCArmor(ItemIDs.jacket.iconName, Traincraft.instance.armor, Traincraft.trainArmor, 1,0);
		ItemIDs.hat.item = new ItemTCArmor(ItemIDs.hat.iconName, Traincraft.instance.armor, Traincraft.trainArmor, 0,0);

		/*Paintable armors:*/
		ItemIDs.pants_ticketMan_paintable.item = new ItemTCArmor(ItemIDs.pants_ticketMan_paintable.iconName, Traincraft.instance.armorCloth, Traincraft.trainCloth, 2,0xdedede);
		ItemIDs.jacket_ticketMan_paintable.item = new ItemTCArmor(ItemIDs.jacket_ticketMan_paintable.iconName, Traincraft.instance.armorCloth, Traincraft.trainCloth, 1,0x002cdb);
		ItemIDs.hat_ticketMan_paintable.item = new ItemTCArmor(ItemIDs.hat_ticketMan_paintable.iconName, Traincraft.instance.armorCloth, Traincraft.trainCloth, 0,0x9fafb5);
		
		ItemIDs.pants_driver_paintable.item = new ItemTCArmor(ItemIDs.pants_driver_paintable.iconName, Traincraft.instance.armorCloth, Traincraft.trainCloth, 2,0x1535d4);
		ItemIDs.jacket_driver_paintable.item = new ItemTCArmor(ItemIDs.jacket_driver_paintable.iconName, Traincraft.instance.armorCloth, Traincraft.trainCloth, 1,0x1469d9);
		ItemIDs.hat_driver_paintable.item = new ItemTCArmor(ItemIDs.hat_driver_paintable.iconName, Traincraft.instance.armorCloth, Traincraft.trainCloth, 0,0x1469d9);
	
		ItemIDs.boots_suit_paintable.item = new ItemTCCompositeSuit(ItemIDs.boots_suit_paintable.iconName, Traincraft.instance.armorCompositeSuit, Traincraft.trainCompositeSuit, 3,0x1535d4);
		ItemIDs.pants_suit_paintable.item = new ItemTCCompositeSuit(ItemIDs.pants_suit_paintable.iconName, Traincraft.instance.armorCompositeSuit, Traincraft.trainCompositeSuit, 2,0x1535d4);
		ItemIDs.jacket_suit_paintable.item = new ItemTCCompositeSuit(ItemIDs.jacket_suit_paintable.iconName, Traincraft.instance.armorCompositeSuit, Traincraft.trainCompositeSuit, 1,0x1469d9);
		ItemIDs.helmet_suit_paintable.item = new ItemTCCompositeSuit(ItemIDs.helmet_suit_paintable.iconName, Traincraft.instance.armorCompositeSuit, Traincraft.trainCompositeSuit, 0,0x1469d9);
		
		ItemIDs.composite_wrench.item = new ItemWrench();

		/*Normal Straights*/
		ItemIDs.tcRailSmallStraight.item = new ItemTCRail(ItemTCRail.TrackTypes.SMALL_STRAIGHT);
		ItemIDs.tcRailMediumStraight.item = new ItemTCRail(ItemTCRail.TrackTypes.MEDIUM_STRAIGHT);
		ItemIDs.tcRailLongStraight.item = new ItemTCRail(ItemTCRail.TrackTypes.LONG_STRAIGHT);
		ItemIDs.tcRailVeryLongStraight.item = new ItemTCRail(ItemTCRail.TrackTypes.VERY_LONG_STRAIGHT);

		/*Embedded Straights*/
		ItemIDs.tcRailEmbeddedSmallStraight.item = new ItemTCRail(ItemTCRail.TrackTypes.EMBEDDED_SMALL_STRAIGHT);
		ItemIDs.tcRailEmbeddedMediumStraight.item = new ItemTCRail(ItemTCRail.TrackTypes.EMBEDDED_MEDIUM_STRAIGHT);
		ItemIDs.tcRailEmbeddedLongStraight.item = new ItemTCRail(ItemTCRail.TrackTypes.EMBEDDED_LONG_STRAIGHT);
		ItemIDs.tcRailEmbeddedVeryLongStraight.item = new ItemTCRail(ItemTCRail.TrackTypes.EMBEDDED_VERY_LONG_STRAIGHT);

		/*Normal Diagonal Tracks*/
		ItemIDs.tcRailSmallDiagonalStraight.item = new ItemTCRail(ItemTCRail.TrackTypes.SMALL_DIAGONAL_STRAIGHT);
		ItemIDs.tcRailMediumDiagonalStraight.item = new ItemTCRail(ItemTCRail.TrackTypes.MEDIUM_DIAGONAL_STRAIGHT);
		ItemIDs.tcRailLongDiagonalStraight.item = new ItemTCRail(ItemTCRail.TrackTypes.LONG_DIAGONAL_STRAIGHT);
		ItemIDs.tcRailVeryLongDiagonalStraight.item = new ItemTCRail(ItemTCRail.TrackTypes.VERY_LONG_DIAGONAL_STRAIGHT);


		/*Embedded Diagonal Tracks*/
		ItemIDs.tcRailEmbeddedSmallDiagonalStraight.item = new ItemTCRail(ItemTCRail.TrackTypes.EMBEDDED_SMALL_DIAGONAL_STRAIGHT);
		ItemIDs.tcRailEmbeddedMediumDiagonalStraight.item = new ItemTCRail(ItemTCRail.TrackTypes.EMBEDDED_MEDIUM_DIAGONAL_STRAIGHT);
		ItemIDs.tcRailEmbeddedLongDiagonalStraight.item = new ItemTCRail(ItemTCRail.TrackTypes.EMBEDDED_LONG_DIAGONAL_STRAIGHT);
		ItemIDs.tcRailEmbeddedVeryLongDiagonalStraight.item = new ItemTCRail(ItemTCRail.TrackTypes.EMBEDDED_VERY_LONG_DIAGONAL_STRAIGHT);

		/*Normal 45Degree Turns*/
		ItemIDs.tcRailMedium45DegreeTurn.item = new ItemTCRail(ItemTCRail.TrackTypes.MEDIUM_45DEGREE_TURN);
		ItemIDs.tcRailLarge45DegreeTurn.item = new ItemTCRail(ItemTCRail.TrackTypes.LARGE_45DEGREE_TURN);
		ItemIDs.tcRailVeryLarge45DegreeTurn.item = new ItemTCRail(ItemTCRail.TrackTypes.VERY_LARGE_45DEGREE_TURN);
		ItemIDs.tcRailSuperLarge45DegreeTurn.item = new ItemTCRail(ItemTCRail.TrackTypes.SUPER_LARGE_45DEGREE_TURN);

		/*Embedded 45Degree Turns*/
		ItemIDs.tcRailEmbeddedMedium45DegreeTurn.item = new ItemTCRail(ItemTCRail.TrackTypes.EMBEDDED_MEDIUM_45DEGREE_TURN);
		ItemIDs.tcRailEmbeddedLarge45DegreeTurn.item = new ItemTCRail(ItemTCRail.TrackTypes.EMBEDDED_LARGE_45DEGREE_TURN);
		ItemIDs.tcRailEmbeddedVeryLarge45DegreeTurn.item = new ItemTCRail(ItemTCRail.TrackTypes.EMBEDDED_VERY_LARGE_45DEGREE_TURN);
		ItemIDs.tcRailEmbeddedSuperLarge45DegreeTurn.item = new ItemTCRail(ItemTCRail.TrackTypes.EMBEDDED_SUPER_LARGE_45DEGREE_TURN);

		/* Normal Parallel Curves*/
		ItemIDs.tcRailSmallParallelCurve.item = new ItemTCRail(ItemTCRail.TrackTypes.SMALL_PARALLEL_CURVE);
		ItemIDs.tcRailMediumParallelCurve.item = new ItemTCRail(ItemTCRail.TrackTypes.MEDIUM_PARALLEL_CURVE);
		ItemIDs.tcRailLargeParallelCurve.item = new ItemTCRail(ItemTCRail.TrackTypes.LARGE_PARALLEL_CURVE);

		/* Embedded Parallel Curves*/
		ItemIDs.tcRailEmbeddedSmallParallelCurve.item = new ItemTCRail(ItemTCRail.TrackTypes.EMBEDDED_SMALL_PARALLEL_CURVE);
		ItemIDs.tcRailEmbeddedMediumParallelCurve.item = new ItemTCRail(ItemTCRail.TrackTypes.EMBEDDED_MEDIUM_PARALLEL_CURVE);
		ItemIDs.tcRailEmbeddedLargeParallelCurve.item = new ItemTCRail(ItemTCRail.TrackTypes.EMBEDDED_LARGE_PARALLEL_CURVE);

		/* Normal Turns*/
		ItemIDs.tcRailMediumTurn.item = new ItemTCRail(ItemTCRail.TrackTypes.MEDIUM_TURN);
		ItemIDs.tcRailLargeTurn.item = new ItemTCRail(ItemTCRail.TrackTypes.LARGE_TURN);
		ItemIDs.tcRailVeryLargeTurn.item = new ItemTCRail(ItemTCRail.TrackTypes.VERY_LARGE_TURN);
		ItemIDs.tcRailSuperLargeTurn.item = new ItemTCRail(ItemTCRail.TrackTypes.SUPER_LARGE_TURN);

		/* Embedded Turns */
		ItemIDs.tcRailEmbeddedMediumTurn.item = new ItemTCRail(ItemTCRail.TrackTypes.EMBEDDED_MEDIUM_TURN);
		ItemIDs.tcRailEmbeddedLargeTurn.item = new ItemTCRail(ItemTCRail.TrackTypes.EMBEDDED_LARGE_TURN);
		ItemIDs.tcRailEmbeddedVeryLargeTurn.item = new ItemTCRail(ItemTCRail.TrackTypes.EMBEDDED_VERY_LARGE_TURN);
		ItemIDs.tcRailEmbeddedSuperLargeTurn.item = new ItemTCRail(ItemTCRail.TrackTypes.EMBEDDED_SUPER_LARGE_TURN);

		/* Normal Crossings*/
		ItemIDs.tcRailSmallRoadCrossing.item = new ItemTCRail(ItemTCRail.TrackTypes.SMALL_ROAD_CROSSING);
		ItemIDs.tcRailSmallRoadCrossing1.item = new ItemTCRail(ItemTCRail.TrackTypes.SMALL_ROAD_CROSSING_1);
		ItemIDs.tcRailSmallRoadCrossing2.item = new ItemTCRail(ItemTCRail.TrackTypes.SMALL_ROAD_CROSSING_2);

		/* 2 way crossings*/
		ItemIDs.tcRailTwoWaysCrossing.item = new ItemTCRail(ItemTCRail.TrackTypes.TWO_WAYS_CROSSING);
		ItemIDs.tcRailEmbeddedTwoWaysCrossing.item = new ItemTCRail(ItemTCRail.TrackTypes.EMBEDDED_TWO_WAYS_CROSSING);

		/* Normal Switches*/
		ItemIDs.tcRailMediumSwitch.item = new ItemTCRail(ItemTCRail.TrackTypes.MEDIUM_SWITCH);
		ItemIDs.tcRailLargeSwitch.item = new ItemTCRail(ItemTCRail.TrackTypes.LARGE_SWITCH);
		ItemIDs.tcRailMediumParallelSwitch.item = new ItemTCRail(ItemTCRail.TrackTypes.MEDIUM_PARALLEL_SWITCH);
		ItemIDs.tcRailMedium45DegreeSwitch.item = new ItemTCRail(ItemTCRail.TrackTypes.MEDIUM_45DEGREE_SWITCH);

		/* Embedded Switches*/
		ItemIDs.tcRailEmbeddedMediumSwitch.item = new ItemTCRail(ItemTCRail.TrackTypes.EMBEDDED_MEDIUM_SWITCH);
		ItemIDs.tcRailEmbeddedLargeSwitch.item = new ItemTCRail(ItemTCRail.TrackTypes.EMBEDDED_LARGE_SWITCH);
		ItemIDs.tcRailEmbeddedMediumParallelSwitch.item = new ItemTCRail(ItemTCRail.TrackTypes.EMBEDDED_MEDIUM_PARALLEL_SWITCH);
		ItemIDs.tcRailEmbeddedMedium45DegreeSwitch.item = new ItemTCRail(ItemTCRail.TrackTypes.EMBEDDED_MEDIUM_45DEGREE_SWITCH);

		/* Normal Slopes*/
		ItemIDs.tcRailSlopeWood.item = new ItemTCRail(ItemTCRail.TrackTypes.SLOPE_WOOD);
		ItemIDs.tcRailSlopeGravel.item = new ItemTCRail(ItemTCRail.TrackTypes.SLOPE_GRAVEL);
		ItemIDs.tcRailSlopeBallast.item = new ItemTCRail(ItemTCRail.TrackTypes.SLOPE_BALLAST);
		ItemIDs.tcRailSlopeSnowGravel.item = new ItemTCRail(ItemTCRail.TrackTypes.SLOPE_SNOW_GRAVEL);
		ItemIDs.tcRailSlopeDynamic.item = new ItemTCRail(ItemTCRail.TrackTypes.SLOPE_DYNAMIC);
		ItemIDs.tcRailLargeSlopeWood.item = new ItemTCRail(ItemTCRail.TrackTypes.LARGE_SLOPE_WOOD);
		ItemIDs.tcRailLargeSlopeGravel.item = new ItemTCRail(ItemTCRail.TrackTypes.LARGE_SLOPE_GRAVEL);
		ItemIDs.tcRailLargeSlopeBallast.item = new ItemTCRail(ItemTCRail.TrackTypes.LARGE_SLOPE_BALLAST);
		ItemIDs.tcRailLargeSlopeSnowGravel.item = new ItemTCRail(ItemTCRail.TrackTypes.LARGE_SLOPE_SNOW_GRAVEL);
		ItemIDs.tcRailLargeSlopeDynamic.item = new ItemTCRail(ItemTCRail.TrackTypes.LARGE_SLOPE_DYNAMIC);
		ItemIDs.tcRailVeryLargeSlopeWood.item = new ItemTCRail(ItemTCRail.TrackTypes.VERY_LARGE_SLOPE_WOOD);
		ItemIDs.tcRailVeryLargeSlopeGravel.item = new ItemTCRail(ItemTCRail.TrackTypes.VERY_LARGE_SLOPE_GRAVEL);
		ItemIDs.tcRailVeryLargeSlopeBallast.item = new ItemTCRail(ItemTCRail.TrackTypes.VERY_LARGE_SLOPE_BALLAST);
		ItemIDs.tcRailVeryLargeSlopeSnowGravel.item = new ItemTCRail(ItemTCRail.TrackTypes.VERY_LARGE_SLOPE_SNOW_GRAVEL);
		ItemIDs.tcRailVeryLargeSlopeDynamic.item = new ItemTCRail(ItemTCRail.TrackTypes.VERY_LARGE_SLOPE_DYNAMIC);

		/* Embedded Slopes*/
		ItemIDs.tcRailEmbeddedSlopeDynamic.item = new ItemTCRail(ItemTCRail.TrackTypes.EMBEDDED_SLOPE_DYNAMIC);
		ItemIDs.tcRailEmbeddedLargeSlopeDynamic.item = new ItemTCRail(ItemTCRail.TrackTypes.EMBEDDED_LARGE_SLOPE_DYNAMIC);
		ItemIDs.tcRailEmbeddedVeryLargeSlopeDynamic.item = new ItemTCRail(ItemTCRail.TrackTypes.EMBEDDED_VERY_LARGE_SLOPE_DYNAMIC);

		/* Curved Slopes*/
		ItemIDs.tcRailLargeCurvedSlopeDynamic.item = new ItemTCRail(ItemTCRail.TrackTypes.LARGE_CURVED_SLOPE_DYNAMIC);

		ItemIDs.paintbrushThing.item = new ItemPaintbrushThing();
		ItemIDs.whistle.item = new ItemWhistle();
		ItemIDs.bolt.item = new ItemBolt(); //this is the spike for crafting
	}
	
	private static void registerItems() {
		for (ItemIDs items : ItemIDs.values()) {
			if (items.item != null) {
				items.item.setUnlocalizedName(Info.modID + ":" + items.name());
				GameRegistry.registerItem(items.item, items.name());
			}
		}
	}
}
