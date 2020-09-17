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
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class ContainerAssemblyTable extends Container {
    
    public ContainerAssemblyTable(InventoryPlayer playerInventory, TileAssemblyTable tile) {
        IItemHandler inventory = tile.getInventory(EnumFacing.NORTH);
    
        //create the assembly table crafting slots (0-9)
        this.addSlotToContainer(new SlotItemHandler(inventory, 0, 25, 27));
        this.addSlotToContainer(new SlotItemHandler(inventory, 1, 79, 27));
        this.addSlotToContainer(new SlotItemHandler(inventory, 2, 115, 27));
        this.addSlotToContainer(new SlotItemHandler(inventory, 3, 145, 27));
        this.addSlotToContainer(new SlotItemHandler(inventory, 4, 25, 61));
        this.addSlotToContainer(new SlotItemHandler(inventory, 5, 79, 61));
        this.addSlotToContainer(new SlotItemHandler(inventory, 6, 115, 61));
        this.addSlotToContainer(new SlotItemHandler(inventory, 7, 43, 93));
        this.addSlotToContainer(new SlotItemHandler(inventory, 8, 79, 93));
        this.addSlotToContainer(new SlotItemHandler(inventory, 9, 145, 93));

        //create the assembly table storage slots (10-17)
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 4; ++j) {
                this.addSlotToContainer(new SlotItemHandler(inventory, 10 + (j + i * 4), 8 + j * 18, (128) + i * 18));
            }
        }

        //create the assembly table output slots as SlotCraftingResult (custom Slot implementation) (18-25)
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 4; ++j) {
                this.addSlotToContainer(new SlotCraftingResult(tile, 18 + (j + i * 4), 92 + j * 18, (128) + i * 18));
            }
        }

        //create the player's inventory
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.addSlotToContainer(new Slot(playerInventory, j + i * 9 + 9, 8 + j * 18, (174) + i * 18));
            }
        }

        //create the player's hotbar
        for (int i = 0; i < 9; ++i) {
            this.addSlotToContainer(new Slot(playerInventory, i, 8 + i * 18, 232));
        }
    }
    
    /**
     * Shift clicking functionality. This is required to stop shift-clicking from freezing game.
     *
     * @param player the player shift-clicking
     * @param index the index of slot that is being shift-clicked
     * @return null if fails?
     */
    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int index){
        int OUTPUT = 26; //where the player inventory starts. Inventory, then hotbar.
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.inventorySlots.get(index);
    
        if (slot != null && slot.getHasStack()){
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            // If itemstack is in Output stack
            if (index >= 18 && index <= 25){ //18 - 25 is output slots
                // try to place in player inventory / action bar; add 36+1 because mergeItemStack uses < index?
                // so the last slot in the inventory won't get checked if you don't add 1?
                if(!this.mergeItemStack(itemstack1, OUTPUT, OUTPUT + 36, true)){
                    return ItemStack.EMPTY;
                }
            } else if (index >= OUTPUT){ // itemstack is in player inventory, try to place in appropriate slot
                // item in player's inventory, but not in action bar
                if (index >= OUTPUT+1 && index < OUTPUT+28){
                    // place in action bar
                    if (!this.mergeItemStack(itemstack1, OUTPUT+27, OUTPUT+36, false)){
                        return ItemStack.EMPTY;
                    }
                    
                } else if (index >= OUTPUT+28 && index < OUTPUT+37 && !this.mergeItemStack(itemstack1, OUTPUT+1, OUTPUT+28, false)){
                    return ItemStack.EMPTY;
                }
            }
            // In one of the other slots; try to place in player inventory / action bar
            else if (!this.mergeItemStack(itemstack1, OUTPUT, OUTPUT+36, false)){
                return ItemStack.EMPTY;
            }
    
            if (itemstack1.isEmpty()){
                slot.putStack(ItemStack.EMPTY);
            } else{
                slot.onSlotChanged();
            }
    
            if(itemstack1.getCount() == itemstack.getCount()){
                return ItemStack.EMPTY;
            }
    
            ItemStack itemstack2 = slot.onTake(player, itemstack1);
    
            if(index == 0){
                player.dropItem(itemstack2, false);
            }
        }
        return itemstack;
    }
    
    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return true;
    }
}
