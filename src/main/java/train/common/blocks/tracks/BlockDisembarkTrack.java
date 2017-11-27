/**
 * @author Spitfire4466
 */
package train.common.blocks.tracks;

import mods.railcraft.api.tracks.ITrackEmitter;
import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.IIcon;
import train.common.entity.rollingStock.EntityStockCar;
import train.common.entity.rollingStock.EntityStockCarDRWG;
import train.common.library.Tracks;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class BlockDisembarkTrack extends TrackBaseTraincraft implements ITrackEmitter {
	private byte delay = 0;

	@Override
	public Tracks getTrackType() {
		return Tracks.DISEMBARK_TRACK;
	}
	@Override
	public void onMinecartPass(EntityMinecart cart) {
		if (cart instanceof EntityStockCar || cart instanceof EntityStockCarDRWG) {
			if (cart.riddenByEntity == null)
				return;
			cart.riddenByEntity.mountEntity(cart);
			cart.riddenByEntity.ridingEntity = null;
			setTrackPowering();
		}
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
	public IIcon getIcon() {
		if (this.delay > 0) {
			return getIcon(1);
		}
		return getIcon(0);
	}

	protected void notifyNeighbors() {
		Block block = getWorld().getBlock(getX(), getY(), getZ());
		getWorld().notifyBlocksOfNeighborChange(getX(), getY(), getZ(), block);
		getWorld().notifyBlocksOfNeighborChange(getX(), getY() - 1, getZ(), block);

		markBlockNeedsUpdate();
	}

	protected void setTrackPowering() {
		boolean notify = this.delay == 0;
		this.delay = 3;
		if (notify)
			notifyNeighbors();
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