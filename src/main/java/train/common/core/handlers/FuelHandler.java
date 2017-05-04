package train.common.core.handlers;

import cpw.mods.fml.common.IFuelHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import train.common.library.BlockIDs;

import java.util.Arrays;

public class FuelHandler implements IFuelHandler {

	/**
	 * durations for the materials
	 */
	//0 is wood, the rest follow in line with the order of burnableItems
	private static int[] burnTimes = new int[]{300, 100, 1200, 1000, 2000, 150, 12000, 200};
	private static Item[] burnableItems = new Item[]{Items.stick,Items.coal, Items.lava_bucket, Items.blaze_rod, Item.getItemFromBlock(Blocks.wooden_slab), Item.getItemFromBlock(Blocks.coal_block), Item.getItemFromBlock(Blocks.sapling)};
	//TODO add coke coal from railcraft
	//secondary option, a bit poor way of going about it, but if necessary, an option for burnable item support without adding that specific mod would be a name check against a list of strings.


	/**
	 * returns a fuel duration for steam engines
	 * 
	 * @param it
	 * @return
	 */
	public static int steamFuelLast(ItemStack it) {
		if (it == null) {
			return 0;
		} else if (Block.getBlockFromItem(it.getItem()) != null && Block.getBlockFromItem(it.getItem()).getMaterial() == Material.wood){
			//simple if material wood, return the wood burn time
			return burnTimes[0];
		} else{
			//iterate through the burnables list to try and find the item, and return the burn value of it from the burn times list
			for(Item item : burnableItems){
				if(it.getItem() == item){
					return burnTimes[Arrays.asList(burnableItems).indexOf(item) +1];
				}
			}
		}
		//if all else fails, try and get a default value
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