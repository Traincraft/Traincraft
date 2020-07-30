/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("ItemChunkLoaderActivator.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.items;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import traincraft.Traincraft;

import javax.annotation.Nullable;
import java.util.List;

public class ItemChunkLoaderActivator extends Item {
    
    public ItemChunkLoaderActivator(){
        this.setRegistryName(Traincraft.MOD_ID, "chunk_loader_activator");
        this.setTranslationKey(this.getRegistryName().toString());
        
        this.maxStackSize = 1;
        this.setCreativeTab(Traincraft.TAB);
        this.setMaxDamage(10);
    }
    
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn){
        tooltip.add("\u00a77" + "Right click on a Locomotive");
        tooltip.add("\u00a77" + " to start/stop chunk loading.");
        tooltip.add("\u00a77" + "Locomotives will load chunks");
        tooltip.add("\u00a77" + "around attached carts.");
    }
    
}
