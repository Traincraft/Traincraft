package src.train.common.core.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import src.train.common.api.EntityRollingStock;
import src.train.common.api.Locomotive;
import src.train.common.entity.digger.EntityRotativeDigger;
import src.train.common.entity.zeppelin.AbstractZeppelin;

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

            Entity ridingEntity = context.getServerHandler().playerEntity.ridingEntity;

			/* "instanceof" is null-safe, but we check to avoid four unnecessary instanceof checks for when the value is null anyways. */
            if (ridingEntity != null) {

                if (ridingEntity instanceof Locomotive) {

                    ((Locomotive) ridingEntity).setParkingBrakeFromPacket(message.ParkingBreak);
                }
            }

            return null;
        }
    }
}