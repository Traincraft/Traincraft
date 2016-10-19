package train.common.core.network;

import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import train.common.entity.rollingStock.EntityJukeBoxCart;

/**
 * Sent to the server to set a Jukebox' music stream URL.<p>
 * 
 * Note:<br>
 * The sent packet is handled so that the server directly applies the data.<br>
 * This might be considered bad, as the client's data remains unchecked for validity and such.<br>
 * Please fix this eventually, if possible.
 */
public class PacketSetJukeboxStreamingUrl implements IMessage {

	/** The entity ID of the {@link EntityJukeBoxCart}. */
	int entityID;
	/** True if the EntityJukeBoxCart should start playing, false if it should stop playing. */
	boolean setPlaying;
	/** The URL of the music that shall be played. */
	String url;

	public PacketSetJukeboxStreamingUrl() {}

	public PacketSetJukeboxStreamingUrl(EntityJukeBoxCart jukeBoxCart, String url, boolean setPlaying) {

		this.entityID = jukeBoxCart.getEntityId();
		this.url = url;
		this.setPlaying = setPlaying;
	}

	@Override
	public void fromBytes(ByteBuf bbuf) {

		this.entityID = bbuf.readInt();
		this.setPlaying = bbuf.readBoolean();
		this.url = ByteBufUtils.readUTF8String(bbuf);
	}

	@Override
	public void toBytes(ByteBuf bbuf) {

		bbuf.writeInt(this.entityID);
		bbuf.writeBoolean(this.setPlaying);
		ByteBufUtils.writeUTF8String(bbuf, this.url);
	}

	public static class Handler implements IMessageHandler<PacketSetJukeboxStreamingUrl, IMessage> {

		@Override
		public IMessage onMessage(PacketSetJukeboxStreamingUrl message, MessageContext context) {

			Entity entity = context.getServerHandler().playerEntity.worldObj.getEntityByID(message.entityID);

			if (entity instanceof EntityJukeBoxCart) {

				((EntityJukeBoxCart) entity).recievePacket(message.url, message.setPlaying);
			}

			return null;
		}
	}
}