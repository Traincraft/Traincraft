/*
 * This file ("DistilleryRecipes.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/blob/master/LICENSE.md)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2017
 */

package si.meansoft.traincraft.api.recipes;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;
import org.apache.commons.lang3.tuple.Pair;
import si.meansoft.traincraft.compat.VanillaUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * @author canitzp
 */
public class DistilleryRecipes {

    private static Map<ItemStack, RecipeHandler> recipeMap = new HashMap<ItemStack, RecipeHandler>();
    private static Map<ItemStack, Pair<ItemStack, FluidStack>> fillingMap = new HashMap<ItemStack, Pair<ItemStack, FluidStack>>();

    public static void addRecipe(ItemStack output, ItemStack input, FluidStack fluidOutput, float exp, int burnTime) {
        recipeMap.put(input, new RecipeHandler(burnTime, exp, fluidOutput.copy(), output.copy()));
    }

    public static void addRecipe(ItemStack output, ItemStack input, FluidStack fluidOutput, float exp) {
        addRecipe(output, input, fluidOutput, exp, 200);
    }

    public static void addRecipe(ItemStack output, ItemStack input, FluidStack fluidOutput) {
        addRecipe(output, input, fluidOutput, 0, 200);
    }

    public static void addRecipe(ItemStack output, ItemStack input) {
        addRecipe(output, input, null, 0, 200);
    }

    public static void addFillingRecipe(ItemStack output, ItemStack input, FluidStack inputFluid) {
        fillingMap.put(output, Pair.of(input, inputFluid));
    }

    public static Pair<ItemStack, FluidStack> getFillingOutput(ItemStack input, FluidStack inputFluid) {
        return fillingMap.containsKey(input) ? fillingMap.get(input) : null;
    }

    public static RecipeHandler getRecipe(ItemStack input) {
        for (Map.Entry<ItemStack, RecipeHandler> entry : recipeMap.entrySet()) {
            if (entry.getKey().isItemEqual(input)) {
                return entry.getValue();
            }
        }
        return null;
    }

    public static boolean isStackInput(ItemStack stack) {
        for (ItemStack input : recipeMap.keySet()) {
            if (ItemStack.areItemsEqual(input, stack)) {
                return true;
            }
        }
        return false;
    }

    public static class RecipeHandler {
        public ItemStack outputStack = VanillaUtil.getEmpty();
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
