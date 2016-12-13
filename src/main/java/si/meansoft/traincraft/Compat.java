/*
 * This file ("Compat.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/blob/master/LICENSE.md)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2016
 */

package si.meansoft.traincraft;

import net.minecraftforge.fml.common.Loader;

/**
 * @author canitzp
 */
public class Compat{

    public static boolean isTeslaLoaded = Loader.isModLoaded("tesla");
    public static boolean isRailcraftLoaded = Loader.isModLoaded("railcraft");

}
