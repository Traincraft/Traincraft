/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("SlotCraftingResult.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */
package traincraft.blocks.assemblytables;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryCraftResult;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.NonNullList;
import org.apache.logging.log4j.Level;
import traincraft.Traincraft;

/**
 * This is similar to Mojang's SlotCrafting, except it is tailored specifically to be used with the assemblyTable.
 * NOTE: This will only work correctly if it's used with AssemblyTableRecipes.
 *
 * @author PseudonymPatel
 * @since 2020-8-3
 */
public class SlotCraftingResult extends Slot {
    
    private final AssemblyCraftingItemHandler craftMatrix;
    private final EntityPlayer player;
    private int amountCrafted;
    
    public SlotCraftingResult(EntityPlayer player, AssemblyCraftingItemHandler craftingInventory, IInventory inventoryIn, int slotIndex, int xPosition, int yPosition){
        super(inventoryIn, slotIndex, xPosition, yPosition);
        this.player = player;
        this.craftMatrix = craftingInventory;
    }
    
    @Override
    protected void onCrafting(ItemStack stack, int amount){
        this.amountCrafted += amount;
        this.onCrafting(stack);
    }
    
    @Override
    protected void onSwapCraft(int p_190900_1_){
        this.amountCrafted += p_190900_1_;
    }
    
    @Override
    protected void onCrafting(ItemStack stack){
        if(this.amountCrafted > 0){
            stack.onCrafting(this.player.world, this.player, this.amountCrafted);
        }
        
        this.amountCrafted = 0;
    }
    
    /**
     * This function is called when an item is taken from a SlotCraftingResult. Removes items from the crafting area before returning.
     * Will return EMPTY and log as level ERROR if any errors, but will not stop execution.
     *
     * @implSpec MUST have set the recipe correctly in the AssemblyCraftingItemHandler beforehand.
     * @param thePlayer player doing the crafting
     * @param stack the item they will be taking, is not modified in function
     * @return the stack parameter, unmodified. Returns EMPTY if any errors.
     */
    @Override
    public ItemStack onTake(EntityPlayer thePlayer, ItemStack stack){
        
        AssemblyTableRecipe recipe = craftMatrix.tileAssemblyTable.getRecipeInUse();
        if (recipe == null) {
            Traincraft.LOGGER.log(Level.ERROR, "Could not find recipe when taking item from crafting grid.");
            return ItemStack.EMPTY;
        }
        this.onCrafting(stack);
        
        //iterate through each slot, remove the correct amount
        for(int i = 0; i < 10; ++i){
            if (recipe.getCraftingIngredient(i).ingredient == Ingredient.EMPTY) {
                continue;
            }
            
            int amountToRemove = recipe.getCraftingIngredient(i).getCount();
            
            ItemStack itemStack = craftMatrix.getStackInSlot(i);
            if (itemStack.getCount() == amountToRemove) {
                //if there is just enough, simply overwrite with EMPTY.
                craftMatrix.setStackInSlot(i, ItemStack.EMPTY);
            } else {
                itemStack.setCount(itemStack.getCount() - amountToRemove);
            }
        }
        
        craftMatrix.tileAssemblyTable.setRecipeInUse(null);
        craftMatrix.tileAssemblyTable.onInventoryChanged();
        return stack;
    }
    
    @Override
    public boolean isItemValid(ItemStack stack){
        return false;
    }
    
    @Override
    public ItemStack decrStackSize(int amount){
        if(this.getHasStack()){
            this.amountCrafted += Math.min(amount, this.getStack().getCount());
        }
        
        return super.decrStackSize(amount);
    }
}
