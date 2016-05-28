package train.client.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import train.common.library.Info;

public class RenderBogie extends Render {

	protected ModelBase model = new ModelBase() {};
	private ModelRenderer box;
	
	public RenderBogie() {
		box = new ModelRenderer(model, 0, 0);
		box.addBox(-4F, -4F, -4F, 8, 8, 8);
		box.rotationPointX = 0;
		box.rotationPointY = 0;
		box.rotationPointZ = 0;
	}

	
	@Override
	public void doRender(Entity entity, double x, double y, double z, float f, float f1) {
		GL11.glPushMatrix();
		GL11.glDisable(2896);
		GL11.glTranslated(x, y, z);

		/*renderManager.renderEngine.bindTexture(TEXTURE);

		float factor = (float) (1.0 / 16.0);
		GL11.glScalef(2, 2, 2);
		box.render(factor);*/
		

		GL11.glEnable(2896);
		GL11.glPopMatrix();
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return TEXTURE;
	}
	public static final ResourceLocation TEXTURE = new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "robot.png");
	

}
