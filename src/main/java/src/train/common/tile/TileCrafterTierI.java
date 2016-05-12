package src.train.common.tile;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.Packet;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.common.util.ForgeDirection;
import src.train.common.core.handlers.PacketHandler;
import src.train.common.core.interfaces.ITier;
import src.train.common.core.managers.TierRecipe;
import src.train.common.core.managers.TierRecipeManager;
import src.train.common.library.Info;

public class TileCrafterTierI extends TileEntity implements IInventory, ITier {
	private Random rand;
	private ItemStack[] crafterInventory;

	private ForgeDirection facing;
	private final int Tier = 1;
	private static List<ItemStack> resultList;
	private static List<ItemStack> knownRecipes = new ArrayList<ItemStack>();
	private static int[] slotSelected;

	public TileCrafterTierI() {
		crafterInventory = new ItemStack[26];
		this.rand = new Random();
		this.resultList = new ArrayList<ItemStack>();
		slotSelected = new int[8];
	}

	@Override
	public int getSizeInventory() {
		return crafterInventory.length;
	}

	@Override
	public ItemStack getStackInSlot(int i) {
		return crafterInventory[i];
	}

	public List<ItemStack> getResultList() {
		return resultList;
	}

	@Override
	public ItemStack decrStackSize(int i, int j) {
		if (crafterInventory[i] != null) {
			if (crafterInventory[i].stackSize <= j) {
				ItemStack itemstack = crafterInventory[i];
				crafterInventory[i] = null;
				return itemstack;
			}
			ItemStack itemstack1 = crafterInventory[i].splitStack(j);
			if (crafterInventory[i].stackSize == 0) {
				crafterInventory[i] = null;
			}
			return itemstack1;
		}
		else {
			return null;
		}
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int i) {
		if (crafterInventory[i] != null) {
			ItemStack stack = this.crafterInventory[i];
			crafterInventory[i] = null;
			return stack;
		}
		else {
			return null;
		}
	}

	@Override
	public void setInventorySlotContents(int i, ItemStack itemstack) {
		crafterInventory[i] = itemstack;
		if (itemstack != null && itemstack.stackSize > getInventoryStackLimit()) {
			itemstack.stackSize = getInventoryStackLimit();
		}
	}

	@Override
	public String getInventoryName() {
		return "TierI";
	}

	@Override
	public void readFromNBT(NBTTagCompound nbtTag) {
		super.readFromNBT(nbtTag);
		facing = ForgeDirection.getOrientation(nbtTag.getByte("Orientation"));
		slotSelected = nbtTag.getIntArray("Selected");
		NBTTagList nbttaglist = nbtTag.getTagList("Items", Constants.NBT.TAG_COMPOUND);
		this.crafterInventory = new ItemStack[this.getSizeInventory()];
		for (int i = 0; i < nbttaglist.tagCount(); i++) {
			NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
			byte byte0 = nbttagcompound1.getByte("Slot");
			if (byte0 >= 0 && byte0 < crafterInventory.length) {
				this.crafterInventory[byte0] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
			}
		}

		NBTTagList nbttaglist2 = nbtTag.getTagList("Known", Constants.NBT.TAG_COMPOUND);
		for (int i = 0; i < nbttaglist2.tagCount(); i++) {
			NBTTagCompound nbttagcompound2 = nbttaglist2.getCompoundTagAt(i);
			byte byte1 = nbttagcompound2.getByte("Recipe");
			if (byte1 >= 0) {
				if (!listContains(knownRecipes, ItemStack.loadItemStackFromNBT(nbttagcompound2))) {
					knownRecipes.add(ItemStack.loadItemStackFromNBT(nbttagcompound2));
				}
			}
		}
	}

	@Override
	public void writeToNBT(NBTTagCompound nbtTag) {
		super.writeToNBT(nbtTag);
		if(facing!=null){
			nbtTag.setByte("Orientation", (byte) facing.ordinal());
		}else{
			nbtTag.setByte("Orientation", (byte) ForgeDirection.NORTH.ordinal());
		}
		nbtTag.setIntArray("Selected", slotSelected);
		NBTTagList nbttaglist = new NBTTagList();
		for (int i = 0; i < this.crafterInventory.length; i++) {
			if (this.crafterInventory[i] != null) {
				NBTTagCompound nbttagcompound1 = new NBTTagCompound();
				nbttagcompound1.setByte("Slot", (byte) i);
				this.crafterInventory[i].writeToNBT(nbttagcompound1);
				nbttaglist.appendTag(nbttagcompound1);
			}
		}
		nbtTag.setTag("Items", nbttaglist);

		NBTTagList nbttaglist2 = new NBTTagList();
		if (knownRecipes != null) {
			for (int i = 0; i < knownRecipes.size(); i++) {
				NBTTagCompound nbttagcompound2 = new NBTTagCompound();
				nbttagcompound2.setByte("Recipe", (byte) i);
				knownRecipes.get(i).writeToNBT(nbttagcompound2);
				nbttaglist2.appendTag(nbttagcompound2);
			}
			nbtTag.setTag("Known", nbttaglist2);
		}
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@Override
	public void markDirty() {
		resultList.clear();
		for (int i = 10; i < crafterInventory.length - 8; i++) {
			crafterInventory[i] = null;
		}

		List<TierRecipe> recipes = TierRecipeManager.getInstance().getTierRecipeList(1);
		int count = 0;
		for (int j = 0; j < recipes.size(); j++) {
			ItemStack stack = recipes.get(j).hasComponents(crafterInventory);
			if (stack != null) {
				resultList.add(stack);
				crafterInventory[count + 10] = new ItemStack(stack.getItem(), 1, 0);
				count++;
			}
		}

		for (int i = 0; i < resultList.size(); i++) {
			if (!listContains(knownRecipes, resultList.get(i))) {
				knownRecipes.add(resultList.get(i));
			}
		}
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
		if (facing != face)
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

	public void handlePacketDataFromServer(byte orientation) {
		facing = ForgeDirection.getOrientation(orientation);
	}

	private boolean listContains(List<ItemStack> list, ItemStack stack) {
		for (int i = 0; i < list.size(); i++) {
			if (Item.getIdFromItem(list.get(i).getItem()) == Item.getIdFromItem(stack.getItem())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int Tier() {
		return Tier;
	}

	@Override
	public List knownRecipes() {
		return knownRecipes;
	}

	@Override
	public int[] getSlotSelected() {
		return slotSelected;
	}

	@Override
	public void setSlotSelected(int[] selected) {
		slotSelected = selected;
	}

	@Override
	public String getGUIName() {
		return "Iron age";
	}

	@Override
	public String getGUITexture() {
		return Info.TEX_TIER_I;
	}

	@Override
	public boolean hasCustomInventoryName() {
		return false;
	}

	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack) {
		return true;
	}
	
	@Override
	public void updateEntity() {
		super.updateEntity();
	}
}