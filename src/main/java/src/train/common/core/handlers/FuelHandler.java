package src.train.common.core.handlers;

import cpw.mods.fml.common.IFuelHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import src.train.common.core.plugins.PluginIndustrialCraft;
import src.train.common.core.plugins.PluginRailcraft;
import src.train.common.library.BlockIDs;

public class FuelHandler implements IFuelHandler {

	/**
	 * durations for these materials
	 */
	public static int stick = 200;
	public static int wood = 700;
	public static int bucketLava = 1000;
	public static int coal = 1200;
	public static int sapling = 200;
	public static int blazeRod = 2000;
	public static int coalFuel = 1400;
	public static int cokeCoal = 1800;
	
	public static int DEFAULT_FUEL = 40;
	public static int DEFAULT_WATER = 200;

	/**
	 * returns a fuel duration for steam engines
	 * 
	 * @param itemstack
	 * @return
	 */
	public static int steamFuelLast(ItemStack it) {
		if (it == null) {
			return 0;
		}
		Block block = Block.getBlockFromItem(it.getItem());
		if (block != null && block.getMaterial() == Material.wood) {
			return wood;
		}
		int id = Item.getIdFromItem(it.getItem());
		if (id == Item.getIdFromItem(Items.stick)) {
			return stick;
		}
		if (id == Item.getIdFromItem(Items.coal)) {
			return coal;
		}
		if (id == Item.getIdFromItem(Items.lava_bucket)) {
			return bucketLava;
		}
		if (id == Item.getIdFromItem(Item.getItemFromBlock(Blocks.sapling))) {
			return sapling;
		}
		if (id == Item.getIdFromItem(Items.blaze_rod)) {
			return blazeRod;
		}
		// TODO: Hardcoding index to arbitrary array is worse than hardcoding the contents of that index...
		String coalFuelName = PluginIndustrialCraft.getNames()[15];
		if (PluginIndustrialCraft.getItems().containsKey(coalFuelName) &&
				id == Item.getIdFromItem(PluginIndustrialCraft.getItems().get(coalFuelName).getItem())) {
			return coalFuel;
		}
		String cokeCoalName = PluginRailcraft.getNames()[1];
		if (PluginRailcraft.getItems().containsKey(cokeCoalName) &&
				id == Item.getIdFromItem(PluginRailcraft.getItems().get(cokeCoalName).getItem())) {
			return cokeCoal;
		}

		return GameRegistry.getFuelValue(it);
	}

	/**
	 * consumption rates of fuel and water 1 second = about 20 ticks default is 80 which mean 1 unit of fuel each 4 seconds The smaller the more it consumes 20 means each second one unit of fuel is consumed
	 * 
	 * water: this is a chance rate on each tick Default value for Fuel is 200 which mean 1 chance over 200 to consume one unit of water
	 */
	@Override
	public int getBurnTime(ItemStack fuel) {
		if(Item.getIdFromItem(fuel.getItem()) == Item.getIdFromItem(Item.getItemFromBlock(BlockIDs.oreTC.block)) && (fuel.getItemDamage() == 1 || fuel.getItemDamage() == 2)){
			return 2400;
		}
		return 0;
	}
}