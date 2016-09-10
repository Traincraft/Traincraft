package si.meansoft.traincraft.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumBlockRenderType;
import si.meansoft.traincraft.tile.TileEntityWindmill;

/**
 * @author canitzp
 */
public class BlockWindmill extends BlockContainerBase{

    public BlockWindmill(){
        super(Material.IRON, "windmill", TileEntityWindmill.class);
    }

    @Override
    public EnumBlockRenderType getRenderType(IBlockState state){
        return EnumBlockRenderType.ENTITYBLOCK_ANIMATED;
    }
}
