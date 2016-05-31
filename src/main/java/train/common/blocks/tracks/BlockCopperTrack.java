/**
 * @author Spitfire4466
 */
package train.common.blocks.tracks;

import net.minecraft.util.IIcon;
import train.common.library.Tracks;

public class BlockCopperTrack extends TrackBaseTraincraft {
	public BlockCopperTrack() {
		this.speedController = SpeedControllerCopper.getInstance();
	}

	@Override
	public Tracks getTrackType() {
		return Tracks.COPPER_TRACK;
	}
	@Override
	public IIcon getIcon() {
		int meta = this.tileEntity.getBlockMetadata();
		if (meta >= 6) {
			return getIcon(1);
		}
		return getIcon(0);
	}
	@Override
	public boolean isFlexibleRail() {
		return true;
	}
}