package si.meansoft.traincraft.api.recipes;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;
import org.apache.commons.lang3.tuple.Pair;

import java.util.HashMap;

/**
 * @author canitzp
 */
public class DistilleryRecipes {

    private static HashMap<ItemStack, RecipeHandler> recipeMap = new HashMap<ItemStack, RecipeHandler>();
    private static HashMap<ItemStack, Pair<ItemStack, FluidStack>> fillingMap = new HashMap<ItemStack, Pair<ItemStack, FluidStack>>();

    public static void addRecipe(ItemStack output, ItemStack input, FluidStack fluidOutput, float exp, int burnTime){
        recipeMap.put(input, new RecipeHandler(burnTime, exp, fluidOutput, output));
    }
    public static void addRecipe(ItemStack output, ItemStack input, FluidStack fluidOutput, float exp){
        addRecipe(output, input, fluidOutput, exp, 200);
    }
    public static void addRecipe(ItemStack output, ItemStack input, FluidStack fluidOutput){
        addRecipe(output, input, fluidOutput, 0, 200);
    }
    public static void addRecipe(ItemStack output, ItemStack input){
        addRecipe(output, input, null, 0, 200);
    }

    public static void addFillingRecipe(ItemStack output, ItemStack input, FluidStack inputFluid){
        fillingMap.put(output, Pair.of(input, inputFluid));
    }

    public static RecipeHandler getRecipe(ItemStack input){
        return recipeMap.containsKey(input) ? recipeMap.get(input) : null;
    }

    private static class RecipeHandler {
        public ItemStack outputStack;
        public FluidStack outputFluid;
        public float outputExp;
        public int burnTime;
        public RecipeHandler(int burnTime, float outputExp, FluidStack outputFluid, ItemStack outputStack) {
            this.burnTime = burnTime;
            this.outputExp = outputExp;
            this.outputFluid = outputFluid;
            this.outputStack = outputStack;
        }
    }
}
