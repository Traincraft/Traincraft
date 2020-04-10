package train.common.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import train.common.Traincraft;
import train.common.api.Locomotive;
import train.common.core.network.PacketKeyPress;
import train.common.core.network.PacketParkingBrake;
import train.common.library.Info;

import java.util.List;

public class ItemRemoteController extends Item {
    public Locomotive attachedLoco;
    public ItemRemoteController()  {
        setCreativeTab(Traincraft.tcTab);

    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(Info.modID.toLowerCase() + ":remote_controller");
    }
    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
        par3List.add("\u00a77" + "Allows remote control of a train");
        par3List.add("\u00a77" + "Right click on a train to pair");
    }

    public void sendKeyPacket(int key) {
        Traincraft.keyChannel.sendToServer(new PacketKeyPress(key, attachedLoco.getEntityId()));
    }
    public void sendParkingBrake(boolean brakeStatus) {
        Traincraft.brakeChannel.sendToServer(new PacketParkingBrake(brakeStatus, attachedLoco.getEntityId()));
    }
}
