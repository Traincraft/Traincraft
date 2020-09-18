/*
 * Traincraft
 * Copyright (c) 2011-2020.
 *
 * This file ("null.java") is part of the Traincraft mod for Minecraft.
 * It is created by all people that are listed with @author below.
 * It is distributed under LGPL-v3.0.
 * You can find the source code at https://github.com/Traincraft/Traincraft
 */
package traincraft.blocks.assemblytables;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.Level;
import traincraft.Traincraft;

*

public class GuiAssemblyTable extends GuiContainer {
    
    private static final ResourceLocation GUI_LOCATION_TIER1 = new ResourceLocation(Traincraft.MOD_ID, "textures/gui/gui_assemblytable_tier1.png");
    private static final ResourceLocation GUI_LOCATION_TIER2 = new ResourceLocation(Traincraft.MOD_ID, "textures/gui/gui_assemblytable_tier2.png");
    private static final ResourceLocation GUI_LOCATION_TIER3 = new ResourceLocation(Traincraft.MOD_ID, "textures/gui/gui_assemblytable_tier3.png");
    private final int tier;
    private final TileAssemblyTable tileAssemblyTable;
    private EntityPlayer player;
    
    /*
     * Locations (pixels) of GUI elements. From top left corner, first pixel that should be in image.
     * Width, Height of GUI: (176, 256)
     *
     * Red Border (178, 1); (32, 32) size
     * Green Border (209, 1); (32, 32) size
     *
     * Red strong border: (181, 63); (24, 24) size
     * Green Strong Border (212, 63); (24, 24) size
     */
    public GuiAssemblyTable(int tier, EntityPlayer player, TileAssemblyTable tileAssemblyTable){
        super(new ContainerAssemblyTable(player.inventory, tileAssemblyTable));
        
        this.xSize = 176;
        this.ySize = 256;
        
        this.tier = tier;
        this.player = player;
        this.tileAssemblyTable = tileAssemblyTable;
    }
    
    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks){
        this.drawDefaultBackground();
        super.drawScreen(mouseX, mouseY, partialTicks);
        this.renderHoveredToolTip(mouseX, mouseY);
    }
    
    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY){
    }
    
    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY){
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        
        //draw the gui image based on location
        ResourceLocation guiLoc;
        switch(tier){
            case 1:
                guiLoc = GUI_LOCATION_TIER1;
                break;
            case 2:
                guiLoc = GUI_LOCATION_TIER2;
                break;
            case 3:
                guiLoc = GUI_LOCATION_TIER3;
                break;
            default:
                Traincraft.LOGGER.log(Level.ERROR, "Invalid tier found when opening Assembly Table Gui.");
                //set to the Tier1, just so things don't fall apart.
                guiLoc = GUI_LOCATION_TIER1;
                break;
        }
        
        this.mc.renderEngine.bindTexture(guiLoc);
        this.drawTexturedModalRect((width - 176) / 2, (height - 256) / 2, 0, 0, 176, 256);
        
        //draw the text
        //it seems that minecraft is not prepared to have different size guis than in vanilla, so we must do manual interpolation
        int adjustedX = (this.width - 176) / 2;
        int adjustedY = (this.height - 256) / 2;
        
        this.fontRenderer.drawString(I18n.format(Traincraft.MOD_ID + ":assembly_table_" + tier + ".name"), 10 + adjustedX, 6 + adjustedY, 12241200);
        
        //int color = new Color(147, 145, 158).getRGB(); // ie 9671070
        this.fontRenderer.drawString(I18n.format(Traincraft.MOD_ID + ":assemblytable.storage"), 10 + adjustedX, 118 + adjustedY, 9671070);
        this.fontRenderer.drawString(I18n.format(Traincraft.MOD_ID + ":assemblytable.output"), 90 + adjustedX, 118 + adjustedY, 9671070);
    }
    
    //TODO: create methods to change color of slots, etc.
    public void drawColoredSlot(int xPos, int yPos, SlotColor color){
    
    }
}

/* * Stores the types of slot borders that are usable + their locations and size. Reduces use of magic numbers.
 * <p>
 * locX and locY are the location of the slot border in the gui texture
 * sizeX and sizeY are the size of the border in the texture.
 *
 * @author PseudoynmPatel
 * @since 2020-8-11
 */
enum SlotColor {
    GLOWGREEN(209, 1, 32, 32),
    GLOWRED(209, 1, 32, 32),
    SOLIDGREEN(181, 63, 24, 24),
    SOLIDRED(212, 63, 24, 24);
    
    private final int locX;
    private final int locY;
    private final int sizeX;
    private final int sizeY;
    
    SlotColor(int locX, int locY, int sizeX, int sizeY){
        this.locX = locX;
        this.locY = locY;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }
}