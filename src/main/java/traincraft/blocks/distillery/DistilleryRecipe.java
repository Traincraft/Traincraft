package traincraft.blocks.distillery;

import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidStack;

public class DistilleryRecipe extends net.minecraftforge.registries.IForgeRegistryEntry.Impl<IRecipe> implements IRecipe {
    
    private final Ingredient inputIngredient;
    private final int inputAmount;
    private final int burnTime;
    private final ItemStack outputStack;
    private final FluidStack outputFluid;
    
    public DistilleryRecipe(Ingredient inputStack, int inputAmount, int burnTime, ItemStack outputStack, FluidStack outputFluid) {
        this.inputIngredient = inputStack;
        this.inputAmount = inputAmount;
        this.burnTime = burnTime;
        this.outputStack = outputStack;
        this.outputFluid = outputFluid;
    }
    
    public Ingredient getInputIngredient() {
        return inputIngredient;
    }
    
    public int getInputAmount() {
        return inputAmount;
    }
    
    public int getBurnTime() {
        return burnTime;
    }
    
    public ItemStack getOutputStack() {
        return outputStack;
    }
    
    public FluidStack getOutputFluid() {
        return outputFluid;
    }
    
    @Override
    public boolean matches(InventoryCrafting inv, World worldIn) {
        return false;
    }
    
    @Override
    public ItemStack getCraftingResult(InventoryCrafting inv) {
        return this.outputStack;
    }
    
    @Override
    public boolean canFit(int width, int height) {
        return false;
    }
    
    @Override
    public ItemStack getRecipeOutput() {
        return this.outputStack;
    }
    
}
