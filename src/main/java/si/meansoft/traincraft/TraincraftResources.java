package si.meansoft.traincraft;

import net.minecraft.util.ResourceLocation;

/**
 * @author canitzp
 */
public enum TraincraftResources {

    GUI_DISTILLERY("guiDistillery"),
    GUI_CRAFTERSTEAM("guiCrafterSteam"),
    GUI_CRAFTERDIESEL("guiCrafterDiesel"),
    GUI_CRAFTERELECTRO("guiCrafterElectro"),
    GUI_HEARTH_FURNACE("guiHearthFurnace");

    String name, textureName;
    TraincraftResources(String name) {
        this.name = name;
    }

    public ResourceLocation newGuiLocation(){
        return new ResourceLocation(Traincraft.MODID, "textures/gui/" + name + ".png");
    }

}
