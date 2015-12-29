package si.meansoft.traincraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import si.meansoft.traincraft.proxy.CommonProxy;

@Mod(modid = Traincraft.MODID, name= Traincraft.MODNAME, version = Traincraft.VERSION)
public class Traincraft {

    @Mod.Instance(Traincraft.MODID)
    public static Traincraft traincraft;
    public static final String MODID = "traincraft";
    public static final String MODNAME = "Traincraft";
    public static final String VERSION = "5.0.0.001";
    public static final String SERVER_PROXY = "si.meansoft.traincraft.proxy.ServerProxy";
    public static final String CLIENT_PROXY = "si.meansoft.traincraft.proxy.ClientProxy";
    public static CreativeTabs traincraftTab;
    public static final Logger logger = LogManager.getLogger(MODNAME);
    @SidedProxy(clientSide = CLIENT_PROXY, serverSide = SERVER_PROXY)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent evt) {
        logger.info("Starting " + MODNAME);
        traincraftTab = new CreativeTabs("traincraftTab") {@Override public Item getTabIconItem() {return Items.item_frame;}};
        System.out.println("TC-0: " + evt.getSuggestedConfigurationFile());
    }

    @EventHandler
    public void init(FMLInitializationEvent evt) {
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent evt) {
    }

}
