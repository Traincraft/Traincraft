package train.common.blocks.tracks;

import mods.railcraft.api.carts.CartTools;
import mods.railcraft.api.tracks.ITrackLockdown;
import mods.railcraft.api.tracks.ITrackPowered;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.nbt.NBTTagCompound;
import train.common.api.Locomotive;
import train.common.library.Tracks;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class BlockLocomotiveHoldingTrack extends BlockTrackLockingBase implements ITrackPowered, ITrackLockdown {
	protected static float DIR_THRESHOLD = 0.01F;
	protected boolean launchForward = true;
	protected byte reset = 0;

	public Tracks getTrackType() {
		return Tracks.LOCO_HOLDING_TRACK;
	}
	@Override
	public void updateEntity() {
		if ((getCurrentCart() != null) && (getCurrentCart().isEntityAlive())) {
			setCurrentCart(null);
		}
		if (!getWorld().isRemote) {
			if (isPowered()) {
				this.delay = getDelayTime();
			}
			else if (this.delay > 0) {
				this.delay = (byte) (this.delay - 1);
				if (this.delay == 0) {
					setCurrentCart(null);
				}
			}
			if (this.reset > 0) {
				this.reset = (byte) (this.reset - 1);
			}
		}

		if (((this.prevDelay == 0 ? 1 : 0) ^ (this.delay == 0 ? 1 : 0)) != 0) {
			sendUpdateToClient();
		}
		this.prevDelay = this.delay;
	}
	@Override
	protected void checkCart(EntityMinecart cart) {
		if ((this.delay > 0) && ((cart != getCurrentCart()) || (this.reset == 0))) {
			this.delay = 0;
			setCurrentCart(cart);
			setLaunchDirection(cart);
		}
		this.reset = 10;
	}
	@Override
	public void onMinecartPass(EntityMinecart cart) {
		if (!(cart instanceof Locomotive) && (cart.getClass().getSuperclass() != null && !cart.getClass().getSuperclass().getName().equals("EntityLocomotive")))
			return;

		checkCart(cart);
		int meta = this.tileEntity.getBlockMetadata();
		if ((isPowered()) || (this.delay > 0)) {
			releaseCart(cart);
			// double speed = CartTools.getCartSpeedUncapped(cart);
			double boostX = Math.abs(this.prevSpeedX);
			double boostZ = Math.abs(this.prevSpeedZ);
			/* if (speed > 0.005D) { boostX = Math.abs(cart.motionX); /// speed * BOOST_FACTOR; boostZ = Math.abs(cart.motionZ); /// speed * BOOST_FACTOR; } */
			prevSpeedX = 0;
			prevSpeedZ = 0;
			if ((meta == 0) || (meta == 4) || (meta == 5)) {
				if (boostZ != 0) {
					if (this.launchForward)
						cart.motionZ = boostZ;
					else
						cart.motionZ = -boostZ;
				}
			}
			else if ((meta == 1) || (meta == 2) || (meta == 3))
				if (boostX != 0) {
					if (this.launchForward)
						cart.motionX = boostX;
					else
						cart.motionX = -boostX;
				}
		}
		else {
			if (getCurrentCart() == null) {
				setCurrentCart(cart);
				setLaunchDirection(cart);
			}
			if (getCurrentCart() == cart) {
				lockCart(cart);
				cart.motionX = 0.0D;
				cart.motionZ = 0.0D;
				if ((meta == 0) || (meta == 4) || (meta == 5))
					cart.setPosition(cart.posX, cart.posY, this.tileEntity.zCoord + 0.5D);
				else
					cart.setPosition(this.tileEntity.xCoord + 0.5D, cart.posY, cart.posZ);
			}
		}
	}

	protected void setLaunchDirection(EntityMinecart cart) {
		int meta = this.tileEntity.getBlockMetadata();
		double speed = CartTools.getCartSpeedUncapped(cart);
		if (speed > DIR_THRESHOLD) {
			boolean launch = this.launchForward;
			if ((meta == 0) || (meta == 4) || (meta == 5))
				launch = cart.motionZ > 0.0D;
			else if ((meta == 1) || (meta == 2) || (meta == 3)) {
				launch = cart.motionX > 0.0D;
			}
			if (this.launchForward != launch) {
				this.launchForward = launch;
				sendUpdateToClient();
			}
		}
	}
	@Override
	public void writeToNBT(NBTTagCompound data) {
		super.writeToNBT(data);
		data.setBoolean("launchForward", this.launchForward);
	}
	@Override
	public void readFromNBT(NBTTagCompound data) {
		super.readFromNBT(data);
		this.launchForward = data.getBoolean("launchForward");
	}
	@Override
	public void writePacketData(DataOutputStream data) throws IOException {
		super.writePacketData(data);

		data.writeBoolean(this.launchForward);
	}
	@Override
	public void readPacketData(DataInputStream data) throws IOException {
		super.readPacketData(data);

		this.launchForward = data.readBoolean();

		markBlockNeedsUpdate();
	}
}