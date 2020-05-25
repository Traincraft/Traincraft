package train.client.render.models;

import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import train.client.core.ClientProxy;
import train.client.render.ModelRendererTurbo;

public class ModelPassenger_2class_DB extends ModelBase {
	
	//private ModelLights lights;
	
	public ModelRendererTurbo box;
	public ModelRendererTurbo box0;
	public ModelRendererTurbo box1;
	public ModelRendererTurbo box10;
	public ModelRendererTurbo box11;
	public ModelRendererTurbo box12;
	public ModelRendererTurbo box13;
	public ModelRendererTurbo box14;
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
	public ModelRendererTurbo box26;
	public ModelRendererTurbo box27;
	public ModelRendererTurbo box28;
	public ModelRendererTurbo box29;
	public ModelRendererTurbo box3;
	public ModelRendererTurbo box30;
	public ModelRendererTurbo box31;
	public ModelRendererTurbo box32;
	public ModelRendererTurbo box33;
	public ModelRendererTurbo box34;
	public ModelRendererTurbo box35;
	public ModelRendererTurbo box36;
	public ModelRendererTurbo box37;
	public ModelRendererTurbo box38;
	public ModelRendererTurbo box39;
	public ModelRendererTurbo box4;
	public ModelRendererTurbo box40;
	public ModelRendererTurbo box41;
	public ModelRendererTurbo box42;
	public ModelRendererTurbo box43;
	public ModelRendererTurbo box44;
	public ModelRendererTurbo box45;
	public ModelRendererTurbo box46;
	public ModelRendererTurbo box47;
	public ModelRendererTurbo box48;
	public ModelRendererTurbo box49;
	public ModelRendererTurbo box5;
	public ModelRendererTurbo box50;
	public ModelRendererTurbo box51;
	public ModelRendererTurbo box52;
	public ModelRendererTurbo box53;
	public ModelRendererTurbo box54;
	public ModelRendererTurbo box55;
	public ModelRendererTurbo box56;
	public ModelRendererTurbo box57;
	public ModelRendererTurbo box58;
	public ModelRendererTurbo box59;
	public ModelRendererTurbo box6;
	public ModelRendererTurbo box60;
	public ModelRendererTurbo box61;
	public ModelRendererTurbo box62;
	public ModelRendererTurbo box63;
	public ModelRendererTurbo box7;
	public ModelRendererTurbo box8;
	public ModelRendererTurbo box9;

