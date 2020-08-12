/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("TraincraftJEIPlugin.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.compat;

import mezz.jei.api.*;
import mezz.jei.api.ingredients.IModIngredientRegistration;
import mezz.jei.api.recipe.IRecipeCategoryRegistration;
import net.minecraft.item.ItemStack;
import traincraft.blocks.TCBlocks;
import traincraft.blocks.distillery.DistilleryRecipe;
import traincraft.compat.jei.CategoryDistillery;
import traincraft.compat.jei.WrapperDistillery;

/**
 * @author canitzp
 * @since 2020-07-31
 */
@JEIPlugin
public class TraincraftJEIPlugin implements IModPlugin {
    
    public static final String DISTILLERY_RECIPE_CATEGORY = "traincraft.distillery";
    
    @Override
    public void registerItemSubtypes(ISubtypeRegistry subtypeRegistry){
    
    }
    
    @Override
    public void registerIngredients(IModIngredientRegistration registry){
    
    }
    
    @Override
    public void registerCategories(IRecipeCategoryRegistration registry){
        registry.addRecipeCategories(new CategoryDistillery(registry));
    }
    
    @Override
    public void register(IModRegistry registry){
        registry.handleRecipes(DistilleryRecipe.class, WrapperDistillery::new, DISTILLERY_RECIPE_CATEGORY);
        registry.addRecipes(DistilleryRecipe.DISTIL_RECIPES, DISTILLERY_RECIPE_CATEGORY);
        registry.addRecipeCatalyst(new ItemStack(TCBlocks.DISTILLERY), DISTILLERY_RECIPE_CATEGORY);
    }
    
    @Override
    public void onRuntimeAvailable(IJeiRuntime jeiRuntime){
    
    }
}
