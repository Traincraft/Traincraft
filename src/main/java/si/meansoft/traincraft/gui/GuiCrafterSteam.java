package si.meansoft.traincraft.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import si.meansoft.traincraft.TraincraftResources;

/**
 * @author canitzp
 */
public class GuiCrafterSteam extends GuiContainer {

    private static final ResourceLocation guiLoc = TraincraftResources.CRAFTERSTEAM.newResourceLocation();

    public GuiCrafterSteam(Container container, EntityPlayer player, TileEntity crafterSteam) {
        super(container);
        this.xSize = 176;
        this.ySize = 254;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(guiLoc);
        this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
    }
}
