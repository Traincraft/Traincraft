package si.meansoft.traincraft.tile;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author canitzp
 */
public class TileEntityTrack extends TileEntityBase{

    public BlockPos defaultTrackPosition;
    public List<BlockPos> toDestroy = new ArrayList<>();

    public int blockIndex = -1;
    public EnumFacing facing;

    public int blockIndex=-1;
    public EnumFacing facing;

    public TileEntityTrack(){
        super("Track");
    }

    public void create(BlockPos defaultTrackPosition){
        this.defaultTrackPosition = defaultTrackPosition;
    }

    @Override
    public void writeToNBT(NBTTagCompound compound, boolean isForSyncing) {
        compound.setInteger("blockIndex",blockIndex);
        compound.setByte("facing", (byte) facing.getIndex());
        super.writeToNBT(compound, isForSyncing);
    }

    @Override
    public void writeToNBT(NBTTagCompound compound, boolean isForSyncing) {
        compound.setInteger("blockIndex",blockIndex);
        compound.setInteger("facing", facing.ordinal());
        super.writeToNBT(compound, isForSyncing);
    }

    @Override
    public void readFromNBT(NBTTagCompound compound, boolean isForSyncing) {
        blockIndex = compound.getInteger("blockIndex");
        facing = EnumFacing.values()[compound.getInteger("facing")];
        super.readFromNBT(compound, isForSyncing);
    }
    @Override
    public void readFromNBT(NBTTagCompound compound, boolean isForSyncing) {
        blockIndex = compound.getInteger("blockIndex");
        facing = EnumFacing.getFront(compound.getByte("facing"));
        super.readFromNBT(compound, isForSyncing);
    }
}
