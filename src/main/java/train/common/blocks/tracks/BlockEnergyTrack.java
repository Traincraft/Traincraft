/**
 * A track that provides energy to ElectricTrains
 * 
 * @author Spitfire4466
 */
package train.common.blocks.tracks;

import cpw.mods.fml.common.FMLCommonHandler;
import mods.railcraft.common.blocks.tracks.TileTrack;
import mods.railcraft.api.core.items.IToolCrowbar;
import mods.railcraft.api.tracks.ITrackPowered;
import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IIcon;
import train.common.library.Tracks;
import train.common.api.ElectricTrain;
import train.common.api.EntityRollingStock;
import train.common.core.handlers.ConfigHandler;
import cofh.api.energy.IEnergyHandler;
import cofh.api.energy.IEnergyProvider;
import cofh.api.energy.IEnergyReceiver;
import net.minecraftforge.common.util.ForgeDirection;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class BlockEnergyTrack extends TrackBaseTraincraft implements ITrackPowered, IEnergyHandler, IEnergyReceiver {
	private byte delay = 0;
	public double energy = 0;
	public int maxEnergy = 2000;
	public int maxInput = 1000;
	public int output = 500;
	private int transmitDistance=2;
	public boolean isProvider = false;
	public boolean addedToEnergyNet = false;
	private Block thisBlock;
	private int updateTicks = 0;
	protected boolean powered = false;
    private static ForgeDirection[] dirMap = new ForgeDirection[] {ForgeDirection.WEST, ForgeDirection.EAST, ForgeDirection.NORTH, ForgeDirection.SOUTH}; 
	
	public BlockEnergyTrack() {
		this.speedController = SpeedControllerSteel.getInstance();
	}

	@Override
	public Tracks getTrackType() {
		return Tracks.ENERGY_TRACK;
	}

	private Block getThisBlock() {
		if (thisBlock == null) {
			thisBlock = getWorld().getBlock(getX(), getY(), getZ());
		}
		return thisBlock;
	}
	public boolean isSimulating()
	{
		return !FMLCommonHandler.instance().getEffectiveSide().isClient();
	}
	
	@Override
	public void updateEntity() {
		if (getWorld().isRemote) {
			return;
		}
		updateTicks++;

        if(!ConfigHandler.ENERGYTRACK_USES_RF)
        {
		    if (isPowered() && updateTicks % 2==0) {
			    if(this.getEnergy()<this.getMaxEnergy())
				    this.energy++;
		    }
		    
            if (updateTicks % 50 == 0)
			    markBlockNeedsUpdate();

            return;
		}

        if(this.updateTicks % 10 == 0)
        {
           if(this.maxEnergy > this.energy)
             if(this.getWorld().getTileEntity(this.getX(),this.getY()-1, this.getZ()) instanceof IEnergyProvider)
             {
                this.receiveEnergy(ForgeDirection.UP,((IEnergyProvider)this.getWorld().getTileEntity(this.getX(),this.getY()-1, this.getZ())).extractEnergy(ForgeDirection.UP,100,false),false);
             }
           int x=this.getX();
           int y=this.getY();
           int z=this.getZ();
           int ener1 = 0;
           int ener2 = 0;
           for(int[] pos : new int[][] {{x-1,z,1},{x+1,z,0},{x,z-1,3},{x,z+1,2}})
             if(this.maxEnergy > this.energy)
             {
               if(this.getWorld().getTileEntity(pos[0],y, pos[1]) instanceof IEnergyProvider)
                 ener1 = ((IEnergyProvider)this.getWorld().getTileEntity(pos[0], y, pos[1])).extractEnergy(dirMap[pos[2]],100,false);
               if(this.getWorld().getTileEntity(pos[0],y-1, pos[1]) instanceof IEnergyProvider)
                 ener2 = ((IEnergyProvider)this.getWorld().getTileEntity(pos[0], y-1, pos[1])).extractEnergy(dirMap[pos[2]],100,false);
               this.receiveEnergy(ForgeDirection.UP,ener1+ener2,false);
             }
             else break;

           for(int[] pos : new int[][] {{x-1,z},{x+1,z},{x,z-1},{x,z+1}})
           {
               TileEntity te = (TileEntity)(this.getWorld().getTileEntity(pos[0],y, pos[1]));
               if(te != null && te instanceof TileTrack && ((TileTrack)te).getTrackInstance() instanceof BlockEnergyTrack)
                 if((int)((BlockEnergyTrack)((TileTrack)te).getTrackInstance()).energy - (int) this.energy > 1)
                 {
                    double diff = (((BlockEnergyTrack)((TileTrack)te).getTrackInstance()).energy - this.energy) / 2.0;
                    this.energy += diff;
                    ((BlockEnergyTrack)((TileTrack)te).getTrackInstance()).energy -= diff;
                 }
               te = (TileEntity)(this.getWorld().getTileEntity(pos[0],y-1, pos[1]));
               if(te != null && te instanceof TileTrack && ((TileTrack)te).getTrackInstance() instanceof BlockEnergyTrack)
                 if((int)((BlockEnergyTrack)((TileTrack)te).getTrackInstance()).energy - (int) this.energy > 1)
                 {
                    double diff = (((BlockEnergyTrack)((TileTrack)te).getTrackInstance()).energy - this.energy) / 2.0;
                    this.energy += diff;
                    ((BlockEnergyTrack)((TileTrack)te).getTrackInstance()).energy -= diff;
                 }
               te = (TileEntity)(this.getWorld().getTileEntity(pos[0],y+1, pos[1]));
               if(te != null && te instanceof TileTrack && ((TileTrack)te).getTrackInstance() instanceof BlockEnergyTrack)
                 if((int)((BlockEnergyTrack)((TileTrack)te).getTrackInstance()).energy - (int) this.energy > 1)
                 {
                    double diff = (((BlockEnergyTrack)((TileTrack)te).getTrackInstance()).energy - this.energy) / 2.0;
                    this.energy += diff;
                    ((BlockEnergyTrack)((TileTrack)te).getTrackInstance()).energy -= diff;
                 }
           }          
        }

		if (updateTicks % 50 == 0)
			markBlockNeedsUpdate();
	}

	@Override
	public IIcon getIcon() {
		int meta = this.tileEntity.getBlockMetadata();
		if (meta >= 6) {
			if (energy > 0)
				return getIcon(3);
			return getIcon(2);
		}
		if (energy > 0)
			return getIcon(1);
		return getIcon(0);
	}
	@Override
	public boolean isFlexibleRail() {
		return true;
	}

	private void notifyNeighbors() {
		Block block = getWorld().getBlock(getX(), getY(), getZ());
		getWorld().notifyBlocksOfNeighborChange(getX(), getY(), getZ(), block);
		getWorld().notifyBlocksOfNeighborChange(getX(), getY() - 1, getZ(), block);

		markBlockNeedsUpdate();
	}

	@Override
	public boolean blockActivated(EntityPlayer player) {
		if (getWorld().isRemote) {
			return false;
		}
		ItemStack current = player.getCurrentEquippedItem();
		
		if ((current != null) && ((current.getItem() instanceof IToolCrowbar))) {
			IToolCrowbar crowbar = (IToolCrowbar) current.getItem();
			player.addChatMessage(new ChatComponentText("stored: " + ((int)this.energy) + "/"+(int)this.getMaxEnergy()+" RF"));
			markBlockNeedsUpdate();
			crowbar.onWhack(player, current, getX(), getY(), getZ());
			sendUpdateToClient();
			return true;
		}

		return false;
	}
	@Override
	public void onMinecartPass(EntityMinecart cart) {
		if (!(cart instanceof ElectricTrain)) {
			return;
		}
		if ((this.energy > 20) && (((ElectricTrain) cart).fuelTrain) < (((ElectricTrain) cart).maxEnergy)) {
			double transfered = this.energy * 0.05;
			(((EntityRollingStock) cart).fuelTrain) += transfered;
			this.energy -= transfered;
		}
	}

	@Override
	public boolean canUpdate() {
		return true;
	}
	@Override
	public void writeToNBT(NBTTagCompound nbttagcompound) {
		super.writeToNBT(nbttagcompound);
		nbttagcompound.setDouble("energy", energy);
		nbttagcompound.setBoolean("powered", this.powered);
	}
	@Override
	public void readFromNBT(NBTTagCompound nbttagcompound) {
		super.readFromNBT(nbttagcompound);
		this.energy = nbttagcompound.getDouble("energy");
		this.powered = nbttagcompound.getBoolean("powered");
	}
	@Override
	public void writePacketData(DataOutputStream data) throws IOException {
		super.writePacketData(data);
		data.writeDouble(this.energy);
		data.writeBoolean(this.powered);
	}
	@Override
	public void readPacketData(DataInputStream data) throws IOException {
		super.readPacketData(data);
		this.energy = data.readDouble();
		this.powered = data.readBoolean();
		markBlockNeedsUpdate();
	}

	@Override
	public boolean isPowered() {
		return this.powered;
	}
	@Override
	public void setPowered(boolean powered) {
		this.powered = powered;
	}
	@Override
	public int getPowerPropagation(){
		return this.transmitDistance;
	}

	public double getEnergy() {
		return this.energy;
	}

	public double getMaxEnergy() {
		return this.maxEnergy;
	}

	public void setEnergy(double joules) {
		this.energy = (int) Math.max(Math.min(joules, getMaxEnergy()), 0.0D);
	}
	
 
    /* ------------------------------------------------------------------------------------
     * -                                IEnergyHandler                                    -
     * ------------------------------------------------------------------------------------ 
 
                            TheBlueCrystal Addition to receive real RF Power
     */
 
    public boolean canConnectEnergy(ForgeDirection from)
    {
        return true;
    }
 
    public int receiveEnergy(ForgeDirection dir, int ammount, boolean simulate)
    {
        if(this.maxEnergy > this.energy)
        {
            if(this.maxEnergy-this.energy >= ammount)
            {
                 if(!simulate) this.energy += (double)ammount;
                 return ammount;
            }
            else
            {
                 int div = (int) (this.maxEnergy - this.energy);
                 if(!simulate) this.energy = this.maxEnergy;
                 return div;
            }
        }
        else
        return 0;
    }
 
    public int extractEnergy(ForgeDirection dir, int ammount, boolean simulate)
    {
        if(this.energy >= ammount)
        {
            if(!simulate) this.energy -= ammount;
            return ammount;
        }
        else
        {
            int div = (int) this.energy;
            if(!simulate) this.energy = 0.0D;
            return div;
        }
    }
 
    public int getEnergyStored(ForgeDirection dir)
    {
        return (int) this.energy;
    }
 
    public int getMaxEnergyStored(ForgeDirection dir)
    {
        return this.maxEnergy;
    }
 
}
