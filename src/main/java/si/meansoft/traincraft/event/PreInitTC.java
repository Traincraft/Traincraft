/*
 * Copyright (c) 2014 Mrbrutal. All rights reserved.
 * Do not modify or redistribute without written permission.
 *
 * @author Mrbrutal
 */

package si.meansoft.traincraft.event;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import si.meansoft.meancore.event.PreInit;
import si.meansoft.traincraft.common.config.ConfigHandler;

public class PreInitTC extends PreInit {

    public void init(FMLPreInitializationEvent evt) {

        System.out.println("TC: " + evt.getModConfigurationDirectory() + " : " + evt.getSuggestedConfigurationFile());

        ConfigHandler.init(evt.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigHandler());
    }
}
