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

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import traincraft.tile.BaseTile;

/**
 * This is the Assembly Table tileEntity for all tiers of assembly table. It gets the tier based on where the player is looking.
 *
 * @implNote If we can figure out how to register all the assembly table tile entitys as one, we don't need the three extra files as wrappers for this.
 *
 * @author PseudonymPatel
 * @since 2020-8-7
 */
public class TileAssemblyTable extends BaseTile {

    private final int tier;
    private GuiAssemblyTable guiAssemblyTable;

    //These will be the 10 slots that the train parts will sit in to craft the trains
    public AssemblyTableInventory craftingInventory = new AssemblyTableInventory();

    //These 8 slots are for the small chest-like inventory inside of the train workbench.
    InventoryBasic storageInventory = new InventoryBasic("ASM table storage", false, 8);

    //This may not be used, but if we need to store the output for some reason.
    InventoryBasic outputInventory = new InventoryBasic("ASM table output", false, 8);

    public TileAssemblyTable(int tier) {
        this.tier = tier;
    }

    @Override
    public GuiScreen openGui(EntityPlayer player) {
        guiAssemblyTable = new GuiAssemblyTable(tier, player, this);
        return guiAssemblyTable;
    }

    @Override
    public boolean hasGui() {
        //I forget this every time...
        return true;
    }

    @Override
    public Container openContainer(EntityPlayer player) {
        return new ContainerAssemblyTable(player.inventory, player.getEntityWorld(), this);
    }

    /**
     * This returns the 8 slots of STORAGE inventory stored in the workbench, not the crafting area.
     *
     * @return 8 inventory storage slots.
     */
    @Override
    public IInventory getRealInventory() {
        return storageInventory;
    }

    public IInventory getOutputInventory() {
        return outputInventory;
    }

    public IInventory getStorageInventory() {
        return storageInventory;
    }

    public IInventory getCraftingInventory() {
        return craftingInventory;
    }
    //TODO: will need to override writeNBT and readNBT
}
