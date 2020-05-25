package traincraft.config;

import java.io.File;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import traincraft.Traincraft;

public class Config {
	
    private static Configuration config;
    protected static final String GENERAL = "General";
    //TODO
    public static boolean EXAMPLE_SETTING;

    public static final void initalize(File file){
        config = new Configuration(file, "1.0", true);
        MinecraftForge.EVENT_BUS.register(new ConfigEventHandler());
        config.load();
        config.setCategoryRequiresWorldRestart(GENERAL, true);//TODO
        config.setCategoryRequiresMcRestart(GENERAL, true);//TODO
        config.setCategoryComment(GENERAL, "General " + Traincraft.MOD_NAME + " Settings.");
        reload();
        config.save();
    }

    public static final Configuration getConfig(){
        return config;
    }

    protected static final void reload(){
        EXAMPLE_SETTING = config.getBoolean("example_setting", GENERAL, false, "This is an example setting, remove it once there are actual settings here.");
    }
    
}
