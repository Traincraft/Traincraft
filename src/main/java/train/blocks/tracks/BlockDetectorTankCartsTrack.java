/**
 * A track that detects all instance of Tank carts
 * 
 * @author Spitfire4466
 */
package train.blocks.tracks;

import ebf.tim.TrainsInMotion;
import ebf.tim.entities.GenericRailTransport;
import mods.railcraft.api.tracks.ITrackEmitter;
import net.minecraft.entity.item.EntityMinecart;
import train.library.Tracks;

public class BlockDetectorTankCartsTrack extends BlockDetectorTrack implements ITrackEmitter {

	@Override
	public Tracks getTrackType() {
		return Tracks.DETECTOR_TANK_CARTS;
	}

	@Override
	public void onMinecartPass(EntityMinecart cart) {
		if (cart instanceof GenericRailTransport
				&& ((GenericRailTransport) cart).getTypes().contains(TrainsInMotion.transportTypes.TANKER)) {
			setTrackPowering();
		}
	}
}