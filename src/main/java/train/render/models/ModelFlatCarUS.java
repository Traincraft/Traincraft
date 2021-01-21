package train.render.models;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import train.core.ClientProxy;
import train.render.CustomModelRenderer;
import train.render.models.blocks.ModelPresent;

public class ModelFlatCarUS extends ModelBase {
	
	private ModelPresent present;
	
	public CustomModelRenderer box;
	public CustomModelRenderer box1;
	public CustomModelRenderer box10;
	public CustomModelRenderer box11;
	public CustomModelRenderer box12;
	public CustomModelRenderer box13;
	public CustomModelRenderer box14;
	public CustomModelRenderer box15;
	public CustomModelRenderer box2;
	public CustomModelRenderer box23;
	public CustomModelRenderer box24;
	public CustomModelRenderer box25;
	public CustomModelRenderer box3;
	public CustomModelRenderer box4;
	public CustomModelRenderer box5;
	public CustomModelRenderer box8;
	public CustomModelRenderer box9;

	public ModelFlatCarUS() {
		
		present = new ModelPresent();
		
		box = new CustomModelRenderer(this, 84, 7, 128, 128);
		box.addBox(0F, 0F, 0F, 4, 3, 3);
		box.setPosition(13F, 1F, -7F);

		box1 = new CustomModelRenderer(this, 7, 13, 128, 128);
		box1.addBox(0F, 0F, 0F, 7, 3, 4);
		box1.setPosition(23F, 6F, -2F);

		box10 = new CustomModelRenderer(this, 84, 7, 128, 128);
		box10.addBox(0F, 0F, 0F, 2, 2, 10);
		box10.setPosition(-12F, 2F, -5F);

		box11 = new CustomModelRenderer(this, 84, 7, 128, 128);
		box11.addBox(0F, 0F, 0F, 2, 2, 10);
		box11.setPosition(-22F, 2F, -5F);

		box12 = new CustomModelRenderer(this, 84, 7, 128, 128);
		box12.addBox(0F, 0F, 0F, 4, 3, 3);
		box12.setPosition(-17F, 1F, 4F);

		box13 = new CustomModelRenderer(this, 84, 7, 128, 128);
		box13.addBox(0F, 0F, 0F, 4, 3, 3);
		box13.setPosition(-17F, 1F, -7F);

		box14 = new CustomModelRenderer(this, 41, 53, 128, 128);
		box14.addBox(0F, 0F, 0F, 18, 2, 1);
		box14.setPosition(-9F, 4F, -9F);

		box15 = new CustomModelRenderer(this, 41, 53, 128, 128);
		box15.addBox(0F, 0F, 0F, 18, 2, 1);
		box15.setPosition(-9F, 4F, 8F);

		box2 = new CustomModelRenderer(this, 0, 85, 128, 128);
		box2.addBox(0F, 0F, 0F, 48, 7, 12);
		box2.setPosition(-24F, 0F, -6F);

		box23 = new CustomModelRenderer(this, 6, 15, 128, 128);
		box23.addBox(0F, 0F, 0F, 7, 3, 4);
		box23.setPosition(-30F, 6F, -2F);

		box24 = new CustomModelRenderer(this, 0, 60, 128, 128);
		box24.addBox(0F, 0F, 0F, 46, 3, 18);
		box24.setPosition(-23F, 6F, -9F);

		box25 = new CustomModelRenderer(this, 3, 109, 128, 128);
		box25.addBox(0F, 0F, 0F, 48, 7, 10);
		box25.setPosition(-24F, 0F, -5F);

		box3 = new CustomModelRenderer(this, 84, 7, 128, 128);
		box3.addBox(0F, 0F, 0F, 2, 2, 10);
		box3.setPosition(20F, 2F, -5F);

		box4 = new CustomModelRenderer(this, 22, 7, 128, 128);
		box4.addBox(0F, 0F, 0F, 10, 2, 8);
		box4.setPosition(-21F, 4F, -4F);

		box5 = new CustomModelRenderer(this, 84, 7, 128, 128);
		box5.addBox(0F, 0F, 0F, 2, 2, 10);
		box5.setPosition(10F, 2F, -5F);

		box8 = new CustomModelRenderer(this, 84, 7, 128, 128);
		box8.addBox(0F, 0F, 0F, 4, 3, 3);
		box8.setPosition(13F, 1F, 4F);

		box9 = new CustomModelRenderer(this, 22, 7, 128, 128);
		box9.addBox(0F, 0F, 0F, 10, 2, 8);
		box9.setPosition(11F, 4F, -4F);
		bodyModel=new ModelRendererTurbo[]{box,
				box1,box2,box3,box4,box5,box8,box9,
				box10,box11,box12,box13,box14,box15,box23,box24,box25
		};

		fixRotation(bodyModel);

	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		
		if (ClientProxy.isHoliday()) {
    		GL11.glPushMatrix();
    		GL11.glTranslatef(0, 0.9f, 0);
    		GL11.glScalef(0.9f, 0.9f, 0.9f);
    		GL11.glRotatef(-15, 0, 1, 0);
    		present.render(0xffa7c05a);
    		GL11.glPopMatrix();
    		
    		GL11.glPushMatrix();
    		GL11.glTranslatef(-0.98f, 0.88f, -0.1f);
    		GL11.glScalef(0.8f, 0.8f, 0.8f);
    		GL11.glRotatef(45, 0, 1, 0);
    		present.render(0xff5a80c0);
    		GL11.glPopMatrix();
    		
    		GL11.glPushMatrix();
    		GL11.glTranslatef(0.98f, 0.88f, 0);
    		GL11.glScalef(0.8f, 0.8f, 0.8f);
    		GL11.glRotatef(45, 0, 1, 0);
    		present.render(0xffc05a9d);
    		GL11.glPopMatrix();
		}

	}

}