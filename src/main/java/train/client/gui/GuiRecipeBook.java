package train.client.gui;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import org.lwjgl.opengl.GL11;
import train.client.core.handlers.RecipeBookHandler;
import train.common.core.managers.TierRecipe;
import train.common.core.managers.TierRecipeManager;
import train.common.inventory.TrainCraftingManager;
import train.common.items.ItemRecipeBook;
import train.common.items.ItemRollingStock;
import train.common.library.BlockIDs;
import train.common.library.Info;
import train.common.library.ItemIDs;
import train.common.recipes.ShapedTrainRecipes;
import train.common.recipes.ShapelessTrainRecipe;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SideOnly(Side.CLIENT)
public class GuiRecipeBook extends GuiScreen {
    /**
     * The player editing the book
     */
    private final EntityPlayer editingPlayer;
    private final ItemStack itemstackBook;

    /**
     * Update ticks since the gui was opened
     */
    private final int bookImageWidth = 206;
    private final int bookImageHeight = 200;
    public static int bookTotalPages = 2;
    private int currPage;
    private int currRecipe;
    private int searchResultsPosition = 0;
	List<Integer> resultIndexList = new ArrayList<>();
	public ArrayList<String> leftPage = new ArrayList<String>();
	public ArrayList<String> leftPageImage = new ArrayList<String>();
	public ArrayList<ArrayList> leftPageItemStacks = new ArrayList<ArrayList>();
	public ArrayList<String> rightPage = new ArrayList<String>();
	public ArrayList<String> rightPageImage = new ArrayList<String>();
	public ArrayList<ArrayList> rightPageItemStacks = new ArrayList<ArrayList>();
	private List recipeListWB =null;
	private List<TierRecipe> recipeList=null;
	private final TreeMap<String, ArrayList<Integer>> recipeIndexMap = new TreeMap<>();

	private GuiButtonNextPage buttonRead;
	private GuiButtonNextPage buttonNextPage;
	private GuiButtonNextPage buttonPreviousPage;
	private GuiButtonNextPage buttonBack;
	private GuiButtonRecipeSearch buttonSearchPrevious;
	private GuiButtonRecipeSearch buttonSearchNext;
	private GuiButtonRecipeSearch buttonSearch;
	private GuiTextField searchBar;
	private final RenderItem renderItem = new RenderItem();

