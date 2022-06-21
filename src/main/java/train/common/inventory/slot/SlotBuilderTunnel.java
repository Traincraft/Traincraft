package train.common.inventory.slot;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import train.common.entity.rollingStock.EntityTracksBuilder;

public class SlotBuilderTunnel extends Slot {

	public SlotBuilderTunnel(IInventory inv, int id, int x, int y) {
		super(inv, id, x, y);
	}
	
    /**
     * Check if the stack is a valid item for this slot.
     */
    public boolean isItemValid(ItemStack stack)
    {
        return EntityTracksBuilder.canBeTunnel(stack);
    }

}
