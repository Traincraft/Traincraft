package ebf.tim;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import ebf.tim.blocks.OreGen;
import ebf.tim.entities.EntityBogie;
import ebf.tim.entities.EntitySeat;
import ebf.tim.gui.GUICraftBook;
import ebf.tim.items.ItemAdminBook;
import ebf.tim.items.TiMTab;
import ebf.tim.networking.PacketInteract;
import ebf.tim.networking.PacketPaint;
import ebf.tim.networking.PacketRemove;
import ebf.tim.registry.TiMGenericRegistry;
import ebf.tim.utility.ChunkHandler;
import ebf.tim.utility.ClientProxy;
import ebf.tim.utility.CommonProxy;
import net.minecraftforge.common.ForgeChunkManager;
import net.minecraftforge.common.MinecraftForge;

import java.util.Collections;
import java.util.List;


/**
 * <h1>Main class</h1>
 * this class, which manages the mod as a whole.
 * Build number is defined via:
 *      First number denotes entire rebuild of feature set, for instance in the case of when we move to pure 1.9 development or finish the core stuff for 1.7/1.9.
 *      Second is minor, for rebuilds of individual feature sets not intended to effect the whole, like if we were to rebuild the entire GUI system.
 *      Third is for bugfix and/or minor optimization releases, where as we didn't change any features, but it works better.
 *      fourth is new minor content, like new trains or rollingstock that use existing features.
 *
 * @author Eternal Blue Flame
 */
@Mod(modid = TrainsInMotion.MODID, version = TrainsInMotion.MOD_VERSION, name = "Trains in Motion")
public class TrainsInMotion {

    /*
    Note for laziness: gradle deobfuscator is located at:
    %user%/.gradle/caches/minecraft/net/minecraftforge/forge/1.7.10-10.13.4.1558-1.7.10/unpacked/conf/
     */

    /**the ID of the mod and the version displayed in game, as well as used for version check in the version.txt file*/
    public static final String MODID = "trainsinmotion";
    /**the version identifier of the mod*/
    public static final String MOD_VERSION="2.3 pre-alpha";
    /**an instance of the mod*/
    @Mod.Instance(MODID)
    public static TrainsInMotion instance;
    /**
     *Setup the proxy, this is used for managing some of the client and server specific features.
     *@see CommonProxy
     *@see ClientProxy
     */
    @SidedProxy(clientSide = "ebf.tim.utility.ClientProxy", serverSide = "ebf.tim.utility.CommonProxy")
    public static CommonProxy proxy;

    /**the creative tab for the mod*/
    public static TiMTab creativeTab,creativeTabCrafting;

    /**instance the network wrapper for the channels.
     * Every wrapper runs on it's own thread, so heavy traffic should go on it's own wrapper, using channels to separate packet types.*/
    public static SimpleNetworkWrapper keyChannel;
    public static SimpleNetworkWrapper trackChannel;


    /**Instance a new chunk handler, this class manages chunk loading events and functionality.*/
    public static ChunkHandler chunkHandler = new ChunkHandler();


    /**
     * <h3>enums</h3>
     *
     */

     /**define the transport types*/
    public enum transportTypes {
        STEAM,DIESEL,HYDROGEN_DIESEL,ELECTRIC,NUCLEAR_STEAM,NUCLEAR_ELECTRIC, //trains
        PASSENGER, FREIGHT, HOPPER, TANKER, WORKCAR, SLUG, B_UNIT, //generic rollingstock
        LOGCAR, RAILCAR, FREEZERCAR, LAVATANKER, GRAINHOPPER, COALHOPPER, OILCAR, //specific cargo rollingstock
        FUELTANKER, TENDER, ELECTRIC_TENDER, JUKEBOX, TRACKBUILDER, OTHER; //specialized Rollingstock

         public boolean isTrain(){
             return this == STEAM || this == DIESEL || this == HYDROGEN_DIESEL || this == ELECTRIC ||
                     this == NUCLEAR_STEAM || this == NUCLEAR_ELECTRIC || this == B_UNIT;
         }
         public boolean isHopper(){
             return this == HOPPER || this == GRAINHOPPER || this == COALHOPPER;
         }
         public boolean isTanker(){
             return this == TANKER || this == LAVATANKER || this == OILCAR || this == FUELTANKER;
         }
         public List<transportTypes> singleton(){return Collections.singletonList(this);}
    }

