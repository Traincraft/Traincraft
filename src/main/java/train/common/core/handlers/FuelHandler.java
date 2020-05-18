package train.common.core.handlers;

import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityFurnace;
import train.common.library.BlockIDs;

public class FuelHandler implements IFuelHandler {

	/**
	 * returns a fuel duration for steam engines
	 * 
	 * @param it
	 * @return
	 */
	public static int steamFuelLast(ItemStack it) {
		if (it == null) {
			return 0;
		} else {
			//iterate through the burnables list to try and find the item, and return the burn value of it from the burn times list
			return TileEntityFurnace.getItemBurnTime(it);
		}
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