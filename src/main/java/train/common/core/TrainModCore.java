package train.common.core;

import cpw.mods.fml.common.Loader;
import train.common.core.plugins.PluginRailcraft;

public class TrainModCore {


	public static void ModsLoaded() {
		if(Loader.isModLoaded("Railcraft")){
				PluginRailcraft.init();
		}
	}

}