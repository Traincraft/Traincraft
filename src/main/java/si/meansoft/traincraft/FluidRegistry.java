package si.meansoft.traincraft;

import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fml.common.registry.GameRegistry;
import si.meansoft.traincraft.blocks.BlockBase;
import si.meansoft.traincraft.fluids.FluidBase;
import si.meansoft.traincraft.items.ItemBlockGeneric;

/**
 * @author canitzp
 */
public class FluidRegistry{

    public static Fluid diesel;
    public static BlockFluidClassic blockDiesel;

    public static void preInit(){
        diesel = registerFluid("diesel", "blockDiesel");
        blockDiesel = registerFluidBlock(diesel, Material.WATER);
    }

    private static Fluid registerFluid(String fluidName, String fluidTextureName){
        Fluid fluid = new FluidBase(fluidName, fluidTextureName);
        net.minecraftforge.fluids.FluidRegistry.registerFluid(fluid);
        net.minecraftforge.fluids.FluidRegistry.addBucketForFluid(fluid);
        return fluid;
    }

    private static BlockFluidClassic registerFluidBlock(Fluid fluid, Material material){
        BlockFluidClassic fluidBlock = new BlockFluidClassic(fluid, material);
        GameRegistry.register(fluidBlock.setRegistryName(fluid.getName()).setUnlocalizedName(Traincraft.MODID + ":" + fluid.getUnlocalizedName()));
        GameRegistry.register(new ItemBlockGeneric(fluidBlock));
        return fluidBlock;
    }

}
