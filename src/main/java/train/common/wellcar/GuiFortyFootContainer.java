package train.common.wellcar;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class GuiFortyFootContainer extends GuiContainer {

    private InventoryPlayer inventory;
    private TileFortyFootContainer te;
    private int inventoryRows;
    public GuiFortyFootContainer(TileFortyFootContainer te, EntityPlayer player) {
        super(new ContainerStorage(te, player));
        inventory = player.inventory;
        this.te = te;
        short short1 = 222;
        int i = short1 - 108;
        this.inventoryRows = inventory.getSizeInventory() / 9;
        this.ySize = i + this.inventoryRows * 18;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
    {
       // Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("textures/gui/container/generic_54.png"));
         Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("tc:/textures/gui/container40.png"));
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
    // this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.inventoryRows * 9 + 61);
      // this.drawTexturedModalRect(k, l + this.inventoryRows * 18 + 40, 0, 126, this.xSize, 100);
        drawTexturedModalRect(k,l, 0, 0, xSize, inventoryRows * 18 + 35);
       drawTexturedModalRect(k,l + inventoryRows * 18 + 35, 0, 107, xSize, 130);
    }

    public static void drawTexturedRect(ResourceLocation texture, double x, double y, int u, int v, int width, int height, int imageWidth, int imageHeight, double scale) {
        Minecraft.getMinecraft().renderEngine.bindTexture(texture);
        double minU = (double)u / (double)imageWidth;
        double maxU = (double)(u + width) / (double)imageWidth;
        double minV = (double)v / (double)imageHeight;
        double maxV = (double)(v + height) / (double)imageHeight;
        Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        tessellator.addVertexWithUV(x + scale*(double)width, y + scale*(double)height, 0, maxU, maxV);
        tessellator.addVertexWithUV(x + scale*(double)width, y, 0, maxU, minV);
        tessellator.addVertexWithUV(x, y, 0, minU, minV);
        tessellator.addVertexWithUV(x, y + scale*(double)height, 0, minU, maxV);
        tessellator.draw();
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int par1, int par2)
    {
        fontRendererObj.drawString(I18n.format(te.getInventoryName()), (xSize / 2) - (fontRendererObj.getStringWidth(I18n.format(te.getInventoryName())) / 2) - 35, +6, 4210752, false);
    }
}
