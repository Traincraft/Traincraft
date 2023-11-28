package train.client.gui;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import train.common.Traincraft;
import train.common.api.EntityRollingStock;
import train.common.core.network.PacketTextureOverlayConfig;
import train.common.library.Info;
import train.common.overlaytexture.OverlayTextureManager;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * @author 02skaplan
 * <p>Fixed Overlay GUI for Paintbrush</p>
 */
@SideOnly(Side.CLIENT)
public class GuiFixedOverlay extends GuiAbstractPaintbrush {
    private BufferedImage subTextureRenderImage;
    private ResourceLocation subTextureRenderImageLocation;

    /**
     * @author 02skaplan
     */
    public GuiFixedOverlay(EntityPlayer editingPlayer, EntityRollingStock rollingStock) {
        super(editingPlayer, rollingStock);
    }


    @Override
    protected void updateButtons() {
        super.updateButtons();
        if (selectedOption != null) {
            if (currentPage == ((selectedOption - 1) / RESULTS_PER_PAGE)) { // If overlay is on current page, set the selected overlay to active and the rest to inactive.
                int numberOfActiveOverlayInGUI = (selectedOption - 1) % RESULTS_PER_PAGE; // Which button corresponds to the active overlay...
                for (int i = 3; i < this.buttonList.size(); i++) {
                    if (buttonList.get(i) instanceof GuiButtonPaintbrushMenu) {
                        if (i - 3 == numberOfActiveOverlayInGUI) {
                            ((GuiButtonPaintbrushMenu) buttonList.get(i)).setType(GuiButtonPaintbrushMenu.Type.SELECTIONBOX, GuiButtonPaintbrushMenu.Texture.ACTIVE);
                        } else {
                            ((GuiButtonPaintbrushMenu) buttonList.get(i)).setType(GuiButtonPaintbrushMenu.Type.SELECTIONBOX, GuiButtonPaintbrushMenu.Texture.INACTIVE);
                        }
                    }
                }
            } else { // If selected overlay is not on current page, set all buttons to inactive.
                for (int i = 3; i < this.buttonList.size(); i++) {
                    if (buttonList.get(i) instanceof GuiButtonPaintbrushMenu) {
                        ((GuiButtonPaintbrushMenu) buttonList.get(i)).setType(GuiButtonPaintbrushMenu.Type.SELECTIONBOX, GuiButtonPaintbrushMenu.Texture.INACTIVE);
                    }
                }
            }
        }
        updateSubtextureChoices();
    }

    @Override
    public void drawInBackground() {
        renderSubtextureChoices();
    }

    @Override
    public void drawInForeground(int mouseX, int mouseY) {
    }

    @Override
    public void selectAndSendUpdatePacket(int choice) {
        int newOverlayNumber = (currentPage * RESULTS_PER_PAGE) + (choice - 2);
        // Send an update packet to the server of texture change.
        // We don't actually change the texture on the client yet; we let the server know we changed it.
        // After the server recognizes that we changed it, it will send an update packet out to all clients.
        if (newOverlayNumber != 0) {
            rollingStock.getOverlayTextureContainer().getSpecificationFixed().setSelectedOverlay(newOverlayNumber);
            Traincraft.overlayTextureChannel.sendToServer(new PacketTextureOverlayConfig(OverlayTextureManager.Type.FIXED, rollingStock.getEntityId(), Minecraft.getMinecraft().thePlayer.worldObj.provider.dimensionId, rollingStock.getOverlayTextureContainer().getOverlayConfigTag()));
        }
    }

    @Override
    public int getTotalOptions() {
        return rollingStock.getOverlayTextureContainer().getSpecificationFixed().getNumberOfOverlaysOnSheet();
    }

    @Override
    public int getSelectedOption() {
        return rollingStock.getOverlayTextureContainer().getSpecificationFixed().getSelectedOverlay();
    }

    private void renderSubtextureChoices() {
        int offsetX = GUI_ANCHOR_X + 10;
        int offsetY = GUI_ANCHOR_Y + 12;
        int subTextureHeight = rollingStock.getOverlayTextureContainer().getSpecificationFixed().getHeightOfEachOverlay();
        int subTextureWidth = rollingStock.getOverlayTextureContainer().getSpecificationFixed().getWidthOfEachOverlay();
        int subTextureOffsetX = (85 / 2) - (subTextureWidth / 2);
        int subTextureOffsetY = (85 / 2) - (subTextureHeight / 2);

        mc.renderEngine.bindTexture(subTextureRenderImageLocation);
        GL11.glPushMatrix();
        GL11.glTranslated(0, 0, 400);
        for (int i = 0; i < optionsOnCurrentPage; i++) {
            this.drawTexturedModalRect(offsetX + subTextureOffsetX, offsetY + subTextureOffsetY, 0, i * subTextureHeight, subTextureWidth, subTextureHeight);
            offsetX += 95;
            if (offsetX > GUI_ANCHOR_X + 372) {
                offsetX = GUI_ANCHOR_X + 10;
                offsetY += 92;
            }
        }
        GL11.glPopMatrix();
    }

    /**
     * <p>Loads current selection of subtexture choices onto a separate (1:1 aspect ratio) resource image to use when
     * rendering the subtexture choices. If subtexture sheet is not 1:1, drawTexturedModalRect will draw incorrectly.</p>
     */
    private void updateSubtextureChoices() {
        int subTextureWidth = rollingStock.getOverlayTextureContainer().getSpecificationFixed().getWidthOfEachOverlay();
        int subTextureHeight = rollingStock.getOverlayTextureContainer().getSpecificationFixed().getHeightOfEachOverlay();
        int offsetY = currentPage * RESULTS_PER_PAGE * subTextureHeight;
        try {
            BufferedImage overlaySheet = ImageIO.read(Minecraft.getMinecraft().getResourceManager().getResource(new ResourceLocation(Info.resourceLocation, Info.fixedOverlayTexturePrefix + rollingStock.getOverlayTextureContainer().getSpecificationFixed().getOverlaySheetFilePath())).getInputStream());
            subTextureRenderImage = new BufferedImage(256, 256, BufferedImage.TYPE_INT_ARGB);
            for (int i = 0; i < optionsOnCurrentPage; i++) {
                subTextureRenderImage.getGraphics().drawImage(overlaySheet.getSubimage(0, offsetY, subTextureWidth, subTextureHeight), 0, i * subTextureHeight, subTextureWidth, subTextureHeight, null);
                offsetY += subTextureHeight;
            }
            subTextureRenderImage.getGraphics().dispose();
            subTextureRenderImageLocation = Minecraft.getMinecraft().getTextureManager().getDynamicTextureLocation("", new DynamicTexture(subTextureRenderImage));
        } catch (IOException ignored) {
            System.out.println("[TC] Fixed overlay menu rendering error.");
        }
    }
}