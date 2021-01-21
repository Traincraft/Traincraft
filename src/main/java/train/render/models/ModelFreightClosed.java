package train.render.models;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;
import train.render.CustomModelRenderer;

public class ModelFreightClosed extends ModelBase {

	public ModelFreightClosed() {

		bogey = new CustomModelRenderer(this, 2, 9, 256, 128);
		bogey.addBox(0F, 0F, 0F, 1, 6, 14);
		bogey.setPosition(-6F, 0F, -18F);

		bogey0 = new CustomModelRenderer(this, 2, 9, 256, 128);
		bogey0.addBox(0F, 0F, 0F, 1, 6, 14);
		bogey0.setPosition(5F, 0F, -18F);

		box = new CustomModelRenderer(this, 35, 9, 256, 128);
		box.addBox(0F, 0F, 0F, 1, 6, 14);
		box.setPosition(6F, 0F, -18F);

		box0 = new CustomModelRenderer(this, 35, 9, 256, 128);
		box0.addBox(0F, 0F, 0F, 1, 6, 14);
		box0.setPosition(-7F, 0F, -18F);

		box1 = new CustomModelRenderer(this, 35, 9, 256, 128);
		box1.addBox(0F, 0F, 0F, 1, 6, 14);
		box1.setPosition(-7F, 0F, 5F);

		box2 = new CustomModelRenderer(this, 35, 9, 256, 128);
		box2.addBox(0F, 0F, 0F, 1, 6, 14);
		box2.setPosition(6F, 0F, 5F);

		box3 = new CustomModelRenderer(this, 151, 57, 256, 128);
		box3.addBox(0F, 0F, 0F, 1, 21, 35);
		box3.setPosition(7F, 9F, -17F);

		box4 = new CustomModelRenderer(this, 115, 68, 256, 128);
		box4.addBox(0F, 0F, 0F, 14, 22, 1);
		box4.setPosition(-7F, 9F, -17F);

		box5 = new CustomModelRenderer(this, 155, 1, 256, 128);
		box5.addBox(0F, 0F, 0F, 9, 1, 37);
		box5.setPosition(0F, 31F, 19F);
		box5.rotateAngleY = 3.141592653589793F;
		box5.rotateAngleZ = 0.13962634015954636F;

		box52 = new CustomModelRenderer(this, 65, 44, 256, 128);
		box52.addBox(0F, 0F, 0F, 14, 1, 1);
		box52.setPosition(-7F, 5F, -4F);

		box53 = new CustomModelRenderer(this, 65, 44, 256, 128);
		box53.addBox(0F, 0F, 0F, 14, 1, 1);
		box53.setPosition(-7F, 5F, -19F);

		box54 = new CustomModelRenderer(this, 31, 33, 256, 128);
		box54.addBox(0F, 0F, 0F, 4, 2, 4);
		box54.setPosition(-2F, 7F, 19F);

		box55 = new CustomModelRenderer(this, 2, 33, 256, 128);
		box55.addBox(0F, 0F, 0F, 4, 3, 4);
		box55.setPosition(-2F, 4F, -13F);

		box6 = new CustomModelRenderer(this, 189, 68, 256, 128);
		box6.addBox(0F, 0F, 0F, 14, 22, 1);
		box6.setPosition(-7F, 9F, 17F);

		box68 = new CustomModelRenderer(this, 29, 40, 256, 128);
		box68.addBox(0F, 0F, 0F, 4, 2, 4);
		box68.setPosition(-2F, 7F, -22F);

		box7 = new CustomModelRenderer(this, 97, 0, 256, 128);
		box7.addBox(0F, 0F, 0F, 9, 1, 37);
		box7.setPosition(0F, 31F, -18F);
		box7.rotateAngleZ = -0.13962634015954636F;

		box71 = new CustomModelRenderer(this, 66, 47, 256, 128);
		box71.addBox(0F, 0F, 0F, 12, 2, 2);
		box71.setPosition(-6F, 2F, -12F);

		box72 = new CustomModelRenderer(this, 64, 44, 256, 128);
		box72.addBox(0F, 0F, 0F, 14, 1, 1);
		box72.setPosition(-7F, 5F, 4F);

		box73 = new CustomModelRenderer(this, 65, 44, 256, 128);
		box73.addBox(0F, 0F, 0F, 14, 1, 1);
		box73.setPosition(-7F, 5F, 19F);

		box78 = new CustomModelRenderer(this, 77, 57, 256, 128);
		box78.addBox(0F, 0F, 0F, 1, 21, 35);
		box78.setPosition(-8F, 9F, -17F);

		box79 = new CustomModelRenderer(this, 3, 89, 256, 128);
		box79.addBox(0F, 0F, 0F, 18, 2, 37);
		box79.setPosition(-9F, 7F, -18F);

		box8 = new CustomModelRenderer(this, 2, 33, 256, 128);
		box8.addBox(0F, 0F, 0F, 4, 3, 4);
		box8.setPosition(-2F, 4F, 10F);

		box80 = new CustomModelRenderer(this, 2, 9, 256, 128);
		box80.addBox(0F, 0F, 0F, 1, 6, 14);
		box80.setPosition(-6F, 0F, 5F);

		box81 = new CustomModelRenderer(this, 2, 9, 256, 128);
		box81.addBox(0F, 0F, 0F, 1, 6, 14);
		box81.setPosition(5F, 0F, 5F);

		box82 = new CustomModelRenderer(this, 66, 47, 256, 128);
		box82.addBox(0F, 0F, 0F, 12, 2, 2);
		box82.setPosition(-6F, 2F, 11F);
		bodyModel=new ModelRendererTurbo[]{box,
				box0,box1,box2,box3,box4,box5,box6,box7,box8,box52,box53,box54,box55,box68,box71,box72,box73
				,box78,box79,box80,box81,box82,bogey,bogey0
		};

		fixRotation(bodyModel);

	}

    public CustomModelRenderer bogey;
	public CustomModelRenderer bogey0;
	public CustomModelRenderer box;
	public CustomModelRenderer box0;
	public CustomModelRenderer box1;
	public CustomModelRenderer box2;
	public CustomModelRenderer box3;
	public CustomModelRenderer box4;
	public CustomModelRenderer box5;
	public CustomModelRenderer box52;
	public CustomModelRenderer box53;
	public CustomModelRenderer box54;
	public CustomModelRenderer box55;
	public CustomModelRenderer box6;
	public CustomModelRenderer box68;
	public CustomModelRenderer box7;
	public CustomModelRenderer box71;
	public CustomModelRenderer box72;
	public CustomModelRenderer box73;
	public CustomModelRenderer box78;
	public CustomModelRenderer box79;
	public CustomModelRenderer box8;
	public CustomModelRenderer box80;
	public CustomModelRenderer box81;
	public CustomModelRenderer box82;
}
