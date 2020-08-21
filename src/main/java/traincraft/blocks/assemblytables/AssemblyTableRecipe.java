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

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.ArrayList;

/**
 * Recipes for all 3 tiers of assembly table. Stores the tier of recipe.
 *
 * @author PseudonymPatel
 * @since 2020-8-7
 */
public class AssemblyTableRecipe extends net.minecraftforge.registries.IForgeRegistryEntry.Impl<IRecipe> implements IRecipe {

    public static ArrayList<AssemblyTableRecipe> ASSEMBLY_TABLE_RECIPES = new ArrayList<>();
    
    private final int tier;
    private NonNullList<NumberedIngredient> craftingIngredients = NonNullList.withSize(10, new NumberedIngredient());
    private final ItemStack craftingResult;
    
    public AssemblyTableRecipe(int tier, ItemStack craftingResult) {
        this.tier = tier;
        this.craftingResult = craftingResult;
    }
    
    public AssemblyTableRecipe(int tier, ItemStack craftingResult, NonNullList<NumberedIngredient> craftingIngredients) {
        this.tier = tier;
        this.craftingResult = craftingResult;
        this.craftingIngredients = craftingIngredients;
    }
    
    public void setCraftingIngredient(int index, NumberedIngredient numberedIngredient) {
        this.craftingIngredients.set(index, numberedIngredient);
    }
    
    public NumberedIngredient getCraftingIngredient(int index) {
        return craftingIngredients.get(index);
    }
    
    public int getTier() {
        return tier;
    }
    
    @Override
    public ItemStack getCraftingResult(InventoryCrafting inv) {
        return craftingResult.copy();
    }

    public boolean betterMatches(AssemblyTableInventory inventory) {
        for (int i = 0; i < 10; ++i) {
    
            //account for empty stacks
            if(Ingredient.fromStacks(inventory.getStackInSlot(i)) == Ingredient.EMPTY){
                if(craftingIngredients.get(i).ingredient == Ingredient.EMPTY){
                    continue;
                } else{
                    return false;
                }
            }
            
            boolean foundOne = false;
            for(ItemStack invStack : Ingredient.fromStacks(inventory.getStackInSlot(i)).getMatchingStacks()){
                for(ItemStack recStack : craftingIngredients.get(i).ingredient.getMatchingStacks()){
                    if(invStack.getItem() == recStack.getItem()){ //compare if item correct
                        if (inventory.getStackInSlot(i).getCount() >= craftingIngredients.get(i).getCount()) { //compare count
                            foundOne = true;
                            break;
                        }
                    }
                }
                if(foundOne) break;
            }
            if(!foundOne) return false;
            
//            if (Ingredient.fromStacks(inventory.getStackInSlot(i)) == craftingIngredients.get(i).ingredient
//                && inventory.getStackInSlot(i).getCount() >= craftingIngredients.get(i).getCount()) {
//                //this slot is good.
//            } else {
//                return false;
//            }
        }
        return true;
    }
    
    /**
     * This gets the exact ItemStack associated with the output of the recipe. NOT a copy, so modifying this one will
     * modify the result of the crafting recipe.
     *
     * @return A reference to the result of the recipe (ItemStack)
     */
    @Override
    public ItemStack getRecipeOutput() {
        return craftingResult;
    }
    
    //absolutely useless for this.
    @Override
    public boolean canFit(int width, int height) {
        return true;
    }
    
    /**
     * we cannot use this, because this requires InventoryCrafting and absolutely cannot use it or convert to it.
     * we will instead use betterMatches (wow very creative!)
     */
    @Override
    public boolean matches(InventoryCrafting inv, World worldIn) {
        return false;
    }
}

//This is here because it is only used in this file. Can move later if needed.
/**
 * Tuples are not part of normal Java, so this is a stand-in for that. Yes, I know the problems with Java public class variables
 * but this is equivalent to the getIngredient() way, also, this provides no real security benefits.
 *
 * @author PseudoynmPatel
 * @since 2020-8-12
 */
class NumberedIngredient {
    public Ingredient ingredient = Ingredient.EMPTY;
    private int count = 1;
    
    public NumberedIngredient(Ingredient ingredient, int count) {
        this.count = count;
        this.ingredient = ingredient;
    }
    
    public NumberedIngredient() {
    
    }
    
    public void setCount(int count){
        this.count = count;
    }
    
    public int getCount(){
        return count;
    }
}