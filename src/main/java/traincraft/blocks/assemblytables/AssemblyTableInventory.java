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
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.ITextComponent;
import org.apache.logging.log4j.Level;
import traincraft.Traincraft;

public class AssemblyTableInventory implements IInventory {

    NonNullList<ItemStack> inventory = NonNullList.withSize(10, ItemStack.EMPTY);

    /**
     * Creates a empty AssemblyTableInventory
     */
    public AssemblyTableInventory() {
    }

    /**
     * Creates a inventory already populated with items.
     *
     * @param inventory an NonNullList of length 10 filled with ItemStacks
     */
    public AssemblyTableInventory(NonNullList<ItemStack> inventory) {
        this.inventory = inventory;
    }

    @Override
    public int getSizeInventory() {
        return 10;
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
        return null;
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
        return itemStack;
    }

    @Override
    public void setInventorySlotContents(int index, ItemStack stack) {
        inventory.set(index, stack);
    }

    @Override
    public int getInventoryStackLimit() {
        return 0;
    }

    @Override
    public void markDirty() {

    }

    @Override
    public boolean isUsableByPlayer(EntityPlayer player) {
        return false;
    }

    @Override
    public void openInventory(EntityPlayer player) {

    }

    @Override
    public void closeInventory(EntityPlayer player) {

    }

    @Override
    public boolean isItemValidForSlot(int index, ItemStack stack) {
        //TODO: set this up using switch statement
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
        return null;
    }

    @Override
    public boolean hasCustomName() {
        return false;
    }

    @Override
    public ITextComponent getDisplayName() {
        return null;
    }
}
