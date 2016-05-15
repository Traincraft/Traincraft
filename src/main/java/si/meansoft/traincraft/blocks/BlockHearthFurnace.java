package si.meansoft.traincraft.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import si.meansoft.traincraft.container.ContainerHearthFurnace;
import si.meansoft.traincraft.client.gui.GuiHearthFurnace;
import si.meansoft.traincraft.network.GuiHandler;
import si.meansoft.traincraft.tileEntities.TileEntityHearthFurnace;

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

    @Override
    public int getMetaFromState(IBlockState state) {
        return state.getValue(BlockDistillery.ACTIVE) ? 7 + state.getValue(FACING).getIndex() : state.getValue(FACING).getIndex();
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        IBlockState state = this.getDefaultState();
        if(meta <= 6){
            state.withProperty(FACING, EnumFacing.getFront(meta));
            state.withProperty(BlockDistillery.ACTIVE, true);
        } else {
            state.withProperty(FACING, EnumFacing.getFront(meta - 7));
            state.withProperty(BlockDistillery.ACTIVE, false);
        }
        return state;
    }
}
