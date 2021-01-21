package ebf.tim.gui;

import ebf.tim.TrainsInMotion;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.networking.PacketInteract;
import ebf.tim.registry.URIRegistry;
import ebf.tim.utility.ClientUtil;
import ebf.tim.utility.CommonUtil;
import ebf.tim.utility.ItemStackSlot;
import ebf.tim.utility.TransportSlotManager;
import fexcraft.tmt.slim.Tessellator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.ForgeHooksClient;
import org.lwjgl.opengl.GL11;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import static ebf.tim.utility.ClientUtil.drawTextOutlined;

/**
 * <h1>Transport GUI</h1>
 * used to draw the GUI for trains and rollingstock (the menu with the inventory).
 * @author Eternal Blue Flame
 */
public class GUITransport extends GUIContainerNoNEI {

    /**a reference to the host entity that this GUI is for.*/
    private static GenericRailTransport transport;
    /**a reference to the player that opened the GUI.*/
    private EntityPlayer player;
    /**the amount to scale the GUI by, same as vanilla*/
    private static final float guiScaler = 0.00390625F;
    /**the center position for the inventory render*/
    private int yCenter=0;

    public static final DecimalFormat decimal = new DecimalFormat("#.##");
    /**cache a string for more efficient use rather than concurrent adding*/
    private StringBuilder stringCache = new StringBuilder();

    private List<GUIButton> buttons = new ArrayList<>();

    /**
     * <h2>GUI initialization</h2>
     * instances the container for the inventory and passes it to the server side management
     * also puts the entity to a variable that can be accessed on client.
     * @see TransportSlotManager
     */
    public GUITransport(InventoryPlayer inventoryPlayer, GenericRailTransport entity) {
        super(new TransportSlotManager(inventoryPlayer, entity));
        player = inventoryPlayer.player;
        transport = entity;
    }

    /**Anything that uses tooltips needs to be rendered during this phase*/
    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {

        if (transport.getTankCapacity()!=null && transport.getTankCapacity().length>0) {
            renderTankerInventory(mc, mouseX, mouseY);
        }
    }

    /**we draw the GUI here so it's under the item render*/
    @Override
    protected void drawGuiContainerBackgroundLayer(float par1, int mouseX, int mouseY) {
        GL11.glPushMatrix();
        //draw the background
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

        //draw inventory slots and whatnot
        if (transport.inventory.size()>0){
            renderFreightInventory(mc,mouseX, mouseY);
        }
        if (transport instanceof EntityTrainCore){
            //draw train fluid tanks and firebox or whatever
            renderTrainInventory(mc);
        }



        //todo:there needs to be some way for custom GUI's from the train's class without breaking it's ability to be defined on server too.



        GL11.glPopMatrix();
    }


    /**
     * <h2>Draw upper layer</h2>
     * this draws the upper layer of the GUI, and handles things like the tooltips.
     * Most of this is just checking if the cursor position is in the correct place for displaying tooltips.
     * TODO: maps are disabled
     */
    @Override
    public void drawScreen(int mouseX, int mouseY, float par3){
        //call super to draw stuff like items
        super.drawScreen(mouseX, mouseY, par3);

        //draw the text that goes over everything

        drawTextOutlined(fontRendererObj, CommonUtil.translate(transport.transportName()+ ".name"), 10, -30+yCenter, 16777215);
        drawTextOutlined(fontRendererObj, I18n.format("container.inventory", new Object()), guiLeft+120, guiTop+70, 16777215);

        //draw the buttons.
        for (GUIButton b : buttons){
            b.drawButton(mouseX,mouseY);
        }
        //draw hover text;
        for (GUIButton b : buttons){
            b.drawText(mouseX,mouseY);
        }
    }


