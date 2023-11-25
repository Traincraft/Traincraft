package train.client.gui;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import org.lwjgl.opengl.GL11;
import train.common.Traincraft;
import train.common.api.EntityRollingStock;
import train.common.core.network.PacketTextureOverlayConfig;
import train.common.library.GuiIDs;
import train.common.library.Info;
import train.common.overlaytexture.OTSpecificationDynamic;
import train.common.overlaytexture.OverlayTextureManager;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author 02skaplan
 * <p>Dynamic Overlay GUI for Paintbrush</p>
 */
@SuppressWarnings("unchecked")
@SideOnly(Side.CLIENT)
public class GuiDynamicOverlay extends GuiScreen {
    private enum ColorSelectionType {
        BACKGROUND,
        FOREGROUND
    }

    /**
     * <p>The default color palette for dynamic overlays.</p>
     */
    public enum DefaultColors {
        ZERO(new Color(0, 0, 0, 0)),
        ONE(new Color(122, 0, 0, 255)),
        TWO(new Color(0, 16, 107, 255)),
        THREE(new Color(0, 114, 11, 255)),
        FOUR(new Color(224, 187, 0, 255)),
        FIVE(new Color(211, 84, 0, 255)),
        SIX(new Color(73, 0, 107, 255)),
        SEVEN(new Color(0, 117, 163, 255)),
        EIGHT(new Color(51, 153, 74, 255)),
        NINE(new Color(221, 196, 89, 255)),
        TEN(new Color(224, 224, 224, 255)),
        ELEVEN(new Color(209, 209, 209, 255)),
        TWELVE(new Color(196, 196, 196, 255)),
        THIRTEEN(new Color(183, 183, 183, 255)),
        FOURTEEN(new Color(170, 170, 170, 255)),
        FIFTEEN(new Color(25, 25, 25, 255)),
        SIXTEEN(new Color(38, 38, 38, 255)),
        SEVENTEEN(new Color(51, 51, 51, 255)),
        EIGHTEEN(new Color(63, 63, 63, 255)),
        NINETEEN(new Color(76, 76, 76, 255));
        private final Color color;
        DefaultColors(Color color) {
            this.color = color;
        }
    }
    private final EntityPlayer editingPlayer;
    private final EntityRollingStock rollingStock;
    final private int MENU_TEXTURE_WIDTH = 206;
    final private int MENU_TEXTURE_HEIGHT = 200;
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
    private GuiButtonDynamicOverlay colorSelectorButton;
    private GuiButtonDynamicOverlay foregroundButton;
    private GuiButtonDynamicOverlay backgroundButton;
    private GuiButtonDynamicOverlay cancelButton;
    private GuiButtonDynamicOverlay submitButton;
    private GuiButtonDynamicOverlay previousOverlayButton;
    private GuiButtonDynamicOverlay nextOverlayButton;
    private ColorSelectionType colorSelectionType = ColorSelectionType.FOREGROUND;
    private Color backgroundColor;
    private Color foregroundColor;
    // These ints can't be final because the window might resize!
    private int COLORGRID_ANCHOR_X_TOPLEFT;
    private int COLORGRID_ANCHOR_Y_TOPLEFT;
    private int COLORTYPEBOX_ANCHOR_X_TOPLEFT;
    private int COLORTYPEBOX_ANCHOR_Y_TOPLEFT;
    /**
     * Mouse coordinates stored to find the color selected on the color grid.
     */
    private int mouseX;
    /**
     * Mouse coordinates stored to find the color selected on the color grid.
     */
    private int mouseY;
    final private ArrayList<OTSpecificationDynamic> specificationDynamicList;
    /**
     * <p>Number of the overlay currently being displayed and set.</p>
     */
    private int dynamicOverlayNumber;
    private GuiTextFieldDynamicOverlay overlayTextBox;
    private GuiTextFieldDynamicOverlay colorCodeTextBox;
    private int ticksExisted = 0;


    /**
     * @author 02skaplan
     */
    public GuiDynamicOverlay(EntityPlayer editingPlayer, EntityRollingStock rollingStock) {
        this.editingPlayer = editingPlayer;
        this.rollingStock = rollingStock;
        specificationDynamicList = rollingStock.getOverlayTextureContainer().getSpecificationDynamicList();
        dynamicOverlayNumber = 0;
    }

