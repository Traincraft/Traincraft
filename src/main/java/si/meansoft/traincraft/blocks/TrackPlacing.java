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

    public static void placeTrack(World world, EntityPlayer player, BlockPos pos, IBlockState state, BlockRail.TrackLength length, BlockRail.TrackDirection direction){
        EnumFacing facing = player.getHorizontalFacing();
        //world.setBlockState(pos, state, 2);
        switch(direction){
            case STRAIGHT:{
                if(canPlaceStraightTrack(world, pos, length, facing)){
                    placeStraight(world, player, pos, state, length, facing);
                }
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
                    }
                }
                break;
            }
        }
    }

    public static void harvestTrack(World world, BlockPos pos, IBlockState state, TileEntityRail te){
        for(BlockPos pos1 : te.harvestPositions){
            world.setBlockToAir(pos1);
        }
    }

}
