package train.common.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;
import train.common.library.BlockIDs;

public class ItemAsphaltSlab extends ItemSlab
{
    public ItemAsphaltSlab(Block block)
    {
        super(block, (BlockSlab) BlockIDs.asphaltSlab.block, (BlockSlab) BlockIDs.asphaltDoubleSlab.block, block == (BlockSlab)  BlockIDs.asphaltDoubleSlab.block);
        this.setUnlocalizedName("asphalt slab");
        System.out.println(this.getUnlocalizedName());
    }
}
