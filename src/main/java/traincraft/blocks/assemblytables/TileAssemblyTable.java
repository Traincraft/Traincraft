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
import traincraft.tile.BaseTile;

/**
 * This is the Assembly Table tileEntity for all tiers of assembly table. It gets the tier based on where the player is looking.
 *
 * @implNote If we can figure out how to register all the assembly table tile entities as one, we don't need the three extra files as wrappers for this.
 *
 * @author PseudonymPatel
 * @since 2020-8-7
 */
public class TileAssemblyTable extends BaseTile {

    private final int tier;
    private ContainerAssemblyTable containerAssemblyTable;
    
    //This recipe is the one that is currently being crafted. It is used to know how much of each thing to subtract. Null when done using.
    private AssemblyTableRecipe recipeInUse = null;
    
    //These will be the 10 slots that the train parts will sit in to craft the trains
    //private final AssemblyCraftingItemHandler craftingInventory = new AssemblyCraftingItemHandler(10, this);
    
    //These 26 slots are 10 for crafting, 8 for storage, 8 for output.
    private final AssemblyCraftingItemHandler rawInventory = new AssemblyCraftingItemHandler(18, this);
    
    //This is not saved.
    private final ItemStackHandler outputInventory = new ItemStackHandler(8);

    public TileAssemblyTable(int tier) {
        this.tier = tier;
    }
    
    @Override
    public GuiScreen openGui(EntityPlayer player) {
        return new GuiAssemblyTable(tier, player, this);
    }

    @Override
    public boolean hasGui() {
        //I forget this every time...
        return true;
    }

    @Override
    public Container openContainer(EntityPlayer player){
        containerAssemblyTable = new ContainerAssemblyTable(player.inventory, player.getEntityWorld(), this);
        return containerAssemblyTable;
    }

    /**
     * This SHOULD NOT BE USED!
     *
     * @return 8 inventory storage slots.
     */
    @Override
    public IInventory getRealInventory() {
        return null;
    }

    public ItemStackHandler getInventory() {
        return rawInventory;
    }
    
    public ItemStackHandler getOutputInventory(){
        return outputInventory;
    }
    
    public AssemblyTableRecipe getRecipeInUse(){
        return recipeInUse;
    }
    
    public void setRecipeInUse(AssemblyTableRecipe recipeInUse){
        this.recipeInUse = recipeInUse;
    }
    
    /**
     * This function handles recipe checking. Will set the output item if recipe works.
     */
    public void onInventoryChanged() {
        //for loop to compare between ingredients, similar to workbench
        if(this.world == null || !this.world.isRemote){
            this.markDirty();
            recipeInUse = null;
            //clear output area
            outputInventory.setStackInSlot(0, ItemStack.EMPTY); //slot index 18 is the 19th slot, ie first output slot
            
            //filter through the train recipes and find the first match (there should only be one match, but just in case duplicate recipes or sth.
            AssemblyTableRecipe.ASSEMBLY_TABLE_RECIPES.stream().filter(recipe -> recipe.betterMatches(rawInventory)).findFirst().ifPresent(recipe -> {
                if (this.tier == recipe.getTier()){ //make sure correct tier before doing.
                    recipeInUse = recipe;
                    outputInventory.setStackInSlot(0, recipe.getRecipeOutput().copy());
                }
            });
    
            //update things that need update
            containerAssemblyTable.detectAndSendChanges();
        }
    }
    
    //used break rather than harvest because want to drop items even if wrong tool or other method used to break. Like chests.
    @Override
    public void onBlockBreak(IBlockState state){
        for(int i = 0; i < rawInventory.getSlots(); ++i){
            if (rawInventory.getStackInSlot(i) != ItemStack.EMPTY){
                this.world.spawnEntity(new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), rawInventory.getStackInSlot(i)));
            }
        }
    }
    
    @Override
    public IItemHandler getInventory(EnumFacing side){
        return rawInventory;
    }
    
    public void readNBT(NBTTagCompound nbt, NBTState state){
        if(nbt.hasKey("asmTableInventory")){
            rawInventory.deserializeNBT(nbt.getCompoundTag("asmTableInventory"));
        }
    }

    public void writeNBT(NBTTagCompound nbt, NBTState state){
        //write the nbt for the crafting part of NBT
        nbt.setTag("asmTableInventory", rawInventory.serializeNBT());

        //Not necessary to store tier information due to how each block gets a extension of this with tier pre-set
    }
}
