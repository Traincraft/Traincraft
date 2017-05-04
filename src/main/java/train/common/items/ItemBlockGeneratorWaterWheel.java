package train.common.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemBlockGeneratorWaterWheel extends ItemBlock{

	public ItemBlockGeneratorWaterWheel(Block id) {
		super(id);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		par3List.add("\u00a77" + "RF generator.");
		par3List.add("\u00a77" + "Max Production: 5 RF/t.");
		par3List.add("\u00a77" + "Output at the sides.");
		par3List.add("\u00a77" + "Orients itself automatically");
		par3List.add("\u00a77" + "according to water flow direction.");
	}
}
