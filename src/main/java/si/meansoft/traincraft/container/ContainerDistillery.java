package si.meansoft.traincraft.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import si.meansoft.traincraft.tileEntities.TileEntityDistillery;

import java.util.List;

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
    public ItemStack transferStackInSlot(EntityPlayer player, int slot) {
        final int inventoryStart = 27;
        final int inventoryEnd = inventoryStart + 26;
        final int hotbarStart = inventoryEnd + 1;
        final int hotbarEnd = hotbarStart + 8;
        Slot theSlot = inventorySlots.get(slot);
        if (theSlot != null && theSlot.getHasStack()) {
            ItemStack newStack = theSlot.getStack();
            ItemStack currentStack = newStack.copy();
            if (slot >= inventoryStart) {
                if (!mergeItemStack(newStack, 0, 4, false)) {
                    if (slot >= inventoryStart && slot <= inventoryEnd) {
                        if (!mergeItemStack(newStack, hotbarStart, hotbarEnd + 1, false)) {
                            return null;
                        }
                    } else if (slot >= inventoryEnd + 1 && slot < hotbarEnd + 1 && !mergeItemStack(newStack, inventoryStart, inventoryEnd + 1, false)) {
                        return null;
                    }
                }
            } else if (!mergeItemStack(newStack, inventoryStart, hotbarEnd, false)) {
                return null;
            }
            if (newStack.stackSize == 0) {
                theSlot.putStack(null);
            } else {
                theSlot.onSlotChanged();
            }
            if (newStack.stackSize == currentStack.stackSize) {
                return null;
            }
            theSlot.onPickupFromSlot(player, newStack);
            return currentStack;
        }
        return null;
    }
}
