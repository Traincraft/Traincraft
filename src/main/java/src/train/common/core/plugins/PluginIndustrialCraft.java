package src.train.common.core.plugins;

import ic2.api.item.IC2Items;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import src.train.common.Traincraft;
import src.train.common.core.TrainModCore;
import src.train.common.core.handlers.ConfigHandler;
import src.train.common.core.interfaces.IPlugin;
import src.train.common.inventory.TrainCraftingManager;
import src.train.common.library.BlockIDs;
import src.train.common.library.ItemIDs;
import cpw.mods.fml.common.registry.GameRegistry;

public class PluginIndustrialCraft implements IPlugin {
	public static PluginIndustrialCraft instance = new PluginIndustrialCraft();

	private static HashMap<String, ItemStack> items = new HashMap<String, ItemStack>();;

	private static String[] names = new String[] { "copperOre", "tinOre", "uraniumOre", "reBattery", "chargedReBattery", "energyCrystal", "lapotronCrystal", "wrench", "industrialDiamond", "treetap", "resin", "rubberSapling", "rubberWood", "rubberSapling", "filledFuelCan", "fuelCan", "biofuelCell", "cell", "lavaCell", "waterCell", "reactorUraniumSimple", "reactorCoolantSimple", "reactorUraniumDual", "reEnrichedUraniumCell", "nearDepletedUraniumCell", "coalfuelCell", "clayDust", "coalDust", "ironDust", "refinedIronIngot", "copperIngot", "tinIngot", "bronzeIngot", "copperCableItem", "insulatedCopperCableItem", "ironCableItem", "tinCableItem", "goldCableItem", "insulatedGoldCableItem", "doubleInsulatedGoldCableItem", "insulatedIronCableItem", "doubleInsulatedIronCableItem", "trippleInsulatedIronCableItem", "glassFiberCableItem", "copperCableBlock", "insulatedCopperCableBlock", "insulatedIronCableBlock", "doubleInsulatedIronCableBlock", "trippleInsulatedIronCableBlock", "glassFiberCableBlock", "goldCableBlock", "insulatedGoldCableBlock", "insulatedGoldCableBlock", "doubleInsulatedGoldCableBlock", "ironCableBlock", "tinCableBlock", "machine", "ironFurnace", "recycler", "electronicCircuit", "generator", "geothermalGenerator", "solarPanel", "compressor", "mvTransformer", "teslaCoil", "luminator", "miningPipe", "miningDrill", "chainsaw", "ecMeter", "ironFence" };
	@Override
	public boolean isAvailable() {
		return TrainModCore.isPresent("IC2");
	}
	@Override
	public void initialize() {
		initItems();
		//checkItems();
		initRecipes();
	}

	private void initItems() {
		for (int i = 0; i < names.length; i++) {
			if (IC2Items.getItem(names[i]) != null) {
				items.put(names[i], IC2Items.getItem(names[i]).copy());
			}
		}
	}

	//call getItem failed for uraniumCell, coolingCell, depletedIsotopeCell
	private void checkItems() {
		String missing = "";
		for (int i = 0; i < names.length; i++) {
			if (!items.containsKey(names[i])) {
				missing = missing + " " + names[i];
			}
		}

		if (missing.equals("")) {
			Traincraft.tcLog.fine("IC2 items loaded");
		}
		else {
			Traincraft.tcLog.log(Level.WARNING, "IC2 items not loaded: " + missing);
		}
	}

	private void initRecipes() {
		ItemStack reBattery = GameRegistry.findItemStack("IC2", "itemBatRE", 1);
		/*if (reBattery != null) {
			reBattery.setItemDamage(0);
			GameRegistry.addRecipe(new ItemStack(BlockIDs.windMill.block, 1), new Object[] { " P ", " R ", "I I", Character.valueOf('I'), Item.ingotIron, Character.valueOf('P'), ItemIDs.propeller.item, Character.valueOf('R'), reBattery });
			ArrayList<ItemStack> s2 = OreDictionary.getOres("logWood");
			if (s2 != null && s2.size() >= 0) {
				for (int j = 0; j < s2.size(); j++) {
					GameRegistry.addRecipe(new ItemStack(BlockIDs.waterWheel.block, 1), new Object[] { " W ", "WRW", " W ", Character.valueOf('R'), reBattery,Character.valueOf('W'), s2.get(j)});
					}	
				}
		}else{
			Traincraft.tcLog.log(Level.WARNING, "IC2 item not loaded: " + reBattery);
		}*/
	}

	public static HashMap<String, ItemStack> getItems() {
		return items;
	}

	public static String[] getNames() {
		return names;
	}
}