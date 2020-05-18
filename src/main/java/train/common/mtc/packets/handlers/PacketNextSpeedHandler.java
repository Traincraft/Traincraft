package train.common.mtc.packets.handlers;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import train.common.api.Locomotive;
import train.common.mtc.TileInfoTransmitterSpeed;
import train.common.mtc.packets.PacketNextSpeed;

public  class PacketNextSpeedHandler implements IMessageHandler<PacketNextSpeed, IMessage> {

    @Override
    public IMessage onMessage(PacketNextSpeed message, MessageContext context) {

        Entity theTrain = Minecraft.getMinecraft().theWorld.getEntityByID(message.entity);
        //if (message.x == 0 && message.y == 0 && message.z == 0) {
         //   ((Locomotive) theTrain).speedLimit = "0";
         //   ((Locomotive) theTrain).speedChanged();
//
       //     return null;
      //  }

        TileEntity its =  Minecraft.getMinecraft().theWorld.getTileEntity(message.x, message.y, message.z);


        /* "instanceof" is null-safe, but we check to avoid four unnecessary instanceof checks for when the value is null anyways. */
        if (its != null && its instanceof TileInfoTransmitterSpeed) {

            ((TileInfoTransmitterSpeed) its).nextUpdateSpeed(message.nextSpeed, message.nx, message.ny, message.nz);

            //  ExampleMod.itaChannel.sendTo(new PacketSetspeed(message.speed, message.entity, message.x, message.y, message.z));
        }


        if (theTrain != null && theTrain instanceof Locomotive) {
            Locomotive actualTrain = ((Locomotive) theTrain);
            actualTrain.nextSpeedLimit = message.nextSpeed;
            actualTrain.xSpeedLimitChange = message.nx;
            actualTrain.ySpeedLimitChange = message.ny;
            actualTrain.zSpeedLimitChange = message.nz;

        }

        return null;
    }
    public boolean saveStringNBT(Entity theEntity, String key, String value) {

        if (!theEntity.getEntityData().hasKey(key)){
            theEntity.getEntityData().setString(key, value);//sets the NBT value if it exists, or creates the entry if it doesn't.
            return true;
        }


        return false;
    }

    public boolean saveIntegerNBT(Entity theEntity, String key, int value) {

        if (!theEntity.getEntityData().hasKey(key)){
            theEntity.getEntityData().setInteger(key, value);//sets the NBT value if it exists, or creates the entry if it doesn't.
            return true;
        }


        return false;
    }

    public boolean readStringNBT(Entity theEntity, String key) {

        if (!theEntity.getEntityData().hasKey(key)){
            theEntity.getEntityData().getString(key);
            return true;
        }


        return false;
    }

    public boolean saveDoubleNBT(Entity theEntity, String key, Double value) {

        if (!theEntity.getEntityData().hasKey(key)){
            theEntity.getEntityData().setDouble(key, value);//sets the NBT value if it exists, or creates the entry if it doesn't.
            return true;
        }


        return false;
    }

    public boolean readDoubleNBT(Entity theEntity, String key) {

        if (!theEntity.getEntityData().hasKey(key)){
            theEntity.getEntityData().getDouble(key);
            return true;
        }


        return false;
    }

    public boolean readIntegerNBT(Entity theEntity, String key) {

        if (!theEntity.getEntityData().hasKey(key)){
            theEntity.getEntityData().getInteger(key);
            return true;
        }


        return false;
    }

}