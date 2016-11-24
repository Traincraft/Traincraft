/*
 * This file ("GuiDistillery.java") is part of the Traincraft mod for Minecraft.
 * It is created by all persons that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/blob/master/LICENSE.md)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2016
 */

package si.meansoft.traincraft.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.FluidTank;
import si.meansoft.traincraft.TraincraftResources;
import si.meansoft.traincraft.tile.TileEntityDistillery;

/**
 * @author canitzp
 */
public class GuiDistillery extends GuiContainer {

    public ResourceLocation guiDistillery = TraincraftResources.GUI_DISTILLERY.newGuiLocation();
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
        drawFluid(this.distillery.tank, guiLeft + 144, guiTop + 6, 20, 52);
    }

    private int getCookProgressScaled(int pixels) {
        int i = this.distillery.currentCookTime;
        int j = this.distillery.maxCookTime;
        return j > 0 && i > 0 ? (j - i) * pixels / j : 0;
    }

    private int getBurnLeftScaled(int pixels)
    {
        int i = this.distillery.maxBurnTime;

        if (i == 0)
        {
            i = 1;
        }

        return this.distillery.currentBurn * pixels / i;
    }

    private void drawFluid(FluidTank tank, int x, int y, int width, int height){
        if(tank != null && tank.getFluid() != null){
            ResourceLocation fluidTexture = tank.getFluid().getFluid().getStill();
            fluidTexture = new ResourceLocation(fluidTexture.getResourceDomain(), "textures/" + fluidTexture.getResourcePath() + ".png");
            Minecraft.getMinecraft().getTextureManager().bindTexture(fluidTexture);
            int factor = this.distillery.getField(4) * height / tank.getCapacity();
            drawModalRectWithCustomSizedTexture(x, y + height - factor, 0, 0, width, factor, 16, 512);
        }
    }

}
