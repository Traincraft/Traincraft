package src.train.common.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import src.train.common.api.EntityRollingStock;
import src.train.common.api.Tender;
import src.train.common.entity.rollingStock.EntityJukeBoxCart;
import src.train.common.slots.SlotTender;

public class InventoryJukeBoxCart extends Container {

	private EntityJukeBoxCart jukebox;
	private InventoryPlayer player;
	private int inventorySize;

	public InventoryJukeBoxCart(InventoryPlayer iinventory, EntityRollingStock entityminecart) {
		player = iinventory;
		jukebox = (EntityJukeBoxCart) entityminecart;
	}

	@Override
	public boolean canInteractWith(EntityPlayer var1) {
		if (jukebox.isDead) {
			return false;
		}
		return true;
	}
}