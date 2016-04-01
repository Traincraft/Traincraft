/**
 * @author Spitfire4466
 */
package src.train.common.blocks.tracks;

import net.minecraft.util.IIcon;
import src.train.common.library.TrackIDs;

public class BlockSnowySteelTrack extends TrackBaseTraincraft {
	public BlockSnowySteelTrack() {
		this.speedController = SpeedControllerSteel.getInstance();
	}

	@Override
	public TrackIDs getTrackType() {
		return TrackIDs.SNOWY_STEEL_TRACK;
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