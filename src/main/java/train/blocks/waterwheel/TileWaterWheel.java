package train.blocks.waterwheel;

import cofh.api.energy.EnergyStorage;
import cofh.api.energy.IEnergyProvider;
import cofh.api.energy.IEnergyReceiver;
import ebf.tim.blocks.BlockDynamic;
import ebf.tim.blocks.TileRenderFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class TileWaterWheel extends TileRenderFacing implements IEnergyProvider {
	public EnergyStorage energy = new EnergyStorage(3000,80); //core energy value the first value is max storage and the second is transfer max.
	private ForgeDirection[] sides = new ForgeDirection[]{}; //defines supported sides

	public TileWaterWheel(BlockDynamic host) {
		super(host);
		setSides(new ForgeDirection[]{ForgeDirection.EAST, ForgeDirection.WEST, ForgeDirection.NORTH, ForgeDirection.SOUTH});

		this.energy.setCapacity(80);
		this.energy.setMaxTransfer(80);
	}

	@Override
	public void readFromNBT(NBTTagCompound nbtTag){
		super.readFromNBT(nbtTag);
		this.energy.readFromNBT(nbtTag);
	}

	@Override
	public void writeToNBT(NBTTagCompound nbtTag){
		super.writeToNBT(nbtTag);
		this.energy.writeToNBT(nbtTag);
	}

	@Override
	public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt) {
		this.readFromNBT(pkt.func_148857_g());
	}

	@Override
	public boolean canUpdate(){return true;}

	@Override
	public void updateEntity() {
		super.updateEntity();

		if(!worldObj.isRemote) {

			Block blockXP = worldObj.getBlock(xCoord+1, yCoord, zCoord);
			Block blockXN = worldObj.getBlock(xCoord-1, yCoord, zCoord);
			Block blockZP = worldObj.getBlock(xCoord, yCoord, zCoord+1);
			Block blockZN = worldObj.getBlock(xCoord, yCoord, zCoord-1);
			Block blockTop = worldObj.getBlock(xCoord, yCoord+1, zCoord);
			Block blockBottom = worldObj.getBlock(xCoord, yCoord-1, zCoord);


			if (blockXP instanceof BlockLiquid && blockXP.getMaterial().isLiquid()
					&& worldObj.getBlockMetadata(xCoord + 1, yCoord, zCoord) != 0
					&& blockXP.getMaterial() != Material.lava) {
				this.energy.receiveEnergy(5, false);
				worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, 2, 2);
			} else if (blockXN instanceof BlockLiquid && blockXN.getMaterial().isLiquid()
					&& worldObj.getBlockMetadata(xCoord - 1, yCoord, zCoord) != 0
					&& blockXN.getMaterial() != Material.lava) {
				this.energy.receiveEnergy(5, false);
				worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, 0, 2);
			} else if (blockZN instanceof BlockLiquid && blockZN.getMaterial().isLiquid()
					&& worldObj.getBlockMetadata(xCoord, yCoord, zCoord - 1) != 0
					&& blockZN.getMaterial() != Material.lava) {
				this.energy.receiveEnergy(5, false);
				worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, 1, 2);
			} else if (blockZP instanceof BlockLiquid && blockZP.getMaterial().isLiquid()
					&& worldObj.getBlockMetadata(xCoord, yCoord, zCoord + 1) != 0
					&& blockZP.getMaterial() != Material.lava) {
				this.energy.receiveEnergy(5, false);
				worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, 3, 2);
			}else if(blockTop instanceof BlockLiquid && blockTop.getMaterial().isLiquid()&&worldObj.getBlockMetadata(xCoord, yCoord+1, zCoord)!= 0 && blockTop.getMaterial() != Material.lava){
				this.energy.receiveEnergy(5, false);
			}else if(blockBottom instanceof BlockLiquid && blockBottom.getMaterial().isLiquid() &&worldObj.getBlockMetadata(xCoord, yCoord-1, zCoord)!= 0 && blockBottom.getMaterial() != Material.lava){
				this.energy.receiveEnergy(5, false);
			} else {
				setWaterDir(-1);
			}

			if (this.energy.getEnergyStored() >0) {
				pushEnergy(worldObj, this.xCoord, this.yCoord, this.zCoord, this.energy);
			}

			this.markDirty();
			this.syncTileEntity();
		}

	}
	
	private void setWaterDir(int i) {
		setFacing(i);
		
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

	public int getWaterDir() {
		return facing;
	}

	@Override
	public boolean canConnectEnergy(ForgeDirection direction){
		if((this.getBlockMetadata()==1||this.getBlockMetadata()==3) && (direction == ForgeDirection.WEST||direction == ForgeDirection.EAST)) {
			return true;
		}else if((this.getBlockMetadata()==0||this.getBlockMetadata()==2) && (direction == ForgeDirection.NORTH||direction == ForgeDirection.SOUTH)){
			return true;
		} else {return false;}
	}


	public void setSides(ForgeDirection[] listOfSides){
		this.sides = listOfSides;
	}
	public ForgeDirection[] getSides(){
		return this.sides;
	}

	//RF Overrides
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
