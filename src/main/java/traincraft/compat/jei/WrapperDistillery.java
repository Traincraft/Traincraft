/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("WrapperDistillery.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.compat.jei;

import com.google.common.collect.Lists;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.ingredients.VanillaTypes;
import mezz.jei.api.recipe.IRecipeWrapper;
import traincraft.blocks.distillery.DistilleryRecipe;

/**
 * @author canitzp
 * @since 2020-07-31
 */
public class WrapperDistillery implements IRecipeWrapper {
    
    private final DistilleryRecipe recipe;
    
    public WrapperDistillery(DistilleryRecipe recipe){
        this.recipe = recipe;
    }
    
    public DistilleryRecipe getRecipe(){
        return recipe;
    }
    
    @Override
    public void getIngredients(IIngredients ingredients){
        ingredients.setInputs(VanillaTypes.ITEM, Lists.newArrayList(this.recipe.getInputIngredient().getMatchingStacks()));
        ingredients.setOutput(VanillaTypes.ITEM, this.recipe.getRecipeOutput());
    }
    
}
