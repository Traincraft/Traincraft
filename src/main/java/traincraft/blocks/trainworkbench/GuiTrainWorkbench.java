package traincraft.blocks.trainworkbench;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.Level;
import traincraft.Traincraft;

public class GuiTrainWorkbench extends GuiContainer {

    private static final ResourceLocation GUI_LOCATION = new ResourceLocation(Traincraft.MOD_ID, "textures/gui/crafting_table.png");

    private TileTrainWorkbench tile;
    private EntityPlayer player;

    public GuiTrainWorkbench(TileTrainWorkbench tile, EntityPlayer player) {
        super(new ContainerTrainWorkbench(player.inventory, tile.getWorld())); // tile.getWorld could be a prob, which world do I need??
        Traincraft.LOGGER.log(Level.INFO,"trainworkbench init gui");
        this.tile = tile;
        this.player = player;
    }

    @Override
    public void initGui() {
        super.initGui();
        this.xSize = 176;
        this.ySize = 166;
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        this.fontRenderer.drawString("Train Workbench", 28, 6, 4210752);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(GUI_LOCATION);
        int i = this.guiLeft;
        int j = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(this.guiLeft, j, 0, 0, this.xSize, this.ySize);
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawDefaultBackground();
        super.drawScreen(mouseX, mouseY, partialTicks);
        this.renderHoveredToolTip(mouseX, mouseY);
    }
}
