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
public class ModelSmallStraightTCTrack extends ModelBase {
	
	private IModelCustom modelSmallStraight;
	private IModelCustom modelRoadCrossing;
	private IModelCustom modelConcreteSmallStraight;
	private IModelCustom modelSuperLong;

	public ModelSmallStraightTCTrack() {
		modelSmallStraight = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_normal.obj"));
		modelRoadCrossing = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_roadcrossing.obj"));
		modelConcreteSmallStraight = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "concrete_track.obj"));
		modelSuperLong = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_super_long.obj"));
	}

	public void render(String type) {
		if (type.equals("straight")) {
			modelSmallStraight.renderAll();
		}
		if (type.equals("crossing")) {
			modelRoadCrossing.renderAll();
		}
		if (type.equals("crossing1")) {
			modelRoadCrossing.renderAll();
		}
		if (type.equals("crossing2")) {
			modelRoadCrossing.renderAll();
		}
		if (type.equals("concrete_small_straight")) {
			modelConcreteSmallStraight.renderAll();
		}
		if (type.equals("super_long")) {
			modelSuperLong.renderAll();
		}
	}
	
	public void render(String type, TileTCRail tcRail, double x, double y, double z) {
		int facing = tcRail.getWorldObj().getBlockMetadata(tcRail.xCoord, tcRail.yCoord, tcRail.zCoord);
		render( type, facing, x, y, z, 1, 1, 1, 1 );
	}

	public void render( String type, int facing, double x, double y, double z, float r, float g, float b, float a )
	{
		// Push a blank matrix onto the stack
		GL11.glPushMatrix();

		// Move the object into the correct position on the block (because the OBJ's origin is the center of the object)
		GL11.glTranslatef((float) x + 0.5f, (float) y, (float) z + 0.5f);
		GL11.glColor4f(r, g, b, a);

		// Bind the texture, so that OpenGL properly textures our block.
		if (type.equals("straight") || type.equals("super_long")) {
 			FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_normal.png"));
		}
		if (type.equals("crossing")) {
			FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_roadcrossing.png"));
		}		
		if (type.equals("crossing1")) {
			FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_roadcrossing_1.png"));
		}		
		if (type.equals("crossing2")) {
			FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_roadcrossing_2.png"));
		}
		if (type.equals("concrete_small_straight")) {
			FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_normal.png"));
		}


		if (facing == 3) {
			GL11.glRotatef(90, 0, 1, 0);
			if (type.equals("super_long")){
				GL11.glRotatef(180, 0, 1,0);
			}
		}
		if (facing == 1) {
			GL11.glRotatef(90, 0, 1, 0);
		}
		if (facing == 0) {
			if (type.equals("super_long")){
				GL11.glRotatef(180, 0, 1, 0);
			}
		}

		render(type);

		// Pop this matrix from the stack.
		GL11.glPopMatrix();
	}

}
