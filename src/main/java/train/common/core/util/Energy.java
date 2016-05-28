package train.common.core.util;

import cofh.api.energy.EnergyStorage;
import cofh.api.energy.IEnergyProvider;
import cofh.api.energy.IEnergyReceiver;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public final class Energy extends TileEntity implements IEnergyProvider {
	public Energy(){}

	//function to push energy to connected pipes
	public static void pushEnergy(World world, int x, int y, int z, boolean simulate, ForgeDirection[] sides, EnergyStorage energy) {
		if (world.getTileEntity(x,y,z) instanceof IEnergyProvider) {
			for (ForgeDirection side : sides) {
				if ((x != 0 && y != 0 && z != 0) && ((IEnergyProvider) world.getTileEntity(x, y, z)).canConnectEnergy(side)) {
					TileEntity tile = world.getTileEntity(x + side.offsetX, y + side.offsetY, z + side.offsetZ);
					if (tile != null && tile instanceof IEnergyReceiver && energy.getEnergyStored() > 0) {
						if (((IEnergyReceiver) tile).canConnectEnergy(side.getOpposite())) {
							int receive = ((IEnergyReceiver) tile).receiveEnergy(side.getOpposite(), Math.min(energy.getMaxExtract(), energy.getEnergyStored()), false);
							energy.extractEnergy(receive, simulate);
						}
					}
				}
			}
		}
	}


	//Implemented parts from the diesel generator
	private static final float OUTPUT = 80;
	private static final float MAX_ENERGY = 300000;
	private static final float MAX_ENERGY_EXTRACTED = 1600;
	private static final int DIESEL_USAGE = 100;

	private float energy = 0;
	private float extraEnergy = 0;
	private float currentOutput = 0;
	private float needed = 0;
	private boolean powered = false;
	private int update;
	private ForgeDirection direction;
	private boolean producing =false;

	private int liquidItemIDClient;
	public int amountClient;

	//entity updating
	public void updateEntity() {
		if (!worldObj.isRemote) {

			for(ForgeDirection dir: new ForgeDirection[] {
					ForgeDirection.EAST,
					ForgeDirection.WEST,
					ForgeDirection.DOWN,
					ForgeDirection.UP,
					ForgeDirection.NORTH,
					ForgeDirection.SOUTH,
			}) {
				int x = xCoord + dir.offsetX;
				int y = yCoord + dir.offsetY;
				int z = zCoord + dir.offsetZ;
				TileEntity tile = worldObj.getTileEntity(x, y, z);
				if(tile != null && tile instanceof IEnergyReceiver) {
					IEnergyReceiver receptor = (IEnergyReceiver) tile;
					ForgeDirection from = dir.getOpposite();
					if(receptor.canConnectEnergy(from)) {
						burn(receptor, from);
						this.markDirty();
						this.worldObj.markBlockForUpdate(this.xCoord, this.yCoord, this.zCoord);
						this.syncTileEntity();
					}
				}
			}
		}
	}
	//entity updating
	private float getPowerToExtract(IEnergyReceiver receptor, ForgeDirection from) {
		float cur = receptor.getEnergyStored(from);
		float max = receptor.getMaxEnergyStored(from);
		float canReceive = receptor.receiveEnergy(from, (int)(max - cur), false);
		return extractEnergy(0, canReceive, false);
	}
	//entity updating
	public void burn(IEnergyReceiver receptor, ForgeDirection from) {
		this.update += 1;

		if (needed >= OUTPUT) {
			currentOutput = needed;
		} else{
			currentOutput = OUTPUT;
		}
		addEnergy(currentOutput);
		getPowerToExtract(receptor, from);
		amountClient -= DIESEL_USAGE;
	}

	//syncing
	public void syncTileEntity(){
		for(Object o : this.worldObj.playerEntities){
			if(o instanceof EntityPlayerMP){
				EntityPlayerMP player = (EntityPlayerMP) o;
				if(player.getDistance(xCoord, yCoord, zCoord) <= 64) {
					player.playerNetServerHandler.sendPacket(this.getDescriptionPacket());
				}
			}
		}
	}

	//interfaces
	public float getEnergy() {
		return this.energy;
	}
	public boolean isPowered() {
		return powered;
	}

	public void setIsPowered(boolean power) {
		powered = power;
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

	public float extractEnergy(float min, float max, boolean doExtract) {
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
	//Buildcraft Overrides
	@Override
	public boolean canConnectEnergy(ForgeDirection dir) {
		return true;
	}
	@Override
	public int extractEnergy(ForgeDirection dir, int amount, boolean simulate) {
		return (int) extractEnergy(amount, amount, simulate);
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
