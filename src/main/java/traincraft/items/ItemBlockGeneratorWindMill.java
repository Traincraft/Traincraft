/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("ItemBlockGeneratorWindMill.java") is part of the Traincraft mod for Minecraft.
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

public class ItemBlockGeneratorWindMill extends BaseItemBlock {
    
    public ItemBlockGeneratorWindMill(){
        super(TCBlocks.WIND_MILL);
    }
    
    
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn){
        tooltip.add("\u00a77" + "RF generator.");
        tooltip.add("\u00a77" + "Max Production (storm): 15 RF/t.");
    }
    
}
