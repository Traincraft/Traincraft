package si.meansoft.traincraft;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import si.meansoft.traincraft.api.recipes.DistilleryRecipes;

/**
 * @author canitzp
 */
public class RecipeRegistry {

    public static void init(){
        initDistillRecipes();
    }

    private static void initDistillRecipes(){
        DistilleryRecipes.addRecipe(new ItemStack(Items.apple), new ItemStack(BlockRegistry.oilSand), new FluidStack(FluidRegistry.WATER, 1000), 50, 500);
    }

}
