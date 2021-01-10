package train;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.VillagerRegistry;
import ebf.tim.TrainsInMotion;
import ebf.tim.gui.GUICraftBook;
import ebf.tim.items.TiMTab;
import ebf.tim.registry.TiMGenericRegistry;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.gen.structure.MapGenStructureIO;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import train.blocks.fluids.LiquidManager;
import train.blocks.TCBlocks;
import train.core.CommonProxy;
import train.core.TrainModCore;
import train.core.handlers.*;
import train.entity.zeppelin.EntityZeppelinOneBalloon;
import train.entity.zeppelin.EntityZeppelinTwoBalloons;
import train.generation.ComponentVillageTrainstation;
import train.items.TCItems;
import train.library.Info;
import train.library.TrainRegistry;
import train.blocks.bench.AssemblyTableRecipes;

import java.io.File;

@Mod(modid = Info.modID, name = Info.modName, version = Info.modVersion)
public class Traincraft {

	/* TrainCraft instance */
	@Instance(Info.modID)
	public static Traincraft instance;

	/* TrainCraft proxy files */
	@SidedProxy(clientSide = "train.core.ClientProxy", serverSide = "train.core.CommonProxy")
	public static CommonProxy proxy;

	/* TrainCraft Logger */
	public static Logger tcLog = LogManager.getLogger(Info.modName);

	/** Network Channel to send packets on */
	public static SimpleNetworkWrapper modChannel;
	public static SimpleNetworkWrapper keyChannel;
	public static SimpleNetworkWrapper rotationChannel;


	public static File configDirectory;

	/* Creative tab for Traincraft */
	public static TiMTab tcTab;

	public ArmorMaterial armor = EnumHelper.addArmorMaterial("Armor", 5, new int[] { 1, 2, 2, 1 }, 25);
	public ArmorMaterial armorCloth = EnumHelper.addArmorMaterial("TCcloth", 5, new int[] {1, 2, 2, 1}, 25);
	public ArmorMaterial armorCompositeSuit = EnumHelper.addArmorMaterial("TCsuit", 70, new int[] {2, 6, 5, 2}, 50);
	public static int trainArmor;
	public static int trainCloth;
	public static int trainCompositeSuit;


	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		tcLog.info("Starting Traincraft " + Info.modVersion + "!");

		GUICraftBook.addPage(Info.modID, "Traincraft\n" +
				"Developers: \n" +
				"Eternal Blue Flame\n" +
				"Canitzp, ComputerButter\n\n" +
				"Project Overseer:\nSpitfire4466\n\n" +
				"Lead artists: Broscolotos,\n" +
				"    Riggs64,\n"
				);

		GUICraftBook.addPage(Info.modID, "Honorable Mentions:\n" +
				"Mr. Brutal,\n" +
				"helldiver, DAYdiecast,\n" +
				"BlockStormTwo, FriscoWolf,\n" +
				"ChandlerBingUA, KiraKun,\n" +
				"NitroxydeX");

		GUICraftBook.addPage(Info.modID, "DISCLAIMER:\n" +
				"All transport into including\n" +
				"but not limited to\n" +
				"weight, year, country, \n" +
				"seating capacity, etc...\n" +
				"may be inaccurate, this\n" +
				"is written to the best of \n" +
				"our knowledge and we\n" +
				"encourage the community to\n" +
				"  correct us, with citation.");

		GUICraftBook.addPage(Info.modID,
				"This release is an alpha,\n" +
						"and some features may be\n" +
						"missing, buggy, or\n" +
						"incomplete.\n" +
						"We appreciate your\n" +
						"patience and reports as\n" +
						"we work on adding back all\n" +
						"of the missing features,\nand many many more.");

				/* Config handler */
		configDirectory= event.getModConfigurationDirectory();
		ConfigHandler.init(new File(event.getModConfigurationDirectory(), Info.modName + ".cfg"));

		/* Register the KeyBinding Handler */
		proxy.registerKeyBindingHandler();

		/* Register Items, Blocks, ... */
		tcLog.info("Initialize Blocks, Items, ...");
		tcTab = new TiMTab("Traincraft", Info.modID, "key.categories.traincraft");
		tcTab.getTabItem().setTextureName(Info.modID+":"+"transports/item.train_br80");
		trainArmor = proxy.addArmor("armor");
		trainCloth = proxy.addArmor("Paintable");
		trainCompositeSuit = proxy.addArmor("CompositeSuit");
		TCBlocks.init();
		TCItems.init();

