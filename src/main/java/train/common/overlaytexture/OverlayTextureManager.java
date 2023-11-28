package train.common.overlaytexture;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.ResourceLocation;
import train.client.render.RenderRollingStock;
import train.common.api.AbstractTrains;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author 02skaplan
 * <p>Overlay texture manager class for the overlay texture system.</p>
 * <p>Contains configuration and render utilities for fixed and dynamic overlay specifications.</p>
 */
public class OverlayTextureManager {
    public enum Type {
        DYNAMIC,
        FIXED,
        BOTH,
        NONE
    }
    public OverlayTextureManager(Type acceptedType, AbstractTrains rollingStock) {
        this.acceptedType = acceptedType;
        this.rollingStock = rollingStock;
    }
    public boolean markedForUpdate = false;
    private final Type acceptedType;
    private final AbstractTrains rollingStock;
    private Type type = Type.NONE;
    private final ArrayList<OTSpecificationDynamic> specificationDynamicList = new ArrayList<>();
    private OTSpecificationFixed specificationFixed;
    @SideOnly(Side.CLIENT)
    private BufferedImage overlaidTexture;
    @SideOnly(Side.CLIENT)
    private ResourceLocation overlaidTextureResource;

    public void setTypeAndMarkForUpdate(Type type) {
        this.type = type;
        markedForUpdate = true;
    }

    /**
     * @author 02skaplan
     * <p>Renders overlay of given type onto base texture of RollingStock.</p>
     */
    @SideOnly(Side.CLIENT)
    public void renderTexture() {
        ArrayList<OTSpecification> renderList = new ArrayList<>();
        if (type == acceptedType || acceptedType == Type.BOTH) {
            if (type == Type.FIXED) { // Render the fixed overlay and add it to the drawing queue.
                specificationFixed.renderOverlay();
                renderList.add(specificationFixed);
            } else if (type == Type.DYNAMIC) { // Render each dynamic overlay and add it to the drawing queue
                for (OTSpecificationDynamic dynamicOverlay : specificationDynamicList) {
                    if (!dynamicOverlay.getDisplayText().isEmpty()) {
                        dynamicOverlay.renderOverlay();
                        renderList.add(dynamicOverlay);
                    }
                }
            }

            // Take the rendered overlay(s) and draw them on top of the base texture.
            try {
                BufferedImage baseTexture = ImageIO.read(Minecraft.getMinecraft().getResourceManager().getResource(RenderRollingStock.getTexture(rollingStock)).getInputStream());
                overlaidTexture = new BufferedImage(baseTexture.getWidth(), baseTexture.getHeight(), BufferedImage.TYPE_INT_ARGB);
                Graphics graphics = overlaidTexture.getGraphics();
                graphics.drawImage(baseTexture, 0, 0, null);

                for (OTSpecification overlaySpecification : renderList) {
                    for (Point point : overlaySpecification.getDrawingPointsList()) {
                        graphics.drawImage(overlaySpecification.getOverlayImage(), point.x, point.y, null);
                    }
                }

                graphics.dispose();

                // Assign the new texture to a resourcelocation as a DynamicTexture, so it can be accessed by RenderRollingStock when rendering the model.
                overlaidTextureResource = Minecraft.getMinecraft().getTextureManager().getDynamicTextureLocation("", new DynamicTexture(overlaidTexture));
                markedForUpdate = false;
            } catch (IOException ignored) {
                System.out.println("[TC] Overlay application onto base texture failed.");
            }
        }
    }

    /**
     * <p>Setup and configure fixed overlays.</p>
     * @author 02skaplan
     * <p>Add a new fixed overlay to a specific model.</p>
     * <p>Can only be called once per model.</p>
     */
    public void initSpecificationFixed(OTSpecificationFixed fixedSpecification) {
        specificationFixed = fixedSpecification;
    }

