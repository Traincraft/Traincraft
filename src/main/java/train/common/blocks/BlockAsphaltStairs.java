package train.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import train.common.library.BlockIDs;

public class BlockAsphaltStairs extends BlockStairs {
    protected BlockAsphaltStairs() {
        super(BlockIDs.asphalt.block, 3);
    }
}
