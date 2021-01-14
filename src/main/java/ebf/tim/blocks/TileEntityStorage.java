package ebf.tim.blocks;


import ebf.XmlBuilder;
import ebf.tim.registry.TiMFluids;
import ebf.tim.utility.ClientProxy;
import ebf.tim.utility.CommonUtil;
import ebf.tim.utility.DebugUtil;
import ebf.tim.utility.ItemStackSlot;
import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.*;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Tile Entity storage container</h1>
 * this is a tile entity for storage, similar to the game's chest, but due to the advanced container class of this mod it can be used for anything from chests to crafting tables.
 * @see ebf.tim.utility.TransportSlotManager
 * @author Eternal Blue Flame
 */
public class TileEntityStorage extends TileRenderFacing implements IInventory, IFluidHandler {
    /**the list of item stacks in the inventory*/
    public List<ItemStackSlot> inventory = new ArrayList<ItemStackSlot>();
    public int storageType=0;
    public int outputPage=1;
    public int pages=1;
    public int assemblyTableTier = -1; //only applies if part of assemblyTable/traintable, no need to set otherwise.

    public TileEntityStorage(BlockDynamic block){
        super(block);
        int s=400;

        inventory= new ArrayList<>();
        if(block.getUnlocalizedName().equals("tile.block.traintabletier1") ||
                block.getUnlocalizedName().equals("tile.block.traintabletier2") ||
                block.getUnlocalizedName().equals("tile.block.traintabletier3") ||
                block.getUnlocalizedName().equals("tile.block.traintable")) {

            if (block.assemblyTableTier != -1) {
                //if it's a traintable, it should be, things might break otherwise, this is temporary to see if I missed a case.
                this.assemblyTableTier = block.assemblyTableTier;
            } else {
                DebugUtil.println("Did not set the tier of the assembly table/traintable!");
                this.assemblyTableTier = 0;
            }

            if (!ClientProxy.isTraincraft || block.getUnlocalizedName().equals("tile.block.traintable")) {
                //inventory grid (left grid)
                for (int l = 0; l < 3; ++l) {
                    for (int i1 = 0; i1 < 3; ++i1) {
                        inventory.add(new ItemStackSlot(this, s, assemblyTableTier).setCoords(30 + i1 * 18, 17 + l * 18).setCraftingInput(true));
                        s++;
                    }
                }
                //tile entity's crafting grid (right hand grid)
                for (int l = 0; l < 3; ++l) {
                    for (int i1 = 0; i1 < 3; ++i1) {
                        inventory.add(new ItemStackSlot(this, s, assemblyTableTier).setCoords(106 + i1 * 18, 17 + l * 18).setCraftingOutput(true));
                        s++;
                    }
                }
            } else {
                //this is traincraft
                //create the assembly table crafting slots (0-9)
                inventory.add(new ItemStackSlot(this, s+0, assemblyTableTier).setCoords(25, 27).setCraftingInput(true));
                inventory.add(new ItemStackSlot(this, s+1, assemblyTableTier).setCoords(79, 27).setCraftingInput(true));
                inventory.add(new ItemStackSlot(this, s+2, assemblyTableTier).setCoords(115, 27).setCraftingInput(true));
                //the following is dye slot, removed so we can have 9 crafting slots; if adding back, remember to increment everything
                //inventory.add(new ItemStackSlot(this, s+3, assemblyTableTier).setCoords(145, 27).setCraftingInput(true));
                inventory.add(new ItemStackSlot(this, s+3, assemblyTableTier).setCoords(25, 61).setCraftingInput(true));
                inventory.add(new ItemStackSlot(this, s+4, assemblyTableTier).setCoords(79, 61).setCraftingInput(true));
                inventory.add(new ItemStackSlot(this, s+5, assemblyTableTier).setCoords(115, 61).setCraftingInput(true));
                inventory.add(new ItemStackSlot(this, s+6, assemblyTableTier).setCoords(43, 93).setCraftingInput(true));
                inventory.add(new ItemStackSlot(this, s+7, assemblyTableTier).setCoords(79, 93).setCraftingInput(true));
                inventory.add(new ItemStackSlot(this, s+8, assemblyTableTier).setCoords(145, 93).setCraftingInput(true));

                //create the assembly table output slots (9-16)
                for(int i = 0; i < 4; ++i){
                    for(int j = 0; j < 2; ++j){
                        inventory.add(new ItemStackSlot(this, (s+9) + (j * 4 + i), assemblyTableTier).setCoords(92 + i * 18, (128) + j * 18).setCraftingOutput(true));
                    }
                }

                //create the assembly table storage slots
                //  slots 35 - 400 were meant for storage
                int storageSlot = 36;
                for(int i = 0; i < 2; ++i) {
                    for (int j = 0; j < 4; ++j) {
                        inventory.add(new ItemStackSlot(this, (storageSlot) + (j + i * 4)).setCoords(8 + j * 18, (128) + i * 18));
                    }
                }
            }
            storageType=1;
        } else {
            inventory.add(new ItemStackSlot(this,400).setCoords( 30 , -2).setCraftingInput(true).setOverlay(Items.iron_ingot)); //ingot
            inventory.add(new ItemStackSlot(this,401).setCoords( 30 , 18).setCraftingInput(true).setOverlay(Blocks.planks)); //ties
            inventory.add(new ItemStackSlot(this,402).setCoords( 30 , 37).setCraftingInput(true).setOverlay(Blocks.gravel)); //ballast

            inventory.add(new ItemStackSlot(this,403).setCoords( 50 , 7).setCraftingInput(true)); //wires
            inventory.add(new ItemStackSlot(this,404).setCoords( 50 , 27).setCraftingInput(true));//augument slot

            inventory.add(new ItemStackSlot(this,405).setCoords( 124 , -2).setCraftingInput(true).setOverlay(Blocks.rail));//old shape input

            inventory.add(new ItemStackSlot(this,406).setCoords( 124 , 33).setCraftingOutput(true)); //output
            storageType=0;
        }
        markDirty();
    }

