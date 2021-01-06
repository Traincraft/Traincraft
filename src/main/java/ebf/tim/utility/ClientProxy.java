package ebf.tim.utility;


import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import ebf.tim.blocks.TileEntityStorage;
import ebf.tim.blocks.rails.RailShapeCore;
import ebf.tim.entities.EntityBogie;
import ebf.tim.entities.EntitySeat;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.gui.*;
import ebf.tim.items.ItemCraftGuide;
import ebf.tim.items.ItemPaintBucket;
import ebf.tim.items.ItemRail;
import ebf.tim.render.RenderWagon;
import ebf.tim.render.models.ModelBallast;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

/**
 * <h1>client proxy</h1>
 * defines some of the more important client-only functionality that runs on the main thread of the mod.
 * @author Eternal Blue Flame
 */
public class ClientProxy extends CommonProxy {

    public static double[][] devSplineModification = {{0,0,0},{0,0,0},{0,0,0},{0,0,0}};
    public static int devSplineCurrentPoint=0;
    /**Instance the event handler, This is used for event based functionality, things like when you right-click an entity.*/
    public static EventManager eventManager = new EventManager();

    /*
     * <h3>keybinds</h3>
     * Initialize the default values for keybinds.
     * Default values courtesy of Ferdinand
     */
    /**whether or not smoke and steam should be enabled*/
    public static boolean EnableParticles = true;
    /**whether or not animations should be enabled*/
    public static boolean EnableAnimations = true;
    /**whether or not to force texture binding*/
    public static boolean ForceTextureBinding = false;
    /**defines if the inventory graphics should be loaded from a TiM URI or if vanilla graphics should be used*/
    public static boolean useVanillaInventoryTextures = true;
    /**enables 3d items for trains and stock*/
    public static boolean hdTransportItems = true;
    /*enables pre-render of models*/
    public static boolean preRenderModels = false;
    /**the keybind for the lamp toggle*/
    public static KeyBinding KeyLamp = new KeyBinding("Lamp Toggle", Keyboard.KEY_L, "Trains in Motion");
    /**the keybind for the horn/whistle*/
    public static KeyBinding KeyHorn = new KeyBinding("Use Horn/Whistle", Keyboard.KEY_H, "Trains in Motion");
    /**the keybind for opening the inventory*/
    public static KeyBinding KeyInventory = new KeyBinding("Open Train/rollingstock GUI",  Keyboard.KEY_I, "Trains in Motion");
    /**the model to use for the rail*/
    public static int railSkin = 3;
    /**toggles whether to show speed in km/h or mph*/
    public static boolean speedInKmh = true;

    public static boolean disableCache = false;

    public static KeyBinding raildevtoolUp, raildevtoolDown,
            raildevtoolLeft, raildevtoolRight, raildevtoolRaise, raildevtoolLower;

    public static KeyBinding raildevtoolNextPoint, raildevtoolLastPoint;

    public static KeyBinding raildevtoolQuality;

    /**Decides whether to use Traincraft or TiM assembly tables. */
    public static boolean isTraincraft = true;

