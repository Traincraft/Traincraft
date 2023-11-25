package train.client.gui;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import org.lwjgl.opengl.GL11;
import train.common.api.EntityRollingStock;
import train.common.library.Info;

import java.util.Collections;

/**
 * @author 02skaplan
 * <p>Abstraction of the Paintbrush GUI for use in other selection instances.</p>
 */
@SuppressWarnings("unchecked")
@SideOnly(Side.CLIENT)
public abstract class GuiAbstractPaintbrush extends GuiScreen {
    protected final EntityPlayer editingPlayer;
    protected final EntityRollingStock rollingStock;
    final protected int MENU_TEXTURE_WIDTH = 206;
    final protected int MENU_TEXTURE_HEIGHT = 200;
    final protected int RESULTS_PER_PAGE = 8;
    /**
     * X-coordinate of top left of GUI.
     */
    protected int GUI_ANCHOR_X;
    /**
     * X-coordinate of top center of GUI.
     */
    protected int GUI_ANCHOR_MID_X;
    /**
     * Y-coordinate of top left of GUI.
     */
    protected int GUI_ANCHOR_Y;
    protected boolean hasNextPage;

    private GuiButtonPaintbrushMenu arrowUp;
    private GuiButtonPaintbrushMenu arrowDown;
    private GuiButtonPaintbrushMenu textureOne;
    private GuiButtonPaintbrushMenu textureTwo;
    private GuiButtonPaintbrushMenu textureThree;
    private GuiButtonPaintbrushMenu textureFour;
    private GuiButtonPaintbrushMenu textureFive;
    private GuiButtonPaintbrushMenu textureSix;
    private GuiButtonPaintbrushMenu textureSeven;
    private GuiButtonPaintbrushMenu textureEight;
    private GuiButtonPaintbrushMenu closeMenuButton;
    protected int optionsOnCurrentPage;
    protected final int totalOptions;
    protected int currentPage;
    protected Integer selectedOption;

    /**
     * @author 02skaplan
     */
    public GuiAbstractPaintbrush(EntityPlayer editingPlayer, EntityRollingStock rollingStock) {
        this.editingPlayer = editingPlayer;
        this.rollingStock = rollingStock;
        totalOptions = getTotalOptions();
        selectedOption = getSelectedOption();
        currentPage = (selectedOption - 1) / RESULTS_PER_PAGE;
        optionsOnCurrentPage = Math.min(RESULTS_PER_PAGE, totalOptions - currentPage * RESULTS_PER_PAGE);
        hasNextPage = optionsOnCurrentPage + RESULTS_PER_PAGE * currentPage < totalOptions;
    }

    /**
     * Initial setup for buttons and GUI anchors.
     */
    @Override
    public void initGui() {
        GUI_ANCHOR_MID_X = (this.width) / 2;
        GUI_ANCHOR_Y = (this.height) / 2 - (MENU_TEXTURE_HEIGHT / 2);
        GUI_ANCHOR_X = GUI_ANCHOR_MID_X - MENU_TEXTURE_WIDTH;
        this.buttonList.clear();
        this.buttonList.add(this.arrowUp = new GuiButtonPaintbrushMenu(0, GUI_ANCHOR_X + 388, GUI_ANCHOR_Y + 59, 12, 38, GuiButtonPaintbrushMenu.Type.ARROWUP));
        this.buttonList.add(this.arrowDown = new GuiButtonPaintbrushMenu(1, GUI_ANCHOR_X + 388, GUI_ANCHOR_Y + 103, 12, 38, GuiButtonPaintbrushMenu.Type.ARROWDOWN));
        this.buttonList.add(this.closeMenuButton = new GuiButtonPaintbrushMenu(2, GUI_ANCHOR_X + 382, GUI_ANCHOR_Y + 10, 22, 22, GuiButtonPaintbrushMenu.Type.CLOSE));

        this.buttonList.add(this.textureOne = new GuiButtonPaintbrushMenu(3, GUI_ANCHOR_X + 10, GUI_ANCHOR_Y + 12, 85, 85, GuiButtonPaintbrushMenu.Type.SELECTIONBOX));
        this.buttonList.add(this.textureTwo = new GuiButtonPaintbrushMenu(4, GUI_ANCHOR_X + 104, GUI_ANCHOR_Y + 12, 85, 85, GuiButtonPaintbrushMenu.Type.SELECTIONBOX));
        this.buttonList.add(this.textureThree = new GuiButtonPaintbrushMenu(5, GUI_ANCHOR_X + 198, GUI_ANCHOR_Y + 12, 85, 85, GuiButtonPaintbrushMenu.Type.SELECTIONBOX));
        this.buttonList.add(this.textureFour = new GuiButtonPaintbrushMenu(6, GUI_ANCHOR_X + 292, GUI_ANCHOR_Y + 12, 85, 85, GuiButtonPaintbrushMenu.Type.SELECTIONBOX));
        this.buttonList.add(this.textureFive = new GuiButtonPaintbrushMenu(7, GUI_ANCHOR_X + 10, GUI_ANCHOR_Y + 103, 85, 85, GuiButtonPaintbrushMenu.Type.SELECTIONBOX));
        this.buttonList.add(this.textureSix = new GuiButtonPaintbrushMenu(8, GUI_ANCHOR_X + 104, GUI_ANCHOR_Y + 103, 85, 85, GuiButtonPaintbrushMenu.Type.SELECTIONBOX));
        this.buttonList.add(this.textureSeven = new GuiButtonPaintbrushMenu(9, GUI_ANCHOR_X + 198, GUI_ANCHOR_Y + 103, 85, 85, GuiButtonPaintbrushMenu.Type.SELECTIONBOX));
        this.buttonList.add(this.textureEight = new GuiButtonPaintbrushMenu(10, GUI_ANCHOR_X + 292, GUI_ANCHOR_Y + 103, 85, 85, GuiButtonPaintbrushMenu.Type.SELECTIONBOX));
        addExtraButtons();
        this.updateButtons();
    }

