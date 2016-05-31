package train.common.core;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.ModContainer;
import train.common.Traincraft;
import train.common.core.interfaces.IPlugin;
import train.common.core.plugins.PluginRailcraft;

import java.util.List;

public class TrainModCore {


	public static void ModsLoaded() {
		if(Loader.isModLoaded("Railcraft")){
			PluginRailcraft.init();
		}
	}

}