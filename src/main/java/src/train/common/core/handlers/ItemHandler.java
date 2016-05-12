/*******************************************************************************
 * Copyright (c) 2013 Mrbrutal. All rights reserved.
 * 
 * @name Traincraft
 * @author Mrbrutal
 ******************************************************************************/

package src.train.common.core.handlers;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRailBase;
import net.minecraft.entity.Entity;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import src.train.common.Traincraft;
import src.train.common.api.DieselTrain;
import src.train.common.api.ElectricTrain;
import src.train.common.api.Freight;
import src.train.common.api.SteamTrain;
import src.train.common.api.Tender;
import src.train.common.entity.rollingStock.EntityBoxCartUS;
import src.train.common.entity.rollingStock.EntityFlatCarLogs_DB;
import src.train.common.entity.rollingStock.EntityFlatCarRails_DB;
import src.train.common.entity.rollingStock.EntityFlatCartWoodUS;
import src.train.common.entity.rollingStock.EntityFreightCart;
import src.train.common.entity.rollingStock.EntityFreightCart2;
import src.train.common.entity.rollingStock.EntityFreightCartSmall;
import src.train.common.entity.rollingStock.EntityFreightCartUS;
import src.train.common.entity.rollingStock.EntityFreightCenterbeam_Empty;
import src.train.common.entity.rollingStock.EntityFreightCenterbeam_Wood_1;
import src.train.common.entity.rollingStock.EntityFreightCenterbeam_Wood_2;
import src.train.common.entity.rollingStock.EntityFreightClosed;
import src.train.common.entity.rollingStock.EntityFreightGondola_DB;
import src.train.common.entity.rollingStock.EntityFreightGrain;
import src.train.common.entity.rollingStock.EntityFreightHopperUS;
import src.train.common.entity.rollingStock.EntityFreightMinetrain;
import src.train.common.entity.rollingStock.EntityFreightOpen2;
import src.train.common.entity.rollingStock.EntityFreightOpenWagon;
import src.train.common.entity.rollingStock.EntityFreightTrailer;
import src.train.common.entity.rollingStock.EntityFreightWagenDB;
import src.train.common.entity.rollingStock.EntityFreightWellcar;
import src.train.common.entity.rollingStock.EntityFreightWood;
import src.train.common.entity.rollingStock.EntityFreightWood2;
import src.train.common.items.ItemTCRail;

public class ItemHandler {

	public static boolean handleItems(Entity entity, ItemStack itemstack) {
		if (itemstack != null) {
			if (entity instanceof Freight) {
				return handleFreight(entity, itemstack);
			} else if (entity instanceof DieselTrain) {
				return handleDiesel(entity, itemstack);
			} else if (entity instanceof ElectricTrain) {
				return handleElectric(entity, itemstack);
			} else if (entity instanceof SteamTrain) {
				return handleSteam(entity, itemstack);
			} else if (entity instanceof Tender) {
				return handleTender(entity, itemstack);
			} else {
				return handleOther(entity, itemstack);
			}
		}
		return false;
	}

	public static boolean handleOther(Entity entity, ItemStack itemstack) {
		return false;
	}

	public static boolean handleTender(Entity entity, ItemStack itemstack) {
		return false;
	}

	public static boolean handleSteam(Entity entity, ItemStack itemstack) {
		return false;
	}

	public static boolean handleElectric(Entity entity, ItemStack itemstack) {
		return false;
	}

	public static boolean handleDiesel(Entity entity, ItemStack itemstack) {
		return false;
	}

