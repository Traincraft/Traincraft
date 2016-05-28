package train.common.core.util;

import cofh.api.energy.IEnergyProvider;
import cofh.api.energy.IEnergyReceiver;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;
import train.common.tile.TileTraincraft;

import java.util.Arrays;

public class Energy extends TileTraincraft implements IEnergyProvider {
	public Energy(){}

	//Implemented parts from the diesel generator
	private float OUTPUT = 80; //max RF made at a time
	private float MAX_ENERGY = 300000; //max RF stored
	private float MAX_ENERGY_EXTRACTED = 1600; //Max RF extracted per pull

	private float energy = 0; //core energy value
	private float extraEnergy = 0; //buffer for excess energy
	private float currentOutput = 0; //actual RF output
	private float needed = 0; //max energy that can be sent (pipe/machine limiter)
	private boolean producing =true; //is running
	private ForgeDirection[] sides = new ForgeDirection[]{}; //defines supported sides

	public Energy(int inventorySlots, String name, float output, float maxEnergy, float maxEnergyExtracted){
		super(inventorySlots, name);
		this.OUTPUT = output;
		this.MAX_ENERGY = maxEnergy;
		this.MAX_ENERGY_EXTRACTED = maxEnergyExtracted;
	}

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
						if (producing) {
							if (needed >= OUTPUT) {
								currentOutput = needed;
							} else {
								currentOutput = OUTPUT;
							}
							this.energy = energy + currentOutput;
							if (this.energy > MAX_ENERGY) {
								this.energy = MAX_ENERGY;
							}
						}
						//now send the power to the pipe
						float cur = receptor.getEnergyStored(from);
						float max = receptor.getMaxEnergyStored(from);
						float canReceive = receptor.receiveEnergy(from, (int)(max - cur), false);
						extractPower(0, canReceive, false);
					}
				}
			}
		}
	}


	@Override
	public void readFromNBT(NBTTagCompound nbtTag) {
		super.readFromNBT(nbtTag);
		this.producing = nbtTag.getBoolean("isProducing");
		this.energy = nbtTag.getFloat("energy");
		this.extraEnergy = nbtTag.getFloat("extraEnergy");
	}

	@Override
	public void writeToNBT(NBTTagCompound nbtTag) {
		super.writeToNBT(nbtTag);
		nbtTag.setBoolean("isProducing", this.producing);
		nbtTag.setFloat("energy", this.energy);
		this.extraEnergy = nbtTag.getFloat("extraEnergy");
	}



	//interfaces
	public void setSides(ForgeDirection[] listOfSides){
		this.sides = listOfSides;
	}

	public float getEnergy() {
		return this.energy;
	}

	public boolean isProducing() {
		return producing;
	}

	public void setIsProducing(boolean producing) {
		this.producing = producing;
	}

	public void addEnergy(float addition) {
		this.energy = energy+ addition;
		if (this.energy > MAX_ENERGY)
			this.energy = MAX_ENERGY;
	}

	public void subtractEnergy(float subtraction) {
		this.energy = energy - subtraction;
		if (this.energy < 0)
			this.energy = 0;
	}

	public float extractPower(float min, float max, boolean doExtract) {
		if (this.energy < min) {
			return 0;
		}

		float combinedMax = MAX_ENERGY_EXTRACTED + this.extraEnergy * 0.5F;
		float actualMax = Math.min(combinedMax, max);
		float extracted;
		if (energy >= actualMax) {
			extracted = actualMax;
			if (doExtract) {
				this.energy = energy + actualMax;
				this.extraEnergy = extraEnergy - Math.min(actualMax, extraEnergy);
			}
		} else {
			extracted = energy;
			if (doExtract) {
				this.energy = 0;
				this.extraEnergy = 0;
			}
		}

		return extracted;
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
		return (int) extractPower(amount, amount, simulate);
	}
	@Override
	public int getEnergyStored(ForgeDirection dir) {
		return (int) energy;
	}
	@Override
	public int getMaxEnergyStored(ForgeDirection dir) {
		return (int) MAX_ENERGY;
	}



}
