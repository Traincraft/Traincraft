/*
 * This file ("TileEntityInventory.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/blob/master/LICENSE.md)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2016
 */

package si.meansoft.traincraft.tile;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.wrapper.SidedInvWrapper;
import si.meansoft.traincraft.Util;

/**
 * @author canitzp
 */
public class TileEntityInventory extends TileEntityBase implements ISidedInventory {

    public ItemStack[] slots;
    public String invName;
    public SidedInvWrapper[] invWrappers = new SidedInvWrapper[6];

    public TileEntityInventory(String name, int slotAmount){
        super(name);
        slots = new ItemStack[slotAmount];
        this.invName = "Inventory" + name;
        for(EnumFacing side : EnumFacing.values()){
            this.invWrappers[side.getIndex()] = new SidedInvWrapper(this, side);
        }
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
    public boolean isEmpty() {
        return false;
    }

    @Override
    public ItemStack getStackInSlot(int index) {
        return this.slots[index] != null ? this.slots[index] : ItemStack.EMPTY;
    }

    @Override
    public ItemStack decrStackSize(int index, int count) {
        if(slots[index] != ItemStack.EMPTY){
            ItemStack stackAt;
            if(slots[index].getCount() <= count){
                stackAt = slots[index];
                slots[index] = ItemStack.EMPTY;
                this.markDirty();
                return stackAt;
            }
            else{
                stackAt = slots[index].splitStack(count);
                if(slots[index].getCount() == 0){
                    slots[index] = ItemStack.EMPTY;
                }
                this.markDirty();
                return stackAt;
            }
        }
        return  ItemStack.EMPTY;
    }

    public void incrStackSize(int index, int count) {
        if(slots[index] != ItemStack.EMPTY) {
            this.setInventorySlotContents(index, new ItemStack(slots[index].getItem(), slots[index].getCount() + count, slots[index].getItemDamage()));
        }
    }

    @Override
    public ItemStack removeStackFromSlot(int index) {
        return this.slots[index] = ItemStack.EMPTY;
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
    public boolean isUsableByPlayer(EntityPlayer player) {
        return player.getDistanceSq(this.getPos().getX() + 0.5D, this.pos.getY() + 0.5D, this.pos.getZ() + 0.5D) <= 64 && !this.isInvalid() && this.world.getTileEntity(this.pos) == this;
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
            if(this.getSizeInventory() > 0){
                NBTTagList tagList = new NBTTagList();
                for(int currentIndex = 0; currentIndex < this.getSizeInventory(); currentIndex++){
                    NBTTagCompound tagCompound = new NBTTagCompound();
                    tagCompound.setByte("Slot", (byte)currentIndex);
                    if(this.getStackInSlot(currentIndex) != ItemStack.EMPTY){
                        this.getStackInSlot(currentIndex).writeToNBT(tagCompound);
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
            if(this.getSizeInventory() > 0){
                NBTTagList tagList = compound.getTagList("Items", 10);
                for(int i = 0; i < tagList.tagCount(); i++){
                    NBTTagCompound tagCompound = tagList.getCompoundTagAt(i);
                    byte slotIndex = tagCompound.getByte("Slot");
                    if(slotIndex >= 0 && slotIndex < this.getSizeInventory()){
                        slots[slotIndex] = new ItemStack(tagCompound);
                    }
                }
            }
        }
    }

    public int getNextFreeSlot(int slotIDMin, int slotIDMax){
        for(int i = slotIDMin; i <= slotIDMax; i++){
            ItemStack stack = getStackInSlot(i);
            if(stack == ItemStack.EMPTY){
                return i;
            }
        }
        return -1;
    }

    @Override
    public <T> T getCapability(Capability<T> capability, EnumFacing facing){
        if(capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY){
            return (T) this.invWrappers[facing.getIndex()];
        }
        return super.getCapability(capability, facing);
    }

    @Override
    public boolean hasCapability(Capability<?> capability, EnumFacing facing){
        return this.getCapability(capability, facing) != null;
    }
}