    /**
     * Initial setup for buttons and GUI anchors.
     */
    @Override
    public void initGui() {
        GUI_ANCHOR_MID_X = (this.width) / 2;
        GUI_ANCHOR_Y = (this.height) / 2 - (MENU_TEXTURE_HEIGHT / 2);
        GUI_ANCHOR_X = GUI_ANCHOR_MID_X - MENU_TEXTURE_WIDTH;
        COLORGRID_ANCHOR_X_TOPLEFT = GUI_ANCHOR_X + 241;
        COLORGRID_ANCHOR_Y_TOPLEFT  = GUI_ANCHOR_Y + 77;
        COLORTYPEBOX_ANCHOR_X_TOPLEFT = GUI_ANCHOR_X + 333;
        COLORTYPEBOX_ANCHOR_Y_TOPLEFT = GUI_ANCHOR_Y + 14;

        backgroundColor = specificationDynamicList.get(dynamicOverlayNumber).getBackgroundColor();
        foregroundColor = specificationDynamicList.get(dynamicOverlayNumber).getForegroundColor();

        this.buttonList.clear();
        this.buttonList.add(this.colorSelectorButton = new GuiButtonDynamicOverlay(0, COLORGRID_ANCHOR_X_TOPLEFT, COLORGRID_ANCHOR_Y_TOPLEFT, 140, 112, GuiButtonDynamicOverlay.Type.COLOR));
        this.buttonList.add(this.foregroundButton = new GuiButtonDynamicOverlay(1, GUI_ANCHOR_MID_X + 14, GUI_ANCHOR_Y + 15, 29, 29, GuiButtonDynamicOverlay.Type.FOREGROUND));
        this.buttonList.add(this.backgroundButton = new GuiButtonDynamicOverlay(2, GUI_ANCHOR_MID_X + 58, GUI_ANCHOR_Y + 15, 29, 29, GuiButtonDynamicOverlay.Type.BACKGROUND));
        this.buttonList.add(this.cancelButton = new GuiButtonDynamicOverlay(3, GUI_ANCHOR_X + 20, GUI_ANCHOR_Y + 160, 29, 29, GuiButtonDynamicOverlay.Type.CANCEL));
        this.buttonList.add(this.submitButton = new GuiButtonDynamicOverlay(4, GUI_ANCHOR_X + 65, GUI_ANCHOR_Y + 160, 29, 29, GuiButtonDynamicOverlay.Type.SUBMIT));
        this.buttonList.add(this.previousOverlayButton = new GuiButtonDynamicOverlay(6, GUI_ANCHOR_X + 110, GUI_ANCHOR_Y + 160, 29, 29, GuiButtonDynamicOverlay.Type.SELECTIONARROWLEFT));
        this.buttonList.add(this.nextOverlayButton = new GuiButtonDynamicOverlay(7, GUI_ANCHOR_X + 155, GUI_ANCHOR_Y + 160, 29, 29, GuiButtonDynamicOverlay.Type.SELECTIONARROWRIGHT));

        this.overlayTextBox = new GuiTextFieldDynamicOverlay(fontRendererObj, GUI_ANCHOR_X + 25, GUI_ANCHOR_Y + 70, GUI_ANCHOR_MID_X - GUI_ANCHOR_X - 50, 20, null);
        this.overlayTextBox.setFocused(true);
        this.overlayTextBox.setCanLoseFocus(true);
        this.overlayTextBox.setEnableBackgroundDrawing(false);
        this.colorCodeTextBox = new GuiTextFieldDynamicOverlay(fontRendererObj, COLORTYPEBOX_ANCHOR_X_TOPLEFT, COLORTYPEBOX_ANCHOR_Y_TOPLEFT, 58, 17, "#");
        this.colorCodeTextBox.setMaxStringLength(7);
        this.colorCodeTextBox.setFocused(false);
        this.colorCodeTextBox.setCanLoseFocus(true);
        this.colorCodeTextBox.setEnableBackgroundDrawing(false);

        overlayTextBox.setText(specificationDynamicList.get(dynamicOverlayNumber).getDisplayText());

        this.updateButtons();
    }

