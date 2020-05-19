package train.common.core.plugins;

import codechicken.nei.api.API;
import codechicken.nei.api.IConfigureNEI;
import train.common.Traincraft;
import train.common.core.handlers.ConfigHandler;

public class NEITraincraftConfig implements IConfigureNEI {

	@Override
	public void loadConfig() {
		if (!ConfigHandler.DISABLE_NEI_RECIPES) {
            API.registerRecipeHandler(new NEITraincraftWorkbenchRecipePlugin());
            API.registerUsageHandler(new NEITraincraftWorkbenchRecipePlugin());
            API.registerRecipeHandler(new NEIAssemblyTableRecipePlugin());
            API.registerUsageHandler(new NEIAssemblyTableRecipePlugin());
            API.registerRecipeHandler(new NEIOpenHearthFurnaceRecipePlugin());
            API.registerUsageHandler(new NEIOpenHearthFurnaceRecipePlugin());
            API.registerRecipeHandler(new NEIDistillationTowerRecipePlugin());
            API.registerUsageHandler(new NEIDistillationTowerRecipePlugin());
        }
	}

	@Override
    public String getName() {
		return Traincraft.MOD_NAME;
    }

    @Override
    public String getVersion() {
		return Traincraft.MOD_VERSION;
    }    
}