package train.common.mtc.packets.handlers;


import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import train.common.api.Locomotive;
import train.common.mtc.packets.PacketDoAccel;

public class PacketATODoAccelHandler implements IMessageHandler<PacketDoAccel, IMessage> {

   public IMessage onMessage(PacketDoAccel message, MessageContext ctx) {
      Entity trainEntity = ctx.getServerHandler().playerEntity.getEntityWorld().getEntityByID(message.entity);
      if(trainEntity != null) {
         this.accel(trainEntity);
      }

      return null;
   }

   public void accel(Entity entity) {
      if(entity.worldObj != null) {

         Locomotive theTrain = (Locomotive)entity;
         if((int)theTrain.getSpeed() - 2 <= theTrain.speedLimit) {
            if (theTrain.riddenByEntity == null) {return;}
            int dir = MathHelper
                    .floor_double(((theTrain).rotationYaw * 4F) / 360F + 0.5D) & 3;
            if (dir == 2){

               entity.motionZ -= 0.0075 * theTrain.accelerate;



            } else if (dir == 0){

               entity.motionZ += 0.0075 * theTrain.accelerate;

            } else if (dir == 1){

               entity.motionX -= 0.0075 * theTrain.accelerate;

            } else if (dir == 3){

               entity.motionX += 0.0075 * theTrain.accelerate;

            }

         }
      }
   }
}
