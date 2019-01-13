package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import train.client.render.CustomModelRenderer;
import train.common.core.handlers.ConfigHandler;

public class ModelTankWagon extends ModelBase {

	public ModelTankWagon() {

		// constructor:
		box = new CustomModelRenderer(this, 0, 20, 256, 256);
		box.addBox(0F, 0F, 0F, 15, 4, 8);
		box.setPosition(7F, 3F, -4F);

		box0 = new CustomModelRenderer(this, 105, 28, 256, 256);
		box0.addBox(0F, 0F, 0F, 4, 2, 4);
		box0.setPosition(-2F, 29F, -2F);

		box1 = new CustomModelRenderer(this, 0, 20, 256, 256);
		box1.addBox(0F, 0F, 0F, 15, 4, 8);
		box1.setPosition(-22F, 3F, -4F);

		box10 = new CustomModelRenderer(this, 156, 173, 256, 256);
		box10.addBox(0F, 0F, 0F, 42, 4, 8);
		box10.setPosition(21F, 15F, -10F);
		box10.rotateAngleX = -1.5707963267948966F;
		box10.rotateAngleY = -3.141592653589793F;

		box11 = new CustomModelRenderer(this, 55, 199, 256, 256);
		box11.addBox(0F, 0F, 0F, 42, 4, 8);
		box11.setPosition(-21F, 25F, -4F);

		box12 = new CustomModelRenderer(this, 0, 11, 256, 256);
		box12.addBox(0F, 0F, 0F, 58, 3, 4);
		box12.setPosition(-29F, 6F, -2F);

		box13 = new CustomModelRenderer(this, 0, 60, 256, 256);
		box13.addBox(0F, 0F, 0F, 1, 16, 4);
		box13.setPosition(-2F, 8F, -10F);
		box13.rotateAngleY = -4.71238898038469F;

		box14 = new CustomModelRenderer(this, 36, 20, 256, 256);
		box14.addBox(0F, 0F, 0F, 15, 3, 14);
		box14.setPosition(-22F, 6F, -7F);

		box15 = new CustomModelRenderer(this, 3, 14, 256, 256);
		box15.addBox(0F, 0F, 0F, 7, 3, 14);
		box15.setPosition(11F, 2F, -7F);

		box16 = new CustomModelRenderer(this, 55, 160, 256, 256);
		box16.addBox(0F, 0F, 0F, 42, 4, 8);
		box16.setPosition(21F, 29F, 4F);
		box16.rotateAngleX = -0.7853981633974483F;
		box16.rotateAngleZ = -3.141592653589793F;

		box17 = new CustomModelRenderer(this, 156, 160, 256, 256);
		box17.addBox(0F, 0F, 0F, 42, 4, 8);
		box17.setPosition(-21F, 29F, -4F);
		box17.rotateAngleX = -0.7853981633974483F;
		box17.rotateAngleY = -3.141592653589793F;
		box17.rotateAngleZ = -3.141592653589793F;

		box18 = new CustomModelRenderer(this, 3, 120, 256, 256);
		box18.addBox(0F, 0F, 0F, 46, 8, 8);
		box18.setPosition(-23F, 15F, -4F);

		box19 = new CustomModelRenderer(this, 156, 199, 256, 256);
		box19.addBox(0F, 0F, 0F, 42, 4, 8);
		box19.setPosition(-21F, 9F, -4F);

		box2 = new CustomModelRenderer(this, 132, 111, 256, 256);
		box2.addBox(0F, 0F, 0F, 46, 8, 12);
		box2.setPosition(-23F, -1F, -6F);

		box20 = new CustomModelRenderer(this, 1, 90, 256, 256);
		box20.addBox(0F, 0F, 0F, 44, 12, 12);
		box20.setPosition(-22F, 13F, -6F);

		box25 = new CustomModelRenderer(this, 134, 138, 256, 256);
		box25.addBox(0F, 0F, 0F, 46, 7, 10);
		box25.setPosition(-23F, 0F, -5F);

		box3 = new CustomModelRenderer(this, 10, 68, 256, 256);
		box3.addBox(0F, 0F, 0F, 1, 7, 4);
		box3.setPosition(2F, 24F, -11F);
		box3.rotateAngleY = 1.5707963267948966F;
		box3.rotateAngleZ = 0.7853981633974483F;

		box4 = new CustomModelRenderer(this, 3, 14, 256, 256);
		box4.addBox(0F, 0F, 0F, 7, 3, 14);
		box4.setPosition(-18F, 2F, -7F);

		box6 = new CustomModelRenderer(this, 55, 186, 256, 256);
		box6.addBox(0F, 0F, 0F, 42, 4, 8);
		box6.setPosition(-21F, 9F, 4F);
		box6.rotateAngleX = -0.7853981633974483F;

		box7 = new CustomModelRenderer(this, 156, 186, 256, 256);
		box7.addBox(0F, 0F, 0F, 42, 4, 8);
		box7.setPosition(21F, 9F, -4F);
		box7.rotateAngleX = -0.7853981633974483F;
		box7.rotateAngleY = -3.141592653589793F;

		box8 = new CustomModelRenderer(this, 55, 173, 256, 256);
		box8.addBox(0F, 0F, 0F, 42, 4, 8);
		box8.setPosition(-21F, 15F, 10F);
		box8.rotateAngleX = -1.5707963267948966F;

		box9 = new CustomModelRenderer(this, 36, 20, 256, 256);
		box9.addBox(0F, 0F, 0F, 15, 3, 14);
		box9.setPosition(7F, 6F, -7F);

	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		if (ConfigHandler.FLICKERING) {
			super.render(entity, f, f1, f2, f3, f4, f5);
		}
		// render:
		box.render(f5);
		box0.render(f5);
		box1.render(f5);
		box10.render(f5);
		box11.render(f5);
		box12.render(f5);
		box13.render(f5);
		box14.render(f5);
		box15.render(f5);
		box16.render(f5);
		box17.render(f5);
		box18.render(f5);
		box19.render(f5);
		box2.render(f5);
		box20.render(f5);
		box25.render(f5);

		box4.render(f5);
		box6.render(f5);
		box7.render(f5);
		box8.render(f5);
		box9.render(f5);
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {}

	// variables init:
	public CustomModelRenderer box;
	public CustomModelRenderer box0;
	public CustomModelRenderer box1;
	public CustomModelRenderer box10;
	public CustomModelRenderer box11;
	public CustomModelRenderer box12;
	public CustomModelRenderer box13;
	public CustomModelRenderer box14;
	public CustomModelRenderer box15;
	public CustomModelRenderer box16;
	public CustomModelRenderer box17;
	public CustomModelRenderer box18;
	public CustomModelRenderer box19;
	public CustomModelRenderer box2;
	public CustomModelRenderer box20;
	public CustomModelRenderer box25;
	public CustomModelRenderer box3;
	public CustomModelRenderer box4;
	public CustomModelRenderer box6;
	public CustomModelRenderer box7;
	public CustomModelRenderer box8;
	public CustomModelRenderer box9;

}