    @Override
    public String getInventoryName(){
        return storageType==0?"trainsinmotion:trackcrafter":"trainsinmotion:traincrafter";
    }

    /**
     * <h2>Syncing</h2>
     */
    /**loads the tile entity's save file*/
    @Override
    public void readFromNBT(NBTTagCompound tag) {
        super.readFromNBT(tag);
        XmlBuilder data = new XmlBuilder(tag.getString("xmlData"));

        if (getSizeInventory()>0 && !data.itemMap.isEmpty()) {
            for (int i=0;i<getSizeInventory();i++) {
                if (data.containsItemStack("items."+i)) {
                    inventory.get(i).setSlotContents(data.getItemStack("items."+i), inventory);
                }
            }
        }

        if(getTankCapacity()!=null) {
            fluidTank = new FluidTankInfo[getTankCapacity().length];
            for (int i = 0; i < getTankCapacity().length; i++) {
                if (data.containsFluidStack("tanks." + i)) {
                    fluidTank[i] = new FluidTankInfo(data.getFluidStack("tanks."+i), getTankCapacity()[i]);
                }
            }
        } else {
            fluidTank= null;
        }

    }
    /**saves the tile entity to server world*/
    @Override
    public void writeToNBT(NBTTagCompound tag) {
        super.writeToNBT(tag);
        XmlBuilder data = new XmlBuilder();
        if (inventory!=null) {
            for (int i=0;i<getSizeInventory();i++) {
                if(inventory.get(i)!=null && inventory.get(i).getStack()!=null) {
                    data.putItemStack("items."+i, inventory.get(i).getStack());
                }
            }
        }
        for(int i=0; i<getTankInfo(null).length;i++){
            if(getTankInfo(i)!=null && getTankInfo(i).fluid!=null) {
                data.putFluidStack("tanks." + i, getTankInfo(i).fluid);
            } else if(getTankInfo(i)!=null){
                data.putFluidStack("tanks." + i, null);
            }
        }
        tag.setString("xmlData",data.toXMLString());
    }


    public void syncTileEntity(){
        for(Object o : this.worldObj.playerEntities){
            if(o instanceof EntityPlayerMP){
                EntityPlayerMP player = (EntityPlayerMP) o;
                if(player.getDistance(xCoord, yCoord, zCoord) <= 64) {
                    player.playerNetServerHandler.sendPacket(this.getDescriptionPacket());
                }
            }
        }
    }

    /**the fluidTank tank*/
    private FluidTankInfo[] fluidTank = null;


    /**defines the capacity of the fluidTank tank.
     * each value defibes another tank.
     * Usually value is 1,000 *the cubic meter capacity, so 242 gallons, is 0.9161 cubic meters, which is 916.1 tank capacity
     * mind you one water bucket is values at 1000, a full cubic meter of water.
     *example:
     * return new int[]{11000, 1000};
     * may return null*/
    public int[] getTankCapacity(){return null;}

    /** defines the whitelist of fluid names for fluid tanks in order.
     * null will accept any fluid.
     * example:
     * return new String[][]{{"water", "diesel"}, {"lava"}, null}*/
    public String[][] getTankFilters(){return null;}


