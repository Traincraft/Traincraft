package train.client.render.models;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import train.client.render.CustomModelRenderer;
import train.common.entity.rollingStock.EntityLocoSteamShay;

public class ModelLocoSteamShay extends ModelBase {

	public CustomModelRenderer boiler_blank_lower;
	public CustomModelRenderer boiler_blank_upper;
	public CustomModelRenderer boiler_piston_lower;
	public CustomModelRenderer boiler_piston_upper;
	public CustomModelRenderer box;
	public CustomModelRenderer box0;
	public CustomModelRenderer box1;
	public CustomModelRenderer box10;
	public CustomModelRenderer box100;
	public CustomModelRenderer box101;
	public CustomModelRenderer box104;
	public CustomModelRenderer box105;
	public CustomModelRenderer box107;
	public CustomModelRenderer box11;
	public CustomModelRenderer box12;
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
	public CustomModelRenderer box32;
	public CustomModelRenderer box33;
	public CustomModelRenderer box34;
	public CustomModelRenderer box35;
	public CustomModelRenderer box36;
	public CustomModelRenderer box37;
	public CustomModelRenderer box39;
	public CustomModelRenderer box4;
	public CustomModelRenderer box40;
	public CustomModelRenderer box41;
	public CustomModelRenderer box42;
	public CustomModelRenderer box45;
	public CustomModelRenderer box46;
	public CustomModelRenderer box48;
	public CustomModelRenderer box49;
	public CustomModelRenderer box50;
	public CustomModelRenderer box51;
	public CustomModelRenderer box52;
	public CustomModelRenderer box53;
	public CustomModelRenderer box54;
	public CustomModelRenderer box55;
	public CustomModelRenderer box56;
	public CustomModelRenderer box57;
	public CustomModelRenderer box58;
	public CustomModelRenderer box6;
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
	public CustomModelRenderer box73;
	public CustomModelRenderer box74;
	public CustomModelRenderer box75;
	public CustomModelRenderer box76;
	public CustomModelRenderer box77;
	public CustomModelRenderer box79;
	public CustomModelRenderer box8;
	public CustomModelRenderer box80;
	public CustomModelRenderer box81;
	public CustomModelRenderer box82;
	public CustomModelRenderer box89;
	public CustomModelRenderer box9;
	public CustomModelRenderer box90;
	public CustomModelRenderer box91;
	public CustomModelRenderer box92;
	public CustomModelRenderer box95;
	public CustomModelRenderer box96;
	public CustomModelRenderer box97;
	public CustomModelRenderer box98;
	public CustomModelRenderer brake_cyl;
	public CustomModelRenderer coal_pile;
	public CustomModelRenderer crank_1;
	public CustomModelRenderer crank_2;
	public CustomModelRenderer crank_3;
	public CustomModelRenderer crank_4;
	public CustomModelRenderer ladder_blank_side;
	public CustomModelRenderer ladder_piston_side;
	public CustomModelRenderer piston_front;
	public CustomModelRenderer piston_rear;
	public CustomModelRenderer rod_frnt_mid;
	public CustomModelRenderer rod_frnt_track;
	public CustomModelRenderer rod_rear_mid;
	public CustomModelRenderer rod_rear_truck;
	public CustomModelRenderer roof_blank_lower;
	public CustomModelRenderer roof_blank_upper;
	public CustomModelRenderer roof_piston_lower;
	public CustomModelRenderer roof_piston_upper;

