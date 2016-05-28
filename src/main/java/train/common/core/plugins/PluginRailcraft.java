package train.common.core.plugins;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import railcraft.api.crafting.RailcraftCraftingManager;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import org.apache.logging.log4j.Level;
import train.common.core.TrainModCore;
import train.common.library.TrackIDs;
import train.common.Traincraft;
import train.common.core.interfaces.IPlugin;
import train.common.library.ItemIDs;

import java.util.ArrayList;
import java.util.HashMap;

public class PluginRailcraft implements IPlugin {
	public static PluginRailcraft instance = new PluginRailcraft();

	private static HashMap<String, ItemStack> items = new HashMap<String, ItemStack>();

	private static String[] names = new String[] { "fuel.coke", "part.ingot.steel", "part.rail.advanced", "part.rail.reinforced", "part.rail.speed", "part.rail.standard", "part.rail.wood", "part.railbed.stone", "part.railbed.wood", };
	@Override
	public boolean isAvailable() {
		return TrainModCore.isPresent("Railcraft");
	}
	@Override
	public void initialize() {
		initItems();
		checkItems();
		//initRecipes();
		addTrackNames();
		addTrackRecipes();
	}

	public void registerTracks() {
		registerTrack(TrackIDs.COUPLER_TRACK);
		registerTrack(TrackIDs.DETECTOR_ALL_LOCOMOTIVES);
		registerTrack(TrackIDs.DETECTOR_DIESEL_LOCOMOTIVES);
		registerTrack(TrackIDs.DETECTOR_FREIGHT);
		registerTrack(TrackIDs.DETECTOR_PASSENGER);
		registerTrack(TrackIDs.DETECTOR_STEAM_LOCOMOTIVES);
		registerTrack(TrackIDs.ENERGY_TRACK);
		registerTrack(TrackIDs.DETECTOR_TANK_CARTS);
		registerTrack(TrackIDs.COPPER_TRACK);
		registerTrack(TrackIDs.STEEL_TRACK);
		registerTrack(TrackIDs.ANIMAL_BOARDING_TRACK);
		registerTrack(TrackIDs.DISEMBARK_TRACK);
		registerTrack(TrackIDs.MOB_BOARDING_TRACK);
		registerTrack(TrackIDs.LOCO_SPEED_CONTROLLER);
		registerTrack(TrackIDs.LOCO_HOLDING_TRACK);
		registerTrack(TrackIDs.STATION_TRACK);
		registerTrack(TrackIDs.HORN_ALL_LOCOMOTIVES);
		registerTrack(TrackIDs.VANILLA_SNOWY_TRACK);
		registerTrack(TrackIDs.SNOWY_STEEL_TRACK);
		registerTrack(TrackIDs.SNOWY_COPPER_TRACK);
	}

	private static void registerTrack(TrackIDs rail) {
		//System.out.println(rail.getTag());
	}

	private void initItems() {
		ItemIDs.steelRail.item.setUnlocalizedName(ItemIDs.steelRail.name());
		ItemIDs.copperRail.item.setUnlocalizedName(ItemIDs.copperRail.name());

		for (int i = 0; i < names.length; i++) {
			if (GameRegistry.findItemStack("Railcraft", names[i], 1) != null) {
				items.put(names[i], GameRegistry.findItemStack("Railcraft", names[i], 1));
			}
		}
	}

