package si.meansoft.traincraft.tileEntities;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ITickable;
import si.meansoft.traincraft.api.recipes.CrafterRecipes;
import si.meansoft.traincraft.blocks.BlockCrafter;

/**
 * @author canitzp
 */
public class TileEntityCrafter extends TileEntityInventory implements ITickable{

    public BlockCrafter.CrafterTier tier;

    public TileEntityCrafter(){
        super("crafterSteam", 26);
    }

    public TileEntityCrafter(BlockCrafter.CrafterTier tier) {
        super("crafterSteam", 26);
        this.tier = tier;
    }

    @Override
    public void update(){
        switch(tier){
            case STEAM:{
                CrafterRecipes.RecipeHandlerSteam recipeHandler = new CrafterRecipes.RecipeHandlerSteam(getStackInSlot(16), getStackInSlot(17), getStackInSlot(18), getStackInSlot(19), getStackInSlot(20), getStackInSlot(21), getStackInSlot(22), getStackInSlot(23), getStackInSlot(24), getStackInSlot(25));
                CrafterRecipes.craftSteam(this, recipeHandler);
                break;
            }
            case DIESEL:{
                CrafterRecipes.RecipeHandlerDiesel recipeHandler = new CrafterRecipes.RecipeHandlerDiesel(getStackInSlot(16), getStackInSlot(17), getStackInSlot(18), getStackInSlot(19), getStackInSlot(20), getStackInSlot(21), getStackInSlot(22), getStackInSlot(23), getStackInSlot(24), getStackInSlot(25));
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

    @Override
    public void writeToNBT(NBTTagCompound compound){
        compound.setInteger("CrafterTier", this.tier.getID());
        super.writeToNBT(compound);
    }

    @Override
    public void readFromNBT(NBTTagCompound compound){
        this.tier = BlockCrafter.CrafterTier.getTierFromInt(compound.getInteger("CrafterTier"));
        super.readFromNBT(compound);
    }
}
