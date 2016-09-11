package si.meansoft.traincraft.tile;

import com.google.common.collect.Lists;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.VertexBuffer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagLong;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import si.meansoft.traincraft.blocks.BlockTrack;
import si.meansoft.traincraft.track.TrackPoint;

import java.util.ArrayList;
import java.util.List;


/**
 * @author canitzp
 */
public class TileEntityTrack extends TileEntityBase {

    public List<BlockPos> toDestroy = new ArrayList<>();
    public BlockPos defaultTrackPosition;
    public TrackPoint waypoints;

    public int blockIndex = -1;
    private EnumFacing facing;
    public boolean aimsLeft = false;

    public TileEntityTrack() {
        super("Track");
    }

    public void create(BlockPos defaultTrackPosition, int blockIndex, EnumFacing enumFacing) {
        this.defaultTrackPosition = defaultTrackPosition;
        this.blockIndex = blockIndex;
        this.facing = enumFacing;
        this.getWaypoints();
    }

    public void create(List<BlockPos> poses, int blockIndex, boolean aimsLeft, EnumFacing enumFacing) {
        this.toDestroy = poses;
        this.blockIndex = blockIndex;
        this.facing = enumFacing;
        this.aimsLeft = aimsLeft;
        this.getWaypoints();
    }

    public void getWaypoints(){
        if(this.getWorld() != null){
            IBlockState state = this.getWorld().getBlockState(this.getPos());
            if(state.getBlock() instanceof BlockTrack){
                this.waypoints = ((BlockTrack) state.getBlock()).getWaypoints(this.getWorld(), this.getPos(), state, blockIndex);
            }
        }
    }

    @Override
    public NBTTagCompound getUpdateTag() {
        NBTTagCompound compound = super.getUpdateTag();
        writeToNBT(compound, true);
        return compound;
    }

    @Override
    public void writeToNBT(NBTTagCompound compound, boolean isForSyncing) {
        compound.setInteger("blockIndex", blockIndex);
        compound.setInteger("RailFacing", facing.ordinal());
        compound.setBoolean("aimsLeft", aimsLeft);
        if (this.defaultTrackPosition == null) {
            NBTTagList nbtTagList = new NBTTagList();
            for (BlockPos b : toDestroy)
                nbtTagList.appendTag(new NBTTagLong(b.toLong()));

            compound.setTag("toDestroy", nbtTagList);
        } else {
            compound.setTag("defaultTrackPosition", new NBTTagLong(defaultTrackPosition.toLong()));
        }
    }

    @Override
    public void readFromNBT(NBTTagCompound compound, boolean isForSyncing) {
        blockIndex = compound.getInteger("blockIndex");
        this.facing = EnumFacing.values()[compound.getInteger("RailFacing")];

        if (compound.hasKey("toDestroy")) {
            NBTTagList list = compound.getTagList("toDestroy", 4);
            int l = list.tagCount();
            toDestroy = Lists.newArrayListWithCapacity(l);
            for (int i = 0; i < l; ++i)
                toDestroy.add(BlockPos.fromLong(((NBTTagLong) list.get(i)).getLong()));
        } else
            defaultTrackPosition = BlockPos.fromLong(compound.getLong("defaultTrackPosition"));

        this.getWaypoints();
        super.readFromNBT(compound, isForSyncing);
    }

    public EnumFacing getFacing() {
        return facing;
    }

    public BlockPos sendRequestToTracks(EnumFacing from){
        if(from.getHorizontalIndex() == -1){
            return getPos();
        }
        List<BlockPos> poses = new ArrayList<>();
        for(EnumFacing side : EnumFacing.HORIZONTALS){
            if(side != from){
                poses.add(this.pos.offset(side));
            }
        }
        for(BlockPos pos : poses){
            if(canDrive(this.worldObj, pos, from)){
                return pos;
            }
        }
        return getPos();
    }

    private boolean canDrive(World world, BlockPos pos, EnumFacing from){
        TileEntity tile = world.getTileEntity(pos);
        if(tile != null && tile instanceof TileEntityTrack){
            IBlockState state = world.getBlockState(this.pos);
            if(state.getBlock() instanceof BlockTrack){
                return ((BlockTrack) state.getBlock()).canDriveOver(this, (TileEntityTrack) tile);
            }
        }
        return false;
    }

    public static class TrackRenderer extends TileEntitySpecialRenderer<TileEntityTrack>{
        private List<Float[]> cachedWaypoints;
        @Override
        public void renderTileEntityAt(TileEntityTrack te, double x, double y, double z, float partialTicks, int destroyStage){
            super.renderTileEntityAt(te, x, y, z, partialTicks, destroyStage);
            if(cachedWaypoints == null && te.waypoints != null){
                cachedWaypoints = te.waypoints.getSortedCoordinates();
            }
            if(cachedWaypoints != null){
                Tessellator tessy = Tessellator.getInstance();
                VertexBuffer buffer = tessy.getBuffer();
                GlStateManager.pushMatrix();
                GlStateManager.disableTexture2D();
                GlStateManager.disableBlend();
                buffer.begin(1, DefaultVertexFormats.POSITION_COLOR);
                for(Float[] floats : te.waypoints.getSortedCoordinates()){
                    buffer.pos(x + (floats[0] / 16), y + (floats[1] / 16), z + (floats[2] / 16)).color(1.0F, 0.5F, 0.5F, 1F).endVertex();
                    buffer.pos(x + (floats[0] / 16), y + 1 + (floats[1] / 16), z + (floats[2] / 16)).color(1.0F, 0.5F, 0.5F, 1F).endVertex();
                }
                tessy.draw();
                GlStateManager.enableBlend();
                GlStateManager.enableTexture2D();
                GlStateManager.popMatrix();
            }
        }
    }

}
