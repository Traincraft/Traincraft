package si.meansoft.traincraft.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.util.EnumFacing;
import si.meansoft.traincraft.client.gui.GuiHearthFurnace;
import si.meansoft.traincraft.container.ContainerHearthFurnace;
import si.meansoft.traincraft.network.GuiHandler;
import si.meansoft.traincraft.tile.TileEntityHearthFurnace;

public class BlockHearthFurnace extends BlockContainerBase{

    public BlockHearthFurnace(){
        super(Material.ROCK, "hearthFurnace", TileEntityHearthFurnace.class);
        this.addGuiContainer(GuiHandler.HEARTH_FURNACE, GuiHearthFurnace.class, ContainerHearthFurnace.class);

        this.setDefaultState(this.getBlockState().getBaseState().withProperty(BlockDistillery.ACTIVE, false).withProperty(FACING, EnumFacing.NORTH));
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, BlockDistillery.ACTIVE, FACING);
    }

}
