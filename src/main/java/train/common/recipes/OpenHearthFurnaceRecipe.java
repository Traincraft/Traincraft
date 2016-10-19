package train.common.recipes;

import net.minecraft.item.ItemStack;
import train.common.core.util.TraincraftUtil;

public class OpenHearthFurnaceRecipe{

	public OpenHearthFurnaceRecipe(ItemStack item1, ItemStack item2, ItemStack output, int cookTime){
		this.ingredient1 = item1;
		this.ingredient2 = item2;
		this.result = output;
		this.cookTime = cookTime;
	}
	
	private final ItemStack ingredient1;
	private final ItemStack ingredient2;
	private final ItemStack result;
	private final int cookTime;
	
	public boolean matches(ItemStack[] var1) {
		if(var1.length < this.getRecipeSize()) {
			return false;
		}
		if(TraincraftUtil.itemStackMatches(var1[0], ingredient1) && TraincraftUtil.itemStackMatches(var1[1], ingredient2)){
			return true;
		}
		return(TraincraftUtil.itemStackMatches(var1[1], ingredient1) && TraincraftUtil.itemStackMatches(var1[0], ingredient2));
	}

	public ItemStack getCraftingResult() {
		return result;
	}

	public int getRecipeSize() {
		return 2;
	}

	public int getCooktime() {
		return this.cookTime;
	}
	
	public ItemStack[] getRecipe(){
		return new ItemStack[]{ingredient1, ingredient2};
	}
}
