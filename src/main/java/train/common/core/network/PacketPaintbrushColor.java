package train.common.core.network;

import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import train.common.api.EntityRollingStock;

public class PacketPaintbrushColor implements IMessage {

    String paintbrushColor;
    int	entityID;

    /**
     * <p>Do not remove empty constructor or Forge will throw a fit!</p>
     */
    public PacketPaintbrushColor() {}
    public PacketPaintbrushColor(String paintbrushColor, int trainEntity) {
        this.paintbrushColor = paintbrushColor;
        this.entityID = trainEntity;
    }
    @Override
    public void fromBytes(ByteBuf bbuf) {
        this.paintbrushColor = ByteBufUtils.readUTF8String(bbuf);
        this.entityID = bbuf.readInt();
    }
    @Override
    public void toBytes(ByteBuf bbuf) {
        ByteBufUtils.writeUTF8String(bbuf, this.paintbrushColor);
        bbuf.writeInt(this.entityID);
    }
    public static class Handler implements IMessageHandler<PacketPaintbrushColor, IMessage> {
        @Override
        public IMessage onMessage(PacketPaintbrushColor message, MessageContext context) {
            Entity rollingStockEntity = context.getServerHandler().playerEntity.worldObj.getEntityByID(message.entityID);
            if (rollingStockEntity instanceof EntityRollingStock) {
                ((EntityRollingStock) rollingStockEntity).setColor(message.paintbrushColor);
            }
            return null;
        }
    }
}