package train.common.blocks.tracks;

import mods.railcraft.api.events.CartLockdownEvent.Lock;
import mods.railcraft.api.events.CartLockdownEvent.Release;
import mods.railcraft.api.tracks.ITrackLockdown;
import mods.railcraft.api.tracks.ITrackPowered;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.IIcon;
import net.minecraftforge.common.MinecraftForge;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public abstract class BlockTrackLockingBase extends TrackBaseTraincraft implements ITrackLockdown, ITrackPowered {
	protected static double START_BOOST = 0.0004D;
	protected static double BOOST_FACTOR = 0.00001D;
	protected double prevSpeedX = 0;
	protected double prevSpeedZ = 0;
	protected boolean powered = false;
	private EntityMinecart lockedCart;
	protected int prevDelay = 0;
	protected int delay = 0;
	
	@Override
	public IIcon getIcon() {
		if ((isPowered()) || (this.delay > 0)) {
			return getIcon(1);
		}
		return getIcon(0);
	}
	@Override
	public boolean canUpdate() {
		return true;
	}

	public EntityMinecart getCurrentCart() {
		return this.lockedCart;
	}
	@Override
	public void onBlockRemoved() {
		super.onBlockRemoved();
		setCurrentCart(null);
	}

	protected void setCurrentCart(EntityMinecart cart) {
		if (prevSpeedX == 0 && cart != null)
			this.prevSpeedX = cart.motionX;
		if (prevSpeedZ == 0 && cart != null)
			this.prevSpeedZ = cart.motionZ;
		this.lockedCart = cart;
	}

	protected void lockCart(EntityMinecart cart) {
		if (cart != null) {
			MinecraftForge.EVENT_BUS.post(new Lock(cart, getX(), getY(), getZ()));
		}
	}

	protected void releaseCart(EntityMinecart cart) {
		if (cart != null) {
			MinecraftForge.EVENT_BUS.post(new Release(cart, getX(), getY(), getZ()));
		}
	}

	protected void checkCart(EntityMinecart cart) {
		if ((this.delay > 0) && (cart != this.lockedCart)) {
			this.delay = 0;
			setCurrentCart(cart);
		}
	}

	protected int getDelayTime() {
		return 3;
	}
	@Override
	public void releaseCart() {
		this.delay = 10;
	}
	@Override
	public boolean isCartLockedDown(EntityMinecart cart) {
		return (!this.powered) && (this.lockedCart == cart) && (this.delay == 0);
	}
	@Override
	public boolean isPowered() {
		return this.powered;
	}
	@Override
	public void setPowered(boolean powered) {
		this.powered = powered;
	}
	@Override
	public void writeToNBT(NBTTagCompound data) {
		super.writeToNBT(data);
		data.setBoolean("powered", this.powered);
		data.setDouble("prevSpeedX", prevSpeedX);
		data.setDouble("prevSpeedZ", prevSpeedZ);
	}
	@Override
	public void readFromNBT(NBTTagCompound data) {
		super.readFromNBT(data);
		this.powered = data.getBoolean("powered");
		this.prevSpeedX = data.getDouble("prevSpeedX");
		this.prevSpeedZ = data.getDouble("prevSpeedZ");
	}
	@Override
	public void writePacketData(DataOutputStream data) throws IOException {
		super.writePacketData(data);

		data.writeBoolean(this.powered);
		data.writeByte(this.delay);
	}
	@Override
	public void readPacketData(DataInputStream data) throws IOException {
		super.readPacketData(data);

		this.powered = data.readBoolean();
		this.delay = data.readByte();

		markBlockNeedsUpdate();
	}
}