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
    private int tierIn = 0; //The tier of assemblytable this slot is in, if applicable. Ignore if not applicable.

    public ItemStackSlot(IInventory host, int slot, int tier){
        super(host, slot, 0,0);
        this.slotNumber = slot;
        this.slotID = slot;
        this.tierIn = tier;
    }

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

    public int getMaxCraft(IInventory hostInventory, List<ItemStackSlot> hostSlots) {
        if (isCraftingOutput && hostInventory instanceof TileEntityStorage) {
            //must be an output slot, must be in an inventory that does crafting
            switch (((TileEntityStorage) hostInventory).storageType) {
                case 0:
                    //rail crafting table

                    //same as the original function's implementation
                    //  ie. out of non-zero stacks, return the size of the smallest stack

                    int smallestStack = ((TileEntityStorage) hostInventory).getSlotIndexByID(400).getStackSize();
                    if (smallestStack > 1) { //greater than 1 because if 1 the rest can't be smaller
                        for (int i = 0; i < 5; i++) {
                            int sizeOfStack = ((TileEntityStorage) hostInventory).getSlotIndexByID(400 + i).getStackSize();
                            if (sizeOfStack > 0 && sizeOfStack < smallestStack) {
                                smallestStack = sizeOfStack;
                            }
                        }
                    }
                    return smallestStack;
                case 1:
                    //train crafting system
                    Recipe recipe = RecipeManager.getRecipe(stack); //get the recipe that crafts item in this slot.

                    int largestAmountCanMake = 999;

                    if (recipe != null && recipe.getRecipeItems() != null) {
                        //make sure there is a recipe that crafts this.

                        for (int i = 0; i < recipe.getRecipeItems().size(); i++) {
                            //iterate over all ingredients in recipe

                            if (recipe.getRecipeItems().get(i).get(0) == null && ((TileEntityStorage) hostInventory).getSlotIndexByID(400 + i).getStack() == null) {
                                //both null means the counting doesn't matter for this ingredient.
                                continue;
                            }

                            if (recipe.getRecipeItems().get(i).get(0) == null) {
                                //that's a problem, log it
                                DebugUtil.println("There's a stack missing after the recipe has already been compared!");
                                return 0; //can't craft any if this is the case
                            }

                            //for each ingredient, we want to see the most that can be crafted with the ingredient,
                            //  then take the lowest number, for the stack that can craft the least of that ingredient.
                            //  each ItemStack in the ingredient will have the same size, so we can use the first one because it's always there.
                            int amountCanMake = ((TileEntityStorage) hostInventory).getSlotIndexByID(400 + i).getStackSize() / recipe.getRecipeItems().get(i).get(0).stackSize;
                            if (amountCanMake < largestAmountCanMake) {
                                largestAmountCanMake = amountCanMake;
                            }
                        }
                    }
                    return largestAmountCanMake;
            }
        }
        return 0;
    }

    /**
     * Helper function to fill the output slots with the given stacks. This is a method to account for the 9 output slots
     * in TiM and the 8 in the Traincraft assemblytable. This could be merged back into original function (onCraftMatrixChanged).
     */
    private void putResultsInOutputSlots(IInventory hostInventory, List<ItemStackSlot> hostSlots, List<ItemStack> slots, int page, int numberSlots) {
        if(slots==null){
            for (int i = 0; i < numberSlots; i++) {
                putStackInSlot(hostSlots,409 + i, null);
            }
            ((TileEntityStorage) hostInventory).pages = 1;
            ((TileEntityStorage) hostInventory).outputPage = 1;
        } else {
            if(slots.size() <= numberSlots) {
                for (int i = 0; i < numberSlots; i++) {
                    putStackInSlot(hostSlots,409 + i, i >= slots.size() ?null: slots.get(i));
                }
                ((TileEntityStorage)hostInventory).pages = 1;
                ((TileEntityStorage)hostInventory).outputPage = 1;
            } else {//skip 2 since buttons will be in their place.
                if (tierIn > 0) {
                    for (int i = 0; i < numberSlots - 2; i++) {//TODO: disable the slots with buttons (last two)
                        putStackInSlot(hostSlots, 409 + i + ((numberSlots - 2) * (page - 1)), slots.get(i + ((numberSlots - 2) * (page - 1))));
                    }
                } else {
                    //TiM crafter, but buttons in awkward place coding-wise
                    putStackInSlot(hostSlots,409 + (7 * (page - 1)), slots.get(7 * (page - 1)));
                    putStackInSlot(hostSlots,410 + (7 * (page - 1)), slots.get(1 + (7 * (page - 1))));
                    putStackInSlot(hostSlots,411 + (7 * (page - 1)), slots.get(2 + (7 * (page - 1))));
                    //intentionally skip 412 because an arrow is there
                    putStackInSlot(hostSlots,413 + (7 * (page - 1)), slots.get(3 + (7 * (page - 1))));
                    //intentionally skip 414 because an arrow is there
                    putStackInSlot(hostSlots,415 + (7 * (page - 1)), slots.get(4 + (7 * (page - 1))));
                    putStackInSlot(hostSlots,416 + (7 * (page - 1)), slots.get(5 + (7 * (page - 1))));
                    putStackInSlot(hostSlots,417 + (7 * (page - 1)), slots.get(6 + (7 * (page - 1))));
                }

                //divide the possible trains by the number of usable slots on each page and round it up
                ((TileEntityStorage)hostInventory).pages = (slots.size()/(numberSlots-2)) + 1;
            }
        }
    }

    private void onCraftMatrixChanged(IInventory hostInventory, List<ItemStackSlot> hostSlots) {
        if((isCraftingInput || isCraftingOutput) && hostInventory instanceof TileEntityStorage) {
            int page = ((TileEntityStorage)hostInventory).outputPage;
            switch (((TileEntityStorage)hostInventory).storageType) {
                case 1: { //train crafting
                    List<ItemStack> slots = RecipeManager.getResult(RecipeManager.getTransportRecipe(hostInventory), this.tierIn);

                    if (ClientProxy.isTraincraft && tierIn > 0) {
                        putResultsInOutputSlots(hostInventory, hostSlots, slots, page, 8);
                    } else {
                        putResultsInOutputSlots(hostInventory, hostSlots, slots, page, 9);
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
            case 1: { //train crafting table
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
            case 0:{
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

    /** Here, we use it to control whether or not to do the highlighting of slot when mousing over it.
     * I am 99% sure it is used for that based on usages of the function found via IntelliJ.
     * Function it overrides always returns true.
     *
     * @return boolean for if it should draw highlight
     */
    @Override
    public boolean func_111238_b() {
        //if the java ap exam taught me anything, it's short-circuit evaluation.
        if (inventory instanceof TileEntityStorage && ((TileEntityStorage) inventory).pages > 1) {
            if (tierIn > 0 && (slotID == 415 || slotID == 416)) {
                //traincraft assemblyTables
                return false;
            } else if (tierIn == 0 && (slotID == 412 || slotID == 414)) {
                //TiM traintable
                return false;
            }
        }
        return true;
    }
}
