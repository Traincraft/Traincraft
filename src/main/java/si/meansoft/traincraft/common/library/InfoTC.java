/*
 * Copyright (c) 2014 Mrbrutal. All rights reserved.
 * Do not modify or redistribute without written permission.
 *
 * @author Mrbrutal
 */

package si.meansoft.traincraft.common.library;

import si.meansoft.meancore.common.library.InfoMC;

public class InfoTC {

    public static final String MOD = "TC";
    public static final String MODID = "traincraft";
    public static final String MODNAME = "Traincraft";

    public static final String FINGERPRINT = "@FINGERPRINT@";
    public static final String VERSION = "@VERSION@";

    public static final String SERVER_PROXY = "si.meansoft.traincraft.proxy.ServerProxy";
    public static final String CLIENT_PROXY = "si.meansoft.traincraft.proxy.ClientProxy";
    public static final String GUI_FACTORY = "si.meansoft.traincraft.client.core.GuiFactory";

    //TODO change to hard dependency
    public static final String DEPENDENCIES = InfoMC.DEPENDENCIES + "required-after:MeanCore@[" + InfoMC.VERSION + ");";
}
