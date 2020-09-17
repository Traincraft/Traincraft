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
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.items.SlotItemHandler;

/**
 * This is similar to Mojang's SlotCrafting, except it is tailored specifically to be used with the assemblyTable.
 * NOTE: This will only work correctly if it's used with AssemblyTableRecipes.
 *
 * @author PseudonymPatel
 * @since 2020-8-3
 */
public class SlotCraftingResult extends SlotItemHandler {
    
    private final TileAssemblyTable tile;
    
    public SlotCraftingResult(TileAssemblyTable tile, int slotIndex, int xPosition, int yPosition){
        super(tile.getInventory(EnumFacing.NORTH), slotIndex, xPosition, yPosition);
        this.tile = tile;
    }
    
    @Override
    public ItemStack onTake(EntityPlayer player, ItemStack stack){
        this.tile.onItemCrafted();
        return stack;
    }
    
    @Override
    public boolean isItemValid(ItemStack stack){
        return false;
    }
    
}
