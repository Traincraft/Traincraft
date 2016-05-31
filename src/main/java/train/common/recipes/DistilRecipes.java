package train.common.recipes;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import train.common.core.handlers.ConfigHandler;
import train.common.library.BlockIDs;
import train.common.library.ItemIDs;

import java.util.HashMap;
import java.util.Map;

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
		addSmelting(Item.getIdFromItem(Items.reeds), new ItemStack(ItemIDs.diesel.item), 0.2F, 4, new ItemStack(ItemIDs.rawPlastic.item, 1));
		addSmelting(Block.getIdFromBlock(Blocks.leaves), new ItemStack(ItemIDs.diesel.item), 0.2F, 6, new ItemStack(ItemIDs.rawPlastic.item, 2));
		addSmelting(ItemIDs.diesel.itemID, new ItemStack(ItemIDs.refinedFuel.item), 1F, 2, new ItemStack(ItemIDs.rawPlastic.item, 1));
		addSmelting(Item.getIdFromItem(Items.wheat), new ItemStack(ItemIDs.diesel.item), 0.2F, 4, new ItemStack(ItemIDs.rawPlastic.item, 1));
	}

	/*
	 * public void addSmelting(ItemStack i, ItemStack itemstack, float exp, int plasticChance, ItemStack plasticStack) { smeltingList.put(i, itemstack); plasticList.put(i, plasticStack); this.experienceList.put(Integer.valueOf(plasticStack.getItem().shiftedIndex), Float.valueOf(exp)); this.plasticChanceList.put(i, Float.valueOf(plasticChance)); } */

	/**
	 * 
	 * @param i: Input block id
	 * @param itemstack: Output
	 * @param exp: Experience
	 * @param plasticChance used as follow: Math.random(plasticChance)==0
	 * //@param plasticSktack: the plastic output and output size
	 */
	public void addSmelting(int i, ItemStack itemstack, float exp, int plasticChance, ItemStack plasticStack) {
		smeltingList.put(Integer.valueOf(i), itemstack);
		plasticList.put(Integer.valueOf(i), plasticStack);
		this.experienceList.put(Integer.valueOf(Item.getIdFromItem(plasticStack.getItem())), Float.valueOf(exp));
		this.plasticChanceList.put(Integer.valueOf(i), Float.valueOf(plasticChance));
	}

	public float getExperience(int i) {
		return this.experienceList.containsKey(Integer.valueOf(i)) ? ((Float) this.experienceList.get(Integer.valueOf(i))).floatValue() : 0.0F;
	}

	public int getPlasticChance(Item item) {
		int i = Item.getIdFromItem(item);
		if (this.plasticChanceList.containsKey(i)) {
			return (int) ((Float) this.plasticChanceList.get(i)).floatValue();
		}
		return 0;
	}

	public ItemStack getSmeltingResult(Item i) {
		return (ItemStack) smeltingList.get(Item.getIdFromItem(i));
	}

	public ItemStack getPlasticResult(Item i) {
		return (ItemStack) plasticList.get(Item.getIdFromItem(i));
	}

	public Map getSmeltingList() {
		return smeltingList;
	}
}
