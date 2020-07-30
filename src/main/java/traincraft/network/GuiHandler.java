/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("GuiHandler.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.network;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import traincraft.Traincraft;
import traincraft.api.AbstractRollingStock;
import traincraft.tile.BaseTile;

import javax.annotation.Nullable;

public class GuiHandler implements IGuiHandler {
    
    public static final int TILE_ENTITY = 1;
    public static final int ENTITY = 2;
    
    @Nullable
    @Override
    public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z){
        // id determines if it is a tile or a entity. 1 => TileBase; 2 => Entity (z = world entity id)
        switch(id){
            case TILE_ENTITY:{
                TileEntity tile = world.getTileEntity(new BlockPos(x, y, z));
                if(tile instanceof BaseTile){
                    ((BaseTile) tile).syncToClient(); // sync to clients when opening gui
                    return ((BaseTile) tile).openContainer(player);
                }
                break;
            }
            case ENTITY:{
                Entity entity = world.getEntityByID(z);
                if(entity instanceof AbstractRollingStock<?>){
                    return ((AbstractRollingStock<?>) entity).openContainer((AbstractRollingStock<?>) entity, player);
                }
                break;
            }
        }
        return null;
    }
    
    @Nullable
    @Override
    public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z){
        // id determines if it is a tile or a entity. 1 => TileBase; 2 => Entity (z = world entity id)
        switch(id){
            case TILE_ENTITY:{
                TileEntity tile = world.getTileEntity(new BlockPos(x, y, z));
                if(tile instanceof BaseTile){
                    return ((BaseTile) tile).openGui(player);
                }
                break;
            }
            case ENTITY:{
                Entity entity = world.getEntityByID(z);
                if(entity instanceof AbstractRollingStock<?>){
                    return ((AbstractRollingStock<?>) entity).openGui((AbstractRollingStock<?>) entity, player);
                }
                break;
            }
        }
        return null;
    }
    
    public static void openGui(EntityPlayer player, BlockPos pos, int type){
        player.openGui(Traincraft.INSTANCE, type, player.getEntityWorld(), pos.getX(), pos.getY(), pos.getZ());
    }
    
    public static void openTileGui(EntityPlayer player, TileEntity tile){
        player.openGui(Traincraft.INSTANCE, TILE_ENTITY, player.getEntityWorld(), tile.getPos().getX(), tile.getPos().getY(), tile.getPos().getZ());
    }
    
    public static void openEntityGui(EntityPlayer player, Entity entity){
        player.openGui(Traincraft.INSTANCE, ENTITY, player.getEntityWorld(), 0, 0, entity.getEntityId());
    }
}
