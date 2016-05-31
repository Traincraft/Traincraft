/**
 * A track that detects all instance of Locomotive
 * 
 * @author Spitfire4466
 */
package train.common.blocks.tracks;

import mods.railcraft.api.tracks.ITrackEmitter;
import net.minecraft.entity.item.EntityMinecart;
import train.common.api.Locomotive;
import train.common.library.Tracks;

public class BlockDetectorHornAllLocomotiveTrack extends BlockDetectorTrack implements ITrackEmitter {

	@Override
	public Tracks getTrackType() {
		return Tracks.HORN_ALL_LOCOMOTIVES;
	}
	@Override
	public void onMinecartPass(EntityMinecart cart) {
		if (cart instanceof Locomotive) {
			((Locomotive)cart).soundHorn();
		}
	}

}
