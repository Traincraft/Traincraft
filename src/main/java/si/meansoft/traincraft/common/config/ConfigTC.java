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
import si.meansoft.meancore.common.config.ConfigHandler;
import si.meansoft.traincraft.common.library.InfoTC;

public class ConfigTC {
    public static int testValue;

    public static void init() {
        testValue = ConfigHandler.loadInt(0, Configuration.CATEGORY_GENERAL, "Updates", "Bother for updates on launch?");
    }

    @SubscribeEvent
    public void onConfigChangeEvt(ConfigChangedEvent.OnConfigChangedEvent evt) {
        if(evt.modID.equalsIgnoreCase(InfoTC.MODID)) {
            init();
        }
    }
}
