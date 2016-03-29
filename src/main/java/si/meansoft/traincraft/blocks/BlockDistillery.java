package si.meansoft.traincraft.blocks;

import net.minecraft.block.material.Material;
import si.meansoft.traincraft.container.ContainerDistillery;
import si.meansoft.traincraft.gui.GuiDistillery;
import si.meansoft.traincraft.network.GuiHandler;
import si.meansoft.traincraft.tileEntities.TileEntityDistillery;

/**
 * @author canitzp
 */
public class BlockDistillery extends BlockContainerBase {

    public BlockDistillery() {
        super(Material.iron, "blockDistillery", TileEntityDistillery.class);
        addGuiContainer(GuiHandler.DISTILLERY, GuiDistillery.class, ContainerDistillery.class);
    }

}
