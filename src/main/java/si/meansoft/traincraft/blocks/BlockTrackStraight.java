package si.meansoft.traincraft.blocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import si.meansoft.traincraft.api.AbstractBlockTrack;
import si.meansoft.traincraft.items.ItemBlockBase;
import si.meansoft.traincraft.items.ItemBlockTrack;
import si.meansoft.traincraft.tile.TileEntityTrack;
import si.meansoft.traincraft.track.TrackPoint;

import javax.annotation.Nullable;

/**
 * @author canitzp
 */
public class BlockTrackStraight extends AbstractBlockTrack{

    public BlockTrackStraight(BlockTrack.TrackTypes type){
        super(type, TileEntityTrack.class);
    }

    @Override
    protected ItemBlockBase getItemBlock(AbstractBlockTrack track){
        return new ItemBlockTrack(this);
    }

    @Override
    public void removeTrack(World world, BlockPos pos, boolean dropBlocks){
        TileEntityTrack tile = (TileEntityTrack) world.getTileEntity(pos);
        if (tile != null) {
            if (tile.defaultTrackPosition != null) {
                IBlockState state = world.getBlockState(tile.defaultTrackPosition);
                if (state.getBlock() instanceof BlockTrackStraight) {
                    ((BlockTrackStraight) state.getBlock()).removeTrack(world, tile.defaultTrackPosition, dropBlocks);
                }
            } else if (!tile.toDestroy.isEmpty()) {
                for (BlockPos pos1 : tile.toDestroy) {
                    world.destroyBlock(pos1, dropBlocks);
                }
                world.destroyBlock(tile.getPos(), dropBlocks);
            }
        }
    }

    @Nullable
    @Override
    public TrackPoint getWaypoints(World world, BlockPos pos, IBlockState state, int blockIndex){
        return new TrackPoint(pos).addPoint(0, 8, 1, 8);
    }

    @Override
    public boolean canDriveOver(TileEntityTrack currentTrack, TileEntityTrack incomingTrack){
        return currentTrack.getFacing().equals(incomingTrack.getFacing()) || currentTrack.getFacing().getOpposite().equals(incomingTrack.getFacing());
    }

    @Nullable
    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, World worldIn, BlockPos pos){
        return FLAT_AABB;
    }
}
