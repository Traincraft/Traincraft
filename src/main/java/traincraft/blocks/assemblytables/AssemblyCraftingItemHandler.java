/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("null.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */
package traincraft.blocks.assemblytables;

import net.minecraft.item.ItemStack;
import net.minecraftforge.items.ItemStackHandler;

import javax.annotation.Nonnull;

public class AssemblyCraftingItemHandler extends ItemStackHandler {
    public final TileAssemblyTable tileAssemblyTable;
    private AssemblyTableRecipe recipeUsed = null;
    
    public AssemblyCraftingItemHandler(int size, TileAssemblyTable tileAssemblyTable) {
        super(10);
        this.tileAssemblyTable = tileAssemblyTable;
    }
    
    /**
     * Sets the recipe that needs to be used for item removal. Set to null when done with recipe.
     *
     * @param recipe The AssemblyTableRecipe to use.
     */
    public void setRecipeUsed(AssemblyTableRecipe recipe) {
        this.recipeUsed = recipe;
    }
    
    public AssemblyTableRecipe getRecipeUsed() {
        return recipeUsed;
    }
    
    public boolean isEmpty() {
        for (ItemStack itemStack : stacks) {
            if (!itemStack.isEmpty()) {
                return false;
            }
        }
        return true;
    }
    
    //The next few functions just tell the tileEntity that things are changed when they are changed
    
    @Nonnull
    @Override
    public ItemStack insertItem(int slot, @Nonnull ItemStack stack, boolean simulate){
        ItemStack toReturn = super.insertItem(slot, stack, simulate);
        tileAssemblyTable.onInventoryChanged();
        return toReturn;
    }
    
    @Override
    public void setStackInSlot(int slot, @Nonnull ItemStack stack){
        super.setStackInSlot(slot, stack);
        tileAssemblyTable.onInventoryChanged();
    }
    
    @Nonnull
    @Override
    public ItemStack extractItem(int slot, int amount, boolean simulate){
        ItemStack toReturn = super.extractItem(slot, amount, simulate);
        tileAssemblyTable.onInventoryChanged();
        return toReturn;
    }
}
