package train.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.gen.structure.MapGenStructureIO;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import train.common.api.LiquidManager;
import train.common.core.CommonProxy;
import train.common.core.TrainModCore;
import train.common.core.handlers.*;
import train.common.generation.ComponentVillageTrainstation;
import train.common.generation.WorldGenWorld;
import traincraft.items.TCItems;
import train.common.recipes.AssemblyTableRecipes;

import java.io.File;

@Mod(modid = Traincraft.MOD_ID, name = Traincraft.MOD_NAME, version = Traincraft.MOD_VERSION)
public class Traincraft {
	
	/* Mod relevant information */
	public static final String MOD_ID = "traincraft";
	public static final String MOD_NAME = "Traincraft";
	public static final String MOD_VERSION = "@VERSION1@";
	
	/* TrainCraft instance */
	@Mod.Instance(MOD_ID)
	public static Traincraft instance;
	
	/* TrainCraft proxy files */
	@SidedProxy(clientSide = "train.client.core.ClientProxy", serverSide = "train.common.core.CommonProxy")
	public static CommonProxy proxy;
	
	/* TrainCraft Logger */
	public static final Logger LOGGER = LogManager.getLogger(MOD_NAME);
	
	/* Creative tab for Traincraft */
	public static CreativeTabs TAB = new CreativeTabs(MOD_ID) {
		@Override
		public ItemStack createIcon() {
			return new ItemStack(TCItems.CANISTER);
		}
	};
	
	/**
	 * Network Channel to send packets on
	 */
	@Deprecated // move into one single network handler
	public static SimpleNetworkWrapper modChannel;
	@Deprecated // move into one single network handler
	public static SimpleNetworkWrapper keyChannel;
	@Deprecated // move into one single network handler
	public static SimpleNetworkWrapper rotationChannel;
	@Deprecated // move into one single network handler
	public static SimpleNetworkWrapper slotschannel;
	@Deprecated // move into one single network handler
	public static SimpleNetworkWrapper ignitionChannel;
	@Deprecated // move into one single network handler
	public static SimpleNetworkWrapper brakeChannel;
	@Deprecated // move into one single network handler
	public static SimpleNetworkWrapper lockChannel;
	@Deprecated // move into one single network handler
	public static SimpleNetworkWrapper builderChannel;
	@Deprecated // move into one single network handler
	public static SimpleNetworkWrapper updateTrainIDChannel = NetworkRegistry.INSTANCE.newSimpleChannel("TrainIDChannel");
	@Deprecated // move into one single network handler
	public static SimpleNetworkWrapper updateDestinationChannel = NetworkRegistry.INSTANCE.newSimpleChannel("updateDestnChannel");
	@Deprecated // move into one single network handler
	public static final SimpleNetworkWrapper itaChannel = NetworkRegistry.INSTANCE.newSimpleChannel("TransmitterAspect");
	@Deprecated // move into one single network handler
	public static SimpleNetworkWrapper itsChannel = NetworkRegistry.INSTANCE.newSimpleChannel("TransmitterSpeed");
	//public static  SimpleNetworkWrapper mtcsChannel = NetworkRegistry.INSTANCE.newSimpleChannel("MTCSysSetSpeed");
	@Deprecated // move into one single network handler
	public static SimpleNetworkWrapper itnsChannel = NetworkRegistry.INSTANCE.newSimpleChannel("TransmitterNextSpeed");
	@Deprecated // move into one single network handler
	public static final SimpleNetworkWrapper mtlChannel = NetworkRegistry.INSTANCE.newSimpleChannel("MTCLevelUpdater");
	@Deprecated // move into one single network handler
	public static final SimpleNetworkWrapper msChannel = NetworkRegistry.INSTANCE.newSimpleChannel("MTCStatus");
	@Deprecated // move into one single network handler
	public static final SimpleNetworkWrapper mscChannel = NetworkRegistry.INSTANCE.newSimpleChannel("MTCStatusToClient");
	@Deprecated // move into one single network handler
	public static final SimpleNetworkWrapper atoChannel = NetworkRegistry.INSTANCE.newSimpleChannel("ATOPacket");
	@Deprecated // move into one single network handler
	public static final SimpleNetworkWrapper atoDoSlowDownChannel = NetworkRegistry.INSTANCE.newSimpleChannel("ATODoSlowDown");
	@Deprecated // move into one single network handler
	public static final SimpleNetworkWrapper atoDoAccelChannel = NetworkRegistry.INSTANCE.newSimpleChannel("ATODoAccel");
	@Deprecated // move into one single network handler
	public static final SimpleNetworkWrapper atoSetStopPoint = NetworkRegistry.INSTANCE.newSimpleChannel("ATOSetStopPoint");
	@Deprecated // move into one single network handler
	public static final SimpleNetworkWrapper NCSlowDownChannel = NetworkRegistry.INSTANCE.newSimpleChannel("NCDoSlowDown");
	//public static final SimpleNetworkWrapper ctChannel = NetworkRegistry.INSTANCE.newSimpleChannel("ctmChannel");
	@Deprecated // move into one single network handler
	public static final SimpleNetworkWrapper gsfsChannel = NetworkRegistry.INSTANCE.newSimpleChannel("gsfsChannel");
	@Deprecated // move into one single network handler
	public static final SimpleNetworkWrapper gsfsrChannel = NetworkRegistry.INSTANCE.newSimpleChannel("gsfsReturnChannel");
	@Deprecated // move into one single network handler
	public static final SimpleNetworkWrapper playSoundOnClientChannel = NetworkRegistry.INSTANCE.newSimpleChannel(" SoundOnCChannel");
	
