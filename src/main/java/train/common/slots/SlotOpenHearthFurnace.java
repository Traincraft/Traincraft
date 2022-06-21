package train.common.slots;

import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraftforge.oredict.OreDictionary;
import train.common.inventory.TrainCraftingManager;
import train.common.library.AchievementIDs;

public class SlotOpenHearthFurnace extends Slot {
	private EntityPlayer thePlayer;
	private int amount;

	public SlotOpenHearthFurnace(EntityPlayer entityplayer, IInventory iinventory, int i, int j, int k) {
		super(iinventory, i, j, k);
		thePlayer = entityplayer;
	}

	@Override
	public boolean isItemValid(ItemStack itemstack) {
		return false;
	}

	/**
	 * Decrease the size of the stack in slot (first int arg) by the amount of the second int arg. Returns the new stack.
	 */
	@Override
	public ItemStack decrStackSize(int par1) {
		if (this.getHasStack()) {
			this.amount += Math.min(par1, this.getStack().stackSize);
		}

		return super.decrStackSize(par1);
	}

	@Override
	public void onPickupFromSlot(EntityPlayer par1EntityPlayer, ItemStack itemstack) {
		this.onCrafting(itemstack);
		super.onPickupFromSlot(par1EntityPlayer, itemstack);
	}

	/**
	 * the itemStack passed in is the output - ie, iron ingots, and pickaxes, not ore and wood. Typically increases an internal count then calls onCrafting(item).
	 */
	@Override
	protected void onCrafting(ItemStack itemstack, int par2) {
		this.amount += par2;
		this.onCrafting(itemstack);
	}

	/**
	 * the itemStack passed in is the output - ie, iron ingots, and pickaxes, not ore and wood.
	 */
	@Override
	protected void onCrafting(ItemStack itemstack) {
		itemstack.onCrafting(this.thePlayer.worldObj, this.thePlayer, this.amount);
		
		FMLCommonHandler.instance().firePlayerSmeltedEvent(thePlayer, itemstack);
		for (ItemStack stack : OreDictionary.getOres("ingotSteel")) {
			if (stack.getItem() ==itemstack.getItem() && stack.getItemDamage() == itemstack.getItemDamage()) {
				thePlayer.addStat(AchievementIDs.steel.achievement, 1);
			}
		}

		if (!this.thePlayer.worldObj.isRemote) {
			int var2 = this.amount;
			float var3 = TrainCraftingManager.instance.getHearthFurnaceRecipeExperience(itemstack);
			int var4;

			if (var3 == 0.0F) {
				var2 = 0;
			}
			else if (var3 < 1.0F) {
				var4 = MathHelper.floor_float((float) var2 * var3);

				if (var4 < MathHelper.ceiling_float_int((float) var2 * var3) && (float) Math.random() < (float) var2 * var3 - (float) var4) {
					++var4;
				}

				var2 = var4;
			}

			while (var2 > 0) {
				var4 = EntityXPOrb.getXPSplit(var2);
				var2 -= var4;
				this.thePlayer.worldObj.spawnEntityInWorld(new EntityXPOrb(this.thePlayer.worldObj, this.thePlayer.posX, this.thePlayer.posY + 0.5D, this.thePlayer.posZ + 0.5D, var4));
			}
		}

		this.amount = 0;

	}
}
