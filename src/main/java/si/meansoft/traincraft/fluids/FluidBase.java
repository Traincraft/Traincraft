package si.meansoft.traincraft.fluids;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import si.meansoft.traincraft.Traincraft;

/**
 * @author canitzp
 */
public class FluidBase extends Fluid{

    public FluidBase(String fluidName, String textureName){
        super(fluidName, new ResourceLocation(Traincraft.MODID, "fluids/" + textureName + "Still"), new ResourceLocation(Traincraft.MODID, "fluids/" + textureName + "Flowing"));
    }

}
