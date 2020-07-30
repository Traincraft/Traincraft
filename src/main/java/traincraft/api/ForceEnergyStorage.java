/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("ForceEnergyStorage.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.api;

import net.minecraftforge.energy.EnergyStorage;

public class ForceEnergyStorage extends EnergyStorage {
    
    public ForceEnergyStorage(int capacity){
        super(capacity);
    }
    
    public ForceEnergyStorage(int capacity, int maxTransfer){
        super(capacity, maxTransfer);
    }
    
    public ForceEnergyStorage(int capacity, int maxReceive, int maxExtract){
        super(capacity, maxReceive, maxExtract);
    }
    
    public ForceEnergyStorage(int capacity, int maxReceive, int maxExtract, int energy){
        super(capacity, maxReceive, maxExtract, energy);
    }
    
    @Override
    public int receiveEnergy(int maxReceive, boolean simulate){
        return this.canReceive() ? this.forceReceiveEnergy(maxReceive, simulate) : 0;
    }
    
    @Override
    public int extractEnergy(int maxExtract, boolean simulate){
        return this.canExtract() ? this.forceExtractEnergy(maxExtract, simulate) : 0;
    }
    
    public int forceReceiveEnergy(int maxReceive, boolean simulate){
        int energyReceived = Math.min(this.capacity - this.energy, Math.min(this.maxReceive, maxReceive));
        if(!simulate){
            this.energy += energyReceived;
        }
        return energyReceived;
    }
    
    public int forceExtractEnergy(int maxExtract, boolean simulate){
        int energyExtracted = Math.min(this.energy, Math.min(this.maxExtract, maxExtract));
        if(!simulate){
            this.energy -= energyExtracted;
        }
        return energyExtracted;
    }
}
