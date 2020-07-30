/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("ItemBlockGeneratorWaterWheel.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.items;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import traincraft.blocks.TCBlocks;

import javax.annotation.Nullable;
import java.util.List;

public class ItemBlockGeneratorWaterWheel extends BaseItemBlock {
    
    public ItemBlockGeneratorWaterWheel(){
        super(TCBlocks.WATER_WHEEL);
    }
    
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn){
        tooltip.add("\u00a77" + "RF generator.");
        tooltip.add("\u00a77" + "Max Production: 5 RF/t.");
        tooltip.add("\u00a77" + "Output at the sides.");
        tooltip.add("\u00a77" + "Orients itself automatically");
        tooltip.add("\u00a77" + "according to water flow direction.");
    }
    
}
