/*
 * This file ("TileEntityHearthFurnace.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/blob/master/LICENSE.md)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2017
 */

package si.meansoft.traincraft.tile;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.ITickable;
import si.meansoft.traincraft.Util;
import si.meansoft.traincraft.api.recipes.HearthFurnaceRecipes;
import si.meansoft.traincraft.api.recipes.HearthFurnaceRecipes.Recipe;
import si.meansoft.traincraft.blocks.BlockDistillery;
import si.meansoft.traincraft.compat.VanillaUtil;

/**
 * @author Ellpeck
 */
public class TileEntityHearthFurnace extends TileEntityInventory implements ITickable {

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

    public TileEntityHearthFurnace() {
        super("HearthFurnace", 4);
    }

    @Override
    public void update() {
        if (!this.getWorld().isRemote) {
            boolean lastIsBurning = this.fuelTime > 0;

            this.doFuelBurning();

            if (lastIsBurning != this.fuelTime > 0) {
                IBlockState state = this.getWorld().getBlockState(pos);
                this.getWorld().setBlockState(pos, state.getBlock().getDefaultState().withProperty(BlockDistillery.ACTIVE, this.fuelTime > 0).withProperty(BlockDistillery.FACING, state.getValue(BlockDistillery.FACING)), 3);
            }

            if (this.fuelTime > 0 && this.canProcess()) {
                if (this.maxProcessTime <= 0) {
                    Recipe recipe = this.getRecipeForInputs();
                    if (recipe != null) {
                        this.maxProcessTime = recipe.processTime;
                        this.markDirty();
                    }
                } else {
                    this.processTime++;
                    if (this.processTime >= this.maxProcessTime) {
                        this.process();
                        this.markDirty();

                        this.processTime = 0;
                        this.maxProcessTime = 0;
                    }
                }

            } else if (this.processTime > 0) {
                this.processTime -= 5;
                if (this.processTime <= 0) {
                    this.processTime = 0;
                    this.maxProcessTime = 0;
                }
            }

            if (this.processTime != this.lastProcessTime || this.maxProcessTime != this.lastMaxProcessTime || this.fuelTime != this.lastFuelTime || this.maxFuelTime != this.lastMaxFuelTime) {
                this.lastMaxFuelTime = this.maxFuelTime;
                this.lastFuelTime = this.fuelTime;
                this.lastProcessTime = this.processTime;
                this.lastMaxProcessTime = this.lastProcessTime;

                this.syncToClient();
            }
        }
    }

    private void process() {
        Recipe recipe = this.getRecipeForInputs();
        if (recipe != null && recipe.output != VanillaUtil.getEmpty()) {
            if (this.slots[OUTPUT_SLOT] == VanillaUtil.getEmpty()) {
                this.slots[OUTPUT_SLOT] = recipe.output.copy();
            } else if (ItemStack.areItemsEqual(this.slots[OUTPUT_SLOT], recipe.output)) {
                VanillaUtil.increaseStack(this.slots[OUTPUT_SLOT], VanillaUtil.getCount(recipe.output));
            }
            VanillaUtil.decreaseStack(this.slots[LEFT_INPUT_SLOT], VanillaUtil.getCount(recipe.firstInput));
            if (VanillaUtil.getCount(this.slots[LEFT_INPUT_SLOT]) <= 0) {
                this.slots[LEFT_INPUT_SLOT] = VanillaUtil.getEmpty();
            }
            VanillaUtil.decreaseStack(this.slots[RIGHT_INPUT_SLOT], VanillaUtil.getCount(recipe.secondInput));
            if (VanillaUtil.getCount(this.slots[RIGHT_INPUT_SLOT]) <= 0) {
                this.slots[RIGHT_INPUT_SLOT] = VanillaUtil.getEmpty();
            }
        }
    }

    private void doFuelBurning() {
        if (this.fuelTime > 0) {
            this.fuelTime--;
            if (this.fuelTime <= 0) {
                this.maxFuelTime = 0;
            }
        }

        if (this.fuelTime <= 0) {
            if (this.slots[FUEL_SLOT] != VanillaUtil.getEmpty() && this.canProcess()) {
                int burnTime = TileEntityFurnace.getItemBurnTime(this.slots[FUEL_SLOT]);
                if (burnTime > 0) {
                    VanillaUtil.decreaseStack(this.slots[FUEL_SLOT], 1);
                    if (VanillaUtil.getCount(this.slots[FUEL_SLOT]) <= 0) {
                        this.slots[FUEL_SLOT] = VanillaUtil.getEmpty();
                    }

                    this.fuelTime = burnTime;
                    this.maxFuelTime = burnTime;
                }
            }
        }
    }

    private boolean canProcess() {
        Recipe recipe = this.getRecipeForInputs();
        if (recipe != null) {
            if (recipe.output != VanillaUtil.getEmpty()) {
                if (this.slots[OUTPUT_SLOT] == VanillaUtil.getEmpty()) {
                    return true;
                } else if (ItemStack.areItemsEqual(this.slots[OUTPUT_SLOT], recipe.output)) {
                    return VanillaUtil.getCount(this.slots[OUTPUT_SLOT]) + VanillaUtil.getCount(recipe.output) <= recipe.output.getMaxStackSize();
                }
            }
        }
        return false;
    }

    private Recipe getRecipeForInputs() {
        ItemStack leftInput = this.getStackInSlot(LEFT_INPUT_SLOT);
        ItemStack rightInput = this.getStackInSlot(RIGHT_INPUT_SLOT);
        if (leftInput != VanillaUtil.getEmpty() && rightInput != VanillaUtil.getEmpty()) {
            return HearthFurnaceRecipes.getRecipeForInput(leftInput, rightInput);
        } else {
            return null;
        }
    }

    @Override
    public void writeToNBT(NBTTagCompound compound, Util.NBTType type) {
        super.writeToNBT(compound, type);
        compound.setInteger("FuelTime", this.fuelTime);
        compound.setInteger("MaxFuelTime", this.maxFuelTime);
        compound.setInteger("ProcessTime", this.processTime);
        compound.setInteger("MaxProcessTime", this.maxProcessTime);
    }

    @Override
    public void readFromNBT(NBTTagCompound compound, Util.NBTType type) {
        super.readFromNBT(compound, type);
        this.fuelTime = compound.getInteger("FuelTime");
        this.maxFuelTime = compound.getInteger("MaxFuelTime");
        this.processTime = compound.getInteger("ProcessTime");
        this.maxProcessTime = compound.getInteger("MaxProcessTime");
    }
}
