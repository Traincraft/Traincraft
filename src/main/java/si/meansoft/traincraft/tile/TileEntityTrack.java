package si.meansoft.traincraft.tile;

import com.google.common.collect.Lists;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagIntArray;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagLong;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import si.meansoft.traincraft.blocks.BlockTrack;
import si.meansoft.traincraft.track.TrackGrid;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;


/**
 * @author canitzp
 */
public class TileEntityTrack extends TileEntityBase {

    public List<BlockPos> toDestroy = new ArrayList<>();
    public BlockPos defaultTrackPosition;


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
    }


    public void create(List<BlockPos> poses, int blockIndex, boolean aimsLeft, EnumFacing enumFacing) {
        this.toDestroy = poses;
        this.blockIndex = blockIndex;
        this.facing = enumFacing;
        this.aimsLeft = aimsLeft;
    }


    @Override
    public void writeToNBT(NBTTagCompound compound, boolean isForSyncing) {
        compound.setInteger("blockIndex", blockIndex);
        System.out.println("Writing " + facing + "/" + facing.ordinal());
        compound.setInteger("RailFacing", facing.ordinal());
        compound.setBoolean("aimsLeft", aimsLeft);
        if (blockIndex == 0) {
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
        if (!compound.hasKey("blockIndex")) {

            for (String s : compound.getKeySet()){
                System.out.println(s);
            }

            System.out.println("No blockIndex" + getPos());
            blockIndex = -1;
            facing = EnumFacing.NORTH;
            return;
        }
        blockIndex = compound.getInteger("blockIndex");
        this.facing = EnumFacing.values()[compound.getInteger("RailFacing")];
        System.out.println(getPos());

        if (facing == EnumFacing.DOWN)
            facing = EnumFacing.NORTH;


        if (blockIndex == 0) { //I hold the data
            NBTTagList list = compound.getTagList("toDestroy", 4);
            int l = list.tagCount();
            toDestroy = Lists.newArrayListWithCapacity(l);
            for (int i = 0; i < l; ++i)
                toDestroy.add(BlockPos.fromLong(((NBTTagLong) list.get(i)).getLong()));
        } else
            defaultTrackPosition = BlockPos.fromLong(compound.getLong("defaultTrackPosition"));


//            System.out.println(facing);
//            aimsLeft = compound.getBoolean("aimsLeft");
//            if (this.getWorld()==null)
//                System.out.println("world");
//            if (this.getWorld().getBlockState(this.getPos())==null)
//                System.out.println("state");
//
//            if (((BlockTrack) this.getWorld().getBlockState(this.getPos()).getBlock()).trackType==null)
//                System.out.println("trackType");
//
//
//            toDestroy = ((BlockTrack) this.getWorld().getBlockState(this.getPos()).getBlock()).trackType.getGrid().getPosesToAffect(
//                    this.getPos(), facing, aimsLeft);
//            System.out.println(getPos().toString() + " has " + toDestroy.size() +" followers");

        super.readFromNBT(compound, isForSyncing);
    }

    public EnumFacing getFacing() {
        return facing;
    }

}
