package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import train.client.render.CustomModelRenderer;
import train.common.core.handlers.ConfigHandler;

public class ModelLocoCherepanov extends ModelBase {

	public ModelLocoCherepanov() {
		box = new CustomModelRenderer(this, 1, 7, 128, 64);
		box.addBox(0F, 0F, 0F, 4, 2, 2);
		box.setPosition(-21F, 6F, -1F);

		box0 = new CustomModelRenderer(this, 26, 51, 128, 64);
		box0.addBox(0F, 0F, 0F, 34, 2, 10);
		box0.setPosition(-17F, 6F, -5F);

		box1 = new CustomModelRenderer(this, 1, 52, 128, 64);
		box1.addBox(0F, 0F, 0F, 10, 10, 1);
		box1.setPosition(5F, 0F, -6F);

		box10 = new CustomModelRenderer(this, 58, 44, 128, 64);
		box10.addBox(0F, 0F, 0F, 7, 3, 3);
		box10.setPosition(15F, 17F, -2F);
		box10.rotateAngleX = -3.9793506945470716F;
		box10.rotateAngleY = -3.141592653589793F;

		box11 = new CustomModelRenderer(this, 1, 37, 128, 64);
		box11.addBox(0F, 0F, 0F, 7, 4, 10);
		box11.setPosition(-10F, 8F, -5F);

		box12 = new CustomModelRenderer(this, 37, 44, 128, 64);
		box12.addBox(0F, 0F, 0F, 7, 3, 3);
		box12.setPosition(-10F, 12F, -5F);
		box12.rotateAngleX = -6.056292504420323F;

		box13 = new CustomModelRenderer(this, 58, 44, 128, 64);
		box13.addBox(0F, 0F, 0F, 7, 3, 3);
		box13.setPosition(-3F, 17F, -2F);
		box13.rotateAngleX = -3.9793506945470716F;
		box13.rotateAngleY = -3.141592653589793F;

		box14 = new CustomModelRenderer(this, 79, 40, 128, 64);
		box14.addBox(0F, 0F, 0F, 7, 6, 4);
		box14.setPosition(-10F, 11F, -2F);

		box15 = new CustomModelRenderer(this, 58, 44, 128, 64);
		box15.addBox(0F, 0F, 0F, 7, 3, 3);
		box15.setPosition(-10F, 17F, 2F);
		box15.rotateAngleX = -3.9793506945470716F;

		box16 = new CustomModelRenderer(this, 37, 44, 128, 64);
		box16.addBox(0F, 0F, 0F, 7, 3, 3);
		box16.setPosition(-3F, 12F, 5F);
		box16.rotateAngleX = -6.056292504420323F;
		box16.rotateAngleY = -3.141592653589793F;

		box17 = new CustomModelRenderer(this, 76, 31, 128, 64);
		box17.addBox(0F, 0F, 0F, 11, 4, 1);
		box17.setPosition(8F, 16F, -2F);
		box17.rotateAngleX = -3.839724354387525F;
		box17.rotateAngleY = -3.141592653589793F;

		box18 = new CustomModelRenderer(this, 27, 37, 128, 64);
		box18.addBox(0F, 0F, 0F, 11, 5, 1);
		box18.setPosition(-3F, 8F, -4F);
		box18.rotateAngleX = -0.10471975511965978F;

		box19 = new CustomModelRenderer(this, 27, 37, 128, 64);
		box19.addBox(0F, 0F, 0F, 11, 5, 1);
		box19.setPosition(8F, 8F, 4F);
		box19.rotateAngleX = -0.10471975511965978F;
		box19.rotateAngleY = -3.141592653589793F;

		box2 = new CustomModelRenderer(this, 0, 0, 128, 64);
		box2.addBox(0F, 0F, 0F, 2, 2, 10);
		box2.setPosition(9F, 4F, -5F);

		box20 = new CustomModelRenderer(this, 76, 31, 128, 64);
		box20.addBox(0F, 0F, 0F, 11, 4, 1);
		box20.setPosition(-3F, 16F, 2F);
		box20.rotateAngleX = -3.839724354387525F;

		box21 = new CustomModelRenderer(this, 115, 39, 128, 64);
		box21.addBox(0F, 0F, 0F, 3, 21, 3);
		box21.setPosition(9F, 17F, 0F);
		box21.rotateAngleY = -5.497787143782138F;

		box22 = new CustomModelRenderer(this, 98, 33, 128, 64);
		box22.addBox(0F, 0F, 0F, 4, 2, 4);
		box22.setPosition(8F, 38F, 0F);
		box22.rotateAngleY = -5.497787143782138F;

		box23 = new CustomModelRenderer(this, 1, 52, 128, 64);
		box23.addBox(0F, 0F, 0F, 10, 10, 1);
		box23.setPosition(-8F, 0F, -6F);

		box24 = new CustomModelRenderer(this, 1, 52, 128, 64);
		box24.addBox(0F, 0F, 0F, 10, 10, 1);
		box24.setPosition(5F, 0F, 5F);

		box25 = new CustomModelRenderer(this, 1, 52, 128, 64);
		box25.addBox(0F, 0F, 0F, 10, 10, 1);
		box25.setPosition(-8F, 0F, 5F);

		box26 = new CustomModelRenderer(this, 1, 17, 128, 64);
		box26.addBox(0F, 0F, 0F, 2, 7, 2);
		box26.setPosition(-1F, 16F, -1F);

		box27 = new CustomModelRenderer(this, 114, 31, 128, 64);
		box27.addBox(0F, 0F, 0F, 3, 1, 4);
		box27.setPosition(3F, 16F, -2F);

		box28 = new CustomModelRenderer(this, 50, 24, 128, 64);
		box28.addBox(0F, 0F, 0F, 2, 2, 10);
		box28.setPosition(15F, 8F, -5F);

		box29 = new CustomModelRenderer(this, 35, 22, 128, 64);
		box29.addBox(0F, 0F, 0F, 3, 10, 4);
		box29.setPosition(13F, 8F, -2F);

		box3 = new CustomModelRenderer(this, 79, 40, 128, 64);
		box3.addBox(0F, 0F, 0F, 7, 6, 4);
		box3.setPosition(8F, 11F, -2F);

		box30 = new CustomModelRenderer(this, 25, 0, 128, 64);
		box30.addBox(0F, 0F, 0F, 27, 9, 12);
		box30.setPosition(-11F, 8F, -6F);

		box31 = new CustomModelRenderer(this, 100, 0, 128, 64);
		box31.addBox(0F, 0F, 0F, 6, 4, 8);
		box31.setPosition(-9F, 6F, -4F);
		box31.rotateAngleZ = -0.5061454830783556F;

		box32 = new CustomModelRenderer(this, 100, 0, 128, 64);
		box32.addBox(0F, 0F, 0F, 6, 4, 8);
		box32.setPosition(16F, 6F, 4F);
		box32.rotateAngleY = 3.141592653589793F;
		box32.rotateAngleZ = 0.5061454830783556F;

		box33 = new CustomModelRenderer(this, 118, 16, 128, 64);
		box33.addBox(0F, 0F, 0F, 2, 3, 2);
		box33.setPosition(1F, 8F, 5F);
		box33.rotateAngleX = -0.3490658503988659F;
		box33.rotateAngleY = -3.141592653589793F;

		box34 = new CustomModelRenderer(this, 118, 16, 128, 64);
		box34.addBox(0F, 0F, 0F, 2, 3, 2);
		box34.setPosition(-1F, 8F, -5F);
		box34.rotateAngleX = -0.3490658503988659F;

		box35 = new CustomModelRenderer(this, 97, 13, 128, 64);
		box35.addBox(0F, 0F, 0F, 5, 2, 10);
		box35.setPosition(1F, 8F, -5F);

		box36 = new CustomModelRenderer(this, 0, 0, 128, 64);
		box36.addBox(0F, 0F, 0F, 2, 2, 10);
		box36.setPosition(-4F, 4F, -5F);

		box37 = new CustomModelRenderer(this, 3, 30, 128, 64);
		box37.addBox(0F, 0F, 0F, 7, 6, 0);
		box37.setPosition(-17F, 8F, -5F);

		box4 = new CustomModelRenderer(this, 1, 37, 128, 64);
		box4.addBox(0F, 0F, 0F, 7, 4, 10);
		box4.setPosition(8F, 8F, -5F);

		box5 = new CustomModelRenderer(this, 52, 38, 128, 64);
		box5.addBox(0F, 0F, 0F, 11, 1, 4);
		box5.setPosition(-3F, 15F, -2F);

		box6 = new CustomModelRenderer(this, 37, 44, 128, 64);
		box6.addBox(0F, 0F, 0F, 7, 3, 3);
		box6.setPosition(8F, 12F, -5F);
		box6.rotateAngleX = -6.056292504420323F;

		box7 = new CustomModelRenderer(this, 3, 30, 128, 64);
		box7.addBox(0F, 0F, 0F, 7, 6, 0);
		box7.setPosition(-17F, 8F, 5F);

		box8 = new CustomModelRenderer(this, 58, 44, 128, 64);
		box8.addBox(0F, 0F, 0F, 7, 3, 3);
		box8.setPosition(8F, 17F, 2F);
		box8.rotateAngleX = -3.9793506945470716F;

		box9 = new CustomModelRenderer(this, 37, 44, 128, 64);
		box9.addBox(0F, 0F, 0F, 7, 3, 3);
		box9.setPosition(15F, 12F, 5F);
		box9.rotateAngleX = -6.056292504420323F;
		box9.rotateAngleY = -3.141592653589793F;

	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		if (ConfigHandler.FLICKERING) {
			super.render(entity, f, f1, f2, f3, f4, f5);
		}
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
		box21.render(f5);
		box22.render(f5);
		box23.render(f5);
		box24.render(f5);
		box25.render(f5);
		box26.render(f5);
		box27.render(f5);
		box28.render(f5);
		box29.render(f5);
		box3.render(f5);
		box30.render(f5);
		box31.render(f5);
		box32.render(f5);
		box33.render(f5);
		box34.render(f5);
		box35.render(f5);
		box36.render(f5);
		box37.render(f5);
		box4.render(f5);
		box5.render(f5);
		box6.render(f5);
		box7.render(f5);
		box8.render(f5);
		box9.render(f5);

	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {}

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
	public CustomModelRenderer box21;
	public CustomModelRenderer box22;
	public CustomModelRenderer box23;
	public CustomModelRenderer box24;
	public CustomModelRenderer box25;
	public CustomModelRenderer box26;
	public CustomModelRenderer box27;
	public CustomModelRenderer box28;
	public CustomModelRenderer box29;
	public CustomModelRenderer box3;
	public CustomModelRenderer box30;
	public CustomModelRenderer box31;
	public CustomModelRenderer box32;
	public CustomModelRenderer box33;
	public CustomModelRenderer box34;
	public CustomModelRenderer box35;
	public CustomModelRenderer box36;
	public CustomModelRenderer box37;
	public CustomModelRenderer box4;
	public CustomModelRenderer box5;
	public CustomModelRenderer box6;
	public CustomModelRenderer box7;
	public CustomModelRenderer box8;
	public CustomModelRenderer box9;

}
