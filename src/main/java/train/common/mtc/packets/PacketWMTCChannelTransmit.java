package train.common.mtc.packets;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import io.netty.buffer.ByteBuf;

public class PacketWMTCChannelTransmit implements IMessage {
    public int entity;
    public int channel;
    public int replyChannel;

    public PacketWMTCChannelTransmit() {}
    public PacketWMTCChannelTransmit(int entity, int channel, int replyChannel) {

        this.entity = entity;
        this.channel = channel;
        this.replyChannel = replyChannel;
    }
    @Override
    public void fromBytes(ByteBuf buf) {
        entity = buf.readInt();
        channel = buf.readInt();
        replyChannel = buf.readInt();
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(entity);
        buf.writeInt(channel);
        buf.writeInt(replyChannel);

    }
}
