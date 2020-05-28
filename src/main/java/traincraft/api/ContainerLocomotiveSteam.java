package traincraft.api;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraftforge.fluids.capability.CapabilityFluidHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.wrapper.InvWrapper;

public class ContainerLocomotiveSteam extends Container {
    
    private final LocomotiveSteam<?> locomotiveSteam;
    
    public ContainerLocomotiveSteam(LocomotiveSteam<?> locomotiveSteam, EntityPlayer player) {
        this.locomotiveSteam = locomotiveSteam;
        IItemHandler inventory = locomotiveSteam.getInventory(locomotiveSteam, null);
        if(inventory instanceof InvWrapper){
            this.addSlotToContainer(new SlotSpecific(((InvWrapper) inventory).getInv(), 0, 8, 53, TileEntityFurnace::isItemFuel));
            this.addSlotToContainer(new SlotSpecific(((InvWrapper) inventory).getInv(), 1, 32, 53, stack -> stack.hasCapability(CapabilityFluidHandler.FLUID_HANDLER_ITEM_CAPABILITY, null)));
            for(int x = 0; x < 3; ++x){
                for(int y = 0; y < 3; ++y){
                    this.addSlotToContainer(new Slot(((InvWrapper) inventory).getInv(), y + x * 3 + 2, 80 + y * 18, 18 + x * 18));
                }
            }
        }
    
        for(int x = 0; x < 3; ++x){
            for(int y = 0; y < 9; ++y){
                this.addSlotToContainer(new Slot(player.inventory, y + x * 9 + 9, 8 + y * 18, 84 + x * 18));
            }
        }
    
        for(int x = 0; x < 9; ++x){
            this.addSlotToContainer(new Slot(player.inventory, x, 8 + x * 18, 142));
        }
    }
    
    @Override
    public boolean canInteractWith(EntityPlayer player) {
        return true;
    }
    
    @Override
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int index) {
        return ItemStack.EMPTY;
    }
}
