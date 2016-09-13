package src.train.common.items;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockGeneratorWaterWheel extends ItemBlock{

	public ItemBlockGeneratorWaterWheel(int id) {
		super(id);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		par3List.add("\u00a77" + "IC2 generator");
		par3List.add("\u00a77" + "Max Production: 3 EU/t");
		par3List.add("\u00a77" + "Output at the sides");
		par3List.add("\u00a77" + "Orients itself automatically");
		par3List.add("\u00a77" + "according to water flow direction");
	}
}
