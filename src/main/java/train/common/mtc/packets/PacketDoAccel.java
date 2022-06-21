package train.common.mtc.packets;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import io.netty.buffer.ByteBuf;

public class PacketDoAccel implements IMessage {

   public int entity;
   public int maxSpeed;


   public PacketDoAccel() {}

   public PacketDoAccel(int entity, int maxSpeed) {
      this.entity = entity;
      this.maxSpeed = maxSpeed;
   }

   public void fromBytes(ByteBuf buf) {
      this.entity = buf.readInt();
      this.maxSpeed = buf.readInt();
   }

   public void toBytes(ByteBuf buf) {
      buf.writeInt(this.entity);
      buf.writeInt(this.maxSpeed);
   }
}
