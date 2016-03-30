package src.train.common.core;

import java.util.List;

import net.minecraft.src.BaseMod;
import src.train.common.Traincraft;
import src.train.common.core.interfaces.IPlugin;
import src.train.common.core.plugins.PluginIndustrialCraft;
import src.train.common.core.plugins.PluginRailcraft;
import src.train.common.library.BlockIDs;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.ModContainer;

public class TrainModCore {
	public static BaseMod instance;
	public static IPlugin pluginIC2 = new PluginIndustrialCraft();
	public static IPlugin pluginRailcraft = new PluginRailcraft();

	public static void RegisterNewTracks() {
		((PluginRailcraft) pluginRailcraft).registerTracks();
	}

	public static void ModsLoaded() {
		if (pluginIC2.isAvailable()) {
			pluginIC2.initialize();
			Traincraft.tcLog.info("Added plugin " + pluginIC2.getClass());
		}
		else {
			Traincraft.tcLog.info("Skipped plugin " + pluginIC2.getClass() + " mod not available.");
		}
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