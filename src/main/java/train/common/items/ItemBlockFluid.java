package train.common.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import train.common.blocks.BlockTraincraftFluid;

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