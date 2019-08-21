package train.common.inventory.slot;

import mods.railcraft.api.core.items.ITrackItem;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRailBase;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import train.common.core.handlers.FuelHandler;
import train.common.items.ItemTCRail;
import train.common.items.ItemTCRail.TrackTypes;

public class SlotBuilderFuel extends Slot {

	public SlotBuilderFuel(IInventory inv, int id, int x, int y) {
		super(inv, id, x, y);
	}
	
    /**
     * Check if the stack is a valid item for this slot.
     */
    public boolean isItemValid(ItemStack stack)
    {
        return FuelHandler.steamFuelLast(stack) > 0;
    }

}
