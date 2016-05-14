package si.meansoft.traincraft;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import si.meansoft.traincraft.api.recipes.DistilleryRecipes;
import si.meansoft.traincraft.api.recipes.HearthFurnaceRecipes;

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
        GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.fuelCanisterEmpty, 2), new ItemStack(ItemRegistry.plastic), new ItemStack(ItemRegistry.plastic), new ItemStack(ItemRegistry.plastic), new ItemStack(ItemRegistry.plastic));
    }

    private static void initDistillRecipes(){
        //TODO Swap apple for graphite and gold ingot for steel
        HearthFurnaceRecipes.addRecipe(new ItemStack(Items.APPLE), new ItemStack(Items.IRON_INGOT), new ItemStack(Items.GOLD_INGOT), 1200);

        DistilleryRecipes.addRecipe(new ItemStack(ItemRegistry.plastic), new ItemStack(BlockRegistry.oilSand), new FluidStack(FluidRegistry.diesel, 1000), 50, 200);
        DistilleryRecipes.addFillingRecipe(new ItemStack(ItemRegistry.fuelCanister), new ItemStack(ItemRegistry.fuelCanisterEmpty), new FluidStack(FluidRegistry.diesel, 1000));
    }

    private static void initCrafterRecipes(){
        //CrafterRecipes.addSteamRecipe(new ItemStack(Blocks.BRICK_BLOCK), null, null, null, null, null, null, null, null, null, null);
    }

}
