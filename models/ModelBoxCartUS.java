package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import train.client.render.ModelRendererTurbo;

public class ModelBoxCartUS extends ModelBase {

	public ModelBoxCartUS() {
		box = new ModelRendererTurbo(this, 10, 1, 128, 128);
		box.addBox(0F, 0F, 0F, 4, 3, 3);
		box.setPosition(13F, 1F, -7F);

		box0 = new ModelRendererTurbo(this, 0, 34, 128, 128);
		box0.addBox(0F, -1F, 0F, 46, 2, 9);
		box0.setPosition(-23F, 32F, -9F);
		box0.rotateAngleX = -0.15707963267948966F;

		box1 = new ModelRendererTurbo(this, 7, 2, 128, 128);
		box1.addBox(0F, 0F, 0F, 7, 3, 4);
		box1.setPosition(23F, 6F, -2F);

		box10 = new ModelRendererTurbo(this, 0, 0, 128, 128);
		box10.addBox(0F, 0F, 0F, 2, 2, 10);
		box10.setPosition(-12F, 2F, -5F);

		box11 = new ModelRendererTurbo(this, 0, 0, 128, 128);
		box11.addBox(0F, 0F, 0F, 2, 2, 10);
		box11.setPosition(-22F, 2F, -5F);

		box12 = new ModelRendererTurbo(this, 3, 2, 128, 128);
		box12.addBox(0F, 0F, 0F, 4, 3, 3);
		box12.setPosition(-17F, 1F, 4F);

		box13 = new ModelRendererTurbo(this, 5, 2, 128, 128);
		box13.addBox(0F, 0F, 0F, 4, 3, 3);
		box13.setPosition(-17F, 1F, -7F);

		box15 = new ModelRendererTurbo(this, 1, 1, 128, 128);
		box15.addBox(0F, 0F, 0F, 20, 1, 1);
		box15.setPosition(-11F, 5F, 3F);

		box16 = new ModelRendererTurbo(this, 1, 1, 128, 128);
		box16.addBox(0F, 0F, 0F, 20, 1, 1);
		box16.setPosition(-11F, 5F, -4F);

		box17 = new ModelRendererTurbo(this, 93, 1, 128, 128);
		box17.addBox(0F, 0F, 0F, 16, 22, 1);
		box17.setPosition(-8F, 8F, -10F);

		box18 = new ModelRendererTurbo(this, 93, 1, 128, 128);
		box18.addBox(0F, 0F, 0F, 16, 22, 1);
		box18.setPosition(8F, 8F, 10F);
		box18.rotateAngleY = -3.141592653589793F;

		box19 = new ModelRendererTurbo(this, 0, 46, 128, 128);
		box19.addBox(0F, 0F, 0F, 46, 26, 1);
		box19.setPosition(-23F, 6F, -9F);

		box2 = new ModelRendererTurbo(this, 0, 92, 128, 128);
		box2.addBox(0F, 0F, 0F, 48, 7, 12);
		box2.setPosition(-24F, 0F, -6F);

		box20 = new ModelRendererTurbo(this, 0, 46, 128, 128);
		box20.addBox(0F, 0F, 0F, 46, 26, 1);
		box20.setPosition(23F, 6F, 9F);
		box20.rotateAngleY = -3.141592653589793F;

		box21 = new ModelRendererTurbo(this, 94, 32, 128, 128);
		box21.addBox(0F, 0F, 0F, 1, 26, 16);
		box21.setPosition(-22F, 6F, 8F);
		box21.rotateAngleY = -3.141592653589793F;

		box22 = new ModelRendererTurbo(this, 94, 32, 128, 128);
		box22.addBox(0F, 0F, 0F, 1, 26, 16);
		box22.setPosition(22F, 6F, -8F);

		box23 = new ModelRendererTurbo(this, 1, 1, 128, 128);
		box23.addBox(0F, 0F, 0F, 7, 3, 4);
		box23.setPosition(-30F, 6F, -2F);

		box24 = new ModelRendererTurbo(this, 0, 74, 128, 128);
		box24.addBox(0F, 0F, 0F, 44, 2, 16);
		box24.setPosition(-22F, 6F, -8F);

		box25 = new ModelRendererTurbo(this, 0, 111, 128, 128);
		box25.addBox(0F, 0F, 0F, 48, 7, 10);
		box25.setPosition(-24F, 0F, -5F);

		box3 = new ModelRendererTurbo(this, 0, 0, 128, 128);
		box3.addBox(0F, 0F, 0F, 2, 2, 10);
		box3.setPosition(20F, 2F, -5F);

		box4 = new ModelRendererTurbo(this, 1, 0, 128, 128);
		box4.addBox(0F, 0F, 0F, 10, 2, 8);
		box4.setPosition(-21F, 4F, -4F);

		box5 = new ModelRendererTurbo(this, 0, 0, 128, 128);
		box5.addBox(0F, 0F, 0F, 2, 2, 10);
		box5.setPosition(10F, 2F, -5F);

		box6 = new ModelRendererTurbo(this, 0, 34, 128, 128);
		box6.addBox(0F, -1F, 0F, 46, 2, 9);
		box6.setPosition(-23F, 32F, 9F);
		box6.rotateAngleX = -2.9845130209103035F;

		box7 = new ModelRendererTurbo(this, 1, 25, 128, 128);
		box7.addBox(0F, -1F, 0F, 48, 1, 4);
		box7.setPosition(-24F, 35F, -2F);

		box8 = new ModelRendererTurbo(this, 6, 2, 128, 128);
		box8.addBox(0F, 0F, 0F, 4, 3, 3);
		box8.setPosition(13F, 1F, 4F);

		box9 = new ModelRendererTurbo(this, 0, 0, 128, 128);
		box9.addBox(0F, 0F, 0F, 10, 2, 8);
		box9.setPosition(11F, 4F, -4F);

	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		/*if (ConfigHandler.FLICKERING) {
			super.render(entity, f, f1, f2, f3, f4, f5);
		}*/
		// render:
		box.render(f5);
		box0.render(f5);
		box1.render(f5);
		box10.render(f5);
		box11.render(f5);
		box12.render(f5);
		box13.render(f5);
		box15.render(f5);
		box16.render(f5);
		box17.render(f5);
		box18.render(f5);
		box19.render(f5);
		box2.render(f5);
		box20.render(f5);
		box21.render(f5);
		box22.render(f5);
		box23.render(f5);
		box24.render(f5);
		box25.render(f5);
		box3.render(f5);
		box4.render(f5);
		box5.render(f5);
		box6.render(f5);
		box7.render(f5);
		box8.render(f5);
		box9.render(f5);
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {}

	// variables init:
	public ModelRendererTurbo box;
	public ModelRendererTurbo box0;
	public ModelRendererTurbo box1;
	public ModelRendererTurbo box10;
	public ModelRendererTurbo box11;
	public ModelRendererTurbo box12;
	public ModelRendererTurbo box13;
	public ModelRendererTurbo box15;
	public ModelRendererTurbo box16;
	public ModelRendererTurbo box17;
	public ModelRendererTurbo box18;
	public ModelRendererTurbo box19;
	public ModelRendererTurbo box2;
	public ModelRendererTurbo box20;
	public ModelRendererTurbo box21;
	public ModelRendererTurbo box22;
	public ModelRendererTurbo box23;
	public ModelRendererTurbo box24;
	public ModelRendererTurbo box25;
	public ModelRendererTurbo box3;
	public ModelRendererTurbo box4;
	public ModelRendererTurbo box5;
	public ModelRendererTurbo box6;
	public ModelRendererTurbo box7;
	public ModelRendererTurbo box8;
	public ModelRendererTurbo box9;

}
