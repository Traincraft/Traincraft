package si.meansoft.traincraft.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import si.meansoft.traincraft.tileEntities.TileEntityHearthFurnace;

/**
 * @author canitzp
 */
public class ContainerHearthFurnace extends Container {

    public ContainerHearthFurnace(EntityPlayer player, TileEntity tile){
        for(int j = 0; j < 3; ++j) {
            for(int k = 0; k < 9; ++k) {
                this.addSlotToContainer(new Slot(player.inventory, k + j * 9 + 9, 8 + k * 18, 84 + j * 18));
            }
        }
        for(int j = 0; j < 9; ++j) {
            this.addSlotToContainer(new Slot(player.inventory, j, 8 + j * 18, 142));
        }

        TileEntityHearthFurnace furnace = (TileEntityHearthFurnace)tile;
        this.addSlotToContainer(new Slot(furnace, TileEntityHearthFurnace.FUEL_SLOT, 47, 53));
        this.addSlotToContainer(new Slot(furnace, TileEntityHearthFurnace.LEFT_INPUT_SLOT, 35, 17));
        this.addSlotToContainer(new Slot(furnace, TileEntityHearthFurnace.RIGHT_INPUT_SLOT, 56, 17));
        this.addSlotToContainer(new Slot(furnace, TileEntityHearthFurnace.OUTPUT_SLOT, 116, 35));
    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return true;
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int index){
        return null;
    }
}
