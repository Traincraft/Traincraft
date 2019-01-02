package train.common.tile;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.*;
import train.common.api.LiquidManager;
import train.common.api.LiquidManager.StandardTank;
import train.common.blocks.BlockDistil;
import train.common.library.BlockIDs;
import train.common.recipes.DistilRecipes;

import java.util.Random;

public class TileEntityDistil extends TileTraincraft implements IFluidHandler {

	private ForgeDirection facing;
	public int distilBurnTime;
	public int currentItemBurnTime;
	public int distilCookTime;
	private int cookDuration;
	private Random random;
	private int updateTicks;
	private int maxTank = 0;
	private StandardTank theTank;
	public int amount;
	public int liquidItemID;

	public TileEntityDistil() {
		//slots 0=input 1=fuel 3=output 2=input canister ?=filled canister
		super(5, "Distillation tower");
		distilBurnTime = 0;
		currentItemBurnTime = 0;
		distilCookTime = 0;
		cookDuration = 400;//default is 200
		random = new Random();
		this.maxTank = 30000;
		this.theTank = LiquidManager.getInstance().new FilteredTank(maxTank, LiquidManager.getInstance().dieselFilter(), 1);
	}

	/**
	 * Used by the GUI
	 */
	@SideOnly(Side.CLIENT)
	public int getLiquid() {
		return (amount);
	}

	/**
	 * Used by the GUI
	 */
	@SideOnly(Side.CLIENT)
	public int getLiquidItemID() {
		return liquidItemID;
	}

	public StandardTank getTank() {
		return theTank;
	}


	@Override
	public void readFromNBT(NBTTagCompound nbtTag, boolean forSyncing) {
		super.readFromNBT(nbtTag, forSyncing);
		facing = ForgeDirection.getOrientation(nbtTag.getInteger("Orientation"));
		distilBurnTime = nbtTag.getShort("BurnTime");
		distilCookTime = nbtTag.getShort("CookTime");
		currentItemBurnTime = nbtTag.getShort("CurrentItemBurn");
		this.amount = nbtTag.getInteger("Amount");
		liquidItemID = nbtTag.getInteger("LiquidID");
		this.theTank.readFromNBT(nbtTag);
	}

