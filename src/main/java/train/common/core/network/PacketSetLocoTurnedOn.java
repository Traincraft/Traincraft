package train.common.core.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import train.common.api.Locomotive;

public class PacketSetLocoTurnedOn implements IMessage {

    /** The key that was pressed. */
    Boolean LocoOn;
    public PacketSetLocoTurnedOn() {}

    public PacketSetLocoTurnedOn(Boolean LocoOn) {

        this.LocoOn = LocoOn;
    }

    @Override
    public void fromBytes(ByteBuf bbuf) {

        this.LocoOn = bbuf.readBoolean();
    }

    @Override
    public void toBytes(ByteBuf bbuf) {

        bbuf.writeBoolean(this.LocoOn);
    }

    public static class Handler implements IMessageHandler<PacketSetLocoTurnedOn, IMessage> {

        @Override
        public IMessage onMessage(PacketSetLocoTurnedOn message, MessageContext context) {

            Entity TrainEntity = context.getServerHandler().playerEntity.ridingEntity;

			/* "instanceof" is null-safe, but we check to avoid four unnecessary instanceof checks for when the value is null anyways. */
            if (TrainEntity != null) {

                if (TrainEntity instanceof Locomotive) {
                    ((Locomotive) TrainEntity).setLocoTurnedOnFromPacket(message.LocoOn);
                }
            }

            return null;
        }
    }
}