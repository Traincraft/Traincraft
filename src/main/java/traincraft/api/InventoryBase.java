package traincraft.api;

import net.minecraft.inventory.ISidedInventory;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.common.util.INBTSerializable;
import net.minecraftforge.items.wrapper.SidedInvWrapper;

public class InventoryBase extends InventoryBasic implements INBTSerializable<NBTTagCompound>, ISidedInventory {
    
    public InventoryBase(String title, boolean customName, int slotCount) {
        super(title, customName, slotCount);
    }
    
    public InventoryBase(ITextComponent title, int slotCount) {
        super(title, slotCount);
    }
    
    @Override
    public NBTTagCompound serializeNBT() {
        NBTTagList nbtTagList = new NBTTagList();
        for(int i = 0; i < this.getSizeInventory(); i++){
            if(!this.getStackInSlot(i).isEmpty()){
                NBTTagCompound itemTag = new NBTTagCompound();
                itemTag.setInteger("Slot", i);
                this.getStackInSlot(i).writeToNBT(itemTag);
                nbtTagList.appendTag(itemTag);
            }
        }
        NBTTagCompound nbt = new NBTTagCompound();
        nbt.setTag("Items", nbtTagList);
        nbt.setInteger("Size", this.getSizeInventory());
        return nbt;
    }
    
    @Override
    public void deserializeNBT(NBTTagCompound nbt) {
        NBTTagList tagList = nbt.getTagList("Items", Constants.NBT.TAG_COMPOUND);
        for(int i = 0; i < tagList.tagCount(); i++){
            NBTTagCompound itemTags = tagList.getCompoundTagAt(i);
            int slot = itemTags.getInteger("Slot");
            if(slot >= 0 && slot < this.getSizeInventory()){
                this.setInventorySlotContents(slot, new ItemStack(itemTags));
            }
        }
    }
    
    public static SidedInvWrapper[] getSidedWrappers(ISidedInventory inventory){
        SidedInvWrapper[] ara = new SidedInvWrapper[6];
        for(EnumFacing facing : EnumFacing.VALUES){
            ara[facing.getIndex()] = new SidedInvWrapper(inventory, facing);
        }
        return ara;
    }
    
    @Override
    public int[] getSlotsForFace(EnumFacing side) {
        if (this.getSizeInventory() > 0) {
            int[] ints = new int[this.getSizeInventory()];
            for (int i = 0; i < ints.length; i++) {
                ints[i] = i;
            }
            return ints;
        } else {
            return new int[0];
        }
    }
    
    @Override
    public boolean canInsertItem(int index, ItemStack itemStackIn, EnumFacing direction) {
        return false;
    }
    
    @Override
    public boolean canExtractItem(int index, ItemStack stack, EnumFacing direction) {
        return false;
    }
}
