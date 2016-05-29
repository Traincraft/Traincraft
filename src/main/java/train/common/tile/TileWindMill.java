package train.common.tile;


import java.util.ArrayList;
import java.util.Random;

import cofh.api.energy.IEnergyProvider;
import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraftforge.common.util.ForgeDirection;
import train.common.core.TrainModBlockUtil;
import train.common.core.handlers.WorldEvents;
import train.common.core.util.Energy;

public class TileWindMill extends Energy implements IEnergyProvider {
	private int facingMeta;
	private int updateTicks = 0;
	private static Random rand = new Random();
	public int windClient = 0;


	public TileWindMill() {
		super(0,"Wind Mill", 240, 80);
		super.setSides(new ForgeDirection[]{ForgeDirection.EAST, ForgeDirection.WEST, ForgeDirection.SOUTH, ForgeDirection.NORTH, ForgeDirection.DOWN});
		facingMeta = this.blockMetadata;
	}

	public int getFacing() {
		return facingMeta;
	}

	public void setFacing(int facing) {
		this.facingMeta = facing;
	}

	@Override
	public void readFromNBT(NBTTagCompound nbt, boolean synced) {
		super.readFromNBT(nbt, synced);
		facingMeta = nbt.getByte("Orientation");
		this.windClient = nbt.getInteger("Wind");
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound nbt, boolean synced) {
		super.writeToNBT(nbt, synced);
		nbt.setByte("Orientation", (byte) facingMeta);
		nbt.setInteger("Wind", this.windClient);
		return nbt;
	}

	@Override
	public Packet getDescriptionPacket() {

		NBTTagCompound nbt = new NBTTagCompound();
		this.writeToNBT(nbt);

		return new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 1, nbt);
	}

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
						ArrayList<ItemStack> stacks = new ArrayList<ItemStack>(TrainModBlockUtil.getItemStackFromBlock(worldObj, this.xCoord, this.yCoord + 1, this.zCoord));
						for (ItemStack s : stacks) {
							EntityItem entityitem = new EntityItem(worldObj, this.xCoord, this.yCoord + 1, this.zCoord, s);
							float f3 = 0.05F;
							entityitem.motionX = (float) rand.nextGaussian() * f3;
							entityitem.motionY = (float) rand.nextGaussian() * f3 + 0.2F;
							entityitem.motionZ = (float) rand.nextGaussian() * f3;
							worldObj.spawnEntityInWorld(entityitem);
						}
					}
					this.worldObj.setBlockToAir(this.xCoord, this.yCoord + 1, this.zCoord);
				}
			}
			/**
			 * Calculate production using wind strength
			 */
			if (updateTicks % 4 == 0) {
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
}