    /**
     * <h2>load config</h2>
     * we use the pre-init to load the config file.
     * Most of the configs are decided by the proxy, no need to setup controls on the server.
     */
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        proxy.loadConfig(event);
        ForgeChunkManager.setForcedChunkLoadingCallback(TrainsInMotion.instance, chunkHandler);
        MinecraftForge.EVENT_BUS.register(chunkHandler);
        creativeTab=new TiMTab("Trains in Motion", MODID, "TiM");
        creativeTabCrafting=new TiMTab("Trains in Motion Crafting", creativeTab.getTabItem());
    }

    /**
     * <h2>Registries</h2>
     * register everything here.
     * blocks and items handle themselves in their own class, but entities we have to handle a bit different by doing it here.
     *
     * networking we have packets for each major channel type, its more overhead overall but it will help significantly to prevent delays.
     *
     * This could be done in pre-init but that would brake compatibility with Dragon API and a number of 3rd party mods.
     */
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        //loop for registering the entities. the values needed are the class, entity name, entity ID, mod instance, update range, update rate, and if it does velocity things,
        cpw.mods.fml.common.registry.EntityRegistry.registerModEntity(EntityBogie.class, "Bogie", 15, TrainsInMotion.instance, 60, 3, true);
        cpw.mods.fml.common.registry.EntityRegistry.registerModEntity(EntitySeat.class, "Seat", 16, TrainsInMotion.instance, 60, 3, true);

        if(event.getSide().isClient()){

            GUICraftBook.addPage(MODID, "Trains in Motion\nDev: Eternal Blue Flame" +
                    "\nHonorable mentions\nfor helping development:\nFerdinand (Fexcraft)\nZora no Densha, cam27cam\nMothershipQ," +
                    "Broscolotos\nSebasver\n");

            GUICraftBook.addPage(MODID,
                    " \n \n \nA special thanks to everyone\nthat helped support the mod\nthrough donations:\nNightScale5755" +
                            "\n \nAnd a big thanks to\nthe Traincraft community\nfor all the patience!");
        }



        //register the networking instances and channels
        TrainsInMotion.keyChannel = NetworkRegistry.INSTANCE.newSimpleChannel("TiM.key");
        TrainsInMotion.keyChannel.registerMessage(HANDLERS[0], PacketInteract.class, 1, Side.SERVER);
        TrainsInMotion.keyChannel.registerMessage(HANDLERS[1], PacketRemove.class, 2, Side.SERVER);
        TrainsInMotion.keyChannel.registerMessage(HANDLERS[2], ItemAdminBook.PacketAdminBook.class, 3, Side.CLIENT);
        TrainsInMotion.keyChannel.registerMessage(HANDLERS[3], ItemAdminBook.PacketAdminBookClient.class, 4, Side.SERVER);
        TrainsInMotion.keyChannel.registerMessage(HANDLERS[4], PacketPaint.class, 6, Side.CLIENT);
        TrainsInMotion.trackChannel = NetworkRegistry.INSTANCE.newSimpleChannel("TiM.track");


        proxy.register();
        //register the worldgen
        GameRegistry.registerWorldGenerator(new OreGen(), 0);
        if(event.getSide().isClient()) {
            //register the event handler
            MinecraftForge.EVENT_BUS.register(ClientProxy.eventManager);
            FMLCommonHandler.instance().bus().register(ClientProxy.eventManager);
            fexcraft.tmt.slim.TextureManager.collectIngotColors();
        }
        MinecraftForge.EVENT_BUS.register(CommonProxy.eventManagerServer);
        FMLCommonHandler.instance().bus().register(CommonProxy.eventManagerServer);

        //register GUI, model renders, Keybinds, client only blocks, and HUD
        NetworkRegistry.INSTANCE.registerGuiHandler(instance, proxy);
    }

    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) {
        TiMGenericRegistry.endRegistration();
    }



    private static final IMessageHandler[] HANDLERS = new IMessageHandler[]{
            new IMessageHandler<IMessage, IMessage>() {
                @Override public IMessage onMessage(IMessage message, MessageContext ctx) {return null;}
            },
            new IMessageHandler<IMessage, IMessage>() {
                @Override public IMessage onMessage(IMessage message, MessageContext ctx) {return null;}
            },
            new IMessageHandler<IMessage, IMessage>() {
                @Override public IMessage onMessage(IMessage message, MessageContext ctx) {return null;}
            },
            new IMessageHandler<IMessage, IMessage>() {
                @Override public IMessage onMessage(IMessage message, MessageContext ctx) {return null;}
            },
            new IMessageHandler<IMessage, IMessage>() {
                @Override public IMessage onMessage(IMessage message, MessageContext ctx) {return null;}
            }
    };
}
