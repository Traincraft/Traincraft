package ebf.tim.blocks;


import ebf.tim.registry.TiMFluids;
import ebf.tim.utility.CommonUtil;
import ebf.tim.utility.ItemStackSlot;
import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
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


    public TileEntityStorage(BlockDynamic block){
        super(block);
        int s=400;
        inventory= new ArrayList<>();
        if(block.getUnlocalizedName().equals("tile.block.traintable")){
            //inventory grid (left grid)
            for (int l = 0; l < 3; ++l) {
                for (int i1 = 0; i1 < 3; ++i1) {
                    inventory.add(new ItemStackSlot(this,s).setCoords( 30 + i1 * 18, 17 + l * 18).setCraftingInput(true));
                    s++;
                }
            }
            //tile entity's crafting grid (right hand grid)
            for (int l = 0; l < 3; ++l) {
                for (int i1 = 0; i1 < 3; ++i1) {
                    inventory.add(new ItemStackSlot(this,s).setCoords( 106 + i1 * 18, 17 + l * 18));
                    s++;
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
    /**the list of item stacks in the inventory*/
    public List<ItemStackSlot> inventory = new ArrayList<ItemStackSlot>();
    public int storageType=0;
    public int outputPage=0;
    public boolean multiPage=false;

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
        if (getSizeInventory()>0) {
            for (int i=0;i<getSizeInventory();i++) {
                if (tag.hasKey("transportinv."+i)) {
                    inventory.get(i).setSlotContents(ItemStack.loadItemStackFromNBT(tag.getCompoundTag("transportinv."+i)), inventory);
                }
            }
        }

        if(getTankCapacity()!=null) {
            fluidTank = new FluidTankInfo[getTankCapacity().length];
            for (int i = 0; i < getTankCapacity().length; i++) {
                if (tag.hasKey("tanks." + i)) {
                    fluidTank[i] = new FluidTankInfo(FluidStack.loadFluidStackFromNBT(tag.getCompoundTag("tanks." + i)), getTankCapacity()[i]);
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
        if (inventory!=null) {
            for (int i=0;i<getSizeInventory();i++) {
                NBTTagCompound invTag = new NBTTagCompound();
                if(inventory.get(i)!=null && inventory.get(i).getStack()!=null) {
                    inventory.get(i).getStack().writeToNBT(invTag);
                    tag.setTag("transportinv."+i, invTag);
                }
            }
        }
        for(int i=0; i<getTankInfo(null).length;i++){
            if(getTankInfo(null) !=null) {
                NBTTagCompound tank = new NBTTagCompound();
                getTankInfo(null)[i].fluid.writeToNBT(tank);
                tag.setTag("tanks." + i, tank);
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
            if (getTankInfo(null)[stack]!=null && (
                    resource.getFluid() == null || getTankInfo(null)[stack].fluid.getFluid() == resource.getFluid() ||
                            getTankInfo(null)[stack].fluid.amount ==0)) {

                if(leftoverDrain+getTankInfo(null)[stack].fluid.amount>getTankInfo(null)[stack].capacity){
                    leftoverDrain-=getTankInfo(null)[stack].capacity-getTankInfo(null)[stack].fluid.amount;
                    if(doFill){
                        getTankInfo(null)[stack] = new FluidTankInfo(
                                new FluidStack(resource.fluid, getTankInfo(null)[stack].capacity), getTankInfo(null)[stack].capacity);
                    }
                } else if (leftoverDrain+getTankInfo(null)[stack].fluid.amount<0){
                    leftoverDrain-=getTankInfo(null)[stack].fluid.amount-resource.amount;
                    if(doFill){
                        getTankInfo(null)[stack] = new FluidTankInfo(
                                new FluidStack(getTankInfo(null)[stack].fluid, 0), getTankInfo(null)[stack].capacity);
                    }
                } else {
                    if(doFill){
                        getTankInfo(null)[stack] = new FluidTankInfo(
                                new FluidStack(resource.fluid, getTankInfo(null)[stack].fluid.amount+leftoverDrain),
                                getTankInfo(null)[stack].capacity);
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
            //todo prevent putting items in output
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
