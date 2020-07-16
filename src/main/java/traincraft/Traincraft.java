package traincraft;

import java.io.File;
import java.nio.file.Path;
import java.util.function.Predicate;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.IReloadableResourceManager;
import net.minecraft.client.resources.IResourceManager;
import net.minecraftforge.client.resource.IResourceType;
import net.minecraftforge.client.resource.ISelectiveResourceReloadListener;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStoppedEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import train.client.core.handlers.TCKeyHandler;
import train.common.core.CommonProxy;
import train.common.generation.WorldGenWorld;
import traincraft.api.TraincraftAddonLoader;
import traincraft.blocks.distillery.DistilleryRecipe;
import traincraft.blocks.distillery.TileDistillery;
import traincraft.capabilities.CapabilityWorldWind;
import traincraft.entity.TCEntities;
import traincraft.items.TCItems;
import traincraft.liquids.TCLiquids;
import traincraft.network.GuiHandler;
import traincraft.network.PacketTraincraftEntity;

@Mod(modid = Traincraft.MOD_ID, name = Traincraft.MOD_NAME, version = Traincraft.MOD_VERSION)
public class Traincraft {
	
	/* Mod relevant information */
	public static final String MOD_ID = "traincraft";
	public static final String MOD_NAME = "Traincraft";
	public static final String MOD_VERSION = "@VERSION@";
	
	/* TrainCraft instance */
	@Mod.Instance(MOD_ID)
	public static Traincraft INSTANCE;
	
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
	
	public static final SimpleNetworkWrapper TC_NETWORK = NetworkRegistry.INSTANCE.newSimpleChannel(MOD_ID);
	
	public static File configDirectory;
	
	public static WorldGenWorld worldGen;
	
	public File gameDirectory;
	
	static {
		FluidRegistry.enableUniversalBucket();
	}
	
	public Traincraft() {
	
	}
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		this.gameDirectory = event.getModConfigurationDirectory().getParentFile();
		LOGGER.info("Starting Traincraft " + MOD_VERSION + "!");
		/* Config handler */
		configDirectory = event.getModConfigurationDirectory();
		//Config.initialize(event.getSuggestedConfigurationFile());
		
		/* Register Items, Blocks, ... */
		LOGGER.info("Initialize Blocks, Items, ...");
		TCEntities.registerEntities(event);
		TCLiquids.registerLiquids(event);
		
		/* Register Keys */
		LOGGER.info("Initialize Key bindings");
		TCKeyHandler.register();
		
		//EntityHandler.init();
		//proxy.registerTileEntities();
		//proxy.registerSounds();
		proxy.setHook(); // Moved file needed to run JLayer, we need to set a hook in order to retrieve it
		
		// todo fuel handler GameRegistry.registerFuelHandler(new FuelHandler());
		//AchievementHandler.load();
		//AchievementPage.registerAchievementPage(AchievementHandler.tmPage);
		GameRegistry.registerWorldGenerator(worldGen = new WorldGenWorld(), 5);
		
		//MapGenStructureIO.registerStructureComponent(ComponentVillageTrainstation.class, "Trainstation");

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
		//PacketHandler.init();
		
		LOGGER.info("Finished PreInitialization");
	}
	
	@Mod.EventHandler
	public void load(FMLInitializationEvent event) {
		LOGGER.info("Start Initialization");
		
		LOGGER.info("Initializing Network Packets");
		NetworkRegistry.INSTANCE.registerGuiHandler(Traincraft.INSTANCE, new GuiHandler());
		TC_NETWORK.registerMessage(PacketTraincraftEntity.class, PacketTraincraftEntity.class, 0, Side.SERVER);
		TC_NETWORK.registerMessage(PacketTraincraftEntity.class, PacketTraincraftEntity.class, 1, Side.CLIENT);
		
		if(event.getSide() == Side.CLIENT){
			LOGGER.info("Register Keys");
			
		}
		
		/* Ore dictionary */
		//OreHandler.registerOres();
		
		/* Recipes */
		LOGGER.info("Initialize Recipes");
		//RecipeHandler.initBlockRecipes();
		//RecipeHandler.initItemRecipes();
		//RecipeHandler.initSmeltingRecipes();
		//AssemblyTableRecipes.recipes();
		
		/* Register the liquids */
		LOGGER.info("Initialize Fluids");
		//LiquidManager.getInstance().registerLiquids();
		
		/*Trainman Villager*/
		LOGGER.info("Initialize Station Chief Villager");
		/*VillagerRegistry.instance().registerVillagerId(ConfigHandler.TRAINCRAFT_VILLAGER_ID);
		VillagerTraincraftHandler villageHandler = new VillagerTraincraftHandler();
		VillagerRegistry.instance().registerVillageCreationHandler(villageHandler);
		proxy.registerVillagerSkin(ConfigHandler.TRAINCRAFT_VILLAGER_ID, "station_chief.png");
		VillagerRegistry.instance().registerVillageTradeHandler(ConfigHandler.TRAINCRAFT_VILLAGER_ID, villageHandler);*/
		
		File addonRoot = new File(this.gameDirectory, "traincraft");
		LOGGER.info("Loading internal files");
		TraincraftAddonLoader.loadInternals(event.getSide(), MOD_ID, addonRoot);
		LOGGER.info("Loading external addons");
		TraincraftAddonLoader.loadFolders(event.getSide(), addonRoot);
		
		LOGGER.info("Finished Initialization");
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent evt) {
		LOGGER.info("Start to PostInitialize");
		
		LOGGER.info("Initializing Capabilities");
		CapabilityWorldWind.register();
		
		LOGGER.info("Register ChunkHandler");
		
		LOGGER.info("Activation Mod Compatibility");
		
		if(evt.getSide().isClient()){
			LOGGER.info("Register Reload Listener");
			((IReloadableResourceManager) Minecraft.getMinecraft().getResourceManager()).registerReloadListener(this::onResourceReload);
		}
		
		LOGGER.info("Finished PostInitialization");
	}
	
	@Mod.EventHandler
	public void serverStop(FMLServerStoppedEvent event) {
		CommonProxy.killAllStreams();
	}

	public void onResourceReload(IResourceManager resourceManager){
		// add distillery recipes to new list
		TileDistillery.DISTIL_RECIPES.clear();
		ForgeRegistries.RECIPES.forEach(recipe -> {
			if(recipe instanceof DistilleryRecipe){
				TileDistillery.DISTIL_RECIPES.add((DistilleryRecipe) recipe);
			}
		});
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