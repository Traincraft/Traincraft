package si.meansoft.traincraft;

import net.minecraftforge.fml.common.registry.GameRegistry;
import si.meansoft.traincraft.tileEntities.TileEntityHearthFurnace;
import si.meansoft.traincraft.tileEntities.TileEntityWindmill;
import si.meansoft.traincraft.tileEntities.crafter.TileEntityCrafterDiesel;
import si.meansoft.traincraft.tileEntities.TileEntityDistillery;
import si.meansoft.traincraft.tileEntities.TileEntityRail;
import si.meansoft.traincraft.tileEntities.crafter.TileEntityCrafterElectro;
import si.meansoft.traincraft.tileEntities.crafter.TileEntityCrafterSteam;

/**
 * @author canitzp
 */
public class TileEntityRegistry {

    public static void preInit(){
        //Has to be registered with modid as duplicate registry ids will lead into the tile not being registered at all
        GameRegistry.registerTileEntity(TileEntityDistillery.class, Traincraft.MODID + "Distillery");
        GameRegistry.registerTileEntity(TileEntityRail.class, Traincraft.MODID + "Rail");
        GameRegistry.registerTileEntity(TileEntityCrafterSteam.class, Traincraft.MODID + "CrafterSteam");
        GameRegistry.registerTileEntity(TileEntityCrafterDiesel.class, Traincraft.MODID + "CrafterDiesel");
        GameRegistry.registerTileEntity(TileEntityCrafterElectro.class, Traincraft.MODID + "CrafterElectro");
        GameRegistry.registerTileEntity(TileEntityHearthFurnace.class, Traincraft.MODID + "HearthFurnace");
        GameRegistry.registerTileEntity(TileEntityWindmill.class, Traincraft.MODID + "Windmill");
    }

}
