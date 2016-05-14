/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name TrainCraft
 * @author Mrbrutal
 ******************************************************************************/

package src.train.client.render;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import src.train.client.render.models.blocks.ModelStopper;
import src.train.common.library.Info;
import src.train.common.tile.TileStopper;

public class RenderStopper extends TileEntitySpecialRenderer {

	public ModelStopper modelStopper;
	private static float scale = (float) (1.0 / 16.0);

	public RenderStopper() {
		modelStopper = new ModelStopper(scale);
	}

	public void render(TileEntity var1, double x, double y, double z) {
		GL11.glPushMatrix();
		GL11.glDisable(GL11.GL_LIGHTING);

		GL11.glTranslated(x, y, z);
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.modelTexPrefix + "buffer.png"));

		GL11.glTranslatef(0.5F, 0.0F, 0.5F);
		modelStopper.render(0.0625F, ((TileStopper) var1).getFacing());

		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glPopMatrix();
	}

	@Override
	public void renderTileEntityAt(TileEntity var1, double var2, double var4, double var6, float var8) {
		render(var1, var2, var4, var6);
	}
}
