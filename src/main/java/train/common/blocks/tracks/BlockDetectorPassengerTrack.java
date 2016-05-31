/**
 * A track that detects all instance of IPassenger
 * 
 * @author Spitfire4466
 */
package train.common.blocks.tracks;

import mods.railcraft.api.tracks.ITrackEmitter;
import net.minecraft.entity.item.EntityMinecart;
import train.common.api.IPassenger;
import train.common.library.Tracks;

public class BlockDetectorPassengerTrack extends BlockDetectorTrack implements ITrackEmitter {

	@Override
	public Tracks getTrackType() {
		return Tracks.DETECTOR_PASSENGER;
	}
	@Override
	public void onMinecartPass(EntityMinecart cart) {
		if (cart instanceof IPassenger) {
			setTrackPowering();
		}
	}
}
