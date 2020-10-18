package train.render;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import train.render.models.blocks.ModelWindMill;
import train.render.models.blocks.ModelWindMillWheel;
import train.blocks.windmill.TileWindMill;

public class RenderWindMill extends TileEntitySpecialRenderer {
	private static final ModelWindMill modelWindMill = new ModelWindMill();
	private static final ModelWindMillWheel modelWindMillWheel = new ModelWindMillWheel();

	@Override
	public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick) {
		modelWindMill.render((TileWindMill) tileEntity, x, y, z);
		modelWindMillWheel.render((TileWindMill) tileEntity, x, y, z);
	}
}
