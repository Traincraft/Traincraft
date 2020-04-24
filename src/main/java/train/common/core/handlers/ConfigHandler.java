/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 *
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.core.handlers;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import train.common.Traincraft;
import train.common.library.Info;

import java.io.File;

import static net.minecraftforge.common.config.Configuration.CATEGORY_GENERAL;

public class ConfigHandler {

	public static boolean ORE_GEN;
	public static boolean COPPER_ORE_GEN;
	public static boolean ENABLE_ZEPPELIN;
	public static boolean SOUNDS;
	public static boolean FLICKERING;
	public static boolean ENABLE_STEAM;
	public static boolean ENABLE_DIESEL;
	public static boolean ENABLE_ELECTRIC;
	public static boolean ENABLE_BUILDER;
	public static boolean ENABLE_TENDER;
	public static boolean CHUNK_LOADING;
	public static boolean SHOW_POSSIBLE_COLORS;
	public static boolean ENERGYTRACK_USES_RF;
	public static int TRAINCRAFT_VILLAGER_ID;
	public static int WINDMILL_CHECK_RADIUS;
	public static boolean REAL_TRAIN_SPEED;
	public static boolean RETROGEN_CHUNKS;
	public static boolean MAKE_MODPACKS_GREAT_AGAIN;
	public static boolean FORCE_TEXTURE_BINDING;
	public static boolean DISABLE_NEI_RECIPES;
	public static boolean DISABLE_TRAIN_WORKBENCH;
	public static boolean ENABLE_WAGON_REMOVAL_NOTICES;
	public static boolean ENABLE_LOGGING;
	public static boolean ALLOW_ATO_ON_STEAMERS;

	public static int UPDATE_FREQUENCY=3;

	public static void changeFirstLoad(){
		Configuration cf = new Configuration(new File(Traincraft.configDirectory, Info.modName + ".cfg"));
		cf.load();
		cf.get(CATEGORY_GENERAL, "FIRST_RUN", true).set(false);
		cf.save();
	}

