package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import train.client.render.CustomModelRenderer;
import train.common.api.Freight;

public class ModelWood extends ModelBase {

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
	public CustomModelRenderer box34;
	public CustomModelRenderer box35;
	public CustomModelRenderer box36;
	public CustomModelRenderer box37;
	public CustomModelRenderer box5;
	public CustomModelRenderer box6;
	public CustomModelRenderer box63;
	public CustomModelRenderer box7;
	public CustomModelRenderer box8;
	public CustomModelRenderer box9;
	
	public ModelWood() {
		box = new CustomModelRenderer(this, 1, 1, 256, 64);
		box.addBox(0F, 0F, 0F, 6, 6, 0);
		box.setPosition(-26F, 0F, 5F);

		box0 = new CustomModelRenderer(this, 3, 27, 256, 64);
		box0.addBox(0F, 0F, 0F, 17, 5, 1);
		box0.setPosition(-27F, 1F, -6F);

		box1 = new CustomModelRenderer(this, 1, 1, 256, 64);
		box1.addBox(0F, 0F, 0F, 6, 6, 0);
		box1.setPosition(-17F, 0F, 5F);

		box10 = new CustomModelRenderer(this, 85, 7, 256, 64);
		box10.addBox(0F, 0F, 0F, 2, 2, 14);
		box10.setPosition(-24F, 2F, -7F);

		box11 = new CustomModelRenderer(this, 41, 27, 256, 64);
		box11.addBox(0F, 0F, 0F, 17, 5, 1);
		box11.setPosition(-27F, 1F, 5F);

		box12 = new CustomModelRenderer(this, 40, 1, 256, 64);
		box12.addBox(0F, 0F, 0F, 1, 2, 10);
		box12.setPosition(10F, 4F, -5F);

		box13 = new CustomModelRenderer(this, 40, 1, 256, 64);
		box13.addBox(0F, 0F, 0F, 1, 2, 10);
		box13.setPosition(26F, 4F, -5F);

		box14 = new CustomModelRenderer(this, 55, 2, 256, 64);
		box14.addBox(0F, 0F, 0F, 3, 3, 14);
		box14.setPosition(-20F, 4F, -7F);

		box15 = new CustomModelRenderer(this, 107, 12, 256, 64);
		box15.addBox(0F, 0F, 0F, 19, 3, 4);
		box15.setPosition(9F, 6F, -2F);

		box16 = new CustomModelRenderer(this, 9, 0, 256, 64);
		box16.addBox(0F, 0F, 0F, 3, 2, 22);
		box16.setPosition(17F, 9F, -11F);

		box17 = new CustomModelRenderer(this, 41, 27, 256, 64);
		box17.addBox(0F, 0F, 0F, 17, 5, 1);
		box17.setPosition(10F, 1F, 5F);

		box18 = new CustomModelRenderer(this, 55, 2, 256, 64);
		box18.addBox(0F, 0F, 0F, 3, 3, 14);
		box18.setPosition(17F, 4F, -7F);

		box19 = new CustomModelRenderer(this, 85, 7, 256, 64);
		box19.addBox(0F, 0F, 0F, 2, 2, 14);
		box19.setPosition(13F, 2F, -7F);

		box2 = new CustomModelRenderer(this, 126, 29, 256, 64);
		box2.addBox(0F, 0F, 0F, 48, 16, 16);
		box2.setPosition(-24F, 11F, -8F);

		box21 = new CustomModelRenderer(this, 85, 7, 256, 64);
		box21.addBox(0F, 0F, 0F, 2, 2, 14);
		box21.setPosition(22F, 2F, -7F);

		box22 = new CustomModelRenderer(this, 3, 27, 256, 64);
		box22.addBox(0F, 0F, 0F, 17, 5, 1);
		box22.setPosition(10F, 1F, -6F);

		box23 = new CustomModelRenderer(this, 96, 1, 256, 64);
		box23.addBox(0F, 0F, -2F, 3, 2, 2);
		box23.setPosition(17F, 11F, 10F);
		box23.rotateAngleX = -0.7853981633974483F;

		box24 = new CustomModelRenderer(this, 1, 1, 256, 64);
		box24.addBox(0F, 0F, 0F, 6, 6, 0);
		box24.setPosition(11F, 0F, -5F);

		box25 = new CustomModelRenderer(this, 1, 1, 256, 64);
		box25.addBox(0F, 0F, 0F, 6, 6, 0);
		box25.setPosition(20F, 0F, -5F);

		box26 = new CustomModelRenderer(this, 1, 1, 256, 64);
		box26.addBox(0F, 0F, 0F, 6, 6, 0);
		box26.setPosition(20F, 0F, 5F);

		box27 = new CustomModelRenderer(this, 1, 1, 256, 64);
		box27.addBox(0F, 0F, 0F, 6, 6, 0);
		box27.setPosition(11F, 0F, 5F);

		box28 = new CustomModelRenderer(this, 109, 2, 256, 64);
		box28.addBox(0F, 0F, 0F, 23, 2, 2);
		box28.setPosition(-30F, 6F, -1F);

		box29 = new CustomModelRenderer(this, 3, 37, 256, 64);
		box29.addBox(0F, -17F, 1F, 48, 17, 0);
		box29.setPosition(-24F, 27F, -9F);
		box29.rotateAngleX = -6.161012259539984F;

		box3 = new CustomModelRenderer(this, 85, 7, 256, 64);
		box3.addBox(0F, 0F, 0F, 2, 2, 14);
		box3.setPosition(-15F, 2F, -7F);

		box30 = new CustomModelRenderer(this, 40, 1, 256, 64);
		box30.addBox(0F, 0F, 0F, 1, 2, 10);
		box30.setPosition(-11F, 4F, -5F);

		box31 = new CustomModelRenderer(this, 40, 1, 256, 64);
		box31.addBox(0F, 0F, 0F, 1, 2, 10);
		box31.setPosition(-27F, 4F, -5F);

		box34 = new CustomModelRenderer(this, 96, 1, 256, 64);
		box34.addBox(0F, 0F, -2F, 3, 2, 2);
		box34.setPosition(20F, 11F, -10F);
		box34.rotateAngleX = -0.7853981633974483F;
		box34.rotateAngleY = -3.141592653589793F;

		box35 = new CustomModelRenderer(this, 3, 37, 256, 64);
		box35.addBox(0F, -17F, 1F, 48, 17, 0);
		box35.setPosition(24F, 27F, 9F);
		box35.rotateAngleX = -6.161012259539984F;
		box35.rotateAngleY = -3.141592653589793F;

		box36 = new CustomModelRenderer(this, 109, 2, 256, 64);
		box36.addBox(0F, 0F, 0F, 23, 2, 2);
		box36.setPosition(7F, 6F, -1F);

		box37 = new CustomModelRenderer(this, 108, 7, 256, 64);
		box37.addBox(0F, 0F, 0F, 16, 1, 2);
		box37.setPosition(-8F, 6F, -1F);

		box5 = new CustomModelRenderer(this, 9, 0, 256, 64);
		box5.addBox(0F, 0F, 0F, 3, 2, 22);
		box5.setPosition(-20F, 9F, -11F);

		box6 = new CustomModelRenderer(this, 96, 1, 256, 64);
		box6.addBox(0F, 0F, -2F, 3, 2, 2);
		box6.setPosition(-17F, 11F, -10F);
		box6.rotateAngleX = -0.7853981633974483F;
		box6.rotateAngleY = -3.141592653589793F;

		box63 = new CustomModelRenderer(this, 1, 1, 256, 64);
		box63.addBox(0F, 0F, 0F, 6, 6, 0);
		box63.setPosition(-17F, 0F, -5F);

		box7 = new CustomModelRenderer(this, 1, 1, 256, 64);
		box7.addBox(0F, 0F, 0F, 6, 6, 0);
		box7.setPosition(-26F, 0F, -5F);

		box8 = new CustomModelRenderer(this, 96, 1, 256, 64);
		box8.addBox(0F, 0F, -2F, 3, 2, 2);
		box8.setPosition(-20F, 11F, 10F);
		box8.rotateAngleX = -0.7853981633974483F;

		box9 = new CustomModelRenderer(this, 107, 12, 256, 64);
		box9.addBox(0F, 0F, 0F, 19, 3, 4);
		box9.setPosition(-28F, 6F, -2F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		box.render(f5);
		box0.render(f5);
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
		box21.render(f5);
		box22.render(f5);
		box23.render(f5);
		box24.render(f5);
		box25.render(f5);
		box26.render(f5);
		box27.render(f5);
		box28.render(f5);
		box3.render(f5);
		box30.render(f5);
		box31.render(f5);
		box34.render(f5);
		box36.render(f5);
		box37.render(f5);
		box5.render(f5);
		box6.render(f5);
		box63.render(f5);
		box7.render(f5);
		box8.render(f5);
		box9.render(f5);
		
		int cargo = ((Freight) entity).getAmmountOfCargo();
		if (cargo != 0) {
			box35.render(f5);
			box29.render(f5);
			box2.render(f5);
			box1.render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {}
}
