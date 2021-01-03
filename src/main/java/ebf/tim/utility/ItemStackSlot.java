package ebf.tim.utility;

import ebf.tim.blocks.TileEntityStorage;
import ebf.tim.entities.GenericRailTransport;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import javax.annotation.Nullable;
import java.util.List;

/**
 * @author Eternal Blue Flame
 * TODO: add support for tile entities post 0.2.7.
 */
public class ItemStackSlot extends Slot {

    private ItemStack stack = null, overlay = null;
    private int slotID;
    private boolean isCraftingOutput = false, isCraftingInput = false;

    public ItemStackSlot(IInventory host, int slot){
        super(host, slot, 0,0);
        slotNumber=slot;
        slotID=slot;
    }

    public ItemStackSlot setCraftingOutput(boolean craft){
        isCraftingOutput =craft;
        return this;
    }

    public boolean isCraftingOutput() {
        return isCraftingOutput;
    }


    public ItemStackSlot setCraftingInput(boolean craft){
        isCraftingInput =craft;
        return this;
    }

    public boolean isCraftingInput() {
        return isCraftingInput;
    }

    public ItemStackSlot(IInventory host, int slot, int x, int y){
        super(host, slot, 0,0);
        slotID=slot;
        slotNumber=slot;
        xDisplayPosition=x;
        yDisplayPosition=y;
    }

    public ItemStackSlot setCoords(int x, int y){
        xDisplayPosition=x;
        yDisplayPosition=y;
        return this;
    }
    public ItemStackSlot setSlotID(int slot){
        slotID=slot;
        return this;
    }
    public ItemStackSlot setSlot(int slot){
        this.slotNumber=slot;
        return this;
    }

    public ItemStack getOverlay(){
        return overlay;
    }

    public ItemStackSlot setOverlay(ItemStack s){
        overlay=s;
        return this;
    }

    public ItemStackSlot setOverlay(Item s){
        overlay=new ItemStack(s);
        return this;
    }

    public ItemStackSlot setOverlay(Block s){
        overlay=new ItemStack(s);
        return this;
    }

    public Item getItem(){
        return getStack()!=null?getStack().getItem():null;
    }


    public NBTTagCompound writeToNBT(){
        return getStack()!=null?getStack().writeToNBT(new NBTTagCompound()):null;
    }

    public int getStackSize(){
        return getStack()!=null?getStack().stackSize:0;
    }


    public ItemStack mergeStack(ItemStack itemStack, List<ItemStackSlot> hostInventory,int inventoryType){
        if (isItemValid(itemStack)) {

            if (!getHasStack()) {
                onCrafting(inventoryType,hostInventory,getStackSize());
                if(!setSlotContents(itemStack.copy(),hostInventory)){
                    return itemStack;
                }
                return null;
            } else if (contentEquals(itemStack) && getStackSize() < getStack().getMaxStackSize()) {
                if (itemStack.copy().stackSize + getStackSize() <= getStack().getMaxStackSize()) {
                    onCrafting(inventoryType,hostInventory,getStackSize());
                    setSlotStacksize(getStackSize() +itemStack.copy().stackSize);
                    return null;
                } else {
                    itemStack.stackSize -= getStack().getMaxStackSize() - getStackSize();
                    setSlotStacksize(getStack().getMaxStackSize());
                    onCrafting(inventoryType,hostInventory,itemStack.getMaxStackSize()-itemStack.stackSize);
                    if(itemStack.stackSize==0){
                        itemStack=null;
                    }
                    return itemStack;
                }
            }
        }
        return itemStack;
    }

