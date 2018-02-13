package train.client.render.models;

import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import train.client.core.ClientProxy;
import train.client.render.CustomModelRenderer;
import train.client.render.models.blocks.ModelLights;

public class ModelPassenger_1class_DB extends ModelBase {
	
	private ModelLights lights;
	
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
	public CustomModelRenderer box40;
	public CustomModelRenderer box41;
	public CustomModelRenderer box42;
	public CustomModelRenderer box43;
	public CustomModelRenderer box44;
	public CustomModelRenderer box45;
	public CustomModelRenderer box46;
	public CustomModelRenderer box47;
	public CustomModelRenderer box48;
	public CustomModelRenderer box49;
	public CustomModelRenderer box5;
	public CustomModelRenderer box50;
	public CustomModelRenderer box51;
	public CustomModelRenderer box52;
	public CustomModelRenderer box53;
	public CustomModelRenderer box54;
	public CustomModelRenderer box55;
	public CustomModelRenderer box56;
	public CustomModelRenderer box58;
	public CustomModelRenderer box59;
	public CustomModelRenderer box6;
	public CustomModelRenderer box60;
	public CustomModelRenderer box63;
	public CustomModelRenderer box7;
	public CustomModelRenderer box8;
	public CustomModelRenderer box9;

	public ModelPassenger_1class_DB() {
		
		lights = new ModelLights();

		box = new CustomModelRenderer(this, 172, 39, 256, 128);
		box.addBox(0F, 0F, 0F, 7, 1, 7);
		box.setPosition(3F, 17F, -10F);

		box0 = new CustomModelRenderer(this, 3, 27, 256, 128);
		box0.addBox(0F, 0F, 0F, 14, 5, 1);
		box0.setPosition(-21F, 1F, -6F);

		box1 = new CustomModelRenderer(this, 189, 12, 256, 128);
		box1.addBox(0F, 0F, 0F, 8, 7, 0);
		box1.setPosition(-18F, 0F, 5F);

		box10 = new CustomModelRenderer(this, 86, 107, 256, 128);
		box10.addBox(0F, 0F, 0F, 42, 19, 1);
		box10.setPosition(-21F, 8F, 10F);

		box11 = new CustomModelRenderer(this, 211, 21, 256, 128);
		box11.addBox(0F, 0F, 0F, 7, 20, 15);
		box11.setPosition(-14F, 10F, -10F);

		box12 = new CustomModelRenderer(this, 175, 62, 256, 128);
		box12.addBox(0F, 0F, 0F, 6, 7, 1);
		box12.setPosition(13F, 10F, -10F);

		box13 = new CustomModelRenderer(this, 0, 46, 256, 128);
		box13.addBox(0F, -2F, 0F, 56, 2, 6);
		box13.setPosition(-28F, 32F, -3F);

		box14 = new CustomModelRenderer(this, 50, 0, 256, 128);
		box14.addBox(0F, 0F, 0F, 6, 17, 1);
		box14.setPosition(21F, 10F, -8F);

		box15 = new CustomModelRenderer(this, 220, 58, 256, 128);
		box15.addBox(0F, 0F, 0F, 9, 20, 1);
		box15.setPosition(-20F, 10F, -2F);
		box15.rotateAngleY = -0.767944870877505F;

		box16 = new CustomModelRenderer(this, 1, 55, 256, 128);
		box16.addBox(0F, -2F, 0F, 56, 2, 5);
		box16.setPosition(-28F, 32F, 3F);
		box16.rotateAngleX = -6.09119908946021F;

		box17 = new CustomModelRenderer(this, 1, 38, 256, 128);
		box17.addBox(0F, -2F, 0F, 56, 2, 5);
		box17.setPosition(-28F, 31F, 8F);
		box17.rotateAngleX = -5.480333851262195F;

		box18 = new CustomModelRenderer(this, 1, 55, 256, 128);
		box18.addBox(0F, -2F, 0F, 56, 2, 5);
		box18.setPosition(28F, 32F, -3F);
		box18.rotateAngleX = -6.09119908946021F;
		box18.rotateAngleY = -3.141592653589793F;

		box19 = new CustomModelRenderer(this, 1, 38, 256, 128);
		box19.addBox(0F, -2F, 0F, 56, 2, 5);
		box19.setPosition(28F, 31F, -8F);
		box19.rotateAngleX = -5.480333851262195F;
		box19.rotateAngleY = -3.141592653589793F;

		box2 = new CustomModelRenderer(this, 96, 1, 256, 128);
		box2.addBox(0F, 0F, 0F, 2, 2, 14);
		box2.setPosition(13F, 2F, -7F);

		box20 = new CustomModelRenderer(this, 156, 67, 256, 128);
		box20.addBox(0F, 0F, 0F, 1, 20, 16);
		box20.setPosition(-28F, 6F, -8F);

		box21 = new CustomModelRenderer(this, 242, 74, 256, 128);
		box21.addBox(0F, 0F, 0F, 1, 18, 4);
		box21.setPosition(28F, 11F, -7F);

		box22 = new CustomModelRenderer(this, 198, 66, 256, 128);
		box22.addBox(0F, 0F, 0F, 1, 20, 16);
		box22.setPosition(27F, 6F, -8F);

		box23 = new CustomModelRenderer(this, 138, 0, 256, 128);
		box23.addBox(0F, 0F, 0F, 7, 5, 22);
		box23.setPosition(-28F, 26F, -11F);

		box24 = new CustomModelRenderer(this, 0, 65, 256, 128);
		box24.addBox(0F, 0F, 0F, 40, 2, 20);
		box24.setPosition(-20F, 8F, -10F);

		box25 = new CustomModelRenderer(this, 161, 44, 256, 128);
		box25.addBox(0F, 0F, 0F, 1, 3, 3);
		box25.setPosition(28F, 7F, -7F);

		box26 = new CustomModelRenderer(this, 214, 84, 256, 128);
		box26.addBox(0F, 0F, 0F, 1, 23, 20);
		box26.setPosition(-21F, 8F, -10F);

		box27 = new CustomModelRenderer(this, 130, 43, 256, 128);
		box27.addBox(0F, 0F, 0F, 7, 1, 3);
		box27.setPosition(21F, 1F, -10F);

		box28 = new CustomModelRenderer(this, 130, 36, 256, 128);
		box28.addBox(0F, 0F, 0F, 6, 1, 3);
		box28.setPosition(-27F, 5F, -9F);

		box29 = new CustomModelRenderer(this, 175, 62, 256, 128);
		box29.addBox(0F, 0F, 0F, 6, 7, 1);
		box29.setPosition(-6F, 10F, -10F);

		box3 = new CustomModelRenderer(this, 96, 1, 256, 128);
		box3.addBox(0F, 0F, 0F, 2, 2, 14);
		box3.setPosition(-15F, 2F, -7F);

		box30 = new CustomModelRenderer(this, 50, 0, 256, 128);
		box30.addBox(0F, 0F, 0F, 6, 17, 1);
		box30.setPosition(-21F, 10F, 8F);
		box30.rotateAngleY = -3.141592653589793F;

		box31 = new CustomModelRenderer(this, 114, 3, 256, 128);
		box31.addBox(0F, 0F, 0F, 6, 1, 16);
		box31.setPosition(-27F, 9F, -8F);

		box32 = new CustomModelRenderer(this, 175, 62, 256, 128);
		box32.addBox(0F, 0F, 0F, 6, 7, 1);
		box32.setPosition(-6F, 10F, 4F);

		box33 = new CustomModelRenderer(this, 175, 62, 256, 128);
		box33.addBox(0F, 0F, 0F, 6, 7, 1);
		box33.setPosition(13F, 10F, -1F);

		box34 = new CustomModelRenderer(this, 120, 59, 256, 128);
		box34.addBox(0F, 0F, 0F, 6, 2, 13);
		box34.setPosition(-5F, 12F, -9F);
		box34.rotateAngleZ = -6.230825429619756F;

		box35 = new CustomModelRenderer(this, 189, 12, 256, 128);
		box35.addBox(0F, 0F, 0F, 8, 7, 0);
		box35.setPosition(10F, 0F, 5F);

		box36 = new CustomModelRenderer(this, 130, 43, 256, 128);
		box36.addBox(0F, 0F, 0F, 7, 1, 3);
		box36.setPosition(21F, 1F, 7F);

		box37 = new CustomModelRenderer(this, 172, 84, 256, 128);
		box37.addBox(0F, 0F, 0F, 1, 23, 20);
		box37.setPosition(20F, 8F, -10F);

		box38 = new CustomModelRenderer(this, 161, 44, 256, 128);
		box38.addBox(0F, 0F, 0F, 1, 3, 3);
		box38.setPosition(28F, 7F, 4F);

		box39 = new CustomModelRenderer(this, 124, 75, 256, 128);
		box39.addBox(0F, 0F, 0F, 1, 10, 15);
		box39.setPosition(-6F, 12F, -10F);
		box39.rotateAngleZ = -6.126105674500097F;

		box4 = new CustomModelRenderer(this, 36, 27, 256, 128);
		box4.addBox(0F, 0F, 0F, 14, 5, 1);
		box4.setPosition(-21F, 1F, 5F);

		box40 = new CustomModelRenderer(this, 153, 44, 256, 128);
		box40.addBox(0F, 0F, 0F, 1, 3, 3);
		box40.setPosition(-29F, 7F, -7F);

		box41 = new CustomModelRenderer(this, 0, 107, 256, 128);
		box41.addBox(0F, 0F, 0F, 42, 19, 1);
		box41.setPosition(-21F, 8F, -11F);

		box42 = new CustomModelRenderer(this, 153, 44, 256, 128);
		box42.addBox(0F, 0F, 0F, 1, 3, 3);
		box42.setPosition(-29F, 7F, 4F);

		box43 = new CustomModelRenderer(this, 130, 43, 256, 128);
		box43.addBox(0F, 0F, 0F, 7, 1, 3);
		box43.setPosition(-28F, 1F, -10F);

		box44 = new CustomModelRenderer(this, 128, 28, 256, 128);
		box44.addBox(0F, 0F, 0F, 60, 3, 4);
		box44.setPosition(-30F, 7F, -2F);

		box45 = new CustomModelRenderer(this, 130, 36, 256, 128);
		box45.addBox(0F, 0F, 0F, 6, 1, 3);
		box45.setPosition(-27F, 5F, 6F);

		box46 = new CustomModelRenderer(this, 0, 0, 256, 128);
		box46.addBox(0F, 0F, 0F, 4, 8, 1);
		box46.setPosition(26F, 1F, 8F);
		box46.rotateAngleX = -6.1086523819801535F;
		box46.rotateAngleY = -3.141592653589793F;

		box47 = new CustomModelRenderer(this, 130, 43, 256, 128);
		box47.addBox(0F, 0F, 0F, 7, 1, 3);
		box47.setPosition(-28F, 1F, 7F);

		box48 = new CustomModelRenderer(this, 114, 3, 256, 128);
		box48.addBox(0F, 0F, 0F, 6, 1, 16);
		box48.setPosition(21F, 9F, -8F);

		box49 = new CustomModelRenderer(this, 125, 49, 256, 128);
		box49.addBox(0F, 0F, 0F, 6, 2, 8);
		box49.setPosition(18F, 12F, -1F);
		box49.rotateAngleY = 3.141592653589793F;
		box49.rotateAngleZ = 6.230825429619756F;

		box5 = new CustomModelRenderer(this, 189, 12, 256, 128);
		box5.addBox(0F, 0F, 0F, 8, 7, 0);
		box5.setPosition(10F, 0F, -5F);

		box50 = new CustomModelRenderer(this, 130, 36, 256, 128);
		box50.addBox(0F, 0F, 0F, 6, 1, 3);
		box50.setPosition(21F, 5F, -9F);

		box51 = new CustomModelRenderer(this, 103, 64, 256, 128);
		box51.addBox(0F, 0F, 0F, 1, 10, 10);
		box51.setPosition(19F, 13F, 0F);
		box51.rotateAngleY = 3.141592653589793F;
		box51.rotateAngleZ = 6.126105674500097F;

		box52 = new CustomModelRenderer(this, 67, 0, 256, 128);
		box52.addBox(0F, 0F, 0F, 6, 17, 1);
		box52.setPosition(21F, 10F, 7F);

		box53 = new CustomModelRenderer(this, 130, 36, 256, 128);
		box53.addBox(0F, 0F, 0F, 6, 1, 3);
		box53.setPosition(21F, 5F, 6F);

		box54 = new CustomModelRenderer(this, 67, 0, 256, 128);
		box54.addBox(0F, 0F, 0F, 6, 17, 1);
		box54.setPosition(-21F, 10F, -7F);
		box54.rotateAngleY = -3.141592653589793F;

		box55 = new CustomModelRenderer(this, 153, 50, 256, 128);
		box55.addBox(0F, 0F, 0F, 4, 1, 10);
		box55.setPosition(16F, 26F, -10F);

		box56 = new CustomModelRenderer(this, 187, 51, 256, 128);
		box56.addBox(0F, 0F, 0F, 9, 7, 3);
		box56.setPosition(11F, 10F, 7F);

		box58 = new CustomModelRenderer(this, 0, 0, 256, 128);
		box58.addBox(0F, 0F, 0F, 4, 8, 1);
		box58.setPosition(-26F, 1F, -8F);
		box58.rotateAngleX = -6.1086523819801535F;

		box59 = new CustomModelRenderer(this, 13, 0, 256, 128);
		box59.addBox(0F, 0F, 0F, 4, 8, 1);
		box59.setPosition(-22F, 1F, 8F);
		box59.rotateAngleX = -6.1086523819801535F;
		box59.rotateAngleY = -3.141592653589793F;

		box6 = new CustomModelRenderer(this, 36, 27, 256, 128);
		box6.addBox(0F, 0F, 0F, 14, 5, 1);
		box6.setPosition(7F, 1F, 5F);

		box60 = new CustomModelRenderer(this, 198, 0, 256, 128);
		box60.addBox(0F, 0F, 0F, 7, 5, 22);
		box60.setPosition(21F, 26F, -11F);

		box63 = new CustomModelRenderer(this, 189, 12, 256, 128);
		box63.addBox(0F, 0F, 0F, 8, 7, 0);
		box63.setPosition(-18F, 0F, -5F);

		box7 = new CustomModelRenderer(this, 13, 0, 256, 128);
		box7.addBox(0F, 0F, 0F, 4, 8, 1);
		box7.setPosition(22F, 1F, -8F);
		box7.rotateAngleX = -6.1086523819801535F;

		box8 = new CustomModelRenderer(this, 3, 27, 256, 128);
		box8.addBox(0F, 0F, 0F, 14, 5, 1);
		box8.setPosition(7F, 1F, -6F);

		box9 = new CustomModelRenderer(this, 0, 89, 256, 128);
		box9.addBox(0F, 0F, 0F, 54, 3, 14);
		box9.setPosition(-27F, 6F, -7F);

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
		box38.render(f5);
		box39.render(f5);
		box4.render(f5);
		box40.render(f5);
		box41.render(f5);
		box42.render(f5);
		box43.render(f5);
		box44.render(f5);
		box45.render(f5);
		box46.render(f5);
		box47.render(f5);
		box48.render(f5);
		box49.render(f5);
		box5.render(f5);
		box50.render(f5);
		box51.render(f5);
		box52.render(f5);
		box53.render(f5);
		box54.render(f5);
		box55.render(f5);
		box56.render(f5);
		box58.render(f5);
		box59.render(f5);
		box6.render(f5);
		box60.render(f5);
		box63.render(f5);
		box7.render(f5);
		box8.render(f5);
		box9.render(f5);
		
		if (ClientProxy.isHoliday()) {
			GL11.glPushMatrix();
			GL11.glTranslatef(-0.6f, 0.8f, -0.72f);
			lights.render(5);
			GL11.glPopMatrix();
			
			GL11.glPushMatrix();
			GL11.glTranslatef(0.6f, 0.8f, -0.72f);
			lights.render(5);
			GL11.glPopMatrix();
			
			GL11.glPushMatrix();
			GL11.glTranslatef(-0.6f, 0.8f, 0.72f);
			GL11.glRotatef(-180f, 0, 1, 0);
			lights.render(5);
			GL11.glPopMatrix();
			
			GL11.glPushMatrix();
			GL11.glTranslatef(0.6f, 0.8f, 0.72f);
			GL11.glRotatef(-180f, 0, 1, 0);
			lights.render(5);
			GL11.glPopMatrix();
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {}
}