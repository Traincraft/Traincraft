/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("TileTrainWorkbench.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * @author PseudonymPatel
 * @since 2020-7-30
 */

package traincraft.blocks.trainworkbench;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import traincraft.api.InventorySpecific;
import traincraft.tile.BaseTile;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class TileTrainWorkbench extends BaseTile {

    //store all the trainworkbench recipes here, for easy comparing and not having to go through each and every forge recipe every time.
    public static final ArrayList<TrainWorkbenchRecipe> TRAIN_WORKBENCH_RECIPES = new ArrayList<>();

    private final InventorySpecific inventory = new InventorySpecific("Train Workbench Inventory", false, 9, this::isItemValidForInventory);

    public TileTrainWorkbench() {
        this.inventory.addInventoryChangeListener(this::onInventoryChange);
    }

    @Override
    public IInventory getRealInventory() {
        return inventory;
    }

    @Override
    public GuiScreen openGui(EntityPlayer player) {
        return new GuiTrainWorkbench(this, player);
    }

    @Override
    public Container openContainer(EntityPlayer player) {
        return new ContainerTrainWorkbench(player.inventory, player.getEntityWorld());
    }
    public boolean hasGui() {
        return true;
    }

    protected boolean isItemValidForInventory(int slot, @Nonnull ItemStack stack) {
        return true;
    }

    public void onInventoryChange(IInventory inventory) {
    }
}
