/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("BlockPetrolOre.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import traincraft.Traincraft;

public class BlockPetrolOre extends BaseBlock {
    
    public BlockPetrolOre(){
        super(Material.ROCK);
        this.setRegistryName(Traincraft.MOD_ID, "petrol_ore");
        
        this.setCreativeTab(Traincraft.TAB);
        this.setHardness(3.0F);
        this.setResistance(5F);
        this.setSoundType(SoundType.STONE);
        this.setHarvestLevel("pickaxe", 1);
    }
    
}
