package train.client.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import train.client.render.models.ModelRotaryExcavator;
import train.common.entity.digger.EntityRotativeDigger;

public class RenderRotativeDigger extends Render {

	private static final ModelBase modelRotaryExcavator = new ModelRotaryExcavator();

	public RenderRotativeDigger() {
		shadowSize = 0.5F;
	}

	private void func_157_a(EntityRotativeDigger digger, double d, double d1, double d2, float f, float f1) {
		GL11.glPushMatrix();
		GL11.glTranslatef((float) d, (float) d1, (float) d2);
		GL11.glRotatef(90F - f, 0.0F, 1.0F, 0.0F);
		/**
		 * Damage mouvements
		 */
		float f2 = (float) digger.boatTimeSinceHit - f1;
		float f3 = (float) digger.boatCurrentDamage - f1;
		if (f3 < 0.0F) {
			f3 = 0.0F;
		}
		if (f2 > 0.0F) {
			GL11.glRotatef(((MathHelper.sin(f2) * f2 * f3) / 10F) * (float) digger.boatRockDirection, 1.0F, 0.0F, 0.0F);
		}

		/**
		 * Pitch
		 */
		/* float pitch = digger.pitch/1.5F;
		 * 
		 * if(pitch>30){ pitch=30; } if(pitch<-30){ pitch=-30; } GL11.glRotatef(pitch, 1.0F, 0.0F, 0.0F); */

		GL11.glTranslatef(0.0F, 0.5F, 0.0F);
		//loadTexture(Info.trainsPrefix + "rotaryExcavator.png");
		modelRotaryExcavator.render(digger, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
		GL11.glPopMatrix();
	}
	@Override
	public void doRender(Entity entity, double d, double d1, double d2, float f, float f1) {
		func_157_a((EntityRotativeDigger) entity, d, d1, d2, f, f1);
	}


	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return null;
	}
}
