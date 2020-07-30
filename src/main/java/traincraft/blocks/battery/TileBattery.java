/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("TileBattery.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.blocks.battery;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.energy.EnergyStorage;
import net.minecraftforge.energy.IEnergyStorage;
import traincraft.tile.BaseTile;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author canitzp
 * @since 2020-07-30
 */
public class TileBattery extends BaseTile implements ITickable {
    
    private EnergyStorage storage = new EnergyStorage(5000, 500, 500);
    private Map<EnumFacing, IEnergyStorage> energyFacings = new HashMap<>();
    
    @Override
    public IEnergyStorage getEnergyStorage(@Nullable EnumFacing side){
        return this.storage;
    }
    
    @Override
    public void onNeighborChange(@Nonnull BlockPos neighbor, EnumFacing facing){
        TileEntity neighborTile = this.world.getTileEntity(neighbor);
        if(neighborTile != null){
            IEnergyStorage capability = neighborTile.getCapability(CapabilityEnergy.ENERGY, facing);
            if(capability != null){
                this.energyFacings.put(facing.getOpposite(), capability);
            }
        }
    }
    
    @Override
    public void onLoad(){
        for(EnumFacing facing : EnumFacing.VALUES){
            TileEntity neighborTile = this.world.getTileEntity(this.getPos().offset(facing));
            if(neighborTile != null){
                IEnergyStorage capability = neighborTile.getCapability(CapabilityEnergy.ENERGY, facing.getOpposite());
                if(capability != null){
                    this.energyFacings.put(facing, capability);
                }
            }
        }
    }
    
    @Override
    public void update(){
        if(!this.world.isRemote){
            if(!this.energyFacings.isEmpty()){
                // todo energy transfer "push" code
            }
        }
    }
}
