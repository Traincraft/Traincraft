package train.common.mtc.packets.handlers;


import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import train.common.api.Locomotive;
import train.common.mtc.packets.PacketMTC;

public class PacketMTChandler implements IMessageHandler<PacketMTC, IMessage> {
    @Override
    public IMessage onMessage(PacketMTC message, MessageContext ctx) {

            Entity theTrain = Minecraft.getMinecraft().theWorld.getEntityByID(message.entity);
            if (theTrain != null && theTrain instanceof Locomotive) {

                ((Locomotive) theTrain).mtcStatus = message.mtcStatus;
                if (message.mode != 0) { ((Locomotive) theTrain).mtcType = message.mode;}
                //if (message.mtcStatus == 0) {
//
                //        ((Locomotive) theTrain).speedLimit = "0";
                //        ((Locomotive) theTrain).speedChanged();
                //        ExampleMod.itsChannel.sendToAll(new PacketSetSpeed(0, 0, 0, 0,  ((Locomotive) theTrain).getEntityId()));


              //  }

            }



            return null;
        }

}

