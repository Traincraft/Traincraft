package si.meansoft.traincraft.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import si.meansoft.traincraft.container.ContainerDistillery;
import si.meansoft.traincraft.gui.GuiDistillery;
import si.meansoft.traincraft.network.GuiHandler;
import si.meansoft.traincraft.tileEntities.TileEntityDistillery;

/**
 * @author canitzp
 */
public class BlockDistillery extends BlockContainerBase {

    public static final PropertyBool ACTIVE = PropertyBool.create("active");

    public BlockDistillery() {
        super(Material.IRON, "distillery", TileEntityDistillery.class);
        addGuiContainer(GuiHandler.DISTILLERY, GuiDistillery.class, ContainerDistillery.class);
        this.setDefaultState(this.getBlockState().getBaseState().withProperty(ACTIVE, false).withProperty(FACING, EnumFacing.NORTH));
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, ACTIVE, FACING);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return state.getValue(ACTIVE) ? 7 + state.getValue(FACING).getIndex() : state.getValue(FACING).getIndex();
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        IBlockState state = getDefaultState();
        if(meta <= 6){
            state.withProperty(FACING, EnumFacing.getFront(meta));
            state.withProperty(ACTIVE, true);
        } else {
            state.withProperty(FACING, EnumFacing.getFront(meta - 7));
            state.withProperty(ACTIVE, false);
        }
        return state;
    }
}
