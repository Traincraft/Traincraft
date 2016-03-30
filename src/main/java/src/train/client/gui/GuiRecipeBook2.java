package src.train.client.gui;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

import org.lwjgl.opengl.GL11;

import src.train.client.core.handlers.RecipeBookHandler;
import src.train.client.render.ItemRenderBook;
import src.train.client.render.models.blocks.ModelTCBook;
import src.train.common.core.handlers.PacketHandler;
import src.train.common.core.managers.TierRecipe;
import src.train.common.core.managers.TierRecipeManager;
import src.train.common.inventory.TrainCraftingManager;
import src.train.common.items.ItemRollingStock;
import src.train.common.library.BlockIDs;
import src.train.common.library.Info;
import src.train.common.library.ItemIDs;
import src.train.common.recipes.ShapedTrainRecipes;
import src.train.common.recipes.ShapelessTrainRecipe;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiRecipeBook2 extends GuiScreen {
	/** The player editing the book */
	private final EntityPlayer editingPlayer;
	private final ItemStack itemstackBook;

	/** Update ticks since the gui was opened */
	private int bookImageWidth = 206;
	private int bookImageHeight = 200;
	public static int bookTotalPages = 100;
	private int currPage;
	private int currRecipe;
	public ArrayList<String> leftPage = new ArrayList<String>();
	public ArrayList<String> leftPageImage = new ArrayList<String>();
	public ArrayList<ArrayList> leftPageItemStacks = new ArrayList<ArrayList>();
	public ArrayList<String> rightPage = new ArrayList<String>();
	public ArrayList<String> rightPageImage = new ArrayList<String>();
	public ArrayList<ArrayList> rightPageItemStacks = new ArrayList<ArrayList>();
	private List recipeListWB = RecipeBookHandler.workbenchListCleaner(TrainCraftingManager.getInstance().getRecipeList());
	private List<TierRecipe> recipeList = RecipeBookHandler.assemblyListCleaner(TierRecipeManager.getInstance().getRecipeList());
	private FontRenderer ftRender;

	private GuiButtonNextPage buttonRead;
	private GuiButtonNextPage buttonNextPage;
	private GuiButtonNextPage buttonPreviousPage;
	private GuiButtonNextPage buttonBack;
	private RenderItem renderItem = new RenderItem();

	public GuiRecipeBook2(EntityPlayer par1EntityPlayer, ItemStack par2ItemStack) {
		this.editingPlayer = par1EntityPlayer;
		this.itemstackBook = par2ItemStack;
		NBTTagCompound var3 = itemstackBook.getTagCompound();
		this.currPage = var3.getInteger("currPage");
		this.currRecipe = var3.getInteger("currRecipe");
		
		this.ftRender =FMLClientHandler.instance().getClient().fontRenderer;

		addPage("", "", "left", null);
		addPage("", "", "right", null);
		addPage("Welcome to the Traincraft guide! \n \n" + "This book contains everything you need to know about Traincraft.\n" + "" + "Authors: Spitfire4466, Mrbrutal\n" + "Bukkit port: DV8FromTheWorld.\n" + "\n" + "Modelers: DAYdiecast, helldiver, BlockStormTwo, ChandlerBingUA.\n" + "Thanks to CovertJaguar for his help and a great API.\n", "", "left", new ArrayList<StackToDraw>() {
			{
				add(new StackToDraw(new ItemStack(ItemIDs.minecartLocoBR80_DB.item), 20, 16));
				add(new StackToDraw(new ItemStack(BlockIDs.trainWorkbench.block), 170, 16));
				add(new StackToDraw(new ItemStack(ItemIDs.minecartCabooseWork.item), 60, 175));
				add(new StackToDraw(new ItemStack(ItemIDs.minecartTankWagon_DB.item), 80, 175));
				add(new StackToDraw(new ItemStack(ItemIDs.minecartFlatCartRail_DB.item), 100, 175));
				add(new StackToDraw(new ItemStack(ItemIDs.minecartFreightWagon_DB.item), 120, 175));
				add(new StackToDraw(new ItemStack(ItemIDs.minecartPassengerBlue.item), 140, 175));
				add(new StackToDraw(new ItemStack(ItemIDs.minecartV60_DB.item), 160, 175));
			}
		});
		addPage("World generation:\n\n By default, petrol and oil sands will be generated in the world. If you don't want them, open Traincraft.cfg and change the line ENABLE_ORE_SPAWN from true to false." + "Only the new ores will generate, the old ones can be transformed into the new ones in a crafting table.", "", "right", new ArrayList<StackToDraw>() {
			{ 
				add(new StackToDraw(new ItemStack(BlockIDs.oreTC.block, 1, 1), 60, 150));
				add(new StackToDraw(new ItemStack(BlockIDs.oreTC.block, 1, 2), 120, 150));
			}
		});

		addPage("Keys:\n" + "To interact with the trains (e.g. enter/leave, display the inventory) click above the shadow the train is casting on the ground.\n" + "Inside the locomotive press R to open up the GUI: This is where you can put fuel, water, additional cargo, set brakes, etc.\n", "", "left", new ArrayList<StackToDraw>() {
			{
				add(new StackToDraw(new ItemStack(Item.coal), 60, 160));
				add(new StackToDraw(new ItemStack(Item.bucketWater), 120, 160));
			}
		});

		addPage("Use the W and S keys to move the locomotive forwards or backwards, respectively.\n" + "Press H in the locomotive to activate the whistle.\n" + "In the Work Carts, press R to open up the Crafting Table and F for the Furnace.\n" + "", "", "right", new ArrayList<StackToDraw>() {
			{
				add(new StackToDraw(new ItemStack(ItemIDs.minecartLocoBR80_DB.item), 20, 16));
				add(new StackToDraw(new ItemStack(ItemIDs.minecartGP7Red.item), 170, 16));
				add(new StackToDraw(new ItemStack(ItemIDs.minecartLocoCherepanov.item), 40, 145));
				add(new StackToDraw(new ItemStack(ItemIDs.minecartWork.item), 60, 145));
				add(new StackToDraw(new ItemStack(ItemIDs.minecartCabooseWork.item), 80, 145));
				add(new StackToDraw(new ItemStack(ItemIDs.minecartLocoForneyRed.item), 100, 145));
				add(new StackToDraw(new ItemStack(ItemIDs.minecartShunter.item), 120, 145));
				add(new StackToDraw(new ItemStack(ItemIDs.minecartLocoBR01_DB.item), 140, 145));
			}
		});
		addPage("Zeppelin:\n" + "Right click on the Zeppelin to enter/leave it. \n" + "Inside, press R to open its GUI. \n" + "Use the WASD keys to move the zeppelin around. \n" + "Press once Y to ascend or X to descend, To lock altitude, press C. \n" + "", "", "left", new ArrayList<StackToDraw>() {
			{
				add(new StackToDraw(new ItemStack(ItemIDs.airship.item), 20, 16));
				add(new StackToDraw(new ItemStack(ItemIDs.balloon.item), 170, 16));
				add(new StackToDraw(new ItemStack(ItemIDs.propeller.item), 40, 135));
				add(new StackToDraw(new ItemStack(ItemIDs.steamengine.item), 60, 135));
				add(new StackToDraw(new ItemStack(Item.boat), 120, 135));
				add(new StackToDraw(new ItemStack(Item.stick), 140, 135));

			}
		});
		addPage("Fuel:\n" + "Steam locomotives need coal and water.\n" + "Tenders can only hold coal and water. Attach them to a steam locomotive, they will provide fuel and water for the loco.\n" + "Diesel locos need diesel canisters (from distillation tower) or fuel from BC and Forestry.\n", "", "right", new ArrayList<StackToDraw>() {
			{
				add(new StackToDraw(new ItemStack(ItemIDs.minecartTender.item), 20, 16));
				add(new StackToDraw(new ItemStack(ItemIDs.minecartLocomogulBlue.item), 170, 16));
				add(new StackToDraw(new ItemStack(Item.coal), 40, 155));
				add(new StackToDraw(new ItemStack(Item.bucketWater), 60, 155));
				add(new StackToDraw(new ItemStack(Block.planks), 80, 155));
				add(new StackToDraw(new ItemStack(Item.blazeRod), 100, 155));
				add(new StackToDraw(new ItemStack(ItemIDs.diesel.item), 120, 155));
				add(new StackToDraw(new ItemStack(ItemIDs.refinedFuel.item), 140, 155));
			}
		});

		addPage("Electric locomotives need redstone or Re-Batteries, the can also be powered by Electric tracks (requires Universal Electricity).\n" + "\n" + "Heat:\n" + "Heat level is indicated by the heat bar in the HUD.\n" + "Heat level will go to a normal state when the train is fueled but don't forget to put water in steam locomotive or it will overheat very fast.\n", "", "left", new ArrayList<StackToDraw>() {
			{
				add(new StackToDraw(new ItemStack(ItemIDs.minecartBR_E69.item), 20, 16));
				add(new StackToDraw(new ItemStack(Item.redstone), 170, 16));
			}
		});

		addPage("Heat level will go down to cold when there is no more fuel:\n" + "Wait until the locomotive has heated up before trying to move.\n" + "Be carefull, overheating will cause explosions...\n" +
				"\n" +
				"Routing:\n" +
				"TC locomotives can be routed using Railcraft routing track. Destination will show in the GUI. There is no space for tickets in the GUI. Not 'Color=' compatible. Sneak+Crowbar to reset 'Dest:'", "", "right", new ArrayList<StackToDraw>() {
			{
				add(new StackToDraw(new ItemStack(ItemIDs.firebox.item), 20, 16));
				add(new StackToDraw(new ItemStack(Block.tnt), 170, 16));
			}
		});
		addPage("Minecraft Horse Power - Mhp:\n\n" + "Locomotives have different pulling abilities represented by their 'power' in Mhp.\n" + "Each cart has a mass in tons which will affect the locomotive depending on its power.\n" + "Mass pulled affects the maximum speed, the brake rate and accelerate rate, as well as fuel consumption.\n" + "", "", "left", new ArrayList<StackToDraw>() {
			{
				add(new StackToDraw(new ItemStack(ItemIDs.stake.item), 20, 16));
				add(new StackToDraw(new ItemStack(ItemIDs.minecartLocoBR01_DB.item), 40, 165));
				add(new StackToDraw(new ItemStack(ItemIDs.stake.item), 60, 165));
				add(new StackToDraw(new ItemStack(ItemIDs.minecartFreightCart2.item), 80, 165));
				add(new StackToDraw(new ItemStack(ItemIDs.stake.item), 100, 165));
				add(new StackToDraw(new ItemStack(ItemIDs.minecartFreightClosed.item), 120, 165));
				add(new StackToDraw(new ItemStack(ItemIDs.stake.item), 140, 165));
				add(new StackToDraw(new ItemStack(ItemIDs.minecartWatertransp.item), 160, 165));
			}
		});
		addPage("Derailment:\n\n" + "Do not go too fast on turns or your locomotives will derail!\n\n" + "It is recommended to slow down under 90km/h before turning or you will find yourself crashing off tracks.", "", "right", new ArrayList<StackToDraw>() {
			{
				add(new StackToDraw(new ItemStack(Item.skull, 1, 1), 20, 16));
			}
		});

		addPage("Pulling:\n" + "Right click both carts with a stake in your hand, it will say 'Attaching mode on', then make them collide and it will say 'Attached'.\n" + "Locomotives have pulling capabilities, don't make too long trains with weak locomotives. Stats of the locomotive will be affected." + " (they can be seen on the top left corner when you open the locomotive's inventory).\n", "", "left", new ArrayList<StackToDraw>() {
			{
				add(new StackToDraw(new ItemStack(ItemIDs.stake.item), 20, 16));
				add(new StackToDraw(new ItemStack(ItemIDs.minecartCaboose.item), 40, 165));
				add(new StackToDraw(new ItemStack(ItemIDs.stake.item), 60, 165));
				add(new StackToDraw(new ItemStack(ItemIDs.minecartBoxCartUS.item), 80, 165));
				add(new StackToDraw(new ItemStack(ItemIDs.stake.item), 100, 165));
				add(new StackToDraw(new ItemStack(ItemIDs.minecartFlatCartLogs_DB.item), 120, 165));
				add(new StackToDraw(new ItemStack(ItemIDs.stake.item), 140, 165));
				add(new StackToDraw(new ItemStack(ItemIDs.minecartCD742.item), 160, 165));
			}
		});
		addPage("Chunk Loading:\n\n" + "Each rolling stock can load one chunk around itself.\n" + "To start chunk loading, right click with chunk loader activator on the rolling stock.\n" + "To stop chunk loading, right click again.\n", "", "right", new ArrayList<StackToDraw>() {
			{
				add(new StackToDraw(new ItemStack(ItemIDs.chunkLoaderActivator.item), 20, 16));
				add(new StackToDraw(new ItemStack(Item.enderPearl), 170, 16));
			}
		});
		addPage("Colors:\n\n" + "Some rolling stock has several textures and can be painted with dyes.\n" + "The rolling stock that can be painted will show the possible colors in the chat once placed in the world.\n" + "To paint, simply right click with the correct dye.\n" +
				"Lantern color is randomly picked, but you can set the color manually with a wrench. Enter the color code from http://www.colorpicker.com/", "", "left", new ArrayList<StackToDraw>() {
			{
				add(new StackToDraw(new ItemStack(Item.dyePowder, 1, 1), 20, 16));
				add(new StackToDraw(new ItemStack(Item.dyePowder, 1, 11), 170, 16));
			}
		});
		addPage("Stock car:\n\n" + "The stock car is the only rolling stock that can be ridden by any animals and mobs.\n" + "To fill the stock car, either collide the animal with the car or use the animal/mob boarding tracks (Railcraft required).\n" + "To empty the car, use the disembark track (Railcraft required).\n", "", "right", new ArrayList<StackToDraw>() {
			{
				add(new StackToDraw(new ItemStack(ItemIDs.minecartStockCar.item), 20, 16));
				add(new StackToDraw(new ItemStack(Item.skull, 1, 4), 170, 16));
			}
		});
		addPage("A word about tracks I:\n" + "Copper tracks will slows trains down.\n" + "Steel tracks allow trains to go faster.\n" + "Speed controller track allows to change the locomotive's max speed (hit with crowbar).\n" + "The energy track can be powered by redstone and will power electric trains, redstone power will be transmitted two tracks away.\n", "", "left", new ArrayList<StackToDraw>() {
			{
				add(new StackToDraw(new ItemStack(Block.rail), 17, 16));
				add(new StackToDraw(new ItemStack(Block.rail), 17, 32));
				add(new StackToDraw(new ItemStack(Block.rail), 17, 48));
				add(new StackToDraw(new ItemStack(Block.rail), 17, 64));
				add(new StackToDraw(new ItemStack(Block.rail), 17, 80));
				add(new StackToDraw(new ItemStack(Block.rail), 17, 96));
				add(new StackToDraw(new ItemStack(Block.rail), 17, 112));
				add(new StackToDraw(new ItemStack(Block.rail), 17, 128));
				add(new StackToDraw(new ItemStack(Block.rail), 17, 144));
				add(new StackToDraw(new ItemStack(Block.rail), 17, 160));
				add(new StackToDraw(new ItemStack(Block.railPowered), 170, 16));
			}
		});
		addPage("A word about tracks II:\n" +
				"To check the current charge click the track with a crowbar.\n" +
				"An electric track connected to a redstone power source gets 1 energy unit every two ticks.\n" +
				"Locomotive holding track will only hold TC locomotives. No boost is given, the previous speed is restored once released.\n" +
				"All tracks require Railcraft to be installed.","","right",new ArrayList<StackToDraw>() {
					{
						add(new StackToDraw(new ItemStack(Block.railActivator), 17, 16));
						add(new StackToDraw(new ItemStack(Block.railPowered), 170, 16));
					}
				});
		addPage("Steel rails parts and copper rails parts are crafted inside RC Rolling Machine, tracks are assembled in vanilla workbench.\n" +
				"TC boarding/disembarking track are designed to work only on the Stock Car. Animal boarding will take any nearby animal and put it inside a passing Stock Car. Mob boarding will affect any mob.\n" +
				"Disembark will eject any mob inside the Stock Car.","","left",new ArrayList<StackToDraw>() {
			{
				add(new StackToDraw(new ItemStack(Block.railDetector), 17, 16));
				add(new StackToDraw(new ItemStack(Block.railPowered), 170, 16));
			}
		});
		addPage("Builder I:\n\n" + "The tracks builder has a very special inventory, in order to start it you must provide:\n" + "Ballast in the slot under it (planks, gravel, stone, ...).\n" + "Coal in the fuel slot, Tracks in the slot under the fuel slot." + "The slot on the right of the builder will activate tunnel function when provided (not all blocks are accepted).\n", "", "right", new ArrayList<StackToDraw>() {
			{
				add(new StackToDraw(new ItemStack(ItemIDs.minecartBuilder.item), 20, 16));
				add(new StackToDraw(new ItemStack(ItemIDs.minecartBuilder.item), 60, 165));
				add(new StackToDraw(new ItemStack(ItemIDs.stake.item), 80, 165));
				add(new StackToDraw(new ItemStack(ItemIDs.minecartFreightClosed.item), 100, 165));
			}
		});
		addPage("Builder II:\n\n" + "The slots on top of the builder are roof slots, the builder will build a roof when provided (not all blocks are accepted)." + "If you attach a freight cart to the builder, it will dump things in it.\n\n", "", "left", new ArrayList<StackToDraw>() {
			{
				add(new StackToDraw(new ItemStack(ItemIDs.minecartBuilder.item), 20, 16));
				add(new StackToDraw(new ItemStack(ItemIDs.minecartBuilder.item), 60, 125));
				add(new StackToDraw(new ItemStack(ItemIDs.stake.item), 80, 125));
				add(new StackToDraw(new ItemStack(ItemIDs.minecartFreightClosed.item), 100, 125));
			}
		});
		addPage("Limitations:\n\n" + "VERY IMPORTANT:\n" + "Long trains imply limitations: Do not try to make sharp 180 turns, leave 6 spaces between each 90 turn. " + "Otherwise weird stuff will happen especially with SD70 and very long carts.\n\n" + "Always PULL carts!, bounding boxes are bugged <=> push is crapy !", "", "right", new ArrayList<StackToDraw>() {
			{
				add(new StackToDraw(new ItemStack(Block.railDetector), 20, 16));
				add(new StackToDraw(new ItemStack(Block.rail), 170, 16));
				add(new StackToDraw(new ItemStack(ItemIDs.minecartPower.item), 40, 165));
				add(new StackToDraw(new ItemStack(ItemIDs.minecartFlatCartWoodUS.item), 60, 165));
				add(new StackToDraw(new ItemStack(ItemIDs.minecartBoxCartUS.item), 80, 165));
				add(new StackToDraw(new ItemStack(ItemIDs.minecartPassenger9_2class_DB.item), 100, 165));
				add(new StackToDraw(new ItemStack(ItemIDs.minecartFlatCartLogs_DB.item), 120, 165));
				add(new StackToDraw(new ItemStack(ItemIDs.minecartFreightCart2.item), 140, 165));
				add(new StackToDraw(new ItemStack(ItemIDs.minecartCaboose.item), 160, 165));
			}
		});
		addPage("Crafting:\n" + "All train parts are crafted in the train workbench,\n\n" + "then trains have to be assembled in the assembly tables.\n\n" + "There are three assembly tables:\n\n" + "TierI - Iron age\n" + "TierII - Steel age\n" + "TierIII - Advanced age\n", "", "left", new ArrayList<StackToDraw>() {
			{
				add(new StackToDraw(new ItemStack(BlockIDs.trainWorkbench.block), 20, 16));
				add(new StackToDraw(new ItemStack(BlockIDs.assemblyTableI.block), 40, 165));
				add(new StackToDraw(new ItemStack(BlockIDs.assemblyTableII.block), 80, 165));
				add(new StackToDraw(new ItemStack(BlockIDs.assemblyTableIII.block), 140, 165));
			}
		});
		addPage("Crafting steel:\n" + "Steel is now crafted in Open Hearth Furnace, supply iron ingots and graphite in the top slots, fuel in the bottom slot \n" + "and it will cook slowly into steel.\n" + "You can also use steel from other mods or use this steel in other mods.\n", "", "right", new ArrayList<StackToDraw>() {
			{
				add(new StackToDraw(new ItemStack(BlockIDs.openFurnaceIdle.block), 20, 16));
				add(new StackToDraw(new ItemStack(BlockIDs.openFurnaceActive.block), 80, 155));
				add(new StackToDraw(new ItemStack(ItemIDs.graphite.item), 70, 135));
				add(new StackToDraw(new ItemStack(Item.ingotIron), 90, 135));
				add(new StackToDraw(new ItemStack(Item.coal), 80, 175));
				add(new StackToDraw(new ItemStack(ItemIDs.steel.item), 120, 155));
			}
		});

		addPage("Making diesel:\n" + "Diesel is made in a distillation tower using petroleum or oil sands found in the world.\n" + "Insert petroleum in the top slot and fuel in the bottom slot, also try reed.\n" + "It will cook into liquid diesel and give you plastic with a random chance depending on the input.\n" + "To get diesel into canisters, you must first craft them using plastic. Then put an empty one in the top right slot.", "", "left", new ArrayList<StackToDraw>() {
			{
				add(new StackToDraw(new ItemStack(BlockIDs.distilIdle.block), 20, 16));
				add(new StackToDraw(new ItemStack(BlockIDs.distilActive.block), 150, 40));
				add(new StackToDraw(new ItemStack(BlockIDs.oreTC.block, 1, 1), 150, 20));
				add(new StackToDraw(new ItemStack(Item.coal), 150, 60));
				add(new StackToDraw(new ItemStack(ItemIDs.diesel.item), 167, 40));
				add(new StackToDraw(new ItemStack(ItemIDs.rawPlastic.item), 182, 40));
			}
		});
		addPage("Special pull I: \n" + "You can attach two locomotives together.\n\n" + "To do that: shift+click the locomotive you want to PULL with a stake in your hand. Then fuel it and wait until it heats up.\n\n" + "Now put both locomotives in attaching mode. Then move attach them by moving one locomotive towards the other.", "", "right", new ArrayList<StackToDraw>() {
			{
				add(new StackToDraw(new ItemStack(ItemIDs.minecartLocoBR80_DB.item), 20, 16));
				add(new StackToDraw(new ItemStack(ItemIDs.stake.item), 170, 16));
				add(new StackToDraw(new ItemStack(ItemIDs.minecartCabooseWork.item), 40, 165));
				add(new StackToDraw(new ItemStack(ItemIDs.minecartTankWagon_DB.item), 60, 165));
				add(new StackToDraw(new ItemStack(ItemIDs.minecartFlatCartRail_DB.item), 80, 165));
				add(new StackToDraw(new ItemStack(ItemIDs.minecartFreightWagon_DB.item), 100, 165));
				add(new StackToDraw(new ItemStack(ItemIDs.minecartCD742.item), 120, 165));
				add(new StackToDraw(new ItemStack(ItemIDs.minecartCD742.item), 140, 165));
			}
		});
		addPage("Special pull II: \n" + "Locomotives have two states: 'Can pull' and 'Can be pulled'.\n" + "'Can pull' means that the locomotive is able to pull any attach cart. But it can't be pulled.\n" + "'Can be pulled' means that the locomotive behaves like a cart and can be pulled by another locomotive (which is in 'can pull' state). Attached locomotives share power.", "", "left", new ArrayList<StackToDraw>() {
			{
				add(new StackToDraw(new ItemStack(ItemIDs.minecartLoco3.item), 20, 16));
				add(new StackToDraw(new ItemStack(ItemIDs.stake.item), 170, 16));
				add(new StackToDraw(new ItemStack(ItemIDs.minecartCD742.item), 40, 165));
				add(new StackToDraw(new ItemStack(ItemIDs.minecartFreightWagon_DB.item), 60, 165));
				add(new StackToDraw(new ItemStack(ItemIDs.minecartFreightWagon_DB.item), 80, 165));
				add(new StackToDraw(new ItemStack(ItemIDs.minecartFreightWagon_DB.item), 100, 165));
				add(new StackToDraw(new ItemStack(ItemIDs.minecartFreightWagon_DB.item), 120, 165));
				add(new StackToDraw(new ItemStack(ItemIDs.minecartCD742.item), 140, 165));
			}
		});
		addPage("Armors I: \n" + "There are several armors in the mod.\n" +
				"Three of them are mostly skins (engineer, ticket man and driver) with same caracteristics as leather armor.\n" +
				"On the contrary, the composite suit is an armor with special capabilities and strong resistance and durability.\n" +
				"See next page for details.", "", "right", new ArrayList<StackToDraw>() {
			{
				add(new StackToDraw(new ItemStack(ItemIDs.hat.item), 20, 16));
				add(new StackToDraw(new ItemStack(ItemIDs.hat_ticketMan_paintable.item), 170, 16));
				add(new StackToDraw(new ItemStack(ItemIDs.hat_driver_paintable.item), 40, 165));
				add(new StackToDraw(new ItemStack(ItemIDs.jacket_driver_paintable.item), 90, 165));
				add(new StackToDraw(new ItemStack(ItemIDs.pants_driver_paintable.item), 140, 165));
			}
		});
		addPage("Armors II: \n" + "The helmet cures poisons, helps you breathe under water, and gives night vision in dark places (not when riding an entity)\n" +
				"The chest regen half a heart every 5s.\n" +
				"The pants protect you against fire damages.\n" +
				"The boots absorb fall damages.\n"+
				"Ticket man, driver and composite armors are paintable (in train workbench)", "", "left", new ArrayList<StackToDraw>() {
			{
				add(new StackToDraw(new ItemStack(ItemIDs.helmet_suit_paintable.item), 20, 16));
				add(new StackToDraw(new ItemStack(ItemIDs.reinforcedPlates.item), 170, 16));
			}
		});
		addPage("Generators:\n" +
				"There are three generators in the mod.\n" +
				"Water wheel and Wind mill are IC2 generators. Water wheel has to be placed besides a flowing water. Plug cables to the sides.\n" +
				"Wind mill will produce various energy amount depending on wind strengh.\n" +
				"" +
				"Diesel generator will produce Buildcraft power, fill with diesel, power it with redstone, plug some BC power pipes.\n" +
				"" +
				"","","right",new ArrayList<StackToDraw>() {
					{
						add(new StackToDraw(new ItemStack(BlockIDs.windMill.block, 1, 4), 20, 16));
						add(new StackToDraw(new ItemStack(BlockIDs.waterWheel.block, 1, 4), 170, 16));
					}
				});
		addPage("Villager\n" +
				"\n" +
				"Traincraft adds a new villager and a train station to village generation.\n" +
				"\n" +
				"The villager will trade all traincraft items with you upon various prices.\n" +
				"" +
				"" +
				"" +
				"","","left",new ArrayList<StackToDraw>() {
					{
						add(new StackToDraw(new ItemStack(ItemIDs.jacket_driver_paintable.item, 1, 4), 20, 16));
						add(new StackToDraw(new ItemStack(ItemIDs.hat_driver_paintable.item, 1, 4), 170, 16));
					}
				});
		addPage("Known bugs:\n" +
				"- Sharp turns are not supported (close 180 turns)\n" +
				"- Bounding boxes don't fit some trains properly. Sometimes they don't orient properly (generally when the entity is spawned).\n" +
				"- Attached cart may bounce when stopped on a corner. " +
				"This is due to the length of some models and because the physics is calculated from the center.\n" +
				"" +
				"","","right",new ArrayList<StackToDraw>() {
					{
						add(new StackToDraw(new ItemStack(Item.skull, 1, 4), 20, 16));
						add(new StackToDraw(new ItemStack(Item.skull, 1, 4), 170, 16));
					}
				});
		
		addPage("Advices:\n" +
				"Due to the bounding box issues, carts have to be attached and PULLED. Don't try to push\n\n" +
				"Railcraft pull system has been deactivated on Traincraft loco. Use TC's system. \n" +
				"","","left",new ArrayList<StackToDraw>() {
					{
						add(new StackToDraw(new ItemStack(ItemIDs.minecartTankWagon_DB.item), 20, 16));
						add(new StackToDraw(new ItemStack(BlockIDs.oreTC.block), 170, 16));
						add(new StackToDraw(new ItemStack(ItemIDs.minecartCaboose3.item), 40, 155));
						add(new StackToDraw(new ItemStack(ItemIDs.minecartFreightWellcar.item), 60, 155));
						add(new StackToDraw(new ItemStack(ItemIDs.minecartOpenWagon.item), 80, 155));
						add(new StackToDraw(new ItemStack(ItemIDs.minecartStockCar.item), 100, 155));
						add(new StackToDraw(new ItemStack(ItemIDs.minecartOpenWagon.item), 120, 155));
						add(new StackToDraw(new ItemStack(ItemIDs.minecartBR_E69.item), 140, 155));
					}
				});
		
		addPage("On the next pages you will find all the train workbench recipes and assembly table recipes.\n" + "It is however strongly suggested to try to discover the recipes by yourself...\n\n" + "We hope you will enjoy the mod!\n\n" + "Spitfire4466 and MrBrutal", "", "right", new ArrayList<StackToDraw>() {
			{
				add(new StackToDraw(new ItemStack(BlockIDs.trainWorkbench.block), 20, 16));
				add(new StackToDraw(new ItemStack(ItemIDs.hat.item), 40, 155));
				add(new StackToDraw(new ItemStack(ItemIDs.jacket.item), 90, 155));
				add(new StackToDraw(new ItemStack(ItemIDs.overalls.item), 140, 155));
			}
		});
		if (rightPage != null && recipeList != null && recipeListWB != null)
			this.bookTotalPages = this.rightPage.size() + (recipeList.size() / 2) + (recipeListWB.size() / 2);
	}

	public class StackToDraw {
		private ItemStack stack;
		private int x;
		private int y;

		public StackToDraw(ItemStack stack, int x, int y) {
			this.stack = stack;
			this.x = x;
			this.y = y;
		}

		public ItemStack getItemStack() {
			return stack;
		}

		public int getX() {
			return x;
		}

		public int getY() {
			return y;
		}
	}

	private void addPage(String text, String image, String side, ArrayList<StackToDraw> stacks) {
		if (side.equals("left")) {
			leftPage.add(text);
			leftPageImage.add(image);
			leftPageItemStacks.add(stacks);
		}
		if (side.equals("right")) {
			rightPage.add(text);
			rightPageImage.add(image);
			rightPageItemStacks.add(stacks);
		}
	}

	/**
	 * Adds the buttons (and other controls) to the screen in question.
	 */
	@Override
	public void initGui() {
		ItemRenderBook.open = true;
		this.buttonList.clear();

		int var1 = (this.width) / 2;
		int var2 = (this.height) / 2;
		this.buttonList.add(this.buttonBack = new GuiButtonNextPage(4, var1 + 150, var2 + 80, 23, 13, true));
		this.buttonList.add(this.buttonRead = new GuiButtonNextPage(3, var1 - 8, var2 + 98, 40, 20, true));
		this.buttonList.add(this.buttonNextPage = new GuiButtonNextPage(1, var1 + 150, var2 + 80, 23, 13, true));
		this.buttonList.add(this.buttonPreviousPage = new GuiButtonNextPage(2, var1 - 180, var2 + 80, 23, 13, false));
		this.updateButtons();
	}

	private void updateButtons() {
		this.buttonBack.drawButton = (this.currPage == bookTotalPages-1);
		this.buttonBack.showButton = true;
		this.buttonRead.drawButton = (this.currPage == 0);
		this.buttonRead.showButton = false;
		this.buttonNextPage.drawButton = (this.currPage > 0 && this.currPage < this.bookTotalPages - 1);
		this.buttonNextPage.showButton = (this.currPage > 0 && this.currPage < this.bookTotalPages - 1);
		this.buttonPreviousPage.drawButton = this.currPage > 0;
		this.buttonPreviousPage.showButton = this.currPage > 0;
	}

	/**
	 * Fired when a control is clicked. This is the equivalent of ActionListener.actionPerformed(ActionEvent e).
	 */
	@Override
	protected void actionPerformed(GuiButton par1GuiButton) {
		if (par1GuiButton.enabled) {
			if (par1GuiButton.id == 1) {
				if (this.currPage < this.bookTotalPages - 1) {
					++this.currPage;
					this.currRecipe += 2;
				}
			}
			else if (par1GuiButton.id == 2) {
				if (this.currPage > 0) {
					--this.currPage;
					this.currRecipe -= 2;
				}
			}
			else if (par1GuiButton.id == 3) {
				if (this.currPage == 0) {
					++this.currPage;
					this.currRecipe += 2;
				}
			}
			else if (par1GuiButton.id == 4) {
				if (this.currPage == bookTotalPages-1) {
					this.currPage = 0;
					this.currRecipe = 0;
				}
			}
			this.updateButtons();
		}
	}

	/**
	 * Draws the screen and all the components in it.
	 */
	@Override
	public void drawScreen(int par1, int par2, float par3) {
		String pageIndic;
		int var9;
		int var5 = (this.width) / 2;
		int var6 = (this.height) / 2 - bookImageHeight / 2;

		//System.out.println("H: " + height + " W: " + width);
		
		if (this.currPage > 0) {
			mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.bookPrefix + "bookright.png"));
			this.drawTexturedModalRect(var5, var6, 0, 0, this.bookImageWidth, this.bookImageHeight + 20);
			mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.bookPrefix + "bookleft.png"));
			var5 -= this.bookImageWidth;
			this.drawTexturedModalRect(var5, var6, 256 - this.bookImageWidth, 0, this.bookImageWidth, this.bookImageHeight);
		}
		else {
			mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.bookPrefix + "bookcover.png"));
			this.drawTexturedModalRect(var5 - 55, var6 - 15, 0, 0, 256, 256);
		}

		pageIndic = String.format(StatCollector.translateToLocal("book.pageIndicator"), new Object[] { Integer.valueOf(this.currPage + 1), Integer.valueOf(this.bookTotalPages) });

		var9 = ftRender.getStringWidth(pageIndic);
		if (this.currPage > 0) {
			ftRender.drawString(pageIndic, var5 - var9 + this.bookImageWidth - 44, var6 + 7, 0);
		}
		super.drawScreen(par1, par2, par3);

		if (this.currPage < rightPage.size()) {
			int var10 = ftRender.getStringWidth(leftPage.get(this.currPage));
			ftRender.drawSplitString(leftPage.get(this.currPage), var5 + 36, var6 + 16 + 16, 140, 0);

			int var11 = ftRender.getStringWidth(rightPage.get(this.currPage));
			ftRender.drawSplitString(rightPage.get(this.currPage), var5 + 250, var6 + 16 + 16, 140, 0);

			GL11.glEnable(32826);
			RenderHelper.enableGUIStandardItemLighting();
			if (this.leftPageItemStacks != null && this.leftPageItemStacks.get(this.currPage) != null && this.leftPageItemStacks.get(this.currPage).get(0) != null) {
				for (int t = 0; t < this.leftPageItemStacks.get(this.currPage).size(); t++) {
					if (this.leftPageItemStacks.get(this.currPage).get(t) != null) {
						renderItem.renderItemIntoGUI(ftRender, this.mc.renderEngine, ((StackToDraw) this.leftPageItemStacks.get(this.currPage).get(t)).getItemStack(), var5 + ((StackToDraw) this.leftPageItemStacks.get(this.currPage).get(t)).getX(), var6 + ((StackToDraw) this.leftPageItemStacks.get(this.currPage).get(t)).getY());
					}
				}
			}
			if (this.rightPageItemStacks != null && this.rightPageItemStacks.get(this.currPage) != null && this.rightPageItemStacks.get(this.currPage).get(0) != null) {
				for (int t = 0; t < this.rightPageItemStacks.get(this.currPage).size(); t++) {
					if (this.rightPageItemStacks.get(this.currPage).get(t) != null) {
						renderItem.renderItemIntoGUI(ftRender, this.mc.renderEngine, ((StackToDraw) this.rightPageItemStacks.get(this.currPage).get(t)).getItemStack(), var5 + ((StackToDraw) this.rightPageItemStacks.get(this.currPage).get(t)).getX() + 210, var6 + ((StackToDraw) this.rightPageItemStacks.get(this.currPage).get(t)).getY());
					}
				}
			}
			GL11.glDisable(32826);
		}
		if (this.currPage > rightPage.size() - 1) {
			//System.out.println((rightPage.size()*2) -1);
			int page = this.currRecipe - (rightPage.size() * 2) + 1;
			if (!(page > recipeListWB.size() - 1)) {
				drawWorkBenchBackground(recipeListWB, var5, var6, 0, var9, "right");
				drawWorkBenchBackground(recipeListWB, var5, var6, 0, var9, "left");
				RenderHelper.enableGUIStandardItemLighting();
				drawWorkBenchRecipe(recipeListWB, var5, var6, page - 1, var9, "right");
				drawWorkBenchRecipe(recipeListWB, var5, var6, page, var9, "left");
			}
			else if ((page - recipeListWB.size()) >= 0 && (page - recipeListWB.size()) < recipeList.size() && recipeList.get(page - recipeListWB.size()) != null) {
				drawAssemblyBackground(recipeList, var5 - 125, var6 - 33, page - recipeListWB.size(), var9, "right");
				drawAssemblyBackground(recipeList, var5 - 50, var6 - 33, page - recipeListWB.size() - 1, var9, "left");
				RenderHelper.enableGUIStandardItemLighting();
				drawAssemblyRecipe(recipeList, var5 - 125, var6 - 33, page - recipeListWB.size(), var9, "right");
				drawAssemblyRecipe(recipeList, var5 - 50, var6 - 33, page - recipeListWB.size() - 1, var9, "left");
			}
		}
		GL11.glDisable(GL11.GL_LIGHTING);
	}

	private void drawAssemblyBackground(List<TierRecipe> recipeList, int var5, int var6, int page, int var9, String side) {
		if (page < 0)
			return;
		int tier = recipeList.get(page).getTier();
		if (tier == 1)
			mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.TEX_TIER_I));
		if (tier == 2)
			mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.TEX_TIER_II));
		if (tier == 3)
			mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.TEX_TIER_III));
		//if (side.equals("right"))
		//GL11.glScaled(0.7, 0.7, 0.7);
		if (side.equals("left"))
			this.drawTexturedModalRect(var5 + 70, var6 + 50, 0, 0, 177, 163);
		if (side.equals("right"))
			this.drawTexturedModalRect(var5 + 340, var6 + 50, 0, 0, 177, 163);
	}

	private void drawWorkBenchBackground(List<ShapedTrainRecipes> recipeListWB, int var5, int var6, int page, int var9, String side) {
		//int var4 = this.mc.renderEngine.getTexture("/gui/crafting.png");
		//GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.guiPrefix+"crafting_table.png"));
		if (side.equals("left"))
			this.drawTexturedModalRect(var5 + 20, var6 + 50, 0, 0, 177, 80);
		if (side.equals("right"))
			this.drawTexturedModalRect(var5 + 215, var6 + 50, 0, 0, 177, 80);
	}

	private void drawWorkBenchRecipe(List recipeList, int var5, int var6, int page, int var9, String side) {
		if (recipeList.get(page) == null)
			return;
		ItemStack[] itemList = new ItemStack[9];
		ItemStack itemOutput = null;
		if (recipeList.get(page) instanceof ShapedTrainRecipes) {
			itemList = ((ShapedTrainRecipes) recipeList.get(page)).recipeItems;
			itemOutput = ((ShapedTrainRecipes) recipeList.get(page)).getRecipeOutput();
		}
		if (recipeList.get(page) instanceof ShapelessTrainRecipe) {
			List<ItemStack> itemListShapeless = ((ShapelessTrainRecipe) recipeList.get(page)).recipeItems;
			for (int t = 0; t < itemListShapeless.size(); t++) {
				if (itemListShapeless != null && itemListShapeless.get(t) != null)
					itemList[t] = itemListShapeless.get(t);
			}
			itemOutput = ((ShapelessTrainRecipe) recipeList.get(page)).getRecipeOutput();
		}

		//System.out.println(itemOutput);
		int offset = 0;
		if (side.equals("right"))
			offset = 194;
		GL11.glEnable(32826);
		if (itemList[0] != null)
			renderItem.renderItemIntoGUI(ftRender, this.mc.renderEngine, itemList[0], var5 + 50 + offset, var6 + 67);
		if (itemList[1] != null)
			renderItem.renderItemIntoGUI(ftRender, this.mc.renderEngine, itemList[1], var5 + 68 + offset, var6 + 67);
		if (itemList[2] != null)
			renderItem.renderItemIntoGUI(ftRender, this.mc.renderEngine, itemList[2], var5 + 86 + offset, var6 + 67);
		if (itemList[3] != null)
			renderItem.renderItemIntoGUI(ftRender, this.mc.renderEngine, itemList[3], var5 + 50 + offset, var6 + 85);
		if (itemList[4] != null)
			renderItem.renderItemIntoGUI(ftRender, this.mc.renderEngine, itemList[4], var5 + 68 + offset, var6 + 85);
		if (itemList[5] != null)
			renderItem.renderItemIntoGUI(ftRender, this.mc.renderEngine, itemList[5], var5 + 86 + offset, var6 + 85);
		if (itemList[6] != null)
			renderItem.renderItemIntoGUI(ftRender, this.mc.renderEngine, itemList[6], var5 + 50 + offset, var6 + 103);
		if (itemList[7] != null)
			renderItem.renderItemIntoGUI(ftRender, this.mc.renderEngine, itemList[7], var5 + 68 + offset, var6 + 103);
		if (itemList[8] != null)
			renderItem.renderItemIntoGUI(ftRender, this.mc.renderEngine, itemList[8], var5 + 86 + offset, var6 + 103);
		if (itemOutput != null)
			renderItem.renderItemIntoGUI(ftRender, this.mc.renderEngine, itemOutput, var5 + 145 + offset, var6 + 85);
		if (itemOutput != null)
			ftRender.drawString(itemOutput.getItem().getItemDisplayName(itemOutput), var5 + 20 + offset, var6 + 40, 0);
		if (itemOutput != null)
			ftRender.drawString("Crafted in: Train Workbench", var5 + 20 + offset, var6 + 130, 0);
		if (itemOutput != null) {
			for (int z = 0; z < RecipeBookHandler.vanillaWorkTableRecipes.length; z++) {
				if (itemOutput!=null && itemOutput.getItem()!= null && RecipeBookHandler.vanillaWorkTableRecipes[z]!=null && RecipeBookHandler.vanillaWorkTableRecipes[z].equals(itemOutput.getItem().getItemDisplayName(itemOutput))) {
					ftRender.drawString("Also crafted in: Crafting Table", var5 + 20 + offset, var6 + 140, 0);
					break;
				}
			}
		}
		GL11.glDisable(32826);
	}

	private void drawAssemblyRecipe(List<TierRecipe> recipeList, int var5, int var6, int page, int var9, String side) {
		if (page < 0)
			return;
		int tier = recipeList.get(page).getTier();

		List<ItemStack> itemList = recipeList.get(page).getInput();
		int offset = 0;
		if (side.equals("right"))
			offset = 271;
		GL11.glEnable(32826);
		if (itemList.get(0) != null)
			renderItem.renderItemIntoGUI(ftRender, this.mc.renderEngine, itemList.get(0), var5 + 94 + offset, var6 + 76);
		if (itemList.get(0) != null)
			renderItem.renderItemOverlayIntoGUI(ftRender, this.mc.renderEngine, itemList.get(0), var5 + 94 + offset, var6 + 76);
		if (itemList.get(1) != null)
			renderItem.renderItemIntoGUI(ftRender, this.mc.renderEngine, itemList.get(1), var5 + 113 + offset, var6 + 143);
		if (itemList.get(1) != null)
			renderItem.renderItemOverlayIntoGUI(ftRender, this.mc.renderEngine, itemList.get(1), var5 + 113 + offset, var6 + 143);
		if (itemList.get(2) != null)
			renderItem.renderItemIntoGUI(ftRender, this.mc.renderEngine, itemList.get(2), var5 + 148 + offset, var6 + 143);
		if (itemList.get(2) != null)
			renderItem.renderItemOverlayIntoGUI(ftRender, this.mc.renderEngine, itemList.get(2), var5 + 148 + offset, var6 + 143);
		if (itemList.get(3) != null)
			renderItem.renderItemIntoGUI(ftRender, this.mc.renderEngine, itemList.get(3), var5 + 214 + offset, var6 + 143);
		if (itemList.get(3) != null)
			renderItem.renderItemOverlayIntoGUI(ftRender, this.mc.renderEngine, itemList.get(3), var5 + 214 + offset, var6 + 143);
		if (itemList.get(4) != null)
			renderItem.renderItemIntoGUI(ftRender, this.mc.renderEngine, itemList.get(4), var5 + 148 + offset, var6 + 77);
		if (itemList.get(4) != null)
			renderItem.renderItemOverlayIntoGUI(ftRender, this.mc.renderEngine, itemList.get(4), var5 + 148 + offset, var6 + 77);
		if (itemList.get(5) != null)
			renderItem.renderItemIntoGUI(ftRender, this.mc.renderEngine, itemList.get(5), var5 + 184 + offset, var6 + 77);
		if (itemList.get(5) != null)
			renderItem.renderItemOverlayIntoGUI(ftRender, this.mc.renderEngine, itemList.get(5), var5 + 184 + offset, var6 + 77);
		if (itemList.get(6) != null)
			renderItem.renderItemIntoGUI(ftRender, this.mc.renderEngine, itemList.get(6), var5 + 149 + offset, var6 + 110);
		if (itemList.get(6) != null)
			renderItem.renderItemOverlayIntoGUI(ftRender, this.mc.renderEngine, itemList.get(6), var5 + 149 + offset, var6 + 110);
		if (itemList.get(7) != null)
			renderItem.renderItemIntoGUI(ftRender, this.mc.renderEngine, itemList.get(7), var5 + 185 + offset, var6 + 110);
		if (itemList.get(7) != null)
			renderItem.renderItemOverlayIntoGUI(ftRender, this.mc.renderEngine, itemList.get(7), var5 + 185 + offset, var6 + 110);
		if (itemList.get(8) != null)
			renderItem.renderItemIntoGUI(ftRender, this.mc.renderEngine, itemList.get(8), var5 + 94 + offset, var6 + 110);
		if (itemList.get(8) != null)
			renderItem.renderItemOverlayIntoGUI(ftRender, this.mc.renderEngine, itemList.get(8), var5 + 94 + offset, var6 + 110);
		if (itemList.get(9) != null)
			renderItem.renderItemIntoGUI(ftRender, this.mc.renderEngine, itemList.get(9), var5 + 214 + offset, var6 + 77);
		if (itemList.get(9) != null)
			renderItem.renderItemOverlayIntoGUI(ftRender, this.mc.renderEngine, itemList.get(9), var5 + 214 + offset, var6 + 77);
		ItemStack output = recipeList.get(page).getOutput();
		if (output != null && side.equals("left"))
			renderItem.renderItemIntoGUI(ftRender, this.mc.renderEngine, output, var5 + 162, var6 + 177);
		if (output != null && side.equals("right"))
			renderItem.renderItemIntoGUI(ftRender, this.mc.renderEngine, output, var5 + 432, var6 + 177);
		String name = "";
		if (output != null && output.getItem() instanceof ItemRollingStock)
			name = ((ItemRollingStock) output.getItem()).getTrainName();
		if (side.equals("left"))
			ftRender.drawString(name, var5 - var9 + this.bookImageWidth - 55, var6 + 56, 0xffffff);
		if (side.equals("right"))
			ftRender.drawString(name, var5 - var9 + this.bookImageWidth + 215, var6 + 56, 0xffffff);
		if (side.equals("left"))
			ftRender.drawString("Tier: " + tier, var5 - var9 + this.bookImageWidth - 56, var6 + 40, 0);
		if (side.equals("right"))
			ftRender.drawString("Tier: " + tier, var5 - var9 + this.bookImageWidth + 338, var6 + 40, 0);
		GL11.glDisable(32826);
	}

	@Override
	public void onGuiClosed() {
		ItemRenderBook.open = false;
		NBTTagCompound var3 = this.itemstackBook.getTagCompound();
		PacketHandler.setBookPage(this.editingPlayer, this.currPage, this.currRecipe);
		this.itemstackBook.getTagCompound().setInteger("currPage", this.currPage);
		this.itemstackBook.getTagCompound().setInteger("currRecipe", this.currRecipe);
		super.onGuiClosed();
	}

	@Override
	public boolean doesGuiPauseGame() {
		return false;
	}
	
	@Override
	protected void keyTyped(char par1, int par2) {
		if(par2 == 1 || par2 == this.mc.gameSettings.keyBindInventory.keyCode) {
			onGuiClosed();
			this.mc.thePlayer.closeScreen();
		}
		//42 left shift
		//29 left ctrl
//		if(par2 == 42) {
//			this.currPage = 0;
//			this.updateScreen();
//		}
	}
	
//	@Override
//	protected void mouseClicked(int par1, int par2, int par3) {
//		System.out.println("Mouse clicked: " + par1 + ":" + par2 + ":" + par3);
//		if(par3 == 1) {
//			
//		}
//	}
}