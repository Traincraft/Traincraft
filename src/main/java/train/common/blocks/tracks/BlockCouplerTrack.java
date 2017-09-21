/**
 * A track that put carts in attaching mode
 * @author Spitfire4466
 */
package train.common.blocks.tracks;

import mods.railcraft.api.carts.CartTools;
import mods.railcraft.api.carts.ILinkageManager;
import mods.railcraft.api.tracks.ITrackPowered;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.IIcon;
import train.common.api.AbstractTrains;
import train.common.api.EntityRollingStock;
import train.common.core.handlers.LinkHandler;
import train.common.library.Tracks;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class BlockCouplerTrack extends TrackBaseTraincraft implements ITrackPowered {
	private EntityMinecart taggedCart;
	private boolean powered = false;

	@Override
	public Tracks getTrackType() {
		return Tracks.COUPLER_TRACK;
	}
	@Override
	public IIcon getIcon() {
		if (isPowered()) {
			return getIcon(1);
		}
		return getIcon(0);
	}
	@Override
	public void onMinecartPass(EntityMinecart cart) {
		if (isPowered() && !(cart instanceof AbstractTrains)) {//So that it attaches minecarts when railcraft is installed
			ILinkageManager lm = CartTools.getLinkageManager(cart.worldObj);
			if (taggedCart != null)
				lm.createLink(this.taggedCart, cart);
			this.taggedCart = cart;
		}

		if (isPowered() && cart instanceof EntityRollingStock) {
			((EntityRollingStock) cart).isAttaching = true;
			if (taggedCart instanceof EntityRollingStock) {
				((EntityRollingStock) taggedCart).isAttaching = true;
				LinkHandler lh = new LinkHandler(cart.worldObj);
				lh.addStake((EntityRollingStock) this.taggedCart, (EntityRollingStock) cart, false);
			}
			this.taggedCart = cart;
		}
		if (!isPowered() && !(cart instanceof AbstractTrains)) {
			ILinkageManager lm = CartTools.getLinkageManager(cart.worldObj);
			if (taggedCart != null)
				lm.breakLink(this.taggedCart, cart);
			this.taggedCart = cart;
		}

		if (!isPowered() && cart instanceof AbstractTrains) {
			((AbstractTrains) cart).isAttached = false;
			if (taggedCart != null)
				((AbstractTrains) taggedCart).isAttaching = false;
			this.taggedCart = cart;
		}
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
	public int getPowerPropagation() {
		return 8;
	}
	@Override
	public void writeToNBT(NBTTagCompound nbttagcompound) {
		super.writeToNBT(nbttagcompound);
		nbttagcompound.setBoolean("powered", this.powered);
	}
	@Override
	public void readFromNBT(NBTTagCompound nbttagcompound) {
		super.readFromNBT(nbttagcompound);
		this.powered = nbttagcompound.getBoolean("powered");
	}
	@Override
	public void writePacketData(DataOutputStream data) throws IOException {
		super.writePacketData(data);

		data.writeBoolean(this.powered);
	}
	@Override
	public void readPacketData(DataInputStream data) throws IOException {
		super.readPacketData(data);

		boolean p = data.readBoolean();

		if (p != this.powered) {
			this.powered = p;
			markBlockNeedsUpdate();
		}
	}

}
