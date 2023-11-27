package train.common.overlaytexture;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import train.common.library.Info;

import java.awt.*;
import java.io.IOException;

public enum EnumOverlayFonts {
    /**
     * Recommended Java font size: 16f.
     */
    OxygenSansSmall("textures/overlayfonts/OxygenSansSmall.ttf"),
    /**
     * Recommended Java font size: 7f.
     * <p>Graciously created and provided by everyone's favorite fox, Bidahochi.</p>
     */
    BapSansSmall("textures/overlayfonts/BapSans.ttf"),
    /**
     * Recommended Java font size: 16f.
     */
    OxygenSansMid("textures/overlayfonts/OxygenSansMid.ttf");
    private final String resourcePath;

    EnumOverlayFonts(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    @SideOnly(Side.CLIENT)
    public Font getFont() {
        Font font;
        try {
            font = Font.createFont(Font.TRUETYPE_FONT, Minecraft.getMinecraft().getResourceManager().getResource(new ResourceLocation(Info.resourceLocation, resourcePath)).getInputStream());
        } catch (IOException | FontFormatException ioException) {
            System.out.println("[TC] Dynamic Texture Font Loading Failed");
            ioException.printStackTrace();
            font = Font.getFont(Font.SANS_SERIF);
        }
        return font;
    }
}