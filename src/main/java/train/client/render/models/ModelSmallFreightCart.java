package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import train.client.render.CustomModelRenderer;
import train.common.core.handlers.ConfigHandler;

public class ModelSmallFreightCart extends ModelBase {

	public ModelSmallFreightCart() {
		// variables init:

		// constructor:
		attach = new CustomModelRenderer(this, 30, 2, 256, 128);
		attach.addBox(0F, 0F, 0F, 6, 3, 3);
		attach.setPosition(-24F, -1F, -2F);

		bogey = new CustomModelRenderer(this, 0, 0, 256, 128);
		bogey.mirror = true;
		bogey.addBox(0F, 0F, 0F, 1, 4, 12);
		bogey.setPosition(-6F, -4F, -6F);
		bogey.rotateAngleY = -1.5707963267948966F;

		bogeyframe = new CustomModelRenderer(this, 2, 85, 256, 128);
		bogeyframe.mirror = true;
		bogeyframe.addBox(0F, 0F, 0F, 1, 2, 8);
		bogeyframe.setPosition(-8F, -2F, -7F);
		bogeyframe.rotateAngleY = -1.5707963267948966F;

		box = new CustomModelRenderer(this, 0, 0, 256, 128);
		box.addBox(0F, 0F, 0F, 1, 4, 12);
		box.setPosition(20F, -4F, 5F);
		box.rotateAngleY = -1.5707963267948966F;

		box0 = new CustomModelRenderer(this, 0, 0, 256, 128);
		box0.addBox(0F, 0F, 0F, 1, 4, 12);
		box0.setPosition(20F, -4F, -6F);
		box0.rotateAngleY = -1.5707963267948966F;

		box1 = new CustomModelRenderer(this, 0, 0, 256, 128);
		box1.addBox(0F, 0F, 0F, 1, 4, 12);
		box1.setPosition(-6F, -4F, 5F);
		box1.rotateAngleY = -1.5707963267948966F;

		box2 = new CustomModelRenderer(this, 2, 85, 256, 128);
		box2.addBox(0F, 0F, 0F, 1, 2, 8);
		box2.setPosition(-8F, -2F, 6F);
		box2.rotateAngleY = -1.5707963267948966F;

		box3 = new CustomModelRenderer(this, 2, 85, 256, 128);
		box3.addBox(0F, 0F, 0F, 1, 2, 8);
		box3.setPosition(18F, -2F, 6F);
		box3.rotateAngleY = -1.5707963267948966F;

		box4 = new CustomModelRenderer(this, 2, 85, 256, 128);
		box4.addBox(0F, 0F, 0F, 1, 2, 8);
		box4.setPosition(18F, -2F, -7F);
		box4.rotateAngleY = -1.5707963267948966F;

		box5 = new CustomModelRenderer(this, 30, 2, 256, 128);
		box5.addBox(0F, 0F, 0F, 6, 3, 3);
		box5.setPosition(19F, -1F, -2F);

		carbase = new CustomModelRenderer(this, 0, 83, 256, 128);
		carbase.mirror = true;
		carbase.addBox(0F, 0F, 0F, 16, 2, 42);
		carbase.setPosition(22F, 0F, -8F);
		carbase.rotateAngleY = -1.5707963267948966F;

		freightbox = new CustomModelRenderer(this, 0, 18, 256, 128);
		freightbox.mirror = true;
		freightbox.addBox(0F, 0F, 0F, 16, 23, 40);
		freightbox.setPosition(21F, 2F, -8F);
		freightbox.rotateAngleY = -1.5707963267948966F;

		roof = new CustomModelRenderer(this, 118, 61, 256, 128);
		roof.mirror = true;
		roof.addBox(0F, 0F, 0F, 16, 1, 42);
		roof.setPosition(22F, 25F, -8F);
		roof.rotateAngleY = -1.5707963267948966F;

		top = new CustomModelRenderer(this, 115, 17, 256, 128);
		top.mirror = true;
		top.addBox(0F, 0F, 0F, 4, 1, 42);
		top.setPosition(22F, 26F, -2F);
		top.rotateAngleY = -1.5707963267948966F;

	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		if (ConfigHandler.FLICKERING) {
			super.render(entity, f, f1, f2, f3, f4, f5);
		}
		// render:

		attach.render(f5);
		bogey.render(f5);
		bogeyframe.render(f5);
		box.render(f5);
		box0.render(f5);
		box1.render(f5);
		box2.render(f5);
		box3.render(f5);
		box4.render(f5);
		box5.render(f5);
		carbase.render(f5);
		freightbox.render(f5);
		roof.render(f5);
		top.render(f5);

	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {}

	// variables init:
	public CustomModelRenderer attach;
	public CustomModelRenderer bogey;
	public CustomModelRenderer bogeyframe;
	public CustomModelRenderer box;
	public CustomModelRenderer box0;
	public CustomModelRenderer box1;
	public CustomModelRenderer box2;
	public CustomModelRenderer box3;
	public CustomModelRenderer box4;
	public CustomModelRenderer box5;
	public CustomModelRenderer carbase;
	public CustomModelRenderer freightbox;
	public CustomModelRenderer roof;
	public CustomModelRenderer top;

}
