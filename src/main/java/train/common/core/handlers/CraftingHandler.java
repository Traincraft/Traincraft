/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.core.handlers;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.item.Item;
import train.common.items.ItemRollingStock;
import train.common.library.AchievementIDs;

public class CraftingHandler
{
  private RollingStockStatsEventHandler statsEvent = new RollingStockStatsEventHandler();
  
  @SubscribeEvent
	public void onCrafting(PlayerEvent.ItemCraftedEvent event)
  {
		for (AchievementIDs ach : AchievementIDs.values())
    {
			Item[] items = ach.getItems();
      if (items != null) {
        for (int i = 0; i < items.length; i++) {
					if (items[i] == event.crafting.getItem()) {
						event.player.addStat(ach.achievement, 1);
          }
        }
      }
    }
		if ((event.crafting.getItem() instanceof ItemRollingStock)) {
			if (!event.player.worldObj.isRemote) {
        if (FMLCommonHandler.instance().getMinecraftServerInstance() != null)
        {
					ItemRollingStock stock = (ItemRollingStock) event.crafting.getItem();
          TraincraftSaveHandler.createFile(FMLCommonHandler.instance().getMinecraftServerInstance());
          int readID = TraincraftSaveHandler.readInt(FMLCommonHandler.instance().getMinecraftServerInstance(), "numberOfTrains:");
          int newID = stock.setNewUniqueID(event.crafting, event.player, readID);
          TraincraftSaveHandler.writeValue(FMLCommonHandler.instance().getMinecraftServerInstance(), "numberOfTrains:", new String("" + newID));
					this.statsEvent.trainCreate(event.crafting.getTagCompound().getInteger("uniqueID"),
							((ItemRollingStock) event.crafting.getItem()).getTrainName(), stock.getTrainType(),
							event.player.getGameProfile().getId(), new String((int) event.player.posX + ";"
									+ (int) event.player.posY + ";" + (int) event.player.posZ));
        }
      }
    }
  }
  
  @SubscribeEvent
	public void onSmelting(PlayerEvent.ItemSmeltedEvent event)
  {
		for (AchievementIDs ach : AchievementIDs.values())
    {
      Item[] items = ach.getItems();
      if (items != null) {
        for (int i = 0; i < items.length; i++) {
					if (items[i] == event.smelting.getItem()) {
						event.player.addStat(ach.achievement, 1);
          }
        }
      }
    }
  }
}