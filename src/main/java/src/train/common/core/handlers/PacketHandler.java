/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package src.train.common.core.handlers;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.List;

import cpw.mods.fml.common.network.internal.FMLProxyPacket;
import io.netty.handler.codec.MessageToMessageCodec;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import src.train.common.Packet250CustomPayload;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import src.train.common.api.AbstractTrains;
import src.train.common.api.EntityRollingStock;
import src.train.common.api.Locomotive;
import src.train.common.entity.rollingStock.EntityJukeBoxCart;
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

import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.PacketDispatcher;

public class PacketHandler extends MessageToMessageCodec<FMLProxyPacket, Packet250CustomPayload> {

	protected RollingStockStatsEventHandler statsEventHandler = new RollingStockStatsEventHandler();

	@Override
	public void onPacketData(NetworkManager manager, Packet250CustomPayload packet, EntityPlayer player) {
		ByteArrayDataInput data = ByteStreams.newDataInput(packet.data);
		int packetIndex = data.readInt();
		World world = ((EntityPlayer) player).worldObj;
		if (packetIndex == 0) {
			int x = data.readInt();
			int y = data.readInt();
			int z = data.readInt();
			TileEntity te = world.getTileEntity(x, y, z);
			if (te instanceof TileTrainWbench) {
				byte orientation = data.readByte();
				((TileTrainWbench) te).handlePacketDataFromServer(orientation);
			}
			if (te instanceof TileCrafterTierIII) {
				byte orientation = data.readByte();
				((TileCrafterTierIII) te).handlePacketDataFromServer(orientation);
			}
			if (te instanceof TileCrafterTierII) {
				byte orientation = data.readByte();
				((TileCrafterTierII) te).handlePacketDataFromServer(orientation);
			}
			if (te instanceof TileCrafterTierI) {
				byte orientation = data.readByte();
				((TileCrafterTierI) te).handlePacketDataFromServer(orientation);
			}
			if (te instanceof TileStopper) {
				byte orientation = data.readByte();
				((TileStopper) te).handlePacketDataFromServer(orientation);
			}
			if (te instanceof TileBook) {
				byte orientation = data.readByte();
				((TileBook) te).handlePacketDataFromServer(orientation);
			}
			if (te instanceof TileSignal) {
				byte orientation = data.readByte();
				((TileSignal) te).handlePacketDataFromServer(orientation);
			}
			if (te instanceof TileLantern) {
				int color = data.readInt();
				((TileLantern) te).handlePacketDataFromServer(color);
			}
			if (te instanceof TileWaterWheel) {
				byte orientation = data.readByte();
				((TileWaterWheel) te).handlePacketDataFromServer(orientation);
			}
			if (te instanceof TileWindMill) {
				byte orientation = data.readByte();
				int wind = data.readInt();
				((TileWindMill) te).handlePacketDataFromServer(orientation, wind);
			}
			if (te instanceof TileGeneratorDiesel) {
				byte orientation = data.readByte();
				((TileGeneratorDiesel) te).handlePacketDataFromServer(orientation);
			}
			if (te instanceof TileTCRail) {
				byte orientation = data.readByte();
				String type = data.readUTF();
				boolean hasModel = data.readBoolean();
				boolean switchActive = data.readBoolean();
				int idDrop = data.readInt();
				((TileTCRail) te).handlePacketDataFromServer(orientation, type, hasModel, switchActive, idDrop);
			}
			if (te instanceof TileTCRailGag) {
				String type = data.readUTF();
				int bbHeight = data.readInt();
				((TileTCRailGag) te).handlePacketDataFromServer(type, bbHeight);
			}
		}
		else if (packetIndex == 1) {
			int x = data.readInt();
			int y = data.readInt();
			int z = data.readInt();
			TileEntity te = world.getTileEntity(x, y, z);
			if (te instanceof TileEntityDistil) {
				byte orientation = data.readByte();
				short cookTime = data.readShort();
				short burnTime = data.readShort();
				short amount = data.readShort();
				short liquidID = data.readShort();
				((TileEntityDistil) te).handlePacketDataFromServer(orientation, cookTime, burnTime, amount, liquidID);
			}
			if (te instanceof TileEntityOpenHearthFurnace) {
				byte orientation = data.readByte();
				short cookTime = data.readShort();
				short burnTime = data.readShort();
				((TileEntityOpenHearthFurnace) te).handlePacketDataFromServer(orientation, cookTime, burnTime);
			}

		}
		else if (packetIndex == 2) {
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
		else if (packetIndex == 5) {
			int x = data.readInt();
			int y = data.readInt();
			int z = data.readInt();
			TileEntity te = world.getTileEntity(x, y, z);
			if (te instanceof TileEntityDistil) {
				short amount = data.readShort();
				short liquidID = data.readShort();
				((TileEntityDistil) te).handlePacketDataFromServer(amount, liquidID);
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
		else if (packetIndex == 7) {
			int x = data.readInt();
			int y = data.readInt();
			int z = data.readInt();
			TileEntity te = world.getTileEntity(x, y, z);
			if (te instanceof TileGeneratorDiesel) {
				boolean producing = data.readBoolean();
				short amount = data.readShort();
				short liquidID = data.readShort();
				((TileGeneratorDiesel) te).handlePacketDataFromServer(producing, amount, liquidID);
			}
		}
		else if (packetIndex == 11) {
			int entityID = data.readInt();
			int rotationServer = data.readInt();
			int realRotation = data.readInt();
			boolean isInReverse = data.readBoolean();
			int anglePitch = data.readInt();
			int posY = data.readInt();
			double posYD = ((double) posY / 1000000);
			boolean shouldSetPosY = data.readBoolean();
			Entity entity = this.getEntityByID(entityID, player);
			if (entity instanceof EntityRollingStock) {
				((EntityRollingStock) entity).rotationYawClient = rotationServer;
				((EntityRollingStock) entity).rotationYawClientReal = realRotation;
				((EntityRollingStock) entity).isClientInReverse = isInReverse;
				((EntityRollingStock) entity).anglePitchClient = anglePitch;
				((EntityRollingStock) entity).setYFromServer(posYD, shouldSetPosY);
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
		else if (packetIndex == 15) {
			int entityID = data.readInt();
			String url = data.readUTF();
			boolean playing = data.readBoolean();
			Entity entity = this.getEntityByID(entityID, player);
			if (entity instanceof EntityJukeBoxCart) {
				((EntityJukeBoxCart) entity).recievePacket(url, playing);
			}
		}
		else if (packetIndex == 16) {
			int entityID = data.readInt();
			int slotsFilled = data.readInt();
			Entity entity = this.getEntityByID(entityID, player);
			if (entity instanceof Locomotive) {
				((Locomotive) entity).recieveSlotsFilled(slotsFilled);
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

	public static Packet getTEPClient(TileEntity te) {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(bos);
		try {
			if (te != null && te instanceof TileTrainWbench) {
				TileTrainWbench tem = (TileTrainWbench) te;
				dos.writeInt(0);
				dos.writeInt(tem.xCoord);
				dos.writeInt(tem.yCoord);
				dos.writeInt(tem.zCoord);
				dos.writeByte(tem.getFacing().ordinal());
			}
			if (te != null && te instanceof TileCrafterTierIII) {
				TileCrafterTierIII tem = (TileCrafterTierIII) te;
				dos.writeInt(0);
				dos.writeInt(tem.xCoord);
				dos.writeInt(tem.yCoord);
				dos.writeInt(tem.zCoord);
				dos.writeByte(tem.getFacing().ordinal());
			}
			if (te != null && te instanceof TileCrafterTierII) {
				TileCrafterTierII tem = (TileCrafterTierII) te;
				dos.writeInt(0);
				dos.writeInt(tem.xCoord);
				dos.writeInt(tem.yCoord);
				dos.writeInt(tem.zCoord);
				dos.writeByte(tem.getFacing().ordinal());
			}
			if (te != null && te instanceof TileCrafterTierI) {
				TileCrafterTierI tem = (TileCrafterTierI) te;
				dos.writeInt(0);
				dos.writeInt(tem.xCoord);
				dos.writeInt(tem.yCoord);
				dos.writeInt(tem.zCoord);
				dos.writeByte(tem.getFacing().ordinal());
			}
			if (te != null && te instanceof TileEntityDistil) {
				TileEntityDistil tem = (TileEntityDistil) te;
				dos.writeInt(1);
				dos.writeInt(tem.xCoord);
				dos.writeInt(tem.yCoord);
				dos.writeInt(tem.zCoord);
				dos.writeByte(tem.getFacing().ordinal());
				dos.writeShort(tem.distilCookTime);
				dos.writeShort(tem.distilBurnTime);
				dos.writeShort(tem.amount);
				dos.writeShort(tem.liquidItemID);
			}
			if (te != null && te instanceof TileEntityOpenHearthFurnace) {
				TileEntityOpenHearthFurnace tem = (TileEntityOpenHearthFurnace) te;
				dos.writeInt(1);
				dos.writeInt(tem.xCoord);
				dos.writeInt(tem.yCoord);
				dos.writeInt(tem.zCoord);
				dos.writeByte(tem.getFacing().ordinal());
				dos.writeShort(tem.furnaceCookTime);
				dos.writeShort(tem.furnaceBurnTime);
			}
			if (te != null && te instanceof TileStopper) {
				TileStopper tem = (TileStopper) te;
				dos.writeInt(0);
				dos.writeInt(tem.xCoord);
				dos.writeInt(tem.yCoord);
				dos.writeInt(tem.zCoord);
				dos.writeByte(tem.getFacing());
			}
			if (te != null && te instanceof TileBook) {
				TileBook tem = (TileBook) te;
				dos.writeInt(0);
				dos.writeInt(tem.xCoord);
				dos.writeInt(tem.yCoord);
				dos.writeInt(tem.zCoord);
				dos.writeByte(tem.getFacing());
			}
			if (te != null && te instanceof TileSignal) {
				TileSignal tem = (TileSignal) te;
				dos.writeInt(0);
				dos.writeInt(tem.xCoord);
				dos.writeInt(tem.yCoord);
				dos.writeInt(tem.zCoord);
				dos.writeByte(tem.getFacing());
			}
			if (te != null && te instanceof TileLantern) {
				TileLantern tem = (TileLantern) te;
				dos.writeInt(0);
				dos.writeInt(tem.xCoord);
				dos.writeInt(tem.yCoord);
				dos.writeInt(tem.zCoord);
				dos.writeInt(tem.randomColor);
			}
			if (te != null && te instanceof TileWaterWheel) {
				TileWaterWheel tem = (TileWaterWheel) te;
				dos.writeInt(0);
				dos.writeInt(tem.xCoord);
				dos.writeInt(tem.yCoord);
				dos.writeInt(tem.zCoord);
				dos.writeByte(tem.getFacing());
			}
			if (te != null && te instanceof TileWindMill) {
				TileWindMill tem = (TileWindMill) te;
				dos.writeInt(0);
				dos.writeInt(tem.xCoord);
				dos.writeInt(tem.yCoord);
				dos.writeInt(tem.zCoord);
				dos.writeByte(tem.getFacing());
				dos.writeInt(ServerTickHandler.windStrength);
			}
			if (te != null && te instanceof TileGeneratorDiesel) {
				TileGeneratorDiesel tem = (TileGeneratorDiesel) te;
				dos.writeInt(0);
				dos.writeInt(tem.xCoord);
				dos.writeInt(tem.yCoord);
				dos.writeInt(tem.zCoord);
				dos.writeByte(tem.getFacing());
			}
			if (te != null && te instanceof TileTCRail) {
				TileTCRail tem = (TileTCRail) te;
				dos.writeInt(0);
				dos.writeInt(tem.xCoord);
				dos.writeInt(tem.yCoord);
				dos.writeInt(tem.zCoord);
				dos.writeByte(tem.getFacing());
				dos.writeUTF(tem.getType());
				dos.writeBoolean(tem.hasModel);
				dos.writeBoolean(tem.getSwitchState());
				dos.writeInt(tem.idDrop);
			}
			if (te != null && te instanceof TileTCRailGag) {
				TileTCRailGag tem = (TileTCRailGag) te;
				dos.writeInt(0);
				dos.writeInt(tem.xCoord);
				dos.writeInt(tem.yCoord);
				dos.writeInt(tem.zCoord);
				dos.writeUTF(tem.type);
				dos.writeInt((int) (tem.bbHeight * 1000));
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		Packet250CustomPayload packet = new Packet250CustomPayload(Info.channel, bos.toByteArray());
		packet.length = bos.size();
		return packet;
	}

	public static Packet setDistilLiquid(TileEntity te) {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(bos);
		try {
			if (te != null && te instanceof TileEntityDistil) {
				TileEntityDistil tem = (TileEntityDistil) te;
				dos.writeInt(5);
				dos.writeInt(tem.xCoord);
				dos.writeInt(tem.yCoord);
				dos.writeInt(tem.zCoord);
				dos.writeShort(tem.amount);
				dos.writeShort(tem.liquidItemID);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		Packet250CustomPayload packet = new Packet250CustomPayload(Info.channel, bos.toByteArray());
		packet.length = bos.size();
		return packet;
	}

	/**
	 * RollingStock rotation packet sent to client
	 * 
	 * @param entity
	 * @param rotationYawServer
	 * @param realRotation
	 * @param anglePitch
	 * @return
	 */
	public static Packet setRotationPacket(Entity entity, float rotationYawServer, float realRotation, boolean isInReverse, float anglePitch, double posY, boolean shouldSetPosY) {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(bos);
		try {
			if (entity != null && entity instanceof EntityRollingStock) {
				dos.writeInt(11);
				dos.writeInt(entity.getEntityId());
				dos.writeInt((int) rotationYawServer);
				dos.writeInt((int) realRotation);
				dos.writeBoolean(isInReverse);
				dos.writeInt((int) anglePitch);
				dos.writeInt((int) (posY * 1000000));
				dos.writeBoolean(shouldSetPosY);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		Packet250CustomPayload packet = new Packet250CustomPayload(Info.channel, bos.toByteArray());
		packet.length = bos.size();
		return packet;
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

	public static void sendPacketToClients(Packet packet, World worldObj, int x, int y, int z, double range) {
		try {
			PacketDispatcher.sendPacketToAllAround(x, y, z, range, worldObj.provider.dimensionId, packet);
		}
		catch (Exception e) {
			System.out.println("Sending packet to client failed.");
			e.printStackTrace();
		}
	}

	public static Packet setParkingBrake(Entity player, Entity entity, boolean set, boolean toServer) {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(bos);
		try {
			if (entity instanceof Locomotive) {
				Locomotive lo = (Locomotive) entity;
				dos.writeInt(2);
				dos.writeInt(lo.getEntityId());//.getID());
				dos.writeBoolean(set);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		Packet250CustomPayload packet = new Packet250CustomPayload(Info.channel, bos.toByteArray());
		if (toServer) {
			packet.length = bos.size();
			if (player instanceof EntityClientPlayerMP) {
				EntityClientPlayerMP playerMP = (EntityClientPlayerMP) player;
				playerMP.sendQueue.addToSendQueue(packet);
			}
		}
		return packet;
	}

	public static Packet setLocoTurnedOn(Entity player, Entity entity, boolean set, boolean toServer) {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(bos);
		try {
			if (entity instanceof Locomotive) {
				Locomotive lo = (Locomotive) entity;
				dos.writeInt(17);
				dos.writeInt(lo.getEntityId());//.getID());
				dos.writeBoolean(set);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		Packet250CustomPayload packet = new Packet250CustomPayload(Info.channel, bos.toByteArray());
		if (toServer) {
			packet.length = bos.size();
			if (player instanceof EntityClientPlayerMP) {
				EntityClientPlayerMP playerMP = (EntityClientPlayerMP) player;
				playerMP.sendQueue.addToSendQueue(packet);
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

	public static Packet setTrainLockedToClient(Entity player, Entity entity, boolean set) {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(bos);
		try {
			if (entity instanceof AbstractTrains) {
				AbstractTrains lo = (AbstractTrains) entity;
				dos.writeInt(13);
				dos.writeInt(lo.getEntityId());//.getID());
				dos.writeBoolean(set);
				dos.writeBytes(lo.trainOwner);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		Packet250CustomPayload packet = new Packet250CustomPayload(Info.channel, bos.toByteArray());
		packet.length = bos.size();
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

	public static Packet setJukeBoxStreamingUrl(EntityPlayer player, Entity entity, String url, boolean isPlaying) {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(bos);
		if (url != null && url.length() > 64) url = url.substring(0, 63);
		try {
			if (entity != null && entity instanceof EntityJukeBoxCart) {
				dos.writeInt(15);
				dos.writeInt(entity.getEntityId());
				dos.writeUTF(url);
				dos.writeBoolean(isPlaying);
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

	public static Packet setSlotsFilledPacket(Entity entity, int slotsFilled) {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(bos);
		try {
			if (entity instanceof AbstractTrains) {
				AbstractTrains lo = (AbstractTrains) entity;
				dos.writeInt(16);
				dos.writeInt(lo.getEntityId());
				dos.writeInt(slotsFilled);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		Packet250CustomPayload packet = new Packet250CustomPayload(Info.channel, bos.toByteArray());
		packet.length = bos.size();
		return packet;
	}
}
