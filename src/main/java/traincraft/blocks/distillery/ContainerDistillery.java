package traincraft.blocks.distillery;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import traincraft.api.SlotInventory;

public class ContainerDistillery extends Container {
    
    private TileDistillery tile;
    private EntityPlayer player;
    
    public ContainerDistillery(TileDistillery tile, EntityPlayer player) {
        this.tile = tile;
        this.player = player;
    
        IInventory inv = tile.getRealInventory();
        if(inv != null){
            this.addSlotToContainer(new SlotInventory(inv, TileDistillery.INPUT_SLOT, 56, 17));
            this.addSlotToContainer(new SlotInventory(inv, TileDistillery.BURN_SLOT, 56, 53));
            this.addSlotToContainer(new SlotInventory(inv, TileDistillery.OUTPUT_SLOT, 116, 60));
            this.addSlotToContainer(new SlotInventory(inv, TileDistillery.CONTAINER_INPUT_SLOT, 123, 8));
            this.addSlotToContainer(new SlotInventory(inv, TileDistillery.CONTAINER_OUTPUT_SLOT, 123, 33));
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
    public boolean canInteractWith(EntityPlayer playerIn) {
        return true;
    }
    
    @Override
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int index) {
        return ItemStack.EMPTY; // todo distillery container shift click behaviour
    }
}
