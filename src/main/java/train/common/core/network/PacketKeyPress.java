package train.common.core.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import train.common.api.EntityRollingStock;
import train.common.api.Locomotive;
import train.common.entity.digger.EntityRotativeDigger;
import train.common.entity.zeppelin.AbstractZeppelin;

/**
 * Sent to the server when a key is pressed on the client.<p>
 * 
 * Values and their meanings as adapted from old source code:<br>
 * 		7 = R<br>
 * 		4 = W<br>
 * 		5 = S<br>
 * 		8 = H<br>
 * 		9 = F<br>
 * 		0 = Y<br>
 * 		1 = A<br>
 * 		2 = X<br>
 * 		3 = D<br>
 * 		6 = C<br>
 */
public class PacketKeyPress implements IMessage {

	/** The key that was pressed. */
	int key;
	int entityID;

	public PacketKeyPress() {}

	public PacketKeyPress(int key) {

		this.key = key;
		this.entityID = 0;
	}
	public PacketKeyPress(int key, int entityID) {

		this.key = key;
		this.entityID = entityID;
	}

	@Override
	public void fromBytes(ByteBuf bbuf) {

		this.key = bbuf.readInt();
		this.entityID = bbuf.readInt();
	}

	@Override
	public void toBytes(ByteBuf bbuf) {

		bbuf.writeInt(this.key);
		bbuf.writeInt(this.entityID);
	}

	public static class Handler implements IMessageHandler<PacketKeyPress, IMessage> {

		@Override
		public IMessage onMessage(PacketKeyPress message, MessageContext context) {

			Entity ridingEntity = context.getServerHandler().playerEntity.ridingEntity;

			/* "instanceof" is null-safe, but we check to avoid four unnecessary instanceof checks for when the value is null anyways. */
			if (ridingEntity != null) {

				if (ridingEntity instanceof Locomotive) {
					System.out.println("hallo!!");
					((Locomotive) ridingEntity).keyHandlerFromPacket(message.key);
				}
				else if (ridingEntity instanceof EntityRollingStock) {

					((EntityRollingStock) ridingEntity).keyHandlerFromPacket(message.key);
				}
				else if (ridingEntity instanceof AbstractZeppelin) {

					((AbstractZeppelin) ridingEntity).pressKey(message.key);
				}
				else if (ridingEntity instanceof EntityRotativeDigger) {

					((EntityRotativeDigger) ridingEntity).pressKey(message.key);
				}
				return null;
			}
			if (message.entityID != 0) {
				System.out.println("Dew this..");
				Entity theRidingEntity = context.getServerHandler().playerEntity.worldObj.getEntityByID(message.entityID);
				if (theRidingEntity != null) {
					((Locomotive) theRidingEntity).keyHandlerFromPacket(message.key);
				}
			}
			/*if (message.key == 404){
				CommonProxy.debug = CommonProxy.debug;
				if (Minecraft.getMinecraft().theWorld != null) {
					System.out.println(Minecraft.getMinecraft().theWorld.isRemote);
				}
			}*/
			return null;
		}
	}
}