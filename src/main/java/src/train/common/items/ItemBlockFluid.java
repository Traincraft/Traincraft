package src.train.common.items;

import java.util.List;

import src.train.common.blocks.BlockTraincraftFluid;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidBase;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBlockFluid extends ItemBlock {
	@SideOnly(Side.CLIENT)
	private IIcon icon;
	
	private BlockTraincraftFluid fluid;
	private int id;
	
	public ItemBlockFluid(int id, Block fluid) {
		super(id);
		this.id = id;
		this.fluid = (BlockTraincraftFluid) fluid;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister icon) {
		String s = ((Block) fluid).getItemIconName();
		if (s != null) {
			this.icon = icon.registerIcon(s);
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public CreativeTabs getCreativeTab() {
		return ((Block) fluid).getCreativeTabToDisplayOn();
	}

	@Override
	public String getUnlocalizedName(ItemStack par1ItemStack) {
		return ((Block) fluid).getUnlocalizedName();
	}

	@Override
	public String getUnlocalizedName() {
		return ((Block) fluid).getUnlocalizedName();
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(int par1, CreativeTabs par2CreativeTabs, List par3List) {
		((Block) fluid).getSubBlocks(par1, par2CreativeTabs, par3List);
	}
}