package train.blocks.hearth;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.blocks.TileEntityStorage;
import ebf.tim.registry.TiMBlocks;
import ebf.tim.utility.ItemStackSlot;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import train.blocks.TCBlocks;
import train.blocks.bench.TrainCraftingManager;
import train.library.BlockIDs;
import train.library.ItemIDs;
import train.blocks.TileTraincraft;

import java.util.Random;

public class TileEntityOpenHearthFurnace extends TileEntityStorage {

	public int furnaceBurnTime;
	public int currentItemBurnTime;
	public int furnaceCookTime;
	private int cookDuration;
	private Random random;

	public TileEntityOpenHearthFurnace() {
		super(TCBlocks.blockHearthFurnace);
		furnaceBurnTime = 0;
		currentItemBurnTime = 0;
		furnaceCookTime = 0;
		cookDuration = 600;//default is 200
		random = new Random();

		inventory.add(new ItemStackSlot(this, 400, 56, 17));
		inventory.add(new ItemStackSlot(this, 401, 35, 17));
		inventory.add(new SlotOpenHearthFurnace(this, 3, 116, 35));

		inventory.add(new ItemStackSlot(this, 403, 116, 60));
		inventory.add(new ItemStackSlot(this, 404, 123, 33));
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
		cookDuration = TrainCraftingManager.instance.getHearthFurnaceRecipeDuration(
				getSlotIndexByID(400).getStack(), getSlotIndexByID(401).getStack());
		if (furnaceBurnTime > 0) {
			furnaceBurnTime--;
		}
		if (!worldObj.isRemote) {
			if (furnaceBurnTime == 0 && canSmelt()) {
				if (getSlotIndexByID(402) != null) {
					currentItemBurnTime = furnaceBurnTime = getItemBurnTime(getSlotIndexByID(402).getStack());
					if (furnaceBurnTime > 0) {
						flag1 = true;
						if (getSlotIndexByID(402).getItem().hasContainerItem(getSlotIndexByID(402).getStack())) {
							getSlotIndexByID(402).setStack(new ItemStack(getSlotIndexByID(402).getItem().getContainerItem()));
						}
						else {
							getSlotIndexByID(402).decrStackSize(1);
						}
						if (getSlotIndexByID(402).getStackSize() == 0) {
							getSlotIndexByID(402).setStack(null);
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
				BlockOpenHearthFurnace.updateHearthFurnaceBlockState(furnaceBurnTime > 0, worldObj, xCoord, yCoord, zCoord);
			}
			this.syncTileEntity();
		}
		if (this.worldObj.isRemote) {
			if (furnaceBurnTime > 0) {
				smoke(worldObj, xCoord, yCoord, zCoord, random);
			}
		}
		if (flag1) {
			markDirty();
		}
	}

	@SideOnly(Side.CLIENT)
	private void smoke(World world, int i, int j, int k, Random random) {
		float var7 = (float) i + 0.5F;
		float var9 = (float) k + 0.5F;
		float f3 = 0.009F;
		double gaussian = random.nextGaussian() * f3;
		for (int t = 0; t < 50; t++) {
			world.spawnParticle("smoke", var7, (double) j + 1.2F, var9, gaussian, gaussian * 0.002F, gaussian);
		}
		world.spawnParticle("flame", var7, (double) j + 1.03F, var9, 0, 0, 0);
		world.spawnParticle("flame", var7 + 0.06, (double) j + 1.03F, var9 + 0.06, 0, 0, 0);
		world.spawnParticle("flame", var7 - 0.06, (double) j + 1.03F, var9 - 0.06, 0, 0, 0);
		world.spawnParticle("flame", var7 + 0.06, (double) j + 1.03F, var9 - 0.06, 0, 0, 0);
		world.spawnParticle("flame", var7 - 0.06, (double) j + 1.03F, var9 + 0.06, 0, 0, 0);
	}

	private boolean canSmelt(){
		if(getSlotIndexByID(400) == null){
			return false;
		}
		if(getSlotIndexByID(401) == null){//second input slot
			return false;
		}
		ItemStack itemstack = TrainCraftingManager.instance.getHearthFurnaceRecipeResult(
				getSlotIndexByID(400).getStack(), getSlotIndexByID(401).getStack());

		return (itemstack != null) && (getSlotIndexByID(403) == null ||
				getSlotIndexByID(403).getStack().isItemEqual(itemstack) &&
						getSlotIndexByID(403).getStackSize() < itemstack.getMaxStackSize());
	}

	public void smeltItem() {
		if (!canSmelt()) {
			return;
		}
		ItemStack itemstack = TrainCraftingManager.instance.getHearthFurnaceRecipeResult(getSlotIndexByID(400).getStack(), getSlotIndexByID(401).getStack());
		if (getSlotIndexByID(403) == null) {
			getSlotIndexByID(403).setStack(itemstack.copy());

		}
		else if (getSlotIndexByID(403).getItem() == itemstack.getItem()) {
			getSlotIndexByID(403).decrStackSize(-itemstack.stackSize);

		}
		if (getSlotIndexByID(400).getItem().hasContainerItem(getSlotIndexByID(400).getStack())) {
			getSlotIndexByID(400).setStack(new ItemStack(getSlotIndexByID(400).getItem().getContainerItem()));
		}
		else {
			getSlotIndexByID(400).decrStackSize(1);
		}
		if (getSlotIndexByID(400).getStackSize() <= 0) {
			getSlotIndexByID(400).setStack(null);
		}

		if (getSlotIndexByID(401).getItem().hasContainerItem(getSlotIndexByID(401).getStack())) {
			getSlotIndexByID(401).setStack(new ItemStack(getSlotIndexByID(401).getItem().getContainerItem()));
		}
		else {
			getSlotIndexByID(401).decrStackSize(1);
		}
		if (getSlotIndexByID(401).getStackSize() <= 0) {
			getSlotIndexByID(401).setStack(null);
		}
	}

	private int getItemBurnTime(ItemStack it) {
		if (it == null) {
			return 0;
		}
		if(TileEntityFurnace.getItemBurnTime(it) >0){
			return TileEntityFurnace.getItemBurnTime(it);
		}
		Item var1 = it.getItem();
		if (Item.getIdFromItem(var1) < 256 && Block.getBlockFromItem(var1).getMaterial() == Material.wood)
			return 300;
		if (var1 == Items.stick)
			return 100;
		if (var1 == Items.coal)
			return 2600;
		if (var1 == Items.lava_bucket)
			return 20000;
		if (var1 == Item.getItemFromBlock(Blocks.sapling))
			return 100;
		if (var1 == Items.blaze_rod)
			return 2500;
		if (var1 == Item.getItemFromBlock(TCBlocks.orePetroleum))
			return 2500;
		if (var1 == Item.getItemFromBlock(TCBlocks.oilSand))
			return 2500;
		if (var1 == ItemIDs.diesel.item)
			return 4000;
		if (var1 == ItemIDs.refinedFuel.item)
			return 6000;
		return GameRegistry.getFuelValue(it);
	}


	@Override
	public void writeToNBT(NBTTagCompound nbt){
		super.writeToNBT(nbt);
		nbt.setByte("Orientation", (byte) getFacing().ordinal());
		nbt.setShort("BurnTime", (short) furnaceBurnTime);
		nbt.setShort("CookTime", (short) furnaceCookTime);
		nbt.setShort("ItemBurnTime", (short) currentItemBurnTime);
	}

	@Override
	public void readFromNBT(NBTTagCompound nbt){
		super.readFromNBT(nbt);
		furnaceBurnTime = nbt.getShort("BurnTime");
		furnaceCookTime = nbt.getShort("CookTime");
		currentItemBurnTime = nbt.getShort("ItemBurnTime");
	}
}
