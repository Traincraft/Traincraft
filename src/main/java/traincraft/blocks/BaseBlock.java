/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("BaseBlock.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import traincraft.items.BaseItemBlock;

public class BaseBlock extends Block implements IItemBlockSupplier {
    
    public BaseBlock(Material blockMaterialIn, MapColor blockMapColorIn){
        super(blockMaterialIn, blockMapColorIn);
    }
    
    public BaseBlock(Material materialIn){
        super(materialIn);
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