    private void updateButtons() {
        this.colorSelectorButton.visible = true;
        this.colorSelectorButton.showButton = true;
        this.foregroundButton.visible = true;
        this.foregroundButton.showButton = true;
        this.backgroundButton.visible = true;
        this.backgroundButton.showButton = true;
        this.cancelButton.visible = true;
        this.cancelButton.showButton = true;
        this.submitButton.visible = true;
        this.submitButton.showButton = true;
        this.previousOverlayButton.showButton = specificationDynamicList.size() > 1;
        this.previousOverlayButton.visible = specificationDynamicList.size() > 1;
        this.nextOverlayButton.showButton = specificationDynamicList.size() > 1;
        this.nextOverlayButton.visible = specificationDynamicList.size() > 1;

        // Control the textures of the foreground and background buttons.
        if (colorSelectionType == ColorSelectionType.BACKGROUND) {
            backgroundButton.setType(GuiButtonDynamicOverlay.Type.BACKGROUND, GuiButtonDynamicOverlay.Texture.ACTIVE);
            foregroundButton.setType(GuiButtonDynamicOverlay.Type.FOREGROUND, GuiButtonDynamicOverlay.Texture.INACTIVE);
        } else {
            foregroundButton.setType(GuiButtonDynamicOverlay.Type.FOREGROUND, GuiButtonDynamicOverlay.Texture.ACTIVE);
            backgroundButton.setType(GuiButtonDynamicOverlay.Type.BACKGROUND, GuiButtonDynamicOverlay.Texture.INACTIVE);
        }


        // Update the hex code displayed in the color type box.
        if (colorSelectionType == ColorSelectionType.FOREGROUND) {
            colorCodeTextBox.setText(String.format("%02x%02x%02x", foregroundColor.getRed(), foregroundColor.getGreen(), foregroundColor.getBlue()));
        } else {
            colorCodeTextBox.setText(String.format("%02x%02x%02x", backgroundColor.getRed(), backgroundColor.getGreen(), backgroundColor.getBlue()));
        }

        // Update next and previous buttons for moving between dynamic overlays.
        if (dynamicOverlayNumber < specificationDynamicList.size() - 1) {
            nextOverlayButton.setType(GuiButtonDynamicOverlay.Type.SELECTIONARROWRIGHT, GuiButtonDynamicOverlay.Texture.INACTIVE);
        } else {
            nextOverlayButton.setType(GuiButtonDynamicOverlay.Type.SELECTIONARROWRIGHT, GuiButtonDynamicOverlay.Texture.UNAVAILABLE);
        }
        if (dynamicOverlayNumber == 0) {
            previousOverlayButton.setType(GuiButtonDynamicOverlay.Type.SELECTIONARROWLEFT, GuiButtonDynamicOverlay.Texture.UNAVAILABLE);
        } else {
            previousOverlayButton.setType(GuiButtonDynamicOverlay.Type.SELECTIONARROWLEFT, GuiButtonDynamicOverlay.Texture.INACTIVE);
        }

        this.overlayTextBox.setMaxStringLength(specificationDynamicList.get(dynamicOverlayNumber).getCharacterLimit() != null ? specificationDynamicList.get(dynamicOverlayNumber).getCharacterLimit() : 50);
    }

