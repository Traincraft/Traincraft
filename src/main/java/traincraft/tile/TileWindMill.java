/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("TileWindMill.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.tile;

import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraftforge.energy.IEnergyStorage;
import traincraft.api.ForceEnergyStorage;
import traincraft.capabilities.CapabilityWorldWind;
import traincraft.capabilities.WorldWind;

import javax.annotation.Nullable;

public class TileWindMill extends BaseTile implements ITickable {
    
    private static final int ENERGY_PER_WIND_STRENGTH = 1;
    private final ForceEnergyStorage storage = new ForceEnergyStorage(250);
    
    @Override
    public IEnergyStorage getEnergyStorage(@Nullable EnumFacing side){
        return this.storage;
    }
    
    @Override
    public void update(){
        if(!this.world.isRemote){
            if(this.world.getTotalWorldTime() % 10 == 0){
                this.generateEnergy();
                this.syncToClient();
            }
        }
    }
    
    private void generateEnergy(){
        WorldWind wind = this.world.getCapability(CapabilityWorldWind.WORLD_WIND, null);
        if(wind != null){
            int energyToGenerate = wind.getWindStrength() * ENERGY_PER_WIND_STRENGTH;
            if(energyToGenerate > 0){
                this.storage.forceReceiveEnergy(energyToGenerate, false);
            }
        }
    }
}
