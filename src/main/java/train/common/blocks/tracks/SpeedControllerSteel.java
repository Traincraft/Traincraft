/**
 * This is based on Railcraft's code
 * 
 * @author CovertJaguar
 * 
 */
package train.common.blocks.tracks;

import mods.railcraft.api.tracks.ITrackInstance;
import net.minecraft.entity.item.EntityMinecart;

public class SpeedControllerSteel extends SpeedController {
	private static SpeedControllerSteel instance;

	public static SpeedControllerSteel getInstance() {
		if (instance == null) {
			instance = new SpeedControllerSteel();
		}
		return instance;
	}
	@Override
	public float getMaxSpeed(ITrackInstance track, EntityMinecart cart) {
		return 0.55F;
	}

}
