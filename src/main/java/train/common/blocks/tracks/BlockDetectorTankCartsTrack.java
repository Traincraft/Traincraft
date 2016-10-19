/**
 * A track that detects all instance of Tank carts
 * 
 * @author Spitfire4466
 */
package train.common.blocks.tracks;

import mods.railcraft.api.tracks.ITrackEmitter;
import net.minecraft.entity.item.EntityMinecart;
import train.common.api.LiquidTank;
import train.common.library.Tracks;

public class BlockDetectorTankCartsTrack extends BlockDetectorTrack implements ITrackEmitter {

	@Override
	public Tracks getTrackType() {
		return Tracks.DETECTOR_TANK_CARTS;
	}

	@Override
	public void onMinecartPass(EntityMinecart cart) {
		if (cart instanceof LiquidTank) {
			setTrackPowering();
		}
	}
}