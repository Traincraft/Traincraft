package train.common.core;

import cpw.mods.fml.common.Loader;
import mods.railcraft.common.core.RailcraftConfig;
import train.common.Traincraft;
import train.common.core.plugins.PluginRailcraft;

public class TrainModCore {


	public static void ModsLoaded() {
		if(Loader.isModLoaded("Railcraft")){
			if (!RailcraftConfig.useOldRecipes()) {
				PluginRailcraft.init();
				Traincraft.tcLog.info("Enabled Traincraft additional tracks for Railcraft");
			} else {
				Traincraft.tcLog.info(
						"You've enabled vanilla rail recipes in Railcraft. Disable them to get Traincraft additional tracks");
			}
		}
	}

}