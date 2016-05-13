package si.meansoft.traincraft.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.tileentity.TileEntity;
import si.meansoft.traincraft.tileEntities.TileEntityCrafterSteam;

/**
 * @author canitzp
 */
public class ContainerCrafterSteam extends Container {

    private final TileEntityCrafterSteam crafter;
    private final EntityPlayer player;

    public ContainerCrafterSteam(EntityPlayer player, TileEntity tileEntity){
        this.player = player;
        this.crafter = (TileEntityCrafterSteam) tileEntity;
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
                addSlotToContainer(new Slot(this.crafter, i + j * 4, 8 + i * 18, 126 + j * 18));
            }
        }
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 2 ; j++){
                addSlotToContainer(new Slot(this.crafter, i + j * 4 + 8, 92 + i * 18, 126 + j * 18));
            }
        }
    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return true;
    }
}
