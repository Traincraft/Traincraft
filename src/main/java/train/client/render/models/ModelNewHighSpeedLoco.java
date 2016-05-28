package train.client.render.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import train.common.core.handlers.ConfigHandler;
import train.client.render.CustomModelRenderer;

public class ModelNewHighSpeedLoco extends ModelBase {

	public ModelNewHighSpeedLoco() {
		Body = new CustomModelRenderer(37, 51, 512, 256);
		Body.addBox(0F, 0F, 0F, 24, 8, 84);
		Body.setPosition(-12F, 6F, -30F);
		box = new CustomModelRenderer(283, 171, 512, 256);
		box.addBox(0F, 0F, 0F, 2, 5, 23);
		box.setPosition(-12F, 24F, -17F);
		box.rotateAngleX = -0.47123889803846897F;
		box0 = new CustomModelRenderer(283, 171, 512, 256);
		box0.addBox(0F, 0F, 0F, 2, 5, 23);
		box0.setPosition(10F, 24F, -17F);
		box0.rotateAngleX = -0.47123889803846897F;
		box1 = new CustomModelRenderer(318, 105, 512, 256);
		box1.addBox(0F, 0F, 0F, 24, 4, 53);
		box1.setPosition(-12F, 35F, 1F);
		box2 = new CustomModelRenderer(264, 28, 512, 256);
		box2.addBox(0F, 0F, 0F, 24, 21, 44);
		box2.setPosition(-12F, 14F, 10F);
		box3 = new CustomModelRenderer(423, 180, 512, 256);
		box3.addBox(0F, 0F, 0F, 2, 8, 41);
		box3.setPosition(10F, 14F, -31F);
		box4 = new CustomModelRenderer(368, 196, 512, 256);
		box4.addBox(0F, 0F, 0F, 2, 8, 41);
		box4.setPosition(-12F, 14F, -31F);
		NoseCone = new CustomModelRenderer(0, 184, 512, 256);
		NoseCone.addBox(0F, 0F, 0F, 24, 8, 12);
		NoseCone.setPosition(-12F, 8F, -41F);
		NoseCone.rotateAngleX = -6.09119908946021F;
		NoseCone0 = new CustomModelRenderer(0, 146, 512, 256);
		NoseCone0.addBox(0F, 0F, 0F, 24, 8, 27);
		NoseCone0.setPosition(-12F, 10F, -40F);
		NoseCone0.rotateAngleX = -0.4537856055185257F;
		Underbody = new CustomModelRenderer(72, 194, 512, 256);
		Underbody.addBox(0F, 0F, 0F, 22, 4, 32);
		Underbody.setPosition(-11F, 2F, -4F);
		WheelBase = new CustomModelRenderer(182, 187, 512, 256);
		WheelBase.addBox(0F, 0F, 0F, 18, 6, 16);
		WheelBase.setPosition(-9F, 0F, -22F);
		WheelBase0 = new CustomModelRenderer(182, 187, 512, 256);
		WheelBase0.addBox(0F, 0F, 0F, 18, 6, 16);
		WheelBase0.setPosition(-9F, 0F, 30F);

	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		if (ConfigHandler.FLICKERING) {
			super.render(entity, f, f1, f2, f3, f4, f5);
		}
		Body.render(f5);
		box.render(f5);
		box0.render(f5);
		box1.render(f5);
		box2.render(f5);
		box3.render(f5);
		box4.render(f5);
		NoseCone.render(f5);
		NoseCone0.render(f5);
		Underbody.render(f5);
		WheelBase.render(f5);
		WheelBase0.render(f5);

	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {}

	public CustomModelRenderer Body;
	public CustomModelRenderer box;
	public CustomModelRenderer box0;
	public CustomModelRenderer box1;
	public CustomModelRenderer box2;
	public CustomModelRenderer box3;
	public CustomModelRenderer box4;
	public CustomModelRenderer NoseCone;
	public CustomModelRenderer NoseCone0;
	public CustomModelRenderer Underbody;
	public CustomModelRenderer WheelBase;
	public CustomModelRenderer WheelBase0;

}
