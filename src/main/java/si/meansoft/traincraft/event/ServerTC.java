/*
 * Copyright (c) 2014 Mrbrutal. All rights reserved.
 * Do not modify or redistribute without written permission.
 *
 * @author Mrbrutal
 */

package si.meansoft.traincraft.event;

import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.event.FMLServerStoppingEvent;
import si.meansoft.meancore.common.command.CommEMClient;
import si.meansoft.meancore.common.command.CommEMServer;
import si.meansoft.meancore.event.Server;

public class ServerTC extends Server {

    public void initStart(FMLServerStartingEvent evt) {
        //super.initStart(evt);
    }

    public void initStop(FMLServerStoppingEvent evt) {
        super.initStop(evt);
    }
}
