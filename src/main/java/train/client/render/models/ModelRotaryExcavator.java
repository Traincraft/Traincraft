package train.client.render.models;

import net.minecraft.entity.Entity;
import tmt.ModelBase;
import train.client.render.CustomModelRenderer;
import train.common.core.handlers.ConfigHandler;
import train.common.entity.digger.EntityRotativeDigger;

public class ModelRotaryExcavator extends ModelBase {

	public ModelRotaryExcavator() {
		box8 = new CustomModelRenderer(this, 358, 124, 512, 256);
		box3 = new CustomModelRenderer(this, 102, 65, 512, 256);
		box29 = new CustomModelRenderer(this, 259, 237, 512, 256);
		box11 = new CustomModelRenderer(this, 259, 237, 512, 256);
		box = new CustomModelRenderer(this, 150, 47, 512, 256);
		box35 = new CustomModelRenderer(this, 400, 14, 512, 256);
		box15 = new CustomModelRenderer(this, 3, 8, 512, 256);
		box19 = new CustomModelRenderer(this, 259, 237, 512, 256);
		box23 = new CustomModelRenderer(this, 223, 191, 512, 256);
		box26 = new CustomModelRenderer(this, 259, 237, 512, 256);
		box21 = new CustomModelRenderer(this, 150, 47, 512, 256);
		box2 = new CustomModelRenderer(this, 202, 65, 512, 256);
		box14 = new CustomModelRenderer(this, 17, 41, 512, 256);
		box25 = new CustomModelRenderer(this, 259, 237, 512, 256);
		box28 = new CustomModelRenderer(this, 259, 237, 512, 256);
		box7 = new CustomModelRenderer(this, 223, 191, 512, 256);
		box34 = new CustomModelRenderer(this, 400, 14, 512, 256);
		box27 = new CustomModelRenderer(this, 259, 237, 512, 256);
		box13 = new CustomModelRenderer(this, 259, 237, 512, 256);
		box20 = new CustomModelRenderer(this, 100, 11, 512, 256);
		box32 = new CustomModelRenderer(this, 432, 225, 512, 256);
		box18 = new CustomModelRenderer(this, 78, 167, 512, 256);
		box4 = new CustomModelRenderer(this, 197, 19, 512, 256);
		box22 = new CustomModelRenderer(this, 259, 237, 512, 256);
		box16 = new CustomModelRenderer(this, 29, 21, 512, 256);
		box30 = new CustomModelRenderer(this, 259, 237, 512, 256);
		box6 = new CustomModelRenderer(this, 30, 168, 512, 256);
		box10 = new CustomModelRenderer(this, 223, 191, 512, 256);
		box12 = new CustomModelRenderer(this, 259, 237, 512, 256);
		box9 = new CustomModelRenderer(this, 426, 14, 512, 256);
		box31 = new CustomModelRenderer(this, 357, 124, 512, 256);
		box5 = new CustomModelRenderer(this, 169, 111, 512, 256);
		box24 = new CustomModelRenderer(this, 223, 191, 512, 256);
		box17 = new CustomModelRenderer(this, 78, 167, 512, 256);
		box1 = new CustomModelRenderer(this, 110, 111, 512, 256);
		box33 = new CustomModelRenderer(this, 426, 14, 512, 256);
		box0 = new CustomModelRenderer(this, 259, 237, 512, 256);
		box8.addBox(0F, 0F, -49F, 4, 5, 49);
		box8.setPosition(-2F, 35F, -12F);
		box3.addBox(0F, 0F, 0F, 19, 38, 1);
		box3.setPosition(-9F, -2F, 11F);
		box29.addBox(0F, 0F, 0F, 12, 1, 5);
		box29.setPosition(14F, -6F, -24F);
		box11.addBox(0F, 0F, 0F, 12, 1, 5);
		box11.setPosition(14F, -3F, 21F);
		box.addBox(0F, 0F, 0F, 1, 34, 23);
		box.setPosition(9F, 0F, -12F);
		box35.addBox(0F, 40F, -65F, 1, 17, 22);
		box35.setPosition(1F, 35F, -12F);
		box15.addBox(0F, 0F, 0F, 5, 19, 5);
		box15.setPosition(-2F, 23F, 19F);
		box19.addBox(0F, 0F, 0F, 12, 1, 5);
		box19.setPosition(-25F, -10F, 24F);
		box23.addBox(0F, 0F, 0F, 12, 1, 41);
		box23.setPosition(-25F, -3F, -19F);
		box26.addBox(0F, 0F, 0F, 12, 1, 5);
		box26.setPosition(-25F, -6F, -24F);
		box21.addBox(0F, 0F, 0F, 1, 34, 23);
		box21.setPosition(-9F, 0F, -12F);
		box2.addBox(0F, 0F, 0F, 19, 38, 1);
		box2.setPosition(-9F, -2F, -13F);
		box14.addBox(0F, 0F, 0F, 14, 25, 16);
		box14.setPosition(-6F, -2F, 13F);
		box25.addBox(0F, 0F, 0F, 12, 1, 5);
		box25.setPosition(-25F, -2F, -20F);
		box28.addBox(0F, 0F, 0F, 12, 1, 5);
		box28.setPosition(14F, -2F, -20F);
		box7.addBox(0F, 0F, 0F, 12, 1, 41);
		box7.setPosition(14F, -3F, -19F);
		box34.addBox(0F, 40F, -65F, 1, 17, 22);
		box34.setPosition(-2F, 35F, -12F);
		box27.addBox(0F, 0F, 0F, 12, 1, 5);
		box27.setPosition(-25F, -11F, -24F);
		box13.addBox(0F, 0F, 0F, 12, 1, 5);
		box13.setPosition(14F, -6F, 24F);
		box20.addBox(0F, 0F, 0F, 19, 2, 23);
		box20.setPosition(-9F, -2F, -12F);
		box32.addBox(0F, 0F, 0F, 14, 4, 25);
		box32.setPosition(-6F, 36F, -13F);
		box18.addBox(0F, 0F, 0F, 9, 14, 47);
		box18.setPosition(-23F, -15F, -23F);
		box4.addBox(0F, 0F, 0F, 15, 9, 6);
		box4.setPosition(-7F, 0F, -12F);
		box22.addBox(0F, 0F, 0F, 12, 1, 5);
		box22.setPosition(-25F, -3F, 21F);
		box16.addBox(0F, 0F, 0F, 9, 2, 9);
		box16.setPosition(-4F, 42F, 17F);
		box30.addBox(0F, 0F, 0F, 12, 1, 5);
		box30.setPosition(14F, -11F, -24F);
		box6.addBox(0F, 0F, 0F, 25, 4, 16);
		box6.setPosition(-12F, -11F, -8F);
		box10.addBox(0F, 0F, 0F, 12, 1, 41);
		box10.setPosition(14F, -14F, -20F);
		box12.addBox(0F, 0F, 0F, 12, 1, 5);
		box12.setPosition(14F, -10F, 24F);
		box9.addBox(0F, 40F, -65F, 1, 17, 22);
		box9.setPosition(-2F, 35F, -12F);
		box31.addBox(0F, 44F, -48F, 4, 5, 49);
		box31.setPosition(-2F, 35F, -12F);
		box5.addBox(0F, 0F, 0F, 14, 5, 43);
		box5.setPosition(-6F, -7F, -14F);
		box24.addBox(0F, 0F, 0F, 12, 1, 41);
		box24.setPosition(-25F, -14F, -20F);
		box17.addBox(0F, 0F, 0F, 9, 14, 47);
		box17.setPosition(15F, -15F, -23F);
		box1.addBox(0F, 0F, 0F, 19, 2, 23);
		box1.setPosition(-9F, 34F, -12F);
		box33.addBox(0F, 40F, -66F, 1, 17, 22);
		box33.setPosition(1F, 35F, -12F);
		box0.addBox(0F, 0F, 0F, 12, 1, 5);
		box0.setPosition(-25F, -6F, 24F);

		box8.rotateAngleX = -5.6374134839416845F;
		box29.rotateAngleX = -4.71238898038469F;
		box11.rotateAngleX = -5.462880558742252F;
		box35.rotateAngleX = -0.9773843811168246F;
		box19.rotateAngleX = -3.8746309394274117F;
		box26.rotateAngleX = -4.71238898038469F;
		box25.rotateAngleX = -3.8920842319473548F;
		box28.rotateAngleX = -3.8920842319473548F;
		box34.rotateAngleX = -0.9773843811168246F;
		box27.rotateAngleX = -5.550147021341968F;
		box13.rotateAngleX = -4.71238898038469F;
		box22.rotateAngleX = -5.462880558742252F;
		box30.rotateAngleX = -5.550147021341968F;
		box12.rotateAngleX = -3.8746309394274117F;
		box9.rotateAngleX = -0.9773843811168246F;
		box31.rotateAngleX = -0.9424777960769379F;
		box33.rotateAngleX = -0.9773843811168246F;
		box0.rotateAngleX = -4.71238898038469F;
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		if (ConfigHandler.FLICKERING) {
			super.render(entity, f, f1, f2, f3, f4, f5);
		}
		//if (((EntityRotativeDigger) entity).getFuel() > 0) {//should only dig when rotative digger has fuel and dig mode is on, doesn't work yet
		/**
		 * Pitch
		 */
		float pitch = (float) Math.toRadians(((EntityRotativeDigger) entity).pitch);

		if (pitch > ((EntityRotativeDigger) entity).pitchLimits)
			pitch = ((EntityRotativeDigger) entity).pitchLimits;
		if (pitch < -((EntityRotativeDigger) entity).pitchLimits)
			pitch = -((EntityRotativeDigger) entity).pitchLimits;

		box8.rotateAngleX = -pitch - 5.6374134839416845F;
		box31.rotateAngleX = -pitch - 0.9424777960769379F;
		box9.rotateAngleX = -pitch - 0.9773843811168246F;
		box33.rotateAngleX = -pitch - 0.9773843811168246F;
		box34.rotateAngleX = -pitch - 0.9773843811168246F;
		box35.rotateAngleX = -pitch - 0.9773843811168246F;
		//}

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
		box4.render(f5);
		box5.render(f5);
		box6.render(f5);
		box7.render(f5);
		box8.render(f5);
		box9.render(f5);
		box31.render(f5);
		box33.render(f5);
		box34.render(f5);
		box35.render(f5);
		box32.render(f5);
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
	public CustomModelRenderer box4;
	public CustomModelRenderer box5;
	public CustomModelRenderer box6;
	public CustomModelRenderer box7;
	public CustomModelRenderer box8;
	public CustomModelRenderer box9;
	public CustomModelRenderer box31;
	public CustomModelRenderer box32;
	public CustomModelRenderer box33;
	public CustomModelRenderer box34;
	public CustomModelRenderer box35;

}
