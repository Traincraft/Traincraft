/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("BlockFluidBase.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.blocks;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import traincraft.items.BaseItemBlock;

public class BlockFluidBase extends BlockFluidClassic implements IItemBlockSupplier {
    
    public BlockFluidBase(Fluid fluid, Material material, MapColor mapColor){
        super(fluid, material, mapColor);
        
        this.setRegistryName(fluid.getName());
    }
    
    public BlockFluidBase(Fluid fluid, Material material){
        this(fluid, material, material.getMaterialMapColor());
    }
    
    @Override
    public String getTranslationKey(){
        return this.getRegistryName().toString();
    }
    
    @Override
    public ItemBlock getItemBlock(){
        return new BaseItemBlock(this);
    }
}
