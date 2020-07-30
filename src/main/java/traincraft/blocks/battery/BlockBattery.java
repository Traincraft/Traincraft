/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("BlockBattery.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.blocks.battery;

import net.minecraft.block.material.Material;
import traincraft.Traincraft;
import traincraft.blocks.BaseContainerBlock;

/**
 * @author canitzp
 * @since 2020-07-30
 */
public class BlockBattery extends BaseContainerBlock {
    
    public BlockBattery(){
        super(Material.IRON, TileBattery.class);
        this.setRegistryName(Traincraft.MOD_ID, "battery");
    }
}
