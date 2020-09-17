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
    
    public AssemblyCraftingItemHandler(int size, TileAssemblyTable tileAssemblyTable) {
        super(size);
        this.tileAssemblyTable = tileAssemblyTable;
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
        tileAssemblyTable.onItemCrafted();
        return toReturn;
    }
    
    @Override
    public void setStackInSlot(int slot, @Nonnull ItemStack stack){
        super.setStackInSlot(slot, stack);
        tileAssemblyTable.onItemCrafted();
    }
    
    @Nonnull
    @Override
    public ItemStack extractItem(int slot, int amount, boolean simulate){
        ItemStack toReturn = super.extractItem(slot, amount, simulate);
        tileAssemblyTable.onItemCrafted();
        return toReturn;
    }
}
