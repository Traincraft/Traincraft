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
        if(this.distillery.isBurning()) {
            int i1 = this.getBurnLeftScaled(12);
            this.drawTexturedModalRect(guiLeft + 56, guiTop + 36 + 12 - i1, 176, 12 - i1, 14, i1 + 2);
        }
        int i1 = this.getCookProgressScaled(22);
        this.drawTexturedModalRect(guiLeft + 87, guiTop + 36, 184, 15, i1, 41);
    }

    private int getCookProgressScaled(int pixels)
    {
        int i = this.distillery.currentCookTime;
        int j = this.distillery.maxCookTime;
        return j != 0 && i != 0 ? i * pixels / j : 0;
    }

    private int getBurnLeftScaled(int pixels)
    {
        int i = this.distillery.currentBurn;

        if (i == 0)
        {
            i = 200;
        }

        return this.distillery.maxBurnTime * pixels / i;
    }
}
