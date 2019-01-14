package train.client.render.models;

import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import train.client.core.ClientProxy;
import train.client.render.CustomModelRenderer;
import train.client.render.models.blocks.ModelLights;

public class ModelPassenger6 extends ModelBase {
	
	private ModelLights lights;

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
	public CustomModelRenderer box92;
	public CustomModelRenderer box93;
	public CustomModelRenderer box94;

	public ModelPassenger6() {
		
		lights = new ModelLights();
		
		box = new CustomModelRenderer(this, 158, 245, 256, 256);
		box.addBox(0F, 0F, 0F, 10, 4, 4);
		box.setPosition(-9F, 2F, 4F);

		box0 = new CustomModelRenderer(this, 136, 0, 256, 256);
		box0.addBox(0F, 0F, 0F, 6, 1, 14);
		box0.setPosition(-31F, 4F, -7F);

		box1 = new CustomModelRenderer(this, 188, 11, 256, 256);
		box1.addBox(0F, 0F, 0F, 8, 7, 0);
		box1.setPosition(-20F, 0F, 5F);

		box10 = new CustomModelRenderer(this, 215, 51, 256, 256);
		box10.addBox(0F, 0F, 0F, 5, 2, 15);
		box10.setPosition(-26F, 11F, -5F);
		box10.rotateAngleZ = -6.230825429619756F;

		box11 = new CustomModelRenderer(this, 223, 25, 256, 256);
		box11.addBox(0F, 0F, 0F, 1, 10, 15);
		box11.setPosition(-11F, 11F, 10F);
		box11.rotateAngleY = -3.141592653589793F;
		box11.rotateAngleZ = 6.161012259539984F;

		box12 = new CustomModelRenderer(this, 215, 51, 256, 256);
		box12.addBox(0F, 0F, 0F, 5, 2, 15);
		box12.setPosition(-11F, 11F, 10F);
		box12.rotateAngleY = -3.141592653589793F;
		box12.rotateAngleZ = -6.230825429619756F;

		box13 = new CustomModelRenderer(this, 1, 79, 256, 256);
		box13.addBox(0F, 0F, 0F, 66, 4, 1);
		box13.setPosition(33F, 14F, -10F);
		box13.rotateAngleY = -3.141592653589793F;

		box14 = new CustomModelRenderer(this, 1, 86, 256, 256);
		box14.addBox(0F, -6F, -1F, 66, 6, 1);
		box14.setPosition(33F, 14F, -11F);
		box14.rotateAngleX = -6.19591884457987F;
		box14.rotateAngleY = -3.141592653589793F;

		box15 = new CustomModelRenderer(this, 1, 67, 256, 256);
		box15.addBox(0F, 0F, -1F, 66, 9, 1);
		box15.setPosition(33F, 18F, -11F);
		box15.rotateAngleX = -0.03490658503988659F;
		box15.rotateAngleY = -3.141592653589793F;

		box16 = new CustomModelRenderer(this, 188, 11, 256, 256);
		box16.addBox(0F, 0F, 0F, 8, 7, 0);
		box16.setPosition(-32F, 0F, -5F);

		box17 = new CustomModelRenderer(this, 96, 1, 256, 256);
		box17.addBox(0F, 0F, 0F, 2, 2, 14);
		box17.setPosition(-29F, 2F, -7F);

		box18 = new CustomModelRenderer(this, 136, 0, 256, 256);
		box18.addBox(0F, 0F, 0F, 6, 1, 14);
		box18.setPosition(-19F, 4F, -7F);

		box19 = new CustomModelRenderer(this, 188, 11, 256, 256);
		box19.addBox(0F, 0F, 0F, 8, 7, 0);
		box19.setPosition(24F, 0F, -5F);

		box2 = new CustomModelRenderer(this, 96, 1, 256, 256);
		box2.addBox(0F, 0F, 0F, 2, 2, 14);
		box2.setPosition(15F, 2F, -7F);

		box20 = new CustomModelRenderer(this, 96, 1, 256, 256);
		box20.addBox(0F, 0F, 0F, 2, 2, 14);
		box20.setPosition(27F, 2F, -7F);

		box21 = new CustomModelRenderer(this, 188, 11, 256, 256);
		box21.addBox(0F, 0F, 0F, 8, 7, 0);
		box21.setPosition(24F, 0F, 5F);

		box22 = new CustomModelRenderer(this, 136, 0, 256, 256);
		box22.addBox(0F, 0F, 0F, 6, 1, 14);
		box22.setPosition(13F, 4F, -7F);

		box23 = new CustomModelRenderer(this, 209, 111, 256, 256);
		box23.addBox(3F, 0F, 0F, 22, 3, 1);
		box23.setPosition(-36F, 1F, 5F);

		box24 = new CustomModelRenderer(this, 181, 93, 256, 256);
		box24.addBox(0F, 0F, 0F, 22, 2, 12);
		box24.setPosition(11F, 4F, -6F);

		box25 = new CustomModelRenderer(this, 181, 93, 256, 256);
		box25.addBox(0F, 0F, 0F, 22, 2, 12);
		box25.setPosition(-33F, 4F, -6F);

		box26 = new CustomModelRenderer(this, 187, 246, 256, 256);
		box26.addBox(0F, 0F, 0F, 10, 3, 4);
		box26.setPosition(-5F, 3F, -2F);

		box27 = new CustomModelRenderer(this, 188, 239, 256, 256);
		box27.addBox(0F, 0F, 0F, 8, 1, 4);
		box27.setPosition(5F, 3F, -2F);
		box27.rotateAngleZ = -5.846852994181004F;

		box28 = new CustomModelRenderer(this, 217, 246, 256, 256);
		box28.addBox(0F, 0F, 0F, 8, 4, 3);
		box28.setPosition(1F, 2F, -8F);

		//
		box29 = new CustomModelRenderer(this, 188, 239, 256, 256);
		box29.addBox(0F, 0F, 0F, 8, 1, 4);
		box29.setPosition(-5F, 3F, 2F);
		box29.rotateAngleY = -3.141592653589793F;
		box29.rotateAngleZ = 5.846852994181004F;

		box3 = new CustomModelRenderer(this, 96, 1, 256, 256);
		box3.addBox(0F, 0F, 0F, 2, 2, 14);
		box3.setPosition(-17F, 2F, -7F);

		box30 = new CustomModelRenderer(this, 2, 191, 256, 256);
		box30.addBox(0F, 0F, 0F, 54, 21, 0);
		box30.setPosition(-27F, 9F, -5F);

		box31 = new CustomModelRenderer(this, 182, 209, 256, 256);
		box31.addBox(0F, 0F, 0F, 1, 17, 2);
		box31.setPosition(-35F, 11F, -6F);

		box32 = new CustomModelRenderer(this, 182, 209, 256, 256);
		box32.addBox(0F, 0F, 0F, 1, 17, 2);
		box32.setPosition(-35F, 11F, 4F);

		box33 = new CustomModelRenderer(this, 189, 210, 256, 256);
		box33.addBox(0F, 0F, 0F, 1, 4, 8);
		box33.setPosition(-35F, 25F, -4F);

		box34 = new CustomModelRenderer(this, 209, 55, 256, 256);
		box34.addBox(0F, 0F, 0F, 2, 0, 8);
		box34.setPosition(-34F, 9F, 4F);
		box34.rotateAngleY = -3.141592653589793F;
		box34.rotateAngleZ = 6.178465552059927F;

		box35 = new CustomModelRenderer(this, 188, 11, 256, 256);
		box35.addBox(0F, 0F, 0F, 8, 7, 0);
		box35.setPosition(12F, 0F, 5F);

		box36 = new CustomModelRenderer(this, 215, 209, 256, 256);
		box36.addBox(0F, 0F, 0F, 1, 17, 2);
		box36.setPosition(34F, 11F, -6F);

		box37 = new CustomModelRenderer(this, 215, 209, 256, 256);
		box37.addBox(0F, 0F, 0F, 1, 17, 2);
		box37.setPosition(34F, 11F, 4F);

		box38 = new CustomModelRenderer(this, 222, 209, 256, 256);
		box38.addBox(0F, 0F, 0F, 1, 4, 8);
		box38.setPosition(34F, 25F, -4F);

		box39 = new CustomModelRenderer(this, 209, 55, 256, 256);
		box39.addBox(0F, 0F, 0F, 2, 0, 8);
		box39.setPosition(34F, 9F, -4F);
		box39.rotateAngleZ = -6.178465552059927F;

		box4 = new CustomModelRenderer(this, 188, 11, 256, 256);
		box4.addBox(0F, 0F, 0F, 8, 7, 0);
		box4.setPosition(-32F, 0F, 5F);

		box40 = new CustomModelRenderer(this, 200, 0, 256, 256);
		box40.addBox(0F, 0F, 0F, 6, 1, 22);
		box40.setPosition(27F, 6F, -11F);

		box41 = new CustomModelRenderer(this, 215, 51, 256, 256);
		box41.addBox(0F, 0F, 0F, 5, 2, 15);
		box41.setPosition(-8F, 11F, -5F);
		box41.rotateAngleZ = -6.230825429619756F;

		box42 = new CustomModelRenderer(this, 200, 0, 256, 256);
		box42.addBox(0F, 0F, 0F, 6, 1, 22);
		box42.setPosition(-33F, 6F, -11F);

		box43 = new CustomModelRenderer(this, 209, 73, 256, 256);
		box43.addBox(0F, 0F, 0F, 5, 1, 3);
		box43.setPosition(-21F, 15F, 7F);

		box44 = new CustomModelRenderer(this, 208, 78, 256, 256);
		box44.addBox(0F, 0F, 0F, 6, 1, 3);
		box44.setPosition(-3F, 15F, 7F);

		box45 = new CustomModelRenderer(this, 223, 25, 256, 256);
		box45.addBox(0F, 0F, 0F, 1, 10, 15);
		box45.setPosition(26F, 11F, 10F);
		box45.rotateAngleY = -3.141592653589793F;
		box45.rotateAngleZ = 6.19591884457987F;

		box46 = new CustomModelRenderer(this, 215, 51, 256, 256);
		box46.addBox(0F, 0F, 0F, 5, 2, 15);
		box46.setPosition(11F, 11F, -5F);
		box46.rotateAngleZ = -6.230825429619756F;

		box47 = new CustomModelRenderer(this, 215, 51, 256, 256);
		box47.addBox(0F, 0F, 0F, 5, 2, 15);
		box47.setPosition(26F, 11F, 10F);
		box47.rotateAngleY = -3.141592653589793F;
		box47.rotateAngleZ = -6.230825429619756F;

		box48 = new CustomModelRenderer(this, 223, 25, 256, 256);
		box48.addBox(0F, 0F, 0F, 1, 10, 15);
		box48.setPosition(11F, 11F, -5F);
		box48.rotateAngleZ = -6.161012259539984F;

		box49 = new CustomModelRenderer(this, 209, 73, 256, 256);
		box49.addBox(0F, 0F, 0F, 5, 1, 3);
		box49.setPosition(16F, 15F, 7F);

		box5 = new CustomModelRenderer(this, 188, 11, 256, 256);
		box5.addBox(0F, 0F, 0F, 8, 7, 0);
		box5.setPosition(12F, 0F, -5F);

		box50 = new CustomModelRenderer(this, 209, 116, 256, 256);
		box50.addBox(3F, 0F, 0F, 22, 3, 1);
		box50.setPosition(-36F, 1F, -6F);

		box51 = new CustomModelRenderer(this, 136, 0, 256, 256);
		box51.addBox(0F, 0F, 0F, 6, 1, 14);
		box51.setPosition(25F, 4F, -7F);

		box52 = new CustomModelRenderer(this, 217, 71, 256, 256);
		box52.addBox(0F, 0F, 0F, 4, 1, 15);
		box52.setPosition(-27F, 26F, -5F);
		box52.rotateAngleZ = -6.213372137099813F;

		box53 = new CustomModelRenderer(this, 141, 172, 256, 256);
		box53.addBox(0F, -6F, -1F, 1, 6, 1);
		box53.setPosition(-34F, 14F, 11F);
		box53.rotateAngleX = -6.19591884457987F;

		box54 = new CustomModelRenderer(this, 141, 165, 256, 256);
		box54.addBox(0F, 0F, 0F, 1, 4, 1);
		box54.setPosition(-34F, 14F, 10F);

		box55 = new CustomModelRenderer(this, 141, 153, 256, 256);
		box55.addBox(0F, 0F, -1F, 1, 9, 1);
		box55.setPosition(-34F, 18F, 11F);
		box55.rotateAngleX = -0.03490658503988659F;

		box56 = new CustomModelRenderer(this, 136, 153, 256, 256);
		box56.addBox(0F, 0F, -1F, 1, 9, 1);
		box56.setPosition(33F, 18F, 11F);
		box56.rotateAngleX = -0.03490658503988659F;

		box57 = new CustomModelRenderer(this, 136, 165, 256, 256);
		box57.addBox(0F, 0F, 0F, 1, 4, 1);
		box57.setPosition(33F, 14F, 10F);

		box58 = new CustomModelRenderer(this, 136, 172, 256, 256);
		box58.addBox(0F, -6F, -1F, 1, 6, 1);
		box58.setPosition(33F, 14F, 11F);
		box58.rotateAngleX = -6.19591884457987F;

		box59 = new CustomModelRenderer(this, 140, 79, 256, 256);
		box59.addBox(0F, 0F, 0F, 1, 4, 1);
		box59.setPosition(34F, 14F, -10F);
		box59.rotateAngleY = -3.141592653589793F;

		box6 = new CustomModelRenderer(this, 209, 116, 256, 256);
		box6.addBox(3F, 0F, 0F, 22, 3, 1);
		box6.setPosition(8F, 1F, -6F);

		box60 = new CustomModelRenderer(this, 140, 86, 256, 256);
		box60.addBox(0F, -6F, -1F, 1, 6, 1);
		box60.setPosition(34F, 14F, -11F);
		box60.rotateAngleX = -6.19591884457987F;
		box60.rotateAngleY = -3.141592653589793F;

		box61 = new CustomModelRenderer(this, 140, 67, 256, 256);
		box61.addBox(0F, 0F, -1F, 1, 9, 1);
		box61.setPosition(34F, 18F, -11F);
		box61.rotateAngleX = -0.03490658503988659F;
		box61.rotateAngleY = -3.141592653589793F;

		box62 = new CustomModelRenderer(this, 145, 67, 256, 256);
		box62.addBox(0F, 0F, -1F, 1, 9, 1);
		box62.setPosition(-33F, 18F, -11F);
		box62.rotateAngleX = -0.03490658503988659F;
		box62.rotateAngleY = -3.141592653589793F;

		box63 = new CustomModelRenderer(this, 188, 11, 256, 256);
		box63.addBox(0F, 0F, 0F, 8, 7, 0);
		box63.setPosition(-20F, 0F, -5F);

		box64 = new CustomModelRenderer(this, 213, 165, 256, 256);
		box64.addBox(0F, 0F, 0F, 0, 22, 20);
		box64.setPosition(-34F, 8F, -10F);

		box65 = new CustomModelRenderer(this, 0, 215, 256, 256);
		box65.addBox(0F, 0F, 0F, 68, 2, 18);
		box65.setPosition(-34F, 6F, -9F);

		box66 = new CustomModelRenderer(this, 152, 35, 256, 256);
		box66.addBox(0F, 0F, 0F, 2, 3, 4);
		box66.setPosition(-36F, 6F, -2F);

		box67 = new CustomModelRenderer(this, 153, 44, 256, 256);
		box67.addBox(0F, 0F, 0F, 1, 3, 3);
		box67.setPosition(-35F, 7F, 5F);

		box68 = new CustomModelRenderer(this, 153, 44, 256, 256);
		box68.addBox(0F, 0F, 0F, 1, 3, 3);
		box68.setPosition(-35F, 7F, -8F);

		box69 = new CustomModelRenderer(this, 0, 46, 256, 256);
		box69.addBox(0F, -2F, 0F, 68, 2, 6);
		box69.setPosition(-34F, 32F, -3F);

		box7 = new CustomModelRenderer(this, 1, 153, 256, 256);
		box7.addBox(0F, 0F, -1F, 66, 9, 1);
		box7.setPosition(-33F, 18F, 11F);
		box7.rotateAngleX = -0.03490658503988659F;

		box70 = new CustomModelRenderer(this, 1, 55, 256, 256);
		box70.addBox(0F, -2F, 0F, 68, 2, 5);
		box70.setPosition(34F, 32F, -3F);
		box70.rotateAngleX = -6.09119908946021F;
		box70.rotateAngleY = -3.141592653589793F;

		box71 = new CustomModelRenderer(this, 1, 38, 256, 256);
		box71.addBox(0F, -2F, 0F, 68, 2, 5);
		box71.setPosition(34F, 31F, -8F);
		box71.rotateAngleX = -5.340707511102648F;
		box71.rotateAngleY = -3.141592653589793F;

		box72 = new CustomModelRenderer(this, 1, 55, 256, 256);
		box72.addBox(0F, -2F, 0F, 68, 2, 5);
		box72.setPosition(-34F, 32F, 3F);
		box72.rotateAngleX = -6.09119908946021F;

		box73 = new CustomModelRenderer(this, 1, 38, 256, 256);
		box73.addBox(0F, -2F, 0F, 68, 2, 5);
		box73.setPosition(-34F, 31F, 8F);
		box73.rotateAngleX = -5.305800926062762F;

		box74 = new CustomModelRenderer(this, 0, 235, 256, 256);
		box74.addBox(0F, 0F, 0F, 68, 1, 20);
		box74.setPosition(-34F, 8F, -10F);

		box75 = new CustomModelRenderer(this, 171, 165, 256, 256);
		box75.addBox(0F, 0F, 0F, 0, 22, 20);
		box75.setPosition(34F, 8F, -10F);

		box76 = new CustomModelRenderer(this, 163, 44, 256, 256);
		box76.addBox(0F, 0F, 0F, 1, 3, 3);
		box76.setPosition(34F, 7F, -8F);

		box77 = new CustomModelRenderer(this, 163, 44, 256, 256);
		box77.addBox(0F, 0F, 0F, 1, 3, 3);
		box77.setPosition(34F, 7F, 5F);

		box78 = new CustomModelRenderer(this, 165, 35, 256, 256);
		box78.addBox(0F, 0F, 0F, 2, 3, 4);
		box78.setPosition(34F, 6F, -2F);

		box79 = new CustomModelRenderer(this, 223, 25, 256, 256);
		box79.addBox(0F, 0F, 0F, 1, 10, 15);
		box79.setPosition(-8F, 11F, -5F);
		box79.rotateAngleZ = -6.161012259539984F;

		box8 = new CustomModelRenderer(this, 209, 111, 256, 256);
		box8.addBox(3F, 0F, 0F, 22, 3, 1);
		box8.setPosition(8F, 1F, 5F);

		box80 = new CustomModelRenderer(this, 145, 79, 256, 256);
		box80.addBox(0F, 0F, 0F, 1, 4, 1);
		box80.setPosition(-33F, 14F, -10F);
		box80.rotateAngleY = -3.141592653589793F;

		//chair
		box81 = new CustomModelRenderer(this, 223, 25, 256, 256);
		box81.addBox(0F, 0F, 0F, 1, 10, 15);
		box81.setPosition(8F, 11F, 10F);
		box81.rotateAngleY = -3.141592653589793F;
		box81.rotateAngleZ = 6.161012259539984F;

		box82 = new CustomModelRenderer(this, 215, 51, 256, 256);
		box82.addBox(0F, 0F, 0F, 5, 2, 15);
		box82.setPosition(8F, 11F, 10F);
		box82.rotateAngleY = -3.141592653589793F;
		box82.rotateAngleZ = -6.230825429619756F;

		box83 = new CustomModelRenderer(this, 199, 122, 256, 256);
		box83.addBox(0F, 0F, 0F, 1, 21, 15);
		box83.setPosition(-10F, 9F, -5F);

		box84 = new CustomModelRenderer(this, 199, 122, 256, 256);
		box84.addBox(0F, 0F, 0F, 1, 21, 15);
		box84.setPosition(9F, 9F, -5F);

		box85 = new CustomModelRenderer(this, 169, 140, 256, 256);
		box85.addBox(0F, 0F, 0F, 0, 21, 20);
		box85.setPosition(-27F, 9F, -10F);

		box86 = new CustomModelRenderer(this, 145, 86, 256, 256);
		box86.addBox(0F, -6F, -1F, 1, 6, 1);
		box86.setPosition(-33F, 14F, -11F);
		box86.rotateAngleX = -6.19591884457987F;
		box86.rotateAngleY = -3.141592653589793F;

		box87 = new CustomModelRenderer(this, 213, 140, 256, 256);
		box87.addBox(0F, 0F, 0F, 0, 21, 20);
		box87.setPosition(27F, 9F, -10F);

		box88 = new CustomModelRenderer(this, 217, 71, 256, 256);
		box88.addBox(0F, 0F, 0F, 4, 1, 15);
		box88.setPosition(-10F, 26F, 10F);
		box88.rotateAngleY = -3.141592653589793F;
		box88.rotateAngleZ = 6.213372137099813F;

		box89 = new CustomModelRenderer(this, 1, 165, 256, 256);
		box89.addBox(0F, 0F, 0F, 66, 4, 1);
		box89.setPosition(-33F, 14F, 10F);

		box9 = new CustomModelRenderer(this, 223, 25, 256, 256);
		box9.addBox(0F, 0F, 0F, 1, 10, 15);
		box9.setPosition(-26F, 11F, -5F);
		box9.rotateAngleZ = -6.19591884457987F;

		box90 = new CustomModelRenderer(this, 1, 172, 256, 256);
		box90.addBox(0F, -6F, -1F, 66, 6, 1);
		box90.setPosition(-33F, 14F, 11F);
		box90.rotateAngleX = -6.19591884457987F;

		box91 = new CustomModelRenderer(this, 217, 71, 256, 256);
		box91.addBox(0F, 0F, 0F, 4, 1, 15);
		box91.setPosition(-9F, 26F, -5F);
		box91.rotateAngleZ = -6.213372137099813F;

		box92 = new CustomModelRenderer(this, 217, 71, 256, 256);
		box92.addBox(0F, 0F, 0F, 4, 1, 15);
		box92.setPosition(9F, 26F, 10F);
		box92.rotateAngleY = -3.141592653589793F;
		box92.rotateAngleZ = 6.213372137099813F;

		box93 = new CustomModelRenderer(this, 217, 71, 256, 256);
		box93.addBox(0F, 0F, 0F, 4, 1, 15);
		box93.setPosition(10F, 26F, -5F);
		box93.rotateAngleZ = -6.213372137099813F;

		box94 = new CustomModelRenderer(this, 217, 71, 256, 256);
		box94.addBox(0F, 0F, 0F, 4, 1, 15);
		box94.setPosition(27F, 26F, 10F);
		box94.rotateAngleY = -3.141592653589793F;
		box94.rotateAngleZ = 6.213372137099813F;
	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
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
		box92.render(f5);
		box93.render(f5);
		box94.render(f5);
		
		if (ClientProxy.isHoliday()) {
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.12f, 0.8f, -0.72f);
			lights.render(5);
			GL11.glPopMatrix();
			
			GL11.glPushMatrix();
			GL11.glTranslatef(0, 0.8f, -0.72f);
			lights.render(5);
			GL11.glPopMatrix();
			
			GL11.glPushMatrix();
			GL11.glTranslatef(1.12f, 0.8f, -0.72f);
			lights.render(5);
			GL11.glPopMatrix();
			
			GL11.glPushMatrix();
			GL11.glTranslatef(-1.12f, 0.8f, 0.72f);
			GL11.glRotatef(-180f, 0, 1, 0);
			lights.render(5);
			GL11.glPopMatrix();
			
			GL11.glPushMatrix();
			GL11.glTranslatef(0, 0.8f, 0.72f);
			GL11.glRotatef(-180f, 0, 1, 0);
			lights.render(5);
			GL11.glPopMatrix();
			
			GL11.glPushMatrix();
			GL11.glTranslatef(1.12f, 0.8f, 0.72f);
			GL11.glRotatef(-180f, 0, 1, 0);
			lights.render(5);
			GL11.glPopMatrix();
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {}
}