	public ModelPassenger_2class_DB() {
		
		//lights = new ModelLights();

		box = new ModelRendererTurbo(this, 70, 25, 256, 128);
		box.addBox(0F, 0F, 0F, 8, 4, 4);
		box.setPosition(-5F, 2F, 2F);

		box0 = new ModelRendererTurbo(this, 3, 27, 256, 128);
		box0.addBox(0F, 0F, 0F, 14, 5, 1);
		box0.setPosition(-21F, 1F, -6F);

		box1 = new ModelRendererTurbo(this, 189, 12, 256, 128);
		box1.addBox(0F, 0F, 0F, 8, 7, 0);
		box1.setPosition(-18F, 0F, 5F);

		box10 = new ModelRendererTurbo(this, 86, 107, 256, 128);
		box10.addBox(0F, 0F, 0F, 42, 19, 1);
		box10.setPosition(-21F, 8F, 10F);

		box11 = new ModelRendererTurbo(this, 152, 35, 256, 128);
		box11.addBox(0F, 0F, 0F, 2, 3, 4);
		box11.setPosition(28F, 6F, -2F);

		box12 = new ModelRendererTurbo(this, 175, 62, 256, 128);
		box12.addBox(0F, 0F, 0F, 5, 2, 14);
		box12.setPosition(8F, 10F, -10F);

		box13 = new ModelRendererTurbo(this, 0, 46, 256, 128);
		box13.addBox(0F, -2F, 0F, 56, 2, 6);
		box13.setPosition(-28F, 32F, -3F);

		box14 = new ModelRendererTurbo(this, 50, 0, 256, 128);
		box14.addBox(0F, 0F, 0F, 6, 17, 1);
		box14.setPosition(21F, 10F, -8F);

		box15 = new ModelRendererTurbo(this, 0, 0, 256, 128);
		box15.addBox(0F, 0F, 0F, 1, 8, 1);
		box15.setPosition(26F, 1F, -8F);
		box15.rotateAngleX = -6.1086523819801535F;

		box16 = new ModelRendererTurbo(this, 1, 55, 256, 128);
		box16.addBox(0F, -2F, 0F, 56, 2, 5);
		box16.setPosition(-28F, 32F, 3F);
		box16.rotateAngleX = -6.09119908946021F;

		box17 = new ModelRendererTurbo(this, 1, 38, 256, 128);
		box17.addBox(0F, -2F, 0F, 56, 2, 5);
		box17.setPosition(-28F, 31F, 8F);
		box17.rotateAngleX = -5.480333851262195F;

		box18 = new ModelRendererTurbo(this, 1, 55, 256, 128);
		box18.addBox(0F, -2F, 0F, 56, 2, 5);
		box18.setPosition(28F, 32F, -3F);
		box18.rotateAngleX = -6.09119908946021F;
		box18.rotateAngleY = -3.141592653589793F;

		box19 = new ModelRendererTurbo(this, 1, 38, 256, 128);
		box19.addBox(0F, -2F, 0F, 56, 2, 5);
		box19.setPosition(28F, 31F, -8F);
		box19.rotateAngleX = -5.480333851262195F;
		box19.rotateAngleY = -3.141592653589793F;

		box2 = new ModelRendererTurbo(this, 96, 1, 256, 128);
		box2.addBox(0F, 0F, 0F, 2, 2, 14);
		box2.setPosition(13F, 2F, -7F);

		box20 = new ModelRendererTurbo(this, 156, 67, 256, 128);
		box20.addBox(0F, 0F, 0F, 1, 20, 16);
		box20.setPosition(-28F, 6F, -8F);

		box21 = new ModelRendererTurbo(this, 242, 74, 256, 128);
		box21.addBox(0F, 0F, 0F, 1, 18, 4);
		box21.setPosition(28F, 11F, -7F);

		box22 = new ModelRendererTurbo(this, 198, 66, 256, 128);
		box22.addBox(0F, 0F, 0F, 1, 20, 16);
		box22.setPosition(27F, 6F, -8F);

		box23 = new ModelRendererTurbo(this, 138, 0, 256, 128);
		box23.addBox(0F, 0F, 0F, 7, 5, 22);
		box23.setPosition(-28F, 26F, -11F);

		box24 = new ModelRendererTurbo(this, 0, 65, 256, 128);
		box24.addBox(0F, 0F, 0F, 40, 2, 20);
		box24.setPosition(-20F, 8F, -10F);

		box25 = new ModelRendererTurbo(this, 161, 44, 256, 128);
		box25.addBox(0F, 0F, 0F, 1, 3, 3);
		box25.setPosition(28F, 7F, -7F);

		box26 = new ModelRendererTurbo(this, 214, 84, 256, 128);
		box26.addBox(0F, 0F, 0F, 1, 23, 20);
		box26.setPosition(-21F, 8F, -10F);

		box27 = new ModelRendererTurbo(this, 130, 43, 256, 128);
		box27.addBox(0F, 0F, 0F, 7, 1, 3);
		box27.setPosition(21F, 1F, -10F);

		box28 = new ModelRendererTurbo(this, 130, 36, 256, 128);
		box28.addBox(0F, 0F, 0F, 6, 1, 3);
		box28.setPosition(-27F, 5F, -9F);

		box29 = new ModelRendererTurbo(this, 175, 62, 256, 128);
		box29.addBox(0F, 0F, 0F, 5, 2, 14);
		box29.setPosition(-4F, 10F, -10F);

		box3 = new ModelRendererTurbo(this, 96, 1, 256, 128);
		box3.addBox(0F, 0F, 0F, 2, 2, 14);
		box3.setPosition(-15F, 2F, -7F);

		box30 = new ModelRendererTurbo(this, 50, 0, 256, 128);
		box30.addBox(0F, 0F, 0F, 6, 17, 1);
		box30.setPosition(-21F, 10F, 8F);
		box30.rotateAngleY = -3.141592653589793F;

		box31 = new ModelRendererTurbo(this, 114, 3, 256, 128);
		box31.addBox(0F, 0F, 0F, 6, 1, 16);
		box31.setPosition(-27F, 9F, -8F);

		box32 = new ModelRendererTurbo(this, 121, 55, 256, 128);
		box32.addBox(0F, 0F, 0F, 6, 2, 15);
		box32.setPosition(-16F, 11F, -10F);
		box32.rotateAngleZ = -6.230825429619756F;

		box33 = new ModelRendererTurbo(this, 124, 75, 256, 128);
		box33.addBox(0F, 0F, 0F, 1, 9, 15);
		box33.setPosition(-17F, 11F, -10F);
		box33.rotateAngleZ = -6.126105674500097F;

		box34 = new ModelRendererTurbo(this, 121, 55, 256, 128);
		box34.addBox(0F, 0F, 0F, 6, 2, 15);
		box34.setPosition(-4F, 11F, -10F);
		box34.rotateAngleZ = -6.230825429619756F;

		box35 = new ModelRendererTurbo(this, 189, 12, 256, 128);
		box35.addBox(0F, 0F, 0F, 8, 7, 0);
		box35.setPosition(10F, 0F, 5F);

		box36 = new ModelRendererTurbo(this, 130, 43, 256, 128);
		box36.addBox(0F, 0F, 0F, 7, 1, 3);
		box36.setPosition(21F, 1F, 7F);

		box37 = new ModelRendererTurbo(this, 172, 84, 256, 128);
		box37.addBox(0F, 0F, 0F, 1, 23, 20);
		box37.setPosition(20F, 8F, -10F);

		box38 = new ModelRendererTurbo(this, 161, 44, 256, 128);
		box38.addBox(0F, 0F, 0F, 1, 3, 3);
		box38.setPosition(28F, 7F, 4F);

		box39 = new ModelRendererTurbo(this, 124, 75, 256, 128);
		box39.addBox(0F, 0F, 0F, 1, 9, 15);
		box39.setPosition(-5F, 11F, -10F);
		box39.rotateAngleZ = -6.126105674500097F;

		box4 = new ModelRendererTurbo(this, 36, 27, 256, 128);
		box4.addBox(0F, 0F, 0F, 14, 5, 1);
		box4.setPosition(-21F, 1F, 5F);

		box40 = new ModelRendererTurbo(this, 153, 44, 256, 128);
		box40.addBox(0F, 0F, 0F, 1, 3, 3);
		box40.setPosition(-29F, 7F, -7F);

		box41 = new ModelRendererTurbo(this, 0, 107, 256, 128);
		box41.addBox(0F, 0F, 0F, 42, 19, 1);
		box41.setPosition(-21F, 8F, -11F);

		box42 = new ModelRendererTurbo(this, 153, 44, 256, 128);
		box42.addBox(0F, 0F, 0F, 1, 3, 3);
		box42.setPosition(-29F, 7F, 4F);

		box43 = new ModelRendererTurbo(this, 130, 43, 256, 128);
		box43.addBox(0F, 0F, 0F, 7, 1, 3);
		box43.setPosition(-28F, 1F, -10F);

		box44 = new ModelRendererTurbo(this, 152, 35, 256, 128);
		box44.addBox(0F, 0F, 0F, 2, 3, 4);
		box44.setPosition(-30F, 7F, -2F);

		box45 = new ModelRendererTurbo(this, 130, 36, 256, 128);
		box45.addBox(0F, 0F, 0F, 6, 1, 3);
		box45.setPosition(-27F, 5F, 6F);

		box46 = new ModelRendererTurbo(this, 0, 0, 256, 128);
		box46.addBox(0F, 0F, 0F, 1, 8, 1);
		box46.setPosition(27F, 1F, 8F);
		box46.rotateAngleX = -6.1086523819801535F;
		box46.rotateAngleY = -3.141592653589793F;

		box47 = new ModelRendererTurbo(this, 130, 43, 256, 128);
		box47.addBox(0F, 0F, 0F, 7, 1, 3);
		box47.setPosition(-28F, 1F, 7F);

		box48 = new ModelRendererTurbo(this, 114, 3, 256, 128);
		box48.addBox(0F, 0F, 0F, 6, 1, 16);
		box48.setPosition(21F, 9F, -8F);

		box49 = new ModelRendererTurbo(this, 121, 55, 256, 128);
		box49.addBox(0F, 0F, 0F, 6, 2, 15);
		box49.setPosition(8F, 11F, -10F);
		box49.rotateAngleZ = -6.230825429619756F;

		box5 = new ModelRendererTurbo(this, 189, 12, 256, 128);
		box5.addBox(0F, 0F, 0F, 8, 7, 0);
		box5.setPosition(10F, 0F, -5F);

		box50 = new ModelRendererTurbo(this, 130, 36, 256, 128);
		box50.addBox(0F, 0F, 0F, 6, 1, 3);
		box50.setPosition(21F, 5F, -9F);

		box51 = new ModelRendererTurbo(this, 124, 75, 256, 128);
		box51.addBox(0F, 0F, 0F, 1, 9, 15);
		box51.setPosition(7F, 11F, -10F);
		box51.rotateAngleZ = -6.126105674500097F;

		box52 = new ModelRendererTurbo(this, 67, 0, 256, 128);
		box52.addBox(0F, 0F, 0F, 6, 17, 1);
		box52.setPosition(21F, 10F, 7F);

		box53 = new ModelRendererTurbo(this, 130, 36, 256, 128);
		box53.addBox(0F, 0F, 0F, 6, 1, 3);
		box53.setPosition(21F, 5F, 6F);

		box54 = new ModelRendererTurbo(this, 67, 0, 256, 128);
		box54.addBox(0F, 0F, 0F, 6, 17, 1);
		box54.setPosition(-21F, 10F, -7F);
		box54.rotateAngleY = -3.141592653589793F;

		box55 = new ModelRendererTurbo(this, 0, 0, 256, 128);
		box55.addBox(0F, 0F, 0F, 1, 8, 1);
		box55.setPosition(22F, 1F, 8F);
		box55.rotateAngleX = -6.1086523819801535F;
		box55.rotateAngleY = -3.141592653589793F;

		box56 = new ModelRendererTurbo(this, 0, 0, 256, 128);
		box56.addBox(0F, 0F, 0F, 1, 8, 1);
		box56.setPosition(-26F, 1F, 8F);
		box56.rotateAngleX = -6.1086523819801535F;
		box56.rotateAngleY = -3.141592653589793F;

		box57 = new ModelRendererTurbo(this, 0, 0, 256, 128);
		box57.addBox(0F, 0F, 0F, 1, 8, 1);
		box57.setPosition(-21F, 1F, 8F);
		box57.rotateAngleX = -6.1086523819801535F;
		box57.rotateAngleY = -3.141592653589793F;

		box58 = new ModelRendererTurbo(this, 0, 0, 256, 128);
		box58.addBox(0F, 0F, 0F, 1, 8, 1);
		box58.setPosition(-22F, 1F, -8F);
		box58.rotateAngleX = -6.1086523819801535F;

		box59 = new ModelRendererTurbo(this, 0, 0, 256, 128);
		box59.addBox(0F, 0F, 0F, 1, 8, 1);
		box59.setPosition(-27F, 1F, -8F);
		box59.rotateAngleX = -6.1086523819801535F;

		box6 = new ModelRendererTurbo(this, 36, 27, 256, 128);
		box6.addBox(0F, 0F, 0F, 14, 5, 1);
		box6.setPosition(7F, 1F, 5F);

		box60 = new ModelRendererTurbo(this, 198, 0, 256, 128);
		box60.addBox(0F, 0F, 0F, 7, 5, 22);
		box60.setPosition(21F, 26F, -11F);

		box61 = new ModelRendererTurbo(this, 242, 74, 256, 128);
		box61.addBox(0F, 0F, 0F, 1, 18, 4);
		box61.setPosition(-28F, 11F, 7F);
		box61.rotateAngleY = -3.141592653589793F;

		box62 = new ModelRendererTurbo(this, 175, 62, 256, 128);
		box62.addBox(0F, 0F, 0F, 5, 2, 14);
		box62.setPosition(-16F, 10F, -10F);

		box63 = new ModelRendererTurbo(this, 189, 12, 256, 128);
		box63.addBox(0F, 0F, 0F, 8, 7, 0);
		box63.setPosition(-18F, 0F, -5F);

		box7 = new ModelRendererTurbo(this, 0, 0, 256, 128);
		box7.addBox(0F, 0F, 0F, 1, 8, 1);
		box7.setPosition(21F, 1F, -8F);
		box7.rotateAngleX = -6.1086523819801535F;

		box8 = new ModelRendererTurbo(this, 3, 27, 256, 128);
		box8.addBox(0F, 0F, 0F, 14, 5, 1);
		box8.setPosition(7F, 1F, -6F);

		box9 = new ModelRendererTurbo(this, 0, 89, 256, 128);
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
		box57.render(f5);
		box58.render(f5);
		box59.render(f5);
		box6.render(f5);
		box60.render(f5);
		box61.render(f5);
		box62.render(f5);
		box63.render(f5);
		box7.render(f5);
		box8.render(f5);
		box9.render(f5);
		
		if (ClientProxy.isHoliday()) {
			GL11.glPushMatrix();
			GL11.glTranslatef(-0.6f, 0.8f, -0.72f);
			//lights.render(5);
			GL11.glPopMatrix();
			
			GL11.glPushMatrix();
			GL11.glTranslatef(0.6f, 0.8f, -0.72f);
			//lights.render(5);
			GL11.glPopMatrix();
			
			GL11.glPushMatrix();
			GL11.glTranslatef(-0.6f, 0.8f, 0.72f);
			GL11.glRotatef(-180f, 0, 1, 0);
			//lights.render(5);
			GL11.glPopMatrix();
			
			GL11.glPushMatrix();
			GL11.glTranslatef(0.6f, 0.8f, 0.72f);
			GL11.glRotatef(-180f, 0, 1, 0);
			//lights.render(5);
			GL11.glPopMatrix();
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {}
}