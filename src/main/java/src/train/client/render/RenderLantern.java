package src.train.client.render;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import src.train.client.render.models.blocks.ModelLantern;
import src.train.common.tile.TileLantern;

public class RenderLantern extends TileEntitySpecialRenderer {
	private ModelLantern modelLantern = new ModelLantern();

	@Override
	public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick) {
		modelLantern.render((TileLantern) tileEntity, x, y, z);
	}
}
