package src.train.common.slots;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotCrafterTier extends Slot {

	private EntityPlayer thePlayer;
	private int i;

	public SlotCrafterTier(EntityPlayer entityplayer, IInventory iinventory, int i, int j, int k) {
		super(iinventory, i, j, k);
		thePlayer = entityplayer;
	}

	@Override
	public boolean isItemValid(ItemStack itemstack) {
		return true;
	}

	@Override
	public void onSlotChanged() {
		this.inventory.onInventoryChanged();
	}
}