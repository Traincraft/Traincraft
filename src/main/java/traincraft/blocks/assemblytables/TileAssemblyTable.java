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
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
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
public class TileAssemblyTable extends BaseTile {

    private final int tier;
    private GuiAssemblyTable guiAssemblyTable;
    private ContainerAssemblyTable containerAssemblyTable;
    
    //This recipe is the one that is currently being crafted. It is used to know how much of each thing to subtract. Null when done using.
    private AssemblyTableRecipe recipeInUse = null;
    
    //These will be the 10 slots that the train parts will sit in to craft the trains
    private final AssemblyCraftingItemHandler craftingInventory = new AssemblyCraftingItemHandler(10, this);
    
    //These 8 slots are for the small chest-like inventory inside of the train workbench.
    private final ItemStackHandler storageInventory = new ItemStackHandler(8) {
        @Override
        protected void onContentsChanged(int slot) {
            markDirty();
        }
    };
    
    //This may not be used, but if we need to store the output for some reason.
    private final InventoryBasic outputInventory = new InventoryBasic("ASM table output", false, 8);

    public TileAssemblyTable(int tier) {
        this.tier = tier;
    }
    
    @Override
    public GuiScreen openGui(EntityPlayer player) {
        if (guiAssemblyTable == null){
            guiAssemblyTable = new GuiAssemblyTable(tier, player, this);
        }
        return guiAssemblyTable;
    }

    @Override
    public boolean hasGui() {
        //I forget this every time...
        return true;
    }

    @Override
    public Container openContainer(EntityPlayer player){
        if (containerAssemblyTable == null) {
            containerAssemblyTable = new ContainerAssemblyTable(player.inventory, player.getEntityWorld(), this);
        }
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

    public IInventory getOutputInventory() {
        return outputInventory;
    }

    public IItemHandler getStorageInventory() {
        return storageInventory;
    }

    public AssemblyCraftingItemHandler getCraftingInventory() {
        return craftingInventory;
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
            //clear output inventory area
            outputInventory.clear();
        
            if(!craftingInventory.isEmpty()){
                //filter through the train recipes and find the first match (there should only be one match, but just in case duplicate recipes or sth.
                AssemblyTableRecipe.ASSEMBLY_TABLE_RECIPES.stream().filter(recipe -> recipe.betterMatches(craftingInventory)).findFirst().ifPresent(recipe -> {
                    if (this.tier == recipe.getTier()){ //make sure correct tier before doing.
                        recipeInUse = recipe;
                        outputInventory.setInventorySlotContents(0, recipe.getRecipeOutput().copy());
                        containerAssemblyTable.detectAndSendChanges();
                        this.syncToClient();
                    }
                });
            }
    
            //update things that need update
            containerAssemblyTable.detectAndSendChanges();
        }
    }
    
    //used break rather than harvest because want to drop items even if wrong tool or other method used to break. Like chests.
    @Override
    public void onBlockBreak(IBlockState state){
        //drop items from crafting inventory
        for(int i = 0; i < craftingInventory.getSlots(); ++i){
            if (craftingInventory.getStackInSlot(i) != ItemStack.EMPTY){
                this.world.spawnEntity(new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), craftingInventory.getStackInSlot(i)));
            }
        }
        
        //drop items from storage inventory
        for(int i = 0; i < storageInventory.getSlots(); ++i){
            if (storageInventory.getStackInSlot(i) != ItemStack.EMPTY){
                this.world.spawnEntity(new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), storageInventory.getStackInSlot(i)));
            }
        }
    }
    
    @Override
    public boolean hasCapability(@Nonnull Capability<?> capability, @Nullable EnumFacing facing){
        if (capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            return true;
        }
        return super.hasCapability(capability, facing);
    }
    
    @Nullable
    @Override
    public <T> T getCapability(@Nonnull Capability<T> capability, @Nullable EnumFacing facing){
        if(capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY){
            IItemHandler itemHandler = this.getStorageInventory();
            if(itemHandler != null){
                return (T) itemHandler;
            }
        }
        return super.getCapability(capability, facing);
    }
    
    public void readNBT(NBTTagCompound nbt, NBTState state){
        if(nbt.hasKey("storageInventory")){
            storageInventory.deserializeNBT(nbt.getCompoundTag("storageInventory"));
        }
        
        if(nbt.hasKey("craftingInventory")){
            craftingInventory.deserializeNBT(nbt.getCompoundTag("craftingInventory"));
        }
    }
    
    public void writeNBT(NBTTagCompound nbt, NBTState state){
        //write the nbt for the storage part of NBT
        nbt.setTag("storageInventory", storageInventory.serializeNBT());
        
        //write the nbt for the crafting part of NBT
        nbt.setTag("craftingInventory", craftingInventory.serializeNBT());
        
        //Not necessary to store tier information due to how each block gets a extension of this with tier pre-set
    }
}
