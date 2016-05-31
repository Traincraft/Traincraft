/**
 * @author Spitfire4466
 */
package train.common.blocks.tracks;

import net.minecraft.util.IIcon;
import train.common.library.Tracks;

public class BlockVanillaSnowyTrack extends TrackBaseTraincraft {

	@Override
	public Tracks getTrackType() {
		return Tracks.VANILLA_SNOWY_TRACK;
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