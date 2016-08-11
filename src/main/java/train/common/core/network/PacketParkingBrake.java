package train.common.core.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import train.common.api.EntityRollingStock;
import train.common.api.Locomotive;

public class PacketParkingBrake implements IMessage {

	boolean	ParkingBrake;
	int		entityID;
    public PacketParkingBrake() {}

	public PacketParkingBrake(boolean parking, int trainEntity) {
		this.ParkingBrake = parking;
		this.entityID = trainEntity;
    }

    @Override
    public void fromBytes(ByteBuf bbuf) {
		this.ParkingBrake = bbuf.readBoolean();
		this.entityID = bbuf.readInt();
    }

    @Override
    public void toBytes(ByteBuf bbuf) {
		bbuf.writeBoolean(this.ParkingBrake);
		bbuf.writeInt(this.entityID);
    }

    public static class Handler implements IMessageHandler<PacketParkingBrake, IMessage> {

        @Override
        public IMessage onMessage(PacketParkingBrake message, MessageContext context) {
			
			Entity TrainEntity = context.getServerHandler().playerEntity.worldObj.getEntityByID(message.entityID);
			
			if (TrainEntity instanceof Locomotive) {

				((Locomotive) TrainEntity).setParkingBrakeFromPacket(message.ParkingBrake);

			}

			if (TrainEntity instanceof EntityRollingStock) {

				((EntityRollingStock) TrainEntity).isBraking = message.ParkingBrake;

			}

            return null;
        }
    }
}