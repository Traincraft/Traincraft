package train.client.render.models.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import tmt.Tessellator;
import train.common.library.Info;

@SideOnly(Side.CLIENT)
public class ModelTwoWaysCrossingTCTrack extends ModelBase {
	private static IModelCustom modelTwoWaysCrossing= AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_x.obj"));

	public ModelTwoWaysCrossingTCTrack() {
	}

	public void render() {
		modelTwoWaysCrossing.renderAll();
	}

	public void render(double x, double y, double z) {

		// Bind the texture, so that OpenGL properly textures our block.
		Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_normal.png"));
		GL11.glColor4f(1, 1, 1, 1);
		//GL11.glScalef(0.5f, 0.5f, 0.5f);

		this.render();
	}
}