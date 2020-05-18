package train.common.core.network;

import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import train.common.api.Locomotive;

public class PacketDestination implements IMessage {
    public int entityID;
    public String destination;

    public PacketDestination() {}

    public PacketDestination(Integer entityID, String destination) {
        this.entityID = entityID;
        this.destination = destination;
    }


    @Override
    public void fromBytes(ByteBuf buf) {
        this.entityID = buf.readInt();
        destination = ByteBufUtils.readUTF8String(buf);
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(entityID);
        ByteBufUtils.writeUTF8String(buf, destination);
    }

    public static class Handler implements IMessageHandler<PacketDestination, IMessage> {

        @Override
        public IMessage onMessage(PacketDestination message, MessageContext context) {

            Entity TrainEntity = context.getServerHandler().playerEntity.worldObj.getEntityByID(message.entityID);
            if (TrainEntity instanceof Locomotive) {
                ((Locomotive) TrainEntity).destination = message.destination;
            }
            return null;
        }
    }
}
