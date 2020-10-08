package ebf.tim.networking;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import ebf.tim.entities.GenericRailTransport;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraftforge.common.DimensionManager;

/**
 * <h1>Mount packet</h1>
 * This is intended to be a replacement for
 * @see net.minecraft.network.play.client.C02PacketUseEntity
 * because for whatever reason, the stupid thing refuses to send for our entities.
 * @author Eternal Blue Flame
 */
public class PacketInteract implements IMessage {
    /**the ID of the entity to dismount from*/
    private int entityId, dimensionId, key, playerId;

    public PacketInteract() {}
    public PacketInteract(int key, int entityId) {
        this.key=key;
        this.entityId = entityId;
        this.dimensionId= Minecraft.getMinecraft().thePlayer.worldObj.provider.dimensionId;
        this.playerId=Minecraft.getMinecraft().thePlayer.getEntityId();

    }
    /**reads the packet on server to get the variables from the Byte Buffer*/
    @Override
    public void fromBytes(ByteBuf bbuf) {
        key = bbuf.readInt();
        entityId = bbuf.readInt();
        dimensionId=bbuf.readInt();
        playerId=bbuf.readInt();
        Entity e = DimensionManager.getWorld(dimensionId).getEntityByID(entityId);
        if (e instanceof GenericRailTransport) {
            ((GenericRailTransport)e).interact(playerId, false, false, key);
        }
    }
    /**puts the variables into a Byte Buffer so they can be sent to server*/
    @Override
    public void toBytes(ByteBuf bbuf) {
        bbuf.writeInt(key);
        bbuf.writeInt(entityId);
        bbuf.writeInt(dimensionId);
        bbuf.writeInt(playerId);
    }
}