    /**
     * <h2>GUI initialization</h2>
     * the super defines the screen size and scdrawCreativeTabHoveringText("0mb/" + transport.getTankInfo(null)[i].capacity + "mb", mouseX, mouseY);ale. beyond that we just initialize th buttons and their positions
     */
    @Override
    public void initGui() {
        super.initGui();
        this.buttons=new ArrayList<>();


        yCenter = (int)((11-transport.getInventoryRows())*0.5f)*18;
        //generic to all
        if (player.getDisplayName().equals(transport.getOwnerName())) {
            this.buttons.add(new GUIButton((int)guiLeft +112, (int)guiTop + 166, 18, 18){

                @Override
                public ResourceLocation getIcon(){
                    return new ResourceLocation(TrainsInMotion.MODID, "textures/items/crowbar.png");
                }

                @Override
                public String getHoverText() {
                    return "gui.unlink";
                }


                @Override
                public void onClick() {
                    TrainsInMotion.keyChannel.sendToServer(new PacketInteract(13, transport.getEntityId()));
                }
            });
        }
        this.buttons.add(new GUIButton((int)guiLeft + 130, (int)guiTop + 166, 18, 18){

            @Override
            public ResourceLocation getIcon(){
                return new ResourceLocation(TrainsInMotion.MODID, "textures/items/transportkey.png");
            }

            @Override
            public String getHoverText() {
                return "gui.locked." + transport.getBoolean(GenericRailTransport.boolValues.LOCKED);
            }

            @Override
            public int[] getColor(){
                if(transport.getBoolean(GenericRailTransport.boolValues.LOCKED)){
                    return new int[]{150,255,150};
                }
                return null;
            }

            @Override
            public void onClick() {
                TrainsInMotion.keyChannel.sendToServer(new PacketInteract(6, transport.getEntityId()));
            }
        });

        this.buttons.add(new GUIButton((int)guiLeft + 148, (int)guiTop + 166, 18, 18){

            @Override
            public String getHoverText() {
                return "gui.coupler." +
                        (transport.getBoolean(GenericRailTransport.boolValues.COUPLINGFRONT) || transport.getBoolean(GenericRailTransport.boolValues.COUPLINGBACK));
            }

            @Override
            public int[] getColor(){
                if((transport.getBoolean(GenericRailTransport.boolValues.COUPLINGFRONT) || transport.getBoolean(GenericRailTransport.boolValues.COUPLINGBACK))){
                    return new int[]{150,255,150};
                }
                return null;
            }

            @Override
            public void onClick() {
                TrainsInMotion.keyChannel.sendToServer(new PacketInteract(7, transport.getEntityId()));
            }
        });

        this.buttons.add(new GUIButton((int)guiLeft + 238, (int)guiTop + 166, 18, 18){

            @Override
            public String getHoverText() {
                return "gui.lamp." + transport.getBoolean(GenericRailTransport.boolValues.LAMP);
            }

            @Override
            public int[] getColor(){
                if(transport.getBoolean(GenericRailTransport.boolValues.LAMP)){
                    return new int[]{255,255,60};
                }
                return null;
            }

            @Override
            public void onClick() {
                TrainsInMotion.keyChannel.sendToServer(new PacketInteract(5, transport.getEntityId()));
            }
        });

        this.buttons.add(new GUIButton((int)guiLeft + 220, (int)guiTop + 166, 18, 18){

            @Override
            public ResourceLocation getIcon(){
                return new ResourceLocation(TrainsInMotion.MODID, "textures/items/guibrake.png");
            }

            @Override
            public String getHoverText() {
                return "gui.brake." + transport.getBoolean(GenericRailTransport.boolValues.BRAKE);
            }

            @Override
            public int[] getColor(){
                if(transport.getBoolean(GenericRailTransport.boolValues.BRAKE)){
                    return new int[]{150,255,150};
                }
                return null;
            }

            @Override
            public void onClick() {
                TrainsInMotion.keyChannel.sendToServer(new PacketInteract(15, transport.getEntityId()));
            }
        });
        //train specific
        if (transport instanceof EntityTrainCore) {
            if (player.capabilities.isCreativeMode) {
                this.buttons.add(new GUIButton((int)guiLeft + 184, (int)guiTop + 166, 18, 18){

                    @Override
                    public String getHoverText() {
                        return "gui.creative." + transport.getBoolean(GenericRailTransport.boolValues.CREATIVE);
                    }

                    @Override
                    public void onClick() {
                        TrainsInMotion.keyChannel.sendToServer(new PacketInteract(10, transport.getEntityId()));
                    }
                });
            }
            if (transport.getTypes()!=null && !transport.getTypes().contains(TrainsInMotion.transportTypes.STEAM)) {
                this.buttons.add(new GUIButton((int)guiLeft + 202, (int)guiTop + 166, 18, 18){

                    @Override
                    public String getHoverText() {
                        return "gui.running." + transport.getBoolean(GenericRailTransport.boolValues.RUNNING);
                    }

                    @Override
                    public void onClick() {
                        TrainsInMotion.keyChannel.sendToServer(new PacketInteract(8, transport.getEntityId()));
                    }
                });
            }
            this.buttons.add(new GUIButton((int)guiLeft + 256, (int)guiTop + 166, 18, 18){

                @Override
                public ResourceLocation getIcon(){
                    return new ResourceLocation(TrainsInMotion.MODID, "textures/items/guiwhistle.png");
                }

                @Override
                public String getHoverText() {
                    return "gui.horn";
                }

                @Override
                public void onClick() {
                    TrainsInMotion.keyChannel.sendToServer(new PacketInteract(9, transport.getEntityId()));
                }
            });

        }
    }

