package train.common.tile;

import cofh.api.energy.EnergyStorage;
import cofh.api.energy.IEnergyProvider;
import cofh.api.energy.IEnergyReceiver;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import train.common.core.util.Energy;

public class TileWaterWheel extends TileEntity implements IEnergyProvider {
	private int facingMeta;
	private int waterDirection;
	Material blockMaterial;
	private int updateTicks=0;
	EnergyStorage energy =new EnergyStorage(80,80);

	private int connectDirection(){
		int l = worldObj.getBlockMetadata((int)xCoord, (int)yCoord, (int)zCoord);
		if(l==3||l==1){
			return 4;
		}else{
			return 3;
		}

	}

	public TileWaterWheel() {

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
		this.energy.readFromNBT(nbt);
	}

	@Override
	public void writeToNBT(NBTTagCompound nbt) {

		super.writeToNBT(nbt);

		nbt.setByte("Orientation", (byte) facingMeta);
		this.energy.writeToNBT(nbt);
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
		updateTicks++;

		if(worldObj.isRemote && updateTicks % 2 ==0) {

			double dir=0;

			Block blockXP = worldObj.getBlock((int)xCoord+1, (int)yCoord, (int)zCoord);
			Block blockXN = worldObj.getBlock((int)xCoord-1, (int)yCoord, (int)zCoord);
			Block blockZP = worldObj.getBlock((int)xCoord, (int)yCoord, (int)zCoord+1);
			Block blockZN = worldObj.getBlock((int)xCoord, (int)yCoord, (int)zCoord-1);
			Block blockTop = worldObj.getBlock((int)xCoord, (int)yCoord+1, (int)zCoord);
			Block blockBottom = worldObj.getBlock((int)xCoord, (int)yCoord-1, (int)zCoord);


			if(blockXP instanceof BlockLiquid && this.worldObj.getBlock(this.xCoord+1, this.yCoord, this.zCoord).getMaterial().isLiquid() && worldObj.getBlockMetadata((int)xCoord+1, (int)yCoord, (int)zCoord)!= 0){
				if(this.getBlockMetadata()!=2)worldObj.setBlockMetadataWithNotify((int)xCoord, (int)yCoord, (int)zCoord, 2,2);
				blockMaterial = this.worldObj.getBlock(this.xCoord+1, this.yCoord, this.zCoord).getMaterial();
				dir = -1;
				if(blockMaterial!=blockMaterial.lava) {
					setWaterDir((int) dir);
					this.energy.receiveEnergy(5, false);
				}

			}else if(blockXN instanceof BlockLiquid && this.worldObj.getBlock(this.xCoord-1, this.yCoord, this.zCoord).getMaterial().isLiquid() && worldObj.getBlockMetadata((int)xCoord-1, (int)yCoord, (int)zCoord)!= 0){
				if(this.getBlockMetadata()!=0)worldObj.setBlockMetadataWithNotify((int)xCoord, (int)yCoord, (int)zCoord, 0,2);
				blockMaterial = this.worldObj.getBlock(this.xCoord-1, this.yCoord, this.zCoord).getMaterial();
				dir = 1;
				if(blockMaterial!=blockMaterial.lava){
					setWaterDir((int)dir);
					this.energy.receiveEnergy(5, false);
				}

			}else if(blockZN instanceof BlockLiquid && this.worldObj.getBlock(this.xCoord, this.yCoord, this.zCoord-1).getMaterial().isLiquid() && worldObj.getBlockMetadata((int)xCoord, (int)yCoord, (int)zCoord-1)!= 0){
				if(this.getBlockMetadata()!=1)worldObj.setBlockMetadataWithNotify((int)xCoord, (int)yCoord, (int)zCoord, 1,2);
				blockMaterial = this.worldObj.getBlock(this.xCoord, this.yCoord, this.zCoord-1).getMaterial();
				dir = -3;
				if(blockMaterial!=blockMaterial.lava){
					setWaterDir((int) dir);
					this.energy.receiveEnergy(5, false);
				}

			}else if(blockZP instanceof BlockLiquid && this.worldObj.getBlock(this.xCoord, this.yCoord, this.zCoord+1).getMaterial().isLiquid() && worldObj.getBlockMetadata((int)xCoord, (int)yCoord, (int)zCoord+1)!= 0){
				if(this.getBlockMetadata()!=3)worldObj.setBlockMetadataWithNotify((int)xCoord, (int)yCoord, (int)zCoord, 3,2);
				blockMaterial = this.worldObj.getBlock(this.xCoord, this.yCoord, this.zCoord+1).getMaterial();
				dir = 0;
				if(blockMaterial!=blockMaterial.lava){
					setWaterDir((int) dir);
					this.energy.receiveEnergy(5, false);
				}

			}else if(blockTop instanceof BlockLiquid && this.worldObj.getBlock(this.xCoord, this.yCoord+1, this.zCoord).getMaterial().isLiquid()&&worldObj.getBlockMetadata((int)xCoord, (int)yCoord+1, (int)zCoord)!= 0){
				blockMaterial = this.worldObj.getBlock(this.xCoord, this.yCoord+1, this.zCoord).getMaterial();
				dir = BlockLiquid.getFlowDirection(this.worldObj,this.xCoord, this.yCoord+1, this.zCoord,blockMaterial);
				if(blockMaterial!=blockMaterial.lava){
					setWaterDir((int) dir);
					this.energy.receiveEnergy(5, false);
				}

			}else if(blockBottom instanceof BlockLiquid && this.worldObj.getBlock(this.xCoord, this.yCoord-1, this.zCoord).getMaterial().isLiquid() &&worldObj.getBlockMetadata((int)xCoord, (int)yCoord-1, (int)zCoord)!= 0){
				blockMaterial = this.worldObj.getBlock(this.xCoord, this.yCoord-1, this.zCoord).getMaterial();
				dir = BlockLiquid.getFlowDirection(this.worldObj,this.xCoord, this.yCoord-1, this.zCoord,blockMaterial);

				if((int)dir == -3||(int)dir==-2){
					dir=0;
				}else if((int)dir == 0){
					dir=-3;
				}else if((int)dir==-1){
					dir=1;
				}else if((int)dir==1){
					dir=-1;
				}
				if(blockMaterial!=blockMaterial.lava){
					setWaterDir((int) dir);
					this.energy.receiveEnergy(5, false);
				}
			} else {
				setWaterDir(-1001);
			}

			switch (this.getWaterDir()) {

			case -3:
			case -2:
				if (this.getBlockMetadata() != 1) {
					this.worldObj.setBlockMetadataWithNotify(this.xCoord, this.yCoord, this.zCoord, 1, 2);
				}
				break;

			case -1:
				if (this.getBlockMetadata() != 2) {
					this.worldObj.setBlockMetadataWithNotify(this.xCoord, this.yCoord, this.zCoord, 2, 2);
				}
				break;

			case 0:
				if (this.getBlockMetadata() != 3) {
					this.worldObj.setBlockMetadataWithNotify(this.xCoord, this.yCoord, this.zCoord, 3, 2);
				}
				break;

			case 1:
				if (this.getBlockMetadata() != 0) {
					this.worldObj.setBlockMetadataWithNotify(this.xCoord, this.yCoord, this.zCoord, 0, 2);
				}
				break;
			}



			if(!worldObj.isRemote){
				Energy.pushEnergy(this.worldObj, this.xCoord, this.yCoord, this.zCoord, false, new ForgeDirection[]{ForgeDirection.NORTH, ForgeDirection.SOUTH, ForgeDirection.EAST, ForgeDirection.WEST}, this.energy);
			}


			this.markDirty();
			this.worldObj.markBlockForUpdate(this.xCoord, this.yCoord, this.zCoord);
		}
	}

	private void setWaterDir(int i){
		waterDirection=i;
	}
	public int getWaterDir(){
		return waterDirection;
	}
	@Override
	public boolean canUpdate() {
		return true;
	}



	@Override
	public int extractEnergy(ForgeDirection from, int maxReceive, boolean simulate){
		return 10;
	}
	@Override
	public int getEnergyStored(ForgeDirection from){return 10;}
	@Override
	public int getMaxEnergyStored(ForgeDirection from){
		return this.getEnergyStored(from);
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
