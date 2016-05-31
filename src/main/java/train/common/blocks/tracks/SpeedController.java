/**
 * This is based on Railcraft's code
 * 
 * @author CovertJaguar
 * 
 */
package train.common.blocks.tracks;

import mods.railcraft.api.tracks.ITrackInstance;
import net.minecraft.entity.item.EntityMinecart;

public class SpeedController {
	private static SpeedController instance;

	public static SpeedController getInstance() {
		if (instance == null) {
			instance = new SpeedController();
		}
		return instance;
	}

	public float getMaxSpeed(ITrackInstance track, EntityMinecart cart) {
		return 0.4F;
	}

}
