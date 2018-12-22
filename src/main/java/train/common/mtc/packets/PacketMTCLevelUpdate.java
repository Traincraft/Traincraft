package train.common.mtc.packets;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import io.netty.buffer.ByteBuf;

public class PacketMTCLevelUpdate implements IMessage {
    public int entity;
    public int level;


    public PacketMTCLevelUpdate() {}
    public PacketMTCLevelUpdate(int entity, int level) {

        this.entity = entity;
        this.level = level;
    }
    @Override
    public void fromBytes(ByteBuf buf) {
     entity = buf.readInt();
     level = buf.readInt();
    }

    @Override
    public void toBytes(ByteBuf buf) {
    buf.writeInt(entity);
    buf.writeInt(level);
    }
}
