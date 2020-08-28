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
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.inventory.Slot;
import net.minecraft.world.World;
import net.minecraftforge.items.SlotItemHandler;

//TODO: BUG: Clicking too far above or below (where a normal minecraft GUI would not be) drops the items out of inventory.
// Change collision box/safe area or whatever
public class ContainerAssemblyTable extends Container {

    private final World world;
    private final TileAssemblyTable tileAssemblyTable;

    private InventoryBasic outputInventory = new InventoryBasic("output inv", false, 8);
    
    public ContainerAssemblyTable(InventoryPlayer playerInventory, World thisWorld, TileAssemblyTable tileAssemblyTable) {
        this.world = thisWorld;
        this.tileAssemblyTable = tileAssemblyTable;

        //This offset controls how up-and-down the slots are, I did this because I measured it all out on the image, but it doesn't fit to the Gui, so this.
        int offset = -45;

        //create the assembly table crafting slots
        this.addSlotToContainer(new SlotItemHandler(tileAssemblyTable.getCraftingInventory(), 0, 25, 27 + offset));
        this.addSlotToContainer(new SlotItemHandler(tileAssemblyTable.getCraftingInventory(), 1, 79, 27 + offset));
        this.addSlotToContainer(new SlotItemHandler(tileAssemblyTable.getCraftingInventory(), 2, 115, 27 + offset));
        this.addSlotToContainer(new SlotItemHandler(tileAssemblyTable.getCraftingInventory(), 3, 145, 27 + offset));
        this.addSlotToContainer(new SlotItemHandler(tileAssemblyTable.getCraftingInventory(), 4, 25, 61 + offset));
        this.addSlotToContainer(new SlotItemHandler(tileAssemblyTable.getCraftingInventory(), 5, 79, 61 + offset));
        this.addSlotToContainer(new SlotItemHandler(tileAssemblyTable.getCraftingInventory(), 6, 115, 61 + offset));
        this.addSlotToContainer(new SlotItemHandler(tileAssemblyTable.getCraftingInventory(), 7, 43, 93 + offset)); //play around
        this.addSlotToContainer(new SlotItemHandler(tileAssemblyTable.getCraftingInventory(), 8, 79, 93 + offset));
        this.addSlotToContainer(new SlotItemHandler(tileAssemblyTable.getCraftingInventory(), 9, 145, 93 + offset));

        //create the assembly table storage slots
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 4; ++j) {
                this.addSlotToContainer(new SlotItemHandler(tileAssemblyTable.getStorageInventory(), j + i * 4, 8 + j * 18, (128 + offset) + i * 18));
            }
        }

        //create the assembly table output slots as SlotCraftingResult (custom Slot implementation)
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 4; ++j) {
                this.addSlotToContainer(new SlotCraftingResult(playerInventory.player, tileAssemblyTable.getCraftingInventory(), tileAssemblyTable.getOutputInventory(), j + i * 4, 92 + j * 18, (128 + offset ) + i * 18));
            }
        }

        //create the player's inventory
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.addSlotToContainer(new Slot(playerInventory, j + i * 9 + 9, 8 + j * 18, (174 + offset) + i * 18));
            }
        }

        //create the player's hotbar
        for (int i = 0; i < 9; ++i) {
            this.addSlotToContainer(new Slot(playerInventory, i, 8 + i * 18, 232 + offset));
        }
    }
    
    @Override
    public void detectAndSendChanges(){
        super.detectAndSendChanges();
        
    }
    
    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return true;
    }
}
