package src.train.common.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import src.train.common.Traincraft;
import src.train.common.library.Info;
import src.train.common.library.ItemIDs;

public class ItemTrain extends Item {

	public ItemTrain() {
		super();
		maxStackSize = 64;
		setCreativeTab(Traincraft.tcTab);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(Info.modID.toLowerCase() + ":parts/" + ItemIDs.getIcon(Item.getIdFromItem(this)));
	}
}