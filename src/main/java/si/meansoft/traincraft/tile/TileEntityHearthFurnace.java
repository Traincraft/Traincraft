package si.meansoft.traincraft.tile;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.ITickable;
import si.meansoft.traincraft.api.recipes.HearthFurnaceRecipes;
import si.meansoft.traincraft.api.recipes.HearthFurnaceRecipes.Recipe;
import si.meansoft.traincraft.blocks.BlockDistillery;

public class TileEntityHearthFurnace extends TileEntityInventory implements ITickable{

    public int fuelTime;
    public int maxFuelTime;

    public int processTime;
    public int maxProcessTime;

    private int lastFuelTime;
    private int lastMaxFuelTime;
    private int lastProcessTime;
    private int lastMaxProcessTime;

    public static final int FUEL_SLOT = 0;
    public static final int LEFT_INPUT_SLOT = 1;
    public static final int RIGHT_INPUT_SLOT = 2;
    public static final int OUTPUT_SLOT = 3;

    public TileEntityHearthFurnace(){
        super("HearthFurnace", 4);
    }

    @Override
    public void update(){
        if(!this.worldObj.isRemote){
            boolean lastIsBurning = this.fuelTime > 0;

            this.doFuelBurning();

            if(lastIsBurning != this.fuelTime > 0){
                IBlockState state = this.worldObj.getBlockState(pos);
                this.worldObj.setBlockState(pos, state.getBlock().getDefaultState().withProperty(BlockDistillery.ACTIVE, this.fuelTime > 0).withProperty(BlockDistillery.FACING, state.getValue(BlockDistillery.FACING)), 3);
            }

            if(this.fuelTime > 0 && this.canProcess()){
                if(this.maxProcessTime <= 0){
                    Recipe recipe = this.getRecipeForInputs();
                    if(recipe != null){
                        this.maxProcessTime = recipe.processTime;
                        this.markDirty();
                    }
                }
                else{
                    this.processTime++;
                    if(this.processTime >= this.maxProcessTime){
                        this.process();
                        this.markDirty();

                        this.processTime = 0;
                        this.maxProcessTime = 0;
                    }
                }

            }
            else if(this.processTime > 0){
                this.processTime -= 5;
                if(this.processTime <= 0){
                    this.processTime = 0;
                    this.maxProcessTime = 0;
                }
            }

            if(this.processTime != this.lastProcessTime || this.maxProcessTime != this.lastMaxProcessTime || this.fuelTime != this.lastFuelTime || this.maxFuelTime != this.lastMaxFuelTime){
                this.lastMaxFuelTime = this.maxFuelTime;
                this.lastFuelTime = this.fuelTime;
                this.lastProcessTime = this.processTime;
                this.lastMaxProcessTime = this.lastProcessTime;

                this.syncToClient();
            }
        }
    }

    private void process(){
        Recipe recipe = this.getRecipeForInputs();
        if(recipe != null && recipe.output != null){
            if(this.slots[OUTPUT_SLOT] == null){
                this.slots[OUTPUT_SLOT] = recipe.output.copy();
            }
            else if(ItemStack.areItemsEqual(this.slots[OUTPUT_SLOT], recipe.output)){
                this.slots[OUTPUT_SLOT].stackSize += recipe.output.stackSize;
            }

            this.slots[LEFT_INPUT_SLOT].stackSize -= recipe.firstInput.stackSize;
            if(this.slots[LEFT_INPUT_SLOT].stackSize <= 0){
                this.slots[LEFT_INPUT_SLOT] = null;
            }

            this.slots[RIGHT_INPUT_SLOT].stackSize -= recipe.secondInput.stackSize;
            if(this.slots[RIGHT_INPUT_SLOT].stackSize <= 0){
                this.slots[RIGHT_INPUT_SLOT] = null;
            }
        }
    }

    private void doFuelBurning(){
        if(this.fuelTime > 0){
            this.fuelTime--;
            if(this.fuelTime <= 0){
                this.maxFuelTime = 0;
            }
        }

        if(this.fuelTime <= 0){
            if(this.slots[FUEL_SLOT] != null && this.canProcess()){
                int burnTime = TileEntityFurnace.getItemBurnTime(this.slots[FUEL_SLOT]);
                if(burnTime > 0){
                    this.slots[FUEL_SLOT].stackSize--;
                    if(this.slots[FUEL_SLOT].stackSize <= 0){
                        this.slots[FUEL_SLOT] = null;
                    }

                    this.fuelTime = burnTime;
                    this.maxFuelTime = burnTime;
                }
            }
        }
    }

    private boolean canProcess(){
        Recipe recipe = this.getRecipeForInputs();
        if(recipe != null){
            if(recipe.output != null){
                if(this.slots[OUTPUT_SLOT] == null){
                    return true;
                }
                else if(ItemStack.areItemsEqual(this.slots[OUTPUT_SLOT], recipe.output)){
                    return this.slots[OUTPUT_SLOT].stackSize+recipe.output.stackSize <= recipe.output.getMaxStackSize();
                }
            }
        }
        return false;
    }

    private Recipe getRecipeForInputs(){
        ItemStack leftInput = this.slots[LEFT_INPUT_SLOT];
        ItemStack rightInput = this.slots[RIGHT_INPUT_SLOT];
        if(leftInput != null && rightInput != null){
            return HearthFurnaceRecipes.getRecipeForInput(leftInput, rightInput);
        }
        else{
            return null;
        }
    }

    @Override
    public void writeToNBT(NBTTagCompound compound, boolean isForSyncing){
        super.writeToNBT(compound, isForSyncing);

        compound.setInteger("FuelTime", this.fuelTime);
        compound.setInteger("MaxFuelTime", this.maxFuelTime);
        compound.setInteger("ProcessTime", this.processTime);
        compound.setInteger("MaxProcessTime", this.maxProcessTime);
    }

    @Override
    public void readFromNBT(NBTTagCompound compound, boolean isForSyncing){
        super.readFromNBT(compound, isForSyncing);

        this.fuelTime = compound.getInteger("FuelTime");
        this.maxFuelTime = compound.getInteger("MaxFuelTime");
        this.processTime = compound.getInteger("ProcessTime");
        this.maxProcessTime = compound.getInteger("MaxProcessTime");
    }
}
