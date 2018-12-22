package train.common.mtc.packets;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import io.netty.buffer.ByteBuf;

public class PacketMTC implements IMessage {
    public int entity;
    public int mtcStatus;
    public int mode;

    public PacketMTC() {}
    public PacketMTC(int entity, int mtcStatus, int mode) {

        this.entity = entity;
        this.mtcStatus = mtcStatus;
        this.mode = mode;
    }
    @Override
    public void fromBytes(ByteBuf buf) {
        entity = buf.readInt();
        mtcStatus = buf.readInt();
        mode = buf.readInt();
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(entity);
        buf.writeInt(mtcStatus);
        buf.writeInt(mode);
    }

}
