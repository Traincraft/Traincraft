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

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import org.apache.logging.log4j.Level;
import traincraft.Traincraft;

import javax.annotation.Nullable;

public class AssemblyTableInventory implements IInventory {

    private NonNullList<ItemStack> inventory = NonNullList.withSize(10, ItemStack.EMPTY);
    private final TileAssemblyTable tileAssemblyTable;
    private AssemblyTableRecipe recipeUsed = null;
    
    /**
     * Creates a empty AssemblyTableInventory
     */
    public AssemblyTableInventory(TileAssemblyTable tileAssemblyTable) {
        this.tileAssemblyTable = tileAssemblyTable;
    }

    /**
     * Creates a inventory already populated with items.
     *
     * @param tileAssemblyTable The TileEntity that this is in, used for recipe checking.
     * @param inventory an NonNullList of length 10 filled with ItemStacks
     */
    public AssemblyTableInventory(TileAssemblyTable tileAssemblyTable, NonNullList<ItemStack> inventory) {
        this.tileAssemblyTable = tileAssemblyTable;
        this.inventory = inventory;
    }

    @Override
    public int getSizeInventory() {
        return 10;
    }

    @Nullable
    public void setRecipeUsed(AssemblyTableRecipe recipe) {
        this.recipeUsed = recipe;
    }
    
    public AssemblyTableRecipe getRecipeUsed() {
        return recipeUsed;
    }
    
    @Override
    public boolean isEmpty() {
        //cannot use NonNullList.isEmpty() because it implements by comparing the size of the NNList with 0
        for (ItemStack itemStack : inventory) {
            if (!itemStack.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public ItemStack getStackInSlot(int index) {
        if (index < 10) {
            return inventory.get(index);
        } else {
            Traincraft.LOGGER.log(Level.ERROR, "Index out of bounds in getStackInSlot in AssemblyTableInventory.");
            return ItemStack.EMPTY;
        }
    }

    @Override
    public ItemStack decrStackSize(int index, int count) {
        ItemStack itemstack = ItemStackHelper.getAndSplit(this.inventory, index, count);
    
        if (!itemstack.isEmpty())
        {
            this.markDirty();
        }
        this.markDirty();
        tileAssemblyTable.onInventoryChanged();
        return itemstack;
    }

    /**
     * Removes the item from the index specified. Returns the ItemStack in the slot, then overwrites slot with empty ItemStack.
     *
     * @param index index of slot to remove. Assumed that input is in bounds.
     * @return the ItemStack that was in the slot
     */
    @Override
    public ItemStack removeStackFromSlot(int index) {
        ItemStack itemStack = inventory.get(index);
        inventory.set(index, ItemStack.EMPTY);
        this.markDirty();
        tileAssemblyTable.onInventoryChanged();
        return itemStack;
    }

    @Override
    public void setInventorySlotContents(int index, ItemStack stack) {
        inventory.set(index, stack);
    
        if (!stack.isEmpty() && stack.getCount() > this.getInventoryStackLimit()){
            stack.setCount(this.getInventoryStackLimit());
        }
    
        this.markDirty();
        tileAssemblyTable.onInventoryChanged();
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    @Override
    public void markDirty() {
        //this would be the place to do things that would happen when inventory changes
        //if going to use more in future, make sure that it is called in every place it should be
        tileAssemblyTable.onInventoryChanged();
    }

    @Override
    public boolean isUsableByPlayer(EntityPlayer player) {
        return true;
    }

    @Override
    public void openInventory(EntityPlayer player) {

    }

    @Override
    public void closeInventory(EntityPlayer player) {

    }

    @Override
    public boolean isItemValidForSlot(int index, ItemStack stack) {
        //TODO: set this up using switch statement?
        return true;
    }

    @Override
    public int getField(int id) {
        return 0;
    }

    @Override
    public void setField(int id, int value) {

    }

    @Override
    public int getFieldCount() {
        return 0;
    }

    @Override
    public void clear() {
        inventory.clear();
    }

    @Override
    public String getName() {
        return "Assembly table Inventory";
    }

    @Override
    public boolean hasCustomName() {
        return false;
    }

    @Override
    public ITextComponent getDisplayName() {
        return new TextComponentString("(MAKE NOTE IF SEE THIS IN GAME)");
    }
}
