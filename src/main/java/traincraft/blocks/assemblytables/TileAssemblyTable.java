/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("TileAssemblyTable.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */
package traincraft.blocks.assemblytables;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.wrapper.SidedInvWrapper;
import traincraft.api.InventoryBase;
import traincraft.api.InventorySpecific;
import traincraft.tile.BaseTile;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * This is the Assembly Table tileEntity for all tiers of assembly table. It gets the tier based on where the player is looking.
 *
 * @implNote If we can figure out how to register all the assembly table tile entities as one, we don't need the three extra files as wrappers for this.
 *
 * @author PseudonymPatel
 * @since 2020-8-7
 */
public abstract class TileAssemblyTable extends BaseTile {

    private final int tier;
    
    //This recipe is the one that is currently being crafted. It is used to know how much of each thing to subtract. Null when done using.
    private AssemblyTableRecipe recipeInUse = null;
    
    //These 26 slots are 0-9 for crafting, 10-17 for storage, 18-25 for output.
    private final InventorySpecific rawInventory = new InventorySpecific("Assembly Table Inventory", false, 26, this::isItemValidForInventory);
    private final SidedInvWrapper[] inventory = InventoryBase.getSidedWrappers(this.rawInventory);

    public TileAssemblyTable(int tier) {
        this.tier = tier;
        this.rawInventory.addInventoryChangeListener(this::onInventoryChange);
    }
    
    protected boolean isItemValidForInventory(int slot, @Nonnull ItemStack stack){
        return true;
    }
    
    @Override
    public GuiScreen openGui(EntityPlayer player) {
        return new GuiAssemblyTable(this.tier, player, this);
    }

    @Override
    public boolean hasGui() {
        return true;
    }

    @Override
    public Container openContainer(EntityPlayer player){
        return new ContainerAssemblyTable(player.inventory, this);
    }

    /**
     * This SHOULD NOT BE USED!
     *
     * @return 8 inventory storage slots.
     */
    @Override
    public IInventory getRealInventory() {
        return this.rawInventory;
    }
    
    @Override
    public IItemHandler getInventory(@Nullable EnumFacing side){
        return this.inventory[side != null ? side.ordinal() : 0];
    }
    
    /**
     * Called whe the inventory of the assembler changes by any means.
     * This function should check if the crafting matrix contains a recipe and if so put the recipe output into the output slots
     */
    public void onInventoryChange(IInventory inv){
        // check if there is now a recipe in the crafting slots
        this.checkForRecipe();
        // check if we have to sync to the client after an inventory change
        super.updateBaseTile();
    }
    
    /**
     * Called when the player takes the output of the assembly table.
     * This function should heck which item was taken and it should remove all used items from the crafting matrix.
     */
    public void onItemCrafted() {
        // iterate over all inputs and reduce their stacks by the amount used by the recipe. MarkDirty is done automatically
        for(int i = 0; i < 10; i++){
            int countUsedByRecipe = this.recipeInUse.getCraftingIngredient(i).getCount();
            this.rawInventory.decrStackSize(i, countUsedByRecipe);
        }
        
        // check if we can craft something again
        this.checkForRecipe();
        
        // mark this tile as syncable
        this.syncToClient();
    }
    
    public void checkForRecipe(){
        for(AssemblyTableRecipe recipe : AssemblyTableRecipe.ASSEMBLY_TABLE_RECIPES){
            boolean recipeInvalid = false;
            for(int i = 0; i < 10; i++){
                NumberedIngredient numberedIngredient = recipe.getCraftingIngredient(i);
                ItemStack stackInSlot = this.rawInventory.getStackInSlot(i);
                if(!numberedIngredient.ingredient.apply(stackInSlot) || !(numberedIngredient.getCount() <= stackInSlot.getCount())){
                    recipeInvalid = true;
                    break;
                }
            }
            if(!recipeInvalid){
                this.recipeInUse = recipe;
                break;
            }
        }
    }
    
    //used break rather than harvest because want to drop items even if wrong tool or other method used to break. Like chests.
    @Override
    public void onBlockBreak(IBlockState state){
        for(int i = 0; i < this.rawInventory.getSizeInventory(); i++){
            ItemStack stack = this.rawInventory.getStackInSlot(i);
            if(!stack.isEmpty()){
                this.world.spawnEntity(new EntityItem(this.world, this.pos.getX(), this.pos.getY(), this.pos.getZ(), stack));
            }
        }
    }
    
}
