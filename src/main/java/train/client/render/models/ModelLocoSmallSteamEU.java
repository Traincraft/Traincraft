package train.client.render.models;

import net.minecraft.entity.Entity;
import train.client.render.CustomModelRenderer;
import train.client.tmt.ModelBase;
import train.common.core.handlers.ConfigHandler;

public class ModelLocoSmallSteamEU extends ModelBase {

	public ModelLocoSmallSteamEU() {
		box = new CustomModelRenderer(this, 50, 20, 128, 128);
		box.addBox(0F, 0F, 0F, 10, 10, 1);
		box.setPosition(3F, 0F, 5F);

		box0 = new CustomModelRenderer(this, 50, 20, 128, 128);
		box0.addBox(0F, 0F, 0F, 10, 10, 1);
		box0.setPosition(1F, 0F, -6F);

		box1 = new CustomModelRenderer(this, 54, 11, 128, 128);
		box1.addBox(0F, 0F, 0F, 6, 6, 1);
		box1.setPosition(-26F, 0F, -6F);

		box10 = new CustomModelRenderer(this, 76, 54, 128, 128);
		box10.addBox(0F, 0F, 0F, 22, 7, 4);
		box10.setPosition(-1F, 11F, 6F);
		box10.rotateAngleY = -3.141592653589793F;

		box11 = new CustomModelRenderer(this, 76, 45, 128, 128);
		box11.addBox(0F, 0F, 0F, 22, 5, 4);
		box11.setPosition(-1F, 18F, 6F);
		box11.rotateAngleX = -5.358160803622591F;
		box11.rotateAngleY = -3.141592653589793F;

		box12 = new CustomModelRenderer(this, 74, 65, 128, 128);
		box12.addBox(0F, 0F, 0F, 22, 4, 5);
		box12.setPosition(-1F, 11F, 6F);
		box12.rotateAngleX = -5.6374134839416845F;
		box12.rotateAngleY = -3.141592653589793F;

		box13 = new CustomModelRenderer(this, 0, 65, 128, 128);
		box13.addBox(0F, 0F, 0F, 13, 1, 16);
		box13.setPosition(1F, 10F, -8F);

		box14 = new CustomModelRenderer(this, 41, 38, 128, 128);
		box14.addBox(0F, 0F, 0F, 13, 9, 1);
		box14.setPosition(1F, 11F, -8F);

		box15 = new CustomModelRenderer(this, 6, 104, 128, 128);
		box15.addBox(0F, 0F, 0F, 16, 1, 3);
		box15.setPosition(-15F, 10F, -8F);

		box16 = new CustomModelRenderer(this, 6, 104, 128, 128);
		box16.addBox(0F, 0F, 0F, 16, 1, 3);
		box16.setPosition(-15F, 10F, 5F);

		box17 = new CustomModelRenderer(this, 50, 20, 128, 128);
		box17.addBox(0F, 0F, 0F, 10, 10, 1);
		box17.setPosition(-11F, 0F, -6F);

		box18 = new CustomModelRenderer(this, 50, 20, 128, 128);
		box18.addBox(0F, 0F, 0F, 10, 10, 1);
		box18.setPosition(-9F, 0F, 5F);

		box19 = new CustomModelRenderer(this, 0, 112, 128, 128);
		box19.addBox(0F, 0F, 0F, 11, 5, 1);
		box19.setPosition(-23F, 2F, -5F);

		box2 = new CustomModelRenderer(this, 54, 11, 128, 128);
		box2.addBox(0F, 0F, 0F, 6, 6, 1);
		box2.setPosition(-18F, 0F, -6F);

		box20 = new CustomModelRenderer(this, 41, 38, 128, 128);
		box20.addBox(0F, 0F, 0F, 13, 9, 1);
		box20.setPosition(1F, 11F, 7F);

		box21 = new CustomModelRenderer(this, 8, 17, 128, 128);
		box21.addBox(0F, 0F, 0F, 1, 18, 14);
		box21.setPosition(1F, 11F, -7F);

		box22 = new CustomModelRenderer(this, 6, 94, 128, 128);
		box22.addBox(0F, 0F, 0F, 16, 1, 3);
		box22.setPosition(0F, 30F, -4F);
		box22.rotateAngleX = -3.4557519189487724F;

		box23 = new CustomModelRenderer(this, 6, 99, 128, 128);
		box23.addBox(0F, 0F, 0F, 16, 1, 3);
		box23.setPosition(0F, 29F, -7F);
		box23.rotateAngleX = -3.8746309394274117F;

		box24 = new CustomModelRenderer(this, 1, 84, 128, 128);
		box24.addBox(0F, 0F, 0F, 16, 1, 8);
		box24.setPosition(0F, 29F, -4F);

		box25 = new CustomModelRenderer(this, 6, 94, 128, 128);
		box25.addBox(0F, 0F, 0F, 16, 1, 3);
		box25.setPosition(16F, 30F, 4F);
		box25.rotateAngleX = -3.4557519189487724F;
		box25.rotateAngleY = -3.141592653589793F;

		box26 = new CustomModelRenderer(this, 6, 99, 128, 128);
		box26.addBox(0F, 0F, 0F, 16, 1, 3);
		box26.setPosition(16F, 29F, 7F);
		box26.rotateAngleX = -3.8746309394274117F;
		box26.rotateAngleY = -3.141592653589793F;

		box27 = new CustomModelRenderer(this, 1, 70, 128, 128);
		box27.addBox(0F, 0F, 0F, 3, 6, 4);
		box27.setPosition(-27F, 21F, -2F);

		box28 = new CustomModelRenderer(this, 26, 14, 128, 128);
		box28.addBox(0F, 0F, 0F, 1, 8, 8);
		box28.setPosition(-24F, 10F, -4F);

		box29 = new CustomModelRenderer(this, 87, 109, 128, 128);
		box29.addBox(0F, 0F, 0F, 4, 2, 16);
		box29.setPosition(-27F, 6F, -8F);

		box3 = new CustomModelRenderer(this, 54, 11, 128, 128);
		box3.addBox(0F, 0F, 0F, 6, 6, 1);
		box3.setPosition(-18F, 0F, 5F);

		box30 = new CustomModelRenderer(this, 34, 52, 128, 128);
		box30.addBox(0F, 0F, 0F, 4, 8, 4);
		box30.setPosition(-22F, 20F, -2F);

		box31 = new CustomModelRenderer(this, 45, 85, 128, 128);
		box31.addBox(0F, 0F, 0F, 10, 1, 1);
		box31.setPosition(-26F, 7F, -7F);
		box31.rotateAngleZ = -5.462880558742252F;

		box32 = new CustomModelRenderer(this, 9, 22, 128, 128);
		box32.addBox(0F, 0F, 0F, 3, 5, 3);
		box32.setPosition(-14F, 21F, 0F);
		box32.rotateAngleY = -5.497787143782138F;

		box33 = new CustomModelRenderer(this, 9, 22, 128, 128);
		box33.addBox(0F, 0F, 0F, 3, 5, 3);
		box33.setPosition(-5F, 23F, 0F);
		box33.rotateAngleY = -5.497787143782138F;

		box34 = new CustomModelRenderer(this, 1, 19, 128, 128);
		box34.addBox(0F, 0F, 0F, 4, 4, 1);
		box34.setPosition(-27F, 17F, -2F);

		box35 = new CustomModelRenderer(this, 45, 1, 128, 128);
		box35.addBox(0F, 0F, 0F, 11, 5, 3);
		box35.setPosition(-23F, 3F, -9F);

		box36 = new CustomModelRenderer(this, 45, 1, 128, 128);
		box36.addBox(0F, 0F, 0F, 11, 5, 3);
		box36.setPosition(-23F, 3F, 6F);

		box37 = new CustomModelRenderer(this, 2, 125, 128, 128);
		box37.addBox(0F, 0F, 0F, 17, 1, 1);
		box37.setPosition(-7F, 2F, -7F);

		box38 = new CustomModelRenderer(this, 8, 119, 128, 128);
		box38.addBox(0F, 0F, 0F, 17, 1, 1);
		box38.setPosition(-17F, 5F, -8F);

		box39 = new CustomModelRenderer(this, 8, 119, 128, 128);
		box39.addBox(0F, 0F, 0F, 17, 1, 1);
		box39.setPosition(-17F, 5F, 7F);

		box4 = new CustomModelRenderer(this, 54, 11, 128, 128);
		box4.addBox(0F, 0F, 0F, 6, 6, 1);
		box4.setPosition(-26F, 0F, 5F);

		box40 = new CustomModelRenderer(this, 2, 125, 128, 128);
		box40.addBox(0F, 0F, 0F, 17, 1, 1);
		box40.setPosition(-7F, 2F, 6F);

		box41 = new CustomModelRenderer(this, 44, 11, 128, 128);
		box41.addBox(0F, 0F, 0F, 1, 8, 1);
		box41.setPosition(1F, 20F, -8F);

		box42 = new CustomModelRenderer(this, 44, 11, 128, 128);
		box42.addBox(0F, 0F, 0F, 1, 8, 1);
		box42.setPosition(1F, 20F, 7F);

		box43 = new CustomModelRenderer(this, 41, 110, 128, 128);
		box43.addBox(0F, 0F, 0F, 14, 2, 10);
		box43.setPosition(-1F, 8F, -5F);

		box44 = new CustomModelRenderer(this, 2, 61, 128, 128);
		box44.addBox(0F, 0F, 0F, 1, 4, 4);
		box44.setPosition(-25F, 12F, -2F);

		box45 = new CustomModelRenderer(this, 0, 0, 128, 128);
		box45.addBox(0F, 0F, 0F, 1, 1, 10);
		box45.setPosition(-34F, 0F, 0F);
		box45.rotateAngleY = -5.585053606381854F;

		box46 = new CustomModelRenderer(this, 0, 0, 128, 128);
		box46.addBox(0F, 0F, 0F, 1, 1, 10);
		box46.setPosition(-34F, 1F, 0F);
		box46.rotateAngleX = -3.141592653589793F;
		box46.rotateAngleY = -0.6981317007977318F;

		box47 = new CustomModelRenderer(this, 0, 0, 128, 128);
		box47.addBox(0F, 0F, 0F, 1, 9, 2);
		box47.setPosition(-33F, 1F, -1F);
		box47.rotateAngleZ = -0.7504915783575618F;

		box48 = new CustomModelRenderer(this, 0, 0, 128, 128);
		box48.addBox(0F, 0F, 0F, 1, 8, 1);
		box48.setPosition(-31F, 1F, 2F);
		box48.rotateAngleZ = -0.5585053606381855F;

		box49 = new CustomModelRenderer(this, 0, 0, 128, 128);
		box49.addBox(0F, 0F, 0F, 1, 7, 1);
		box49.setPosition(-30F, 1F, 4F);
		box49.rotateAngleZ = -0.4363323129985824F;

		box5 = new CustomModelRenderer(this, 76, 17, 128, 128);
		box5.addBox(0F, 0F, 0F, 22, 7, 4);
		box5.setPosition(-23F, 11F, -6F);

		box50 = new CustomModelRenderer(this, 0, 0, 128, 128);
		box50.addBox(0F, 0F, 0F, 1, 7, 1);
		box50.setPosition(-28F, 1F, 6F);
		box50.rotateAngleZ = -0.15707963267948966F;

		box51 = new CustomModelRenderer(this, 53, 89, 128, 128);
		box51.addBox(0F, 0F, 0F, 9, 4, 4);
		box51.setPosition(-7F, 19F, -2F);

		box52 = new CustomModelRenderer(this, 0, 0, 128, 128);
		box52.addBox(0F, 0F, 0F, 1, 8, 1);
		box52.setPosition(-31F, 1F, -3F);
		box52.rotateAngleZ = -0.5585053606381855F;

		box53 = new CustomModelRenderer(this, 0, 0, 128, 128);
		box53.addBox(0F, 0F, 0F, 1, 7, 1);
		box53.setPosition(-30F, 1F, -5F);
		box53.rotateAngleZ = -0.4363323129985824F;

		box54 = new CustomModelRenderer(this, 0, 0, 128, 128);
		box54.addBox(0F, 0F, 0F, 1, 7, 1);
		box54.setPosition(-28F, 1F, -7F);
		box54.rotateAngleZ = -0.15707963267948966F;

		box55 = new CustomModelRenderer(this, 26, 1, 128, 128);
		box55.addBox(0F, 0F, 0F, 5, 5, 3);
		box55.setPosition(-21F, 8F, -8F);
		box55.rotateAngleX = -5.759586531581287F;

		box56 = new CustomModelRenderer(this, 26, 1, 128, 128);
		box56.addBox(0F, 0F, 0F, 5, 5, 3);
		box56.setPosition(-16F, 8F, 8F);
		box56.rotateAngleX = -5.759586531581287F;
		box56.rotateAngleY = -3.141592653589793F;

		box57 = new CustomModelRenderer(this, 41, 49, 128, 128);
		box57.addBox(0F, 0F, 0F, 14, 1, 1);
		box57.setPosition(1F, 19F, -9F);

		box58 = new CustomModelRenderer(this, 41, 49, 128, 128);
		box58.addBox(0F, 0F, 0F, 14, 1, 1);
		box58.setPosition(1F, 19F, 8F);

		box59 = new CustomModelRenderer(this, 0, 112, 128, 128);
		box59.addBox(0F, 0F, 0F, 22, 5, 1);
		box59.setPosition(-11F, 3F, -5F);

		box6 = new CustomModelRenderer(this, 76, 8, 128, 128);
		box6.addBox(0F, 0F, 0F, 22, 5, 4);
		box6.setPosition(-23F, 18F, -6F);
		box6.rotateAngleX = -5.358160803622591F;

		box60 = new CustomModelRenderer(this, 54, 98, 128, 128);
		box60.addBox(0F, 0F, 0F, 9, 7, 4);
		box60.setPosition(-7F, 18F, -7F);
		box60.rotateAngleX = -5.497787143782138F;

		box61 = new CustomModelRenderer(this, 81, 88, 128, 128);
		box61.addBox(0F, 0F, 0F, 9, 7, 14);
		box61.setPosition(-7F, 11F, -7F);

		box62 = new CustomModelRenderer(this, 44, 11, 128, 128);
		box62.addBox(0F, 0F, 0F, 1, 8, 1);
		box62.setPosition(13F, 20F, -8F);

		box63 = new CustomModelRenderer(this, 44, 11, 128, 128);
		box63.addBox(0F, 0F, 0F, 1, 8, 1);
		box63.setPosition(13F, 20F, 7F);

		box64 = new CustomModelRenderer(this, 44, 11, 128, 128);
		box64.addBox(0F, 0F, 0F, 1, 8, 1);
		box64.setPosition(7F, 20F, -8F);

		box65 = new CustomModelRenderer(this, 44, 11, 128, 128);
		box65.addBox(0F, 0F, 0F, 1, 8, 1);
		box65.setPosition(7F, 20F, 7F);

		box66 = new CustomModelRenderer(this, 54, 98, 128, 128);
		box66.addBox(0F, 0F, 0F, 9, 7, 4);
		box66.setPosition(2F, 18F, 7F);
		box66.rotateAngleX = -5.497787143782138F;
		box66.rotateAngleY = -3.141592653589793F;

		box67 = new CustomModelRenderer(this, 45, 85, 128, 128);
		box67.addBox(0F, 0F, 0F, 10, 1, 1);
		box67.setPosition(-26F, 7F, 6F);
		box67.rotateAngleZ = -5.462880558742252F;

		box68 = new CustomModelRenderer(this, 42, 60, 128, 128);
		box68.addBox(0F, 0F, 0F, 1, 10, 8);
		box68.setPosition(2F, 11F, -4F);

		box69 = new CustomModelRenderer(this, 1, 19, 128, 128);
		box69.addBox(0F, 0F, 0F, 4, 4, 1);
		box69.setPosition(-27F, 17F, 1F);

		box7 = new CustomModelRenderer(this, 76, 0, 128, 128);
		box7.addBox(0F, 0F, 0F, 22, 4, 4);
		box7.setPosition(-23F, 17F, -2F);

		box70 = new CustomModelRenderer(this, 0, 112, 128, 128);
		box70.addBox(0F, 0F, 0F, 22, 5, 1);
		box70.setPosition(-11F, 3F, 4F);

		box71 = new CustomModelRenderer(this, 0, 112, 128, 128);
		box71.addBox(0F, 0F, 0F, 11, 5, 1);
		box71.setPosition(-23F, 2F, 4F);

		box72 = new CustomModelRenderer(this, 41, 122, 128, 128);
		box72.addBox(0F, 0F, 0F, 16, 2, 4);
		box72.setPosition(3F, 6F, -2F);

		box73 = new CustomModelRenderer(this, 9, 50, 128, 128);
		box73.addBox(0F, 0F, 0F, 6, 8, 6);
		box73.setPosition(-23F, 28F, -3F);

		box74 = new CustomModelRenderer(this, 0, 112, 128, 128);
		box74.addBox(0F, 0F, 0F, 1, 3, 10);
		box74.setPosition(11F, 5F, -5F);

		box75 = new CustomModelRenderer(this, 11, 16, 128, 128);
		box75.addBox(0F, 0F, 0F, 2, 1, 2);
		box75.setPosition(-13F, 26F, -1F);

		box76 = new CustomModelRenderer(this, 11, 16, 128, 128);
		box76.addBox(0F, 0F, 0F, 2, 1, 2);
		box76.setPosition(-4F, 28F, -1F);

		box77 = new CustomModelRenderer(this, 11, 16, 128, 128);
		box77.addBox(0F, 0F, 0F, 2, 1, 2);
		box77.setPosition(-27F, 27F, -1F);

		box8 = new CustomModelRenderer(this, 74, 28, 128, 128);
		box8.addBox(0F, 0F, 0F, 22, 4, 5);
		box8.setPosition(-23F, 11F, -6F);
		box8.rotateAngleX = -5.6374134839416845F;

		box9 = new CustomModelRenderer(this, 75, 37, 128, 128);
		box9.addBox(0F, 0F, 0F, 22, 4, 4);
		box9.setPosition(-23F, 8F, -2F);

	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		if (ConfigHandler.FLICKERING) {
			super.render(entity, f, f1, f2, f3, f4, f5);
		}

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
		box64.render(f5);
		box65.render(f5);
		box66.render(f5);
		box67.render(f5);
		box68.render(f5);
		box69.render(f5);
		box7.render(f5);
		box70.render(f5);
		box71.render(f5);
		box72.render(f5);
		box73.render(f5);
		box74.render(f5);
		box75.render(f5);
		box76.render(f5);
		box77.render(f5);
		box8.render(f5);
		box9.render(f5);

	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {}

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
	public CustomModelRenderer box22;
	public CustomModelRenderer box23;
	public CustomModelRenderer box24;
	public CustomModelRenderer box25;
	public CustomModelRenderer box26;
	public CustomModelRenderer box27;
	public CustomModelRenderer box28;
	public CustomModelRenderer box29;
	public CustomModelRenderer box3;
	public CustomModelRenderer box30;
	public CustomModelRenderer box31;
	public CustomModelRenderer box32;
	public CustomModelRenderer box33;
	public CustomModelRenderer box34;
	public CustomModelRenderer box35;
	public CustomModelRenderer box36;
	public CustomModelRenderer box37;
	public CustomModelRenderer box38;
	public CustomModelRenderer box39;
	public CustomModelRenderer box4;
	public CustomModelRenderer box40;
	public CustomModelRenderer box41;
	public CustomModelRenderer box42;
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
	public CustomModelRenderer box52;
	public CustomModelRenderer box53;
	public CustomModelRenderer box54;
	public CustomModelRenderer box55;
	public CustomModelRenderer box56;
	public CustomModelRenderer box57;
	public CustomModelRenderer box58;
	public CustomModelRenderer box59;
	public CustomModelRenderer box6;
	public CustomModelRenderer box60;
	public CustomModelRenderer box61;
	public CustomModelRenderer box62;
	public CustomModelRenderer box63;
	public CustomModelRenderer box64;
	public CustomModelRenderer box65;
	public CustomModelRenderer box66;
	public CustomModelRenderer box67;
	public CustomModelRenderer box68;
	public CustomModelRenderer box69;
	public CustomModelRenderer box7;
	public CustomModelRenderer box70;
	public CustomModelRenderer box71;
	public CustomModelRenderer box72;
	public CustomModelRenderer box73;
	public CustomModelRenderer box74;
	public CustomModelRenderer box75;
	public CustomModelRenderer box76;
	public CustomModelRenderer box77;
	public CustomModelRenderer box8;
	public CustomModelRenderer box9;

}
