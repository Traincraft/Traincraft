package train.common.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import train.common.api.EntityRollingStock;
import train.common.entity.rollingStock.EntityJukeBoxCart;

public class InventoryJukeBoxCart extends Container {

	private EntityJukeBoxCart jukebox;
	private InventoryPlayer player;

	public InventoryJukeBoxCart(InventoryPlayer iinventory, EntityRollingStock entityminecart) {
		player = iinventory;
		jukebox = (EntityJukeBoxCart) entityminecart;
	}

	@Override
	public boolean canInteractWith(EntityPlayer var1) {
		return !jukebox.isDead;
	}
}