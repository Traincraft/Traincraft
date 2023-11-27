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
    private GuiButtonPaintbrushMenu randomButton;
    private GuiButtonPaintbrushMenu applyButton;
    private boolean renderModels;
    private boolean disableLighting = true;
    private final int totalOptions;
    private int currentDisplayTexture = 0;
    private final AbstractTrains renderEntity;
    private final TrainRecord record;
    private boolean doAnimation;
    private static Integer activeButtonID;
    private final ResourceLocation rightMenuTexture = new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "gui_paintbrush_menu_right.png");
    private final ResourceLocation leftMenuTexture = new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "gui_paintbrush_menu_left.png");
    private final ResourceLocation outlinesTexture = new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "gui_paintbrush_menu_outlines.png");
    private final ResourceLocation overlayBarTexture = new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "gui_paintbrush_overlay_controller.png");

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
        this.buttonList.add(this.arrowLeft = new GuiButtonPaintbrushMenu(0, GUI_ANCHOR_X + 15, GUI_ANCHOR_Y + 79, 38, 12, GuiButtonPaintbrushMenu.Type.ARROWLEFT));
        this.buttonList.add(this.arrowRight = new GuiButtonPaintbrushMenu(1, GUI_ANCHOR_X + 360, GUI_ANCHOR_Y + 79, 38, 12, GuiButtonPaintbrushMenu.Type.ARROWRIGHT));
        this.buttonList.add(this.renderModelsButton = new GuiButtonPaintbrushMenu(2, GUI_ANCHOR_X + 4, GUI_ANCHOR_Y + MENU_TEXTURE_HEIGHT - 53, 22, 22, GuiButtonPaintbrushMenu.Type.STOPRENDER));

        this.buttonList.add(this.textureOne = new GuiButtonPaintbrushMenu(3, GUI_ANCHOR_X + 70, GUI_ANCHOR_Y + 42, 85, 85, GuiButtonPaintbrushMenu.Type.SELECTIONBOX));
        this.buttonList.add(this.textureTwo = new GuiButtonPaintbrushMenu(4, GUI_ANCHOR_X + 164, GUI_ANCHOR_Y + 42, 85, 85, GuiButtonPaintbrushMenu.Type.SELECTIONBOX));
        this.buttonList.add(this.textureThree = new GuiButtonPaintbrushMenu(5, GUI_ANCHOR_X + 258, GUI_ANCHOR_Y + 42, 85, 85, GuiButtonPaintbrushMenu.Type.SELECTIONBOX));

        this.buttonList.add(this.randomButton = new GuiButtonPaintbrushMenu(6, GUI_ANCHOR_MID_X + MENU_TEXTURE_WIDTH - 26, GUI_ANCHOR_Y + MENU_TEXTURE_HEIGHT - 29, 22, 22, GuiButtonPaintbrushMenu.Type.RANDOM));
        this.buttonList.add(this.applyButton = new GuiButtonPaintbrushMenu(7, GUI_ANCHOR_MID_X + MENU_TEXTURE_WIDTH - 26, GUI_ANCHOR_Y + MENU_TEXTURE_HEIGHT - 53, 22, 22, GuiButtonPaintbrushMenu.Type.APPLY));
        this.buttonList.add(this.overlayControllerNone = new GuiButtonPaintbrushOverlayController(11, GUI_ANCHOR_X + 121, GUI_ANCHOR_Y + 202, 29, 29, GuiButtonPaintbrushOverlayController.Type.NONE));
        this.buttonList.add(this.overlayControllerDynamic = new GuiButtonPaintbrushOverlayController(12, GUI_ANCHOR_X + 179, GUI_ANCHOR_Y + 202, 56, 29, GuiButtonPaintbrushOverlayController.Type.DYNAMIC));
        this.buttonList.add(this.overlayControllerFixed = new GuiButtonPaintbrushOverlayController(13, GUI_ANCHOR_X + 264, GUI_ANCHOR_Y + 202, 29, 29, GuiButtonPaintbrushOverlayController.Type.FIXED));
        this.buttonList.add(this.closeMenuButton = new GuiButtonPaintbrushMenu(14, GUI_ANCHOR_X + 382, GUI_ANCHOR_Y + 10, 22, 22, GuiButtonPaintbrushMenu.Type.CLOSE));
        this.buttonList.add(this.playPauseButton = new GuiButtonPaintbrushMenu(15, GUI_ANCHOR_X + 4, GUI_ANCHOR_Y + MENU_TEXTURE_HEIGHT - 29, 22, 22, GuiButtonPaintbrushMenu.Type.PLAY));
        this.updateButtons();
    }

    private void updateButtons() {
        hasPreviousTexture = currentDisplayTexture != 0;
        hasNextTexture = currentDisplayTexture != totalOptions - 1;
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
        this.randomButton.visible = true;
        this.randomButton.showButton = true;
        this.applyButton.visible = true;
        this.applyButton.showButton = true;

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

        mc.renderEngine.bindTexture(outlinesTexture);
        // Draw boxes for title.
        this.drawTexturedModalRect(GUI_ANCHOR_X + 80, GUI_ANCHOR_Y + 4, 0, 0, 256, 24);

        // Left half of box for description.
        this.drawTexturedModalRect(GUI_ANCHOR_X + 30, GUI_ANCHOR_Y + MENU_TEXTURE_HEIGHT - 66, 0, 24, 256, 68);
        // Right half of box for description
        this.drawTexturedModalRect(GUI_ANCHOR_X + MENU_TEXTURE_WIDTH - 10, GUI_ANCHOR_Y + MENU_TEXTURE_HEIGHT - 66, 68, 24, 188, 68);

        // Draw overlay controller buttons if overlay is allowed.
        if (rollingStock.acceptsOverlayTextures()) {
            mc.renderEngine.bindTexture(overlayBarTexture);
            this.drawTexturedModalRect(GUI_ANCHOR_X, GUI_ANCHOR_Y + MENU_TEXTURE_HEIGHT - 2, 0, 0, 206, 38);
            this.drawTexturedModalRect(GUI_ANCHOR_MID_X, GUI_ANCHOR_Y + MENU_TEXTURE_HEIGHT - 2, 0, 38, 206, 38);
        }

        super.drawScreen(mouseX, mouseY, par3);

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


        // Draw Currently Displayed Texture Name and Tooltip
        String titleString;
        String descriptionString;
        String currentDisplayTextureString = rollingStock.getSpec().getLiveries().get(currentDisplayTexture);
        if (rollingStock.textureDescriptionMap.containsKey(currentDisplayTextureString)) {
            if (rollingStock.textureDescriptionMap.get(currentDisplayTextureString).title != null) {
                titleString = rollingStock.textureDescriptionMap.get(currentDisplayTextureString).title;
            } else {
                titleString = currentDisplayTextureString;
            }
            descriptionString = rollingStock.textureDescriptionMap.get(currentDisplayTextureString).description;
        } else {
            titleString = currentDisplayTextureString;
            descriptionString = StatCollector.translateToLocal("paintbrushmenu.No Description.name");
        }
        fontRendererObj.drawString(titleString, GUI_ANCHOR_MID_X - ((int) (fontRendererObj.getStringWidth(titleString) * 0.5)), GUI_ANCHOR_Y + 12, 0);

        // fontRendererObj.splitStringWidth() does not work, use this bodge below instead.
        int splitStringWidth = Math.min(fontRendererObj.getStringWidth(descriptionString), MENU_TEXTURE_WIDTH * 2 - 80);
        fontRendererObj.drawSplitString(descriptionString, (int) (GUI_ANCHOR_MID_X - (splitStringWidth * 0.5)), GUI_ANCHOR_Y + MENU_TEXTURE_HEIGHT - 60, (MENU_TEXTURE_WIDTH * 2) - 70, 0);

        // Draw Hovering Tooltips
        if (GuiPaintbrushMenu.activeButtonID != null)
            switch (GuiPaintbrushMenu.activeButtonID) {
                case 0:
                case 1: // Arrow left or right button.
                    if (GuiPaintbrushMenu.activeButtonID == 0) { // If arrow left...
                        drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("paintbrushmenu.Previous Page.name")), mouseX, mouseY, fontRendererObj);
                    } else { // If arrow right...
                        drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("paintbrushmenu.Next Page.name")), mouseX, mouseY, fontRendererObj);
                    }
                    updateButtons();
                    break;
                case 2: // Render models button.
                    if (renderModels) {
                        drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("paintbrushmenu.Hide Models.name")), mouseX, mouseY, fontRendererObj);
                    } else {
                        drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("paintbrushmenu.Show Models.name")), mouseX, mouseY, fontRendererObj);
                    }
                    break;
                case 3: // Left texture button.
                case 4: // Middle (current) texture Button.
                case 5: // Right texture button.
                    break;
                case 6: // Random texture button.
                    drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("paintbrushmenu.Random Texture.name")), mouseX, mouseY, fontRendererObj);
                    break;
                case 7: // Apply & submit button.
                    drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("paintbrushmenu.Apply Texture.name")), mouseX, mouseY, fontRendererObj);
                    break;
                case 11: // Clear overlay button.
                    drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("paintbrushmenu.None.name")), mouseX, mouseY, fontRendererObj);
                    break;
                case 12: // Open dynamic overlay menu button.
                    drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("paintbrushmenu.Dynamic Overlay.name")), mouseX, mouseY, fontRendererObj);
                    break;
                case 13: // Open fixed overlay menu button.
                    drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("paintbrushmenu.Fixed Overlay.name")), mouseX, mouseY, fontRendererObj);
                    break;
                case 14: // Close button.
                    drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("paintbrushmenu.Close Menu.name")), mouseX, mouseY, fontRendererObj);
                    break;
                case 15: // Pause/Play
                    if (doAnimation)
                        drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("paintbrushmenu.Pause.name")), mouseX, mouseY, fontRendererObj);
                    else
                        drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("paintbrushmenu.Play.name")), mouseX, mouseY, fontRendererObj);
                    break;
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
                case 1: // Arrow left or right button.
                    if (clickedButton.id == 0) { // If arrow left...
                        currentDisplayTexture--;
                    } else { // If arrow right...
                        currentDisplayTexture++;
                    }
                    updateButtons();
                    break;
                case 2:
                    renderModels = !renderModels;
                    updateButtons();
                    break;
                case 3: // Left texture button.
                    if (hasPreviousTexture) {
                        actionPerformed(arrowLeft);
                    }
                    break;
                case 4: // Middle (current) texture Button.
                    updateTexture(rollingStock.getSpec().getLiveries().get(currentDisplayTexture), false);
                    break;
                case 5: // Right texture button.
                    if (hasNextTexture) {
                        actionPerformed(arrowRight);
                    }
                    break;
                case 6: // Random texture button.
                    if (totalOptions > 1) {
                        currentDisplayTexture = (int) (Math.random() * totalOptions);
                        updateButtons();
                    }
                    break;
                case 7: // Apply & submit button.
                    updateTexture(rollingStock.getSpec().getLiveries().get(currentDisplayTexture), true);
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
        } else if (eventChar == '\r'){
            updateTexture(rollingStock.getSpec().getLiveries().get(currentDisplayTexture), true);
        }
    }

    private void updateTexture(String newColor, boolean closeAfterward) {
        Traincraft.paintbrushColorChannel.sendToServer(new PacketPaintbrushColor(newColor, rollingStock.getEntityId()));
        if (rollingStock.acceptsOverlayTextures())
            rollingStock.getOverlayTextureContainer().setTypeAndMarkForUpdate(rollingStock.getOverlayTextureContainer().getType());
        if (closeAfterward) {
            this.mc.thePlayer.closeScreen();
        } else {
            updateButtons();
        }
    }

    public static void setActiveButtonID(Integer activeButtonID) {
        GuiPaintbrushMenu.activeButtonID = activeButtonID;
    }

    public static Integer getActiveButtonID() {
        return GuiPaintbrushMenu.activeButtonID;
    }
}