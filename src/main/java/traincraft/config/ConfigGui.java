package traincraft.config;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;
import traincraft.Traincraft;

public class ConfigGui extends GuiConfig {

	public ConfigGui(GuiScreen parent){
		super(parent, getList(), Traincraft.MOD_ID, false, false, "Traincraft Configuration");
		titleLine2 = Config.getConfig().getConfigFile().getAbsolutePath();
	}

	private static List<IConfigElement> getList(){
		List<IConfigElement> list = new ArrayList<IConfigElement>();
        list.add(new ConfigElement(Config.getConfig().getCategory(Config.GENERAL)));
		return list;
	}

}
