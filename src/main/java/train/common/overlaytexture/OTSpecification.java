package train.common.overlaytexture;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * <p>An abstract parent class of different types of overlay specifications.</p>
 * @author 02skaplan
 */
public abstract class OTSpecification {
    @SideOnly(Side.CLIENT)
    protected BufferedImage overlayImage;
    private final Point[] drawingPointsList;
    protected OTSpecification(Point[] drawingPointsList) {
        this.drawingPointsList = drawingPointsList;
    }
    public Point[] getDrawingPointsList() {
        return drawingPointsList;
    }
    @SideOnly(Side.CLIENT)
    public BufferedImage getOverlayImage() { return overlayImage; }
    @SideOnly(Side.CLIENT)
    abstract void renderOverlay();
}