package train.common.core;

import cpw.mods.fml.common.Loader;
import train.common.Traincraft;
import train.common.core.plugins.PluginRailcraft;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TrainModCore {
	
	private static Boolean rcVanillaRecipes = true;
	
	public static void readRailcraftConfig() {
		File file = new File("./config/railcraft/railcraft.cfg");
		try {
			@SuppressWarnings("resource") Scanner scanner = new Scanner(new FileInputStream(file));
			
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine().trim();
				
				if (line.equals("B:useAltRecipes=true")) {
					rcVanillaRecipes = true;
				} else if (line.equals("B:useAltRecipes=false")) {
					rcVanillaRecipes = false;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void ModsLoaded() {
		if(Loader.isModLoaded("Railcraft")){
			readRailcraftConfig();
			if (!rcVanillaRecipes) {
				PluginRailcraft.init();
				Traincraft.tcLog.info("Enabled Traincraft additional tracks for Railcraft");
			} else {
				Traincraft.tcLog.info(
						"You've enabled vanilla rail recipes in Railcraft. Disable them to get Traincraft additional tracks");
			}
		}
	}

}