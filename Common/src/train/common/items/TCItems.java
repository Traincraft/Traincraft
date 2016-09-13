/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package src.train.common.items;

import cpw.mods.fml.common.registry.GameRegistry;
import src.train.common.Traincraft;
import src.train.common.library.Info;
import src.train.common.library.ItemIDs;

public class TCItems {

	public static void init() {
		loadItems();
		nameItems();
	}

	private static void loadItems() {
		for (ItemIDs items : ItemIDs.values()) {
			if (items.className != null) {
				if (items.className.equals("ItemTrain")) {
					items.item = new ItemTrain(items.itemID);
				}
				else if (items.className.equals("ItemRollingStock")) {
					items.item = new ItemRollingStock(items.itemID);
				}
				else if (items.className.equals("ItemRotativeDigger")) {
					items.item = new ItemRotativeDigger(items.itemID);
				}
				else if (items.className.equals("ItemContainer")) {
					items.item = new ItemContainer(items.itemID);
				}
			}
		}
		//ItemIDs.signal.item = new ItemSignal(ItemIDs.signal.itemID, BlockIDs.activeSignal.block).setIconIndex(ItemIDs.signal.iconIndex);
		ItemIDs.chunkLoaderActivator.item = new ItemChunkLoaderActivator(ItemIDs.chunkLoaderActivator.itemID);
		ItemIDs.recipeBook.item = new ItemRecipeBook(ItemIDs.recipeBook.itemID);
		
		ItemIDs.stake.item = new ItemStacked(ItemIDs.stake.itemID, 200);
		ItemIDs.airship.item = new ItemZeppelins(ItemIDs.airship.itemID,0);
		ItemIDs.zeppelin.item = new ItemZeppelins(ItemIDs.zeppelin.itemID,1);
		ItemIDs.overalls.item = new ItemTCArmor(ItemIDs.overalls.itemID, Traincraft.instance.armor, Traincraft.trainArmor, 2,0);
		ItemIDs.jacket.item = new ItemTCArmor(ItemIDs.jacket.itemID, Traincraft.instance.armor, Traincraft.trainArmor, 1,0);
		ItemIDs.hat.item = new ItemTCArmor(ItemIDs.hat.itemID, Traincraft.instance.armor, Traincraft.trainArmor, 0,0);
		
		/**Paintable armors:*/
		ItemIDs.pants_ticketMan_paintable.item = new ItemTCArmor(ItemIDs.pants_ticketMan_paintable.itemID, Traincraft.instance.armorCloth, Traincraft.trainCloth, 2,0xdedede);
		ItemIDs.jacket_ticketMan_paintable.item = new ItemTCArmor(ItemIDs.jacket_ticketMan_paintable.itemID, Traincraft.instance.armorCloth, Traincraft.trainCloth, 1,0x002cdb);
		ItemIDs.hat_ticketMan_paintable.item = new ItemTCArmor(ItemIDs.hat_ticketMan_paintable.itemID,Traincraft.instance.armorCloth, Traincraft.trainCloth, 0,0x9fafb5);
		
		ItemIDs.pants_driver_paintable.item = new ItemTCArmor(ItemIDs.pants_driver_paintable.itemID, Traincraft.instance.armorCloth, Traincraft.trainCloth, 2,0x1535d4);
		ItemIDs.jacket_driver_paintable.item = new ItemTCArmor(ItemIDs.jacket_driver_paintable.itemID, Traincraft.instance.armorCloth, Traincraft.trainCloth, 1,0x1469d9);
		ItemIDs.hat_driver_paintable.item = new ItemTCArmor(ItemIDs.hat_driver_paintable.itemID,Traincraft.instance.armorCloth, Traincraft.trainCloth, 0,0x1469d9);
	
		ItemIDs.boots_suit_paintable.item = new ItemTCCompositeSuit(ItemIDs.boots_suit_paintable.itemID, Traincraft.instance.armorCompositeSuit, Traincraft.trainCompositeSuit, 3,0x1535d4);
		ItemIDs.pants_suit_paintable.item = new ItemTCCompositeSuit(ItemIDs.pants_suit_paintable.itemID, Traincraft.instance.armorCompositeSuit, Traincraft.trainCompositeSuit, 2,0x1535d4);
		ItemIDs.jacket_suit_paintable.item = new ItemTCCompositeSuit(ItemIDs.jacket_suit_paintable.itemID, Traincraft.instance.armorCompositeSuit, Traincraft.trainCompositeSuit, 1,0x1469d9);
		ItemIDs.helmet_suit_paintable.item = new ItemTCCompositeSuit(ItemIDs.helmet_suit_paintable.itemID,Traincraft.instance.armorCompositeSuit, Traincraft.trainCompositeSuit, 0,0x1469d9);
		
		ItemIDs.composite_wrench.item = new ItemWrench(ItemIDs.composite_wrench.itemID);
		
		/**Tracks*/
		ItemIDs.tcRailMediumTurn.item = new ItemTCRail(ItemIDs.tcRailMediumTurn.itemID,ItemTCRail.TrackTypes.MEDIUM_TURN);
		ItemIDs.tcRailLargeTurn.item = new ItemTCRail(ItemIDs.tcRailLargeTurn.itemID,ItemTCRail.TrackTypes.LARGE_TURN);
		ItemIDs.tcRailVeryLargeTurn.item = new ItemTCRail(ItemIDs.tcRailVeryLargeTurn.itemID,ItemTCRail.TrackTypes.VERY_LARGE_TURN);
		ItemIDs.tcRailLongStraight.item = new ItemTCRail(ItemIDs.tcRailLongStraight.itemID,ItemTCRail.TrackTypes.LONG_STRAIGHT);
		ItemIDs.tcRailMediumStraight.item = new ItemTCRail(ItemIDs.tcRailMediumStraight.itemID,ItemTCRail.TrackTypes.MEDIUM_STRAIGHT);
		ItemIDs.tcRailSmallStraight.item = new ItemTCRail(ItemIDs.tcRailSmallStraight.itemID,ItemTCRail.TrackTypes.SMALL_STRAIGHT);
		ItemIDs.tcRailMediumSwitch.item = new ItemTCRail(ItemIDs.tcRailMediumSwitch.itemID,ItemTCRail.TrackTypes.MEDIUM_SWITCH);
		ItemIDs.tcRailLargeSwitch.item = new ItemTCRail(ItemIDs.tcRailLargeSwitch.itemID,ItemTCRail.TrackTypes.LARGE_SWITCH);
		ItemIDs.tcRailMediumParallelSwitch.item = new ItemTCRail(ItemIDs.tcRailMediumParallelSwitch.itemID,ItemTCRail.TrackTypes.MEDIUM_PARALLEL_SWITCH);
		
		ItemIDs.tcRailTwoWaysCrossing.item = new ItemTCRail(ItemIDs.tcRailTwoWaysCrossing.itemID,ItemTCRail.TrackTypes.TWO_WAYS_CROSSING);
		ItemIDs.tcRailLargeSlopeWood.item = new ItemTCRail(ItemIDs.tcRailLargeSlopeWood.itemID,ItemTCRail.TrackTypes.LARGE_SLOPE_WOOD);
		ItemIDs.tcRailLargeSlopeGravel.item = new ItemTCRail(ItemIDs.tcRailLargeSlopeGravel.itemID,ItemTCRail.TrackTypes.LARGE_SLOPE_GRAVEL);
		ItemIDs.tcRailLargeSlopeBallast.item = new ItemTCRail(ItemIDs.tcRailLargeSlopeBallast.itemID,ItemTCRail.TrackTypes.LARGE_SLOPE_BALLAST);
		
	}

	private static void nameItems() {
		for (ItemIDs items : ItemIDs.values()) {
			if (items.item != null) {
				items.item.setUnlocalizedName(items.name());
				GameRegistry.registerItem(items.item, Info.modID.toLowerCase() + ":" + items.name());
			}
		}
	}
}