package train.client.core;

import javazoom.jl.decoder.JavaLayerUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Optional;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import train.client.core.handlers.ClientTickHandler;
import train.client.core.handlers.TCKeyHandler;
import train.client.core.helpers.JLayerHook;
import train.client.gui.*;
import train.client.render.*;
import train.common.adminbook.GUIAdminBook;
import train.common.api.EntityBogie;
import train.common.api.EntityRollingStock;
import train.common.core.CommonProxy;
import train.common.core.Traincraft_EventSounds;
import train.common.entity.BaseTrainEntity;
import train.common.entity.digger.EntityRotativeDigger;
import train.common.entity.digger.EntityRotativeWheel;
import train.common.entity.zeppelin.EntityZeppelinOneBalloon;
import train.common.entity.zeppelin.EntityZeppelinTwoBalloons;
import train.common.tile.*;

import java.util.Calendar;

public class ClientProxy extends CommonProxy {

	public static boolean isHoliday() {
		Calendar cal = Calendar.getInstance();
		return(cal.get(Calendar.MONTH) == Calendar.DECEMBER || (cal.get(Calendar.MONTH) == Calendar.JANUARY) && cal.get(Calendar.DATE) < 7);
	}

	@Override
	public void registerEvents(FMLPreInitializationEvent event) {
		super.registerEvents(event);
		ClientTickHandler tickHandler = new ClientTickHandler();
		HUDloco huDloco = new HUDloco();
		/*if (Loader.isModLoaded("ComputerCraft") || Loader.isModLoaded("OpenComputers")){
			HUDMTC hudMTC = new HUDMTC();
			registerEvent(hudMTC);
		}*/

		registerEvent(tickHandler);
		registerEvent(huDloco);
	}

