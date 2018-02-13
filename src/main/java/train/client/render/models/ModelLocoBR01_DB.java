package train.client.render.models;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelBase;
import train.client.core.ClientProxy;
import train.client.render.CustomModelRenderer;
import train.client.render.models.blocks.ModelRing;
import train.common.library.Info;

public class ModelLocoBR01_DB extends ModelBase {
	
	private ModelRing ring;
	
	public CustomModelRenderer box;
	public CustomModelRenderer box0;
	public CustomModelRenderer box1;
	public CustomModelRenderer box10;
	public CustomModelRenderer box102;
	public CustomModelRenderer box103;
	public CustomModelRenderer box106;
	public CustomModelRenderer box108;
	public CustomModelRenderer box11;
	public CustomModelRenderer box110;
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
	public CustomModelRenderer box57;
	public CustomModelRenderer box6;
	public CustomModelRenderer box60;
	public CustomModelRenderer box67;
	public CustomModelRenderer box7;
	public CustomModelRenderer box73;
	public CustomModelRenderer box74;
	public CustomModelRenderer box76;
	public CustomModelRenderer box77;
	public CustomModelRenderer box8;
	public CustomModelRenderer box81;
	public CustomModelRenderer box82;
	public CustomModelRenderer box83;
	public CustomModelRenderer box85;
	public CustomModelRenderer box86;
	public CustomModelRenderer box9;
	public CustomModelRenderer box94;
	public CustomModelRenderer box95;
	public CustomModelRenderer box97;
	public CustomModelRenderer box98;
	public CustomModelRenderer box99;

