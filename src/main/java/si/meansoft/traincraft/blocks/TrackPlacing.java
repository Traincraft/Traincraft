package si.meansoft.traincraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import si.meansoft.traincraft.tile.TileEntityRail;

import java.util.ArrayList;
import java.util.List;

/**
 * @author canitzp
 */
public class TrackPlacing {

    public static void placeTrack(World world, EntityPlayer player, BlockPos pos, IBlockState state, float hitX, float hitY, float hitZ, BlockRail.TrackLength length, BlockRail.TrackDirection direction){
        EnumFacing facing = player.getHorizontalFacing();
        switch(direction){
            case STRAIGHT:{
                if(canPlaceStraightTrack(world, pos, length, facing)){
                    placeStraight(world, player, pos, state, length, facing);
                }
                break;
            }
            case CURVE:{
                CurveDirection curveDirection = getCurveDirection(facing, hitX, hitZ);
                //if(canPlaceCurve(world, player, pos, length, facing, curveDirection)){
                    placeCurved(world, player, pos, state, length, facing, curveDirection);
                //}
                break;
            }
        }
    }

    public static boolean canPlaceStraightTrack(World world, BlockPos pos, BlockRail.TrackLength length, EnumFacing facing){
        System.out.println(facing);
        switch(facing){
            case NORTH:{
                System.out.println(facing);
                for(int i = 0; i < length.lenght; i++){
                    BlockPos newPos = pos.add(0, 0, -i);
                    Block block = world.getBlockState(newPos).getBlock();
                    if(!(pos.equals(newPos) && block instanceof BlockRail) && !(block == Blocks.AIR)){
                        return false;
                    }
                }
                return true;
            }
            case EAST:{
                System.out.println(facing);
                for(int i = 0; i < length.lenght; i++){
                    BlockPos newPos = pos.add(i, 0, 0);
                    Block block = world.getBlockState(newPos).getBlock();
                    if(!(pos.equals(newPos) && block instanceof BlockRail) && !(block == Blocks.AIR)){
                        return false;
                    }
                }
                return true;
            }
            case SOUTH:{
                System.out.println(facing);
                for(int i = 0; i < length.lenght; i++){
                    BlockPos newPos = pos.add(0, 0, i);
                    Block block = world.getBlockState(newPos).getBlock();
                    if(!(pos.equals(newPos) && block instanceof BlockRail) && !(block == Blocks.AIR)){

                        return false;
                    }
                }
                return true;
            }
            case WEST:{
                System.out.println(facing);
                for(int i = 0; i < length.lenght; i++){
                    BlockPos newPos = pos.add(-i, 0, 0);
                    Block block = world.getBlockState(newPos).getBlock();
                    if(!(pos.equals(newPos) && block instanceof BlockRail) && !(block == Blocks.AIR)){

                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private static void placeStraight(World world, EntityPlayer player, BlockPos pos, IBlockState state, BlockRail.TrackLength length, EnumFacing facing){
        switch (facing){
            case NORTH:{
                List<BlockPos> posList = new ArrayList<BlockPos>();
                for(int i = 0; i < length.lenght; i++){
                    posList.add(new BlockPos(pos.getX(), pos.getY(), pos.getZ() - i));
                }
                for(BlockPos setPos : posList){
                    world.setBlockState(setPos, state);
                    TileEntityRail te = (TileEntityRail) world.getTileEntity(setPos);
                    if(te != null){
                        te.placeTrack(posList, facing);
                    }
                }
                break;
            }
            case EAST:{
                List<BlockPos> posList = new ArrayList<BlockPos>();
                for(int i = 0; i < length.lenght; i++){
                    posList.add(new BlockPos(pos.getX() + i, pos.getY(), pos.getZ()));
                }
                for(BlockPos setPos : posList){
                    world.setBlockState(setPos, state);
                    TileEntityRail te = (TileEntityRail) world.getTileEntity(setPos);
                    if(te != null){
                        te.placeTrack(posList, facing);
                        te.renderRotate(0, 90, 0);
                    }
                }
                break;
            }
            case SOUTH:{
                List<BlockPos> posList = new ArrayList<BlockPos>();
                for(int i = 0; i < length.lenght; i++){
                    posList.add(new BlockPos(pos.getX(), pos.getY(), pos.getZ() + i));
                }
                for(BlockPos setPos : posList){
                    world.setBlockState(setPos, state);
                    TileEntityRail te = (TileEntityRail) world.getTileEntity(setPos);
                    if(te != null){
                        te.placeTrack(posList, facing);
                    }
                }
                break;
            }
            case WEST:{
                List<BlockPos> posList = new ArrayList<BlockPos>();
                for(int i = 0; i < length.lenght; i++){
                    posList.add(new BlockPos(pos.getX() - i, pos.getY(), pos.getZ()));
                }
                for(BlockPos setPos : posList){
                    world.setBlockState(setPos, state);
                    TileEntityRail te = (TileEntityRail) world.getTileEntity(setPos);
                    if(te != null){
                        te.placeTrack(posList, facing);
                        te.renderRotate(0, 90, 0);
                        te.renderTranslate(0, 0, 0);
                    }
                }
                break;
            }
        }
    }

    public static CurveDirection getCurveDirection(EnumFacing facing, float hitX, float hitZ){
        switch(facing){
            case NORTH: return hitX < 0.5 ? CurveDirection.LEFT : CurveDirection.RIGHT;
            case EAST: return hitZ < 0.5 ? CurveDirection.LEFT : CurveDirection.RIGHT;
            case SOUTH: return hitX > 0.5 ? CurveDirection.LEFT : CurveDirection.RIGHT;
            case WEST: return hitZ > 0.5 ? CurveDirection.LEFT : CurveDirection.RIGHT;
        }
        return CurveDirection.NONE;
    }

    public static boolean canPlaceCurve(World world, EntityPlayer player, BlockPos pos, BlockRail.TrackLength length, EnumFacing facing, CurveDirection curveDirection){
        switch(curveDirection){
            case RIGHT:{

            }
        }
        return false;
    }

    public static void placeCurved(World world, EntityPlayer player, BlockPos pos, IBlockState state, BlockRail.TrackLength length, EnumFacing facing, CurveDirection direction){
        switch(direction){
            case RIGHT:{
                switch(facing){
                    case NORTH:{
                        switch(length){
                            case SHORT:{
                                List<BlockPos> posList = new ArrayList<BlockPos>();
                                posList.add(new BlockPos(pos.getX(), pos.getY(), pos.getZ()));
                                posList.add(new BlockPos(pos.getX(), pos.getY(), pos.getZ() - 1));
                                posList.add(new BlockPos(pos.getX() + 1, pos.getY(), pos.getZ() - 1));
                                posList.add(new BlockPos(pos.getX() + 1, pos.getY(), pos.getZ() - 2));
                                posList.add(new BlockPos(pos.getX() + 2, pos.getY(), pos.getZ() - 2));
                                for(int i = 0; i < posList.size(); i++){
                                    BlockPos setPos = posList.get(i);
                                    world.setBlockState(setPos, state);
                                    TileEntityRail te = (TileEntityRail) world.getTileEntity(setPos);
                                    if(te != null){
                                        te.placeTrack(posList, facing);
                                        if(i == 0){
                                            te.renderRotate(0, 90, 0);
                                            te.renderTranslate(-1, 0, 3);
                                        } else if(i == 4){
                                            te.renderRotate(0, 90, 0);
                                            te.renderTranslate(-3, 0, 1);
                                        } else {
                                            te.renderOff();
                                        }

                                    }
                                }
                                break;
                            }
                        }
                        break;
                    }
                    case EAST:{
                        switch(length){
                            case SHORT:{
                                List<BlockPos> posList = new ArrayList<BlockPos>();
                                posList.add(new BlockPos(pos.getX(), pos.getY(), pos.getZ()));
                                posList.add(new BlockPos(pos.getX() + 1, pos.getY(), pos.getZ()));
                                posList.add(new BlockPos(pos.getX() + 1, pos.getY(), pos.getZ() + 1));
                                posList.add(new BlockPos(pos.getX() + 2, pos.getY(), pos.getZ() + 1));
                                posList.add(new BlockPos(pos.getX() + 2, pos.getY(), pos.getZ() + 2));
                                for(int i = 0; i < posList.size(); i++){
                                    BlockPos setPos = posList.get(i);
                                    world.setBlockState(setPos, state);
                                    TileEntityRail te = (TileEntityRail) world.getTileEntity(setPos);
                                    if(te != null){
                                        te.placeTrack(posList, facing);
                                        if(i == 0){
                                            te.renderTranslate(-1, 0, 3);
                                        } else if(i == 4){
                                            te.renderTranslate(-3, 0, 1);
                                        } else {
                                            te.renderOff();
                                        }
                                    }
                                }
                                break;
                            }
                        }
                        break;
                    }
                    case SOUTH:{
                        switch(length){
                            case SHORT:{
                                List<BlockPos> posList = new ArrayList<BlockPos>();
                                posList.add(new BlockPos(pos.getX(), pos.getY(), pos.getZ()));
                                posList.add(new BlockPos(pos.getX(), pos.getY(), pos.getZ() + 1));
                                posList.add(new BlockPos(pos.getX() - 1, pos.getY(), pos.getZ() + 1));
                                posList.add(new BlockPos(pos.getX() - 1, pos.getY(), pos.getZ() + 2));
                                posList.add(new BlockPos(pos.getX() - 2, pos.getY(), pos.getZ() + 2));
                                for(int i = 0; i < posList.size(); i++){
                                    BlockPos setPos = posList.get(i);
                                    world.setBlockState(setPos, state);
                                    TileEntityRail te = (TileEntityRail) world.getTileEntity(setPos);
                                    if(te != null){
                                        te.placeTrack(posList, facing);
                                        if(i == 0){
                                            te.renderRotate(0, -90, 0);
                                            te.renderTranslate(-1, 0, 3);
                                        } else if(i == 4){
                                            te.renderRotate(0, -90, 0);
                                            te.renderTranslate(-3, 0, 1);
                                        } else {
                                            te.renderOff();
                                        }

                                    }
                                }
                                break;
                            }
                        }
                        break;
                    }
                    case WEST:{
                        switch(length){
                            case SHORT:{
                                List<BlockPos> posList = new ArrayList<BlockPos>();
                                posList.add(new BlockPos(pos.getX(), pos.getY(), pos.getZ()));
                                posList.add(new BlockPos(pos.getX() - 1, pos.getY(), pos.getZ()));
                                posList.add(new BlockPos(pos.getX() - 1, pos.getY(), pos.getZ() - 1));
                                posList.add(new BlockPos(pos.getX() - 2, pos.getY(), pos.getZ() - 1));
                                posList.add(new BlockPos(pos.getX() - 2, pos.getY(), pos.getZ() - 2));
                                for(int i = 0; i < posList.size(); i++){
                                    BlockPos setPos = posList.get(i);
                                    world.setBlockState(setPos, state);
                                    TileEntityRail te = (TileEntityRail) world.getTileEntity(setPos);
                                    if(te != null){
                                        te.placeTrack(posList, facing);
                                        if(i == 0){
                                            te.renderRotate(0, 180, 0);
                                            te.renderTranslate(-1, 0, 3);
                                        } else if(i == 4){
                                            te.renderRotate(0, 180, 0);
                                            te.renderTranslate(-3, 0, 1);
                                        } else {
                                            te.renderOff();
                                        }
                                    }
                                }
                                break;
                            }
                        }
                        break;
                    }
                }
            }
        }
    }

    public static void harvestTrack(World world, BlockPos pos, IBlockState state, TileEntityRail te){
        for(BlockPos pos1 : te.harvestPositions){
            world.setBlockToAir(pos1);
        }
    }

    private enum CurveDirection{
        RIGHT,
        LEFT,
        NONE
    }

}
