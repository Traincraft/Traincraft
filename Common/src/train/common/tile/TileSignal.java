package src.train.common.tile;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.packet.Packet;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import src.train.common.core.handlers.PacketHandler;

//client
public class TileSignal extends TileEntity {
	public int state;// 0=red 1=green
	public int rot;

	public double tempSpeedX;// signal
	public double tempSpeedZ;// signal
	public double fu;// signal
	private int facingMeta;

	public TileSignal() {
		// signal
		tempSpeedX = 0;
		tempSpeedZ = 0;
		fu = 0;
		facingMeta = this.blockMetadata;
	}

	public int getFacing() {
		return facingMeta;
	}

	public void setFacing(int facing) {
		this.facingMeta = facing;
		this.rot = facing;
	}

	public void handlePacketDataFromServer(byte orientation) {
		facingMeta = orientation;
	}
	@Override
	public void readFromNBT(NBTTagCompound nbttagcompound) {
		state = nbttagcompound.getInteger("state");
		rot = nbttagcompound.getInteger("rot");
		facingMeta = nbttagcompound.getByte("Orientation");
	}
	@Override
	public void writeToNBT(NBTTagCompound nbttagcompound) {
		nbttagcompound.setByte("Orientation", (byte) facingMeta);
		nbttagcompound.setInteger("state", this.state);
		nbttagcompound.setInteger("rot", this.rot);
	}

	@Override
	public Packet getDescriptionPacket() {
		return PacketHandler.getTEPClient(this);
	}
	@Override
	public void updateEntity() {
		int x1 = 1;// x2
		int x2 = 1;// y2
		int x3 = 1;// z2
		int x4 = 1;// x1
		int x5 = 1;// z1
		// System.out.println("rot: "+rot);
		if (rot == 2) {
			x4 = -1;
			x5 = -9;
			x1 = 1;
			x3 = 1;
		}// ok
		if (rot == 4) {
			x4 = -9;
			x5 = -1;
			x1 = 1;
			x3 = 1;
		}// ok
		if (rot == 3) {
			x3 = 9;
			x1 = 1;
			x4 = -1;
			x5 = 1;
		}
		;// ok
		if (rot == 5) {
			x3 = 1;
			x1 = 9;
			x4 = 1;
			x5 = -1;
		}
		;// ok
		List list = this.worldObj.getEntitiesWithinAABB(EntityMinecart.class, AxisAlignedBB.getBoundingBox((double) this.xCoord + x4, (double) this.yCoord, (double) this.zCoord + x5, (double) (this.xCoord + x1), (double) (this.yCoord + 1), (double) (this.zCoord + x3)).expand(1.0D, 1.0D, 1.0D));

		if (list != null && list.size() > 0) {

			for (int j1 = 0; j1 < list.size(); j1++) {
				Entity entity = (Entity) list.get(j1);
				if (entity instanceof EntityMinecart) {
					// System.out.println("entityIn rot: "+ rot + " x1: "+ x1+" x3: "+x3+ " state: "+state);
					if (fu == 0 && state == 0) {
						tempSpeedX = ((EntityMinecart) entity).motionX;
						tempSpeedZ = ((EntityMinecart) entity).motionZ;

					}
					if (state == 0) {
						((EntityMinecart) entity).motionX *= 0.85D;
						((EntityMinecart) entity).motionZ *= 0.85D;
						fu++;
					}

					if (fu > 0 && state == 1) {
						((EntityMinecart) entity).motionX = tempSpeedX;
						((EntityMinecart) entity).motionZ = tempSpeedZ;
						fu = 0;
					}
				}
			}
		}
	}
}