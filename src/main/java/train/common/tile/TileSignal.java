package train.common.tile;

import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;

import java.util.List;

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

		NBTTagCompound nbt = new NBTTagCompound();
		this.writeToNBT(nbt);

		return new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 1, nbt);
	}

	@Override
	public void updateEntity() {
		int x1 = 1;// x2
		int x2 = 1;// y2
		int x3 = 1;// z2
		int x4 = 1;// x1
		int x5 = 1;// z1

		switch (this.rot) {

		case 2:
			x4 = -1;
			x5 = -9;
			x1 = 1;
			x3 = 1;
			break;

		case 3:
			x3 = 9;
			x1 = 1;
			x4 = -1;
			x5 = 1;
			break;

		case 4:
			x4 = -9;
			x5 = -1;
			x1 = 1;
			x3 = 1;
			break;

		case 5:
			x3 = 1;
			x1 = 9;
			x4 = 1;
			x5 = -1;
			break;
		}

		List list = this.worldObj.getEntitiesWithinAABB(EntityMinecart.class, AxisAlignedBB.getBoundingBox( this.xCoord + x4, this.yCoord, this.zCoord + x5, (this.xCoord + x1), (this.yCoord + 1),  (this.zCoord + x3)).expand(1.0D, 1.0D, 1.0D));
		Entity entity;

		if (list != null && list.size() > 0) {

			for (int j1 = 0; j1 < list.size(); j1++) {

				entity = (Entity) list.get(j1);

				if (entity instanceof EntityMinecart) {

					if (state == 0) {

						if (fu == 0) {

							tempSpeedX = entity.motionX;
							tempSpeedZ = entity.motionZ;
						}

						entity.motionX *= 0.85D;
						entity.motionZ *= 0.85D;
						fu++;
					}
					else if (fu > 0 && state == 1) {

						entity.motionX = tempSpeedX;
						entity.motionZ = tempSpeedZ;
						fu = 0;
					}
				}
			}
		}
	}
}