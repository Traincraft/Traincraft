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
import net.minecraft.init.Blocks;
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
			return itemstack.getItem() == new ItemStack(Item.getItemFromBlock(Blocks.log) , 1, OreDictionary.WILDCARD_VALUE).getItem();
		}
		if (entity instanceof EntityFlatCarRails_DB) {
			if (block instanceof BlockRailBase) {
				return true;
			}
			return itemstack.getItem() instanceof ItemTCRail;
		}
		if (entity instanceof EntityFlatCartWoodUS) {
			return itemstack.getItem() == new ItemStack(Item.getItemFromBlock(Blocks.planks) , 1, OreDictionary.WILDCARD_VALUE).getItem();
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
			return !(itemstack.getItem() == new ItemStack(Item.getItemFromBlock(Blocks.log) , 1, OreDictionary.WILDCARD_VALUE).getItem()) && !(itemstack.getItem() == new ItemStack(Item.getItemFromBlock(Blocks.planks) , 1, OreDictionary.WILDCARD_VALUE).getItem());
		}
		if (entity instanceof EntityFreightCenterbeam_Empty) {
			return true;
		}
		if (entity instanceof EntityFreightCenterbeam_Wood_1) {
			return itemstack.getItem() == new ItemStack(Item.getItemFromBlock(Blocks.log) , 1, OreDictionary.WILDCARD_VALUE).getItem() || itemstack.getItem() == new ItemStack(Item.getItemFromBlock(Blocks.planks) , 1, OreDictionary.WILDCARD_VALUE).getItem();
		}
		if (entity instanceof EntityFreightCenterbeam_Wood_2) {
			return itemstack.getItem() == new ItemStack(Item.getItemFromBlock(Blocks.log) , 1, OreDictionary.WILDCARD_VALUE).getItem() || itemstack.getItem() == new ItemStack(Item.getItemFromBlock(Blocks.planks) , 1, OreDictionary.WILDCARD_VALUE).getItem();
		}
		if (entity instanceof EntityFreightClosed) {
			if (!(itemstack.getItem() == new ItemStack(Item.getItemFromBlock(Blocks.log) , 1, OreDictionary.WILDCARD_VALUE).getItem()) && !(itemstack.getItem() == new ItemStack(Item.getItemFromBlock(Blocks.planks) , 1, OreDictionary.WILDCARD_VALUE).getItem())) {
				if (block !=null) {
					return true;
				}
			}
			return false;
		}
		if (entity instanceof EntityFreightGondola_DB) {
			if (!(itemstack.getItem() == new ItemStack(Item.getItemFromBlock(Blocks.log) , 1, OreDictionary.WILDCARD_VALUE).getItem())) {
				if (block !=null) {
					return true;
				}
			}
			return false;
		}
		if (entity instanceof EntityFreightGrain) {
			int id = Item.getIdFromItem(itemstack.getItem());
			if (id == Item.getIdFromItem(Items.wheat) || id == Item.getIdFromItem(Items.wheat_seeds) || id == Item.getIdFromItem(Items.melon_seeds) || id == Item.getIdFromItem(Items.pumpkin_seeds)) {
				return true;
			}
			return cropStuff(itemstack);
		}
		if (entity instanceof EntityFreightHopperUS) {
			return !(itemstack.getItem() == new ItemStack(Item.getItemFromBlock(Blocks.log) , 1, OreDictionary.WILDCARD_VALUE).getItem()) && !(itemstack.getItem() == new ItemStack(Item.getItemFromBlock(Blocks.planks) , 1, OreDictionary.WILDCARD_VALUE).getItem());
		}
		if (entity instanceof EntityFreightMinetrain) {
				return block.isOpaqueCube();
		}
		if (entity instanceof EntityFreightOpen2) {
			if (!(itemstack.getItem() == new ItemStack(Item.getItemFromBlock(Blocks.log) , 1, OreDictionary.WILDCARD_VALUE).getItem()) && !(itemstack.getItem() == new ItemStack(Item.getItemFromBlock(Blocks.planks) , 1, OreDictionary.WILDCARD_VALUE).getItem())) {
					return true;
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
			return itemstack.getItem() == new ItemStack(Item.getItemFromBlock(Blocks.log) , 1, OreDictionary.WILDCARD_VALUE).getItem();
		}
		if (entity instanceof EntityFreightWood2) {
			return itemstack.getItem() == new ItemStack(Item.getItemFromBlock(Blocks.log) , 1, OreDictionary.WILDCARD_VALUE).getItem();
		}
		if (entity instanceof EntityFreightOpenWagon) {
				return !(itemstack.getItem() == new ItemStack(Item.getItemFromBlock(Blocks.log) , 1, OreDictionary.WILDCARD_VALUE).getItem());
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

	private static boolean isDict(String name, ItemStack itemstack) {
		for (ItemStack item : OreDictionary.getOres(name)) {
			if (itemstack.isItemEqual(item)) {
				return true;
			}
		}
		return false;
	}
}