	public static void init(File configFile) {
		Configuration cf = new Configuration(configFile);

		try {
			cf.load();
			/* General */
			SOUNDS = cf.get(CATEGORY_GENERAL, "ENABLE_SOUNDS", true).getBoolean(true);
			FLICKERING = cf.get(CATEGORY_GENERAL, "DISABLE_FLICKERING", true,"forces trains and rollingstock to render twice, this fixes some bugs with texture flickering.").getBoolean(true);
			ORE_GEN = cf.get(CATEGORY_GENERAL, "ENABLE_FUEL_ORES_SPAWN", true).getBoolean(true);
			COPPER_ORE_GEN = cf.get(CATEGORY_GENERAL, "ENABLE_COPPER_SPAWN", true).getBoolean(true);
			ENABLE_ZEPPELIN = cf.get(CATEGORY_GENERAL, "ENABLE_ZEPPELIN", true).getBoolean(true);
			ENABLE_STEAM = cf.get(CATEGORY_GENERAL, "ENABLE_STEAM_TRAINS", true).getBoolean(true);
			ENABLE_DIESEL = cf.get(CATEGORY_GENERAL, "ENABLE_DIESEL_TRAINS", true).getBoolean(true);
			ENABLE_ELECTRIC = cf.get(CATEGORY_GENERAL, "ENABLE_ELECTRIC_TRAINS", true).getBoolean(true);
			ENABLE_BUILDER = cf.get(CATEGORY_GENERAL, "ENABLE_TRACKS_BUILDER", true).getBoolean(true);
			ENABLE_TENDER = cf.get(CATEGORY_GENERAL, "ENABLE_TENDERS", true).getBoolean(true);
			CHUNK_LOADING = cf.get(CATEGORY_GENERAL, "ENABLE_CHUNK_LOADING", true).getBoolean(true);
			TRAINCRAFT_VILLAGER_ID = cf.get(CATEGORY_GENERAL, "TRAINCRAFT_VILLAGER_ID", 86).getInt();
			Property SHOW_POSSIBLE_COLORS_PROP = cf.get(CATEGORY_GENERAL, "SHOW_POSSIBLE_TRAINS_COLORS_IN_CHAT", true);
			SHOW_POSSIBLE_COLORS_PROP.comment = "This will disable the chat messages telling you the possible colors when spawning new trains and when coloring them with dye";
			SHOW_POSSIBLE_COLORS = SHOW_POSSIBLE_COLORS_PROP.getBoolean(true);
			REAL_TRAIN_SPEED = cf.get(CATEGORY_GENERAL, "REAL_TRAIN_SPEED", false).getBoolean(false);
			ENERGYTRACK_USES_RF = cf.getBoolean("ENERGYTRACK_USES_RF", CATEGORY_GENERAL, true, "Here you can define, if electric tracks should be powered by redstone (false) or use 'real' RF-power (true) [Default: true]");
			RETROGEN_CHUNKS = cf.getBoolean("ENABLE_RETROGEN", CATEGORY_GENERAL, false, "This will generate Traincraft ores in chunks that existed prior to installing Traincraft.");
			MAKE_MODPACKS_GREAT_AGAIN = cf.getBoolean("MAKE_MODPACKS_GREAT_AGAIN", CATEGORY_GENERAL, false,
					"This will disable some of Traincrafts easier recipes to balance Modpacks");
			WINDMILL_CHECK_RADIUS = cf.getInt("WINDMILL_CHECK_RADIUS", CATEGORY_GENERAL, 1, -1, 10, "This sets the radius for the can-see-the-sky-check area around the windmill. 0=only location of windmill, 1=3x3, 2=5x5 etc. Use -1 to turn of this check completely. DEFAULT: 1");
			FORCE_TEXTURE_BINDING = cf.get(CATEGORY_GENERAL, "Force_Texture_Binding", true, "Enable this if trains and rollingstock are using block/item textures rather than their own").getBoolean(true);
			DISABLE_NEI_RECIPES = cf.get(CATEGORY_GENERAL, "DISABLE_NEI_RECIPES", true, "disables showing train and rollingstock recipes in NEI, there are a number of bugs with this feature, enable at your own risk").getBoolean(true);
			DISABLE_TRAIN_WORKBENCH = cf.get(CATEGORY_GENERAL, "DISABLE_TRAIN_WORKBENCH", false, "disables the train workbench, for those of you who want to use a custom part builder").getBoolean(false);
			ENABLE_WAGON_REMOVAL_NOTICES = cf.get(CATEGORY_GENERAL, "ENABLE_WAGON_REMOVAL_NOTICES", true, "Displays a server-wide message of when a OP player removes a train or rollingstock, also saying the owner.").getBoolean(true);
			ENABLE_LOGGING = cf.get(CATEGORY_GENERAL, "ENABLE_TRANSPORT_LOGGING", true, "Logs data for the Admin book on all trains and rollingstock, this data can be found in /config/traincraft, this has a performance cost similar to core protect, as it does similar work, but for Traincraft specifically").getBoolean(true);

			ALLOW_ATO_ON_STEAMERS = cf.get(CATEGORY_GENERAL, "ALLOW_ATO_ON_STEAMERS", false, "Allows remote control of steam trains via the Minecraft Train Control (MTC) ATO system.").getBoolean(true);

			UPDATE_FREQUENCY = cf.get(CATEGORY_GENERAL, "MOVEMENT_PACKET_FREQUENCY", 3,"how often to send and receive update packets, Older TC uses 1, Default is 3 like horses, max is 20").setMaxValue(20).setMinValue(1).getInt();


		} catch (Exception e) {
			Traincraft.tcLog.fatal("Traincraft had a problem loading its configuration\n" + e);
		} finally {
			if(cf.hasChanged()) {
				cf.save();
			}
		}
	}
}