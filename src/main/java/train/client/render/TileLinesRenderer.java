package train.client.render;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import train.client.render.models.ModelLines;

/**
 * @author Spitfire4466 <trains-and-zeppelin.wikispaces.com>
 */
public class TileLinesRenderer extends TileEntitySpecialRenderer {
	private static final ModelLines model = new ModelLines();

	public TileLinesRenderer() {
	}

	/* public void renderAModelAt(TileEntityElectricConverter tile, double d, double d1, double d2, float f) { int i = 0;
	 * 
	 * if (tile.worldObj != null) { i = tile.getBlockMetadata(); } GL11.glPushMatrix(); bindTextureByName("/train_textures/overheadlines.png"); GL11.glTranslatef((float) d + 0.5F, (float) d1 + 1.5F, (float) d2 + 0.5F); GL11.glScalef(1.0F, -1F, -1F); if(tile.Up == true)model.renderUp(); if(tile.Down == true)model.renderDown(); if(tile.Left == true)model.renderLeft(); if(tile.Right == true)model.renderRight(); if(tile.Back == true)model.renderBack(); if(tile.Front == true)model.renderFront(); model.renderMiddle(); GL11.glPopMatrix();
	 * 
	 * 
	 * 
	 * } */
	@Override
	public void renderTileEntityAt(TileEntity tileentity, double d, double d1, double d2, float f) {
		// renderAModelAt((TileEntityElectricConverter)tileentity, d, d1, d2, f);
	}


}