package train.common.tile;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.util.ForgeDirection;

public class TileSwitchStand extends TileTraincraft {


    private ForgeDirection facing;

    @Override
    public void readFromNBT(NBTTagCompound nbtTag, boolean forSyncing) {
        //super.readFromNBT(nbtTag, false);
        facing = ForgeDirection.getOrientation(nbtTag.getByte("Orientation"));
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound nbtTag, boolean forSyncing) {
        //super.writeToNBT(nbtTag, forSyncing);
        if (facing != null) {

            nbtTag.setByte("Orientation", (byte) facing.ordinal());
        }
        else {

            nbtTag.setByte("Orientation", (byte) ForgeDirection.NORTH.ordinal());
        }
        return nbtTag;
    }

    public ForgeDirection getFacing() {
        if(facing!=null){
            return this.facing;
        }
        return ForgeDirection.NORTH;
    }


    public void setFacing(ForgeDirection face) {

        if (facing != face)
            this.facing = face;
    }

}