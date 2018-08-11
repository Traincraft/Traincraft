package train.common.api;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.*;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import train.common.adminbook.ServerLogger;

public abstract class AbstractWorkCart extends EntityRollingStock implements IInventory{
	protected ItemStack[] furnaceItemStacks;
	public int furnaceBurnTime = 0;
	public int currentItemBurnTime = 0;
	public int furnaceCookTime = 0;

	public AbstractWorkCart(World world) {
		super(world);
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound nbttagcompound) {
		super.writeEntityToNBT(nbttagcompound);

		nbttagcompound.setShort("BurnTime", (short) this.furnaceBurnTime);
		nbttagcompound.setShort("CookTime", (short) this.furnaceCookTime);
		NBTTagList var2 = new NBTTagList();

		for (int var3 = 0; var3 < this.furnaceItemStacks.length; ++var3) {
			if (this.furnaceItemStacks[var3] != null) {
				NBTTagCompound var4 = new NBTTagCompound();
				var4.setByte("Slot", (byte) var3);
				this.furnaceItemStacks[var3].writeToNBT(var4);
				var2.appendTag(var4);
			}
		}
		nbttagcompound.setTag("Items", var2);
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound nbttagcompound) {
		super.readEntityFromNBT(nbttagcompound);
		NBTTagList var2 = nbttagcompound.getTagList("Items", Constants.NBT.TAG_COMPOUND);
		this.furnaceItemStacks = new ItemStack[this.getSizeInventoryWork()];

		for (int var3 = 0; var3 < var2.tagCount(); ++var3) {
			NBTTagCompound var4 = var2.getCompoundTagAt(var3);
			byte var5 = var4.getByte("Slot");

			if (var5 >= 0 && var5 < this.furnaceItemStacks.length) {
				this.furnaceItemStacks[var5] = ItemStack.loadItemStackFromNBT(var4);
			}
		}
		this.furnaceBurnTime = nbttagcompound.getShort("BurnTime");
		this.furnaceCookTime = nbttagcompound.getShort("CookTime");
		this.currentItemBurnTime = AbstractWorkCart.getItemBurnTime(this.furnaceItemStacks[1]);
	}

	/**
	 * Returns the maximum stack size for a inventory slot. Seems to always be 64, possibly will be extended. *Isn't this more of a set than a get?*
	 */
	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@SideOnly(Side.CLIENT)
	/**
	 * Returns an integer between 0 and the passed value representing how close the current item is to being completely
	 * cooked
	 */
	public int getCookProgressScaled(int par1) {
		return this.furnaceCookTime * par1 / 200;
	}

	@SideOnly(Side.CLIENT)
	/**
	 * Returns an integer between 0 and the passed value representing how much burn time is left on the current fuel
	 * item, where 0 means that the item is exhausted and the passed value means that the item is fresh
	 */
	public int getBurnTimeRemainingScaled(int par1) {
		if (this.currentItemBurnTime == 0) {
			this.currentItemBurnTime = 200;
		}
		return this.furnaceBurnTime * par1 / this.currentItemBurnTime;
	}

	public boolean isBurningFurnace() {
		return this.furnaceBurnTime > 0;
	}

	public void updateBurning() {
		boolean var1 = this.furnaceBurnTime > 0;
		@SuppressWarnings("unused") boolean var2 = false;

		if (this.furnaceBurnTime > 0) {
			--this.furnaceBurnTime;
		}
		if (!this.worldObj.isRemote) {
			if (this.furnaceBurnTime == 0 && this.canSmelt()) {
				this.currentItemBurnTime = this.furnaceBurnTime = getItemBurnTime(this.furnaceItemStacks[1]);

				if (this.furnaceBurnTime > 0) {
					var2 = true;

					if (this.furnaceItemStacks[1] != null) {
						--this.furnaceItemStacks[1].stackSize;

						if (this.furnaceItemStacks[1].stackSize == 0) {
							this.furnaceItemStacks[1] = this.furnaceItemStacks[1].getItem().getContainerItem(furnaceItemStacks[1]);
						}
					}
				}
			}
			if (this.isBurningFurnace() && this.canSmelt()) {
				++this.furnaceCookTime;

				if (this.furnaceCookTime == 200) {
					this.furnaceCookTime = 0;
					this.smeltItem();
					var2 = true;
				}
			}
			else {
				this.furnaceCookTime = 0;
			}

			if (var1 != this.furnaceBurnTime > 0) {
				var2 = true;
			}
		}

		//TODO REIMPLEMENT
		/*
		 * if (var2) { this.onInventoryChanged(); } */
	}

	/**
	 * Returns true if the furnace can smelt an item, i.e. has a source item, destination stack isn't full, etc.
	 */
	private boolean canSmelt() {
		if (this.furnaceItemStacks[0] == null) {
			return false;
		}
		else {
			ItemStack var1 = FurnaceRecipes.smelting().getSmeltingResult(this.furnaceItemStacks[0]);
			if (var1 == null)
				return false;
			if (this.furnaceItemStacks[2] == null)
				return true;
			if (!this.furnaceItemStacks[2].isItemEqual(var1))
				return false;
			int result = furnaceItemStacks[2].stackSize + var1.stackSize;
			return (result <= getInventoryStackLimit() && result <= var1.getMaxStackSize());
		}
	}

