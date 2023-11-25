package train.client.render.models.blocks;

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
	private IModelCustom modelMediumRightTurn;
	private IModelCustom modelLargeRightTurn;
	private IModelCustom modelVeryLargeRightTurn;
	private IModelCustom modelSuperLargeRightTurn;

	public ModelRightTurnTCTrack() {
		modelMediumRightTurn = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_curve_medium.obj"));
		modelLargeRightTurn = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_curve_big.obj"));
		modelVeryLargeRightTurn = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_curve_very_big.obj"));
		modelSuperLargeRightTurn = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_curve_super_big.obj"));

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
	public void renderSuperLarge() {
		modelSuperLargeRightTurn.renderAll();
	}

	public void render(String type, TileTCRail tcRail, double x, double y, double z) {
		int facing = tcRail.getWorldObj().getBlockMetadata(tcRail.xCoord, tcRail.yCoord, tcRail.zCoord);
		render( type, facing, x, y, z, 1, 1, 1, 1);
	}

	public void render(String type, int facing, double x, double y, double z, float r, float g, float b, float a) {
		// Push a blank matrix onto the stack
		GL11.glPushMatrix();

		// Move the object into the correct position on the block (because the OBJ's origin is the center of the object)
		GL11.glTranslatef((float) x + 0.5f, (float) y, (float) z + 0.5f);

		// Bind the texture, so that OpenGL properly textures our block.

		if (type.contains("embedded"))

		fexcraft.tmt.slim.Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_embedded.png"));
		else fexcraft.tmt.slim.Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_normal.png"));
		GL11.glColor4f(r, g, b, a);
		//GL11.glScalef(0.5f, 0.5f, 0.5f);

		if (facing == 3) {
			if(type.equals("super_large") || type.equals("embedded_super_large"))
				GL11.glTranslatef(14.5f, 0.0f, 15.5f);
			if(type.equals("very_large") || type.equals("embedded_very_large"))
				GL11.glTranslatef(8.5f, 0.0f, 9.5f);
			if(type.equals("large") || type.equals("embedded_large"))
				GL11.glTranslatef(-1.0f, 0.0f, 5.0f);
			if(type.equals("medium") || type.equals("embedded_medium"))
				GL11.glTranslatef(1.5f, 0.0f, 2.5f);
		}
		if (facing == 1) {
			GL11.glRotatef(180, 0, 1, 0);
			if(type.equals("super_large") || type.equals("embedded_super_large"))
				GL11.glTranslatef(14.5f, 0.0f, 15.5f);
			if(type.equals("very_large") || type.equals("embedded_very_large"))
				GL11.glTranslatef(8.5f, 0.0f, 9.50f);
			if(type.equals("large") || type.equals("embedded_large"))
				GL11.glTranslatef(-1.0f, 0.0f, 5.0f);
			if(type.equals("medium") || type.equals("embedded_medium"))
				GL11.glTranslatef(1.5f, 0.0f, 2.5f);
		}
		if (facing == 2) {
			GL11.glRotatef(90, 0, 1, 0);
			if(type.equals("super_large") || type.equals("embedded_super_large"))
				GL11.glTranslatef(14.5f, 0.0f, 15.5f);
			if(type.equals("very_large") || type.equals("embedded_very_large"))
				GL11.glTranslatef(8.5f, 0.0f, 9.50f);
			if(type.equals("large") || type.equals("embedded_large"))
				GL11.glTranslatef(-1.0f, 0.0f, 5.0f);
			if(type.equals("medium") || type.equals("embedded_medium"))
				GL11.glTranslatef(1.5f, 0.0f, 2.5f);
		}
		if (facing == 0) {
			GL11.glRotatef(-90, 0, 1, 0);
			if(type.equals("super_large") || type.equals("embedded_super_large"))
				GL11.glTranslatef(14.5f, 0.0f, 15.5f);
			if(type.equals("very_large") || type.equals("embedded_very_large"))
				GL11.glTranslatef(8.5f, 0.0f, 9.50f);
			if(type.equals("large") || type.equals("embedded_large"))
				GL11.glTranslatef(-1.0f, 0.0f, 5.0f);
			if(type.equals("medium") || type.equals("embedded_medium"))
				GL11.glTranslatef(1.5f, 0.0f, 2.5f);
		}
		if (type.equals("medium") || type.equals("embedded_medium"))
			this.renderMedium();
		if (type.equals("large") || type.equals("embedded_large"))
			this.renderLarge();
		if (type.equals("very_large") || type.equals("embedded_very_large"))
			this.renderVeryLarge();
		if (type.equals("super_large") || type.equals("embedded_super_large"))
			this.renderSuperLarge();

		// Pop this matrix from the stack.
		GL11.glPopMatrix();
	}
}