    protected void updateButtons() {
        this.arrowUp.visible = (currentPage != 0);
        this.arrowUp.showButton = (currentPage != 0);
        this.arrowDown.visible = hasNextPage;
        this.arrowDown.showButton = hasNextPage;
        this.textureOne.showButton = true;
        this.textureOne.visible = true;
        this.textureTwo.showButton = optionsOnCurrentPage > 1;
        this.textureTwo.visible = optionsOnCurrentPage > 1;
        this.textureThree.showButton = optionsOnCurrentPage > 2;
        this.textureThree.visible = optionsOnCurrentPage > 2;
        this.textureFour.showButton = optionsOnCurrentPage > 3;
        this.textureFour.visible = optionsOnCurrentPage > 3;
        this.textureFive.showButton = optionsOnCurrentPage > 4;
        this.textureFive.visible = optionsOnCurrentPage > 4;
        this.textureSix.showButton = optionsOnCurrentPage > 5;
        this.textureSix.visible = optionsOnCurrentPage > 5;
        this.textureSeven.showButton = optionsOnCurrentPage > 6;
        this.textureSeven.visible = optionsOnCurrentPage > 6;
        this.textureEight.showButton = optionsOnCurrentPage > 7;
        this.textureEight.visible = optionsOnCurrentPage > 7;
        this.closeMenuButton.showButton = true;
        this.closeMenuButton.visible = true;
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float par3) {
        GL11.glColor3f(1, 1, 1);
        // Draw background.
        mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "gui_paintbrush_menu_right.png"));
        this.drawTexturedModalRect(GUI_ANCHOR_MID_X, GUI_ANCHOR_Y, 0, 0, MENU_TEXTURE_WIDTH, MENU_TEXTURE_HEIGHT);
        mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "gui_paintbrush_menu_left.png"));
        this.drawTexturedModalRect(GUI_ANCHOR_X, GUI_ANCHOR_Y, 0, 0, MENU_TEXTURE_WIDTH, MENU_TEXTURE_HEIGHT);
        drawInBackground();
        super.drawScreen(mouseX, mouseY, par3);

        // Draw Hovering Tooltips
        // I split this up to hopefully reduce the amount of statements it has to process.
        if (mouseX > closeMenuButton.xPosition - 5) { // If mouse is on the right-hand side after the textures.
            if (closeMenuButton.getTexture() == GuiButtonPaintbrushMenu.Texture.ACTIVE)
                drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("paintbrushmenu.Close Menu.name")), mouseX, mouseY, fontRendererObj);
            else if (arrowUp.getTexture() == GuiButtonPaintbrushMenu.Texture.ACTIVE && arrowUp.visible)
                drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("paintbrushmenu.Previous Page.name")), mouseX, mouseY, fontRendererObj);
            else if (arrowDown.getTexture() == GuiButtonPaintbrushMenu.Texture.ACTIVE && arrowDown.visible)
                drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("paintbrushmenu.Next Page.name")), mouseX, mouseY, fontRendererObj);
        }
        drawInForeground(mouseX, mouseY);
    }

    @Override
    protected void actionPerformed(GuiButton clickedButton) {
        if (clickedButton.enabled) {
            editingPlayer.playSound("random.click", 1f, 1f);
            // Select Color
            if (clickedButton.id < 3) { // Page up or down button.
                if (clickedButton.id == 0) { // If page up...
                    currentPage--;
                } else if (clickedButton.id == 1) { // If page down...
                    currentPage++;
                } else { // Close button...
                    closeButtonAction();
                }
                hasNextPage = optionsOnCurrentPage + RESULTS_PER_PAGE * currentPage < totalOptions;
                optionsOnCurrentPage = Math.min(RESULTS_PER_PAGE, totalOptions - currentPage * RESULTS_PER_PAGE);
                updateButtons();
            } else if (clickedButton.id < 11){ // Selection button.
                selectAndSendUpdatePacket(clickedButton.id);
                updateButtons();
            } else {
                handleExtraButtons(clickedButton.id);
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
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8': {
                    if (Character.getNumericValue(eventChar) <= optionsOnCurrentPage) {
                        selectAndSendUpdatePacket(Character.getNumericValue(eventChar));
                    }
                }
            }
        }
    }

    public abstract void drawInBackground();
    public abstract void drawInForeground(int mouseX, int mouseY);
    public abstract void selectAndSendUpdatePacket(int choice);
    public abstract int getTotalOptions();
    public abstract int getSelectedOption();
    public void addExtraButtons() {}
    public void handleExtraButtons(int buttonID) {}
    public void closeButtonAction() {
        this.mc.thePlayer.closeScreen();
    }
}