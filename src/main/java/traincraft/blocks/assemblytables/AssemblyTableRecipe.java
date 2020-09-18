/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("AssemblyTableRecipe.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.blocks.assemblytables;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.NonNullList;
import traincraft.api.IDummyRecipe;
import traincraft.api.NumberedIngredient;

import java.util.ArrayList;

/**
 * Recipes for all 3 tiers of assembly table. Stores the tier of recipe.
 *
 * @author PseudonymPatel
 * @since 2020-8-7
 */
public class AssemblyTableRecipe extends net.minecraftforge.registries.IForgeRegistryEntry.Impl<IRecipe> implements IDummyRecipe {
    
    public static ArrayList<AssemblyTableRecipe> ASSEMBLY_TABLE_RECIPES = new ArrayList<>();
    
    private final int tier;
    private final ItemStack output;
    private NonNullList<NumberedIngredient> craftingIngredients = NonNullList.withSize(10, NumberedIngredient.EMPTY);
    
    public AssemblyTableRecipe(int tier, ItemStack resultItemStack){
        this.tier = tier;
        this.output = resultItemStack;
    }
    
    public AssemblyTableRecipe(int tier, ItemStack resultItemStack, NonNullList<NumberedIngredient> craftingIngredients){
        this.tier = tier;
        this.output = resultItemStack;
        this.craftingIngredients = craftingIngredients;
    }
    
    public void setCraftingIngredient(int index, NumberedIngredient numberedIngredient){
        this.craftingIngredients.set(index, numberedIngredient);
    }
    
    public NumberedIngredient getCraftingIngredient(int index){
        return this.craftingIngredients.get(index);
    }
    
    public int getTier(){
        return this.tier;
    }
    
    public ItemStack getOutput(){
        return output;
    }
}