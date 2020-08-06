/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("GuiDistillery.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.blocks.distillery;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.FluidTank;
import net.minecraftforge.fluids.capability.IFluidHandler;
import traincraft.Traincraft;

import java.util.ArrayList;
import java.util.List;

public class GuiDistillery extends GuiContainer {
    
    public static final ResourceLocation GUI_LOC = new ResourceLocation(Traincraft.MOD_ID, "textures/gui/gui_distillation_tower2.png");
    
    private final TileDistillery tile;
    private final EntityPlayer player;
    
    public GuiDistillery(TileDistillery tile, EntityPlayer player){
        super(new ContainerDistillery(tile, player));
        this.tile = tile;
        this.player = player;
    }
    
    @Override
    public void initGui(){
        super.initGui();
        this.xSize = 176;
        this.ySize = 166;
    }
    
    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks){
        this.drawDefaultBackground();
        super.drawScreen(mouseX, mouseY, partialTicks);
        this.renderHoveredToolTip(mouseX, mouseY);
    }
    
    @Override
    protected void renderHoveredToolTip(int mouseX, int mouseY){
        super.renderHoveredToolTip(mouseX, mouseY);
        
        // fluid tank hovering
        if(this.isPointInRegion(144, 6, 20, 52, mouseX, mouseY)){
            IFluidHandler fluidTank = this.tile.getFluidTank(null);
            if(fluidTank instanceof FluidTank){
                int capacity = ((FluidTank) fluidTank).getCapacity();
                if(capacity > 0 && ((FluidTank) fluidTank).getFluid() != null){
                    List<String> hoveringText = new ArrayList<>();
                    hoveringText.add(((FluidTank) fluidTank).getFluid().getLocalizedName());
                    hoveringText.add(String.format("%dmB / %dmB", ((FluidTank) fluidTank).getFluidAmount(), capacity));
                    this.drawHoveringText(hoveringText, mouseX, mouseY);
                }
            }
        }
        
        // burn time hovering
        if(this.isPointInRegion(58, 37, 13, 13, mouseX, mouseY)){
            if(this.tile.maxBurnTime > 0){
                float burnPercent = this.tile.burnTime / (this.tile.maxBurnTime * 1F);
                this.drawHoveringText(String.format("%d%% left", Math.round(burnPercent * 100)), mouseX, mouseY);
            }
        }
        
        // recipe burn time hovering
        if(this.isPointInRegion(86, 35, 24, 38, mouseX, mouseY)){
            if(this.tile.maxRecipeBurnTime > 0){
                float burnPercent = (this.tile.maxRecipeBurnTime - this.tile.recipeBurnTime) / (this.tile.maxRecipeBurnTime * 1F);
                this.drawHoveringText(String.format("%d%%", Math.round(burnPercent * 100)), mouseX, mouseY);
            }
        }
    }
    
    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY){
        GlStateManager.pushMatrix();
        
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.renderEngine.bindTexture(GUI_LOC);
        this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
        
        IFluidHandler fluidTank = this.tile.getFluidTank(null);
        if(fluidTank instanceof FluidTank){
            this.drawFluid((FluidTank) fluidTank, this.guiLeft + 144, this.guiTop + 6, 20, 52);
        }
        
        GlStateManager.popMatrix();
    }
    
    private void drawFluid(FluidTank tank, int x, int y, int width, int height){
        if(tank != null && tank.getFluid() != null){
            ResourceLocation fluidTexture = tank.getFluid().getFluid().getStill();
            fluidTexture = new ResourceLocation(fluidTexture.getNamespace(), "textures/" + fluidTexture.getPath() + ".png");
            this.mc.renderEngine.bindTexture(fluidTexture);
            int factor = tank.getFluidAmount() * height / tank.getCapacity();
            drawModalRectWithCustomSizedTexture(x, y + height - factor, 0, 0, width, factor, 16, 512);
        }
    }
    
}
