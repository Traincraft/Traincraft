package train.blocks.bench;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.core.interfaces.ITCRecipe;

import java.util.ArrayList;
import java.util.List;

public class TrainCraftingManager {
	/**
	 * The static instance of this class
	 */
	public static final TrainCraftingManager instance = new TrainCraftingManager();

	/**
	 * A list of all the recipes added
	 */
	private List recipes = new ArrayList();


	public static final TrainCraftingManager getInstance() {
		return instance;
	}

	private TrainCraftingManager() {
	}


	public ItemStack func_82787_a(IInventory inv, World world) {
		int occupedSlot = 0;
		ItemStack var3 = null;
		ItemStack var4 = null;
		int var5;

		for (var5 = 0; var5 < inv.getSizeInventory(); ++var5) {
			ItemStack var6 = inv.getStackInSlot(var5);

			if (var6 != null) {
				if (occupedSlot == 0) {
					var3 = var6;
				}

				if (occupedSlot == 1) {
					var4 = var6;
				}
				++occupedSlot;
			}
		}

		if (occupedSlot == 2 && var3.getItem() == var4.getItem() && var3.stackSize == 1 && var4.stackSize == 1 && var3.getItem().isRepairable()) {
			Item var11 = var3.getItem();
			int var10 = var11.getMaxDamage() - var3.getItemDamageForDisplay();
			int var7 = var11.getMaxDamage() - var4.getItemDamageForDisplay();
			int var8 = var10 + var7 + var11.getMaxDamage() * 10 / 100;
			int var9 = var11.getMaxDamage() - var8;

			if (var9 < 0) {
				var9 = 0;
			}
			return new ItemStack(var3.getItem(), 1, var9);
		} else {
			for (var5 = 0; var5 < this.recipes.size(); ++var5) {
				ITCRecipe recipe = (ITCRecipe) this.recipes.get(var5);
				if (recipe.matches(inv, world)) {
					return recipe.getCraftingResult(inv);
				}
			}
			return null;
		}
	}
}