		if(ConfigHandler.ENABLE_STEAM) {
			//the null last value defines we aren't implementing a custom entity render.
			TiMGenericRegistry.registerTransports(Info.modID, TrainRegistry.listSteam(),null);
		}
		if(ConfigHandler.ENABLE_DIESEL) {
			TiMGenericRegistry.registerTransports(Info.modID, TrainRegistry.listDiesel(),null);
		}
		if(ConfigHandler.ENABLE_ELECTRIC) {
			TiMGenericRegistry.registerTransports(Info.modID, TrainRegistry.listElectric(),null);
		}
		if(ConfigHandler.ENABLE_TENDER) {
			TiMGenericRegistry.registerTransports(Info.modID, TrainRegistry.listTender(),null);
		}

		TiMGenericRegistry.registerTransports(Info.modID, TrainRegistry.listPassenger(),null);
		TiMGenericRegistry.registerTransports(Info.modID, TrainRegistry.listFreight(),null);
		TiMGenericRegistry.registerTransports(Info.modID, TrainRegistry.listWorkCart(),null);
		TiMGenericRegistry.registerTransports(Info.modID, TrainRegistry.listTanker(),null);
		TiMGenericRegistry.registerTransports(Info.modID, TrainRegistry.listSpecial(),null);

		if(ConfigHandler.ENABLE_ZEPPELIN) {
			//TiM doesn't have a generic entity registration yet, so these will likely have to remain as-is for now.
			EntityRegistry.registerModEntity(EntityZeppelinTwoBalloons.class, "zeppelin", TiMGenericRegistry.registryPosition, Traincraft.instance, 512, 3, true);//zepplin
			TiMGenericRegistry.registryPosition++;
			EntityRegistry.registerModEntity(EntityZeppelinOneBalloon.class, "zeppelin big", TiMGenericRegistry.registryPosition, Traincraft.instance, 512, 3, true);//zepplin big
			TiMGenericRegistry.registryPosition++;
		}

		proxy.registerTileEntities();
		proxy.registerSounds();
		proxy.setHook(); // Moved file needed to run JLayer, we need to set a hook in order to retrieve it

		GameRegistry.registerFuelHandler(new FuelHandler());
		AchievementHandler.load();
		AchievementPage.registerAchievementPage(AchievementHandler.tmPage);

		
		MapGenStructureIO.func_143031_a(ComponentVillageTrainstation.class, "Trainstation");

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


		/* Recipes */
		tcLog.info("Initialize Recipes");

		/* Register the liquids */
		tcLog.info("Initialize Fluids");
		LiquidManager.getInstance().registerLiquids();

		/* Liquid FX */
		proxy.registerTextureFX();

		/*Trainman Villager*/
		tcLog.info("Initialize Station Chief Villager");
		VillagerRegistry.instance().registerVillagerId(ConfigHandler.TRAINCRAFT_VILLAGER_ID+1);
		VillagerTraincraftHandler villageHandler = new VillagerTraincraftHandler();
		VillagerRegistry.instance().registerVillageCreationHandler(villageHandler);
		proxy.registerVillagerSkin(ConfigHandler.TRAINCRAFT_VILLAGER_ID+1, "station_chief.png");
		VillagerRegistry.instance().registerVillageTradeHandler(ConfigHandler.TRAINCRAFT_VILLAGER_ID+1, villageHandler);

		
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

	@EventHandler
	public void serverLoad(FMLServerStartingEvent event)
	{
		event.registerServerCommand(new tcAdminPerm());
	}


	public class tcAdminPerm extends CommandBase {
		public String getCommandName() {return "tc.admin";}
		public String getCommandUsage(ICommandSender CommandSender) {return "/tcadmin";}
		public int getRequiredPermissionLevel() {return 2;}

		public void processCommand(ICommandSender CommandSender, String[] par2ArrayOfStr) {
			getCommandSenderAsPlayer(CommandSender).addChatMessage(
					new ChatComponentText(
							"this command exists as a placeholder to allow admin permissions in TC via plugins and mds such as GroupManager and Forge Essentials"));

		}
	}


}