    @Override
    public int fill(@Nullable ForgeDirection from, FluidStack resource, boolean doFill){
        if(getTankCapacity()==null){return resource.amount;}
        int leftoverDrain=resource.amount;
        for(int stack =0; stack<getTankCapacity().length;stack++) {
            if(getTankFilters()!=null && getTankFilters()[stack]!=null) {
                boolean check=false;
                for (String filter : getTankFilters()[stack]) {
                    if (filter.length()==0 || CommonUtil.stringContains(filter,resource.getFluid().getName())){
                        check=false;
                        break;
                    } else {
                        check=true;
                    }
                }
                if(check){
                    continue;
                }
            }
            if(getTankInfo(stack)!=null && (getTankInfo(stack).fluid==null|| getTankInfo(stack).fluid.getFluid()==null
            || getTankInfo(stack).fluid.amount==0)){

                int fill=leftoverDrain-fluidTank[stack].capacity;
                    if (fill < 0) {
                        if(doFill) {
                            fluidTank[stack] = new FluidTankInfo(resource, getTankInfo(stack).capacity);
                        }
                        return 0;
                    } else {
                        leftoverDrain-=getTankInfo(stack).capacity;
                        if(doFill) {
                        fluidTank[stack] = new FluidTankInfo(
                                new FluidStack(resource.getFluid(),getTankInfo(stack).capacity),
                                getTankInfo(stack).capacity);
                    }
                }
            }

            if (getTankInfo(stack)!=null &&  (
                    resource.getFluid() == null || (getTankInfo(stack).fluid!=null &&
                            getTankInfo(stack).fluid.getFluid() == resource.getFluid()))) {

                if(leftoverDrain+getTankInfo(stack).fluid.amount>getTankInfo(stack).capacity){
                    leftoverDrain-=getTankInfo(stack).capacity-getTankInfo(stack).fluid.amount;
                    if(doFill){
                        fluidTank[stack] = new FluidTankInfo(
                                new FluidStack(resource.fluid, getTankInfo(stack).capacity), getTankInfo(stack).capacity);
                    }
                } else if (leftoverDrain+getTankInfo(stack).fluid.amount<0){
                    leftoverDrain-=getTankInfo(stack).fluid.amount-resource.amount;
                    if(doFill){
                        fluidTank[stack] = new FluidTankInfo(
                                new FluidStack(getTankInfo(stack).fluid, 0), getTankInfo(stack).capacity);
                    }
                } else {
                    if(doFill){
                        fluidTank[stack] = new FluidTankInfo(
                                new FluidStack(resource.fluid, getTankInfo(stack).fluid.amount+leftoverDrain),
                                getTankInfo(stack).capacity);
                    }
                    leftoverDrain=0;
                }
                if(leftoverDrain==0){
                    return 0;
                }
            }
        }
        return leftoverDrain;
    }

    @Override
    public FluidStack drain(@Nullable ForgeDirection from, FluidStack resource, boolean doDrain){
        int leftoverDrain=resource.amount;
        for(FluidTankInfo stack : getTankInfo(null)) {
            if (stack.fluid.amount > 0 && (stack.fluid.getFluid()==TiMFluids.nullFluid || stack.fluid.getFluid() == resource.getFluid())) {
                if(leftoverDrain>stack.fluid.amount){
                    leftoverDrain-=stack.fluid.amount;
                    if(doDrain){
                        stack.fluid.amount=0;
                    }
                } else {
                    if(doDrain){
                        stack.fluid.amount-=leftoverDrain;
                    }
                    return null;
                }
            }
        }
        return resource;

    }

    public FluidStack getFluidStack(int slot){
        if(getTankInfo(null)!=null && getTankInfo(null)[slot]!=null){
            return null;
        } else {
            return getTankInfo(null)[slot].fluid;
        }
    }

    /*
     * <h1>Fluid Management</h1>
     */
    @Override
    public FluidStack drain(@Nullable ForgeDirection from, int drain, boolean doDrain){
        return drain(from, new FluidStack(TiMFluids.nullFluid, drain), doDrain);
    }


    @Override
    public boolean canFill(ForgeDirection from, Fluid fluid) {
        return getTankInfo(null)!=null;
    }

    @Override
    public boolean canDrain(@Nullable ForgeDirection from, Fluid resource){
        for(FluidTankInfo stack : getTankInfo(null)) {
            if (stack.fluid.amount > 0 && (resource == null || stack.fluid.getFluid() == resource)) {
                return true;
            }
        }
        return false;
    }

    public FluidTankInfo getTankInfo(int tank){
        return getTankInfo(null)[tank];
    }

