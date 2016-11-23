/*
 * This file ("ContainerDistillery.java") is part of the Traincraft mod for Minecraft.
 * It is created by all persons that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/LICENSE.MD)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2016
 */

package si.meansoft.traincraft.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import si.meansoft.traincraft.tile.TileEntityDistillery;

/**
 * @author canitzp
 */
public class ContainerDistillery extends Container {

    public EntityPlayer player;
    public TileEntityDistillery distillery;

    public ContainerDistillery(EntityPlayer player, TileEntity distillery){
        this.player = player;
        this.distillery = (TileEntityDistillery) distillery;
        for(int j = 0; j < 3; ++j) {
            for(int k = 0; k < 9; ++k) {
                this.addSlotToContainer(new Slot(player.inventory, k + j * 9 + 9, 8 + k * 18, 84 + j * 18));
            }
        }
        for(int j = 0; j < 9; ++j) {
            this.addSlotToContainer(new Slot(player.inventory, j, 8 + j * 18, 142));
        }
        addSlotToContainer(new Slot(this.distillery, 0, 56, 17));
        addSlotToContainer(new Slot(this.distillery, 1, 56, 53){
            @Override
            public boolean isItemValid(ItemStack stack) {
                return TileEntityFurnace.isItemFuel(stack);
            }
        });
        addSlotToContainer(new Slot(this.distillery, 2, 123, 8));
        addSlotToContainer(new Slot(this.distillery, 3, 123, 33){@Override public boolean isItemValid(ItemStack stack) {return false;}});
        addSlotToContainer(new Slot(this.distillery, 4, 116, 60){@Override public boolean isItemValid(ItemStack stack) {return false;}});
    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return true;
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int index) {
        return null;
    }

}
