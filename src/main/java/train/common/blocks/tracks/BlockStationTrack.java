package train.common.blocks.tracks;

import mods.railcraft.api.carts.CartTools;
import mods.railcraft.api.core.items.IToolCrowbar;
import mods.railcraft.api.tracks.ITrackLockdown;
import mods.railcraft.api.tracks.ITrackPowered;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IIcon;
import train.common.api.AbstractTrains;
import train.common.api.Locomotive;
import train.common.library.Tracks;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class BlockStationTrack extends BlockTrackLockingBase implements ITrackLockdown,ITrackPowered{
	protected static float DIR_THRESHOLD = 0.01F;
	protected boolean launchForward = true;
	protected byte reset = 0;
	private int updateTicks=0;
	private boolean activated=false;
	private int delayTime=100;
	private int activateRate=300;
	private int mode = 0;
	
	@Override
	public IIcon getIcon() {
		//System.out.println(delay);
		if ((this.delay > 0)) {
			return getIcon(4+this.mode);
		}
		return getIcon(this.mode);
	}
	public Tracks getTrackType() {
		return Tracks.STATION_TRACK;
	}
	@Override
	public void updateEntity() {
		if ((getCurrentCart() != null) && (getCurrentCart().isEntityAlive())) {
			setCurrentCart(null);
		}
		if (!getWorld().isRemote) {
			if(this.updateTicks>=this.getActivateRate()){
				if(this.isPowered()){
					this.activated=true;
					this.delay = getDelayTime();
				}
				this.updateTicks=0;
				sendUpdateToClient();
			}else if(this.delay<=0){
				this.activated=false;
				sendUpdateToClient();
			}
			//System.out.println(this.updateTicks+" "+this.delay+" "+this.activated);
			if (this.delay > 0) {
				this.delay--;
				if (this.delay == 0) {
					setCurrentCart(null);
				}
			}
			if (this.reset > 0) {
				this.reset = (byte) (this.reset - 1);
			}
		}

		//if (((this.prevDelay == 0 ? 1 : 0) ^ (this.delay == 0 ? 1 : 0)) != 0) {
		
		//}
		this.prevDelay = this.delay;
		this.updateTicks++;
	}
	@Override
	public boolean blockActivated(EntityPlayer player) {
		if (getWorld().isRemote) {
			return false;
		}
		ItemStack current = player.inventory.getCurrentItem();
		if ((current != null) && ((current.getItem() instanceof IToolCrowbar))) {
			IToolCrowbar crowbar = (IToolCrowbar) current.getItem();
			if (crowbar.canWhack(player, current, getX(), getY(), getZ())) {
				this.mode += 1;
				if (mode > 3)
					mode = 0;
				if (this.mode == 0){
					player.addChatMessage(new ChatComponentText("Activated every 15s for 5s"));
					this.delayTime=100;
					this.activateRate=300;
				}
				if (this.mode == 1){
					player.addChatMessage(new ChatComponentText("Activated every 30s for 15s"));
					this.delayTime=600/2;
					this.activateRate=600;
				}
				if (this.mode == 2){
					player.addChatMessage(new ChatComponentText("Activated every minute for 30s"));
					this.delayTime=1200/2;
					this.activateRate=1200;
				}
				if (this.mode == 3){
					player.addChatMessage(new ChatComponentText("Activated every five minutes for 30s"));
					this.delayTime=1200/2;
					this.activateRate=6000;
				}
				crowbar.onWhack(player, current, getX(), getY(), getZ());
				sendUpdateToClient();
				return true;
			}
		}
		return false;
	}
	@Override
	protected void checkCart(EntityMinecart cart) {
		if ((this.delay > 0) && ((cart != getCurrentCart()) || (this.reset == 0))) {
			//this.delay = 0;
			setCurrentCart(cart);
			setLaunchDirection(cart);
		}
		this.reset = 10;
	}
	@Override
	public void onMinecartPass(EntityMinecart cart) {
		/*if (!(cart instanceof Locomotive))
			return;*/
		if((cart instanceof Locomotive)||(!(cart instanceof AbstractTrains)&&(cart != null))){

			checkCart(cart);
			int meta = this.tileEntity.getBlockMetadata();
			if ((this.delay > 0)) {
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
	}
	@Override
	protected int getDelayTime() {
		return delayTime;
	}
	protected int getActivateRate() {
		return activateRate;
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
		data.setInteger("activateRate", this.activateRate);
		data.setInteger("delayTime", this.delayTime);
		data.setInteger("mode", this.mode);
		data.setInteger("ticks", this.updateTicks);
	}
	@Override
	public void readFromNBT(NBTTagCompound data) {
		super.readFromNBT(data);
		this.launchForward = data.getBoolean("launchForward");
		this.activateRate = data.getInteger("activateRate");
		this.delayTime = data.getInteger("delayTime");
		this.mode = data.getInteger("mode");
		this.updateTicks = data.getInteger("ticks");
		sendUpdateToClient();
	}
	@Override
	public void writePacketData(DataOutputStream data) throws IOException {
		super.writePacketData(data);

		data.writeBoolean(this.launchForward);
		data.writeInt(this.mode);
	}
	@Override
	public void readPacketData(DataInputStream data) throws IOException {
		super.readPacketData(data);

		this.launchForward = data.readBoolean();
		this.mode = data.readInt();
		markBlockNeedsUpdate();
	}
}