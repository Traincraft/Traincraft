package si.meansoft.traincraft.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import si.meansoft.traincraft.tileEntities.TileEntityDistillery;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author canitzp
 */
public class ContainerDistillery extends Container {

    public EntityPlayer player;
    public TileEntityDistillery distillery;
    private Map<Object, Object> toUpdate = new HashMap<Object, Object>();
    public int currentBurn, currentCookTime, maxBurnTime, maxCookTime, amount;

    public ContainerDistillery(EntityPlayer player, TileEntity distillery){
        this.player = player;
        this.distillery = (TileEntityDistillery) distillery;
        for(int j = 0; j < 3; ++j) {
            for(int k = 0; k < 9; ++k) {
                this.addSlotToContainer(new Slot(player.inventory, k + j * 9 + 9, 8 + k * 18, 84 + j * 18));
            }
        }
        for(int j = 0; j < 9; ++j) {
            this.addSlotToContainer(new Slot(player.inventory, j, 8 + j * 18, 142));
        }
        addSlotToContainer(new Slot(this.distillery, 0, 56, 17));
        addSlotToContainer(new Slot(this.distillery, 1, 56, 53){
            @Override
            public boolean isItemValid(ItemStack stack) {
                return TileEntityFurnace.isItemFuel(stack);
            }
        });
        addSlotToContainer(new Slot(this.distillery, 2, 123, 8));
        addSlotToContainer(new Slot(this.distillery, 3, 123, 33){@Override public boolean isItemValid(ItemStack stack) {return false;}});
        addSlotToContainer(new Slot(this.distillery, 4, 116, 60){@Override public boolean isItemValid(ItemStack stack) {return false;}});
        toUpdate.put(currentBurn, ((TileEntityDistillery) distillery).currentBurn);
        toUpdate.put(currentCookTime, ((TileEntityDistillery) distillery).currentCookTime);
        toUpdate.put(maxBurnTime, ((TileEntityDistillery) distillery).maxBurnTime);
        toUpdate.put(maxCookTime, ((TileEntityDistillery) distillery).maxCookTime);
    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return true;
    }

    /**
     * Take a stack from the specified inventory slot.
     *
     * @param playerIn
     * @param index
     */
    @Override
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int index) {
        return null;
    }

    /**
     * Looks for changes made in the container, sends them to every listener.
     */
    @Override
    public void detectAndSendChanges() {
        super.detectAndSendChanges();

        for(ICrafting crafting : this.listeners){
            if(this.currentBurn != this.distillery.currentBurn){
                crafting.sendProgressBarUpdate(this, 0, this.distillery.getField(0));
            }
            if(this.currentCookTime != this.distillery.currentCookTime){
                crafting.sendProgressBarUpdate(this, 1, this.distillery.getField(1));
            }
            if(this.maxBurnTime != this.distillery.maxBurnTime){
                crafting.sendProgressBarUpdate(this, 2, this.distillery.getField(2));
            }
            if(this.maxCookTime != this.distillery.maxCookTime){
                crafting.sendProgressBarUpdate(this, 3, this.distillery.getField(3));
            }
            if(this.amount != this.distillery.tank.getFluidAmount()){
                crafting.sendProgressBarUpdate(this, 4, this.distillery.tank.getFluidAmount());
            }
        }
        this.currentBurn = this.distillery.currentBurn;
        this.currentCookTime = this.distillery.currentCookTime;
        this.maxBurnTime = this.distillery.maxBurnTime;
        this.maxCookTime = this.distillery.maxCookTime;
        this.amount = this.distillery.tank.getFluidAmount();
    }

    @Override
    public void updateProgressBar(int id, int data) {
        this.distillery.setField(id, data);
    }

}
