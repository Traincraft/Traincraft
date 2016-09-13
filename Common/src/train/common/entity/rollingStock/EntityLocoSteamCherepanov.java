package src.train.common.entity.rollingStock;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import src.train.common.Traincraft;
import src.train.common.api.LiquidManager;
import src.train.common.api.SteamTrain;
import src.train.common.library.EnumTrains;
import src.train.common.library.GuiIDs;

public class EntityLocoSteamCherepanov extends SteamTrain {
	public EntityLocoSteamCherepanov(World world) {
		super(world, 0, 0, EnumTrains.locoSteamCherepanov.getTankCapacity(), LiquidManager.WATER_FILTER);
		initLocoSteam();
	}

	public void initLocoSteam() {
		fuelTrain = 0;
		locoInvent = new ItemStack[inventorySize];
	}

	public EntityLocoSteamCherepanov(World world, double d, double d1, double d2) {
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
		riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset() + 0.354, posZ);
	}

	@Override
	public int getSizeInventory() {
		return inventorySize;
	}

	@Override
	public void setDead() {
		super.setDead();
		isDead = true;
		if (worldObj.isRemote) {
			return;
		}
		label0: for (int i = 0; i < getSizeInventory(); i++) {
			ItemStack itemstack = getStackInSlot(i);//
			if (itemstack == null) {
				continue;
			}
			float f = rand.nextFloat() * 0.8F + 0.1F;
			float f1 = rand.nextFloat() * 0.8F + 0.1F;
			float f2 = rand.nextFloat() * 0.8F + 0.1F;
			do {
				if (itemstack.stackSize <= 0) {
					continue label0;
				}
				int j = rand.nextInt(21) + 10;
				if (j > itemstack.stackSize) {
					j = itemstack.stackSize;
				}
				itemstack.stackSize -= j;
				EntityItem entityitem = new EntityItem(worldObj, posX + (double) f, posY + (double) f1, posZ + (double) f2, new ItemStack(itemstack.itemID, j, itemstack.getItemDamage()));
				float f3 = 0.05F;
				entityitem.motionX = (float) rand.nextGaussian() * f3;
				entityitem.motionY = (float) rand.nextGaussian() * f3 + 0.2F;
				entityitem.motionZ = (float) rand.nextGaussian() * f3;
				worldObj.spawnEntityInWorld(entityitem);
			} while (true);
		}
	}
	@Override
	public void pressKey(int i) {
		if (i == 7 && riddenByEntity != null && riddenByEntity instanceof EntityPlayer) {
			((EntityPlayer) riddenByEntity).openGui(Traincraft.instance, GuiIDs.LOCO, worldObj, (int) this.posX, (int) this.posY, (int) this.posZ);
		}
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		checkInvent(locoInvent[0], locoInvent[1], this);
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
		NBTTagList nbttaglist = nbttagcompound.getTagList("Items");
		locoInvent = new ItemStack[getSizeInventory()];
		for (int i = 0; i < nbttaglist.tagCount(); i++) {
			NBTTagCompound nbttagcompound1 = (NBTTagCompound) nbttaglist.tagAt(i);
			int j = nbttagcompound1.getByte("Slot") & 0xff;
			if (j >= 0 && j < locoInvent.length) {
				locoInvent[j] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
			}
		}
	}

	@Override
	public String getInvName() {
		return "Cherepanov";
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
			if (!worldObj.isRemote) {
				entityplayer.mountEntity(this);
			}
		}
		return true;
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		float dist = 0.5F;
		return (dist);
	}

	@Override
	public boolean canBeAdjusted(EntityMinecart cart) {
		return canBeAdjusted;
	}

	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack) {
		return true;
	}

}