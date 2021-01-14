package train.core.handlers;

import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import train.blocks.TCBlocks;
import train.library.BlockIDs;

public class FuelHandler implements IFuelHandler {

	/**
	 * consumption rates of fuel and water 1 second = about 20 ticks default is 80 which mean 1 unit of fuel each 4 seconds The smaller the more it consumes 20 means each second one unit of fuel is consumed
	 * 
	 * water: this is a chance rate on each tick Default value for Fuel is 200 which mean 1 chance over 200 to consume one unit of water
	 */
	@Override
	public int getBurnTime(ItemStack fuel) {
		if(Item.getIdFromItem(fuel.getItem()) == Item.getIdFromItem(Item.getItemFromBlock(TCBlocks.orePetroleum)) && (fuel.getItemDamage() == 1 || fuel.getItemDamage() == 2)){
			return 2400;
		}
		return 0;
	}
}