package train.client.render.models;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import train.client.render.ModelRendererTurbo;

public class ModelLocoSteamShay extends ModelBase {

	public ModelRendererTurbo boiler_blank_lower;
	public ModelRendererTurbo boiler_blank_upper;
	public ModelRendererTurbo boiler_piston_lower;
	public ModelRendererTurbo boiler_piston_upper;
	public ModelRendererTurbo box;
	public ModelRendererTurbo box0;
	public ModelRendererTurbo box1;
	public ModelRendererTurbo box10;
	public ModelRendererTurbo box100;
	public ModelRendererTurbo box101;
	public ModelRendererTurbo box104;
	public ModelRendererTurbo box105;
	public ModelRendererTurbo box107;
	public ModelRendererTurbo box11;
	public ModelRendererTurbo box12;
	public ModelRendererTurbo box14;
	public ModelRendererTurbo box15;
	public ModelRendererTurbo box16;
	public ModelRendererTurbo box17;
	public ModelRendererTurbo box18;
	public ModelRendererTurbo box19;
	public ModelRendererTurbo box2;
	public ModelRendererTurbo box20;
	public ModelRendererTurbo box21;
	public ModelRendererTurbo box22;
	public ModelRendererTurbo box23;
	public ModelRendererTurbo box24;
	public ModelRendererTurbo box25;
	public ModelRendererTurbo box26;
	public ModelRendererTurbo box27;
	public ModelRendererTurbo box28;
	public ModelRendererTurbo box29;
	public ModelRendererTurbo box3;
	public ModelRendererTurbo box30;
	public ModelRendererTurbo box32;
	public ModelRendererTurbo box33;
	public ModelRendererTurbo box34;
	public ModelRendererTurbo box35;
	public ModelRendererTurbo box36;
	public ModelRendererTurbo box37;
	public ModelRendererTurbo box39;
	public ModelRendererTurbo box4;
	public ModelRendererTurbo box40;
	public ModelRendererTurbo box41;
	public ModelRendererTurbo box42;
	public ModelRendererTurbo box45;
	public ModelRendererTurbo box46;
	public ModelRendererTurbo box48;
	public ModelRendererTurbo box49;
	public ModelRendererTurbo box50;
	public ModelRendererTurbo box51;
	public ModelRendererTurbo box52;
	public ModelRendererTurbo box53;
	public ModelRendererTurbo box54;
	public ModelRendererTurbo box55;
	public ModelRendererTurbo box56;
	public ModelRendererTurbo box57;
	public ModelRendererTurbo box58;
	public ModelRendererTurbo box6;
	public ModelRendererTurbo box63;
	public ModelRendererTurbo box64;
	public ModelRendererTurbo box65;
	public ModelRendererTurbo box66;
	public ModelRendererTurbo box67;
	public ModelRendererTurbo box68;
	public ModelRendererTurbo box69;
	public ModelRendererTurbo box7;
	public ModelRendererTurbo box70;
	public ModelRendererTurbo box71;
	public ModelRendererTurbo box73;
	public ModelRendererTurbo box74;
	public ModelRendererTurbo box75;
	public ModelRendererTurbo box76;
	public ModelRendererTurbo box77;
	public ModelRendererTurbo box79;
	public ModelRendererTurbo box8;
	public ModelRendererTurbo box80;
	public ModelRendererTurbo box81;
	public ModelRendererTurbo box82;
	public ModelRendererTurbo box89;
	public ModelRendererTurbo box9;
	public ModelRendererTurbo box90;
	public ModelRendererTurbo box91;
	public ModelRendererTurbo box92;
	public ModelRendererTurbo box95;
	public ModelRendererTurbo box96;
	public ModelRendererTurbo box97;
	public ModelRendererTurbo box98;
	public ModelRendererTurbo brake_cyl;
	public ModelRendererTurbo coal_pile;
	public ModelRendererTurbo crank_1;
	public ModelRendererTurbo crank_2;
	public ModelRendererTurbo crank_3;
	public ModelRendererTurbo crank_4;
	public ModelRendererTurbo ladder_blank_side;
	public ModelRendererTurbo ladder_piston_side;
	public ModelRendererTurbo piston_front;
	public ModelRendererTurbo piston_rear;
	public ModelRendererTurbo rod_frnt_mid;
	public ModelRendererTurbo rod_frnt_track;
	public ModelRendererTurbo rod_rear_mid;
	public ModelRendererTurbo rod_rear_truck;
	public ModelRendererTurbo roof_blank_lower;
	public ModelRendererTurbo roof_blank_upper;
	public ModelRendererTurbo roof_piston_lower;
	public ModelRendererTurbo roof_piston_upper;

