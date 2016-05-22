/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package src.train.common.core.handlers;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageCodec;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.List;

import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import src.train.common.Packet250CustomPayload;
import src.train.common.Traincraft;
import src.train.common.api.AbstractTrains;
import src.train.common.api.Locomotive;
import src.train.common.core.network.PacketParkingBreak;
import src.train.common.core.network.PacketSetLocoTurnedOn;
import src.train.common.core.network.PacketSetTrainLockedToClient;
import src.train.common.entity.rollingStock.EntityTracksBuilder;
import src.train.common.entity.zeppelin.AbstractZeppelin;
import src.train.common.items.ItemRecipeBook;
import src.train.common.library.Info;
import src.train.common.tile.TileBook;
import src.train.common.tile.TileCrafterTierI;
import src.train.common.tile.TileCrafterTierII;
import src.train.common.tile.TileCrafterTierIII;
import src.train.common.tile.TileEntityDistil;
import src.train.common.tile.TileEntityOpenHearthFurnace;
import src.train.common.tile.TileGeneratorDiesel;
import src.train.common.tile.TileLantern;
import src.train.common.tile.TileSignal;
import src.train.common.tile.TileStopper;
import src.train.common.tile.TileTCRail;
import src.train.common.tile.TileTCRailGag;
import src.train.common.tile.TileTrainWbench;
import src.train.common.tile.TileWaterWheel;
import src.train.common.tile.TileWindMill;

import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteStreams;

import cpw.mods.fml.common.network.internal.FMLProxyPacket;

//TODO Packets
public class PacketHandler extends MessageToMessageCodec<FMLProxyPacket, Packet250CustomPayload> {

	protected RollingStockStatsEventHandler statsEventHandler = new RollingStockStatsEventHandler();

