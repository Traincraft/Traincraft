package train.common.core.handlers;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import java.util.ArrayList;

public class BuilderOreHandler {
	public static boolean isOre(int id) {
		ArrayList<ItemStack> oreList = OreDictionary.getOres(id);
		if (oreList != null && oreList.size() > 0) {
			return true;
		}
		return false;

	}
}