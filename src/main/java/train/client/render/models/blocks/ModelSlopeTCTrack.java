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
public class ModelSlopeTCTrack extends ModelBase {
	
	private IModelCustom	modeltrack;
	private IModelCustom	modelSlopeWood;
	private IModelCustom	modelSlopeBallast;
	
	public ModelSlopeTCTrack() {
		modeltrack = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_slope.obj"));
		modelSlopeWood = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "supports_wood.obj"));
		modelSlopeBallast = AdvancedModelLoader
				.loadModel(new ResourceLocation(Info.modelPrefix + "supports_ballast.obj"));
	}
	
	public void render(String type) {
		if (type.equals("wood")) {
			FMLClientHandler.instance().getClient().renderEngine
					.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_slope.png"));
			modelSlopeWood.renderAll();
			FMLClientHandler.instance().getClient().renderEngine
					.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_normal.png"));
			modeltrack.renderAll();
		}
		if (type.equals("gravel")) {
			FMLClientHandler.instance().getClient().renderEngine
					.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/blocks/gravel.png"));
			modelSlopeBallast.renderAll();
			FMLClientHandler.instance().getClient().renderEngine
					.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_normal.png"));
			modeltrack.renderAll();
		}
		if (type.equals("ballast")) {
			FMLClientHandler.instance().getClient().renderEngine
					.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/blocks/ballast_test.png"));
			modelSlopeBallast.renderAll();
			FMLClientHandler.instance().getClient().renderEngine
					.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_normal.png"));
			modeltrack.renderAll();
		}
		if (type.equals("snow")) {
			FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/blocks/snowgravel.png"));
			modelSlopeBallast.renderAll();
			FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_normal.png"));
			modeltrack.renderAll();
	}

}
	
	public void render(String type, TileTCRail tcRail, double x, double y, double z) {
		int facing = tcRail.getWorldObj().getBlockMetadata(tcRail.xCoord, tcRail.yCoord, tcRail.zCoord);
		render( type, facing, x, y, z, 1, 1, 1, 1);
	}

	public void render(String type, int facing, double x, double y, double z, float r, float g, float b, float a)
	{
			// Push a blank matrix onto the stack
		GL11.glPushMatrix();
		
		// Move the object into the correct position on the block (because the OBJ's origin is the
		// center of the object)
		GL11.glTranslatef((float) x + 0.5f, (float) y, (float) z + 0.5f);

		GL11.glColor4f(r, g, b, a);
		// GL11.glScalef(0.5f, 0.5f, 0.5f);

		if (facing == 3) {
			GL11.glRotatef(-90, 0, 1, 0);
		}
		if (facing == 1) {
			GL11.glRotatef(90, 0, 1, 0);
		}
		if (facing == 0) {
			GL11.glRotatef(180, 0, 1, 0);
		}
		// GL11.glTranslatef(0.0f, 0.0f, -1.0f);
		render(type);
		
		// Pop this matrix from the stack.
		GL11.glPopMatrix();
	}
}