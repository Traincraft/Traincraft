package train.common.mtc.packets;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import io.netty.buffer.ByteBuf;

public class PacketThingFromServer implements IMessage {
    //Function 1: get all MTC data from the server
    public int speedLimit;
    public int nextSpeedLimit;

    public Double xFromStopPoint;
    public Double yFromStopPoint;
    public Double zFromStopPoint;

    public Double xFromSpeedChange;
    public Double yFromSpeedChange;
    public Double zFromSpeedChange;

    public PacketThingFromServer() {}

    public PacketThingFromServer(int speedLimit, int nextSpeedLimit, Double xFromStopPoint, Double yFromStopPoint, Double zFromStopPoint,
                                 Double xFromSpeedChange, Double yFromSpeedChange, Double zFromSpeedChange  ) {
        this.speedLimit = speedLimit;
        this.nextSpeedLimit = nextSpeedLimit;
        this.xFromStopPoint = xFromStopPoint;
        this.yFromStopPoint = yFromStopPoint;
        this.zFromStopPoint = zFromStopPoint;

        this.xFromSpeedChange = xFromSpeedChange;
        this.yFromSpeedChange = yFromSpeedChange;
        this.zFromSpeedChange = zFromSpeedChange;

    }
    @Override
    public void fromBytes(ByteBuf buf) {
        speedLimit = buf.readInt();
        nextSpeedLimit = buf.readInt();

        xFromStopPoint = buf.readDouble();
        yFromStopPoint = buf.readDouble();
        zFromStopPoint = buf.readDouble();

        xFromSpeedChange = buf.readDouble();
        yFromSpeedChange = buf.readDouble();
        zFromSpeedChange = buf.readDouble();

    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(speedLimit);
        buf.writeInt(nextSpeedLimit);
        buf.writeDouble(xFromStopPoint);
        buf.writeDouble(yFromStopPoint);
        buf.writeDouble(zFromStopPoint);
        buf.writeDouble(xFromSpeedChange);
        buf.writeDouble(yFromSpeedChange);
        buf.writeDouble(zFromSpeedChange);
    }
}