    /**
     * <h2> Client GUI Redirect </h2>
     *
     * Mostly a redirect between the event handler and the actual GUI
     *
     * defines the GUI element to display based on the ID
     * returns null if the player, cart or ID is invalid
     *
     * the inventory manager that server uses for this menu is defined in
     * @see CommonProxy#getServerGuiElement(int, EntityPlayer, World, int, int, int)
     */
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (player != null) {
            if(x==0&&y==0&&z==0 && player.getHeldItem()!=null) {
                if (player.getHeldItem().getItem() instanceof ItemCraftGuide) {
                    return new GUICraftBook();
                } else if (player.getHeldItem().getItem() instanceof ItemPaintBucket){
                    return new GUIPaintBucket((GenericRailTransport) player.worldObj.getEntityByID(ID));
                }
            }
            //Trains
            if (player.worldObj.getEntityByID(ID) instanceof GenericRailTransport && !((GenericRailTransport) player.worldObj.getEntityByID(ID)).hasCustomGUI()) {
                return new GUITransport(player.inventory, (GenericRailTransport) player.worldObj.getEntityByID(ID));
                //tile entities
            } else if (player.worldObj.getTileEntity(x,y,z) instanceof TileEntityStorage) {
                return new GUITrainTable(player.inventory, player.worldObj, x, y, z);
            }
        }
        return null;
    }

    @Override
    public void adminGui(String datacsv){
        Minecraft.getMinecraft().displayGuiScreen(new GUIAdminBook(datacsv));
    };

    @Override
    public boolean isClient(){return true;}

    /**
     * <h2>Load config</h2>
     * this loads the config values that will only effect client.
     */
    @Override
    public void loadConfig(FMLPreInitializationEvent event){
        super.loadConfig(event);

        Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();
        config.addCustomCategoryComment("Quality (Client only)", "");
        EnableParticles = config.getBoolean("EnableParticles","Quality (Client only)", true,
                "Smoke, steam, sparks, and lighting effects are several hundred more lightweight than those of normal minecraft. These shouldn't cause much lag if any, but its client only so if you wanna disable it you can.");


        EnableAnimations = config.getBoolean("EnableAnimations","Quality (Client only)", true,
                "Animations are calculated by vector positioning and rotation every frame. These shouldn't cause much lag if any, but its client only so if you wanna disable it you can.");

        useVanillaInventoryTextures = config.getBoolean("UseVanillaInventoryTextures","Quality (Client only)", true,
                "Overrides the render of train and rollingstock inventories to use textures from vanilla (including resourcepacks), so you can use textures in a texturepack specifically for this mod");

        hdTransportItems = config.getBoolean("3dTransportItems","Quality (Client only)", true,
                "Overrides the render of train and rollingstock items to use their full model. NOTICE: after the pre-alpha stages this should default to false.");

        preRenderModels = config.getBoolean("preRenderModels","Quality (Client only)", false,
                "Pre-renders transport entity and item models during loading screen and stores them on GPU, Requires a lot of VRAM but makes the game run smoother, Don't use if get the GL error 1285 (Out of memory)");

        disableCache = config.getBoolean("disableGLCache","Quality (Client only)", false,
                "forces the render to skip model caching, this will cause significant lag, but is good for debugging, or if you get the GL error 1285 (Out of memory)");

        ForceTextureBinding = config.getBoolean("ForceTextureBinding","Quality (Client only)", false,
                "Forces textures to be bound, slows performance on some machines, speeds it up on others, and fixes a rare bug where the the texture does not get bound. So... This REALLY depends on your machine, see what works best for you.");

        speedInKmh = config.getBoolean("SpeedInKmh","Quality (Client only)", true,
                "Sets the HUD to show speeds in km/h. set to false for mph");


        railSkin = config.getInt("railSkin","Quality (Client only)", 3,0,3,
                "Defines the rail model to use. 0: flat 2D rail similar to vanilla. 1: basic 3D rail similar to an extruded 2D. 2: Normal 3D rail. 3: High detail 3D rail");

        config.addCustomCategoryComment("Keybinds (Client only)", "accepted values can be set from in-game, or defined using the key code values from: http://minecraft.gamepedia.com/Key_codes");

        KeyLamp.setKeyCode(config.getInt("LampKeybind", "Keybinds (Client only)", Keyboard.KEY_L, 0, 0, ""));
        KeyHorn.setKeyCode(config.getInt("HornKeybind", "Keybinds (Client only)", Keyboard.KEY_H, 0, 0, ""));
        KeyInventory.setKeyCode(config.getInt("InventoryKeybind", "Keybinds (Client only)", Keyboard.KEY_I, 0, 0, ""));

        config.save();

        configDirectory = event.getModConfigurationDirectory().getAbsolutePath();


    }

    public static int WAILA_BGCOLOR = 1048592,WAILA_GRADIENT1 = 5243135,WAILA_GRADIENT2 = 2621567,WAILA_ALPHA = 0xEE,WAILA_FONTCOLOR=10526880;
    /**
     * <h2>Client Register</h2>
     * Used for registering client only functions and redirecting registering the items in the train registry with their own textures and models.
     */
    @Override
    public void register() {
        super.register();
        //bogies
        RenderingRegistry.registerEntityRenderingHandler(EntityBogie.class, nullRender);
        //seats
        RenderingRegistry.registerEntityRenderingHandler(EntitySeat.class, nullRender);
        //hitboxes
        RenderingRegistry.registerEntityRenderingHandler(HitboxDynamic.collisionBox.class, nullRender);
        //player scaler
        RenderingRegistry.registerEntityRenderingHandler(EntityPlayer.class, playerRender);



        //keybinds
        ClientRegistry.registerKeyBinding(KeyLamp);
        ClientRegistry.registerKeyBinding(KeyInventory);

        if(DebugUtil.dev()) {
            raildevtoolUp = new KeyBinding("Move Point Z+", Keyboard.KEY_UP, "Trains in Motion Dev");
            raildevtoolDown = new KeyBinding("Move Point Z-", Keyboard.KEY_DOWN, "Trains in Motion Dev");
            raildevtoolLeft = new KeyBinding("Move Point X+", Keyboard.KEY_LEFT, "Trains in Motion Dev");
            raildevtoolRight = new KeyBinding("Move Point X-", Keyboard.KEY_RIGHT, "Trains in Motion Dev");
            raildevtoolRaise = new KeyBinding("Move Point Y+", Keyboard.KEY_PRIOR, "Trains in Motion Dev");
            raildevtoolLower = new KeyBinding("Move Point Y-", Keyboard.KEY_NEXT, "Trains in Motion Dev");

            raildevtoolNextPoint = new KeyBinding("Next Point", Keyboard.KEY_ADD, "Trains in Motion Dev");
            raildevtoolLastPoint = new KeyBinding("Previous Point", Keyboard.KEY_SUBTRACT, "Trains in Motion Dev");

            raildevtoolQuality = new KeyBinding("Track Model Quality", Keyboard.KEY_DIVIDE, "Trains in Motion Dev");


            ClientRegistry.registerKeyBinding(raildevtoolUp);
            ClientRegistry.registerKeyBinding(raildevtoolDown);
            ClientRegistry.registerKeyBinding(raildevtoolLeft);
            ClientRegistry.registerKeyBinding(raildevtoolRight);
            ClientRegistry.registerKeyBinding(raildevtoolRaise);
            ClientRegistry.registerKeyBinding(raildevtoolLower);
            ClientRegistry.registerKeyBinding(raildevtoolNextPoint);
            ClientRegistry.registerKeyBinding(raildevtoolLastPoint);
            ClientRegistry.registerKeyBinding(raildevtoolQuality);
        }




        //register the transport HUD.
        HUDTrain hud = new HUDTrain();
        FMLCommonHandler.instance().bus().register(hud);
        MinecraftForge.EVENT_BUS.register(hud);

    }

    @Override
    public Object getTESR(){return specialRenderer;}

    @Override
    public Render getEntityRender(){return transportRenderer;}
    @Override
    public Object getNullRender(){return nullRender;}


    public static final TileEntitySpecialRenderer specialRenderer = new TileEntitySpecialRenderer() {
        @Override
        public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float p_147500_8_) {
            GL11.glPushMatrix();
            GL11.glTranslated(x,y, z);
            tileEntity.func_145828_a(null);
            GL11.glPopMatrix();
        }

        @Override
        protected void bindTexture(ResourceLocation p_147499_1_){}
    };

    public class railItemRederer extends ItemRenderer{
        public railItemRederer(Minecraft p_i1247_1_) {
            super(p_i1247_1_);
        }
        @Override
        public void renderItem(EntityLivingBase p_78443_1_, ItemStack p_78443_2_, int p_78443_3_, IItemRenderer.ItemRenderType type) {
            if(p_78443_2_.getItem() instanceof ItemRail){
                if(p_78443_2_.getTagCompound().hasKey("ballast")){
                    RailShapeCore p = new RailShapeCore();
                    p.activePath.add(new Vec6f(-0.5f,0f,0f,0,0));
                    p.activePath.add(new Vec6f(0.5f,0f,0f,0,0));
                    p.gauge=new int[]{375};
                    ModelBallast.modelPotatoBallast(p,0.5f,-0.5f, 1f,
                            ItemStack.loadItemStackFromNBT(p_78443_2_.getTagCompound().getCompoundTag("ballast")));
                }
            }

        }
    }

    public static final RenderWagon transportRenderer = new RenderWagon();

    /**
     * <h3>null render</h3>
     * this is just a simple render that never draws anything, since its static it only ever needs to exist once, which makes it lighter on the render.
     */
    private static final Render nullRender = new Render() {
        @Override
        public void doRender(Entity p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_) {}

        @Override
        protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
            return null;
        }
    };

    private static final RenderPlayer playerRender= new RenderPlayer(){
        GenericRailTransport t;
        @Override
        public void doRender(AbstractClientPlayer p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_){
            if (p_76986_1_.ridingEntity instanceof GenericRailTransport) {
                t=(GenericRailTransport) p_76986_1_.ridingEntity;
                GL11.glPushMatrix();
                GL11.glScalef(t.getPlayerScale(), t.getPlayerScale(), t.getPlayerScale());
                super.doRender(p_76986_1_, p_76986_2_, p_76986_4_, p_76986_6_, p_76986_8_, p_76986_9_);
                GL11.glPopMatrix();

            } else if (p_76986_1_.ridingEntity instanceof EntitySeat){
                t=(GenericRailTransport) p_76986_1_.worldObj.getEntityByID(((EntitySeat) p_76986_1_.ridingEntity).parentId);
                GL11.glPushMatrix();
                GL11.glScalef(t.getPlayerScale(), t.getPlayerScale(), t.getPlayerScale());
                if(p_76986_1_.ridingEntity.getLookVec() !=null) {
                    GL11.glRotated(p_76986_1_.ridingEntity.getLookVec().xCoord, 0, 1, 0);
                    GL11.glRotated(p_76986_1_.ridingEntity.getLookVec().yCoord, 0, 0, 1);
                    GL11.glRotated(p_76986_1_.ridingEntity.getLookVec().zCoord, 1, 0, 0);
                }
                super.doRender(p_76986_1_, p_76986_2_, p_76986_4_, p_76986_6_, p_76986_8_, p_76986_9_);
                GL11.glPopMatrix();

            } else {
                super.doRender(p_76986_1_, p_76986_2_, p_76986_4_, p_76986_6_, p_76986_8_, p_76986_9_);
            }
        }
    };
}
