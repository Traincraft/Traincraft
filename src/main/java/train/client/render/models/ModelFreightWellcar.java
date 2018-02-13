package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import train.client.render.CustomModelRenderer;
import train.common.core.handlers.ConfigHandler;

public class ModelFreightWellcar extends ModelBase {

	public ModelFreightWellcar() {
		box = new CustomModelRenderer(this, 108, 0, 256, 128);
		box.addBox(0F, 0F, 0F, 1, 6, 14);
		box.setPosition(5F, 0F, 10F);

		box0 = new CustomModelRenderer(this, 107, 25, 256, 128);
		box0.addBox(0F, 0F, 0F, 1, 4, 10);
		box0.setPosition(6F, 1F, 12F);

		box1 = new CustomModelRenderer(this, 69, 5, 256, 128);
		box1.addBox(0F, 0F, 0F, 10, 1, 1);
		box1.setPosition(-5F, 3F, -22F);

		box10 = new CustomModelRenderer(this, 0, 74, 256, 128);
		box10.addBox(0F, 0F, 0F, 12, 1, 18);
		box10.setPosition(-6F, 2F, -9F);

		box11 = new CustomModelRenderer(this, 100, 75, 256, 128);
		box11.addBox(0F, 0F, 0F, 12, 1, 18);
		box11.setPosition(-6F, 3F, -9F);

		box12 = new CustomModelRenderer(this, 99, 95, 256, 128);
		box12.addBox(0F, 0F, 0F, 14, 1, 18);
		box12.setPosition(-7F, 4F, -9F);

		box13 = new CustomModelRenderer(this, 146, 92, 256, 128);
		box13.addBox(0F, 0F, 0F, 16, 1, 18);
		box13.setPosition(-8F, 5F, -9F);

		box14 = new CustomModelRenderer(this, 71, 66, 256, 128);
		box14.addBox(0F, 0F, 0F, 16, 2, 2);
		box14.setPosition(-8F, 2F, 16F);

		box15 = new CustomModelRenderer(this, 69, 5, 256, 128);
		box15.addBox(0F, 0F, 0F, 10, 1, 1);
		box15.setPosition(-5F, 3F, 21F);

		box16 = new CustomModelRenderer(this, 162, 116, 256, 128);
		box16.addBox(0F, 0F, 0F, 18, 1, 8);
		box16.setPosition(-9F, 8F, 16F);

		box17 = new CustomModelRenderer(this, 77, 37, 256, 128);
		box17.addBox(0F, 0F, 0F, 4, 2, 4);
		box17.setPosition(-2F, 4F, -19F);

		box18 = new CustomModelRenderer(this, 162, 116, 256, 128);
		box18.addBox(0F, 0F, 0F, 18, 1, 8);
		box18.setPosition(9F, 8F, -16F);
		box18.rotateAngleY = -3.141592653589793F;

		box2 = new CustomModelRenderer(this, 108, 0, 256, 128);
		box2.addBox(0F, 0F, 0F, 1, 6, 14);
		box2.setPosition(-6F, 0F, -24F);

		box22 = new CustomModelRenderer(this, 77, 37, 256, 128);
		box22.addBox(0F, 0F, 0F, 4, 2, 4);
		box22.setPosition(-2F, 4F, 15F);

		box28 = new CustomModelRenderer(this, 8, 98, 256, 128);
		box28.addBox(0F, 0F, 0F, 1, 5, 18);
		box28.setPosition(-9F, 6F, 9F);
		box28.rotateAngleX = -3.141592653589793F;
		box28.rotateAngleZ = -5.6374134839416845F;

		box3 = new CustomModelRenderer(this, 108, 0, 256, 128);
		box3.addBox(0F, 0F, 0F, 1, 6, 14);
		box3.setPosition(5F, 0F, -24F);

		box30 = new CustomModelRenderer(this, 8, 98, 256, 128);
		box30.addBox(0F, 0F, 0F, 1, 5, 18);
		box30.setPosition(9F, 6F, -9F);
		box30.rotateAngleZ = -3.7873644768276953F;

		box31 = new CustomModelRenderer(this, 108, 0, 256, 128);
		box31.addBox(0F, 0F, 0F, 1, 6, 14);
		box31.setPosition(-6F, 0F, 10F);

		box32 = new CustomModelRenderer(this, 107, 25, 256, 128);
		box32.addBox(0F, 0F, 0F, 1, 4, 10);
		box32.setPosition(-7F, 1F, 12F);

		box4 = new CustomModelRenderer(this, 107, 25, 256, 128);
		box4.addBox(0F, 0F, 0F, 1, 4, 10);
		box4.setPosition(-7F, 1F, -22F);

		box41 = new CustomModelRenderer(this, 14, 75, 256, 128);
		box41.addBox(0F, 0F, 0F, 18, 2, 48);
		box41.setPosition(-9F, 6F, -24F);

		box43 = new CustomModelRenderer(this, 73, 23, 256, 128);
		box43.addBox(0F, 0F, 0F, 4, 2, 9);
		box43.setPosition(-2F, 5F, -28F);

		box49 = new CustomModelRenderer(this, 136, 3, 256, 128);
		box49.addBox(0F, 0F, 0F, 16, 32, 38);//16 32 38
		box49.setPosition(-8F, 6F, -19F);

		box5 = new CustomModelRenderer(this, 107, 25, 256, 128);
		box5.addBox(0F, 0F, 0F, 1, 4, 10);
		box5.setPosition(6F, 1F, -22F);

		box6 = new CustomModelRenderer(this, 71, 66, 256, 128);
		box6.addBox(0F, 0F, 0F, 16, 2, 2);
		box6.setPosition(-8F, 2F, -18F);

		box7 = new CustomModelRenderer(this, 69, 4, 256, 128);
		box7.addBox(0F, 0F, 0F, 10, 1, 1);
		box7.setPosition(-5F, 3F, -13F);

		box8 = new CustomModelRenderer(this, 69, 1, 256, 128);
		box8.addBox(0F, 0F, 0F, 10, 1, 1);
		box8.setPosition(-5F, 3F, 12F);

		box9 = new CustomModelRenderer(this, 73, 23, 256, 128);
		box9.addBox(0F, 0F, 0F, 4, 2, 9);
		box9.setPosition(-2F, 5F, 19F);

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
		box2.render(f5);
		box22.render(f5);
		box28.render(f5);
		box3.render(f5);
		box30.render(f5);
		box31.render(f5);
		box32.render(f5);
		box4.render(f5);
		box41.render(f5);
		box43.render(f5);
		box5.render(f5);
		box6.render(f5);
		box7.render(f5);
		box8.render(f5);
		box9.render(f5);
		box49.render(f5);

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
	public CustomModelRenderer box2;
	public CustomModelRenderer box22;
	public CustomModelRenderer box28;
	public CustomModelRenderer box3;
	public CustomModelRenderer box30;
	public CustomModelRenderer box31;
	public CustomModelRenderer box32;
	public CustomModelRenderer box4;
	public CustomModelRenderer box41;
	public CustomModelRenderer box43;
	public CustomModelRenderer box49;
	public CustomModelRenderer box5;
	public CustomModelRenderer box6;
	public CustomModelRenderer box7;
	public CustomModelRenderer box8;
	public CustomModelRenderer box9;

}
