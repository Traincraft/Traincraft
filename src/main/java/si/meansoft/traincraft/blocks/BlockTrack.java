package si.meansoft.traincraft.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import si.meansoft.traincraft.PropertyExtendedInteger;
import si.meansoft.traincraft.track.TrackGrid;

import java.util.Arrays;

/**
 * @author canitzp
 */
public class BlockTrack extends BlockBase{

    public static final PropertyExtendedInteger BASETRACK_X = PropertyExtendedInteger.create("BaseTrackX", -30000, 30000);
    public static final PropertyExtendedInteger BASETRACK_Y = PropertyExtendedInteger.create("BaseTrackY", -30000, 30000);
    public static final PropertyExtendedInteger BASETRACK_Z = PropertyExtendedInteger.create("BaseTrackZ", -30000, 30000);

    public final TrackTypes trackType;

    public BlockTrack(TrackTypes trackType){
        super(Material.IRON, trackType.name);
        this.trackType = trackType;
    }

    @Override
    public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer){
        if(!worldIn.isRemote){
            if(meta == -1){
                //this means that this is a additional track to base track. the base track positions are hitX, hitY, hitZ
                return super.onBlockPlaced(worldIn, pos, facing, hitX, hitY, hitZ, meta, placer).withProperty(BASETRACK_X, (int)hitX).withProperty(BASETRACK_Y, (int)hitY).withProperty(BASETRACK_Z, (int)hitZ);
            }
            //getBlocksToSet(TrackTypes.STRAIGHT_ULTIMATE);
            for(BlockPos pos1 : TrackGrid.STRAIGHT_SHORT.getPosesToAffect(pos, EnumFacing.WEST)){
                worldIn.setBlockState(pos1, Blocks.PLANKS.getDefaultState());
            }
        }
        return super.onBlockPlaced(worldIn, pos, facing, hitX, hitY, hitZ, meta, placer);
    }

    //boolean[y-level][x-pos][z-pos] - looks like straight short: {{{true}, {true}}}
    public static boolean[][][] getBlocksToSet(TrackTypes trackType){
        if(trackType.name.startsWith("Straight")){
            int[] l = trackType.length;
            boolean[][][] ary = new boolean[1][l[0]-1][1];
            for(int x = 0; x < (l[0]-1); x++){
                ary[0][x][0] = true;
            }
            System.out.println(Arrays.deepToString(ary));
            return ary;
        }
        //TODO predefined arrays for slopes, switches, etc
        return null;
    }

    public enum TrackTypes{
        STRAIGHT_SINGLE("StraightSingle", new int[]{1, 0, 0}),
        STRAIGHT_SHORT("StraightShort", new int[]{2, 0, 0}),
        STRAIGHT_MIDDLE("StraightMiddle", new int[]{4, 0, 0}),
        STRAIGHT_LONG("StraightLong", new int[]{6, 0, 0}),
        STRAIGHT_EXTREME("StraightExtreme", new int[]{12, 0, 0}),
        STRAIGHT_ULTIMATE("StraightUltimate", new int[]{18, 0, 0});

        public String name;
        //{x, y, z}
        public int[] length;

        TrackTypes(String name, int[] length){
            this.name = name;
            this.length = length;
        }
    }

}
