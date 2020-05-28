package traincraft.api;

import net.minecraft.inventory.InventoryBasic;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;

import javax.annotation.Nonnull;
import java.util.function.BiFunction;

public class InventorySpecific extends InventoryBase {
    
    private final BiFunction<Integer, ItemStack, Boolean> validationFunction;
    
    public InventorySpecific(String title, boolean customName, int slotCount, BiFunction<Integer, ItemStack, Boolean> validationFunction) {
        super(title, customName, slotCount);
        this.validationFunction = validationFunction;
    }
    
    public InventorySpecific(ITextComponent title, int slotCount, BiFunction<Integer, ItemStack, Boolean> validationFunction) {
        super(title, slotCount);
        this.validationFunction = validationFunction;
    }
    
    @Nonnull
    @Override
    public ItemStack addItem(@Nonnull ItemStack stack) {
        ItemStack copyStack = stack.copy();
        for(int i = 0; i < this.getSizeInventory(); ++i){
            if(this.isItemValidForSlot(i, copyStack)){
                ItemStack stackInSlot = this.getStackInSlot(i);
                if(stackInSlot.isEmpty()){
                    this.setInventorySlotContents(i, copyStack);
                    this.markDirty();
                    return ItemStack.EMPTY;
                }
                if(ItemStack.areItemsEqual(stackInSlot, copyStack)){
                    int maxCountInSlot = Math.min(this.getInventoryStackLimit(), stackInSlot.getMaxStackSize());
                    int countToTransfer = Math.min(copyStack.getCount(), maxCountInSlot - stackInSlot.getCount());
    
                    if(countToTransfer > 0){
                        stackInSlot.grow(countToTransfer);
                        copyStack.shrink(countToTransfer);
        
                        if(copyStack.isEmpty()){
                            this.markDirty();
                            return ItemStack.EMPTY;
                        }
                    }
                }
            }
        }
        if(copyStack.getCount() != stack.getCount()){
            this.markDirty();
        }
    
        return copyStack;
    }
    
    @Override
    public boolean isItemValidForSlot(int index, ItemStack stack) {
        return this.validationFunction.apply(index, stack);
    }
}