    public ItemStack mergeStack(ItemStackSlot itemStack, List<ItemStackSlot> hostInventory, int storageType){
        if (isItemValid(itemStack.getStack())) {

            if (!getHasStack()) {
                itemStack.onCrafting(storageType,hostInventory,itemStack.getStackSize());
                if(!setSlotContents(itemStack.getStack(),hostInventory)){
                    return itemStack.getStack();
                } else {
                    itemStack.setSlotContents(null, hostInventory);
                    return null;
                }
            } else {
                if (contentEquals(itemStack.getStack()) && getStack().stackSize < getStack().getMaxStackSize()) {
                    if(itemStack.getStackSize()+getStackSize()<=getStack().getMaxStackSize()){
                        itemStack.onCrafting(storageType,hostInventory,itemStack.getStackSize());
                        setSlotStacksize(getStack().stackSize+itemStack.getStackSize());
                        return null;
                    } else {
                        int difference=getStack().getMaxStackSize()-getStackSize();
                        itemStack.onCrafting(storageType,hostInventory,difference);
                        itemStack.decrStackSize(difference);
                        setSlotStacksize(getStack().getMaxStackSize());
                        return itemStack.getStack();
                    }
                }
            }
        }
        return itemStack.getStack();
    }


    public boolean contentEquals(ItemStack other){
        if(getStack()==null || other==null){
            return getStack()==null&& other==null;
        }
        return other.getItem()== getStack().getItem() && other.getTagCompound()== getStack().getTagCompound();
    }

    public int getMaxCraft(IInventory hostInventory, List<ItemStackSlot> hostSlots){
        int value =0;
        if(isCraftingOutput && hostInventory instanceof TileEntityStorage) {
            if(((TileEntityStorage)hostInventory).storageType==0){
                int size=0;
                Recipe r = RecipeManager.getRecipe(stack);
                if(r!=null && r.getRecipeItems()!=null) {
                    for (int i = 0; i < r.getRecipeItems().size(); i++) {
                        for (ItemStack s : r.getRecipeItems().get(i)) {
                            if (s != null && ((TileEntityStorage) hostInventory).getSlotIndexByID(400 + i).stack != null &&
                                    s.getItem() == ((TileEntityStorage) hostInventory).getSlotIndexByID(400 + i).stack.getItem()) {
                                value = Math.max(size,
                                        ((TileEntityStorage) hostInventory).getSlotIndexByID(400 + i).stack.stackSize / s.stackSize);
                            }
                        }
                    }
                }
            } else {
                value = ((TileEntityStorage) hostInventory).getSlotIndexByID(400).getStackSize();
                if(value>1) {
                    for (int i = 1; i < 5; i++) {
                        if (((TileEntityStorage) hostInventory).getSlotIndexByID(400 + i).getStackSize() > 0 &&
                                ((TileEntityStorage) hostInventory).getSlotIndexByID(400 + i).getStackSize() < value) {
                            value = ((TileEntityStorage) hostInventory).getSlotIndexByID(400 + i).getStackSize();
                        }
                    }
                }
            }
        }
        return value;
    }

    private void onCraftMatrixChanged(IInventory hostInventory, List<ItemStackSlot> hostSlots) {
        if((isCraftingInput || isCraftingOutput) && hostInventory instanceof TileEntityStorage) {
            int page = ((TileEntityStorage)hostInventory).outputPage;
            switch (((TileEntityStorage)hostInventory).storageType) {
                case 1: { //train crafting
                    List<ItemStack> slots = RecipeManager.getResult(RecipeManager.getTransportRecipe(hostInventory));
                    if(slots==null){
                        for (int i = 0; i < 9; i++) {
                            putStackInSlot(hostSlots,409 + i, null);
                        }
                    } else {
                        if(slots.size()<10) {
                            for (int i = 0; i < 9; i++) {
                                putStackInSlot(hostSlots,409 + i, i >= slots.size() ?null: slots.get(i));
                            }
                            ((TileEntityStorage)hostInventory).multiPage=false;
                        } else {//when theres 10 or more outputs skip 2 since buttons will be in their place.
                            putStackInSlot(hostSlots,409 + (7*page), slots.get((7*page)));
                            putStackInSlot(hostSlots,410 + (7*page), slots.get(1+ (7*page)));
                            putStackInSlot(hostSlots,411 + (7*page), slots.get(2+ (7*page)));
                            //intentionally skip 412 because an arrow is there
                            putStackInSlot(hostSlots,413 + (7*page), slots.get(3+ (7*page)));
                            //intentionally skip 414 because an arrow is there
                            putStackInSlot(hostSlots,415 + (7*page), slots.get(4+ (7*page)));
                            putStackInSlot(hostSlots,416 + (7*page), slots.get(5+ (7*page)));
                            putStackInSlot(hostSlots,417 + (7*page), slots.get(6+ (7*page)));

                            ((TileEntityStorage)hostInventory).multiPage=true;
                        }

                    }
                    break;
                }
                case 0: { //track crafting
                    putStackInSlot(hostSlots,406, RecipeManager.railRecipe(hostInventory));
                    break;
                }
            }

            //todo: vanilla crafting table support for workcarts.

        }
    }

