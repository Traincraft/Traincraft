package train.client.render.models;

import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import train.client.core.ClientProxy;
import train.client.render.CustomModelRenderer;
import train.client.render.models.blocks.ModelPresent;

public class ModelFlatCarSU extends ModelBase {
	
	private ModelPresent present;
	
	public CustomModelRenderer box;
	public CustomModelRenderer box0;
	public CustomModelRenderer box1;
	public CustomModelRenderer box14;
	public CustomModelRenderer box2;
	public CustomModelRenderer box23;
	public CustomModelRenderer box24;
	public CustomModelRenderer box25;
	public CustomModelRenderer box4;
	public CustomModelRenderer box6;
	public CustomModelRenderer box7;
	public CustomModelRenderer box9;

	public ModelFlatCarSU() {
		
		present = new ModelPresent();
		
		box = new CustomModelRenderer(this, 84, 7, 128, 128);
		box.addBox(0F, 0F, 0F, 7, 3, 14);
		box.setPosition(11F, 2F, -7F);

		box0 = new CustomModelRenderer(this, 3, 7, 128, 128);
		box0.addBox(0F, 0F, 0F, 46, 2, 16);
		box0.setPosition(-23F, 6F, -8F);

		box1 = new CustomModelRenderer(this, 7, 13, 128, 128);
		box1.addBox(0F, 0F, 0F, 6, 3, 4);
		box1.setPosition(24F, 6F, -2F);

		box14 = new CustomModelRenderer(this, 85, 8, 128, 128);
		box14.addBox(0F, 0F, 0F, 7, 3, 14);
		box14.setPosition(-18F, 2F, -7F);

		box2 = new CustomModelRenderer(this, 0, 85, 128, 128);
		box2.addBox(0F, 0F, 0F, 46, 7, 12);
		box2.setPosition(-23F, 0F, -6F);

		box23 = new CustomModelRenderer(this, 6, 15, 128, 128);
		box23.addBox(0F, 0F, 0F, 6, 3, 4);
		box23.setPosition(-30F, 6F, -2F);

		box24 = new CustomModelRenderer(this, 0, 60, 128, 128);
		box24.addBox(0F, 0F, 0F, 46, 3, 18);
		box24.setPosition(-23F, 7F, -9F);

		box25 = new CustomModelRenderer(this, 3, 109, 128, 128);
		box25.addBox(0F, 0F, 0F, 46, 7, 10);
		box25.setPosition(-23F, 0F, -5F);

		box4 = new CustomModelRenderer(this, 4, 12, 128, 128);
		box4.addBox(0F, 0F, 0F, 14, 5, 8);
		box4.setPosition(-21F, 3F, -4F);

		box6 = new CustomModelRenderer(this, 0, 32, 128, 128);
		box6.addBox(0F, 0F, 0F, 1, 6, 18);
		box6.setPosition(-24F, 6F, -9F);

		box7 = new CustomModelRenderer(this, 0, 32, 128, 128);
		box7.addBox(0F, 0F, 0F, 1, 6, 18);
		box7.setPosition(23F, 6F, -9F);

		box9 = new CustomModelRenderer(this, 22, 7, 128, 128);
		box9.addBox(0F, 0F, 0F, 14, 5, 8);
		box9.setPosition(8F, 3F, -4F);

	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		box.render(f5);
		box0.render(f5);
		box1.render(f5);
		box14.render(f5);
		box2.render(f5);
		box23.render(f5);
		box24.render(f5);
		box25.render(f5);
		box4.render(f5);
		box6.render(f5);
		box7.render(f5);
		box9.render(f5);
		
		if (ClientProxy.isHoliday()) {
			//big
    		GL11.glPushMatrix();
    		GL11.glTranslatef(0.4f, 0.86f, 0);
    		GL11.glScalef(0.6f, 0.6f, 0.6f);
    		GL11.glRotatef(15, 0, 1, 0);
    		present.render(0xffc05a5a);
    		GL11.glPopMatrix();
    		
    		GL11.glPushMatrix();
    		GL11.glTranslatef(-0.4f, 0.86f, 0);
    		GL11.glScalef(0.6f, 0.6f, 0.6f);
    		GL11.glRotatef(-5, 0, 1, 0);
    		present.render(0xffc0b05a);
    		GL11.glPopMatrix();
    		
    		//small
    		GL11.glPushMatrix();
    		GL11.glTranslatef(1, 0.77f, 0.3f);
    		GL11.glScalef(0.4f, 0.4f, 0.4f);
    		GL11.glRotatef(35, 0, 1, 0);
    		present.render(0xff287528);
    		GL11.glPopMatrix();
    		
    		GL11.glPushMatrix();
    		GL11.glTranslatef(-1, 0.77f, -0.3f);
    		GL11.glScalef(0.4f, 0.4f, 0.4f);
    		GL11.glRotatef(-70, 0, 1, 0);
    		present.render(0xff287550);
    		GL11.glPopMatrix();
    		
    		GL11.glPushMatrix();
    		GL11.glTranslatef(-1, 0.77f, 0.3f);
    		GL11.glScalef(0.4f, 0.4f, 0.4f);
    		GL11.glRotatef(125, 0, 1, 0);
    		present.render(0xff282c75);
    		GL11.glPopMatrix();
    		
    		GL11.glPushMatrix();
    		GL11.glTranslatef(1, 0.77f, -0.3f);
    		GL11.glScalef(0.4f, 0.4f, 0.4f);
    		GL11.glRotatef(-70, 0, 1, 0);
    		present.render(0xff821b1b);
    		GL11.glPopMatrix();
		}
		
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {}
}