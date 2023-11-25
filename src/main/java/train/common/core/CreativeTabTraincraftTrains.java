/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 *
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package train.common.core;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import train.common.library.ItemIDs;

public class CreativeTabTraincraftTrains extends CreativeTabs {

    public CreativeTabTraincraftTrains(int par1, String par2Str) {
        super(par1, par2Str);
    }

    @Override
    public ItemStack getIconItemStack() {
        return new ItemStack(ItemIDs.minecartLocoBR01_DB.item);
    }

    @Override
    public String getTranslatedTabLabel() {
        return super.getTabLabel();
    }

    @Override
    public Item getTabIconItem() {
        return ItemIDs.minecartLocoBR01_DB.item;
    }
}
