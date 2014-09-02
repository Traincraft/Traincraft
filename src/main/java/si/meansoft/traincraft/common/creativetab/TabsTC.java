/*
 * Copyright (c) 2014 Mrbrutal. All rights reserved.
 * Do not modify or redistribute without written permission.
 *
 * @author Mrbrutal
 */

package si.meansoft.traincraft.common.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import si.meansoft.traincraft.common.library.InfoTC;

public class TabsTC {

    public static CreativeTabs BLOCK = new CreativeTabs(InfoTC.MODID.toLowerCase() + ".block") {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(Blocks.fire);
        }
    };

    public static CreativeTabs ITEM = new CreativeTabs(InfoTC.MODID.toLowerCase() + ".item") {
        @Override
        public Item getTabIconItem() {
            return Items.apple;
        }
    };
}
