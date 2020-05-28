package traincraft.api;

import net.minecraft.inventory.InventoryBasic;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.common.util.INBTSerializable;

public class InventoryBase extends InventoryBasic implements INBTSerializable<NBTTagCompound> {
    
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
}
