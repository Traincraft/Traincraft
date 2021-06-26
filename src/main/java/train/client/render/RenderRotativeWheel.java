package train.client.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import train.client.render.models.ModelRotaryExcavator_Wheel;
import train.common.entity.digger.EntityRotativeDigger;
import train.common.entity.digger.EntityRotativeWheel;

public class RenderRotativeWheel extends Render {

	private long lastframe;
	private float mvt = 0.0F;
	private EntityRotativeDigger entity;

	private static final ModelBase modelRotaryExcavator_Wheel = new ModelRotaryExcavator_Wheel();

	public RenderRotativeWheel() {
		//shadowSize = 0.5F;
		lastframe = System.nanoTime();

	}

	private void func_157_a(EntityRotativeWheel wheel, double d, double d1, double d2, float f) {
		GL11.glPushMatrix();
		GL11.glTranslatef((float) d, (float) d1, (float) d2);
		GL11.glRotatef(90F - f, 0.0F, 1.0F, 0.0F);

		GL11.glTranslatef(0.0F, 0.5F, 0.0F);
		GL11.glScalef(0.4F, 0.6F, 0.6F);

		entity = (EntityRotativeDigger) wheel.entity;
		if (entity != null && entity.getFuel() > 0) {
			long now = System.nanoTime();
			int elapsed = (int) ((now - lastframe) / (1000 * 1000));
			mvt -= (float) elapsed / 300.0f;
			lastframe = now;

			GL11.glRotatef((mvt + 0.4188790204786391F) * 100, 1F, 0F, 0F);
		}
		//loadTexture(Info.trainsPrefix + "rotativeExcavatorWheel.png");
		modelRotaryExcavator_Wheel.render(wheel, 0.0F, +0.2F, -0.1F, 0.0F, 0.0F, 0.0625F);
		GL11.glPopMatrix();
	}
	@Override
	public void doRender(Entity entity, double d, double d1, double d2, float f, float f1) {
		func_157_a((EntityRotativeWheel) entity, d, d1, d2, f);
	}


	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return null;
	}
}
