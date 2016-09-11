package si.meansoft.traincraft.api;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import si.meansoft.traincraft.blocks.BlockTrack;
import si.meansoft.traincraft.tile.TileEntityTrack;
import si.meansoft.traincraft.track.TrackPoint;

import javax.annotation.Nullable;
import java.util.List;

/**
 * @author canitzp
 */
public interface ITraincraftTrack{

    BlockTrack.TrackTypes getTrackType();

    boolean canPlaceTrack(World world, BlockPos pos, EntityLivingBase placer, ItemStack stack, float hitX, float hitY, float hitZ);

    List<BlockPos> getPositionToPlace(World world, BlockPos pos, EntityLivingBase placer, float hitX, float hitY, float hitZ);

    void removeTrack(World world, BlockPos pos, boolean dropBlocks);

    /**
     * The method to set the waypoints for this track. If the result is null the cart can't drive over the track.
     * @param world The world this track is placed in
     * @param pos The position of this block
     * @param state The current state for this block
     * @param blockIndex The index of the track
     * @return The exact coordinates packet into a TrackPoint
     */
    @Nullable
    TrackPoint getWaypoints(World world, BlockPos pos, IBlockState state, int blockIndex);

    boolean canDriveOver(TileEntityTrack thisTrack, TileEntityTrack incomingTrack);

}
