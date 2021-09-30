package train.common;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStoppedEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.VillagerRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.world.gen.structure.MapGenStructureIO;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import train.common.api.LiquidManager;
import train.common.blocks.TCBlocks;
import train.common.core.CommonProxy;
import train.common.core.CreativeTabTraincraft;
import train.common.core.TrainModCore;
import train.common.core.handlers.*;
import train.common.generation.ComponentVillageTrainstation;
import train.common.generation.WorldGenWorld;
import train.common.items.TCItems;
import train.common.library.Info;
import train.common.recipes.AssemblyTableRecipes;

import java.io.File;

@Mod(modid = Info.modID, name = Info.modName, version = Info.modVersion)
public class Traincraft {

	/* TrainCraft instance */
	@Instance(Info.modID)
	public static Traincraft instance;

	/* TrainCraft proxy files */
	@SidedProxy(clientSide = "train.client.core.ClientProxy", serverSide = "train.common.core.CommonProxy")
	public static CommonProxy proxy;

	/* TrainCraft Logger */
	public static Logger tcLog = LogManager.getLogger(Info.modName);

	/** Network Channel to send packets on */
	public static SimpleNetworkWrapper modChannel;
	public static SimpleNetworkWrapper keyChannel;
	public static SimpleNetworkWrapper rotationChannel;


	public static SimpleNetworkWrapper slotschannel;
	public static SimpleNetworkWrapper ignitionChannel;
	public static SimpleNetworkWrapper brakeChannel;
	public static SimpleNetworkWrapper lockChannel;
	public static SimpleNetworkWrapper builderChannel;
	public static SimpleNetworkWrapper updateTrainIDChannel = NetworkRegistry.INSTANCE.newSimpleChannel("TrainIDChannel");
    public static SimpleNetworkWrapper updateDestinationChannel = NetworkRegistry.INSTANCE.newSimpleChannel("updateDestnChannel");


	public static final SimpleNetworkWrapper itaChannel = NetworkRegistry.INSTANCE.newSimpleChannel("TransmitterAspect");
	public static  SimpleNetworkWrapper itsChannel = NetworkRegistry.INSTANCE.newSimpleChannel("TransmitterSpeed");
	//public static  SimpleNetworkWrapper mtcsChannel = NetworkRegistry.INSTANCE.newSimpleChannel("MTCSysSetSpeed");
	public static  SimpleNetworkWrapper itnsChannel = NetworkRegistry.INSTANCE.newSimpleChannel("TransmitterNextSpeed");
	public static final SimpleNetworkWrapper mtlChannel = NetworkRegistry.INSTANCE.newSimpleChannel("MTCLevelUpdater");
	public static final SimpleNetworkWrapper msChannel = NetworkRegistry.INSTANCE.newSimpleChannel("MTCStatus");
	public static final SimpleNetworkWrapper mscChannel = NetworkRegistry.INSTANCE.newSimpleChannel("MTCStatusToClient");
	public static final SimpleNetworkWrapper atoChannel = NetworkRegistry.INSTANCE.newSimpleChannel("ATOPacket");
	public static final SimpleNetworkWrapper atoDoSlowDownChannel = NetworkRegistry.INSTANCE.newSimpleChannel("ATODoSlowDown");
	public static final SimpleNetworkWrapper atoDoAccelChannel = NetworkRegistry.INSTANCE.newSimpleChannel("ATODoAccel");
	public static final SimpleNetworkWrapper atoSetStopPoint = NetworkRegistry.INSTANCE.newSimpleChannel("ATOSetStopPoint");
	public static final SimpleNetworkWrapper NCSlowDownChannel = NetworkRegistry.INSTANCE.newSimpleChannel("NCDoSlowDown");
	//public static final SimpleNetworkWrapper ctChannel = NetworkRegistry.INSTANCE.newSimpleChannel("ctmChannel");
	public static final SimpleNetworkWrapper gsfsChannel = NetworkRegistry.INSTANCE.newSimpleChannel("gsfsChannel");
	public static final SimpleNetworkWrapper gsfsrChannel = NetworkRegistry.INSTANCE.newSimpleChannel("gsfsReturnChannel");



	public static File configDirectory;

	/* Creative tab for Traincraft */
	public static CreativeTabs tcTab;

