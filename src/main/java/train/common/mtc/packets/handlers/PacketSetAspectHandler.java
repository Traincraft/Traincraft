package train.common.mtc.packets.handlers;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import net.minecraft.client.Minecraft;
import net.minecraft.tileentity.TileEntity;
import train.common.mtc.TileInfoTransmitterAspect;
import train.common.mtc.packets.PacketSetAspect;

public  class PacketSetAspectHandler implements IMessageHandler<PacketSetAspect, IMessage> {

    @Override
    public IMessage onMessage(PacketSetAspect message, MessageContext context) {



        TileEntity ita =  Minecraft.getMinecraft().theWorld.getTileEntity(message.x, message.y, message.z);

        /* "instanceof" is null-safe, but we check to avoid four unnecessary instanceof checks for when the value is null anyways. */
        if (ita != null && ita instanceof TileInfoTransmitterAspect) {

            String theAspect = "";

            if (message.aspect == 1) {theAspect = "green";}
            if (message.aspect == 2) {theAspect = "blink_yellow";}
            if (message.aspect == 3) {theAspect = "yellow";}
            if (message.aspect == 4) {theAspect = "red";}
            if (message.aspect == 5) {theAspect = "blink_red";}
            if (message.aspect == 6) {theAspect = "off";}




            ((TileInfoTransmitterAspect) ita).updateAspect(theAspect);



            //  ExampleMod.itaChannel.sendTo(new PacketSetAspect(message.aspect, message.entity, message.x, message.y, message.z));
        }


        return null;
    }
}