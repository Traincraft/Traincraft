package src.train.common.items;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import src.train.common.Traincraft;
import src.train.common.library.Info;
import src.train.common.library.ItemIDs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemStacked extends Item {

	public ItemStacked(int i, int maxUse) {
		super(i);
		maxStackSize = 1;
		this.setMaxDamage(maxUse);
		setCreativeTab(Traincraft.tcTab);
	}

	@Override
	public boolean isFull3D() {
		return true;
	}

	@Override
	public boolean shouldRotateAroundWhenRendering() {
		return true;
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		par3List.add("\u00a77" + "Right click on a rolling stock");
		par3List.add("\u00a77" + " to enter attaching mode.");
		par3List.add("\u00a77" + "Click a few time to reset links.");
		par3List.add("\u00a77" + "Sneak+Right click on a locomotive");
		par3List.add("\u00a77" + " to set mode: 'Can pull/Can be pulled'");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(Info.modID.toLowerCase() + ":parts/" + ItemIDs.getIcon(this.itemID));
	}
}