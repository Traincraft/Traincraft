package si.meansoft.traincraft.blocks;

import net.minecraft.block.material.Material;
import si.meansoft.traincraft.tile.TileEntityDieselGenerator;

/**
 * @author canitzp
 */
public class BlockDieselGenerator extends BlockContainerBase{

    public BlockDieselGenerator(){
        super(Material.IRON, "generatorDiesel", TileEntityDieselGenerator.class);
    }

}