	@Override
	public void registerRenderInformation() {
		FMLCommonHandler.instance().bus().register(new ClientTickHandler());

		RenderingRegistry.registerEntityRenderingHandler(EntityRollingStock.class, new RenderRollingStock());
		RenderingRegistry.registerEntityRenderingHandler(EntityZeppelinTwoBalloons.class, new RenderZeppelins());
		RenderingRegistry.registerEntityRenderingHandler(EntityZeppelinOneBalloon.class, new RenderZeppelins());
		RenderingRegistry.registerEntityRenderingHandler(EntityRotativeDigger.class, new RenderRotativeDigger());
		RenderingRegistry.registerEntityRenderingHandler(EntityRotativeWheel.class, new RenderRotativeWheel());
		//bogies
		RenderingRegistry.registerEntityRenderingHandler(EntityBogie.class, new RenderBogie());


		ClientRegistry.bindTileEntitySpecialRenderer(TileStopper.class, new RenderStopper());
		//MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockIDs.stopper.block), new ItemRenderStopper());
		
		//ClientRegistry.bindTileEntitySpecialRenderer(TileBook.class, new RenderTCBook());
		//MinecraftForgeClient.registerItemRenderer(BlockIDs.book.blockID, new ItemRenderBook());

		ClientRegistry.bindTileEntitySpecialRenderer(TileSignal.class, new RenderSignal());
		//MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockIDs.signal.block), new ItemRenderSignal());
		
		//ClientRegistry.bindTileEntitySpecialRenderer(TileLantern.class, new RenderLantern());
		//MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockIDs.lantern.block), new ItemRenderLantern());

		ClientRegistry.bindTileEntitySpecialRenderer(TileSwitchStand.class, new RenderSwitchStand());
		//MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockIDs.switchStand.block), new ItemRenderSwitchStand());
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileWaterWheel.class, new RenderWaterWheel());
		//MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockIDs.waterWheel.block), new ItemRenderWaterWheel());
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileWindMill.class, new RenderWindMill());
		//MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockIDs.windMill.block), new ItemRenderWindMill());

		ClientRegistry.bindTileEntitySpecialRenderer(TileGeneratorDiesel.class, new RenderGeneratorDiesel());
		//MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockIDs.generatorDiesel.block), new ItemRenderGeneratorDiesel());
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileTCRail.class, new RenderTCRail());
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileBridgePillar.class, new RenderBridgePillar());
		//MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockIDs.bridgePillar.block), new ItemRenderBridgePillar());
	}

	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
		// id determines if it is a tile or a entity. 1 => TileBase; 2 => Entity (z = world entity id)
		switch(id){
			case 1: {
				TileEntity tile = world.getTileEntity(new BlockPos(x, y, z));
				if(tile instanceof BaseTile){
					return ((BaseTile) tile).openGui(player);
				}
				break;
			}
			case 2: {
				Entity entity = world.getEntityByID(z);
				if(entity instanceof BaseTrainEntity){
					return ((BaseTrainEntity) entity).openGui(player);
				}
				break;
			}
		}
		return null;
		
		/*TileEntity te = world.getTileEntity(x, y, z);
		EntityPlayer riddenByEntity = null;
		Entity entity = player.ridingEntity;
		if (player.ridingEntity != null) {
			riddenByEntity = (EntityPlayer) entity.riddenByEntity;
		}

		Entity entity1 = null;
		if (y == -1) {
			for (Object ent : world.loadedEntityList) {
				if (((Entity) ent).getEntityId() == x)
					entity1 = (Entity) ent;
			}
		}
		switch (ID) {
		case (GuiIDs.CRAFTER_TIER_I):
			return te instanceof TileCrafterTierI ? new GuiCrafterTier(player.inventory, (TileCrafterTierI) te) : null;
		case (GuiIDs.CRAFTER_TIER_II):
			return te instanceof TileCrafterTierII ? new GuiCrafterTier(player.inventory, (TileCrafterTierII) te) : null;
		case (GuiIDs.CRAFTER_TIER_III):
			return te instanceof TileCrafterTierIII ? new GuiCrafterTier(player.inventory, (TileCrafterTierIII) te) : null;
		case (GuiIDs.DISTIL):
			return te instanceof TileEntityDistil ? new GuiDistil(player.inventory, (TileEntityDistil) te) : null;
		case (GuiIDs.GENERATOR_DIESEL):
			return te instanceof TileGeneratorDiesel ? new GuiGeneratorDiesel(player.inventory, (TileGeneratorDiesel) te) : null;
		case (GuiIDs.OPEN_HEARTH_FURNACE):
			return te instanceof TileEntityOpenHearthFurnace ? new GuiOpenHearthFurnace(player.inventory, (TileEntityOpenHearthFurnace) te) : null;
		case GuiIDs.TRAIN_WORKBENCH:
			return te instanceof TileTrainWbench ? new GuiTrainCraftingBlock(player.inventory, player.getEntityWorld(), (TileTrainWbench) te) : null;
		case (GuiIDs.LOCO):
			return riddenByEntity != null ? new GuiLoco2(riddenByEntity.inventory, entity) : null;
		case (GuiIDs.FORNEY):
			return riddenByEntity != null ? new GuiForney(riddenByEntity.inventory, entity) : null;
		case (GuiIDs.CRAFTING_CART):
			return riddenByEntity != null ? new GuiCraftingCart(riddenByEntity.inventory, world) : null;
		case (GuiIDs.FURNACE_CART):
			return riddenByEntity != null ? new GuiFurnaceCart(riddenByEntity.inventory, entity) : null;
		case (GuiIDs.ZEPPELIN):
			return riddenByEntity != null ? new GuiZepp(riddenByEntity.inventory, entity) : null;
		case (GuiIDs.DIGGER):
			return riddenByEntity != null ? new GuiBuilder(player, riddenByEntity.inventory, entity) : null;
		//case (GuiIDs.MTC_INFO):
			//return riddenByEntity != null && Loader.isModLoaded("ComputerCraft")  || Loader.isModLoaded("OpenComputers") ? new GuiMTCInfo(player) : null;

			//Stationary entities while player is not riding. 
		case (GuiIDs.FREIGHT):
			return entity1 != null ? new GuiFreight(player,player.inventory, entity1) : null;
		case (GuiIDs.TENDER):
			return entity1 != null ? new GuiTender(player,player.inventory, entity1) : null;
		case (GuiIDs.BUILDER):
			return entity1 != null ? new GuiBuilder(player,player.inventory, entity1) : null;
		case (GuiIDs.LIQUID):
			return entity1 != null ? new GuiLiquid(player,player.inventory, entity1) : null;
		case (GuiIDs.RECIPE_BOOK):
			return new GuiRecipeBook(player, player.getCurrentEquippedItem());
		//case (GuiIDs.RECIPE_BOOK2):
			//return te != null && te instanceof TileBook ? new GuiRecipeBook2(player, player.getCurrentEquippedItem()) : new GuiRecipeBook2(player, player.getCurrentEquippedItem());
		//case (GuiIDs.LANTERN):
			//return new GuiLantern(player, (TileLantern)te);
		case (GuiIDs.JUKEBOX):
			return entity1 != null ? new GuiJukebox(player,(EntityJukeBoxCart)entity1) : null;
		default:
			return null;
		}*/
	}

	@Override
	public int addArmor(String armor) {
		return 0;//RenderingRegistry.addNewArmourRendererPrefix(armor);
	}

	@Override
	public GuiScreen getCurrentScreen() {
		return Minecraft.getMinecraft().currentScreen;
	}
	@Override
	public void registerVillagerSkin(int villagerId, String textureName) {
		//VillagerRegistry.instance().registerVillagerSkin(villagerId, new ResourceLocation(Info.resourceLocation,Info.villagerPrefix + textureName));
	}

	@Override
	public void registerSounds() {
		MinecraftForge.EVENT_BUS.register(new Traincraft_EventSounds());
	}
	
	@Override
	public void registerBookHandler() {
		RecipeBookHandler recipeBookHandler = new RecipeBookHandler();
	}

	@Override
	public Minecraft getMinecraft() {
		return Minecraft.getMinecraft();
	}
	
	@Override
	public EntityPlayer getPlayer() {
		return getMinecraft().player;
	}

	@Optional.Method(modid = "NotEnoughItems")
	@Override
	public void doNEICheck(ItemStack stack) {
		if (Minecraft.getMinecraft().player != null) {
			/*if(Loader.isModLoaded("Not Enough Items")) {
				try {
					Class neiApi = Class.forName("codechicken.nei.api.API");
					Method hideItem = neiApi.getDeclaredMethod("hideItem", stack.getClass());
					hideItem.invoke(null, stack);
				} catch (ClassNotFoundException e) {
					Traincraft.LOGGER.log(Level.WARN, "Chicken core didn't have required class: Wrong version of the library or something is horribly wrong", e);
				} catch (NoSuchMethodException e) {
					Traincraft.LOGGER.log(Level.WARN, "Chicken core didn't have required method: Wrong version of the library or something is horribly wrong", e);
				} catch (SecurityException e) {
					Traincraft.LOGGER.log(Level.FATAL, "Something is horribly wrong", e);
				} catch (IllegalAccessException e) {
					Traincraft.LOGGER.log(Level.FATAL, "Something is horribly wrong", e);
				} catch (IllegalArgumentException e) {
					Traincraft.LOGGER.log(Level.WARN, "Chicken core had the method but it's signature was wrong: Wrong version of the library or something is horribly wrong", e);
				} catch (InvocationTargetException e) {
					Traincraft.LOGGER.log(Level.WARN, "The method we called from Chicken core threw an exception", e);
				}
			}*/
        }
	}
	
	@Override
	public float getJukeboxVolume() {
		return Minecraft.getMinecraft().gameSettings.getSoundLevel(SoundCategory.RECORDS) * Minecraft.getMinecraft().gameSettings.getSoundLevel(SoundCategory.MASTER);
	}

	@Override
	public void openadmingui(String data){
		Minecraft.getMinecraft().displayGuiScreen(new GUIAdminBook(data));
	}

	@Override
	public void registerKeyBindingHandler() {
		FMLCommonHandler.instance().bus().register(new TCKeyHandler());
	}
	
	@Override
	public void setHook() {
		JavaLayerUtils.setHook(new JLayerHook(Minecraft.getMinecraft()));
	}
}