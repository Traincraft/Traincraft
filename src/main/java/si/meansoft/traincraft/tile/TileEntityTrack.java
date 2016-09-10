package si.meansoft.traincraft.tile;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;

/**
 * @author canitzp
 */
public class TileEntityTrack extends TileEntityBase{

    public BlockPos defaultTrackPosition;

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
    public void readFromNBT(NBTTagCompound compound, boolean isForSyncing) {
        blockIndex = compound.getInteger("blockIndex");
        facing = EnumFacing.getFront(compound.getByte("facing"));
        super.readFromNBT(compound, isForSyncing);
    }
}
