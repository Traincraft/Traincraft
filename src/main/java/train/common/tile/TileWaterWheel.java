package train.common.tile;

import cofh.api.energy.IEnergyProvider;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraftforge.common.util.ForgeDirection;
import train.common.core.util.Energy;

public class TileWaterWheel extends Energy implements IEnergyProvider {
	
	public int facingMeta;

	public TileWaterWheel() {
		super(0, "WaterWheel", 80, 80);
		super.setSides(new ForgeDirection[]{ForgeDirection.EAST, ForgeDirection.WEST, ForgeDirection.NORTH, ForgeDirection.SOUTH});
		facingMeta = this.blockMetadata;
	}

	@Override
	public void readFromNBT(NBTTagCompound nbtTag, boolean forSyncing){
		super.readFromNBT(nbtTag, forSyncing);
		facingMeta = nbtTag.getByte("Orientation");
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound nbtTag, boolean forSyncing){
		super.writeToNBT(nbtTag, forSyncing);
		nbtTag.setByte("Orientation", (byte) facingMeta);
		return  nbtTag;
	}

	@Override
	public Packet getDescriptionPacket() {
		NBTTagCompound nbt = new NBTTagCompound();
		this.writeToNBT(nbt);

		return new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 1, nbt);
	}
	@Override
	public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt) {
		this.readFromNBT(pkt.func_148857_g());
	}

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
		facingMeta = i;
		
	}
	
	public int getWaterDir() {
		return facingMeta;
	}

	@Override
	public boolean canConnectEnergy(ForgeDirection direction){
		if((this.getBlockMetadata()==1||this.getBlockMetadata()==3) && (direction == ForgeDirection.WEST||direction == ForgeDirection.EAST)) {
			return true;
		}else if((this.getBlockMetadata()==0||this.getBlockMetadata()==2) && (direction == ForgeDirection.NORTH||direction == ForgeDirection.SOUTH)){
			return true;
		} else {return false;}
	}


}
