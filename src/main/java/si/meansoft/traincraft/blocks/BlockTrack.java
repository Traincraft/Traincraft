package si.meansoft.traincraft.blocks;

import jline.internal.Nullable;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import si.meansoft.traincraft.IRegistryEntry;
import si.meansoft.traincraft.Registry;
import si.meansoft.traincraft.Traincraft;
import si.meansoft.traincraft.items.ItemBlockTrack;
import si.meansoft.traincraft.tile.TileEntityTrack;
import si.meansoft.traincraft.track.TrackGrid;
import si.meansoft.traincraft.track.TrackPoint;

import java.util.List;

/**
 * @author canitzp
 */
public class BlockTrack extends BlockContainerBase {

    public final TrackTypes trackType;

    protected static final AxisAlignedBB FLAT_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D);

    public BlockTrack(TrackTypes trackType) {
        super(Material.IRON, "track" + trackType.getInternName(), TileEntityTrack.class);
        this.setCreativeTab(Traincraft.trackTab);
        this.trackType = trackType;
    }

    public static void registerTracks() {
        for (TrackTypes track : TrackTypes.values()) {
            Registry.register(track.block = new BlockTrack(track));
        }
    }

    @Override
    public IRegistryEntry[] getRegisterElements() {
        return new IRegistryEntry[]{this, new ItemBlockTrack(this), createNewTileEntity(null, 0)};
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
    public boolean removedByPlayer(IBlockState state, World world, BlockPos pos, EntityPlayer player, boolean willHarvest) {
        this.removeTrack(world, pos, !player.isCreative());
        return super.removedByPlayer(state, world, pos, player, willHarvest);
    }

    @Override
    public void onBlockExploded(World world, BlockPos pos, Explosion explosion) {
        this.removeTrack(world, pos, world.rand.nextInt(3) == 0);
        super.onBlockExploded(world, pos, explosion);
    }

    public boolean faceLeft(EnumFacing facing, float hitX, float hitZ) {
        switch (facing) {
            case NORTH:
                return hitX < 0.5;
            case EAST:
                return hitZ < 0.5;
            case SOUTH:
                return hitX > 0.5;
            case WEST:
                return hitZ > 0.5;
        }
        return false;
    }

    public boolean canPlaceTrack(World world, BlockPos pos, EntityLivingBase placer, ItemStack stack, float hitX, float hitY, float hitZ) {
        EnumFacing dir = placer.getHorizontalFacing();
        for (BlockPos pos1 : this.trackType.getGrid().getPosesToAffect(pos, dir, faceLeft(dir, hitX, hitZ))) {
            if (!world.getBlockState(pos1).getBlock().canReplace(world, pos1, dir, stack) || !world.isSideSolid(pos1.down(), EnumFacing.UP)) {
                if (placer instanceof EntityPlayerMP)
                    ((EntityPlayerMP) placer).addChatMessage(new TextComponentString("Unable to set: " + pos1.toString()));
                return false;
            }
        }
        return true;
    }

    public List<BlockPos> placeTrack(World world, BlockPos pos, EntityLivingBase placer, float hitX, float hitY, float hitZ) {
        EnumFacing dir = placer.getHorizontalFacing();
        return trackType.grid.getPosesToAffect(pos, dir, trackType.isCurve() && faceLeft(dir, hitX, hitZ));
    }

    public void removeTrack(World world, BlockPos pos, boolean dropBlocks) {
        TileEntityTrack tile = (TileEntityTrack) world.getTileEntity(pos);
        if (tile != null) {
            if (tile.defaultTrackPosition != null) {
                IBlockState state = world.getBlockState(tile.defaultTrackPosition);
                if (state.getBlock() instanceof BlockTrack) {
                    ((BlockTrack) state.getBlock()).removeTrack(world, tile.defaultTrackPosition, dropBlocks);
                }
            } else if (!tile.toDestroy.isEmpty()) {
                for (BlockPos pos1 : tile.toDestroy) {
                    world.destroyBlock(pos1, dropBlocks);
                }
                world.destroyBlock(tile.getPos(), dropBlocks);
            }
        }
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
        if (!worldIn.isRemote) {
            TileEntityTrack tileEntityTrack = (TileEntityTrack) worldIn.getTileEntity(pos);
            //System.out.println(tileEntityTrack == null ? "-null-" : "IndexOfTrack:" + tileEntityTrack.blockIndex);
            //System.out.println(tileEntityTrack == null ? "-null-" : );
            System.out.println("Next position: " + tileEntityTrack.sendRequestToTracks(playerIn.getHorizontalFacing().getOpposite()));
            return true;
        }
        return super.onBlockActivated(worldIn, pos, state, playerIn, hand, heldItem, side, hitX, hitY, hitZ);
    }

    @Override
    public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn) {
        if (this.trackType.isSlope()) {
            int slopeLength = this.trackType.getGrid().getBlockCount();
            TileEntityTrack tileEntityTrack = ((TileEntityTrack) worldIn.getTileEntity(pos));
            if (tileEntityTrack == null) {
                System.out.println("TileEntity is null");
                return;
            }
            if (tileEntityTrack.getFacing() == null) {
                System.out.println("TileEntity#facing is null");
                return;
            }

            if (tileEntityTrack.getFacing() == EnumFacing.DOWN) {
                System.out.println("TileEntity#facing is down");
                return;
            }


            int blockIndex = tileEntityTrack.blockIndex;
            double perBlockDiff = 1d / slopeLength, start = blockIndex * perBlockDiff, end = blockIndex * perBlockDiff + perBlockDiff;

            //TODO: System for steeper tracks = More than 2 boxes


            switch (tileEntityTrack.getFacing()) {
                case SOUTH:
                    addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0, 0, 0, 1, start, .5));
                    addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0, 0, .5, 1, end, 1));
                    break;
                case NORTH:
                    addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0, 0, .5, 1, start, 1));
                    addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0, 0, 0, 1, end, .5));
                    break;
                case WEST:
                    addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0, 0, 0, .5, start, 1));
                    addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(.5, 0, 0, 1, end, 1));
                    break;
                case EAST:
                    addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(.5, 0, 0, 1, start, 1));
                    addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0, 0, 0, .5, end, 1));
                    break;
                default:
                    System.out.println(tileEntityTrack.getFacing()); //Never.

            }

        } else
            addCollisionBoxToList(pos, entityBox, collidingBoxes, FLAT_AABB);

    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        if (trackType.isSlope()) {
            int slopeLength = this.trackType.getGrid().getBlockCount();
            TileEntityTrack tileEntityTrack = ((TileEntityTrack) source.getTileEntity(pos));
            if (tileEntityTrack == null) return FULL_BLOCK_AABB; //Items with NBT data will crash otherwise!
            int blockIndex = tileEntityTrack.blockIndex;
            double perBlockDiff = 1d / slopeLength;
            return new AxisAlignedBB(0, 0, 0, 1, blockIndex * perBlockDiff + perBlockDiff * .5, 1);
        }
        return FLAT_AABB;
    }

    @Override
    public AxisAlignedBB getSelectedBoundingBox(IBlockState state, World worldIn, BlockPos pos) {
        return super.getSelectedBoundingBox(state, worldIn, pos);
    }

    @Override
    public boolean isPassable(IBlockAccess worldIn, BlockPos pos) {
        return true;
    }

    /**
     * The method to set the waypoints for this track. If the result is null the cart can't drive over the track.
     * @param world The world this track is placed in
     * @param pos The position of this block
     * @param state The current state for this block
     * @param blockIndex
     * @return The exact coordinates packet into a TrackPoint
     */
    @Nullable
    public TrackPoint getWaypoints(World world, BlockPos pos, IBlockState state, int blockIndex){
        if(this.trackType.isSlope()){
            double perBlockDiff = 1d / this.trackType.getGrid().getBlockCount();
            float start = (float) (blockIndex * perBlockDiff);
            return new TrackPoint(pos).addPoint(0, 8, start * 16, 8);
        }
        return blockIndex == 0 ? new TrackPoint(pos).addPoint(0, 8, 1, 8) : null;
    }

    public boolean canDriveOver(TileEntityTrack thisTrack, TileEntityTrack incomingTrack){
        return thisTrack.getFacing().equals(incomingTrack.getFacing()) || thisTrack.getFacing().getOpposite().equals(incomingTrack.getFacing());
    }

    public enum TrackTypes {
        TEST_TRACK("TestTrack", TrackGrid.getStraightSlope(16), false, true),
        TEST_CURVE("TestCurve", TrackGrid.getCurve(9), true, false),
        TEST_SLOPE("TestSlope", TrackGrid.getStraightGrid(6), false, true),

        STRAIGHT_SINGLE("StraightSingle", TrackGrid.getStraightGrid(1), false, false),
        STRAIGHT_SHORT("StraightShort", TrackGrid.getStraightGrid(2)),
        STRAIGHT_MIDDLE("StraightMiddle", TrackGrid.getStraightGrid(4)),
        STRAIGHT_LONG("StraightLong", TrackGrid.getStraightGrid(6)),
        STRAIGHT_EXTREME("StraightExtreme", TrackGrid.getStraightGrid(12)),
        STRAIGHT_ULTIMATE("StraightUltimate", TrackGrid.getStraightGrid(18));

        private final String internName;
        private final TrackGrid grid;
        protected BlockTrack block;

        private final boolean isCurve, isSlope;

        TrackTypes(String internName, TrackGrid grid, boolean isCurve, boolean isSlope) {
            this.internName = internName;
            this.grid = grid;
            this.isCurve = isCurve;
            this.isSlope = isSlope;
        }

        TrackTypes(String internName, TrackGrid grid) {
            this(internName, grid, false, false);
        }


        public String getInternName() {
            return internName;
        }

        public TrackGrid getGrid() {
            return grid;
        }

        public BlockTrack getBlock() {
            return block;
        }

        public boolean isCurve() {
            return isCurve;
        }

        public boolean isSlope() {
            return isSlope;
        }
    }
}
