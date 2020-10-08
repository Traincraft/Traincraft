/*******************************************************************************
 * Copyright (c) 2013 Mrbrutal. All rights reserved.
 *
 * @name Traincraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.core.handlers;

import ebf.tim.TrainsInMotion;
import ebf.tim.entities.GenericRailTransport;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRailBase;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ItemHandler {
	
	public static boolean handleItems(GenericRailTransport entity, ItemStack itemstack) {
		if (itemstack != null) {
			if ( entity.getInventoryRows()>0) {
				return handleFreight(entity, itemstack);
			}
		}
		return false;
	}

	public static boolean handleFreight(GenericRailTransport entity, ItemStack itemstack) {
		int logWood = OreDictionary.getOreID("logWood");
		int plankWood = OreDictionary.getOreID("plankWood");
		int slabWood =  OreDictionary.getOreID("slabWood");
		int stairWood = OreDictionary.getOreID("stairWood");
		if(itemstack == null) {
			return false;
		}
		Block block = Block.getBlockFromItem(itemstack.getItem());
		if (block == null) {
			return false;
		}
		if (entity.getTypes().contains(TrainsInMotion.transportTypes.LOGCAR)) {
            int isid = OreDictionary.getOreID(itemstack);
			return isid == plankWood || isid == logWood || isid == slabWood || isid == stairWood ||
					itemstack.getItem() == Item.getItemFromBlock(Blocks.ladder) || itemstack.getItem() == Item.getItemFromBlock(Blocks.fence) || itemstack.getItem() == Item.getItemFromBlock(Blocks.fence_gate);
		}
		else if (entity.getTypes().contains(TrainsInMotion.transportTypes.RAILCAR)) {
			return block instanceof BlockRailBase;
		}
		else if (entity.getTypes().contains(TrainsInMotion.transportTypes.GRAINHOPPER)) {
			Item item = itemstack.getItem();
			if (item == Items.wheat || item == Items.wheat_seeds || item == Items.melon_seeds
					|| item == Items.pumpkin_seeds || item instanceof ItemSeeds) {
				return true;
			}
			return cropStuff(itemstack);
		}
		//todo: implement these when the entity classes exist
		/*else if (entity instanceof EntityFreightMinetrain) {
				return block.isOpaqueCube();
		}
		else if (entity instanceof EntityFreightSlateWagon){
			return block.getMaterial() == Material.rock;
		}
		else if (entity instanceof EntityFreightIceWagon){
			return block.getMaterial() == Material.ice || block.getMaterial() == Material.packedIce;
		}*/
		else {
			return true;
		}
	}

	private static boolean cropStuff(ItemStack itemstack) {
		String[] names = new String[] { "cropCorn", "cropRice", "seedRice", "seedCorn", "listAllseed" };
		for (String name: names) {
			if (OreDictionary.getOreID(name) == OreDictionary.getOreID(itemstack)) {
				return true;
			}
		}
		return false;
	}
}
