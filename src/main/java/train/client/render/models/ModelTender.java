package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import train.client.render.CustomModelRenderer;
import train.common.core.handlers.ConfigHandler;

public class ModelTender extends ModelBase {

	public ModelTender() {

		// constructor:
		AXLE = new CustomModelRenderer(this, 0, 40, 128, 128);
		AXLE.addBox(0F, 0F, 0F, 16, 1, 1);
		AXLE.setPosition(-8F, 3F, -9F);

		AXLE0 = new CustomModelRenderer(this, 0, 40, 128, 128);
		AXLE0.addBox(0F, 0F, 0F, 16, 1, 1);
		AXLE0.setPosition(-8F, 3F, 8F);

		BODY = new CustomModelRenderer(this, 28, 94, 128, 128);
		BODY.addBox(0F, 0F, 0F, 20, 4, 30);
		BODY.setPosition(-10F, 8F, -15F);

		BODY0 = new CustomModelRenderer(this, 60, 0, 128, 128);
		BODY0.addBox(0F, 0F, 0F, 18, 12, 16);
		BODY0.setPosition(-9F, 12F, -2F);

		BODY1 = new CustomModelRenderer(this, 86, 57, 128, 128);
		BODY1.addBox(0F, 0F, 0F, 1, 16, 20);
		BODY1.setPosition(9F, 12F, -5F);

		BODY2 = new CustomModelRenderer(this, 43, 57, 128, 128);
		BODY2.addBox(0F, 0F, 0F, 1, 16, 20);
		BODY2.setPosition(-10F, 12F, -5F);

		BODY3 = new CustomModelRenderer(this, 0, 0, 128, 128);
		BODY3.addBox(0F, 0F, 0F, 18, 16, 1);
		BODY3.setPosition(-9F, 12F, 14F);

		UNDER = new CustomModelRenderer(this, 0, 96, 128, 128);
		UNDER.addBox(0F, 0F, 0F, 1, 7, 20);
		UNDER.setPosition(-7F, 1F, -10F);

		UNDER0 = new CustomModelRenderer(this, 0, 96, 128, 128);
		UNDER0.addBox(0F, 0F, 0F, 1, 7, 20);
		UNDER0.setPosition(6F, 1F, -10F);

		WHEELL = new CustomModelRenderer(this, 19, 42, 128, 128);
		WHEELL.addBox(0F, 0F, 0F, 2, 7, 7);
		WHEELL.setPosition(-6F, 0F, -12F);

		WHEELL0 = new CustomModelRenderer(this, 19, 42, 128, 128);
		WHEELL0.addBox(0F, 0F, 0F, 2, 7, 7);
		WHEELL0.setPosition(-6F, 0F, 5F);

		WHEELR = new CustomModelRenderer(this, 0, 42, 128, 128);
		WHEELR.addBox(0F, 0F, 0F, 2, 7, 7);
		WHEELR.setPosition(4F, 0F, -12F);

		WHEELR0 = new CustomModelRenderer(this, 0, 42, 128, 128);
		WHEELR0.addBox(0F, 0F, 0F, 2, 7, 7);
		WHEELR0.setPosition(4F, 0F, 5F);

	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		if (ConfigHandler.FLICKERING) {
			super.render(entity, f, f1, f2, f3, f4, f5);
		}
		/* super.render(entity, f, f1, f2, f3, f4, f5); for(int i = 0; i < 16; i++) { sideModels[i].render(f5);
		 * 
		 * } */
		// render:
		AXLE.render(f5);
		AXLE0.render(f5);
		BODY.render(f5);
		BODY0.render(f5);
		BODY1.render(f5);
		BODY2.render(f5);
		BODY3.render(f5);
		UNDER.render(f5);
		UNDER0.render(f5);
		WHEELL.render(f5);
		WHEELL0.render(f5);
		WHEELR.render(f5);
		WHEELR0.render(f5);

	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {}

	// variables init:
	public CustomModelRenderer AXLE;
	public CustomModelRenderer AXLE0;
	public CustomModelRenderer BODY;
	public CustomModelRenderer BODY0;
	public CustomModelRenderer BODY1;
	public CustomModelRenderer BODY2;
	public CustomModelRenderer BODY3;
	public CustomModelRenderer UNDER;
	public CustomModelRenderer UNDER0;
	public CustomModelRenderer WHEELL;
	public CustomModelRenderer WHEELL0;
	public CustomModelRenderer WHEELR;
	public CustomModelRenderer WHEELR0;

}