    public void onCrafting(int storageType, List<ItemStackSlot> hostSlots, int stacksize){
        if(!isCraftingOutput){return;}

        switch (storageType) {
            case 0: {
                Recipe r = RecipeManager.getRecipe(getStack());
                if(r==null || r.input==null){return;}
                for(int i=0;i<9;i++){
                    if(r.input.get(i)!=null) {
                        for (ItemStack s : r.input.get(i)) {
                            if (slotMatchesItem(hostSlots, 400 + i, s)) {
                                shrinkStackInSlot(hostSlots, 400 + i, s == null ? 0 : stacksize * s.stackSize);
                                break;
                            }
                        }
                    }
                }
                break;
            }
            case 1:{
                for(int i=0;i<6;i++){
                    shrinkStackInSlot(hostSlots,400+i,stacksize);
                }
                break;
            }
        }
    }


    public static boolean slotMatchesItem(List<ItemStackSlot> hostSlots, int slot, ItemStack stack){
        ItemStackSlot stackSlot=null;
        for(ItemStackSlot stak: hostSlots){
            if (stak.getSlotIndex() ==slot){
                stackSlot=stak;
            }
        }
        if (stackSlot!=null) {
            if(stackSlot.getStack()==null || stack==null) {
                return stackSlot.getStack() == null && stack == null;
            } else {
                return stack.getItem()==stackSlot.getStack().getItem();
            }
        } else {
            return stack==null;
        }
    }

    public static void shrinkStackInSlot(List<ItemStackSlot> hostSlots, int slot, int size) {
        if(size<1){return;}
        for(ItemStackSlot stak: hostSlots){
            if (stak.getSlotIndex() ==slot){
                if(stak.getStackSize()-size<1){
                    stak.setStack(null);
                } else {
                    stak.setSlotStacksize(stak.getStackSize() - size);
                }
            }
        }
    }

    public void putStackInSlot(List<ItemStackSlot> hostSlots, int slot, ItemStack stack) {
        ItemStackSlot stackSlot=null;
        for(ItemStackSlot stak: hostSlots){
            if (stak.getSlotIndex() ==slot){
                stackSlot=stak;
            }
        }
        if (stackSlot!=null) {
            if (!(stackSlot.inventory instanceof GenericRailTransport) && !(stackSlot.inventory instanceof TileEntityStorage)) {
                stackSlot.inventory.setInventorySlotContents(slot, stack);
            } else {
                stackSlot.setStack(stack);
            }
        }
    }

    public boolean setSlotContents(@Nullable ItemStack stack, List<ItemStackSlot> hostInventory){
        if (isItemValid(stack) || stack == null) {
            if (!(inventory instanceof GenericRailTransport) && !(inventory instanceof TileEntityStorage)) {
                    inventory.setInventorySlotContents(slotNumber, stack==null?null:stack.copy());
            } else {
                this.stack = stack==null?null:stack.copy();
            }
            this.onSlotChanged();
            if(hostInventory!=null) {
                onCraftMatrixChanged(inventory, hostInventory);
            }
            return true;
        }
        return false;
    }


