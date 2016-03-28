package si.meansoft.traincraft;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import si.meansoft.traincraft.gen.WorldGen;
import si.meansoft.traincraft.network.CommonProxy;

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

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent evt) {
        BlockRegistry.preInit();
        GameRegistry.registerWorldGenerator(new WorldGen(), 10);
        proxy.preInit(evt);
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent evt) {
        proxy.init(evt);
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent evt) {
        proxy.postInit(evt);
    }

    public static void registerBlock(Block block, String blockName){
        block.setUnlocalizedName(MODID + ":" + blockName);
        block.setRegistryName(blockName);
        CommonProxy.addStackToRender(Item.getItemFromBlock(block));
        GameRegistry.registerBlock(block);
    }

}
