package train.common.tile;


import java.util.ArrayList;
import java.util.Random;

import cofh.api.energy.EnergyStorage;
import cofh.api.energy.IEnergyProvider;
import cofh.api.energy.IEnergyReceiver;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import train.common.core.TrainModBlockUtil;
import train.common.core.handlers.WorldEvents;

public class TileWindMill extends TileEntity implements IEnergyProvider {
	private int facingMeta;
	private int updateTicks = 0;
	private static Random rand = new Random();
	public int windClient = 0;
	public EnergyStorage IC2production = new EnergyStorage(600);


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
			IC2production.setEnergyStored((int) (WorldEvents.windStrength + (((double) this.yCoord / 256) * 10)));
			if (this.IC2production.getEnergyStored() <= 0)
				IC2production.setEnergyStored(0);
			if (this.worldObj.isThundering())
				this.IC2production.setEnergyStored(Math.round(this.IC2production.getEnergyStored() *3.5f));
			else if (this.worldObj.isRaining()) {
				this.IC2production.setEnergyStored(Math.round(this.IC2production.getEnergyStored() *2.2f));
			}

			IC2production.setEnergyStored(Math.round(this.IC2production.getEnergyStored()/4));
			//System.out.println(this.IC2production);
			if (IC2production.getEnergyStored() > this.getMaxEnergyOutput()){
				IC2production.setEnergyStored(this.getMaxEnergyOutput());}
			
			this.markDirty();
			this.worldObj.markBlockForUpdate(this.xCoord, this.yCoord, this.zCoord);
		}

		pushEnergy(worldObj, this.xCoord,this.yCoord,this.zCoord,ForgeDirection.NORTH,IC2production);
		pushEnergy(worldObj, this.xCoord,this.yCoord,this.zCoord,ForgeDirection.SOUTH,IC2production);
		pushEnergy(worldObj, this.xCoord,this.yCoord,this.zCoord,ForgeDirection.EAST,IC2production);
		pushEnergy(worldObj, this.xCoord,this.yCoord,this.zCoord,ForgeDirection.WEST,IC2production);
		pushEnergy(worldObj, this.xCoord,this.yCoord,this.zCoord,ForgeDirection.DOWN,IC2production);

	}

	public void pushEnergy(World world, int x, int y, int z, ForgeDirection side, EnergyStorage storage){
		if (this.canConnectEnergy(side)) {
			TileEntity tile = world.getTileEntity(x + side.offsetX, y + side.offsetY, z + side.offsetZ);
			if (tile != null && tile instanceof IEnergyReceiver && storage.getEnergyStored() > 0) {
				if (((IEnergyReceiver) tile).canConnectEnergy(side.getOpposite())) {
					int receive = ((IEnergyReceiver) tile).receiveEnergy(side.getOpposite(), Math.min(storage.getMaxExtract(), storage.getEnergyStored()), false);
					storage.extractEnergy(receive, false);
				}
			}
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
