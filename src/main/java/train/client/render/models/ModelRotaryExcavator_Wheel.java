package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import train.client.render.CustomModelRenderer;
import train.common.core.handlers.ConfigHandler;

public class ModelRotaryExcavator_Wheel extends ModelBase {
	//public float wheel1 = 0.4188790204786391F;
	//private long lastframe;
	//private float wheel;
	//private int l;

	public ModelRotaryExcavator_Wheel() {
		box4 = new CustomModelRenderer(this, 60, 26, 128, 64);
		box3 = new CustomModelRenderer(this, 59, 23, 128, 64);
		box1 = new CustomModelRenderer(this, 56, 9, 128, 64);
		box13 = new CustomModelRenderer(this, 59, 23, 128, 64);
		box10 = new CustomModelRenderer(this, 54, 3, 128, 64);
		box12 = new CustomModelRenderer(this, 58, 14, 128, 64);
		box11 = new CustomModelRenderer(this, 56, 9, 128, 64);
		box = new CustomModelRenderer(this, 60, 26, 128, 64);
		box6 = new CustomModelRenderer(this, 54, 3, 128, 64);
		box5 = new CustomModelRenderer(this, 4, 29, 128, 64);
		box0 = new CustomModelRenderer(this, 54, 3, 128, 64);
		box2 = new CustomModelRenderer(this, 58, 14, 128, 64);
		box7 = new CustomModelRenderer(this, 54, 3, 128, 64);

		box4.addBox(-2F, -4F, -4F, 9, 8, 8);
		box4.setPosition(-4F, 0F, 0F);
		box3.addBox(-3F, -5F, -5F, 7, 10, 10);
		box3.setPosition(-2F, 0F, 0F);
		box1.addBox(-2F, -9F, -9F, 3, 18, 18);
		box1.setPosition(-1F, 0F, 0F);
		box13.addBox(-3F, -5F, -5F, 7, 10, 10);
		box13.setPosition(-2F, 0F, 0F);
		box10.addBox(-1F, -11F, -11F, 1, 22, 22);
		box10.setPosition(-1F, 0F, 0F);
		box12.addBox(-2F, -7F, -7F, 5, 14, 14);
		box12.setPosition(-2F, 0F, 0F);
		box11.addBox(-2F, -9F, -9F, 3, 18, 18);
		box11.setPosition(-1F, 0F, 0F);
		box.addBox(-2F, -4F, -4F, 9, 8, 8);
		box.setPosition(-4F, 0F, 0F);
		box6.addBox(-1F, -11F, -11F, 1, 22, 22);
		box6.setPosition(-1F, 0F, 0F);
		box5.addBox(-2F, -2F, -2F, 15, 4, 4);
		box5.setPosition(-7F, 0F, 0F);
		box0.addBox(-1F, -11F, -11F, 1, 22, 22);
		box0.setPosition(-1F, 0F, 0F);
		box2.addBox(-2F, -7F, -7F, 5, 14, 14);
		box2.setPosition(-2F, 0F, 0F);
		box7.addBox(-1F, -11F, -11F, 1, 22, 22);
		box7.setPosition(-1F, 0F, 0F);
		box4.rotateAngleX = -0.7853981633974483F;
		box3.rotateAngleX = -0.7853981633974483F;
		box1.rotateAngleX = -0.7853981633974483F;
		box6.rotateAngleX = -1.2217304763960306F;
		box0.rotateAngleX = -0.7853981633974483F;
		box2.rotateAngleX = -0.7853981633974483F;
		box7.rotateAngleX = -0.4363323129985824F;

	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		if (ConfigHandler.FLICKERING) {
			super.render(entity, f, f1, f2, f3, f4, f5);
		}

		box.render(f5);
		box4.render(f5);
		box5.render(f5);
		box0.render(f5);
		box2.render(f5);
		box7.render(f5);
		box1.render(f5);
		box3.render(f5);
		box6.render(f5);
		box.render(f5);
		box10.render(f5);
		box11.render(f5);
		box12.render(f5);
		box13.render(f5);
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {}

	// variables init:
	public CustomModelRenderer box;
	public CustomModelRenderer box0;
	public CustomModelRenderer box1;
	public CustomModelRenderer box2;
	public CustomModelRenderer box3;
	public CustomModelRenderer box4;
	public CustomModelRenderer box5;
	public CustomModelRenderer box6;
	public CustomModelRenderer box7;
	public CustomModelRenderer box10;
	public CustomModelRenderer box11;
	public CustomModelRenderer box12;
	public CustomModelRenderer box13;

}
