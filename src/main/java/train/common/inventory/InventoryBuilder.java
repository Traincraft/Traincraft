package train.common.inventory;

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import train.common.entity.rollingStock.EntityTracksBuilder;
import train.common.inventory.slot.SlotBuilderBallast;
import train.common.inventory.slot.SlotBuilderFuel;
import train.common.inventory.slot.SlotBuilderRail;
import train.common.inventory.slot.SlotBuilderTunnel;
import train.common.slots.SpecialSlots;

public class InventoryBuilder extends Container {

	public InventoryBuilder(InventoryPlayer iinventory, EntityTracksBuilder entityminecart) {
		inventorySize = 40;
		player = iinventory;
		loco = entityminecart;
		// width = GuiScreen.width;
		// height = GuiScreen.height;
		// xSize=255;
		// ySize=166;

		// int j = (width)/2;
		int d = 0;

		addSlotToContainer(new SlotBuilderFuel(entityminecart,    0, 8 - d, 53));  	//fuel
		addSlotToContainer(new SlotBuilderRail(entityminecart,    1, 8 - d, 73));	//tracks
		addSlotToContainer(new SlotBuilderTunnel(entityminecart,  2, 64 - d, 63));	//underblock2
		addSlotToContainer(new SlotBuilderBallast(entityminecart, 3, 64 - d, 45));	//underblock
		addSlotToContainer(new SlotBuilderTunnel(entityminecart,  4, 46 - d, 8));	// roof ?
		addSlotToContainer(new SlotBuilderTunnel(entityminecart,  5, 64 - d, 8));	// roof ?
		addSlotToContainer(new SlotBuilderTunnel(entityminecart,  6, 82 - d, 8));	// roof ?
		addSlotToContainer(new SlotBuilderTunnel(entityminecart,  7, 84 - d, 32));	//tunnel block

		addSlotToContainer(new SlotBuilderRail(entityminecart, 8, 8 - d, 98));		//track buffer
		addSlotToContainer(new SlotBuilderRail(entityminecart, 9, 8 - d, 116));		//track buffer
		addSlotToContainer(new SlotBuilderRail(entityminecart, 10, 8 - d, 134));	//track buffer

		addSlotToContainer(new SlotBuilderBallast(entityminecart, 11, 43 - d, 87));	//under block buffer
		addSlotToContainer(new SlotBuilderBallast(entityminecart, 12, 43 - d, 105));//under block buffer
		addSlotToContainer(new SlotBuilderBallast(entityminecart, 13, 43 - d, 123));//under block buffer

		addSlotToContainer(new SlotBuilderTunnel(entityminecart, 14, 64 - d, 88));	//under block2 buffer
		addSlotToContainer(new SlotBuilderTunnel(entityminecart, 15, 64 - d, 106));	//under block2 buffer
		addSlotToContainer(new SlotBuilderTunnel(entityminecart, 16, 64 - d, 124));	//under block2 buffer

		addSlotToContainer(new SlotBuilderTunnel(entityminecart, 17, 84 - d, 57));	//tunnel block buffer
		addSlotToContainer(new SlotBuilderTunnel(entityminecart, 18, 84 - d, 75));	//tunnel block buffer
		addSlotToContainer(new SlotBuilderTunnel(entityminecart, 19, 84 - d, 93));	//tunnel block buffer

		int i = 20;
		for (int j = 0; j < loco.numBuilderSlots; j++) {
			addSlotToContainer(SpecialSlots.getInstance().new SlotBuilder(entityminecart, i, 106 - d + j * 18, 7));
			i++;
		}

		for (int k = 0; k < loco.numBuilderSlots1; k++) {
			addSlotToContainer(SpecialSlots.getInstance().new SlotBuilder(entityminecart, i, 106 - d + k * 18, 25));
			i++;
		}

		for (int l = 0; l < loco.numBuilderSlots2; l++) {
			addSlotToContainer(SpecialSlots.getInstance().new SlotBuilder(entityminecart, i, 106 - d + l * 18, 43));
			i++;
		}
		for (int l = 0; l < loco.numBuilderSlots3; l++) {
			addSlotToContainer(SpecialSlots.getInstance().new SlotBuilder(entityminecart, i, 106 - d + l * 18, 61));
			i++;
		}

		for (int i1 = 0; i1 < 3; i1++) {
			for (int k1 = 0; k1 < 9; k1++) {
				addSlotToContainer(new Slot(iinventory, k1 + i1 * 9 + 9, 90 - d + k1 * 18, 112 + i1 * 18));
			}

		}

		for (int j1 = 0; j1 < 9; j1++) {
			addSlotToContainer(new Slot(iinventory, j1, 90 - d + j1 * 18, 170));
		}

	}

