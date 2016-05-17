package src.train.common.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import src.train.common.blocks.BlockTraincraftFluid;

import java.util.List;

public class ItemBlockFluid extends ItemBlock {

	private BlockTraincraftFluid fluid;
	private int id;

	public ItemBlockFluid(Block block) {
		super(block);
	}

	public ItemBlockFluid(Block id, Block fluid) {
		super(id);
		this.id = Block.getIdFromBlock(id);
		this.fluid = (BlockTraincraftFluid) fluid;
		}

	@Override
	public String getUnlocalizedName(ItemStack par1ItemStack) {
		return ((Block) fluid).getUnlocalizedName();
	}

	@Override
	public String getUnlocalizedName() {
		return ((Block) fluid).getUnlocalizedName();
		}

}