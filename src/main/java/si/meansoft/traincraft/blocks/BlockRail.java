package si.meansoft.traincraft.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import si.meansoft.traincraft.Traincraft;
import si.meansoft.traincraft.Util;
import si.meansoft.traincraft.tileEntities.TileEntityRail;

/**
 * @author canitzp
 */
public class BlockRail extends BlockContainerBase{

    public TrackLength length;
    public TrackDirection direction;

    public BlockRail(String extraName, TrackLength length, TrackDirection direction) {
        super(Material.IRON, "track" + Util.firstCharToUpperCase(length.name) + Util.firstCharToUpperCase(direction.name) + extraName, TileEntityRail.class, new TileEntityRail.RailRenderer(new ResourceLocation(Traincraft.MODID, "block/long_straight")));
        this.length = length;
        this.direction = direction;
    }


    @Override
    public EnumBlockRenderType getRenderType(IBlockState state){
        return EnumBlockRenderType.INVISIBLE;
    }


    @Override
    public BlockRenderLayer getBlockLayer(){
        return BlockRenderLayer.TRANSLUCENT;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state){
        return false;
    }

    @Override
    public IBlockState onBlockPlaced(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer){
        IBlockState state = this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
        if(TrackPlacing.canPlaceTrack(world, pos, this.length, placer.getHorizontalFacing())){
            TrackPlacing.placeTrack(world, (EntityPlayer) placer, pos, state, this.length, this.direction);
            return state;
        }
        return null;
    }

    @Override
    public void breakBlock(World worldIn, BlockPos pos, IBlockState state){
        TrackPlacing.harvestTrack(worldIn, pos, state, (TileEntityRail) worldIn.getTileEntity(pos));
        super.breakBlock(worldIn, pos, state);
    }

    public enum TrackDirection{
        STRAIGHT("straight"),
        CURVE_RIGHT("curveRight"),
        CURVE_LEFT("curveLeft"),
        SPECIAL("");
        public String name;
        TrackDirection(String name){
            this.name = name;
        }
    }
    public enum TrackLength {
        SHORT("short", 1),
        MEDIUM("medium", 3),
        LONG("long", 5);
        public String name;
        public int lenght;
        TrackLength(String name, int length){
            this.name = name;
            this.lenght = length;
        }
    }
}
