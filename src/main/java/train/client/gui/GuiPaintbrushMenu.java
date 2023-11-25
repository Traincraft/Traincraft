package train.client.gui;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;
import train.client.render.RenderRollingStock;
import train.common.Traincraft;
import train.common.api.AbstractTrains;
import train.common.api.EntityRollingStock;
import train.common.api.TrainRecord;
import train.common.core.handlers.ConfigHandler;
import train.common.core.network.PacketPaintbrushColor;
import train.common.core.network.PacketTextureOverlayConfig;
import train.common.library.GuiIDs;
import train.common.library.Info;
import train.common.overlaytexture.OverlayTextureManager;

import java.lang.reflect.InvocationTargetException;
import java.util.Collections;

/**
 * @author 02skaplan
 * <p>GUI for Paintbrush</p>
 */
@SuppressWarnings("unchecked")
@SideOnly(Side.CLIENT)
public class GuiPaintbrushMenu extends GuiScreen {
    private final EntityPlayer editingPlayer;
    private final EntityRollingStock rollingStock;
    private float yaw = 0.0f;
    final private int MENU_TEXTURE_WIDTH = 206;
    final private int MENU_TEXTURE_HEIGHT = 200;
    final private int RESULTS_PER_PAGE = 3;
    /**
     * X-coordinate of top left of GUI.
     */
    private int GUI_ANCHOR_X;
    /**
     * X-coordinate of top center of GUI.
     */
    private int GUI_ANCHOR_MID_X;
    /**
     * Y-coordinate of top left of GUI.
     */
    private int GUI_ANCHOR_Y;
    private boolean hasNextTexture;
    private boolean hasPreviousTexture;

