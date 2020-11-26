package ebf.tim.utility;


import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.IGuiHandler;
import ebf.tim.api.SkinRegistry;
import ebf.tim.blocks.TileEntityStorage;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.registry.TiMBlocks;
import ebf.tim.registry.TiMFluids;
import ebf.tim.registry.TiMItems;
import ebf.tim.registry.TiMOres;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;
import net.minecraftforge.common.config.Configuration;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;


/**
 * <h1>Common and Server proxy</h1>
 * defines some of the more important server only, and dual sided functionality that runs on the main thread of the mod.
 * @author Eternal Blue Flame
 */
public class CommonProxy implements IGuiHandler {


    public static EventManagerServer eventManagerServer = new EventManagerServer();
    public static Map<String, List<Recipe>> recipesInMods = new HashMap<>();
    public static String configDirectory;
    public static boolean realSpeed=true;




    /**
     * <h2> Server GUI Redirect </h2>
     * Mostly a redirect between the event handler and the actual Container Handler
     *
     * the inventory manager that server uses for this menu is defined in
     * @see ClientProxy#getClientGuiElement(int, EntityPlayer, World, int, int, int)
     */
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        //Trains
        if (player != null && y!=0) {
            if (player.worldObj.getEntityByID(ID) instanceof GenericRailTransport && !((GenericRailTransport) player.worldObj.getEntityByID(ID)).hasCustomGUI()) {
                return new TransportSlotManager(player.inventory, (GenericRailTransport) player.worldObj.getEntityByID(ID));
                //tile entities
            } else if (world.getTileEntity(x,y,z) instanceof TileEntityStorage){
                return new TransportSlotManager(player.inventory, (TileEntityStorage) world.getTileEntity(x,y,z));
            }
        }
        return null;
    }

    public void adminGui(String datacsv){}

    public boolean isClient(){return false;}

    /**
     * <h2>Load config</h2>
     * this loads the config values that will only effect server.
     */
    public void loadConfig(FMLPreInitializationEvent event){

        Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();
        config.addCustomCategoryComment("Debug (Common)", "Used on server and client.");
        SkinRegistry.forceSkinRegister = config.getBoolean("ForceSkinRegister", "Debug (Common)", false,
                "Forces skins to register even if the add-on for said TransportSkin is not available, doesn't cause instability just uses unnecessary ram.");

        config.addCustomCategoryComment("Debug (Common, IDE Only)", "Only runs from IDE instances.");
        SkinRegistry.debugSkinRegistration = config.getBoolean("DebugSkinRegister", "Debug (Common, IDE Only)",false,
                "Logs all TransportSkin registration events to debug console.");

        config.save();
        configDirectory = event.getModConfigurationDirectory().getAbsolutePath();

        realSpeed=config.getBoolean("UseRealSpeed","Gameplay", true,
                "Real speed moves the train on the assumption a block is a meter. Setting this to false will move the train on the assumption a block is 16 meters (more similar to Traincraft).");





    }

    /**
     * <h2>load entity from UUID</h2>
     * This checks every entity in every dimension for one with the proper UUID,
     * this is very similar to the system used in 1.8+.
     * NOTE: this is SERVER ONLY.
     *
     * We can't use a foreach loop, if we do it will very often throw a java.util.ConcurrentModificationException
     */
    @Deprecated //use a world relative value via DimensionManager.getWorld(dimensionId)
    @Nullable
    public static Entity getEntityFromUuid(UUID uuid) {
        //loop for dimensions, even ones from mods.
        for (int w=0; w < MinecraftServer.getServer().worldServers.length; w++) {
            if (MinecraftServer.getServer().worldServers[w] != null) {
                //if the server isn't null, loop for the entities loaded in that server
                for (int i=0; i< MinecraftServer.getServer().worldServers[w].loadedEntityList.size();i++) {
                    //if it's an entity, not null, and has a matching UUID, then return it.
                    if (MinecraftServer.getServer().worldServers[w].loadedEntityList.get(i) instanceof Entity &&
                            ((Entity) MinecraftServer.getServer().worldServers[w].loadedEntityList.get(i)).getUniqueID().equals(uuid)) {
                        return (Entity) MinecraftServer.getServer().worldServers[w].loadedEntityList.get(i);
                    }
                }
            }
        }
        return null;
    }


    /**
     * <h2>registry</h2>
     * placeholder code for the client registration.
     * @see ClientProxy#register) for actual use:
     */
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {return null;}


    public Object getTESR(){return null;}
    public Object getEntityRender(){return null;}
    public Object getNullRender(){return null;}

    /*
     * <h1> registration </h1>
     */



    /**
     * <h2>Server Register</h2>
     * Used for registering server only functions.
     * Also serves as a placeholder for the client function, which is actually used, so we don't get a missing function error.
     */
    public void register() {
        TiMFluids.registerFluids();
        TiMOres.registerOres();
        TiMItems.registerItems();
        TiMBlocks.registerBlocks();
    }

}
