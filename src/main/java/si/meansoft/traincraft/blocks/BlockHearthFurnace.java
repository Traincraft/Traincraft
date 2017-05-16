/*
 * This file ("BlockHearthFurnace.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/blob/master/LICENSE.md)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2017
 */

package si.meansoft.traincraft.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.util.EnumFacing;
import si.meansoft.traincraft.client.gui.GuiHearthFurnace;
import si.meansoft.traincraft.container.ContainerHearthFurnace;
import si.meansoft.traincraft.network.GuiHandler;
import si.meansoft.traincraft.tile.TileEntityHearthFurnace;

/**
 * @author Ellpeck
 */
public class BlockHearthFurnace extends BlockContainerBase {

    public BlockHearthFurnace() {
        super(Material.ROCK, "hearth_furnace", TileEntityHearthFurnace.class);
        this.addGuiContainer(GuiHandler.HEARTH_FURNACE, GuiHearthFurnace.class, ContainerHearthFurnace.class);
        this.setDefaultState(this.getBlockState().getBaseState().withProperty(BlockDistillery.ACTIVE, false).withProperty(FACING, EnumFacing.NORTH));
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, BlockDistillery.ACTIVE, FACING);
    }

}
