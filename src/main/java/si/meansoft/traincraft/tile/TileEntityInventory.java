package si.meansoft.traincraft.tile;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import si.meansoft.traincraft.Util;

/**
 * @author canitzp
 */
public class TileEntityInventory extends TileEntityBase implements ISidedInventory {

    public ItemStack[] slots;
    public String invName;

    public TileEntityInventory(String name, int slotAmount){
        super(name);
        slots = new ItemStack[slotAmount];
        this.invName = "Inventory" + name;
    }

    @Override
    public int[] getSlotsForFace(EnumFacing side) {
        if(this.slots.length > 0){
            int[] theInt = new int[slots.length];
            for(int i = 0; i < theInt.length; i++){
                theInt[i] = i;
            }
            return theInt;
        }
        else{
            return new int[0];
        }
    }

    @Override
    public boolean canInsertItem(int index, ItemStack itemStackIn, EnumFacing direction) {
        return true;
    }

    @Override
    public boolean canExtractItem(int index, ItemStack stack, EnumFacing direction) {
        return true;
    }

    @Override
    public int getSizeInventory() {
        return slots.length;
    }

    @Override
    public ItemStack getStackInSlot(int index) {
        return this.slots[index];
    }

    @Override
    public ItemStack decrStackSize(int index, int count) {
        if(slots[index] != null){
            ItemStack stackAt;
            if(slots[index].stackSize <= count){
                stackAt = slots[index];
                slots[index] = null;
                this.markDirty();
                return stackAt;
            }
            else{
                stackAt = slots[index].splitStack(count);
                if(slots[index].stackSize == 0){
                    slots[index] = null;
                }
                this.markDirty();
                return stackAt;
            }
        }
        return null;
    }

    public void incrStackSize(int index, int count) {
        if(slots[index] != null) {
            this.setInventorySlotContents(index, new ItemStack(slots[index].getItem(), slots[index].stackSize + count, slots[index].getItemDamage()));
        }
    }

    @Override
    public ItemStack removeStackFromSlot(int index) {
        return this.slots[index] = null;
    }


    @Override
    public void setInventorySlotContents(int index, ItemStack stack) {
        if(index >= 0 && index <= this.slots.length)
            this.slots[index] = stack;
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }


    @Override
    public boolean isUseableByPlayer(EntityPlayer player) {
        return player.getDistanceSq(this.getPos().getX() + 0.5D, this.pos.getY() + 0.5D, this.pos.getZ() + 0.5D) <= 64 && !this.isInvalid() && this.worldObj.getTileEntity(this.pos) == this;
    }

    @Override
    public void openInventory(EntityPlayer player) {

    }

    @Override
    public void closeInventory(EntityPlayer player) {

    }

    @Override
    public boolean isItemValidForSlot(int index, ItemStack stack) {
        return true;
    }

    @Override
    public int getField(int id) {
        return 0;
    }

    @Override
    public void setField(int id, int value) {

    }

    @Override
    public int getFieldCount() {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public String getRegisterName() {
        return this.invName;
    }

    @Override
    public String getName(){
        return this.invName;
    }

    @Override
    public boolean hasCustomName() {
        return false;
    }

    @Override
    public ITextComponent getDisplayName() {
        return new TextComponentString(this.invName);
    }

    @Override
    public void writeToNBT(NBTTagCompound compound, Util.NBTType type) {
        if(type.save()){
            if(this.slots.length > 0){
                NBTTagList tagList = new NBTTagList();
                for(int currentIndex = 0; currentIndex < slots.length; currentIndex++){
                    NBTTagCompound tagCompound = new NBTTagCompound();
                    tagCompound.setByte("Slot", (byte)currentIndex);
                    if(slots[currentIndex] != null){
                        slots[currentIndex].writeToNBT(tagCompound);
                    }
                    tagList.appendTag(tagCompound);
                }
                compound.setTag("Items", tagList);
            }
        }
        super.writeToNBT(compound, type);
    }

    @Override
    public void readFromNBT(NBTTagCompound compound, Util.NBTType type) {
        super.readFromNBT(compound, type);
        if(type.save()){
            if(this.slots.length > 0){
                NBTTagList tagList = compound.getTagList("Items", 10);
                for(int i = 0; i < tagList.tagCount(); i++){
                    NBTTagCompound tagCompound = tagList.getCompoundTagAt(i);
                    byte slotIndex = tagCompound.getByte("Slot");
                    if(slotIndex >= 0 && slotIndex < slots.length){
                        slots[slotIndex] = ItemStack.loadItemStackFromNBT(tagCompound);
                    }
                }
            }
        }
    }

    public int getNextFreeSlot(int slotIDMin, int slotIDMax){
        for(int i = slotIDMin; i <= slotIDMax; i++){
            ItemStack stack = getStackInSlot(i);
            if(stack == null){
                return i;
            }
        }
        return -1;
    }
}
