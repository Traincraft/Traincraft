/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("ItemBlockGeneratorDiesel.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.items;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.IRarity;
import traincraft.blocks.TCBlocks;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

public class ItemBlockGeneratorDiesel extends BaseItemBlock {
    
    public ItemBlockGeneratorDiesel(){
        super(TCBlocks.GENERATOR_DIESEL);
    }
    
    @Override
    public void addInformation(@Nonnull ItemStack stack, @Nullable World worldIn, List<String> tooltip, @Nonnull ITooltipFlag flagIn){
        tooltip.add("\u00a77" + "RF generator.");
        tooltip.add("\u00a77" + "Max Production: 70 RF/t.");
        tooltip.add("\u00a77" + "Don't place 2 together.");
    }
    
    @Nonnull
    @Override
    public IRarity getForgeRarity(@Nonnull ItemStack stack){
        return EnumRarity.RARE;
    }
}