	public int getTankCapacity() {
		return maxTank;
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound nbtTag, boolean forSyncing) {
		super.writeToNBT(nbtTag, forSyncing);
		nbtTag.setInteger("Orientation", getFacing().ordinal());
		nbtTag.setShort("BurnTime", (short) distilBurnTime);
		nbtTag.setShort("CookTime", (short) distilCookTime);
		nbtTag.setInteger("Amount", this.amount);
		nbtTag.setInteger("LiquidID", this.liquidItemID);
		nbtTag.setShort("CurrentItemBurn", (short) this.currentItemBurnTime);
		this.theTank.writeToNBT(nbtTag);
		return nbtTag;
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
		if(!worldObj.isRemote){
			updateTicks++;
			boolean flag = distilBurnTime > 0;
			boolean flag1 = false;
			if (distilBurnTime == 0 && canSmelt()) {
				currentItemBurnTime = distilBurnTime = TileEntityFurnace.getItemBurnTime(slots[1]);
				if (distilBurnTime > 0) {
					flag1 = true;
					if (slots[1] != null) {
						if (slots[1].getItem().hasContainerItem(slots[1])) {
							slots[1] = new ItemStack(slots[1].getItem().getContainerItem());
						}
						else {
							slots[1].stackSize--;
						}

						if (slots[1].stackSize == 0) {
							slots[1] = null;
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
			else {
				flag1 = false;
				BlockDistil.updateDistilBlockState(distilBurnTime > 0, worldObj, xCoord, yCoord, zCoord);
				this.worldObj.markBlockForUpdate(this.xCoord, this.yCoord, this.zCoord);
			}

			if (slots[2] != null) {

				if (this.updateTicks % 8 == 0) {

					ItemStack result = LiquidManager.getInstance().processContainer(this, 2, this, slots[2]);

					if (result != null && placeInInvent(result, 4, false)) {

						placeInInvent(result, 4, true);

						if (theTank.getFluid() != null) {

							amount = theTank.getFluid().amount;
						}
						else {

							amount = 0;
						}

						if (theTank.getFluid() != null) {

							liquidItemID = theTank.getFluid().getFluidID();
						}
						else {

							liquidItemID = 0;
						}

						flag1 = true;

						this.markDirty();
						this.worldObj.markBlockForUpdate(this.xCoord, this.yCoord, this.zCoord);
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
				liquidItemID = theTank.getFluid().getFluidID();
			}
			else {
				liquidItemID = 0;
			}
			if (updateTicks % 8 == 0){
				this.markDirty();
				this.worldObj.markBlockForUpdate(this.xCoord, this.yCoord, this.zCoord);
			}
			if (distilBurnTime > 0) {
				distilBurnTime--;
			}
			if (flag1) {
				this.syncTileEntity();
				markDirty();
			}
		}
	}

	private boolean placeInInvent(ItemStack itemstack1, int i, boolean doAdd) {
		if (slots[i] == null) {
			if (doAdd)
				slots[i] = itemstack1;
			return true;
		}
		else if (slots[i] != null && Item.getIdFromItem(slots[i].getItem()) == Item.getIdFromItem(itemstack1.getItem()) && itemstack1.isStackable() && (!itemstack1.getHasSubtypes() || slots[i].getItemDamage() == itemstack1.getItemDamage()) && ItemStack.areItemStackTagsEqual(slots[i], itemstack1)) {
			int var9 = slots[i].stackSize + itemstack1.stackSize;
			if (var9 <= itemstack1.getMaxStackSize()) {
				if (doAdd)
					slots[i].stackSize = var9;

			}
			else if (slots[i].stackSize < itemstack1.getMaxStackSize()) {
				if (doAdd)
					slots[i].stackSize += 1;
			}
			return true;
		}
		return false;

	}

	private boolean canSmelt() {
		if (slots[0] == null || (slots[3] != null && slots[3].stackSize==64) || (slots[4] != null && slots[4].stackSize==64)) {
			return false;
		}
		ItemStack itemstack = DistilRecipes.smelting().getSmeltingResult(slots[0].getItem());
		if (itemstack == null) {
			return false;
		}
		if (Block.getBlockFromItem(slots[0].getItem()) == BlockIDs.oreTC.block
				&& (slots[0].getItemDamage() != 1 && slots[0].getItemDamage() != 2)) {
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
		ItemStack itemstack = DistilRecipes.smelting().getSmeltingResult(slots[0].getItem());
		ItemStack plasticStack = DistilRecipes.smelting().getPlasticResult(slots[0].getItem());
		int plasticChance = DistilRecipes.smelting().getPlasticChance(slots[0].getItem());
		FluidStack resultLiquid = FluidContainerRegistry.getFluidForFilledItem(itemstack);
		if (resultLiquid == null)
			return;

		int used = getTank().fill(resultLiquid, false);
		if (used >= resultLiquid.amount)
		{
			getTank().fill(resultLiquid, true);
			if (random.nextInt(plasticChance) == 0)
				outputPlastic(plasticStack);
			if (theTank.getFluid() != null) {
				amount = theTank.getFluid().amount;
			}
			if (theTank.getFluid() != null) {
				liquidItemID = theTank.getFluid().getFluidID();
			}

			this.markDirty();
			this.worldObj.markBlockForUpdate(this.xCoord, this.yCoord, this.zCoord);
		}

		if (slots[0].getItem().hasContainerItem(slots[0])) {
			slots[0] = new ItemStack(slots[0].getItem().getContainerItem());
		}
		else {
			slots[0].stackSize--;
		}
		if (slots[0].stackSize <= 0) {
			slots[0] = null;
		}
		this.syncTileEntity();
	}

	private void outputPlastic(ItemStack plasticStack) {
		if (slots[3] == null) {
			slots[3] = plasticStack.copy();
		}
		else if (Item.getIdFromItem(slots[3].getItem()) == Item.getIdFromItem(plasticStack.getItem())) {
			slots[3].stackSize += plasticStack.stackSize;
		}
		this.markDirty();
	}

	public ForgeDirection getFacing() {
		if(facing!=null){
			return this.facing;
		}
		return ForgeDirection.NORTH;
	}

	public void setFacing(ForgeDirection face) {
		this.facing = face;
	}

	@Override
	public void openInventory() {}

	@Override
	public void closeInventory() {}

	public FluidStack getFluid() {
		return theTank.getFluid();
	}

	@Override
	public int fill(ForgeDirection from, FluidStack resource, boolean doFill)
	{
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
	public boolean isItemValidForSlot(int i, ItemStack itemstack) {
		return true;
	}

	@Override
	public boolean canInsertItem(int slot, ItemStack stack, int side){
		if(side == 0) return false;          // bottom is extract only
		else if(side == 1) return slot == 0; // insert input into top
		else return slot == 1;               // insert fuel into sides
	}

	@Override
	public boolean canExtractItem(int slot, ItemStack stack, int side){
		return side != 1 && slot == 3;
	}

}
