package train.common.core.util;

import cofh.api.energy.IEnergyProvider;
import cofh.api.energy.IEnergyReceiver;
import cofh.api.energy.EnergyStorage;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import train.common.tile.TileTraincraft;

import java.util.Arrays;

public class Energy extends TileTraincraft implements IEnergyProvider {
	public Energy(){}

	public static void pushEnergy(World world, int x, int y, int z, ForgeDirection side, EnergyStorage storage){
		TileEntity tile = world.getTileEntity(x + side.offsetX, y + side.offsetY, z + side.offsetZ);
		if(tile != null && tile instanceof IEnergyReceiver && storage.getEnergyStored() > 0){
			if(((IEnergyReceiver)tile).canConnectEnergy(side.getOpposite())){
				int receive = ((IEnergyReceiver)tile).receiveEnergy(side.getOpposite(), Math.min(storage.getMaxExtract(), storage.getEnergyStored()), false);
				storage.extractEnergy(receive, false);
			}
		}
	}



	//Implemented parts from the diesel generator
	private int OUTPUT = 80; //max RF made at a time

	public EnergyStorage energy = new EnergyStorage(3000,80); //core energy value the first value is max storage and the second is transfer max.
	private int extraEnergy = 0; //buffer for excess energy
	private boolean isRunning =true; //is running
	private ForgeDirection[] sides = new ForgeDirection[]{}; //defines supported sides

	public Energy(int inventorySlots, String name, int output, int maxEnergy, int maxTransfer){
		super(inventorySlots, name);
		this.OUTPUT = output;
		this.energy.setCapacity(maxEnergy);
		this.energy.setMaxTransfer(maxTransfer);
	}
	/*/
	//entity updating
	public void updateEntity() {
		if (!worldObj.isRemote) {

			//create a loop for all sides
			for(ForgeDirection dir: sides) {
				//retrieve the tile entity of the pipe
				TileEntity tile = worldObj.getTileEntity( xCoord + dir.offsetX, yCoord + dir.offsetY, zCoord + dir.offsetZ);
				if(tile != null && tile instanceof IEnergyReceiver) {
					IEnergyReceiver receptor = (IEnergyReceiver) tile;
					//get the part of the pipe that connects to this
					ForgeDirection from = dir.getOpposite();
					if(receptor.canConnectEnergy(from)) {
						//process energy creation
						if (isRunning) {
							energy.receiveEnergy(OUTPUT, false);
						}
						//now send the power to the pipe
						int cur = receptor.getEnergyStored(from);
						int max = receptor.getMaxEnergyStored(from);
						int canReceive = receptor.receiveEnergy(from, (max - cur), false);
						extractPower(canReceive, false);
					}
				}
			}
		}
	}

	/*/
	@Override
	public void readFromNBT(NBTTagCompound nbtTag) {
		super.readFromNBT(nbtTag);
		this.isRunning = nbtTag.getBoolean("isProducing");
		this.extraEnergy = nbtTag.getInteger("extraEnergy");
		this.energy.readFromNBT(nbtTag);
	}

	@Override
	public void writeToNBT(NBTTagCompound nbtTag) {
		super.writeToNBT(nbtTag);
		nbtTag.setBoolean("isProducing", this.isRunning);
		this.extraEnergy = nbtTag.getInteger("extraEnergy");
		this.energy.writeToNBT(nbtTag);
	}
	public void setSides(ForgeDirection[] listOfSides){
		this.sides = listOfSides;
	}
	/*/


	//interfaces
	public void setSides(ForgeDirection[] listOfSides){
		this.sides = listOfSides;
	}

	public EnergyStorage getEnergy() {
		return this.energy;
	}

	public boolean getIsRunning() {
		return isRunning;
	}

	public void setIsRunning(boolean running) {
		this.isRunning = running;
	}

	public int extractPower(int max, boolean doExtract) {

		int combinedMax = Math.round(energy.getMaxExtract() + this.extraEnergy * 0.5F);
		int actualMax = Math.min(combinedMax, max);
		int extracted;
		if (energy.getMaxExtract() >= actualMax) {
			extracted = actualMax;
			if (doExtract) {
				this.energy.receiveEnergy(actualMax, false);
				this.extraEnergy = extraEnergy - Math.min(actualMax, extraEnergy);
			}
		} else {
			extracted = energy.getEnergyStored();
			if (doExtract) {
				this.energy.setEnergyStored(0);
				this.extraEnergy = 0;
			}
		}

		return extracted;
	}/*/
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
