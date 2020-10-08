/**
 * A track that detects all instance of SteamTrain
 * 
 * @author Spitfire4466
 */
package train.common.blocks.tracks;

import ebf.tim.TrainsInMotion;
import ebf.tim.entities.GenericRailTransport;
import mods.railcraft.api.tracks.ITrackEmitter;
import net.minecraft.entity.item.EntityMinecart;
import train.common.library.Tracks;

public class BlockDetectorSteamLocomotiveTrack extends BlockDetectorTrack implements ITrackEmitter {

	@Override
	public Tracks getTrackType() {
		return Tracks.DETECTOR_STEAM_LOCOMOTIVES;
	}
	@Override
	public void onMinecartPass(EntityMinecart cart) {
		if (((GenericRailTransport)cart).getTypes().contains(TrainsInMotion.transportTypes.STEAM)) {
			setTrackPowering();
		}
	}
}