    /**
     * @author 02skaplan
     * <p>Add a new dynamic overlay to a specific model.</p>
     * <p>Can be called multiple times for multiple dynamic overlays.</p>
     */
    public void initSpecificationDynamic(OTSpecificationDynamic newDynamicSpecification) {
        specificationDynamicList.add(newDynamicSpecification);
    }

    public ResourceLocation getOverlaidTextureResource() {
        return overlaidTextureResource;
    }

    public OTSpecificationFixed getSpecificationFixed() {
        return specificationFixed;
    }

    public ArrayList<OTSpecificationDynamic> getSpecificationDynamicList() {
        return specificationDynamicList;
    }

    public Type getType() {
        return type;
    }

    public Type getAcceptedType() {
        return acceptedType;
    }

    /**
     * @author 02skaplan
     * <p>Retrieve the overlay configuration as an NBTTagCompound.</p>
     * @return NBTTagCompound containing overlay information.
     */
    public NBTTagCompound getOverlayConfigTag() {
        NBTTagCompound nbtTagOverlayConfig = new NBTTagCompound();
        nbtTagOverlayConfig.setInteger("type", type.ordinal());
        // Fixed Overlay
        if (specificationFixed != null)
            nbtTagOverlayConfig.setInteger("selectedOverlay", specificationFixed.getSelectedOverlay());
        // Dynamic Overlay
        if (!specificationDynamicList.isEmpty()) {
            NBTTagList dynamicTagList = new NBTTagList();
            NBTTagCompound dynamicOverlayTag;
            for (OTSpecificationDynamic dynamic : specificationDynamicList) {
                dynamicOverlayTag = new NBTTagCompound();
                dynamicOverlayTag.setString("dynamicDisplayText", dynamic.getDisplayText());
                dynamicOverlayTag.setInteger("backgroundColorRGBA", dynamic.getBackgroundColor().getRGB());
                dynamicOverlayTag.setInteger("foregroundColorRGBA", dynamic.getForegroundColor().getRGB());
                dynamicTagList.appendTag(dynamicOverlayTag);
            }
            nbtTagOverlayConfig.setTag("dynamicOverlay", dynamicTagList);
        }
        return nbtTagOverlayConfig;
    }

    /**
     * @author 02skaplan
     * <p>Import overlay configuration from NBTTagCompound containing overlay information.</p>
     * @param nbtTagOverlayConfig NBTTagCompound containing overlay information.
     */
    public void importFromConfigTag(NBTTagCompound nbtTagOverlayConfig) {
        if (nbtTagOverlayConfig.hasKey("type")) {
            if (Type.values()[nbtTagOverlayConfig.getInteger("type")] == Type.FIXED) {
                specificationFixed.setSelectedOverlay(nbtTagOverlayConfig.getInteger("selectedOverlay"));
                this.setTypeAndMarkForUpdate(Type.FIXED);
            } else if (Type.values()[nbtTagOverlayConfig.getInteger("type")] == Type.DYNAMIC) {
                if (nbtTagOverlayConfig.hasKey("dynamicOverlay")) { // Import dynamic overlays from tag list.
                    NBTTagList overlayTagList = nbtTagOverlayConfig.getTagList("dynamicOverlay", 10); // No idea what the "10" int is for. It doesn't work without it, though!
                    for (int i = 0; i < overlayTagList.tagCount(); i++) {
                        specificationDynamicList.get(i).setDisplayText(overlayTagList.getCompoundTagAt(i).getString("dynamicDisplayText"));
                        specificationDynamicList.get(i).setBackgroundColor(new Color(overlayTagList.getCompoundTagAt(i).getInteger("backgroundColorRGBA"), true));
                        specificationDynamicList.get(i).setForegroundColor(new Color(overlayTagList.getCompoundTagAt(i).getInteger("foregroundColorRGBA"), true));
                    }
                }
                this.setTypeAndMarkForUpdate(Type.DYNAMIC);
            }
        }
    }

}