    @Override
    public FluidTankInfo[] getTankInfo(ForgeDirection from){
        if(getTankCapacity()==null || getTankCapacity().length ==0){
            return new FluidTankInfo[]{};
        }

        if (fluidTank==null || fluidTank.length<getTankCapacity().length) {
            //initialize tanks
            FluidTankInfo[] tanks = new FluidTankInfo[getTankCapacity().length];
            for (int i = 0; i < getTankCapacity().length; i++) {
                tanks[i] = new FluidTankInfo(new FluidStack(FluidRegistry.WATER, 0), getTankCapacity()[i]);
            }
            fluidTank = tanks;
        } else {
            for (int f=0; f<fluidTank.length;f++){
                if(fluidTank[f]==null){
                    fluidTank[f]=new FluidTankInfo(new FluidStack(FluidRegistry.WATER, 0), getTankCapacity()[f]);
                }
            }
        }
        return fluidTank;
    }



    /**
     * <h2>inventory management</h2>
     */
    /**gets the number of slots the inventory.*/
    @Override
    public int getSizeInventory() {
        return inventory.size();
    }


    @Override
    public @Nullable ItemStack getStackInSlot(int slot) {
        if (inventory == null || slot <0 || slot >= inventory.size()){
            return null;
        } else {
            return inventory.get(slot).getStack();
        }
    }



    @Override
    public ItemStack decrStackSize(int slot, int stackSize) {
        if (inventory!= null && getSizeInventory()>=slot) {
            return inventory.get(slot).decrStackSize(stackSize);
        } else {
            return null;
        }
    }


    public ItemStackSlot getSlotIndexByID(int id){
        for(ItemStackSlot s : inventory){
            if (s.getSlotID() == id){
                return s;
            }
        }
        return null;
    }

    @Override
    public void setInventorySlotContents(int slot, ItemStack itemStack) {
        if (inventory != null && slot >=0 && slot <= getSizeInventory()) {
            inventory.get(slot).setSlotContents(itemStack,inventory);
        }
    }


    @Override
    public boolean hasCustomInventoryName() {
        return true;
    }
    @Override
    public int getInventoryStackLimit() {return 64;}
    /**checks if the player can interact with this container, usually used for a check if it's already in use or not*/
    @Override
    public boolean isUseableByPlayer(EntityPlayer p_70300_1_) {return true;}

    /**
     * <h2>slot limiter</h2>
     * This is supposed to see if a specific slot will take a specific item. However it's only called from slots we know are actual inventory slots,
     * which we put filters on there.
     * Because of this we don't even need to check the slot, just the item.
     */
    @Override
    public boolean isItemValidForSlot(int slot, ItemStack itemStack) {
        switch (storageType){
            //to do prevent putting items in output (taken care of elsewhere, left here as a note)
            case 0:{
                return true;
            }
            case 1:{
                if(slot==0){return OreDictionary.getOres("ingot").contains(itemStack);}
                if(slot==1||slot==2){
                    //todo: if block.modid==chisel return false;
                    return Block.getBlockFromItem(itemStack.getItem())!=null && Block.getBlockFromItem(itemStack.getItem()).isOpaqueCube();
                }
            }
        }
        return true;
    }

    public void dropInventory(){
        EntityItem item;
        for(ItemStackSlot slots: inventory){
            if(slots!=null&&slots.getStack()!=null){
                item= new EntityItem(worldObj);
                item.setEntityItemStack(slots.getStack());
                item.setPosition(xCoord,yCoord+1,zCoord);
                worldObj.spawnEntityInWorld(item);
            }
        }
    }

    /**
     * Goes to the next page of trains that fit the recipe. Will only increment if there is another page.
     */
    public void incrementPage() {
        if (pages > 1 && outputPage < pages) {
            //get the number of remaining pages
            //if there are some, increment the outputPage int
            outputPage++;
            for(ItemStackSlot slot: inventory) {
                slot.onSlotChanged();
                slot.onCraftMatrixChanged(this, inventory, false);
            }
        }
    }

    public void decrementPage() {
        if (pages > 1 && outputPage > 1) {
            outputPage--;
            for(ItemStackSlot slot: inventory) {
                slot.onSlotChanged();
                slot.onCraftMatrixChanged(this, inventory, false);
            }
        }
    }


    /**
     * <h2>unused</h2>
     * we have to initialize these values, but due to the design of the entity we don't actually use them.
     */
    /**for running functionality when opening the inventory, such as setting it as in use.*/
    @Override
    public void openInventory() {}
    /**for running functionality when closing the inventory, such as setting it as not in use.*/
    @Override
    public void closeInventory() {}
    @Override
    public ItemStack getStackInSlotOnClosing(int p_70304_1_) {return null;}
    @Override
    public void markDirty() {super.markDirty();}
}
