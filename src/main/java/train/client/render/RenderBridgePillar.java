package train.client.render;

import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.Tessellator;
import train.client.render.models.blocks.ModelBridgePillar;
import train.common.library.Info;

public class RenderBridgePillar extends TileEntitySpecialRenderer {
	static final ModelBridgePillar modelBridgePillar = new ModelBridgePillar();
	static final ResourceLocation texture = new ResourceLocation(Info.modID,Info.modelTexPrefix + "bridgePillar.png");
	static Integer GLID = null;

	@Override
	public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick) {
		GL11.glPushMatrix();
		GL11.glTranslated(x+0.5,y+1,z+0.5);
		GL11.glRotatef(180f,0f,1f,0f);
		Tessellator.bindTexture(texture);
		/*
		if(GLID==null || !GL11.glIsList(GLID)) {
			GLID = GLAllocation.generateDisplayLists(1);
			GL11.glNewList(GLID, GL11.GL_COMPILE);
			modelBridgePillar.render();
			GL11.glEndList();
		} else {
			GL11.glCallList(GLID);
		}

		 */

		modelBridgePillar.render();
		GL11.glPopMatrix();
	}
}
