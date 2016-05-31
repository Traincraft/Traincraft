package train.common;

import java.io.File;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.world.gen.structure.MapGenStructureIO;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.util.EnumHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import train.common.core.TrainModCore;
import train.common.core.handlers.*;
import train.common.core.network.*;
import train.common.generation.ComponentVillageTrainstation;
import train.common.api.LiquidManager;
import train.common.blocks.TCBlocks;
import train.common.core.CommonProxy;
import train.common.core.CreativeTabTraincraft;
import train.common.generation.WorldGenWorld;
import train.common.items.TCItems;
import train.common.library.Info;
import train.common.mysql.mysqlLogInterface;
import train.common.mysql.mysqlLogger;
import train.common.recipes.AssemblyTableRecipes;
import cpw.mods.fml.common.FMLCommonHandler;
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
import cpw.mods.fml.relauncher.Side;

@Mod(modid = Info.modID, name = Info.modName, version = Info.modVersion)
//@NetworkMod(clientSideRequired = true, serverSideRequired = true, versionBounds = "[" + Info.modVersion + "]", channels = { Info.channel }, packetHandler = PacketHandler.class, connectionHandler = KeyServerHandler.class)
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

	/* Creative tab for Traincraft */
	public static CreativeTabs tcTab;

	public ArmorMaterial armor = EnumHelper.addArmorMaterial("Armor", 5, new int[] { 1, 3, 2, 1 }, 25);
	public ArmorMaterial armorCloth = EnumHelper.addArmorMaterial("TCcloth", 5, new int[] {1, 3, 2, 1}, 25);
	public ArmorMaterial armorCompositeSuit = EnumHelper.addArmorMaterial("TCsuit", 70, new int[] {5, 12, 8, 5}, 50);
	public static int trainArmor;
	public static int trainCloth;
	public static int trainCompositeSuit;

	private mysqlLogInterface logMysql = new mysqlLogger();
	public static boolean mysqlLoggerEnabled;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		tcLog.info("Starting Traincraft " + Info.modVersion + "!");
		/* Config handler */
		ConfigHandler.init(new File(event.getModConfigurationDirectory(), Info.modName + ".cfg"));
		proxy.getKeysFromProperties();

		/* Register Items, Blocks, ... */
		tcLog.info("Initialize Blocks, Items, ...");
		tcTab = new CreativeTabTraincraft(CreativeTabs.getNextID(), "Traincraft");
		trainArmor = proxy.addArmor("armor");
		trainCloth = proxy.addArmor("Paintable");
		trainCompositeSuit = proxy.addArmor("CompositeSuit");
		TCBlocks.init();
		TrainModCore.RegisterNewTracks();
		TCItems.init();
		EntityHandler.init();
		proxy.registerTileEntities();
		proxy.registerSounds();

		GameRegistry.registerFuelHandler(new FuelHandler());
		AchievementHandler.load();
		AchievementPage.registerAchievementPage(AchievementHandler.tmPage);
		GameRegistry.registerWorldGenerator(new WorldGenWorld(),5);
		MapGenStructureIO.func_143031_a(ComponentVillageTrainstation.class, "Trainstation");

		/* Other Proxy init */
		tcLog.info("Initialize Renderer and Events");
		proxy.registerRenderInformation();
		proxy.registerEvents(event);
		proxy.isHoliday();

		/* Networking and Packet initialisation */
		tcLog.info("Initialize Packets");
		int packetID = 0;
		modChannel = NetworkRegistry.INSTANCE.newSimpleChannel(Info.modID);
		modChannel.registerMessage(PacketKeyPress.Handler.class, PacketKeyPress.class, ++packetID, Side.SERVER);
		modChannel.registerMessage(PacketRollingStockRotation.Handler.class, PacketRollingStockRotation.class, ++packetID, Side.CLIENT);
		modChannel.registerMessage(PacketSetJukeboxStreamingUrl.Handler.class, PacketSetJukeboxStreamingUrl.class, ++packetID, Side.SERVER);
		modChannel.registerMessage(PacketSlotsFilled.Handler.class, PacketSlotsFilled.class, ++packetID, Side.CLIENT);
		modChannel.registerMessage(PacketParkingBreak.Handler.class, PacketParkingBreak.class, ++packetID, Side.SERVER);
		modChannel.registerMessage(PacketSetTrainLockedToClient.Handler.class, PacketSetTrainLockedToClient.class, ++packetID, Side.SERVER);
		modChannel.registerMessage(PacketSetLocoTurnedOn.Handler.class, PacketSetLocoTurnedOn.class, ++packetID, Side.SERVER);
		modChannel.registerMessage(PacketLantern.Handler.class, PacketLantern.class, ++packetID, Side.SERVER);
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
		AssemblyTableRecipes.recipes();

		/* Register the liquids */
		tcLog.info("Initialize Fluids");
		LiquidManager.getInstance().registerLiquids();

		/* Liquid FX */
		proxy.registerTextureFX();

		/* Try to load mysql */
		if (ConfigHandler.MYSQL_ENABLE)
			mysqlLoggerEnabled = logMysql.enableLogger();

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
		proxy.registerChunkHandler(instance);

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