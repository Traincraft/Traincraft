package si.meansoft.traincraft.blocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeHooks;
import si.meansoft.traincraft.tileEntities.TileEntityRail;

import java.util.ArrayList;
import java.util.List;

import static si.meansoft.traincraft.blocks.BlockRail.FACING;

/**
 * @author canitzp
 */
public class TrackPlacing {

    public static void placeTrack(World world, EntityPlayer player, BlockPos pos, IBlockState state, BlockRail.TrackLength length, BlockRail.TrackDirection direction){
        EnumFacing facing = player.getHorizontalFacing();
        world.setBlockState(pos, state.withProperty(FACING, facing.getOpposite()), 2);
        switch (direction){
            case STRAIGHT: placeStraight(world, player, pos, state, length, facing);
        }
    }

    private static void placeStraight(World world, EntityPlayer player, BlockPos pos, IBlockState state, BlockRail.TrackLength length, EnumFacing facing){
        switch (facing){
            case NORTH:{
                List<BlockPos> posList = new ArrayList<BlockPos>();
                for(int i = 0; i < length.lenght; i++){
                    posList.add(new BlockPos(pos.getX(), pos.getY(), pos.getZ() - i));
                }
                for(BlockPos setPos : posList){
                    //world.setBlockState(setPos, );
                    ForgeHooks.onPlaceItemIntoWorld(new ItemStack(state.getBlock().getDefaultState().withProperty(FACING, facing.getOpposite()).getBlock()), player, world, setPos, facing, 0, 0, 0, EnumHand.MAIN_HAND);
                    TileEntityRail te = (TileEntityRail) world.getTileEntity(setPos);
                    if(te != null){
                        te.harvestPositions.addAll(posList);
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

}