	private void addTrackNames() {
		if (TrackIDs.COUPLER_TRACK.getTrackSpec() != null)
			LanguageRegistry.addName(TrackIDs.COUPLER_TRACK.getTrackSpec().getItem(), "[TC] Coupler Track");
		if (TrackIDs.ANIMAL_BOARDING_TRACK.getTrackSpec() != null)
			LanguageRegistry.addName(TrackIDs.ANIMAL_BOARDING_TRACK.getTrackSpec().getItem(), "[TC] Animal Boarding Track (Stock Car only)");
		if (TrackIDs.COPPER_TRACK.getTrackSpec() != null)
			LanguageRegistry.addName(TrackIDs.COPPER_TRACK.getTrackSpec().getItem(), "[TC] Copper Track");
		if (TrackIDs.DETECTOR_ALL_LOCOMOTIVES.getTrackSpec() != null)
			LanguageRegistry.addName(TrackIDs.DETECTOR_ALL_LOCOMOTIVES.getTrackSpec().getItem(), "[TC] Locomotive Detector Track");
		if (TrackIDs.DETECTOR_DIESEL_LOCOMOTIVES.getTrackSpec() != null)
			LanguageRegistry.addName(TrackIDs.DETECTOR_DIESEL_LOCOMOTIVES.getTrackSpec().getItem(), "[TC] Diesel Lcomotive Detector Track");
		if (TrackIDs.DETECTOR_FREIGHT.getTrackSpec() != null)
			LanguageRegistry.addName(TrackIDs.DETECTOR_FREIGHT.getTrackSpec().getItem(), "[TC] Freight Cart Detector Track");
		if (TrackIDs.DETECTOR_PASSENGER.getTrackSpec() != null)
			LanguageRegistry.addName(TrackIDs.DETECTOR_PASSENGER.getTrackSpec().getItem(), "[TC] Passenger Cart Detector Track");
		if (TrackIDs.DETECTOR_STEAM_LOCOMOTIVES.getTrackSpec() != null)
			LanguageRegistry.addName(TrackIDs.DETECTOR_STEAM_LOCOMOTIVES.getTrackSpec().getItem(), "[TC] Steam Locomotive Detector Track");
		if (TrackIDs.DETECTOR_TANK_CARTS.getTrackSpec() != null)
			LanguageRegistry.addName(TrackIDs.DETECTOR_TANK_CARTS.getTrackSpec().getItem(), "[TC] Tank Cart Detector Track");
		if (TrackIDs.DISEMBARK_TRACK.getTrackSpec() != null)
			LanguageRegistry.addName(TrackIDs.DISEMBARK_TRACK.getTrackSpec().getItem(), "[TC] Disembarking Track (Stock Car only)");
		if (TrackIDs.ENERGY_TRACK.getTrackSpec() != null)
			LanguageRegistry.addName(TrackIDs.ENERGY_TRACK.getTrackSpec().getItem(), "[TC] Electric Track");
		if (TrackIDs.MOB_BOARDING_TRACK.getTrackSpec() != null)
			LanguageRegistry.addName(TrackIDs.MOB_BOARDING_TRACK.getTrackSpec().getItem(), "[TC] Mob Boarding Track (Stock Car only)");
		if (TrackIDs.STEEL_TRACK.getTrackSpec() != null)
			LanguageRegistry.addName(TrackIDs.STEEL_TRACK.getTrackSpec().getItem(), "[TC] Steel Track");
		if (TrackIDs.LOCO_SPEED_CONTROLLER.getTrackSpec() != null)
			LanguageRegistry.addName(TrackIDs.LOCO_SPEED_CONTROLLER.getTrackSpec().getItem(), "[TC] Locomotive Speed Controller Track");
		if (TrackIDs.LOCO_HOLDING_TRACK.getTrackSpec() != null)
			LanguageRegistry.addName(TrackIDs.LOCO_HOLDING_TRACK.getTrackSpec().getItem(), "[TC] Locomotive Holding Track");
		if (TrackIDs.STATION_TRACK.getTrackSpec() != null)
			LanguageRegistry.addName(TrackIDs.STATION_TRACK.getTrackSpec().getItem(), "[TC] Station Track");
		if (TrackIDs.HORN_ALL_LOCOMOTIVES.getTrackSpec() != null)
			LanguageRegistry.addName(TrackIDs.HORN_ALL_LOCOMOTIVES.getTrackSpec().getItem(), "[TC] Whistle Track");
		if (TrackIDs.VANILLA_SNOWY_TRACK.getTrackSpec() != null)
			LanguageRegistry.addName(TrackIDs.VANILLA_SNOWY_TRACK.getTrackSpec().getItem(), "[TC] Snowy track");
		if (TrackIDs.SNOWY_STEEL_TRACK.getTrackSpec() != null)
			LanguageRegistry.addName(TrackIDs.SNOWY_STEEL_TRACK.getTrackSpec().getItem(), "[TC] Snowy steel track");
		if (TrackIDs.SNOWY_COPPER_TRACK.getTrackSpec() != null)
			LanguageRegistry.addName(TrackIDs.SNOWY_COPPER_TRACK.getTrackSpec().getItem(), "[TC] Snowy copper track");
	}

