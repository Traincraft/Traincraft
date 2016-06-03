package train.common.core.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import train.common.api.Locomotive;
import train.common.entity.zeppelin.AbstractZeppelin;

public class PacketZeppelinRotation implements IMessage {

    /** The key that was pressed. */
    int entityID;
    public float rotation;
    public float yaw;
    public PacketZeppelinRotation() {}

    public PacketZeppelinRotation(Entity entity, float rotation, float yaw) {

        this.entityID = entity.getEntityId();
        this.rotation = rotation;
        this.yaw = yaw;
    }

    @Override
    public void fromBytes(ByteBuf bbuf) {

        this.entityID = bbuf.readInt();
        this.rotation = bbuf.readFloat();
        this.yaw = bbuf.readFloat();
    }

    @Override
    public void toBytes(ByteBuf bbuf) {

        bbuf.writeInt(this.entityID);
        bbuf.writeFloat(this.rotation);
        bbuf.writeFloat(this.yaw);
    }

    public static class Handler implements IMessageHandler<PacketZeppelinRotation, IMessage> {

        @Override
        public IMessage onMessage(PacketZeppelinRotation message, MessageContext context) {
            Entity zeppEntity = Minecraft.getMinecraft().theWorld.getEntityByID(message.entityID);

			/* "instanceof" is null-safe, but we check to avoid four unnecessary instanceof checks for when the value is null anyways. */
            if (zeppEntity != null) {

                if (zeppEntity instanceof AbstractZeppelin) {

                    ((AbstractZeppelin) zeppEntity).setRotationYawHead(message.rotation);
                    //((AbstractZeppelin) zeppEntity).rotationYawClient = message.rotation;
                    ((AbstractZeppelin) zeppEntity).rotationYawClient = message.yaw;

                }
            }

            return null;
        }
    }
}