package ebf.tim.networking;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.utility.ServerLogger;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.DimensionManager;

/**
 * <h1>Remove entity packet</h1>
 * used to remove an entity from the world. this is necessary because the entity interaction is through client only hitboxes.
 * @author Eternal Blue Flame
 */
public class PacketRemove implements IMessage {
    /**the entity ID to define what entity to use the function on*/
    private int entityId, dimensionId;
    private boolean shouldDropItem;

    public PacketRemove() {}
    public PacketRemove(int entityId, boolean shouldDropItem) {
        this.entityId = entityId;
        this.dimensionId= Minecraft.getMinecraft().thePlayer.worldObj.provider.dimensionId;
        this.shouldDropItem = shouldDropItem;
    }
    /**reads the packet on server to get the variables from the Byte Buffer*/
    @Override
    public void fromBytes(ByteBuf bbuf) {
        entityId = bbuf.readInt();
        this.dimensionId=bbuf.readInt();
        shouldDropItem = bbuf.readBoolean();

        Entity entity = DimensionManager.getWorld(dimensionId).getEntityByID(entityId);
        //if the entity was an instance of Generic Rail Transport, then spawn it's item and remove it from world.
        if (entity instanceof GenericRailTransport) {
            if (shouldDropItem) {
                entity.worldObj.spawnEntityInWorld(new EntityItem(entity.worldObj, entity.posX, entity.posY, entity.posZ, new ItemStack(((GenericRailTransport) entity).getItem(), 1)));
                //since it was a player be sure we remove the entity from the logging.
                ServerLogger.deleteWagon((GenericRailTransport) entity);
            }
            //be sure we drop the inventory items on death.
            ((GenericRailTransport) entity).dropAllItems();
            entity.setDead();

            DimensionManager.getWorld(dimensionId).removeEntity(entity);
        }
    }
    /**puts the variables into a Byte Buffer so they can be sent to server*/
    @Override
    public void toBytes(ByteBuf bbuf) {
        bbuf.writeInt(entityId);
        bbuf.writeInt(dimensionId);
        bbuf.writeBoolean(shouldDropItem);
    }
}
