package si.meansoft.traincraft;

import net.minecraft.util.ResourceLocation;

/**
 * @author canitzp
 */
public enum TraincraftResources {

    DISTILLERY("guiDistillery");

    String name;
    TraincraftResources(String guiName) {
        this.name = guiName;
    }

    public ResourceLocation newResourceLocation(){
        return new ResourceLocation(Traincraft.MODID, "textures/gui/" + name + ".png");
    }


}
