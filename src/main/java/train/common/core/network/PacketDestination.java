package train.common.core.network;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
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
