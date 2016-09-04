package si.meansoft.traincraft.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import si.meansoft.traincraft.container.ContainerDistillery;
import si.meansoft.traincraft.client.gui.GuiDistillery;
import si.meansoft.traincraft.network.GuiHandler;
import si.meansoft.traincraft.tile.TileEntityDistillery;

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

}
