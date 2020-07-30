/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("SlotSpecific.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.api;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;
import java.util.function.Function;

public class SlotSpecific extends Slot {
    
    private final Function<ItemStack, Boolean> allowedItemStack;
    
    public SlotSpecific(IInventory inventoryIn, int index, int x, int y, Function<ItemStack, Boolean> allowedItemStack){
        super(inventoryIn, index, x, y);
        this.allowedItemStack = allowedItemStack;
    }
    
    @Override
    public boolean isItemValid(@Nonnull ItemStack stack){
        return this.allowedItemStack.apply(stack);
    }
}
