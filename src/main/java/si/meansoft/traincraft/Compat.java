package si.meansoft.traincraft;

import net.minecraftforge.fml.common.Loader;

/**
 * @author canitzp
 */
public class Compat{

    public static boolean isTeslaLoaded = Loader.isModLoaded("tesla");
    public static boolean isRailcraftLoaded = Loader.isModLoaded("railcraft");

}
