/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("BlockOilSand.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.blocks;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import traincraft.Traincraft;
import traincraft.items.BaseItemBlock;

public class BlockOilSand extends BlockFalling implements IItemBlockSupplier {
    
    public BlockOilSand(){
        super(Material.SAND);
        this.setRegistryName(Traincraft.MOD_ID, "ore_oil_sand");
        
        this.setCreativeTab(Traincraft.TAB);
        this.setHardness(3.0F);
        this.setResistance(3.0F);
        this.setSoundType(SoundType.SAND);
        this.setHarvestLevel("shovel", 1);
    }
    
    @Override
    public ItemBlock getItemBlock(){
        return new BaseItemBlock(this);
    }
    
    @Override
    public String getTranslationKey(){
        return this.getRegistryName().toString();
    }
}
