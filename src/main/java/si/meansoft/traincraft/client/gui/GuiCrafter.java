/*
 * This file ("GuiCrafter.java") is part of the Traincraft mod for Minecraft.
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
import si.meansoft.traincraft.tile.crafter.TileEntityCrafterBase;

/**
 * @author canitzp
 */
public class GuiCrafter extends GuiContainer {

    private static ResourceLocation guiLoc;

    public GuiCrafter(Container container, EntityPlayer player, TileEntity crafter) {
        super(container);
        this.xSize = 176;
        this.ySize = 254;
        switch(((TileEntityCrafterBase)crafter).getTier()){
            case STEAM: guiLoc = TraincraftResources.GUI_CRAFTERSTEAM.newGuiLocation(); break;
            case DIESEL: guiLoc = TraincraftResources.GUI_CRAFTERDIESEL.newGuiLocation(); break;
            case ELECTRO: guiLoc = TraincraftResources.GUI_CRAFTERELECTRO.newGuiLocation(); break;
        }
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(guiLoc);
        this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
    }
}
