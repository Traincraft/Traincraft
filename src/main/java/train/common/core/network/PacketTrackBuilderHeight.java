package train.common.core.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import train.common.entity.rollingStock.EntityTracksBuilder;
import train.common.entity.zeppelin.AbstractZeppelin;

public class PacketTrackBuilderHeight implements IMessage {

    /** The key that was pressed. */
    public int set;
    public PacketTrackBuilderHeight() {}

    public PacketTrackBuilderHeight(int set) {
        this.set = set;
    }

    @Override
    public void fromBytes(ByteBuf bbuf) {

        this.set = bbuf.readInt();
    }

    @Override
    public void toBytes(ByteBuf bbuf) {

        bbuf.writeInt(this.set);
    }

    public static class Handler implements IMessageHandler<PacketTrackBuilderHeight, IMessage> {

        @Override
        public IMessage onMessage(PacketTrackBuilderHeight message, MessageContext context) {
            Entity builderEntity = context.getServerHandler().playerEntity.ridingEntity;
			/* "instanceof" is null-safe, but we check to avoid four unnecessary instanceof checks for when the value is null anyways. */
            if (builderEntity != null) {

                if (builderEntity instanceof EntityTracksBuilder) {

                    ((EntityTracksBuilder) builderEntity).setPlannedHeightFromPacket(message.set);

                }
            }

            return null;
        }
    }
}