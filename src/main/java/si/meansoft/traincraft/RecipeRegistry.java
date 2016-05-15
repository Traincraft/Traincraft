package si.meansoft.traincraft;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import si.meansoft.traincraft.api.recipes.DistilleryRecipes;
import si.meansoft.traincraft.api.recipes.HearthFurnaceRecipes;
import si.meansoft.traincraft.items.ItemMaterial;

/**
 * @author canitzp
 */
public class RecipeRegistry {

    public static void init(){
        initShaped();
        initShapeless();
        initDistillRecipes();
        initCrafterRecipes();
    }

    private static void initShaped(){

    }

    private static void initShapeless(){
        ItemStack plasticStack = new ItemStack(ItemRegistry.material, 1, ItemMaterial.Materials.PLASTIC.ordinal());
        GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.material, 2, ItemMaterial.Materials.FUEL_CANISTER_EMPTY.ordinal()), plasticStack.copy(), plasticStack.copy(), plasticStack.copy(), plasticStack.copy());
    }

    private static void initDistillRecipes(){
        DistilleryRecipes.addRecipe(new ItemStack(ItemRegistry.material, 1, ItemMaterial.Materials.PLASTIC.ordinal()), new ItemStack(BlockRegistry.oilSand), new FluidStack(FluidRegistry.diesel, 1000), 50, 200);
        DistilleryRecipes.addFillingRecipe(new ItemStack(ItemRegistry.material, 2, ItemMaterial.Materials.FUEL_CANISTER_FULL.ordinal()), new ItemStack(ItemRegistry.material, 2, ItemMaterial.Materials.FUEL_CANISTER_EMPTY.ordinal()), new FluidStack(FluidRegistry.diesel, 1000));
    }

    private static void initCrafterRecipes(){
        //CrafterRecipes.addSteamRecipe(new ItemStack(Blocks.BRICK_BLOCK), null, null, null, null, null, null, null, null, null, null);
    }

    private static void initHearthFurnaceRecipes(){
        HearthFurnaceRecipes.addRecipe(new ItemStack(ItemRegistry.material, 1, 0), new ItemStack(Items.IRON_INGOT), new ItemStack(ItemRegistry.material, 1, 1), 1200);

    }

}
