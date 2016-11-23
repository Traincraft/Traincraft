/*
 * This file ("TileEntityEnergy.java") is part of the Traincraft mod for Minecraft.
 * It is created by all persons that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/LICENSE.MD)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2016
 */

package si.meansoft.traincraft.tile;

import cofh.api.energy.IEnergyHandler;
import ic2.api.tile.IEnergyStorage;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.energy.EnergyStorage;
import net.minecraftforge.fml.common.Optional;
import si.meansoft.traincraft.Compat;
import si.meansoft.traincraft.TeslaWrapper;

/**
 * @author canitzp
 */
@Optional.Interface(modid = "IC2", iface = "ic2.api.tile.IEnergyStorage")
public class TileEntityEnergy extends TileEntityInventory implements IEnergyStorage, IEnergyHandler{

    public static final int EU_TO_RF_CONVERSION_RATE = 4;

    private EnergyStorage storage;
    private int maxTransfer;

    public TileEntityEnergy(String name, int slotAmount, int capacity, int maxTransfer){
        super(name, slotAmount);
        this.maxTransfer = maxTransfer;
        this.storage = new EnergyStorage(capacity, maxTransfer);
    }

    /**
     * Only implementation. DO NOT USE!
     */

    @Deprecated /* Use getStoredEnergy() if you handle everything except EU */
    @Optional.Method(modid = "IC2")
    @Override
    public int getStored(){
        return this.getStoredEnergy() / EU_TO_RF_CONVERSION_RATE;
    }

    @Deprecated /* Not used */
    @Optional.Method(modid = "IC2")
    @Override
    public void setStored(int energy){
    }

    @Deprecated /* Use receiveEnergy(int energy, boolean simulate) if you handle everything except EU */
    @Optional.Method(modid = "IC2")
    @Override
    public int addEnergy(int energy){
        this.receiveEnergy(energy / EU_TO_RF_CONVERSION_RATE, false);
        return this.getStoredEnergy() / EU_TO_RF_CONVERSION_RATE;
    }

    @Deprecated /* Use getMaxEnergy() if you handle everything except EU */
    @Optional.Method(modid = "IC2")
    @Override
    public int getCapacity(){
        return this.getMaxEnergy() / EU_TO_RF_CONVERSION_RATE;
    }

    @Deprecated /* Use getMaxTransfer() if you handle everything except EU */
    @Optional.Method(modid = "IC2")
    @Override
    public int getOutput(){
        return this.getMaxTransfer() / EU_TO_RF_CONVERSION_RATE;
    }

    @Deprecated
    @Optional.Method(modid = "IC2")
    @Override
    public double getOutputEnergyUnitsPerTick(){
        return getOutput();
    }

    @Deprecated
    @Optional.Method(modid = "IC2")
    @Override
    public boolean isTeleporterCompatible(EnumFacing enumFacing){
        return false;
    }

    @Deprecated /* Use getStoredEnergy() instead */
    @Override
    public int getEnergyStored(EnumFacing enumFacing){
        return this.getStoredEnergy();
    }

    @Deprecated /* Use getMaxEnergy() instead */
    @Override
    public int getMaxEnergyStored(EnumFacing enumFacing){
        return this.getMaxEnergy();
    }

    @Deprecated
    @Override
    public boolean canConnectEnergy(EnumFacing enumFacing){
        return true;
    }

    /**
     * Now usable Methods
     */

    @Override
    public <T> T getCapability(Capability<T> capability, EnumFacing facing){
        if(Compat.isTeslaLoaded){
            T cap = TeslaWrapper.getFromCapability(this.storage, capability);
            if(cap != null){
                return cap;
            }
        }
        if(capability == CapabilityEnergy.ENERGY){
            return (T) this.storage;
        }
        return super.getCapability(capability, facing);
    }

    @Override
    public boolean hasCapability(Capability<?> capability, EnumFacing facing){
        return this.getCapability(capability, facing) != null;
    }

    public int receiveEnergy(int energy, boolean simulated){
        return this.storage.receiveEnergy(energy, simulated);
    }

    public int extractEnergy(int energy, boolean simulated){
        return this.storage.extractEnergy(energy, simulated);
    }

    public int getStoredEnergy(){
        return this.storage.getEnergyStored();
    }

    public int getMaxEnergy(){
        return this.storage.getMaxEnergyStored();
    }

    public int getMaxTransfer(){
        return this.maxTransfer;
    }

}
