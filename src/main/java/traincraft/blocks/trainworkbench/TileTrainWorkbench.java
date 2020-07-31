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

import com.sun.org.apache.xpath.internal.operations.Bool;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fluids.capability.CapabilityFluidHandler;
import org.apache.logging.log4j.Level;
import traincraft.Traincraft;
import traincraft.api.InventorySpecific;
import traincraft.tile.BaseTile;

import javax.annotation.Nonnull;

public class TileTrainWorkbench extends BaseTile {

    //only the crafting grid, not the output slot
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
        Traincraft.LOGGER.log(Level.INFO, "trainworkbench open gui");
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
        //Here we can handle things that happen when items change in grid
    }
}