    /**
     * <h2>button overrides</h2>
     * here we define the overrides for the button functionality.
     */
    @Override
    public void actionPerformed(GuiButton button) {}

    @Override
    public void mouseClicked(int mouseButton, int mouseX, int mouseY){
        for(GUIButton b :buttons){
            if(b.getMouseHover()){
                b.onClick();
                return;
            }
        }
        super.mouseClicked(mouseButton, mouseX, mouseY);
    }


    /**
     * <h2> render train inventory</h2>
     * due to how many GUI's this class covers, it's easier to just separate them by the type of transport.
     * we make this a static function for efficiency, so we have to make the function call feed the super's variables in.
     * @param mc the minecraft instance defined in the super.
     *           todo: firebox and text lighting errors, check if fluid tanks work for steam now
     */
    private void renderTrainInventory(Minecraft mc){
        //bind the inventory image which we use the slot images and inventory image from.
        mc.getTextureManager().bindTexture(ClientUtil.vanillaInventory);
        GL11.glDisable(GL11.GL_LIGHTING);
        //icon for furnace fuel
        ClientUtil.drawTexturedRect(guiLeft+113, guiTop + 1, 56, 35, 16, 16);

        //icon for furnace
        int i1 = transport.getDataWatcher().getWatchableObjectInt(13);
        if (i1>0) {
            ClientUtil.drawTexturedRect(guiLeft + 113, guiTop + 16 - i1, 176, 14 - i1, 16, i1);
        }

        drawTextOutlined(fontRendererObj, "burn time: " + transport.getDataWatcher().getWatchableObjectInt(13), 10, 70, 16777215);
        drawTextOutlined(fontRendererObj, "boiler heat: " + transport.getDataWatcher().getWatchableObjectFloat(16), 10, 80, 16777215);
        GL11.glEnable(GL11.GL_LIGHTING);
    }


    /**
     * <h2>Render Passenger GUI</h2>
     * basically the same as
     * todo: set this up just to render the passenger icons and empty seats above the player inventory
     */
    private void renderPassengerInventory(Minecraft mc){

        int rows=0;
        //draw the character backgrounds.
        mc.getTextureManager().bindTexture(ClientUtil.vanillaInventory);
        //make a loop that will make a new row every 5 items
        for (int i=0;i<transport.getRiderOffsets().length; i++) {
            if (i/(rows+1) >=5*(rows+1)){
                rows++;
            }
            ClientUtil.drawTexturedRect(guiLeft + 7 + (30*(i-(rows * 5))), guiTop + 30+(30*rows), 54, 51, 27, 27, 20, 20);
        }
        //make a new loop that does the same as above but binds the character's face rather than the inventory slot background.
        for (int i=0;i<transport.getRiderOffsets().length; i++) {
            if (i/(rows+1) >=5*(rows+1)){
                rows++;
            }
            if (i==0 && transport.riddenByEntity instanceof AbstractClientPlayer){
                mc.getTextureManager().bindTexture(((AbstractClientPlayer) transport.riddenByEntity).getLocationSkin());
                ClientUtil.drawTexturedRect(guiLeft + 10 + (30*(i-(rows * 5))), guiTop + 32+(30*rows), 30, 70, 22, 22, 36, 56);
            } else if (i>0 && transport.seats.get(i-1).riddenByEntity instanceof AbstractClientPlayer){
                mc.getTextureManager().bindTexture(((AbstractClientPlayer) transport.seats.get(i-1).riddenByEntity).getLocationSkin());
                ClientUtil.drawTexturedRect(guiLeft + 10 + (30*(i-(rows * 5))), guiTop + 32+(30*rows), 30, 70, 22, 22, 36, 56);
            }
        }

    }