	public ArmorMaterial armor = EnumHelper.addArmorMaterial("Armor", 5, new int[] { 1, 2, 2, 1 }, 25);
	public ArmorMaterial armorCloth = EnumHelper.addArmorMaterial("TCcloth", 5, new int[] {1, 2, 2, 1}, 25);
	public ArmorMaterial armorCompositeSuit = EnumHelper.addArmorMaterial("TCsuit", 70, new int[] {2, 6, 5, 2}, 50);
	public static int trainArmor;
	public static int trainCloth;
	public static int trainCompositeSuit;

	
	public static WorldGenWorld worldGen;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		tcLog.info("Starting Traincraft " + Info.modVersion + "!");
		/* Config handler */
		configDirectory= event.getModConfigurationDirectory();
		ConfigHandler.init(new File(event.getModConfigurationDirectory(), Info.modName + ".cfg"));

		/* Register the KeyBinding Handler */
		proxy.registerKeyBindingHandler();

		/* Register Items, Blocks, ... */
		tcLog.info("Initialize Blocks, Items, ...");
		tcTab = new CreativeTabTraincraft(CreativeTabs.getNextID(), "Traincraft");
		trainArmor = proxy.addArmor("armor");
		trainCloth = proxy.addArmor("Paintable");
		trainCompositeSuit = proxy.addArmor("CompositeSuit");
		TCBlocks.init();
		TCItems.init();
		EntityHandler.init();
		proxy.registerTileEntities();
		proxy.registerSounds();
		proxy.setHook(); // Moved file needed to run JLayer, we need to set a hook in order to retrieve it

		GameRegistry.registerFuelHandler(new FuelHandler());
		AchievementHandler.load();
		AchievementPage.registerAchievementPage(AchievementHandler.tmPage);
		GameRegistry.registerWorldGenerator(worldGen = new WorldGenWorld(),5);
		
		//Retrogen Handling
		RetrogenHandler retroGen = new RetrogenHandler();
		MinecraftForge.EVENT_BUS.register(retroGen);
		FMLCommonHandler.instance().bus().register(retroGen);
		
		MapGenStructureIO.func_143031_a(ComponentVillageTrainstation.class, "Trainstation");

		if (Loader.isModLoaded("ComputerCraft")) {
			try {
				proxy.registerComputerCraftPeripherals();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}

		/* Other Proxy init */
		tcLog.info("Initialize Renderer and Events");
		proxy.registerRenderInformation();
		proxy.registerEvents(event);

		/* Networking and Packet initialisation */
		PacketHandler.init();

		tcLog.info("Finished PreInitialization");
	}

	@EventHandler
	public void load(FMLInitializationEvent event) {
		tcLog.info("Start Initialization");

		//proxy.getCape();

		/* GUI handler initiation */
		tcLog.info("Initialize Gui");
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, proxy);
		FMLCommonHandler.instance().bus().register(new CraftingHandler());

		/* Ore dictionary */
		OreHandler.registerOres();

		/* Recipes */
		tcLog.info("Initialize Recipes");
		RecipeHandler.initBlockRecipes();
		RecipeHandler.initItemRecipes();
		RecipeHandler.initSmeltingRecipes();
		AssemblyTableRecipes.recipes();

		/* Register the liquids */
		tcLog.info("Initialize Fluids");
		LiquidManager.getInstance().registerLiquids();

		/* Liquid FX */
		proxy.registerTextureFX();

		/*Trainman Villager*/
		tcLog.info("Initialize Station Chief Villager");
		VillagerRegistry.instance().registerVillagerId(ConfigHandler.TRAINCRAFT_VILLAGER_ID);
		VillagerTraincraftHandler villageHandler = new VillagerTraincraftHandler();
		VillagerRegistry.instance().registerVillageCreationHandler(villageHandler);
		proxy.registerVillagerSkin(ConfigHandler.TRAINCRAFT_VILLAGER_ID, "station_chief.png");
		VillagerRegistry.instance().registerVillageTradeHandler(ConfigHandler.TRAINCRAFT_VILLAGER_ID, villageHandler);


		proxy.registerBookHandler();

		
		tcLog.info("Finished Initialization");


	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent evt) {
		tcLog.info("Start to PostInitialize");
		tcLog.info("Register ChunkHandler");

		tcLog.info("Activation Mod Compatibility");
		TrainModCore.ModsLoaded();
		LiquidManager.getLiquidsFromDictionnary();

		tcLog.info("Finished PostInitialization");
	}

	@EventHandler
	public void serverStop(FMLServerStoppedEvent event) {
		proxy.killAllStreams();
	}
}
