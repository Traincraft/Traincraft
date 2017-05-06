package train.common.core.util;

import cofh.api.energy.EnergyStorage;
import cofh.api.energy.IEnergyProvider;
import cofh.api.energy.IEnergyReceiver;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import train.common.tile.TileTraincraft;

import java.util.Arrays;

public class Energy extends TileTraincraft implements IEnergyProvider {
	public EnergyStorage energy = new EnergyStorage(3000,80); //core energy value the first value is max storage and the second is transfer max.
	private ForgeDirection[] sides = new ForgeDirection[]{}; //defines supported sides

	public Energy(int inventorySlots, String name, int maxEnergy, int maxTransfer){
		super(inventorySlots, name);
		this.energy.setCapacity(maxEnergy);
		this.energy.setMaxTransfer(maxTransfer);
	}
	public Energy(){}

	public void pushEnergy(World world, int x, int y, int z, EnergyStorage storage){
		for (ForgeDirection side : getSides()) {
			TileEntity tile = world.getTileEntity(x + side.offsetX, y + side.offsetY, z + side.offsetZ);
			if (tile != null && tile instanceof IEnergyReceiver && storage.getEnergyStored() > 0) {
				if (((IEnergyReceiver) tile).canConnectEnergy(side.getOpposite())) {
					int receive = ((IEnergyReceiver) tile).receiveEnergy(side.getOpposite(), Math.min(storage.getMaxExtract(), storage.getEnergyStored()), false);
					storage.extractEnergy(receive, false);
				}
			}
		}
	}



	//Implemented parts from the diesel generator
	@Override
	public void readFromNBT(NBTTagCompound nbtTag, boolean forSyncing) {
		super.readFromNBT(nbtTag, forSyncing);
		this.energy.readFromNBT(nbtTag);
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound nbtTag, boolean forSyncing) {
		super.writeToNBT(nbtTag, forSyncing);
		this.energy.writeToNBT(nbtTag);
		return nbtTag;
	}

	public void setSides(ForgeDirection[] listOfSides){
		this.sides = listOfSides;
	}
	public ForgeDirection[] getSides(){
		return this.sides;
	}

	//RF Overrides
	@Override
	public boolean canConnectEnergy(ForgeDirection dir) {
		if(Arrays.asList(sides).contains(dir)) {
			return true;
		} else {
			return false;
		}
	}
	@Override
	public int extractEnergy(ForgeDirection dir, int amount, boolean simulate) {
		return energy.extractEnergy(amount, simulate);
	}
	@Override
	public int getEnergyStored(ForgeDirection dir) {
		return energy.getEnergyStored();
	}
	@Override
	public int getMaxEnergyStored(ForgeDirection dir) {
		return this.energy.getMaxEnergyStored();
	}



}
