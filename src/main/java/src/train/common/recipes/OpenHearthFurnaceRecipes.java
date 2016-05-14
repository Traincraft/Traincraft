package src.train.common.recipes;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import src.train.common.library.ItemIDs;

import java.util.HashMap;
import java.util.Map;

public class OpenHearthFurnaceRecipes {

	private static final OpenHearthFurnaceRecipes smeltingBase = new OpenHearthFurnaceRecipes();
	private Map smeltingListResult1;
	private Map smeltingListResult2;
	private Map smeltingListCookTime;
	private Map experienceList = new HashMap();
	private Map plasticChanceList = new HashMap();
	private Map plasticList = new HashMap();

	public static final OpenHearthFurnaceRecipes smelting() {
		return smeltingBase;
	}

	private OpenHearthFurnaceRecipes() {
		smeltingListResult1 = new HashMap();
		smeltingListResult2 = new HashMap();
		smeltingListCookTime = new HashMap();

		addSmelting(Item.getIdFromItem(Items.iron_ingot), Item.getIdFromItem(new ItemStack(ItemIDs.graphite.item).getItem()), new ItemStack(ItemIDs.steel.item), 2F, 1000);
		//addSmelting(ItemIDs.graphite.itemID,Item.ingotIron.shiftedIndex, new ItemStack(ItemIDs.steel.item),2F);
	}

	public void addSmelting(int i, int j, ItemStack itemstack, float exp, int cookTime) {
		smeltingListResult1.put(Integer.valueOf(i), itemstack);
		smeltingListResult1.put(Integer.valueOf(j), itemstack);
		smeltingListResult2.put(Integer.valueOf(i), Integer.valueOf(j));
		smeltingListResult2.put(Integer.valueOf(j), Integer.valueOf(i));
		this.experienceList.put(Integer.valueOf(i), Float.valueOf(exp));
		this.experienceList.put(Integer.valueOf(j), Float.valueOf(exp));
		smeltingListCookTime.put(Integer.valueOf(i), cookTime);
		smeltingListCookTime.put(Integer.valueOf(j), cookTime);
	}

	public float getExperience(int i) {
		return this.experienceList.containsKey(Integer.valueOf(i)) ? ((Float) this.experienceList.get(Integer.valueOf(i))).floatValue() : 0.0F;
	}

	public ItemStack getSmeltingResultFromItem1(int i) {
		return (ItemStack) smeltingListResult1.get(Integer.valueOf(i));
	}

	public int getCookTime(ItemStack i, ItemStack j) {
		if (i != null && j != null) {
			int resultFrom1 = 1000;
			int resultFrom2 = 1000;
			if (smeltingListCookTime.containsKey(Integer.valueOf(Item.getIdFromItem(i.getItem()))))
				resultFrom1 = (Integer) smeltingListCookTime.get(Integer.valueOf(Item.getIdFromItem(i.getItem())));
			if (smeltingListCookTime.containsKey(Integer.valueOf(Item.getIdFromItem(j.getItem()))))
				resultFrom2 = (Integer) smeltingListCookTime.get(Integer.valueOf(Item.getIdFromItem(j.getItem())));
			return resultFrom1 != 0 ? resultFrom1 : resultFrom2;
		}
		return 600;
	}

	public boolean areItemPartOfRecipe(ItemStack i, ItemStack j) {
		ItemStack resultFrom1 = (ItemStack) smeltingListResult1.get(Integer.valueOf(Item.getIdFromItem(i.getItem())));
		ItemStack resultFrom2 = (ItemStack) smeltingListResult1.get(Integer.valueOf(Item.getIdFromItem(j.getItem())));
		if (resultFrom1 == null || resultFrom2 == null) {
			return false;
		}
		if (resultFrom1.areItemStacksEqual(resultFrom1, resultFrom2)) {
			return true;
		}
		return false;
	}

	public Map getSmeltingList() {
		return smeltingListResult1;
	}
	public Map getSmeltingList2() {
		return smeltingListResult2;
	}
}
