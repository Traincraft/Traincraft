package train.common.core;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.ForgeChunkManager;
import net.minecraftforge.common.MinecraftForge;
import train.common.Traincraft;
import train.common.api.EntityRollingStock;
import train.common.api.Freight;
import train.common.api.LiquidTank;
import train.common.api.Tender;
import train.common.containers.*;
import train.common.core.handlers.ChunkEvents;
import train.common.core.handlers.WorldEvents;
import train.common.core.util.MP3Player;
import train.common.entity.digger.EntityRotativeDigger;
import train.common.entity.rollingStock.EntityJukeBoxCart;
import train.common.entity.rollingStock.EntityTracksBuilder;
import train.common.entity.zeppelin.AbstractZeppelin;
import train.common.inventory.*;
import train.common.library.GuiIDs;
import train.common.mtc.*;
import train.common.tile.*;
import train.common.tile.tileSwitch.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class CommonProxy implements IGuiHandler {
	public static List<MP3Player> playerList = new ArrayList<MP3Player>();
	public static boolean debug = false;

	public void throwAlphaException() {
		throw new IllegalStateException("You're trying to use a Traincraft alpha-version past its expiry date. Download a release-build at https://minecraft.curseforge.com/projects/traincraft.");
	}

	public void setKeyBinding(String name, int value) {}

	public void registerRenderInformation() {}

	public void registerEvents(FMLPreInitializationEvent event){
		WorldEvents worldEvents = new WorldEvents();
		ChunkEvents chunkEvents = new ChunkEvents();

		registerEvent(worldEvents);
		registerEvent(chunkEvents);
		ForgeChunkManager.setForcedChunkLoadingCallback(Traincraft.instance, chunkEvents);

	}

	public void registerEvent(Object o){
		FMLCommonHandler.instance().bus().register(o);
		MinecraftForge.EVENT_BUS.register(o);
	}

	public void registerTileEntities() {
		GameRegistry.registerTileEntity(TileCrafterTierI.class, "TileCrafterTierI");
		GameRegistry.registerTileEntity(TileCrafterTierII.class, "TileCrafterTierII");
		GameRegistry.registerTileEntity(TileCrafterTierIII.class, "TileCrafterTierIII");
		GameRegistry.registerTileEntity(TileTrainWbench.class, "TileTrainWbench");
		GameRegistry.registerTileEntity(TileEntityDistil.class, "Tile Distil");
		GameRegistry.registerTileEntity(TileEntityOpenHearthFurnace.class, "Tile OpenHearthFurnace");
		GameRegistry.registerTileEntity(TileStopper.class, "TileStopper");
		GameRegistry.registerTileEntity(TileSignal.class, "TileTrainSignal");
		GameRegistry.registerTileEntity(TileLantern.class, "tileLantern");
		GameRegistry.registerTileEntity(TileSwitchStand.class, "tileSwitchStand");
		GameRegistry.registerTileEntity(TileMFPBWigWag.class, "tileMFPBWigWag");
		GameRegistry.registerTileEntity(TileWaterWheel.class, "tileWaterWheel");
		GameRegistry.registerTileEntity(TileWindMill.class, "tileWindMill");
		GameRegistry.registerTileEntity(TileGeneratorDiesel.class, "tileGeneratorDiesel");
		GameRegistry.registerTileEntity(TileBook.class, "tileBook");
		GameRegistry.registerTileEntity(TileTCRailGag.class, "tileTCRailGag");
		GameRegistry.registerTileEntity(TileTCRail.class, "tileTCRail");
		GameRegistry.registerTileEntity(TileBridgePillar.class, "tileTCBridgePillar");

		//switches -hariesh
		GameRegistry.registerTileEntity(TileowoSwitchStand.class, "tileowoswitchstand");
		GameRegistry.registerTileEntity(TilecircleSwitchStand.class, "tilecircleswitchstand");
		GameRegistry.registerTileEntity(TileMILWSwitchStand.class, "tileMILWSwitchStand");
		GameRegistry.registerTileEntity(TileautoSwitchStand.class, "tileautoSwitchStand");
		GameRegistry.registerTileEntity(TileowoYardSwitchStand.class, "tileowoYardSwitchStand");

		GameRegistry.registerTileEntity(TileoverheadWire.class, "tileoverheadwire");
		GameRegistry.registerTileEntity(TileoverheadWireDouble.class, "tileoverheadwiredouble");
		GameRegistry.registerTileEntity(TilesignalSpanish.class, "tilesignalspanish");
		GameRegistry.registerTileEntity(TiletrackConcrete.class, "tiletrackconcrete");
		GameRegistry.registerTileEntity(TilekSignal.class, "tileksignal");
		GameRegistry.registerTileEntity(TileSpeedSign.class, "tilespeedsign");

		if (Loader.isModLoaded("ComputerCraft")) {
			GameRegistry.registerTileEntity(TileInfoTransmitterSpeed.class, "tileInfoTransmitterSpeed");
			GameRegistry.registerTileEntity(TileInfoTransmitterMTC.class, "tileInfoTransmitterMTC");
			GameRegistry.registerTileEntity(TileInfoGrabberMTC.class, "tileInfoReceiverMTC");
			GameRegistry.registerTileEntity(TileInfoGrabberDestination.class, "tileInfoReceiverDestination");
			GameRegistry.registerTileEntity(TileATOTransmitterStopPoint.class, "tileATOTransmitterStopPoint");
			GameRegistry.registerTileEntity(TilePDMInstructionRadio.class, "tilePDMInstructionRadio");
		}

		//GameRegistry.registerTileEntity(TileFortyFootContainer.class, "tileFortyFootContainer");
	}

	public void registerComputerCraftPeripherals() throws ClassNotFoundException {
		Class computerCraft = Class.forName("dan200.computercraft.ComputerCraft");
		try {
			Method computerCraft_registerPeripheralProvider = computerCraft.getMethod("registerPeripheralProvider", new Class[] { Class.forName("dan200.computercraft.api.peripheral.IPeripheralProvider") });

			//Register all CC required blocks
			computerCraft_registerPeripheralProvider.invoke(null, BlockInfoTransmitterSpeed.instance);
			computerCraft_registerPeripheralProvider.invoke(null, BlockInfoGrabberMTC.instance);
			computerCraft_registerPeripheralProvider.invoke(null, BlockInfoTransmitterMTC.instance);
			computerCraft_registerPeripheralProvider.invoke(null, BlockATOTransmitterStopPoint.instance);

		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity te = world.getTileEntity(x, y, z);
		EntityPlayer riddenByEntity = null;
		Entity entity = player.ridingEntity;

		if (player.ridingEntity != null) {
			riddenByEntity = (EntityPlayer) entity.riddenByEntity;
		}

		Entity entity1 = null;
		if (y == -1) {
			entity1 = getEntity(world, x);
		}

		switch (ID) {
		case (GuiIDs.CRAFTER_TIER_I):
			return te != null && te instanceof TileCrafterTierI ? new ContainerTier(player.inventory, (TileCrafterTierI) te) : null;
		case (GuiIDs.CRAFTER_TIER_II):
			return te != null && te instanceof TileCrafterTierII ? new ContainerTier(player.inventory, (TileCrafterTierII) te) : null;
		case (GuiIDs.CRAFTER_TIER_III):
			return te != null && te instanceof TileCrafterTierIII ? new ContainerTier(player.inventory, (TileCrafterTierIII) te) : null;
		case (GuiIDs.DISTIL):
			return te != null && te instanceof TileEntityDistil ? new ContainerDistil(player.inventory, (TileEntityDistil) te) : null;
		case (GuiIDs.GENERATOR_DIESEL):
			return te != null && te instanceof TileGeneratorDiesel ? new ContainerGeneratorDiesel(player.inventory, (TileGeneratorDiesel) te) : null;
		case (GuiIDs.OPEN_HEARTH_FURNACE):
			return te != null && te instanceof TileEntityOpenHearthFurnace ? new ContainerOpenHearthFurnace(player.inventory, (TileEntityOpenHearthFurnace) te) : null;
		case (GuiIDs.TRAIN_WORKBENCH):
			return te != null && te instanceof TileTrainWbench ? new ContainerTrainWorkbench(player.inventory, player.worldObj, (TileTrainWbench) te) : null;
		case (GuiIDs.LOCO):
			return riddenByEntity != null ? new InventoryLoco(riddenByEntity.inventory, (EntityRollingStock) entity) : null;
		case (GuiIDs.FORNEY):
			return riddenByEntity != null ? new InventoryForney(player.inventory, (EntityRollingStock) entity) : null;
		case (GuiIDs.CRAFTING_CART):
			return new ContainerWorkbenchCart(player.inventory, player.worldObj);
		case (GuiIDs.FURNACE_CART):
			return riddenByEntity != null ? new InventoryWorkCart(player.inventory, entity) : null;
		case (GuiIDs.ZEPPELIN):
			return riddenByEntity != null ? new InventoryZepp(player.inventory, (AbstractZeppelin) entity) : null;
		case (GuiIDs.DIGGER):
			return riddenByEntity != null  ? new InventoryRotativeDigger(player.inventory, (EntityRotativeDigger) entity) : null;

			/* Stationary entities while player is not riding. */
		case (GuiIDs.FREIGHT):
			//System.out.println("Freight: " + ID + " | " + entity1.getEntityName() + " | " + x + ":" + y + ":" + z);
			return entity1 != null && entity1 instanceof Freight ? new InventoryFreight(player.inventory, (Freight) entity1) : null;
		case (GuiIDs.JUKEBOX):
			return entity1 != null && entity1 instanceof EntityJukeBoxCart ? new InventoryJukeBoxCart(player.inventory, (EntityJukeBoxCart) entity1) : null;
		case (GuiIDs.TENDER):
			return entity1 != null && entity1 instanceof Tender ? new InventoryTender(player.inventory, (Tender) entity1) : null;
		case (GuiIDs.BUILDER):
			return entity1 != null && entity1 instanceof EntityTracksBuilder ? new InventoryBuilder(player.inventory, (EntityTracksBuilder) entity1) : null;
		case (GuiIDs.LIQUID):
			return entity1 != null && entity1 instanceof LiquidTank ? new InventoryLiquid(player.inventory, (LiquidTank) entity1) : null;
		/*case (GuiIDs.FORTY_FOOT_CONTAINER):
			return new ContainerStorage((TileFortyFootContainer)te, player);*/

			default:
			return null;

		}
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		return null;
	}

	public static Entity getEntity(World world, int entityId) {
		if ((world != null) && (world instanceof WorldServer)) {
			return world.getEntityByID(entityId);
		}
		return null;
	}

	public int addArmor(String armor) {
		return 0;
	}

	public Minecraft getClientInstance() {
		return FMLClientHandler.instance().getClient();
	}

	public GuiScreen getCurrentScreen() {
		return null;
	}

	public void registerTextureFX() {}

	public void registerSounds() {}

	public void registerBookHandler() {}

	public Minecraft getMinecraft() {
		return null;
	}

	public void registerVillagerSkin(int villagerId, String textureName) {}

	public static void killAllStreams() {
		for (MP3Player p : playerList) {
			p.stop();
		}
	}

	public void openadmingui(String data){}

	public static boolean checkJukeboxEntity(World world, int id) {
		return  world.getEntityByID(id)!=null;
	}

	public void doNEICheck(ItemStack stack) {}

	public EntityPlayer getPlayer() {
		return null;
	}

	public float getJukeboxVolume() {
		return 0;
	}

	public void registerKeyBindingHandler() {}

	public void setHook() {}
	
}