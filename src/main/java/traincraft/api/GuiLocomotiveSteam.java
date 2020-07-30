/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("GuiLocomotiveSteam.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */

package traincraft.api;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.capability.IFluidHandler;
import traincraft.Traincraft;

public class GuiLocomotiveSteam extends GuiContainer {
    
    private static final ResourceLocation GUI_LOCATION = new ResourceLocation(Traincraft.MOD_ID, "textures/gui/gui_loco_steam.png");
    
    private final LocomotiveSteam<?> locomotiveSteam;
    
    public GuiLocomotiveSteam(LocomotiveSteam<?> locomotiveSteam, EntityPlayer player){
        super(new ContainerLocomotiveSteam(locomotiveSteam, player));
        this.locomotiveSteam = locomotiveSteam;
        
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
        if(this.isPointInRegion(142, 18, 20, 52, mouseX, mouseY)){
            IFluidHandler fluidTank = this.locomotiveSteam.getFluidTank(this.locomotiveSteam, null);
            if(fluidTank instanceof FluidTankTyped){
                int capacity = ((FluidTankTyped) fluidTank).getCapacity();
                if(capacity > 0){
                    this.drawHoveringText(String.format("%dmB / %dmB", ((FluidTankTyped) fluidTank).getFluidAmount(), capacity), mouseX, mouseY);
                }
            }
        }
        
        // burn time hovering
        if(this.isPointInRegion(8, 37, 14, 12, mouseX, mouseY)){
            if(this.locomotiveSteam.maxBurnTime > 0){
                float burnPercent = (this.locomotiveSteam.maxBurnTime - this.locomotiveSteam.burnTime) / (this.locomotiveSteam.maxBurnTime * 1F);
                this.drawHoveringText(String.format("%d%%", Math.round(burnPercent * 10)), mouseX, mouseY);
            }
        }
    }
    
    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY){
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.renderEngine.bindTexture(GUI_LOCATION);
        this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
        
        IFluidHandler fluidTank = this.locomotiveSteam.getFluidTank(this.locomotiveSteam, null);
        if(fluidTank instanceof FluidTankTyped){
            int capacity = ((FluidTankTyped) fluidTank).getCapacity();
            if(capacity > 0){
                int fluidAmount = ((FluidTankTyped) fluidTank).getFluidAmount();
                float usedPercent = fluidAmount / (capacity * 1F);
                this.drawTexturedModalRect(guiLeft + 143, guiTop + 70 - Math.round(52 * usedPercent), 190, 19, 18, Math.round(52 * usedPercent));
            }
        }
        
        if(this.locomotiveSteam.burnTime > 0 && this.locomotiveSteam.maxBurnTime > 0){
            float burnPercent = this.locomotiveSteam.burnTime / (this.locomotiveSteam.maxBurnTime * 1F);
            int height = Math.round(12 * burnPercent);
            this.drawTexturedModalRect(guiLeft + 8, guiTop + 37 + 12 - height, 176, 13 - height, 14, height + 1);
        }
    }
}
