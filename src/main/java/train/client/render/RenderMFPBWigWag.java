package train.client.render;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.Tessellator;
import train.client.render.models.blocks.ModelMFPBWigWag;
import train.common.library.Info;
import train.common.tile.TileMFPBWigWag;

public class RenderMFPBWigWag extends TileEntitySpecialRenderer {
	private static final ModelMFPBWigWag modelSwitch = new ModelMFPBWigWag();
	private static final ResourceLocation texture = new ResourceLocation(Info.resourceLocation,Info.modelTexPrefix + "MFPBWigWag.png");

	@Override
	public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick) {
		GL11.glPushMatrix();
		GL11.glTranslated(x+0.4,y,z+0.5);
		GL11.glRotated(180,0,1,0);
		boolean skipRender = false;

		switch (((TileMFPBWigWag)tileEntity).getFacing()){
			case NORTH:{
				GL11.glRotated(180,0,0,1);
				GL11.glRotated(90,0,1,0);
				GL11.glTranslated(0,0,0.125);
				break;
			}
			case SOUTH:{
				GL11.glRotated(180,0,0,1);
				GL11.glRotated(270,0,1,0);
				GL11.glTranslated(0,0,-0.125);
				break;
			}
			case EAST:{
				GL11.glRotated(180,0,0,1);
				GL11.glRotated(180,0,1,0);
				GL11.glTranslated(0.125,0,0);
				break;
			}
			case WEST:{
				GL11.glRotated(180,0,0,1);
				GL11.glTranslated(-0.125,0,0);
				break;
			}
			default:{
				skipRender = true;
			}
		}

		if (!skipRender) {
			Tessellator.bindTexture(texture);
			modelSwitch.render(null, ((TileMFPBWigWag)tileEntity).rotation, 0, 0, 0, 0, 0.0625f);
		}
		GL11.glPopMatrix();
	}
}
