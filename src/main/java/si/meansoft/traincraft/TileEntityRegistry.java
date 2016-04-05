package si.meansoft.traincraft;

import net.minecraftforge.fml.common.registry.GameRegistry;
import si.meansoft.traincraft.tileEntities.TileEntityDistillery;

/**
 * @author canitzp
 */
public class TileEntityRegistry {

    public static void preInit(){
        GameRegistry.registerTileEntity(TileEntityDistillery.class, "TileEntityDistillery");
    }

}
