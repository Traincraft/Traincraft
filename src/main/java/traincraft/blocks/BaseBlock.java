package traincraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import traincraft.items.BaseItemBlock;

public class BaseBlock extends Block implements IItemBlockSupplier {
    
    public BaseBlock(Material blockMaterialIn, MapColor blockMapColorIn) {
        super(blockMaterialIn, blockMapColorIn);
    }
    
    public BaseBlock(Material materialIn) {
        super(materialIn);
    }
    
    @Override
    public ItemBlock getItemBlock() {
        return new BaseItemBlock(this);
    }
    
    @Override
    public String getTranslationKey() {
        return this.getRegistryName().toString();
    }
    
}
