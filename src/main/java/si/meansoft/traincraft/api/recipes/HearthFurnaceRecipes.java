/*
 * This file ("HearthFurnaceRecipes.java") is part of the Traincraft mod for Minecraft.
 * It is created by all persons that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/LICENSE.MD)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2016
 */

package si.meansoft.traincraft.api.recipes;

import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class HearthFurnaceRecipes{

    public static List<Recipe> recipes = new ArrayList<Recipe>();

    public static void addRecipe(ItemStack firstInput, ItemStack secondInput, ItemStack output, int processTime){
        recipes.add(new Recipe(firstInput, secondInput, output, processTime));
    }

    public static Recipe getRecipeForInput(ItemStack firstInput, ItemStack secondInput){
        for(Recipe recipe : recipes){
            if(ItemStack.areItemsEqual(firstInput, recipe.firstInput) && ItemStack.areItemsEqual(secondInput, recipe.secondInput)){
                if(firstInput.getCount() >= recipe.firstInput.getCount() && secondInput.getCount() >= recipe.secondInput.getCount()){
                    return recipe;
                }
            }
        }
        return null;
    }

    public static class Recipe{

        public ItemStack firstInput = ItemStack.EMPTY;
        public ItemStack secondInput = ItemStack.EMPTY;
        public ItemStack output = ItemStack.EMPTY;
        public int processTime;

        public Recipe(ItemStack firstInput, ItemStack secondInput, ItemStack output, int processTime){
            this.firstInput = firstInput;
            this.secondInput = secondInput;
            this.output = output;
            this.processTime = processTime;
        }

    }

}
