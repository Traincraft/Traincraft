package train.common.mtc.packets;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import io.netty.buffer.ByteBuf;

public class PacketATODoSlowDown implements IMessage {

   public int entity;
   public Double stopX;
   public Double stopY;
   public Double stopZ;


   public PacketATODoSlowDown() {}

   public PacketATODoSlowDown(int entity, Double stopX, Double stopY, Double stopZ) {
      this.entity = entity;
      this.stopX = stopX;
      this.stopY = stopY;
      this.stopZ = stopZ;
   }

   public void fromBytes(ByteBuf buf) {
      this.entity = buf.readInt();
      this.stopX = Double.valueOf(buf.readDouble());
      this.stopY = Double.valueOf(buf.readDouble());
      this.stopZ = Double.valueOf(buf.readDouble());
   }

   public void toBytes(ByteBuf buf) {
      buf.writeInt(this.entity);
      buf.writeDouble(this.stopX.doubleValue());
      buf.writeDouble(this.stopY.doubleValue());
      buf.writeDouble(this.stopZ.doubleValue());
   }
}
