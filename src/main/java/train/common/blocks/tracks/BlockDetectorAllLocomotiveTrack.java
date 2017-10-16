/**
 * A track that detects all instance of Locomotive
 * 
 * @author Spitfire4466(Edited by PeachMaster)
 */
package train.common.blocks.tracks;

import mods.railcraft.api.core.items.IToolCrowbar;
import mods.railcraft.api.tracks.ITrackEmitter;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import train.common.api.DieselTrain;
import train.common.api.ElectricTrain;
import train.common.api.Locomotive;
import train.common.api.SteamTrain;
import train.common.library.Tracks;

public class BlockDetectorAllLocomotiveTrack extends BlockDetectorTrack implements ITrackEmitter {
	
	public int ThingToSet;
	@Override
	public Tracks getTrackType() {
		return Tracks.DETECTOR_ALL_LOCOMOTIVES;
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
				if (this.ThingToSet == 9) {
					this.ThingToSet = 0;
				} else {
					this.ThingToSet += 3;
				}
				
				switch(this.ThingToSet) {
				
				case 0: {
					player.addChatMessage(new ChatComponentText("Now set to emit a signal on all trains"));
					break;
				}
				case 3: {
					player.addChatMessage(new ChatComponentText("Now set to emit a signal on all steam trains"));
					break;
				}
				case 6: {
					player.addChatMessage(new ChatComponentText("Now set to emit a signal on all diesel trains"));
					break;
				}
				case 9: {
					player.addChatMessage(new ChatComponentText("Now set to emit a signal on all electric trains"));
					break;
				}
				
				}
				
				crowbar.onWhack(player, current, getX(), getY(), getZ());
				sendUpdateToClient();
				return true;
			}
		}
		return false;
	}
	
	@Override
	public void onMinecartPass(EntityMinecart cart) {
		
		switch(this.ThingToSet) {
		case 0: {
			if (cart instanceof Locomotive) {
			setTrackPowering();
			}
			break;
		}
		case 3: {
			if (cart instanceof SteamTrain) {
			setTrackPowering();
			}
			break;
		}
		case 6: {
			if (cart instanceof DieselTrain) {
			setTrackPowering();
			}
			break;
		}
		case 9: {
			if (cart instanceof ElectricTrain) {
			setTrackPowering();
			}
			break;
		}
				}
		
		}
	}