    @Override
    public void drawScreen(int par1, int par2, float par3) {
        ticksExisted++;
        // Draw background.
        mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "gui_paintbrush_menu_right.png"));
        this.drawTexturedModalRect(GUI_ANCHOR_MID_X, GUI_ANCHOR_Y, 0, 0, MENU_TEXTURE_WIDTH, MENU_TEXTURE_HEIGHT);
        mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "gui_paintbrush_menu_left.png"));
        this.drawTexturedModalRect(GUI_ANCHOR_X, GUI_ANCHOR_Y, 0, 0, MENU_TEXTURE_WIDTH, MENU_TEXTURE_HEIGHT);
        int borderColor = new Color(0, 0,0).getRGB();
        drawRect(GUI_ANCHOR_MID_X - 1, GUI_ANCHOR_Y, GUI_ANCHOR_MID_X + 1, GUI_ANCHOR_Y + MENU_TEXTURE_HEIGHT, borderColor);
        drawRect(GUI_ANCHOR_X, GUI_ANCHOR_Y + MENU_TEXTURE_HEIGHT - 51, GUI_ANCHOR_MID_X, GUI_ANCHOR_Y + MENU_TEXTURE_HEIGHT - 49, borderColor);
        drawRect(GUI_ANCHOR_X, GUI_ANCHOR_Y + 34, GUI_ANCHOR_MID_X, GUI_ANCHOR_Y + 36, borderColor);
        // Draw Border Around Selection Rectangle
        drawRect(COLORTYPEBOX_ANCHOR_X_TOPLEFT - 1, COLORTYPEBOX_ANCHOR_Y_TOPLEFT + 19, COLORTYPEBOX_ANCHOR_X_TOPLEFT + 59, COLORTYPEBOX_ANCHOR_Y_TOPLEFT + 41, borderColor);
        // Draw Color Selection Rectangle
        drawRect(COLORTYPEBOX_ANCHOR_X_TOPLEFT, COLORTYPEBOX_ANCHOR_Y_TOPLEFT + 20, COLORTYPEBOX_ANCHOR_X_TOPLEFT + 58, COLORTYPEBOX_ANCHOR_Y_TOPLEFT + 40, colorSelectionType == ColorSelectionType.BACKGROUND ? backgroundColor.getRGB() : foregroundColor.getRGB());
        drawRect(COLORTYPEBOX_ANCHOR_X_TOPLEFT - 19, GUI_ANCHOR_Y, COLORTYPEBOX_ANCHOR_X_TOPLEFT - 17, COLORTYPEBOX_ANCHOR_Y_TOPLEFT + 50, borderColor);
        drawRect(GUI_ANCHOR_X + MENU_TEXTURE_WIDTH, COLORTYPEBOX_ANCHOR_Y_TOPLEFT + 49, GUI_ANCHOR_MID_X + MENU_TEXTURE_WIDTH, COLORTYPEBOX_ANCHOR_Y_TOPLEFT + 51, borderColor);
        mouseX = par1;
        mouseY = par2;

        // Find the currently selected color on the grid, if it exists, and draw a green square around it.
        for (DefaultColors color : DefaultColors.values()) {
            Color comparisonColor;
            if (colorSelectionType == ColorSelectionType.FOREGROUND)
                comparisonColor = foregroundColor;
            else
                comparisonColor = backgroundColor;
            if (color.color.equals(comparisonColor)) {
                int colorColumn = color.ordinal() % 5;
                int colorRow = color.ordinal() / 5;
                GL11.glPushMatrix();
                GL11.glColor4f(1, 1, 1, 1);
                GL11.glTranslatef(0, 0, 100);
                mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "gui_dynamic_overlay.png"));
                this.drawTexturedModalRect((colorColumn * 28) + COLORGRID_ANCHOR_X_TOPLEFT, (colorRow * 28) + COLORGRID_ANCHOR_Y_TOPLEFT, 0, 112, 28, 28);
                GL11.glPopMatrix();
                break;
            }
        }

        this.overlayTextBox.drawTextBox();
        this.colorCodeTextBox.drawTextBox();
        if (ticksExisted % 10 == 0) {
            this.overlayTextBox.updateCursorCounter();
            this.colorCodeTextBox.updateCursorCounter();
        }

        super.drawScreen(par1, par2, par3);

        // Draw text after and *above* the rest of the GUI elements.
        this.fontRendererObj.drawString(specificationDynamicList.get(dynamicOverlayNumber).getOverlayName(), (int) (GUI_ANCHOR_X + (MENU_TEXTURE_WIDTH * 0.5) - (fontRendererObj.getStringWidth(specificationDynamicList.get(dynamicOverlayNumber).getOverlayName()) * 0.5)), GUI_ANCHOR_Y + 14, 0);

        // Draw Hovering Tooltips
        if (mouseX > backgroundButton.xPosition && mouseX < backgroundButton.xPosition + backgroundButton.width && mouseY > backgroundButton.yPosition && mouseY < backgroundButton.yPosition + backgroundButton.height)
            drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("dynamicoverlaymenu.Background Color.name")), mouseX, mouseY, fontRendererObj);
        else if (mouseX > foregroundButton.xPosition && mouseX < foregroundButton.xPosition + foregroundButton.width && mouseY > foregroundButton.yPosition && mouseY < foregroundButton.yPosition + foregroundButton.height)
            drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("dynamicoverlaymenu.Foreground Color.name")), mouseX, mouseY, fontRendererObj);
        else if (mouseX > submitButton.xPosition && mouseX < submitButton.xPosition + submitButton.width && mouseY > submitButton.yPosition && mouseY < submitButton.yPosition + submitButton.height)
            drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("dynamicoverlaymenu.Submit.name")), mouseX, mouseY, fontRendererObj);
        else if (mouseX > cancelButton.xPosition && mouseX < cancelButton.xPosition + cancelButton.width && mouseY > cancelButton.yPosition && mouseY < cancelButton.yPosition + cancelButton.height)
            drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("dynamicoverlaymenu.Back.name")), mouseX, mouseY, fontRendererObj);
    }

    @Override
    protected void actionPerformed(GuiButton clickedButton) {
        if (clickedButton.enabled) {
            editingPlayer.playSound("random.click", 1f, 1f);
            switch (clickedButton.id) {
                case 0: // Color Selection Grid Button
                    int x = mouseX - COLORGRID_ANCHOR_X_TOPLEFT;
                    int y = mouseY - COLORGRID_ANCHOR_Y_TOPLEFT;
                    int colorGridColumn = x / 28;
                    int colorGridRow = y / 28;
                    int colorNumber = colorGridRow * 5 + colorGridColumn;
                    Color color = DefaultColors.values()[colorNumber].color;
                    if (colorSelectionType == ColorSelectionType.FOREGROUND) {
                        foregroundColor = color;
                    }
                    else {
                        backgroundColor = color;
                    }
                    updateButtons();
                    break;
                case 1: // Foreground Color Mode Button
                    if (colorSelectionType != ColorSelectionType.FOREGROUND) {
                        colorSelectionType = ColorSelectionType.FOREGROUND;
                        updateButtons();
                    }
                    break;
                case 2: // Background Color Mode Button
                    if (colorSelectionType != ColorSelectionType.BACKGROUND) {
                        colorSelectionType = ColorSelectionType.BACKGROUND;
                        updateButtons();
                    }
                    break;
                case 3: // Back Button
                    this.mc.thePlayer.closeScreen();
                    editingPlayer.openGui(Traincraft.instance, GuiIDs.PAINTBRUSH, editingPlayer.getEntityWorld(), rollingStock.getEntityId(), -1, (int) editingPlayer.posZ);
                    break;
                case 4: // Submit Button
                    if (!overlayTextBox.getText().isEmpty()) {
                        specificationDynamicList.get(dynamicOverlayNumber).setDisplayText(overlayTextBox.getText());
                        specificationDynamicList.get(dynamicOverlayNumber).setForegroundColor(foregroundColor);
                        specificationDynamicList.get(dynamicOverlayNumber).setBackgroundColor(backgroundColor);
                        Traincraft.overlayTextureChannel.sendToServer(new PacketTextureOverlayConfig(OverlayTextureManager.Type.DYNAMIC, rollingStock.getEntityId(), Minecraft.getMinecraft().thePlayer.worldObj.provider.dimensionId, rollingStock.getOverlayTextureContainer().getOverlayConfigTag()));
                        this.mc.thePlayer.closeScreen();
                    }
                    break;
                case 6: // Previous Overlay
                    if (dynamicOverlayNumber > 0) {
                        specificationDynamicList.get(dynamicOverlayNumber).setDisplayText(overlayTextBox.getText());
                        specificationDynamicList.get(dynamicOverlayNumber).setBackgroundColor(backgroundColor);
                        specificationDynamicList.get(dynamicOverlayNumber).setForegroundColor(foregroundColor);
                        dynamicOverlayNumber--;
                        overlayTextBox.setText(specificationDynamicList.get(dynamicOverlayNumber).getDisplayText());
                        backgroundColor = specificationDynamicList.get(dynamicOverlayNumber).getBackgroundColor();
                        foregroundColor = specificationDynamicList.get(dynamicOverlayNumber).getForegroundColor();
                        updateButtons();
                    }
                    break;
                case 7: // Next Overlay
                    if (dynamicOverlayNumber < specificationDynamicList.size() - 1) {
                        specificationDynamicList.get(dynamicOverlayNumber).setDisplayText(overlayTextBox.getText());
                        specificationDynamicList.get(dynamicOverlayNumber).setBackgroundColor(backgroundColor);
                        specificationDynamicList.get(dynamicOverlayNumber).setForegroundColor(foregroundColor);
                        dynamicOverlayNumber++;
                        overlayTextBox.setText(specificationDynamicList.get(dynamicOverlayNumber).getDisplayText());
                        backgroundColor = specificationDynamicList.get(dynamicOverlayNumber).getBackgroundColor();
                        foregroundColor = specificationDynamicList.get(dynamicOverlayNumber).getForegroundColor();
                        updateButtons();
                    }
                    break;
            }
        }
    }
    @Override
    public void onGuiClosed() {
        super.onGuiClosed();
    }

    @Override
    public void mouseClicked(int x, int y, int par3) {
        super.mouseClicked(x, y, par3);
        overlayTextBox.mouseClicked(x, y, par3);
        colorCodeTextBox.mouseClicked(x, y, par3);
    }

    @Override
    protected void keyTyped(char eventChar, int eventKey) {
        if (eventKey == 1) { // If ESC...
            this.mc.thePlayer.closeScreen();
            editingPlayer.openGui(Traincraft.instance, GuiIDs.PAINTBRUSH, editingPlayer.getEntityWorld(), rollingStock.getEntityId(), -1, (int) editingPlayer.posZ);
        } else if (eventChar == '\r') {
            setColorFromHex();
        } else if (eventChar != '\u0000') { // Anything else...
            this.overlayTextBox.textboxKeyTyped(eventChar, eventKey);
            this.colorCodeTextBox.textboxKeyTyped(eventChar, eventKey);
            if (colorCodeTextBox.isFocused()) { // Focused on color type bar...
                if (eventChar == '\u0016') { // If CTRL+V to paste a hex code...
                    importHexColorFromClipboard();
                } else if (eventChar == '\u0003') { // If CTRL+C to copy a hex code...
                    if (colorCodeTextBox.getText().length() == 6)
                        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection("#" + colorCodeTextBox.getText()), null);
                } else if (colorCodeTextBox.getText().length() == 6)
                    setColorFromHex();
            }
        }
    }

    private void importHexColorFromClipboard() {
        try {
            String clipboard = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
            if (clipboard.length() == 6 || clipboard.length() == 7) {
                for (char a : clipboard.toCharArray()) { // Make sure no weird inputs make it into the color code entry bar.
                    if (!Character.isLetterOrDigit(a) && a != '#') {
                        throw new IOException();
                    }
                }
                if (clipboard.length() == 6) {
                    colorCodeTextBox.setText(clipboard.toLowerCase());
                } else if (clipboard.charAt(0) == '#') {
                    colorCodeTextBox.setText(clipboard.substring(1, 7).toLowerCase());
                }
                setColorFromHex();
            } else {
                throw new IOException();
            }
        } catch (UnsupportedFlavorException | IOException ignored) {
            colorCodeTextBox.setText("");
        }
    }

    private void setColorFromHex() {
        try {
            Color newColorFromHex = Color.decode("#" + colorCodeTextBox.getText());
            if (colorSelectionType == ColorSelectionType.FOREGROUND)
                foregroundColor = newColorFromHex;
            else
                backgroundColor = newColorFromHex;
            colorCodeTextBox.setFocused(false);
            updateButtons();
        } catch (NumberFormatException ignored) {
            colorCodeTextBox.setText("");
        }
    }
}