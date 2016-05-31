package train.common.core;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.ModContainer;
import train.common.Traincraft;
import train.common.core.interfaces.IPlugin;
import train.common.core.plugins.PluginRailcraft;

import java.util.List;

public class TrainModCore {
	public static IPlugin pluginRailcraft = new PluginRailcraft();

	public static void RegisterNewTracks() {
		((PluginRailcraft) pluginRailcraft).registerTracks();
	}

	public static void ModsLoaded() {
		if (pluginRailcraft.isAvailable()) {
			pluginRailcraft.initialize();
			Traincraft.tcLog.info("Added plugin " + pluginRailcraft.getClass());
		}
		else {
			Traincraft.tcLog.info("Skipped plugin " + pluginRailcraft.getClass() + " mod not available.");
		}
	}

	public static boolean isPresent(String modId) {
		if (Loader.instance().getActiveModList() != null) {
			List<ModContainer> mods = Loader.instance().getActiveModList();
			for (int i = 0; i < mods.size(); i++) {
				if (mods.get(i).getModId().equals(modId)) {
					return true;
				}
			}
		}
		return false;
	}
}