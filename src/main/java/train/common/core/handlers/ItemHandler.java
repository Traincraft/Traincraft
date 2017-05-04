/*******************************************************************************
 * Copyright (c) 2013 Mrbrutal. All rights reserved.
 *
 * @name Traincraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.core.handlers;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRailBase;
import net.minecraft.entity.Entity;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import train.common.api.*;
import train.common.entity.rollingStock.*;
import train.common.items.ItemTCRail;

import java.util.ArrayList;

public class ItemHandler {
	
	private static final ArrayList<ItemStack> planks = OreDictionary.getOres("plankWood");
	private static final ArrayList<ItemStack> logs = OreDictionary.getOres("logWood");

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
		Block block = Block.getBlockFromItem(itemstack.getItem());
		if (block == null) {
			return false;
		}
		if (entity instanceof EntityBoxCartUS || entity instanceof EntityFreightCart
				|| entity instanceof EntityFreightCart2 || entity instanceof EntityFreightCartSmall
				|| entity instanceof EntityFreightCenterbeam_Empty || entity instanceof EntityFreightTrailer
				|| entity instanceof EntityFreightWagenDB || entity instanceof EntityFreightWellcar) {
			return true;
		}
		if (entity instanceof EntityFlatCarLogs_DB || entity instanceof EntityFreightWood
				|| entity instanceof EntityFreightWood2) {
			for (ItemStack log : logs) {
				if (block == Block.getBlockFromItem(log.getItem())) {
					return true;
				}
			}
		}
		if (entity instanceof EntityFlatCartWoodUS) {
			for (ItemStack plank : planks) {
				if (block == Block.getBlockFromItem(plank.getItem())) {
					return true;
				}
			}
		}
		if (entity instanceof EntityFreightCenterbeam_Wood_1 || entity instanceof EntityFreightCenterbeam_Wood_2) {
			for (ItemStack log : logs) {
				if (block == Block.getBlockFromItem(log.getItem())) {
					return true;
				}
			}
			for (ItemStack plank : planks) {
				if (block == Block.getBlockFromItem(plank.getItem())) {
					return true;
				}
			}
		}
		if (entity instanceof EntityFreightOpenWagon || entity instanceof EntityFreightCartUS
				|| entity instanceof EntityFreightClosed || entity instanceof EntityFreightGondola_DB
				|| entity instanceof EntityFreightOpen2 || entity instanceof EntityFreightHopperUS) {
			for (ItemStack log : logs) {
				if (block == Block.getBlockFromItem(log.getItem())) {
					return false;
				}
			}
			for (ItemStack plank : planks) {
				if (block == Block.getBlockFromItem(plank.getItem())) {
					return false;
				}
			}
			return true;
		}
		if (entity instanceof EntityFlatCarRails_DB) {
			if (block instanceof BlockRailBase) {
				return true;
			}
			return itemstack.getItem() instanceof ItemTCRail;
		}
		if (entity instanceof EntityFreightGrain) {
			Item item = itemstack.getItem();
			if (item == Items.wheat || item == Items.wheat_seeds || item == Items.melon_seeds
					|| item == Items.pumpkin_seeds) {
				return true;
			}
			return cropStuff(itemstack);
		}
		if (entity instanceof EntityFreightMinetrain) {
				return block.isOpaqueCube();
		}
		return false;
	}

	private static boolean cropStuff(ItemStack itemstack) {
		String[] names = new String[] { "cropCorn", "cropRice", "seedRice", "seedCorn", "listAllseed" };
		for (String name: names) {
			if (isDict(name, itemstack)) {
				return true;
			}
		}
		return false;
	}

	private static boolean isDict(String name, ItemStack itemstack) {
		for (ItemStack item : OreDictionary.getOres(name)) {
			if (itemstack.isItemEqual(item)) {
				return true;
			}
		}
		return false;
	}
}
