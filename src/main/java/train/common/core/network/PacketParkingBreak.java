package train.common.core.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import train.common.api.EntityRollingStock;
import train.common.api.Locomotive;

public class PacketParkingBreak implements IMessage {

    /** The key that was pressed. */
    boolean ParkingBreak;
    int id;
    public PacketParkingBreak() {}

    public PacketParkingBreak(boolean parking, int id) {

        this.ParkingBreak = parking;
        this.id=id;
    }

    @Override
    public void fromBytes(ByteBuf bbuf) {

        this.ParkingBreak = bbuf.readBoolean();
        this.id = bbuf.readInt();
    }

    @Override
    public void toBytes(ByteBuf bbuf) {

        bbuf.writeBoolean(this.ParkingBreak);
        bbuf.writeInt(this.id);
    }

    public static class Handler implements IMessageHandler<PacketParkingBreak, IMessage> {

        @Override
        public IMessage onMessage(PacketParkingBreak message, MessageContext context) {
            Entity TrainEntity = context.getServerHandler().playerEntity.worldObj.getEntityByID(message.id);
			/* "instanceof" is null-safe, but we check to avoid four unnecessary instanceof checks for when the value is null anyways. */
            if (TrainEntity != null) {

                if (TrainEntity instanceof Locomotive) {

                    ((Locomotive) TrainEntity).setParkingBrakeFromPacket(message.ParkingBreak);

                }

                if (TrainEntity instanceof EntityRollingStock) {

                    ((EntityRollingStock) TrainEntity).isBraking = message.ParkingBreak;

                }
            }

            return null;
        }
    }
}