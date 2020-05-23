/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package traincraft.items;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import train.common.Traincraft;
import train.common.blocks.TCBlocks;
import traincraft.items.armor.ItemArmorCompositeSuit;
import traincraft.items.armor.ItemArmorDriverHat;
import traincraft.items.armor.ItemArmorDriverJacket;
import traincraft.items.armor.ItemArmorDriverPants;
import traincraft.items.armor.ItemArmorHat;
import traincraft.items.armor.ItemArmorJacket;
import traincraft.items.armor.ItemArmorOverall;
import traincraft.items.armor.ItemArmorTicketmanHat;
import traincraft.items.armor.ItemArmorTicketmanJacket;
import traincraft.items.armor.ItemArmorTicketmanPants;

@Mod.EventBusSubscriber(modid = Traincraft.MOD_ID)
public class TCItems {

	public static final ItemBlockGeneratorDiesel GENERATOR_DIESEL = new ItemBlockGeneratorDiesel();
	public static final ItemBlockGeneratorWaterWheel WATER_WHEEL = new ItemBlockGeneratorWaterWheel();
	public static final ItemBlockGeneratorWindMill WIND_MILL = new ItemBlockGeneratorWindMill();
	
	public static final BaseItemBlock OIL_SAND = new BaseItemBlock(TCBlocks.OIL_SAND);
	public static final BaseItemBlock PETROL_ORE = new BaseItemBlock(TCBlocks.PETROL_ORE);
	public static final BaseItemBlock COPPER_ORE = new BaseItemBlock(TCBlocks.COPPER_ORE);
	
	public static final ItemWrench WRENCH = new ItemWrench();
	public static final ItemCanister CANISTER = new ItemCanister();
	public static final ItemConnector CONNECTOR = new ItemConnector();
	public static final BaseItem STEEL_DUST = new BaseItem("steel_dust");
	public static final BaseItem COAL_DUST = new BaseItem("coal_dust");
	public static final BaseItem GRAPHITE = new BaseItem("graphite");
	public static final BaseItem FIRE_BOX = new BaseItem("fire_box");
	public static final BaseItem BOGIE = new BaseItem("bogie");
	public static final BaseItem STEEL_FRAME = new BaseItem("steel_frame");
	public static final BaseItem STEEL_CABIN = new BaseItem("steel_cabin");
	public static final BaseItem STEEL_CHIMNEY = new BaseItem("steel_chimney");
	/*
	balloon
	propeller
	steamengine
	dieselengine
	piston
	camshaft
	cylinder
	electmotor
	woodenFrame
	woodenBogie
	woodenCab
	ironChimney
	ironFirebox
	ironBoiler
	ironFrame
	ironBogie
	ironCab
	steel
	seats
	transformer
	controls
	transmition
	generator
	rawPlastic
	ingotCopper
	copperWireFine
	electronicCircuit
	reinforcedPlastic
	reinforcedPlates
	 */
	public static final ItemChunkLoaderActivator CHUNK_LOADER_ACTIVATOR = new ItemChunkLoaderActivator();
	
