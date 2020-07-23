/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.core.handlers;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import traincraft.blocks.TCBlocks;
import train.common.library.ItemIDs;
import traincraft.items.TCItems;

public class OreHandler {

	public static void registerOres() {
		
		OreDictionary.registerOre("oreCopper", new ItemStack(TCBlocks.COPPER_ORE, 1, 0));
		OreDictionary.registerOre("oreOilsands", new ItemStack(TCBlocks.OIL_SAND, 1, 1));
		OreDictionary.registerOre("orePetroleum", new ItemStack(TCBlocks.PETROL_ORE, 1, 2));

		OreDictionary.registerOre("ingotCopper", new ItemStack(TCItems.COPPER_INGOT));

		OreDictionary.registerOre("ingotSteel", new ItemStack(TCItems.STEEL_INGOT));
		OreDictionary.registerOre("dustSteel", new ItemStack(TCItems.STEEL_DUST));

		OreDictionary.registerOre("itemPlastic", new ItemStack(TCItems.PLASTIC));
		OreDictionary.registerOre("dustPlastic", new ItemStack(TCItems.PLASTIC));//MFR support
		
		OreDictionary.registerOre("dustCoal", new ItemStack(TCItems.COAL_DUST));
	}
}
