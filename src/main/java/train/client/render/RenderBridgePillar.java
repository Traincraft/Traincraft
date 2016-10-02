package train.client.render;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import train.client.render.models.blocks.ModelBridgePillar;
import train.common.tile.TileBridgePillar;

public class RenderBridgePillar extends TileEntitySpecialRenderer {
	private static final ModelBridgePillar modelBridgePillar = new ModelBridgePillar();

	@Override
	public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick) {
		modelBridgePillar.render((TileBridgePillar) tileEntity, x, y, z);
	}
}