	public static final ItemArmorOverall OVERALL = new ItemArmorOverall();
	public static final ItemArmorJacket JACKET = new ItemArmorJacket();
	public static final ItemArmorHat HAT = new ItemArmorHat();
	public static final ItemArmorTicketmanJacket TICKETMAN_JACKET = new ItemArmorTicketmanJacket();
	public static final ItemArmorTicketmanPants TICKETMAN_PANTS = new ItemArmorTicketmanPants();
	public static final ItemArmorTicketmanHat TICKETMAN_HAT = new ItemArmorTicketmanHat();
	public static final ItemArmorDriverJacket DRIVER_JACKET = new ItemArmorDriverJacket();
	public static final ItemArmorDriverPants DRIVER_PANTS = new ItemArmorDriverPants();
	public static final ItemArmorDriverHat DRIVER_HAT = new ItemArmorDriverHat();
	public static final ItemArmorCompositeSuit COMPOSITE_SUIT_HEAD = new ItemArmorCompositeSuit(EntityEquipmentSlot.HEAD);
	public static final ItemArmorCompositeSuit COMPOSITE_SUIT_CHEST = new ItemArmorCompositeSuit(EntityEquipmentSlot.CHEST);
	public static final ItemArmorCompositeSuit COMPOSITE_SUIT_PANTS = new ItemArmorCompositeSuit(EntityEquipmentSlot.LEGS);
	public static final ItemArmorCompositeSuit COMPOSITE_SUIT_FEET = new ItemArmorCompositeSuit(EntityEquipmentSlot.FEET);
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event){
		IForgeRegistry<Item> registry = event.getRegistry();
		
		try{
			for(Field field : TCBlocks.class.getDeclaredFields()){
				if(Modifier.isPublic(field.getModifiers()) && Modifier.isStatic(field.getModifiers()) && Modifier.isFinal(field.getModifiers())){
					Object obj = field.get(null);
					if(obj instanceof Item){
						registry.register((Item) obj);
					}
				}
			}
		}catch(IllegalAccessException ignored){}
		
	}
	
	public static void init() {
		//loadItems();
		//registerItems();
	}

	private static void loadItems() {
		/*
		for (ItemIDs items : ItemIDs.values()) {
			if (items.className != null) {
				if (items.className.equals("ItemTrain")) {
					items.item = new BaseItem(items.iconName);
				}
				else if (items.className.equals("ItemRollingStock")) {
					items.item = new ItemRollingStock(items.iconName);
				}
				else if (items.className.equals("ItemRotativeDigger")) {
					items.item = new ItemRotativeDigger();
				}
				else if (items.className.equals("ItemContainer")) {
					items.item = new ItemCanister(items.iconName);
				}
			}
		}
		//ItemIDs.signal.item = new ItemSignal(ItemIDs.signal.itemID, BlockIDs.activeSignal.block).setIconIndex(ItemIDs.signal.iconIndex);
		ItemIDs.recipeBook.item = new ItemRecipeBook();
		ItemIDs.adminBook.item = new ItemAdminBook();
		
		ItemIDs.airship.item = new ItemZeppelins(0);
		ItemIDs.zeppelin.item = new ItemZeppelins(1);
		
		 */
		
		/**Paintable armors:*/
		/*
		ItemIDs.boots_suit_paintable.item = new ItemTCCompositeSuit(ItemIDs.boots_suit_paintable.iconName, Traincraft.instance.armorCompositeSuit, Traincraft.trainCompositeSuit, 3,0x1535d4);
		ItemIDs.pants_suit_paintable.item = new ItemTCCompositeSuit(ItemIDs.pants_suit_paintable.iconName, Traincraft.instance.armorCompositeSuit, Traincraft.trainCompositeSuit, 2,0x1535d4);
		ItemIDs.jacket_suit_paintable.item = new ItemTCCompositeSuit(ItemIDs.jacket_suit_paintable.iconName, Traincraft.instance.armorCompositeSuit, Traincraft.trainCompositeSuit, 1,0x1469d9);
		ItemIDs.helmet_suit_paintable.item = new ItemTCCompositeSuit(ItemIDs.helmet_suit_paintable.iconName, Traincraft.instance.armorCompositeSuit, Traincraft.trainCompositeSuit, 0,0x1469d9);
		 */
		
		/**Tracks
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

		if (Loader.isModLoaded("ComputerCraft")) {
			ItemIDs.wirelessTransmitter.item = new ItemWirelessTransmitter();
			ItemIDs.atoCard.item = new ItemATOCard();
		}*/
	}
	
	/*private static void registerItems() {
		for (ItemIDs items : ItemIDs.values()) {
			if (items.item != null) {
				items.item.setUnlocalizedName(Traincraft.MOD_ID + ":" + items.name());
				GameRegistry.registerItem(items.item, items.name());
			}
		}
	}*/
}
