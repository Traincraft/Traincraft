package si.meansoft.traincraft;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import si.meansoft.traincraft.gen.WorldGen;
import si.meansoft.traincraft.items.ItemBlockBase;
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
    public static Logger logger = LogManager.getLogger(NAME);
    public static CreativeTabs tab;

    static{
        net.minecraftforge.fluids.FluidRegistry.enableUniversalBucket();
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent evt) {
        logger.info("[Traincraft] Let the trains out! " + NAME + ": " + VERSION + "!");
        tab = new CreativeTabs("traincraftTab") {
            @Override
            public Item getTabIconItem() {
                return Item.getItemFromBlock(Registry.oilSand);
            }
        };
        logger.info("Register Blocks, Items, ...");
        Registry.preInit(evt);
        GameRegistry.registerWorldGenerator(new WorldGen(), 10);
        NetworkRegistry.INSTANCE.registerGuiHandler(INSTANCE, new GuiHandler());
        logger.info("Register Renderer!");
        proxy.preInit(evt);
        logger.info("[Traincraft] Finished PreInitializing!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent evt) {
        logger.info("[Traincraft] Started Initializing");
        RecipeRegistry.init();
        proxy.init(evt);
        logger.info("[Traincraft] Finished Initializing");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent evt) {
        logger.info("[Traincraft] Started PostInitializing");
        proxy.postInit(evt);
        logger.info("[Traincraft] Now you can't stop the trains!");
    }

}
