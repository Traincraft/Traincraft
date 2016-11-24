/*
 * This file ("GuiHearthFurnace.java") is part of the Traincraft mod for Minecraft.
 * It is created by all persons that are listed with @author below.
 * It is distributed under the Traincraft License (https://github.com/Traincraft/Traincraft/blob/master/LICENSE.md)
 * You can find the source code at https://github.com/Traincraft/Traincraft
 *
 * © 2011-2016
 */

package si.meansoft.traincraft.client.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import si.meansoft.traincraft.TraincraftResources;
import si.meansoft.traincraft.tile.TileEntityHearthFurnace;

/**
 * @author canitzp
 */
public class GuiHearthFurnace extends GuiContainer{

    private static ResourceLocation guiLoc = TraincraftResources.GUI_HEARTH_FURNACE.newGuiLocation();
    public TileEntityHearthFurnace tile;

    public GuiHearthFurnace(Container container, EntityPlayer player, TileEntity tile){
        super(container);
        this.xSize = 176;
        this.ySize = 166;
        this.tile = (TileEntityHearthFurnace)tile;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY){
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(guiLoc);
        this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
        if(this.tile.fuelTime > 0){
            int i1 = this.getBurnLeftScaled(12);
            this.drawTexturedModalRect(guiLeft+36, guiTop+36+12-i1, 176, 12-i1, 14, i1+2);
            this.drawTexturedModalRect(guiLeft+56, guiTop+36+12-i1, 176, 12-i1, 14, i1+2);
        }
        int l = this.getCookProgressScaled(24);
        this.drawTexturedModalRect(guiLeft+79, guiTop+34, 176, 14, l+1, 16);
    }

    private int getCookProgressScaled(int pixels){
        int i = this.tile.processTime;
        int j = this.tile.maxProcessTime;
        return j != 0 && i != 0 ? i * pixels / j : 0;
    }

    private int getBurnLeftScaled(int pixels){
        int i = this.tile.maxFuelTime;
        return this.tile.fuelTime*pixels/(i == 0 ? 1 : i);
    }
}
