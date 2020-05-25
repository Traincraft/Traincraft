package train.client.render.models;

import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import train.client.core.ClientProxy;
import train.client.render.ModelRendererTurbo;

public class ModelFlatCar extends ModelBase {
	
	//private ModelPresent present;
	
	public ModelRendererTurbo box;
	public ModelRendererTurbo box0;
	public ModelRendererTurbo box1;
	public ModelRendererTurbo box15;
	public ModelRendererTurbo box16;
	public ModelRendererTurbo box17;
	public ModelRendererTurbo box18;
	public ModelRendererTurbo box19;
	public ModelRendererTurbo box2;
	public ModelRendererTurbo box21;
	public ModelRendererTurbo box25;
	public ModelRendererTurbo box3;
	public ModelRendererTurbo box4;
	public ModelRendererTurbo box5;
	public ModelRendererTurbo box6;
	public ModelRendererTurbo box7;
	public ModelRendererTurbo box8;
	public ModelRendererTurbo box9;

	public ModelFlatCar() {
		
		//present = new ModelPresent();
		
		box = new ModelRendererTurbo(this, 1, 24, 128, 256);
		box.addBox(0F, 0F, 0F, 9, 4, 18);
		box.setPosition(-5F, 1F, -9F);
		box0 = new ModelRendererTurbo(this, 2, 66, 128, 256);
		box0.addBox(0F, 0F, 0F, 6, 6, 1);
		box0.setPosition(-20F, -1F, -7F);
		box1 = new ModelRendererTurbo(this, 2, 66, 128, 256);
		box1.addBox(0F, 0F, 0F, 6, 6, 1);
		box1.setPosition(-13F, -1F, -7F);
		box15 = new ModelRendererTurbo(this, 1, 96, 128, 256);
		box15.addBox(0F, 0F, 0F, 15, 4, 12);
		box15.setPosition(-21F, 1F, -6F);
		box16 = new ModelRendererTurbo(this, 3, 118, 128, 256);
		box16.addBox(0F, 0F, 0F, 9, 2, 1);
		box16.setPosition(-18F, 1F, -8F);
		box17 = new ModelRendererTurbo(this, 3, 118, 128, 256);
		box17.addBox(0F, 0F, 0F, 9, 2, 1);
		box17.setPosition(-18F, 1F, 7F);
		box18 = new ModelRendererTurbo(this, 3, 118, 128, 256);
		box18.addBox(0F, 0F, 0F, 9, 2, 1);
		box18.setPosition(8F, 1F, 7F);
		box19 = new ModelRendererTurbo(this, 3, 118, 128, 256);
		box19.addBox(0F, 0F, 0F, 9, 2, 1);
		box19.setPosition(8F, 1F, -8F);
		box2 = new ModelRendererTurbo(this, 2, 66, 128, 256);
		box2.addBox(0F, 0F, 0F, 6, 6, 1);
		box2.setPosition(-13F, -1F, 6F);
		box21 = new ModelRendererTurbo(this, 7, 77, 128, 256);
		box21.addBox(0F, 0F, 0F, 3, 2, 2);
		box21.setPosition(20F, 2F, -1F);
		box25 = new ModelRendererTurbo(this, 36, 70, 128, 256);
		box25.addBox(0F, 0F, 0F, 4, 2, 2);
		box25.setPosition(-25F, 2F, -1F);
		box3 = new ModelRendererTurbo(this, 2, 66, 128, 256);
		box3.addBox(0F, 0F, 0F, 6, 6, 1);
		box3.setPosition(-20F, -1F, 6F);
		box4 = new ModelRendererTurbo(this, 2, 66, 128, 256);
		box4.addBox(0F, 0F, 0F, 6, 6, 1);
		box4.setPosition(13F, -1F, -7F);
		box5 = new ModelRendererTurbo(this, 2, 66, 128, 256);
		box5.addBox(0F, 0F, 0F, 6, 6, 1);
		box5.setPosition(6F, -1F, -7F);
		box6 = new ModelRendererTurbo(this, 2, 66, 128, 256);
		box6.addBox(0F, 0F, 0F, 6, 6, 1);
		box6.setPosition(6F, -1F, 6F);
		box7 = new ModelRendererTurbo(this, 2, 66, 128, 256);
		box7.addBox(0F, 0F, 0F, 6, 6, 1);
		box7.setPosition(13F, -1F, 6F);
		box8 = new ModelRendererTurbo(this, 1, 96, 128, 256);
		box8.addBox(0F, 0F, 0F, 15, 4, 12);
		box8.setPosition(5F, 1F, -6F);
		box9 = new ModelRendererTurbo(this, 0, 1, 128, 256);
		box9.addBox(0F, 0F, 0F, 43, 2, 20);
		box9.setPosition(-22F, 5F, -10F);

	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		box.render(f5);
		box0.render(f5);
		box1.render(f5);
		box15.render(f5);
		box16.render(f5);
		box17.render(f5);
		box18.render(f5);
		box19.render(f5);
		box2.render(f5);
		box21.render(f5);
		box25.render(f5);
		box3.render(f5);
		box4.render(f5);
		box5.render(f5);
		box6.render(f5);
		box7.render(f5);
		box8.render(f5);
		box9.render(f5);
		
		if (ClientProxy.isHoliday()) {
    		GL11.glPushMatrix();
    		GL11.glTranslatef(0, 0.75f, 0);
    		GL11.glRotatef(-35, 0, 1, 0);
    		GL11.glScalef(0.8f, 0.8f, 0.8f);
    		//present.render(0xffb94747);
    		GL11.glPopMatrix();
    		
    		GL11.glPushMatrix();
    		GL11.glTranslatef(-0.9f, 0.67f, 0.18f);
    		GL11.glScalef(0.6f, 0.6f, 0.6f);
    		GL11.glRotatef(65, 0, 1, 0);
    		//present.render(0xff65b947);
    		GL11.glPopMatrix();
    		
    		GL11.glPushMatrix();
    		GL11.glTranslatef(-0.7f, 0.6f, -0.3f);
    		GL11.glScalef(0.4f, 0.4f, 0.4f);
    		GL11.glRotatef(70, 0, 1, 0);
    		//present.render(0xffb97f47);
    		GL11.glPopMatrix();
    		
    		GL11.glPushMatrix();
    		GL11.glTranslatef(0.84f, 0.67f, -0.18f);
    		GL11.glScalef(0.6f, 0.6f, 0.6f);
    		GL11.glRotatef(25, 0, 1, 0);
    		//present.render(0xff47b9aa);
    		GL11.glPopMatrix();
    		
    		GL11.glPushMatrix();
    		GL11.glTranslatef(0.6f, 0.6f, 0.36f);
    		GL11.glScalef(0.4f, 0.4f, 0.4f);
    		GL11.glRotatef(70, 0, 1, 0);
    		//present.render(0xff9547b9);
    		GL11.glPopMatrix();
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {}
}