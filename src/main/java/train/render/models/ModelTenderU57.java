package train.render.models;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;
import net.minecraft.entity.Entity;
import train.render.CustomModelRenderer;

public class ModelTenderU57 extends ModelBase {

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
	public CustomModelRenderer box3;
	public CustomModelRenderer box35;
	public CustomModelRenderer box39;
	public CustomModelRenderer box4;
	public CustomModelRenderer box47;
	public CustomModelRenderer box5;
	public CustomModelRenderer box6;
	public CustomModelRenderer box7;
	public CustomModelRenderer box8;
	public CustomModelRenderer box9;
	
	public ModelTenderU57() {
		box = new CustomModelRenderer(this, 1, 106, 256, 128);
		box.addBox(0F, 0F, 0F, 1, 10, 10);
		box.setPosition(-7F, 1F, 8F);

		box0 = new CustomModelRenderer(this, 1, 106, 256, 128);
		box0.addBox(0F, 0F, 0F, 1, 10, 10);
		box0.setPosition(-7F, 1F, -18F);

		box1 = new CustomModelRenderer(this, 1, 106, 256, 128);
		box1.addBox(-1F, 0F, 0F, 1, 10, 10);
		box1.setPosition(7F, 1F, 8F);

		box10 = new CustomModelRenderer(this, 28, 117, 256, 128);
		box10.addBox(0F, 0F, 0F, 4, 4, 5);
		box10.setPosition(-2F, 6F, 19F);

		box11 = new CustomModelRenderer(this, 52, 76, 256, 128);
		box11.addBox(-6F, 3F, -12F, 16, 10, 40);
		box11.setPosition(-2F, 0F, -8F);

		box12 = new CustomModelRenderer(this, 71, 86, 256, 128);
		box12.addBox(0F, 0F, 0F, 1, 13, 5);
		box12.setPosition(10F, 13F, 18F);

		box13 = new CustomModelRenderer(this, 71, 86, 256, 128);
		box13.addBox(0F, 0F, 0F, 1, 13, 5);
		box13.setPosition(-11F, 13F, 18F);

		box14 = new CustomModelRenderer(this, 174, 77, 256, 128);
		box14.addBox(0F, 0F, 0F, 1, 7, 25);
		box14.setPosition(-11F, 28F, -10F);

		box15 = new CustomModelRenderer(this, 43, 98, 256, 128);
		box15.addBox(-4F, 0F, -2F, 4, 4, 2);
		box15.setPosition(-8F, 13F, -26F);
		box15.rotateAngleY = -3.141592653589793F;

		box16 = new CustomModelRenderer(this, 43, 98, 256, 128);
		box16.addBox(0F, 0F, -2F, 4, 4, 2);
		box16.setPosition(8F, 13F, -26F);
		box16.rotateAngleY = -3.141592653589793F;

		box17 = new CustomModelRenderer(this, 127, 102, 256, 128);
		box17.addBox(0F, 0F, 0F, 20, 7, 1);
		box17.setPosition(-10F, 28F, -10F);

		box18 = new CustomModelRenderer(this, 176, 77, 256, 128);
		box18.addBox(0F, 0F, 0F, 1, 7, 25);
		box18.setPosition(10F, 28F, -10F);

		box19 = new CustomModelRenderer(this, 127, 102, 256, 128);
		box19.addBox(0F, 0F, 0F, 20, 7, 1);
		box19.setPosition(-10F, 28F, 14F);

		box2 = new CustomModelRenderer(this, 1, 106, 256, 128);
		box2.addBox(-1F, 0F, 0F, 1, 10, 10);
		box2.setPosition(7F, 1F, -18F);

		box20 = new CustomModelRenderer(this, 65, 20, 256, 128);
		box20.addBox(0F, 0F, 0F, 20, 1, 23);
		box20.setPosition(-10F, 30F, -9F);

		box21 = new CustomModelRenderer(this, 131, 73, 256, 128);
		box21.addBox(0F, 0F, 0F, 1, 18, 4);
		box21.setPosition(-4F, 13F, -18F);
		box21.rotateAngleY = -1.5707963267948966F;

		box3 = new CustomModelRenderer(this, 170, 113, 256, 128);
		box3.addBox(0F, 0F, 0F, 22, 4, 9);
		box3.setPosition(-11F, 9F, -25F);

		box35 = new CustomModelRenderer(this, 137, 18, 256, 128);
		box35.addBox(0F, 0F, 0F, 22, 15, 35);
		box35.setPosition(-11F, 13F, -17F);

		box39 = new CustomModelRenderer(this, 24, 113, 256, 128);
		box39.addBox(0F, 0F, 0F, 4, 4, 9);
		box39.setPosition(-2F, 6F, -28F);

		box4 = new CustomModelRenderer(this, 204, 85, 256, 128);
		box4.addBox(0F, 0F, 0F, 18, 4, 4);
		box4.setPosition(-9F, 4F, -15F);

		box47 = new CustomModelRenderer(this, 43, 98, 256, 128);
		box47.addBox(-2F, 0F, -2F, 4, 4, 2);
		box47.setPosition(0F, 29F, -12F);
		box47.rotateAngleY = -3.141592653589793F;

		box5 = new CustomModelRenderer(this, 1, 106, 256, 128);
		box5.addBox(-1F, 0F, 0F, 1, 10, 10);
		box5.setPosition(7F, 1F, -5F);

		box6 = new CustomModelRenderer(this, 1, 106, 256, 128);
		box6.addBox(0F, 0F, 0F, 1, 10, 10);
		box6.setPosition(-7F, 1F, -5F);

		box7 = new CustomModelRenderer(this, 204, 85, 256, 128);
		box7.addBox(0F, 0F, 0F, 18, 4, 4);
		box7.setPosition(-9F, 4F, -2F);

		box8 = new CustomModelRenderer(this, 204, 85, 256, 128);
		box8.addBox(0F, 0F, 0F, 18, 4, 4);
		box8.setPosition(-9F, 4F, 11F);

		box9 = new CustomModelRenderer(this, 170, 113, 256, 128);
		box9.addBox(0F, 0F, 0F, 22, 4, 9);
		box9.setPosition(-11F, 9F, 16F);

		bodyModel=new ModelRendererTurbo[]{box,
				box0,box1,box2,box3,box4,box5,box6,box7,box8,box9,
				box10,box11,box12,box13,box14,box15,box16,box17,box18,box19,
				box20,box21,box35,box39,box47
		};

		fixRotation(bodyModel);
	}

}
