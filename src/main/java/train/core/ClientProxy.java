package train.core;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.VillagerRegistry;
import javazoom.jl.decoder.JavaLayerUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SoundCategory;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;
import train.blocks.bench.GuiTrainCraftingBlock;
import train.blocks.bench.TileTrainWbench;
import train.blocks.bridge.TileBridgePillar;
import train.blocks.distil.GuiDistil;
import train.blocks.distil.TileEntityDistil;
import train.blocks.generator.GuiGeneratorDiesel;
import train.blocks.generator.TileGeneratorDiesel;
import train.blocks.hearth.GuiOpenHearthFurnace;
import train.blocks.hearth.TileEntityOpenHearthFurnace;
import train.blocks.lantern.GuiLantern;
import train.blocks.lantern.TileLantern;
import train.blocks.signal.TileSignal;
import train.blocks.switchstand.TileSwitchStand;
import train.blocks.waterwheel.TileWaterWheel;
import train.blocks.windmill.TileWindMill;
import train.core.handlers.ClientTickHandler;
import train.core.handlers.TCKeyHandler;
import train.core.helpers.JLayerHook;
import train.entity.gui.*;
import train.render.*;
import train.entity.rollingStock.EntityJukeBoxCart;
import train.entity.zeppelin.EntityZeppelinOneBalloon;
import train.entity.zeppelin.EntityZeppelinTwoBalloons;
import train.library.BlockIDs;
import train.library.GuiIDs;
import train.library.Info;

import java.util.Calendar;

public class ClientProxy extends CommonProxy {

	public static boolean isHoliday() {
		Calendar cal = Calendar.getInstance();
		return(cal.get(Calendar.MONTH) == Calendar.DECEMBER || (cal.get(Calendar.MONTH) == Calendar.JANUARY) && cal.get(Calendar.DATE) < 7);
	}

	@Override
	public void registerEvents(FMLPreInitializationEvent event) {
		super.registerEvents(event);
		registerEvent(new ClientTickHandler());
		registerEvent(new HUDloco());
	}

	@Deprecated //TESR should be handled as noted in TCBlocks.init()
	@Override
	public void registerRenderInformation() {
		FMLCommonHandler.instance().bus().register(new ClientTickHandler());

		RenderingRegistry.registerEntityRenderingHandler(EntityZeppelinTwoBalloons.class, new RenderZeppelins());
		RenderingRegistry.registerEntityRenderingHandler(EntityZeppelinOneBalloon.class, new RenderZeppelins());


		//ClientRegistry.bindTileEntitySpecialRenderer(TileBook.class, new RenderTCBook());
		//MinecraftForgeClient.registerItemRenderer(BlockIDs.book.blockID, new ItemRenderBook());

		ClientRegistry.bindTileEntitySpecialRenderer(TileSignal.class, new RenderSignal());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockIDs.signal.block), new ItemRenderSignal());
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileLantern.class, new RenderLantern());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockIDs.lantern.block), new ItemRenderLantern());

		ClientRegistry.bindTileEntitySpecialRenderer(TileSwitchStand.class, new RenderSwitchStand());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockIDs.switchStand.block), new ItemRenderSwitchStand());
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileWaterWheel.class, new RenderWaterWheel());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockIDs.waterWheel.block), new ItemRenderWaterWheel());
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileWindMill.class, new RenderWindMill());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockIDs.windMill.block), new ItemRenderWindMill());

		ClientRegistry.bindTileEntitySpecialRenderer(TileGeneratorDiesel.class, new RenderGeneratorDiesel());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockIDs.generatorDiesel.block), new ItemRenderGeneratorDiesel());

		ClientRegistry.bindTileEntitySpecialRenderer(TileBridgePillar.class, new RenderBridgePillar());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockIDs.bridgePillar.block), new ItemRenderBridgePillar());
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity te = world.getTileEntity(x, y, z);
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
		case (GuiIDs.DISTIL):
			return te != null && te instanceof TileEntityDistil ? new GuiDistil(player.inventory, (TileEntityDistil) te) : null;
		case (GuiIDs.GENERATOR_DIESEL):
			return te != null && te instanceof TileGeneratorDiesel ? new GuiGeneratorDiesel(player.inventory, (TileGeneratorDiesel) te) : null;
		case (GuiIDs.OPEN_HEARTH_FURNACE):
			return te != null && te instanceof TileEntityOpenHearthFurnace ? new GuiOpenHearthFurnace(player.inventory, (TileEntityOpenHearthFurnace) te) : null;
		case GuiIDs.TRAIN_WORKBENCH:
			return te != null && te instanceof TileTrainWbench ? new GuiTrainCraftingBlock(player.inventory, player.worldObj, (TileTrainWbench) te) : null;
		case (GuiIDs.ZEPPELIN):
			return riddenByEntity != null ? new GuiZepp(riddenByEntity.inventory, entity) : null;
			//Stationary entities while player is not riding.
		/*case (GuiIDs.RECIPE_BOOK2):
			return te != null && te instanceof TileBook ? new GuiRecipeBook2(player, player.getCurrentEquippedItem()) : new GuiRecipeBook2(player, player.getCurrentEquippedItem());*/
		case (GuiIDs.LANTERN):
			return new GuiLantern(player, (TileLantern)te);
		case (GuiIDs.JUKEBOX):
			return entity1 != null ? new GuiJukebox(player,(EntityJukeBoxCart)entity1) : null;
		default:
			return null;
		}
	}

	@Override
	public int addArmor(String armor) {
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}

	@Override
	public void registerVillagerSkin(int villagerId, String textureName) {
		VillagerRegistry.instance().registerVillagerSkin(villagerId, new ResourceLocation(Info.resourceLocation,Info.villagerPrefix + textureName));
	}

	@Override
	public void registerSounds() {
		MinecraftForge.EVENT_BUS.register(new Traincraft_EventSounds());
	}

	@Override
	public Minecraft getMinecraft() {
		return Minecraft.getMinecraft();
	}
	
	@Override
	public EntityPlayer getPlayer() {
		return getMinecraft().thePlayer;
	}

	
	@Override
	public float getJukeboxVolume() {
		return Minecraft.getMinecraft().gameSettings.getSoundLevel(SoundCategory.RECORDS) * Minecraft.getMinecraft().gameSettings.getSoundLevel(SoundCategory.MASTER);
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