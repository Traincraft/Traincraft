package train.common.mtc.packets.handlers;


import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import train.common.mtc.packets.PacketThingFromServer;

public class PacketThingFromServerHandler implements IMessageHandler<PacketThingFromServer, IMessage> {
    @Override
    public IMessage onMessage(PacketThingFromServer message, MessageContext ctx) {

        return null;
}
}
