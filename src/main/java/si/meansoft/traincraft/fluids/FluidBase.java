package si.meansoft.traincraft.fluids;

import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import si.meansoft.traincraft.IRegistryEntry;
import si.meansoft.traincraft.Traincraft;
import si.meansoft.traincraft.network.CommonProxy;

/**
 * @author canitzp
 */
public class FluidBase extends Fluid implements IRegistryEntry{

    private Material material;
    public FluidBlockBase fluidBlock;

    public FluidBase(String fluidName, String textureName, Material material){
        super(fluidName, new ResourceLocation(Traincraft.MODID, "fluids/" + textureName + "Still"), new ResourceLocation(Traincraft.MODID, "fluids/" + textureName + "Flowing"));
        this.material = material;
    }

    @Override
    public IRegistryEntry[] getRegisterElements(){
        return new IRegistryEntry[]{this};
    }

    @Override
    public void onRegister(IRegistryEntry[] otherEntries){

    }

    @Override
    public void ownRegistry(){
        FluidRegistry.registerFluid(this);
        FluidRegistry.addBucketForFluid(this);
        CommonProxy.addFluid(this);
        this.fluidBlock = new FluidBlockBase(this, this.material);
        this.fluidBlock.onRegister(new IRegistryEntry[0]);
    }
}
