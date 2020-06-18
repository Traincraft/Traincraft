package traincraft.blocks.distillery;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidTank;
import net.minecraftforge.fluids.capability.CapabilityFluidHandler;
import net.minecraftforge.fluids.capability.IFluidHandler;
import net.minecraftforge.fluids.capability.IFluidHandlerItem;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.wrapper.InvWrapper;
import traincraft.api.FluidTankChangeListener;
import traincraft.api.InventorySpecific;
import traincraft.tile.BaseTile;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class TileDistillery extends BaseTile implements ITickable {
    
    public static final List<DistilleryRecipe> DISTIL_RECIPES = new ArrayList<>();
    
    public static final int INPUT_SLOT = 0;
    public static final int BURN_SLOT = 1;
    public static final int OUTPUT_SLOT = 2;
    public static final int CONTAINER_INPUT_SLOT = 3;
    public static final int CONTAINER_OUTPUT_SLOT = 4;
    
    public static final int FLUID_TANK_CAPACITY = 16000;
    
    private final InventorySpecific rawInventory = new InventorySpecific("Distillery Inventory", false, 5, this::isItemValidForInventory);
    private final InvWrapper inventory = new InvWrapper(rawInventory);
    private final FluidTankChangeListener fluidTank = new FluidTankChangeListener(FLUID_TANK_CAPACITY, this::fluidTankChange);
    
    public int burnTime, maxBurnTime, recipeBurnTime, maxRecipeBurnTime;
    private ResourceLocation activeRecipe = null;
    
    public TileDistillery() {
        this.rawInventory.addInventoryChangeListener(this::onInventoryChange);
    }
    
    @Override
    public IItemHandler getInventory(@Nullable EnumFacing side) {
        return this.inventory;
    }
    
    @Override
    public IFluidHandler getFluidTank(@Nullable EnumFacing side) {
        return this.fluidTank;
    }
    
    @Override
    public GuiScreen openGui(EntityPlayer player) {
        return new GuiDistillery(this, player);
    }
    
    @Override
    public Container openContainer(EntityPlayer player) {
        return new ContainerDistillery(this, player);
    }
    
    @Override
    public void readNBT(NBTTagCompound nbt, NBTState state) {
        super.readNBT(nbt, state);
        if(state != NBTState.DROP){
            if(nbt.hasKey("burn_time", Constants.NBT.TAG_INT)){
                this.burnTime = nbt.getInteger("burn_time");
            }
            if(nbt.hasKey("max_burn_time", Constants.NBT.TAG_INT)){
                this.maxBurnTime = nbt.getInteger("max_burn_time");
            }
            if(nbt.hasKey("recipe_burn_time", Constants.NBT.TAG_INT)){
                this.recipeBurnTime = nbt.getInteger("recipe_burn_time");
            }
            if(nbt.hasKey("max_recipe_burn_time", Constants.NBT.TAG_INT)){
                this.maxRecipeBurnTime = nbt.getInteger("max_recipe_burn_time");
            }
        }
    }
    
    @Override
    public void writeNBT(NBTTagCompound nbt, NBTState state) {
        super.writeNBT(nbt, state);
        if(state != NBTState.DROP){
            nbt.setInteger("burn_time", this.burnTime);
            nbt.setInteger("max_burn_time", this.maxBurnTime);
            nbt.setInteger("recipe_burn_time", this.recipeBurnTime);
            nbt.setInteger("max_recipe_burn_time", this.maxRecipeBurnTime);
        }
    }
    
    protected boolean isItemValidForInventory(int slot, @Nonnull ItemStack stack){
        switch(slot){
            case INPUT_SLOT: return DISTIL_RECIPES.stream().anyMatch(distilleryRecipe -> distilleryRecipe.getInputIngredient().apply(stack));
            case BURN_SLOT: return TileEntityFurnace.isItemFuel(stack);
            case OUTPUT_SLOT: return false;
            case CONTAINER_INPUT_SLOT: return stack.hasCapability(CapabilityFluidHandler.FLUID_HANDLER_ITEM_CAPABILITY, null);
            case CONTAINER_OUTPUT_SLOT: return false;
            default: return false;
        }
    }
    
    public void onInventoryChange(IInventory inventory) {
        // this only checks when the inventory is updated if a recipe can be executed
        if(this.activeRecipe == null){
            testForNewRecipe();
        }
        
        // when burn time is zero
        if(this.burnTime <= 0){
            testAndConsumeForBurnStack();
        }
        
        testForFluidContainerMerge();
    }
    
    public void fluidTankChange(){
        testForFluidContainerMerge();
    }
    
    private void testForNewRecipe(){
        ItemStack inputStack = inventory.getStackInSlot(INPUT_SLOT);
        if(!inputStack.isEmpty()){
            DISTIL_RECIPES.stream().filter(distilleryRecipe -> canStackBeApplied(distilleryRecipe.getInputIngredient(), distilleryRecipe.getInputAmount(), inputStack))
                          .findFirst()
                          .ifPresent(recipe -> {
                              ItemStack outputStack = inventory.getStackInSlot(OUTPUT_SLOT);
                              if(canStacksBeMerged(outputStack, recipe.getOutputStack())){ // check if output itemstacks can be merged
                                  if(canFluidsMerge(this.fluidTank, recipe.getOutputFluid())){ // check if output fluid can be merged
                                      inputStack.shrink(recipe.getInputAmount());
                                      if(inputStack.getCount() <= 0){
                                          this.inventory.setStackInSlot(INPUT_SLOT, ItemStack.EMPTY);
                                      }
                                      this.activeRecipe = recipe.getRegistryName();
                                      this.recipeBurnTime = this.maxRecipeBurnTime = recipe.getBurnTime();
                                      this.syncToClient();
                                  }
                              }
                          });
        }
    }
    
    private void testAndConsumeForBurnStack() {
        ItemStack burnStack = this.inventory.getStackInSlot(BURN_SLOT);
        if(!burnStack.isEmpty()){
            int itemBurnTime = TileEntityFurnace.getItemBurnTime(burnStack);
            if(itemBurnTime > 0){
                this.burnTime = this.maxBurnTime = itemBurnTime;
                burnStack.shrink(1);
                if(burnStack.isEmpty()){
                    this.inventory.setStackInSlot(BURN_SLOT, ItemStack.EMPTY);
                }
            }
        }
        this.syncToClient();
    }
    
    private void testForFluidContainerMerge(){
        if(this.fluidTank.getFluidAmount() > 0){
            FluidTank tankCopy = this.fluidTank.copyWithoutListener();
            ItemStack inputTankDrainStack = this.inventory.getStackInSlot(CONTAINER_INPUT_SLOT);
            if(!inputTankDrainStack.isEmpty()){
                ItemStack inputCopy = inputTankDrainStack.copy();
                inputCopy.setCount(1);
                IFluidHandlerItem capability = inputCopy.getCapability(CapabilityFluidHandler.FLUID_HANDLER_ITEM_CAPABILITY, null);
                if(capability != null){
                    FluidStack drained = tankCopy.drain(capability.fill(tankCopy.drain(Integer.MAX_VALUE, false), false), false);
                    if(drained != null && drained.amount > 0){
                        ItemStack outputTankDrainStack = this.inventory.getStackInSlot(CONTAINER_OUTPUT_SLOT);
                        if(canStacksBeMerged(capability.getContainer(), outputTankDrainStack)){
                            // do the filling to the input stack copy
                            tankCopy.drain(capability.fill(tankCopy.drain(Integer.MAX_VALUE, false), true), true);
                            if(outputTankDrainStack.isEmpty()){
                                this.inventory.setStackInSlot(CONTAINER_OUTPUT_SLOT, capability.getContainer());
                            } else {
                                outputTankDrainStack.grow(1);
                            }
                            
                            // shrink input stack
                            inputTankDrainStack.shrink(1);
                            if(inputTankDrainStack.isEmpty()){
                                this.inventory.setStackInSlot(CONTAINER_INPUT_SLOT, ItemStack.EMPTY);
                            }
    
                            this.syncToClient();
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public void update() {
        if(!this.world.isRemote){
            if(this.activeRecipe != null){
                if(this.burnTime > 0){
                    this.recipeBurnTime--;
                }
                if(this.recipeBurnTime <= 0){
                    this.recipeBurnTime = 0;
                    DISTIL_RECIPES.stream().filter(distilleryRecipe -> this.activeRecipe.equals(distilleryRecipe.getRegistryName())).findFirst().ifPresent(recipe -> {
                        ItemStack outputStack = recipe.getOutputStack().copy();
                        ItemStack currentOutputStack = inventory.getStackInSlot(OUTPUT_SLOT);
                        if(currentOutputStack.isEmpty()){
                            inventory.setStackInSlot(OUTPUT_SLOT, outputStack);
                        } else {
                            currentOutputStack.grow(outputStack.getCount());
                        }
                        FluidStack currentOutputFluid = this.fluidTank.getFluid();
                        FluidStack outputFluid = recipe.getOutputFluid();
                        if(outputFluid != null){
                            if(currentOutputFluid != null){
                                currentOutputFluid.amount += outputFluid.amount;
                            } else {
                                this.fluidTank.setFluid(outputFluid.copy());
                            }
                        }
                        this.activeRecipe = null;
                        this.recipeBurnTime = this.maxRecipeBurnTime = 0;
                        this.syncToClient();
                        
                        // check if it can craft again
                        this.testForNewRecipe();
                    });
                }
            }
            
            if(this.burnTime > 0){
                this.burnTime--;
                if(this.burnTime <= 0){
                    this.burnTime = this.maxBurnTime = 0;
                    testAndConsumeForBurnStack();
                } else if(this.burnTime % 5 == 0){
                    this.syncToClient(); // sync every five ticks
                }
            }
        }
    
        // used for syncing
        super.updateBaseTile();
    }
    
    public static boolean canStackBeApplied(Ingredient ingredient, int amount, ItemStack stack){
        if(!stack.isEmpty()){
            for(ItemStack matchingStack : ingredient.getMatchingStacks()){
                if(ItemStack.areItemsEqual(matchingStack, stack)){ // test item and damage
                    if(stack.getCount() >= amount){ // test for enough stacksize
                        if(ItemStack.areItemStackTagsEqual(matchingStack, stack)){ // test for equal nbt
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public static boolean canStacksBeMerged(ItemStack a, ItemStack b){
        if(a.isEmpty() || b.isEmpty()){
            return true;
        }
        if(a.isItemEqual(b) && ItemStack.areItemStackTagsEqual(a, b)){
            return a.getCount() + b.getCount() <= Math.min(a.getMaxStackSize(), b.getMaxStackSize());
        }
        return false;
    }
    
    public static boolean canFluidsMerge(FluidTank tank, FluidStack fluid){
        if(tank == null){
            return false;
        }
        if(fluid == null || tank.getFluid() == null){
            return true;
        }
        if(tank.canFillFluidType(fluid)){ // checks fluid and nbt
            return tank.getFluidAmount() + fluid.amount <= tank.getCapacity();
        }
        return false;
    }
}
