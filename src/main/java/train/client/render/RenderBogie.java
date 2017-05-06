package train.client.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import train.common.library.Info;

public class RenderBogie extends Render {

	protected ModelBase model = new ModelBase() {};
	private static final ResourceLocation TEXTURE = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "robot.png");
	
	public RenderBogie() {
	}

	
	@Override
	public void doRender(Entity entity, double x, double y, double z, float f, float f1) {
		GL11.glPushMatrix();
		GL11.glTranslated(x, y, z);

		/*renderManager.renderEngine.bindTexture(TEXTURE);

		float factor = (float) (1.0 / 16.0);
		GL11.glScalef(2, 2, 2);
		box.render(factor);*/
		

		GL11.glPopMatrix();
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return TEXTURE;
	}
	

}
