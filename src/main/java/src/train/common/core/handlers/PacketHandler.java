/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package src.train.common.core.handlers;

import com.sun.xml.internal.ws.client.dispatch.PacketDispatch;
import cpw.mods.fml.common.network.FMLEmbeddedChannel;
import cpw.mods.fml.common.network.FMLOutboundHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.relauncher.Side;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageCodec;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.*;

import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
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

@ChannelHandler.Sharable
public class PacketHandler extends MessageToMessageCodec<FMLProxyPacket, Packet250CustomPayload> {

	protected RollingStockStatsEventHandler statsEventHandler = new RollingStockStatsEventHandler();
	private boolean isPostInitialised = false;
	public EnumMap<Side, FMLEmbeddedChannel> channels;
	private LinkedList<Class<? extends Packet250CustomPayload>> packets = new LinkedList<Class<? extends Packet250CustomPayload>>();


	// Method to call from FMLInitializationEvent
	public void initialise() {
		this.channels = NetworkRegistry.INSTANCE.newChannel("TUT", this);
	}

	// Method to call from FMLPostInitializationEvent
	// Ensures that packet discriminators are common between server and client by using logical sorting
	public void postInitialise() {
		if (this.isPostInitialised) {
			return;
		}

		this.isPostInitialised = true;
		Collections.sort(this.packets, new Comparator<Class<? extends Packet250CustomPayload>>() {

			@Override
			public int compare(Class<? extends Packet250CustomPayload> clazz1, Class<? extends Packet250CustomPayload> clazz2) {
				int com = String.CASE_INSENSITIVE_ORDER.compare(clazz1.getCanonicalName(), clazz2.getCanonicalName());
				if (com == 0) {
					com = clazz1.getCanonicalName().compareTo(clazz2.getCanonicalName());
				}

				return com;
			}
		});
	}

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

	public static IMessage getTEPClient(TileEntity te) {
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
				dos.writeInt(WorldEvents.windStrength);
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

	/**
	 * Zeppelin rotation packet sent to client
	 * 
	 * @param entity
	 * @param rotationYawServer
	 * @return
	 */
	public static IMessage setRotationPacketZeppelin(Entity entity, float rotationYawServer, float roll) {
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

	public static void sendPacketToClients(IMessage packet, World worldObj, int x, int y, int z, double range) {
		try {
			// PacketDispatcher.sendPacketToAllAround(x, y, z, range, worldObj.provider.dimensionId, packet);
			//TODO FIXED-ISH
			Traincraft.packetPipeline.channels.get(Side.SERVER).attr(FMLOutboundHandler.FML_MESSAGETARGET).set(FMLOutboundHandler.OutboundTarget.ALLAROUNDPOINT);
			Traincraft.packetPipeline.channels.get(Side.SERVER).attr(FMLOutboundHandler.FML_MESSAGETARGETARGS).set(new NetworkRegistry.TargetPoint(worldObj.provider.dimensionId,x,y,z,range));
			Traincraft.packetPipeline.channels.get(Side.SERVER).writeAndFlush(packet);
		}
		catch (Exception e) {
			System.out.println("Sending packet to client failed.");
			e.printStackTrace();
		}
	}

	public IMessage setParkingBrake(Entity player, Entity entity, boolean set, boolean toServer) {
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
				this.channels.get(Side.SERVER).attr(FMLOutboundHandler.FML_MESSAGETARGET).set(FMLOutboundHandler.OutboundTarget.PLAYER);
				this.channels.get(Side.SERVER).attr(FMLOutboundHandler.FML_MESSAGETARGETARGS).set(player);
				this.channels.get(Side.SERVER).writeAndFlush(packet);
			}
		}
		return packet;
	}

	public IMessage setLocoTurnedOn(Entity player, Entity entity, boolean set, boolean toServer) {
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
				this.channels.get(Side.SERVER).attr(FMLOutboundHandler.FML_MESSAGETARGET).set(FMLOutboundHandler.OutboundTarget.PLAYER);
				this.channels.get(Side.SERVER).attr(FMLOutboundHandler.FML_MESSAGETARGETARGS).set(player);
				this.channels.get(Side.SERVER).writeAndFlush(packet);
			}
		}
		return packet;
	}

	public IMessage setTrainLocked(Entity player, Entity entity, boolean set) {
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
			this.channels.get(Side.SERVER).attr(FMLOutboundHandler.FML_MESSAGETARGET).set(FMLOutboundHandler.OutboundTarget.PLAYER);
			this.channels.get(Side.SERVER).attr(FMLOutboundHandler.FML_MESSAGETARGETARGS).set(player);
			this.channels.get(Side.SERVER).writeAndFlush(packet);
		}
		return packet;
	}

	public static IMessage setTrainLockedToClient(Entity player, Entity entity, boolean set) {
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

	public IMessage setBuilderPlannedHeight(Entity player, Entity entity, int set, int packetID) {
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
			this.channels.get(Side.SERVER).attr(FMLOutboundHandler.FML_MESSAGETARGET).set(FMLOutboundHandler.OutboundTarget.PLAYER);
			this.channels.get(Side.SERVER).attr(FMLOutboundHandler.FML_MESSAGETARGETARGS).set(player);
			this.channels.get(Side.SERVER).writeAndFlush(packet);
		}
		return packet;
	}

	public IMessage setBookPage(Entity player, int page, int recipe) {
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
			this.channels.get(Side.SERVER).attr(FMLOutboundHandler.FML_MESSAGETARGET).set(FMLOutboundHandler.OutboundTarget.PLAYER);
			this.channels.get(Side.SERVER).attr(FMLOutboundHandler.FML_MESSAGETARGETARGS).set(player);
			this.channels.get(Side.SERVER).writeAndFlush(packet);
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
