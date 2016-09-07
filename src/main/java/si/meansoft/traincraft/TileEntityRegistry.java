package si.meansoft.traincraft;

import net.minecraftforge.fml.common.registry.GameRegistry;
import si.meansoft.traincraft.tile.TileEntityDistillery;
import si.meansoft.traincraft.tile.TileEntityHearthFurnace;
import si.meansoft.traincraft.tile.TileEntityRail;
import si.meansoft.traincraft.tile.TileEntityWindmill;

/**
 * @author canitzp
 */
public class TileEntityRegistry {

    public static void preInit(){
        //Has to be registered with modid as duplicate registry ids will lead into the tile not being registered at all
        GameRegistry.registerTileEntity(TileEntityDistillery.class, Traincraft.MODID + "Distillery");
        GameRegistry.registerTileEntity(TileEntityRail.class, Traincraft.MODID + "Rail");
        //GameRegistry.registerTileEntity(TileEntityCrafterSteam.class, Traincraft.MODID + "CrafterSteam");
        //GameRegistry.registerTileEntity(TileEntityCrafterDiesel.class, Traincraft.MODID + "CrafterDiesel");
        //GameRegistry.registerTileEntity(TileEntityCrafterElectro.class, Traincraft.MODID + "CrafterElectro");
        GameRegistry.registerTileEntity(TileEntityHearthFurnace.class, Traincraft.MODID + "HearthFurnace");
        GameRegistry.registerTileEntity(TileEntityWindmill.class, Traincraft.MODID + "Windmill");
    }

}
