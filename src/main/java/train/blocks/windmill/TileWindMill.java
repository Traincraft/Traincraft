package train.blocks.windmill;


import cofh.api.energy.EnergyStorage;
import cofh.api.energy.IEnergyProvider;
import cofh.api.energy.IEnergyReceiver;
import ebf.tim.blocks.BlockDynamic;
import ebf.tim.blocks.TileRenderFacing;
import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import train.blocks.TCBlocks;
import train.core.handlers.ConfigHandler;
import train.core.handlers.WorldEvents;

import java.util.Arrays;
import java.util.Random;

public class TileWindMill extends TileRenderFacing implements IEnergyProvider {
	private int updateTicks = 0;
	private static Random rand = new Random();
	public int windClient = 0;
    public int standsOpen = 0;

	public EnergyStorage energy = new EnergyStorage(3000,80); //core energy value the first value is max storage and the second is transfer max.
	private ForgeDirection[] sides = new ForgeDirection[]{}; //defines supported sides


	public TileWindMill(BlockDynamic host) {
		super(host);
		this.energy.setCapacity(240);
		this.energy.setMaxTransfer(80);
		setSides(new ForgeDirection[]{ForgeDirection.EAST, ForgeDirection.WEST, ForgeDirection.SOUTH, ForgeDirection.NORTH, ForgeDirection.DOWN});
	}


	public void setSides(ForgeDirection[] listOfSides){
		this.sides = listOfSides;
	}
	public ForgeDirection[] getSides(){
		return this.sides;
	}


	@Override
	public void readFromNBT(NBTTagCompound nbt) {
		super.readFromNBT(nbt);
		this.windClient = nbt.getInteger("Wind");
        this.standsOpen = nbt.getInteger("standsOpen");
		this.energy.readFromNBT(nbt);
	}

	@Override
	public void writeToNBT(NBTTagCompound nbt) {
		super.writeToNBT(nbt);
		nbt.setInteger("Wind", this.windClient);
        nbt.setInteger("standsOpen", this.standsOpen);
		this.energy.writeToNBT(nbt);
	}

	@Override
	public boolean canUpdate(){return true;}

	@Override
	public void updateEntity() {
		super.updateEntity();
		updateTicks++;
		/**
		 * Remove any block on top of the wind mill
		 */
		if (!worldObj.isRemote) {
			if (updateTicks % 20 == 0) {
				if (!this.worldObj.isAirBlock(this.xCoord, this.yCoord + 1, this.zCoord)) {
					Block block = this.worldObj.getBlock(this.xCoord, this.yCoord + 1, this.zCoord);
					if (block != null) {
						EntityItem entityitem = new EntityItem(worldObj, this.xCoord, this.yCoord + 1, this.zCoord, new ItemStack(Item.getItemFromBlock(TCBlocks.windmill),1));
						float f3 = 0.05F;
						entityitem.motionX = (float) rand.nextGaussian() * f3;
						entityitem.motionY = (float) rand.nextGaussian() * f3 + 0.2F;
						entityitem.motionZ = (float) rand.nextGaussian() * f3;
						worldObj.spawnEntityInWorld(entityitem);
					}
					this.worldObj.setBlockToAir(this.xCoord, this.yCoord, this.zCoord);
				}
			}

			/**
			 * Check every 6 seconds if a selectable area around the windmill top-block can see the sky
			 */
            if(this.updateTicks % 120 == 0) {
                this.standsOpen = 0;
                int st = ConfigHandler.WINDMILL_CHECK_RADIUS;
                if(st >= 0) {
                   int en = st+1;
                   louter:
                   for(int x=-st;x<en;x++)
                     for(int z=-st;z<en;z++)
                       if(!this.worldObj.canBlockSeeTheSky(this.xCoord + x, this.yCoord + 1, this.zCoord + z))
                       {
                           this.standsOpen++;
                           break louter;
                       }
                }
            } 

			/**
			 * Calculate production using wind strength
			 */
			if (this.standsOpen == 0 && updateTicks % 4 == 0) {
				this.energy.receiveEnergy((WorldEvents.windStrength + (Math.round(this.yCoord *0.25f)) * 10), false);
				if (this.worldObj.isThundering()) {
					this.energy.receiveEnergy(Math.round(this.energy.getEnergyStored() * 3.5f), false);
				} else if (this.worldObj.isRaining()) {
					this.energy.receiveEnergy(Math.round(this.energy.getEnergyStored() * 2.2f), false);
				}
			}
			if (this.energy.getEnergyStored() > 0) {
				pushEnergy(worldObj, this.xCoord, this.yCoord, this.zCoord, this.energy);
			}

			this.markDirty();
			this.syncTileEntity();
		}
	}


	public void pushEnergy(World world, int x, int y, int z, EnergyStorage storage){
		for (ForgeDirection side : getSides()) {
			TileEntity tile = world.getTileEntity(x + side.offsetX, y + side.offsetY, z + side.offsetZ);
			if (tile instanceof IEnergyReceiver && storage.getEnergyStored() > 0) {
				if (((IEnergyReceiver) tile).canConnectEnergy(side.getOpposite())) {
					int receive = ((IEnergyReceiver) tile).receiveEnergy(side.getOpposite(), Math.min(storage.getMaxExtract(), storage.getEnergyStored()), false);
					storage.extractEnergy(receive, false);
				}
			}
		}
	}

	//RF Overrides
	@Override
	public boolean canConnectEnergy(ForgeDirection dir) {
		return Arrays.asList(sides).contains(dir);
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
