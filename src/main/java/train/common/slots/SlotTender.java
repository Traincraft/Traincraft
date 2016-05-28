package train.common.slots;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import train.common.api.LiquidManager;
import train.common.core.handlers.FuelHandler;

public class SlotTender extends Slot {

	public SlotTender(IInventory iinventory, int i, int j, int k) {
		super(iinventory, i, j, k);
	}
	
	@Override
	public boolean isItemValid(ItemStack itemstack) {
		if (LiquidManager.getInstance().isContainer(itemstack))
			return true;
		if (FuelHandler.steamFuelLast(itemstack) > 0) {
			return true;
		}
		return false;
	}
}
