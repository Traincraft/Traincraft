/*
 * This file ("ITraincraftTrack.java") is part of the Traincraft mod for Minecraft.
 * It is created by all persons that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/blob/master/LICENSE.md)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2016
 */

package si.meansoft.traincraft.api;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import si.meansoft.traincraft.tile.TileEntityTrack;
import si.meansoft.traincraft.track.TrackPoint;
import si.meansoft.traincraft.track.TrackType;

import javax.annotation.Nullable;
import java.util.List;

/**
 * @author canitzp
 */
public interface ITraincraftTrack{

    TrackType getTrackType();

    boolean canPlaceTrack(World world, BlockPos pos, EntityLivingBase placer, ItemStack stack, float hitX, float hitY, float hitZ, boolean flipAlongX);

    List<BlockPos> getPositionToPlace(World world, BlockPos pos, EntityLivingBase placer, float hitX, float hitY, float hitZ, boolean flipAlongX);

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

    void onMinecartDriveOver(World world, BlockPos pos, IBlockState state, EntityMinecart cart, @Nullable Entity ridingEntity);

}
