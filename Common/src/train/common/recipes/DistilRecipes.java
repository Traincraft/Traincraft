package src.train.common.recipes;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import src.train.common.core.handlers.ConfigHandler;
import src.train.common.library.BlockIDs;
import src.train.common.library.ItemIDs;

public class DistilRecipes {

	private static final DistilRecipes smeltingBase = new DistilRecipes();
	private Map smeltingList;
	private Map experienceList = new HashMap();
	private Map plasticChanceList = new HashMap();
	private Map plasticList = new HashMap();

	public static final DistilRecipes smelting() {
		return smeltingBase;
	}

	private DistilRecipes() {
		smeltingList = new HashMap();

		//TODO test if copper works also
		if (ConfigHandler.ORE_GEN) {
			addSmelting(/* new ItemStack(BlockIDs.OreTC.blockID, 1, 1) */BlockIDs.oreTC.blockID, new ItemStack(ItemIDs.diesel.item, 2), 0.5F, 1, new ItemStack(ItemIDs.rawPlastic.item, 1));
			//addSmelting(/*new ItemStack(BlockIDs.OreTC.blockID, 1, 2)*/BlockIDs.OreTC.blockID, new ItemStack(ItemIDs.diesel.item, 2), 0.5F, 1, new ItemStack(ItemIDs.rawPlastic.item, 1));
		}
		addSmelting(Item.reed.itemID, new ItemStack(ItemIDs.diesel.item), 0.2F, 4, new ItemStack(ItemIDs.rawPlastic.item, 1));
		addSmelting(Block.leaves.blockID, new ItemStack(ItemIDs.diesel.item), 0.2F, 6, new ItemStack(ItemIDs.rawPlastic.item, 2));
		addSmelting(ItemIDs.diesel.item.itemID, new ItemStack(ItemIDs.refinedFuel.item), 1F, 2, new ItemStack(ItemIDs.rawPlastic.item, 1));
		addSmelting(Item.wheat.itemID, new ItemStack(ItemIDs.diesel.item), 0.2F, 4, new ItemStack(ItemIDs.rawPlastic.item, 1));
	}

	/*
	 * public void addSmelting(ItemStack i, ItemStack itemstack, float exp, int plasticChance, ItemStack plasticStack) { smeltingList.put(i, itemstack); plasticList.put(i, plasticStack); this.experienceList.put(Integer.valueOf(plasticStack.getItem().shiftedIndex), Float.valueOf(exp)); this.plasticChanceList.put(i, Float.valueOf(plasticChance)); } */

	/**
	 * 
	 * @param i: Input block id
	 * @param itemstack: Output
	 * @param exp: Experience
	 * @param plasticChance used as follow: Math.random(plasticChance)==0
	 * @param plasticSktack: the plastic output and output size
	 */
	public void addSmelting(int i, ItemStack itemstack, float exp, int plasticChance, ItemStack plasticStack) {
		smeltingList.put(Integer.valueOf(i), itemstack);
		plasticList.put(Integer.valueOf(i), plasticStack);
		this.experienceList.put(Integer.valueOf(plasticStack.getItem().itemID), Float.valueOf(exp));
		this.plasticChanceList.put(Integer.valueOf(i), Float.valueOf(plasticChance));
	}

	public float getExperience(int i) {
		return this.experienceList.containsKey(Integer.valueOf(i)) ? ((Float) this.experienceList.get(Integer.valueOf(i))).floatValue() : 0.0F;
	}

	public int getPlasticChance(int i) {
		if (this.plasticChanceList.containsKey(Integer.valueOf(i))) {
			return (int) ((Float) this.plasticChanceList.get(Integer.valueOf(i))).floatValue();
		}
		return 0;
	}

	public ItemStack getSmeltingResult(int i) {
		return (ItemStack) smeltingList.get(Integer.valueOf(i));
	}

	public ItemStack getPlasticResult(int i) {
		return (ItemStack) plasticList.get(Integer.valueOf(i));
	}

	public Map getSmeltingList() {
		return smeltingList;
	}
}
