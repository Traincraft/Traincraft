/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.core.handlers;

import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import train.common.items.ItemRollingStock;
import train.common.library.AchievementIDs;

public class CraftingHandler {
	private RollingStockStatsEventHandler statsEvent = new RollingStockStatsEventHandler();

	public void crafting(EntityPlayer player, ItemStack itemstack, IInventory craftMatrix){
		for (AchievementIDs Ach : AchievementIDs.values()) {
			if (Ach.getItemIds() != null) {
				for (int i = 0; i < Ach.getItemIds().length; i++) {
					if (Ach.getItemIds()[i] == Item.getIdFromItem(itemstack.getItem())) {
						player.addStat(Ach.achievement, 1);
					}
				}
			}
		}
		if (itemstack.getItem() instanceof ItemRollingStock) {
			if (!player.worldObj.isRemote) {
				if (FMLCommonHandler.instance().getMinecraftServerInstance() != null) {
					TraincraftSaveHandler.createFile(FMLCommonHandler.instance().getMinecraftServerInstance());
					int readID = TraincraftSaveHandler.readInt(FMLCommonHandler.instance().getMinecraftServerInstance(), "numberOfTrains:");
					int newID = ((ItemRollingStock) itemstack.getItem()).setNewUniqueID(itemstack, player, readID);
					TraincraftSaveHandler.writeValue(FMLCommonHandler.instance().getMinecraftServerInstance(), "numberOfTrains:", new String("" + newID));
					statsEvent.trainCreate(itemstack.getTagCompound().getInteger("uniqueID"), ((ItemRollingStock) itemstack.getItem()).getTrainName(), ((ItemRollingStock) itemstack.getItem()).getTrainType(), player.getDisplayName(), new String((int) player.posX + ";" + (int) player.posY + ";" + (int) player.posZ));

				}
			}
		}
	}


	public void smelting(EntityPlayer player, ItemStack itemstack) {
		for (AchievementIDs Ach : AchievementIDs.values()) {
			if (Ach.getItemIds() != null) {
				for (int i = 0; i < Ach.getItemIds().length; i++) {
					if (Ach.getItemIds()[i] == Item.getIdFromItem(itemstack.getItem())) {
						player.addStat(Ach.achievement, 1);
					}
				}
			}
		}
	}
}