    /**
     * <h2>Render Freight GUI</h2>
     * NOTE: this is only designed for inventory sized with 9 columns.
     */
    private void renderFreightInventory(Minecraft mc, int mouseX, int mouseY){
        mc.getTextureManager().bindTexture(ClientUtil.vanillaChest);
        GL11.glDisable(GL11.GL_LIGHTING);
        //draw the player inventory and toolbar background.
        if(transport.getInventoryRows()>0) {
            ClientUtil.drawTexturedRect(guiLeft - 105, guiTop - 37 + yCenter, 0, 0, 176, 17);//top
            for (int i = 0; i < transport.getInventoryRows(); i++) {
                ClientUtil.drawTexturedRect(guiLeft - 105, i * 18 + (guiTop - 20) + yCenter, 0, 17, 176, 18);
            }
            ClientUtil.drawTexturedRect(guiLeft - 105, (transport.getInventoryRows()) * 18 + (guiTop - 20) + yCenter, 0, 215, 176, 8);//bottom
        }
        ClientUtil.drawTexturedRect(guiLeft+105, guiTop+64, 0, 0, 176,  16);//top
        ClientUtil.drawTexturedRect(guiLeft+105,   guiTop+70, 0, 126, 176, 96);//actual inventory



        if((((TransportSlotManager)this.inventorySlots).inventory)!=null) {
            List<ItemStack> slots = new ArrayList<>();
            List<ItemStack> overlays = new ArrayList<>();
            List<Integer> slotx = new ArrayList<>();
            List<Integer> sloty = new ArrayList<>();
            for (ItemStackSlot s : (((TransportSlotManager) this.inventorySlots).inventory)) {
                if(s.getSlotIndex()>=400) {
                    slots.add(s.getStack());
                    overlays.add(s.getOverlay());
                    slotx.add(s.xDisplayPosition);
                    sloty.add(s.yDisplayPosition);
                }

            }

            GL11.glPushMatrix();
            GL11.glEnable(GL11.GL_TEXTURE_2D);
            GL11.glDisable(GL11.GL_LIGHTING);
            GL11.glColor4f(1, 1, 1, 1);
            ClientUtil.drawSlots(slots, overlays, slotx, sloty, mouseX, mouseY,guiLeft,guiTop, itemRender);
            GL11.glPopMatrix();
        }

    }


    /**
     * <h2>Render Tanker GUI</h2>
     * basically the same as
     * todo: have this render the fluids in a column similar to inventory rows.
     */
    private void renderTankerInventory(Minecraft mc, int mouseX, int mouseY){
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);

