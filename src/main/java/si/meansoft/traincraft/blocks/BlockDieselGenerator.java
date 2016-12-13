/*
 * This file ("BlockDieselGenerator.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/blob/master/LICENSE.md)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2016
 */

package si.meansoft.traincraft.blocks;

import net.minecraft.block.material.Material;
import si.meansoft.traincraft.tile.TileEntityDieselGenerator;

/**
 * @author canitzp
 */
public class BlockDieselGenerator extends BlockContainerBase{

    public BlockDieselGenerator(){
        super(Material.IRON, "generator_diesel", TileEntityDieselGenerator.class);
    }

}
