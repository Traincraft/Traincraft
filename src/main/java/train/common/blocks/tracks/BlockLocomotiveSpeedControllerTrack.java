/**
 * A track that changes locomotive's speed 
 * 
 * @author Spitfire4466
 */
package train.common.blocks.tracks;

import mods.railcraft.api.core.items.IToolCrowbar;
import mods.railcraft.api.tracks.ITrackPowered;
import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IIcon;
import train.common.api.Locomotive;
import train.common.library.Tracks;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class BlockLocomotiveSpeedControllerTrack extends TrackBaseTraincraft implements ITrackPowered{
	private int mode = 0;
	private boolean powered;
	
	public BlockLocomotiveSpeedControllerTrack() {
		this.speedController = SpeedControllerSteel.getInstance();
	}

	@Override
	public Tracks getTrackType() {
		return Tracks.LOCO_SPEED_CONTROLLER;
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
				this.mode += 3;
				if (mode > 15)mode = 0;
				if (this.mode == 0)
					player.addChatMessage(new ChatComponentText("20 percent of max speed"));
				if (this.mode == 3)
					player.addChatMessage(new ChatComponentText("40 percent of max speed"));
				if (this.mode == 6)
					player.addChatMessage(new ChatComponentText("60 percent of max speed"));
				if (this.mode == 9)
					player.addChatMessage(new ChatComponentText("80 percent of max speed"));
				if (this.mode == 12)
					player.addChatMessage(new ChatComponentText("90 percent of max speed"));
				if (this.mode == 15)
					player.addChatMessage(new ChatComponentText("100 percent of max speed"));
				crowbar.onWhack(player, current, getX(), getY(), getZ());
				sendUpdateToClient();
				return true;
			}
		}
		return false;
	}
	
	@Override
	public void onNeighborBlockChange(Block block) {
		if(this.powered){
			this.mode = getWorld().getBlockPowerInput(getX(), getY(), getZ());
			//System.out.println(input);
		}
		super.onNeighborBlockChange(block);
	}

	@Override
	public void onMinecartPass(EntityMinecart cart) {
		if (((cart instanceof Locomotive))) {
			if (this.mode == 0)
				((Locomotive) cart).speedLimiter = 0.1;
			if (this.mode == 1)
				((Locomotive) cart).speedLimiter = 0.15;
			if (this.mode == 2)
				((Locomotive) cart).speedLimiter = 0.2;
			if (this.mode == 3)
				((Locomotive) cart).speedLimiter = 0.25;
			if (this.mode == 4)
				((Locomotive) cart).speedLimiter = 0.3;
			if (this.mode == 5)
				((Locomotive) cart).speedLimiter = 0.35;
			if (this.mode == 6)
				((Locomotive) cart).speedLimiter = 0.4;
			if (this.mode == 7)
				((Locomotive) cart).speedLimiter = 0.45;
			if (this.mode == 8)
				((Locomotive) cart).speedLimiter = 0.5;
			if (this.mode == 9)
				((Locomotive) cart).speedLimiter = 0.6;
			if (this.mode == 10)
				((Locomotive) cart).speedLimiter = 0.65;
			if (this.mode == 11)
				((Locomotive) cart).speedLimiter = 0.7;
			if (this.mode == 12)
				((Locomotive) cart).speedLimiter = 0.75;
			if (this.mode == 13)
				((Locomotive) cart).speedLimiter = 0.85;
			if (this.mode == 14)
				((Locomotive) cart).speedLimiter = 0.9;
			if (this.mode == 15)
				((Locomotive) cart).speedLimiter = 1;
			
			((Locomotive) cart).speedWasSet = true;
		}
	}

	@Override
	public IIcon getIcon() {
		int value = 0;
		if(mode>=0 && mode<3)value=0;
		if(mode>=3 && mode<6)value=1;
		if(mode>=6 && mode<8)value=2;
		if(mode>=8 && mode<13)value=3;
		if(mode>=13 && mode<=15)value=4;
		
		return getIcon(value);
	}

	protected void notifyNeighbors() {
		Block block = getWorld().getBlock(getX(), getY(), getZ());
		getWorld().notifyBlocksOfNeighborChange(getX(), getY(), getZ(), block);
		getWorld().notifyBlocksOfNeighborChange(getX(), getY() - 1, getZ(), block);

		markBlockNeedsUpdate();
	}
	
	@Override
	public void writeToNBT(NBTTagCompound nbttagcompound) {
		super.writeToNBT(nbttagcompound);
		nbttagcompound.setInteger("mode", this.mode);
	}
	@Override
	public void readFromNBT(NBTTagCompound nbttagcompound) {
		super.readFromNBT(nbttagcompound);
		this.mode = nbttagcompound.getInteger("mode");
	}
	@Override
	public void writePacketData(DataOutputStream data) throws IOException {
		super.writePacketData(data);

		data.writeInt(this.mode);
	}
	@Override
	public void readPacketData(DataInputStream data) throws IOException {
		super.readPacketData(data);

		this.mode = data.readInt();

		markBlockNeedsUpdate();
	}

	@Override
	public boolean isPowered() {
		return powered;
	}

	@Override
	public void setPowered(boolean powered) {
		this.powered = powered;
	}

}
