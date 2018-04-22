/*******************************************************************************
 * Copyright (c) 2013 Mrbrutal. All rights reserved.
 *
 * @name Traincraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.core.handlers;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRailBase;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import train.common.api.*;
import train.common.entity.rollingStock.*;
import train.common.items.ItemTCRail;

public class ItemHandler {
	
	public static boolean handleItems(Entity entity, ItemStack itemstack) {
		if (itemstack != null) {
			if (entity instanceof Freight) {
				return handleFreight(entity, itemstack);
			} else if (entity instanceof DieselTrain) {
				return false;
			} else if (entity instanceof ElectricTrain) {
				return false;
			} else if (entity instanceof SteamTrain) {
				return false;
			} else if (entity instanceof Tender) {
				return false;
			} else {
				return false;
			}
		}
		return false;
	}

	public static boolean handleFreight(Entity entity, ItemStack itemstack) {
		int logWood = OreDictionary.getOreID("logWood");
		int plankWood = OreDictionary.getOreID("plankWood");
		int slabWood =  OreDictionary.getOreID("slabWood");
		if(itemstack == null) {
			return false;
		}
		Block block = Block.getBlockFromItem(itemstack.getItem());
		if (block == null) {
			return false;
		}
		if (entity instanceof EntityFlatCarLogs_DB || entity instanceof EntityFreightWood
				|| entity instanceof EntityFreightWood2) {
			return OreDictionary.getOreID(itemstack) == logWood;
		}
		else if (entity instanceof EntityFlatCartWoodUS || entity instanceof EntityBulkheadFlatCart) {
			return OreDictionary.getOreID(itemstack) == plankWood || OreDictionary.getOreID(itemstack) == slabWood;
		}
		else if (entity instanceof EntityFreightCenterbeam_Wood_1 || entity instanceof EntityFreightCenterbeam_Wood_2) {
            int isid = OreDictionary.getOreID(itemstack);
			return isid == plankWood || isid == logWood || OreDictionary.getOreID(itemstack) == slabWood;
		}
		else if (entity instanceof EntityFreightOpenWagon || entity instanceof EntityFreightCartUS
				|| entity instanceof EntityFreightClosed || entity instanceof EntityFreightGondola_DB
				|| entity instanceof EntityFreightOpen2 || entity instanceof EntityFreightHopperUS || entity instanceof EntityFreight100TonHopper) {
            int isid = OreDictionary.getOreID(itemstack);
			return !(isid == plankWood || isid == logWood || OreDictionary.getOreID(itemstack) == slabWood);
		}
		else if (entity instanceof EntityFlatCarRails_DB) {
			return block instanceof BlockRailBase || itemstack.getItem() instanceof ItemTCRail;
		}
		else if (entity instanceof EntityFreightGrain) {
			Item item = itemstack.getItem();
			if (item == Items.wheat || item == Items.wheat_seeds || item == Items.melon_seeds
					|| item == Items.pumpkin_seeds) {
				return true;
			}
			return cropStuff(itemstack);
		}
		else if (entity instanceof EntityFreightMinetrain) {
				return block.isOpaqueCube();
		}
		else if (entity instanceof EntityFreightSlateWagon){
			return block.getMaterial() == Material.rock;
		}
		else if (entity instanceof EntityFreightIceWagon){
			return block.getMaterial() == Material.ice || block.getMaterial() == Material.packedIce;
		}
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
