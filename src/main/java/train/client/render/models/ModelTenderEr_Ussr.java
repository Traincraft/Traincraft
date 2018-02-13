package train.client.render.models;

import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import train.client.render.CustomModelRenderer;
import train.common.api.Freight;

public class ModelTenderEr_Ussr extends ModelBase {
	
	public CustomModelRenderer body;
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
	public CustomModelRenderer box39;
	public CustomModelRenderer box4;
	public CustomModelRenderer box42;
	public CustomModelRenderer box5;
	public CustomModelRenderer box50;
	public CustomModelRenderer box6;
	public CustomModelRenderer box64;
	public CustomModelRenderer box7;
	public CustomModelRenderer box8;
	public CustomModelRenderer box9;

	public ModelTenderEr_Ussr() {
		body = new CustomModelRenderer(this, 140, 0, 256, 128);
		body.addBox(0F, 0F, 0F, 36, 12, 22);
		body.setPosition(-19F, 9F, -11F);

		box = new CustomModelRenderer(this, 179, 112, 256, 128);
		box.addBox(0F, 0F, 0F, 36, 5, 0);
		box.setPosition(-19F, 21F, -11F);

		box0 = new CustomModelRenderer(this, 41, 91, 256, 128);
		box0.addBox(0F, 0F, 0F, 1, 3, 16);
		box0.setPosition(23F, 5F, -8F);

		box1 = new CustomModelRenderer(this, 97, 10, 256, 128);
		box1.addBox(0F, 0F, 0F, 1, 25, 20);
		box1.setPosition(17F, 9F, -10F);

		box10 = new CustomModelRenderer(this, 80, 76, 256, 128);
		box10.addBox(0F, 0F, -5F, 8, 1, 5);
		box10.setPosition(24F, 35F, -4F);
		box10.rotateAngleX = -2.949606435870417F;
		box10.rotateAngleY = -3.141592653589793F;

		box11 = new CustomModelRenderer(this, 29, 21, 256, 128);
		box11.addBox(0F, 0F, 0F, 7, 22, 1);
		box11.setPosition(17F, 9F, 10F);

		box12 = new CustomModelRenderer(this, 54, 3, 256, 128);
		box12.addBox(0F, 0F, 0F, 0, 20, 20);
		box12.setPosition(24F, 14F, -10F);

		box13 = new CustomModelRenderer(this, 60, 74, 256, 128);
		box13.addBox(0F, 0F, 0F, 3, 2, 3);
		box13.setPosition(-17F, 21F, -7F);

		box14 = new CustomModelRenderer(this, 89, 70, 256, 128);
		box14.addBox(0F, 0F, 0F, 0, 5, 22);
		box14.setPosition(-19F, 21F, -11F);

		box15 = new CustomModelRenderer(this, 192, 118, 256, 128);
		box15.addBox(0F, 0F, 0F, 28, 8, 1);
		box15.setPosition(-11F, 21F, -9F);

		box16 = new CustomModelRenderer(this, 150, 92, 256, 128);
		box16.addBox(0F, 0F, 0F, 18, 6, 0);
		box16.setPosition(4F, 0F, 5F);

		box17 = new CustomModelRenderer(this, 81, 84, 256, 128);
		box17.addBox(0F, 0F, -4F, 8, 1, 4);
		box17.setPosition(16F, 34F, 9F);
		box17.rotateAngleX = -2.2689280275926285F;

		box18 = new CustomModelRenderer(this, 134, 118, 256, 128);
		box18.addBox(0F, 0F, 0F, 28, 8, 1);
		box18.setPosition(-11F, 21F, 8F);

		box19 = new CustomModelRenderer(this, 17, 104, 256, 128);
		box19.addBox(0F, 0F, 0F, 1, 8, 16);
		box19.setPosition(-11F, 21F, -8F);

		box2 = new CustomModelRenderer(this, 77, 65, 256, 128);
		box2.addBox(0F, 0F, 0F, 8, 1, 8);
		box2.setPosition(16F, 34F, -4F);

		box20 = new CustomModelRenderer(this, 0, 1, 256, 128);
		box20.addBox(0F, -1F, 0F, 27, 1, 16);
		box20.setPosition(-10F, 27F, -8F);

		box21 = new CustomModelRenderer(this, 136, 73, 256, 128);
		box21.addBox(0F, 0F, 0F, 45, 2, 14);
		box21.setPosition(23F, 6F, 7F);
		box21.rotateAngleY = -3.141592653589793F;

		box22 = new CustomModelRenderer(this, 150, 92, 256, 128);
		box22.addBox(0F, 0F, 0F, 18, 6, 0);
		box22.setPosition(-21F, 0F, 5F);

		box23 = new CustomModelRenderer(this, 60, 74, 256, 128);
		box23.addBox(0F, 0F, 0F, 3, 2, 3);
		box23.setPosition(-17F, 21F, 4F);

		box24 = new CustomModelRenderer(this, 40, 69, 256, 128);
		box24.addBox(0F, 0F, 0F, 3, 2, 4);
		box24.setPosition(-18F, 21F, -2F);

		box25 = new CustomModelRenderer(this, 190, 92, 256, 128);
		box25.addBox(0F, 0F, 0F, 18, 5, 12);
		box25.setPosition(22F, 1F, 6F);
		box25.rotateAngleY = -3.141592653589793F;

		box26 = new CustomModelRenderer(this, 38, 48, 256, 128);
		box26.addBox(0F, 0F, 0F, 3, 5, 14);
		box26.setPosition(-22F, 9F, -7F);

		box27 = new CustomModelRenderer(this, 60, 46, 256, 128);
		box27.addBox(0F, 0F, 0F, 4, 1, 14);
		box27.setPosition(-22F, 13F, -7F);
		box27.rotateAngleZ = -5.934119456780721F;

		box28 = new CustomModelRenderer(this, 190, 92, 256, 128);
		box28.addBox(0F, 0F, 0F, 18, 5, 12);
		box28.setPosition(-3F, 1F, 6F);
		box28.rotateAngleY = -3.141592653589793F;

		box29 = new CustomModelRenderer(this, 2, 51, 256, 128);
		box29.addBox(0F, 0F, 0F, 2, 2, 14);
		box29.setPosition(-6F, 2F, 7F);
		box29.rotateAngleY = -3.141592653589793F;

		box3 = new CustomModelRenderer(this, 79, 2, 256, 128);
		box3.addBox(0F, 0F, 0F, 36, 5, 0);
		box3.setPosition(-19F, 21F, 11F);

		box30 = new CustomModelRenderer(this, 2, 51, 256, 128);
		box30.addBox(0F, 0F, 0F, 2, 2, 14);
		box30.setPosition(9F, 2F, 7F);
		box30.rotateAngleY = -3.141592653589793F;

		box31 = new CustomModelRenderer(this, 2, 51, 256, 128);
		box31.addBox(0F, 0F, 0F, 2, 2, 14);
		box31.setPosition(19F, 2F, 7F);
		box31.rotateAngleY = -3.141592653589793F;

		box32 = new CustomModelRenderer(this, 107, 103, 256, 128);
		box32.addBox(0F, 0F, 0F, 2, 20, 1);
		box32.setPosition(24F, 12F, -6F);

		box33 = new CustomModelRenderer(this, 107, 103, 256, 128);
		box33.addBox(0F, 0F, 0F, 2, 20, 1);
		box33.setPosition(24F, 12F, 5F);

		box34 = new CustomModelRenderer(this, 103, 115, 256, 128);
		box34.addBox(0F, 0F, 0F, 2, 1, 10);
		box34.setPosition(24F, 31F, -5F);

		box35 = new CustomModelRenderer(this, 3, 68, 256, 128);
		box35.addBox(0F, 0F, 0F, 5, 4, 4);
		box35.setPosition(3F, 2F, 4F);
		box35.rotateAngleY = -3.141592653589793F;

		box36 = new CustomModelRenderer(this, 73, 118, 256, 128);
		box36.addBox(0F, 0F, 0F, 4, 6, 1);
		box36.setPosition(-22F, 2F, -10F);

		box37 = new CustomModelRenderer(this, 85, 118, 256, 128);
		box37.addBox(0F, 0F, 0F, 4, 6, 1);
		box37.setPosition(-22F, 2F, 9F);

		box38 = new CustomModelRenderer(this, 150, 100, 256, 128);
		box38.addBox(0F, 0F, 0F, 18, 6, 0);
		box38.setPosition(4F, 0F, -5F);

		box39 = new CustomModelRenderer(this, 150, 100, 256, 128);
		box39.addBox(0F, 0F, 0F, 18, 6, 0);
		box39.setPosition(-21F, 0F, -5F);

		box4 = new CustomModelRenderer(this, 80, 76, 256, 128);
		box4.addBox(0F, 0F, -5F, 8, 1, 5);
		box4.setPosition(16F, 35F, 4F);
		box4.rotateAngleX = -2.949606435870417F;

		box42 = new CustomModelRenderer(this, 1, 78, 256, 128);
		box42.addBox(0F, 0F, 0F, 6, 5, 20);
		box42.setPosition(18F, 9F, -10F);

		box5 = new CustomModelRenderer(this, 10, 21, 256, 128);
		box5.addBox(0F, 0F, 0F, 7, 22, 1);
		box5.setPosition(17F, 9F, -11F);

		box50 = new CustomModelRenderer(this, 142, 64, 256, 128);
		box50.addBox(0F, 0F, 0F, 51, 3, 4);
		box50.setPosition(-25F, 6F, -2F);

		box6 = new CustomModelRenderer(this, 124, 39, 256, 128);
		box6.addBox(0F, 0F, 0F, 46, 1, 20);
		box6.setPosition(24F, 8F, 10F);
		box6.rotateAngleY = -3.141592653589793F;

		box64 = new CustomModelRenderer(this, 2, 51, 256, 128);
		box64.addBox(0F, 0F, 0F, 2, 2, 14);
		box64.setPosition(-16F, 2F, 7F);
		box64.rotateAngleY = -3.141592653589793F;

		box7 = new CustomModelRenderer(this, 60, 95, 256, 128);
		box7.addBox(0F, 0F, 0F, 1, 5, 16);
		box7.setPosition(-23F, 5F, -8F);

		box8 = new CustomModelRenderer(this, 81, 84, 256, 128);
		box8.addBox(0F, 0F, -4F, 8, 1, 4);
		box8.setPosition(24F, 34F, -9F);
		box8.rotateAngleX = -2.2689280275926285F;
		box8.rotateAngleY = -3.141592653589793F;

		box9 = new CustomModelRenderer(this, 125, 75, 256, 128);
		box9.addBox(0F, 0F, 0F, 4, 0, 8);
		box9.setPosition(23F, 14F, -4F);
		box9.rotateAngleZ = -6.230825429619756F;
	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
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
		box38.render(f5);
		box39.render(f5);
		box4.render(f5);
		box42.render(f5);
		box5.render(f5);
		box50.render(f5);
		box6.render(f5);
		box64.render(f5);
		box7.render(f5);
		box8.render(f5);
		box9.render(f5);
		
		int cargo = ((Freight) entity).getAmmountOfCargo();
		if (cargo != 0) {
			//box20.render(f5);
			GL11.glPushMatrix();
			GL11.glTranslatef(0, -0.4f+cargo*0.032f, 0);
			box20.render(f5);
			GL11.glPopMatrix();
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {}
}