package si.meansoft.traincraft;

import net.minecraft.util.ResourceLocation;

/**
 * @author canitzp
 */
public enum TraincraftResources {

    GUI_DISTILLERY("gui_distillery"),
    GUI_CRAFTERSTEAM("gui_crafter_steam"),
    GUI_CRAFTERDIESEL("gui_crafter_diesel"),
    GUI_CRAFTERELECTRO("gui_crafter_electro"),
    GUI_HEARTH_FURNACE("gui_hearth_furnace");

    String name, textureName;
    TraincraftResources(String name) {
        this.name = name;
    }

    public ResourceLocation newGuiLocation(){
        return new ResourceLocation(Traincraft.MODID, "textures/gui/" + name + ".png");
    }

}
