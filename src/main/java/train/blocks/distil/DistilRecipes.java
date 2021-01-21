package train.blocks.distil;

import ebf.tim.registry.TiMFluids;
import ebf.tim.registry.TiMOres;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import train.blocks.TCBlocks;

import java.util.HashMap;
import java.util.Map;

public class DistilRecipes {

	private static final DistilRecipes smeltingBase = new DistilRecipes();
	private Map<Item, ItemStack>		smeltingList;
	private Map<Integer, Float> experienceList = new HashMap<Integer, Float>();
	private Map<Item, Float> plasticChanceList = new HashMap<Item, Float>();
	private Map<Item, ItemStack>		plasticList			= new HashMap<Item, ItemStack>();

	public static final DistilRecipes smelting() {
		return smeltingBase;
	}

	private DistilRecipes() {
		smeltingList = new HashMap<Item, ItemStack>();

		//Prevent copper to be distilled is set in TileEntitydistil.
		addSmelting(Item.getItemFromBlock(TCBlocks.orePetroleum), new ItemStack(TiMFluids.bucketDiesel, 2), 0.5F, 1,
				new ItemStack(TiMOres.dustPlastic, 1));
		addSmelting(Items.reeds, new ItemStack(TiMFluids.bucketDiesel), 0.2F, 4,
				new ItemStack(TiMOres.dustPlastic, 1));
		addSmelting(Item.getItemFromBlock(Blocks.leaves), new ItemStack(TiMFluids.bucketDiesel), 0.2F, 6,
				new ItemStack(TiMOres.dustPlastic, 2));
		addSmelting(TiMFluids.bucketDiesel, new ItemStack(TiMFluids.bucketFuelOil), 1F, 1, new ItemStack(TiMOres.dustPlastic, 2));
		addSmelting(Items.wheat, new ItemStack(TiMFluids.bucketDiesel), 0.2F, 4,
				new ItemStack(TiMOres.dustPlastic, 1));
	}

	/*
	 * public void addSmelting(ItemStack i, ItemStack itemstack, float exp, int plasticChance, ItemStack plasticStack) { smeltingList.put(i, itemstack); plasticList.put(i, plasticStack); this.experienceList.put(Integer.valueOf(plasticStack.getItem().shiftedIndex), Float.valueOf(exp)); this.plasticChanceList.put(i, Float.valueOf(plasticChance)); } */

	/**
	 *
	 * @param itemstack: Output
	 * @param exp: Experience
	 * @param plasticChance used as follow: Math.random(plasticChance)==0
	 * //@param plasticSktack: the plastic output and output size
	 */
	public void addSmelting(Item itemID, ItemStack itemstack, float exp, float plasticChance, ItemStack plasticStack) {
		smeltingList.put(itemID, itemstack);
		plasticList.put(itemID, plasticStack);
		this.experienceList.put(Item.getIdFromItem(plasticStack.getItem()), exp);
		this.plasticChanceList.put(itemID, plasticChance);
	}

	public float getExperience(int i) {
		return this.experienceList.containsKey(i) ? this.experienceList.get(i) : 0.0F;
	}

	public int getPlasticChance(Item item) {
		if (this.plasticChanceList.containsKey(item)) {
			return (int) this.plasticChanceList.get(item).floatValue();
		}
		return 0;
	}

	public ItemStack getSmeltingResult(Item item) {
		return smeltingList.get(item);
	}

	public ItemStack getPlasticResult(Item item) {
		return plasticList.get(item);
	}

	public Map<Item, ItemStack> getSmeltingList() {
		return smeltingList;
	}
}
