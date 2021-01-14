package train.blocks.distil;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.blocks.TileEntityStorage;
import ebf.tim.registry.TiMFluids;
import ebf.tim.registry.TiMItems;
import ebf.tim.registry.TiMOres;
import ebf.tim.utility.ItemStackSlot;
import net.minecraft.init.Items;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.IFluidHandler;
import train.blocks.TCBlocks;
import train.blocks.fluids.LiquidManager;
import train.library.ItemIDs;

import java.util.ArrayList;
import java.util.Random;

public class TileEntityDistil extends TileEntityStorage implements ISidedInventory {

	public int distilBurnTime;
	public int currentItemBurnTime;
	public int distilCookTime;
	private int cookDuration;
	private Random random;
	private int updateTicks;
	public boolean wasBurning=false;

	public TileEntityDistil() {
		//slots 0=input 1=fuel 3=output 2=input canister ?=filled canister
		super(TCBlocks.blockDistil);
		distilBurnTime = 0;
		currentItemBurnTime = 0;
		distilCookTime = 0;
		cookDuration = 400;//default is 200
		random = new Random();
		storageType=-1;
		//this.theTank = LiquidManager.getInstance().new FilteredTank(maxTank, new FluidStack[]{TiMFluids.fluidDiesel, }, 1);
		inventory=new ArrayList<>();

		inventory.add(new ItemStackSlot(this, 400, 56, 17).setCraftingInput(true).setOverlay(TCBlocks.orePetroleum));
		inventory.add(new ItemStackSlot(this, 401, 56, 53).setCraftingInput(true));
		inventory.add(new ItemStackSlot(this, 402, 123, 8).setCraftingInput(true).setOverlay(Items.bucket));

		inventory.add(new ItemStackSlot(this, 403, 116, 60).setCraftingOutput(true));
		inventory.add(new ItemStackSlot(this, 404, 123, 33).setCraftingOutput(true));
	}

	/**
	 * Used by the GUI
	 */
	@SideOnly(Side.CLIENT)
	public int getLiquid() {
		return getTankInfo(0)!=null&&getTankInfo(0).fluid!=null?getTankInfo(0).fluid.amount:0;
	}



	@Override
	public void readFromNBT(NBTTagCompound nbtTag) {
		super.readFromNBT(nbtTag);
		distilBurnTime = nbtTag.getShort("BurnTime");
		distilCookTime = nbtTag.getShort("CookTime");
		currentItemBurnTime = nbtTag.getShort("CurrentItemBurn");
	}

	public int[] getTankCapacity() {
		return new int[]{30000};
	}

	@Override
	public void writeToNBT(NBTTagCompound nbtTag) {
		super.writeToNBT(nbtTag);
		nbtTag.setShort("BurnTime", (short) distilBurnTime);
		nbtTag.setShort("CookTime", (short) distilCookTime);
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


	@Override
	public String getInventoryName(){
		return "distil";
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
				currentItemBurnTime = distilBurnTime = TileEntityFurnace.getItemBurnTime(getSlotIndexByID(401).getStack());
				if (distilBurnTime > 0) {
					if (getSlotIndexByID(401).getStack() != null) {
						if (getSlotIndexByID(401).getStack().getItem().hasContainerItem(getSlotIndexByID(401).getStack())) {
							getSlotIndexByID(401).setStack(new ItemStack(getSlotIndexByID(401).getStack().getItem().getContainerItem()));
						}
						else {
							getSlotIndexByID(401).getStack().stackSize--;
						}

						if (getSlotIndexByID(401).getStack().stackSize == 0) {
							getSlotIndexByID(401).setStack(null);
						}
					}
				}
			}

			if (isBurning() && canSmelt()) {
				distilCookTime++;
				if (distilCookTime == cookDuration) {
					distilCookTime = 0;
					smeltItem();
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

			if (getSlotIndexByID(402).getStack() != null) {

				if (this.updateTicks % 8 == 0) {

					ItemStack result = LiquidManager.getInstance().processContainer(this, 2, this, getSlotIndexByID(402).getStack());

					if (result != null && placeInInvent(result, 404, false)) {

						placeInInvent(result, 404, true);

						flag1 = true;

						this.markDirty();
						this.worldObj.markBlockForUpdate(this.xCoord, this.yCoord, this.zCoord);
					}
				}
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
		if (getSlotIndexByID(400).getStack() == null || (getSlotIndexByID(403).getStack() != null && getSlotIndexByID(403).getStackSize()==64) || (getSlotIndexByID(404).getStack() != null && getSlotIndexByID(404).getStackSize()==64)) {
			return false;
		}
		ItemStack itemstack = DistilRecipes.smelting().getSmeltingResult(getSlotIndexByID(400).getStack().getItem());
		if (itemstack == null || itemstack.getItem()==null) {
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
		ItemStack itemstack = DistilRecipes.smelting().getSmeltingResult(getSlotIndexByID(400).getStack().getItem());
		ItemStack plasticStack = DistilRecipes.smelting().getPlasticResult(getSlotIndexByID(400).getStack().getItem());
		int plasticChance = DistilRecipes.smelting().getPlasticChance(getSlotIndexByID(400).getStack().getItem());
		FluidStack resultLiquid = FluidContainerRegistry.getFluidForFilledItem(itemstack);
		if (resultLiquid == null)
			return;

		int used = fill(null, resultLiquid, false);
		if (used ==0) {
			fill(null, resultLiquid, true);
			if (random.nextInt(plasticChance) == 0)
				outputPlastic(plasticStack, getSlotIndexByID(400).getStack().getItem() == TiMFluids.bucketDiesel);

			this.markDirty();
			this.worldObj.markBlockForUpdate(this.xCoord, this.yCoord, this.zCoord);
		}

		if (getSlotIndexByID(400).getStack().getItem().hasContainerItem(getSlotIndexByID(400).getStack())) {
			getSlotIndexByID(400).setStack(new ItemStack(getSlotIndexByID(400).getStack().getItem().getContainerItem()));
		}
		else {
			getSlotIndexByID(400).getStack().stackSize--;
		}
		if (getSlotIndexByID(400).getStack().stackSize <= 0) {
			getSlotIndexByID(400).setStack(null);
		}
		this.syncTileEntity();
	}

	private void outputPlastic(ItemStack plasticStack, boolean wasDeisel) {
		if (getSlotIndexByID(403).getStack() == null) {
			if(wasDeisel){
				getSlotIndexByID(403).setStack(new ItemStack(Items.bucket,1));
			} else {
				getSlotIndexByID(403).setStack(plasticStack.copy());
			}
		} else if(wasDeisel){
			if(getSlotIndexByID(403).getStack().getItem()==Items.bucket){
				getSlotIndexByID(403).getStack().stackSize += plasticStack.stackSize;
			} else {
				getSlotIndexByID(403).getStack().stackSize += plasticStack.stackSize;
			}
		} else if (Item.getIdFromItem(getSlotIndexByID(403).getStack().getItem()) == Item.getIdFromItem(plasticStack.getItem())) {
			getSlotIndexByID(403).getStack().stackSize += plasticStack.stackSize;
		}
		this.markDirty();
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
