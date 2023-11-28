package train.common.overlaytexture;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import train.common.library.Info;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * @author 02skaplan
 */
public class OTSpecificationFixed extends OTSpecification {
    private final String overlaySheetFilePath;
    private final int numberOfOverlaysOnSheet;
    private final int widthOfEachOverlay;
    private final int heightOfEachOverlay;
    private int selectedOverlay;

    public OTSpecificationFixed(String overlaySheetFilePath, int numberOfOverlaysOnSheet, int widthOfEachOverlay, int heightOfEachOverlay, Point[] drawingPointsList) {
        super(drawingPointsList);
        this.overlaySheetFilePath = overlaySheetFilePath;
        this.numberOfOverlaysOnSheet = numberOfOverlaysOnSheet;
        this.widthOfEachOverlay = widthOfEachOverlay;
        this.heightOfEachOverlay = heightOfEachOverlay;
        setSelectedOverlay(0);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void renderOverlay() {
        try {
            BufferedImage overlaySheet = ImageIO.read(Minecraft.getMinecraft().getResourceManager().getResource(new ResourceLocation(Info.resourceLocation, Info.fixedOverlayTexturePrefix + overlaySheetFilePath)).getInputStream());
            overlayImage = new BufferedImage(overlaySheet.getWidth(), heightOfEachOverlay, BufferedImage.TYPE_INT_ARGB);
            overlayImage.getGraphics().drawImage(overlaySheet.getSubimage(0, heightOfEachOverlay * (getSelectedOverlay() - 1), overlaySheet.getWidth(), heightOfEachOverlay), 0, 0, null);
            overlayImage.getGraphics().dispose();
        } catch (IOException ignored) {
            System.out.println("[TC] Fixed Overlay Texture Render Error");
        }
    }

    public int getSelectedOverlay() {
        return selectedOverlay;
    }

    public void setSelectedOverlay(int selectedOverlay) {
        if (selectedOverlay <= getNumberOfOverlaysOnSheet()) {
            this.selectedOverlay = selectedOverlay;
        }
    }

    public int getNumberOfOverlaysOnSheet() {
        return numberOfOverlaysOnSheet;
    }
    public String getOverlaySheetFilePath() {
        return overlaySheetFilePath;
    }
    public int getHeightOfEachOverlay() {
        return this.heightOfEachOverlay;
    }
    public int getWidthOfEachOverlay() {
        return this.widthOfEachOverlay;
    }
}