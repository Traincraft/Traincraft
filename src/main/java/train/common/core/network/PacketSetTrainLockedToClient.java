package train.common.core.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import train.common.api.AbstractTrains;

public class PacketSetTrainLockedToClient implements IMessage {

	boolean	bool;
	int		entityID;
    public PacketSetTrainLockedToClient(){}

	public PacketSetTrainLockedToClient(boolean bool, int trainEntity) {
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

			Entity TrainEntity = context.getServerHandler().playerEntity.worldObj.getEntityByID(message.entityID);

            if (TrainEntity instanceof AbstractTrains) {

				((AbstractTrains) TrainEntity).setTrainLockedFromPacket(message.bool);

            }

            return null;
        }
    }
}