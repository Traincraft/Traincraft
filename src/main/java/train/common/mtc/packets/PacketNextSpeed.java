package train.common.mtc.packets;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import io.netty.buffer.ByteBuf;

public class PacketNextSpeed implements IMessage {

    public int nextSpeed;

    public int x;
    public int y;
    public int z;

    public Double nx;
    public Double ny;
    public Double nz;

    public int entity;
    public PacketNextSpeed() {}

    public PacketNextSpeed(int nextSpeed, int x, int y, int z, Double nx, Double ny, Double nz, int entity) {
        this.nextSpeed = nextSpeed;

        this.x = x;
        this.y = y;
        this.z = z;

        this.nx = nx;
        this.ny = ny;
        this.nz = nz;
        this.entity = entity;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        nextSpeed = buf.readInt();

        x = buf.readInt();
        y = buf.readInt();
        z = buf.readInt();

        nx = buf.readDouble();
        ny = buf.readDouble();
        nz = buf.readDouble();

        entity = buf.readInt();
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(this.nextSpeed);

        buf.writeInt(x);
        buf.writeInt(y);
        buf.writeInt(z);
        buf.writeDouble(nx);
        buf.writeDouble(ny);
        buf.writeDouble(nz);
        buf.writeInt(entity);
    }
}
