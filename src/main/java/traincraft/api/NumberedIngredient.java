package traincraft.api;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;

import javax.annotation.Nullable;

public class NumberedIngredient extends Ingredient {
    
    public static final NumberedIngredient EMPTY = new NumberedIngredient(0, ItemStack.EMPTY);
    
    private int count;
    
    public NumberedIngredient(int size, int count){
        super(size);
        this.count = count;
    }
    
    public NumberedIngredient(int count, ItemStack... stacks){
        super(stacks);
        this.count = count;
    }
    
    @Override
    public boolean apply(@Nullable ItemStack stack){
        return super.apply(stack) && (stack != null && stack.getCount() >= this.count);
    }
    
    public int getCount(){
        return count;
    }
    
    public boolean isEmpty(){
        return this == EMPTY || this.getCount() == 0 || this.apply(ItemStack.EMPTY);
    }
    
}
