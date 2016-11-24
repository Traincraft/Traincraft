/*
 * This file ("BlockWindmill.java") is part of the Traincraft mod for Minecraft.
 * It is created by all persons that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/blob/master/LICENSE.md)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2016
 */

package si.meansoft.traincraft.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumBlockRenderType;
import si.meansoft.traincraft.tile.TileEntityWindmill;

/**
 * @author canitzp
 */
public class BlockWindmill extends BlockContainerBase{

    public BlockWindmill(){
        super(Material.IRON, "windmill", TileEntityWindmill.class);
    }

    @Override
    public EnumBlockRenderType getRenderType(IBlockState state){
        return EnumBlockRenderType.ENTITYBLOCK_ANIMATED;
    }
}
