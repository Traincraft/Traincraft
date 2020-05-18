package train.common.mtc.packets;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import io.netty.buffer.ByteBuf;

public class PacketATOSetStopPoint implements IMessage {

   public int entity;
   public Double xPos;
   public Double yPos;
   public Double zPos;
   public Double sXPos;
   public Double sYPos;
   public Double sZPos;

   public PacketATOSetStopPoint() {}

   public PacketATOSetStopPoint(int entity, Double xPos, Double yPos, Double zPos, Double sxPos, Double syPos, Double szPos) {
      this.entity = entity;
      this.xPos = xPos;
      this.yPos = yPos;
      this.zPos = zPos;
      this.sXPos = sxPos;
      this.sYPos = syPos;
      this.sZPos = szPos;

   }

   public void fromBytes(ByteBuf buf) {
      this.entity = buf.readInt();
      this.xPos = Double.valueOf(buf.readDouble());
      this.yPos = Double.valueOf(buf.readDouble());
      this.zPos = Double.valueOf(buf.readDouble());
      this.sXPos = buf.readDouble();
      this.sYPos = buf.readDouble();
      this.sZPos = buf.readDouble();
   }

   public void toBytes(ByteBuf buf) {
      buf.writeInt(this.entity);
      buf.writeDouble(this.xPos.doubleValue());
      buf.writeDouble(this.yPos.doubleValue());
      buf.writeDouble(this.zPos.doubleValue());
      buf.writeDouble(sXPos);
      buf.writeDouble(sYPos);
      buf.writeDouble(sZPos);
   }
}
