package train.common.wellcar;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.Constants;

import java.util.ArrayList;

public class TileFiftyThreeFootContainer extends TileEntity implements IInventory {
    public ItemStack[] inventory;
    public int directionPlaced;
    public int currentColor = 0;

    public TileFiftyThreeFootContainer() {
        this.inventory = new ItemStack[this.getSizeInventory()];
    }

    public TileFiftyThreeFootContainer(int pl) {
        this.inventory = new ItemStack[this.getSizeInventory()];
        this.directionPlaced = pl;
    }



    @Override
    public int getSizeInventory() {
        return 45;
    }

    @Override
    public ItemStack getStackInSlot(int index) {
        if (index < 0 || index >= this.getSizeInventory())
            return null;
        return this.inventory[index];
    }

    @Override
    public ItemStack decrStackSize(int index, int count) {
        if (this.getStackInSlot(index) != null) {
            ItemStack itemstack;

            if (this.getStackInSlot(index).stackSize <= count) {
                itemstack = this.getStackInSlot(index);
                this.setInventorySlotContents(index, null);
                this.markDirty();
                return itemstack;
            } else {
                itemstack = this.getStackInSlot(index).splitStack(count);

                if (this.getStackInSlot(index).stackSize <= 0) {
                    this.setInventorySlotContents(index, null);
                } else {
                    //Just to show that changes happened
                    this.setInventorySlotContents(index, this.getStackInSlot(index));
                }

                this.markDirty();
                return itemstack;
            }
        } else {
            return null;
        }
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int index) {
        ItemStack stack = this.getStackInSlot(index);
        this.setInventorySlotContents(index, null);
        return stack;
    }

    @Override
    public void setInventorySlotContents(int index, ItemStack stack) {
        if (index < 0 || index >= this.getSizeInventory())
            return;

        if (stack != null && stack.stackSize > this.getInventoryStackLimit())
            stack.stackSize = this.getInventoryStackLimit();

        if (stack != null && stack.stackSize == 0)
            stack = null;

        this.inventory[index] = stack;
        this.markDirty();
    }



    @Override
    public String getInventoryName() {
        return "53 Foot Container";
    }

    @Override
    public boolean hasCustomInventoryName() {
        return false;
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer player) {
        return true;
    }

    @Override
    public void openInventory() {

    }

    @Override
    public void closeInventory() {

    }

    @Override
    public boolean isItemValidForSlot(int p_94041_1_, ItemStack p_94041_2_) {
        return true;
    }

    @Override
    public void readFromNBT(NBTTagCompound nbt)
    {
        super.readFromNBT(nbt);
        NBTTagList list = nbt.getTagList("Items", Constants.NBT.TAG_COMPOUND);
        inventory = new ItemStack[getSizeInventory()];

        for (int i = 0; i < list.tagCount(); ++i) { NBTTagCompound comp = list.getCompoundTagAt(i); int j = comp.getByte("Slot") & 255; if (j >= 0 && j < inventory.length)
        {
            inventory[j] = ItemStack.loadItemStackFromNBT(comp);
        }

        }
        currentColor = nbt.getInteger("currentColor");
    }

    @Override
    public void writeToNBT(NBTTagCompound nbt)
    {
        super.writeToNBT(nbt);
        NBTTagList list = new NBTTagList();

        for (int i = 0; i < inventory.length; ++i)
        {
            if (inventory[i] != null)
            {
                NBTTagCompound comp = new NBTTagCompound();
                comp.setByte("Slot", (byte)i);
                inventory[i].writeToNBT(comp);
                list.appendTag(comp);
            }
        }

        nbt.setTag("Items", list);
        nbt.setInteger("currentColor", currentColor);
        nbt.setString("currentColorString", getAvailableColors().get(currentColor));
    }

    public ArrayList<String> getAvailableColors() {
        ArrayList<String> leColors = new ArrayList<String>();
        leColors.add("generic");
        leColors.add("PS");
        leColors.add("cosco");
        leColors.add("BN1");
        leColors.add("BN2");
        leColors.add("mannco");
        return leColors;
    }

    public void goToNextColor() {
        if (getAvailableColors().size() > 0) {
            if (currentColor > getAvailableColors().size() -5) {
                currentColor = 0;
            } else {
                currentColor++;
            }
        }

    }

}

