package train.common.core.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import train.common.api.EntityRollingStock;

/**
 * Sent to nearby clients to update the rotation of rolling stock.<p>
 * 
 * Field names adapted from 1.6 Packet code.
 */
public class PacketRollingStockRotation implements IMessage {

	int entityID;
	float rotationYawServer;
	float realRotation;
	int anglePitch;
	float posY;
	boolean isInReverse;

	public PacketRollingStockRotation() {}

	public PacketRollingStockRotation(EntityRollingStock entity, int anglePitch) {

		this.entityID = entity.getEntityId();
		this.rotationYawServer = entity.rotationYaw; // Don't even ASK ME why we do this. Probably an attempt to reduce Packet size, but at what cost of precision..?
		this.realRotation = entity.serverRealRotation;
		this.anglePitch = anglePitch;
		this.posY = (float) entity.posY;
		this.isInReverse = entity.isServerInReverse;
	}

	@Override
	public void fromBytes(ByteBuf bbuf) {

		this.entityID = bbuf.readInt();
		this.rotationYawServer = bbuf.readFloat();
		this.realRotation = bbuf.readFloat();
		this.anglePitch = bbuf.readInt();
		this.posY = bbuf.readFloat();
		this.isInReverse = bbuf.readBoolean();
	}

	@Override
	public void toBytes(ByteBuf bbuf) {

		bbuf.writeInt(this.entityID);
		bbuf.writeFloat(this.rotationYawServer);
		bbuf.writeFloat(this.realRotation);
		bbuf.writeInt(this.anglePitch);
		bbuf.writeFloat(this.posY);
		bbuf.writeBoolean(this.isInReverse);
	}

	public static class Handler implements IMessageHandler<PacketRollingStockRotation, IMessage> {

		@Override
		public IMessage onMessage(PacketRollingStockRotation message, MessageContext context) {

			if(Minecraft.getMinecraft().theWorld != null){
				Entity entity = Minecraft.getMinecraft().theWorld.getEntityByID(message.entityID);
				if (entity instanceof EntityRollingStock) {

					EntityRollingStock rollingStock = (EntityRollingStock) entity;
					rollingStock.rotationYawClient = message.rotationYawServer;
					rollingStock.rotationYawClientReal = message.realRotation;
					rollingStock.anglePitchClient = message.anglePitch;
					rollingStock.isClientInReverse = message.isInReverse;
					rollingStock.setYFromServer(message.posY);
				}

			}

			return null;
		}
	}
}