/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("SlotCraftingResult.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */
package traincraft.api;

import com.google.common.collect.Lists;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryCraftResult;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.NonNullList;
import traincraft.blocks.trainworkbench.TrainWorkbenchRecipe;

/**
 * This is similar to mojang's SlotCrafting, except it is tailored specifically to be used with the assemblyTable.
 * NOTE: This will only work correctly if it's used with AssemblyTableRecipes.
 *
 * @author PseudonymPatel
 * @since 2020-8-3
 */
public class SlotCraftingResult extends Slot {
    private final IInventory craftMatrix;
    private final EntityPlayer player;
    private int amountCrafted;

    public SlotCraftingResult(EntityPlayer player, IInventory craftingInventory, IInventory inventoryIn, int slotIndex, int xPosition, int yPosition) {
        super(inventoryIn, slotIndex, xPosition, yPosition);
        this.player = player;
        this.craftMatrix = craftingInventory;
    }

    public boolean isItemValid(ItemStack stack) {
        return false;
    }

    public ItemStack decrStackSize(int amount) {
        if (this.getHasStack()) {
            this.amountCrafted += Math.min(amount, this.getStack().getCount());
        }

        return super.decrStackSize(amount);
    }

    protected void onCrafting(ItemStack stack, int amount) {
        this.amountCrafted += amount;
        this.onCrafting(stack);
    }

    protected void onSwapCraft(int p_190900_1_) {
        this.amountCrafted += p_190900_1_;
    }

    protected void onCrafting(ItemStack stack) {
        if (this.amountCrafted > 0) {
            stack.onCrafting(this.player.world, this.player, this.amountCrafted);
            net.minecraftforge.fml.common.FMLCommonHandler.instance().firePlayerCraftingEvent(this.player, stack, craftMatrix);
        }

        this.amountCrafted = 0;

        InventoryCraftResult inventorycraftresult = (InventoryCraftResult)this.inventory;
        IRecipe irecipe = inventorycraftresult.getRecipeUsed();

        //the following can be uncommented later (it all works) if we want to do things with the recipe that was just crafted.
        //I commented it out because it was adding a recipe to the recipe book for whatever was just crafted, but that should not be done (line 76)
        if (irecipe != null && !irecipe.isDynamic()) {
//            this.player.unlockRecipes(Lists.newArrayList(irecipe));
            inventorycraftresult.setRecipeUsed((IRecipe) null);
        }
    }

    public ItemStack onTake(EntityPlayer thePlayer, ItemStack stack) {
        InventoryCraftResult inventorycraftresult = (InventoryCraftResult)this.inventory;
        IRecipe irecipe = inventorycraftresult.getRecipeUsed();

        //if (irecipe instanceof TrainWorkbenchRecipe) {
            this.onCrafting(stack);
            net.minecraftforge.common.ForgeHooks.setCraftingPlayer(thePlayer);
            NonNullList<ItemStack> nonnulllist = CraftingManager.getRemainingItems((InventoryCrafting) this.craftMatrix, thePlayer.world);
            net.minecraftforge.common.ForgeHooks.setCraftingPlayer(null);

            for (int i = 0; i < nonnulllist.size(); ++i) {
                ItemStack itemstack = this.craftMatrix.getStackInSlot(i);
                ItemStack itemstack1 = nonnulllist.get(i);

                if (!itemstack.isEmpty()) {
                    this.craftMatrix.decrStackSize(i, 1);
                    itemstack = this.craftMatrix.getStackInSlot(i);
                }

                if (!itemstack1.isEmpty()) {
                    if (itemstack.isEmpty()) {
                        this.craftMatrix.setInventorySlotContents(i, itemstack1);
                    } else if (ItemStack.areItemsEqual(itemstack, itemstack1) && ItemStack.areItemStackTagsEqual(itemstack, itemstack1)) {
                        itemstack1.grow(itemstack.getCount());
                        this.craftMatrix.setInventorySlotContents(i, itemstack1);
                    } else if (!this.player.inventory.addItemStackToInventory(itemstack1)) {
                        this.player.dropItem(itemstack1, false);
                    }
                }
            }
        //} //else if (irecipe instanceof AssemblyTableRecipe) {
            //TODO: assembly table recipe
        //}

        return stack;
    }
}
