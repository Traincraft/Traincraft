package train.render;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import train.render.models.blocks.ModelWindMill;
import train.render.models.blocks.ModelWindMillWheel;

public class RenderWindMill extends TileEntitySpecialRenderer {
	private static final ModelWindMill modelWindMill = new ModelWindMill();
	private static final ModelWindMillWheel modelWindMillWheel = new ModelWindMillWheel();

	@Override
	public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick) {
		if(tileEntity !=null) {
			modelWindMill.render(tileEntity, x, y, z);
			modelWindMillWheel.render(tileEntity, x, y, z);
		}
	}
}
