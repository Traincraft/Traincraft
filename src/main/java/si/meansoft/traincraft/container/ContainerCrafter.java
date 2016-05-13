package si.meansoft.traincraft.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.tileentity.TileEntity;
import si.meansoft.traincraft.tileEntities.TileEntityInventory;

/**
 * @author canitzp
 */
public class ContainerCrafter extends Container {

    public ContainerCrafter(EntityPlayer player, TileEntity tileEntity){
        TileEntityInventory crafter = (TileEntityInventory) tileEntity;
        for(int j = 0; j < 3; ++j) {
            for(int k = 0; k < 9; ++k) {
                this.addSlotToContainer(new Slot(player.inventory, k + j * 9 + 9, 8 + k * 18, 172 + j * 18));
            }
        }
        for(int j = 0; j < 9; ++j) {
            this.addSlotToContainer(new Slot(player.inventory, j, 8 + j * 18, 230));
        }

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 2 ; j++){
                addSlotToContainer(new Slot(crafter, i + j * 4, 8 + i * 18, 126 + j * 18));
            }
        }
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 2 ; j++){
                addSlotToContainer(new Slot(crafter, i + j * 4 + 8, 92 + i * 18, 126 + j * 18));
            }
        }
        addSlotToContainer(new Slot(crafter, 16, 25, 25));
        addSlotToContainer(new Slot(crafter, 17, 79, 25));
        addSlotToContainer(new Slot(crafter, 18, 115, 25));
        addSlotToContainer(new Slot(crafter, 19, 145, 25));
        addSlotToContainer(new Slot(crafter, 20, 25, 59));
        addSlotToContainer(new Slot(crafter, 21, 79, 59));
        addSlotToContainer(new Slot(crafter, 22, 115, 59));
        addSlotToContainer(new Slot(crafter, 23, 43, 91));
        addSlotToContainer(new Slot(crafter, 24, 79, 91));
        addSlotToContainer(new Slot(crafter, 25, 145, 91));
    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return true;
    }
}
