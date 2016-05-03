package src.train.common.tile;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.Packet;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import src.train.common.blocks.BlockOpenHearthFurnace;
import src.train.common.core.handlers.PacketHandler;
import src.train.common.library.BlockIDs;
import src.train.common.library.ItemIDs;
import src.train.common.recipes.OpenHearthFurnaceRecipes;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import cpw.mods.fml.common.FMLCommonHandler;

public class TileEntityOpenHearthFurnace extends TileEntity implements IInventory {

	public ItemStack furnaceItemStacks[];
	private ForgeDirection facing;
	public int furnaceBurnTime;
	public int currentItemBurnTime;
	public int furnaceCookTime;
	private int cookDuration;
	private Random random;

	public TileEntityOpenHearthFurnace() {
		furnaceItemStacks = new ItemStack[4];
		furnaceBurnTime = 0;
		currentItemBurnTime = 0;
		furnaceCookTime = 0;
		cookDuration = 600;//default is 200
		random = new Random();
	}

	@Override
	public int getSizeInventory() {
		return furnaceItemStacks.length;
	}

	@Override
	public ItemStack getStackInSlot(int i) {
		return furnaceItemStacks[i];
	}

	@Override
	public ItemStack decrStackSize(int i, int j) {
		if (furnaceItemStacks[i] != null) {
			if (furnaceItemStacks[i].stackSize <= j) {
				ItemStack itemstack = furnaceItemStacks[i];
				furnaceItemStacks[i] = null;
				return itemstack;
			}
			ItemStack itemstack1 = furnaceItemStacks[i].splitStack(j);
			if (furnaceItemStacks[i].stackSize == 0) {
				furnaceItemStacks[i] = null;
			}
			return itemstack1;
		}
		else {
			return null;
		}
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int par1) {
		if (this.furnaceItemStacks[par1] != null) {
			ItemStack var2 = this.furnaceItemStacks[par1];
			this.furnaceItemStacks[par1] = null;
			return var2;
		}
		else {
			return null;
		}
	}

	@Override
	public void setInventorySlotContents(int i, ItemStack itemstack) {
		furnaceItemStacks[i] = itemstack;
		if (itemstack != null && itemstack.stackSize > getInventoryStackLimit()) {
			itemstack.stackSize = getInventoryStackLimit();
		}
	}

	@Override
	public String getInventoryName() {
		return "Open Hearth Furnace";
	}

	@Override
	public void readFromNBT(NBTTagCompound nbtTag) {
		super.readFromNBT(nbtTag);
		facing = ForgeDirection.getOrientation(nbtTag.getByte("Orientation"));
		NBTTagList nbttaglist = nbtTag.getTagList("Items");
		furnaceItemStacks = new ItemStack[getSizeInventory()];
		for (int i = 0; i < nbttaglist.tagCount(); i++) {
			NBTTagCompound nbttagcompound1 = (NBTTagCompound) nbttaglist.tagAt(i);
			byte byte0 = nbttagcompound1.getByte("Slot");
			if (byte0 >= 0 && byte0 < furnaceItemStacks.length) {
				this.furnaceItemStacks[byte0] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
			}
		}
		furnaceBurnTime = nbtTag.getShort("BurnTime");
		furnaceCookTime = nbtTag.getShort("CookTime");
		currentItemBurnTime = getItemBurnTime(furnaceItemStacks[3]);
	}

