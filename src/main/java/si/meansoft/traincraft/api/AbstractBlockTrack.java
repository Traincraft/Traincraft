package si.meansoft.traincraft.api;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import si.meansoft.traincraft.IRegistryEntry;
import si.meansoft.traincraft.blocks.BlockContainerBase;
import si.meansoft.traincraft.blocks.BlockTrack;
import si.meansoft.traincraft.items.ItemBlockBase;
import si.meansoft.traincraft.tile.TileEntityTrack;

import java.util.List;

/**
 * @author canitzp
 */
public abstract class AbstractBlockTrack extends BlockContainerBase implements ITraincraftTrack{

    private BlockTrack.TrackTypes type;

    protected static final AxisAlignedBB FLAT_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D);

    public AbstractBlockTrack(BlockTrack.TrackTypes type, Class<? extends TileEntityTrack> tileClass){
        super(Material.IRON, "track" + type.getInternName(), tileClass);
        this.type = type;
    }

    @Override
    public IRegistryEntry[] getRegisterElements() {
        return new IRegistryEntry[]{this, getItemBlock(this), createNewTileEntity(null, 0)};
    }

    protected abstract ItemBlockBase getItemBlock(AbstractBlockTrack track);

    @Override
    public BlockTrack.TrackTypes getTrackType(){
        return this.type;
    }

    @Override
    public boolean canPlaceTrack(World world, BlockPos pos, EntityLivingBase placer, ItemStack stack, float hitX, float hitY, float hitZ){
        EnumFacing dir = placer.getHorizontalFacing();
        for (BlockPos pos1 : getTrackType().getGrid().getPosesToAffect(pos, dir, faceLeft(dir, hitX, hitZ))) {
            if (!world.getBlockState(pos1).getBlock().canReplace(world, pos1, dir, stack) || !world.isSideSolid(pos1.down(), EnumFacing.UP)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public List<BlockPos> getPositionToPlace(World world, BlockPos pos, EntityLivingBase placer, float hitX, float hitY, float hitZ){
        EnumFacing dir = placer.getHorizontalFacing();
        return getTrackType().getGrid().getPosesToAffect(pos, dir, getTrackType().isCurve() && faceLeft(dir, hitX, hitZ));
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return FLAT_AABB;
    }

    @Override
    public boolean isPassable(IBlockAccess worldIn, BlockPos pos) {
        return true;
    }

    public boolean faceLeft(EnumFacing facing, float hitX, float hitZ) {
        switch (facing) {
            case NORTH:
                return hitX < 0.5;
            case EAST:
                return hitZ < 0.5;
            case SOUTH:
                return hitX > 0.5;
            case WEST:
                return hitZ > 0.5;
        }
        return false;
    }

}
