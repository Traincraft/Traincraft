package train.common.mtc.packets.handlers;


import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import net.minecraft.entity.Entity;
import net.minecraft.util.Vec3;
import train.common.Traincraft;
import train.common.api.Locomotive;
import train.common.mtc.packets.PacketATO;
import train.common.mtc.packets.PacketATODoSlowDown;
import train.common.mtc.packets.PacketATOSetStopPoint;

public class PacketATODOSlowDownHandler implements IMessageHandler<PacketATODoSlowDown, IMessage> {


   public void slow(Entity entity, Vec3 signalPosition) {
      double currentDistance = Math.copySign(Vec3.createVectorHelper(entity.posX, entity.posY, entity.posZ).distanceTo(signalPosition), 1.0D);
      double originalDistance;
      if (entity.getEntityData().hasKey("signal.distance") && entity.getEntityData().getDouble("signal.distance") > currentDistance){
         originalDistance = entity.getEntityData().getDouble("signal.distance");
        /*see if the entity's NBT has a key for the distance, that way we dont have to worry for API support.
        also be sure it's greater than the current distance, because if it isn't, then it's leftover from having done this before.*/
      } else {
         entity.getEntityData().setDouble("signal.distance", currentDistance);
         originalDistance=currentDistance;
         //if the above check is false, we set the values
      }


      double slowPercentage = 0.5D;
      if(1.0D - currentDistance != 0.0D && originalDistance != 0.0D) {
         slowPercentage = currentDistance / ((Locomotive)entity).getSpeed();
      }

      entity.motionX *= slowPercentage;
      entity.motionZ *= slowPercentage;
      if(((Locomotive)entity).getSpeed() == 1) {
         ((Locomotive)entity).parkingBrake = true;
         ((Locomotive)entity).xFromStopPoint = 0.0;
         ((Locomotive)entity).yFromStopPoint = 0.0;
         ((Locomotive)entity).zFromStopPoint = 0.0;
         Traincraft.atoSetStopPoint.sendToAll(new PacketATOSetStopPoint(entity.getEntityId(),0.0, 0.0, 0.0, 0.0,0.0,0.0));
         ((Locomotive)entity).atoStatus = 0;
         System.out.println("ato ended!");
         Traincraft.atoChannel.sendToServer(new PacketATO(entity.getEntityId(), 0));

      }

   }


   @Override
   public IMessage onMessage(PacketATODoSlowDown message, MessageContext ctx) {


         Entity trainEntity = ctx.getServerHandler().playerEntity.getEntityWorld().getEntityByID(message.entity);
         if(trainEntity != null) {
            this.slow(trainEntity, Vec3.createVectorHelper(message.stopX, message.stopY, message.stopZ));
         }

         return null;

   }
}
