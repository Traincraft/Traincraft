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
		
		/**Tracks*/
		ItemIDs.tcRailMediumTurn.item = new ItemTCRail(ItemTCRail.TrackTypes.MEDIUM_TURN);
		ItemIDs.tcRailLargeTurn.item = new ItemTCRail(ItemTCRail.TrackTypes.LARGE_TURN);
		ItemIDs.tcRailVeryLargeTurn.item = new ItemTCRail(ItemTCRail.TrackTypes.VERY_LARGE_TURN);
		ItemIDs.tcRailLongStraight.item = new ItemTCRail(ItemTCRail.TrackTypes.LONG_STRAIGHT);
		ItemIDs.tcRailMediumStraight.item = new ItemTCRail(ItemTCRail.TrackTypes.MEDIUM_STRAIGHT);
		ItemIDs.tcRailSmallStraight.item = new ItemTCRail(ItemTCRail.TrackTypes.SMALL_STRAIGHT);
		ItemIDs.tcRailMediumSwitch.item = new ItemTCRail(ItemTCRail.TrackTypes.MEDIUM_SWITCH);
		ItemIDs.tcRailLargeSwitch.item = new ItemTCRail(ItemTCRail.TrackTypes.LARGE_SWITCH);
		ItemIDs.tcRailSmallRoadCrossing.item = new ItemTCRail(ItemTCRail.TrackTypes.SMALL_ROAD_CROSSING);
		ItemIDs.tcRailSmallRoadCrossing1.item = new ItemTCRail(ItemTCRail.TrackTypes.SMALL_ROAD_CROSSING_1);
		ItemIDs.tcRailSmallRoadCrossing2.item = new ItemTCRail(ItemTCRail.TrackTypes.SMALL_ROAD_CROSSING_2);
		ItemIDs.tcRailMediumParallelSwitch.item = new ItemTCRail(ItemTCRail.TrackTypes.MEDIUM_PARALLEL_SWITCH);

		//ItemIDs.tcRailVeryLargeSwitch.item = new ItemTCRail(ItemTCRail.TrackTypes.VERY_LARGE_SWITCH);
		ItemIDs.tcRailSuperLargeTurn.item = new ItemTCRail(ItemTCRail.TrackTypes.SUPER_LARGE_TURN);


		ItemIDs.tcRailTwoWaysCrossing.item = new ItemTCRail(ItemTCRail.TrackTypes.TWO_WAYS_CROSSING);
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
		ItemIDs.tcRailConcreteSmallStraight.item = new ItemTCRail(ItemTCRail.TrackTypes.CONCRETE_SMALL_STRAIGHT);
		//ItemIDs.tcRailConcreteSuperLargeTurn.item = new ItemTCRail(ItemTCRail.TrackTypes.CONCRETE_SUPER_LARGE_TURN);
		//ItemIDs.tcRailSuperLong.item = new ItemTCRail(ItemTCRail.TrackTypes.SUPER_LONG);

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
