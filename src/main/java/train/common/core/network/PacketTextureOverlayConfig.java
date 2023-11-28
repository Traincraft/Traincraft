package train.common.core.network;

import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import train.common.Traincraft;
import train.common.api.EntityRollingStock;
import train.common.overlaytexture.OverlayTextureManager;

/**
 * @author 02skaplan
 * <p>Client to Server Sync Packet for Overlay Texture Configuration Changes</p>
 * <p>Packet sends overlay data through an NBTTagCompound.</p>
 */
public class PacketTextureOverlayConfig implements IMessage {

    OverlayTextureManager.Type configType;
    int entityID;
    int dimensionID;
    NBTTagCompound overlayConfigTag = new NBTTagCompound();

    boolean request;
    int playerEntityID;

    public PacketTextureOverlayConfig() {
    } // Do not remove default constructor! Needed or Forge will get very mad.

    /**
     * @param configType       Type of overlay to use
     * @param trainEntity      Entity ID of rolling stock; recommended to retrieve by invoking rollingStock.getEntityId().
     * @param dimensionID      Dimension ID of player world; recommended to retrieve by accessing Minecraft.getMinecraft().thePlayer.worldObj.provider.dimensionId.
     * @param overlayConfigTag NBT configuration tag; recommended to retrieve by invoking rollingStock.getOverlayTextureContainer().getOverlayConfigTag().
     * @author 02skaplan
     * <p>Server <-> client communication packet for overlay textures.</p>
     * <p><b>This constructor is used to send information back and forth!</b></p>
     */
    public PacketTextureOverlayConfig(OverlayTextureManager.Type configType, int trainEntity, int dimensionID, NBTTagCompound overlayConfigTag) {
        this.configType = configType;
        this.entityID = trainEntity;
        this.overlayConfigTag = overlayConfigTag;
        this.dimensionID = dimensionID;
        this.request = false;
    }

    /**
     * @param trainEntity    Entity ID of rolling stock; recommended to retrieve by invoking rollingStock.getEntityId().
     * @param dimensionID    Dimension ID of player world; recommended to retrieve by accessing Minecraft.getMinecraft().thePlayer.worldObj.provider.dimensionId.
     * @param playerEntityID Entity ID of player. Used to send the response back to only the requesting player; recommended to retrieve by accessing Minecraft.getMinecraft().thePlayer.getEntityId() on the client side.
     * @author 02skaplan
     * <p>Client -> server communication packet for overlay texture requests.</p>
     * <p><b>This constructor is used by the client to request a configuration from the server!</b></p>
     */
    public PacketTextureOverlayConfig(int trainEntity, int dimensionID, int playerEntityID) {
        this.entityID = trainEntity;
        this.dimensionID = dimensionID;
        this.request = true;
        this.playerEntityID = playerEntityID;
    }

    @Override
    public void fromBytes(ByteBuf bbuf) {
        request = bbuf.readBoolean();
        entityID = bbuf.readInt();
        dimensionID = bbuf.readInt();
        if (!request) {
            configType = OverlayTextureManager.Type.values()[bbuf.readInt()];
            overlayConfigTag = ByteBufUtils.readTag(bbuf);
        } else {
            playerEntityID = bbuf.readInt();
        }
    }

    @Override
    public void toBytes(ByteBuf bbuf) {
        bbuf.writeBoolean(request);
        bbuf.writeInt(entityID);
        bbuf.writeInt(dimensionID);
        if (!request) {
            bbuf.writeInt(configType.ordinal());
            ByteBufUtils.writeTag(bbuf, overlayConfigTag);
        } else {
            bbuf.writeInt(playerEntityID);
        }
    }

    public static class Handler implements IMessageHandler<PacketTextureOverlayConfig, IMessage> {
        @Override
        public IMessage onMessage(PacketTextureOverlayConfig message, MessageContext context) {
            Entity rollingStockEntity;
            // If on the server side, distribute the packet to clients before updating local changes.
            if (context.side == Side.SERVER) { // I think it is necessary to grab the world through the server handler if the context side is server. Don't quote me on that, but it doesn't work without it.
                rollingStockEntity = context.getServerHandler().playerEntity.worldObj.getEntityByID(message.entityID);
                if (!message.request) { // If the packet is a configuration message, not a request for a configuration...
                    message.overlayConfigTag.setInteger("type", message.configType.ordinal());
                    Traincraft.overlayTextureChannel.sendToAllAround(new PacketTextureOverlayConfig(message.configType, message.entityID, message.dimensionID, message.overlayConfigTag), new NetworkRegistry.TargetPoint(message.dimensionID, rollingStockEntity.posX, rollingStockEntity.posY, rollingStockEntity.posZ, 256D));
                } else { // If the packet is a request message...
                    if (rollingStockEntity != null && ((EntityRollingStock) rollingStockEntity).getOverlayTextureContainer() != null) { // If the rolling stock has an overlay texture container (accepts overlay textures)...
                        if (context.getServerHandler().playerEntity.worldObj.getEntityByID(message.playerEntityID) != null) //todo verify
                            Traincraft.overlayTextureChannel.sendTo(new PacketTextureOverlayConfig(((EntityRollingStock) rollingStockEntity).getOverlayTextureContainer().getType(), message.entityID, message.dimensionID, ((EntityRollingStock) rollingStockEntity).getOverlayTextureContainer().getOverlayConfigTag()), ((EntityPlayerMP) context.getServerHandler().playerEntity.worldObj.getEntityByID(message.playerEntityID)));
                    }
                    return null;
                }
            } else {
                rollingStockEntity = Minecraft.getMinecraft().theWorld.getEntityByID(message.entityID);
            }
            if (rollingStockEntity instanceof EntityRollingStock) {
                OverlayTextureManager overlayTextureManager = ((EntityRollingStock) rollingStockEntity).getOverlayTextureContainer();
                overlayTextureManager.importFromConfigTag(message.overlayConfigTag);
                overlayTextureManager.setTypeAndMarkForUpdate(message.configType);
            }
            return null;
        }
    }
}