package train.render.models;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;
import net.minecraft.entity.Entity;
import train.render.CustomModelRenderer;
import train.core.handlers.ConfigHandler;

public class ModelNormalSteamTender extends ModelBase {

	public ModelNormalSteamTender() {
		bogey = new CustomModelRenderer(this, 2, 9, 256, 128);
		bogey.addBox(0F, 0F, 0F, 1, 6, 14);
		bogey.setPosition(-6F, 0F, -16F);

		bogey0 = new CustomModelRenderer(this, 2, 9, 256, 128);
		bogey0.addBox(0F, 0F, 0F, 1, 6, 14);
		bogey0.setPosition(5F, 0F, -16F);

		box = new CustomModelRenderer(this, 35, 9, 256, 128);
		box.addBox(0F, 0F, 0F, 1, 6, 14);
		box.setPosition(6F, 0F, -16F);

		box0 = new CustomModelRenderer(this, 35, 9, 256, 128);
		box0.addBox(0F, 0F, 0F, 1, 6, 14);
		box0.setPosition(-7F, 0F, -16F);

		box1 = new CustomModelRenderer(this, 35, 9, 256, 128);
		box1.addBox(0F, 0F, 0F, 1, 6, 14);
		box1.setPosition(-7F, 0F, 3F);

		box10 = new CustomModelRenderer(this, 107, 56, 256, 128);
		box10.addBox(0F, 0F, 0F, 1, 3, 21);
		box10.setPosition(8F, 19F, -9F);

		box11 = new CustomModelRenderer(this, 165, 56, 256, 128);
		box11.addBox(0F, 0F, 0F, 1, 3, 21);
		box11.setPosition(-9F, 19F, -9F);

		box12 = new CustomModelRenderer(this, 31, 69, 256, 128);
		box12.addBox(0F, 0F, 0F, 16, 10, 6);
		box12.setPosition(-8F, 9F, 5F);

		box13 = new CustomModelRenderer(this, 110, 13, 256, 128);
		box13.addBox(0F, 0F, 0F, 4, 2, 4);
		box13.setPosition(-2F, 19F, 6F);

		box14 = new CustomModelRenderer(this, 132, 2, 256, 128);
		box14.addBox(0F, 0F, 0F, 16, 6, 12);
		box14.setPosition(-8F, 9F, -7F);

		box15 = new CustomModelRenderer(this, 143, 36, 256, 128);
		box15.addBox(0F, 0F, 0F, 6, 5, 4);
		box15.setPosition(0F, 9F, -11F);

		box2 = new CustomModelRenderer(this, 35, 9, 256, 128);
		box2.addBox(0F, 0F, 0F, 1, 6, 14);
		box2.setPosition(6F, 0F, 3F);

		box20 = new CustomModelRenderer(this, 142, 46, 256, 128);
		box20.addBox(0F, 0F, 0F, 6, 9, 6);
		box20.setPosition(-5F, 9F, -9F);

		box21 = new CustomModelRenderer(this, 165, 35, 256, 128);
		box21.addBox(0F, 0F, 0F, 6, 5, 6);
		box21.setPosition(1F, 15F, -5F);

		box22 = new CustomModelRenderer(this, 140, 21, 256, 128);
		box22.addBox(0F, 0F, 0F, 6, 8, 6);
		box22.setPosition(-4F, 15F, -1F);

		box23 = new CustomModelRenderer(this, 165, 22, 256, 128);
		box23.addBox(0F, 0F, 0F, 6, 6, 6);
		box23.setPosition(-8F, 15F, -4F);

		box3 = new CustomModelRenderer(this, 131, 65, 256, 128);
		box3.addBox(0F, 0F, 0F, 1, 10, 26);
		box3.setPosition(8F, 9F, -14F);

		box4 = new CustomModelRenderer(this, 71, 21, 256, 128);
		box4.addBox(0F, 0F, 0F, 12, 4, 4);
		box4.setPosition(-6F, 9F, 12F);

		box5 = new CustomModelRenderer(this, 70, 13, 256, 128);
		box5.addBox(0F, 0F, 0F, 12, 1, 5);
		box5.setPosition(-6F, 13F, 12F);
		box5.rotateAngleX = -6.056292504420323F;

		box52 = new CustomModelRenderer(this, 65, 44, 256, 128);
		box52.addBox(0F, 0F, 0F, 14, 1, 1);
		box52.setPosition(-7F, 5F, -2F);

		box53 = new CustomModelRenderer(this, 65, 44, 256, 128);
		box53.addBox(0F, 0F, 0F, 14, 1, 1);
		box53.setPosition(-7F, 5F, -17F);

		box54 = new CustomModelRenderer(this, 31, 33, 256, 128);
		box54.addBox(0F, 0F, 0F, 4, 2, 4);
		box54.setPosition(-2F, 7F, 17F);

		box55 = new CustomModelRenderer(this, 2, 33, 256, 128);
		box55.addBox(0F, 0F, 0F, 4, 3, 4);
		box55.setPosition(-2F, 4F, -11F);

		box6 = new CustomModelRenderer(this, 186, 87, 256, 128);
		box6.addBox(0F, 0F, 0F, 16, 13, 1);
		box6.setPosition(-8F, 9F, 11F);

		box68 = new CustomModelRenderer(this, 29, 40, 256, 128);
		box68.addBox(0F, 0F, 0F, 4, 2, 7);
		box68.setPosition(-2F, 6F, -20F);

		box71 = new CustomModelRenderer(this, 66, 47, 256, 128);
		box71.addBox(0F, 0F, 0F, 12, 2, 2);
		box71.setPosition(-6F, 2F, -10F);

		box72 = new CustomModelRenderer(this, 64, 44, 256, 128);
		box72.addBox(0F, 0F, 0F, 14, 1, 1);
		box72.setPosition(-7F, 5F, 2F);

		box73 = new CustomModelRenderer(this, 65, 44, 256, 128);
		box73.addBox(0F, 0F, 0F, 14, 1, 1);
		box73.setPosition(-7F, 5F, 17F);

		box78 = new CustomModelRenderer(this, 75, 65, 256, 128);
		box78.addBox(0F, 0F, 0F, 1, 10, 26);
		box78.setPosition(-9F, 9F, -14F);

		box79 = new CustomModelRenderer(this, 3, 89, 256, 128);
		box79.addBox(0F, 0F, 0F, 18, 2, 33);
		box79.setPosition(-9F, 7F, -16F);

		box8 = new CustomModelRenderer(this, 2, 33, 256, 128);
		box8.addBox(0F, 0F, 0F, 4, 3, 4);
		box8.setPosition(-2F, 4F, 8F);

		box80 = new CustomModelRenderer(this, 2, 9, 256, 128);
		box80.addBox(0F, 0F, 0F, 1, 6, 14);
		box80.setPosition(-6F, 0F, 3F);

		box81 = new CustomModelRenderer(this, 2, 9, 256, 128);
		box81.addBox(0F, 0F, 0F, 1, 6, 14);
		box81.setPosition(5F, 0F, 3F);

		box82 = new CustomModelRenderer(this, 66, 47, 256, 128);
		box82.addBox(0F, 0F, 0F, 12, 2, 2);
		box82.setPosition(-6F, 2F, 9F);

		bodyModel=new ModelRendererTurbo[]{box,bogey,bogey0,
				box0,box1,box2,box3,box4,box5,box6,box8,
				box10,box11,box12,box13,box14,box15,
				box20,box21,box22,box23,
				box52,box53,box54,box55,box68,box71,box72,box73,box78,box79,
				box80,box81,box82
		};

		fixRotation(bodyModel);
	}

    // variables init:
	public CustomModelRenderer bogey;
	public CustomModelRenderer bogey0;
	public CustomModelRenderer box;
	public CustomModelRenderer box0;
	public CustomModelRenderer box1;
	public CustomModelRenderer box10;
	public CustomModelRenderer box11;
	public CustomModelRenderer box12;
	public CustomModelRenderer box13;
	public CustomModelRenderer box14;
	public CustomModelRenderer box15;
	public CustomModelRenderer box2;
	public CustomModelRenderer box20;
	public CustomModelRenderer box21;
	public CustomModelRenderer box22;
	public CustomModelRenderer box23;
	public CustomModelRenderer box3;
	public CustomModelRenderer box4;
	public CustomModelRenderer box5;
	public CustomModelRenderer box52;
	public CustomModelRenderer box53;
	public CustomModelRenderer box54;
	public CustomModelRenderer box55;
	public CustomModelRenderer box6;
	public CustomModelRenderer box68;
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
