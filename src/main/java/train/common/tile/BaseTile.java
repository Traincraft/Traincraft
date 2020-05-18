package train.common.tile;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public class BaseTile extends TileEntity {
    
    public void onBlockBreak(IBlockState state){
        // drop inventory if present
    }
    
    public void onBlockPlacedBy(EntityLivingBase placer, ItemStack stack){
    
    }
    
}
