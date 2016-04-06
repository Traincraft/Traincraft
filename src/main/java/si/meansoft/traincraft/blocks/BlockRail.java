package si.meansoft.traincraft.blocks;

import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import si.meansoft.traincraft.Util;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * @author canitzp
 */
public class BlockRail extends BlockBase{

    public static final PropertyEnum HARVESTTYPE = PropertyEnum.create("trackharvest", TrackHarvestEvent.class);
    public static final PropertyEnum HARVESTTYPE2 = PropertyEnum.create("trackharvest2", TrackHarvestEvent.class);
    public static final PropertyDirection FACING = BlockHorizontal.FACING;
    public TrackLength length;
    public TrackDirection direction;

    public BlockRail(String extraName, TrackLength length, TrackDirection direction) {
        super(Material.iron, "track" + Util.firstCharToUpperCase(length.name) + Util.firstCharToUpperCase(direction.name) + extraName);
        this.length = length;
        this.direction = direction;
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH).withProperty(HARVESTTYPE, TrackHarvestEvent.NORTH).withProperty(HARVESTTYPE2, TrackHarvestEvent.NORTH));
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, FACING, HARVESTTYPE, HARVESTTYPE2);
    }

    public BlockRail(TrackLength length, TrackDirection direction) {
        this("", length, direction);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return 0;
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return getDefaultState();
    }

    @Override
    public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, TileEntity te, ItemStack stack) {
        super.harvestBlock(worldIn, player, pos, state, te, stack);
        TrackHarvestEvent.onHarvestTrack(worldIn, player, pos, state, te, stack);
    }

    @Override
    public void onBlockPlacedBy(World world, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
        EnumFacing facing = placer.getHorizontalFacing();
        world.setBlockState(pos, state.withProperty(FACING, facing.getOpposite()).withProperty(HARVESTTYPE, TrackHarvestEvent.NORTH).withProperty(HARVESTTYPE2, TrackHarvestEvent.NONE), 2);
        switch (facing){
            case NORTH:{
                List<BlockPos> posList = new ArrayList<BlockPos>();
                for(int i = 0; i < this.length.lenght; i++){
                    posList.add(new BlockPos(pos.getX(), pos.getY(), pos.getZ() - i));
                }
                for(BlockPos setPos : posList){
                    world.setBlockState(setPos, this.getDefaultState().withProperty(FACING, facing.getOpposite()).withProperty(HARVESTTYPE, TrackHarvestEvent.NORTH).withProperty(HARVESTTYPE2, TrackHarvestEvent.SOUTH));
                }
            }
        }
    }

    @Override
    public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
        return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
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
    public enum TrackHarvestEvent implements IStringSerializable{
        NORTH,
        EAST,
        SOUTH,
        WEST,
        NORTH_EAST,
        NORTH_WEST,
        SOUTH_EAST,
        SOUTH_WEST,
        NONE;
        @Override
        public String getName() {
            return this.name().toLowerCase(Locale.ROOT);
        }
        public static void onHarvestTrack(World world, EntityPlayer player, BlockPos pos, IBlockState state, TileEntity tileEntity, ItemStack harvestTool){
            TrackHarvestEvent event = (TrackHarvestEvent) state.getValue(HARVESTTYPE);
            switch (event){
                case NORTH:{
                    Util.playerHarvestBlock(world, pos.add(0, 0, -1), player, harvestTool);
                }
            }
        }
    }
}
