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
    GUI_HEARTH_FURNACE("guiHearthFurnace"),

    OBJ_WINDMILL("modelWindmill", "modelWindmill"),
    OBJ_WINDMILLWHEEL("modelWindmillWheel", "modelWindmillWheel");

    String name, textureName;
    TraincraftResources(String name) {
        this.name = name;
    }

    //For .obj models
    TraincraftResources(String name, String textureName) {
        this.name = name;
        this.textureName = textureName;
    }

    public ResourceLocation newGuiLocation(){
        return new ResourceLocation(Traincraft.MODID, "textures/gui/" + name + ".png");
    }

    public ResourceLocation newOBJLocation(){
        return new ResourceLocation(Traincraft.MODID, "block/" + name + ".obj");
    }
    public ResourceLocation newTextureForOBJ(){
        return textureName != null ? new ResourceLocation(Traincraft.MODID, "textures/blocks/" + textureName + ".png") : null;
    }


}