    public boolean setSlotStacksize(int size){
        if(getStack()!=null) {
            ItemStack s = getStack().copy();
            s.stackSize=size;
            setStack(s);
            inventory.setInventorySlotContents(slotNumber, s);
        }
        this.onSlotChanged();
        return true;
    }

    /**
     * if par2 has more items than par1, onCrafting(item,countIncrease) is called
     */
    public void onSlotChange(ItemStack p_75220_1_, ItemStack p_75220_2_) {
        if (p_75220_1_ != null && p_75220_2_ != null && p_75220_1_.getItem() == p_75220_2_.getItem()) {
            int i = p_75220_2_.stackSize - p_75220_1_.stackSize;

            if (i > 0) {
                this.onCrafting(p_75220_1_, i);
            }
        }
        this.inventory.markDirty();
    }

    /*
     * the itemStack passed in is the output - ie, iron ingots, and pickaxes, not ore and wood. Typically increases an
     * internal count then calls onCrafting(item).
     protected void onCrafting(ItemStack p_75210_1_, int p_75210_2_) {}
     */

    /*
     * the itemStack passed in is the output - ie, iron ingots, and pickaxes, not ore and wood.
     protected void onCrafting(ItemStack p_75208_1_) {}
     */

    /**
     * Check if the stack is a valid item for this slot. Always true beside for the armor slots.
     */
    @Override
    public boolean isItemValid(ItemStack p_75214_1_) {
        if(p_75214_1_==null || p_75214_1_.getItem()==null){return true;}
        return inventory.isItemValidForSlot(getSlotID(), p_75214_1_);
    }

    /**
     * Helper fnct to get the stack in the slot.
     */
    @Override
    public ItemStack getStack() {
        return inventory instanceof GenericRailTransport || inventory instanceof TileEntityStorage ?stack:
                inventory!=null && inventory.getSizeInventory()>slotNumber?
                        inventory.getStackInSlot(slotNumber):null;
    }

    /**
     * Helper method to put a stack in the slot.
     * @deprecated use {@link #setSlotContents(ItemStack, List)} instead because it can return whether ot not it actually did it.
     */
    @Override
    @Deprecated
    public void putStack(ItemStack p_75215_1_) {
        setSlotContents(p_75215_1_,null);
    }

    public void setStack(ItemStack p_75215_1_) {
        stack=p_75215_1_;
    }

    /**
     * Called when the stack in a Slot changes, only for tile entities.
     */
    @Override
    public void onSlotChanged() {
        inventory.markDirty();
    }

    /**
     * Returns the maximum stack size for a given slot (usually the same as getInventoryStackLimit(), but 1 in the case
     * of armor slots)
     */
    @Override
    public int getSlotStackLimit() {
        return getHasStack()?getStack().getMaxStackSize():64;
    }

    /**
     * Decrease the size of the stack in slot (first int arg) by the amount of the second int arg. Returns the new
     * stack.
     */
    @Override
    public ItemStack decrStackSize(int p_75209_1_) {
        if(!getHasStack() ||p_75209_1_ >=getStack().stackSize){
            setSlotContents(null,null);
        } else {
            getStack().stackSize-=p_75209_1_;
        }
        return getStack();
    }

    /**
     * returns if the target Iinventory is from the same class as this
     */
    @Override
    @Deprecated
    public boolean isSlotInInventory(IInventory p_75217_1_, int p_75217_2_) {
        return inventory.getClass() == p_75217_1_.getClass();
    }

    /**
     * Return whether this slot's stack can be taken from this slot.
     */
    @Override
    public boolean canTakeStack(EntityPlayer p_82869_1_) {
        return !(inventory instanceof GenericRailTransport) || ((GenericRailTransport) inventory).getPermissions(p_82869_1_, false, false);
    }

    /**
     * Retrieves the index in the inventory for this slot, this value should typically not
     * be used, but can be useful for some occasions.
     *
     * @return Index in associated inventory for this slot.
     */
    @Override
    public int getSlotIndex() { return slotNumber; }


    public int getSlotID(){return slotID;}
}
