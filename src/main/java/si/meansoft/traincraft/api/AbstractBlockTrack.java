package si.meansoft.traincraft.api;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import si.meansoft.traincraft.IRegistryEntry;
import si.meansoft.traincraft.Traincraft;
import si.meansoft.traincraft.blocks.BlockContainerBase;
import si.meansoft.traincraft.items.ItemBlockBase;
import si.meansoft.traincraft.tile.TileEntityTrack;
import si.meansoft.traincraft.track.TrackType;

import java.util.List;

/**
 * @author canitzp
 */
public abstract class AbstractBlockTrack extends BlockContainerBase implements ITraincraftTrack{

    private TrackType type;

    protected static final AxisAlignedBB FLAT_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D);

    public AbstractBlockTrack(TrackType type, Class<? extends TileEntityTrack> tileClass){
        super(Material.IRON, "track" + type.getInternName(), tileClass);
        this.setCreativeTab(Traincraft.trackTab);
        this.type = type;
    }

    @Override
    public IRegistryEntry[] getRegisterElements() {
        return new IRegistryEntry[]{this, getItemBlock(this), createNewTileEntity(null, 0)};
    }

    protected abstract ItemBlockBase getItemBlock(AbstractBlockTrack track);

    @Override
    public TrackType getTrackType(){
        return this.type;
    }

    @Override
    public boolean canPlaceTrack(World world, BlockPos pos, EntityLivingBase placer, ItemStack stack, float hitX, float hitY, float hitZ, boolean flipAlongX){
        EnumFacing dir = placer.getHorizontalFacing();
        for (BlockPos pos1 : getTrackType().getGrid().getPosesToAffect(pos, dir, flipAlongX)) {
            if (!world.getBlockState(pos1).getBlock().canReplace(world, pos1, dir, stack) || !world.isSideSolid(pos1.down(), EnumFacing.UP)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public List<BlockPos> getPositionToPlace(World world, BlockPos pos, EntityLivingBase placer, float hitX, float hitY, float hitZ, boolean flipAlongX){
        EnumFacing dir = placer.getHorizontalFacing();
        return getTrackType().getGrid().getPosesToAffect(pos, dir, getTrackType().isCurve() && flipAlongX);
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return FLAT_AABB;
    }

    @Override
    public boolean isPassable(IBlockAccess worldIn, BlockPos pos) {
        return true;
    }

    @Override
    public boolean removedByPlayer(IBlockState state, World world, BlockPos pos, EntityPlayer player, boolean willHarvest) {
        this.removeTrack(world, pos, !player.isCreative());
        return super.removedByPlayer(state, world, pos, player, willHarvest);
    }

    @Override
    public void onBlockExploded(World world, BlockPos pos, Explosion explosion) {
        this.removeTrack(world, pos, world.rand.nextInt(3) == 0);
        super.onBlockExploded(world, pos, explosion);
    }


}
