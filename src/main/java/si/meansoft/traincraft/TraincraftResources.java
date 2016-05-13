package si.meansoft.traincraft;

import net.minecraft.util.ResourceLocation;

/**
 * @author canitzp
 */
public enum TraincraftResources {

    DISTILLERY("guiDistillery"),
    CRAFTERSTEAM("guiCrafterSteam"),
    CRAFTERDIESEL("guiCrafterDiesel"),
    CRAFTERELECTRO("guiCrafterElectro")
    ;

    String name;
    TraincraftResources(String guiName) {
        this.name = guiName;
    }

    public ResourceLocation newResourceLocation(){
        return new ResourceLocation(Traincraft.MODID, "textures/gui/" + name + ".png");
    }


}
