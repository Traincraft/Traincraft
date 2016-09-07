package train.client.render;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;
import train.common.tile.TileSignal;
import train.client.render.models.blocks.ModelBlockSignal;

public class RenderSignal extends TileEntitySpecialRenderer {

	public ModelBlockSignal modelSignal;
	private static float scale = (float) (1.0 / 16.0);

	public RenderSignal() {
		modelSignal = new ModelBlockSignal(scale);
	}

	public void renderAModelAt(TileSignal var1, double d, double d1, double d2, float f) {
		GL11.glPushMatrix();
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glTranslatef((float) d + 0.46F, (float) d1 + 0.0F, (float) d2 + 0.46F);
		/*if (var1.state == 1) {
			bindTextureByName(Info.trainsPrefix + "signal_suisse_green.png");
		}
		else {
			bindTextureByName(Info.trainsPrefix + "signal_suisse_red.png");
		}*/
		modelSignal.render(0.0625F, var1.getFacing());
		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glPopMatrix();
	}
	
	@Override
	public void renderTileEntityAt(TileEntity tileentity, double d, double d1, double d2, float f) {
		renderAModelAt((TileSignal) tileentity, d, d1, d2, f);
	}
}