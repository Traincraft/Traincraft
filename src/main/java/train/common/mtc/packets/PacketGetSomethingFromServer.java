package train.common.mtc.packets;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import io.netty.buffer.ByteBuf;

public class PacketGetSomethingFromServer implements IMessage {
    public int entity;
    public int function;

    public PacketGetSomethingFromServer() {}

    public PacketGetSomethingFromServer(int entity, int function) {
        this.entity = entity;
        this.function = function;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        entity = buf.readInt();
        function = buf.readInt();
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(entity);
        buf.writeInt(function);
    }
}
