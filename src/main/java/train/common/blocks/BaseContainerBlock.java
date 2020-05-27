package train.common.blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import train.common.tile.BaseTile;
import traincraft.items.BaseItemBlock;

public abstract class BaseContainerBlock extends BlockContainer implements IItemBlockSupplier {
    
    protected BaseContainerBlock(Material materialIn) {
        super(materialIn);
    }
    
    protected BaseContainerBlock(Material materialIn, MapColor color) {
        super(materialIn, color);
    }
    
    @Override
    public void breakBlock(World world, BlockPos pos, IBlockState state) {
        TileEntity tile = world.getTileEntity(pos);
        if(tile instanceof BaseTile){
            ((BaseTile) tile).onBlockBreak(state);
        }
        super.breakBlock(world, pos, state);
    }
    
    @Override
    public void onBlockPlacedBy(World world, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
        super.onBlockPlacedBy(world, pos, state, placer, stack);
        TileEntity tile = world.getTileEntity(pos);
        if(tile instanceof BaseTile){
            ((BaseTile) tile).onBlockPlacedBy(placer, stack);
        }
    }
    
    @Override
    public ItemBlock getItemBlock() {
        return new BaseItemBlock(this);
    }
}