    private GuiButtonPaintbrushMenu arrowLeft;
    private GuiButtonPaintbrushMenu arrowRight;
    private GuiButtonPaintbrushMenu textureOne;
    private GuiButtonPaintbrushMenu textureTwo;
    private GuiButtonPaintbrushMenu textureThree;
    private GuiButtonPaintbrushOverlayController overlayControllerNone;
    private GuiButtonPaintbrushOverlayController overlayControllerDynamic;
    private GuiButtonPaintbrushOverlayController overlayControllerFixed;
    private GuiButtonPaintbrushMenu closeMenuButton;
    private GuiButtonPaintbrushMenu playPauseButton;
    private GuiButtonPaintbrushMenu renderModelsButton;
    private boolean renderModels;
    private boolean disableLighting = true;
//    private int optionsOnCurrentPage;
    private final int totalOptions;
    private int currentDisplayTexture = 0;
    private final AbstractTrains renderEntity;
    private final TrainRecord record;
    private boolean doAnimation;
    ResourceLocation rightMenuTexture = new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "gui_paintbrush_menu_right.png");
    ResourceLocation leftMenuTexture = new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "gui_paintbrush_menu_left.png");
    ResourceLocation overlayBarTexture = new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "gui_paintbrush_overlay_controller.png");

    public GuiPaintbrushMenu(EntityPlayer editingPlayer, EntityRollingStock rollingStock) {
        this.editingPlayer = editingPlayer;
        this.rollingStock = rollingStock;
        try {
            renderEntity = rollingStock.getClass().getConstructor(new Class[]{ World.class }).newInstance(rollingStock.worldObj);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        record = rollingStock.getSpec();
        totalOptions = rollingStock.getSpec().getLiveries().size();
        for (int i = 0; i < totalOptions; i++) { // Set page to the page with the currently selected texture.
            if (record.getLiveries().get(i).equals(rollingStock.getColor())) {
                currentDisplayTexture = i;
                break;
            }
        }
        doAnimation = true;
        renderModels = !ConfigHandler.PAINTBRUSH_DEFAULT_LOW_PERFORMANCE_MODE;
    }

    /**
     * Initial setup for buttons and GUI anchors.
     */
    @Override
    public void initGui() {
        GUI_ANCHOR_MID_X = (this.width) / 2;
        if (!rollingStock.acceptsOverlayTextures()) {
            GUI_ANCHOR_Y = (this.height) / 2 - ((MENU_TEXTURE_HEIGHT) / 2);
        } else {
            GUI_ANCHOR_Y = (this.height) / 2 - ((MENU_TEXTURE_HEIGHT) / 2) - (38 / 2);
        }
        GUI_ANCHOR_X = GUI_ANCHOR_MID_X - MENU_TEXTURE_WIDTH;
        this.buttonList.clear();
        this.buttonList.add(this.arrowLeft = new GuiButtonPaintbrushMenu(0, GUI_ANCHOR_X + 5, GUI_ANCHOR_Y + 79, 38, 12, GuiButtonPaintbrushMenu.Type.ARROWLEFT));
        this.buttonList.add(this.arrowRight = new GuiButtonPaintbrushMenu(1, GUI_ANCHOR_X + 370, GUI_ANCHOR_Y + 79, 38, 12, GuiButtonPaintbrushMenu.Type.ARROWRIGHT));
        this.buttonList.add(this.renderModelsButton = new GuiButtonPaintbrushMenu(2, GUI_ANCHOR_X + 382, GUI_ANCHOR_Y + MENU_TEXTURE_HEIGHT - 53, 22, 22, GuiButtonPaintbrushMenu.Type.STOPRENDER));

        this.buttonList.add(this.textureOne = new GuiButtonPaintbrushMenu(3, GUI_ANCHOR_X + 70, GUI_ANCHOR_Y + 42, 85, 85, GuiButtonPaintbrushMenu.Type.SELECTIONBOX));
        this.buttonList.add(this.textureTwo = new GuiButtonPaintbrushMenu(4, GUI_ANCHOR_X + 164, GUI_ANCHOR_Y + 42, 85, 85, GuiButtonPaintbrushMenu.Type.SELECTIONBOX));
        this.buttonList.add(this.textureThree = new GuiButtonPaintbrushMenu(5, GUI_ANCHOR_X + 258, GUI_ANCHOR_Y + 42, 85, 85, GuiButtonPaintbrushMenu.Type.SELECTIONBOX));
        this.buttonList.add(this.overlayControllerNone = new GuiButtonPaintbrushOverlayController(11, GUI_ANCHOR_X + 121, GUI_ANCHOR_Y + 202, 29, 29, GuiButtonPaintbrushOverlayController.Type.NONE));
        this.buttonList.add(this.overlayControllerDynamic = new GuiButtonPaintbrushOverlayController(12, GUI_ANCHOR_X + 179, GUI_ANCHOR_Y + 202, 56, 29, GuiButtonPaintbrushOverlayController.Type.DYNAMIC));
        this.buttonList.add(this.overlayControllerFixed = new GuiButtonPaintbrushOverlayController(13, GUI_ANCHOR_X + 264, GUI_ANCHOR_Y + 202, 29, 29, GuiButtonPaintbrushOverlayController.Type.FIXED));
        this.buttonList.add(this.closeMenuButton = new GuiButtonPaintbrushMenu(14, GUI_ANCHOR_X + 382, GUI_ANCHOR_Y + 10, 22, 22, GuiButtonPaintbrushMenu.Type.CLOSE));
        this.buttonList.add(this.playPauseButton = new GuiButtonPaintbrushMenu(15, GUI_ANCHOR_X + 382, GUI_ANCHOR_Y + MENU_TEXTURE_HEIGHT - 29, 22, 22, GuiButtonPaintbrushMenu.Type.PLAY));
        this.updateButtons();
    }

    private void updateButtons() {
        hasPreviousTexture = currentDisplayTexture != 0;
        hasNextTexture = currentDisplayTexture != rollingStock.getSpec().getLiveries().size() - 1;
        this.arrowLeft.visible = (currentDisplayTexture != 0);
        this.arrowLeft.showButton = (currentDisplayTexture != 0);
        this.arrowRight.visible = hasNextTexture;
        this.arrowRight.showButton = hasNextTexture;
        this.textureOne.showButton = hasPreviousTexture;
        this.textureOne.visible = hasPreviousTexture;
        this.textureTwo.showButton = true;
        this.textureTwo.visible = true;
        textureTwo.setType(GuiButtonPaintbrushMenu.Type.SELECTIONBOX, GuiButtonPaintbrushMenu.Texture.ACTIVE);
        this.textureThree.showButton = hasNextTexture;
        this.textureThree.visible = hasNextTexture;
        this.closeMenuButton.visible = true;
        this.closeMenuButton.showButton = true;
        this.playPauseButton.visible = renderModels;
        this.playPauseButton.showButton = renderModels;
        this.playPauseButton.setType(doAnimation ? GuiButtonPaintbrushMenu.Type.PLAY : GuiButtonPaintbrushMenu.Type.PAUSE, playPauseButton.getTexture());

        this.renderModelsButton.visible = true;
        this.renderModelsButton.showButton = true;

        // Overlay Texture Buttons
        if (rollingStock.acceptsOverlayTextures()) {
            this.overlayControllerNone.visible = rollingStock.acceptsOverlayTextures();
            this.overlayControllerNone.showButton = rollingStock.acceptsOverlayTextures();
            this.overlayControllerDynamic.visible = true;
            this.overlayControllerDynamic.showButton = true;
            this.overlayControllerFixed.visible = true;
            this.overlayControllerFixed.showButton = true;
            OverlayTextureManager.Type acceptedType = rollingStock.getOverlayTextureContainer().getAcceptedType();
            OverlayTextureManager.Type type = rollingStock.getOverlayTextureContainer().getType();
            if (type == OverlayTextureManager.Type.NONE)
                this.overlayControllerNone.setType(GuiButtonPaintbrushOverlayController.Type.NONE, GuiButtonPaintbrushOverlayController.Texture.SELECTED);
            else
                this.overlayControllerNone.setType(GuiButtonPaintbrushOverlayController.Type.NONE, GuiButtonPaintbrushOverlayController.Texture.UNSELECTED);
            if (acceptedType == OverlayTextureManager.Type.DYNAMIC || acceptedType == OverlayTextureManager.Type.BOTH) {
                if (type == OverlayTextureManager.Type.DYNAMIC)
                    this.overlayControllerDynamic.setType(GuiButtonPaintbrushOverlayController.Type.DYNAMIC, GuiButtonPaintbrushOverlayController.Texture.SELECTED);
                else {
                    this.overlayControllerDynamic.setType(GuiButtonPaintbrushOverlayController.Type.DYNAMIC, GuiButtonPaintbrushOverlayController.Texture.UNSELECTED);
                }
            }
            if (acceptedType == OverlayTextureManager.Type.FIXED || acceptedType == OverlayTextureManager.Type.BOTH) {
                if (type == OverlayTextureManager.Type.FIXED)
                    this.overlayControllerFixed.setType(GuiButtonPaintbrushOverlayController.Type.FIXED, GuiButtonPaintbrushOverlayController.Texture.SELECTED);
                else {
                    this.overlayControllerFixed.setType(GuiButtonPaintbrushOverlayController.Type.FIXED, GuiButtonPaintbrushOverlayController.Texture.UNSELECTED);
                }
            }
        } else {
            this.overlayControllerNone.visible = false;
            this.overlayControllerNone.showButton = false;
            this.overlayControllerDynamic.visible = false;
            this.overlayControllerDynamic.showButton = false;
            this.overlayControllerFixed.visible = false;
            this.overlayControllerFixed.showButton = false;
        }
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float par3) {
        RenderHelper.disableStandardItemLighting();
        // Draw background.
        mc.renderEngine.bindTexture(rightMenuTexture);
        this.drawTexturedModalRect(GUI_ANCHOR_MID_X, GUI_ANCHOR_Y, 0, 0, MENU_TEXTURE_WIDTH, MENU_TEXTURE_HEIGHT);
        mc.renderEngine.bindTexture(leftMenuTexture);
        this.drawTexturedModalRect(GUI_ANCHOR_X, GUI_ANCHOR_Y, 0, 0, MENU_TEXTURE_WIDTH, MENU_TEXTURE_HEIGHT);

        // Draw overlay controller buttons if overlay is allowed.
        if (rollingStock.acceptsOverlayTextures()) {
            mc.renderEngine.bindTexture(overlayBarTexture);
            this.drawTexturedModalRect(GUI_ANCHOR_X, GUI_ANCHOR_Y + MENU_TEXTURE_HEIGHT - 2, 0, 0, 206, 38);
            this.drawTexturedModalRect(GUI_ANCHOR_MID_X, GUI_ANCHOR_Y + MENU_TEXTURE_HEIGHT - 2, 0, 38, 206, 38);
        }

        // Draw cargo controller bar if cargo controller is enabled...
        String loopRenderColor;
        if (renderModels) {
            // Rolling stock pieces with more than one bogie need offset based on bogie position to render properly.
            float bogieOffset = (float) Math.abs(record.getBogieLocoPosition()) * 0.5f;
            float offsetX = GUI_ANCHOR_X;
            float offsetY = GUI_ANCHOR_Y + 12;
            // Display the model with each texture.
            RenderRollingStock.setRenderModeGUI(true); // VERY IMPORTANT CALL! Forces renderer to render in full bright.
            RenderRollingStock.setRenderGUIFullBright(disableLighting);
            int startIndex = hasPreviousTexture ? -1 : 0;
            int endIndex = hasNextTexture ? 1 : 0;
            for (int i = startIndex; i <= endIndex; i++) {
                loopRenderColor = record.getLiveries().get(i + currentDisplayTexture);
                renderEntity.setColor(loopRenderColor);
                // Set the button to active or inactive depending on whether the texture is active.
                GL11.glColor4f(1, 1, 1, 1);
                GL11.glPushMatrix();
                GL11.glTranslated(offsetX + 205 + (i * 95), offsetY + 82, 400);
                GL11.glScalef(-record.getGuiRenderScale(), record.getGuiRenderScale(), record.getGuiRenderScale());
                GL11.glRotatef(180, 0, 0, 1);
                GL11.glRotatef(yaw, 0, 1, 0);
                RenderManager.instance.renderEntityWithPosYaw(renderEntity, bogieOffset, 0, 0, 0, 0);
                GL11.glPopMatrix();
            }
            RenderRollingStock.setRenderModeGUI(false);

            // Handle rotation of entity(s) in GUI.
            if (doAnimation) {
                yaw += 0.5F;
            }
        }

        super.drawScreen(mouseX, mouseY, par3);


        // Draw Hovering Tooltips
        // I split this up to hopefully reduce the amount of statements it has to process.
        if (mouseX > closeMenuButton.xPosition - 5) { // If mouse is on the right-hand side after the textures.
            if (closeMenuButton.getTexture() == GuiButtonPaintbrushMenu.Texture.ACTIVE)
                drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("paintbrushmenu.Close Menu.name")), mouseX, mouseY, fontRendererObj);
            else if (arrowLeft.getTexture() == GuiButtonPaintbrushMenu.Texture.ACTIVE && arrowLeft.visible)
                drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("paintbrushmenu.Previous Page.name")), mouseX, mouseY, fontRendererObj);
            else if (arrowRight.getTexture() == GuiButtonPaintbrushMenu.Texture.ACTIVE && arrowRight.visible)
                drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("paintbrushmenu.Next Page.name")), mouseX, mouseY, fontRendererObj);
            else if (playPauseButton.getTexture() == GuiButtonPaintbrushMenu.Texture.ACTIVE) {
                if (doAnimation)
                    drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("paintbrushmenu.Pause.name")), mouseX, mouseY, fontRendererObj);
                else
                    drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("paintbrushmenu.Play.name")), mouseX, mouseY, fontRendererObj);
            } else if (renderModelsButton.getTexture() == GuiButtonPaintbrushMenu.Texture.ACTIVE) {
                if (renderModels)
                    drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("paintbrushmenu.Hide Models.name")), mouseX, mouseY, fontRendererObj);
                else
                    drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("paintbrushmenu.Show Models.name")), mouseX, mouseY, fontRendererObj);
            }
        } else if (mouseY > overlayControllerDynamic.yPosition) { // If mouse is somewhere on the overlay controller bar...
            if (overlayControllerNone.getHoveringStatus())
                drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("paintbrushmenu.None.name")), mouseX, mouseY, fontRendererObj);
            else if (overlayControllerDynamic.getHoveringStatus())
                drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("paintbrushmenu.Dynamic Overlay.name")), mouseX, mouseY, fontRendererObj);
            else if (overlayControllerFixed.getHoveringStatus())
                drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("paintbrushmenu.Fixed Overlay.name")), mouseX, mouseY, fontRendererObj);
        }
        RenderHelper.enableStandardItemLighting();
    }

    @Override
    protected void actionPerformed(GuiButton clickedButton) {
        if (clickedButton.enabled) {
            editingPlayer.playSound("random.click", 1f, 1f);
            // Select Color
            switch (clickedButton.id) {
                case 0:
                case 1: // Page up or down button.
                    if (clickedButton.id == 0) { // If page up...
                        currentDisplayTexture--;
                    } else { // If page down...
                        currentDisplayTexture++;
                    }
                    updateButtons();
                    break;
                case 2:
                    renderModels = !renderModels;
                    updateButtons();
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10: // Color selection button.
                    String newColor = record.getLiveries().get((currentDisplayTexture * RESULTS_PER_PAGE) + (clickedButton.id - 3));
                    rollingStock.setColor(newColor);
                    Traincraft.paintbrushColorChannel.sendToServer(new PacketPaintbrushColor(newColor, rollingStock.getEntityId()));
                    if (rollingStock.acceptsOverlayTextures())
                        rollingStock.getOverlayTextureContainer().setTypeAndMarkForUpdate(rollingStock.getOverlayTextureContainer().getType());
                    break;
                case 11: // Clear overlay button.
                    if (rollingStock.acceptsOverlayTextures() && rollingStock.getOverlayTextureContainer().getType() != OverlayTextureManager.Type.NONE) {
                        rollingStock.getOverlayTextureContainer().getOverlayConfigTag().setInteger("type", OverlayTextureManager.Type.NONE.ordinal());
                        Traincraft.overlayTextureChannel.sendToServer(new PacketTextureOverlayConfig(OverlayTextureManager.Type.NONE, rollingStock.getEntityId(), Minecraft.getMinecraft().thePlayer.worldObj.provider.dimensionId, rollingStock.getOverlayTextureContainer().getOverlayConfigTag()));
                        this.mc.thePlayer.closeScreen();
                    }
                    break;
                case 12: // Open dynamic overlay menu button.
                    if (rollingStock.getOverlayTextureContainer().getAcceptedType() == OverlayTextureManager.Type.DYNAMIC || rollingStock.getOverlayTextureContainer().getAcceptedType() == OverlayTextureManager.Type.BOTH) {
                        this.mc.thePlayer.closeScreen();
                        editingPlayer.openGui(Traincraft.instance, GuiIDs.DYNAMIC_OVERLAY, editingPlayer.getEntityWorld(), rollingStock.getEntityId(), -1, (int) editingPlayer.posZ);
                    }
                    break;
                case 13: // Open fixed overlay menu button.
                    if (rollingStock.getOverlayTextureContainer().getAcceptedType() == OverlayTextureManager.Type.FIXED || rollingStock.getOverlayTextureContainer().getAcceptedType() == OverlayTextureManager.Type.BOTH) {
                        this.mc.thePlayer.closeScreen();
                        editingPlayer.openGui(Traincraft.instance, GuiIDs.FIXED_OVERLAY, editingPlayer.getEntityWorld(), rollingStock.getEntityId(), -1, (int) editingPlayer.posZ);
                    }
                    break;
                case 14:
                    this.mc.thePlayer.closeScreen();
                    break;
                case 15:
                    doAnimation = !doAnimation;
                    updateButtons();
                    break;
                case 16:
                    disableLighting = !disableLighting;
                    updateButtons();
                    break;
            }
        }
    }

    @Override
    public void onGuiClosed() {
        super.onGuiClosed();
    }

    @Override
    protected void keyTyped(char eventChar, int eventKey) {
        if (eventKey == 1 || eventChar == 'e') { // If ESC...
            this.mc.thePlayer.closeScreen();
        } else {
            switch (eventChar) {
                // todo replace below
                case '1':
                case '2':
                case '3': {
//                    if (Character.getNumericValue(eventChar) <= optionsOnCurrentPage) {
//                        editingPlayer.playSound("random.click", 1f, 1f);
//                        String newColor = record.getLiveries().get((currentDisplayTexture * RESULTS_PER_PAGE) + (Character.getNumericValue(eventChar) - 1));
//                        rollingStock.setColor(newColor);
//                        Traincraft.paintbrushColorChannel.sendToServer(new PacketPaintbrushColor(newColor, rollingStock.getEntityId()));
//                    }
                }
            }
        }
    }
}