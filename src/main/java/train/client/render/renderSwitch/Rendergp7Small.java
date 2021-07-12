package train.client.render.renderSwitch;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;
import train.client.render.models.blocks.ModelBridgePillar;
import train.client.render.renderSwitch.models.Modelgp7Small;
import train.common.tile.TileBridgePillar;
import train.common.tile.tileSwitch.Tilegp7Small;

public class Rendergp7Small extends TileEntitySpecialRenderer {
    static final Modelgp7Small modelgp7Small = new Modelgp7Small();

    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick) {
        GL11.glPushMatrix();
        modelgp7Small.render((Tilegp7Small) tileEntity, x, y, z);
        GL11.glPopMatrix();
    }
}
