package train.client.render.models.blocks;

import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import train.client.render.CustomModelRenderer;

public class ModelBlockSignal extends ModelBase {
	public CustomModelRenderer box;
	public CustomModelRenderer box0;
	public CustomModelRenderer box1;

	public ModelBlockSignal(float scale) {
		box = new CustomModelRenderer(this, 77, 17, 128, 64);
		box.addBox(0F, 0F, 0F, 4, 41, 2, scale);
		box.setPosition(-2F, 0F, -1F);

		box0 = new CustomModelRenderer(this, 39, 44, 128, 64);
		box0.addBox(0F, 0F, 0F, 12, 12, 2, scale);
		box0.setPosition(-6F, 12F, -3F);

		box1 = new CustomModelRenderer(this, 43, 20, 128, 64);
		box1.addBox(0F, 0F, 0F, 6, 17, 2, scale);
		box1.setPosition(-3F, 25F, -3F);

	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		box.render(f5);
		box0.render(f5);
		box1.render(f5);
	}

	public void render(float f5, int meta) {
		if (meta != -1) {
			switch (meta) {
			case 0:
				GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
			case 1:
				GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
			case 2:
				GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
			case 3:
				GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
			}
		}
		box.render(f5);
		box0.render(f5);
		box1.render(f5);
	}

	public void render2(float f1) {
		box.render(f1);
		box0.render(f1);
		box1.render(f1);
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {}
}
