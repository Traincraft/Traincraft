package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import train.client.render.CustomModelRenderer;
import train.common.core.handlers.ConfigHandler;

public class ModelTankWagon2 extends ModelBase {

	public ModelTankWagon2() {

		// constructor:
		box = new CustomModelRenderer(this, 1, 24, 128, 128);
		box.addBox(0F, 0F, 0F, 9, 4, 18);
		box.setPosition(-5F, 1F, -9F);
		box0 = new CustomModelRenderer(this, 2, 66, 128, 128);
		box0.addBox(0F, 0F, 0F, 6, 6, 1);
		box0.setPosition(-20F, -1F, -7F);
		box1 = new CustomModelRenderer(this, 2, 66, 128, 128);
		box1.addBox(0F, 0F, 0F, 6, 6, 1);
		box1.setPosition(-13F, -1F, -7F);
		box10 = new CustomModelRenderer(this, 18, 48, 128, 128);
		box10.addBox(0F, 0F, 0F, 39, 6, 14);
		box10.setPosition(-20F, 11F, -7F);
		box11 = new CustomModelRenderer(this, 18, 48, 128, 128);
		box11.addBox(0F, 0F, 0F, 39, 6, 14);
		box11.setPosition(-20F, 7F, -3F);
		box11.rotateAngleX = -0.7853981633974483F;
		box12 = new CustomModelRenderer(this, 18, 48, 128, 128);
		box12.addBox(0F, 0F, 0F, 39, 6, 14);
		box12.setPosition(-20F, 17F, -7F);
		box12.rotateAngleX = -5.497787143782138F;
		box13 = new CustomModelRenderer(this, 18, 48, 128, 128);
		box13.addBox(0F, 0F, 0F, 39, 6, 14);
		box13.setPosition(-20F, 7F, 3F);
		box13.rotateAngleX = -1.5707963267948966F;
		box14 = new CustomModelRenderer(this, 68, 86, 128, 128);
		box14.addBox(0F, 0F, 0F, 2, 2, 14);
		box14.setPosition(4F, 7F, -7F);
		box15 = new CustomModelRenderer(this, 1, 96, 128, 128);
		box15.addBox(0F, 0F, 0F, 15, 4, 12);
		box15.setPosition(-21F, 1F, -6F);
		box16 = new CustomModelRenderer(this, 3, 118, 128, 128);
		box16.addBox(0F, 0F, 0F, 9, 2, 1);
		box16.setPosition(-18F, 1F, -8F);
		box17 = new CustomModelRenderer(this, 3, 118, 128, 128);
		box17.addBox(0F, 0F, 0F, 9, 2, 1);
		box17.setPosition(-18F, 1F, 7F);
		box18 = new CustomModelRenderer(this, 3, 118, 128, 128);
		box18.addBox(0F, 0F, 0F, 9, 2, 1);
		box18.setPosition(8F, 1F, 7F);
		box19 = new CustomModelRenderer(this, 3, 118, 128, 128);
		box19.addBox(0F, 0F, 0F, 9, 2, 1);
		box19.setPosition(8F, 1F, -8F);
		box2 = new CustomModelRenderer(this, 2, 66, 128, 128);
		box2.addBox(0F, 0F, 0F, 6, 6, 1);
		box2.setPosition(-13F, -1F, 6F);
		box20 = new CustomModelRenderer(this, 68, 86, 128, 128);
		box20.addBox(0F, 0F, 0F, 2, 2, 14);
		box20.setPosition(16F, 7F, -7F);
		box21 = new CustomModelRenderer(this, 7, 77, 128, 128);
		box21.addBox(0F, 0F, 0F, 3, 2, 2);
		box21.setPosition(20F, 2F, -1F);
		box22 = new CustomModelRenderer(this, 68, 86, 128, 128);
		box22.addBox(0F, 0F, 0F, 2, 2, 14);
		box22.setPosition(-7F, 7F, -7F);
		box23 = new CustomModelRenderer(this, 68, 86, 128, 128);
		box23.addBox(0F, 0F, 0F, 2, 2, 14);
		box23.setPosition(-19F, 7F, -7F);
		box24 = new CustomModelRenderer(this, 108, 6, 128, 128);
		box24.addBox(0F, 0F, 0F, 8, 8, 1);
		box24.setPosition(7F, 7F, 7F);
		box25 = new CustomModelRenderer(this, 7, 77, 128, 128);
		box25.addBox(0F, 0F, 0F, 3, 2, 2);
		box25.setPosition(-24F, 2F, -1F);
		box26 = new CustomModelRenderer(this, 106, 24, 128, 128);
		box26.addBox(0F, 0F, 0F, 3, 5, 8);
		box26.setPosition(-2F, 20F, -4F);
		box27 = new CustomModelRenderer(this, 112, 31, 128, 128);
		box27.addBox(0F, 0F, 0F, 3, 5, 1);
		box27.setPosition(1F, 20F, -4F);
		box27.rotateAngleY = -0.7853981633974483F;
		box28 = new CustomModelRenderer(this, 112, 31, 128, 128);
		box28.addBox(0F, 0F, -1F, 3, 5, 1);
		box28.setPosition(-2F, 20F, -4F);
		box28.rotateAngleY = -2.356194490192345F;
		box29 = new CustomModelRenderer(this, 106, 25, 128, 128);
		box29.addBox(0F, 0F, 0F, 4, 5, 7);
		box29.setPosition(3F, 20F, -2F);
		box29.rotateAngleY = -1.5707963267948966F;
		box3 = new CustomModelRenderer(this, 2, 66, 128, 128);
		box3.addBox(0F, 0F, 0F, 6, 6, 1);
		box3.setPosition(-20F, -1F, 6F);
		box30 = new CustomModelRenderer(this, 108, 6, 128, 128);
		box30.addBox(0F, 0F, 0F, 8, 8, 1);
		box30.setPosition(-16F, 7F, -8F);
		box31 = new CustomModelRenderer(this, 112, 31, 128, 128);
		box31.addBox(0F, 0F, -1F, 3, 5, 1);
		box31.setPosition(-4F, 20F, 2F);
		box31.rotateAngleY = -0.7853981633974483F;
		box33 = new CustomModelRenderer(this, 112, 31, 128, 128);
		box33.addBox(0F, 0F, 0F, 3, 5, 1);
		box33.setPosition(3F, 20F, 2F);
		box33.rotateAngleY = -2.356194490192345F;
		box4 = new CustomModelRenderer(this, 2, 66, 128, 128);
		box4.addBox(0F, 0F, 0F, 6, 6, 1);
		box4.setPosition(13F, -1F, -7F);
		box5 = new CustomModelRenderer(this, 2, 66, 128, 128);
		box5.addBox(0F, 0F, 0F, 6, 6, 1);
		box5.setPosition(6F, -1F, -7F);
		box6 = new CustomModelRenderer(this, 2, 66, 128, 128);
		box6.addBox(0F, 0F, 0F, 6, 6, 1);
		box6.setPosition(6F, -1F, 6F);
		box7 = new CustomModelRenderer(this, 2, 66, 128, 128);
		box7.addBox(0F, 0F, 0F, 6, 6, 1);
		box7.setPosition(13F, -1F, 6F);
		box8 = new CustomModelRenderer(this, 1, 96, 128, 128);
		box8.addBox(0F, 0F, 0F, 15, 4, 12);
		box8.setPosition(5F, 1F, -6F);
		box9 = new CustomModelRenderer(this, 0, 1, 128, 128);
		box9.addBox(0F, 0F, 0F, 43, 2, 20);
		box9.setPosition(-22F, 5F, -10F);
		// render:

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
		box33.render(f5);
		box4.render(f5);
		box5.render(f5);
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
	public CustomModelRenderer box33;
	public CustomModelRenderer box4;
	public CustomModelRenderer box5;
	public CustomModelRenderer box6;
	public CustomModelRenderer box7;
	public CustomModelRenderer box8;
	public CustomModelRenderer box9;

}
