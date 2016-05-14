package src.train.common.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import src.train.common.api.EntityRollingStock;
import src.train.common.entity.rollingStock.EntityJukeBoxCart;

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