	public static File configDirectory;
	
	public static WorldGenWorld worldGen;
	
	public Traincraft() {
	
	}
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		LOGGER.info("Starting Traincraft " + MOD_VERSION + "!");
		/* Config handler */
		configDirectory = event.getModConfigurationDirectory();
		ConfigHandler.init(new File(event.getModConfigurationDirectory(), MOD_NAME + ".cfg"));
		
		/* Register the KeyBinding Handler */
		proxy.registerKeyBindingHandler();
		
		/* Register Items, Blocks, ... */
		LOGGER.info("Initialize Blocks, Items, ...");
		
		EntityHandler.init();
		proxy.registerTileEntities();
		proxy.registerSounds();
		proxy.setHook(); // Moved file needed to run JLayer, we need to set a hook in order to retrieve it
		
		// todo fuel handler GameRegistry.registerFuelHandler(new FuelHandler());
		//AchievementHandler.load();
		//AchievementPage.registerAchievementPage(AchievementHandler.tmPage);
		GameRegistry.registerWorldGenerator(worldGen = new WorldGenWorld(), 5);
		
		//Retrogen Handling
		RetrogenHandler retroGen = new RetrogenHandler();
		MinecraftForge.EVENT_BUS.register(retroGen);
		FMLCommonHandler.instance().bus().register(retroGen);
		
		MapGenStructureIO.registerStructureComponent(ComponentVillageTrainstation.class, "Trainstation");

		/*if (Loader.isModLoaded("ComputerCraft")) {
			try {
				proxy.registerComputerCraftPeripherals();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}*/
		
		/* Other Proxy init */
		LOGGER.info("Initialize Renderer and Events");
		proxy.registerRenderInformation();
		proxy.registerEvents(event);
		
		/* Networking and Packet initialisation */
		PacketHandler.init();
		
		LOGGER.info("Finished PreInitialization");
	}
	
	@Mod.EventHandler
	public void load(FMLInitializationEvent event) {
		LOGGER.info("Start Initialization");
		
		//proxy.getCape();
		
		/* GUI handler initiation */
		LOGGER.info("Initialize Gui");
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, proxy);
		FMLCommonHandler.instance().bus().register(new CraftingHandler());
		
		/* Ore dictionary */
		OreHandler.registerOres();
		
		/* Recipes */
		LOGGER.info("Initialize Recipes");
		RecipeHandler.initBlockRecipes();
		RecipeHandler.initItemRecipes();
		RecipeHandler.initSmeltingRecipes();
		AssemblyTableRecipes.recipes();
		
		/* Register the liquids */
		LOGGER.info("Initialize Fluids");
		LiquidManager.getInstance().registerLiquids();
		
		/* Liquid FX */
		proxy.registerTextureFX();
		
		/*Trainman Villager*/
		LOGGER.info("Initialize Station Chief Villager");
		/*VillagerRegistry.instance().registerVillagerId(ConfigHandler.TRAINCRAFT_VILLAGER_ID);
		VillagerTraincraftHandler villageHandler = new VillagerTraincraftHandler();
		VillagerRegistry.instance().registerVillageCreationHandler(villageHandler);
		proxy.registerVillagerSkin(ConfigHandler.TRAINCRAFT_VILLAGER_ID, "station_chief.png");
		VillagerRegistry.instance().registerVillageTradeHandler(ConfigHandler.TRAINCRAFT_VILLAGER_ID, villageHandler);*/
		
		
		proxy.registerBookHandler();
		
		
		LOGGER.info("Finished Initialization");
		
		
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent evt) {
		LOGGER.info("Start to PostInitialize");
		LOGGER.info("Register ChunkHandler");
		
		LOGGER.info("Activation Mod Compatibility");
		TrainModCore.ModsLoaded();
		LiquidManager.getLiquidsFromDictionnary();
		if(Loader.isModLoaded("OpenComputers")){
			LOGGER.info("OpenComputers integration successfully activated!");
		}
		LOGGER.info("Finished PostInitialization");
	}
	
	@Mod.EventHandler
	public void serverStop(FMLServerStoppedEvent event) {
		proxy.killAllStreams();
	}

	/*
	@Mod.EventHandler
	public void serverLoad(FMLServerStartingEvent event)
	{
		event.registerServerCommand(new tcAdminPerm());
	}*/


	/*public class tcAdminPerm extends CommandBase {
		public String getCommandName() {return "tc.admin";}
		public String getCommandUsage(ICommandSender CommandSender) {return "/tcadmin";}
		public int getRequiredPermissionLevel() {return 2;}

		public void processCommand(ICommandSender CommandSender, String[] par2ArrayOfStr) {
			getCommandSenderAsPlayer(CommandSender).addChatMessage(
					new ChatComponentText(
							"this command exists as a placeholder to allow admin permissions in TC via plugins and mds such as GroupManager and Forge Essentials"));

		}
	}*/
	
	
}