	public ModelLocoSteamShay() {
		boiler_blank_lower = new CustomModelRenderer(this, 1, 180, 256, 256);
		boiler_blank_lower.addBox(0F, 0F, 0F, 24, 4, 4);
		boiler_blank_lower.setPosition(2F, 14F, -8F);
		boiler_blank_lower.rotateAngleX = -5.497787143782138F;

		boiler_blank_upper = new CustomModelRenderer(this, 1, 170, 256, 256);
		boiler_blank_upper.addBox(0F, 0F, 0F, 24, 4, 4);
		boiler_blank_upper.setPosition(2F, 18F, -8F);
		boiler_blank_upper.rotateAngleX = -5.497787143782138F;

		boiler_piston_lower = new CustomModelRenderer(this, 1, 150, 256, 256);
		boiler_piston_lower.addBox(0F, 0F, 0F, 24, 4, 4);
		boiler_piston_lower.setPosition(26F, 14F, 2F);
		boiler_piston_lower.rotateAngleX = -5.497787143782138F;
		boiler_piston_lower.rotateAngleY = -3.141592653589793F;

		boiler_piston_upper = new CustomModelRenderer(this, 1, 160, 256, 256);
		boiler_piston_upper.addBox(0F, 0F, 0F, 24, 4, 4);
		boiler_piston_upper.setPosition(26F, 18F, 2F);
		boiler_piston_upper.rotateAngleX = -5.497787143782138F;
		boiler_piston_upper.rotateAngleY = -3.141592653589793F;

		box = new CustomModelRenderer(this, 203, 11, 256, 256);
		box.addBox(0F, 0F, 0F, 6, 6, 0);
		box.setPosition(-24F, 0F, 5F);

		box0 = new CustomModelRenderer(this, 3, 27, 256, 256);
		box0.addBox(0F, 0F, 0F, 17, 5, 1);
		box0.setPosition(-25F, 1F, -6F);

		box1 = new CustomModelRenderer(this, 203, 11, 256, 256);
		box1.addBox(0F, 0F, 0F, 6, 6, 0);
		box1.setPosition(-15F, 0F, 5F);

		box10 = new CustomModelRenderer(this, 28, 8, 256, 256);
		box10.addBox(0F, 0F, 0F, 2, 2, 14);
		box10.setPosition(-22F, 2F, -7F);

		box100 = new CustomModelRenderer(this, 220, 128, 256, 256);
		box100.addBox(0F, 0F, 0F, 4, 1, 2);
		box100.setPosition(-14F, 6F, -11F);

		box101 = new CustomModelRenderer(this, 220, 128, 256, 256);
		box101.addBox(0F, 0F, 0F, 4, 1, 2);
		box101.setPosition(-14F, 6F, 9F);

		box104 = new CustomModelRenderer(this, 219, 229, 256, 256);
		box104.addBox(0F, 0F, 0F, 0, 4, 18);
		box104.setPosition(28F, 2F, -9F);

		box105 = new CustomModelRenderer(this, 219, 229, 256, 256);
		box105.addBox(0F, 0F, 0F, 0, 4, 18);
		box105.setPosition(-28F, 2F, -9F);

		box107 = new CustomModelRenderer(this, 196, 236, 256, 256);
		box107.addBox(0F, 0F, 0F, 2, 1, 18);
		box107.setPosition(-30F, 2F, -9F);

		box11 = new CustomModelRenderer(this, 40, 27, 256, 256);
		box11.addBox(0F, 0F, 0F, 17, 5, 1);
		box11.setPosition(-25F, 1F, 5F);

		box12 = new CustomModelRenderer(this, 3, 37, 256, 256);
		box12.addBox(0F, 0F, 0F, 7, 3, 6);
		box12.setPosition(13F, 4F, -3F);

		box14 = new CustomModelRenderer(this, 48, 3, 256, 256);
		box14.addBox(0F, 0F, 0F, 3, 3, 14);
		box14.setPosition(-18F, 3F, -7F);

		box15 = new CustomModelRenderer(this, 3, 13, 256, 256);
		box15.addBox(0F, 0F, 0F, 1, 2, 10);
		box15.setPosition(24F, 4F, -5F);

		box16 = new CustomModelRenderer(this, 211, 209, 256, 256);
		box16.addBox(0F, 0F, 0F, 2, 5, 20);
		box16.setPosition(-26F, 6F, 10F);
		box16.rotateAngleY = -3.141592653589793F;

		box17 = new CustomModelRenderer(this, 40, 27, 256, 256);
		box17.addBox(0F, 0F, 0F, 17, 5, 1);
		box17.setPosition(8F, 1F, 5F);

		box18 = new CustomModelRenderer(this, 48, 3, 256, 256);
		box18.addBox(0F, 0F, 0F, 3, 3, 14);
		box18.setPosition(15F, 3F, -7F);

		box19 = new CustomModelRenderer(this, 28, 8, 256, 256);
		box19.addBox(0F, 0F, 0F, 2, 2, 14);
		box19.setPosition(11F, 2F, -7F);

		box2 = new CustomModelRenderer(this, 1, 238, 256, 256);
		box2.addBox(0F, 0F, 0F, 52, 3, 14);
		box2.setPosition(-26F, 7F, -9F);

		box20 = new CustomModelRenderer(this, 3, 13, 256, 256);
		box20.addBox(0F, 0F, 0F, 1, 2, 10);
		box20.setPosition(-25F, 4F, -5F);

		box21 = new CustomModelRenderer(this, 28, 8, 256, 256);
		box21.addBox(0F, 0F, 0F, 2, 2, 14);
		box21.setPosition(20F, 2F, -7F);

		box22 = new CustomModelRenderer(this, 3, 27, 256, 256);
		box22.addBox(0F, 0F, 0F, 17, 5, 1);
		box22.setPosition(8F, 1F, -6F);

		box23 = new CustomModelRenderer(this, 213, 152, 256, 256);
		box23.addBox(14F, 0F, 0F, 1, 11, 20);
		box23.setPosition(-13F, 11F, -10F);

		box24 = new CustomModelRenderer(this, 188, 11, 256, 256);
		box24.addBox(0F, 0F, 0F, 6, 6, 0);
		box24.setPosition(9F, 0F, -5F);

		box25 = new CustomModelRenderer(this, 188, 11, 256, 256);
		box25.addBox(0F, 0F, 0F, 6, 6, 0);
		box25.setPosition(18F, 0F, -5F);

		box26 = new CustomModelRenderer(this, 203, 11, 256, 256);
		box26.addBox(0F, 0F, 0F, 6, 6, 0);
		box26.setPosition(18F, 0F, 5F);

		box27 = new CustomModelRenderer(this, 203, 11, 256, 256);
		box27.addBox(0F, 0F, 0F, 6, 6, 0);
		box27.setPosition(9F, 0F, 5F);

		box28 = new CustomModelRenderer(this, 196, 236, 256, 256);
		box28.addBox(0F, 0F, 0F, 2, 1, 18);
		box28.setPosition(28F, 2F, -9F);

		box29 = new CustomModelRenderer(this, 213, 184, 256, 256);
		box29.addBox(0F, -1F, 0F, 1, 3, 20);
		box29.setPosition(-17F, 18F, -10F);

		box3 = new CustomModelRenderer(this, 28, 8, 256, 256);
		box3.addBox(0F, 0F, 0F, 2, 2, 14);
		box3.setPosition(-13F, 2F, -7F);

		box30 = new CustomModelRenderer(this, 1, 190, 256, 256);
		box30.addBox(0F, 0F, 0F, 24, 4, 10);
		box30.setPosition(2F, 14F, -8F);

		box32 = new CustomModelRenderer(this, 3, 13, 256, 256);
		box32.addBox(0F, 0F, 0F, 1, 2, 10);
		box32.setPosition(8F, 4F, -5F);

		box33 = new CustomModelRenderer(this, 155, 159, 256, 256);
		box33.addBox(0F, 0F, 0F, 6, 6, 4);
		box33.setPosition(-2F, 11F, 6F);

		box34 = new CustomModelRenderer(this, 149, 224, 256, 256);
		box34.addBox(0F, 0F, 0F, 11, 6, 20);
		box34.setPosition(-26F, 11F, -10F);

		box35 = new CustomModelRenderer(this, 238, 186, 256, 256);
		box35.addBox(0F, 0F, 0F, 5, 8, 1);
		box35.setPosition(-10F, 11F, 10F);

		box36 = new CustomModelRenderer(this, 205, 185, 256, 256);
		box36.addBox(0F, 0F, 0F, 12, 10, 1);
		box36.setPosition(-10F, 11F, -11F);

		box37 = new CustomModelRenderer(this, 129, 223, 256, 256);
		box37.addBox(0F, 0F, 0F, 13, 10, 1);
		box37.setPosition(-27F, 11F, -11F);

		box39 = new CustomModelRenderer(this, 120, 239, 256, 256);
		box39.addBox(0F, 0F, 0F, 13, 10, 1);
		box39.setPosition(-27F, 11F, 10F);

		box4 = new CustomModelRenderer(this, 3, 13, 256, 256);
		box4.addBox(0F, 0F, 0F, 1, 2, 10);
		box4.setPosition(-9F, 4F, -5F);

		box40 = new CustomModelRenderer(this, 129, 189, 256, 256);
		box40.addBox(0F, 0F, 0F, 1, 10, 20);
		box40.setPosition(-27F, 11F, -10F);

		box41 = new CustomModelRenderer(this, 193, 232, 256, 256);
		box41.addBox(0F, -1F, 0F, 3, 4, 6);
		box41.setPosition(-25F, 18F, -3F);

		box42 = new CustomModelRenderer(this, 3, 50, 256, 256);
		box42.addBox(0F, 0F, 0F, 18, 2, 6);
		box42.setPosition(-15F, 31F, -3F);

		box45 = new CustomModelRenderer(this, 213, 121, 256, 256);
		box45.addBox(0F, 0F, 0F, 1, 3, 20);
		box45.setPosition(1F, 28F, -10F);

		box46 = new CustomModelRenderer(this, 213, 146, 256, 256);
		box46.addBox(0F, 0F, 0F, 12, 1, 1);
		box46.setPosition(-10F, 27F, 10F);

		box48 = new CustomModelRenderer(this, 221, 163, 256, 256);
		box48.addBox(0F, 0F, 0F, 4, 6, 1);
		box48.setPosition(-2F, 21F, 10F);

		box49 = new CustomModelRenderer(this, 214, 163, 256, 256);
		box49.addBox(0F, 0F, 0F, 2, 6, 1);
		box49.setPosition(-10F, 21F, 10F);

		box50 = new CustomModelRenderer(this, 221, 154, 256, 256);
		box50.addBox(0F, 0F, 0F, 4, 6, 1);
		box50.setPosition(-2F, 21F, -11F);

		box51 = new CustomModelRenderer(this, 214, 154, 256, 256);
		box51.addBox(0F, 0F, 0F, 2, 6, 1);
		box51.setPosition(-10F, 21F, -11F);

		box52 = new CustomModelRenderer(this, 213, 149, 256, 256);
		box52.addBox(0F, 0F, 0F, 12, 1, 1);
		box52.setPosition(-10F, 27F, -11F);

		box53 = new CustomModelRenderer(this, 246, 163, 256, 256);
		box53.addBox(0F, 0F, 0F, 1, 6, 1);
		box53.setPosition(1F, 22F, -10F);

		box54 = new CustomModelRenderer(this, 246, 163, 256, 256);
		box54.addBox(0F, 0F, 0F, 1, 6, 1);
		box54.setPosition(1F, 22F, 9F);

		box55 = new CustomModelRenderer(this, 236, 163, 256, 256);
		box55.addBox(0F, 0F, 0F, 1, 6, 1);
		box55.setPosition(1F, 22F, -5F);

		box56 = new CustomModelRenderer(this, 236, 163, 256, 256);
		box56.addBox(0F, 0F, 0F, 1, 6, 1);
		box56.setPosition(1F, 22F, 4F);

		box57 = new CustomModelRenderer(this, 237, 147, 256, 256);
		box57.addBox(0F, 0F, 0F, 1, 2, 8);
		box57.setPosition(1F, 22F, -4F);

		box58 = new CustomModelRenderer(this, 1, 135, 256, 256);
		box58.addBox(0F, 0F, 0F, 24, 10, 4);
		box58.setPosition(2F, 11F, -5F);

		box6 = new CustomModelRenderer(this, 211, 209, 256, 256);
		box6.addBox(0F, 0F, 0F, 2, 5, 20);
		box6.setPosition(26F, 6F, -10F);

		box63 = new CustomModelRenderer(this, 188, 11, 256, 256);
		box63.addBox(0F, 0F, 0F, 6, 6, 0);
		box63.setPosition(-15F, 0F, -5F);

		box64 = new CustomModelRenderer(this, 61, 186, 256, 256);
		box64.addBox(0F, 0F, 0F, 1, 6, 6);
		box64.setPosition(26F, 13F, -6F);

		box65 = new CustomModelRenderer(this, 192, 165, 256, 256);
		box65.addBox(0F, 0F, 0F, 1, 8, 8);
		box65.setPosition(6F, 10F, 3F);

		box66 = new CustomModelRenderer(this, 129, 171, 256, 256);
		box66.addBox(0F, 0F, 0F, 12, 1, 8);
		box66.setPosition(-5F, 18F, 3F);

		box67 = new CustomModelRenderer(this, 172, 165, 256, 256);
		box67.addBox(0F, 0F, 0F, 1, 8, 8);
		box67.setPosition(-5F, 10F, 3F);

		box68 = new CustomModelRenderer(this, 205, 197, 256, 256);
		box68.addBox(0F, 0F, 0F, 12, 2, 1);
		box68.setPosition(-10F, 19F, 10F);

		box69 = new CustomModelRenderer(this, 1, 214, 256, 256);
		box69.addBox(0F, 0F, 0F, 52, 1, 22);
		box69.setPosition(-26F, 10F, -11F);

		box7 = new CustomModelRenderer(this, 188, 11, 256, 256);
		box7.addBox(0F, 0F, 0F, 6, 6, 0);
		box7.setPosition(-24F, 0F, -5F);

		box70 = new CustomModelRenderer(this, 130, 152, 256, 256);
		box70.addBox(0F, 0F, 0F, 10, 4, 2);
		box70.setPosition(-4F, 13F, 7F);

		box71 = new CustomModelRenderer(this, 130, 160, 256, 256);
		box71.addBox(0F, 0F, 0F, 10, 8, 2);
		box71.setPosition(-4F, 10F, 3F);

		box73 = new CustomModelRenderer(this, 77, 188, 256, 256);
		box73.addBox(-2F, 0F, -2F, 4, 14, 4);
		box73.setPosition(22F, 19F, -3F);

		box74 = new CustomModelRenderer(this, 94, 187, 256, 256);
		box74.addBox(0F, -1F, 0F, 3, 4, 4);
		box74.setPosition(-26F, 21F, 2F);
		box74.rotateAngleY = -3.141592653589793F;

		box75 = new CustomModelRenderer(this, 58, 173, 256, 256);
		box75.addBox(0F, 0F, 0F, 6, 4, 6);
		box75.setPosition(10F, 20F, -6F);

		box76 = new CustomModelRenderer(this, 59, 163, 256, 256);
		box76.addBox(0F, 0F, 0F, 4, 4, 4);
		box76.setPosition(11F, 22F, -5F);

		box77 = new CustomModelRenderer(this, 94, 197, 256, 256);
		box77.addBox(0F, 0F, 0F, 3, 4, 4);
		box77.setPosition(25F, 21F, -5F);

		box79 = new CustomModelRenderer(this, 166, 151, 256, 256);
		box79.addBox(0F, 0F, 0F, 2, 4, 2);
		box79.setPosition(2F, 7F, 7F);

		box8 = new CustomModelRenderer(this, 3, 37, 256, 256);
		box8.addBox(0F, 0F, 0F, 7, 3, 6);
		box8.setPosition(-20F, 4F, -3F);

		box80 = new CustomModelRenderer(this, 156, 151, 256, 256);
		box80.addBox(0F, 0F, 0F, 2, 4, 2);
		box80.setPosition(-2F, 7F, 7F);

		box81 = new CustomModelRenderer(this, 177, 153, 256, 256);
		box81.addBox(0F, 0F, 0F, 1, 6, 4);
		box81.setPosition(4F, 2F, 6F);

		box82 = new CustomModelRenderer(this, 189, 153, 256, 256);
		box82.addBox(0F, 0F, 0F, 1, 6, 4);
		box82.setPosition(-3F, 2F, 6F);

		box89 = new CustomModelRenderer(this, 16, 11, 256, 256);
		box89.addBox(0F, 0F, 0F, 2, 4, 4);
		box89.setPosition(13F, 1F, 5F);

		box9 = new CustomModelRenderer(this, 0, 208, 256, 256);
		box9.addBox(0F, 0F, 0F, 60, 3, 2);
		box9.setPosition(-30F, 6F, -1F);

		box90 = new CustomModelRenderer(this, 16, 11, 256, 256);
		box90.addBox(1F, 0F, 0F, 2, 4, 4);
		box90.setPosition(21F, 1F, 5F);

		box91 = new CustomModelRenderer(this, 16, 11, 256, 256);
		box91.addBox(0F, 0F, 0F, 2, 4, 4);
		box91.setPosition(-11F, 1F, 5F);

		box92 = new CustomModelRenderer(this, 16, 11, 256, 256);
		box92.addBox(0F, 0F, 0F, 2, 4, 4);
		box92.setPosition(-20F, 1F, 5F);

		box95 = new CustomModelRenderer(this, 110, 184, 256, 256);
		box95.addBox(0F, 0F, 0F, 8, 11, 10);
		box95.setPosition(-1F, 3F, -8F);

		box96 = new CustomModelRenderer(this, 154, 185, 256, 256);
		box96.addBox(0F, 0F, 0F, 3, 11, 10);
		box96.setPosition(-2F, 11F, -8F);

		box97 = new CustomModelRenderer(this, 84, 178, 256, 256);
		box97.addBox(0F, 0F, 0F, 11, 3, 0);
		box97.setPosition(13F, 11F, 9F);

		box98 = new CustomModelRenderer(this, 84, 178, 256, 256);
		box98.addBox(0F, 0F, 0F, 11, 3, 0);
		box98.setPosition(13F, 11F, 5F);

		brake_cyl = new CustomModelRenderer(this, 84, 170, 256, 256);
		brake_cyl.addBox(0F, 0F, 0F, 11, 3, 3);
		brake_cyl.setPosition(24F, 14F, 9F);
		brake_cyl.rotateAngleX = -5.497787143782138F;
		brake_cyl.rotateAngleY = -3.141592653589793F;

		coal_pile = new CustomModelRenderer(this, 168, 201, 256, 256);
		coal_pile.addBox(-8F, 0F, 0F, 10, 1, 20);
		coal_pile.setPosition(-19F, 18F, -10F);
		coal_pile.rotateAngleZ = -0.08726646259971647F;

		crank_1 = new CustomModelRenderer(this, 189, 142, 256, 256);
		crank_1.addBox(0F, -1F, 0F, 1, 5, 3);
		crank_1.setPosition(3F, 1F, 8F);
		crank_1.rotateAngleX = -0.7853981633974483F;

		crank_2 = new CustomModelRenderer(this, 189, 142, 256, 256);
		crank_2.addBox(0F, -1F, 0F, 1, 5, 3);
		crank_2.setPosition(1F, 1F, 8F);
		crank_2.rotateAngleX = -0.7853981633974483F;

		crank_3 = new CustomModelRenderer(this, 175, 142, 256, 256);
		crank_3.addBox(0F, -1F, 0F, 1, 3, 5);
		crank_3.setPosition(0F, 1F, 7F);
		crank_3.rotateAngleX = -0.7853981633974483F;

		crank_4 = new CustomModelRenderer(this, 175, 142, 256, 256);
		crank_4.addBox(0F, -1F, 0F, 1, 3, 5);
		crank_4.setPosition(-2F, 1F, 7F);
		crank_4.rotateAngleX = -0.7853981633974483F;

		ladder_blank_side = new CustomModelRenderer(this, 221, 121, 256, 256);
		ladder_blank_side.addBox(0F, -4F, 0F, 4, 5, 1);
		ladder_blank_side.setPosition(-14F, 10F, -9F);
		ladder_blank_side.rotateAngleX = -6.178465552059927F;

		ladder_piston_side = new CustomModelRenderer(this, 221, 121, 256, 256);
		ladder_piston_side.addBox(0F, -4F, 0F, 4, 5, 1);
		ladder_piston_side.setPosition(-10F, 10F, 9F);
		ladder_piston_side.rotateAngleX = -6.178465552059927F;
		ladder_piston_side.rotateAngleY = -3.141592653589793F;

		piston_front = new CustomModelRenderer(this, 189, 164, 256, 256);
		piston_front.addBox(0F, 0F, 0F, 1, 6, 1);
		piston_front.setPosition(2F, 2F, 9F);
		piston_front.rotateAngleX = -0.2792526803190927F;

		piston_rear = new CustomModelRenderer(this, 184, 164, 256, 256);
		piston_rear.addBox(0F, 0F, 0F, 1, 6, 1);
		piston_rear.setPosition(0F, 2F, 7F);
		piston_rear.rotateAngleX = -0.2792526803190927F;
		piston_rear.rotateAngleY = -3.141592653589793F;

		rod_frnt_mid = new CustomModelRenderer(this, 136, 147, 256, 256);
		rod_frnt_mid.addBox(0F, 0F, -1F, 9, 1, 1);
		rod_frnt_mid.setPosition(5F, 3F, 9F);
		rod_frnt_mid.rotateAngleX = -0.7853981633974483F;
		rod_frnt_mid.rotateAngleY = -6.178465552059927F;

		rod_frnt_track = new CustomModelRenderer(this, 3, 6, 256, 256);
		rod_frnt_track.addBox(2F, 0F, -1F, 9, 1, 1);
		rod_frnt_track.setPosition(12F, 3F, 8F);
		rod_frnt_track.rotateAngleX = -0.7853981633974483F;

		rod_rear_mid = new CustomModelRenderer(this, 157, 147, 256, 256);
		rod_rear_mid.addBox(-7F, 0F, -1F, 7, 1, 1);
		rod_rear_mid.setPosition(-3F, 3F, 9F);
		rod_rear_mid.rotateAngleX = -0.7853981633974483F;
		rod_rear_mid.rotateAngleY = -0.15707963267948966F;

		rod_rear_truck = new CustomModelRenderer(this, 3, 6, 256, 256);
		rod_rear_truck.addBox(-31F, 0F, -1F, 9, 1, 1);
		rod_rear_truck.setPosition(12F, 3F, 8F);
		rod_rear_truck.rotateAngleX = -0.7853981633974483F;

		roof_blank_lower = new CustomModelRenderer(this, 4, 67, 256, 256);
		roof_blank_lower.addBox(0F, -1F, 0F, 18, 2, 5);
		roof_blank_lower.setPosition(-15F, 28F, -11F);
		roof_blank_lower.rotateAngleX = -0.7155849933176751F;

		roof_blank_upper = new CustomModelRenderer(this, 4, 59, 256, 256);
		roof_blank_upper.addBox(0F, -2F, 0F, 18, 2, 5);
		roof_blank_upper.setPosition(3F, 33F, -3F);
		roof_blank_upper.rotateAngleX = -6.09119908946021F;
		roof_blank_upper.rotateAngleY = -3.141592653589793F;

		roof_piston_lower = new CustomModelRenderer(this, 4, 67, 256, 256);
		roof_piston_lower.addBox(0F, -1F, 0F, 18, 2, 5);
		roof_piston_lower.setPosition(3F, 28F, 11F);
		roof_piston_lower.rotateAngleX = -0.7155849933176751F;
		roof_piston_lower.rotateAngleY = -3.141592653589793F;

		roof_piston_upper = new CustomModelRenderer(this, 4, 59, 256, 256);
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
		
		int cargo = ((EntityLocoSteamShay) entity).getAmmountOfCargo();
		if (cargo != 0) {
			GL11.glPushMatrix();
			GL11.glTranslatef(0, -0.15f+cargo*0.016f, 0);
			coal_pile.render(f5);
			GL11.glPopMatrix();
		}
		
		Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
		box74.render(f5);
		box77.render(f5);
		Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {}
}