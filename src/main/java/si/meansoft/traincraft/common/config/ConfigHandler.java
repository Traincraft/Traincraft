/*
 * Copyright (c) 2014 Mrbrutal. All rights reserved.
 * Do not modify or redistribute without written permission.
 *
 * @author Mrbrutal
 */

package si.meansoft.traincraft.common.config;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;
import si.meansoft.meancore.common.library.InfoMC;

import java.io.File;

public class ConfigHandler {

    public static Configuration config;
    public static boolean updates;

    public static void init(File file) {
        if(config == null) {
            config = new Configuration(file);
        }
    }

    private static void loadConfiguration() {
        updates = config.getBoolean(Configuration.CATEGORY_GENERAL, "Updates", true, "Bother for updates on launch?");

        if (config.hasChanged()) {
            config.save();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.modID.equalsIgnoreCase(InfoMC.MODID)) {
            loadConfiguration();
        }
    }
}
