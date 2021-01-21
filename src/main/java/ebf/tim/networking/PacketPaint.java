package ebf.tim.networking;

import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.DimensionManager;

/**
 * <h1>Mount packet</h1>
 * This is intended to be a replacement for
 * @see net.minecraft.network.play.client.C02PacketUseEntity
 * because for whatever reason, the stupid thing refuses to send for our entities.
 * @author Eternal Blue Flame
 */
public class PacketPaint implements IMessage {
    /**the ID of the entity to dismount from*/
    private int entityId, dimensionID;
    private String key;

    public PacketPaint() {}
    public PacketPaint(String skin, int entityId) {
        this.key=skin;
        this.entityId = entityId;
        this.dimensionID= Minecraft.getMinecraft().thePlayer.worldObj.provider.dimensionId;
    }
    /**reads the packet on server to get the variables from the Byte Buffer*/
    @Override
    public void fromBytes(ByteBuf bbuf) {
        dimensionID=bbuf.readInt();
        entityId = bbuf.readInt();
        key = ByteBufUtils.readUTF8String(bbuf);

        try {
            DimensionManager.getWorld(dimensionID).getEntityByID(entityId).
                    getDataWatcher().updateObject(24, key);
        } catch (Exception e){
            System.out.println("Forge must have confused trains with chickens... You should tell Eternal, and send him this entire stacktrace, just to be sure.");
            e.printStackTrace();
        }
    }
    /**puts the variables into a Byte Buffer so they can be sent to server*/
    @Override
    public void toBytes(ByteBuf bbuf) {
        bbuf.writeInt(dimensionID);
        bbuf.writeInt(entityId);
        ByteBufUtils.writeUTF8String(bbuf, key);
    }
}
