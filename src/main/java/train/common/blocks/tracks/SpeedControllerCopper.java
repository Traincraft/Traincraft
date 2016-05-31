/**
 * This is based on Railcraft's code
 * 
 * @author CovertJaguar
 * 
 */
package train.common.blocks.tracks;

import mods.railcraft.api.tracks.ITrackInstance;
import net.minecraft.entity.item.EntityMinecart;

public class SpeedControllerCopper extends SpeedController {
	private static SpeedControllerCopper instance;

	public static SpeedControllerCopper getInstance() {
		if (instance == null) {
			instance = new SpeedControllerCopper();
		}
		return instance;
	}
	@Override
	public float getMaxSpeed(ITrackInstance track, EntityMinecart cart) {
		return 0.25F;
	}

}
