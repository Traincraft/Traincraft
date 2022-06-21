package train.client.render.renderSwitch;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.Tessellator;
import train.client.render.renderSwitch.models.ModelspeedSign;
import train.common.library.Info;
import train.common.tile.tileSwitch.TileSpeedSign;

public class RenderSpeedSign extends TileEntitySpecialRenderer {
	static final ModelspeedSign modelspeedSign = new ModelspeedSign();
	/*
	private static final ResourceLocation texture = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "speedSign.png");
	private static final ResourceLocation texture2 = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "speedSign2.png");
	private static final ResourceLocation texture3 = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "speedSign3.png");
	private static final ResourceLocation texture4 = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "speedSign4.png");

	 */

	private ResourceLocation[] textures = {new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "SpeedSign10.png"), new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "SpeedSign50.png"), new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "SpeedSign90.png"), new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "SpeedSign125.png"), new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "SpeedSign160.png")};

	@Override
	public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick) {
		GL11.glPushMatrix();
		GL11.glTranslated(x +0.5 , y+0.625, z +0.125);
		GL11.glRotated(180, 0, 1, 0);
		boolean skipRender = false;

		switch (((TileSpeedSign) tileEntity).getFacing()) {
			case NORTH: {
				GL11.glRotated(180, 0, 0, 1);
				GL11.glRotated(90, 0, 1, 0);
				//GL11.glTranslated(0.5, 0f, 0.5);
				//System.out.println("N");

				break;
			}
			case SOUTH: {
				GL11.glRotated(180, 0, 0, 1);
				GL11.glRotated(270, 0, 1, 0);
				GL11.glTranslated(-0.75, 0f, 0);
				//GL11.glTranslated(0.5, 0f, 0.5);
				//System.out.println("S");

				//GL11.glTranslated(0.1875, -1, 0.125);
				break;
			}
			case EAST: {
				GL11.glRotated(180, 0, 0, 1);
				GL11.glRotated(180, 0, 1, 0);
				GL11.glTranslated(-0.5, 0f, 0.25);
				//System.out.println("E");

				//GL11.glTranslated(0.1875, -1, 0.125);
				break;
			}
			case WEST: {
				GL11.glRotated(180, 0, 0, 1);
				GL11.glRotated(0, 0, 1, 0);
				GL11.glTranslatef(-0.375f,0f, -0.5f);
				//System.out.println("W");
				//GL11.glTranslated(0.1875, -1, 0.125);
				break;
			}
			default: {
				skipRender = true;
			}
		}


		if (!skipRender) {

			// tileEntity.getWorldObj().getBlock(tileEntity.xCoord, tileEntity.yCoord, tileEntity.zCoord).isProvidingWeakPower(tileEntity.getWorldObj(), tileEntity.xCoord, tileEntity.yCoord, tileEntity.zCoord, 0) > 0

			/*
			if (((TileSpeedSign) tileEntity).getSkinstate() == 0) {
				Tessellator.bindTexture(texture);
			} else if (((TileSpeedSign) tileEntity).getSkinstate() == 1){
				Tessellator.bindTexture(texture2);
			} else if (((TileSpeedSign) tileEntity).getSkinstate() == 2){
				Tessellator.bindTexture(texture3);
			} else if (((TileSpeedSign) tileEntity).getSkinstate() == 3) {
				Tessellator.bindTexture(texture4);
			}

			 */
			Tessellator.bindTexture(textures[(((TileSpeedSign) tileEntity).getSkinstate())]);

			modelspeedSign.render(null, 0, 0, 0, 0, 0, 0.0625f);



		}
		GL11.glPopMatrix();
	}
}

