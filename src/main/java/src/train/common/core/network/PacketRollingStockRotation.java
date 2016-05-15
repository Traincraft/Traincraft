package src.train.common.core.network;

import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import src.train.common.api.EntityRollingStock;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;

/**
 * Sent to nearby clients to update the rotation of rolling stock.<p>
 * 
 * Field names adapted from 1.6 Packet code.
 */
public class PacketRollingStockRotation implements IMessage {

	int entityID;
	int rotationYawServer;
	int realRotation;
	int anglePitch;
	int posY;
	boolean isInReverse;
	boolean shouldSetPosY;

	public PacketRollingStockRotation() {}

	public PacketRollingStockRotation(EntityRollingStock entity, int anglePitch, boolean shouldSetPosY) {

		this.entityID = entity.getEntityId();
		this.rotationYawServer = (int) entity.rotationYaw; // Don't even ASK ME why we do this. Probably an attempt to reduce Packet size, but at what cost of precision..?
		this.realRotation = (int) entity.serverRealRotation;
		this.anglePitch = anglePitch;
		this.posY = (int) (entity.posY * 1000000);
		this.isInReverse = entity.isServerInReverse;
		this.shouldSetPosY = shouldSetPosY;
	}

	@Override
	public void fromBytes(ByteBuf bbuf) {

		this.entityID = bbuf.readInt();
		this.rotationYawServer = bbuf.readInt();
		this.realRotation = bbuf.readInt();
		this.anglePitch = bbuf.readInt();
		this.posY = bbuf.readInt();
		this.isInReverse = bbuf.readBoolean();
		this.shouldSetPosY = bbuf.readBoolean();
	}

	@Override
	public void toBytes(ByteBuf bbuf) {

		bbuf.writeInt(this.entityID);
		bbuf.writeInt(this.rotationYawServer);
		bbuf.writeInt(this.realRotation);
		bbuf.writeInt(this.anglePitch);
		bbuf.writeInt(this.posY);
		bbuf.writeBoolean(this.isInReverse);
		bbuf.writeBoolean(this.shouldSetPosY);
	}

	public static class Handler implements IMessageHandler<PacketRollingStockRotation, IMessage> {

		@Override
		public IMessage onMessage(PacketRollingStockRotation message, MessageContext context) {

			Entity entity = Minecraft.getMinecraft().theWorld.getEntityByID(message.entityID);

			if (entity instanceof EntityRollingStock) {

				EntityRollingStock rollingStock = (EntityRollingStock) entity;
				rollingStock.rotationYawClient = message.rotationYawServer;
				rollingStock.rotationYawClientReal = message.realRotation;
				rollingStock.anglePitchClient = message.anglePitch;
				rollingStock.isClientInReverse = message.isInReverse;
				rollingStock.setYFromServer((double) message.posY / 1000000, message.shouldSetPosY);
			}

			return null;
		}
	}
}