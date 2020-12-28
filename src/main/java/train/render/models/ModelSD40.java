package train.render.models;

import fexcraft.tmt.slim.ModelBase;
import fexcraft.tmt.slim.ModelRendererTurbo;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;

public class ModelSD40 extends ModelBase {
	
	public ModelRendererTurbo box;
	public ModelRendererTurbo box0;
	public ModelRendererTurbo box1;
	public ModelRendererTurbo box10;
	public ModelRendererTurbo box100;
	public ModelRendererTurbo box102;
	public ModelRendererTurbo box104;
	public ModelRendererTurbo box105;
	public ModelRendererTurbo box106;
	public ModelRendererTurbo box107;
	public ModelRendererTurbo box108;
	public ModelRendererTurbo box109;
	public ModelRendererTurbo box11;
	public ModelRendererTurbo box110;
	public ModelRendererTurbo box111;
	public ModelRendererTurbo box112;
	public ModelRendererTurbo box113;
	public ModelRendererTurbo box114;
	public ModelRendererTurbo box115;
	public ModelRendererTurbo box116;
	public ModelRendererTurbo box119;
	public ModelRendererTurbo box12;
	public ModelRendererTurbo box120;
	public ModelRendererTurbo box121;
	public ModelRendererTurbo box123;
	public ModelRendererTurbo box124;
	public ModelRendererTurbo box125;
	public ModelRendererTurbo box126;
	public ModelRendererTurbo box128;
	public ModelRendererTurbo box13;
	public ModelRendererTurbo box132;
	public ModelRendererTurbo box14;
	public ModelRendererTurbo box143;
	public ModelRendererTurbo box148;
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
	public ModelRendererTurbo box31;
	public ModelRendererTurbo box32;
	public ModelRendererTurbo box33;
	public ModelRendererTurbo box34;
	public ModelRendererTurbo box35;
	public ModelRendererTurbo box36;
	public ModelRendererTurbo box37;
	public ModelRendererTurbo box38;
	public ModelRendererTurbo box39;
	public ModelRendererTurbo box4;
	public ModelRendererTurbo box40;
	public ModelRendererTurbo box41;
	public ModelRendererTurbo box42;
	public ModelRendererTurbo box43;
	public ModelRendererTurbo box44;
	public ModelRendererTurbo box45;
	public ModelRendererTurbo box46;
	public ModelRendererTurbo box47;
	public ModelRendererTurbo box48;
	public ModelRendererTurbo box49;
	public ModelRendererTurbo box5;
	public ModelRendererTurbo box50;
	public ModelRendererTurbo box51;
	public ModelRendererTurbo box52;
	public ModelRendererTurbo box53;
	public ModelRendererTurbo box54;
	public ModelRendererTurbo box55;
	public ModelRendererTurbo box56;
	public ModelRendererTurbo box57;
	public ModelRendererTurbo box58;
	public ModelRendererTurbo box59;
	public ModelRendererTurbo box6;
	public ModelRendererTurbo box60;
	public ModelRendererTurbo box61;
	public ModelRendererTurbo box62;
	public ModelRendererTurbo box63;
	public ModelRendererTurbo box64;
	public ModelRendererTurbo box66;
	public ModelRendererTurbo box67;
	public ModelRendererTurbo box68;
	public ModelRendererTurbo box69;
	public ModelRendererTurbo box7;
	public ModelRendererTurbo box70;
	public ModelRendererTurbo box71;
	public ModelRendererTurbo box72;
	public ModelRendererTurbo box73;
	public ModelRendererTurbo box74;
	public ModelRendererTurbo box75;
	public ModelRendererTurbo box76;
	public ModelRendererTurbo box77;
	public ModelRendererTurbo box78;
	public ModelRendererTurbo box79;
	public ModelRendererTurbo box8;
	public ModelRendererTurbo box80;
	public ModelRendererTurbo box81;
	public ModelRendererTurbo box82;
	public ModelRendererTurbo box84;
	public ModelRendererTurbo box85;
	public ModelRendererTurbo box89;
	public ModelRendererTurbo box9;
	public ModelRendererTurbo box90;
	public ModelRendererTurbo box91;
	public ModelRendererTurbo box92;
	public ModelRendererTurbo box93;
	public ModelRendererTurbo box94;
	public ModelRendererTurbo box95;
	public ModelRendererTurbo box96;
	public ModelRendererTurbo box97;
	public ModelRendererTurbo box98;