	/**
	 * Turn one item from the furnace source stack into the appropriate smelted item in the furnace result stack
	 */
	public void smeltItem() {
		if (this.canSmelt()) {
			ItemStack var1 = FurnaceRecipes.smelting().getSmeltingResult(this.furnaceItemStacks[0]);

			if (this.furnaceItemStacks[2] == null) {
				this.furnaceItemStacks[2] = var1.copy();
			}
			else if (this.furnaceItemStacks[2].isItemEqual(var1)) {
				furnaceItemStacks[2].stackSize += var1.stackSize;
			}
			--this.furnaceItemStacks[0].stackSize;
			if (this.furnaceItemStacks[0].stackSize <= 0) {
				this.furnaceItemStacks[0] = null;
			}
		}
	}

	/**
	 * Returns the number of ticks that the supplied fuel item will keep the furnace burning, or 0 if the item isn't fuel
	 */
	public static int getItemBurnTime(ItemStack par0ItemStack) {
		if (par0ItemStack == null) {
			return 0;
		}
		else {
			int var1 = Item.getIdFromItem(par0ItemStack.getItem());
			Item var2 = par0ItemStack.getItem();

			if (par0ItemStack.getItem() instanceof ItemBlock && Block.getBlockFromItem(var2) != null) {
				Block var3 = Block.getBlockFromItem(var2);

				if (var3 == Block.getBlockById(126)) {//126 is wooden slab
					return 150;
				}

				if (var3.getMaterial() == Material.wood) {
					return 300;
				}
			}

			if (var2 instanceof ItemTool && ((ItemTool) var2).getToolMaterialName().equals("WOOD"))
				return 200;
			if (var2 instanceof ItemSword && ((ItemSword) var2).getToolMaterialName().equals("WOOD"))
				return 200;
			if (var1 == Item.getIdFromItem(Items.stick))
				return 100;
			if (var1 == Item.getIdFromItem(Items.coal))
				return 1600;
			if (var1 == Item.getIdFromItem(Items.lava_bucket))
				return 20000;
			if (var1 == Block.getIdFromBlock(Blocks.sapling))//6 is sapling
				return 100;
			if (var1 == Item.getIdFromItem(Items.blaze_rod))
				return 2400;
			return GameRegistry.getFuelValue(par0ItemStack);
		}
	}

	/**
	 * Return true if item is a fuel source (getItemBurnTime() > 0).
	 */
	public static boolean isItemFuel(ItemStack par0ItemStack) {
		return getItemBurnTime(par0ItemStack) > 0;
	}

	/** for the workCart **/
	public int getSizeInventoryWork() {
		return this.furnaceItemStacks.length;
	}

	/** for the freight carts inventory **/
	@Override
	public ItemStack getStackInSlot(int i) {
		return this.furnaceItemStacks[i];
	}

	/**
	 * When some containers are closed they call this on each slot, then drop whatever it returns as an EntityItem - like when you close a workbench GUI.
	 */
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

	/**
	 * Removes from an inventory slot (first arg) up to a specified number (second arg) of items and returns them in a new stack.
	 */
	@Override
	public ItemStack decrStackSize(int par1, int par2) {
		if (this.furnaceItemStacks[par1] != null) {
			ItemStack var3;
			if (this.furnaceItemStacks[par1].stackSize <= par2) {
				var3 = this.furnaceItemStacks[par1];
				this.furnaceItemStacks[par1] = null;
				return var3;
			}
			else {
				var3 = this.furnaceItemStacks[par1].splitStack(par2);
				if (this.furnaceItemStacks[par1].stackSize == 0) {
					this.furnaceItemStacks[par1] = null;
				}
				return var3;
			}
		}
		else {
			return null;
		}
	}

	/**
	 * Sets the given item stack to the specified slot in the inventory (can be crafting or armor sections).
	 */
	@Override
	public void setInventorySlotContents(int par1, ItemStack par2ItemStack) {
		this.furnaceItemStacks[par1] = par2ItemStack;
		if (par2ItemStack != null && par2ItemStack.stackSize > this.getInventoryStackLimit()) {
			par2ItemStack.stackSize = this.getInventoryStackLimit();
		}
	}
	@Override
	public void openInventory() {}

	@Override
	public void closeInventory() {}

	@Override
	public int getSizeInventory() {
		return 0;
	}

	@Override
	public boolean attackEntityFrom(DamageSource damagesource, float i) {
		if (worldObj.isRemote) {
			return true;
		}
		if(this.canBeDestroyedByPlayer(damagesource) || damagesource.getEntity() == null){
			return false;
		}
		super.attackEntityFrom(damagesource, i);
		setRollingDirection(-getRollingDirection());
		setRollingAmplitude(10);
		setBeenAttacked();
		setDamage(getDamage() + i * 10);
		if (getDamage() > 40) {
			if (riddenByEntity != null) {
				riddenByEntity.mountEntity(this);
			}
			this.setDead();
			ServerLogger.deleteWagon(this);
			if(damagesource.getEntity() instanceof EntityPlayer) {
				for(ItemStack stack : furnaceItemStacks){
					if (stack != null) {
						entityDropItem(stack,1);
					}
				}
				dropCartAsItem(((EntityPlayer)damagesource.getEntity()).capabilities.isCreativeMode);
			}
		}
		return true;
	}
	
	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack) {
		return true;
	}
}
