/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("TCEntityPackets.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.network;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import traincraft.Traincraft;
import traincraft.api.AbstractRollingStock;
import traincraft.tile.BaseTile;

import javax.annotation.Nonnull;
import java.util.function.BiFunction;

public enum TCEntityPackets {
    
    NOOP((rollingStock, nbtTagCompound) -> null), // index 0 for catching errors
    CUSTOM((rollingStock, nbtTagCompound) -> null), // custom packets, they have to be overwritten in the AbstractRollingStock class
    KEY_PRESS((rollingStock, nbt) -> {
        boolean isGuiOpen = nbt.getBoolean("gui_open");
        for(int pressed_key : nbt.getIntArray("pressed_keys")){
            rollingStock.clientKeyPress(EnumKeyEvent.values()[pressed_key], isGuiOpen);
        }
        return null;
    }),
    SYNC((rollingStock, nbtTagCompound) -> {
        rollingStock.readFromNBT(rollingStock, nbtTagCompound, BaseTile.NBTState.SYNC);
        return null;
    });
    
    private final BiFunction<AbstractRollingStock<?>, NBTTagCompound, IMessage> action;
    
    TCEntityPackets(BiFunction<AbstractRollingStock<?>, NBTTagCompound, IMessage> action){
        this.action = action;
    }
    
    public IMessage run(AbstractRollingStock<?> entity, NBTTagCompound data){
        return this.action.apply(entity, data);
    }
    
    public void sendToServer(@Nonnull AbstractRollingStock<?> entity, @Nonnull NBTTagCompound data){
        Traincraft.TC_NETWORK.sendToServer(new PacketTraincraftEntity(entity, this, data));
    }
    
    public void sendToClientsAround(@Nonnull AbstractRollingStock<?> entity, NBTTagCompound data){
        Traincraft.TC_NETWORK.sendToAllAround(new PacketTraincraftEntity(entity, this, data), new NetworkRegistry.TargetPoint(entity.dimension, entity.posX, entity.posY, entity.posZ, 128));
    }
}
