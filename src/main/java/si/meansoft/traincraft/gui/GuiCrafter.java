package si.meansoft.traincraft.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import si.meansoft.traincraft.TraincraftResources;
import si.meansoft.traincraft.tileEntities.TileEntityCrafter;

/**
 * @author canitzp
 */
public class GuiCrafter extends GuiContainer {

    private static ResourceLocation guiLoc;

    public GuiCrafter(Container container, EntityPlayer player, TileEntity crafter) {
        super(container);
        this.xSize = 176;
        this.ySize = 254;
        switch(((TileEntityCrafter)crafter).tier){
            case STEAM: guiLoc = TraincraftResources.CRAFTERSTEAM.newResourceLocation(); break;
            case DIESEL: guiLoc = TraincraftResources.CRAFTERDIESEL.newResourceLocation(); break;
            case ELECTRO: guiLoc = TraincraftResources.CRAFTERELECTRO.newResourceLocation(); break;
        }
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(guiLoc);
        this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
    }
}
