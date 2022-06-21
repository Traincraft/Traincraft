package train.common.wellcar;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerStorage extends Container
{
    private TileFortyFootContainer te;

    private int slotID = 0;

    public ContainerStorage(TileFortyFootContainer te, EntityPlayer player)
    {
        this.te = te;

        //Storage
        /*for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 9; j++)
            {
                addSlotToContainer(new Slot(te, slotID++, 9 + j * 18, 17 + i * 19 + 1));
                System.out.println("Code has b een updated");
            }
        }
*/
        int j = 0;
        int k = 0;
        /*for (int y = 0; y < 5; ++y) {
            for (int x = 0; x < 9; ++x) {
                this.addSlotToContainer(new Slot(te, k + j * 9, 8 + k * 18, 18 + j * 18));
                this.addSlotToContainer(new Slot(te, x + y * 10, 7 + x * 18, 19 + y * 18));
            }
        }*/
        for (j = 0; j < 5; ++j)
        {
            for (k = 0; k < 9; ++k)
            {
                this.addSlotToContainer(new Slot(te, k + j * 9, 8 + k * 18, 18 + j * 18));
            }
        }
        //Inventory
        //TE
        //  this.slotIndex = p_i1824_2_;
        //        this.xDisplayPosition = p_i1824_3_;
        //        this.yDisplayPosition = p_i1824_4_;
        // Player Inventory, Slot 9-35, Slot IDs 9-35
        for (int y = 0; y < 3; ++y) {
            for (int x = 0; x < 9; ++x) {
                this.addSlotToContainer(new Slot(player.inventory, x + y * 9 + 9, 8 + x * 18, 122 + y * 18));
            }
        }
        // Hotbar
        for (int i = 0; i < 9; i++)
        {
            addSlotToContainer(new Slot(player.inventory, i, 8 + i * 18, 180 ));
        }
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int slotRaw)
    {
        ItemStack stack = null;
        Slot slot = (Slot)inventorySlots.get(slotRaw);

        if (slot != null && slot.getHasStack())
        {
            ItemStack stackInSlot = slot.getStack();
            stack = stackInSlot.copy();

            if (slotRaw < 3 * 9)
            {
                if (!mergeItemStack(stackInSlot, 3 * 9, inventorySlots.size(), true))
                {
                    return null;
                }
            }
            else if (!mergeItemStack(stackInSlot, 0, 3 * 9, false))
            {
                return null;
            }

            if (stackInSlot.stackSize == 0)
            {
                slot.putStack((ItemStack)null);
            }
            else
            {
                slot.onSlotChanged();
            }
        }
        return stack;
    }

    @Override
    public boolean canInteractWith(EntityPlayer player)
    {
        return te.isUseableByPlayer(player);
    }
}