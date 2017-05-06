/*
 * This file ("HearthFurnaceRecipes.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/blob/master/LICENSE.md)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2017
 */

package si.meansoft.traincraft.api.recipes;

import net.minecraft.item.ItemStack;
import si.meansoft.traincraft.compat.VanillaUtil;

import java.util.ArrayList;
import java.util.List;

public class HearthFurnaceRecipes {

    public static List<Recipe> recipes = new ArrayList<Recipe>();

    public static void addRecipe(ItemStack firstInput, ItemStack secondInput, ItemStack output, int processTime) {
        recipes.add(new Recipe(firstInput, secondInput, output, processTime));
    }

    public static Recipe getRecipeForInput(ItemStack firstInput, ItemStack secondInput) {
        for (Recipe recipe : recipes) {
            if (ItemStack.areItemsEqual(firstInput, recipe.firstInput) && ItemStack.areItemsEqual(secondInput, recipe.secondInput)) {
                if (VanillaUtil.getCount(firstInput) >= VanillaUtil.getCount(recipe.firstInput) && VanillaUtil.getCount(secondInput) >= VanillaUtil.getCount(recipe.secondInput)) {
                    return recipe;
                }
            }
        }
        return null;
    }

    public static class Recipe {

        public ItemStack firstInput = VanillaUtil.getEmpty();
        public ItemStack secondInput = VanillaUtil.getEmpty();
        public ItemStack output = VanillaUtil.getEmpty();
        public int processTime;

        public Recipe(ItemStack firstInput, ItemStack secondInput, ItemStack output, int processTime) {
            this.firstInput = firstInput;
            this.secondInput = secondInput;
            this.output = output;
            this.processTime = processTime;
        }

    }

}
