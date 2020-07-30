/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("OreHandler.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.world;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import traincraft.blocks.TCBlocks;
import traincraft.items.TCItems;

public class OreHandler {
    
    public static void registerOres(){
        
        OreDictionary.registerOre("oreCopper", new ItemStack(TCBlocks.COPPER_ORE));
        OreDictionary.registerOre("oreOilsands", new ItemStack(TCBlocks.OIL_SAND));
        OreDictionary.registerOre("orePetroleum", new ItemStack(TCBlocks.PETROL_ORE));
        
        OreDictionary.registerOre("ingotCopper", new ItemStack(TCItems.COPPER_INGOT));
        
        OreDictionary.registerOre("ingotSteel", new ItemStack(TCItems.STEEL_INGOT));
        OreDictionary.registerOre("dustSteel", new ItemStack(TCItems.STEEL_DUST));
        
        OreDictionary.registerOre("itemPlastic", new ItemStack(TCItems.PLASTIC));
        OreDictionary.registerOre("dustPlastic", new ItemStack(TCItems.PLASTIC));//MFR support
        
        OreDictionary.registerOre("dustCoal", new ItemStack(TCItems.COAL_DUST));
    }
}
