package train.client.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import train.common.entity.EntityLasersLines;

public class RenderLasersLines extends Render {
	/** instance of ModelBoat for rendering */
	private static final ModelBase model = new ModelBase() {};
	private ModelRenderer box;

	public RenderLasersLines() {
		this.shadowSize = 0.5F;
		box = new ModelRenderer(model, 0, 0);
		box.addBox(0, -0.5F, -0.5F, 16, 1, 1);
		box.rotationPointX = 0;
		box.rotationPointY = 0;
		box.rotationPointZ = 0;
	}

	/**
	 * The render method used in RenderBoat that renders the boat model.
	 */
	public void renderLasersLines(EntityLasersLines en, double x, double y, double z, float f, float f1) {
		if (en.hidden ^ en.isDead) {
			return;
		}

		GL11.glPushMatrix();
		GL11.glTranslated(x, y, z);
		GL11.glRotatef((float) en.angleZ, 0, 1, 0);
		GL11.glRotatef((float) en.angleY, 0, 0, 1);

		//en.getTexture();
		//loadTexture(en.getTexture());
		float lasti = 0;

		for (float i = 0; i <= en.renderSize - 1; ++i) {
			getBox(en).render(1.0F / 16.0F);
			GL11.glTranslated(1, 0, 0);
			lasti = i;
		}

		lasti++;

		GL11.glScalef(((float) en.renderSize - lasti), 1, 1);
		getBox(en).render(1);
		GL11.glPopMatrix();
	}

	protected ModelRenderer getBox(EntityLasersLines laser) {
		return box;
	}

	/**
	 * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1, double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
	 */
	@Override
	public void doRender(Entity entity, double par2, double par4, double par6, float par8, float par9) {

		this.renderLasersLines((EntityLasersLines) entity, par2, par4, par6, par8, par9);
		entity.setAngles(45, 180);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return null;
	}
}