	@Override
	public void writeToNBT(NBTTagCompound nbtTag) {
		super.writeToNBT(nbtTag);
		nbtTag.setByte("Orientation", (byte) facing.ordinal());
		nbtTag.setShort("BurnTime", (short) furnaceBurnTime);
		nbtTag.setShort("CookTime", (short) furnaceCookTime);
		NBTTagList nbttaglist = new NBTTagList();
		for (int i = 0; i < this.furnaceItemStacks.length; i++) {
			if (this.furnaceItemStacks[i] != null) {
				NBTTagCompound nbttagcompound1 = new NBTTagCompound();
				nbttagcompound1.setByte("Slot", (byte) i);
				this.furnaceItemStacks[i].writeToNBT(nbttagcompound1);
				nbttaglist.appendTag(nbttagcompound1);
			}
		}
		nbtTag.setTag("Items", nbttaglist);
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@SideOnly(Side.CLIENT)
	public int getCookProgressScaled(int i) {
		return (furnaceCookTime * i) / cookDuration;
	}

	@SideOnly(Side.CLIENT)
	public int getBurnTimeRemainingScaled(int i) {
		if (currentItemBurnTime == 0) {
			currentItemBurnTime = cookDuration;
		}
		return (furnaceBurnTime * i) / currentItemBurnTime;
	}

	public boolean isBurning() {
		return furnaceBurnTime > 0;
	}

	@Override
	public void updateEntity() {
		boolean flag = furnaceBurnTime > 0;
		boolean flag1 = false;
		cookDuration = OpenHearthFurnaceRecipes.smelting().getCookTime(furnaceItemStacks[0], furnaceItemStacks[1]);
		if (furnaceBurnTime > 0) {
			furnaceBurnTime--;
		}
		if (!worldObj.isRemote) {
			if (furnaceBurnTime == 0 && canSmelt()) {
				if (furnaceItemStacks[2] != null) {
					currentItemBurnTime = furnaceBurnTime = getItemBurnTime(furnaceItemStacks[2]);
					if (furnaceBurnTime > 0) {
						flag1 = true;
						if (furnaceItemStacks[2].getItem().hasContainerItem()) {
							furnaceItemStacks[2] = new ItemStack(furnaceItemStacks[2].getItem().getContainerItem());
						}
						else {
							furnaceItemStacks[2].stackSize--;
						}
						if (furnaceItemStacks[2].stackSize == 0) {
							furnaceItemStacks[2] = null;
						}
					}
				}
			}
			if (isBurning() && canSmelt()) {
				furnaceCookTime++;
				if (furnaceCookTime == cookDuration) {
					furnaceCookTime = 0;
					smeltItem();
					flag1 = true;
				}
			}
			else {
				furnaceCookTime = 0;
			}
			if (flag != (furnaceBurnTime > 0)) {
				flag1 = true;

				BlockOpenHearthFurnace.updateHearthFurnaceBlockState(furnaceBurnTime > 0, worldObj, xCoord, yCoord, zCoord, random);

			}

		}
		Side side = FMLCommonHandler.instance().getEffectiveSide();
		if (side == Side.CLIENT) {
			if (furnaceBurnTime > 0) {
				smoke(worldObj, xCoord, yCoord, zCoord, random);
			}
		}
		if (flag1) {
			onInventoryChanged();
		}
	}

	@SideOnly(Side.CLIENT)
	private void smoke(World world, int i, int j, int k, Random random) {
		ForgeDirection side = this.getFacing();
		float var7 = (float) i + 0.5F;
		float var8 = (float) j + 0.0F + random.nextFloat() * 6.0F / 16.0F;
		float var9 = (float) k + 0.5F;
		float var10 = 0.52F;
		float var11 = random.nextFloat() * 0.6F - 0.3F;
		float f3 = 0.009F;
		double gaussian = random.nextGaussian() * f3;
		for (int t = 0; t < 50; t++) {
			world.spawnParticle("smoke", var7, (double) j + 1.2F, var9, (double) gaussian, (double) gaussian * 0.002F, (double) gaussian);
		}
		world.spawnParticle("flame", var7, (double) j + 1.03F, var9, 0, 0, 0);
		world.spawnParticle("flame", var7 + 0.06, (double) j + 1.03F, var9 + 0.06, 0, 0, 0);
		world.spawnParticle("flame", var7 - 0.06, (double) j + 1.03F, var9 - 0.06, 0, 0, 0);
		world.spawnParticle("flame", var7 + 0.06, (double) j + 1.03F, var9 - 0.06, 0, 0, 0);
		world.spawnParticle("flame", var7 - 0.06, (double) j + 1.03F, var9 + 0.06, 0, 0, 0);
	}

	private boolean canSmelt() {
		if (furnaceItemStacks[0] == null) {
			return false;
		}
		if (furnaceItemStacks[1] == null) {//second input slot
			return false;
		}
		ItemStack itemstack = OpenHearthFurnaceRecipes.smelting().getSmeltingResultFromItem1(Item.getIdFromItem(furnaceItemStacks[0].getItem()));
		if (!OpenHearthFurnaceRecipes.smelting().areItemPartOfRecipe(furnaceItemStacks[0].copy(), furnaceItemStacks[1].copy())) {//second input slot
			return false;
		}
		if (furnaceItemStacks[3] == null) {
			return true;
		}
		if (!furnaceItemStacks[3].isItemEqual(itemstack)) {
			return false;
		}
		return furnaceItemStacks[3].stackSize < itemstack.getMaxStackSize();
	}

	public void smeltItem() {
		if (!canSmelt()) {
			return;
		}
		ItemStack itemstack = OpenHearthFurnaceRecipes.smelting().getSmeltingResultFromItem1(Item.getIdFromItem(furnaceItemStacks[0].getItem()));
		if (furnaceItemStacks[3] == null) {
			furnaceItemStacks[3] = itemstack.copy();

		}
		else if (furnaceItemStacks[3].getItem() == itemstack.getItem()) {
			furnaceItemStacks[3].stackSize += itemstack.stackSize;

		}
		if (furnaceItemStacks[0].getItem().hasContainerItem()) {
			furnaceItemStacks[0] = new ItemStack(furnaceItemStacks[0].getItem().getContainerItem());
		}
		else {
			furnaceItemStacks[0].stackSize--;
		}
		if (furnaceItemStacks[0].stackSize <= 0) {
			furnaceItemStacks[0] = null;
		}

		if (furnaceItemStacks[1].getItem().hasContainerItem()) {
			furnaceItemStacks[1] = new ItemStack(furnaceItemStacks[1].getItem().getContainerItem());
		}
		else {
			furnaceItemStacks[1].stackSize--;
		}
		if (furnaceItemStacks[1].stackSize <= 0) {
			furnaceItemStacks[1] = null;
		}
	}

	private int getItemBurnTime(ItemStack it) {
		if (it == null) {
			return 0;
		}
		Item var1 = it.getItem();
		if (var1 < 256 && Block.blocksList[var1].blockMaterial == Material.wood)
			return 300;
		else if (var1 == Item.itemRegistry.getObject("stick"))
			return 100;
		else if (var1 == Item.itemRegistry.getObject("coal"))
			return 2600;
		else if (var1 == Item.itemRegistry.getObject("bucketLava"))
			return 20000;
		else if (var1 == Block.sapling.blockID)
			return 100;
		else if (var1 == Item.itemRegistry.getObject("blazeRod"))
			return 2500;
		else if (var1 == BlockIDs.oreTC.blockID && it.getItemDamage() == 1)
			return 2500;
		else if (var1 == BlockIDs.oreTC.blockID && it.getItemDamage() == 2)
			return 2500;
		else if (var1 == ItemIDs.diesel.itemID)
			return 4000;
		else if (var1 == ItemIDs.refinedFuel.itemID)
			return 6000;
		int ret = GameRegistry.getFuelValue(it);
		return ret;

	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer entityplayer) {
		if (worldObj == null) {
			return true;
		}
		if (worldObj.getTileEntity(xCoord, yCoord, zCoord) != this) {
			return false;
		}
		return entityplayer.getDistanceSq(xCoord + 0.5D, yCoord + 0.5D, zCoord + 0.5D) <= 64D;
	}

	public ForgeDirection getFacing() {
		if(facing!=null)return this.facing;
		return ForgeDirection.NORTH;
	}

	public void setFacing(ForgeDirection face) {
		this.facing = face;
	}

	@Override
	public void openInventory() {}

	@Override
	public void closeInventory() {}

	@Override
	public Packet getDescriptionPacket() {
		return PacketHandler.getTEPClient(this);
	}

	public void handlePacketDataFromServer(byte orientation, short cookTime, short burnTime) {
		facing = ForgeDirection.getOrientation(orientation);
		furnaceBurnTime = (int) burnTime;
		furnaceCookTime = (int) cookTime;
	}

	@Override
	public boolean hasCustomInventoryName() {
		return false;
	}

	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack) {
		return true;
	}
}
