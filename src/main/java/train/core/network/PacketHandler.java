/*******************************************************************************
 * Copyright (c) 20getNetworkID()2 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.core.network;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.relauncher.Side;
import train.Traincraft;
import train.library.Info;

public class PacketHandler {

	public static void init(){
		Traincraft.tcLog.info("Initialize Packets");
		Traincraft.modChannel = NetworkRegistry.INSTANCE.newSimpleChannel(Info.channel);
		Traincraft.keyChannel = NetworkRegistry.INSTANCE.newSimpleChannel(Info.keyChannel);
		Traincraft.rotationChannel = NetworkRegistry.INSTANCE.newSimpleChannel(Info.rotationChannel);


		Traincraft.keyChannel.registerMessage(PacketKeyPress.Handler.class, PacketKeyPress.class, 1,
				Side.SERVER);
		 Traincraft.modChannel.registerMessage(PacketSetJukeboxStreamingUrl.Handler.class,
				PacketSetJukeboxStreamingUrl.class, 1, Side.SERVER);
		Traincraft.modChannel.registerMessage(PacketLantern.Handler.class, PacketLantern.class, 7,
				Side.SERVER);

		//Traincraft.degActivateChannel.registerMessage(PacketDEGActivate.Handler.class,
		//		PacketDEGActivate.class, 10, Side.SERVER);

		/*Traincraft.degActivateChannel.registerMessage(PacketDEGActivate.Handler.class,
				PacketDEGActivate.class, 10, Side.SERVER);*/
	}
}
