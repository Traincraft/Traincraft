package train.common.overlaytexture;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * @author 02skaplan
 * <p>Dynamic overlays specifications contain all information for a specific dynamic overlay as part of the TC Overlay Texture system.</p>
 */
public class OTSpecificationDynamic extends OTSpecification {
    final float fontSize;
    final int maxWidth;
    final int maxHeight;
    final private EnumOverlayFonts font;
    final private AlignmentMode alignmentMode;
    private String displayText;
    private Color foregroundColor = new Color(25, 25, 25, 255);
    private Color backgroundColor = new Color(0, 0, 0, 0);
    private final String overlayName;
    private final Integer characterLimit;

    public enum AlignmentMode {
        ALIGN_LEFT_AND_CLIP,
        ALIGN_CENTER_AND_FILL,
        ALIGN_RIGHT_AND_CLIP
    }

    /**
     * @author 02skaplan
     * @param overlayName Readable name for overlay. Ex: "Road Name", "Engine Number".
     * @param maxWidth Maximum width of overlay.
     * @param maxHeight Maximum height of overlay.
     * @param characterLimit Optional character limit. For default, set to null.
     * @param font Font registered in EnumOverlayFonts.
     * @param fontSize Font size.
     * @param alignmentMode Alignment mode dictating how the text will be drawn in the given overlay.
     * @param drawingPointsList List of points on the texture map for a given model on which to draw the overlay.
     */
    public OTSpecificationDynamic(String overlayName, int maxWidth, int maxHeight, Integer characterLimit, EnumOverlayFonts font, float fontSize, AlignmentMode alignmentMode, Point[] drawingPointsList) {
        super(drawingPointsList);
        this.overlayName = overlayName;
        this.maxWidth = maxWidth;
        this.maxHeight = maxHeight;
        this.characterLimit = characterLimit;
        this.fontSize = fontSize;
        this.alignmentMode = alignmentMode;
        setDisplayText("");
        this.font = font;
    }


    @Override
    @SideOnly(Side.CLIENT)
    public void renderOverlay() {
        Font renderFont = font.getFont().deriveFont(fontSize);
        overlayImage = new BufferedImage(maxWidth, maxHeight, BufferedImage.TYPE_INT_ARGB);
        Graphics graphics = overlayImage.getGraphics();
        graphics.setColor(backgroundColor);
        // Draw the background color only as wide and tall as the string itself, but neither wider nor taller than the respective maximum.
        int stringWidth = (int) renderFont.getStringBounds(displayText, graphics.getFontMetrics().getFontRenderContext()).getWidth();
        int stringHeight = (int) renderFont.getStringBounds(displayText, graphics.getFontMetrics().getFontRenderContext()).getHeight();
        graphics.setColor(backgroundColor);
        graphics.setFont(renderFont);
        int drawStringAtY = (int) ((graphics.getFontMetrics().getAscent() * 0.25) + (maxHeight * 0.5));
        if (alignmentMode == AlignmentMode.ALIGN_LEFT_AND_CLIP) {
            graphics.fillRect(0, 0, Math.min(stringWidth, maxWidth), Math.min(stringHeight, maxHeight));
            graphics.setColor(foregroundColor);
            graphics.drawString(displayText, 0, drawStringAtY);
        } else if (alignmentMode == AlignmentMode.ALIGN_CENTER_AND_FILL) {
            graphics.fillRect(0, 0, maxWidth, maxHeight);
            graphics.setColor(foregroundColor);
            graphics.drawString(displayText, Math.max(0, ((maxWidth / 2) - (graphics.getFontMetrics().stringWidth(displayText)) / 2)), (int) ((graphics.getFontMetrics().getAscent() * 0.25) + (maxHeight * 0.5)));
        } else if (alignmentMode == AlignmentMode.ALIGN_RIGHT_AND_CLIP) {
            graphics.fillRect(Math.max(maxWidth - stringWidth, 0), 0, stringWidth, Math.min(stringHeight, maxHeight));
            graphics.setColor(foregroundColor);
            graphics.drawString(displayText, maxWidth - stringWidth, drawStringAtY);
        }
        graphics.dispose();
    }

    public void setDisplayText(String displayText) {
        this.displayText = displayText;
    }
    public String getDisplayText() { return displayText; }

    public void setForegroundColor(Color foregroundColor) {
        this.foregroundColor = foregroundColor;
    }
    public Color getForegroundColor() { return foregroundColor; }
    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
    public Color getBackgroundColor() { return backgroundColor; }
    public String getOverlayName() {
        return overlayName;
    }
    public Integer getCharacterLimit() { return characterLimit; }
}