/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("CapabilityWorldWind.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.capabilities;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagInt;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.CapabilityManager;

import javax.annotation.Nullable;

public class CapabilityWorldWind {
    
    @CapabilityInject(WorldWind.class)
    public static Capability<WorldWind> WORLD_WIND = null;
    
    public static void register(){
        CapabilityManager.INSTANCE.register(WorldWind.class, new Capability.IStorage<WorldWind>() {
            @Nullable
            @Override
            public NBTBase writeNBT(Capability<WorldWind> capability, WorldWind instance, EnumFacing side){
                return new NBTTagInt(instance.getWindStrength());
            }
            
            @Override
            public void readNBT(Capability<WorldWind> capability, WorldWind instance, EnumFacing side, NBTBase nbt){
                if(nbt instanceof NBTTagInt){
                    instance.setWindStrength(((NBTTagInt) nbt).getInt());
                }
            }
        }, () -> new WorldWind(0));
    }
    
}
