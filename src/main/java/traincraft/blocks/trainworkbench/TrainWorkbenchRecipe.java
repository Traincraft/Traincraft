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

import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import traincraft.api.InventorySpecific;

/**
 * TrainWorkbenchRecipe implements crafting recipes that are crafted on the Train Workbench
 * Recipes will be created/registered using json files, and you should not need to make an instance of this class yourself.
 *
 * @author PseudonymPatel
 * @since 2020-7-30
 */
public class TrainWorkbenchRecipe extends net.minecraftforge.registries.IForgeRegistryEntry.Impl<IRecipe> implements IRecipe {

    private final InventorySpecific recipe;
    private final ItemStack recipeOutput;

    /**
     * Creates a new Recipe with a InventorySpecific dictating the recipe and a ItemStack dictating the result of the crafting.
     *
     * @param recipe A 3x3 (9 slot) InventorySpecific with ItemStack.EMPTY for empty slots
     * @param recipeOutput The amount and type of item in return from the crafting recipe
     */
    public TrainWorkbenchRecipe(InventorySpecific recipe, ItemStack recipeOutput) {
        this.recipe = recipe;
        this.recipeOutput = recipeOutput;
    }

    @Override
    public boolean matches(InventoryCrafting inv, World worldIn) {
        for (int i = 0; i < 9; ++i){
            //compare the ith element in the inv and recipe to see if the same.
        }
        return false;
    }

    @Override
    public ItemStack getCraftingResult(InventoryCrafting inv) {
        return recipeOutput;
    }

    @Override
    public boolean canFit(int width, int height) {
        return false;
    }

    @Override
    public ItemStack getRecipeOutput() {
        return this.recipeOutput;
    }
}
