package train.client.render.models;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import tmt.ModelBase;
import train.client.render.CustomModelRenderer;

public class ModelLocoMinetrain extends ModelBase {
	
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
	public CustomModelRenderer box2;
	public CustomModelRenderer box20;
	public CustomModelRenderer box21;
	public CustomModelRenderer box23;
	public CustomModelRenderer box24;
	public CustomModelRenderer box25;
	public CustomModelRenderer box3;
	public CustomModelRenderer box4;
	public CustomModelRenderer box5;
	public CustomModelRenderer box6;
	public CustomModelRenderer box7;
	public CustomModelRenderer box8;
	public CustomModelRenderer box9;

	public ModelLocoMinetrain() {
		box = new CustomModelRenderer(this, 0, 38, 64, 64);
		box.addBox(0F, 0F, 0F, 2, 3, 4);
		box.setPosition(-12F, 2F, -2F);

		box0 = new CustomModelRenderer(this, 0, 0, 64, 64);
		box0.addBox(0F, 0F, 0F, 16, 6, 1);
		box0.setPosition(-11F, 17F, -6F);
		box0.rotateAngleX = -4.886921905584122F;

		box1 = new CustomModelRenderer(this, 0, 57, 64, 64);
		box1.addBox(0F, 0F, 0F, 6, 6, 1);
		box1.setPosition(7F, 0F, -4F);
		box1.rotateAngleY = -3.141592653589793F;

		box10 = new CustomModelRenderer(this, 0, 13, 64, 64);
		box10.addBox(0F, 0F, 0F, 4, 3, 2);
		box10.setPosition(-10F, 17F, -1F);

		box11 = new CustomModelRenderer(this, 24, 1, 64, 64);
		box11.addBox(0F, 0F, 0F, 10, 4, 10);
		box11.setPosition(7F, 2F, -5F);

		box12 = new CustomModelRenderer(this, 0, 38, 64, 64);
		box12.addBox(0F, 0F, 0F, 2, 3, 4);
		box12.setPosition(17F, 2F, -2F);

		box13 = new CustomModelRenderer(this, 44, 30, 64, 64);
		box13.addBox(0F, 0F, 0F, 2, 6, 8);
		box13.setPosition(5F, 7F, -4F);

		box14 = new CustomModelRenderer(this, 0, 19, 64, 64);
		box14.addBox(0F, 0F, 0F, 4, 6, 8);
		box14.setPosition(12F, 6F, -4F);

		box15 = new CustomModelRenderer(this, 0, 34, 64, 64);
		box15.addBox(0F, 0F, 0F, 16, 10, 12);
		box15.setPosition(-11F, 7F, -6F);

		box16 = new CustomModelRenderer(this, 27, 26, 64, 64);
		box16.addBox(0F, 0F, 0F, 2, 4, 4);
		box16.setPosition(5F, 13F, -2F);

		box2 = new CustomModelRenderer(this, 0, 57, 64, 64);
		box2.addBox(0F, 0F, 0F, 6, 6, 1);
		box2.setPosition(-2F, 0F, 5F);
		box2.rotateAngleY = -3.141592653589793F;

		box20 = new CustomModelRenderer(this, 0, 57, 64, 64);
		box20.addBox(0F, 0F, 0F, 6, 6, 1);
		box20.setPosition(-2F, 0F, -4F);
		box20.rotateAngleY = -3.141592653589793F;

		box21 = new CustomModelRenderer(this, 0, 57, 64, 64);
		box21.addBox(0F, 0F, 0F, 6, 6, 1);
		box21.setPosition(7F, 0F, 5F);
		box21.rotateAngleY = -3.141592653589793F;

		box23 = new CustomModelRenderer(this, 25, 16, 64, 64);
		box23.addBox(0F, 0F, 0F, 2, 2, 8);
		box23.setPosition(-6F, 2F, -4F);

		box24 = new CustomModelRenderer(this, 12, 10, 64, 64);
		box24.addBox(0F, 0F, 0F, 2, 4, 4);
		box24.setPosition(5F, 3F, -2F);

		box25 = new CustomModelRenderer(this, 50, 52, 64, 64);
		box25.addBox(0F, 0F, 0F, 1, 6, 6);
		box25.setPosition(-10F, 1F, -3F);

		box3 = new CustomModelRenderer(this, 15, 57, 64, 64);
		box3.addBox(0F, 0F, 0F, 16, 6, 1);
		box3.setPosition(-9F, 1F, -3F);

		box4 = new CustomModelRenderer(this, 15, 57, 64, 64);
		box4.addBox(0F, 0F, 0F, 16, 6, 1);
		box4.setPosition(-9F, 1F, 2F);

		box5 = new CustomModelRenderer(this, 0, 0, 64, 64);
		box5.addBox(0F, 0F, 0F, 16, 6, 1);
		box5.setPosition(5F, 17F, 6F);
		box5.rotateAngleX = -4.886921905584122F;
		box5.rotateAngleY = -3.141592653589793F;

		box6 = new CustomModelRenderer(this, 59, 45, 64, 64);
		box6.addBox(0F, 0F, 0F, 1, 11, 1);
		box6.setPosition(16F, 6F, -5F);

		box7 = new CustomModelRenderer(this, 59, 45, 64, 64);
		box7.addBox(0F, 0F, 0F, 1, 11, 1);
		box7.setPosition(16F, 6F, 4F);

		box8 = new CustomModelRenderer(this, 40, 18, 64, 64);
		box8.addBox(0F, 0F, 0F, 1, 1, 10);
		box8.setPosition(16F, 17F, -5F);

		box9 = new CustomModelRenderer(this, 25, 16, 64, 64);
		box9.addBox(0F, 0F, 0F, 2, 2, 8);
		box9.setPosition(3F, 2F, -4F);
	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		box.render(f5);
		box0.render(f5);
		box1.render(f5);
		box11.render(f5);
		box12.render(f5);
		box13.render(f5);
		box14.render(f5);
		box15.render(f5);
		box16.render(f5);
		box2.render(f5);
		box20.render(f5);
		box21.render(f5);
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
		
		Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
		box10.render(f5);
		Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {}
}