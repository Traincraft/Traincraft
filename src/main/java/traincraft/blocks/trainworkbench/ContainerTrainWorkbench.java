/**
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("ContainerTrainWorkbench.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.blocks.trainworkbench;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.*;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.server.SPacketSetSlot;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent;
import org.apache.logging.log4j.Level;
import traincraft.Traincraft;
import traincraft.api.SlotCraftingResult;

import java.util.ArrayList;

/**
 * @author PseudonymPatel
 * @since 2020-7-30
 */
// NOTE: basically using the exact same system as the vanilla workbench
public class ContainerTrainWorkbench extends Container {

    public static ArrayList<TrainWorkbenchRecipe> TRAINWORKBENCH_RECIPES = new ArrayList<>();

    public InventoryCrafting craftMatrix = new InventoryCrafting(this, 3, 3);
    public InventoryCraftResult craftResult = new InventoryCraftResult();
    private final World world;
    private final EntityPlayer player;

    public ContainerTrainWorkbench(InventoryPlayer playerInventory, World worldIn) {
        Traincraft.LOGGER.log(Level.INFO, "init container trainworkbench");
        this.world = worldIn;
        this.player = playerInventory.player;

        //output spot
        this.addSlotToContainer(new SlotCraftingResult(playerInventory.player, this.craftMatrix, this.craftResult, 0, 124, 35));

        //crafting grid
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                this.addSlotToContainer(new Slot(this.craftMatrix, j + i * 3, 30 + j * 18, 17 + i * 18));
            }
        }

        //inventory slots
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.addSlotToContainer(new Slot(playerInventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }

        //inventory hotbar
        for (int i = 0; i < 9; ++i) {
            this.addSlotToContainer(new Slot(playerInventory, i, 8 + i * 18, 142));
        }
    }

    //stuff from vanilla ctable
    //BUG: can only craft anything once (per game load)
    public void onCraftMatrixChanged(IInventory inventory) {
        if(this.world == null || !this.world.isRemote) {
            //clear current item in outputSlot first
            craftResult.setInventorySlotContents(0, ItemStack.EMPTY);

            if (!inventory.isEmpty()) {
                //filter through the trainrecipies and find the first match (there should only be one match, but just in case duplicate recipes or sth.
                TRAINWORKBENCH_RECIPES.stream().filter(recipe -> recipe.betterMatches(inventory)).findFirst().ifPresent(recipe -> {
                    craftResult.setInventorySlotContents(0, recipe.getRecipeOutput().copy());
                    craftResult.setRecipeUsed(recipe);
                });
            }
            //makes it so the item can be seen in the inventory, not just there and invisible.
            ((EntityPlayerMP) player).connection.sendPacket(new SPacketSetSlot(this.windowId, 0, craftResult.getStackInSlot(0)));
        }
    }

    public void onContainerClosed(EntityPlayer playerIn) {
        super.onContainerClosed(playerIn);

        if (!this.world.isRemote) {
            this.clearContainer(playerIn, this.world, this.craftMatrix);
        }
    }

    public boolean canInteractWith(EntityPlayer playerIn) {
        return true;
    }

    public ItemStack transferStackInSlot(EntityPlayer playerIn, int index) {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.inventorySlots.get(index);

        if (slot != null && slot.getHasStack()) {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (index == 0) {
                itemstack1.getItem().onCreated(itemstack1, this.world, playerIn);

                if (!this.mergeItemStack(itemstack1, 10, 46, true)) {
                    return ItemStack.EMPTY;
                }

                slot.onSlotChange(itemstack1, itemstack);
            } else if (index >= 10 && index < 37) {
                if (!this.mergeItemStack(itemstack1, 37, 46, false)) {
                    return ItemStack.EMPTY;
                }
            } else if (index >= 37 && index < 46) {
                if (!this.mergeItemStack(itemstack1, 10, 37, false)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.mergeItemStack(itemstack1, 10, 46, false)) {
                return ItemStack.EMPTY;
            }

            if (itemstack1.isEmpty()) {
                slot.putStack(ItemStack.EMPTY);
            } else {
                slot.onSlotChanged();
            }

            if (itemstack1.getCount() == itemstack.getCount()) {
                return ItemStack.EMPTY;
            }

            ItemStack itemstack2 = slot.onTake(playerIn, itemstack1);

            if (index == 0) {
                playerIn.dropItem(itemstack2, false);
            }
        }

        return itemstack;
    }

    public boolean canMergeSlot(ItemStack stack, Slot slotIn) {
        return slotIn.inventory != this.craftResult && super.canMergeSlot(stack, slotIn);
    }
}