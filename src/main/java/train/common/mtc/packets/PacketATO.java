package train.common.mtc.packets;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import io.netty.buffer.ByteBuf;

public class PacketATO implements IMessage {

   public int entity;
   public int status;


   public PacketATO() {}

   public PacketATO(int entity, int status) {
      this.entity = entity;
      this.status = status;
   }

   public void fromBytes(ByteBuf buf) {
      this.entity = buf.readInt();
      this.status = buf.readInt();
   }

   public void toBytes(ByteBuf buf) {
      buf.writeInt(this.entity);
      buf.writeInt(this.status);
   }
}
