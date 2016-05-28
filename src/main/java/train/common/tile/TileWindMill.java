package train.common.tile;


import java.util.ArrayList;
import java.util.Random;

import cofh.api.energy.EnergyStorage;
import cofh.api.energy.IEnergyProvider;
import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;
import train.common.core.TrainModBlockUtil;
import train.common.core.handlers.WorldEvents;

public class TileWindMill extends TileEntity implements IEnergyProvider {
	private int facingMeta;
	private int updateTicks = 0;
	private static Random rand = new Random();
	public int windClient = 0;
	public EnergyStorage energy = new EnergyStorage(60);


	public TileWindMill() {
		facingMeta = this.blockMetadata;
	}

	public int getFacing() {
		return facingMeta;
	}

	public void setFacing(int facing) {
		this.facingMeta = facing;
	}

	@Override
	public void readFromNBT(NBTTagCompound nbt) {
		super.readFromNBT(nbt);
		facingMeta = nbt.getByte("Orientation");
		this.windClient = nbt.getInteger("Wind");
	}

	@Override
	public void writeToNBT(NBTTagCompound nbt) {
		super.writeToNBT(nbt);
		nbt.setByte("Orientation", (byte) facingMeta);
		nbt.setInteger("Wind", this.windClient);
	}

	@Override
	public Packet getDescriptionPacket() {

		NBTTagCompound nbt = new NBTTagCompound();
		this.writeToNBT(nbt);

		return new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 1, nbt);
	}

	@Override
	public void updateEntity() {
		updateTicks++;
		/**
		 * Remove any block on top of the wind mill
		 */
		if (updateTicks % 20 == 0 && !worldObj.isRemote) {
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
		if (!worldObj.isRemote && (updateTicks % 128 == 0)) {
			energy.setEnergyStored(energy.getEnergyStored() + WorldEvents.windStrength + (( this.yCoord / 256) * 10));
			if (this.energy.getEnergyStored() <= 0)
				energy.setEnergyStored(0);
			if (this.worldObj.isThundering())
				this.energy.setEnergyStored(Math.round(this.energy.getEnergyStored() *3.5f));
			else if (this.worldObj.isRaining()) {
				this.energy.setEnergyStored(Math.round(this.energy.getEnergyStored() *2.2f));
			}

			energy.setEnergyStored(Math.round(this.energy.getEnergyStored()/4));
			if (energy.getEnergyStored() > this.getMaxEnergyOutput()){
				energy.setEnergyStored(this.getMaxEnergyOutput());}
			
			this.markDirty();
			this.worldObj.markBlockForUpdate(this.xCoord, this.yCoord, this.zCoord);
		}

		if (worldObj.isRemote) {
			PowerUtil.pushEnergy(this.worldObj, this.xCoord, this.yCoord, this.zCoord, false, new ForgeDirection[]{ForgeDirection.NORTH, ForgeDirection.SOUTH, ForgeDirection.EAST, ForgeDirection.WEST}, energy);
		}

	}
	public int getMaxEnergyOutput() {return 10;}


	@Override
	public int extractEnergy(ForgeDirection from, int maxReceive, boolean simulate){
		return this.getEnergyStored(from);
	}
	@Override
	public int getEnergyStored(ForgeDirection from){
		return 80;
	}
	@Override
	public int getMaxEnergyStored(ForgeDirection from){
		return this.getEnergyStored(from);
	}
	@Override
	public boolean canConnectEnergy(ForgeDirection direction){return true;}
}