	public ModelLocoSteamShay() {
		boiler_blank_lower = new ModelRendererTurbo(this, 1, 180, 256, 256);
		boiler_blank_lower.addBox(0F, 0F, 0F, 24, 4, 4);
		boiler_blank_lower.setPosition(2F, 14F, -8F);
		boiler_blank_lower.rotateAngleX = -5.497787143782138F;

		boiler_blank_upper = new ModelRendererTurbo(this, 1, 170, 256, 256);
		boiler_blank_upper.addBox(0F, 0F, 0F, 24, 4, 4);
		boiler_blank_upper.setPosition(2F, 18F, -8F);
		boiler_blank_upper.rotateAngleX = -5.497787143782138F;

		boiler_piston_lower = new ModelRendererTurbo(this, 1, 150, 256, 256);
		boiler_piston_lower.addBox(0F, 0F, 0F, 24, 4, 4);
		boiler_piston_lower.setPosition(26F, 14F, 2F);
		boiler_piston_lower.rotateAngleX = -5.497787143782138F;
		boiler_piston_lower.rotateAngleY = -3.141592653589793F;

		boiler_piston_upper = new ModelRendererTurbo(this, 1, 160, 256, 256);
		boiler_piston_upper.addBox(0F, 0F, 0F, 24, 4, 4);
		boiler_piston_upper.setPosition(26F, 18F, 2F);
		boiler_piston_upper.rotateAngleX = -5.497787143782138F;
		boiler_piston_upper.rotateAngleY = -3.141592653589793F;

		box = new ModelRendererTurbo(this, 203, 11, 256, 256);
		box.addBox(0F, 0F, 0F, 6, 6, 0);
		box.setPosition(-24F, 0F, 5F);

		box0 = new ModelRendererTurbo(this, 3, 27, 256, 256);
		box0.addBox(0F, 0F, 0F, 17, 5, 1);
		box0.setPosition(-25F, 1F, -6F);

		box1 = new ModelRendererTurbo(this, 203, 11, 256, 256);
		box1.addBox(0F, 0F, 0F, 6, 6, 0);
		box1.setPosition(-15F, 0F, 5F);

		box10 = new ModelRendererTurbo(this, 28, 8, 256, 256);
		box10.addBox(0F, 0F, 0F, 2, 2, 14);
		box10.setPosition(-22F, 2F, -7F);

		box100 = new ModelRendererTurbo(this, 220, 128, 256, 256);
		box100.addBox(0F, 0F, 0F, 4, 1, 2);
		box100.setPosition(-14F, 6F, -11F);

		box101 = new ModelRendererTurbo(this, 220, 128, 256, 256);
		box101.addBox(0F, 0F, 0F, 4, 1, 2);
		box101.setPosition(-14F, 6F, 9F);

		box104 = new ModelRendererTurbo(this, 219, 229, 256, 256);
		box104.addBox(0F, 0F, 0F, 0, 4, 18);
		box104.setPosition(28F, 2F, -9F);

		box105 = new ModelRendererTurbo(this, 219, 229, 256, 256);
		box105.addBox(0F, 0F, 0F, 0, 4, 18);
		box105.setPosition(-28F, 2F, -9F);

		box107 = new ModelRendererTurbo(this, 196, 236, 256, 256);
		box107.addBox(0F, 0F, 0F, 2, 1, 18);
		box107.setPosition(-30F, 2F, -9F);

		box11 = new ModelRendererTurbo(this, 40, 27, 256, 256);
		box11.addBox(0F, 0F, 0F, 17, 5, 1);
		box11.setPosition(-25F, 1F, 5F);

		box12 = new ModelRendererTurbo(this, 3, 37, 256, 256);
		box12.addBox(0F, 0F, 0F, 7, 3, 6);
		box12.setPosition(13F, 4F, -3F);

		box14 = new ModelRendererTurbo(this, 48, 3, 256, 256);
		box14.addBox(0F, 0F, 0F, 3, 3, 14);
		box14.setPosition(-18F, 3F, -7F);

		box15 = new ModelRendererTurbo(this, 3, 13, 256, 256);
		box15.addBox(0F, 0F, 0F, 1, 2, 10);
		box15.setPosition(24F, 4F, -5F);

		box16 = new ModelRendererTurbo(this, 211, 209, 256, 256);
		box16.addBox(0F, 0F, 0F, 2, 5, 20);
		box16.setPosition(-26F, 6F, 10F);
		box16.rotateAngleY = -3.141592653589793F;

		box17 = new ModelRendererTurbo(this, 40, 27, 256, 256);
		box17.addBox(0F, 0F, 0F, 17, 5, 1);
		box17.setPosition(8F, 1F, 5F);

		box18 = new ModelRendererTurbo(this, 48, 3, 256, 256);
		box18.addBox(0F, 0F, 0F, 3, 3, 14);
		box18.setPosition(15F, 3F, -7F);

		box19 = new ModelRendererTurbo(this, 28, 8, 256, 256);
		box19.addBox(0F, 0F, 0F, 2, 2, 14);
		box19.setPosition(11F, 2F, -7F);

		box2 = new ModelRendererTurbo(this, 1, 238, 256, 256);
		box2.addBox(0F, 0F, 0F, 52, 3, 14);
		box2.setPosition(-26F, 7F, -9F);

		box20 = new ModelRendererTurbo(this, 3, 13, 256, 256);
		box20.addBox(0F, 0F, 0F, 1, 2, 10);
		box20.setPosition(-25F, 4F, -5F);

		box21 = new ModelRendererTurbo(this, 28, 8, 256, 256);
		box21.addBox(0F, 0F, 0F, 2, 2, 14);
		box21.setPosition(20F, 2F, -7F);

		box22 = new ModelRendererTurbo(this, 3, 27, 256, 256);
		box22.addBox(0F, 0F, 0F, 17, 5, 1);
		box22.setPosition(8F, 1F, -6F);

		box23 = new ModelRendererTurbo(this, 213, 152, 256, 256);
		box23.addBox(14F, 0F, 0F, 1, 11, 20);
		box23.setPosition(-13F, 11F, -10F);

		box24 = new ModelRendererTurbo(this, 188, 11, 256, 256);
		box24.addBox(0F, 0F, 0F, 6, 6, 0);
		box24.setPosition(9F, 0F, -5F);

		box25 = new ModelRendererTurbo(this, 188, 11, 256, 256);
		box25.addBox(0F, 0F, 0F, 6, 6, 0);
		box25.setPosition(18F, 0F, -5F);

		box26 = new ModelRendererTurbo(this, 203, 11, 256, 256);
		box26.addBox(0F, 0F, 0F, 6, 6, 0);
		box26.setPosition(18F, 0F, 5F);

		box27 = new ModelRendererTurbo(this, 203, 11, 256, 256);
		box27.addBox(0F, 0F, 0F, 6, 6, 0);
		box27.setPosition(9F, 0F, 5F);

		box28 = new ModelRendererTurbo(this, 196, 236, 256, 256);
		box28.addBox(0F, 0F, 0F, 2, 1, 18);
		box28.setPosition(28F, 2F, -9F);

		box29 = new ModelRendererTurbo(this, 213, 184, 256, 256);
		box29.addBox(0F, -1F, 0F, 1, 3, 20);
		box29.setPosition(-17F, 18F, -10F);

		box3 = new ModelRendererTurbo(this, 28, 8, 256, 256);
		box3.addBox(0F, 0F, 0F, 2, 2, 14);
		box3.setPosition(-13F, 2F, -7F);

		box30 = new ModelRendererTurbo(this, 1, 190, 256, 256);
		box30.addBox(0F, 0F, 0F, 24, 4, 10);
		box30.setPosition(2F, 14F, -8F);

		box32 = new ModelRendererTurbo(this, 3, 13, 256, 256);
		box32.addBox(0F, 0F, 0F, 1, 2, 10);
		box32.setPosition(8F, 4F, -5F);

		box33 = new ModelRendererTurbo(this, 155, 159, 256, 256);
		box33.addBox(0F, 0F, 0F, 6, 6, 4);
		box33.setPosition(-2F, 11F, 6F);

		box34 = new ModelRendererTurbo(this, 149, 224, 256, 256);
		box34.addBox(0F, 0F, 0F, 11, 6, 20);
		box34.setPosition(-26F, 11F, -10F);

		box35 = new ModelRendererTurbo(this, 238, 186, 256, 256);
		box35.addBox(0F, 0F, 0F, 5, 8, 1);
		box35.setPosition(-10F, 11F, 10F);

		box36 = new ModelRendererTurbo(this, 205, 185, 256, 256);
		box36.addBox(0F, 0F, 0F, 12, 10, 1);
		box36.setPosition(-10F, 11F, -11F);

		box37 = new ModelRendererTurbo(this, 129, 223, 256, 256);
		box37.addBox(0F, 0F, 0F, 13, 10, 1);
		box37.setPosition(-27F, 11F, -11F);

		box39 = new ModelRendererTurbo(this, 120, 239, 256, 256);
		box39.addBox(0F, 0F, 0F, 13, 10, 1);
		box39.setPosition(-27F, 11F, 10F);

		box4 = new ModelRendererTurbo(this, 3, 13, 256, 256);
		box4.addBox(0F, 0F, 0F, 1, 2, 10);
		box4.setPosition(-9F, 4F, -5F);

		box40 = new ModelRendererTurbo(this, 129, 189, 256, 256);
		box40.addBox(0F, 0F, 0F, 1, 10, 20);
		box40.setPosition(-27F, 11F, -10F);

		box41 = new ModelRendererTurbo(this, 193, 232, 256, 256);
		box41.addBox(0F, -1F, 0F, 3, 4, 6);
		box41.setPosition(-25F, 18F, -3F);

		box42 = new ModelRendererTurbo(this, 3, 50, 256, 256);
		box42.addBox(0F, 0F, 0F, 18, 2, 6);
		box42.setPosition(-15F, 31F, -3F);

		box45 = new ModelRendererTurbo(this, 213, 121, 256, 256);
		box45.addBox(0F, 0F, 0F, 1, 3, 20);
		box45.setPosition(1F, 28F, -10F);

		box46 = new ModelRendererTurbo(this, 213, 146, 256, 256);
		box46.addBox(0F, 0F, 0F, 12, 1, 1);
		box46.setPosition(-10F, 27F, 10F);

		box48 = new ModelRendererTurbo(this, 221, 163, 256, 256);
		box48.addBox(0F, 0F, 0F, 4, 6, 1);
		box48.setPosition(-2F, 21F, 10F);

		box49 = new ModelRendererTurbo(this, 214, 163, 256, 256);
		box49.addBox(0F, 0F, 0F, 2, 6, 1);
		box49.setPosition(-10F, 21F, 10F);

		box50 = new ModelRendererTurbo(this, 221, 154, 256, 256);
		box50.addBox(0F, 0F, 0F, 4, 6, 1);
		box50.setPosition(-2F, 21F, -11F);

		box51 = new ModelRendererTurbo(this, 214, 154, 256, 256);
		box51.addBox(0F, 0F, 0F, 2, 6, 1);
		box51.setPosition(-10F, 21F, -11F);

		box52 = new ModelRendererTurbo(this, 213, 149, 256, 256);
		box52.addBox(0F, 0F, 0F, 12, 1, 1);
		box52.setPosition(-10F, 27F, -11F);

		box53 = new ModelRendererTurbo(this, 246, 163, 256, 256);
		box53.addBox(0F, 0F, 0F, 1, 6, 1);
		box53.setPosition(1F, 22F, -10F);

		box54 = new ModelRendererTurbo(this, 246, 163, 256, 256);
		box54.addBox(0F, 0F, 0F, 1, 6, 1);
		box54.setPosition(1F, 22F, 9F);

		box55 = new ModelRendererTurbo(this, 236, 163, 256, 256);
		box55.addBox(0F, 0F, 0F, 1, 6, 1);
		box55.setPosition(1F, 22F, -5F);

		box56 = new ModelRendererTurbo(this, 236, 163, 256, 256);
		box56.addBox(0F, 0F, 0F, 1, 6, 1);
		box56.setPosition(1F, 22F, 4F);

		box57 = new ModelRendererTurbo(this, 237, 147, 256, 256);
		box57.addBox(0F, 0F, 0F, 1, 2, 8);
		box57.setPosition(1F, 22F, -4F);

		box58 = new ModelRendererTurbo(this, 1, 135, 256, 256);
		box58.addBox(0F, 0F, 0F, 24, 10, 4);
		box58.setPosition(2F, 11F, -5F);

		box6 = new ModelRendererTurbo(this, 211, 209, 256, 256);
		box6.addBox(0F, 0F, 0F, 2, 5, 20);
		box6.setPosition(26F, 6F, -10F);

		box63 = new ModelRendererTurbo(this, 188, 11, 256, 256);
		box63.addBox(0F, 0F, 0F, 6, 6, 0);
		box63.setPosition(-15F, 0F, -5F);

		box64 = new ModelRendererTurbo(this, 61, 186, 256, 256);
		box64.addBox(0F, 0F, 0F, 1, 6, 6);
		box64.setPosition(26F, 13F, -6F);

		box65 = new ModelRendererTurbo(this, 192, 165, 256, 256);
		box65.addBox(0F, 0F, 0F, 1, 8, 8);
		box65.setPosition(6F, 10F, 3F);

		box66 = new ModelRendererTurbo(this, 129, 171, 256, 256);
		box66.addBox(0F, 0F, 0F, 12, 1, 8);
		box66.setPosition(-5F, 18F, 3F);

		box67 = new ModelRendererTurbo(this, 172, 165, 256, 256);
		box67.addBox(0F, 0F, 0F, 1, 8, 8);
		box67.setPosition(-5F, 10F, 3F);

		box68 = new ModelRendererTurbo(this, 205, 197, 256, 256);
		box68.addBox(0F, 0F, 0F, 12, 2, 1);
		box68.setPosition(-10F, 19F, 10F);

		box69 = new ModelRendererTurbo(this, 1, 214, 256, 256);
		box69.addBox(0F, 0F, 0F, 52, 1, 22);
		box69.setPosition(-26F, 10F, -11F);

		box7 = new ModelRendererTurbo(this, 188, 11, 256, 256);
		box7.addBox(0F, 0F, 0F, 6, 6, 0);
		box7.setPosition(-24F, 0F, -5F);

		box70 = new ModelRendererTurbo(this, 130, 152, 256, 256);
		box70.addBox(0F, 0F, 0F, 10, 4, 2);
		box70.setPosition(-4F, 13F, 7F);

		box71 = new ModelRendererTurbo(this, 130, 160, 256, 256);
		box71.addBox(0F, 0F, 0F, 10, 8, 2);
		box71.setPosition(-4F, 10F, 3F);

		box73 = new ModelRendererTurbo(this, 77, 188, 256, 256);
		box73.addBox(-2F, 0F, -2F, 4, 14, 4);
		box73.setPosition(22F, 19F, -3F);

		box74 = new ModelRendererTurbo(this, 94, 187, 256, 256);
		box74.addBox(0F, -1F, 0F, 3, 4, 4);
		box74.setPosition(-26F, 21F, 2F);
		box74.rotateAngleY = -3.141592653589793F;

		box75 = new ModelRendererTurbo(this, 58, 173, 256, 256);
		box75.addBox(0F, 0F, 0F, 6, 4, 6);
		box75.setPosition(10F, 20F, -6F);

		box76 = new ModelRendererTurbo(this, 59, 163, 256, 256);
		box76.addBox(0F, 0F, 0F, 4, 4, 4);
		box76.setPosition(11F, 22F, -5F);

		box77 = new ModelRendererTurbo(this, 94, 197, 256, 256);
		box77.addBox(0F, 0F, 0F, 3, 4, 4);
		box77.setPosition(25F, 21F, -5F);

		box79 = new ModelRendererTurbo(this, 166, 151, 256, 256);
		box79.addBox(0F, 0F, 0F, 2, 4, 2);
		box79.setPosition(2F, 7F, 7F);

		box8 = new ModelRendererTurbo(this, 3, 37, 256, 256);
		box8.addBox(0F, 0F, 0F, 7, 3, 6);
		box8.setPosition(-20F, 4F, -3F);

		box80 = new ModelRendererTurbo(this, 156, 151, 256, 256);
		box80.addBox(0F, 0F, 0F, 2, 4, 2);
		box80.setPosition(-2F, 7F, 7F);

		box81 = new ModelRendererTurbo(this, 177, 153, 256, 256);
		box81.addBox(0F, 0F, 0F, 1, 6, 4);
		box81.setPosition(4F, 2F, 6F);

		box82 = new ModelRendererTurbo(this, 189, 153, 256, 256);
		box82.addBox(0F, 0F, 0F, 1, 6, 4);
		box82.setPosition(-3F, 2F, 6F);

		box89 = new ModelRendererTurbo(this, 16, 11, 256, 256);
		box89.addBox(0F, 0F, 0F, 2, 4, 4);
		box89.setPosition(13F, 1F, 5F);

		box9 = new ModelRendererTurbo(this, 0, 208, 256, 256);
		box9.addBox(0F, 0F, 0F, 60, 3, 2);
		box9.setPosition(-30F, 6F, -1F);

		box90 = new ModelRendererTurbo(this, 16, 11, 256, 256);
		box90.addBox(1F, 0F, 0F, 2, 4, 4);
		box90.setPosition(21F, 1F, 5F);

		box91 = new ModelRendererTurbo(this, 16, 11, 256, 256);
		box91.addBox(0F, 0F, 0F, 2, 4, 4);
		box91.setPosition(-11F, 1F, 5F);

		box92 = new ModelRendererTurbo(this, 16, 11, 256, 256);
		box92.addBox(0F, 0F, 0F, 2, 4, 4);
		box92.setPosition(-20F, 1F, 5F);

		box95 = new ModelRendererTurbo(this, 110, 184, 256, 256);
		box95.addBox(0F, 0F, 0F, 8, 11, 10);
		box95.setPosition(-1F, 3F, -8F);

		box96 = new ModelRendererTurbo(this, 154, 185, 256, 256);
		box96.addBox(0F, 0F, 0F, 3, 11, 10);
		box96.setPosition(-2F, 11F, -8F);

		box97 = new ModelRendererTurbo(this, 84, 178, 256, 256);
		box97.addBox(0F, 0F, 0F, 11, 3, 0);
		box97.setPosition(13F, 11F, 9F);

		box98 = new ModelRendererTurbo(this, 84, 178, 256, 256);
		box98.addBox(0F, 0F, 0F, 11, 3, 0);
		box98.setPosition(13F, 11F, 5F);

		brake_cyl = new ModelRendererTurbo(this, 84, 170, 256, 256);
		brake_cyl.addBox(0F, 0F, 0F, 11, 3, 3);
		brake_cyl.setPosition(24F, 14F, 9F);
		brake_cyl.rotateAngleX = -5.497787143782138F;
		brake_cyl.rotateAngleY = -3.141592653589793F;

		coal_pile = new ModelRendererTurbo(this, 168, 201, 256, 256);
		coal_pile.addBox(-8F, 0F, 0F, 10, 1, 20);
		coal_pile.setPosition(-19F, 18F, -10F);
		coal_pile.rotateAngleZ = -0.08726646259971647F;

		crank_1 = new ModelRendererTurbo(this, 189, 142, 256, 256);
		crank_1.addBox(0F, -1F, 0F, 1, 5, 3);
		crank_1.setPosition(3F, 1F, 8F);
		crank_1.rotateAngleX = -0.7853981633974483F;

		crank_2 = new ModelRendererTurbo(this, 189, 142, 256, 256);
		crank_2.addBox(0F, -1F, 0F, 1, 5, 3);
		crank_2.setPosition(1F, 1F, 8F);
		crank_2.rotateAngleX = -0.7853981633974483F;

		crank_3 = new ModelRendererTurbo(this, 175, 142, 256, 256);
		crank_3.addBox(0F, -1F, 0F, 1, 3, 5);
		crank_3.setPosition(0F, 1F, 7F);
		crank_3.rotateAngleX = -0.7853981633974483F;

		crank_4 = new ModelRendererTurbo(this, 175, 142, 256, 256);
		crank_4.addBox(0F, -1F, 0F, 1, 3, 5);
		crank_4.setPosition(-2F, 1F, 7F);
		crank_4.rotateAngleX = -0.7853981633974483F;

		ladder_blank_side = new ModelRendererTurbo(this, 221, 121, 256, 256);
		ladder_blank_side.addBox(0F, -4F, 0F, 4, 5, 1);
		ladder_blank_side.setPosition(-14F, 10F, -9F);
		ladder_blank_side.rotateAngleX = -6.178465552059927F;

		ladder_piston_side = new ModelRendererTurbo(this, 221, 121, 256, 256);
		ladder_piston_side.addBox(0F, -4F, 0F, 4, 5, 1);
		ladder_piston_side.setPosition(-10F, 10F, 9F);
		ladder_piston_side.rotateAngleX = -6.178465552059927F;
		ladder_piston_side.rotateAngleY = -3.141592653589793F;

		piston_front = new ModelRendererTurbo(this, 189, 164, 256, 256);
		piston_front.addBox(0F, 0F, 0F, 1, 6, 1);
		piston_front.setPosition(2F, 2F, 9F);
		piston_front.rotateAngleX = -0.2792526803190927F;

		piston_rear = new ModelRendererTurbo(this, 184, 164, 256, 256);
		piston_rear.addBox(0F, 0F, 0F, 1, 6, 1);
		piston_rear.setPosition(0F, 2F, 7F);
		piston_rear.rotateAngleX = -0.2792526803190927F;
		piston_rear.rotateAngleY = -3.141592653589793F;

		rod_frnt_mid = new ModelRendererTurbo(this, 136, 147, 256, 256);
		rod_frnt_mid.addBox(0F, 0F, -1F, 9, 1, 1);
		rod_frnt_mid.setPosition(5F, 3F, 9F);
		rod_frnt_mid.rotateAngleX = -0.7853981633974483F;
		rod_frnt_mid.rotateAngleY = -6.178465552059927F;

		rod_frnt_track = new ModelRendererTurbo(this, 3, 6, 256, 256);
		rod_frnt_track.addBox(2F, 0F, -1F, 9, 1, 1);
		rod_frnt_track.setPosition(12F, 3F, 8F);
		rod_frnt_track.rotateAngleX = -0.7853981633974483F;

		rod_rear_mid = new ModelRendererTurbo(this, 157, 147, 256, 256);
		rod_rear_mid.addBox(-7F, 0F, -1F, 7, 1, 1);
		rod_rear_mid.setPosition(-3F, 3F, 9F);
		rod_rear_mid.rotateAngleX = -0.7853981633974483F;
		rod_rear_mid.rotateAngleY = -0.15707963267948966F;

		rod_rear_truck = new ModelRendererTurbo(this, 3, 6, 256, 256);
		rod_rear_truck.addBox(-31F, 0F, -1F, 9, 1, 1);
		rod_rear_truck.setPosition(12F, 3F, 8F);
		rod_rear_truck.rotateAngleX = -0.7853981633974483F;

		roof_blank_lower = new ModelRendererTurbo(this, 4, 67, 256, 256);
		roof_blank_lower.addBox(0F, -1F, 0F, 18, 2, 5);
		roof_blank_lower.setPosition(-15F, 28F, -11F);
		roof_blank_lower.rotateAngleX = -0.7155849933176751F;

		roof_blank_upper = new ModelRendererTurbo(this, 4, 59, 256, 256);
		roof_blank_upper.addBox(0F, -2F, 0F, 18, 2, 5);
		roof_blank_upper.setPosition(3F, 33F, -3F);
		roof_blank_upper.rotateAngleX = -6.09119908946021F;
		roof_blank_upper.rotateAngleY = -3.141592653589793F;

		roof_piston_lower = new ModelRendererTurbo(this, 4, 67, 256, 256);
		roof_piston_lower.addBox(0F, -1F, 0F, 18, 2, 5);
		roof_piston_lower.setPosition(3F, 28F, 11F);
		roof_piston_lower.rotateAngleX = -0.7155849933176751F;
		roof_piston_lower.rotateAngleY = -3.141592653589793F;

		roof_piston_upper = new ModelRendererTurbo(this, 4, 59, 256, 256);
		roof_piston_upper.addBox(0F, -2F, 0F, 18, 2, 5);
		roof_piston_upper.setPosition(-15F, 33F, 3F);
		roof_piston_upper.rotateAngleX = -6.09119908946021F;

	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		boiler_blank_lower.render(f5);
		boiler_blank_upper.render(f5);
		boiler_piston_lower.render(f5);
		boiler_piston_upper.render(f5);
		box.render(f5);
		box0.render(f5);
		box1.render(f5);
		box10.render(f5);
		box100.render(f5);
		box101.render(f5);
		box104.render(f5);
		box105.render(f5);
		box107.render(f5);
		box11.render(f5);
		box12.render(f5);
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
		box32.render(f5);
		box33.render(f5);
		box34.render(f5);
		box35.render(f5);
		box36.render(f5);
		box37.render(f5);
		box39.render(f5);
		box4.render(f5);
		box40.render(f5);
		box41.render(f5);
		box42.render(f5);
		box45.render(f5);
		box46.render(f5);
		box48.render(f5);
		box49.render(f5);
		box50.render(f5);
		box51.render(f5);
		box52.render(f5);
		box53.render(f5);
		box54.render(f5);
		box55.render(f5);
		box56.render(f5);
		box57.render(f5);
		box58.render(f5);
		box6.render(f5);
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
		box73.render(f5);
		box75.render(f5);
		box76.render(f5);
		box79.render(f5);
		box8.render(f5);
		box80.render(f5);
		box81.render(f5);
		box82.render(f5);
		box89.render(f5);
		box9.render(f5);
		box90.render(f5);
		box91.render(f5);
		box92.render(f5);
		box95.render(f5);
		box96.render(f5);
		box97.render(f5);
		box98.render(f5);
		brake_cyl.render(f5);
		crank_1.render(f5);
		crank_2.render(f5);
		crank_3.render(f5);
		crank_4.render(f5);
		ladder_blank_side.render(f5);
		ladder_piston_side.render(f5);
		piston_front.render(f5);
		piston_rear.render(f5);
		rod_frnt_mid.render(f5);
		rod_frnt_track.render(f5);
		rod_rear_mid.render(f5);
		rod_rear_truck.render(f5);
		roof_blank_lower.render(f5);
		roof_blank_upper.render(f5);
		roof_piston_lower.render(f5);
		roof_piston_upper.render(f5);
		
		int cargo = 0;//((EntityLocoSteamShay) entity).getAmmountOfCargo();
		if (cargo != 0) {
			GL11.glPushMatrix();
			GL11.glTranslatef(0, -0.15f+cargo*0.016f, 0);
			coal_pile.render(f5);
			GL11.glPopMatrix();
		}
		
		Minecraft.getMinecraft().entityRenderer.disableLightmap();
		box74.render(f5);
		box77.render(f5);
		Minecraft.getMinecraft().entityRenderer.enableLightmap();
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {}
}