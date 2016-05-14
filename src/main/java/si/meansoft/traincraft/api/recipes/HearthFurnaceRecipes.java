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
                if(firstInput.stackSize >= recipe.firstInput.stackSize && secondInput.stackSize >= recipe.secondInput.stackSize){
                    return recipe;
                }
            }
        }
        return null;
    }

    public static class Recipe{

        public ItemStack firstInput;
        public ItemStack secondInput;
        public ItemStack output;
        public int processTime;

        public Recipe(ItemStack firstInput, ItemStack secondInput, ItemStack output, int processTime){
            this.firstInput = firstInput;
            this.secondInput = secondInput;
            this.output = output;
            this.processTime = processTime;
        }

    }

}
