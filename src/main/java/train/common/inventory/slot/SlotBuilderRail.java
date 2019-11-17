package train.common.inventory.slot;

import mods.railcraft.api.tracks.RailTools;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import train.common.items.ItemTCRail;
import train.common.items.ItemTCRail.TrackTypes;

public class SlotBuilderRail extends Slot {

	public SlotBuilderRail(IInventory inv, int id, int x, int y) {
		super(inv, id, x, y);
	}
	
    /**
     * Check if the stack is a valid item for this slot.
     * The builder should accept:
     *  - rail, detector rail, golden rail
     *  - iron, steel (why ?)
     *  - small straight TC rail
     */
    public boolean isItemValid(ItemStack stack)
    {
    	if(stack == null)
    		return false;
    	
    	Item item = stack.getItem();
    	
    		// check TC rail
		if(item instanceof ItemTCRail) {
    		return ((ItemTCRail) item).getTrackType() == TrackTypes.SMALL_STRAIGHT;
		}
		
			// check others railcraft items
    	if(RailTools.isTrackItem(stack)) {
    		return true;
    	}
    	    	
    	if(item instanceof ItemBlock) {
    		Block  block = ((ItemBlock) stack.getItem()).field_150939_a;
    		return block == Blocks.rail || block == Blocks.golden_rail || block == Blocks.detector_rail;
    	}
    	
        return false;
    }

}
