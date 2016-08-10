package train.common.core.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import train.common.api.AbstractTrains;

public class PacketSetTrainLockedToClient implements IMessage {

    /** The key that was pressed. */
    Boolean bool;
    int entityID;
    public PacketSetTrainLockedToClient(){}

    public PacketSetTrainLockedToClient(Boolean bool, int trainEntity) {
        this.bool = bool;
        this.entityID = trainEntity;
    }

    @Override
    public void fromBytes(ByteBuf bbuf) {
        this.bool = bbuf.readBoolean();
        this.entityID = bbuf.readInt();
    }

    @Override
    public void toBytes(ByteBuf bbuf) {
        bbuf.writeBoolean(this.bool);
        bbuf.writeInt(this.entityID);
    }

    public static class Handler implements IMessageHandler<PacketSetTrainLockedToClient, IMessage> {

        @Override
        public IMessage onMessage(PacketSetTrainLockedToClient message, MessageContext context) {

            Entity TrainEntity = Minecraft.getMinecraft().theWorld.getEntityByID(message.entityID);

			/* "instanceof" is null-safe, but we check to avoid four unnecessary instanceof checks for when the value is null anyways. */
            if (TrainEntity instanceof AbstractTrains) {

                    ((AbstractTrains) TrainEntity).setTrainLockedFromPacket(message.bool);

            }

            return null;
        }
    }
}