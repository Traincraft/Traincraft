package si.meansoft.traincraft.blocks;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import si.meansoft.traincraft.network.CommonProxy;
import si.meansoft.traincraft.tileentities.TileEntityWindmill;

/**
 * @author canitzp
 */
public class BlockWindmill extends BlockBase implements ITileEntityProvider{

    public BlockWindmill(){
        super(Material.IRON, "windmill");
        CommonProxy.addOBJRender(TileEntityWindmill.class, new TileEntityWindmill.WindmillRenderer());
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side) {
        return false;
    }

    @Override
    public boolean isBlockNormalCube(IBlockState blockState) {
        return false;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state){
        return false;
    }

    @Override
    public IBlockState onBlockPlaced(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer){
        if(!world.isRemote){
            world.setBlockState(pos, getDefaultState(), 2);
            TileEntityWindmill te = (TileEntityWindmill) world.getTileEntity(pos);
            if(te != null){
                te.placeWindmill(placer.getHorizontalFacing());
            }
        }
        return null;
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta){
        return new TileEntityWindmill();
    }
}
