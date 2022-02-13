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
		
		/**Paintable armors:*/
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
		
		/**Normal Straights*/
		ItemIDs.tcRailSmallStraight.item = new ItemTCRail(ItemTCRail.TrackTypes.SMALL_STRAIGHT);
		ItemIDs.tcRailMediumStraight.item = new ItemTCRail(ItemTCRail.TrackTypes.MEDIUM_STRAIGHT);
		ItemIDs.tcRailLongStraight.item = new ItemTCRail(ItemTCRail.TrackTypes.LONG_STRAIGHT);
		ItemIDs.tcRailVeryLongStraight.item = new ItemTCRail(ItemTCRail.TrackTypes.VERY_LONG_STRAIGHT);

		/**Embedded Straights*/

		ItemIDs.tcRailEmbeddedSmallStraight.item = new ItemTCRail(ItemTCRail.TrackTypes.EMBEDDED_SMALL_STRAIGHT);
		ItemIDs.tcRailEmbeddedMediumStraight.item = new ItemTCRail(ItemTCRail.TrackTypes.EMBEDDED_MEDIUM_STRAIGHT);
		ItemIDs.tcRailEmbeddedLongStraight.item = new ItemTCRail(ItemTCRail.TrackTypes.EMBEDDED_LONG_STRAIGHT);
		ItemIDs.tcRailEmbeddedVeryLongStraight.item = new ItemTCRail(ItemTCRail.TrackTypes.EMBEDDED_VERY_LONG_STRAIGHT);

		/**Normal 45Degree Turns*/

		ItemIDs.tcRailMedium45DegreeTurn.item = new ItemTCRail(ItemTCRail.TrackTypes.MEDIUM_45DEGREE_TURN);

		/**Embedded 45Degree Turns*/

		ItemIDs.tcRailEmbeddedMedium45DegreeTurn.item = new ItemTCRail(ItemTCRail.TrackTypes.EMBEDDED_MEDIUM_45DEGREE_TURN);

		/**Normal Turns*/
		ItemIDs.tcRailMediumTurn.item = new ItemTCRail(ItemTCRail.TrackTypes.MEDIUM_TURN);
		ItemIDs.tcRailLargeTurn.item = new ItemTCRail(ItemTCRail.TrackTypes.LARGE_TURN);
		ItemIDs.tcRailVeryLargeTurn.item = new ItemTCRail(ItemTCRail.TrackTypes.VERY_LARGE_TURN);
		ItemIDs.tcRailSuperLargeTurn.item = new ItemTCRail(ItemTCRail.TrackTypes.SUPER_LARGE_TURN);

		/**Embedded Turns */
		ItemIDs.tcRailEmbeddedMediumTurn.item = new ItemTCRail(ItemTCRail.TrackTypes.EMBEDDED_MEDIUM_TURN);
		ItemIDs.tcRailEmbeddedLargeTurn.item = new ItemTCRail(ItemTCRail.TrackTypes.EMBEDDED_LARGE_TURN);
		ItemIDs.tcRailEmbeddedVeryLargeTurn.item = new ItemTCRail(ItemTCRail.TrackTypes.EMBEDDED_VERY_LARGE_TURN);
		ItemIDs.tcRailEmbeddedSuperLargeTurn.item = new ItemTCRail(ItemTCRail.TrackTypes.EMBEDDED_SUPER_LARGE_TURN);

		/**Normal Crossings*/
		ItemIDs.tcRailSmallRoadCrossing.item = new ItemTCRail(ItemTCRail.TrackTypes.SMALL_ROAD_CROSSING);
		ItemIDs.tcRailSmallRoadCrossing1.item = new ItemTCRail(ItemTCRail.TrackTypes.SMALL_ROAD_CROSSING_1);
		ItemIDs.tcRailSmallRoadCrossing2.item = new ItemTCRail(ItemTCRail.TrackTypes.SMALL_ROAD_CROSSING_2);

		/** 2 way crossings*/
		ItemIDs.tcRailTwoWaysCrossing.item = new ItemTCRail(ItemTCRail.TrackTypes.TWO_WAYS_CROSSING);
		ItemIDs.tcRailEmbeddedTwoWaysCrossing.item = new ItemTCRail(ItemTCRail.TrackTypes.EMBEDDED_TWO_WAYS_CROSSING);

		/**Normal Switches*/
		ItemIDs.tcRailMediumSwitch.item = new ItemTCRail(ItemTCRail.TrackTypes.MEDIUM_SWITCH);
		ItemIDs.tcRailLargeSwitch.item = new ItemTCRail(ItemTCRail.TrackTypes.LARGE_SWITCH);
		ItemIDs.tcRailMediumParallelSwitch.item = new ItemTCRail(ItemTCRail.TrackTypes.MEDIUM_PARALLEL_SWITCH);


		/**Embedded Switches*/
		ItemIDs.tcRailEmbeddedMediumParallelSwitch.item = new ItemTCRail(ItemTCRail.TrackTypes.EMBEDDED_MEDIUM_PARALLEL_SWITCH);

		/**Normal Slopes*/
		ItemIDs.tcRailSlopeWood.item = new ItemTCRail(ItemTCRail.TrackTypes.SLOPE_WOOD);
		ItemIDs.tcRailSlopeGravel.item = new ItemTCRail(ItemTCRail.TrackTypes.SLOPE_GRAVEL);
		ItemIDs.tcRailSlopeBallast.item = new ItemTCRail(ItemTCRail.TrackTypes.SLOPE_BALLAST);
		ItemIDs.tcRailLargeSlopeWood.item = new ItemTCRail(ItemTCRail.TrackTypes.LARGE_SLOPE_WOOD);
		ItemIDs.tcRailLargeSlopeGravel.item = new ItemTCRail(ItemTCRail.TrackTypes.LARGE_SLOPE_GRAVEL);
		ItemIDs.tcRailLargeSlopeBallast.item = new ItemTCRail(ItemTCRail.TrackTypes.LARGE_SLOPE_BALLAST);
		ItemIDs.tcRailVeryLargeSlopeWood.item = new ItemTCRail(ItemTCRail.TrackTypes.VERY_LARGE_SLOPE_WOOD);
		ItemIDs.tcRailVeryLargeSlopeGravel.item = new ItemTCRail(ItemTCRail.TrackTypes.VERY_LARGE_SLOPE_GRAVEL);
		ItemIDs.tcRailVeryLargeSlopeBallast.item = new ItemTCRail(ItemTCRail.TrackTypes.VERY_LARGE_SLOPE_BALLAST);
		ItemIDs.tcRailSlopeSnowGravel.item = new ItemTCRail(ItemTCRail.TrackTypes.SLOPE_SNOW_GRAVEL);
		ItemIDs.tcRailLargeSlopeSnowGravel.item = new ItemTCRail(ItemTCRail.TrackTypes.LARGE_SLOPE_SNOW_GRAVEL);
		ItemIDs.tcRailVeryLargeSlopeSnowGravel.item = new ItemTCRail(ItemTCRail.TrackTypes.VERY_LARGE_SLOPE_SNOW_GRAVEL);

		/** Normal Parallel Curves*/
		ItemIDs.tcRailSmallParallelCurve.item = new ItemTCRail(ItemTCRail.TrackTypes.SMALL_PARALLEL_CURVE);
		ItemIDs.tcRailMediumParallelCurve.item = new ItemTCRail(ItemTCRail.TrackTypes.MEDIUM_PARALLEL_CURVE);
		ItemIDs.tcRailLargeParallelCurve.item = new ItemTCRail(ItemTCRail.TrackTypes.LARGE_PARALLEL_CURVE);

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
