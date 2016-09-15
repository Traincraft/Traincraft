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

    @Optional.Method(modid = "IC2")
    @Override
    public int getStored(){
        return storage.getEnergyStored() / EU_TO_RF_CONVERSION_RATE;
    }

    @Optional.Method(modid = "IC2")
    @Override
    public void setStored(int energy){
    }

    @Optional.Method(modid = "IC2")
    @Override
    public int addEnergy(int energy){
        this.storage.receiveEnergy(energy / EU_TO_RF_CONVERSION_RATE, false);
        return this.storage.getEnergyStored() / EU_TO_RF_CONVERSION_RATE;
    }

    @Optional.Method(modid = "IC2")
    @Override
    public int getCapacity(){
        return this.storage.getMaxEnergyStored() / EU_TO_RF_CONVERSION_RATE;
    }

    @Optional.Method(modid = "IC2")
    @Override
    public int getOutput(){
        return this.maxTransfer / EU_TO_RF_CONVERSION_RATE;
    }

    @Optional.Method(modid = "IC2")
    @Override
    public double getOutputEnergyUnitsPerTick(){
        return getOutput();
    }

    @Optional.Method(modid = "IC2")
    @Override
    public boolean isTeleporterCompatible(EnumFacing enumFacing){
        return false;
    }

    @Override
    public int getEnergyStored(EnumFacing enumFacing){
        return this.getStoredEnergy();
    }

    @Override
    public int getMaxEnergyStored(EnumFacing enumFacing){
        return this.getCapacity();
    }

    @Override
    public boolean canConnectEnergy(EnumFacing enumFacing){
        return true;
    }

    @Override
    public <T> T getCapability(Capability<T> capability, EnumFacing facing){
        if(Compat.isTeslaLoaded){
            T cap = TeslaWrapper.getFromCapability(this.storage, capability);
            if(cap != null){
                return cap;
            }
        }
        if(capability == CapabilityEnergy.ENERGY){
            T cap = (T) new EnergyStorage(this.storage.getMaxEnergyStored(), this.maxTransfer);
            return cap;
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


}
