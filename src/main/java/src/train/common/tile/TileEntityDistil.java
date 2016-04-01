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
import net.minecraft.network.packet.Packet;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidTankInfo;
import net.minecraftforge.fluids.IFluidHandler;
import net.minecraftforge.fluids.IFluidTank;
import src.train.common.api.LiquidManager;
import src.train.common.api.LiquidManager.StandardTank;
import src.train.common.blocks.BlockDistil;
import src.train.common.core.handlers.PacketHandler;
import src.train.common.library.BlockIDs;
import src.train.common.library.ItemIDs;
import src.train.common.recipes.DistilRecipes;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TileEntityDistil extends TileEntity implements IInventory, IFluidHandler {

	public ItemStack distilItemStacks[];
	private ForgeDirection facing;
	public int distilBurnTime;
	public int currentItemBurnTime;
	public int distilCookTime;
	private int cookDuration;
	private Random random;
	private int updateTicks;
	private int maxTank = 0;
	private StandardTank theTank;
	private IFluidTank[] tankArray = new IFluidTank[1];
	private FluidStack liquid;
	public int amount;
	public int liquidItemID;
	public Side side = FMLCommonHandler.instance().getEffectiveSide();

	public TileEntityDistil() {

		distilItemStacks = new ItemStack[5];
		distilBurnTime = 0;
		currentItemBurnTime = 0;
		distilCookTime = 0;
		cookDuration = 400;//default is 200
		random = new Random();
		this.liquid = new FluidStack(0, 0);
		this.maxTank = 30000;
		this.theTank = LiquidManager.getInstance().new FilteredTank(maxTank, LiquidManager.getInstance().dieselFilter(), 1);
		tankArray[0] = theTank;
	}

	/**
	 * used by the GUI
	 * 
	 * @return
	 */
	@SideOnly(Side.CLIENT)
	public int getLiquid() {
		//if(random.nextInt(30)==0)System.out.println(side +" GUI "+amount);
		return (amount);

	}

	/**
	 * used by the GUI
	 * 
	 * @return int
	 */
	@SideOnly(Side.CLIENT)
	public int getLiquidItemID() {
		return liquidItemID;
	}

	public StandardTank getTank() {
		return theTank;
	}

	@Override
	public int getSizeInventory() {
		return distilItemStacks.length;
	}

	@Override
	public ItemStack getStackInSlot(int i) {
		return distilItemStacks[i];
	}

	@Override
	public ItemStack decrStackSize(int i, int j) {
		if (distilItemStacks[i] != null) {
			if (distilItemStacks[i].stackSize <= j) {
				ItemStack itemstack = distilItemStacks[i];
				distilItemStacks[i] = null;
				return itemstack;
			}
			ItemStack itemstack1 = distilItemStacks[i].splitStack(j);
			if (distilItemStacks[i].stackSize == 0) {
				distilItemStacks[i] = null;
			}
			return itemstack1;
		}
		else {
			return null;
		}
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int par1) {
		if (this.distilItemStacks[par1] != null) {
			ItemStack var2 = this.distilItemStacks[par1];
			this.distilItemStacks[par1] = null;
			return var2;
		}
		else {
			return null;
		}
	}

	@Override
	public void setInventorySlotContents(int i, ItemStack itemstack) {
		distilItemStacks[i] = itemstack;
		if (itemstack != null && itemstack.stackSize > getInventoryStackLimit()) {
			itemstack.stackSize = getInventoryStackLimit();
		}
	}

	@Override
	public String getInvName() {
		return "Distillation tower";
	}

	@Override
	public void readFromNBT(NBTTagCompound nbtTag) {
		super.readFromNBT(nbtTag);
		facing = ForgeDirection.getOrientation(nbtTag.getByte("Orientation"));
		NBTTagList nbttaglist = nbtTag.getTagList("Items");
		distilItemStacks = new ItemStack[getSizeInventory()];
		for (int i = 0; i < nbttaglist.tagCount(); i++) {
			NBTTagCompound nbttagcompound1 = (NBTTagCompound) nbttaglist.tagAt(i);
			byte byte0 = nbttagcompound1.getByte("Slot");
			if (byte0 >= 0 && byte0 < distilItemStacks.length) {
				this.distilItemStacks[byte0] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
			}
		}
		distilBurnTime = nbtTag.getShort("BurnTime");
		distilCookTime = nbtTag.getShort("CookTime");
		currentItemBurnTime = getItemBurnTime(distilItemStacks[1]);
		this.theTank.readFromNBT(nbtTag);
	}

	public int getTankCapacity() {

		return maxTank;
	}

	@Override
	public void writeToNBT(NBTTagCompound nbtTag) {
		super.writeToNBT(nbtTag);
		nbtTag.setByte("Orientation", (byte) facing.ordinal());
		nbtTag.setShort("BurnTime", (short) distilBurnTime);
		nbtTag.setShort("CookTime", (short) distilCookTime);
		NBTTagList nbttaglist = new NBTTagList();
		for (int i = 0; i < this.distilItemStacks.length; i++) {
			if (this.distilItemStacks[i] != null) {
				NBTTagCompound nbttagcompound1 = new NBTTagCompound();
				nbttagcompound1.setByte("Slot", (byte) i);
				this.distilItemStacks[i].writeToNBT(nbttagcompound1);
				nbttaglist.appendTag(nbttagcompound1);
			}
		}
		nbtTag.setTag("Items", nbttaglist);
		this.theTank.writeToNBT(nbtTag);
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@SideOnly(Side.CLIENT)
	public int getCookProgressScaled(int i) {
		return (distilCookTime * i) / cookDuration;
	}

	@SideOnly(Side.CLIENT)
	public int getBurnTimeRemainingScaled(int i) {
		if (currentItemBurnTime == 0) {
			currentItemBurnTime = cookDuration;
		}
		return (distilBurnTime * i) / currentItemBurnTime;
	}

	public boolean isBurning() {
		return distilBurnTime > 0;
	}

	@Override
	public void updateEntity() {
		updateTicks++;
		boolean flag = distilBurnTime > 0;
		boolean flag1 = false;
		if (distilBurnTime > 0) {
			distilBurnTime--;
		}
		//if(updateTicks%40==0)System.out.println(side +" "+amount);
		//if(updateTicks%40==0)System.out.println("amount3 " + amount +" "+ worldObj.isRemote);
		if (!worldObj.isRemote) {
			//if(updateTicks%40==0)this.onInventoryChanged();
			if (distilBurnTime == 0 && canSmelt()) {
				currentItemBurnTime = distilBurnTime = getItemBurnTime(distilItemStacks[1]);
				if (distilBurnTime > 0) {
					flag1 = true;
					if (distilItemStacks[1] != null) {
						if (distilItemStacks[1].getItem().hasContainerItem()) {
							distilItemStacks[1] = new ItemStack(distilItemStacks[1].getItem().getContainerItem());
						}
						else {
							distilItemStacks[1].stackSize--;
						}
						if (distilItemStacks[1].stackSize == 0) {
							distilItemStacks[1] = null;
						}
					}
				}
			}
			if (isBurning() && canSmelt()) {
				distilCookTime++;
				if (distilCookTime == cookDuration) {
					distilCookTime = 0;
					smeltItem();
					flag1 = true;
				}
			}
			else {
				distilCookTime = 0;
			}
			if (flag != (distilBurnTime > 0)) {
				flag1 = true;
				BlockDistil.updateDistilBlockState(distilBurnTime > 0, worldObj, xCoord, yCoord, zCoord);
			}
			if (distilItemStacks[2] != null) {
				if (this.updateTicks % 8 == 0) {
					ItemStack result = LiquidManager.getInstance().processContainer(this, 2, theTank, distilItemStacks[2], 0);
					if (result != null && placeInInvent(result, 4, false)) {
						placeInInvent(result, 4, true);
						if (theTank.getFluid() != null) {
							amount = theTank.getFluid().amount;
						}
						else {
							amount = 0;
						}
						if (theTank.getFluid() != null) {
							liquidItemID = theTank.getFluid().fluidID;
						}
						else {
							liquidItemID = 0;
						}
						flag1 = true;
						PacketHandler.sendPacketToClients(PacketHandler.setDistilLiquid(this), this.worldObj, xCoord, yCoord, zCoord, 12.0D);
					}
				}
			}
			if (theTank.getFluid() != null) {
				amount = theTank.getFluid().amount;
			}
			else {
				amount = 0;
			}
			if (theTank.getFluid() != null) {
				liquidItemID = theTank.getFluid().fluidID;
			}
			else {
				liquidItemID = 0;
			}
			if (updateTicks % 8 == 0)
				PacketHandler.sendPacketToClients(PacketHandler.setDistilLiquid(this), this.worldObj, xCoord, yCoord, zCoord, 12.0D);

		}
		if (flag1) {
			onInventoryChanged();
		}
	}

	private boolean placeInInvent(ItemStack itemstack1, int i, boolean doAdd) {
		if (distilItemStacks[i] == null) {
			if (doAdd)
				distilItemStacks[i] = itemstack1;
			return true;
		}
		else if (distilItemStacks[i] != null && distilItemStacks[i].itemID == itemstack1.itemID && itemstack1.isStackable() && (!itemstack1.getHasSubtypes() || distilItemStacks[i].getItemDamage() == itemstack1.getItemDamage()) && ItemStack.areItemStackTagsEqual(distilItemStacks[i], itemstack1)) {
			int var9 = distilItemStacks[i].stackSize + itemstack1.stackSize;
			if (var9 <= itemstack1.getMaxStackSize()) {
				if (doAdd)
					distilItemStacks[i].stackSize = var9;

			}
			else if (distilItemStacks[i].stackSize < itemstack1.getMaxStackSize()) {
				if (doAdd)
					distilItemStacks[i].stackSize += 1;
			}
			return true;
		}
		return false;

	}

	private boolean canSmelt() {
		if (distilItemStacks[0] == null) {
			return false;
		}
		ItemStack itemstack = DistilRecipes.smelting().getSmeltingResult(distilItemStacks[0].getItem().itemID);
		if (itemstack == null) {
			return false;
		}
		if (distilItemStacks[0].getItem().itemID == BlockIDs.oreTC.blockID && (distilItemStacks[0].getItemDamage() != 1 && distilItemStacks[0].getItemDamage() != 2)) {
			return false;
		}
		FluidStack resultLiquid = FluidContainerRegistry.getFluidForFilledItem(itemstack);
		if (resultLiquid == null)
			return false;
		int used = getTank().fill(resultLiquid, false);
		return (used >= resultLiquid.amount);
	}

	public void smeltItem() {
		if (!canSmelt()) {
			return;
		}
		ItemStack itemstack = DistilRecipes.smelting().getSmeltingResult(distilItemStacks[0].getItem().itemID);
		ItemStack plasticStack = DistilRecipes.smelting().getPlasticResult(distilItemStacks[0].getItem().itemID);
		int plasticChance = DistilRecipes.smelting().getPlasticChance(distilItemStacks[0].getItem().itemID);
		FluidStack resultLiquid = FluidContainerRegistry.getFluidForFilledItem(itemstack);
		if (resultLiquid == null)
			return;

		int used = getTank().fill(resultLiquid, false);
		if (used >= resultLiquid.amount) {
			getTank().fill(resultLiquid, true);
			if (random.nextInt(plasticChance) == 0)
				outputPlastic(plasticStack);
			if (theTank.getFluid() != null) {
				amount = theTank.getFluid().amount;
			}
			if (theTank.getFluid() != null) {
				liquidItemID = theTank.getFluid().fluidID;
			}
			PacketHandler.sendPacketToClients(PacketHandler.setDistilLiquid(this), this.worldObj, xCoord, yCoord, zCoord, 12.0D);
		}

		if (distilItemStacks[0].getItem().hasContainerItem()) {
			distilItemStacks[0] = new ItemStack(distilItemStacks[0].getItem().getContainerItem());
		}
		else {
			distilItemStacks[0].stackSize--;
		}
		if (distilItemStacks[0].stackSize <= 0) {
			distilItemStacks[0] = null;
		}
	}

	private void outputPlastic(ItemStack plasticStack) {
		if (distilItemStacks[3] == null) {
			distilItemStacks[3] = plasticStack.copy();
		}
		else if (distilItemStacks[3].itemID == plasticStack.itemID) {
			distilItemStacks[3].stackSize += plasticStack.stackSize;
		}
		this.onInventoryChanged();
	}

	private int getItemBurnTime(ItemStack it) {
		if (it == null) {
			return 0;
		}
		int var1 = it.getItem().itemID;
		if (var1 < 256 && Block.blocksList[var1].blockMaterial == Material.wood)
			return 300;
		if (var1 == Item.stick.itemID)
			return 100;
		if (var1 == Item.coal.itemID)
			return 2600;
		if (var1 == Item.bucketLava.itemID)
			return 20000;
		if (var1 == Block.sapling.blockID)
			return 100;
		if (var1 == Item.blazeRod.itemID)
			return 2500;
		if (var1 == BlockIDs.oreTC.blockID && it.getItemDamage() == 1)
			return 2500;
		if (var1 == BlockIDs.oreTC.blockID && it.getItemDamage() == 2)
			return 2500;
		if (var1 == ItemIDs.diesel.itemID)
			return 4000;
		if (var1 == ItemIDs.refinedFuel.itemID)
			return 6000;
		int ret = GameRegistry.getFuelValue(it);
		return ret;

	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer entityplayer) {
		if (worldObj == null) {
			return true;
		}
		if (worldObj.getBlockTileEntity(xCoord, yCoord, zCoord) != this) {
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
	public void openChest() {}

	@Override
	public void closeChest() {}

	/*@Override
	public int getStartInventorySide(ForgeDirection side) {
		if (side == ForgeDirection.DOWN)
			return 1;
		if (side == ForgeDirection.UP)
			return 0;
		return 2;
	}

	@Override
	public int getSizeInventorySide(ForgeDirection side) {
		return 2;
	}*/

	@Override
	public Packet getDescriptionPacket() {
		return PacketHandler.getTEPClient(this);
	}

	public void handlePacketDataFromServer(byte orientation, short cookTime, short burnTime, short amount, short liquidID) {
		facing = ForgeDirection.getOrientation(orientation);
		distilBurnTime = (int) burnTime;
		distilCookTime = (int) cookTime;
		this.amount = (int) amount;
		this.liquidItemID = liquidID;
	}

	public void handlePacketDataFromServer(short amount, short liquidID) {
		this.amount = (int) amount;
		liquidItemID = liquidID;
		//System.out.println(side +" packet "+amount);
	}

	public FluidStack getFluid()
	{
		return theTank.getFluid();
	}

	public int getFluidAmount()
	{
		return theTank.getFluidAmount();
	}

	@Override
	public int fill(ForgeDirection from, FluidStack resource, boolean doFill)
	{
		return theTank.fill(resource, doFill);
	}

	@Override
	public FluidStack drain(ForgeDirection from, FluidStack resource, boolean doDrain)
	{
		if (resource == null || !resource.isFluidEqual(theTank.getFluid()))
		{
			return null;
		}
		return theTank.drain(resource.amount, doDrain);
	}

	@Override
	public FluidStack drain(ForgeDirection from, int maxDrain, boolean doDrain)
	{
		return theTank.drain(maxDrain, doDrain);
	}

	public int getCapacity() {
		return this.maxTank;
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
	public FluidTankInfo[] getTankInfo(ForgeDirection from)
	{
		return new FluidTankInfo[] { theTank.getInfo() };
	}

	@Override
	public boolean isInvNameLocalized() {
		return false;
	}

	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack) {
		return true;
	}
}
