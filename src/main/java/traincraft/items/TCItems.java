/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package traincraft.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import traincraft.blocks.IItemBlockSupplier;
import traincraft.Traincraft;
import traincraft.blocks.TCBlocks;
import traincraft.items.armor.*;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

@Mod.EventBusSubscriber(modid = Traincraft.MOD_ID)
public class TCItems {

	public static final ItemWrench WRENCH = new ItemWrench();
	public static final ItemSkinChanger SKIN_CHANGER = new ItemSkinChanger();
	public static final ItemCanister CANISTER = new ItemCanister();
	public static final ItemConnector CONNECTOR = new ItemConnector();
	public static final BaseItem STEEL_INGOT = new BaseItem("steel_ingot");
	public static final BaseItem STEEL_DUST = new BaseItem("steel_dust");
	public static final BaseItem COAL_DUST = new BaseItem("coal_dust");
	public static final BaseItem GRAPHITE = new BaseItem("graphite");
	public static final BaseItem STEEL_FIREBOX = new BaseItem("steel_firebox");
	public static final BaseItem STEEL_BOGIE = new BaseItem("steel_bogie");
	public static final BaseItem STEEL_FRAME = new BaseItem("steel_frame");
	public static final BaseItem STEEL_CABIN = new BaseItem("steel_cabin");
	public static final BaseItem STEEL_CHIMNEY = new BaseItem("steel_chimney");
	public static final BaseItem PLASTIC = new BaseItem("plastic");
	public static final BaseItem COPPER_INGOT = new BaseItem("copper_ingot");
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
	seats
	transformer
	controls
	transmition
	generator
	copperWireFine
	electronicCircuit
	reinforcedPlastic
	reinforcedPlates
	 */
	public static final ItemChunkLoaderActivator CHUNK_LOADER_ACTIVATOR = new ItemChunkLoaderActivator();
	
	public static final ItemArmorOveralls OVERALL = new ItemArmorOveralls();
	public static final ItemArmorJacket JACKET = new ItemArmorJacket();
	public static final ItemArmorHat HAT = new ItemArmorHat();
	public static final BaseColorableArmor TICKETMAN_JACKET = new BaseColorableArmor(BaseColorableArmor.TICKETMAN, EntityEquipmentSlot.CHEST, "armor_ticketman_jacket", "ticketman", BaseColorableArmor.TICKETMAN_JACKET_DEFAULT_COLOR, true);
	public static final BaseColorableArmor TICKETMAN_PANTS = new BaseColorableArmor(BaseColorableArmor.TICKETMAN, EntityEquipmentSlot.LEGS, "armor_ticketman_pants", "ticketman_pants", BaseColorableArmor.TICKETMAN_PANTS_DEFAULT_COLOR, true);
	public static final BaseColorableArmor TICKETMAN_HAT = new BaseColorableArmor(BaseColorableArmor.TICKETMAN, EntityEquipmentSlot.HEAD, "armor_ticketman_hat", "ticketman", BaseColorableArmor.TICKETMAN_HAT_DEFAULT_COLOR, true);
	public static final BaseColorableArmor DRIVER_JACKET = new BaseColorableArmor(BaseColorableArmor.DRIVER, EntityEquipmentSlot.CHEST, "armor_driver_jacket", "driver", BaseColorableArmor.DRIVER_JACKET_DEFAULT_COLOR, true);
	public static final BaseColorableArmor DRIVER_PANTS = new BaseColorableArmor(BaseColorableArmor.DRIVER, EntityEquipmentSlot.LEGS, "armor_driver_pants", "driver_pants", BaseColorableArmor.DRIVER_PANTS_DEFAULT_COLOR, true);
	public static final BaseColorableArmor DRIVER_HAT = new BaseColorableArmor(BaseColorableArmor.DRIVER, EntityEquipmentSlot.HEAD, "armor_driver_hat", "driver", BaseColorableArmor.DRIVER_HAT_DEFAULT_COLOR, true);
	public static final ItemArmorCompositeSuit COMPOSITE_SUIT_HEAD = new ItemArmorCompositeSuit(EntityEquipmentSlot.HEAD);
	public static final ItemArmorCompositeSuit COMPOSITE_SUIT_CHEST = new ItemArmorCompositeSuit(EntityEquipmentSlot.CHEST);
	public static final ItemArmorCompositeSuit COMPOSITE_SUIT_PANTS = new ItemArmorCompositeSuit(EntityEquipmentSlot.LEGS);
	public static final ItemArmorCompositeSuit COMPOSITE_SUIT_FEET = new ItemArmorCompositeSuit(EntityEquipmentSlot.FEET);
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event){
		boolean isClient = FMLCommonHandler.instance().getSide().isClient();
		IForgeRegistry<Item> registry = event.getRegistry();
		
		try{
			for(Field field : TCItems.class.getDeclaredFields()){
				if(Modifier.isPublic(field.getModifiers()) && Modifier.isStatic(field.getModifiers()) && Modifier.isFinal(field.getModifiers())){
					Object obj = field.get(null);
					if(obj instanceof Item){
						registry.register((Item) obj);
						
						if(isClient){
							if(obj instanceof BaseItem){ //  BaseItems can change their model behaviour
								((BaseItem) obj).registerModel();
							} else {
								ModelLoader.setCustomModelResourceLocation((Item) obj, 0, new ModelResourceLocation(((Item) obj).getRegistryName(), "inventory"));
							}
						}
					}
				}
			}
		}catch(IllegalAccessException ignored){}
		
		// item blocks
		try{
			for(Field field : TCBlocks.class.getDeclaredFields()){
				if(Modifier.isPublic(field.getModifiers()) && Modifier.isStatic(field.getModifiers()) && Modifier.isFinal(field.getModifiers())){
					Object obj = field.get(null);
					if(obj instanceof IItemBlockSupplier){
						ItemBlock itemBlock = ((IItemBlockSupplier) obj).getItemBlock();
						registry.register(itemBlock);
						
						if(isClient){
							ModelLoader.setCustomModelResourceLocation(itemBlock, 0, new ModelResourceLocation(itemBlock.getRegistryName(), "inventory"));
						}
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