	public ModelSD40() {
		
		int textureHeight=256;
		int textureWidth=256;
		
		box = new ModelRendererTurbo(this,0, 2, textureWidth, textureHeight);
		box.addBox(0F, 0F, 0F, 1, 6, 20);
		//box.setPosition(5F, 0F, -30F);
		box.setRotationPoint(5, 0, -30);

		box0 = new ModelRendererTurbo(this,45, 2, textureWidth, textureHeight);
		box0.addBox(0F, 0F, 0F, 1, 4, 22);
		//box0.setPosition(6F, 2F, -31F);
		box0.setRotationPoint(6F, 2F, -31F);

		box1 = new ModelRendererTurbo(this,49, 31, textureWidth, textureHeight);
		box1.addBox(0F, 0F, 0F, 16, 2, 2);
		box1.setRotationPoint(-8F, 2F, -28F);

		box10 = new ModelRendererTurbo(this,0, 2, textureWidth, textureHeight);
		box10.addBox(0F, 0F, 0F, 1, 6, 20);
		box10.setRotationPoint(5F, 0F, 10F);

		box100 = new ModelRendererTurbo(this,211, 42, textureWidth, textureHeight);
		box100.addBox(0F, 0F, 0F, 5, 1, 12);
		box100.setRotationPoint(-5F, 32F, -22F);
		box100.rotateAngleZ = -2.6878070480712677F;

		box102 = new ModelRendererTurbo(this,133, 80, textureWidth, textureHeight);
		box102.addBox(2F, 0F, 0F, 14, 1, 1);
		box102.setRotationPoint(-9F, 30F, -22F);

		box104 = new ModelRendererTurbo(this,68, 62, textureWidth, textureHeight);
		box104.addBox(0F, 0F, 0F, 2, 3, 1);
		box104.setRotationPoint(-1F, 26F, 34F);

		box105 = new ModelRendererTurbo(this,200, 17, textureWidth, textureHeight);
		box105.addBox(0F, 0F, 0F, 2, 3, 2);
		box105.setRotationPoint(-1F, 29F, -26F);

		box106 = new ModelRendererTurbo(this,201, 29, textureWidth, textureHeight);
		box106.addBox(0F, 0F, 0F, 5, 3, 1);
		box106.setRotationPoint(-5F, 29F, -22F);
		box106.rotateAngleY = -5.6374134839416845F;

		box107 = new ModelRendererTurbo(this,201, 24, textureWidth, textureHeight);
		box107.addBox(0F, 0F, 0F, 5, 3, 1);
		box107.setRotationPoint(5F, 32F, -22F);
		box107.rotateAngleY = 0.6457718232379019F;
		box107.rotateAngleZ = 3.141592653589793F;

		box108 = new ModelRendererTurbo(this,184, 63, textureWidth, textureHeight);
		box108.addBox(0F, 0F, 0F, 16, 2, 1);
		box108.setRotationPoint(-8F, 28F, -11F);

		box109 = new ModelRendererTurbo(this,185, 67, textureWidth, textureHeight);
		box109.addBox(0F, 0F, 0F, 14, 1, 1);
		box109.setRotationPoint(-7F, 30F, -11F);

		box11 = new ModelRendererTurbo(this,1, 29, textureWidth, textureHeight);
		box11.addBox(0F, 0F, 0F, 12, 2, 1);
		box11.setRotationPoint(-6F, 3F, 9F);

		box110 = new ModelRendererTurbo(this,110, 56, textureWidth, textureHeight);
		box110.addBox(0F, 0F, 0F, 16, 12, 1);
		box110.setRotationPoint(-8F, 10F, -11F);

		box111 = new ModelRendererTurbo(this,172, 2, textureWidth, textureHeight);
		box111.addBox(0F, 0F, 0F, 12, 6, 1);
		box111.setRotationPoint(-6F, 22F, -11F);

		box112 = new ModelRendererTurbo(this,238, 74, textureWidth, textureHeight);
		box112.addBox(0F, 0F, 0F, 5, 22, 1);
		box112.setRotationPoint(5F, 10F, 31F);
		box112.rotateAngleY = -2.4958208303518914F;

		box113 = new ModelRendererTurbo(this,224, 74, textureWidth, textureHeight);
		box113.addBox(0F, 0F, 0F, 5, 22, 1);
		box113.setRotationPoint(-5F, 32F, 31F);
		box113.rotateAngleX = -3.141592653589793F;
		box113.rotateAngleY = -0.6457718232379019F;

		box114 = new ModelRendererTurbo(this,215, 74, textureWidth, textureHeight);
		box114.addBox(0F, 0F, 0F, 2, 22, 1);
		box114.setRotationPoint(-1F, 10F, 33F);

		box115 = new ModelRendererTurbo(this,200, 77, textureWidth, textureHeight);
		box115.addBox(0F, 0F, 0F, 6, 1, 1);
		box115.setRotationPoint(-3F, 31F, 31F);

		box116 = new ModelRendererTurbo(this,202, 80, textureWidth, textureHeight);
		box116.addBox(0F, 0F, 0F, 4, 1, 1);
		box116.setRotationPoint(-2F, 31F, 32F);

		box119 = new ModelRendererTurbo(this,89, 86, textureWidth, textureHeight);
		box119.addBox(0F, 0F, 0F, 12, 1, 14);
		box119.setRotationPoint(-6F, 31F, 4F);

		box12 = new ModelRendererTurbo(this,1, 29, textureWidth, textureHeight);
		box12.addBox(0F, 0F, 0F, 12, 2, 1);
		box12.setRotationPoint(-6F, 3F, 30F);

		box120 = new ModelRendererTurbo(this,172, 151, textureWidth, textureHeight);
		box120.addBox(0F, 0F, 0F, 2, 3, 14);
		box120.setRotationPoint(6F, 31F, 4F);
		box120.rotateAngleZ = -3.473205211468716F;

		box121 = new ModelRendererTurbo(this,207, 151, textureWidth, textureHeight);
		box121.addBox(0F, 0F, 0F, 2, 3, 14);
		box121.setRotationPoint(-6F, 31F, 18F);
		box121.rotateAngleX = -3.141592653589793F;
		box121.rotateAngleZ = -5.969026041820607F;

		box123 = new ModelRendererTurbo(this,4, 129, textureWidth, textureHeight);
		box123.addBox(0F, 0F, 0F, 6, 1, 13);
		box123.setRotationPoint(-3F, 32F, 17F);

		box124 = new ModelRendererTurbo(this,2, 64, textureWidth, textureHeight);
		box124.addBox(0F, 0F, 0F, 4, 1, 1);
		box124.setRotationPoint(-2F, 32F, -21F);

		box125 = new ModelRendererTurbo(this,2, 67, textureWidth, textureHeight);
		box125.addBox(0F, 0F, 0F, 1, 1, 4);
		box125.setRotationPoint(1F, 33F, -23F);

		box126 = new ModelRendererTurbo(this,2, 73, textureWidth, textureHeight);
		box126.addBox(0F, 0F, 0F, 1, 1, 4);
		box126.setRotationPoint(-2F, 33F, -22F);

		box128 = new ModelRendererTurbo(this,171, 109, textureWidth, textureHeight);
		box128.addBox(0F, 0F, 0F, 18, 6, 4);
		box128.setRotationPoint(-9F, 10F, -10F);

		box13 = new ModelRendererTurbo(this,45, 2, textureWidth, textureHeight);
		box13.addBox(0F, 0F, 0F, 1, 4, 22);
		box13.setRotationPoint(6F, 2F, 9F);

		box132 = new ModelRendererTurbo(this,48, 206, textureWidth, textureHeight);
		box132.addBox(0F, 0F, 0F, 18, 1, 5);
		box132.setRotationPoint(9F, 23F, -8F);
		box132.rotateAngleX = -4.153883619746504F;
		box132.rotateAngleY = -3.141592653589793F;

		box14 = new ModelRendererTurbo(this,49, 31, textureWidth, textureHeight);
		box14.addBox(0F, 0F, 0F, 16, 2, 2);
		box14.setRotationPoint(-8F, 2F, 19F);

		box143 = new ModelRendererTurbo(this,4, 125, textureWidth, textureHeight);
		box143.addBox(0F, 0F, 0F, 7, 1, 0);
		box143.setRotationPoint(-6F, 19F, -35F);
		box143.rotateAngleZ = -2.0245819323134224F;

		box148 = new ModelRendererTurbo(this,4, 125, textureWidth, textureHeight);
		box148.addBox(0F, 0F, 0F, 7, 1, 0);
		box148.setRotationPoint(6F, 19F, 35F);
		box148.rotateAngleX = -3.141592653589793F;
		box148.rotateAngleZ = -1.117010721276371F;

		box15 = new ModelRendererTurbo(this,49, 31, textureWidth, textureHeight);
		box15.addBox(0F, 0F, 0F, 16, 2, 2);
		box15.setRotationPoint(-8F, 2F, 26F);

		box16 = new ModelRendererTurbo(this,45, 2, textureWidth, textureHeight);
		box16.addBox(0F, 0F, 0F, 1, 4, 22);
		box16.setRotationPoint(-7F, 2F, 9F);

		box17 = new ModelRendererTurbo(this,0, 33, textureWidth, textureHeight);
		box17.addBox(0F, 0F, 0F, 8, 3, 18);
		box17.setRotationPoint(-4F, 4F, -29F);

		box18 = new ModelRendererTurbo(this,1, 33, textureWidth, textureHeight);
		box18.addBox(0F, 0F, 0F, 2, 2, 2);
		box18.setRotationPoint(6F, 5F, -26F);

		box19 = new ModelRendererTurbo(this,1, 33, textureWidth, textureHeight);
		box19.addBox(0F, 0F, 0F, 2, 2, 2);
		box19.setRotationPoint(6F, 5F, -19F);

		box2 = new ModelRendererTurbo(this,0, 2, textureWidth, textureHeight);
		box2.addBox(0F, 0F, 0F, 1, 6, 20);
		box2.setRotationPoint(-6F, 0F, -30F);

		box20 = new ModelRendererTurbo(this,1, 33, textureWidth, textureHeight);
		box20.addBox(0F, 0F, 0F, 2, 2, 2);
		box20.setRotationPoint(6F, 5F, 24F);

		box21 = new ModelRendererTurbo(this,1, 33, textureWidth, textureHeight);
		box21.addBox(0F, 0F, 0F, 2, 2, 2);
		box21.setRotationPoint(6F, 5F, 17F);

		box22 = new ModelRendererTurbo(this,0, 33, textureWidth, textureHeight);
		box22.addBox(0F, 0F, 0F, 8, 3, 18);
		box22.setRotationPoint(-4F, 4F, 11F);

		box23 = new ModelRendererTurbo(this,1, 33, textureWidth, textureHeight);
		box23.addBox(0F, 0F, 0F, 2, 2, 2);
		box23.setRotationPoint(-8F, 5F, 17F);

		box24 = new ModelRendererTurbo(this,1, 33, textureWidth, textureHeight);
		box24.addBox(0F, 0F, 0F, 2, 2, 2);
		box24.setRotationPoint(-8F, 5F, 24F);

		box25 = new ModelRendererTurbo(this,1, 33, textureWidth, textureHeight);
		box25.addBox(0F, 0F, 0F, 2, 2, 2);
		box25.setRotationPoint(-8F, 5F, -19F);

		box26 = new ModelRendererTurbo(this,1, 33, textureWidth, textureHeight);
		box26.addBox(0F, 0F, 0F, 2, 2, 2);
		box26.setRotationPoint(-8F, 5F, -26F);

		box27 = new ModelRendererTurbo(this,0, 66, textureWidth, textureHeight);
		box27.addBox(0F, 0F, 0F, 18, 3, 16);
		box27.setRotationPoint(-9F, 5F, -8F);

		box28 = new ModelRendererTurbo(this,67, 70, textureWidth, textureHeight);
		box28.addBox(0F, 0F, 0F, 1, 5, 16);
		box28.setRotationPoint(-9F, 5F, 8F);
		box28.rotateAngleX = -3.141592653589793F;
		box28.rotateAngleZ = -5.6374134839416845F;

		box29 = new ModelRendererTurbo(this,2, 88, textureWidth, textureHeight);
		box29.addBox(0F, 0F, 0F, 12, 1, 16);
		box29.setRotationPoint(-6F, 1F, -8F);

		box3 = new ModelRendererTurbo(this,45, 2, textureWidth, textureHeight);
		box3.addBox(0F, 0F, 0F, 1, 4, 22);
		box3.setRotationPoint(-7F, 2F, -31F);

		box30 = new ModelRendererTurbo(this,67, 70, textureWidth, textureHeight);
		box30.addBox(0F, 0F, 0F, 1, 5, 16);
		box30.setRotationPoint(9F, 5F, -8F);
		box30.rotateAngleZ = -3.7873644768276953F;

		box31 = new ModelRendererTurbo(this,130, 76, textureWidth, textureHeight);
		box31.addBox(0F, 0F, 0F, 18, 2, 1);
		box31.setRotationPoint(-9F, 28F, -22F);

		box32 = new ModelRendererTurbo(this,75, 62, textureWidth, textureHeight);
		box32.addBox(0F, 0F, 0F, 2, 3, 1);
		box32.setRotationPoint(3F, 10F, -36F);

		box33 = new ModelRendererTurbo(this,75, 62, textureWidth, textureHeight);
		box33.addBox(0F, 0F, 0F, 2, 3, 1);
		box33.setRotationPoint(-5F, 10F, -36F);

		box34 = new ModelRendererTurbo(this,4, 218, textureWidth, textureHeight);
		box34.addBox(0F, 0F, 0F, 12, 1, 16);
		box34.setRotationPoint(-6F, 2F, -8F);

		box35 = new ModelRendererTurbo(this,1, 201, textureWidth, textureHeight);
		box35.addBox(0F, 0F, 0F, 14, 1, 16);
		box35.setRotationPoint(-7F, 3F, -8F);

		box36 = new ModelRendererTurbo(this,1, 181, textureWidth, textureHeight);
		box36.addBox(0F, 0F, 0F, 16, 1, 16);
		box36.setRotationPoint(-8F, 4F, -8F);

		box37 = new ModelRendererTurbo(this,48, 38, textureWidth, textureHeight);
		box37.addBox(0F, 0F, 0F, 18, 2, 1);
		box37.setRotationPoint(-9F, 7F, 8F);

		box38 = new ModelRendererTurbo(this,48, 38, textureWidth, textureHeight);
		box38.addBox(0F, 0F, 0F, 18, 1, 1);
		box38.setRotationPoint(-9F, 8F, -7F);

		box39 = new ModelRendererTurbo(this,48, 38, textureWidth, textureHeight);
		box39.addBox(0F, 0F, 0F, 18, 2, 1);
		box39.setRotationPoint(-9F, 7F, -23F);

		box4 = new ModelRendererTurbo(this,1, 29, textureWidth, textureHeight);
		box4.addBox(0F, 0F, 0F, 12, 2, 1);
		box4.setRotationPoint(-6F, 3F, -31F);

		box40 = new ModelRendererTurbo(this,48, 38, textureWidth, textureHeight);
		box40.addBox(0F, 0F, 0F, 18, 2, 1);
		box40.setRotationPoint(-9F, 7F, 22F);

		box41 = new ModelRendererTurbo(this,1, 104, textureWidth, textureHeight);
		box41.addBox(0F, 0F, 0F, 18, 1, 64);
		box41.setRotationPoint(-9F, 9F, -32F);

		box42 = new ModelRendererTurbo(this,60, 183, textureWidth, textureHeight);
		box42.addBox(0F, 0F, 0F, 10, 2, 70);
		box42.setRotationPoint(-5F, 7F, -35F);

		box43 = new ModelRendererTurbo(this,81, 172, textureWidth, textureHeight);
		box43.addBox(0F, 0F, 0F, 4, 2, 78);
		box43.setRotationPoint(-2F, 6F, -39F);

		box44 = new ModelRendererTurbo(this,37, 109, textureWidth, textureHeight);
		box44.addBox(0F, 0F, 0F, 10, 1, 3);
		box44.setRotationPoint(-5F, 9F, 32F);

		box45 = new ModelRendererTurbo(this,44, 158, textureWidth, textureHeight);
		box45.addBox(0F, 0F, 0F, 8, 6, 1);
		box45.setRotationPoint(-4F, 19F, -21F);

		box46 = new ModelRendererTurbo(this,21, 109, textureWidth, textureHeight);
		box46.addBox(0F, 0F, 0F, 6, 1, 1);
		box46.setRotationPoint(-1F, 9F, 37F);
		box46.rotateAngleX = 3.141592653589793F;
		box46.rotateAngleY = 0.15707963267948966F;
		box46.rotateAngleZ = 3.141592653589793F;

		box47 = new ModelRendererTurbo(this,2, 147, textureWidth, textureHeight);
		box47.addBox(0F, 0F, 0F, 18, 18, 0);
		box47.setRotationPoint(-9F, 1F, 35F);

		box48 = new ModelRendererTurbo(this,21, 109, textureWidth, textureHeight);
		box48.addBox(0F, 0F, 0F, 6, 1, 1);
		box48.setRotationPoint(1F, 10F, 37F);
		box48.rotateAngleX = -3.141592653589793F;
		box48.rotateAngleY = -6.126105674500097F;

		box49 = new ModelRendererTurbo(this,1, 172, textureWidth, textureHeight);
		box49.addBox(0F, 0F, 0F, 0, 13, 64);
		box49.setRotationPoint(9F, 10F, -32F);

		box5 = new ModelRendererTurbo(this,1, 29, textureWidth, textureHeight);
		box5.addBox(0F, 0F, 0F, 12, 2, 1);
		box5.setRotationPoint(-6F, 3F, -10F);

		box50 = new ModelRendererTurbo(this,5, 112, textureWidth, textureHeight);
		box50.addBox(0F, 0F, 0F, 14, 1, 1);
		box50.setRotationPoint(-7F, 9F, 35F);

		box51 = new ModelRendererTurbo(this,48, 197, textureWidth, textureHeight);
		box51.addBox(0F, 0F, 0F, 0, 1, 5);
		box51.setRotationPoint(-9F, 23F, -25F);
		box51.rotateAngleX = -4.084070449666731F;

		box52 = new ModelRendererTurbo(this,37, 109, textureWidth, textureHeight);
		box52.addBox(0F, 0F, 0F, 10, 1, 3);
		box52.setRotationPoint(-5F, 9F, -35F);

		box53 = new ModelRendererTurbo(this,5, 112, textureWidth, textureHeight);
		box53.addBox(0F, 0F, 0F, 14, 1, 1);
		box53.setRotationPoint(-7F, 9F, -36F);

		box54 = new ModelRendererTurbo(this,93, 175, textureWidth, textureHeight);
		box54.addBox(0F, 0F, 0F, 2, 1, 74);
		box54.setRotationPoint(-1F, 9F, -37F);

		box55 = new ModelRendererTurbo(this,21, 109, textureWidth, textureHeight);
		box55.addBox(0F, 0F, 0F, 6, 1, 1);
		box55.setRotationPoint(1F, 9F, -37F);
		box55.rotateAngleY = -0.13962634015954636F;

		box56 = new ModelRendererTurbo(this,21, 109, textureWidth, textureHeight);
		box56.addBox(0F, 0F, 0F, 6, 1, 1);
		box56.setRotationPoint(-1F, 10F, -37F);
		box56.rotateAngleX = -3.141592653589793F;
		box56.rotateAngleY = -2.9845130209103035F;

		box57 = new ModelRendererTurbo(this,48, 197, textureWidth, textureHeight);
		box57.addBox(0F, 0F, 0F, 0, 1, 5);
		box57.setRotationPoint(9F, 23F, -25F);
		box57.rotateAngleX = -4.084070449666731F;

		box58 = new ModelRendererTurbo(this,168, 84, textureWidth, textureHeight);
		box58.addBox(0F, 0F, 0F, 18, 6, 5);
		box58.setRotationPoint(-9F, 10F, -27F);

		box59 = new ModelRendererTurbo(this,4, 116, textureWidth, textureHeight);
		box59.addBox(0F, 0F, 0F, 18, 7, 1);
		box59.setRotationPoint(-9F, 2F, -32F);

		box6 = new ModelRendererTurbo(this,49, 31, textureWidth, textureHeight);
		box6.addBox(0F, 0F, 0F, 16, 2, 2);
		box6.setRotationPoint(-8F, 2F, -21F);

		box60 = new ModelRendererTurbo(this,4, 125, textureWidth, textureHeight);
		box60.addBox(0F, 0F, 0F, 7, 1, 0);
		box60.setRotationPoint(-6F, 19F, 35F);
		box60.rotateAngleZ = -2.0245819323134224F;

		box61 = new ModelRendererTurbo(this,49, 118, textureWidth, textureHeight);
		box61.addBox(0F, 0F, 0F, 4, 1, 2);
		box61.setRotationPoint(-2F, 32F, -5F);

		box62 = new ModelRendererTurbo(this,4, 129, textureWidth, textureHeight);
		box62.addBox(0F, 0F, 0F, 6, 1, 13);
		box62.setRotationPoint(-3F, 32F, 2F);

		box63 = new ModelRendererTurbo(this,2, 147, textureWidth, textureHeight);
		box63.addBox(0F, 0F, 0F, 18, 18, 0);
		box63.setRotationPoint(-9F, 1F, -35F);

		box64 = new ModelRendererTurbo(this,1, 172, textureWidth, textureHeight);
		box64.addBox(0F, 0F, 0F, 0, 13, 64);
		box64.setRotationPoint(-9F, 10F, -32F);

		box66 = new ModelRendererTurbo(this,4, 125, textureWidth, textureHeight);
		box66.addBox(0F, 0F, 0F, 7, 1, 0);
		box66.setRotationPoint(6F, 19F, -35F);
		box66.rotateAngleX = -3.141592653589793F;
		box66.rotateAngleZ = -1.117010721276371F;

		box67 = new ModelRendererTurbo(this,4, 116, textureWidth, textureHeight);
		box67.addBox(0F, 0F, 0F, 18, 7, 1);
		box67.setRotationPoint(-9F, 2F, 31F);

		box68 = new ModelRendererTurbo(this,107, 102, textureWidth, textureHeight);
		box68.addBox(0F, 0F, 0F, 10, 15, 9);
		box68.setRotationPoint(-5F, 10F, -30F);

		box69 = new ModelRendererTurbo(this,110, 42, textureWidth, textureHeight);
		box69.addBox(0F, 0F, 0F, 16, 12, 1);
		box69.setRotationPoint(-8F, 10F, -22F);

		box7 = new ModelRendererTurbo(this,49, 31, textureWidth, textureHeight);
		box7.addBox(0F, 0F, 0F, 16, 2, 2);
		box7.setRotationPoint(-8F, 2F, -14F);

		box70 = new ModelRendererTurbo(this,103, 25, textureWidth, textureHeight);
		box70.addBox(0F, 0F, 0F, 5, 15, 1);
		box70.setRotationPoint(-5F, 10F, -30F);
		box70.rotateAngleY = -5.6374134839416845F;

		box71 = new ModelRendererTurbo(this,102, 178, textureWidth, textureHeight);
		box71.addBox(0F, 0F, 0F, 16, 0, 70);
		box71.setRotationPoint(-8F, 2F, -35F);

		box72 = new ModelRendererTurbo(this,234, 23, textureWidth, textureHeight);
		box72.addBox(0F, 0F, 0F, 6, 3, 1);
		box72.setRotationPoint(-3F, 29F, -23F);

		box73 = new ModelRendererTurbo(this,103, 8, textureWidth, textureHeight);
		box73.addBox(0F, 0F, 0F, 5, 15, 1);
		box73.setRotationPoint(5F, 25F, -30F);
		box73.rotateAngleY = 0.6457718232379019F;
		box73.rotateAngleZ = 3.141592653589793F;

		box74 = new ModelRendererTurbo(this,235, 27, textureWidth, textureHeight);
		box74.addBox(0F, 0F, 0F, 4, 3, 1);
		box74.setRotationPoint(-2F, 29F, -24F);

		box75 = new ModelRendererTurbo(this,118, 8, textureWidth, textureHeight);
		box75.addBox(0F, 0F, 0F, 2, 15, 1);
		box75.setRotationPoint(-1F, 10F, -33F);

		box76 = new ModelRendererTurbo(this,117, 28, textureWidth, textureHeight);
		box76.addBox(0F, 0F, 0F, 1, 6, 1);
		box76.setRotationPoint(5F, 22F, -22F);

		box77 = new ModelRendererTurbo(this,122, 28, textureWidth, textureHeight);
		box77.addBox(0F, 0F, 0F, 1, 6, 1);
		box77.setRotationPoint(-6F, 22F, -22F);

		box78 = new ModelRendererTurbo(this,131, 37, textureWidth, textureHeight);
		box78.addBox(0F, 0F, 0F, 6, 1, 1);
		box78.setRotationPoint(-3F, 24F, -31F);

		box79 = new ModelRendererTurbo(this,133, 34, textureWidth, textureHeight);
		box79.addBox(0F, 0F, 0F, 4, 1, 1);
		box79.setRotationPoint(-2F, 24F, -32F);

		box8 = new ModelRendererTurbo(this,49, 31, textureWidth, textureHeight);
		box8.addBox(0F, 0F, 0F, 16, 2, 2);
		box8.setRotationPoint(-8F, 2F, 12F);

		box80 = new ModelRendererTurbo(this,146, 0, textureWidth, textureHeight);
		box80.addBox(0F, 0F, 0F, 1, 13, 12);
		box80.setRotationPoint(8F, 10F, -22F);

		box81 = new ModelRendererTurbo(this,146, 25, textureWidth, textureHeight);
		box81.addBox(0F, 0F, 0F, 1, 13, 12);
		box81.setRotationPoint(-9F, 10F, -22F);

		box82 = new ModelRendererTurbo(this,102, 178, textureWidth, textureHeight);
		box82.addBox(0F, 0F, 0F, 16, 0, 70);
		box82.setRotationPoint(-8F, 6F, -35F);

		box84 = new ModelRendererTurbo(this,106, 87, textureWidth, textureHeight);
		box84.addBox(0F, 0F, 0F, 10, 22, 41);
		box84.setRotationPoint(-5F, 10F, -10F);

		box85 = new ModelRendererTurbo(this,159, 52, textureWidth, textureHeight);
		box85.addBox(0F, 0F, 0F, 2, 3, 1);
		box85.setRotationPoint(-1F, 25F, -22F);

		box89 = new ModelRendererTurbo(this,149, 61, textureWidth, textureHeight);
		box89.addBox(0F, 0F, 0F, 1, 5, 1);
		box89.setRotationPoint(-9F, 23F, -22F);

		box9 = new ModelRendererTurbo(this,0, 2, textureWidth, textureHeight);
		box9.addBox(0F, 0F, 0F, 1, 6, 20);
		box9.setRotationPoint(-6F, 0F, 10F);

		box90 = new ModelRendererTurbo(this,154, 61, textureWidth, textureHeight);
		box90.addBox(0F, 0F, 0F, 1, 5, 1);
		box90.setRotationPoint(8F, 23F, -22F);

		box91 = new ModelRendererTurbo(this,167, 42, textureWidth, textureHeight);
		box91.addBox(0F, 0F, 0F, 1, 2, 11);
		box91.setRotationPoint(-9F, 28F, -21F);

		box92 = new ModelRendererTurbo(this,173, 27, textureWidth, textureHeight);
		box92.addBox(0F, 0F, 0F, 1, 2, 11);
		box92.setRotationPoint(8F, 28F, -21F);

		box93 = new ModelRendererTurbo(this,176, 61, textureWidth, textureHeight);
		box93.addBox(0F, 0F, 0F, 1, 5, 2);
		box93.setRotationPoint(-9F, 23F, -12F);

		box94 = new ModelRendererTurbo(this,164, 62, textureWidth, textureHeight);
		box94.addBox(0F, 0F, 0F, 1, 5, 1);
		box94.setRotationPoint(-9F, 23F, -17F);

		box95 = new ModelRendererTurbo(this,169, 61, textureWidth, textureHeight);
		box95.addBox(0F, 0F, 0F, 1, 5, 2);
		box95.setRotationPoint(8F, 23F, -12F);

		box96 = new ModelRendererTurbo(this,159, 62, textureWidth, textureHeight);
		box96.addBox(0F, 0F, 0F, 1, 5, 1);
		box96.setRotationPoint(8F, 23F, -17F);

		box97 = new ModelRendererTurbo(this,201, 2, textureWidth, textureHeight);
		box97.addBox(0F, 0F, 0F, 10, 1, 12);
		box97.setRotationPoint(-5F, 31F, -22F);

		box98 = new ModelRendererTurbo(this,204, 23, textureWidth, textureHeight);
		box98.addBox(0F, 0F, 0F, 5, 1, 12);
		box98.setRotationPoint(5F, 32F, -10F);
		box98.rotateAngleX = -3.141592653589793F;
		box98.rotateAngleZ = -0.4537856055185257F;


		bodyModel=new ModelRendererTurbo[]{box,
				box0,box1,box2,box3,box4,box5,box6,box7,box8,box9,
				box10,box11,box12,box13,box14,box15,box16,box17,box18,box19,
				box20,box21,box22,box23,box24,box25,box26,box27,box28,box29,
				box30,box31,box32,box33,box34,box35,box36,box37,box38,box39,
				box40,box41,box42,box43,box44,box45,box46,box47,box48,box49,
				box50,box51,box52,box53,box54,box55,box56,box57,box58,box59,
				box60,box61,box62,box63,box64,box66,box67,box68,box69,
				box70,box71,box72,box73,box74,box75,box76,box77,box78,box79,
				box80,box81,box82,box84,box85,box89,
				box90,box91,box92,box93,box94,box95,box96,box97,box98,
				box100,box102,box104,box105,box106,box107,box108,box109,
				box110,box111,box112,box113,box114,box115,box116,box119,
				box120,box121,box123,box124,box125,box126,box128,box132,box143,box148
		};

		fixRotation(bodyModel);
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {}
}