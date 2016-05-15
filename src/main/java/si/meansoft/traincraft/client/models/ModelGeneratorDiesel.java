/*******************************************************************************
 * Copyright (c) 2013 Spitfire4466. All rights reserved.
 * 
 * @name TrainCraft
 * @author Spitfire4466
 ******************************************************************************/

package si.meansoft.traincraft.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import org.lwjgl.opengl.GL11;

public class ModelGeneratorDiesel extends ModelBase{

	public ModelRenderer box;
	public ModelRenderer box0;
	public ModelRenderer box1;
	public ModelRenderer box10;
	public ModelRenderer box11;
	public ModelRenderer box12;
	public ModelRenderer box13;
	public ModelRenderer box2;
	public ModelRenderer box3;
	public ModelRenderer box4;
	public ModelRenderer box43;
	public ModelRenderer box44;
	public ModelRenderer box45;
	public ModelRenderer box46;
	public ModelRenderer box47;
	public ModelRenderer box48;
	public ModelRenderer box49;
	public ModelRenderer box5;
	public ModelRenderer box50;
	public ModelRenderer box51;
	public ModelRenderer box54;
	public ModelRenderer box6;
	public ModelRenderer box7;
	public ModelRenderer box8;
	public ModelRenderer box9;

	public ModelGeneratorDiesel(float scale) {
		box = new ModelRenderer(this, 1, 46);
		box.setTextureSize(64, 64);
		box.addBox(-8F, 0F, -8F, 1, 2, 16, scale);

		box0 = new ModelRenderer(this, 20, 44);
		box0.setTextureSize(64, 64);
		box0.addBox(4F, 2F, -8F, 2, 1, 16, scale);

		box1 = new ModelRenderer(this, 9, 0);
		box1.setTextureSize(64, 64);
		box1.addBox(-5F, 2F, -7F, 2, 8, 8, scale);

		box10 = new ModelRenderer(this, 1, 46);
		box10.setTextureSize(64, 64);
		box10.addBox(7F, 0F, -8F, 1, 2, 16, scale);

		box11 = new ModelRenderer(this, 1, 37);
		box10.setTextureSize(64, 64);
		box11.addBox(-7F, 0F, -8F, 14, 2, 1, scale);

		box12 = new ModelRenderer(this, 1, 37);
		box10.setTextureSize(64, 64);
		box12.addBox(-7F, 0F, 7F, 14, 2, 1, scale);

		box13 = new ModelRenderer(this, 20, 44);
		box10.setTextureSize(64, 64);
		box13.addBox(-3F, 2F, -8F, 2, 1, 16, scale);

		box2 = new ModelRenderer(this, 31, 0);
		box10.setTextureSize(64, 64);
		box2.addBox(-7F, 4F, -8F, 3, 4, 10, scale);
		box2.rotateAngleX = -5.497787143782138F;

		box3 = new ModelRenderer(this, 31, 0);
		box10.setTextureSize(64, 64);
		box3.addBox(-7F, 4F, -8F, 3, 4, 10,scale);

		box4 = new ModelRenderer(this, 0, 48);
		box10.setTextureSize(64, 64);
		box4.addBox(-8F, 3F, -6F, 2, 6, 6,scale);

		box43 = new ModelRenderer(this, 31, 0);
		box10.setTextureSize(64, 64);
		box43.addBox(-7F, 4F, -2F, 3, 4, 10,scale);
		box43.rotateAngleX = -1.5707963267948966F;

		box44 = new ModelRenderer(this, 0, 25);
		box10.setTextureSize(64, 64);
		box44.addBox(-3F, 3F, -6F, 9, 5, 6,scale);

		box45 = new ModelRenderer(this, 31, 39);
		box10.setTextureSize(64, 64);
		box45.addBox(-2F, 9F, -7F, 7, 2, 2,scale);

		box46 = new ModelRenderer(this, 37, 27);
		box10.setTextureSize(64, 64);
		box46.addBox(3F, 8F, -5F, 9, 6, 4,scale);

		box47 = new ModelRenderer(this, 23, 1);
		box10.setTextureSize(64, 64);
		box47.addBox(-2F, 11F, -1F, 7, 2, 1,scale);

		box48 = new ModelRenderer(this, 21, 42);
		box10.setTextureSize(64, 64);
		box48.addBox(-1F, 12F, -1F, 2, 4, 2,scale);

		box49 = new ModelRenderer(this, 8, 17);
		box10.setTextureSize(64, 64);
		box49.addBox(-2F, 16F, -2F, 4, 3, 4,scale);
		box49.rotateAngleY = -0.7853981633974483F;

		box5 = new ModelRenderer(this, 1, 27);
		box10.setTextureSize(64, 64);
		box5.addBox(1F, 8F, 7F, 1, 3, 1,scale);
		box5.rotateAngleY = -0.7853981633974483F;

		box50 = new ModelRenderer(this, 0, 41);
		box10.setTextureSize(64, 64);
		box50.addBox(1F, 6F, -1F, 5, 3, 3,scale);

		box51 = new ModelRenderer(this, 40, 38);
		box10.setTextureSize(64, 64);
		box51.addBox(6F, 5F, -8F, 2, 10, 10,scale);

		box54 = new ModelRenderer(this, 1, 27);
		box10.setTextureSize(64, 64);
		box54.addBox(5F, 13F, -6F, 1, 3, 1,scale);
		box54.rotateAngleY = -0.7853981633974483F;

		box6 = new ModelRenderer(this, 0, 0);
		box10.setTextureSize(64, 64);
		box6.addBox(2F, 10F, -8F, 2, 16, 2,scale);

		box7 = new ModelRenderer(this, 49, 1);
		box10.setTextureSize(64, 64);
		box7.addBox(-8F, 11F, -6F, 4, 4, 3,scale);

		box8 = new ModelRenderer(this, 33, 15);
		box10.setTextureSize(64, 64);
		box8.addBox(-4F, 3F, 3F, 11, 7, 4,scale);

		box9 = new ModelRenderer(this, 31, 0);
		box10.setTextureSize(64, 64);
		box9.addBox(-7F, 4F, -8F, 3, 4, 10,scale);
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
