package si.meansoft.traincraft.blocks;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import si.meansoft.traincraft.tile.TileEntityWindmill;

/**
 * @author canitzp
 */
public class BlockWindmill extends BlockBase implements ITileEntityProvider{

    public BlockWindmill(){
        super(Material.IRON, "windmill");
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta){
        return new TileEntityWindmill();
    }
}
