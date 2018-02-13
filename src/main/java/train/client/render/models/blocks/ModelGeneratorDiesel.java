/*******************************************************************************
 * Copyright (c) 2013 Spitfire4466. All rights reserved.
 * 
 * @name TrainCraft
 * @author Spitfire4466
 ******************************************************************************/

package train.client.render.models.blocks;

import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import train.client.render.CustomModelRenderer;

public class ModelGeneratorDiesel extends ModelBase {

	public CustomModelRenderer box;
	public CustomModelRenderer box0;
	public CustomModelRenderer box1;
	public CustomModelRenderer box10;
	public CustomModelRenderer box11;
	public CustomModelRenderer box12;
	public CustomModelRenderer box13;
	public CustomModelRenderer box2;
	public CustomModelRenderer box3;
	public CustomModelRenderer box4;
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
	public CustomModelRenderer box54;
	public CustomModelRenderer box6;
	public CustomModelRenderer box7;
	public CustomModelRenderer box8;
	public CustomModelRenderer box9;


	public ModelGeneratorDiesel(float scale) {
		box = new CustomModelRenderer(this, 1, 46, 64, 64);
		box.addBox(0F, 0F, 0F, 1, 2, 16,scale);
		box.setPosition(-8F, 0F, -8F);

		box0 = new CustomModelRenderer(this, 20, 44, 64, 64);
		box0.addBox(0F, 0F, 0F, 2, 1, 16,scale);
		box0.setPosition(4F, 2F, -8F);

		box1 = new CustomModelRenderer(this, 9, 0, 64, 64);
		box1.addBox(0F, -2F, -2F, 2, 8, 8,scale);
		box1.setPosition(-5F, 4F, -5F);

		box10 = new CustomModelRenderer(this, 1, 46, 64, 64);
		box10.addBox(0F, 0F, 0F, 1, 2, 16,scale);
		box10.setPosition(7F, 0F, -8F);

		box11 = new CustomModelRenderer(this, 1, 37, 64, 64);
		box11.addBox(0F, 0F, 0F, 14, 2, 1,scale);
		box11.setPosition(-7F, 0F, -8F);

		box12 = new CustomModelRenderer(this, 1, 37, 64, 64);
		box12.addBox(0F, 0F, 0F, 14, 2, 1,scale);
		box12.setPosition(-7F, 0F, 7F);

		box13 = new CustomModelRenderer(this, 20, 44, 64, 64);
		box13.addBox(0F, 0F, 0F, 2, 1, 16,scale);
		box13.setPosition(-3F, 2F, -8F);

		box2 = new CustomModelRenderer(this, 31, 0, 64, 64);
		box2.addBox(1F, -2F, -5F, 3, 4, 10,scale);
		box2.setPosition(-8F, 6F, -3F);
		box2.rotateAngleX = -5.497787143782138F;

		box3 = new CustomModelRenderer(this, 31, 0, 64, 64);
		box3.addBox(1F, 0F, 0F, 3, 4, 10,scale);
		box3.setPosition(-8F, 4F, -8F);

		box4 = new CustomModelRenderer(this, 0, 48, 64, 64);
		box4.addBox(0F, -2F, -2F, 2, 6, 6,scale);
		box4.setPosition(-8F, 5F, -4F);

		box43 = new CustomModelRenderer(this, 31, 0, 64, 64);
		box43.addBox(1F, -2F, -5F, 3, 4, 10,scale);
		box43.setPosition(-8F, 6F, -3F);
		box43.rotateAngleX = -1.5707963267948966F;

		box44 = new CustomModelRenderer(this, 0, 25, 64, 64);
		box44.addBox(1F, 0F, 0F, 9, 5, 6,scale);
		box44.setPosition(-4F, 3F, -6F);

		box45 = new CustomModelRenderer(this, 31, 39, 64, 64);
		box45.addBox(0F, 0F, 0F, 7, 2, 2,scale);
		box45.setPosition(-2F, 9F, -7F);

		box46 = new CustomModelRenderer(this, 37, 27, 64, 64);
		box46.addBox(1F, 0F, 0F, 9, 6, 4,scale);
		box46.setPosition(-4F, 8F, -5F);

		box47 = new CustomModelRenderer(this, 23, 1, 64, 64);
		box47.addBox(0F, 0F, 0F, 7, 2, 1,scale);
		box47.setPosition(-2F, 11F, -1F);

		box48 = new CustomModelRenderer(this, 21, 42, 64, 64);
		box48.addBox(0F, 0F, 0F, 2, 4, 2,scale);
		box48.setPosition(-1F, 12F, -1F);

		box49 = new CustomModelRenderer(this, 8, 17, 64, 64);
		box49.addBox(-2F, 0F, -2F, 4, 3, 4,scale);
		box49.setPosition(0F, 16F, 0F);
		box49.rotateAngleY = -0.7853981633974483F;

		box5 = new CustomModelRenderer(this, 1, 27, 64, 64);
		box5.addBox(-2F, 0F, -2F, 1, 3, 1,scale);
		box5.setPosition(3F, 8F, 7F);
		box5.rotateAngleY = -0.7853981633974483F;

		box50 = new CustomModelRenderer(this, 0, 41, 64, 64);
		box50.addBox(0F, 0F, 0F, 5, 3, 3,scale);
		box50.setPosition(1F, 6F, -1F);

		box51 = new CustomModelRenderer(this, 40, 38, 64, 64);
		box51.addBox(0F, 0F, 0F, 2, 10, 10,scale);
		box51.setPosition(6F, 5F, -8F);

		box54 = new CustomModelRenderer(this, 1, 27, 64, 64);
		box54.addBox(-2F, 0F, -2F, 1, 3, 1,scale);
		box54.setPosition(7F, 13F, -4F);
		box54.rotateAngleY = -0.7853981633974483F;

		box6 = new CustomModelRenderer(this, 0, 0, 64, 64);
		box6.addBox(0F, 0F, -1F, 2, 16, 2,scale);
		box6.setPosition(2F, 10F, -7F);

		box7 = new CustomModelRenderer(this, 49, 1, 64, 64);
		box7.addBox(0F, -2F, -2F, 4, 4, 3,scale);
		box7.setPosition(-8F, 13F, -4F);

		box8 = new CustomModelRenderer(this, 33, 15, 64, 64);
		box8.addBox(0F, 0F, 0F, 11, 7, 4,scale);
		box8.setPosition(-4F, 3F, 3F);

		box9 = new CustomModelRenderer(this, 31, 0, 64, 64);
		box9.addBox(1F, -2F, -5F, 3, 4, 10,scale);
		box9.setPosition(-8F, 6F, -3F);
		box9.rotateAngleX = -0.7853981633974483F;

	}

	public void render(float f5, int meta) {
		if (meta != -1) {
			switch (meta) {
			case 0:
				GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
			case 1:
				GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
			case 2:
				GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
			case 3:
				GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
			}
		}
		box.render(f5);
		box0.render(f5);
		box1.render(f5);
		box10.render(f5);
		box11.render(f5);
		box12.render(f5);
		box13.render(f5);
		box2.render(f5);
		box3.render(f5);
		box4.render(f5);
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
		box54.render(f5);
		box6.render(f5);
		box7.render(f5);
		box8.render(f5);
		box9.render(f5);

	}

	public void render2(float f5) {
		box.render(f5);
		box0.render(f5);
		box1.render(f5);
		box10.render(f5);
		box11.render(f5);
		box12.render(f5);
		box13.render(f5);
		box2.render(f5);
		box3.render(f5);
		box4.render(f5);
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
		box54.render(f5);
		box6.render(f5);
		box7.render(f5);
		box8.render(f5);
		box9.render(f5);

	}
}
