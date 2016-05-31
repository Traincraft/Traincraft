/**
 * A track that detects all instance of Freight
 * 
 * @author Spitfire4466
 */
package train.common.blocks.tracks;

import mods.railcraft.api.tracks.ITrackEmitter;
import net.minecraft.entity.item.EntityMinecart;
import train.common.api.Freight;
import train.common.library.Tracks;

public class BlockDetectorFreightTrack extends BlockDetectorTrack implements ITrackEmitter {

	@Override
	public Tracks getTrackType() {
		return Tracks.DETECTOR_FREIGHT;
	}

	@Override
	public void onMinecartPass(EntityMinecart cart) {
		if (cart instanceof Freight) {
			setTrackPowering();
		}
	}

}
