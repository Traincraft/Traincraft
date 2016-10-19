package train.common.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import train.common.blocks.BlockTraincraftFluid;

public class ItemBlockFluid extends ItemBlock{

	private BlockTraincraftFluid fluid;
	private int id;

	public ItemBlockFluid(Block block){
		super(block);
	}

	public ItemBlockFluid(Block id, Block fluid){
		super(id);
		this.id = Block.getIdFromBlock(id);
		this.fluid = (BlockTraincraftFluid) fluid;
	}

}