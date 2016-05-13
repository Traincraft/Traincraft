package si.meansoft.traincraft;


/**
 * @author canitzp
 */
public class RecipeRegistry {

    public static void init(){
        initDistillRecipes();
        initCrafterRecipes();
    }

    private static void initDistillRecipes(){
        //DistilleryRecipes.addRecipe(new ItemStack(Items.APPLE), new ItemStack(BlockRegistry.oilSand), new FluidStack(FluidRegistry.WATER, 1000), 50, 500);
    }

    private static void initCrafterRecipes(){
        //CrafterRecipes.addSteamRecipe(new ItemStack(Blocks.BRICK_BLOCK), null, null, null, null, null, null, null, null, null, null);
    }

}