	//@Override
	public void onPacketData(NetworkManager manager, Packet250CustomPayload packet, EntityPlayer player) {

		World world = ((EntityPlayer) player).worldObj;
		ByteArrayDataInput data = ByteStreams.newDataInput(packet.data);
		int packetIndex = data.readInt();

		if (packetIndex == 2) {
			int ID = data.readInt();
			boolean brake = data.readBoolean();
			Entity entity = this.getEntityByID(ID, player);
			if (entity instanceof Locomotive) {
				((Locomotive) entity).setParkingBrakeFromPacket(brake);
				//System.out.println(brake);
			}
			if (player != null && player instanceof EntityPlayer && ((EntityPlayer) player).ridingEntity != null && ((EntityPlayer) player).ridingEntity instanceof Locomotive) {
				Locomotive lo = (Locomotive) ((EntityPlayer) player).ridingEntity;
				if (lo.getEntityId() == ID) {
					lo.setParkingBrakeFromPacket(brake);//parkingBrake=brake;//setParkingBrake(brake);
				}
			}
		}
		else if (packetIndex == 3 || packetIndex == 4) {
			int ID = data.readInt();
			int set = data.readInt();
			AxisAlignedBB box = ((EntityPlayer) player).boundingBox.expand(5, 5, 5);
			List lis3 = ((EntityPlayer) player).worldObj.getEntitiesWithinAABBExcludingEntity((Entity) player, box);
			if (lis3 != null && lis3.size() > 0) {
				for (int j1 = 0; j1 < lis3.size(); j1++) {
					Entity entity = (Entity) lis3.get(j1);
					if (entity instanceof EntityTracksBuilder && ((EntityTracksBuilder) entity).getEntityId() == ID) {
						if (packetIndex == 3) {
							((EntityTracksBuilder) entity).setPlannedHeightFromPacket(set);
						}
						if (packetIndex == 4) {
							((EntityTracksBuilder) entity).setFollowTracksFromPacket(set);
						}
					}
				}
			}
		}
		else if (packetIndex == 6) {
			int entityID = data.readInt();
			int page = data.readInt();
			int recipe = data.readInt();

			if (((EntityPlayer) player).getEntityId() == entityID) {
				if (((EntityPlayer) player).getCurrentEquippedItem() != null && (((EntityPlayer) player).getCurrentEquippedItem().getItem() instanceof ItemRecipeBook)) {
					ItemStack stack = ((EntityPlayer) player).getCurrentEquippedItem();
					NBTTagCompound var3 = stack.getTagCompound();
					if (var3 == null) {
						var3 = new NBTTagCompound();
						stack.setTagCompound(var3);
					}
					stack.getTagCompound().setInteger("currPage", page);
					stack.getTagCompound().setInteger("currRecipe", recipe);
				}
			}
		}
		else if (packetIndex == 12) {
			int ID = data.readInt();
			boolean locked = data.readBoolean();
			AxisAlignedBB box = ((EntityPlayer) player).boundingBox.expand(5, 5, 5);
			List lis3 = ((EntityPlayer) player).worldObj.getEntitiesWithinAABBExcludingEntity((Entity) player, box);
			if (lis3 != null && lis3.size() > 0) {
				for (int j1 = 0; j1 < lis3.size(); j1++) {
					Entity entity = (Entity) lis3.get(j1);
					if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getEntityId() == ID) {
						((AbstractTrains) entity).setTrainLockedFromPacket(locked);
					}
				}
			}

		}
		else if (packetIndex == 13) {
			int ID = data.readInt();
			boolean locked = data.readBoolean();
			String theOwner = data.readLine();
			AxisAlignedBB box = ((EntityPlayer) player).boundingBox.expand(5, 5, 5);
			List lis3 = ((EntityPlayer) player).worldObj.getEntitiesWithinAABBExcludingEntity((Entity) player, box);
			if (lis3 != null && lis3.size() > 0) {
				for (int j1 = 0; j1 < lis3.size(); j1++) {
					Entity entity = (Entity) lis3.get(j1);
					if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getEntityId() == ID) {
						((AbstractTrains) entity).setTrainLockedFromPacket(locked, theOwner);
					}
				}
			}
		}
		else if (packetIndex == 14) {
			int entityID = data.readInt();
			int rotationServer = data.readInt();
			int roll = data.readInt();
			Entity entity = this.getEntityByID(entityID, player);
			if (entity instanceof AbstractZeppelin) {
				((AbstractZeppelin) entity).rotationYawClient = rotationServer;
				((AbstractZeppelin) entity).roll = roll;
			}
		}
		else if (packetIndex == 17) {
			int entityID = data.readInt();
			boolean isOn = data.readBoolean();
			Entity entity = this.getEntityByID(entityID, player);
			if (entity instanceof Locomotive) {
				((Locomotive) entity).setLocoTurnedOn(isOn, false, false,0);
			}
		}
	}

	private Entity getEntityByID(int par1, EntityPlayer player) {
		return (Entity) (par1 == ((EntityPlayer) player).getEntityId() ? player : ((EntityPlayer) player).worldObj.getEntityByID(par1));
	}



	/**
	 * Zeppelin rotation packet sent to client
	 * 
	 * @param entity
	 * @param rotationYawServer
	 * @param realRotation
	 * @param anglePitch
	 * @return
	 */
	public static Packet setRotationPacketZeppelin(Entity entity, float rotationYawServer, float roll) {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(bos);
		try {
			if (entity != null && entity instanceof AbstractZeppelin) {
				dos.writeInt(14);
				dos.writeInt(entity.getEntityId());
				dos.writeInt((int) rotationYawServer);
				dos.writeInt((int) roll);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		Packet250CustomPayload packet = new Packet250CustomPayload(Info.channel, bos.toByteArray());
		packet.length = bos.size();
		return packet;
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

	public static Packet setTrainLocked(Entity player, Entity entity, boolean set) {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(bos);
		try {
			if (entity instanceof AbstractTrains) {
				AbstractTrains lo = (AbstractTrains) entity;
				dos.writeInt(12);
				dos.writeInt(lo.getEntityId());//.getID());
				dos.writeBoolean(set);
			}
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

	public static IMessage setTrainLockedToClient(Entity player, Entity entity, boolean set) {
		PacketSetTrainLockedToClient packet = new PacketSetTrainLockedToClient(set);
		return packet;
	}

	public static Packet setBuilderPlannedHeight(Entity player, Entity entity, int set, int packetID) {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(bos);
		try {
			if (entity instanceof EntityTracksBuilder) {
				EntityTracksBuilder lo = (EntityTracksBuilder) entity;
				dos.writeInt(packetID);
				dos.writeInt(lo.getEntityId());//.getID());
				dos.writeInt(set);
			}
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

	@Override
	protected void encode(ChannelHandlerContext ctx, Packet250CustomPayload msg, List<Object> out) throws Exception{
		//Only for compiling
	}

	@Override
	protected void decode(ChannelHandlerContext ctx, FMLProxyPacket msg, List<Object> out) throws Exception{
		//Only for compiling
	}
}
