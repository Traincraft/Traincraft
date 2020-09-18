package traincraft.api;

import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;

public interface IDummyRecipe extends IRecipe {
    
    @Override
    default boolean matches(InventoryCrafting inv, World worldIn){
        return false;
    }
    
    @Override
    default ItemStack getCraftingResult(InventoryCrafting inv){
        return ItemStack.EMPTY;
    }
    
    @Override
    default boolean canFit(int width, int height){
        return false;
    }
    
    @Override
    default ItemStack getRecipeOutput(){
        return ItemStack.EMPTY;
    }
    
    /**
     * Method to define if this recipe is shown in the recipe book.
     * Setting this to true means that it is ignored in the recipe book, which is exactly the behaviour we want.
     */
    @Override
    default boolean isDynamic(){
        return true;
    }
}
