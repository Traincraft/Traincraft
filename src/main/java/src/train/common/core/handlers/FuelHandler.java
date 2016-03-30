package src.train.common.core.handlers;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import src.train.common.core.plugins.PluginIndustrialCraft;
import src.train.common.core.plugins.PluginRailcraft;
import src.train.common.library.BlockIDs;
import cpw.mods.fml.common.IFuelHandler;
import cpw.mods.fml.common.registry.GameRegistry;

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
		int var1 = it.getItem().itemID;
		if (var1 < 256 && Block.blocksList[var1].blockMaterial == Material.wood)
			return wood;
		if (var1 == Item.stick.itemID)
			return stick;
		if (var1 == Item.coal.itemID)
			return coal;
		if (var1 == Item.bucketLava.itemID)
			return bucketLava;
		if (var1 == Block.sapling.blockID)
			return sapling;
		if (var1 == Item.blazeRod.itemID)
			return blazeRod;
		if (PluginIndustrialCraft.getItems().containsKey(PluginIndustrialCraft.getNames()[15]) && var1 == PluginIndustrialCraft.getItems().get(PluginIndustrialCraft.getNames()[15]).itemID)
			return coalFuel;
		if (PluginRailcraft.getItems().containsKey(PluginRailcraft.getNames()[1]) && var1 == PluginRailcraft.getItems().get(PluginRailcraft.getNames()[1]).itemID)
			return cokeCoal;

		int ret = GameRegistry.getFuelValue(it);
		return ret;
	}

	/**
	 * consumption rates of fuel and water 1 second = about 20 ticks default is 80 which mean 1 unit of fuel each 4 seconds The smaller the more it consumes 20 means each second one unit of fuel is consumed
	 * 
	 * water: this is a chance rate on each tick Default value for Fuel is 200 which mean 1 chance over 200 to consume one unit of water
	 */
	@Override
	public int getBurnTime(ItemStack fuel) {
		int var1 = fuel.itemID;
		if(var1 == BlockIDs.oreTC.blockID && (fuel.getItemDamage()==1 || fuel.getItemDamage()==2)){
			return 2400;
		}
		return 0;
	}
}