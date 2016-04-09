package src.train.client.core.handlers;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.NetLoginHandler;
import net.minecraft.network.packet.NetHandler;
import net.minecraft.network.packet.Packet1Login;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.server.MinecraftServer;
import cpw.mods.fml.common.network.IConnectionHandler;
import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.PacketDispatcher;

public class KeyHandlerClient implements IConnectionHandler, IPacketHandler {

	/**
	 * client sending key commands. packets: int 7, pressing R int 4, Pressing W int 5, pressing S int 8, pressing H int 9, pressing F int 0, pressing Y int 1 pressing A int 2 pressing X int 3 pressing D int 6 pressing C
	 * 
	 * @param key
	 */
	public void sendKeyControlsPacket(int key) {

		ByteArrayOutputStream bytes = new ByteArrayOutputStream();
		DataOutputStream data = new DataOutputStream(bytes);
		try {
			data.writeInt(Integer.valueOf(key));
		} catch (IOException e) {
			e.printStackTrace();
		}

		Packet250CustomPayload packet = new Packet250CustomPayload();
		packet.channel = "TrainMod";
		packet.data = bytes.toByteArray();
		packet.length = packet.data.length;

		PacketDispatcher.sendPacketToServer(packet);
		//ModLoader.sendPacket(packet);

	}

	@Override
	public void onPacketData(INetworkManager manager, Packet250CustomPayload packet, EntityPlayer player) {

	}

	@Override
	public void playerLoggedIn(EntityPlayer player, NetHandler netHandler, INetworkManager manager) {

	}

	@Override
	public String connectionReceived(NetLoginHandler netHandler, INetworkManager manager) {
		return null;
	}

	@Override
	public void connectionOpened(NetHandler netClientHandler, String server, int port, INetworkManager manager) {

	}

	@Override
	public void connectionOpened(NetHandler netClientHandler, MinecraftServer server, INetworkManager manager) {

	}

	@Override
	public void connectionClosed(INetworkManager manager) {

	}

	@Override
	public void clientLoggedIn(NetHandler clientHandler, INetworkManager manager, Packet1Login login) {

	}
}