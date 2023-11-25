package train.client.render;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;
import train.client.render.models.blocks.ModelBlockSignal;
import train.common.tile.TileSignal;

public class RenderSignal extends TileEntitySpecialRenderer {

    private static final ModelBlockSignal modelSignal = new ModelBlockSignal(1.0F / 16.0F);

    public RenderSignal() {
    }

    public void renderAModelAt(TileSignal tile, double x, double y, double z, float f) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float) x + 0.46F, (float) y + 0.0F, (float) z + 0.46F);
        modelSignal.render(0.0625F, tile.getFacing());
        GL11.glPopMatrix();
    }

    @Override
    public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float f) {
        renderAModelAt((TileSignal) tileentity, x, y, z, f);
    }
}