package train.blocks.hearth;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.utility.TransportSlotManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.ICrafting;

public class ContainerOpenHearthFurnace extends TransportSlotManager {

	private TileEntityOpenHearthFurnace furnace;
	private int cookTime;
	private int burnTime;
	private int itemBurnTime;


	public ContainerOpenHearthFurnace(InventoryPlayer inventoryplayer, TileEntityOpenHearthFurnace tileentityFurnace) {
		super(inventoryplayer,tileentityFurnace);
		furnace=tileentityFurnace;
	}

	@Override
	public boolean canInteractWith(EntityPlayer entityplayer) {
		return hostInventory.isUseableByPlayer(entityplayer);
	}


	@Override
	public void addCraftingToCrafters(ICrafting par1ICrafting) {
		super.addCraftingToCrafters(par1ICrafting);
		par1ICrafting.sendProgressBarUpdate(this, 0, furnace.furnaceCookTime);
		par1ICrafting.sendProgressBarUpdate(this, 1, furnace.furnaceBurnTime);
		par1ICrafting.sendProgressBarUpdate(this, 2, furnace.currentItemBurnTime);
	}

	/*
	 * @Override public void updateCraftingResults() { super.updateCraftingResults(); for (int i = 0; i < crafters.size(); i++) { ICrafting icrafting = (ICrafting) crafters.get(i); if (cookTime != furnace.furnaceCookTime) { icrafting.sendProgressBarUpdate(this, 0, furnace.furnaceCookTime); } if (burnTime != furnace.furnaceBurnTime) { icrafting.sendProgressBarUpdate(this, 1, furnace.furnaceBurnTime); } if (itemBurnTime != furnace.currentItemBurnTime) { icrafting.sendProgressBarUpdate(this, 2, furnace.currentItemBurnTime); } } cookTime = furnace.furnaceCookTime; burnTime = furnace.furnaceBurnTime; itemBurnTime = furnace.currentItemBurnTime; } */

	@Override
	public void detectAndSendChanges() {
		super.detectAndSendChanges();

		if(furnace==null){return;}
		for (Object crafter : crafters) {
			ICrafting icrafting = (ICrafting) crafter;
			if (cookTime != furnace.furnaceCookTime) {
				icrafting.sendProgressBarUpdate(this, 0, furnace.furnaceCookTime);
			}
			if (burnTime != furnace.furnaceBurnTime) {
				icrafting.sendProgressBarUpdate(this, 1, furnace.furnaceBurnTime);
			}
			if (itemBurnTime != furnace.currentItemBurnTime) {
				icrafting.sendProgressBarUpdate(this, 2, furnace.currentItemBurnTime);
			}
		}
		cookTime = furnace.furnaceCookTime;
		burnTime = furnace.furnaceBurnTime;
		itemBurnTime = furnace.currentItemBurnTime;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void updateProgressBar(int i, int j) {
		if (i == 0) {
			furnace.furnaceCookTime = j;
		}
		if (i == 1) {
			furnace.furnaceBurnTime = j;
		}
		if (i == 2) {
			furnace.currentItemBurnTime = j;
		}
	}
}
