/**
 * A track that detects all instance of IPassenger
 * 
 * @author Spitfire4466
 */
package train.common.blocks.tracks;

import mods.railcraft.api.tracks.ITrackEmitter;
import net.minecraft.entity.item.EntityMinecart;
import train.common.api.IPassenger;
import train.common.library.TrackIDs;

public class BlockDetectorPassengerTrack extends BlockDetectorTrack implements ITrackEmitter {

	@Override
	public TrackIDs getTrackType() {
		return TrackIDs.DETECTOR_PASSENGER;
	}
	@Override
	public void onMinecartPass(EntityMinecart cart) {
		if (cart instanceof IPassenger) {
			setTrackPowering();
		}
	}
}
