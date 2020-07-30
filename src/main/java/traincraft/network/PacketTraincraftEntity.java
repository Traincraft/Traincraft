/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("PacketTraincraftEntity.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.network;

import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.WorldServer;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import traincraft.api.AbstractRollingStock;

public class PacketTraincraftEntity implements IMessage, IMessageHandler<PacketTraincraftEntity, IMessage> {
    
    private int entityId;
    private TCEntityPackets packet;
    private NBTTagCompound data;
    
    // empty constructor for Forge
    @Deprecated
    public PacketTraincraftEntity(){
    }
    
    public PacketTraincraftEntity(AbstractRollingStock<?> entity, TCEntityPackets packet, NBTTagCompound data){
        this.entityId = entity.getEntityId();
        this.packet = packet;
        this.data = data;
    }
    
    @Override
    public void fromBytes(ByteBuf buf){
        this.packet = TCEntityPackets.values()[buf.readInt()];
        this.entityId = buf.readInt();
        this.data = ByteBufUtils.readTag(buf);
    }
    
    @Override
    public void toBytes(ByteBuf buf){
        buf.writeInt(this.packet.ordinal());
        buf.writeInt(this.entityId);
        ByteBufUtils.writeTag(buf, this.data);
    }
    
    @Override
    public IMessage onMessage(PacketTraincraftEntity message, MessageContext ctx){
        switch(ctx.side){
            case CLIENT:{
                WorldClient clientWorld = Minecraft.getMinecraft().world;
                if(clientWorld != null){
                    Entity entity = clientWorld.getEntityByID(message.entityId);
                    if(entity instanceof AbstractRollingStock<?>){
                        return ((AbstractRollingStock<?>) entity).onNetworkPacketClient(message.packet, message.data);
                    }
                }
                break;
            }
            case SERVER:{
                WorldServer serverWorld = ctx.getServerHandler().player.getServerWorld();
                Entity entity = serverWorld.getEntityByID(message.entityId);
                if(entity instanceof AbstractRollingStock<?>){
                    return ((AbstractRollingStock<?>) entity).onNetworkPacketServer(message.packet, message.data);
                }
                break;
            }
        }
        return null;
    }
    
}
