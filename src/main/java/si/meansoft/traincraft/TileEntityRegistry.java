package si.meansoft.traincraft;

import net.minecraftforge.fml.common.registry.GameRegistry;
import si.meansoft.traincraft.tileEntities.TileEntityDistillery;
import si.meansoft.traincraft.tileEntities.TileEntityRail;

/**
 * @author canitzp
 */
public class TileEntityRegistry {

    public static void preInit(){
        GameRegistry.registerTileEntity(TileEntityDistillery.class, "TileEntityDistillery");
        GameRegistry.registerTileEntity(TileEntityRail.class, "TileEntityRail");
    }

}
