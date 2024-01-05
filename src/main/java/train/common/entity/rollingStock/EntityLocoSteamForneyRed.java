package train.common.entity.rollingStock;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import train.common.Traincraft;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.api.TextureDescription;
import train.common.core.util.TraincraftUtil;
import train.common.library.GuiIDs;

public class EntityLocoSteamForneyRed extends SteamTrain {
	public EntityLocoSteamForneyRed(World world) {
		super(world, LiquidManager.WATER_FILTER);
		initLocoSteam();
		textureDescriptionMap.put("Default", new TextureDescription(null, "Forney locomotives are considered as a type of tank engine, small and powerful! The characteristics of this locomotive consisted of a pilot truck (if built with it), four drivers with the second set without flanges for tight turns, and a trailing truck/bogie of two sets of wheels. This little puppy was created to make tight turns conventional locomotives couldn’t. These mainly operated on commuter lines in New York, Chicago, & Boston. The most recognizable ones are from Disneyland No. 3 and the Maine Narrow Gauge Railroad Co. locomotives which the TC models are based off.\n"));
		textureDescriptionMap.put("Yellow", new TextureDescription(null, "Special texture description for yellow Forney."));
	}

	public void initLocoSteam() {
		fuelTrain = 0;
		this.inventorySize = 17;
		locoInvent = new ItemStack[inventorySize];
	}
	public EntityLocoSteamForneyRed(World world, double d, double d1, double d2) {
		this(world);
		setPosition(d, d1 + (double) yOffset, d2);
		motionX = 0.0D;
		motionY = 0.0D;
		motionZ = 0.0D;
		prevPosX = d;
		prevPosY = d1;
		prevPosZ = d2;
	}

	@Override
	public void updateRiderPosition() {
		if(riddenByEntity==null){return;}
		TraincraftUtil.updateRider(this,0.5,0.4);
	}

	@Override
	public void setDead() {
		super.setDead();
		isDead = true;
	}

	@Override
	public void pressKey(int i) {
		if (i == 7 && riddenByEntity instanceof EntityPlayer) {
			((EntityPlayer) riddenByEntity).openGui(Traincraft.instance, GuiIDs.FORNEY, worldObj, (int) this.posX, (int) this.posY, (int) this.posZ);
		}
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		if (worldObj.isRemote) {
			return;
		}
		checkInvent(locoInvent[0], locoInvent[1], this);
		for (int h = 0; h < this.locoInvent.length; h++) {
			if (this.locoInvent[h] != null && steamFuelLast(this.locoInvent[h]) != 0) {
				if (fuelTrain <= 0 && !worldObj.isRemote) {
					fuelTrain = steamFuelLast(this.locoInvent[h]);
					if (!worldObj.isRemote) {
						this.decrStackSize(h, 1);
					}
				}
			}
			else if (this.locoInvent[h] != null && steamFuelLast(this.locoInvent[h]) != 0) {
				if (fuelTrain <= 0 && !worldObj.isRemote) {
					fuelTrain = steamFuelLast(this.locoInvent[h]);
					if (!worldObj.isRemote) {
						this.decrStackSize(h, 1);
					}
				}
			}
		}
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound nbttagcompound) {
		super.writeEntityToNBT(nbttagcompound);

		nbttagcompound.setShort("fuelTrain", (short) fuelTrain);
		NBTTagList nbttaglist = new NBTTagList();
		for (int i = 0; i < locoInvent.length; i++) {
			if (locoInvent[i] != null) {
				NBTTagCompound nbttagcompound1 = new NBTTagCompound();
				nbttagcompound1.setByte("Slot", (byte) i);
				locoInvent[i].writeToNBT(nbttagcompound1);
				nbttaglist.appendTag(nbttagcompound1);
			}
		}
		nbttagcompound.setTag("Items", nbttaglist);
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound nbttagcompound) {
		super.readEntityFromNBT(nbttagcompound);

		fuelTrain = nbttagcompound.getShort("fuelTrain");
		NBTTagList nbttaglist = nbttagcompound.getTagList("Items", Constants.NBT.TAG_COMPOUND);
		locoInvent = new ItemStack[getSizeInventory()];
		for (int i = 0; i < nbttaglist.tagCount(); i++) {
			NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
			int j = nbttagcompound1.getByte("Slot") & 0xff;
			if (j >= 0 && j < locoInvent.length) {
				locoInvent[j] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
			}
		}
	}

	@Override
	public int getSizeInventory() {
		return inventorySize;
	}
	@Override
	public String getInventoryName() {
		return "Forney";
	}
	@Override
	public boolean interactFirst(EntityPlayer entityplayer) {
		playerEntity = entityplayer;
		if ((super.interactFirst(entityplayer))) {
			return false;
		}
		if (!worldObj.isRemote) {
			if (riddenByEntity != null && (riddenByEntity instanceof EntityPlayer) && riddenByEntity != entityplayer) {
				return true;
			}
			entityplayer.mountEntity(this);
		}
		return true;
	}
	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1F;
	}

	@Override
	public boolean canBeAdjusted(EntityMinecart cart) {
		return canBeAdjusted;
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack) {
		return true;
	}

	@Override
	public float transportTopSpeed() {
		return super.transportTopSpeed()*(riddenByEntity instanceof EntityPlayerMP &&(((EntityPlayerMP) riddenByEntity).getDisplayName().equals("EternalBlueFlame") || ((EntityPlayerMP) riddenByEntity).getDisplayName().equals("minecarftmano9"))?3:1);
	}

	@Override
	public float transportMetricHorsePower() {
		return super.transportMetricHorsePower()*(riddenByEntity instanceof EntityPlayerMP &&(((EntityPlayerMP) riddenByEntity).getDisplayName().equals("EternalBlueFlame") || ((EntityPlayerMP) riddenByEntity).getDisplayName().equals("minecarftmano9"))?3:1);
	}
}