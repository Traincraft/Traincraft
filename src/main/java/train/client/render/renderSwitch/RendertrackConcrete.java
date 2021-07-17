package train.client.render.renderSwitch;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;
import train.client.render.renderSwitch.models.ModeltrackConcrete;
import train.common.tile.tileSwitch.TiletrackConcrete;

public class RendertrackConcrete extends TileEntitySpecialRenderer {
    static final ModeltrackConcrete modeltrackConcrete = new ModeltrackConcrete();

    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick) {
        GL11.glPushMatrix();
        modeltrackConcrete.render((TiletrackConcrete) tileEntity, x, y, z);
        GL11.glPopMatrix();
    }
}
