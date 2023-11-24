package ebf.tim.render;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;

public class BlockTESR extends TileEntitySpecialRenderer {

    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick) {
        GL11.glPushMatrix();
        if(tileEntity.getWorldObj()!=null) {
            GL11.glTranslated(x, y, z);
        }
        tileEntity.func_145828_a(null);
        GL11.glPopMatrix();
    }
} 