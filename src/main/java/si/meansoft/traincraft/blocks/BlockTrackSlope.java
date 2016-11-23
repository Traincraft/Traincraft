/*
 * This file ("BlockTrackSlope.java") is part of the Traincraft mod for Minecraft.
 * It is created by all persons that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/LICENSE.MD)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2016
 */

package si.meansoft.traincraft.blocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import si.meansoft.traincraft.Registry;
import si.meansoft.traincraft.tile.TileEntityTrack;
import si.meansoft.traincraft.track.TrackPoint;
import si.meansoft.traincraft.track.TrackType;

import javax.annotation.Nullable;
import java.util.List;

/**
 * @author canitzp
 */
public class BlockTrackSlope extends BlockTrackStraight{

    public BlockTrackSlope(TrackType type){
        super(type);
    }

    public static void register(){
        for(TrackType type : TrackType.values()){
            if(type.isSlope()){
                Registry.register(type.setBlock(new BlockTrackSlope(type)));
            }
        }
    }

	@Nullable
	@Override
	public TrackPoint getWaypoints(World world, BlockPos pos, IBlockState state, int blockIndex) {
		float start = (float) (blockIndex * (1d / this.getTrackType().getGrid().getBlockCount()));
		return new TrackPoint(pos).addPoint(0, 8, Math.max(1, start * 16), 8);
	}

    @Override
    public void addCollisionBoxToList(IBlockState state, World world, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn){
        EnumFacing facing = state.getValue(FACING);
        if(facing.getHorizontalIndex() != -1){
            TileEntityTrack tile = (TileEntityTrack) world.getTileEntity(pos);
            if(tile != null){
                int blockIndex = tile.blockIndex;
                double perBlockDiff = 1d / getTrackType().getGrid().getBlockCount(), start = blockIndex * perBlockDiff, end = blockIndex * perBlockDiff + perBlockDiff;
                //TODO: System for steeper tracks = More than 2 boxes
                switch (facing) {
                    case SOUTH:
                        addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0, 0, 0, 1, start, 0.5));
                        addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0, 0, 0.5, 1, end, 1));
                        break;
                    case NORTH:
                        addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0, 0, 0.5, 1, start, 1));
                        addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0, 0, 0, 1, end, 0.5));
                        break;
                    case WEST:
                        addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0, 0, 0, 0.5, start, 1));
                        addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.5, 0, 0, 1, end, 1));
                        break;
                    case EAST:
                        addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.5, 0, 0, 1, start, 1));
                        addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0, 0, 0, 0.5, end, 1));
                        break;
                }
                return;
            }
        }
        super.addCollisionBoxToList(state, world, pos, entityBox, collidingBoxes, entityIn);
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess world, BlockPos pos){
        TileEntityTrack tileEntityTrack = ((TileEntityTrack) world.getTileEntity(pos));
        if (tileEntityTrack != null){
            double perBlockDiff = 1d / this.getTrackType().getGrid().getBlockCount();
            return new AxisAlignedBB(0, 0, 0, 1, Math.max(0.125, Math.min(1, tileEntityTrack.blockIndex * perBlockDiff + perBlockDiff * 0.5)), 1);
        }
        return super.getBoundingBox(state, world, pos);
    }

}
