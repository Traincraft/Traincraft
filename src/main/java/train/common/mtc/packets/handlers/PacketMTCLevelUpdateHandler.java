package train.common.mtc.packets.handlers;


import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import net.minecraft.entity.Entity;
import train.common.api.Locomotive;
import train.common.mtc.packets.PacketMTCLevelUpdate;

public class PacketMTCLevelUpdateHandler implements IMessageHandler<PacketMTCLevelUpdate, IMessage> {
    @Override
    public IMessage onMessage(PacketMTCLevelUpdate message, MessageContext ctx) {

        Entity trainEntity = ctx.getServerHandler().playerEntity.worldObj.getEntityByID(message.entity);

        if (trainEntity != null ) {
            ((Locomotive) trainEntity).trainLevel = Integer.toString(message.level);
        }
        return null;
    }
}
