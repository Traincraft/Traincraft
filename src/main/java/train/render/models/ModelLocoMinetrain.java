package train.render.models;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import train.render.CustomModelRenderer;

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

		bodyModel=new ModelRendererTurbo[]{box,
				box0,box1,box2,box3,box4,box5,box6,box7,box8,box9,
				box10,box11,box12,box13,box14,box15,box16,
				box20,box21,box23,box24,box25
		};

		fixRotation(bodyModel);
	}

}