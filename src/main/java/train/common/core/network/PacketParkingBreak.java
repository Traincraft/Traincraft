package train.common.core.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import train.common.api.Locomotive;

public class PacketParkingBreak implements IMessage {

    /** The key that was pressed. */
    Boolean ParkingBreak;
    public PacketParkingBreak() {}

    public PacketParkingBreak(Boolean parking) {

        this.ParkingBreak = parking;
    }

    @Override
    public void fromBytes(ByteBuf bbuf) {

        this.ParkingBreak = bbuf.readBoolean();
    }

    @Override
    public void toBytes(ByteBuf bbuf) {

        bbuf.writeBoolean(this.ParkingBreak);
    }

    public static class Handler implements IMessageHandler<PacketParkingBreak, IMessage> {

        @Override
        public IMessage onMessage(PacketParkingBreak message, MessageContext context) {

            Entity TrainEntity = context.getServerHandler().playerEntity.ridingEntity;

			/* "instanceof" is null-safe, but we check to avoid four unnecessary instanceof checks for when the value is null anyways. */
            if (TrainEntity != null) {

                if (TrainEntity instanceof Locomotive) {

                    ((Locomotive) TrainEntity).setParkingBrakeFromPacket(message.ParkingBreak);

                }
            }

            return null;
        }
    }
}