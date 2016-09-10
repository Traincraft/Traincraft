package si.meansoft.traincraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.Logger;
import si.meansoft.traincraft.blocks.BlockTrack;
import si.meansoft.traincraft.gen.WorldGen;
import si.meansoft.traincraft.network.CommonProxy;
import si.meansoft.traincraft.network.GuiHandler;

@Mod(modid = Traincraft.MODID, name= Traincraft.NAME, version = Traincraft.VERSION)
public class Traincraft {

    public static final String MODID = "traincraft";
    public static final String NAME = "@MODNAME@";
    public static final String VERSION = "@VERSION@";
    public static final String CLIENTPROXY = "si.meansoft.traincraft.network.ClientProxy";
    public static final String COMMONPROXY = "si.meansoft.traincraft.network.CommonProxy";

    @Mod.Instance(Traincraft.MODID)
    public static Traincraft INSTANCE;

    @SidedProxy(clientSide = Traincraft.CLIENTPROXY, serverSide = Traincraft.COMMONPROXY)
    public static CommonProxy proxy;

    public static Logger logger;
    public static CreativeTabs generalTab, trackTab;

    static{
        FluidRegistry.enableUniversalBucket();
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        logger.info("[Pre Initializing] Let the trains out! " + NAME + ": " + VERSION);
        generalTab = new CreativeTabs("traincraftGeneralTab") {
            @Override
            public Item getTabIconItem() {
                return Item.getItemFromBlock(Registry.oilSand);
            }
        };
        trackTab = new CreativeTabs("traincraftTrackTab"){
            @Override
            public Item getTabIconItem(){
                return Item.getItemFromBlock(BlockTrack.TrackTypes.STRAIGHT_SINGLE.block);
            }
        };
        logger.info("[Pre Initializing] Register Blocks, Items, ...");
        Registry.preInit(event);
        GameRegistry.registerWorldGenerator(new WorldGen(), 10);
        NetworkRegistry.INSTANCE.registerGuiHandler(INSTANCE, new GuiHandler());
        logger.info("[Pre Initializing] Register Renderer");
        proxy.preInit(event);
        logger.info("[Pre Initializing] Finished this phase");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info("[Initializing] Starting phase");
        logger.info("[Initializing] Creating recipes");
        RecipeRegistry.init();
        proxy.init(event);
        logger.info("[Initializing] Finished phase");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        logger.info("[Post Initializing] Starting phase");
        proxy.postInit(event);
        logger.info("[Post Initializing] Now nothing can stop the trains!");
    }

}
