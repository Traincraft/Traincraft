package si.meansoft.traincraft.tileEntities.crafter;

import net.minecraft.util.ITickable;
import si.meansoft.traincraft.api.recipes.CrafterRecipes;
import si.meansoft.traincraft.blocks.BlockCrafter;
import si.meansoft.traincraft.tileEntities.TileEntityInventory;

/**
 * @author canitzp
 */
public abstract class TileEntityCrafterBase extends TileEntityInventory implements ITickable{

    public TileEntityCrafterBase(String name){
        super(name, 26);
    }

    @Override
    public void update(){
        switch(this.getTier()){
            case STEAM:{
                CrafterRecipes.RecipeHandlerSteam recipeHandler = new CrafterRecipes.RecipeHandlerSteam(getStackInSlot(16), getStackInSlot(17), getStackInSlot(18), getStackInSlot(19), getStackInSlot(20), getStackInSlot(21), getStackInSlot(22), getStackInSlot(23), getStackInSlot(24), getStackInSlot(25));
                CrafterRecipes.craftSteam(this, recipeHandler);
                break;
            }
            case DIESEL:{
                CrafterRecipes.Recipe recipeHandler = new CrafterRecipes.Recipe(getStackInSlot(16), getStackInSlot(17), getStackInSlot(18), getStackInSlot(19), getStackInSlot(20), getStackInSlot(21), getStackInSlot(22), getStackInSlot(23), getStackInSlot(24), getStackInSlot(25));
                CrafterRecipes.craftDiesel(this, recipeHandler);
                break;
            }
            case ELECTRO:{
                CrafterRecipes.RecipeHandlerElectro recipeHandler = new CrafterRecipes.RecipeHandlerElectro(getStackInSlot(16), getStackInSlot(17), getStackInSlot(18), getStackInSlot(19), getStackInSlot(20), getStackInSlot(21), getStackInSlot(22), getStackInSlot(23), getStackInSlot(24), getStackInSlot(25));
                CrafterRecipes.craftElectro(this, recipeHandler);
                break;
            }
        }
    }

    public abstract BlockCrafter.CrafterTier getTier();

}
