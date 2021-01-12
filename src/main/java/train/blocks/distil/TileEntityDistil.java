package train.blocks.distil;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.blocks.TileEntityStorage;
import ebf.tim.registry.TiMBlocks;
import ebf.tim.registry.TiMFluids;
import ebf.tim.utility.DebugUtil;
import ebf.tim.utility.ItemStackSlot;
import net.minecraft.block.Block;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.*;
import train.blocks.TCBlocks;
import train.blocks.fluids.LiquidManager;
import train.blocks.fluids.LiquidManager.StandardTank;
import train.library.BlockIDs;
import train.library.ItemIDs;
import train.blocks.TileTraincraft;

import java.util.ArrayList;
import java.util.Random;

public class TileEntityDistil extends TileEntityStorage implements IFluidHandler, ISidedInventory {

	public int distilBurnTime;
	public int currentItemBurnTime;
	public int distilCookTime;
	private int cookDuration;
	private Random random;
	private int updateTicks;
	public int amount;
	public int liquidItemID;
	public boolean wasBurning=false;

	public TileEntityDistil() {
		//slots 0=input 1=fuel 3=output 2=input canister ?=filled canister
		super(TCBlocks.distilIdle);
		distilBurnTime = 0;
		currentItemBurnTime = 0;
		distilCookTime = 0;
		cookDuration = 400;//default is 200
		random = new Random();
		//this.theTank = LiquidManager.getInstance().new FilteredTank(maxTank, new FluidStack[]{TiMFluids.fluidDiesel, }, 1);
		inventory=new ArrayList<>();

		inventory.add(new ItemStackSlot(this, 0, 56, 17));
		inventory.add(new ItemStackSlot(this, 1, 56, 53));
		inventory.add(new ItemStackSlot(this, 2, 123, 8));

		inventory.add(new ItemStackSlot(this, 3, 116, 60));
		inventory.add(new ItemStackSlot(this, 4, 123, 33));
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



	@Override
	public void readFromNBT(NBTTagCompound nbtTag) {
		super.readFromNBT(nbtTag);
		distilBurnTime = nbtTag.getShort("BurnTime");
		distilCookTime = nbtTag.getShort("CookTime");
		currentItemBurnTime = nbtTag.getShort("CurrentItemBurn");
		this.amount = nbtTag.getInteger("Amount");
		liquidItemID = nbtTag.getInteger("LiquidID");
	}

	public int[] getTankCapacity() {
		return new int[]{30000};
	}

	@Override
	public void writeToNBT(NBTTagCompound nbtTag) {
		super.writeToNBT(nbtTag);
		nbtTag.setShort("BurnTime", (short) distilBurnTime);
		nbtTag.setShort("CookTime", (short) distilCookTime);
		nbtTag.setInteger("Amount", this.amount);
		nbtTag.setInteger("LiquidID", this.liquidItemID);
		nbtTag.setShort("CurrentItemBurn", (short) this.currentItemBurnTime);
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
	public boolean canUpdate(){return true;}
	@Override
	public void updateEntity() {
		if(!worldObj.isRemote){
			updateTicks++;
			boolean flag = distilBurnTime > 0;
			boolean flag1 = false;
			if (distilBurnTime == 0 && canSmelt()) {
				currentItemBurnTime = distilBurnTime = TileEntityFurnace.getItemBurnTime(getSlotIndexByID(1).getStack());
				if (distilBurnTime > 0) {
					flag1 = true;
					if (getSlotIndexByID(1).getStack() != null) {
						if (getSlotIndexByID(1).getStack().getItem().hasContainerItem(getSlotIndexByID(1).getStack())) {
							getSlotIndexByID(1).setStack(new ItemStack(getSlotIndexByID(1).getStack().getItem().getContainerItem()));
						}
						else {
							getSlotIndexByID(1).getStack().stackSize--;
						}

						if (getSlotIndexByID(1).getStack().stackSize == 0) {
							getSlotIndexByID(1).setStack(null);
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
			}
			else {
				flag1 = false;
				this.worldObj.markBlockForUpdate(this.xCoord, this.yCoord, this.zCoord);
			}

			if (getSlotIndexByID(2).getStack() != null) {

				if (this.updateTicks % 8 == 0) {

					ItemStack result = LiquidManager.getInstance().processContainer(this, 2, this, getSlotIndexByID(2).getStack());

					if (result != null && placeInInvent(result, 4, false)) {

						placeInInvent(result, 4, true);

						if (getTankInfo(null)[0].fluid.getFluid() != null) {

							amount = getTankInfo(null)[0].fluid.amount;
						}
						else {

							amount = 0;
						}

						if (getTankInfo(null)[0].fluid.getFluid() != null) {

							liquidItemID = getTankInfo(null)[0].fluid.getFluidID();
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

			if (getTankInfo(null)[0]!=null && getTankInfo(null)[0].fluid != null) {
				amount = getTankInfo(null)[0].fluid.amount;
			}
			else {
				amount = 0;
			}
			if (getTankInfo(null)[0]!=null && getTankInfo(null)[0].fluid.getFluid() != null) {
				liquidItemID = getTankInfo(null)[0].fluid.getFluidID();
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
		if (getSlotIndexByID(i) == null) {
			if (doAdd)
				getSlotIndexByID(i).setStack(itemstack1);
			return true;
		}
		else if (getSlotIndexByID(i).getStack() != null && Item.getIdFromItem(getSlotIndexByID(i).getItem()) == Item.getIdFromItem(itemstack1.getItem()) && itemstack1.isStackable() && (!itemstack1.getHasSubtypes() || getSlotIndexByID(i).getStack().getItemDamage() == itemstack1.getItemDamage()) && ItemStack.areItemStackTagsEqual(getSlotIndexByID(i).getStack(), itemstack1)) {
			int var9 = getSlotIndexByID(i).getStack().stackSize + itemstack1.stackSize;
			if (var9 <= itemstack1.getMaxStackSize()) {
				if (doAdd)
					getSlotIndexByID(i).setSlotStacksize(var9);

			}
			else if (getSlotIndexByID(i).getStack().stackSize < itemstack1.getMaxStackSize()) {
				if (doAdd)
					getSlotIndexByID(i).setSlotStacksize(getSlotIndexByID(i).getStackSize()+1);
			}
			return true;
		}
		return false;

	}

	private boolean canSmelt() {
		if (getSlotIndexByID(0).getStack() == null || (getSlotIndexByID(3).getStack() != null && getSlotIndexByID(3).getStackSize()==64) || (getSlotIndexByID(4).getStack() != null && getSlotIndexByID(4).getStackSize()==64)) {
			return false;
		}
		ItemStack itemstack = DistilRecipes.smelting().getSmeltingResult(getSlotIndexByID(0).getStack().getItem());
		if (itemstack == null) {
			return false;
		}
		if (Block.getBlockFromItem(getSlotIndexByID(0).getItem()) != TCBlocks.orePetroleum) {
			return false;
		}
		FluidStack resultLiquid = FluidContainerRegistry.getFluidForFilledItem(itemstack);
		if (resultLiquid == null) {
			return false;
		}
		int used = fill(null, resultLiquid, false);
		return (used ==0);
	}

	public void smeltItem() {
		if (!canSmelt()) {
			return;
		}
		ItemStack itemstack = DistilRecipes.smelting().getSmeltingResult(getSlotIndexByID(0).getStack().getItem());
		ItemStack plasticStack = DistilRecipes.smelting().getPlasticResult(getSlotIndexByID(0).getStack().getItem());
		int plasticChance = DistilRecipes.smelting().getPlasticChance(getSlotIndexByID(0).getStack().getItem());
		FluidStack resultLiquid = FluidContainerRegistry.getFluidForFilledItem(itemstack);
		if (resultLiquid == null)
			return;

		int used = fill(null, resultLiquid, false);
		if (used ==0) {
			fill(null, resultLiquid, true);
			if (random.nextInt(plasticChance) == 0)
				outputPlastic(plasticStack, getSlotIndexByID(0).getStack().getItem() == ItemIDs.diesel.item);
			if (getTankInfo(null)[0].fluid.getFluid() != null) {
				amount = getTankInfo(null)[0].fluid.amount;
			}
			if (getTankInfo(null)[0].fluid.getFluid() != null) {
				liquidItemID = getTankInfo(null)[0].fluid.getFluidID();
			}

			this.markDirty();
			this.worldObj.markBlockForUpdate(this.xCoord, this.yCoord, this.zCoord);
		}

		if (getSlotIndexByID(0).getStack().getItem().hasContainerItem(getSlotIndexByID(0).getStack())) {
			getSlotIndexByID(0).setStack(new ItemStack(getSlotIndexByID(0).getStack().getItem().getContainerItem()));
		}
		else {
			getSlotIndexByID(0).getStack().stackSize--;
		}
		if (getSlotIndexByID(0).getStack().stackSize <= 0) {
			getSlotIndexByID(0).setStack(null);
		}
		this.syncTileEntity();
	}

	private void outputPlastic(ItemStack plasticStack, boolean wasDeisel) {
		if (getSlotIndexByID(3).getStack() == null) {
			if(wasDeisel){
				getSlotIndexByID(3).setStack(new ItemStack(ItemIDs.emptyCanister.item,1));
			} else {
				getSlotIndexByID(3).setStack(plasticStack.copy());
			}
		} else if(wasDeisel){
			if(getSlotIndexByID(3).getStack().getItem()==ItemIDs.emptyCanister.item){
				getSlotIndexByID(3).getStack().stackSize += plasticStack.stackSize;
			} else {
				getSlotIndexByID(3).getStack().stackSize += plasticStack.stackSize;
			}
		} else if (Item.getIdFromItem(getSlotIndexByID(3).getStack().getItem()) == Item.getIdFromItem(plasticStack.getItem())) {
			getSlotIndexByID(3).getStack().stackSize += plasticStack.stackSize;
		}
		this.markDirty();
	}


	@Override
	public void openInventory() {}

	@Override
	public void closeInventory() {}

	public FluidStack getFluid() {
		return getTankInfo(null)[0].fluid;
	}




	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack) {
		return true;
	}

	@Override
	public void markDirty() {
		if(wasBurning!=isBurning()) {
			super.markDirty();
			wasBurning=isBurning();
		} else {
			if (this.worldObj != null) {
				worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
				worldObj.markTileEntityChunkModified(xCoord, yCoord, zCoord, this);
				this.worldObj.func_147453_f(this.xCoord, this.yCoord, this.zCoord, worldObj.getBlock(xCoord, yCoord, zCoord));
			}
		}
	}

	@Override
	public int[] getAccessibleSlotsFromSide(int p_94128_1_) {
		if(this.inventory.size() > 0){
			int[] theInt = new int[inventory.size()];
			for(int i = 0; i < theInt.length; i++){
				theInt[i] = i;
			}
			return theInt;
		} else {
			return new int[0];
		}
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