	private void addTrackRecipes() {
		if(items.containsKey(names[2]) && items.containsKey(names[3]) && items.containsKey(names[4])&&items.containsKey(names[5])&&items.containsKey(names[6])&&items.containsKey(names[7])&&items.containsKey(names[8])){
			if (TrackIDs.COUPLER_TRACK.getTrackSpec() != null)
				GameRegistry.addRecipe(TrackIDs.COUPLER_TRACK.getTrackSpec().getItem(TrackIDs.COUPLER_TRACK.getRecipeOutput()), new Object[] { "#R#", "#X#", "# #", Character.valueOf('#'), items.get(names[2]), Character.valueOf('R'), items.get(names[8]), Character.valueOf('X'), ItemIDs.stake.item });
			if (TrackIDs.ANIMAL_BOARDING_TRACK.getTrackSpec() != null)
				GameRegistry.addRecipe(TrackIDs.ANIMAL_BOARDING_TRACK.getTrackSpec().getItem(TrackIDs.ANIMAL_BOARDING_TRACK.getRecipeOutput()), new Object[] { "#R#", "#X#", "#P#", Character.valueOf('#'), items.get(names[2]), Character.valueOf('R'), items.get(names[8]), Character.valueOf('X'), Items.golden_carrot, Character.valueOf('P'), Items.ender_pearl });
			if (TrackIDs.DISEMBARK_TRACK.getTrackSpec() != null)
				GameRegistry.addRecipe(TrackIDs.DISEMBARK_TRACK.getTrackSpec().getItem(TrackIDs.DISEMBARK_TRACK.getRecipeOutput()), new Object[] { "#R#", "#X#", "# #", Character.valueOf('#'), items.get(names[2]), Character.valueOf('R'), items.get(names[8]), Character.valueOf('X'), Items.shears });
			if (TrackIDs.MOB_BOARDING_TRACK.getTrackSpec() != null)
				GameRegistry.addRecipe(TrackIDs.MOB_BOARDING_TRACK.getTrackSpec().getItem(TrackIDs.MOB_BOARDING_TRACK.getRecipeOutput()), new Object[] { "#R#", "#X#", "#P#", Character.valueOf('#'), items.get(names[2]), Character.valueOf('R'), items.get(names[8]), Character.valueOf('X'), Items.bone, Character.valueOf('P'), Items.ender_pearl });
			if (TrackIDs.DETECTOR_ALL_LOCOMOTIVES.getTrackSpec() != null)
				GameRegistry.addRecipe(TrackIDs.DETECTOR_ALL_LOCOMOTIVES.getTrackSpec().getItem(TrackIDs.DETECTOR_ALL_LOCOMOTIVES.getRecipeOutput()), new Object[] { "#R#", "#X#", "#E#", Character.valueOf('#'), items.get(names[2]), Character.valueOf('R'), items.get(names[8]), Character.valueOf('X'), ItemIDs.controls.item, Character.valueOf('E'), ItemIDs.electronicCircuit.item });
			if (TrackIDs.DETECTOR_DIESEL_LOCOMOTIVES.getTrackSpec() != null)
				GameRegistry.addRecipe(TrackIDs.DETECTOR_DIESEL_LOCOMOTIVES.getTrackSpec().getItem(TrackIDs.DETECTOR_DIESEL_LOCOMOTIVES.getRecipeOutput()), new Object[] { "#R#", "#X#", "#E#", Character.valueOf('#'), items.get(names[2]), Character.valueOf('R'), items.get(names[8]), Character.valueOf('X'), ItemIDs.diesel.item, Character.valueOf('E'), ItemIDs.electronicCircuit.item });
			if (TrackIDs.DETECTOR_FREIGHT.getTrackSpec() != null)
				GameRegistry.addRecipe(TrackIDs.DETECTOR_FREIGHT.getTrackSpec().getItem(TrackIDs.DETECTOR_FREIGHT.getRecipeOutput()), new Object[] { "#R#", "#X#", "#E#", Character.valueOf('#'), items.get(names[2]), Character.valueOf('R'), items.get(names[8]), Character.valueOf('X'), Blocks.chest, Character.valueOf('E'), ItemIDs.electronicCircuit.item });
			if (TrackIDs.DETECTOR_PASSENGER.getTrackSpec() != null)
				GameRegistry.addRecipe(TrackIDs.DETECTOR_PASSENGER.getTrackSpec().getItem(TrackIDs.DETECTOR_PASSENGER.getRecipeOutput()), new Object[] { "#R#", "#X#", "#E#", Character.valueOf('#'), items.get(names[2]), Character.valueOf('R'), items.get(names[8]), Character.valueOf('X'), ItemIDs.seats.item, Character.valueOf('E'), ItemIDs.electronicCircuit.item });
			if (TrackIDs.DETECTOR_STEAM_LOCOMOTIVES.getTrackSpec() != null)
				GameRegistry.addRecipe(TrackIDs.DETECTOR_STEAM_LOCOMOTIVES.getTrackSpec().getItem(TrackIDs.DETECTOR_STEAM_LOCOMOTIVES.getRecipeOutput()), new Object[] { "#R#", "#X#", "#E#", Character.valueOf('#'), items.get(names[2]), Character.valueOf('R'), items.get(names[8]), Character.valueOf('X'), ItemIDs.ironFirebox.item, Character.valueOf('E'), ItemIDs.electronicCircuit.item });
			if (TrackIDs.DETECTOR_TANK_CARTS.getTrackSpec() != null)
				GameRegistry.addRecipe(TrackIDs.DETECTOR_TANK_CARTS.getTrackSpec().getItem(TrackIDs.DETECTOR_TANK_CARTS.getRecipeOutput()), new Object[] { "#R#", "#X#", "#E#", Character.valueOf('#'), items.get(names[2]), Character.valueOf('R'), items.get(names[8]), Character.valueOf('X'), Items.water_bucket, Character.valueOf('E'), ItemIDs.electronicCircuit.item });
			if (TrackIDs.ENERGY_TRACK.getTrackSpec() != null)
				GameRegistry.addRecipe(TrackIDs.ENERGY_TRACK.getTrackSpec().getItem(TrackIDs.ENERGY_TRACK.getRecipeOutput()), new Object[] { "#X#", "#R#", "#P#", Character.valueOf('#'), items.get(names[2]), Character.valueOf('R'), items.get(names[7]), Character.valueOf('X'), ItemIDs.copperWireFine.item, Character.valueOf('P'), Items.ender_pearl});
			if (TrackIDs.STEEL_TRACK.getTrackSpec() != null)
				GameRegistry.addRecipe(TrackIDs.STEEL_TRACK.getTrackSpec().getItem(TrackIDs.STEEL_TRACK.getRecipeOutput()), new Object[] { "# #", "#R#", "# #", Character.valueOf('#'), ItemIDs.steelRail.item, Character.valueOf('R'), items.get(names[7]) });
			if (TrackIDs.COPPER_TRACK.getTrackSpec() != null)
				GameRegistry.addRecipe(TrackIDs.COPPER_TRACK.getTrackSpec().getItem(TrackIDs.COPPER_TRACK.getRecipeOutput()), new Object[] { "# #", "#R#", "# #", Character.valueOf('#'), ItemIDs.copperRail.item, Character.valueOf('R'), items.get(names[7]) });
			if (TrackIDs.LOCO_SPEED_CONTROLLER.getTrackSpec() != null)
				GameRegistry.addRecipe(TrackIDs.LOCO_SPEED_CONTROLLER.getTrackSpec().getItem(TrackIDs.LOCO_SPEED_CONTROLLER.getRecipeOutput()), new Object[] { "#R#", "#X#", "#X#", Character.valueOf('#'), items.get(names[2]), Character.valueOf('R'), items.get(names[8]), Character.valueOf('X'), ItemIDs.controls.item });
			if (TrackIDs.LOCO_HOLDING_TRACK.getTrackSpec() != null)
				GameRegistry.addRecipe(TrackIDs.LOCO_HOLDING_TRACK.getTrackSpec().getItem(TrackIDs.LOCO_HOLDING_TRACK.getRecipeOutput()), new Object[] { "#R#", "#P#", "#X#", Character.valueOf('#'), ItemIDs.steelRail.item, Character.valueOf('R'), items.get(names[8]), Character.valueOf('X'), ItemIDs.controls.item, Character.valueOf('P'), Blocks.stone_pressure_plate });
			if (TrackIDs.STATION_TRACK.getTrackSpec() != null)
				GameRegistry.addRecipe(TrackIDs.STATION_TRACK.getTrackSpec().getItem(TrackIDs.STATION_TRACK.getRecipeOutput()), new Object[] { "#R#", "#C#", "#R#", Character.valueOf('#'), items.get(names[2]), Character.valueOf('R'), items.get(names[8]), Character.valueOf('C'), Items.clock});
			if (TrackIDs.HORN_ALL_LOCOMOTIVES.getTrackSpec() != null)
				GameRegistry.addRecipe(TrackIDs.HORN_ALL_LOCOMOTIVES.getTrackSpec().getItem(TrackIDs.HORN_ALL_LOCOMOTIVES.getRecipeOutput()), new Object[] { "#R#", "#S#", "#E#", Character.valueOf('#'), items.get(names[2]), Character.valueOf('R'), items.get(names[8]), Character.valueOf('S'), Items.sign, Character.valueOf('E'), ItemIDs.electronicCircuit.item });
			if (TrackIDs.SNOWY_STEEL_TRACK.getTrackSpec() != null && TrackIDs.STEEL_TRACK.getTrackSpec() != null)
				GameRegistry.addShapelessRecipe(TrackIDs.SNOWY_STEEL_TRACK.getTrackSpec().getItem(TrackIDs.SNOWY_STEEL_TRACK.getRecipeOutput()), new Object[] { TrackIDs.STEEL_TRACK.getTrackSpec().getItem(1),Items.snowball});
			if (TrackIDs.SNOWY_COPPER_TRACK.getTrackSpec() != null && TrackIDs.COPPER_TRACK.getTrackSpec() != null)
				GameRegistry.addShapelessRecipe(TrackIDs.SNOWY_COPPER_TRACK.getTrackSpec().getItem(TrackIDs.SNOWY_COPPER_TRACK.getRecipeOutput()), new Object[] { TrackIDs.COPPER_TRACK.getTrackSpec().getItem(1),Items.snowball});
			if (TrackIDs.VANILLA_SNOWY_TRACK.getTrackSpec() != null)
				GameRegistry.addShapelessRecipe(TrackIDs.VANILLA_SNOWY_TRACK.getTrackSpec().getItem(TrackIDs.VANILLA_SNOWY_TRACK.getRecipeOutput()), new Object[] { Blocks.rail,Items.snowball});
		}
		ArrayList<ItemStack> copper = OreDictionary.getOres("ingotCopper");
		if (copper != null && copper.size() >= 0) {
			for (int i = 0; i < copper.size(); i++) {
				RailcraftCraftingManager.rollingMachine.addRecipe(new ItemStack(ItemIDs.copperRail.item, 8), new Object[] { "X X", "X X", "X X", Character.valueOf('X'), copper.get(i) });
			}
		}
		ArrayList<ItemStack> steel = OreDictionary.getOres("ingotSteel");
		if (steel != null && steel.size() >= 0) {
			for (int t = 0; t < steel.size(); t++) {
				RailcraftCraftingManager.rollingMachine.addRecipe(new ItemStack(ItemIDs.steelRail.item, 16), new Object[] { "X X", "I I", "X X", Character.valueOf('X'), steel.get(t), Character.valueOf('I'), Items.iron_ingot });
			}
		}
	}

	private void checkItems() {
		String missing = "";
		for (int i = 0; i < names.length; i++) {
			if (!items.containsKey(names[i])) {
				missing = missing + " " + names[i];
			}
		}

		if (missing.equals("")) {
			Traincraft.tcLog.info("Railcraft items loaded");
		}
		else {
			Traincraft.tcLog.log(Level.WARN, "Railcraft items not loaded: " + missing);
		}
	}

	private void initRecipes() {
	}

	public static HashMap<String, ItemStack> getItems() {
		return items;
	}

	public static String[] getNames() {
		return names;
	}
}