package traincraft.blocks.distillery;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.FluidTank;
import net.minecraftforge.fluids.capability.IFluidHandler;
import traincraft.Traincraft;

public class GuiDistillery extends GuiContainer {
    
    private static final ResourceLocation GUI_LOC = new ResourceLocation(Traincraft.MOD_ID, "textures/gui/gui_distillation_tower2.png");
    
    private TileDistillery tile;
    private EntityPlayer player;
    
    public GuiDistillery(TileDistillery tile, EntityPlayer player) {
        super(new ContainerDistillery(tile, player));
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
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
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
    
    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawDefaultBackground();
        super.drawScreen(mouseX, mouseY, partialTicks);
        this.renderHoveredToolTip(mouseX, mouseY);
    }
    
    private void drawFluid(FluidTank tank, int x, int y, int width, int height) {
        if (tank != null && tank.getFluid() != null) {
            ResourceLocation fluidTexture = tank.getFluid().getFluid().getStill();
            fluidTexture = new ResourceLocation(fluidTexture.getNamespace(), "textures/" + fluidTexture.getPath() + ".png");
            this.mc.renderEngine.bindTexture(fluidTexture);
            int factor = tank.getFluidAmount() * height / tank.getCapacity();
            drawModalRectWithCustomSizedTexture(x, y + height - factor, 0, 0, width, factor, 16, 512);
        }
    }
    
}
