package train.common.tile.tileSwitch;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraftforge.common.util.ForgeDirection;
import train.common.tile.TileTraincraft;

public class TileSpeedSign extends TileTraincraft {

	private int skinstate = 0;
	private ForgeDirection facing = ForgeDirection.NORTH;

	@Override
	public void readFromNBT(NBTTagCompound nbtTag, boolean forSyncing) {
		super.readFromNBT(nbtTag, false);
		if(nbtTag.hasKey("Orientation")) {
			facing = ForgeDirection.getOrientation(nbtTag.getByte("Orientation"));
		}
		if(nbtTag.hasKey("skinstate")){
			skinstate=nbtTag.getInteger("skinstate");
		}
	}



	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound nbtTag, boolean forSyncing) {
		super.writeToNBT(nbtTag, forSyncing);
		nbtTag.setByte("Orientation", (byte) facing.ordinal());
		nbtTag.setInteger("skinstate", skinstate);
		return nbtTag;
	}

	public ForgeDirection getFacing() {
		if(facing!=null){
			return this.facing;
		}
		return ForgeDirection.UNKNOWN;
	}

	public void setSkinstate(int skinstate) {
		this.skinstate = skinstate;
	}

	public int getSkinstate() {
		return skinstate;
	}

	public void increaseSkinState(){
		if (skinstate >= 4){
			skinstate = 0;
		} else {
			skinstate++;
		}
	}

	public void setFacing(ForgeDirection face) {
		this.facing = face;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public AxisAlignedBB getRenderBoundingBox() {
		return AxisAlignedBB.getBoundingBox(xCoord - 1, yCoord - 1, zCoord - 1, xCoord + 2, yCoord + 2, zCoord + 2);
	}
}
