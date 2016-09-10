package si.meansoft.traincraft.tile;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;

import java.util.ArrayList;
import java.util.List;

/**
 * @author canitzp
 */
public class TileEntityTrack extends TileEntityBase{

    public BlockPos defaultTrackPosition;
    public List<BlockPos> toDestroy = new ArrayList<>();

    public int blockIndex = -1;
    public EnumFacing facing;

    public TileEntityTrack(){
        super("Track");
    }

    public void create(BlockPos defaultTrackPosition){
        this.defaultTrackPosition = defaultTrackPosition;
    }

    public void create(List<BlockPos> poses){
        this.toDestroy = poses;
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
}
