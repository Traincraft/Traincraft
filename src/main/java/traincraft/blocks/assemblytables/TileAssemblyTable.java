/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("null.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */
package traincraft.blocks.assemblytables;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.util.INBTSerializable;
import org.apache.logging.log4j.Level;
import traincraft.Traincraft;
import traincraft.tile.BaseTile;

/**
 * This is the Assembly Table tileEntity for all tiers of assembly table. It gets the tier based on where the player is looking.
 *
 * @implNote If we can figure out how to register all the assembly table tile entitys as one, we don't need the three extra files as wrappers for this.
 *
 * @author PseudonymPatel
 * @since 2020-8-7
 */
public class TileAssemblyTable extends BaseTile {

    private final int tier;
    private GuiAssemblyTable guiAssemblyTable;
    private ContainerAssemblyTable containerAssemblyTable;
    
    //These will be the 10 slots that the train parts will sit in to craft the trains
    public AssemblyTableInventory craftingInventory = new AssemblyTableInventory(this);

    //These 8 slots are for the small chest-like inventory inside of the train workbench.
    InventoryBasic storageInventory = new InventoryBasic("ASM table storage", false, 8);

    //This may not be used, but if we need to store the output for some reason.
    InventoryBasic outputInventory = new InventoryBasic("ASM table output", false, 8);

    public TileAssemblyTable(int tier) {
        this.tier = tier;
    }

    @Override
    public GuiScreen openGui(EntityPlayer player) {
        guiAssemblyTable = new GuiAssemblyTable(tier, player, this);
        return guiAssemblyTable;
    }

    @Override
    public boolean hasGui() {
        //I forget this every time...
        return true;
    }

    @Override
    public Container openContainer(EntityPlayer player) {
        containerAssemblyTable = new ContainerAssemblyTable(player.inventory, player.getEntityWorld(), this);
        return containerAssemblyTable;
    }

    /**
     * This returns the 8 slots of STORAGE inventory stored in the workbench, not the crafting area.
     *
     * @return 8 inventory storage slots.
     */
    @Override
    public IInventory getRealInventory() {
        return storageInventory;
    }

    public IInventory getOutputInventory() {
        return outputInventory;
    }

    public IInventory getStorageInventory() {
        return storageInventory;
    }

    public AssemblyTableInventory getCraftingInventory() {
        return craftingInventory;
    }
    
    /**
     * This function handles recipe checking. Will set the output item if recipe works.
     */
    public void onInventoryChanged() {
        Traincraft.LOGGER.log(Level.DEBUG, "Assembly Table inventory changed function in tile called.");
        //for loop to compare between ingredients, similar to workbench
        if(this.world == null || !this.world.isRemote){
            //clear output inventory area
            outputInventory.clear();
        
            if(!craftingInventory.isEmpty()){
                //filter through the trainrecipies and find the first match (there should only be one match, but just in case duplicate recipes or sth.
                AssemblyTableRecipe.ASSEMBLY_TABLE_RECIPES.stream().filter(recipe -> recipe.betterMatches(craftingInventory)).findFirst().ifPresent(recipe -> {
                    if (this.tier == recipe.getTier()){ //make sure correct tier before doing.
                        craftingInventory.setRecipeUsed(recipe);
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
    
    public void readNBT(NBTTagCompound nbt, NBTState state){
        if(nbt.hasKey("storageInventory")){
            NBTTagCompound storageInventoryNBT = nbt.getCompoundTag("storageInventory");
            if(this.getRealInventory() != null && this.getRealInventory() instanceof INBTSerializable<?>){
                ((INBTSerializable<NBTTagCompound>) this.getRealInventory()).deserializeNBT(storageInventoryNBT);
            }
        }
    }
    
    public void writeNBT(NBTTagCompound nbt, NBTState state){
        //IItemHandler inventory = this.getInventory(null);
//        if(inventory instanceof InvWrapper && ((InvWrapper) inventory).getInv() instanceof INBTSerializable<?>){
//            NBTBase value = ((INBTSerializable<?>) ((InvWrapper) inventory).getInv()).serializeNBT();
//            if(value instanceof NBTTagCompound){
//                nbt.setTag("inventory", value);
//            }
//        } else
        if(this.getRealInventory() != null && this.getRealInventory() instanceof INBTSerializable<?>){
            NBTBase value = ((INBTSerializable<?>) this.getRealInventory()).serializeNBT();
            if(value instanceof NBTTagCompound){
                nbt.setTag("storageInventory", value);
            }
        }
    }
}
