package src.train.common.core.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import src.train.common.api.AbstractTrains;
import src.train.common.api.EntityRollingStock;
import src.train.common.api.Locomotive;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class PacketSetTrainLockedToClient implements IMessage {

    /** The key that was pressed. */
    Boolean bool;
    public PacketSetTrainLockedToClient(){}

    public PacketSetTrainLockedToClient(Boolean bool) {
        this.bool = bool;
    }

    @Override
    public void fromBytes(ByteBuf bbuf) {
            this.bool = bbuf.readBoolean();
    }

    @Override
    public void toBytes(ByteBuf bbuf) {
           bbuf.writeBoolean(this.bool);
    }

    public static class Handler implements IMessageHandler<PacketSetTrainLockedToClient, IMessage> {

        @Override
        public IMessage onMessage(PacketSetTrainLockedToClient message, MessageContext context) {

            Entity TrainEntity = context.getServerHandler().playerEntity.ridingEntity;

			/* "instanceof" is null-safe, but we check to avoid four unnecessary instanceof checks for when the value is null anyways. */
            if (TrainEntity instanceof EntityRollingStock) {

                    ((EntityRollingStock) TrainEntity).setTrainLockedFromPacket(message.bool);

            }

            return null;
        }
    }
}