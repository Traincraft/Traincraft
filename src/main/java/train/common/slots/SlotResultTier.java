package train.common.slots;

import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import train.common.core.interfaces.ITier;
import train.common.core.managers.TierRecipeManager;

public class SlotResultTier extends Slot {

	private EntityPlayer thePlayer;
	private ITier tier2;
	/** The craft matrix inventory linked to this result slot. */
	private final IInventory craftMatrix;

	public SlotResultTier(EntityPlayer entityplayer, IInventory iinventory, int i, int j, int k) {
		super(iinventory, i, j, k);
		thePlayer = entityplayer;
		tier2 = (ITier) iinventory;
		craftMatrix = iinventory;
	}

	@Override
	public boolean isItemValid(ItemStack itemstack) {
		return false;
	}

	@Override
	public void onSlotChanged() {
		this.inventory.markDirty();
	}

	@Override
	public void onPickupFromSlot(EntityPlayer player, ItemStack itemstack) {
		for (int i = 0; i < 10; i++) {
			if (inventory.getStackInSlot(i) != null) {
				inventory.decrStackSize(i, TierRecipeManager.getInstance().getTierRecipe(tier2.Tier(), itemstack).toDecrease(i));
			}
		}
		this.onCrafting(itemstack);
		super.onPickupFromSlot(player, itemstack);
		FMLCommonHandler.instance().firePlayerCraftingEvent(player, itemstack, craftMatrix);
	}
}