package traincraft.api;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;
import java.util.function.Function;

public class SlotSpecific extends Slot {
    
    private final Function<ItemStack, Boolean> allowedItemStack;
    
    public SlotSpecific(IInventory inventoryIn, int index, int x, int y, Function<ItemStack, Boolean> allowedItemStack) {
        super(inventoryIn, index, x, y);
        this.allowedItemStack = allowedItemStack;
    }
    
    @Override
    public boolean isItemValid(@Nonnull ItemStack stack) {
        return this.allowedItemStack.apply(stack);
    }
}
