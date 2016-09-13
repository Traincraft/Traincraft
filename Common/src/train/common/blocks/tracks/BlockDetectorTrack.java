/**
 * A track that detects all instance of DieselTrain
 * 
 * @author Spitfire4466
 */
package src.train.common.blocks.tracks;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import mods.railcraft.api.tracks.ITrackEmitter;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.Icon;
import src.train.common.library.TrackIDs;

public class BlockDetectorTrack extends TrackBaseTraincraft implements ITrackEmitter {
	private byte delay = 0;

	@Override
	public TrackIDs getTrackType() {
		return null;
	}
	@Override
	public void updateEntity() {
		if (getWorld().isRemote) {
			return;
		}
		if (this.delay > 0) {
			this.delay = (byte) (this.delay - 1);
			if (this.delay == 0)
				notifyNeighbors();
		}
	}
	@Override
	public Icon getIcon() {
		if (this.delay > 0) {
			return getIcon(1);
		}
		return getIcon(0);
	}

	protected void notifyNeighbors() {
		int id = getWorld().getBlockId(getX(), getY(), getZ());
		getWorld().notifyBlocksOfNeighborChange(getX(), getY(), getZ(), id);
		getWorld().notifyBlocksOfNeighborChange(getX(), getY() - 1, getZ(), id);

		markBlockNeedsUpdate();
	}

	protected void setTrackPowering() {
		boolean notify = this.delay == 0;
		this.delay = 3;
		if (notify){
			notifyNeighbors();
		}
	}

	@Override
	public boolean canUpdate() {
		return true;
	}
	@Override
	public void writeToNBT(NBTTagCompound nbttagcompound) {
		super.writeToNBT(nbttagcompound);
		nbttagcompound.setByte("delay", this.delay);
	}
	@Override
	public void readFromNBT(NBTTagCompound nbttagcompound) {
		super.readFromNBT(nbttagcompound);
		this.delay = nbttagcompound.getByte("delay");
	}
	@Override
	public void writePacketData(DataOutputStream data) throws IOException {
		super.writePacketData(data);

		data.writeByte(this.delay);
	}
	@Override
	public void readPacketData(DataInputStream data) throws IOException {
		super.readPacketData(data);
		this.delay = data.readByte();
		markBlockNeedsUpdate();
	}

	@Override
	public int getPowerOutput() {
		return this.delay > 0 ? 15 : 0;
	}
}