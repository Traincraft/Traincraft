package train.client.render.models;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import tmt.ModelBase;
import train.client.render.CustomModelRenderer;

public class ModelVL10 extends ModelBase {
	
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
	public CustomModelRenderer box38;
	public CustomModelRenderer box4;
	public CustomModelRenderer box5;
	public CustomModelRenderer box6;
	public CustomModelRenderer box7;
	public CustomModelRenderer box8;
	public CustomModelRenderer box9;

	public ModelVL10() {
		box = new CustomModelRenderer(this, 102, 177, 256, 256);
		box.addBox(0F, 0F, 0F, 48, 2, 18);
		box.setPosition(-24F, 9F, -9F);

		box0 = new CustomModelRenderer(this, 2, 246, 256, 256);
		box0.addBox(0F, 0F, 0F, 50, 7, 1);
		box0.setPosition(-25F, 6F, -10F);

		box1 = new CustomModelRenderer(this, 2, 246, 256, 256);
		box1.addBox(0F, 0F, 0F, 50, 7, 1);
		box1.setPosition(-25F, 6F, 9F);

		box10 = new CustomModelRenderer(this, 42, 190, 256, 256);
		box10.addBox(0F, 0F, 0F, 6, 7, 1);
		box10.setPosition(-19F, 21F, -9F);

		box11 = new CustomModelRenderer(this, 14, 206, 256, 256);
		box11.addBox(0F, 0F, 0F, 38, 15, 1);
		box11.setPosition(-13F, 13F, -10F);

		box12 = new CustomModelRenderer(this, 2, 41, 256, 256);
		box12.addBox(0F, 0F, 0F, 60, 3, 4);
		box12.setPosition(-30F, 6F, -2F);

		box13 = new CustomModelRenderer(this, 42, 190, 256, 256);
		box13.addBox(0F, 0F, 0F, 6, 7, 1);
		box13.setPosition(-19F, 21F, 8F);

		box14 = new CustomModelRenderer(this, 14, 206, 256, 256);
		box14.addBox(0F, 0F, 0F, 38, 15, 1);
		box14.setPosition(-13F, 13F, 9F);

		box15 = new CustomModelRenderer(this, 109, 239, 256, 256);
		box15.addBox(0F, 0F, 0F, 1, 8, 2);
		box15.setPosition(-24F, 13F, -10F);
		box15.rotateAngleY = -1.0995574287564276F;

		box16 = new CustomModelRenderer(this, 118, 239, 256, 256);
		box16.addBox(0F, 0F, 0F, 1, 8, 2);
		box16.setPosition(-24F, 21F, 10F);
		box16.rotateAngleX = -3.141592653589793F;
		box16.rotateAngleY = -5.183627878423159F;

		box17 = new CustomModelRenderer(this, 7, 68, 256, 256);
		box17.addBox(0F, 0F, 0F, 1, 22, 18);
		box17.setPosition(24F, 6F, -9F);

		box18 = new CustomModelRenderer(this, 110, 150, 256, 256);
		box18.addBox(0F, 0F, 0F, 38, 2, 20);
		box18.setPosition(-13F, 28F, -10F);

		box19 = new CustomModelRenderer(this, 209, 86, 256, 256);
		box19.addBox(0F, 0F, 0F, 5, 8, 16);
		box19.setPosition(-26F, 1F, -8F);
		box19.rotateAngleZ = -0.08726646259971647F;

		box2 = new CustomModelRenderer(this, 133, 207, 256, 256);
		box2.addBox(0F, 0F, 0F, 46, 9, 14);
		box2.setPosition(-23F, 0F, -7F);

		box20 = new CustomModelRenderer(this, 4, 72, 256, 256);
		box20.addBox(0F, 0F, 0F, 2, 2, 3);
		box20.setPosition(-27F, 16F, 4F);

		box21 = new CustomModelRenderer(this, 59, 85, 256, 256);
		box21.addBox(0F, 0F, 0F, 8, 12, 22);
		box21.setPosition(8F, 15F, -11F);

		box22 = new CustomModelRenderer(this, 6, 65, 256, 256);
		box22.addBox(0F, 0F, 0F, 2, 1, 1);
		box22.setPosition(-27F, 16F, 3F);

		box23 = new CustomModelRenderer(this, 4, 72, 256, 256);
		box23.addBox(0F, 0F, 0F, 2, 2, 3);
		box23.setPosition(-27F, 16F, -7F);

		box24 = new CustomModelRenderer(this, 0, 18, 256, 256);
		box24.addBox(0F, 0F, 0F, 48, 6, 10);
		box24.setPosition(-24F, 3F, -5F);

		box25 = new CustomModelRenderer(this, 100, 74, 256, 256);
		box25.addBox(0F, 0F, 0F, 46, 9, 12);
		box25.setPosition(-23F, 0F, -6F);

		box26 = new CustomModelRenderer(this, 6, 65, 256, 256);
		box26.addBox(0F, 0F, 0F, 2, 1, 1);
		box26.setPosition(-27F, 16F, -4F);

		box27 = new CustomModelRenderer(this, 110, 131, 256, 256);
		box27.addBox(0F, 0F, 0F, 46, 3, 12);
		box27.setPosition(-22F, 29F, -6F);

		box28 = new CustomModelRenderer(this, 65, 190, 256, 256);
		box28.addBox(0F, 0F, 0F, 3, 1, 1);
		box28.setPosition(-22F, 27F, -9F);

		box29 = new CustomModelRenderer(this, 65, 190, 256, 256);
		box29.addBox(0F, 0F, 0F, 3, 1, 1);
		box29.setPosition(-22F, 27F, 8F);

		box3 = new CustomModelRenderer(this, 214, 28, 256, 256);
		box3.addBox(0F, 0F, 0F, 1, 7, 20);
		box3.setPosition(-26F, 6F, -10F);

		box30 = new CustomModelRenderer(this, 7, 25, 256, 256);
		box30.addBox(0F, 0F, 0F, 33, 17, 12);
		box30.setPosition(-10F, 11F, -6F);

		box31 = new CustomModelRenderer(this, 56, 28, 256, 256);
		box31.addBox(0F, 0F, 0F, 10, 7, 16);
		box31.setPosition(-5F, 2F, -8F);

		box32 = new CustomModelRenderer(this, 140, 107, 256, 256);
		box32.addBox(0F, 0F, 0F, 10, 1, 18);
		box32.setPosition(-23F, 28F, -9F);

		box33 = new CustomModelRenderer(this, 24, 26, 256, 256);
		box33.addBox(0F, 0F, 0F, 3, 16, 10);
		box33.setPosition(25F, 10F, -5F);

		box34 = new CustomModelRenderer(this, 11, 78, 256, 256);
		box34.addBox(0F, 0F, 0F, 3, 4, 4);
		box34.setPosition(-24F, 29F, -2F);

		box35 = new CustomModelRenderer(this, 2, 110, 256, 256);
		box35.addBox(0F, 0F, 0F, 14, 5, 10);
		box35.setPosition(9F, 32F, -5F);

		box36 = new CustomModelRenderer(this, 6, 125, 256, 256);
		box36.addBox(0F, 0F, 0F, 10, 4, 10);
		box36.setPosition(-10F, 33F, -5F);

		box37 = new CustomModelRenderer(this, 69, 29, 256, 256);
		box37.addBox(0F, 0F, 0F, 12, 1, 12);
		box37.setPosition(-11F, 32F, -6F);

		box38 = new CustomModelRenderer(this, 59, 85, 256, 256);
		box38.addBox(0F, 0F, 0F, 8, 12, 22);
		box38.setPosition(-1F, 15F, -11F);

		box4 = new CustomModelRenderer(this, 65, 190, 256, 256);
		box4.addBox(0F, 0F, 0F, 5, 1, 1);
		box4.setPosition(-24F, 21F, 8F);

		box5 = new CustomModelRenderer(this, 65, 190, 256, 256);
		box5.addBox(0F, 0F, 0F, 5, 1, 1);
		box5.setPosition(-24F, 21F, -9F);

		box6 = new CustomModelRenderer(this, 216, 57, 256, 256);
		box6.addBox(0F, 0F, 0F, 1, 8, 18);
		box6.setPosition(-26F, 13F, -9F);

		box7 = new CustomModelRenderer(this, 3, 231, 256, 256);
		box7.addBox(0F, 0F, 0F, 11, 8, 1);
		box7.setPosition(-24F, 13F, -10F);

		box8 = new CustomModelRenderer(this, 218, 0, 256, 256);
		box8.addBox(0F, 0F, 0F, 1, 8, 18);
		box8.setPosition(-25F, 21F, -9F);
		box8.rotateAngleZ = -0.3490658503988659F;

		box9 = new CustomModelRenderer(this, 3, 231, 256, 256);
		box9.addBox(0F, 0F, 0F, 11, 8, 1);
		box9.setPosition(-24F, 13F, 9F);
	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
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
		box21.render(f5);
		box24.render(f5);
		box25.render(f5);
		box27.render(f5);
		box28.render(f5);
		box29.render(f5);
		box3.render(f5);
		box30.render(f5);
		box31.render(f5);
		box32.render(f5);
		box33.render(f5);
		box35.render(f5);
		box36.render(f5);
		box37.render(f5);
		box38.render(f5);
		box4.render(f5);
		box5.render(f5);
		box6.render(f5);
		box7.render(f5);
		box8.render(f5);
		box9.render(f5);
		
		Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
		box34.render(f5);
		box26.render(f5);
		box22.render(f5);
		box23.render(f5);
		box20.render(f5);
		Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {}
}