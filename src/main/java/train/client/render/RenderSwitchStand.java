package train.client.render;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;
import train.client.render.models.ModelSwitchStandOff;
import train.client.render.models.ModelSwitchStandOn;
import train.common.tile.TileSwitchStand;

public class RenderSwitchStand extends TileEntitySpecialRenderer {
	private static final ModelSwitchStandOn modelSwitch = new ModelSwitchStandOn();
	private static final ModelSwitchStandOff modelSwitch2 = new ModelSwitchStandOff();

	@Override
	public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick) {
		GL11.glPushMatrix();
		GL11.glTranslated(x,y+1,z);
		GL11.glRotated(180,0,0,1);
		GL11.glRotated(180,0,1,0);

		GL11.glPushMatrix();
		switch (((TileSwitchStand)tileEntity).getFacing()){
			case NORTH:{
				GL11.glRotated(90,1,0,0);
			}
			case SOUTH:{
				GL11.glRotated(270,1,0,0);
			}
			case EAST:{
				GL11.glRotated(180,1,0,0);
			}
			case WEST:{

			}
		}
		if (tileEntity.getWorldObj().getBlock(tileEntity.xCoord, tileEntity.yCoord, tileEntity.zCoord).isProvidingWeakPower(tileEntity.getWorldObj(), tileEntity.xCoord, tileEntity.yCoord, tileEntity.zCoord,0) >0){
			modelSwitch.render(null,0,0,0,0,0,0.0625f);
		} else {
			modelSwitch2.render(null,0,0,0,0,0,0.0625f);
		}
		GL11.glPopMatrix();
		GL11.glPopMatrix();
	}
}
