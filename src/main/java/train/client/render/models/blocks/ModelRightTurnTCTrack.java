package train.client.render.models.blocks;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import train.common.library.Info;
import train.common.tile.TileTCRail;

@SideOnly(Side.CLIENT)
public class ModelRightTurnTCTrack extends ModelBase {
	private static IModelCustom modelMediumRightTurn = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_curve_medium.obj"));
	private static IModelCustom modelLargeRightTurn = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_curve_big.obj"));
	private static IModelCustom modelVeryLargeRightTurn = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_curve_very_big.obj"));;

	public ModelRightTurnTCTrack() {
	}

	public void renderMedium() {
		modelMediumRightTurn.renderAll();
	}

	public void renderLarge() {
		modelLargeRightTurn.renderAll();
	}
	public void renderVeryLarge() {
		modelVeryLargeRightTurn.renderAll();
	}

	public void render(String type, TileTCRail tcRail, double x, double y, double z) {

		// Bind the texture, so that OpenGL properly textures our block.
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_normal.png"));
		GL11.glColor4f(1, 1, 1, 1);
		//GL11.glScalef(0.5f, 0.5f, 0.5f);
		int facing = tcRail.getWorldObj().getBlockMetadata(tcRail.xCoord, tcRail.yCoord, tcRail.zCoord);

		if (facing == 3) {
			if (type.equals("very_large"))
				GL11.glTranslatef(8.5f, 0.0f, 9.54f);
			else if (type.equals("large"))
				GL11.glTranslatef(-1.0f, 0.0f, 5.0f);
			else if (type.equals("medium"))
				GL11.glTranslatef(-1.0f, 0.0f, 3.0f);
		} else if (facing == 1) {
			GL11.glRotatef(180, 0, 1, 0);
			if (type.equals("very_large"))
				GL11.glTranslatef(8.5f, 0.0f, 9.54f);
			else if (type.equals("large"))
				GL11.glTranslatef(-1.0f, 0.0f, 5.0f);
			else if (type.equals("medium"))
				GL11.glTranslatef(-1.0f, 0.0f, 3.0f);
		} else if (facing == 2) {
			GL11.glRotatef(90, 0, 1, 0);
			if (type.equals("very_large"))
				GL11.glTranslatef(8.5f, 0.0f, 9.54f);
			else if (type.equals("large"))
				GL11.glTranslatef(-1.0f, 0.0f, 5.0f);
			else if (type.equals("medium"))
				GL11.glTranslatef(-1.0f, 0.0f, 3.0f);
		} else if (facing == 0) {
			GL11.glRotatef(-90, 0, 1, 0);
			if (type.equals("very_large"))
				GL11.glTranslatef(8.5f, 0.0f, 9.54f);
			else if (type.equals("large"))
				GL11.glTranslatef(-1.0f, 0.0f, 5.0f);
			else if (type.equals("medium"))
				GL11.glTranslatef(-1.0f, 0.0f, 3.0f);
		}
		if (type.equals("medium")) {
			this.renderMedium();
		} else if (type.equals("large")) {
			this.renderLarge();
		} else if (type.equals("very_large")){
			this.renderVeryLarge();
		}
	}
}