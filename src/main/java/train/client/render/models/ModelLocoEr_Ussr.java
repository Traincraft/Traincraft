package train.client.render.models;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import train.client.core.ClientProxy;
import train.client.render.CustomModelRenderer;
import train.client.render.models.blocks.ModelRing;

public class ModelLocoEr_Ussr extends ModelBase {

	private ModelRing ring;
	
	public CustomModelRenderer body;
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
	public CustomModelRenderer box8;
	public CustomModelRenderer box83;
	public CustomModelRenderer box9;
	
	public ModelLocoEr_Ussr() {
		
		ring = new ModelRing();
		
		body = new CustomModelRenderer(this, 134, 117, 256, 256);
		body.addBox(0F, 0F, 0F, 13, 2, 22);
		body.setPosition(4F, 12F, -11F);

		box = new CustomModelRenderer(this, 70, 69, 256, 256);
		box.addBox(0F, 0F, 0F, 0, 20, 22);
		box.setPosition(4F, 14F, -11F);

		box0 = new CustomModelRenderer(this, 113, 240, 256, 256);
		box0.addBox(0F, 0F, 0F, 2, 3, 4);
		box0.setPosition(-54F, 5F, -2F);

		box1 = new CustomModelRenderer(this, 137, 64, 256, 256);
		box1.addBox(0F, 0F, 0F, 55, 8, 0);
		box1.setPosition(-51F, 15F, 11F);

		box10 = new CustomModelRenderer(this, 80, 76, 256, 256);
		box10.addBox(0F, 0F, -5F, 20, 1, 5);
		box10.setPosition(23F, 35F, -4F);
		box10.rotateAngleX = -2.949606435870417F;
		box10.rotateAngleY = -3.141592653589793F;

		box11 = new CustomModelRenderer(this, 137, 57, 256, 256);
		box11.addBox(0F, 0F, 0F, 0, 8, 22);
		box11.setPosition(-51F, 15F, -11F);

		box12 = new CustomModelRenderer(this, 0, 187, 256, 256);
		box12.addBox(0F, 0F, 0F, 26, 13, 1);
		box12.setPosition(-13F, 1F, -8F);
		box12.rotateAngleY = -3.141592653589793F;

		box13 = new CustomModelRenderer(this, 77, 237, 256, 256);
		box13.addBox(0F, 0F, 0F, 7, 11, 5);
		box13.setPosition(-39F, 3F, -6F);
		box13.rotateAngleY = 3.141592653589793F;
		box13.rotateAngleZ = 6.283185307179586F;

		box14 = new CustomModelRenderer(this, 48, 112, 256, 256);
		box14.addBox(0F, 0F, 0F, 5, 4, 22);
		box14.setPosition(22F, 30F, 11F);
		box14.rotateAngleY = -3.141592653589793F;

		box15 = new CustomModelRenderer(this, 36, 56, 256, 256);
		box15.addBox(0F, 0F, 0F, 0, 16, 14);
		box15.setPosition(22F, 14F, -7F);

		box16 = new CustomModelRenderer(this, 116, 249, 256, 256);
		box16.addBox(0F, 0F, 0F, 2, 3, 3);
		box16.setPosition(-51F, 10F, 3F);

		box17 = new CustomModelRenderer(this, 81, 84, 256, 256);
		box17.addBox(0F, 0F, -4F, 20, 1, 4);
		box17.setPosition(3F, 34F, 9F);
		box17.rotateAngleX = -2.2689280275926285F;

		box18 = new CustomModelRenderer(this, 69, 187, 256, 256);
		box18.addBox(0F, 0F, 0F, 5, 11, 12);
		box18.setPosition(-40F, 9F, 6F);
		box18.rotateAngleY = 3.141592653589793F;
		box18.rotateAngleZ = 6.283185307179586F;

		box19 = new CustomModelRenderer(this, 61, 241, 256, 256);
		box19.addBox(0F, 0F, 0F, 3, 8, 4);
		box19.setPosition(-44F, 15F, -9F);
		box19.rotateAngleX = -6.021385919380437F;

		box2 = new CustomModelRenderer(this, 77, 65, 256, 256);
		box2.addBox(0F, 0F, 0F, 20, 1, 8);
		box2.setPosition(3F, 34F, -4F);

		box20 = new CustomModelRenderer(this, 33, 108, 256, 256);
		box20.addBox(0F, 0F, 0F, 13, 17, 0);
		box20.setPosition(4F, 14F, 11F);

		box21 = new CustomModelRenderer(this, 4, 108, 256, 256);
		box21.addBox(0F, 0F, 0F, 13, 17, 0);
		box21.setPosition(4F, 14F, -11F);

		box22 = new CustomModelRenderer(this, 104, 125, 256, 256);
		box22.addBox(0F, 0F, 0F, 4, 1, 12);
		box22.setPosition(-51F, 14F, -6F);

		box23 = new CustomModelRenderer(this, 26, 154, 256, 256);
		box23.addBox(0F, 0F, 0F, 54, 9, 0);
		box23.setPosition(11F, 0F, -5F);
		box23.rotateAngleY = -3.141592653589793F;

		box24 = new CustomModelRenderer(this, 163, 198, 256, 256);
		box24.addBox(0F, 0F, 0F, 1, 8, 20);
		box24.setPosition(-28F, 6F, 10F);
		box24.rotateAngleY = -3.141592653589793F;

		box25 = new CustomModelRenderer(this, 36, 235, 256, 256);
		box25.addBox(0F, 0F, 0F, 4, 12, 1);
		box25.setPosition(-47F, 2F, -9F);
		box25.rotateAngleY = 3.141592653589793F;
		box25.rotateAngleZ = 6.283185307179586F;

		box26 = new CustomModelRenderer(this, 0, 206, 256, 256);
		box26.addBox(0F, -1F, 0F, 4, 1, 3);
		box26.setPosition(18F, 3F, -11F);

		box27 = new CustomModelRenderer(this, 0, 206, 256, 256);
		box27.addBox(0F, 0F, 0F, 4, 1, 3);
		box27.setPosition(18F, 5F, -10F);

		box28 = new CustomModelRenderer(this, 134, 3, 256, 256);
		box28.addBox(0F, 0F, 0F, 40, 6, 6);
		box28.setPosition(-7F, 20F, 7F);
		box28.rotateAngleX = -5.497787143782138F;
		box28.rotateAngleY = -3.141592653589793F;

		box29 = new CustomModelRenderer(this, 46, 235, 256, 256);
		box29.addBox(0F, 0F, 0F, 4, 12, 1);
		box29.setPosition(-51F, 2F, 9F);
		box29.rotateAngleZ = -6.283185307179586F;

		box3 = new CustomModelRenderer(this, 134, 31, 256, 256);
		box3.addBox(0F, 0F, 0F, 51, 6, 6);
		box3.setPosition(-47F, 26F, -7F);
		box3.rotateAngleX = -5.497787143782138F;

		box30 = new CustomModelRenderer(this, 0, 206, 256, 256);
		box30.addBox(0F, 0F, 0F, 4, 1, 3);
		box30.setPosition(18F, 11F, -8F);

		box31 = new CustomModelRenderer(this, 0, 206, 256, 256);
		box31.addBox(0F, 0F, 0F, 4, 1, 3);
		box31.setPosition(18F, 2F, 8F);

		box32 = new CustomModelRenderer(this, 61, 241, 256, 256);
		box32.addBox(0F, 0F, 0F, 3, 8, 4);
		box32.setPosition(-41F, 15F, 9F);
		box32.rotateAngleX = -6.021385919380437F;
		box32.rotateAngleY = -3.141592653589793F;

		box33 = new CustomModelRenderer(this, 8, 21, 256, 256);
		box33.addBox(0F, 0F, 0F, 40, 14, 6);
		box33.setPosition(-47F, 16F, -3F);

		box34 = new CustomModelRenderer(this, 0, 0, 256, 256);
		box34.addBox(0F, 0F, 0F, 40, 6, 14);
		box34.setPosition(-47F, 20F, -7F);

		box35 = new CustomModelRenderer(this, 134, 149, 256, 256);
		box35.addBox(0F, 0F, 0F, 3, 4, 4);
		box35.setPosition(-50F, 28F, -2F);

		box36 = new CustomModelRenderer(this, 134, 44, 256, 256);
		box36.addBox(0F, 0F, 0F, 51, 6, 6);
		box36.setPosition(4F, 26F, 7F);
		box36.rotateAngleX = -5.497787143782138F;
		box36.rotateAngleY = -3.141592653589793F;

		box37 = new CustomModelRenderer(this, 77, 237, 256, 256);
		box37.addBox(0F, 0F, 0F, 7, 11, 5);
		box37.setPosition(-39F, 3F, 11F);
		box37.rotateAngleY = 3.141592653589793F;
		box37.rotateAngleZ = 6.283185307179586F;

		box38 = new CustomModelRenderer(this, 134, 16, 256, 256);
		box38.addBox(0F, 0F, 0F, 40, 6, 6);
		box38.setPosition(-47F, 20F, -7F);
		box38.rotateAngleX = -5.497787143782138F;

		box39 = new CustomModelRenderer(this, 134, 122, 256, 256);
		box39.addBox(0F, 0F, 0F, 4, 9, 4);
		box39.setPosition(-45F, 28F, -2F);

		box4 = new CustomModelRenderer(this, 80, 76, 256, 256);
		box4.addBox(0F, 0F, -5F, 20, 1, 5);
		box4.setPosition(3F, 35F, 4F);
		box4.rotateAngleX = -2.949606435870417F;

		box40 = new CustomModelRenderer(this, 134, 93, 256, 256);
		box40.addBox(0F, 0F, 0F, 55, 1, 5);
		box40.setPosition(-51F, 14F, -11F);

		box41 = new CustomModelRenderer(this, 4, 68, 256, 256);
		box41.addBox(0F, 0F, 0F, 0, 16, 22);
		box41.setPosition(17F, 14F, -11F);

		box42 = new CustomModelRenderer(this, 160, 149, 256, 256);
		box42.addBox(0F, 0F, 0F, 5, 1, 14);
		box42.setPosition(17F, 13F, -7F);

		box43 = new CustomModelRenderer(this, 0, 206, 256, 256);
		box43.addBox(0F, 0F, 0F, 4, 1, 3);
		box43.setPosition(18F, 5F, 7F);

		box44 = new CustomModelRenderer(this, 0, 173, 256, 256);
		box44.addBox(0F, 0F, 0F, 26, 13, 1);
		box44.setPosition(-13F, 1F, 9F);
		box44.rotateAngleY = -3.141592653589793F;

		box45 = new CustomModelRenderer(this, 71, 230, 256, 256);
		box45.addBox(0F, 0F, 0F, 16, 2, 1);
		box45.setPosition(-31F, 4F, 9F);
		box45.rotateAngleX = -6.265732014659643F;
		box45.rotateAngleY = -3.141592653589793F;

		box46 = new CustomModelRenderer(this, 0, 206, 256, 256);
		box46.addBox(0F, 0F, 0F, 4, 1, 3);
		box46.setPosition(18F, 8F, -9F);

		box47 = new CustomModelRenderer(this, 2, 51, 256, 256);
		box47.addBox(0F, 0F, 0F, 2, 2, 12);
		box47.setPosition(-6F, 3F, 6F);
		box47.rotateAngleY = -3.141592653589793F;

		box48 = new CustomModelRenderer(this, 26, 164, 256, 256);
		box48.addBox(0F, 0F, 0F, 54, 9, 0);
		box48.setPosition(11F, 0F, 5F);
		box48.rotateAngleY = -3.141592653589793F;

		box49 = new CustomModelRenderer(this, 71, 226, 256, 256);
		box49.addBox(0F, 0F, 0F, 38, 2, 1);
		box49.setPosition(5F, 1F, -6F);
		box49.rotateAngleY = -3.141592653589793F;

		box5 = new CustomModelRenderer(this, 137, 64, 256, 256);
		box5.addBox(0F, 0F, 0F, 55, 8, 0);
		box5.setPosition(-51F, 15F, -11F);

		box50 = new CustomModelRenderer(this, 107, 113, 256, 256);
		box50.addBox(0F, 0F, 0F, 7, 3, 4);
		box50.setPosition(15F, 6F, -2F);

		box51 = new CustomModelRenderer(this, 27, 230, 256, 256);
		box51.addBox(0F, 0F, 0F, 20, 2, 1);
		box51.setPosition(-13F, 1F, -7F);
		box51.rotateAngleY = 3.141592653589793F;
		box51.rotateAngleZ = 6.126105674500097F;

		box52 = new CustomModelRenderer(this, 191, 141, 256, 256);
		box52.addBox(0F, 0F, 0F, 18, 3, 14);
		box52.setPosition(-7F, 10F, -7F);
		box52.rotateAngleZ = -6.2482787221397F;

		box53 = new CustomModelRenderer(this, 2, 51, 256, 256);
		box53.addBox(0F, 0F, 0F, 2, 2, 12);
		box53.setPosition(-24F, 3F, 6F);
		box53.rotateAngleY = -3.141592653589793F;

		box54 = new CustomModelRenderer(this, 0, 206, 256, 256);
		box54.addBox(0F, 0F, 0F, 4, 1, 3);
		box54.setPosition(18F, 8F, 6F);

		box55 = new CustomModelRenderer(this, 210, 224, 256, 256);
		box55.addBox(0F, 0F, 0F, 0, 5, 20);
		box55.setPosition(-8F, 9F, 10F);
		box55.rotateAngleY = -3.141592653589793F;

		box56 = new CustomModelRenderer(this, 2, 51, 256, 256);
		box56.addBox(0F, 0F, 0F, 2, 2, 12);
		box56.setPosition(3F, 3F, 6F);
		box56.rotateAngleY = -3.141592653589793F;

		box57 = new CustomModelRenderer(this, 71, 230, 256, 256);
		box57.addBox(0F, 0F, 0F, 16, 2, 1);
		box57.setPosition(-31F, 4F, -8F);
		box57.rotateAngleX = -0.017453292519943295F;
		box57.rotateAngleY = -3.141592653589793F;

		box58 = new CustomModelRenderer(this, 150, 145, 256, 256);
		box58.addBox(0F, 0F, 0F, 2, 6, 6);
		box58.setPosition(-48F, 18F, -3F);

		box59 = new CustomModelRenderer(this, 109, 198, 256, 256);
		box59.addBox(0F, 0F, 0F, 8, 7, 8);
		box59.setPosition(-20F, 28F, -4F);

		box6 = new CustomModelRenderer(this, 100, 174, 256, 256);
		box6.addBox(0F, 0F, 0F, 70, 6, 8);
		box6.setPosition(19F, 4F, 4F);
		box6.rotateAngleY = -3.141592653589793F;

		box60 = new CustomModelRenderer(this, 197, 105, 256, 256);
		box60.addBox(0F, 0F, 0F, 14, 17, 14);
		box60.setPosition(7F, 13F, 7F);
		box60.rotateAngleY = -3.141592653589793F;

		box61 = new CustomModelRenderer(this, 174, 239, 256, 256);
		box61.addBox(0F, 0F, 0F, 4, 12, 1);
		box61.setPosition(22F, 2F, -8F);
		box61.rotateAngleX = -0.3141592653589793F;
		box61.rotateAngleY = -3.141592653589793F;

		box62 = new CustomModelRenderer(this, 174, 239, 256, 256);
		box62.addBox(0F, 0F, 0F, 4, 12, 1);
		box62.setPosition(18F, 2F, 8F);
		box62.rotateAngleX = -0.3141592653589793F;

		box63 = new CustomModelRenderer(this, 0, 206, 256, 256);
		box63.addBox(0F, 0F, 0F, 4, 1, 3);
		box63.setPosition(18F, 11F, 5F);

		box64 = new CustomModelRenderer(this, 2, 51, 256, 256);
		box64.addBox(0F, 0F, 0F, 2, 2, 12);
		box64.setPosition(-15F, 3F, 6F);
		box64.rotateAngleY = -3.141592653589793F;

		box65 = new CustomModelRenderer(this, 134, 93, 256, 256);
		box65.addBox(0F, 0F, 0F, 55, 1, 5);
		box65.setPosition(-51F, 14F, 6F);

		box66 = new CustomModelRenderer(this, 2, 51, 256, 256);
		box66.addBox(0F, 0F, 0F, 2, 2, 12);
		box66.setPosition(-33F, 3F, 6F);
		box66.rotateAngleY = -3.141592653589793F;

		box67 = new CustomModelRenderer(this, 212, 197, 256, 256);
		box67.addBox(0F, 0F, 0F, 8, 5, 10);
		box67.setPosition(19F, 8F, 5F);
		box67.rotateAngleY = -3.141592653589793F;

		box68 = new CustomModelRenderer(this, 187, 212, 256, 256);
		box68.addBox(0F, 0F, 0F, 0, 3, 20);
		box68.setPosition(4F, 9F, 10F);
		box68.rotateAngleY = -3.141592653589793F;

		box69 = new CustomModelRenderer(this, 11, 71, 256, 256);
		box69.addBox(0F, 0F, 0F, 5, 16, 0);
		box69.setPosition(17F, 14F, 7F);

		box7 = new CustomModelRenderer(this, 12, 204, 256, 256);
		box7.addBox(0F, 0F, 0F, 1, 5, 16);
		box7.setPosition(-52F, 5F, -8F);

		box70 = new CustomModelRenderer(this, 54, 89, 256, 256);
		box70.addBox(0F, 0F, 0F, 5, 16, 0);
		box70.setPosition(17F, 14F, -7F);

		box71 = new CustomModelRenderer(this, 71, 226, 256, 256);
		box71.addBox(0F, 0F, 0F, 38, 2, 1);
		box71.setPosition(5F, 1F, 7F);
		box71.rotateAngleY = -3.141592653589793F;

		box72 = new CustomModelRenderer(this, 27, 230, 256, 256);
		box72.addBox(0F, 0F, 0F, 20, 2, 1);
		box72.setPosition(-13F, 1F, 8F);
		box72.rotateAngleY = 3.141592653589793F;
		box72.rotateAngleZ = 6.126105674500097F;

		box73 = new CustomModelRenderer(this, 187, 212, 256, 256);
		box73.addBox(0F, 0F, 0F, 0, 3, 20);
		box73.setPosition(17F, 9F, 10F);
		box73.rotateAngleY = -3.141592653589793F;

		box74 = new CustomModelRenderer(this, 154, 105, 256, 256);
		box74.addBox(0F, 0F, 0F, 4, 6, 2);
		box74.setPosition(-5F, 28F, -1F);

		box75 = new CustomModelRenderer(this, 83, 212, 256, 256);
		box75.addBox(0F, 0F, 0F, 6, 6, 6);
		box75.setPosition(-27F, 29F, -3F);

		box76 = new CustomModelRenderer(this, 83, 212, 256, 256);
		box76.addBox(0F, 0F, 0F, 6, 6, 6);
		box76.setPosition(-36F, 29F, -3F);

		box8 = new CustomModelRenderer(this, 81, 84, 256, 256);
		box8.addBox(0F, 0F, -4F, 20, 1, 4);
		box8.setPosition(23F, 34F, -9F);
		box8.rotateAngleX = -2.2689280275926285F;
		box8.rotateAngleY = -3.141592653589793F;

		box83 = new CustomModelRenderer(this, 136, 233, 256, 256);
		box83.addBox(0F, 0F, 0F, 5, 5, 13);
		box83.setPosition(-25F, 10F, 3F);
		box83.rotateAngleY = 1.5707963267948966F;
		//box83.rotateAngleZ = -0.7853981633974483F;

		box9 = new CustomModelRenderer(this, 116, 249, 256, 256);
		box9.addBox(0F, 0F, 0F, 2, 3, 3);
		box9.setPosition(-51F, 10F, -6F);
	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
		box.render(f5);
		box0.render(f5);
		box1.render(f5);
		box10.render(f5);
		box11.render(f5);
		box12.render(f5);
		box13.render(f5);
		box14.render(f5);
		box15.render(f5);
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
		box8.render(f5);
		box83.render(f5);
		
		Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
		box35.render(f5);
		box16.render(f5);
		box9.render(f5);
		Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
		
		if (ClientProxy.isHoliday()) {
			GL11.glPushMatrix();
			GL11.glTranslatef(-3.08f, 1.3f, 0);
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glScalef(0.7f, 0.7f, 0.7f);
			ring.render(5);
			GL11.glPopMatrix();
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {}
}