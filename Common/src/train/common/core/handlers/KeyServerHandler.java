package src.train.common.core.handlers;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.NetLoginHandler;
import net.minecraft.network.packet.NetHandler;
import net.minecraft.network.packet.Packet1Login;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.server.MinecraftServer;
import src.train.common.Traincraft;
import src.train.common.api.EntityRollingStock;
import src.train.common.api.Locomotive;
import src.train.common.entity.digger.EntityRotativeDigger;
import src.train.common.entity.zeppelin.AbstractZeppelin;
import cpw.mods.fml.common.network.IConnectionHandler;
import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.Player;

public class KeyServerHandler implements IConnectionHandler, IPacketHandler {

	@Override
	public void onPacketData(INetworkManager manager, Packet250CustomPayload packet, Player player) {
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
	public void playerLoggedIn(Player player, NetHandler netHandler, INetworkManager manager) {
		NetworkRegistry.instance().registerChannel(this, "TrainMod");
	}

	@Override
	public String connectionReceived(NetLoginHandler netHandler, INetworkManager manager) {
		return null;
	}

	@Override
	public void connectionOpened(NetHandler netClientHandler, String server, int port, INetworkManager manager) {}

	@Override
	public void connectionOpened(NetHandler netClientHandler, MinecraftServer server, INetworkManager manager) {}

	@Override
	public void connectionClosed(INetworkManager manager) {
		Traincraft.proxy.killAllStreams();
	}

	@Override
	public void clientLoggedIn(NetHandler clientHandler, INetworkManager manager, Packet1Login login) {
		NetworkRegistry.instance().registerChannel(this, "TrainMod");
	}
}