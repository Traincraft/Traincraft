package traincraft.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

public class BaseItemBlock extends ItemBlock {
    
    public BaseItemBlock(Block block) {
        super(block);
        this.setRegistryName(block.getRegistryName());
    }
}