    public GuiRecipeBook(EntityPlayer par1EntityPlayer, ItemStack par2ItemStack) {
        this.editingPlayer = par1EntityPlayer;
        this.itemstackBook = par2ItemStack;
        this.currPage = this.itemstackBook.getTagCompound().getInteger("currPage");
        this.currRecipe = this.itemstackBook.getTagCompound().getInteger("currRecipe");

        addPage("", "", "left", null);
        addPage("", "", "right", null);
        addPage("Welcome to the Traincraft guide! \nThis book contains everything you need to know about Traincraft.\n\nAuthors:\nSpitfire4466,\nMrbrutal\n\nBukkit port: \nDV8FromTheWorld\n\nThanks to CovertJaguar for his help and a great API.\n", "", "left", new ArrayList<StackToDraw>() {
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
        addPage("Modelers:\nDAYdiecast,\nhelldiver,\nBlockStormTwo,\nChandlerBingUA.\n\nGitHub 1.7.10 port Team: \nEternal BlueFlame,\nNitroxydeX,\nFirEmerald,\nHagurd\n \nWebsite:\nhttp://traincraft-mod.\nblogspot.com", "", "right", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(ItemIDs.minecartLocoSteamAdler.item), 20, 16));
                add(new StackToDraw(new ItemStack(BlockIDs.assemblyTableII.block), 170, 16));

                add(new StackToDraw(new ItemStack(ItemIDs.minecartLocoForneyRed.item), 20, 175));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartPassengerBlue.item), 40, 175));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartPassengerBlue.item), 60, 175));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartFreightWagon_DB.item), 80, 175));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartWood.item), 100, 175));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartCabooseLogging.item), 120, 175));
            }
        });
        addPage("World generation:\n\n By default, petrol and oil sands will be generated in the world. If you don't want them, open Traincraft.cfg and change the line ENABLE_ORE_SPAWN from true to false.\nOnly the new ores will generate, the old ones can be transformed into the new ones in a crafting table.", "", "left", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(BlockIDs.oreTC.block, 1, 1), 60, 160));
                add(new StackToDraw(new ItemStack(BlockIDs.oreTC.block, 1, 2), 120, 160));
            }
        });

        addPage("Keys:\nTo interact with the trains (e.g. enter, display the inventory) click above the shadow the train is casting on the ground.\nInside the locomotive press R to open up the GUI: This is where you can put fuel, water, additional cargo, set brakes, etc.\n", "", "right", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(Items.coal), 60, 160));
                add(new StackToDraw(new ItemStack(Items.water_bucket), 120, 160));
            }
        });

        addPage("Use the W and S keys to move the locomotive forwards or backwards, respectively.\nPress H in the locomotive to activate the whistle.\nIn the Work Carts, press R to open up the Crafting Table and F for the Furnace.\n", "", "left", new ArrayList<StackToDraw>() {
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
        addPage("Zeppelin:\nRight click on the Zeppelin to enter it. \nInside, press R to open its GUI. \nUse the WASD keys to move the zeppelin around. \nPress once Y to ascend or X to descend, To lock altitude, press C. \n", "", "right", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(ItemIDs.airship.item), 20, 16));
                add(new StackToDraw(new ItemStack(ItemIDs.balloon.item), 170, 16));
                add(new StackToDraw(new ItemStack(ItemIDs.propeller.item), 40, 135));
                add(new StackToDraw(new ItemStack(ItemIDs.steamengine.item), 60, 135));
                add(new StackToDraw(new ItemStack(Items.boat), 120, 135));
                add(new StackToDraw(new ItemStack(Items.stick), 140, 135));

            }
        });
        addPage("Fuel:\nSteam locomotives need coal and water.\nTenders can only hold coal and water. Attach them to a steam locomotive, they will provide fuel and water for the loco.\nDiesel locos need diesel canisters (from distillation tower) or fuel from BC and Forestry.\n", "", "left", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(ItemIDs.minecartTender.item), 20, 16));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartLocomogulBlue.item), 170, 16));
                add(new StackToDraw(new ItemStack(Items.coal), 40, 155));
                add(new StackToDraw(new ItemStack(Items.water_bucket), 60, 155));
                add(new StackToDraw(new ItemStack(Blocks.planks), 80, 155));
                add(new StackToDraw(new ItemStack(Items.blaze_rod), 100, 155));
                add(new StackToDraw(new ItemStack(ItemIDs.diesel.item), 120, 155));
                add(new StackToDraw(new ItemStack(ItemIDs.refinedFuel.item), 140, 155));
            }
        });

        addPage("Electric locomotives need redstone or RF-based energy storages, they can also be powered by Electric tracks.\n\nHeat:\nHeat level is indicated by the heat bar in the HUD.\nHeat level will go to a normal state when the train is fueled but don't forget to put water in steam locomotive or it will overheat very fast.\n", "", "right", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(ItemIDs.minecartBR_E69.item), 20, 16));
                add(new StackToDraw(new ItemStack(Items.redstone), 170, 16));
            }
        });

        addPage("Heat level will go down to cold when there's no fuel.\nWait until the locomotive has heated up before trying to move. but be careful overheating can cause explosions...\n\nRouting:\nLocomotives can be routed using Railcraft routing track. Destination will show in the GUI, Sneak+Crowbar to reset. There is no space for tickets. Not 'Color=' compatible.", "", "left", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(ItemIDs.firebox.item), 20, 16));
                add(new StackToDraw(new ItemStack(Blocks.tnt), 170, 16));
            }
        });
        addPage("Minecraft Horse Power - Mhp:\n\nLocomotives have different pulling abilities represented by their 'power' in Mhp.\nEach cart has a mass in tons which will affect the locomotive depending on its power.\nMass pulled affects the maximum speed, the brake rate and accelerate rate, as well as fuel consumption.\n", "", "right", new ArrayList<StackToDraw>() {
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
        addPage("Derailment:\n\nDo not go too fast on turns or your locomotives will derail!\n\nIt is recommended to slow down under 90km/h before turning or you will find yourself crashing off tracks.", "", "left", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(Items.skull, 1, 1), 20, 16));
            }
        });

        addPage("Pulling:\nRight click both carts with a stake in your hand, it will say 'Attaching mode on', then make them collide and it will say 'Attached'.\nLocomotives have pulling capabilities, don't make too long trains with weak locomotives. Stats of the locomotive will be affected. (they can be seen on the top left corner when you open the locomotive's inventory).\n", "", "right", new ArrayList<StackToDraw>() {
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
        addPage("Chunk Loading:\n\nEach rolling stock can load one chunk around itself.\nTo start chunk loading, right click with chunk loader activator on the rolling stock.\nTo stop chunk loading, right click again.\n", "", "left", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(ItemIDs.chunkLoaderActivator.item), 20, 16));
                add(new StackToDraw(new ItemStack(Items.ender_pearl), 170, 16));
            }
        });
        addPage("Colors:\n\nSome rolling stock has several textures and can be painted with dyes.\nThe rolling stock that can be painted will show the possible colors in the chat once placed in the world.\nTo paint, simply right click with the correct dye.\n\nLantern color is randomly picked, but you can set the hex color manually with a wrench", "", "right", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(Items.dye, 1, 1), 20, 16));
                add(new StackToDraw(new ItemStack(Items.dye, 1, 11), 170, 16));
            }
        });
        addPage("Stock car:\n\nThe stock car is the only rolling stock that can be ridden by any animals and mobs.\nTo fill the stock car, either collide the animal with the car or use the animal/mob boarding tracks (Railcraft required).\nTo empty the car, use the disembark track (Railcraft required).\n", "", "left", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(ItemIDs.minecartStockCar.item), 20, 16));
                add(new StackToDraw(new ItemStack(Items.skull, 1, 4), 170, 16));
            }
        });
        addPage("A word about tracks I:\nCopper tracks will slow trains down.\nSteel tracks allow trains to go faster.\nSpeed controller track allows you to change the locomotive's max speed (hit with crowbar).\nThe energy track can be powered by redstone and will power electric trains, redstone power will be transmitted two tracks away.\n", "", "right", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(Blocks.rail), 17, 16));
                add(new StackToDraw(new ItemStack(Blocks.rail), 17, 32));
                add(new StackToDraw(new ItemStack(Blocks.rail), 17, 48));
                add(new StackToDraw(new ItemStack(Blocks.rail), 17, 64));
                add(new StackToDraw(new ItemStack(Blocks.rail), 17, 80));
                add(new StackToDraw(new ItemStack(Blocks.rail), 17, 96));
                add(new StackToDraw(new ItemStack(Blocks.rail), 17, 112));
                add(new StackToDraw(new ItemStack(Blocks.rail), 17, 128));
                add(new StackToDraw(new ItemStack(Blocks.rail), 17, 144));
                add(new StackToDraw(new ItemStack(Blocks.rail), 17, 160));
                add(new StackToDraw(new ItemStack(Blocks.golden_rail), 170, 16));
            }
        });
        addPage("A word about tracks II:\nTo check the current charge click the track with a crowbar.\nAn electric track connected to a redstone power source gets 1 energy unit every two ticks.\nLocomotive holding track will only hold TC locomotives. No boost is given, the previous speed is restored once released.\nAll tracks require Railcraft to be installed.", "", "left", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(Blocks.activator_rail), 17, 16));
                add(new StackToDraw(new ItemStack(Blocks.golden_rail), 170, 16));
            }
        });

        addPage("Steel rails parts and copper rails parts are crafted inside RC Rolling Machine, tracks are assembled in vanilla workbench.\nTC boarding/disembarking track are designed to work only on the Stock Car. Animal boarding will take any nearby animal and put it inside a passing Stock Car. Mob boarding will affect any mob.\nDisembark will eject any mob inside the Stock Car.", "", "right", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(Blocks.detector_rail), 17, 16));
                add(new StackToDraw(new ItemStack(Blocks.golden_rail), 170, 16));
            }
        });
        addPage("Builder I:\n\nThe tracks builder has a very special inventory, in order to start it you must provide:\nBallast in the slot under it (planks, gravel, stone, ...).\nCoal in the fuel slot, Tracks in the slot under the fuel slot. The slot on the right of the builder will activate tunnel function when provided (not all blocks are accepted).\n", "", "left", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(ItemIDs.minecartBuilder.item), 20, 16));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartBuilder.item), 60, 165));
                add(new StackToDraw(new ItemStack(ItemIDs.stake.item), 80, 165));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartFreightClosed.item), 100, 165));
            }
        });
        addPage("Builder II:\n\nThe slots on top of the builder are roof slots, the builder will build a roof when provided (not all blocks are accepted). If you attach a freight cart to the builder, it will dump things in it.\n\n", "", "right", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(ItemIDs.minecartBuilder.item), 20, 16));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartBuilder.item), 60, 125));
                add(new StackToDraw(new ItemStack(ItemIDs.stake.item), 80, 125));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartFreightClosed.item), 100, 125));
            }
        });
        addPage("Limitations:\n\nVERY IMPORTANT:\nLong trains imply limitations: Do not try to make sharp 180 turns, leave 3+ spaces between each 90 turn. Otherwise weird stuff may happen especially with very long trains.\n\nAlways PULL carts! Bounding boxes are buggy and unreliable!", "", "left", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(Blocks.detector_rail), 20, 16));
                add(new StackToDraw(new ItemStack(Blocks.rail), 170, 16));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartPower.item), 40, 165));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartFlatCartWoodUS.item), 60, 165));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartBoxCartUS.item), 80, 165));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartPassenger9_2class_DB.item), 100, 165));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartFlatCartLogs_DB.item), 120, 165));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartFreightCart2.item), 140, 165));
                add(new StackToDraw(new ItemStack(ItemIDs.minecartCaboose.item), 160, 165));
            }
        });
        addPage("Crafting:\nAll train parts are crafted in the train workbench,\n\nthen trains have to be assembled in the assembly tables.\n\nThere are three assembly tables:\n\nTierI - Iron age\nTierII - Steel age\nTierIII - Advanced age\n", "", "right", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(BlockIDs.trainWorkbench.block), 20, 16));
                add(new StackToDraw(new ItemStack(BlockIDs.assemblyTableI.block), 40, 165));
                add(new StackToDraw(new ItemStack(BlockIDs.assemblyTableII.block), 80, 165));
                add(new StackToDraw(new ItemStack(BlockIDs.assemblyTableIII.block), 140, 165));
            }
        });
        addPage("Crafting steel:\nSteel is crafted in Open Hearth Furnace, supply iron ingots and graphite in the top slots, fuel in the bottom slot, \nand it will cook slowly into steel.\nYou can also use steel from other mods or use this steel in other mods.\n", "", "left", new ArrayList<StackToDraw>() {
            {
                add(new StackToDraw(new ItemStack(BlockIDs.openFurnaceIdle.block), 20, 16));
                add(new StackToDraw(new ItemStack(BlockIDs.openFurnaceActive.block), 80, 155));
                add(new StackToDraw(new ItemStack(ItemIDs.graphite.item), 70, 135));
                add(new StackToDraw(new ItemStack(Items.iron_ingot), 90, 135));
                add(new StackToDraw(new ItemStack(Items.coal), 80, 175));
                add(new StackToDraw(new ItemStack(ItemIDs.steel.item), 120, 155));
            }
        });

		addPage("Making diesel:\nDiesel is made in a distillation tower using petroleum or oil sands found in the world.\nInsert petroleum in the top slot and fuel in the bottom slot, also try reed.\nIt will cook into liquid diesel and give you plastic with a random chance depending on the input.\nTo get diesel into canisters, you must first craft them using plastic. Then put an empty one in the top right slot.", "", "right", new ArrayList<StackToDraw>() {
			{
				add(new StackToDraw(new ItemStack(BlockIDs.distilIdle.block), 20, 16));
				add(new StackToDraw(new ItemStack(BlockIDs.distilActive.block), 150, 40));
				add(new StackToDraw(new ItemStack(BlockIDs.oreTC.block, 1, 1), 150, 20));
				add(new StackToDraw(new ItemStack(Items.coal), 150, 60));
				add(new StackToDraw(new ItemStack(ItemIDs.diesel.item), 167, 40));
				add(new StackToDraw(new ItemStack(ItemIDs.rawPlastic.item), 167, 60));
			}
		});
		addPage("Special pull I: \nYou can attach two locomotives together.\n\nTo do that: shift+click the locomotive you want to PULL with a stake in your hand. Then fuel it and wait until it heats up.\n\nNow put both locomotives in attaching mode. Then move attach them by moving one locomotive towards the other.", "", "left", new ArrayList<StackToDraw>() {
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
		addPage("Special pull II: \nLocomotives have two states: 'Can pull' and 'Can be pulled'.\n'Can pull' means that the locomotive is able to pull any attach cart. But it can't be pulled.\n'Can be pulled' means that the locomotive behaves like a cart and can be pulled by another locomotive (which is in 'can pull' state). Attached locomotives share power.", "", "right", new ArrayList<StackToDraw>() {
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
		addPage("Armors I: \nThere are several armors in the mod.\nThree of them are mostly skins (engineer, ticket man and driver) with same caracteristics as leather armor.\nOn the contrary, the composite suit is an armor with special capabilities and strong resistance and durability.\nSee next page for details.", "", "left", new ArrayList<StackToDraw>() {
			{
				add(new StackToDraw(new ItemStack(ItemIDs.hat.item), 20, 16));
				add(new StackToDraw(new ItemStack(ItemIDs.hat_ticketMan_paintable.item), 170, 16));
				add(new StackToDraw(new ItemStack(ItemIDs.hat_driver_paintable.item), 40, 165));
				add(new StackToDraw(new ItemStack(ItemIDs.jacket_driver_paintable.item), 90, 165));
				add(new StackToDraw(new ItemStack(ItemIDs.pants_driver_paintable.item), 140, 165));
			}
		});
		addPage("Armors II: \nThe helmet cures poisons, helps you breathe under water, and gives night vision in dark places (not when riding an entity)\nThe chest regen half a heart every 5s.\nThe pants protect you against fire damage.\nThe boots absorb fall damage.\n"+
				"Ticket man, driver and composite armors are paintable (in train workbench)", "", "right", new ArrayList<StackToDraw>() {
			{
				add(new StackToDraw(new ItemStack(ItemIDs.helmet_suit_paintable.item), 20, 16));
				add(new StackToDraw(new ItemStack(ItemIDs.reinforcedPlates.item), 170, 16));
			}
		});
		addPage("Generators:\nThere are three generators in the mod.\nWater wheel, Wind mill, and Diesel Generator are RF generators. Water wheel has to be placed beside flowing water. Plug kinesis pipes to the sides.\nWind mill will produce various energy amount depending on wind strength.\nFill the Diesel Generator with diesel, power it with redstone, plug some kinesis pipes.\n","","left",new ArrayList<StackToDraw>() {
					{
						add(new StackToDraw(new ItemStack(BlockIDs.windMill.block, 1, 4), 20, 16));
						add(new StackToDraw(new ItemStack(BlockIDs.waterWheel.block, 1, 4), 170, 16));
					}
				});
		addPage("Villager\n\nTraincraft adds a new villager and a train station to village generation.\n\nThe villager will trade all traincraft items with you upon various prices.\n","","right",new ArrayList<StackToDraw>() {
					{
						add(new StackToDraw(new ItemStack(ItemIDs.jacket_driver_paintable.item, 1, 4), 20, 16));
						add(new StackToDraw(new ItemStack(ItemIDs.hat_driver_paintable.item, 1, 4), 170, 16));
					}
				});
		addPage("Known bugs:\n- Sharp turns are not supported (close 180 turns)\n- When coming backwards from the Curve of a switch too slow Switchstate can be false\n- Jukebox Volume incorrect after rejoin/restart\n- Don't use 4 TC Slopes in a row!\n- TC Slopes won't work above about y=160 ",
				"", "left", new ArrayList<StackToDraw>() {
					{
						add(new StackToDraw(new ItemStack(Items.skull, 1, 4), 20, 16));
						add(new StackToDraw(new ItemStack(Items.skull, 1, 4), 170, 16));
					}
				});

		addPage("Advice:\nDue to the bounding box issues, carts have to be attached and PULLED. Don't try to push\n\nRailcraft pull system has been deactivated on Traincraft loco. Use TC's system. \n","","right",new ArrayList<StackToDraw>() {
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

		addPage("On the following pages you will find all the train workbench recipes and assembly table recipes.\nIt is however strongly suggested to try to discover the recipes by yourself...\n\nWe hope you will enjoy the mod!\n\nSpitfire4466 and MrBrutal", "", "left", new ArrayList<StackToDraw>() {
			{
				add(new StackToDraw(new ItemStack(BlockIDs.trainWorkbench.block), 20, 16));
				add(new StackToDraw(new ItemStack(ItemIDs.hat.item), 40, 155));
				add(new StackToDraw(new ItemStack(ItemIDs.jacket.item), 90, 155));
				add(new StackToDraw(new ItemStack(ItemIDs.overalls.item), 140, 155));
			}
		});
		addPage("this page was intentionally left blank, as a joke.","","right",null);
		if(recipeListWB==null || recipeListWB.size()<1){
			recipeListWB= RecipeBookHandler.workbenchListCleaner(TrainCraftingManager.getInstance().getRecipeList());
			recipeList = RecipeBookHandler.assemblyListCleaner(TierRecipeManager.getInstance().getRecipeList());
		}
		if (rightPage != null && recipeList != null && recipeListWB != null)
			bookTotalPages = this.rightPage.size() + (recipeList.size() / 2) + (recipeListWB.size() / 2);
		// Initialize recipe map for searching.
		initializeRecipeSearchMap();
	}

    public static class StackToDraw {
        private final ItemStack stack;
        private final int x;
        private final int y;

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
        this.buttonList.clear();

        int halfWidth = (this.width) / 2;
        int halfHeight = (this.height) / 2;

        this.searchBar = new GuiTextField(fontRendererObj, halfWidth + 23, ((halfHeight - bookImageHeight / 2) - 9), 100, 10);
		this.searchBar.setEnableBackgroundDrawing(false);
		this.searchBar.setFocused(true);
		this.searchBar.setCanLoseFocus(false);
		this.searchBar.setMaxStringLength(25);
		this.buttonList.add(this.buttonBack = new GuiButtonNextPage(4, halfWidth + 150, halfHeight + 80, 23, 13, true));
        this.buttonList.add(this.buttonRead = new GuiButtonNextPage(3, halfWidth - 8, halfHeight + 98, 40, 20, true));
        this.buttonList.add(this.buttonNextPage = new GuiButtonNextPage(1, halfWidth + 150, halfHeight + 80, 23, 13, true));
        this.buttonList.add(this.buttonPreviousPage = new GuiButtonNextPage(2, halfWidth - 180, halfHeight + 80, 23, 13, false));
		this.buttonList.add(this.buttonSearchPrevious = new GuiButtonRecipeSearch(5, halfWidth + 160, ((halfHeight - bookImageHeight / 2) - 10), 10, 10, GuiButtonRecipeSearch.Type.PREVIOUSRESULT));
		this.buttonList.add(this.buttonSearchNext = new GuiButtonRecipeSearch(6, halfWidth + 170, ((halfHeight - bookImageHeight / 2) - 10), 10, 10,  GuiButtonRecipeSearch.Type.NEXTRESULT));
		this.buttonList.add(this.buttonSearch = new GuiButtonRecipeSearch(7, halfWidth + 7, ((halfHeight - bookImageHeight / 2) - 10), 10, 10, GuiButtonRecipeSearch.Type.SEARCH));
        this.updateButtons();
    }

    private void updateButtons() {
        this.searchBar.setEnabled(true);
		this.searchBar.setVisible(false);
		this.buttonBack.visible = (this.currPage == bookTotalPages-1);
		this.buttonBack.showButton = true;
		this.buttonRead.visible = (this.currPage == 0);
		this.buttonRead.showButton = false;
		this.buttonNextPage.visible = (this.currPage > 0 && this.currPage < bookTotalPages - 1);
		this.buttonNextPage.showButton = (this.currPage > 0 && this.currPage < bookTotalPages - 1);
		this.buttonPreviousPage.visible = this.currPage > 0;
		this.buttonPreviousPage.showButton = this.currPage > 0;
		this.buttonSearchPrevious.visible = this.currPage > 0;
		this.buttonSearchPrevious.showButton = this.currPage > 0;
		this.buttonSearchNext.visible = this.currPage > 0;
		this.buttonSearchNext.showButton = this.currPage > 0;
		this.buttonSearch.visible = this.currPage > 0;
		this.buttonSearch.showButton = this.currPage > 0;
	}

	/**
	 * Fired when a control is clicked. This is the equivalent of ActionListener.actionPerformed(ActionEvent e).
	 */
	@Override
	protected void actionPerformed(GuiButton par1GuiButton) {
		if (par1GuiButton.enabled) {
			switch (par1GuiButton.id) {
				case 1:
					if (this.currPage < bookTotalPages - 1) {
						++this.currPage;
						this.currRecipe += 2;
					}
					break;
				case 2:
					if (this.currPage > 0) {
						--this.currPage;
						this.currRecipe -= 2;
					}
					break;
				case 3:
					if (this.currPage == 0) {
						++this.currPage;
						this.currRecipe += 2;
					}
					break;
				case 4:
					if (this.currPage == bookTotalPages - 1) {
						this.currPage = 0;
						this.currRecipe = 0;
					}
					break;
				case 5: // Previous search result.
					if (searchResultsPosition - 1 >= 0) {
						searchResultsPosition--;
						runSearch();
					}
					break;
				case 6: // Next search result.
					if (searchResultsPosition < resultIndexList.size() - 1) {
						searchResultsPosition++;
						runSearch();
					}
					break;
				case 7: // Search button (if hitting RETURN is too complicated for you).
					runSearch();
					break;
			}
			this.updateButtons();
		} else {
            return;
        }
	}

    @Override
	public void mouseClicked(int x, int y, int par3) {
		super.mouseClicked(x, y, par3);
		searchBar.mouseClicked(x, y, par3);
	}

	/**
	 * Draws the screen and all the components in it.
	 */
	@Override
	public void drawScreen(int par1, int par2, float par3) {
		String pageIndic;
		int var9;
		int var5 = (this.width) / 2;
		int bookImageHeight = 200;
        int var6 = (this.height) / 2 - bookImageHeight / 2;
		int SEARCH_BOX_X = var5;
		int SEARCH_BOX_Y = var6 - 12;
		int SEARCH_BOX_TEXT_MAX_WIDTH = 136;

		if (this.currPage > 0) {
			//GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.bookPrefix + "bookright.png"));
			this.drawTexturedModalRect(var5, var6, 0, 0, this.bookImageWidth, this.bookImageHeight + 20);
			mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.bookPrefix + "searchbar.png"));
			this.drawTexturedModalRect(SEARCH_BOX_X, SEARCH_BOX_Y, 0, 0, 192, 13);
			mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.bookPrefix + "bookleft.png"));
			var5 -= this.bookImageWidth;
			this.drawTexturedModalRect(var5, var6, 256 - this.bookImageWidth, 0, this.bookImageWidth, this.bookImageHeight);
			this.searchBar.drawTextBox();
		}
		else {
			mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.bookPrefix + "bookcover.png"));
			this.drawTexturedModalRect(var5 - 55, var6 - 15, 0, 0, 256, 256);
		}

        pageIndic = String.format(StatCollector.translateToLocal("book.pageIndicator"), new Object[]{this.currPage + 1, this.bookTotalPages});

		var9 = this.fontRendererObj.getStringWidth(pageIndic);
		if (this.currPage > 0) {
			this.fontRendererObj.drawString(pageIndic, var5 - var9 + this.bookImageWidth - 44, var6 + 7, 0);
			this.fontRendererObj.drawString(fontRendererObj.trimStringToWidth(searchBar.getText(), SEARCH_BOX_TEXT_MAX_WIDTH), SEARCH_BOX_X + 21, SEARCH_BOX_Y + 3, 0);
		}
		super.drawScreen(par1, par2, par3);

        if (this.currPage < rightPage.size()) {
            this.fontRendererObj.drawSplitString(leftPage.get(this.currPage), var5 + 36, var6 + 16 + 16, 140, 0);

            this.fontRendererObj.drawSplitString(rightPage.get(this.currPage), var5 + 250, var6 + 16 + 16, 140, 0);

            GL11.glEnable(32826);
            RenderHelper.enableGUIStandardItemLighting();
            if (this.leftPageItemStacks != null && this.leftPageItemStacks.get(this.currPage) != null && this.leftPageItemStacks.get(this.currPage).get(0) != null) {
                for (int t = 0; t < this.leftPageItemStacks.get(this.currPage).size(); t++) {
                    if (this.leftPageItemStacks.get(this.currPage).get(t) != null) {
                        renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, ((StackToDraw) this.leftPageItemStacks.get(this.currPage).get(t)).getItemStack(), var5 + ((StackToDraw) this.leftPageItemStacks.get(this.currPage).get(t)).getX(), var6 + ((StackToDraw) this.leftPageItemStacks.get(this.currPage).get(t)).getY());
                    }
                }
            }

            if (this.rightPageItemStacks != null && this.rightPageItemStacks.get(this.currPage) != null && this.rightPageItemStacks.get(this.currPage).get(0) != null) {
                for (int t = 0; t < this.rightPageItemStacks.get(this.currPage).size(); t++) {
                    if (this.rightPageItemStacks.get(this.currPage).get(t) != null) {
                        renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, ((StackToDraw) this.rightPageItemStacks.get(this.currPage).get(t)).getItemStack(), var5 + ((StackToDraw) this.rightPageItemStacks.get(this.currPage).get(t)).getX() + 210, var6 + ((StackToDraw) this.rightPageItemStacks.get(this.currPage).get(t)).getY());
                    }
                }
            }
            GL11.glDisable(32826);
        }
        if (this.currPage > rightPage.size() - 1) {
            //System.out.println((rightPage.size()*2) -1);
            int page = this.currRecipe - (rightPage.size() * 2) + 1;
            // Drawing the non-train recipes...
            if (!(page > recipeListWB.size() - 1)) {
                drawWorkBenchBackground(recipeListWB, var5, var6, 0, var9, "right");
                drawWorkBenchBackground(recipeListWB, var5, var6, 0, var9, "left");
                RenderHelper.enableGUIStandardItemLighting();
                drawWorkBenchRecipe(recipeListWB, var5, var6, page - 1, var9, "right");
                drawWorkBenchRecipe(recipeListWB, var5, var6, page, var9, "left");
            // Drawing the train recipes...
            } else if ((page - recipeListWB.size()) >= 0 && (page - recipeListWB.size()) < recipeList.size() && recipeList.get(page - recipeListWB.size()) != null) {
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
        if (page < 0) return;
        int tier = recipeList.get(page).getTier();
        if (tier == 1) mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.TEX_TIER_I));
        if (tier == 2) mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.TEX_TIER_II));
        if (tier == 3) mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.TEX_TIER_III));
        //if (side.equals("right"))
        //GL11.glScaled(0.7, 0.7, 0.7);
        if (side.equals("left")) this.drawTexturedModalRect(var5 + 70, var6 + 50, 0, 0, 177, 163);
        if (side.equals("right")) this.drawTexturedModalRect(var5 + 340, var6 + 50, 0, 0, 177, 163);
    }

    private void drawWorkBenchBackground(List<ShapedTrainRecipes> recipeListWB, int var5, int var6, int page, int var9, String side) {
        //int var4 = this.mc.renderEngine.getTexture("/gui/crafting.png");
        //GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "crafting_table.png"));
        if (side.equals("left")) this.drawTexturedModalRect(var5 + 20, var6 + 50, 0, 0, 177, 80);
        if (side.equals("right")) this.drawTexturedModalRect(var5 + 215, var6 + 50, 0, 0, 177, 80);
    }

    private void drawWorkBenchRecipe(List recipeList, int var5, int var6, int page, int var9, String side) {
        if (recipeList.get(page) == null) return;
        ItemStack[] itemList = new ItemStack[9];
        ItemStack itemOutput = null;
        if (recipeList.get(page) instanceof ShapedTrainRecipes) {
            itemList = ((ShapedTrainRecipes) recipeList.get(page)).recipeItems;
            itemOutput = ((ShapedTrainRecipes) recipeList.get(page)).getRecipeOutput();
        }

        if (recipeList.get(page) instanceof ShapelessTrainRecipe) {
            List<ItemStack> itemListShapeless = ((ShapelessTrainRecipe) recipeList.get(page)).recipeItems;
            for (int t = 0; t < itemListShapeless.size(); t++) {
                if (itemListShapeless.get(t) != null)
                    itemList[t] = itemListShapeless.get(t);
            }
            itemOutput = ((ShapelessTrainRecipe) recipeList.get(page)).getRecipeOutput();
        }

        //System.out.println(itemOutput);
        int offset = 0;
        if (side.equals("right")) offset = 194;
        GL11.glEnable(32826);
        if (itemList[0] != null) {
            renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList[0], var5 + 50 + offset, var6 + 67);
        }

        if (itemList[1] != null) {
            renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList[1], var5 + 68 + offset, var6 + 67);
        }

        if (itemList[2] != null) {
            renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList[2], var5 + 86 + offset, var6 + 67);
        }

        if (itemList[3] != null) {
            renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList[3], var5 + 50 + offset, var6 + 85);
        }

        if (itemList[4] != null) {
            renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList[4], var5 + 68 + offset, var6 + 85);
        }

        if (itemList[5] != null) {
            renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList[5], var5 + 86 + offset, var6 + 85);
        }

        if (itemList[6] != null) {
            renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList[6], var5 + 50 + offset, var6 + 103);
        }
        if (itemList[7] != null) {
            renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList[7], var5 + 68 + offset, var6 + 103);
        }

        if (itemList[8] != null) {
            renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList[8], var5 + 86 + offset, var6 + 103);
        }

        if (itemOutput != null && itemOutput.getItem() != null) {
            renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemOutput, var5 + 145 + offset, var6 + 85);
            // Draw name of recipe. Highlight in green if it contains the search query.
            this.fontRendererObj.drawString(itemOutput.getItem().getItemStackDisplayName(itemOutput), var5 + 20 + offset, var6 + 40, (!searchBar.getText().isEmpty() && itemOutput.getItem().getItemStackDisplayName(itemOutput).toLowerCase().contains(searchBar.getText().toLowerCase())) ? 0x21d12d : 0);
        }

        if (itemOutput != null) {
            this.fontRendererObj.drawString("Crafted in: Train Workbench", var5 + 20 + offset, var6 + 130, 0);

            for (int z = 0; z < RecipeBookHandler.vanillaWorkTableRecipes.length; z++) {
                if (itemOutput.getItem() != null && RecipeBookHandler.vanillaWorkTableRecipes[z] != null && RecipeBookHandler.vanillaWorkTableRecipes[z].equals(itemOutput.getItem().getItemStackDisplayName(itemOutput))) {
                    this.fontRendererObj.drawString("Also crafted in: Crafting Table", var5 + 20 + offset, var6 + 140, 0);
                    break;
                }
            }
        }

        GL11.glDisable(32826);
    }

    private void drawAssemblyRecipe(List<TierRecipe> recipeList, int var5, int var6, int page, int var9, String side) {
        if (page < 0) {
            return;
        }
        int tier = recipeList.get(page).getTier();
        
        List<ItemStack> itemList = recipeList.get(page).getInput();
        int offset = 0;
        if (side.equals("right")) offset = 271;
        GL11.glEnable(32826);

        if (itemList.get(0) != null) {
            renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList.get(0), var5 + 94 + offset, var6 + 76);
        }

        if (itemList.get(0) != null) {
            renderItem.renderItemOverlayIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList.get(0), var5 + 94 + offset, var6 + 76);
        }

        if (itemList.get(1) != null) {
            renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList.get(1), var5 + 113 + offset, var6 + 143);
        }

        if (itemList.get(1) != null) {
            renderItem.renderItemOverlayIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList.get(1), var5 + 113 + offset, var6 + 143);
        }
        if (itemList.get(2) != null) {
            renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList.get(2), var5 + 148 + offset, var6 + 143);
        }

        if (itemList.get(2) != null) {
            renderItem.renderItemOverlayIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList.get(2), var5 + 148 + offset, var6 + 143);
        }

        if (itemList.get(3) != null) {
            renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList.get(3), var5 + 214 + offset, var6 + 143);
        }

        if (itemList.get(3) != null) {
            renderItem.renderItemOverlayIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList.get(3), var5 + 214 + offset, var6 + 143);
        }

        if (itemList.get(4) != null) {
            renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList.get(4), var5 + 148 + offset, var6 + 77);
        }

        if (itemList.get(4) != null) {
            renderItem.renderItemOverlayIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList.get(4), var5 + 148 + offset, var6 + 77);
        }

        if (itemList.get(5) != null) {
            renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList.get(5), var5 + 184 + offset, var6 + 77);
        }

        if (itemList.get(5) != null) {
            renderItem.renderItemOverlayIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList.get(5), var5 + 184 + offset, var6 + 77);
        }

        if (itemList.get(6) != null) {
            renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList.get(6), var5 + 149 + offset, var6 + 110);
        }

        if (itemList.get(6) != null) {
            renderItem.renderItemOverlayIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList.get(6), var5 + 149 + offset, var6 + 110);
        }

        if (itemList.get(7) != null) {
            renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList.get(7), var5 + 185 + offset, var6 + 110);
        }

        if (itemList.get(7) != null) {
            renderItem.renderItemOverlayIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList.get(7), var5 + 185 + offset, var6 + 110);
        }

        if (itemList.get(8) != null) {
            renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList.get(8), var5 + 94 + offset, var6 + 110);
        }

        if (itemList.get(8) != null) {
            renderItem.renderItemOverlayIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList.get(8), var5 + 94 + offset, var6 + 110);
        }

        if (itemList.get(9) != null) {
            renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList.get(9), var5 + 214 + offset, var6 + 77);
        }

        if (itemList.get(9) != null) {
            renderItem.renderItemOverlayIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList.get(9), var5 + 214 + offset, var6 + 77);
        }

        ItemStack output = recipeList.get(page).getOutput();
        if (output != null) {
            if (side.equals("left")) {
                renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, output, var5 + 162, var6 + 177);
            }

            if (side.equals("right")) {
                renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, output, var5 + 432, var6 + 177);
            }
        }

        String name = "";
        if (output != null && output.getItem() instanceof ItemRollingStock) {
            name = output.getDisplayName();
        }

        // Handle highlighting of names based on search results.
        boolean drawColorHighlightFlag = name.toLowerCase().contains(searchBar.getText().toLowerCase());

        // Draw item names and tiers.
        if (side.equals("left")) {
            this.fontRendererObj.drawString("Tier: " + tier, var5 - var9 + this.bookImageWidth - 56, var6 + 40, 0);
            this.fontRendererObj.drawString(fontRendererObj.trimStringToWidth(name, 150), var5 - var9 + this.bookImageWidth - 45, var6 + 56, (!searchBar.getText().isEmpty() && drawColorHighlightFlag) ? 0x21d12d : 0xffffff);
        }

        if (side.equals("right")) {
            this.fontRendererObj.drawString(fontRendererObj.trimStringToWidth(name, 150), var5 - var9 + this.bookImageWidth + 225, var6 + 56, (!searchBar.getText().isEmpty() && drawColorHighlightFlag) ? 0x21d12d : 0xffffff);
            this.fontRendererObj.drawString("Tier: " + tier, var5 - var9 + this.bookImageWidth + 338, var6 + 40, 0);
        }
        GL11.glDisable(32826);
    }

    @Override
    public void onGuiClosed() {
        ItemRecipeBook.page = this.currPage;
        ItemRecipeBook.recipe = this.currRecipe;
        this.itemstackBook.getTagCompound().setInteger("currPage", this.currPage);
        this.itemstackBook.getTagCompound().setInteger("currRecipe", this.currRecipe);
        super.onGuiClosed();
    }

	@Override
	public boolean doesGuiPauseGame() {
		return false;
	}

	/**
	 * Handles key presses for the search bar.
	 */
	@Override
	protected void keyTyped(char eventChar, int eventKey) {
		if (eventKey == 1 || eventChar == '\u007F') { // If ESC or CTRL+Backspace...
			if (searchBar.getText().isEmpty()) { // If search query is empty, exit.
				this.mc.thePlayer.closeScreen();
			} else { // If there is a search query, clear it.
				searchBar.setText("");
				resetSearch();
			}
		}
		if (eventChar == '\r') { // If character is return...
			if (!searchBar.getText().isEmpty()) {
				if (Pattern.compile(":\\d+").matcher(searchBar.getText()).find()) {
					int newPage = Integer.parseInt(searchBar.getText().substring(1)) - 1;
					if (newPage > 0 && newPage < bookTotalPages) {
						this.currPage = newPage;
						this.currRecipe = this.currPage * 2;
						searchBar.setText("");
						resetSearch();
					}
					this.updateButtons();
				} else {
					runSearch();
				}
			}
		} else { // If character is not a backspace...
			this.searchBar.textboxKeyTyped(eventChar, eventKey);
			resetSearch();
		}
	}

	/**
	 * @author 02skaplan
	 * If search has not been completed, this method runs search with given searchQuery.
	 * If search has been completed, this method advances the search page and increments searchResultsPosition.
	 * This method also handles highlighting and darkening GUI search buttons.
	 */
	public void runSearch() {
		if (resultIndexList.isEmpty()) { // If we need to search for the query...
			for (Map.Entry<String, ArrayList<Integer>> mapEntry : recipeMapSearch(recipeIndexMap, searchBar.getText().toLowerCase()).entrySet()) {
				for (int value : mapEntry.getValue()) {
					if (!resultIndexList.contains(((value / 2) + rightPage.size())))
						resultIndexList.add(((value / 2) + rightPage.size()));
				}
			}
		}
		if (!resultIndexList.isEmpty() && searchResultsPosition < resultIndexList.size()) { // If the search is complete, display and increment result.
			if (searchResultsPosition == resultIndexList.size() - 1)
				this.buttonSearchNext.setType(GuiButtonRecipeSearch.Type.NEXTRESULT, GuiButtonRecipeSearch.Texture.INACTIVE);
			else
				this.buttonSearchNext.setType(GuiButtonRecipeSearch.Type.NEXTRESULT, GuiButtonRecipeSearch.Texture.ACTIVE);
			if (searchResultsPosition - 1 < 0)
				this.buttonSearchPrevious.setType(GuiButtonRecipeSearch.Type.PREVIOUSRESULT, GuiButtonRecipeSearch.Texture.INACTIVE);
			else
				this.buttonSearchPrevious.setType(GuiButtonRecipeSearch.Type.PREVIOUSRESULT, GuiButtonRecipeSearch.Texture.ACTIVE);
			this.currPage = resultIndexList.get(searchResultsPosition);
			this.currRecipe = this.currPage * 2;
			this.updateButtons();
		}
	}

	/**
	 * @author 02skaplan
	 */
	public void resetSearch() {
		searchResultsPosition = 0;
		resultIndexList = new ArrayList<>();
		this.buttonSearchPrevious.setType(GuiButtonRecipeSearch.Type.PREVIOUSRESULT, GuiButtonRecipeSearch.Texture.INACTIVE);
		this.buttonSearchNext.setType(GuiButtonRecipeSearch.Type.NEXTRESULT, GuiButtonRecipeSearch.Texture.INACTIVE);
	}

	public SortedMap<String, ArrayList<Integer>> recipeMapSearch(TreeMap<String, ArrayList<Integer>> fullMap, String searchQuery) {
		// Thank you, Paŭlo Ebermann, for this TreeMap partial search algorithm!
		if (!searchQuery.isEmpty()) {
			char nextLetter  = (char) (searchQuery.charAt(searchQuery.length() - 1) + 1);
			String end = searchQuery.substring(0, searchQuery.length() - 1) + nextLetter;
			return fullMap.subMap(searchQuery, end);
		}
		return fullMap;
	}

	/**
	 * @author 02skaplan
	 * Initializes the recipe map used for searching through book. Loops through both sets of recipe lists
	 * and adds each full name and each space-delimited term to the map using an ArrayList of ints to store result
	 * pages for each term.
	 */
	private void initializeRecipeSearchMap() {
		assert recipeListWB != null;
		assert recipeList != null;
		String name;
		for (int i = 0; i < recipeListWB.size(); i++) {
			name = ((ShapedTrainRecipes) recipeListWB.get(i)).getRecipeOutput().getDisplayName().toLowerCase();
			addToRecipeSearchMap(name, i);
		}
		for (int i = 0; i < recipeList.size(); i++) {
			name = recipeList.get(i).getOutput().getDisplayName().toLowerCase();
			addToRecipeSearchMap(name, i + recipeListWB.size());
		}
	}

	/**
	 * @author 02skaplan
	 * Adds a given name and asscociated terms to the recipe search map.
	 * If term is more than one word long, this adds each space-delimited element to the map for easier searching.
	 * If term is surrounded by [] or (), this removes the enclousure to allow for easier searching.
	 * @param name Localized name of recipe to add to search map.
	 * @param index Index of recipe within recipe book.
	 */
	private void addToRecipeSearchMap(String name, int index) {
		String[] nameSplit;
		ArrayList<Integer> indexList;
		// Regex pattern to capture groups surrounded by [] or ().
		Pattern removeEnclosurePattern = Pattern.compile("[\\[|\\(](.+)[\\)|\\]]");
		Matcher matcher;

		// Add raw name to map.
		if (!recipeIndexMap.containsKey(name)) {
			indexList = new ArrayList<>();
			indexList.add(index);
			recipeIndexMap.put(name, indexList);
		}
		// Add each part of split name to map.
		nameSplit = name.split(" ");
		for (String term : nameSplit) {
			// If the term is surrounded by [] or (), remove before adding to make searching easier.
			matcher = removeEnclosurePattern.matcher(term);
			if (matcher.find()) {
				if (recipeIndexMap.containsKey(matcher.group(1))) {
					indexList = recipeIndexMap.get(matcher.group(1));
					if (!indexList.contains(index)) {
						indexList.add(index);
						recipeIndexMap.put(matcher.group(1), indexList);
					}
				} else {
					indexList = new ArrayList<>();
					indexList.add(index);
					recipeIndexMap.put(matcher.group(1), indexList);
				}
			}
			// Add raw split name if not exists in map.
			if (recipeIndexMap.containsKey(term)) {
				indexList = recipeIndexMap.get(term);
				if (!indexList.contains(index)) {
					indexList.add(index);
					recipeIndexMap.put(term, indexList);
				}
			} else {
				indexList = new ArrayList<>();
				indexList.add(index);
				recipeIndexMap.put(term, indexList);
			}
		}
	}
}