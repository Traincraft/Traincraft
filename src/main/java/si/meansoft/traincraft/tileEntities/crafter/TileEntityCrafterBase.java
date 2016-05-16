package si.meansoft.traincraft.tileentities.crafter;

import net.minecraft.util.ITickable;
import si.meansoft.traincraft.api.recipes.CrafterRecipes;
import si.meansoft.traincraft.api.recipes.CrafterRecipes.Recipe;
import si.meansoft.traincraft.blocks.BlockCrafter;
import si.meansoft.traincraft.tileentities.TileEntityInventory;

/**
 * @author canitzp
 */
public abstract class TileEntityCrafterBase extends TileEntityInventory implements ITickable{

    public TileEntityCrafterBase(String name){
        super(name, 26);
    }

    @Override
    public void update(){
        Recipe recipe = new Recipe(getStackInSlot(16), getStackInSlot(17), getStackInSlot(18), getStackInSlot(19), getStackInSlot(20), getStackInSlot(21), getStackInSlot(22), getStackInSlot(23), getStackInSlot(24), getStackInSlot(25));
        switch(this.getTier()){
            case STEAM:{
                CrafterRecipes.craftSteam(this, recipe);
                break;
            }
            case DIESEL:{
                CrafterRecipes.craftDiesel(this, recipe);
                break;
            }
            case ELECTRO:{
                CrafterRecipes.craftElectro(this, recipe);
                break;
            }
        }
    }

    public abstract BlockCrafter.CrafterTier getTier();

}
