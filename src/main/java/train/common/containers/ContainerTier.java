package train.common.containers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryCraftResult;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import train.common.core.interfaces.ITier;
import train.common.slots.SlotCrafterTier;
import train.common.slots.SlotResultTier;

public class ContainerTier extends ContainerTraincraft {

	private IInventory tier;
	private ITier tier1;
	public IInventory craftResult;

	public ContainerTier(InventoryPlayer inventoryplayer, IInventory te) {
		super(te.getSizeInventory());
		tier = te;
		tier1 = (ITier) te;
		craftResult = new InventoryCraftResult();

		addSlotToContainer(new SlotCrafterTier(inventoryplayer.player, tier, 0, 25, 27));
		addSlotToContainer(new SlotCrafterTier(inventoryplayer.player, tier, 1, 43, 93));
		addSlotToContainer(new SlotCrafterTier(inventoryplayer.player, tier, 2, 79, 93));
		addSlotToContainer(new SlotCrafterTier(inventoryplayer.player, tier, 3, 145, 93));
		addSlotToContainer(new SlotCrafterTier(inventoryplayer.player, tier, 4, 79, 27));

		addSlotToContainer(new SlotCrafterTier(inventoryplayer.player, tier, 5, 115, 27));
		addSlotToContainer(new SlotCrafterTier(inventoryplayer.player, tier, 6, 79, 61));
		addSlotToContainer(new SlotCrafterTier(inventoryplayer.player, tier, 7, 115, 61));
		addSlotToContainer(new SlotCrafterTier(inventoryplayer.player, tier, 8, 25, 61));
		addSlotToContainer(new SlotCrafterTier(inventoryplayer.player, tier, 9, 145, 27));

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				if (i == 1)
					addSlotToContainer(new SlotResultTier(inventoryplayer.player, tier, j + 10, 92 + j * 18, 128));//92, 128
				else
					addSlotToContainer(new SlotResultTier(inventoryplayer.player, tier, j + 14, 92 + j * 18, 146));//92, 128
			}
		}

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				if (i == 1)
					addSlotToContainer(new Slot(tier, j + 18, 8 + j * 18, 128));//92, 128
				else
					addSlotToContainer(new Slot(tier, j + 22, 8 + j * 18, 146));//92, 128
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int k = 0; k < 9; k++) {
				addSlotToContainer(new Slot(inventoryplayer, k + i * 9 + 9, 8 + k * 18, 174 + i * 18));
			}
		}
		for (int j = 0; j < 9; j++) {
			addSlotToContainer(new Slot(inventoryplayer, j, 8 + j * 18, 232));
		}

		onCraftMatrixChanged(tier);
	}

	@Override
	public void detectAndSendChanges() {
		super.detectAndSendChanges();
		if (tier1.getResultList() != null) {
			if (tier1.getResultList().size() <= 8) {
				for (int i = 0; i < tier1.getResultList().size(); i++) {
					tier.setInventorySlotContents(i + 10, new ItemStack(tier1.getResultList().get(i)));
				}
			}
			else {
				System.err.println("Too many results, too little slots!");
			}
		}
	}
	
	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int i) {
		return super.transferStackInSlot(player, i);
	}

	@Override
	public boolean canInteractWith(EntityPlayer entityplayer) {
		return tier.isUseableByPlayer(entityplayer);
	}
}
