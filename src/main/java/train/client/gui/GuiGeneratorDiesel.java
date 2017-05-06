package train.client.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import train.common.containers.ContainerGeneratorDiesel;
import train.common.library.Info;
import train.common.tile.TileGeneratorDiesel;

public class GuiGeneratorDiesel extends GuiContainer{

    private TileGeneratorDiesel dieselInventory;

    public GuiGeneratorDiesel(InventoryPlayer invPlayer, TileGeneratorDiesel tile){
        super(new ContainerGeneratorDiesel(invPlayer, tile));
        dieselInventory = tile;
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int par1, int par2){
        fontRendererObj.drawString("Diesel Generator", 8, 6, 0x404040);
        fontRendererObj.drawString("Inventory", 8, (ySize-96)+2, 0x404040);
    }

    @Override
    public void drawScreen(int t, int g, float par3){
        super.drawScreen(t, g, par3);
        //if ((LiquidManager.diesel != null && dieselInventory.getLiquidItemIDClient() == LiquidManager.diesel.itemID)) {
        if(intersectsWith(t, g)){
            drawCreativeTabHoveringText("Diesel", t, g);
        }
        //}
    }

    @Override
    protected void drawCreativeTabHoveringText(String str, int t, int g){
        int textWidth = fontRendererObj.getStringWidth(dieselInventory.theTank.getFluidAmount()+"/"+dieselInventory.getTankCapacity());
        int startX = t+14;
        int startY = g-12;

        int i4 = 0xf0100010;
        drawGradientRect(startX-3, startY-4, startX+textWidth+3, startY+8+4+10, i4, i4);
        drawGradientRect(startX-4, startY-3, startX+textWidth+4, startY+8+3+10, i4, i4);
        int colour1 = 0x505000ff;
        int colour2 = (colour1 & 0xfefefe) >> 1 | colour1 & 0xff000000;
        drawGradientRect(startX-3, startY-3, startX+textWidth+3, startY+8+3+10, colour1, colour2);
        drawGradientRect(startX-2, startY-2, startX+textWidth+2, startY+8+2+10, i4, i4);
        fontRendererObj.drawStringWithShadow(str, startX, startY, -1);
        fontRendererObj.drawStringWithShadow(dieselInventory.theTank.getFluidAmount()+"/"+dieselInventory.getTankCapacity(), startX, startY+10, -1);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float f, int t, int g){
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.guiPrefix+"gui_generator_diesel.png"));
        int j = (width-xSize)/2;
        int k = (height-ySize)/2;
        drawTexturedModalRect(j, k, 0, 0, xSize, ySize);
        int amount = dieselInventory.theTank.getFluidAmount();
        int liqui = Math.abs((amount*50)/(dieselInventory.getTankCapacity()));
        //if ((LiquidManager.diesel != null && dieselInventory.getLiquidItemIDClient() == LiquidManager.diesel.itemID)) {
        drawTexturedModalRect(j+145, (k+57)-liqui, 177, 107-liqui, 18, liqui);
        //}
        if(dieselInventory.currentBurnTime > 0){
            int l = 12;
            drawTexturedModalRect(j+56, (k+36+12)-l, 176, 12-l, 14, l+2);
        }
    }

    public boolean intersectsWith(int mouseX, int mouseY){
        int j = (width-xSize)/2;
        int k = (height-ySize)/2;
        return mouseX >= j+143 && mouseX <= j+164 && mouseY >= k+5 && mouseY <= k+57;
    }
}