	public ModelLocoBR01_DB() {
		
		ring = new ModelRing();
		
		box = new CustomModelRenderer(this, 22, 54, 256, 256);
		box.addBox(0F, 0F, 0F, 1, 3, 20);
		box.setPosition(4F, 30F, -10F);

		box0 = new CustomModelRenderer(this, 36, 107, 256, 256);
		box0.addBox(0F, 0F, 0F, 2, 10, 10);
		box0.setPosition(-48F, 19F, -5F);

		box1 = new CustomModelRenderer(this, 0, 117, 256, 256);
		box1.addBox(0F, 0F, 0F, 16, 10, 1);
		box1.setPosition(4F, 14F, 10F);

		box10 = new CustomModelRenderer(this, 104, 25, 256, 256);
		box10.addBox(0F, 0F, 0F, 23, 1, 5);
		box10.setPosition(26F, 34F, 7F);
		box10.rotateAngleX = -3.7524578917878086F;
		box10.rotateAngleY = -3.141592653589793F;

		box102 = new CustomModelRenderer(this, 72, 173, 256, 256);
		box102.addBox(0F, 0F, 0F, 1, 12, 1);
		box102.setPosition(-26F, 3F, 8F);

		box103 = new CustomModelRenderer(this, 0, 151, 256, 256);
		box103.addBox(0F, 0F, 0F, 29, 11, 1);
		box103.setPosition(-36F, 3F, 7F);

		box106 = new CustomModelRenderer(this, 2, 51, 256, 256);
		box106.addBox(0F, 2F, 0F, 21, 2, 1);
		box106.setPosition(-27F, 3F, -7F);
		box106.rotateAngleY = -3.141592653589793F;

		box108 = new CustomModelRenderer(this, 52, 50, 256, 256);
		box108.addBox(0F, 0F, 0F, 30, 2, 1);
		box108.setPosition(4F, 2F, -5F);
		box108.rotateAngleY = -3.141592653589793F;

		box11 = new CustomModelRenderer(this, 170, 63, 256, 256);
		box11.addBox(0F, 0F, 0F, 37, 16, 6);
		box11.setPosition(-47F, 21F, 8F);
		box11.rotateAngleX = -1.5707963267948966F;

		box110 = new CustomModelRenderer(this, 0, 163, 256, 256);
		box110.addBox(0F, 0F, 0F, 29, 11, 1);
		box110.setPosition(-36F, 3F, -8F);

		box12 = new CustomModelRenderer(this, 69, 69, 256, 256);
		box12.addBox(0F, 0F, 0F, 17, 7, 1);
		box12.setPosition(-52F, 21F, -11F);
		box12.rotateAngleX = -6.19591884457987F;

		box13 = new CustomModelRenderer(this, 63, 200, 256, 256);
		box13.addBox(0F, 0F, 0F, 9, 4, 4);
		box13.setPosition(-35F, 10F, 9F);
		box13.rotateAngleY = 3.141592653589793F;
		box13.rotateAngleZ = 6.283185307179586F;

		box14 = new CustomModelRenderer(this, 49, 110, 256, 256);
		box14.addBox(0F, 0F, 0F, 1, 2, 20);
		box14.setPosition(-44F, 15F, -10F);

		box15 = new CustomModelRenderer(this, 36, 84, 256, 256);
		box15.addBox(0F, 0F, 0F, 1, 4, 16);
		box15.setPosition(4F, 26F, -8F);

		box16 = new CustomModelRenderer(this, 193, 234, 256, 256);
		box16.addBox(0F, 0F, 0F, 2, 3, 3);
		box16.setPosition(-55F, 7F, 4F);

		box17 = new CustomModelRenderer(this, 45, 58, 256, 256);
		box17.addBox(0F, 0F, 0F, 1, 3, 20);
		box17.setPosition(19F, 30F, -10F);

		box18 = new CustomModelRenderer(this, 159, 191, 256, 256);
		box18.addBox(0F, 0F, 0F, 3, 7, 2);
		box18.setPosition(-41F, 12F, 7F);
		box18.rotateAngleX = -0.5061454830783556F;

		box19 = new CustomModelRenderer(this, 63, 200, 256, 256);
		box19.addBox(0F, 0F, 0F, 9, 4, 4);
		box19.setPosition(-35F, 10F, -5F);
		box19.rotateAngleY = 3.141592653589793F;
		box19.rotateAngleZ = 6.283185307179586F;

		box2 = new CustomModelRenderer(this, 41, 35, 256, 256);
		box2.addBox(0F, 0F, 0F, 23, 1, 14);
		box2.setPosition(3F, 33F, -7F);

		box20 = new CustomModelRenderer(this, 68, 173, 256, 256);
		box20.addBox(0F, 0F, 0F, 1, 12, 1);
		box20.setPosition(-26F, 3F, -9F);

		box21 = new CustomModelRenderer(this, 0, 103, 256, 256);
		box21.addBox(0F, 0F, 0F, 16, 10, 1);
		box21.setPosition(4F, 14F, -11F);

		box22 = new CustomModelRenderer(this, 103, 132, 256, 256);
		box22.addBox(0F, 0F, 0F, 2, 4, 4);
		box22.setPosition(-49F, 27F, -2F);

		box23 = new CustomModelRenderer(this, 171, 228, 256, 256);
		box23.addBox(0F, 0F, 0F, 1, 5, 18);
		box23.setPosition(20F, 6F, 9F);
		box23.rotateAngleY = -3.141592653589793F;

		box24 = new CustomModelRenderer(this, 88, 93, 256, 256);
		box24.addBox(0F, 0F, 0F, 2, 8, 1);
		box24.setPosition(18F, 24F, -11F);
		box24.rotateAngleX = -6.126105674500097F;

		box25 = new CustomModelRenderer(this, 98, 93, 256, 256);
		box25.addBox(0F, 0F, 0F, 1, 8, 1);
		box25.setPosition(12F, 24F, -11F);
		box25.rotateAngleX = -6.126105674500097F;

		box26 = new CustomModelRenderer(this, 0, 68, 256, 256);
		box26.addBox(0F, 0F, 0F, 1, 12, 20);
		box26.setPosition(4F, 14F, -10F);

		box27 = new CustomModelRenderer(this, 96, 54, 256, 256);
		box27.addBox(0F, 0F, 0F, 20, 2, 1);
		box27.setPosition(-9F, 2F, -6F);
		box27.rotateAngleY = 3.141592653589793F;
		box27.rotateAngleZ = 6.126105674500097F;

		box28 = new CustomModelRenderer(this, 115, 102, 256, 256);
		box28.addBox(0F, 0F, 0F, 3, 8, 1);
		box28.setPosition(7F, 24F, 11F);
		box28.rotateAngleX = -6.1086523819801535F;
		box28.rotateAngleY = -3.141592653589793F;

		box29 = new CustomModelRenderer(this, 52, 50, 256, 256);
		box29.addBox(0F, 0F, 0F, 30, 2, 1);
		box29.setPosition(4F, 2F, 6F);
		box29.rotateAngleY = -3.141592653589793F;

		box3 = new CustomModelRenderer(this, 139, 48, 256, 256);
		box3.addBox(0F, 0F, 0F, 51, 7, 7);
		box3.setPosition(4F, 27F, 2F);
		box3.rotateAngleX = -5.497787143782138F;
		box3.rotateAngleY = -3.141592653589793F;

		box30 = new CustomModelRenderer(this, 96, 54, 256, 256);
		box30.addBox(0F, 0F, 0F, 20, 2, 1);
		box30.setPosition(-9F, 2F, 7F);
		box30.rotateAngleY = 3.141592653589793F;
		box30.rotateAngleZ = 6.126105674500097F;

		box31 = new CustomModelRenderer(this, 80, 93, 256, 256);
		box31.addBox(0F, 0F, 0F, 2, 8, 1);
		box31.setPosition(20F, 24F, 11F);
		box31.rotateAngleX = -6.1086523819801535F;
		box31.rotateAngleY = -3.141592653589793F;

		box32 = new CustomModelRenderer(this, 217, 201, 256, 256);
		box32.addBox(0F, 0F, 0F, 8, 6, 8);
		box32.setPosition(-29F, 28F, -4F);

		box33 = new CustomModelRenderer(this, 142, 106, 256, 256);
		box33.addBox(0F, 0F, 0F, 51, 16, 6);
		box33.setPosition(-47F, 16F, -3F);

		box34 = new CustomModelRenderer(this, 217, 201, 256, 256);
		box34.addBox(0F, 0F, 0F, 8, 6, 8);
		box34.setPosition(-19F, 28F, -4F);

		box35 = new CustomModelRenderer(this, 142, 138, 256, 256);
		box35.addBox(0F, 0F, 0F, 49, 1, 4);
		box35.setPosition(-45F, 17F, 7F);

		box36 = new CustomModelRenderer(this, 139, 48, 256, 256);
		box36.addBox(0F, 0F, 0F, 51, 7, 7);
		box36.setPosition(4F, 27F, 8F);
		box36.rotateAngleX = -5.497787143782138F;
		box36.rotateAngleY = -3.141592653589793F;

		box37 = new CustomModelRenderer(this, 160, 91, 256, 256);
		box37.addBox(0F, 0F, 0F, 41, 7, 7);
		box37.setPosition(-6F, 21F, 8F);
		box37.rotateAngleX = -5.497787143782138F;
		box37.rotateAngleY = -3.141592653589793F;

		box38 = new CustomModelRenderer(this, 160, 91, 256, 256);
		box38.addBox(0F, 0F, 0F, 41, 7, 7);
		box38.setPosition(-6F, 21F, 2F);
		box38.rotateAngleX = -5.497787143782138F;
		box38.rotateAngleY = -3.141592653589793F;

		box39 = new CustomModelRenderer(this, 232, 225, 256, 256);
		box39.addBox(0F, 0F, 0F, 6, 25, 6);
		box39.setPosition(-42F, 10F, -3F);

		box4 = new CustomModelRenderer(this, 104, 25, 256, 256);
		box4.addBox(0F, 0F, 0F, 23, 1, 5);
		box4.setPosition(3F, 34F, -7F);
		box4.rotateAngleX = -3.7524578917878086F;

		box40 = new CustomModelRenderer(this, 141, 132, 256, 256);
		box40.addBox(0F, 0F, 0F, 49, 1, 4);
		box40.setPosition(-45F, 17F, -11F);

		box41 = new CustomModelRenderer(this, 10, 63, 256, 256);
		box41.addBox(0F, 0F, 0F, 1, 16, 3);
		box41.setPosition(19F, 14F, 7F);

		box42 = new CustomModelRenderer(this, 18, 10, 256, 256);
		box42.addBox(0F, 0F, 0F, 16, 2, 22);
		box42.setPosition(4F, 12F, -11F);

		box43 = new CustomModelRenderer(this, 1, 63, 256, 256);
		box43.addBox(0F, 0F, 0F, 1, 16, 3);
		box43.setPosition(19F, 14F, -10F);

		box44 = new CustomModelRenderer(this, 129, 2, 256, 256);
		box44.addBox(0F, 0F, 0F, 5, 1, 18);
		box44.setPosition(-52F, 10F, -9F);

		box45 = new CustomModelRenderer(this, 106, 102, 256, 256);
		box45.addBox(0F, 0F, 0F, 3, 8, 1);
		box45.setPosition(4F, 24F, -11F);
		box45.rotateAngleX = -6.126105674500097F;

		box46 = new CustomModelRenderer(this, 75, 93, 256, 256);
		box46.addBox(0F, 0F, 0F, 1, 8, 1);
		box46.setPosition(13F, 24F, 11F);
		box46.rotateAngleX = -6.1086523819801535F;
		box46.rotateAngleY = -3.141592653589793F;

		box47 = new CustomModelRenderer(this, 102, 166, 256, 256);
		box47.addBox(0F, 0F, 0F, 3, 1, 3);
		box47.setPosition(-51F, 7F, 8F);

		box48 = new CustomModelRenderer(this, 0, 243, 256, 256);
		box48.addBox(0F, 0F, 0F, 71, 13, 0);
		box48.setPosition(21F, 0F, 5F);
		box48.rotateAngleY = -3.141592653589793F;

		box49 = new CustomModelRenderer(this, 198, 180, 256, 256);
		box49.addBox(0F, 0F, 0F, 10, 5, 16);
		box49.setPosition(9F, 8F, -8F);

		box5 = new CustomModelRenderer(this, 173, 191, 256, 256);
		box5.addBox(0F, 0F, 0F, 1, 6, 1);
		box5.setPosition(-50F, 4F, -9F);

		box50 = new CustomModelRenderer(this, 89, 170, 256, 256);
		box50.addBox(0F, 0F, 0F, 79, 3, 4);
		box50.setPosition(-56F, 6F, -2F);

		box51 = new CustomModelRenderer(this, 102, 166, 256, 256);
		box51.addBox(0F, 0F, 0F, 3, 1, 3);
		box51.setPosition(-51F, 4F, 8F);

		box52 = new CustomModelRenderer(this, 194, 29, 256, 256);
		box52.addBox(0F, 0F, 0F, 15, 2, 16);
		box52.setPosition(-10F, 13F, -8F);
		box52.rotateAngleZ = -6.230825429619756F;

		box53 = new CustomModelRenderer(this, 102, 166, 256, 256);
		box53.addBox(0F, 0F, 0F, 3, 1, 3);
		box53.setPosition(-51F, 7F, -11F);

		box54 = new CustomModelRenderer(this, 173, 191, 256, 256);
		box54.addBox(0F, 0F, 0F, 1, 6, 1);
		box54.setPosition(-50F, 4F, 8F);

		box55 = new CustomModelRenderer(this, 0, 243, 256, 256);
		box55.addBox(0F, 0F, 0F, 71, 13, 0);
		box55.setPosition(21F, 0F, -5F);
		box55.rotateAngleY = -3.141592653589793F;

		box57 = new CustomModelRenderer(this, 2, 51, 256, 256);
		box57.addBox(0F, 2F, 0F, 21, 2, 1);
		box57.setPosition(-27F, 3F, 8F);
		box57.rotateAngleY = -3.141592653589793F;

		box6 = new CustomModelRenderer(this, 75, 145, 256, 256);
		box6.addBox(0F, 0F, 0F, 70, 8, 8);
		box6.setPosition(18F, 2F, 4F);
		box6.rotateAngleY = -3.141592653589793F;

		box60 = new CustomModelRenderer(this, 196, 0, 256, 256);
		box60.addBox(0F, 0F, 0F, 14, 13, 16);
		box60.setPosition(4F, 14F, 8F);
		box60.rotateAngleY = -3.141592653589793F;

		box67 = new CustomModelRenderer(this, 151, 184, 256, 256);
		box67.addBox(0F, 0F, 0F, 7, 7, 20);
		box67.setPosition(-36F, 3F, 10F);
		box67.rotateAngleY = 3.141592653589793F;
		box67.rotateAngleZ = 6.283185307179586F;

		box7 = new CustomModelRenderer(this, 194, 224, 256, 256);
		box7.addBox(0F, 0F, 0F, 1, 5, 16);
		box7.setPosition(-53F, 6F, -8F);

		box73 = new CustomModelRenderer(this, 125, 177, 256, 256);
		box73.addBox(0F, 0F, 0F, 1, 13, 10);
		box73.setPosition(-49F, 9F, -5F);
		box73.rotateAngleZ = -0.6108652381980153F;

		box74 = new CustomModelRenderer(this, 175, 38, 256, 256);
		box74.addBox(0F, 0F, 0F, 5, 6, 2);
		box74.setPosition(-4F, 28F, -1F);

		box76 = new CustomModelRenderer(this, 49, 110, 256, 256);
		box76.addBox(0F, 0F, 0F, 1, 2, 20);
		box76.setPosition(-26F, 15F, -10F);

		box77 = new CustomModelRenderer(this, 159, 2, 256, 256);
		box77.addBox(0F, 0F, 0F, 3, 1, 14);
		box77.setPosition(-48F, 13F, -7F);

		box8 = new CustomModelRenderer(this, 69, 69, 256, 256);
		box8.addBox(0F, 0F, 0F, 17, 7, 1);
		box8.setPosition(-35F, 21F, 11F);
		box8.rotateAngleX = -6.19591884457987F;
		box8.rotateAngleY = -3.141592653589793F;

		box81 = new CustomModelRenderer(this, 102, 166, 256, 256);
		box81.addBox(0F, 0F, 0F, 3, 1, 3);
		box81.setPosition(-51F, 4F, -11F);

		box82 = new CustomModelRenderer(this, 98, 197, 256, 256);
		box82.addBox(0F, 0F, 0F, 4, 4, 8);
		box82.setPosition(-32F, 14F, -4F);
		box82.rotateAngleZ = -0.7853981633974483F;

		box83 = new CustomModelRenderer(this, 78, 112, 256, 256);
		box83.addBox(0F, 0F, 0F, 4, 4, 8);
		box83.setPosition(-26F, 14F, -4F);
		box83.rotateAngleZ = -0.7853981633974483F;

		box85 = new CustomModelRenderer(this, 0, 140, 256, 256);
		box85.addBox(-1F, 0F, 0F, 1, 4, 6);
		box85.setPosition(-49F, 1F, -7F);
		box85.rotateAngleY = -0.6108652381980153F;
		box85.rotateAngleZ = -0.06981317007977318F;

		box86 = new CustomModelRenderer(this, 0, 140, 256, 256);
		box86.addBox(0F, 0F, 0F, 1, 4, 6);
		box86.setPosition(-49F, 1F, 7F);
		box86.rotateAngleY = -2.530727415391778F;
		box86.rotateAngleZ = -6.213372137099813F;

		box9 = new CustomModelRenderer(this, 193, 234, 256, 256);
		box9.addBox(0F, 0F, 0F, 2, 3, 3);
		box9.setPosition(-55F, 7F, -7F);

		box94 = new CustomModelRenderer(this, 116, 133, 256, 256);
		box94.addBox(0F, 0F, 0F, 2, 4, 3);
		box94.setPosition(-52F, 11F, -7F);

		box95 = new CustomModelRenderer(this, 116, 133, 256, 256);
		box95.addBox(0F, 0F, 0F, 2, 4, 3);
		box95.setPosition(-52F, 11F, 4F);

		box97 = new CustomModelRenderer(this, 0, 0, 256, 256);
		box97.addBox(0F, 0F, 0F, 4, 15, 14);
		box97.setPosition(9F, 14F, 7F);
		box97.rotateAngleY = -3.141592653589793F;

		box98 = new CustomModelRenderer(this, 0, 175, 256, 256);
		box98.addBox(0F, 0F, 0F, 2, 1, 20);
		box98.setPosition(-45F, 23F, -10F);

		box99 = new CustomModelRenderer(this, 159, 191, 256, 256);
		box99.addBox(0F, 0F, 0F, 3, 7, 2);
		box99.setPosition(-38F, 12F, -7F);
		box99.rotateAngleX = -0.5061454830783556F;
		box99.rotateAngleY = -3.141592653589793F;
	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		
		if (ClientProxy.isHoliday()) {
			FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/locoBR01_DB_winter.png"));
		}
		
		box.render(f5);
		box0.render(f5);
		box1.render(f5);
		box10.render(f5);
		box102.render(f5);
		box103.render(f5);
		box106.render(f5);
		box108.render(f5);
		box11.render(f5);
		box110.render(f5);
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
		box57.render(f5);
		box6.render(f5);
		box60.render(f5);
		box67.render(f5);
		box7.render(f5);
		box73.render(f5);
		box74.render(f5);
		box76.render(f5);
		box77.render(f5);
		box8.render(f5);
		box81.render(f5);
		box82.render(f5);
		box83.render(f5);
		box85.render(f5);
		box86.render(f5);
		box9.render(f5);
		box97.render(f5);
		box98.render(f5);
		box99.render(f5);
		
		Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
		box94.render(f5);
		box95.render(f5);
		box22.render(f5);
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