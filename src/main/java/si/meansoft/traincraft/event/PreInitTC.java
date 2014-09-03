/*
 * Copyright (c) 2014 Mrbrutal. All rights reserved.
 * Do not modify or redistribute without written permission.
 *
 * @author Mrbrutal
 */

package si.meansoft.traincraft.event;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import si.meansoft.meancore.common.config.ConfigHandler;
import si.meansoft.meancore.event.PreInit;
import si.meansoft.traincraft.common.config.ConfigTC;
import si.meansoft.traincraft.common.library.InfoTC;

public class PreInitTC extends PreInit {

    public void init(FMLPreInitializationEvent evt) {

        System.out.println("TC: " + evt.getModConfigurationDirectory());

        ConfigHandler.init(evt.getSuggestedConfigurationFile(), InfoTC.MODID);
        FMLCommonHandler.instance().bus().register(new ConfigTC());
    }
}
