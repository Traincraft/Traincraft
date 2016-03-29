package si.meansoft.traincraft.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import si.meansoft.traincraft.TraincraftResources;
import si.meansoft.traincraft.tileEntities.TileEntityDistillery;

/**
 * @author canitzp
 */
public class GuiDistillery extends GuiContainer {

    public ResourceLocation guiDistillery = TraincraftResources.DISTILLERY.newResourceLocation();
    public EntityPlayer player;
    public TileEntityDistillery distillery;

    public GuiDistillery(Container container, EntityPlayer player, TileEntity distillery) {
        super(container);
        this.player = player;
        this.distillery = (TileEntityDistillery) distillery;
        this.ySize = 166;
        this.xSize = 176;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(guiDistillery);
        this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
    }
}
