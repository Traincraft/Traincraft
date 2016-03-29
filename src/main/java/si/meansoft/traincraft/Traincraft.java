package si.meansoft.traincraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import si.meansoft.traincraft.blocks.BlockBase;
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
    public static Logger logger = LogManager.getLogger(NAME);
    public static CreativeTabs tab;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent evt) {
        logger.info("Let the trains out! " + NAME + ": " + VERSION + "!");
        tab = new CreativeTabs("traincraftTab") {
            @Override
            public Item getTabIconItem() {
                return Item.getItemFromBlock(BlockRegistry.oilSand);
            }
        };
        logger.info("Register Blocks, Items, ...");
        BlockRegistry.preInit();
        //ItemReg
        TileEntityRegistry.preInit();
        GameRegistry.registerWorldGenerator(new WorldGen(), 10);
        NetworkRegistry.INSTANCE.registerGuiHandler(INSTANCE, new GuiHandler());
        logger.info("Register Renderer!");
        proxy.preInit(evt);
        logger.info("Finished PreInitializing!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent evt) {
        proxy.init(evt);
        logger.info("Finished Initializing");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent evt) {
        proxy.postInit(evt);
        logger.info("Now you can't stop the trains!");
    }

    public static void registerBlock(BlockBase block, String blockName){
        block.setUnlocalizedName(MODID + ":" + blockName);
        block.setRegistryName(blockName);
        if(!block.forgeModel) CommonProxy.addStackToRender(Item.getItemFromBlock(block));
        block.setCreativeTab(tab);
        GameRegistry.registerBlock(block);
    }

}
