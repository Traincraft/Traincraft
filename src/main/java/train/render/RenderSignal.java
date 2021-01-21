package train.render;

import ebf.tim.blocks.TileRenderFacing;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;
import train.blocks.signal.TileSignal;
import train.render.models.blocks.ModelBlockSignal;

public class RenderSignal extends TileEntitySpecialRenderer {

	private static final ModelBlockSignal modelSignal = new ModelBlockSignal(1.0F / 16.0F);

	public RenderSignal() {
	}

	public void renderAModelAt(TileEntity var1, double d, double d1, double d2, float f) {
		GL11.glPushMatrix();
		GL11.glTranslatef((float) d + 0.46F, (float) d1 + 0.0F, (float) d2 + 0.46F);
		/*if (var1.state == 1) {
			bindTextureByName(Info.trainsPrefix + "signal_suisse_green.png");
		}
		else {
			bindTextureByName(Info.trainsPrefix + "signal_suisse_red.png");
		}*/
		modelSignal.render(0.0625F, var1 instanceof TileRenderFacing?((TileRenderFacing)var1).facing:0);
		GL11.glPopMatrix();
	}
	
	@Override
	public void renderTileEntityAt(TileEntity tileentity, double d, double d1, double d2, float f) {
		renderAModelAt((TileSignal) tileentity, d, d1, d2, f);
	}
}