	@Override
	public boolean canInteractWith(EntityPlayer entityplayer) {
		return !loco.isDead;
	}

	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int i) {

		ItemStack itemstack = null;
		Slot slot = (Slot) inventorySlots.get(i);

		if (slot != null && slot.getHasStack()) {
			ItemStack itemstack1 = slot.getStack();
			itemstack = itemstack1.copy();
				// move to player inventory
			if (i <= inventorySize) {
				if (!mergeItemStack(itemstack1, inventorySize, inventorySlots.size(), true)) {
					return null;
				}
			}
				// move to builder inventory
			else if (!mergeItemStack(itemstack1, 0, 20, false)) {
				return null;
			}
			if (itemstack1.stackSize == 0) {
				slot.putStack(null);
			}
			else {
				slot.onSlotChanged();
			}
		}

		return itemstack;
	}

    /**
     * merges provided ItemStack with the first avaliable one in the container/player inventory
     */
	@Override
    protected boolean mergeItemStack(ItemStack stack, int first, int last, boolean isPlayer)
    {
        boolean flag1 = false;
        int k = first;

        if (isPlayer)
        {
            k = last - 1;
        }

        Slot slot;
        ItemStack itemstack1;

        // search already used stacks
        if (stack.isStackable())
        {
            while (stack.stackSize > 0 && (!isPlayer && k < last || isPlayer && k >= first))
            {
                slot = (Slot)this.inventorySlots.get(k);
                itemstack1 = slot.getStack();

                if (itemstack1 != null && itemstack1.getItem() == stack.getItem() && (!stack.getHasSubtypes() || stack.getItemDamage() == itemstack1.getItemDamage()) && ItemStack.areItemStackTagsEqual(stack, itemstack1))
                {
                    int l = itemstack1.stackSize + stack.stackSize;

                    if (l <= stack.getMaxStackSize())
                    {
                        stack.stackSize = 0;
                        itemstack1.stackSize = l;
                        slot.onSlotChanged();
                        flag1 = true;
                    }
                    else if (itemstack1.stackSize < stack.getMaxStackSize())
                    {
                        stack.stackSize -= stack.getMaxStackSize() - itemstack1.stackSize;
                        itemstack1.stackSize = stack.getMaxStackSize();
                        slot.onSlotChanged();
                        flag1 = true;
                    }
                }

                if (isPlayer)
                {
                    --k;
                }
                else
                {
                    ++k;
                }
            }
        }

        // search empty stacks
        if (stack.stackSize > 0)
        {
            if (isPlayer)
            {
                k = last - 1;
            }
            else
            {
                k = first;
            }

            while (!isPlayer && k < last || isPlayer && k >= first)
            {
                slot = (Slot)this.inventorySlots.get(k);
                itemstack1 = slot.getStack();

                if (itemstack1 == null && slot.isItemValid(stack))
                {
                    slot.putStack(stack.copy());
                    slot.onSlotChanged();
                    stack.stackSize = 0;
                    flag1 = true;
                    break;
                }

                if (isPlayer)
                {
                    --k;
                }
                else
                {
                    ++k;
                }
            }
        }

        return flag1;
    }

	private EntityTracksBuilder loco;
	private InventoryPlayer player;
	private int inventorySize;
}