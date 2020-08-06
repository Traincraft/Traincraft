/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("CategoryDistillery.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.compat.jei;

import mezz.jei.api.gui.IDrawable;
import mezz.jei.api.gui.IGuiFluidStackGroup;
import mezz.jei.api.gui.IGuiItemStackGroup;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.ingredients.VanillaTypes;
import mezz.jei.api.recipe.IRecipeCategory;
import mezz.jei.api.recipe.IRecipeCategoryRegistration;
import traincraft.Traincraft;
import traincraft.blocks.distillery.GuiDistillery;
import traincraft.blocks.distillery.TileDistillery;
import traincraft.compat.TraincraftJEIPlugin;

import javax.annotation.Nullable;

/**
 * @author canitzp
 * @since 2020-07-31
 */
public class CategoryDistillery implements IRecipeCategory<WrapperDistillery> {
    
    private final IRecipeCategoryRegistration registry;
    
    public CategoryDistillery(IRecipeCategoryRegistration registry){
        this.registry = registry;
    }
    
    @Override
    public String getUid(){
        return TraincraftJEIPlugin.DISTILLERY_RECIPE_CATEGORY;
    }
    
    @Override
    public String getTitle(){
        return "Distillery";
    }
    
    @Override
    public String getModName(){
        return Traincraft.MOD_NAME;
    }
    
    @Override
    public IDrawable getBackground(){
        return null;
    }
    
    @Nullable
    @Override
    public IDrawable getIcon(){
        return this.registry.getJeiHelpers().getGuiHelper().createDrawable(GuiDistillery.GUI_LOC, 0, 0, 100, 100);
    }
    
    @Override
    public void setRecipe(IRecipeLayout recipeLayout, WrapperDistillery recipeWrapper, IIngredients ingredients){
        IGuiItemStackGroup itemStackGroup = recipeLayout.getItemStacks();
        itemStackGroup.init(TileDistillery.INPUT_SLOT, true, 0, 0);
        itemStackGroup.set(TileDistillery.INPUT_SLOT, ingredients.getInputs(VanillaTypes.ITEM).get(0));
        
        itemStackGroup.init(TileDistillery.OUTPUT_SLOT, false, 16, 16);
        itemStackGroup.set(TileDistillery.OUTPUT_SLOT, recipeWrapper.getRecipe().getOutputStack());
        
        IGuiFluidStackGroup fluidStackGroup = recipeLayout.getFluidStacks();
        fluidStackGroup.init(0, false, 32, 0, 16, 52, TileDistillery.FLUID_TANK_CAPACITY, true, null);
    }
    
}
