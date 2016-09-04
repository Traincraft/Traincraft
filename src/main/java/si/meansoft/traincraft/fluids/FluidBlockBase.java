package si.meansoft.traincraft.fluids;

import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import si.meansoft.traincraft.IRegistryEntry;
import si.meansoft.traincraft.Traincraft;

/**
 * @author canitzp
 */
public class FluidBlockBase extends BlockFluidClassic implements IRegistryEntry{

    public FluidBlockBase(Fluid fluid, Material material){
        super(fluid, material);
        setRegistryName(Traincraft.MODID, fluid.getName());
        setUnlocalizedName(Traincraft.MODID + "." + fluid.getName());
    }

    @Override
    public IRegistryEntry[] getRegisterElements(){
        return new IRegistryEntry[]{this};
    }

    @Override
    public String getName(){
        return this.fluidName;
    }

    @Override
    public void onRegister(IRegistryEntry[] otherEntries){
    }

    @Override
    public void ownRegistry(){

    }
}
