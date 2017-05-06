package train.client.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import train.client.render.models.ModelZeppelinOneBalloon;
import train.client.render.models.ModelZeppelinTwoBalloons;
import train.common.entity.zeppelin.AbstractZeppelin;
import train.common.entity.zeppelin.EntityZeppelinOneBalloon;
import train.common.library.Info;

public class RenderZeppelins extends Render {

	private static final ModelBase modelZeppelinTwoBalloons = new ModelZeppelinTwoBalloons();
	private static final ModelBase modelZeppelinOneBalloon = new ModelZeppelinOneBalloon();

	private static final ResourceLocation oneBalloon = new ResourceLocation(Info.resourceLocation, Info.zeppelinTexturePrefix + "zeppelin_one_balloon.png");
	private static final ResourceLocation twoBalloon = new ResourceLocation(Info.resourceLocation, Info.zeppelinTexturePrefix + "zeppelin_two_balloons.png");

	public RenderZeppelins() {
		shadowSize = 0.5F;
	}

	private void func_157_a(AbstractZeppelin entityzepplin, double d, double d1, double d2, float f, float f1) {
		GL11.glPushMatrix();
		GL11.glTranslatef((float) d, (float) d1, (float) d2);
		GL11.glRotatef(90F - f, 0.0F, 1.0F, 0.0F);
		/**
		 * Damage mouvements
		 */
		float f2 = (float) entityzepplin.boatTimeSinceHit - f1;
		float f3 = (float) entityzepplin.boatCurrentDamage - f1;
		if (f3 < 0.0F) {
			f3 = 0.0F;
		}
		if (f2 > 0.0F) {
			GL11.glRotatef(((MathHelper.sin(f2) * f2 * f3) / 10F) * (float) entityzepplin.boatRockDirection, 1.0F, 0.0F, 0.0F);
		}

		/**
		 * Pitch
		 */
		float pitch = entityzepplin.pitch / 1.5F;

		if (pitch > 30) {
			pitch = 30;
		}
		if (pitch < -30) {
			pitch = -30;
		}
		GL11.glRotatef(pitch, 1.0F, 0.0F, 0.0F);

		/**
		 * Roll
		 */
		float roll = entityzepplin.roll * 20F;
		if (roll > 15) {
			roll = 15;
		}
		if (roll < -15) {
			roll = -15;
		}

		GL11.glRotatef(roll, 0.0F, 0.0F, 1.0F);

		
		bindEntityTexture(entityzepplin);
		if(entityzepplin instanceof EntityZeppelinOneBalloon){
			GL11.glTranslatef(0.0F, -0.45F, 0.55F);
			GL11.glRotatef(90, 0.0F, 1.0F, 0.0F);
			modelZeppelinOneBalloon.render(entityzepplin, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
		}else{
			GL11.glTranslatef(0.0F, -0.25F, 0.9F);
			modelZeppelinTwoBalloons.render(entityzepplin, 0.0F, +0.2F, -0.1F, 0.0F, 0.0F, 0.0625F);
		}
		GL11.glPopMatrix();
	}

	@Override
	public void doRender(Entity entity, double d, double d1, double d2, float f, float f1) {
		func_157_a((AbstractZeppelin) entity, d, d1, d2, f, f1);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		if(entity instanceof EntityZeppelinOneBalloon){
			return oneBalloon;
		} else {
			return twoBalloon;
		}
	}
}
