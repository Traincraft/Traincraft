/**
 * A track that detects all instance of Freight
 * 
 * @author Spitfire4466
 */
package train.blocks.tracks;

import ebf.tim.entities.GenericRailTransport;
import mods.railcraft.api.tracks.ITrackEmitter;
import net.minecraft.entity.item.EntityMinecart;
import train.library.Tracks;

public class BlockDetectorFreightTrack extends BlockDetectorTrack implements ITrackEmitter {

	@Override
	public Tracks getTrackType() {
		return Tracks.DETECTOR_FREIGHT;
	}

	@Override
	public void onMinecartPass(EntityMinecart cart) {
		if (cart instanceof GenericRailTransport && ((GenericRailTransport) cart).getInventoryRows()>0) {
			setTrackPowering();
		}
	}

}
