/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.core.handlers;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.relauncher.Side;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.Packet;
import train.common.Traincraft;
import train.common.core.network.*;
import train.common.entity.rollingStock.EntityTracksBuilder;
import train.common.Packet250CustomPayload;
import train.common.entity.zeppelin.AbstractZeppelin;
import train.common.library.Info;

public class PacketHandler {

	protected RollingStockStatsEventHandler statsEventHandler = new RollingStockStatsEventHandler();

	public static void init(){
		Traincraft.tcLog.info("Initialize Packets");
		Traincraft.modChannel = NetworkRegistry.INSTANCE.newSimpleChannel(Info.channel);
		Traincraft.keyChannel = NetworkRegistry.INSTANCE.newSimpleChannel(Info.keyChannel);
		Traincraft.rotationChannel = NetworkRegistry.INSTANCE.newSimpleChannel(Info.rotationChannel);

		Traincraft.keyChannel.registerMessage(PacketKeyPress.Handler.class, PacketKeyPress.class, 1, Side.SERVER);
		Traincraft.rotationChannel.registerMessage(PacketRollingStockRotation.Handler.class, PacketRollingStockRotation.class, 1, Side.CLIENT);
		//Traincraft.modChannel.registerMessage(PacketSetJukeboxStreamingUrl.Handler.class, PacketSetJukeboxStreamingUrl.class, 1, Side.SERVER);
		Traincraft.modChannel.registerMessage(PacketSlotsFilled.Handler.class, PacketSlotsFilled.class, 2, Side.CLIENT);
		Traincraft.modChannel.registerMessage(PacketParkingBreak.Handler.class, PacketParkingBreak.class, 3, Side.SERVER); //small leak, should be client side?
		Traincraft.modChannel.registerMessage(PacketSetTrainLockedToClient.Handler.class, PacketSetTrainLockedToClient.class, 4, Side.CLIENT);
		Traincraft.modChannel.registerMessage(PacketSetLocoTurnedOn.Handler.class, PacketSetLocoTurnedOn.class, 5, Side.SERVER); //small leak, should be client side?
		Traincraft.modChannel.registerMessage(PacketLantern.Handler.class, PacketLantern.class, 6, Side.SERVER);
		Traincraft.modChannel.registerMessage(PacketTrackBuilderHeight.Handler.class, PacketTrackBuilderHeight.class, 7, Side.SERVER);
	}

	public static IMessage setParkingBrake(Entity player, Entity entity, boolean set, boolean toServer) {
		PacketParkingBreak parking = new PacketParkingBreak(set);
		if (toServer) {
			if (player instanceof EntityClientPlayerMP) {
				Traincraft.modChannel.sendToServer(parking);
			}
		}
		return parking;
	}

	public static IMessage setLocoTurnedOn(Entity player, Entity entity, boolean set, boolean toServer) {
		PacketSetLocoTurnedOn packet = new PacketSetLocoTurnedOn(set);
		if (toServer) {
			if (player instanceof EntityClientPlayerMP) {
				Traincraft.modChannel.sendToServer(packet);
			}
		}
		return packet;
	}


	public static Packet setBookPage(Entity player, int page, int recipe) {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(bos);
		try {
			dos.writeInt(6);
			dos.writeInt(player.getEntityId());//.getID());
			dos.writeInt(page);
			dos.writeInt(recipe);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		Packet250CustomPayload packet = new Packet250CustomPayload(Info.channel, bos.toByteArray());
		packet.length = bos.size();
		if (player instanceof EntityClientPlayerMP) {
			EntityClientPlayerMP playerMP = (EntityClientPlayerMP) player;
			playerMP.sendQueue.addToSendQueue(packet);
		}
		return packet;
	}

}
