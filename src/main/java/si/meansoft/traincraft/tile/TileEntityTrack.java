/*
 * This file ("TileEntityTrack.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/blob/master/LICENSE.md)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2016
 */

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
import si.meansoft.traincraft.Util;
import si.meansoft.traincraft.api.AbstractBlockTrack;
import si.meansoft.traincraft.blocks.BlockTrackStraight;
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
        //this.initBlock();
    }

    public void create(List<BlockPos> poses, int blockIndex, boolean aimsLeft, EnumFacing enumFacing) {
        this.toDestroy = poses;
        this.blockIndex = blockIndex;
        this.facing = enumFacing;
        this.aimsLeft = aimsLeft;
        this.initBlock();
    }

    private void initBlock(){
        if(this.world != null){
            IBlockState state = this.world.getBlockState(this.getPos());
            AbstractBlockTrack track = (AbstractBlockTrack) state.getBlock();
            this.waypoints = track.getWaypoints(this.getWorld(), this.getPos(), state, this.blockIndex);
            track.placeTileEntity(this.world, this.pos, state, this, this.blockIndex, this.facing);
        }
    }

    @Override
    public NBTTagCompound getUpdateTag() {
        NBTTagCompound compound = super.getUpdateTag();
        writeToNBT(compound, Util.NBTType.SYNC);
        return compound;
    }

    @Override
    public void writeToNBT(NBTTagCompound compound, Util.NBTType type) {
        super.writeToNBT(compound, type);
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
    public void readFromNBT(NBTTagCompound compound, Util.NBTType type) {
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

        initBlock();
        super.readFromNBT(compound, type);
    }

    public EnumFacing getFacing() {
        return facing;
    }

    /* new tactic
        2*4*
        1*<
        3*5*
     */
    public BlockPos sendRequestToTracks(EnumFacing from){
        //if it is no horizontal direction
        if(from.getHorizontalIndex() == -1){
            return getPos();
        }
        //if it is a straight waypoint line
        BlockPos mainPos = this.pos.offset(from.getOpposite());
        if(!canDrive(mainPos)){
            //east
            mainPos = this.pos.east();
            if(!canDrive(mainPos)){
                //west
                mainPos = this.pos.west();
                if(!canDrive(mainPos)){
                    //south
                    mainPos = this.pos.south();
                    if(!canDrive(mainPos)){
                        //north
                        mainPos = this.pos.north();
                        if(!canDrive(mainPos)){
                            mainPos = this.pos;
                        }
                    }
                }
            }
        }

        /*
        for(EnumFacing side : EnumFacing.HORIZONTALS){
            if(side != from){
                poses.add(this.pos.offset(side));
            }
        }
        for(BlockPos pos : poses){
            if(canDrive(pos)){
                return pos;
            }
        }
        */
        //System.out.println(from);
        return mainPos;
    }

    private boolean canDrive(BlockPos pos){
        TileEntity tile = world.getTileEntity(pos);
        if(tile != null && tile instanceof TileEntityTrack){
            IBlockState state = world.getBlockState(this.pos);
            if(state.getBlock() instanceof AbstractBlockTrack){
                return ((AbstractBlockTrack) state.getBlock()).canDriveOver(this, (TileEntityTrack) tile);
            }
        }
        return false;
    }

    public static class TrackRenderer extends TileEntitySpecialRenderer<TileEntityTrack>{
        @Override
        public void renderTileEntityAt(TileEntityTrack te, double x, double y, double z, float partialTicks, int destroyStage){
            super.renderTileEntityAt(te, x, y, z, partialTicks, destroyStage);
            if(te.waypoints != null){
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
