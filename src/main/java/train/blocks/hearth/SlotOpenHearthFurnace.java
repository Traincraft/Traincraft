package train.blocks.hearth;

import ebf.tim.utility.ItemStackSlot;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import java.util.ArrayList;

public class SlotOpenHearthFurnace extends ItemStackSlot {

	public SlotOpenHearthFurnace(IInventory iinventory, int i, int j, int k) {
		super(iinventory, i, j, k);
	}

	@Override
	public boolean isItemValid(ItemStack itemstack) {
		if(itemstack==null){return true;}
		ArrayList<ItemStack> steel = OreDictionary.getOres("ingotSteel");

		for(ItemStack s: steel){
			if(s.getItem()==itemstack.getItem()){
				return true;
			}
		}
		return false;
	}


	@Override
	public void onPickupFromSlot(EntityPlayer par1EntityPlayer, ItemStack itemstack) {
		super.onPickupFromSlot(par1EntityPlayer, itemstack);
	}

	/**
	 * the itemStack passed in is the output - ie, iron ingots, and pickaxes, not ore and wood.
	 */
	@Override
	protected void onCrafting(ItemStack itemstack) {
		if (!((Entity)inventory).worldObj.isRemote) {
			int var4;
			int var2=getStackSize();

			while (var2 > 0) {
				var4 = EntityXPOrb.getXPSplit(var2);
				var2 -= var4;
				((Entity)inventory).worldObj.spawnEntityInWorld(new EntityXPOrb(((Entity)inventory).worldObj, ((Entity)inventory).posX, ((Entity)inventory).posY + 0.5D, ((Entity)inventory).posZ + 0.5D, var4));
			}
		}

	}
}
