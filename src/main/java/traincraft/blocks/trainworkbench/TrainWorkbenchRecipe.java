/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("TrainWorkbenchRecipe.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.blocks.trainworkbench;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;
import org.apache.logging.log4j.Level;
import org.cyclops.cyclopscore.ingredient.storage.InconsistentIngredientInsertionException;
import traincraft.Traincraft;
import traincraft.api.InventoryBase;

import java.util.ArrayList;

/**
 * TrainWorkbenchRecipe implements crafting recipes that are crafted on the Train Workbench
 * Recipes will be created/registered using json files, and you should not need to make an instance of this class yourself.
 * If you don't notice from my numerous comments, this is literally a modified vanilla crafting table, mostly same json recipes.
 *
 * @author PseudonymPatel
 * @since 2020-7-30
 */
public class TrainWorkbenchRecipe extends net.minecraftforge.registries.IForgeRegistryEntry.Impl<IRecipe> implements IRecipe {

    public static ArrayList<TrainWorkbenchRecipe> TRAINWORKBENCH_RECIPES = new ArrayList<>();

    private final NonNullList<Ingredient> recipe;
    private final ItemStack recipeOutput;
    private final int recipeWidth;
    private final int recipeHeight;

    /**
     * Creates a new Recipe with a InventorySpecific dictating the recipe and a ItemStack dictating the result of the crafting.
     *
     * @param recipe A 3x3 (9 slot) InventorySpecific with ItemStack.EMPTY for empty slots
     * @param recipeOutput The amount and type of item in return from the crafting recipe
     */
    public TrainWorkbenchRecipe(NonNullList<Ingredient> recipe, ItemStack recipeOutput, int recipeWidth, int recipeHeight) {
        this.recipe = recipe;
        this.recipeOutput = recipeOutput;
        this.recipeWidth = recipeWidth;
        this.recipeHeight = recipeHeight;
    }

    /**
     * Use this instead of matches() because InventoryCrafting has so many problems.
     * WARNING: only takes 3x3 matrices.
     * WARNING: will overflow if no items in recipe.
     *
     * @param inv the inventory to compare
     * @return whether the recipe matches the inventory or not
     */
    public boolean betterMatches(IInventory inv) {
        //eliminate empty rows and columns for non 3x3 crafting
        if (inv.getStackInSlot(0) == ItemStack.EMPTY && inv.getStackInSlot(1) == ItemStack.EMPTY && inv.getStackInSlot(2) == ItemStack.EMPTY) {
            //first row is empty, shift everything up one, and rerun the function with new inventory.
            InventoryBasic newInv = new InventoryBasic("newInv", false, 9);
            for (int i = 3; i < 9; ++i) { //set the bottom two row to top
                newInv.setInventorySlotContents(i - 3, inv.getStackInSlot(i));
            }
            for (int i = 7; i < 9; ++i) { //make bottom row empty as there is nothing there
                newInv.setInventorySlotContents(i, ItemStack.EMPTY);
            }
            return betterMatches(newInv);
        }

        //TODO: eliminate empty columns
        if (inv.getStackInSlot(0) == ItemStack.EMPTY && inv.getStackInSlot(3) == ItemStack.EMPTY && inv.getStackInSlot(6) == ItemStack.EMPTY) {
            InventoryBasic newInv = new InventoryBasic("newInv", false, 9);

            //do this manually, sadly it might be the best way :(
            newInv.setInventorySlotContents(0, inv.getStackInSlot(1));
            newInv.setInventorySlotContents(1, inv.getStackInSlot(2));
            newInv.setInventorySlotContents(2, ItemStack.EMPTY);

            newInv.setInventorySlotContents(3, inv.getStackInSlot(4));
            newInv.setInventorySlotContents(4, inv.getStackInSlot(5));
            newInv.setInventorySlotContents(5, ItemStack.EMPTY);

            newInv.setInventorySlotContents(6, inv.getStackInSlot(7));
            newInv.setInventorySlotContents(7, inv.getStackInSlot(8));
            newInv.setInventorySlotContents(8, ItemStack.EMPTY);

            return betterMatches(newInv);
        }

        for (int i = 0; i < recipe.size(); ++i) {
            //use getMatching stacks to compare ingredients
            boolean foundOne = false;

            //account for empty stacks
            if (Ingredient.fromStacks(inv.getStackInSlot(i)) == Ingredient.EMPTY) {
                if (recipe.get(i) == Ingredient.EMPTY) {
                    continue;
                } else {
                    return false;
                }
            }

            //compare every possible item from ingredient in both fields, if find one then go to next slot
            for (ItemStack invStack : Ingredient.fromStacks(inv.getStackInSlot(i)).getMatchingStacks()) {
                for (ItemStack recStack : recipe.get(i).getMatchingStacks()) {
                    if (invStack.getItem() == recStack.getItem()) {
                        foundOne = true;
                        break;
                    }
                }
                if (foundOne) break;
            }
            if (!foundOne) {
                return false;
            }
        }

//        //the following is for vanilla crafting in both 3x3 and non sizes
//        //each for loop iterates over possible rows and cols for the recipe to possibly be in.
//        for (int i = 0; i <= 3 - this.recipeWidth; ++i) {
//            for (int j = 0; j <= 3 - this.recipeHeight; ++j) {
//                if (this.checkMatch(inv, i, j, true)) {
//                    return true;
//                }
//                if (this.checkMatch(inv, i, j, false)) {
//                    return true;
//                }
//            }
//        }
        return true;
    }

    //turning this simply to false is a "hacky" workaround to non having it be craftable in vanilla ctable, because trainworkbench uses betterMatch
    @Override
    public boolean matches(InventoryCrafting inv, World worldIn) {
        return false;
    }

    //did it this way because vanilla ctable did it this way.
    @Override
    public ItemStack getCraftingResult(InventoryCrafting inv) {
        return this.getRecipeOutput().copy();
    }

    @Override
    public boolean canFit(int width, int height) {
        return true;
    }

    @Override
    public ItemStack getRecipeOutput() {
        return this.recipeOutput;
    }

    //guess where I got this from.
    //Not fully deobfuscated but works. slightly modified for this use case, and only 3x3 matrix, bc not vanilla inventory crafting
//    private boolean checkMatch(IInventory craftingInventory, int p_77573_2_, int p_77573_3_, boolean p_77573_4_) {
//        for (int i = 0; i < 3; ++i) {
//            for (int j = 0; j < 3; ++j) {
//                int k = i - p_77573_2_;
//                int l = j - p_77573_3_;
//                Ingredient ingredient = Ingredient.EMPTY;
//
//                if (k >= 0 && l >= 0 && k < this.recipeWidth && l < this.recipeHeight) {
//                    if (p_77573_4_) {
//                        ingredient = this.recipe.get(this.recipeWidth - k - 1 + l * this.recipeWidth);
//                    } else {
//                        ingredient = this.recipe.get(k + l * this.recipeWidth);
//                    }
//                }
//
//                if (!ingredient.apply(craftingInventory.getStackInRowAndColumn(i, j))) {
//                    return false;
//                }
//            }
//        }
//
//        return true;
//    }
}
