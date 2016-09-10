package si.meansoft.traincraft.blocks;

import jline.internal.Nullable;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import si.meansoft.traincraft.IRegistryEntry;
import si.meansoft.traincraft.PropertyExtendedInteger;
import si.meansoft.traincraft.Registry;
import si.meansoft.traincraft.Traincraft;
import si.meansoft.traincraft.items.ItemBlockBase;
import si.meansoft.traincraft.items.ItemBlockTrack;
import si.meansoft.traincraft.tile.TileEntityRail;
import si.meansoft.traincraft.tile.TileEntityTrack;
import si.meansoft.traincraft.track.TrackGrid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author canitzp
 */
public class BlockTrack extends BlockContainerBase{

    public final TrackTypes trackType;

    public BlockTrack(TrackTypes trackType){
        super(Material.IRON, "track" + trackType.name, TileEntityTrack.class);
        this.setCreativeTab(Traincraft.trackTab);
        this.trackType = trackType;
    }

    public static void registerTracks(){
        for(TrackTypes track : TrackTypes.values()){
            Registry.register(track.block = new BlockTrack(track));
        }
    }

    @Override
    public IRegistryEntry[] getRegisterElements(){
        return new IRegistryEntry[]{this, new ItemBlockTrack(this), createNewTileEntity(null, 0)};
    }

    private boolean faceLeft(EnumFacing facing, float hitX, float hitZ){
        switch(facing){
            case NORTH: return hitX < 0.5;
            case EAST: return hitZ < 0.5 ;
            case SOUTH: return hitX > 0.5 ;
            case WEST: return hitZ > 0.5 ;
        }
        return false;
    }

    public boolean canPlaceTrack(World world, BlockPos pos, EntityLivingBase placer, ItemStack stack, float hitX, float hitY, float hitZ){
            EnumFacing dir = placer.getHorizontalFacing();
            for(BlockPos pos1 : this.trackType.grid.getPosesToAffect(pos, dir, faceLeft(dir, hitX, hitZ))){
                System.out.println(world.getBlockState(pos1));
                if(!world.getBlockState(pos1).getBlock().canReplace(world, pos1, dir, stack) || world.isAirBlock(pos1.down())){
                    return false;
                }
            }

        return true;
    }

    public List<BlockPos> placeTrack(World world, BlockPos pos, EntityLivingBase placer, float hitX, float hitY, float hitZ){
        EnumFacing dir = placer.getHorizontalFacing();
        List<BlockPos> poses = trackType.grid.getPosesToAffect(pos, dir, faceLeft(dir, hitX, hitZ));
        for(BlockPos pos1 : poses){
            //world.setBlockState(pos1, this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite()));
        }
        return poses;
    }

    public enum TrackTypes{
        TEST_TRACK("TestTrack", TrackGrid.getStraightSlope(6)),

        STRAIGHT_SINGLE("StraightSingle", TrackGrid.getStraightGrid(1)),
        STRAIGHT_SHORT("StraightShort", TrackGrid.getStraightGrid(2)),
        STRAIGHT_MIDDLE("StraightMiddle", TrackGrid.getStraightGrid(4)),
        STRAIGHT_LONG("StraightLong", TrackGrid.getStraightGrid(6)),
        STRAIGHT_EXTREME("StraightExtreme", TrackGrid.getStraightGrid(12)),
        STRAIGHT_ULTIMATE("StraightUltimate", TrackGrid.getStraightGrid(18));

        public String name;
        public TrackGrid grid;
        public BlockTrack block;

        TrackTypes(String name, TrackGrid grid){
            this.name = name;
            this.grid = grid;
        }
    }

}
