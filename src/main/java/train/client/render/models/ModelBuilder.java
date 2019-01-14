package train.client.render.models;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import tmt.ModelBase;
import train.client.render.CustomModelRenderer;
import train.common.entity.rollingStock.EntityTracksBuilder;
import train.common.library.Info;

public class ModelBuilder extends ModelBase {

	private long lastframe;
	private float dig;

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
	public CustomModelRenderer box78;
	public CustomModelRenderer box79;
	public CustomModelRenderer box8;
	public CustomModelRenderer box80;
	public CustomModelRenderer box81;
	public CustomModelRenderer box82;
	public CustomModelRenderer box83;
	public CustomModelRenderer box84;
	public CustomModelRenderer box85;
	public CustomModelRenderer box86;
	public CustomModelRenderer box87;
	public CustomModelRenderer box88;
	public CustomModelRenderer box89;
	public CustomModelRenderer box9;
	public CustomModelRenderer box90;
	public CustomModelRenderer box91;

	public CustomModelRenderer rotor1;
	public CustomModelRenderer rotor2;
	public CustomModelRenderer rotor3;
	public CustomModelRenderer rotor4;
	public CustomModelRenderer rotor5;
	public CustomModelRenderer rotor6;
	public CustomModelRenderer rotor7;

	public ModelBuilder() {
		rotor1 = new CustomModelRenderer(this, 0, 0, 128, 64);
		rotor1.addBox(0F, -3F, -19F, 3, 6, 38);
		rotor1.setPosition(-29F, 24F, 0F);

		rotor2 = new CustomModelRenderer(this, 0, 0, 128, 64);
		rotor2.addBox(0F, -3F, -19F, 3, 6, 38);
		rotor2.setPosition(-29F, 24F, 0F);
		rotor2.rotateAngleX = -1.5707963267948966F;

		rotor3 = new CustomModelRenderer(this, 45, 11, 128, 64);
		rotor3.addBox(0F, -3F, -19F, 3, 6, 38);
		rotor3.setPosition(-28.95F, 24F, 0F);
		rotor3.rotateAngleX = -0.5235987755982988F;

		rotor4 = new CustomModelRenderer(this, 45, 11, 128, 64);
		rotor4.addBox(0F, -3F, -19F, 3, 6, 38);
		rotor4.setPosition(-28.93F, 24F, 0F);
		rotor4.rotateAngleX = -1.0471975511965976F;

		rotor5 = new CustomModelRenderer(this, 45, 11, 128, 64);
		rotor5.addBox(0F, -3F, -19F, 3, 6, 38);
		rotor5.setPosition(-28.95F, 24F, 0F);
		rotor5.rotateAngleX = -5.759586531581287F;

		rotor6 = new CustomModelRenderer(this, 3, 4, 128, 64);
		rotor6.addBox(-1F, -6F, -6F, 4, 12, 12);
		rotor6.setPosition(-29F, 24F, 0F);

		rotor7 = new CustomModelRenderer(this, 45, 11, 128, 64);
		rotor7.addBox(0F, -3F, -19F, 3, 6, 38);
		rotor7.setPosition(-28.93F, 24F, 0F);
		rotor7.rotateAngleX = -5.235987755982989F;

		//Model
		box = new CustomModelRenderer(this, 119, 159, 256, 256);
		box.addBox(0F, 0F, 0F, 11, 2, 2);
		box.setPosition(-8F, 6F, -13F);
		box.rotateAngleY = -0.6108652381980153F;

		box0 = new CustomModelRenderer(this, 162, 220, 256, 256);
		box0.addBox(0F, 0F, 0F, 8, 2, 14);
		box0.setPosition(-5F, 3F, -7F);

		box1 = new CustomModelRenderer(this, 188, 11, 256, 256);
		box1.addBox(0F, 0F, 0F, 8, 7, 0);
		box1.setPosition(-5F, 0F, 5F);

		box10 = new CustomModelRenderer(this, 127, 233, 256, 256);
		box10.addBox(0F, 0F, 0F, 1, 5, 16);
		box10.setPosition(27F, 6F, -8F);

		box11 = new CustomModelRenderer(this, 211, 224, 256, 256);
		box11.addBox(0F, 0F, 0F, 2, 3, 4);
		box11.setPosition(28F, 6F, -2F);

		box12 = new CustomModelRenderer(this, 159, 200, 256, 256);
		box12.addBox(0F, 0F, 0F, 34, 2, 14);
		box12.setPosition(-7F, 6F, -7F);

		box13 = new CustomModelRenderer(this, 119, 153, 256, 256);
		box13.addBox(0F, 0F, 0F, 16, 2, 2);
		box13.setPosition(-24F, 6F, -13F);

		box14 = new CustomModelRenderer(this, 114, 66, 256, 256);
		box14.addBox(0F, -2F, 0F, 35, 2, 5);
		box14.setPosition(-8F, 32F, 3F);
		box14.rotateAngleX = -6.09119908946021F;

		box15 = new CustomModelRenderer(this, 2, 167, 256, 256);
		box15.addBox(0F, -2F, 0F, 35, 2, 5);
		box15.setPosition(-8F, 31F, 8F);
		box15.rotateAngleX = -5.480333851262195F;

		box16 = new CustomModelRenderer(this, 157, 132, 256, 256);
		box16.addBox(0F, 0F, 0F, 1, 2, 23);
		box16.setPosition(-8F, 6F, -11F);

		box17 = new CustomModelRenderer(this, 0, 176, 256, 256);
		box17.addBox(0F, 0F, 0F, 1, 40, 40);
		box17.setPosition(-26F, 4F, -20F);

		box18 = new CustomModelRenderer(this, 1, 2, 256, 256);
		box18.addBox(0F, -2F, -2F, 37, 4, 4);
		box18.setPosition(-27F, 24F, 0F);

		box19 = new CustomModelRenderer(this, 119, 153, 256, 256);
		box19.addBox(0F, 0F, 0F, 16, 2, 2);
		box19.setPosition(-24F, 6F, 11F);

		box2 = new CustomModelRenderer(this, 219, 217, 256, 256);
		box2.addBox(0F, 0F, 0F, 2, 2, 16);
		box2.setPosition(18F, 2F, -8F);

		box20 = new CustomModelRenderer(this, 186, 132, 256, 256);
		box20.addBox(0F, 0F, 0F, 17, 1, 3);
		box20.setPosition(-25F, 8F, -11F);

		box21 = new CustomModelRenderer(this, 94, 198, 256, 256);
		box21.addBox(0F, 0F, 0F, 16, 8, 1);
		box21.setPosition(-24F, 4F, -8F);

		box22 = new CustomModelRenderer(this, 94, 188, 256, 256);
		box22.addBox(0F, 0F, 0F, 16, 8, 1);
		box22.setPosition(-24F, 4F, 7F);

		box23 = new CustomModelRenderer(this, 50, 182, 256, 256);
		box23.addBox(0F, 0F, 0F, 1, 8, 16);
		box23.setPosition(-25F, 4F, -8F);

		box24 = new CustomModelRenderer(this, 132, 159, 256, 256);
		box24.addBox(0F, 0F, 0F, 15, 1, 14);
		box24.setPosition(-25F, 7F, -7F);
		box24.rotateAngleZ = -0.47123889803846897F;

		box25 = new CustomModelRenderer(this, 225, 225, 256, 256);
		box25.addBox(0F, 0F, 0F, 1, 3, 3);
		box25.setPosition(28F, 7F, -7F);

		box26 = new CustomModelRenderer(this, 68, 13, 256, 256);
		box26.addBox(0F, 0F, 0F, 15, 17, 2);
		box26.setPosition(-28F, 34F, -22F);
		box26.rotateAngleX = -5.497787143782138F;

		box27 = new CustomModelRenderer(this, 191, 146, 256, 256);
		box27.addBox(0F, 0F, 0F, 16, 12, 16);
		box27.setPosition(-8F, 9F, -8F);

		box28 = new CustomModelRenderer(this, 2, 36, 256, 256);
		box28.addBox(0F, 0F, 0F, 15, 20, 2);
		box28.setPosition(-28F, 14F, -22F);

		box29 = new CustomModelRenderer(this, 17, 13, 256, 256);
		box29.addBox(0F, 0F, 0F, 15, 2, 20);
		box29.setPosition(-28F, 44F, -10F);

		box3 = new CustomModelRenderer(this, 219, 217, 256, 256);
		box3.addBox(0F, 0F, 0F, 2, 2, 16);
		box3.setPosition(-2F, 2F, -8F);

		box30 = new CustomModelRenderer(this, 68, 36, 256, 256);
		box30.addBox(0F, 0F, 0F, 15, 20, 2);
		box30.setPosition(-28F, 14F, 20F);

		box31 = new CustomModelRenderer(this, 22, 61, 256, 256);
		box31.addBox(0F, 0F, 0F, 10, 2, 20);
		box31.setPosition(-28F, 2F, -10F);

		box32 = new CustomModelRenderer(this, 2, 60, 256, 256);
		box32.addBox(0F, 0F, 0F, 15, 17, 2);
		box32.setPosition(-28F, 2F, -10F);
		box32.rotateAngleX = -0.7853981633974483F;

		box33 = new CustomModelRenderer(this, 68, 60, 256, 256);
		box33.addBox(0F, 0F, 0F, 15, 17, 2);
		box33.setPosition(-13F, 2F, 10F);
		box33.rotateAngleX = -0.7853981633974483F;
		box33.rotateAngleY = -3.141592653589793F;

		box34 = new CustomModelRenderer(this, 2, 13, 256, 256);
		box34.addBox(0F, 0F, 0F, 15, 17, 2);
		box34.setPosition(-13F, 34F, 22F);
		box34.rotateAngleX = -5.497787143782138F;
		box34.rotateAngleY = -3.141592653589793F;

		box35 = new CustomModelRenderer(this, 188, 11, 256, 256);
		box35.addBox(0F, 0F, 0F, 8, 7, 0);
		box35.setPosition(14F, 0F, 5F);

		box36 = new CustomModelRenderer(this, 216, 9, 256, 256);
		box36.addBox(0F, 0F, 0F, 2, 6, 6);
		box36.setPosition(-6F, 21F, -3F);

		box37 = new CustomModelRenderer(this, 43, 40, 256, 256);
		box37.addBox(0F, 0F, 0F, 2, 8, 8);
		box37.setPosition(-25F, 20F, -4F);

		box38 = new CustomModelRenderer(this, 225, 225, 256, 256);
		box38.addBox(0F, 0F, 0F, 1, 3, 3);
		box38.setPosition(28F, 7F, 4F);

		box39 = new CustomModelRenderer(this, 234, 9, 256, 256);
		box39.addBox(0F, 0F, 0F, 2, 6, 6);
		box39.setPosition(4F, 21F, -3F);

		box4 = new CustomModelRenderer(this, 162, 220, 256, 256);
		box4.addBox(0F, 0F, 0F, 8, 2, 14);
		box4.setPosition(15F, 3F, -7F);

		box40 = new CustomModelRenderer(this, 157, 127, 256, 256);
		box40.addBox(0F, 0F, 0F, 3, 16, 6);
		box40.setPosition(8F, 11F, -3F);

		box41 = new CustomModelRenderer(this, 2, 159, 256, 256);
		box41.addBox(0F, -2F, 0F, 35, 2, 5);
		box41.setPosition(27F, 32F, -3F);
		box41.rotateAngleX = -6.09119908946021F;
		box41.rotateAngleY = -3.141592653589793F;

		box42 = new CustomModelRenderer(this, 140, 176, 256, 256);
		box42.addBox(0F, 0F, 0F, 35, 1, 22);
		box42.setPosition(-8F, 8F, -11F);

		box43 = new CustomModelRenderer(this, 208, 82, 256, 256);
		box43.addBox(0F, 0F, 0F, 3, 8, 8);
		box43.setPosition(10F, 9F, -4F);

		box44 = new CustomModelRenderer(this, 219, 117, 256, 256);
		box44.addBox(0F, 0F, 0F, 12, 5, 6);
		box44.setPosition(13F, 10F, -3F);

		box45 = new CustomModelRenderer(this, 223, 100, 256, 256);
		box45.addBox(0F, 0F, 0F, 10, 2, 2);
		box45.setPosition(14F, 16F, -4F);

		box46 = new CustomModelRenderer(this, 223, 106, 256, 256);
		box46.addBox(0F, 0F, 0F, 12, 6, 4);
		box46.setPosition(13F, 15F, -2F);

		box47 = new CustomModelRenderer(this, 231, 130, 256, 256);
		box47.addBox(0F, 0F, 0F, 10, 2, 1);
		box47.setPosition(14F, 17F, 2F);

		box48 = new CustomModelRenderer(this, 232, 133, 256, 256);
		box48.addBox(0F, 0F, 0F, 2, 4, 2);
		box48.setPosition(16F, 18F, 3F);

		box49 = new CustomModelRenderer(this, 190, 111, 256, 256);
		box49.addBox(-2F, 0F, -2F, 4, 3, 4);
		box49.setPosition(17F, 22F, 4F);
		box49.rotateAngleY = -0.7853981633974483F;

		box5 = new CustomModelRenderer(this, 188, 11, 256, 256);
		box5.addBox(0F, 0F, 0F, 8, 7, 0);
		box5.setPosition(15F, 0F, -5F);

		box50 = new CustomModelRenderer(this, 238, 92, 256, 256);
		box50.addBox(0F, 0F, 0F, 5, 3, 3);
		box50.setPosition(20F, 13F, 2F);

		box51 = new CustomModelRenderer(this, 168, 93, 256, 256);
		box51.addBox(0F, 0F, 0F, 2, 10, 10);
		box51.setPosition(25F, 12F, -5F);

		box52 = new CustomModelRenderer(this, 184, 89, 256, 256);
		box52.addBox(0F, 0F, 0F, 2, 1, 10);
		box52.setPosition(13F, 9F, -5F);

		box53 = new CustomModelRenderer(this, 184, 89, 256, 256);
		box53.addBox(0F, 0F, 0F, 2, 1, 10);
		box53.setPosition(23F, 9F, -5F);

		box54 = new CustomModelRenderer(this, 232, 95, 256, 256);
		box54.addBox(-2F, 0F, -2F, 1, 2, 1);
		box54.setPosition(26F, 21F, -1F);
		box54.rotateAngleY = -0.7853981633974483F;

		box55 = new CustomModelRenderer(this, 2, 167, 256, 256);
		box55.addBox(0F, -2F, 0F, 35, 2, 5);
		box55.setPosition(27F, 31F, -8F);
		box55.rotateAngleX = -5.480333851262195F;
		box55.rotateAngleY = -3.141592653589793F;

		box56 = new CustomModelRenderer(this, 25, 178, 256, 256);
		box56.addBox(0F, 0F, 0F, 1, 17, 5);
		box56.setPosition(26F, 9F, -11F);

		box57 = new CustomModelRenderer(this, 25, 178, 256, 256);
		box57.addBox(0F, 0F, 0F, 1, 17, 5);
		box57.setPosition(26F, 9F, 6F);

		box58 = new CustomModelRenderer(this, 65, 189, 256, 256);
		box58.addBox(0F, 0F, 0F, 1, 4, 22);
		box58.setPosition(26F, 26F, -11F);

		box59 = new CustomModelRenderer(this, 112, 189, 256, 256);
		box59.addBox(0F, 0F, 0F, 1, 4, 22);
		box59.setPosition(-8F, 26F, -11F);

		box6 = new CustomModelRenderer(this, 209, 106, 256, 256);
		box6.addBox(0F, 0F, 0F, 2, 22, 2);
		box6.setPosition(20F, 17F, -5F);

		box60 = new CustomModelRenderer(this, 47, 176, 256, 256);
		box60.addBox(0F, 0F, 0F, 1, 17, 3);
		box60.setPosition(-8F, 9F, -11F);

		box61 = new CustomModelRenderer(this, 47, 176, 256, 256);
		box61.addBox(0F, 0F, 0F, 1, 17, 3);
		box61.setPosition(-8F, 9F, 8F);

		box62 = new CustomModelRenderer(this, 1, 84, 256, 256);
		box62.addBox(0F, 0F, 0F, 8, 8, 8);
		box62.setPosition(-25F, 32F, -15F);

		box63 = new CustomModelRenderer(this, 188, 11, 256, 256);
		box63.addBox(0F, 0F, 0F, 8, 7, 0);
		box63.setPosition(-5F, 0F, -5F);

		box64 = new CustomModelRenderer(this, 45, 84, 256, 256);
		box64.addBox(0F, 0F, 0F, 8, 8, 8);
		box64.setPosition(-25F, 32F, -4F);

		box65 = new CustomModelRenderer(this, 78, 84, 256, 256);
		box65.addBox(0F, 0F, 0F, 8, 8, 8);
		box65.setPosition(-25F, 32F, 7F);

		box66 = new CustomModelRenderer(this, 9, 178, 256, 256);
		box66.addBox(0F, 0F, 0F, 1, 32, 2);
		box66.setPosition(-15F, 8F, -16F);

		box67 = new CustomModelRenderer(this, 8, 85, 256, 256);
		box67.addBox(0F, 0F, 0F, 5, 7, 26);
		box67.setPosition(-24F, 37F, -13F);

		box68 = new CustomModelRenderer(this, 2, 120, 256, 256);
		box68.addBox(0F, 0F, 0F, 8, 11, 8);
		box68.setPosition(-25F, 19F, -15F);

		box69 = new CustomModelRenderer(this, 2, 178, 256, 256);
		box69.addBox(0F, 0F, 0F, 1, 32, 2);
		box69.setPosition(-15F, 8F, 14F);

		box7 = new CustomModelRenderer(this, 119, 159, 256, 256);
		box7.addBox(0F, 0F, -2F, 11, 2, 2);
		box7.setPosition(-8F, 6F, 13F);
		box7.rotateAngleY = -5.672320068981571F;

		box70 = new CustomModelRenderer(this, 59, 134, 256, 256);
		box70.addBox(0F, 0F, 0F, 8, 8, 4);
		box70.setPosition(-2F, 7F, 8F);

		box71 = new CustomModelRenderer(this, 59, 120, 256, 256);
		box71.addBox(0F, 0F, 0F, 8, 8, 4);
		box71.setPosition(-2F, 17F, 8F);

		box72 = new CustomModelRenderer(this, 87, 124, 256, 256);
		box72.addBox(0F, 0F, 0F, 5, 18, 2);
		box72.setPosition(4F, 6F, 8F);

		box73 = new CustomModelRenderer(this, 87, 147, 256, 256);
		box73.addBox(0F, 0F, 0F, 5, 8, 2);
		box73.setPosition(4F, 6F, 10F);
		box73.rotateAngleX = -2.234021442552742F;

		box74 = new CustomModelRenderer(this, 174, 120, 256, 256);
		box74.addBox(0F, 0F, 0F, 13, 6, 4);
		box74.setPosition(10F, 9F, 6F);

		box75 = new CustomModelRenderer(this, 215, 99, 256, 256);
		box75.addBox(-2F, 0F, -2F, 1, 3, 1);
		box75.setPosition(21F, 13F, 10F);
		box75.rotateAngleY = -0.7853981633974483F;

		box76 = new CustomModelRenderer(this, 200, 31, 256, 256);
		box76.addBox(0F, 0F, 0F, 4, 21, 1);
		box76.setPosition(-12F, 11F, -9F);

		box77 = new CustomModelRenderer(this, 155, 33, 256, 256);
		box77.addBox(0F, 0F, 0F, 4, 1, 24);
		box77.setPosition(-12F, 32F, -8F);

		box78 = new CustomModelRenderer(this, 181, 27, 256, 256);
		box78.addBox(0F, 0F, 0F, 5, 1, 32);
		box78.setPosition(-17F, 32F, -16F);

		box79 = new CustomModelRenderer(this, 185, 138, 256, 256);
		box79.addBox(0F, 0F, 0F, 20, 1, 4);
		box79.setPosition(-25F, 8F, -15F);

		box8 = new CustomModelRenderer(this, 163, 237, 256, 256);
		box8.addBox(0F, 0F, 0F, 34, 5, 12);
		box8.setPosition(-8F, 1F, -6F);

		box80 = new CustomModelRenderer(this, 185, 145, 256, 256);
		box80.addBox(0F, 0F, 0F, 3, 1, 4);
		box80.setPosition(-6F, 5F, -15F);

		box81 = new CustomModelRenderer(this, 101, 218, 256, 256);
		box81.addBox(0F, 0F, 0F, 32, 1, 5);
		box81.setPosition(-5F, 2F, -15F);

		box82 = new CustomModelRenderer(this, 106, 225, 256, 256);
		box82.addBox(0F, 0F, 0F, 30, 6, 0);
		box82.setPosition(-4F, 2F, -10F);

		box83 = new CustomModelRenderer(this, 146, 116, 256, 256);
		box83.addBox(3F, 0F, 0F, 10, 6, 3);
		box83.setPosition(12F, 9F, -11F);

		box84 = new CustomModelRenderer(this, 143, 135, 256, 256);
		box84.addBox(0F, 0F, 0F, 5, 6, 0);
		box84.setPosition(15F, 9F, -11F);
		box84.rotateAngleY = -3.385938748868999F;

		box85 = new CustomModelRenderer(this, 92, 221, 256, 256);
		box85.addBox(0F, 0F, 0F, 1, 7, 4);
		box85.setPosition(-5F, 2F, -15F);
		box85.rotateAngleZ = -5.811946409141117F;

		box86 = new CustomModelRenderer(this, 143, 126, 256, 256);
		box86.addBox(0F, 0F, 0F, 5, 6, 0);
		box86.setPosition(25F, 9F, -11F);
		box86.rotateAngleY = -5.358160803622591F;

		box87 = new CustomModelRenderer(this, 158, 1, 256, 256);
		box87.addBox(0F, 0F, 0F, 35, 1, 4);
		box87.setPosition(-8F, 32F, 3F);

		box88 = new CustomModelRenderer(this, 243, 133, 256, 256);
		box88.addBox(0F, 0F, 0F, 1, 22, 4);
		box88.setPosition(27F, 11F, 3F);

		box89 = new CustomModelRenderer(this, 85, 1, 256, 256);
		box89.addBox(0F, 0F, 0F, 35, 10, 0);
		box89.setPosition(-8F, 30F, 7F);

		box9 = new CustomModelRenderer(this, 1, 150, 256, 256);
		box9.addBox(0F, 0F, 0F, 35, 2, 6);
		box9.setPosition(-8F, 30F, -3F);

		box90 = new CustomModelRenderer(this, 189, 62, 256, 256);
		box90.addBox(0F, 0F, 0F, 16, 1, 16);
		box90.setPosition(-23F, 7F, -8F);
		box90.rotateAngleZ = -0.47123889803846897F;

		box91 = new CustomModelRenderer(this, 105, 21, 256, 256);
		box91.addBox(0F, 0F, 0F, 3, 4, 40);
		box91.setPosition(-24F, 28F, -20F);
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		long now = System.nanoTime();
		int elapsed = (int) ((now - lastframe) / (1000 * 1000));
		dig -= (float) elapsed / 500.0f;
		lastframe = now;

		if (((EntityTracksBuilder) entity).getState()) {
			FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.trainsPrefix + "builder2.png"));
		}
		else {
			FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.trainsPrefix + "builder.png"));
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
		box78.render(f5);
		box79.render(f5);
		box8.render(f5);
		box80.render(f5);
		box81.render(f5);
		box82.render(f5);
		box83.render(f5);
		box84.render(f5);
		box85.render(f5);
		box86.render(f5);
		box87.render(f5);
		box88.render(f5);
		box89.render(f5);
		box9.render(f5);
		box90.render(f5);
		box91.render(f5);

		FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.trainsPrefix + "builder_rotor.png"));

		rotor1.render(f5);
		rotor2.render(f5);
		rotor3.render(f5);
		rotor4.render(f5);
		rotor5.render(f5);
		rotor6.render(f5);
		rotor7.render(f5);

		if (((EntityTracksBuilder) entity).getState()) {
			rotor1.rotateAngleX = dig + 0.0F;
			rotor2.rotateAngleX = dig + 1.58F;
			rotor3.rotateAngleX = dig + 0.58F;
			rotor4.rotateAngleX = dig - 0.58F;
			rotor5.rotateAngleX = dig + 2.08F;
			rotor6.rotateAngleX = dig;
			rotor7.rotateAngleX = dig - 2.08F;
			
			box18.rotateAngleX = dig;
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {}
}