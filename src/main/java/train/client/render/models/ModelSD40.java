package train.client.render.models;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import tmt.ModelBase;

public class ModelSD40 extends ModelBase {
	
	public ModelRenderer box;
	public ModelRenderer box0;
	public ModelRenderer box1;
	public ModelRenderer box10;
	public ModelRenderer box100;
	public ModelRenderer box102;
	public ModelRenderer box104;
	public ModelRenderer box105;
	public ModelRenderer box106;
	public ModelRenderer box107;
	public ModelRenderer box108;
	public ModelRenderer box109;
	public ModelRenderer box11;
	public ModelRenderer box110;
	public ModelRenderer box111;
	public ModelRenderer box112;
	public ModelRenderer box113;
	public ModelRenderer box114;
	public ModelRenderer box115;
	public ModelRenderer box116;
	public ModelRenderer box119;
	public ModelRenderer box12;
	public ModelRenderer box120;
	public ModelRenderer box121;
	public ModelRenderer box123;
	public ModelRenderer box124;
	public ModelRenderer box125;
	public ModelRenderer box126;
	public ModelRenderer box128;
	public ModelRenderer box13;
	public ModelRenderer box132;
	public ModelRenderer box14;
	public ModelRenderer box143;
	public ModelRenderer box148;
	public ModelRenderer box15;
	public ModelRenderer box16;
	public ModelRenderer box17;
	public ModelRenderer box18;
	public ModelRenderer box19;
	public ModelRenderer box2;
	public ModelRenderer box20;
	public ModelRenderer box21;
	public ModelRenderer box22;
	public ModelRenderer box23;
	public ModelRenderer box24;
	public ModelRenderer box25;
	public ModelRenderer box26;
	public ModelRenderer box27;
	public ModelRenderer box28;
	public ModelRenderer box29;
	public ModelRenderer box3;
	public ModelRenderer box30;
	public ModelRenderer box31;
	public ModelRenderer box32;
	public ModelRenderer box33;
	public ModelRenderer box34;
	public ModelRenderer box35;
	public ModelRenderer box36;
	public ModelRenderer box37;
	public ModelRenderer box38;
	public ModelRenderer box39;
	public ModelRenderer box4;
	public ModelRenderer box40;
	public ModelRenderer box41;
	public ModelRenderer box42;
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
	public ModelRenderer box52;
	public ModelRenderer box53;
	public ModelRenderer box54;
	public ModelRenderer box55;
	public ModelRenderer box56;
	public ModelRenderer box57;
	public ModelRenderer box58;
	public ModelRenderer box59;
	public ModelRenderer box6;
	public ModelRenderer box60;
	public ModelRenderer box61;
	public ModelRenderer box62;
	public ModelRenderer box63;
	public ModelRenderer box64;
	public ModelRenderer box66;
	public ModelRenderer box67;
	public ModelRenderer box68;
	public ModelRenderer box69;
	public ModelRenderer box7;
	public ModelRenderer box70;
	public ModelRenderer box71;
	public ModelRenderer box72;
	public ModelRenderer box73;
	public ModelRenderer box74;
	public ModelRenderer box75;
	public ModelRenderer box76;
	public ModelRenderer box77;
	public ModelRenderer box78;
	public ModelRenderer box79;
	public ModelRenderer box8;
	public ModelRenderer box80;
	public ModelRenderer box81;
	public ModelRenderer box82;
	public ModelRenderer box84;
	public ModelRenderer box85;
	public ModelRenderer box89;
	public ModelRenderer box9;
	public ModelRenderer box90;
	public ModelRenderer box91;
	public ModelRenderer box92;
	public ModelRenderer box93;
	public ModelRenderer box94;
	public ModelRenderer box95;
	public ModelRenderer box96;
	public ModelRenderer box97;
	public ModelRenderer box98;

