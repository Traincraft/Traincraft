/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("TCDimensionSaveData.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.save;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.storage.WorldSavedData;
import net.minecraftforge.common.util.Constants;
import traincraft.capabilities.WorldWind;

public class TCDimensionSaveData extends WorldSavedData {
    
    public static final String KEY_WORLD_WIND = "world_wind";
    private final WorldWind worldWind = new WorldWind(0);
    
    public TCDimensionSaveData(String name){
        super(name);
    }
    
    @Override
    public void readFromNBT(NBTTagCompound nbt){
        if(nbt.hasKey("world_wind", Constants.NBT.TAG_INT)){
            this.worldWind.setWindStrength(nbt.getInteger(KEY_WORLD_WIND));
        }
    }
    
    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound nbt){
        nbt.setInteger(KEY_WORLD_WIND, this.worldWind.getWindStrength());
        return nbt;
    }
    
    public WorldWind getWorldWind(){
        return this.worldWind;
    }
    
}
