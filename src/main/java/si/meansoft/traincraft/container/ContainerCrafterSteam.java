package si.meansoft.traincraft.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.tileentity.TileEntity;

/**
 * @author canitzp
 */
public class ContainerCrafterSteam extends Container {

    public ContainerCrafterSteam(EntityPlayer player, TileEntity tileEntity){

    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return true;
    }
}