	public ModelSD40() {
		
		this.textureHeight=256;
		this.textureWidth=256;
		
		box = new ModelRenderer(this,0, 2);
		box.addBox(0F, 0F, 0F, 1, 6, 20);
		//box.setPosition(5F, 0F, -30F);
		box.setRotationPoint(5, 0, -30);

		box0 = new ModelRenderer(this,45, 2);
		box0.addBox(0F, 0F, 0F, 1, 4, 22);
		//box0.setPosition(6F, 2F, -31F);
		box0.setRotationPoint(6F, 2F, -31F);

		box1 = new ModelRenderer(this,49, 31);
		box1.addBox(0F, 0F, 0F, 16, 2, 2);
		box1.setRotationPoint(-8F, 2F, -28F);

		box10 = new ModelRenderer(this,0, 2);
		box10.addBox(0F, 0F, 0F, 1, 6, 20);
		box10.setRotationPoint(5F, 0F, 10F);

		box100 = new ModelRenderer(this,211, 42);
		box100.addBox(0F, 0F, 0F, 5, 1, 12);
		box100.setRotationPoint(-5F, 32F, -22F);
		box100.rotateAngleZ = -2.6878070480712677F;

		box102 = new ModelRenderer(this,133, 80);
		box102.addBox(2F, 0F, 0F, 14, 1, 1);
		box102.setRotationPoint(-9F, 30F, -22F);

		box104 = new ModelRenderer(this,68, 62);
		box104.addBox(0F, 0F, 0F, 2, 3, 1);
		box104.setRotationPoint(-1F, 26F, 34F);

		box105 = new ModelRenderer(this,200, 17);
		box105.addBox(0F, 0F, 0F, 2, 3, 2);
		box105.setRotationPoint(-1F, 29F, -26F);

		box106 = new ModelRenderer(this,201, 29);
		box106.addBox(0F, 0F, 0F, 5, 3, 1);
		box106.setRotationPoint(-5F, 29F, -22F);
		box106.rotateAngleY = -5.6374134839416845F;

		box107 = new ModelRenderer(this,201, 24);
		box107.addBox(0F, 0F, 0F, 5, 3, 1);
		box107.setRotationPoint(5F, 32F, -22F);
		box107.rotateAngleY = 0.6457718232379019F;
		box107.rotateAngleZ = 3.141592653589793F;

		box108 = new ModelRenderer(this,184, 63);
		box108.addBox(0F, 0F, 0F, 16, 2, 1);
		box108.setRotationPoint(-8F, 28F, -11F);

		box109 = new ModelRenderer(this,185, 67);
		box109.addBox(0F, 0F, 0F, 14, 1, 1);
		box109.setRotationPoint(-7F, 30F, -11F);

		box11 = new ModelRenderer(this,1, 29);
		box11.addBox(0F, 0F, 0F, 12, 2, 1);
		box11.setRotationPoint(-6F, 3F, 9F);

		box110 = new ModelRenderer(this,110, 56);
		box110.addBox(0F, 0F, 0F, 16, 12, 1);
		box110.setRotationPoint(-8F, 10F, -11F);

		box111 = new ModelRenderer(this,172, 2);
		box111.addBox(0F, 0F, 0F, 12, 6, 1);
		box111.setRotationPoint(-6F, 22F, -11F);

		box112 = new ModelRenderer(this,238, 74);
		box112.addBox(0F, 0F, 0F, 5, 22, 1);
		box112.setRotationPoint(5F, 10F, 31F);
		box112.rotateAngleY = -2.4958208303518914F;

		box113 = new ModelRenderer(this,224, 74);
		box113.addBox(0F, 0F, 0F, 5, 22, 1);
		box113.setRotationPoint(-5F, 32F, 31F);
		box113.rotateAngleX = -3.141592653589793F;
		box113.rotateAngleY = -0.6457718232379019F;

		box114 = new ModelRenderer(this,215, 74);
		box114.addBox(0F, 0F, 0F, 2, 22, 1);
		box114.setRotationPoint(-1F, 10F, 33F);

		box115 = new ModelRenderer(this,200, 77);
		box115.addBox(0F, 0F, 0F, 6, 1, 1);
		box115.setRotationPoint(-3F, 31F, 31F);

		box116 = new ModelRenderer(this,202, 80);
		box116.addBox(0F, 0F, 0F, 4, 1, 1);
		box116.setRotationPoint(-2F, 31F, 32F);

		box119 = new ModelRenderer(this,89, 86);
		box119.addBox(0F, 0F, 0F, 12, 1, 14);
		box119.setRotationPoint(-6F, 31F, 4F);

		box12 = new ModelRenderer(this,1, 29);
		box12.addBox(0F, 0F, 0F, 12, 2, 1);
		box12.setRotationPoint(-6F, 3F, 30F);

		box120 = new ModelRenderer(this,172, 151);
		box120.addBox(0F, 0F, 0F, 2, 3, 14);
		box120.setRotationPoint(6F, 31F, 4F);
		box120.rotateAngleZ = -3.473205211468716F;

		box121 = new ModelRenderer(this,207, 151);
		box121.addBox(0F, 0F, 0F, 2, 3, 14);
		box121.setRotationPoint(-6F, 31F, 18F);
		box121.rotateAngleX = -3.141592653589793F;
		box121.rotateAngleZ = -5.969026041820607F;

		box123 = new ModelRenderer(this,4, 129);
		box123.addBox(0F, 0F, 0F, 6, 1, 13);
		box123.setRotationPoint(-3F, 32F, 17F);

		box124 = new ModelRenderer(this,2, 64);
		box124.addBox(0F, 0F, 0F, 4, 1, 1);
		box124.setRotationPoint(-2F, 32F, -21F);

		box125 = new ModelRenderer(this,2, 67);
		box125.addBox(0F, 0F, 0F, 1, 1, 4);
		box125.setRotationPoint(1F, 33F, -23F);

		box126 = new ModelRenderer(this,2, 73);
		box126.addBox(0F, 0F, 0F, 1, 1, 4);
		box126.setRotationPoint(-2F, 33F, -22F);

		box128 = new ModelRenderer(this,171, 109);
		box128.addBox(0F, 0F, 0F, 18, 6, 4);
		box128.setRotationPoint(-9F, 10F, -10F);

		box13 = new ModelRenderer(this,45, 2);
		box13.addBox(0F, 0F, 0F, 1, 4, 22);
		box13.setRotationPoint(6F, 2F, 9F);

		box132 = new ModelRenderer(this,48, 206);
		box132.addBox(0F, 0F, 0F, 18, 1, 5);
		box132.setRotationPoint(9F, 23F, -8F);
		box132.rotateAngleX = -4.153883619746504F;
		box132.rotateAngleY = -3.141592653589793F;

		box14 = new ModelRenderer(this,49, 31);
		box14.addBox(0F, 0F, 0F, 16, 2, 2);
		box14.setRotationPoint(-8F, 2F, 19F);

		box143 = new ModelRenderer(this,4, 125);
		box143.addBox(0F, 0F, 0F, 7, 1, 0);
		box143.setRotationPoint(-6F, 19F, -35F);
		box143.rotateAngleZ = -2.0245819323134224F;

		box148 = new ModelRenderer(this,4, 125);
		box148.addBox(0F, 0F, 0F, 7, 1, 0);
		box148.setRotationPoint(6F, 19F, 35F);
		box148.rotateAngleX = -3.141592653589793F;
		box148.rotateAngleZ = -1.117010721276371F;

		box15 = new ModelRenderer(this,49, 31);
		box15.addBox(0F, 0F, 0F, 16, 2, 2);
		box15.setRotationPoint(-8F, 2F, 26F);

		box16 = new ModelRenderer(this,45, 2);
		box16.addBox(0F, 0F, 0F, 1, 4, 22);
		box16.setRotationPoint(-7F, 2F, 9F);

		box17 = new ModelRenderer(this,0, 33);
		box17.addBox(0F, 0F, 0F, 8, 3, 18);
		box17.setRotationPoint(-4F, 4F, -29F);

		box18 = new ModelRenderer(this,1, 33);
		box18.addBox(0F, 0F, 0F, 2, 2, 2);
		box18.setRotationPoint(6F, 5F, -26F);

		box19 = new ModelRenderer(this,1, 33);
		box19.addBox(0F, 0F, 0F, 2, 2, 2);
		box19.setRotationPoint(6F, 5F, -19F);

		box2 = new ModelRenderer(this,0, 2);
		box2.addBox(0F, 0F, 0F, 1, 6, 20);
		box2.setRotationPoint(-6F, 0F, -30F);

		box20 = new ModelRenderer(this,1, 33);
		box20.addBox(0F, 0F, 0F, 2, 2, 2);
		box20.setRotationPoint(6F, 5F, 24F);

		box21 = new ModelRenderer(this,1, 33);
		box21.addBox(0F, 0F, 0F, 2, 2, 2);
		box21.setRotationPoint(6F, 5F, 17F);

		box22 = new ModelRenderer(this,0, 33);
		box22.addBox(0F, 0F, 0F, 8, 3, 18);
		box22.setRotationPoint(-4F, 4F, 11F);

		box23 = new ModelRenderer(this,1, 33);
		box23.addBox(0F, 0F, 0F, 2, 2, 2);
		box23.setRotationPoint(-8F, 5F, 17F);

		box24 = new ModelRenderer(this,1, 33);
		box24.addBox(0F, 0F, 0F, 2, 2, 2);
		box24.setRotationPoint(-8F, 5F, 24F);

		box25 = new ModelRenderer(this,1, 33);
		box25.addBox(0F, 0F, 0F, 2, 2, 2);
		box25.setRotationPoint(-8F, 5F, -19F);

		box26 = new ModelRenderer(this,1, 33);
		box26.addBox(0F, 0F, 0F, 2, 2, 2);
		box26.setRotationPoint(-8F, 5F, -26F);

		box27 = new ModelRenderer(this,0, 66);
		box27.addBox(0F, 0F, 0F, 18, 3, 16);
		box27.setRotationPoint(-9F, 5F, -8F);

		box28 = new ModelRenderer(this,67, 70);
		box28.addBox(0F, 0F, 0F, 1, 5, 16);
		box28.setRotationPoint(-9F, 5F, 8F);
		box28.rotateAngleX = -3.141592653589793F;
		box28.rotateAngleZ = -5.6374134839416845F;

		box29 = new ModelRenderer(this,2, 88);
		box29.addBox(0F, 0F, 0F, 12, 1, 16);
		box29.setRotationPoint(-6F, 1F, -8F);

		box3 = new ModelRenderer(this,45, 2);
		box3.addBox(0F, 0F, 0F, 1, 4, 22);
		box3.setRotationPoint(-7F, 2F, -31F);

		box30 = new ModelRenderer(this,67, 70);
		box30.addBox(0F, 0F, 0F, 1, 5, 16);
		box30.setRotationPoint(9F, 5F, -8F);
		box30.rotateAngleZ = -3.7873644768276953F;

		box31 = new ModelRenderer(this,130, 76);
		box31.addBox(0F, 0F, 0F, 18, 2, 1);
		box31.setRotationPoint(-9F, 28F, -22F);

		box32 = new ModelRenderer(this,75, 62);
		box32.addBox(0F, 0F, 0F, 2, 3, 1);
		box32.setRotationPoint(3F, 10F, -36F);

		box33 = new ModelRenderer(this,75, 62);
		box33.addBox(0F, 0F, 0F, 2, 3, 1);
		box33.setRotationPoint(-5F, 10F, -36F);

		box34 = new ModelRenderer(this,4, 218);
		box34.addBox(0F, 0F, 0F, 12, 1, 16);
		box34.setRotationPoint(-6F, 2F, -8F);

		box35 = new ModelRenderer(this,1, 201);
		box35.addBox(0F, 0F, 0F, 14, 1, 16);
		box35.setRotationPoint(-7F, 3F, -8F);

		box36 = new ModelRenderer(this,1, 181);
		box36.addBox(0F, 0F, 0F, 16, 1, 16);
		box36.setRotationPoint(-8F, 4F, -8F);

		box37 = new ModelRenderer(this,48, 38);
		box37.addBox(0F, 0F, 0F, 18, 2, 1);
		box37.setRotationPoint(-9F, 7F, 8F);

		box38 = new ModelRenderer(this,48, 38);
		box38.addBox(0F, 0F, 0F, 18, 1, 1);
		box38.setRotationPoint(-9F, 8F, -7F);

		box39 = new ModelRenderer(this,48, 38);
		box39.addBox(0F, 0F, 0F, 18, 2, 1);
		box39.setRotationPoint(-9F, 7F, -23F);

		box4 = new ModelRenderer(this,1, 29);
		box4.addBox(0F, 0F, 0F, 12, 2, 1);
		box4.setRotationPoint(-6F, 3F, -31F);

		box40 = new ModelRenderer(this,48, 38);
		box40.addBox(0F, 0F, 0F, 18, 2, 1);
		box40.setRotationPoint(-9F, 7F, 22F);

		box41 = new ModelRenderer(this,1, 104);
		box41.addBox(0F, 0F, 0F, 18, 1, 64);
		box41.setRotationPoint(-9F, 9F, -32F);

		box42 = new ModelRenderer(this,60, 183);
		box42.addBox(0F, 0F, 0F, 10, 2, 70);
		box42.setRotationPoint(-5F, 7F, -35F);

		box43 = new ModelRenderer(this,81, 172);
		box43.addBox(0F, 0F, 0F, 4, 2, 78);
		box43.setRotationPoint(-2F, 6F, -39F);

		box44 = new ModelRenderer(this,37, 109);
		box44.addBox(0F, 0F, 0F, 10, 1, 3);
		box44.setRotationPoint(-5F, 9F, 32F);

		box45 = new ModelRenderer(this,44, 158);
		box45.addBox(0F, 0F, 0F, 8, 6, 1);
		box45.setRotationPoint(-4F, 19F, -21F);

		box46 = new ModelRenderer(this,21, 109);
		box46.addBox(0F, 0F, 0F, 6, 1, 1);
		box46.setRotationPoint(-1F, 9F, 37F);
		box46.rotateAngleX = 3.141592653589793F;
		box46.rotateAngleY = 0.15707963267948966F;
		box46.rotateAngleZ = 3.141592653589793F;

		box47 = new ModelRenderer(this,2, 147);
		box47.addBox(0F, 0F, 0F, 18, 18, 0);
		box47.setRotationPoint(-9F, 1F, 35F);

		box48 = new ModelRenderer(this,21, 109);
		box48.addBox(0F, 0F, 0F, 6, 1, 1);
		box48.setRotationPoint(1F, 10F, 37F);
		box48.rotateAngleX = -3.141592653589793F;
		box48.rotateAngleY = -6.126105674500097F;

		box49 = new ModelRenderer(this,1, 172);
		box49.addBox(0F, 0F, 0F, 0, 13, 64);
		box49.setRotationPoint(9F, 10F, -32F);

		box5 = new ModelRenderer(this,1, 29);
		box5.addBox(0F, 0F, 0F, 12, 2, 1);
		box5.setRotationPoint(-6F, 3F, -10F);

		box50 = new ModelRenderer(this,5, 112);
		box50.addBox(0F, 0F, 0F, 14, 1, 1);
		box50.setRotationPoint(-7F, 9F, 35F);

		box51 = new ModelRenderer(this,48, 197);
		box51.addBox(0F, 0F, 0F, 0, 1, 5);
		box51.setRotationPoint(-9F, 23F, -25F);
		box51.rotateAngleX = -4.084070449666731F;

		box52 = new ModelRenderer(this,37, 109);
		box52.addBox(0F, 0F, 0F, 10, 1, 3);
		box52.setRotationPoint(-5F, 9F, -35F);

		box53 = new ModelRenderer(this,5, 112);
		box53.addBox(0F, 0F, 0F, 14, 1, 1);
		box53.setRotationPoint(-7F, 9F, -36F);

		box54 = new ModelRenderer(this,93, 175);
		box54.addBox(0F, 0F, 0F, 2, 1, 74);
		box54.setRotationPoint(-1F, 9F, -37F);

		box55 = new ModelRenderer(this,21, 109);
		box55.addBox(0F, 0F, 0F, 6, 1, 1);
		box55.setRotationPoint(1F, 9F, -37F);
		box55.rotateAngleY = -0.13962634015954636F;

		box56 = new ModelRenderer(this,21, 109);
		box56.addBox(0F, 0F, 0F, 6, 1, 1);
		box56.setRotationPoint(-1F, 10F, -37F);
		box56.rotateAngleX = -3.141592653589793F;
		box56.rotateAngleY = -2.9845130209103035F;

		box57 = new ModelRenderer(this,48, 197);
		box57.addBox(0F, 0F, 0F, 0, 1, 5);
		box57.setRotationPoint(9F, 23F, -25F);
		box57.rotateAngleX = -4.084070449666731F;

		box58 = new ModelRenderer(this,168, 84);
		box58.addBox(0F, 0F, 0F, 18, 6, 5);
		box58.setRotationPoint(-9F, 10F, -27F);

		box59 = new ModelRenderer(this,4, 116);
		box59.addBox(0F, 0F, 0F, 18, 7, 1);
		box59.setRotationPoint(-9F, 2F, -32F);

		box6 = new ModelRenderer(this,49, 31);
		box6.addBox(0F, 0F, 0F, 16, 2, 2);
		box6.setRotationPoint(-8F, 2F, -21F);

		box60 = new ModelRenderer(this,4, 125);
		box60.addBox(0F, 0F, 0F, 7, 1, 0);
		box60.setRotationPoint(-6F, 19F, 35F);
		box60.rotateAngleZ = -2.0245819323134224F;

		box61 = new ModelRenderer(this,49, 118);
		box61.addBox(0F, 0F, 0F, 4, 1, 2);
		box61.setRotationPoint(-2F, 32F, -5F);

		box62 = new ModelRenderer(this,4, 129);
		box62.addBox(0F, 0F, 0F, 6, 1, 13);
		box62.setRotationPoint(-3F, 32F, 2F);

		box63 = new ModelRenderer(this,2, 147);
		box63.addBox(0F, 0F, 0F, 18, 18, 0);
		box63.setRotationPoint(-9F, 1F, -35F);

		box64 = new ModelRenderer(this,1, 172);
		box64.addBox(0F, 0F, 0F, 0, 13, 64);
		box64.setRotationPoint(-9F, 10F, -32F);

		box66 = new ModelRenderer(this,4, 125);
		box66.addBox(0F, 0F, 0F, 7, 1, 0);
		box66.setRotationPoint(6F, 19F, -35F);
		box66.rotateAngleX = -3.141592653589793F;
		box66.rotateAngleZ = -1.117010721276371F;

		box67 = new ModelRenderer(this,4, 116);
		box67.addBox(0F, 0F, 0F, 18, 7, 1);
		box67.setRotationPoint(-9F, 2F, 31F);

		box68 = new ModelRenderer(this,107, 102);
		box68.addBox(0F, 0F, 0F, 10, 15, 9);
		box68.setRotationPoint(-5F, 10F, -30F);

		box69 = new ModelRenderer(this,110, 42);
		box69.addBox(0F, 0F, 0F, 16, 12, 1);
		box69.setRotationPoint(-8F, 10F, -22F);

		box7 = new ModelRenderer(this,49, 31);
		box7.addBox(0F, 0F, 0F, 16, 2, 2);
		box7.setRotationPoint(-8F, 2F, -14F);

		box70 = new ModelRenderer(this,103, 25);
		box70.addBox(0F, 0F, 0F, 5, 15, 1);
		box70.setRotationPoint(-5F, 10F, -30F);
		box70.rotateAngleY = -5.6374134839416845F;

		box71 = new ModelRenderer(this,102, 178);
		box71.addBox(0F, 0F, 0F, 16, 0, 70);
		box71.setRotationPoint(-8F, 2F, -35F);

		box72 = new ModelRenderer(this,234, 23);
		box72.addBox(0F, 0F, 0F, 6, 3, 1);
		box72.setRotationPoint(-3F, 29F, -23F);

		box73 = new ModelRenderer(this,103, 8);
		box73.addBox(0F, 0F, 0F, 5, 15, 1);
		box73.setRotationPoint(5F, 25F, -30F);
		box73.rotateAngleY = 0.6457718232379019F;
		box73.rotateAngleZ = 3.141592653589793F;

		box74 = new ModelRenderer(this,235, 27);
		box74.addBox(0F, 0F, 0F, 4, 3, 1);
		box74.setRotationPoint(-2F, 29F, -24F);

		box75 = new ModelRenderer(this,118, 8);
		box75.addBox(0F, 0F, 0F, 2, 15, 1);
		box75.setRotationPoint(-1F, 10F, -33F);

		box76 = new ModelRenderer(this,117, 28);
		box76.addBox(0F, 0F, 0F, 1, 6, 1);
		box76.setRotationPoint(5F, 22F, -22F);

		box77 = new ModelRenderer(this,122, 28);
		box77.addBox(0F, 0F, 0F, 1, 6, 1);
		box77.setRotationPoint(-6F, 22F, -22F);

		box78 = new ModelRenderer(this,131, 37);
		box78.addBox(0F, 0F, 0F, 6, 1, 1);
		box78.setRotationPoint(-3F, 24F, -31F);

		box79 = new ModelRenderer(this,133, 34);
		box79.addBox(0F, 0F, 0F, 4, 1, 1);
		box79.setRotationPoint(-2F, 24F, -32F);

		box8 = new ModelRenderer(this,49, 31);
		box8.addBox(0F, 0F, 0F, 16, 2, 2);
		box8.setRotationPoint(-8F, 2F, 12F);

		box80 = new ModelRenderer(this,146, 0);
		box80.addBox(0F, 0F, 0F, 1, 13, 12);
		box80.setRotationPoint(8F, 10F, -22F);

		box81 = new ModelRenderer(this,146, 25);
		box81.addBox(0F, 0F, 0F, 1, 13, 12);
		box81.setRotationPoint(-9F, 10F, -22F);

		box82 = new ModelRenderer(this,102, 178);
		box82.addBox(0F, 0F, 0F, 16, 0, 70);
		box82.setRotationPoint(-8F, 6F, -35F);

		box84 = new ModelRenderer(this,106, 87);
		box84.addBox(0F, 0F, 0F, 10, 22, 41);
		box84.setRotationPoint(-5F, 10F, -10F);

		box85 = new ModelRenderer(this,159, 52);
		box85.addBox(0F, 0F, 0F, 2, 3, 1);
		box85.setRotationPoint(-1F, 25F, -22F);

		box89 = new ModelRenderer(this,149, 61);
		box89.addBox(0F, 0F, 0F, 1, 5, 1);
		box89.setRotationPoint(-9F, 23F, -22F);

		box9 = new ModelRenderer(this,0, 2);
		box9.addBox(0F, 0F, 0F, 1, 6, 20);
		box9.setRotationPoint(-6F, 0F, 10F);

		box90 = new ModelRenderer(this,154, 61);
		box90.addBox(0F, 0F, 0F, 1, 5, 1);
		box90.setRotationPoint(8F, 23F, -22F);

		box91 = new ModelRenderer(this,167, 42);
		box91.addBox(0F, 0F, 0F, 1, 2, 11);
		box91.setRotationPoint(-9F, 28F, -21F);

		box92 = new ModelRenderer(this,173, 27);
		box92.addBox(0F, 0F, 0F, 1, 2, 11);
		box92.setRotationPoint(8F, 28F, -21F);

		box93 = new ModelRenderer(this,176, 61);
		box93.addBox(0F, 0F, 0F, 1, 5, 2);
		box93.setRotationPoint(-9F, 23F, -12F);

		box94 = new ModelRenderer(this,164, 62);
		box94.addBox(0F, 0F, 0F, 1, 5, 1);
		box94.setRotationPoint(-9F, 23F, -17F);

		box95 = new ModelRenderer(this,169, 61);
		box95.addBox(0F, 0F, 0F, 1, 5, 2);
		box95.setRotationPoint(8F, 23F, -12F);

		box96 = new ModelRenderer(this,159, 62);
		box96.addBox(0F, 0F, 0F, 1, 5, 1);
		box96.setRotationPoint(8F, 23F, -17F);

		box97 = new ModelRenderer(this,201, 2);
		box97.addBox(0F, 0F, 0F, 10, 1, 12);
		box97.setRotationPoint(-5F, 31F, -22F);

		box98 = new ModelRenderer(this,204, 23);
		box98.addBox(0F, 0F, 0F, 5, 1, 12);
		box98.setRotationPoint(5F, 32F, -10F);
		box98.rotateAngleX = -3.141592653589793F;
		box98.rotateAngleZ = -0.4537856055185257F;
	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		box.render(f5);
		box0.render(f5);
		box1.render(f5);
		box10.render(f5);
		box100.render(f5);
		box102.render(f5);
		box108.render(f5);
		box109.render(f5);
		box11.render(f5);
		box110.render(f5);
		box111.render(f5);
		box112.render(f5);
		box113.render(f5);
		box114.render(f5);
		box115.render(f5);
		box116.render(f5);
		box119.render(f5);
		box12.render(f5);
		box120.render(f5);
		box121.render(f5);
		box123.render(f5);
		box124.render(f5);
		box125.render(f5);
		box126.render(f5);
		box128.render(f5);
		box13.render(f5);
		box132.render(f5);
		box14.render(f5);
		box143.render(f5);
		box148.render(f5);
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
		box84.render(f5);
		box85.render(f5);
		box89.render(f5);
		box9.render(f5);
		box90.render(f5);
		box91.render(f5);
		box92.render(f5);
		box93.render(f5);
		box94.render(f5);
		box95.render(f5);
		box96.render(f5);
		box97.render(f5);
		box98.render(f5);
		
		Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
		box104.render(f5);
		box105.render(f5);
		box106.render(f5);
		box107.render(f5);
		box32.render(f5);
		box33.render(f5);
		Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {}
}