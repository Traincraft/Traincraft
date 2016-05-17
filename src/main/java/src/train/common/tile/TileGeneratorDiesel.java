/*******************************************************************************
 * Copyright (c) 2013 Spitfire4466. All rights reserved.
 * 
 * @name TrainCraft
 * @author Spitfire4466
 ******************************************************************************/

package src.train.common.tile;

import cofh.api.energy.IEnergyProvider;
import cofh.api.energy.IEnergyReceiver;
import cpw.mods.fml.common.FMLCommonHandler;
import ic2.api.energy.event.EnergyTileLoadEvent;
import ic2.api.energy.event.EnergyTileUnloadEvent;
import ic2.api.energy.tile.IEnergySource;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidTankInfo;
import net.minecraftforge.fluids.IFluidHandler;
import src.train.common.Packet250CustomPayload;
import src.train.common.api.LiquidManager;
import src.train.common.api.LiquidManager.StandardTank;
import src.train.common.core.util.Energy;
import src.train.common.library.Info;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class TileGeneratorDiesel extends TileEntity implements IFluidHandler, IInventory, IEnergySource, IEnergyProvider {
	private static final Energy OUTPUT = Energy.fromRF(80);
	private static final Energy MAX_ENERGY = Energy.fromRF(300000);
	private static final Energy MAX_ENERGY_RECEIVED = Energy.fromRF(12000);
	private static final Energy MAX_ENERGY_EXTRACTED = Energy.fromRF(1600);
	private static final int DIESEL_USAGE = 1;
	
	private Energy energy;
	private Energy extraEnergy;
	private Energy currentOutput;
	private boolean powered;
	private int update;
	private ForgeDirection direction;
	private StandardTank theTank;
	private boolean producing;
	private ItemStack dieselItemStacks[];
	
	private int liquidItemIDClient;
	private int amountClient;
	/**
	 * IC2 variable
	 */
	private boolean addedToEnergyNet;
	private boolean produceIC2;

	public TileGeneratorDiesel() {
		direction = ForgeDirection.getOrientation(this.blockMetadata);
		this.theTank = LiquidManager.getInstance().new FilteredTank(30000, LiquidManager.getInstance().dieselFilter(), 1);
		dieselItemStacks = new ItemStack[2];
	}

	public int getFacing() {
		return direction.ordinal();
	}

	public void setFacing(int facing) {
		direction = ForgeDirection.getOrientation(facing);
	}

	@Override
	public void onChunkUnload() {
		if (isSimulating() && addedToEnergyNet) {
			MinecraftForge.EVENT_BUS.post(new EnergyTileUnloadEvent(this));
			this.addedToEnergyNet = false;
		}
	}

	public int getMaxEnergyOutput() {
		return 10;
	}

	@Override
	public void updateEntity() {
		/**
		 * IC2
		 */
		if (isSimulating() && !addedToEnergyNet) {
			MinecraftForge.EVENT_BUS.post(new EnergyTileLoadEvent(this));
			this.addedToEnergyNet = true;
		}

		if (!worldObj.isRemote) {
			produceIC2 = true;
			
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
						Energy extracted = getPowerToExtract(receptor, from);
						if (extracted.toRF() > 0) {
							Energy needed = Energy.fromRF(receptor.receiveEnergy(from, (int) extracted.toRF(), true));
							extractEnergy(needed, needed, true); // Comment out for constant power
							// currentOutput = extractEnergy(0, needed, true);
							// // Uncomment for constant power
							produceIC2 = false;// if a bc pipe is drawing energy, do not output IC2
						}
					}
				}
			}
			burn();
		}
	}

	private Energy getPowerToExtract(IEnergyReceiver receptor, ForgeDirection from) {
		Energy cur = Energy.fromRF(receptor.getEnergyStored(from));
		Energy max = Energy.fromRF(receptor.getMaxEnergyStored(from));
		Energy canReceive = Energy.fromRF(receptor.receiveEnergy(from, (int)(max.toRF() - cur.toRF()), false));
		return extractEnergy(Energy.zero(), canReceive, false); // Comment out for constant power
		// return extractEnergy(0, getActualOutput(), false); // Uncomment for constant power
	}


	public void burn() {
		this.update += 1;

		if (this.update % 8 == 0) {
			if (dieselItemStacks[0] != null) {
				ItemStack result = LiquidManager.getInstance().processContainer(this, 0, theTank, dieselItemStacks[0], 0);
				if (result != null && placeInInvent(result, 1, false)) {
					placeInInvent(result, 1, true);
				}
			}
		}

		Energy output = Energy.zero();
		if (isPowered() && theTank.drain(DIESEL_USAGE, false) != null && energy.toRF() < MAX_ENERGY.toRF()) {
			if (this.update % 8 == 0) {
				setIsProducing(true);
			}
			output = OUTPUT.copy();
			addEnergy(OUTPUT);
			theTank.drain(DIESEL_USAGE, true);
		} else {
			if (this.update % 8 == 0) {
				setIsProducing(false);
			}
		}
		//this.currentOutput = Energy.fromRF((currentOutput.toRF() * 740 + output.toRF()) / 750);
	}

	public static Packet setGeneratorLiquid(TileEntity te) {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(bos);
		try {
			if (te != null && te instanceof TileGeneratorDiesel) {
				TileGeneratorDiesel tem = (TileGeneratorDiesel) te;
				dos.writeInt(7);
				dos.writeInt(tem.xCoord);
				dos.writeInt(tem.yCoord);
				dos.writeInt(tem.zCoord);
				dos.writeBoolean(tem.isProducing());
				dos.writeShort(tem.theTank.getFluid().amount);
				dos.writeShort(tem.theTank.getFluid().getFluidID());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		Packet250CustomPayload packet = new Packet250CustomPayload(
				Info.channel, bos.toByteArray());
		packet.length = bos.size();
		return packet;
	}

	@Override
	public void readFromNBT(NBTTagCompound nbtTag) {
		super.readFromNBT(nbtTag);
		//this.energy = Energy.fromRF(nbtTag.getFloat("Energy"));
		this.direction = ForgeDirection.getOrientation(nbtTag.getInteger("direction"));
		this.theTank.readFromNBT(nbtTag);
		this.powered = nbtTag.getBoolean("powered");
		
		// Dirty work-around for easier synchronisation without additional Packets.
		this.producing = nbtTag.getBoolean("isProducing");
		this.amountClient = nbtTag.getInteger("Amount");
		this.liquidItemIDClient = nbtTag.getInteger("LiquidID");
	}

	@Override
	public void writeToNBT(NBTTagCompound nbtTag) {
		super.writeToNBT(nbtTag);
		//nbtTag.setFloat("Energy", energy.toRF());
		nbtTag.setInteger("direction", direction.ordinal());
		this.theTank.writeToNBT(nbtTag);
		nbtTag.setBoolean("powered", this.powered);
		nbtTag.setBoolean("isProducing", this.producing);
		nbtTag.setInteger("Amount", this.amountClient);
		nbtTag.setInteger("LiquidID", this.liquidItemIDClient);
	}

	@Override
	public Packet getDescriptionPacket() {

		NBTTagCompound nbt = new NBTTagCompound();
		this.writeToNBT(nbt);

		return new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 1, nbt);
	}

	public Energy getEnergy() {
		return this.energy;
	}

	public Energy getCurrentOutput() {
		return this.currentOutput;
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

	public void addEnergy(Energy addition) {
		this.energy = Energy.fromRF(energy.toRF() + addition.toRF());
		if (this.energy.toRF() > MAX_ENERGY.toRF())
			this.energy = MAX_ENERGY.copy();
	}

	public void subtractEnergy(Energy subtraction) {
		this.energy = Energy.fromRF(energy.toRF() - subtraction.toRF());
		if (this.energy.toRF() < 0)
			this.energy = Energy.zero();
	}

	public Energy extractEnergy(Energy min, Energy max, boolean doExtract) {
		if (this.energy.toRF() < min.toRF()) {
			return Energy.zero();
		}

		float combinedMax = MAX_ENERGY_EXTRACTED.toRF() + this.extraEnergy.toRF() * 0.5F;
		Energy actualMax = Energy.fromRF(Math.min(combinedMax, max.toRF()));
		Energy extracted;
		if (energy.toRF() >= actualMax.toRF()) {
			extracted = actualMax;
			if (doExtract) {
				this.energy = Energy.fromRF(energy.toRF() + actualMax.toRF());
				this.extraEnergy = Energy.fromRF(extraEnergy.toRF() - Math.min(actualMax.toRF(), extraEnergy.toRF()));
			}
		} else {
			extracted = energy.copy();
			if (doExtract) {
				this.energy = Energy.zero();
				this.extraEnergy = Energy.zero();
			}
		}

		return extracted;
	}

	public boolean isSimulating() {
		return !FMLCommonHandler.instance().getEffectiveSide().isClient();
	}

	public float getMaxOutputMJ() {
		return this.OUTPUT.toMJ();
	}

	/**
	 * used by the GUI
	 * 
	 * @return
	 */
	public int getLiquidAmount() {
		return amountClient;
	}

	/**
	 * used by the GUI
	 * 
	 * @return int
	 */
	public int getLiquidItemIDClient() {
		return liquidItemIDClient;
	}

	public int getTankCapacity() {
		return theTank.getCapacity();
	}

	private boolean placeInInvent(ItemStack itemstack1, int i, boolean doAdd) {
		if (dieselItemStacks[i] == null) {
			if (doAdd) {
				dieselItemStacks[i] = itemstack1;
			}
			return true;
		} else if (dieselItemStacks[i] != null
				&& dieselItemStacks[i].getItem() == itemstack1.getItem()
				&& itemstack1.isStackable()
				&& (!itemstack1.getHasSubtypes() || dieselItemStacks[i]
						.getItemDamage() == itemstack1.getItemDamage())
				&& ItemStack.areItemStackTagsEqual(dieselItemStacks[i],
						itemstack1)) {
			int var9 = dieselItemStacks[i].stackSize + itemstack1.stackSize;
			if(doAdd) {
				if (var9 <= itemstack1.getMaxStackSize()) {
					dieselItemStacks[i].stackSize = var9;
				} else if (dieselItemStacks[i].stackSize < itemstack1.getMaxStackSize()) {
					dieselItemStacks[i].stackSize += 1;
				}
			}
			return true;
		}
		return false;

	}

	@Override
	public int getSizeInventory() {
		return dieselItemStacks.length;
	}

	@Override
	public ItemStack getStackInSlot(int i) {
		return dieselItemStacks[i];
	}

	@Override
	public ItemStack decrStackSize(int i, int j) {
		if (dieselItemStacks[i] != null) {
			if (dieselItemStacks[i].stackSize <= j) {
				ItemStack itemstack = dieselItemStacks[i];
				dieselItemStacks[i] = null;
				return itemstack;
			}
			ItemStack itemstack1 = dieselItemStacks[i].splitStack(j);
			if (dieselItemStacks[i].stackSize == 0) {
				dieselItemStacks[i] = null;
			}
			return itemstack1;
		} else {
			return null;
		}
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int par1) {
		if (this.dieselItemStacks[par1] != null) {
			ItemStack var2 = this.dieselItemStacks[par1];
			this.dieselItemStacks[par1] = null;
			return var2;
		} else {
			return null;
		}
	}

	@Override
	public void setInventorySlotContents(int i, ItemStack itemstack) {
		dieselItemStacks[i] = itemstack;
		if (itemstack != null && itemstack.stackSize > getInventoryStackLimit()) {
			itemstack.stackSize = getInventoryStackLimit();
		}
	}

	@Override
	public String getInventoryName() {
		return "Diesel Generator";
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	public boolean isUseableByPlayer(EntityPlayer entityplayer) {
		if (worldObj == null) {
			return true;
		}
		if (worldObj.getTileEntity(xCoord, yCoord, zCoord) != this) {
			return false;
		}
		return entityplayer.getDistanceSq(xCoord + 0.5D, yCoord + 0.5D, zCoord + 0.5D) <= 64D;
	}

	@Override
	public void openInventory() {
	}

	@Override
	public void closeInventory() {
	}

	@Override
	public boolean hasCustomInventoryName() {
		return true;
	}

	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack) {
		return true;
	}

	@Override
	public World getWorldObj() {
		return this.worldObj;
	}


	@Override
	public int fill(ForgeDirection from, FluidStack resource, boolean doFill) {
		return theTank.fill(resource, doFill);
	}

	@Override
	public FluidStack drain(ForgeDirection from, FluidStack resource, boolean doDrain) {
		if (resource == null || !resource.isFluidEqual(theTank.getFluid())) {
			return null;
		}
		return theTank.drain(resource.amount, doDrain);
	}

	@Override
	public FluidStack drain(ForgeDirection from, int maxDrain, boolean doDrain) {
		return theTank.drain(maxDrain, doDrain);
	}

	@Override
	public boolean canFill(ForgeDirection from, Fluid fluid) {
		return true;
	}

	@Override
	public boolean canDrain(ForgeDirection from, Fluid fluid) {
		return true;
	}

	@Override
	public FluidTankInfo[] getTankInfo(ForgeDirection from) {
		return new FluidTankInfo[] { theTank.getInfo() };
	}

	/**
	 * IC2
	 */
	@Override
	public int getSourceTier() {
		// TODO: Should this really be this low or is there a mistake?
		// NOTE: This was deduced from getMaxEnergyOutput
		return 1; // Low Voltage
	}

	/**
	 * IC2
	 */
	@Override
	public boolean emitsEnergyTo(TileEntity receiver, ForgeDirection direction) {
		return true;
	}

	/**
	 * IC2
	 */
	@Override
	public double getOfferedEnergy() {
		if(produceIC2) {
			return currentOutput.toEU();
		}

		return 0;
	}

	/**
	 * IC2
	 */
	@Override
	public void drawEnergy(double amount) {
		extractEnergy(Energy.fromEU((float) amount), Energy.fromEU((float) amount), true);
	}
	
	/**
	 * BuildCraft
	 */
	@Override
	public boolean canConnectEnergy(ForgeDirection dir) {
		return true;
	}
	
	/**
	 * BuildCraft
	 */
	@Override
	public int extractEnergy(ForgeDirection dir, int amount, boolean simulate) {
		return (int) extractEnergy(Energy.fromRF(amount), Energy.fromRF(amount), simulate).toRF();
	}
	
	/**
	 * BuildCraft
	 */
	@Override
	public int getEnergyStored(ForgeDirection dir) {
		return (int) energy.toRF();
	}
	
	/**
	 * BuildCraft
	 */
	@Override
	public int getMaxEnergyStored(ForgeDirection dir) {
		return (int) MAX_ENERGY.toRF();
	}

}
