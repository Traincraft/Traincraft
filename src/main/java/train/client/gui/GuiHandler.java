package train.client.gui;


import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler {
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity te = world.getTileEntity(x, y, z);
        if (ID == 1) {
            if (player.ridingEntity != null) {
                return new GuiMTCInfo(player.ridingEntity);

            } else {
                return null;
            }

        } else if (ID == 2) {

            if (player.ridingEntity != null) {

                return new GuiSpeedTransmitter(te);

            } else {
                return null;
            }

        }


        return null;
    }
}