        if(transport.getTankCapacity()!=null){
            float liquid=0;
            for(int i=0; i<transport.getTankCapacity().length;i++) {
                //System.out.println(transport.getTankInfo(null).length + ":" + transport.getTankCapacity().length +":" +i);
                //draw the player inventory and toolbar background.
                Tessellator.bindTexture(URIRegistry.GUI_PREFIX.getResource("gui.png"));
                ClientUtil.drawTexturedRect(186, 40 + (-20 * i), 16, 0, 90, 18, 16, 16);

                if (transport.getTankInfo(null)[i] != null && transport.getTankInfo(null)[i].fluid.amount > 0) {
                    liquid = transport.getTankInfo(null)[i].fluid.amount;
                    if (liquid != 0) {
                        liquid /= transport.getTankInfo(null)[i].capacity;
                    }
                    GL11.glPushMatrix();

                    GL11.glColor4f(1, 1, 1, 0.5f);
                    GL11.glTranslatef(186, 40 + (-20 * i), 0);
                    GL11.glScalef(0.125f + liquid, 1.125f, 1);
                    //render fluid overlay
                    if (!ForgeHooksClient.renderInventoryItem(RenderBlocks.getInstance(), mc.renderEngine,
                            new ItemStack(Item.getItemFromBlock(transport.getTankInfo(null)[i].fluid.getFluid().getBlock())),
                            true, zLevel, 0, 0)) {
                        RenderItem.getInstance().renderItemIntoGUI(fontRendererObj, mc.renderEngine,
                                new ItemStack(Item.getItemFromBlock(transport.getTankInfo(null)[i].fluid.getFluid().getBlock())), 0, 0, true);
                    }
                    GL11.glTranslatef(16, 0, 0);
                    if (!ForgeHooksClient.renderInventoryItem(RenderBlocks.getInstance(), mc.renderEngine,
                            new ItemStack(Item.getItemFromBlock(transport.getTankInfo(null)[i].fluid.getFluid().getBlock())),
                            true, zLevel, 0, 0)) {
                        RenderItem.getInstance().renderItemIntoGUI(fontRendererObj, mc.renderEngine,
                                new ItemStack(Item.getItemFromBlock(transport.getTankInfo(null)[i].fluid.getFluid().getBlock())), 0, 0, true);
                    }
                    GL11.glTranslatef(16, 0, 0);
                    if (!ForgeHooksClient.renderInventoryItem(RenderBlocks.getInstance(), mc.renderEngine,
                            new ItemStack(Item.getItemFromBlock(transport.getTankInfo(null)[i].fluid.getFluid().getBlock())),
                            true, zLevel, 0, 0)) {
                        RenderItem.getInstance().renderItemIntoGUI(fontRendererObj, mc.renderEngine,
                                new ItemStack(Item.getItemFromBlock(transport.getTankInfo(null)[i].fluid.getFluid().getBlock())), 0, 0, true);
                    }
                    GL11.glTranslatef(16, 0, 0);
                    if (!ForgeHooksClient.renderInventoryItem(RenderBlocks.getInstance(), mc.renderEngine,
                            new ItemStack(Item.getItemFromBlock(transport.getTankInfo(null)[i].fluid.getFluid().getBlock())),
                            true, zLevel, 0, 0)) {
                        RenderItem.getInstance().renderItemIntoGUI(fontRendererObj, mc.renderEngine,
                                new ItemStack(Item.getItemFromBlock(transport.getTankInfo(null)[i].fluid.getFluid().getBlock())), 0, 0, true);
                    }
                    GL11.glTranslatef(16, 0, 0);
                    if (!ForgeHooksClient.renderInventoryItem(RenderBlocks.getInstance(), mc.renderEngine,
                            new ItemStack(Item.getItemFromBlock(transport.getTankInfo(null)[i].fluid.getFluid().getBlock())),
                            true, zLevel, 0, 0)) {
                        RenderItem.getInstance().renderItemIntoGUI(fontRendererObj, mc.renderEngine,
                                new ItemStack(Item.getItemFromBlock(transport.getTankInfo(null)[i].fluid.getFluid().getBlock())), 0, 0, true);
                    }

                    GL11.glDisable(GL11.GL_LIGHTING);
                    GL11.glColor4f(1, 1, 1, 1);

                    GL11.glPopMatrix();
                }
            }
        }


        for(int i=0; i<transport.getTankInfo(null).length;i++) {
            if(isMouseInRect(mouseX, mouseY,(int)guiLeft+186, (int)guiTop+40+(-20*i), 90, 18)) {
                if (transport.getTankInfo(null)[i].fluid.amount>0) {
                    drawCreativeTabHoveringText(transport.getTankInfo(null)[i].fluid.getLocalizedName() + " " +
                                    transport.getTankInfo(null)[i].fluid.amount+"mb/"+ transport.getTankInfo(null)[i].capacity+"mb", mouseX-(int)guiLeft, mouseY-(int)guiTop);

                } else {
                    if (transport.getTankFilters()!=null && transport.getTankFilters().length>i && transport.getTankFilters()[i]!=null && transport.getTankFilters()[i].length>0) {
                        drawCreativeTabHoveringText(transport.getTankFilters()[i][0] + ", 0mb/" + transport.getTankInfo(null)[i].capacity + "mb", mouseX-(int)guiLeft, mouseY-(int)guiTop);
                    }else{
                        drawCreativeTabHoveringText(", 0mb/" + transport.getTankInfo(null)[i].capacity + "mb", mouseX-(int)guiLeft, mouseY-(int)guiTop);

                    }
                }
            }
        }

        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glColor4f(1,1,1,1);
        GL11.glDisable(GL11.GL_BLEND);
    }

/** checks if mouse cursor is within a specified rectangle*/
    public static boolean isMouseInRect(int mouseX, int mouseY, int x, int y, int width, int height){
        return (mouseY >= y && mouseY <= y+height) && (mouseX >= x && mouseX <= x+width);
    }

    /** call super method for when the mouse is moved up or down */
    protected void mouseMovedOrUp(int p_146286_1_, int p_146286_2_, int p_146286_3_) {
        super.mouseMovedOrUp(p_146286_1_, p_146286_2_, p_146286_3_);
    }



}