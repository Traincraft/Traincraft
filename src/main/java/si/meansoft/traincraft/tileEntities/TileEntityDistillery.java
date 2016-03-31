package si.meansoft.traincraft.tileEntities;

import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.ITickable;
import net.minecraftforge.fluids.FluidTank;
import si.meansoft.traincraft.api.recipes.DistilleryRecipes;

/**
 * @author canitzp
 */
public class TileEntityDistillery extends TileEntityInventory implements ITickable {

    public FluidTank tank = new FluidTank(16000);
    public int currentBurn, currentCookTime, maxBurnTime, maxCookTime;
    public ItemStack currentBurnStack;

    public TileEntityDistillery() {
        super("InventoryDistillery", 6);
    }

    public boolean isBurning(){
        return currentBurn > 0;
    }

    public boolean isCooking(){
        return currentCookTime > 0;
    }

    /**
     * Like the old updateEntity(), except more generic.
     */
    @Override
    public void update() {
        if(!this.worldObj.isRemote){
            ItemStack input = this.getStackInSlot(0);
            ItemStack fuel = this.getStackInSlot(1);
            ItemStack output = this.getStackInSlot(4);

            //Burn
            if(fuel != null && (!DistilleryRecipes.getRecipe(input).isNull || this.currentBurnStack != null)){
                if(currentBurn <= 0){
                    this.decrStackSize(1, 1);
                    this.currentBurn = TileEntityFurnace.getItemBurnTime(fuel);
                } else {
                    this.currentBurn--;
                }
            }

            //Distill
            if (!this.isCooking() && input != null && isBurning()) {
                DistilleryRecipes.RecipeHandler recipe = DistilleryRecipes.getRecipe(input);
                if (!recipe.isNull && this.tank.fill(recipe.outputFluid, false) <= this.tank.getCapacity()) {
                    this.decrStackSize(0, 1);
                    this.currentCookTime = recipe.burnTime;
                    this.currentBurnStack = recipe.outputStack;
                }
            } else {
                if (this.currentCookTime == 1) {
                    if (output == null) {
                        DistilleryRecipes.RecipeHandler recipe = DistilleryRecipes.getRecipe(this.currentBurnStack);
                        this.setInventorySlotContents(4, this.currentBurnStack);
                        this.tank.fill(recipe.outputFluid, true);
                        this.currentBurnStack = null;
                        this.currentCookTime--;
                        this.worldObj.spawnEntityInWorld(new EntityXPOrb(this.worldObj, (double) this.getPos().getX(), (double) this.getPos().getY(), (double) this.getPos().getZ(), (int)recipe.outputExp));
                    } else if (output.isItemEqual(this.currentBurnStack)) {
                        if (output.copy().stackSize + this.currentBurnStack.stackSize <= this.getInventoryStackLimit()) {
                            this.incrStackSize(4, this.currentBurnStack.stackSize);
                            this.currentBurnStack = null;
                            this.currentCookTime--;
                        }
                    }
                } else {
                    this.currentCookTime--;
                }
            }

        }
    }

}