	public static boolean handleFreight(Entity entity, ItemStack itemstack) {
		Block block = Block.getBlockFromItem(itemstack.getItem());
		if (block == null) {
			return false;
		}
		if (entity instanceof EntityBoxCartUS) {
			return true;
		}
		if (entity instanceof EntityFlatCarLogs_DB) {
			return isDict("logWood", itemstack);
		}
		if (entity instanceof EntityFlatCarRails_DB) {
			if (block instanceof BlockRailBase) {
				return true;
			}
			return itemstack.getItem() instanceof ItemTCRail;
		}
		if (entity instanceof EntityFlatCartWoodUS) {
			return isDict("plankWood", itemstack);
		}
		if (entity instanceof EntityFreightCart) {
			return true;
		}
		if (entity instanceof EntityFreightCart2) {
			return true;
		}
		if (entity instanceof EntityFreightCartSmall) {
			return true;
		}
		if (entity instanceof EntityFreightCartUS) {
			if (!woodStuff(itemstack)) {
				// TODO: Why there is this check? Did they though it could be
				// item?
				if (block instanceof Block) {
					return true;
				}
			}
			return false;
		}
		if (entity instanceof EntityFreightCenterbeam_Empty) {
			return true;
		}
		if (entity instanceof EntityFreightCenterbeam_Wood_1) {
			return woodStuff(itemstack);
		}
		if (entity instanceof EntityFreightCenterbeam_Wood_2) {
			return woodStuff(itemstack);
		}
		if (entity instanceof EntityFreightClosed) {
			if (!woodStuff(itemstack)) {
				// TODO: Why there is this check? Did they though it could be
				// item?
				if (block instanceof Block) {
					return true;
				}
			}
			return false;
		}
		if (entity instanceof EntityFreightGondola_DB) {
			if (!woodStuff(itemstack)) {
				// TODO: Why there is this check? Did they though it could be
				// item?
				if (block instanceof Block) {
					return true;
				}
			}
			return false;
		}
		if (entity instanceof EntityFreightGrain) {
			int id = Item.getIdFromItem(itemstack.getItem());
			if (id == Item.getIdFromItem(Items.wheat)
					|| id == Item.getIdFromItem(Items.wheat_seeds)
					|| id == Item.getIdFromItem(Items.melon_seeds)
					|| id == Item.getIdFromItem(Items.pumpkin_seeds)) {
				return true;
			}
			return cropStuff(itemstack);
		}
		if (entity instanceof EntityFreightHopperUS) {
			// TODO: Why there is this check? Did they though it could be item?
			return block instanceof Block && !woodStuff(itemstack);
		}
		if (entity instanceof EntityFreightMinetrain) {
			if (block != null) {
				return block.isOpaqueCube();
			} else {
				// TODO: Why there is this? NOTE: This wouldn't have been
				// deadcode because the blocks nullness wasn't checked
				if (itemstack.getItem().isDamaged(itemstack)) {
					return false;
				}
			}
		}
		if (entity instanceof EntityFreightOpen2) {
			if (!woodStuff(itemstack)) {
				// TODO: Why there is this check? Did they though it could be
				// item?
				if (block instanceof Block) {
					return true;
				}
			}
			return false;
		}
		if (entity instanceof EntityFreightTrailer) {
			return true;
		}
		if (entity instanceof EntityFreightWagenDB) {
			return true;
		}
		if (entity instanceof EntityFreightWellcar) {
			return true;
		}
		if (entity instanceof EntityFreightWood) {
			return isDict("logWood", itemstack);
		}
		if (entity instanceof EntityFreightWood2) {
			return isDict("logWood", itemstack);
		}
		if (entity instanceof EntityFreightOpenWagon) {
			// TODO: Why there is this check? Did they though it could be item?
			if (block instanceof Block && !woodStuff(itemstack)) {
				return true;
			}
		}
		return false;
	}

	private static boolean cropStuff(ItemStack itemstack) {
		String[] names = new String[] { "cropCorn", "cropHops", "cropRice",
				"seedCorn" };
		for (String name: names) {
			if (isDict(name, itemstack)) {
				return true;
			}
		}
		return false;
	}

	private static boolean woodStuff(ItemStack itemstack) {
		String[] names = new String[] { "logWood", "plankWood", "slabWood",
				"stickWood", "stairWood" };
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
