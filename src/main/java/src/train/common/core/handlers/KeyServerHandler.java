package src.train.common.core.handlers;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.INetHandler;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.NetLoginHandler;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.packet.NetHandler;
import net.minecraft.network.packet.Packet1Login;
import src.train.common.Packet250CustomPayload;
import net.minecraft.server.MinecraftServer;
import src.train.common.Traincraft;
import src.train.common.api.EntityRollingStock;
import src.train.common.api.Locomotive;
import src.train.common.entity.digger.EntityRotativeDigger;
import src.train.common.entity.zeppelin.AbstractZeppelin;
import cpw.mods.fml.common.network.IConnectionHandler;
import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.NetworkRegistry;

public class KeyServerHandler implements IConnectionHandler, IPacketHandler {

	@Override
	public void onPacketData(NetworkManager manager, Packet250CustomPayload packet, EntityPlayer player) {
		DataInputStream dataStream = new DataInputStream(new ByteArrayInputStream(packet.data));

		try {
			int packetID = dataStream.readInt();
			EntityPlayer entityplayer = (EntityPlayer) player;

			if (packetID >= 0 && packetID <= 11) {
				if (((EntityPlayer) player).ridingEntity != null && ((EntityPlayer) player).ridingEntity instanceof Locomotive) {
					((Locomotive) ((EntityPlayer) player).ridingEntity).keyHandlerFromPacket(packetID);
				}
				if (((EntityPlayer) player).ridingEntity != null && ((EntityPlayer) player).ridingEntity instanceof EntityRollingStock) {
					((EntityRollingStock) ((EntityPlayer) player).ridingEntity).keyHandlerFromPacket(packetID);
				}
				if (((EntityPlayer) player).ridingEntity != null && ((EntityPlayer) player).ridingEntity instanceof AbstractZeppelin) {
					((AbstractZeppelin) ((EntityPlayer) player).ridingEntity).pressKey(packetID);
				}
				if (((EntityPlayer) player).ridingEntity != null && ((EntityPlayer) player).ridingEntity instanceof EntityRotativeDigger) {
					((EntityRotativeDigger) ((EntityPlayer) player).ridingEntity).pressKey(packetID);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void playerLoggedIn(EntityPlayer player, INetHandler netHandler, NetworkManager manager) {
		NetworkRegistry.instance().registerChannel(this, "TrainMod");
	}

	@Override
	public String connectionReceived(NetLoginHandler netHandler, NetworkManager manager) {
		return null;
	}

	@Override
	public void connectionOpened(INetHandler netClientHandler, String server, int port, NetworkManager manager) {}

	@Override
	public void connectionOpened(INetHandler netClientHandler, MinecraftServer server, NetworkManager manager) {}

	@Override
	public void connectionClosed(NetworkManager manager) {
		Traincraft.proxy.killAllStreams();
	}

	@Override
	public void clientLoggedIn(INetHandler clientHandler, NetworkManager manager, Packet1Login login) {
		NetworkRegistry.instance().registerChannel(this, "TrainMod");
	}
}